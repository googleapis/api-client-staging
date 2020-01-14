# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/type/color.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/type/color.proto',
  package='google.type',
  syntax='proto3',
  serialized_options=_b('\n\017com.google.typeB\nColorProtoP\001Z6google.golang.org/genproto/googleapis/type/color;color\370\001\001\242\002\003GTP'),
  serialized_pb=_b('\n\x17google/type/color.proto\x12\x0bgoogle.type\x1a\x1egoogle/protobuf/wrappers.proto\"]\n\x05\x43olor\x12\x0b\n\x03red\x18\x01 \x01(\x02\x12\r\n\x05green\x18\x02 \x01(\x02\x12\x0c\n\x04\x62lue\x18\x03 \x01(\x02\x12*\n\x05\x61lpha\x18\x04 \x01(\x0b\x32\x1b.google.protobuf.FloatValueB`\n\x0f\x63om.google.typeB\nColorProtoP\x01Z6google.golang.org/genproto/googleapis/type/color;color\xf8\x01\x01\xa2\x02\x03GTPb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])




_COLOR = _descriptor.Descriptor(
  name='Color',
  full_name='google.type.Color',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='red', full_name='google.type.Color.red', index=0,
      number=1, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='green', full_name='google.type.Color.green', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='blue', full_name='google.type.Color.blue', index=2,
      number=3, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='alpha', full_name='google.type.Color.alpha', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=72,
  serialized_end=165,
)

_COLOR.fields_by_name['alpha'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
DESCRIPTOR.message_types_by_name['Color'] = _COLOR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Color = _reflection.GeneratedProtocolMessageType('Color', (_message.Message,), {
  'DESCRIPTOR' : _COLOR,
  '__module__' : 'google.type.color_pb2'
  # @@protoc_insertion_point(class_scope:google.type.Color)
  })
_sym_db.RegisterMessage(Color)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
