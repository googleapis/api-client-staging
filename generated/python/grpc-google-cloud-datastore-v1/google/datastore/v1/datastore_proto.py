# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/v1/datastore.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.datastore.v1 import entity_pb2 as google_dot_datastore_dot_v1_dot_entity__pb2
from google.datastore.v1 import query_pb2 as google_dot_datastore_dot_v1_dot_query__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/datastore/v1/datastore.proto',
  package='google.datastore.v1',
  syntax='proto3',
  serialized_pb=_b('\n#google/datastore/v1/datastore.proto\x12\x13google.datastore.v1\x1a\x1cgoogle/api/annotations.proto\x1a google/datastore/v1/entity.proto\x1a\x1fgoogle/datastore/v1/query.proto\"\x83\x01\n\rLookupRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\x12\x36\n\x0cread_options\x18\x01 \x01(\x0b\x32 .google.datastore.v1.ReadOptions\x12&\n\x04keys\x18\x03 \x03(\x0b\x32\x18.google.datastore.v1.Key\"\xa2\x01\n\x0eLookupResponse\x12\x30\n\x05\x66ound\x18\x01 \x03(\x0b\x32!.google.datastore.v1.EntityResult\x12\x32\n\x07missing\x18\x02 \x03(\x0b\x32!.google.datastore.v1.EntityResult\x12*\n\x08\x64\x65\x66\x65rred\x18\x03 \x03(\x0b\x32\x18.google.datastore.v1.Key\"\x84\x02\n\x0fRunQueryRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\x12\x36\n\x0cpartition_id\x18\x02 \x01(\x0b\x32 .google.datastore.v1.PartitionId\x12\x36\n\x0cread_options\x18\x01 \x01(\x0b\x32 .google.datastore.v1.ReadOptions\x12+\n\x05query\x18\x03 \x01(\x0b\x32\x1a.google.datastore.v1.QueryH\x00\x12\x32\n\tgql_query\x18\x07 \x01(\x0b\x32\x1d.google.datastore.v1.GqlQueryH\x00\x42\x0c\n\nquery_type\"s\n\x10RunQueryResponse\x12\x34\n\x05\x62\x61tch\x18\x01 \x01(\x0b\x32%.google.datastore.v1.QueryResultBatch\x12)\n\x05query\x18\x02 \x01(\x0b\x32\x1a.google.datastore.v1.Query\"-\n\x17\x42\x65ginTransactionRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\"/\n\x18\x42\x65ginTransactionResponse\x12\x13\n\x0btransaction\x18\x01 \x01(\x0c\":\n\x0fRollbackRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\x12\x13\n\x0btransaction\x18\x01 \x01(\x0c\"\x12\n\x10RollbackResponse\"\x83\x02\n\rCommitRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\x12\x35\n\x04mode\x18\x05 \x01(\x0e\x32\'.google.datastore.v1.CommitRequest.Mode\x12\x15\n\x0btransaction\x18\x01 \x01(\x0cH\x00\x12\x30\n\tmutations\x18\x06 \x03(\x0b\x32\x1d.google.datastore.v1.Mutation\"F\n\x04Mode\x12\x14\n\x10MODE_UNSPECIFIED\x10\x00\x12\x11\n\rTRANSACTIONAL\x10\x01\x12\x15\n\x11NON_TRANSACTIONAL\x10\x02\x42\x16\n\x14transaction_selector\"f\n\x0e\x43ommitResponse\x12=\n\x10mutation_results\x18\x03 \x03(\x0b\x32#.google.datastore.v1.MutationResult\x12\x15\n\rindex_updates\x18\x04 \x01(\x05\"P\n\x12\x41llocateIdsRequest\x12\x12\n\nproject_id\x18\x08 \x01(\t\x12&\n\x04keys\x18\x01 \x03(\x0b\x32\x18.google.datastore.v1.Key\"=\n\x13\x41llocateIdsResponse\x12&\n\x04keys\x18\x01 \x03(\x0b\x32\x18.google.datastore.v1.Key\"\x87\x02\n\x08Mutation\x12-\n\x06insert\x18\x04 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12-\n\x06update\x18\x05 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12-\n\x06upsert\x18\x06 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12*\n\x06\x64\x65lete\x18\x07 \x01(\x0b\x32\x18.google.datastore.v1.KeyH\x00\x12\x16\n\x0c\x62\x61se_version\x18\x08 \x01(\x03H\x01\x42\x0b\n\toperationB\x1d\n\x1b\x63onflict_detection_strategy\"c\n\x0eMutationResult\x12%\n\x03key\x18\x03 \x01(\x0b\x32\x18.google.datastore.v1.Key\x12\x0f\n\x07version\x18\x04 \x01(\x03\x12\x19\n\x11\x63onflict_detected\x18\x05 \x01(\x08\"\xd5\x01\n\x0bReadOptions\x12L\n\x10read_consistency\x18\x01 \x01(\x0e\x32\x30.google.datastore.v1.ReadOptions.ReadConsistencyH\x00\x12\x15\n\x0btransaction\x18\x02 \x01(\x0cH\x00\"M\n\x0fReadConsistency\x12 \n\x1cREAD_CONSISTENCY_UNSPECIFIED\x10\x00\x12\n\n\x06STRONG\x10\x01\x12\x0c\n\x08\x45VENTUAL\x10\x02\x42\x12\n\x10\x63onsistency_type2\xdb\x06\n\tDatastore\x12~\n\x06Lookup\x12\".google.datastore.v1.LookupRequest\x1a#.google.datastore.v1.LookupResponse\"+\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:lookup:\x01*\x12\x86\x01\n\x08RunQuery\x12$.google.datastore.v1.RunQueryRequest\x1a%.google.datastore.v1.RunQueryResponse\"-\x82\xd3\xe4\x93\x02\'\"\"/v1/projects/{project_id}:runQuery:\x01*\x12\xa6\x01\n\x10\x42\x65ginTransaction\x12,.google.datastore.v1.BeginTransactionRequest\x1a-.google.datastore.v1.BeginTransactionResponse\"5\x82\xd3\xe4\x93\x02/\"*/v1/projects/{project_id}:beginTransaction:\x01*\x12~\n\x06\x43ommit\x12\".google.datastore.v1.CommitRequest\x1a#.google.datastore.v1.CommitResponse\"+\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:commit:\x01*\x12\x86\x01\n\x08Rollback\x12$.google.datastore.v1.RollbackRequest\x1a%.google.datastore.v1.RollbackResponse\"-\x82\xd3\xe4\x93\x02\'\"\"/v1/projects/{project_id}:rollback:\x01*\x12\x92\x01\n\x0b\x41llocateIds\x12\'.google.datastore.v1.AllocateIdsRequest\x1a(.google.datastore.v1.AllocateIdsResponse\"0\x82\xd3\xe4\x93\x02*\"%/v1/projects/{project_id}:allocateIds:\x01*B+\n\x17\x63om.google.datastore.v1B\x0e\x44\x61tastoreProtoP\x01\x62\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_datastore_dot_v1_dot_entity__pb2.DESCRIPTOR,google_dot_datastore_dot_v1_dot_query__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)



_COMMITREQUEST_MODE = _descriptor.EnumDescriptor(
  name='Mode',
  full_name='google.datastore.v1.CommitRequest.Mode',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MODE_UNSPECIFIED', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TRANSACTIONAL', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='NON_TRANSACTIONAL', index=2, number=2,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1178,
  serialized_end=1248,
)
_sym_db.RegisterEnumDescriptor(_COMMITREQUEST_MODE)

_READOPTIONS_READCONSISTENCY = _descriptor.EnumDescriptor(
  name='ReadConsistency',
  full_name='google.datastore.v1.ReadOptions.ReadConsistency',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='READ_CONSISTENCY_UNSPECIFIED', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='STRONG', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EVENTUAL', index=2, number=2,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=2007,
  serialized_end=2084,
)
_sym_db.RegisterEnumDescriptor(_READOPTIONS_READCONSISTENCY)


_LOOKUPREQUEST = _descriptor.Descriptor(
  name='LookupRequest',
  full_name='google.datastore.v1.LookupRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.LookupRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='read_options', full_name='google.datastore.v1.LookupRequest.read_options', index=1,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='keys', full_name='google.datastore.v1.LookupRequest.keys', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=158,
  serialized_end=289,
)


_LOOKUPRESPONSE = _descriptor.Descriptor(
  name='LookupResponse',
  full_name='google.datastore.v1.LookupResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='found', full_name='google.datastore.v1.LookupResponse.found', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='missing', full_name='google.datastore.v1.LookupResponse.missing', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='deferred', full_name='google.datastore.v1.LookupResponse.deferred', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=292,
  serialized_end=454,
)


_RUNQUERYREQUEST = _descriptor.Descriptor(
  name='RunQueryRequest',
  full_name='google.datastore.v1.RunQueryRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.RunQueryRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='partition_id', full_name='google.datastore.v1.RunQueryRequest.partition_id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='read_options', full_name='google.datastore.v1.RunQueryRequest.read_options', index=2,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='query', full_name='google.datastore.v1.RunQueryRequest.query', index=3,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='gql_query', full_name='google.datastore.v1.RunQueryRequest.gql_query', index=4,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='query_type', full_name='google.datastore.v1.RunQueryRequest.query_type',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=457,
  serialized_end=717,
)


_RUNQUERYRESPONSE = _descriptor.Descriptor(
  name='RunQueryResponse',
  full_name='google.datastore.v1.RunQueryResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='batch', full_name='google.datastore.v1.RunQueryResponse.batch', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='query', full_name='google.datastore.v1.RunQueryResponse.query', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=719,
  serialized_end=834,
)


_BEGINTRANSACTIONREQUEST = _descriptor.Descriptor(
  name='BeginTransactionRequest',
  full_name='google.datastore.v1.BeginTransactionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.BeginTransactionRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=836,
  serialized_end=881,
)


_BEGINTRANSACTIONRESPONSE = _descriptor.Descriptor(
  name='BeginTransactionResponse',
  full_name='google.datastore.v1.BeginTransactionResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='transaction', full_name='google.datastore.v1.BeginTransactionResponse.transaction', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=883,
  serialized_end=930,
)


_ROLLBACKREQUEST = _descriptor.Descriptor(
  name='RollbackRequest',
  full_name='google.datastore.v1.RollbackRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.RollbackRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='transaction', full_name='google.datastore.v1.RollbackRequest.transaction', index=1,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=932,
  serialized_end=990,
)


_ROLLBACKRESPONSE = _descriptor.Descriptor(
  name='RollbackResponse',
  full_name='google.datastore.v1.RollbackResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=992,
  serialized_end=1010,
)


_COMMITREQUEST = _descriptor.Descriptor(
  name='CommitRequest',
  full_name='google.datastore.v1.CommitRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.CommitRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='mode', full_name='google.datastore.v1.CommitRequest.mode', index=1,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='transaction', full_name='google.datastore.v1.CommitRequest.transaction', index=2,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='mutations', full_name='google.datastore.v1.CommitRequest.mutations', index=3,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _COMMITREQUEST_MODE,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='transaction_selector', full_name='google.datastore.v1.CommitRequest.transaction_selector',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=1013,
  serialized_end=1272,
)


_COMMITRESPONSE = _descriptor.Descriptor(
  name='CommitResponse',
  full_name='google.datastore.v1.CommitResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='mutation_results', full_name='google.datastore.v1.CommitResponse.mutation_results', index=0,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='index_updates', full_name='google.datastore.v1.CommitResponse.index_updates', index=1,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1274,
  serialized_end=1376,
)


_ALLOCATEIDSREQUEST = _descriptor.Descriptor(
  name='AllocateIdsRequest',
  full_name='google.datastore.v1.AllocateIdsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_id', full_name='google.datastore.v1.AllocateIdsRequest.project_id', index=0,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='keys', full_name='google.datastore.v1.AllocateIdsRequest.keys', index=1,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1378,
  serialized_end=1458,
)


_ALLOCATEIDSRESPONSE = _descriptor.Descriptor(
  name='AllocateIdsResponse',
  full_name='google.datastore.v1.AllocateIdsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='keys', full_name='google.datastore.v1.AllocateIdsResponse.keys', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1460,
  serialized_end=1521,
)


_MUTATION = _descriptor.Descriptor(
  name='Mutation',
  full_name='google.datastore.v1.Mutation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='insert', full_name='google.datastore.v1.Mutation.insert', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='update', full_name='google.datastore.v1.Mutation.update', index=1,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='upsert', full_name='google.datastore.v1.Mutation.upsert', index=2,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='delete', full_name='google.datastore.v1.Mutation.delete', index=3,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='base_version', full_name='google.datastore.v1.Mutation.base_version', index=4,
      number=8, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='operation', full_name='google.datastore.v1.Mutation.operation',
      index=0, containing_type=None, fields=[]),
    _descriptor.OneofDescriptor(
      name='conflict_detection_strategy', full_name='google.datastore.v1.Mutation.conflict_detection_strategy',
      index=1, containing_type=None, fields=[]),
  ],
  serialized_start=1524,
  serialized_end=1787,
)


_MUTATIONRESULT = _descriptor.Descriptor(
  name='MutationResult',
  full_name='google.datastore.v1.MutationResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.datastore.v1.MutationResult.key', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='version', full_name='google.datastore.v1.MutationResult.version', index=1,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='conflict_detected', full_name='google.datastore.v1.MutationResult.conflict_detected', index=2,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1789,
  serialized_end=1888,
)


_READOPTIONS = _descriptor.Descriptor(
  name='ReadOptions',
  full_name='google.datastore.v1.ReadOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='read_consistency', full_name='google.datastore.v1.ReadOptions.read_consistency', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='transaction', full_name='google.datastore.v1.ReadOptions.transaction', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=_b(""),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _READOPTIONS_READCONSISTENCY,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='consistency_type', full_name='google.datastore.v1.ReadOptions.consistency_type',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=1891,
  serialized_end=2104,
)

_LOOKUPREQUEST.fields_by_name['read_options'].message_type = _READOPTIONS
_LOOKUPREQUEST.fields_by_name['keys'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_LOOKUPRESPONSE.fields_by_name['found'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._ENTITYRESULT
_LOOKUPRESPONSE.fields_by_name['missing'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._ENTITYRESULT
_LOOKUPRESPONSE.fields_by_name['deferred'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_RUNQUERYREQUEST.fields_by_name['partition_id'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._PARTITIONID
_RUNQUERYREQUEST.fields_by_name['read_options'].message_type = _READOPTIONS
_RUNQUERYREQUEST.fields_by_name['query'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._QUERY
_RUNQUERYREQUEST.fields_by_name['gql_query'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._GQLQUERY
_RUNQUERYREQUEST.oneofs_by_name['query_type'].fields.append(
  _RUNQUERYREQUEST.fields_by_name['query'])
_RUNQUERYREQUEST.fields_by_name['query'].containing_oneof = _RUNQUERYREQUEST.oneofs_by_name['query_type']
_RUNQUERYREQUEST.oneofs_by_name['query_type'].fields.append(
  _RUNQUERYREQUEST.fields_by_name['gql_query'])
_RUNQUERYREQUEST.fields_by_name['gql_query'].containing_oneof = _RUNQUERYREQUEST.oneofs_by_name['query_type']
_RUNQUERYRESPONSE.fields_by_name['batch'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._QUERYRESULTBATCH
_RUNQUERYRESPONSE.fields_by_name['query'].message_type = google_dot_datastore_dot_v1_dot_query__pb2._QUERY
_COMMITREQUEST.fields_by_name['mode'].enum_type = _COMMITREQUEST_MODE
_COMMITREQUEST.fields_by_name['mutations'].message_type = _MUTATION
_COMMITREQUEST_MODE.containing_type = _COMMITREQUEST
_COMMITREQUEST.oneofs_by_name['transaction_selector'].fields.append(
  _COMMITREQUEST.fields_by_name['transaction'])
_COMMITREQUEST.fields_by_name['transaction'].containing_oneof = _COMMITREQUEST.oneofs_by_name['transaction_selector']
_COMMITRESPONSE.fields_by_name['mutation_results'].message_type = _MUTATIONRESULT
_ALLOCATEIDSREQUEST.fields_by_name['keys'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_ALLOCATEIDSRESPONSE.fields_by_name['keys'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_MUTATION.fields_by_name['insert'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._ENTITY
_MUTATION.fields_by_name['update'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._ENTITY
_MUTATION.fields_by_name['upsert'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._ENTITY
_MUTATION.fields_by_name['delete'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_MUTATION.oneofs_by_name['operation'].fields.append(
  _MUTATION.fields_by_name['insert'])
_MUTATION.fields_by_name['insert'].containing_oneof = _MUTATION.oneofs_by_name['operation']
_MUTATION.oneofs_by_name['operation'].fields.append(
  _MUTATION.fields_by_name['update'])
_MUTATION.fields_by_name['update'].containing_oneof = _MUTATION.oneofs_by_name['operation']
_MUTATION.oneofs_by_name['operation'].fields.append(
  _MUTATION.fields_by_name['upsert'])
_MUTATION.fields_by_name['upsert'].containing_oneof = _MUTATION.oneofs_by_name['operation']
_MUTATION.oneofs_by_name['operation'].fields.append(
  _MUTATION.fields_by_name['delete'])
_MUTATION.fields_by_name['delete'].containing_oneof = _MUTATION.oneofs_by_name['operation']
_MUTATION.oneofs_by_name['conflict_detection_strategy'].fields.append(
  _MUTATION.fields_by_name['base_version'])
_MUTATION.fields_by_name['base_version'].containing_oneof = _MUTATION.oneofs_by_name['conflict_detection_strategy']
_MUTATIONRESULT.fields_by_name['key'].message_type = google_dot_datastore_dot_v1_dot_entity__pb2._KEY
_READOPTIONS.fields_by_name['read_consistency'].enum_type = _READOPTIONS_READCONSISTENCY
_READOPTIONS_READCONSISTENCY.containing_type = _READOPTIONS
_READOPTIONS.oneofs_by_name['consistency_type'].fields.append(
  _READOPTIONS.fields_by_name['read_consistency'])
_READOPTIONS.fields_by_name['read_consistency'].containing_oneof = _READOPTIONS.oneofs_by_name['consistency_type']
_READOPTIONS.oneofs_by_name['consistency_type'].fields.append(
  _READOPTIONS.fields_by_name['transaction'])
_READOPTIONS.fields_by_name['transaction'].containing_oneof = _READOPTIONS.oneofs_by_name['consistency_type']
DESCRIPTOR.message_types_by_name['LookupRequest'] = _LOOKUPREQUEST
DESCRIPTOR.message_types_by_name['LookupResponse'] = _LOOKUPRESPONSE
DESCRIPTOR.message_types_by_name['RunQueryRequest'] = _RUNQUERYREQUEST
DESCRIPTOR.message_types_by_name['RunQueryResponse'] = _RUNQUERYRESPONSE
DESCRIPTOR.message_types_by_name['BeginTransactionRequest'] = _BEGINTRANSACTIONREQUEST
DESCRIPTOR.message_types_by_name['BeginTransactionResponse'] = _BEGINTRANSACTIONRESPONSE
DESCRIPTOR.message_types_by_name['RollbackRequest'] = _ROLLBACKREQUEST
DESCRIPTOR.message_types_by_name['RollbackResponse'] = _ROLLBACKRESPONSE
DESCRIPTOR.message_types_by_name['CommitRequest'] = _COMMITREQUEST
DESCRIPTOR.message_types_by_name['CommitResponse'] = _COMMITRESPONSE
DESCRIPTOR.message_types_by_name['AllocateIdsRequest'] = _ALLOCATEIDSREQUEST
DESCRIPTOR.message_types_by_name['AllocateIdsResponse'] = _ALLOCATEIDSRESPONSE
DESCRIPTOR.message_types_by_name['Mutation'] = _MUTATION
DESCRIPTOR.message_types_by_name['MutationResult'] = _MUTATIONRESULT
DESCRIPTOR.message_types_by_name['ReadOptions'] = _READOPTIONS

LookupRequest = _reflection.GeneratedProtocolMessageType('LookupRequest', (_message.Message,), dict(
  DESCRIPTOR = _LOOKUPREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.LookupRequest)
  ))
_sym_db.RegisterMessage(LookupRequest)

LookupResponse = _reflection.GeneratedProtocolMessageType('LookupResponse', (_message.Message,), dict(
  DESCRIPTOR = _LOOKUPRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.LookupResponse)
  ))
_sym_db.RegisterMessage(LookupResponse)

RunQueryRequest = _reflection.GeneratedProtocolMessageType('RunQueryRequest', (_message.Message,), dict(
  DESCRIPTOR = _RUNQUERYREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.RunQueryRequest)
  ))
_sym_db.RegisterMessage(RunQueryRequest)

RunQueryResponse = _reflection.GeneratedProtocolMessageType('RunQueryResponse', (_message.Message,), dict(
  DESCRIPTOR = _RUNQUERYRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.RunQueryResponse)
  ))
_sym_db.RegisterMessage(RunQueryResponse)

BeginTransactionRequest = _reflection.GeneratedProtocolMessageType('BeginTransactionRequest', (_message.Message,), dict(
  DESCRIPTOR = _BEGINTRANSACTIONREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.BeginTransactionRequest)
  ))
_sym_db.RegisterMessage(BeginTransactionRequest)

BeginTransactionResponse = _reflection.GeneratedProtocolMessageType('BeginTransactionResponse', (_message.Message,), dict(
  DESCRIPTOR = _BEGINTRANSACTIONRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.BeginTransactionResponse)
  ))
_sym_db.RegisterMessage(BeginTransactionResponse)

RollbackRequest = _reflection.GeneratedProtocolMessageType('RollbackRequest', (_message.Message,), dict(
  DESCRIPTOR = _ROLLBACKREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.RollbackRequest)
  ))
_sym_db.RegisterMessage(RollbackRequest)

RollbackResponse = _reflection.GeneratedProtocolMessageType('RollbackResponse', (_message.Message,), dict(
  DESCRIPTOR = _ROLLBACKRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.RollbackResponse)
  ))
_sym_db.RegisterMessage(RollbackResponse)

CommitRequest = _reflection.GeneratedProtocolMessageType('CommitRequest', (_message.Message,), dict(
  DESCRIPTOR = _COMMITREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.CommitRequest)
  ))
_sym_db.RegisterMessage(CommitRequest)

CommitResponse = _reflection.GeneratedProtocolMessageType('CommitResponse', (_message.Message,), dict(
  DESCRIPTOR = _COMMITRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.CommitResponse)
  ))
_sym_db.RegisterMessage(CommitResponse)

AllocateIdsRequest = _reflection.GeneratedProtocolMessageType('AllocateIdsRequest', (_message.Message,), dict(
  DESCRIPTOR = _ALLOCATEIDSREQUEST,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.AllocateIdsRequest)
  ))
_sym_db.RegisterMessage(AllocateIdsRequest)

AllocateIdsResponse = _reflection.GeneratedProtocolMessageType('AllocateIdsResponse', (_message.Message,), dict(
  DESCRIPTOR = _ALLOCATEIDSRESPONSE,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.AllocateIdsResponse)
  ))
_sym_db.RegisterMessage(AllocateIdsResponse)

Mutation = _reflection.GeneratedProtocolMessageType('Mutation', (_message.Message,), dict(
  DESCRIPTOR = _MUTATION,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.Mutation)
  ))
_sym_db.RegisterMessage(Mutation)

MutationResult = _reflection.GeneratedProtocolMessageType('MutationResult', (_message.Message,), dict(
  DESCRIPTOR = _MUTATIONRESULT,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.MutationResult)
  ))
_sym_db.RegisterMessage(MutationResult)

ReadOptions = _reflection.GeneratedProtocolMessageType('ReadOptions', (_message.Message,), dict(
  DESCRIPTOR = _READOPTIONS,
  __module__ = 'google.datastore.v1.datastore_pb2'
  # @@protoc_insertion_point(class_scope:google.datastore.v1.ReadOptions)
  ))
_sym_db.RegisterMessage(ReadOptions)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\027com.google.datastore.v1B\016DatastoreProtoP\001'))
# @@protoc_insertion_point(module_scope)
