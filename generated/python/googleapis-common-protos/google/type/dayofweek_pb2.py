# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/type/dayofweek.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/type/dayofweek.proto',
  package='google.type',
  syntax='proto3',
  serialized_options=_b('\n\017com.google.typeB\016DayOfWeekProtoP\001Z>google.golang.org/genproto/googleapis/type/dayofweek;dayofweek\242\002\003GTP'),
  serialized_pb=_b('\n\x1bgoogle/type/dayofweek.proto\x12\x0bgoogle.type*\x84\x01\n\tDayOfWeek\x12\x1b\n\x17\x44\x41Y_OF_WEEK_UNSPECIFIED\x10\x00\x12\n\n\x06MONDAY\x10\x01\x12\x0b\n\x07TUESDAY\x10\x02\x12\r\n\tWEDNESDAY\x10\x03\x12\x0c\n\x08THURSDAY\x10\x04\x12\n\n\x06\x46RIDAY\x10\x05\x12\x0c\n\x08SATURDAY\x10\x06\x12\n\n\x06SUNDAY\x10\x07\x42i\n\x0f\x63om.google.typeB\x0e\x44\x61yOfWeekProtoP\x01Z>google.golang.org/genproto/googleapis/type/dayofweek;dayofweek\xa2\x02\x03GTPb\x06proto3')
)

_DAYOFWEEK = _descriptor.EnumDescriptor(
  name='DayOfWeek',
  full_name='google.type.DayOfWeek',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DAY_OF_WEEK_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MONDAY', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TUESDAY', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='WEDNESDAY', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='THURSDAY', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FRIDAY', index=5, number=5,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SATURDAY', index=6, number=6,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SUNDAY', index=7, number=7,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=45,
  serialized_end=177,
)
_sym_db.RegisterEnumDescriptor(_DAYOFWEEK)

DayOfWeek = enum_type_wrapper.EnumTypeWrapper(_DAYOFWEEK)
DAY_OF_WEEK_UNSPECIFIED = 0
MONDAY = 1
TUESDAY = 2
WEDNESDAY = 3
THURSDAY = 4
FRIDAY = 5
SATURDAY = 6
SUNDAY = 7


DESCRIPTOR.enum_types_by_name['DayOfWeek'] = _DAYOFWEEK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
