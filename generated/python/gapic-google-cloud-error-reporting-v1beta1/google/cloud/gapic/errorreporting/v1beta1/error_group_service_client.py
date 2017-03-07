# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_group_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.devtools.clouderrorreporting.v1beta1 ErrorGroupService API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.errorreporting.v1beta1 import enums
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import common_pb2
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import error_group_service_pb2


class ErrorGroupServiceClient(object):
    """Service for retrieving and updating individual error groups."""

    SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform', )

    _GROUP_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/groups/{group}')

    @classmethod
    def group_path(cls, project, group):
        """Returns a fully-qualified group resource name string."""
        return cls._GROUP_PATH_TEMPLATE.render({
            'project': project,
            'group': group,
        })

    @classmethod
    def match_project_from_group_name(cls, group_name):
        """Parses the project from a group resource.

        Args:
          group_name (string): A fully-qualified path representing a group
            resource.

        Returns:
          A string representing the project.
        """
        return cls._GROUP_PATH_TEMPLATE.match(group_name).get('project')

    @classmethod
    def match_group_from_group_name(cls, group_name):
        """Parses the group from a group resource.

        Args:
          group_name (string): A fully-qualified path representing a group
            resource.

        Returns:
          A string representing the group.
        """
        return cls._GROUP_PATH_TEMPLATE.match(group_name).get('group')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name=None,
                 app_version='',
                 lib_name=None,
                 lib_version='',
                 metrics_headers=()):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The name of the application calling
            the service. Recommended for analytics purposes.
          app_version (string): The version of the application calling
            the service. Recommended for analytics purposes.
          lib_name (string): The API library software used for calling
            the service. (Unless you are writing an API client itself,
            leave this as default.)
          lib_version (string): The API library software version used
            for calling the service. (Unless you are writing an API client
            itself, leave this as default.)
          metrics_headers (dict): A dictionary of values for tracking
            client library metrics. Ultimately serializes to a string
            (e.g. 'foo/1.2.3 bar/3.14.1'). This argument should be
            considered private.

        Returns:
          A ErrorGroupServiceClient object.
        """
        # Unless the calling application specifically requested
        # OAuth scopes, request everything.
        if scopes is None:
            scopes = self._ALL_SCOPES

        # Initialize an empty client config, if none is set.
        if client_config is None:
            client_config = {}

        # Initialize metrics_headers as an ordered dictionary
        # (cuts down on cardinality of the resulting string slightly).
        metrics_headers = collections.OrderedDict(metrics_headers)
        metrics_headers['gl-python'] = platform.python_version()

        # The library may or may not be set, depending on what is
        # calling this client. Newer client libraries set the library name
        # and version.
        if lib_name:
            metrics_headers[lib_name] = lib_version

        # Finally, track the GAPIC package version.
        metrics_headers['gapic'] = pkg_resources.get_distribution(
            'gapic-google-cloud-error-reporting-v1beta1', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'error_group_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.devtools.clouderrorreporting.v1beta1.ErrorGroupService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers, )
        self.error_group_service_stub = config.create_stub(
            error_group_service_pb2.ErrorGroupServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._get_group = api_callable.create_api_call(
            self.error_group_service_stub.GetGroup,
            settings=defaults['get_group'])
        self._update_group = api_callable.create_api_call(
            self.error_group_service_stub.UpdateGroup,
            settings=defaults['update_group'])

    # Service calls
    def get_group(self, group_name, options=None):
        """
        Get the specified group.

        Example:
          >>> from google.cloud.gapic.errorreporting.v1beta1 import error_group_service_client
          >>> api = error_group_service_client.ErrorGroupServiceClient()
          >>> group_name = api.group_path('[PROJECT]', '[GROUP]')
          >>> response = api.get_group(group_name)

        Args:
          group_name (string): [Required] The group resource name. Written as
            <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>.
            Call
            <a href=\"/error-reporting/reference/rest/v1beta1/projects.groupStats/list\">
            <code>groupStats.list</code></a> to return a list of groups belonging to
            this project.

            Example: <code>projects/my-project-123/groups/my-group</code>
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.common_pb2.ErrorGroup` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = error_group_service_pb2.GetGroupRequest(
            group_name=group_name)
        return self._get_group(request, options)

    def update_group(self, group, options=None):
        """
        Replace the data for the specified group.
        Fails if the group does not exist.

        Example:
          >>> from google.cloud.gapic.errorreporting.v1beta1 import error_group_service_client
          >>> from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import common_pb2
          >>> api = error_group_service_client.ErrorGroupServiceClient()
          >>> group = common_pb2.ErrorGroup()
          >>> response = api.update_group(group)

        Args:
          group (:class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.common_pb2.ErrorGroup`): [Required] The group which replaces the resource on the server.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.common_pb2.ErrorGroup` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = error_group_service_pb2.UpdateGroupRequest(group=group)
        return self._update_group(request, options)
