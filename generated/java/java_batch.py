import os
import sys
import json
import fnmatch
import argparse
import subprocess
from artman.config import loader
from artman.config.proto.config_pb2 import Artifact, Config
from google.protobuf import json_format
import yaml
import shutil
from tempfile import mkstemp
from os import fdopen, remove

# list of APIs that will be generated
APIS = [
    # shared package
    'core',
    'appengine',
    'iam',
    # gapic API
    'bigquerydatatransfer',
    'bigtable',
    'bigtableadmin',
    'container',
    'dataproc_v1',
    'datastore',
    'dialogflow_v2beta1_java',
    'dlp_v2beta1',
    'dlp_v2beta2',
    'errorreporting',
    'firestore',
    'language_v1',
    'language_v1beta2',
    'logging',
    'longrunning',
    'monitoring',
    'pubsub',
    'oslogin_v1',
    'spanner',
    'spanner_admin_database',
    'spanner_admin_instance',
    'speech_v1',
    'speech_v1beta1',
    'speech_v1p1beta1',
    'cloudtrace_v1',
    'cloudtrace_v2',
    'videointelligence_v1beta1',
    'videointelligence_v1beta2',
    'videointelligence_v1',
    'vision_v1',
    'vision_v1p1beta1',
]

# list of APIs which don't generate proto library
PROTO_EXCLUSION = ['longrunning']

# list of APIs which don't generate grpc library
GRPC_EXCLUSION = ['appengine', 'longrunning']

# list of APIs which `copy` subcommand doesn't copy from staging to gcj repo
COPY_EXCLUSION = [
        'speech_v1p1beta1',
        'dlp_v2beta2',
        'datastore',
        'spanner_admin_database',
        'spanner_admin_instance',
        'spanner',
]

def get_artman_yaml(googleapis_repo):
  artman_yaml_files = []
  for root, dir_names, file_names in os.walk(
      os.path.join(googleapis_repo, 'google')):
    for fname in fnmatch.filter(file_names, 'artman_*.yaml'):
      artman_yaml_files.append(os.path.join(root, fname))
  return artman_yaml_files


def filter_exclusion_list(artman_yaml_files, exclusion_list):
  return [
      yaml for yaml in artman_yaml_files
      if os.path.basename(yaml) not in exclusion_list
  ]


def api_to_yaml_mapping(artman_yaml_files):
  mappings = dict(
      zip([
          os.path.basename(yaml_file)[7:-5] for yaml_file in artman_yaml_files
      ], artman_yaml_files))
  return mappings


def get_task_type(artman_yaml_file):
  artman_file_content = open(artman_yaml_file, 'r').read()
  if 'JAVA_GAPIC' in artman_file_content or 'java_gapic' in artman_file_content:
    return 'JAVA_GAPIC'
  if 'java_grpc' in artman_file_content and 'java_proto' in artman_file_content:
    return 'JAVA_GRPC'


def run_batch(api,
              artman_yaml,
              root_dir,
              staging_repo,
              docker_mode,
              g3artman_mode,
              dry_run=False):
  task_type = get_task_type(artman_yaml)
  artman_yaml = _get_config_path_relative_to_googleapis(artman_yaml)
  if task_type == 'JAVA_GAPIC':
    return _run_java_gapic(api, artman_yaml, root_dir, staging_repo,
                           docker_mode, g3artman_mode, dry_run)
  elif task_type == 'JAVA_GRPC':
    return _run_java_grpc(api, artman_yaml, root_dir, staging_repo, docker_mode,
                          g3artman_mode, dry_run)
  else:
    return False


def _run_java_gapic(api, artman_yaml, root_dir, local_staging_repo, docker_mode,
                    g3artman_mode, dry_run):
  cmd = ('%s %s --config %s --root-dir %s publish --local-repo-dir %s '
         '--dry-run --target staging java_gapic') % (
             'artman' if not g3artman_mode else 'g3artman', '--local'
             if not docker_mode else '', artman_yaml, root_dir,
             local_staging_repo)
  print('JAVA_BATCH>  running: %s' % cmd)
  if not dry_run:
    try:
      subprocess.check_output(cmd, shell=True)
    except subprocess.CalledProcessError:
      return False
  return True


def _run_java_grpc(api, artman_yaml, root_dir, local_staging_repo, docker_mode,
                   g3artman_mode, dry_run):
  java_proto_cmd = (
      '%s %s --config %s --root-dir %s publish --local-repo-dir %s '
      '--dry-run --target staging java_proto') % (
          'artman' if not g3artman_mode else 'g3artman', '--local'
          if not docker_mode else '', artman_yaml, root_dir, local_staging_repo)

  java_grpc_cmd = (
      'artman %s --config %s --root-dir %s publish --local-repo-dir %s '
      '--dry-run --target staging java_grpc') % ('--local'
                                                 if not docker_mode else '',
                                                 artman_yaml, root_dir,
                                                 local_staging_repo)

  if api not in PROTO_EXCLUSION:
    print('JAVA_BATCH> running: %s' % java_proto_cmd)
    if not dry_run:
      try:
        subprocess.check_output(java_proto_cmd, shell=True)
      except subprocess.CalledProcessError:
        return False

  if api not in GRPC_EXCLUSION:
    print('JAVA_BATCH> running: %s' % java_grpc_cmd)
    if not dry_run:
      try:
        subprocess.check_output(java_grpc_cmd, shell=True)
      except subprocess.CalledProcessError:
        return False
  return True


def _parse_args(*args):
  parser = argparse.ArgumentParser()
  subparsers = parser.add_subparsers(dest='subcommand')
  generate_parser = subparsers.add_parser('generate')
  generate_parser.add_argument(
      '--root-dir',
      type=str,
      default='',
      help=
      'Googleapis repo directory. You need to either specify this argument or specify googleapis in artman user config yaml'
  )

  generate_parser.add_argument(
      '--local-repo-dir',
      type=str,
      default='../api-client-staging',
      help=
      'api-client-staging repo directory. Default to \'../api-client-staging\'')

  generate_parser.add_argument(
      '--api-list',
      type=str,
      default='',
      help=
      'A list of comma-separated API names that batch script will generate. Default to run all APIs'
  )

  generate_parser.add_argument(
      '--exclude',
      type=str,
      default='',
      help='A list of comma-separated API names that batch script will exclude.'
  )

  generate_parser.add_argument('--user-config', default='~/.artman/config.yaml')

  generate_parser.add_mutually_exclusive_group(required=False)
  generate_parser.add_argument(
      '--docker-mode',
      dest='docker_mode',
      action='store_true',
      help='Run artman in docker mode. This is default behavior.')

  generate_parser.add_argument(
      '--local-mode',
      dest='docker_mode',
      action='store_false',
      help='Run artman in local mode.')

  generate_parser.add_argument(
      '--g3artman',
      dest='g3artman_mode',
      action='store_true',
      help='Not supported yet. Run g3artman instead of artman.')

  generate_parser.set_defaults(g3artman=False)

  generate_parser.add_argument(
      '--dry-run',
      dest='dryrun_mode',
      action='store_true',
      help=
      'Dry run mode. Batch script prints out artman command without running them. Default to false.'
  )

  generate_parser.set_defaults(dryrun_mode=False)

  copy_parser = subparsers.add_parser('copy')

  copy_parser.add_argument(
      '--root-dir',
      type=str,
      default='',
      help=
      'Googleapis repo directory. You need to either specify this argument or specify googleapis in artman user config yaml'
  )

  copy_parser.add_argument(
      '--local-repo-dir',
      type=str,
      default='../api-client-staging',
      help=
      'api-client-staging repo directory. Default to \'../api-client-staging\'')

  copy_parser.add_argument(
      '--gcj-repo-dir',
      type=str,
      default='',
      help=
      'google-cloud-java repo directory. If this argument is set, batch script will run copy task only')

  copy_parser.add_argument(
      '--dry-run',
      dest='dryrun_mode',
      action='store_true',
      help=
      'Dry run mode. Batch script prints out artman command without running them. Default to false.'
  )

  flags = parser.parse_args(args)

  return flags


def _get_config_path_relative_to_googleapis(path):
  return path[path.find('googleapis/') + 11:]


def remove_proto_exclusion(flags, mapping):
  for api in PROTO_EXCLUSION:
    artman_yaml = mapping[api]
    proto_dir = _get_staging_dir(artman_yaml, 'java_gapic', 'proto')
    if proto_dir:
      abs_path = os.path.join(flags.local_repo_dir, proto_dir)
      print('JAVA_BATCH> deleting: ' + abs_path)
      shutil.rmtree(abs_path)


def remove_grpc_exclusion(flags, mapping):
  for api in GRPC_EXCLUSION:
    artman_yaml = mapping[api]
    grpc_dir = _get_staging_dir(artman_yaml, 'java_gapic', 'grpc')
    if grpc_dir:
      abs_path = os.path.join(flags.local_repo_dir, grpc_dir)
      print('JAVA_BATCH> deleting: ' + abs_path)
      shutil.rmtree(abs_path)


def _get_staging_dir(artman_yaml, artifact_name, dir_mapping_name):
  artman_config = _get_artman_config(artman_yaml)
  for artifact in artman_config.artifacts:
    if artifact.name == artifact_name:
      for publish_target in artifact.publish_targets:
        if publish_target.name == 'staging':
          for dir_mapping in publish_target.directory_mappings:
            if dir_mapping.name == dir_mapping_name:
              return dir_mapping.dest
  return None


def _get_artman_config(artman_yaml):
  config_pb = Config()
  with open(artman_yaml, 'r') as f:
    artman_config_json_string = json.dumps(yaml.load(f))
  json_format.Parse(artman_config_json_string, config_pb)
  return config_pb

def get_copy_mapping(api_list, mapping):
  copy_dir_mapping = dict()
  for api in api_list:
    if api not in COPY_EXCLUSION:
      src, dest = None, None
      artman_config = _get_artman_config(mapping[api]) 
      for artifact in artman_config.artifacts:
        if artifact.name == "java_gapic":
          for publish_target in artifact.publish_targets:
            if publish_target.name == "java":
              for dir_mapping in publish_target.directory_mappings:
                dest = dir_mapping.dest
            elif publish_target.name == "staging":
              for dir_mapping in publish_target.directory_mappings:
                if dir_mapping.name != 'proto' and dir_mapping.name != 'grpc':
                  src = dir_mapping.dest
          break
      copy_dir_mapping[api] = (src, dest)
  return copy_dir_mapping

def copy_to_gcj(flags, copy_mapping):
  for k,v in copy_mapping.items():
    if v[0] and v[1]:
      cmd = 'cp -r %s/src/ %s/src/' % (os.path.join(flags.local_repo_dir, v[0]), os.path.join(flags.gcj_repo_dir, v[1]))
      print("JAVA_BATCH> %s" % cmd)
      if not flags.dryrun_mode:
        try:
          subprocess.check_output(cmd, shell=True)
        except subprocess.CalledProcessError:
          print("JAVA_BATCH> FAIL: %s" % cmd)


def fix_commons_proto_dep(flags):
  file_list = _get_all_build_gradle_files(flags)
  PROTO_PATTERN = 'compile project(":proto-google-longrunning-v1")'
  PROTO_REPLACE = 'compile project(":proto-google-common-protos")'
  GRPC_PATTERN = 'testCompile project(":grpc-google-longrunning-v1")'
  GRPC_REPLACE = 'testCompile project(":grpc-google-common-protos")'
  for f in file_list:
    _fix_line_in_file(f, PROTO_PATTERN, PROTO_REPLACE)
    _fix_line_in_file(f, GRPC_PATTERN, GRPC_REPLACE)


def _fix_line_in_file(file_path, pattern, replace):
  fh, abs_path = mkstemp()
  with fdopen(fh, 'w') as new_file:
    with open(file_path) as old_file:
      for line in old_file:
        new_file.write(line.replace(pattern, replace))
  remove(file_path)
  shutil.move(abs_path, file_path)


def _get_all_build_gradle_files(flags):
  file_list = [] 
  for root, dir_names, file_names in os.walk(
      os.path.join(os.path.expanduser(flags.local_repo_dir), 'generated', 'java')):
    for fname in fnmatch.filter(file_names, 'build.gradle'):
      file_list.append(os.path.join(root, fname))
  return file_list 


def main(*args):
  if not args:
    args = sys.argv[1:]

  flags = _parse_args(*args)
  if not flags.root_dir:
    flags.root_dir = os.getcwd()

  flags.root_dir = os.path.expanduser(flags.root_dir)
  mapping = api_to_yaml_mapping(get_artman_yaml(flags.root_dir))

  if flags.subcommand == 'copy':
    copy_mapping = get_copy_mapping(APIS, mapping)
    copy_to_gcj(flags, copy_mapping)
  else: 
    if flags.exclude:
      for api in flags.exclude.split(','):
        APIS.remove(api)

    if flags.api_list:
      for api in flags.api_list.split(','):
        run_batch(api, mapping[api], flags.root_dir, flags.local_repo_dir,
                  flags.docker_mode, flags.g3artman_mode, flags.dryrun_mode)
    else:
      for api in APIS:
        run_batch(api, mapping[api], flags.root_dir, flags.local_repo_dir,
                  flags.docker_mode, flags.g3artman_mode, flags.dryrun_mode)

    
    if not flags.dryrun_mode:
      try:
        remove_proto_exclusion(flags, mapping)
      except:
        pass
      try:
        remove_grpc_exclusion(flags, mapping)
      except:
        pass

      fix_commons_proto_dep(flags)

if __name__ == '__main__':
  main()
