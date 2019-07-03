# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/iam/v1/iam_policy.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.iam.v1 import options_pb2 as google_dot_iam_dot_v1_dot_options__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/iam/v1/iam_policy.proto',
  package='google.iam.v1',
  syntax='proto3',
  serialized_options=_b('\n\021com.google.iam.v1B\016IamPolicyProtoP\001Z0google.golang.org/genproto/googleapis/iam/v1;iam\370\001\001\252\002\023Google.Cloud.Iam.V1\312\002\023Google\\Cloud\\Iam\\V1'),
  serialized_pb=_b('\n\x1egoogle/iam/v1/iam_policy.proto\x12\rgoogle.iam.v1\x1a\x1bgoogle/iam/v1/options.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\"N\n\x13SetIamPolicyRequest\x12\x10\n\x08resource\x18\x01 \x01(\t\x12%\n\x06policy\x18\x02 \x01(\x0b\x32\x15.google.iam.v1.Policy\"Y\n\x13GetIamPolicyRequest\x12\x10\n\x08resource\x18\x01 \x01(\t\x12\x30\n\x07options\x18\x02 \x01(\x0b\x32\x1f.google.iam.v1.GetPolicyOptions\"B\n\x19TestIamPermissionsRequest\x12\x10\n\x08resource\x18\x01 \x01(\t\x12\x13\n\x0bpermissions\x18\x02 \x03(\t\"1\n\x1aTestIamPermissionsResponse\x12\x13\n\x0bpermissions\x18\x01 \x03(\t2\xb4\x03\n\tIAMPolicy\x12t\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\")\x82\xd3\xe4\x93\x02#\"\x1e/v1/{resource=**}:setIamPolicy:\x01*\x12t\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\")\x82\xd3\xe4\x93\x02#\"\x1e/v1/{resource=**}:getIamPolicy:\x01*\x12\x9a\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"/\x82\xd3\xe4\x93\x02)\"$/v1/{resource=**}:testIamPermissions:\x01*\x1a\x1e\xca\x41\x1biam-meta-api.googleapis.comB\x86\x01\n\x11\x63om.google.iam.v1B\x0eIamPolicyProtoP\x01Z0google.golang.org/genproto/googleapis/iam/v1;iam\xf8\x01\x01\xaa\x02\x13Google.Cloud.Iam.V1\xca\x02\x13Google\\Cloud\\Iam\\V1b\x06proto3')
  ,
  dependencies=[google_dot_iam_dot_v1_dot_options__pb2.DESCRIPTOR,google_dot_iam_dot_v1_dot_policy__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])




_SETIAMPOLICYREQUEST = _descriptor.Descriptor(
  name='SetIamPolicyRequest',
  full_name='google.iam.v1.SetIamPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.iam.v1.SetIamPolicyRequest.resource', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='policy', full_name='google.iam.v1.SetIamPolicyRequest.policy', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=161,
  serialized_end=239,
)


_GETIAMPOLICYREQUEST = _descriptor.Descriptor(
  name='GetIamPolicyRequest',
  full_name='google.iam.v1.GetIamPolicyRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.iam.v1.GetIamPolicyRequest.resource', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='options', full_name='google.iam.v1.GetIamPolicyRequest.options', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=241,
  serialized_end=330,
)


_TESTIAMPERMISSIONSREQUEST = _descriptor.Descriptor(
  name='TestIamPermissionsRequest',
  full_name='google.iam.v1.TestIamPermissionsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.iam.v1.TestIamPermissionsRequest.resource', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='permissions', full_name='google.iam.v1.TestIamPermissionsRequest.permissions', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=332,
  serialized_end=398,
)


_TESTIAMPERMISSIONSRESPONSE = _descriptor.Descriptor(
  name='TestIamPermissionsResponse',
  full_name='google.iam.v1.TestIamPermissionsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='permissions', full_name='google.iam.v1.TestIamPermissionsResponse.permissions', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=400,
  serialized_end=449,
)

_SETIAMPOLICYREQUEST.fields_by_name['policy'].message_type = google_dot_iam_dot_v1_dot_policy__pb2._POLICY
_GETIAMPOLICYREQUEST.fields_by_name['options'].message_type = google_dot_iam_dot_v1_dot_options__pb2._GETPOLICYOPTIONS
DESCRIPTOR.message_types_by_name['SetIamPolicyRequest'] = _SETIAMPOLICYREQUEST
DESCRIPTOR.message_types_by_name['GetIamPolicyRequest'] = _GETIAMPOLICYREQUEST
DESCRIPTOR.message_types_by_name['TestIamPermissionsRequest'] = _TESTIAMPERMISSIONSREQUEST
DESCRIPTOR.message_types_by_name['TestIamPermissionsResponse'] = _TESTIAMPERMISSIONSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SetIamPolicyRequest = _reflection.GeneratedProtocolMessageType('SetIamPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _SETIAMPOLICYREQUEST,
  '__module__' : 'google.iam.v1.iam_policy_pb2'
  # @@protoc_insertion_point(class_scope:google.iam.v1.SetIamPolicyRequest)
  })
_sym_db.RegisterMessage(SetIamPolicyRequest)

GetIamPolicyRequest = _reflection.GeneratedProtocolMessageType('GetIamPolicyRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETIAMPOLICYREQUEST,
  '__module__' : 'google.iam.v1.iam_policy_pb2'
  # @@protoc_insertion_point(class_scope:google.iam.v1.GetIamPolicyRequest)
  })
_sym_db.RegisterMessage(GetIamPolicyRequest)

TestIamPermissionsRequest = _reflection.GeneratedProtocolMessageType('TestIamPermissionsRequest', (_message.Message,), {
  'DESCRIPTOR' : _TESTIAMPERMISSIONSREQUEST,
  '__module__' : 'google.iam.v1.iam_policy_pb2'
  # @@protoc_insertion_point(class_scope:google.iam.v1.TestIamPermissionsRequest)
  })
_sym_db.RegisterMessage(TestIamPermissionsRequest)

TestIamPermissionsResponse = _reflection.GeneratedProtocolMessageType('TestIamPermissionsResponse', (_message.Message,), {
  'DESCRIPTOR' : _TESTIAMPERMISSIONSRESPONSE,
  '__module__' : 'google.iam.v1.iam_policy_pb2'
  # @@protoc_insertion_point(class_scope:google.iam.v1.TestIamPermissionsResponse)
  })
_sym_db.RegisterMessage(TestIamPermissionsResponse)


DESCRIPTOR._options = None

_IAMPOLICY = _descriptor.ServiceDescriptor(
  name='IAMPolicy',
  full_name='google.iam.v1.IAMPolicy',
  file=DESCRIPTOR,
  index=0,
  serialized_options=_b('\312A\033iam-meta-api.googleapis.com'),
  serialized_start=452,
  serialized_end=888,
  methods=[
  _descriptor.MethodDescriptor(
    name='SetIamPolicy',
    full_name='google.iam.v1.IAMPolicy.SetIamPolicy',
    index=0,
    containing_service=None,
    input_type=_SETIAMPOLICYREQUEST,
    output_type=google_dot_iam_dot_v1_dot_policy__pb2._POLICY,
    serialized_options=_b('\202\323\344\223\002#\"\036/v1/{resource=**}:setIamPolicy:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='GetIamPolicy',
    full_name='google.iam.v1.IAMPolicy.GetIamPolicy',
    index=1,
    containing_service=None,
    input_type=_GETIAMPOLICYREQUEST,
    output_type=google_dot_iam_dot_v1_dot_policy__pb2._POLICY,
    serialized_options=_b('\202\323\344\223\002#\"\036/v1/{resource=**}:getIamPolicy:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='TestIamPermissions',
    full_name='google.iam.v1.IAMPolicy.TestIamPermissions',
    index=2,
    containing_service=None,
    input_type=_TESTIAMPERMISSIONSREQUEST,
    output_type=_TESTIAMPERMISSIONSRESPONSE,
    serialized_options=_b('\202\323\344\223\002)\"$/v1/{resource=**}:testIamPermissions:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_IAMPOLICY)

DESCRIPTOR.services_by_name['IAMPolicy'] = _IAMPOLICY

# @@protoc_insertion_point(module_scope)
