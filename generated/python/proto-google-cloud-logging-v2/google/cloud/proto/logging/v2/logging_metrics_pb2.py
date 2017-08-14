# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/proto/logging/v2/logging_metrics.proto

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
from google.api import distribution_pb2 as google_dot_api_dot_distribution__pb2
from google.api import metric_pb2 as google_dot_api_dot_metric__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/proto/logging/v2/logging_metrics.proto',
  package='google.logging.v2',
  syntax='proto3',
  serialized_pb=_b('\n3google/cloud/proto/logging/v2/logging_metrics.proto\x12\x11google.logging.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x1dgoogle/api/distribution.proto\x1a\x17google/api/metric.proto\x1a\x1bgoogle/protobuf/empty.proto\"\x96\x01\n\tLogMetric\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x38\n\x07version\x18\x04 \x01(\x0e\x32\'.google.logging.v2.LogMetric.ApiVersion\"\x1c\n\nApiVersion\x12\x06\n\x02V2\x10\x00\x12\x06\n\x02V1\x10\x01\"N\n\x15ListLogMetricsRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x12\n\npage_token\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\"`\n\x16ListLogMetricsResponse\x12-\n\x07metrics\x18\x01 \x03(\x0b\x32\x1c.google.logging.v2.LogMetric\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"*\n\x13GetLogMetricRequest\x12\x13\n\x0bmetric_name\x18\x01 \x01(\t\"V\n\x16\x43reateLogMetricRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12,\n\x06metric\x18\x02 \x01(\x0b\x32\x1c.google.logging.v2.LogMetric\"[\n\x16UpdateLogMetricRequest\x12\x13\n\x0bmetric_name\x18\x01 \x01(\t\x12,\n\x06metric\x18\x02 \x01(\x0b\x32\x1c.google.logging.v2.LogMetric\"-\n\x16\x44\x65leteLogMetricRequest\x12\x13\n\x0bmetric_name\x18\x01 \x01(\t2\xd4\x05\n\x10MetricsServiceV2\x12\x8e\x01\n\x0eListLogMetrics\x12(.google.logging.v2.ListLogMetricsRequest\x1a).google.logging.v2.ListLogMetricsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/v2/{parent=projects/*}/metrics\x12\x84\x01\n\x0cGetLogMetric\x12&.google.logging.v2.GetLogMetricRequest\x1a\x1c.google.logging.v2.LogMetric\".\x82\xd3\xe4\x93\x02(\x12&/v2/{metric_name=projects/*/metrics/*}\x12\x8b\x01\n\x0f\x43reateLogMetric\x12).google.logging.v2.CreateLogMetricRequest\x1a\x1c.google.logging.v2.LogMetric\"/\x82\xd3\xe4\x93\x02)\"\x1f/v2/{parent=projects/*}/metrics:\x06metric\x12\x92\x01\n\x0fUpdateLogMetric\x12).google.logging.v2.UpdateLogMetricRequest\x1a\x1c.google.logging.v2.LogMetric\"6\x82\xd3\xe4\x93\x02\x30\x1a&/v2/{metric_name=projects/*/metrics/*}:\x06metric\x12\x84\x01\n\x0f\x44\x65leteLogMetric\x12).google.logging.v2.DeleteLogMetricRequest\x1a\x16.google.protobuf.Empty\".\x82\xd3\xe4\x93\x02(*&/v2/{metric_name=projects/*/metrics/*}B\x82\x01\n\x15\x63om.google.logging.v2B\x13LoggingMetricsProtoP\x01Z8google.golang.org/genproto/googleapis/logging/v2;logging\xaa\x02\x17Google.Cloud.Logging.V2b\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_distribution__pb2.DESCRIPTOR,google_dot_api_dot_metric__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])



_LOGMETRIC_APIVERSION = _descriptor.EnumDescriptor(
  name='ApiVersion',
  full_name='google.logging.v2.LogMetric.ApiVersion',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='V2', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='V1', index=1, number=1,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=312,
  serialized_end=340,
)
_sym_db.RegisterEnumDescriptor(_LOGMETRIC_APIVERSION)


_LOGMETRIC = _descriptor.Descriptor(
  name='LogMetric',
  full_name='google.logging.v2.LogMetric',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.logging.v2.LogMetric.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.logging.v2.LogMetric.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.logging.v2.LogMetric.filter', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='version', full_name='google.logging.v2.LogMetric.version', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _LOGMETRIC_APIVERSION,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=190,
  serialized_end=340,
)


_LISTLOGMETRICSREQUEST = _descriptor.Descriptor(
  name='ListLogMetricsRequest',
  full_name='google.logging.v2.ListLogMetricsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.logging.v2.ListLogMetricsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.logging.v2.ListLogMetricsRequest.page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.logging.v2.ListLogMetricsRequest.page_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
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
  serialized_start=342,
  serialized_end=420,
)


_LISTLOGMETRICSRESPONSE = _descriptor.Descriptor(
  name='ListLogMetricsResponse',
  full_name='google.logging.v2.ListLogMetricsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metrics', full_name='google.logging.v2.ListLogMetricsResponse.metrics', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.logging.v2.ListLogMetricsResponse.next_page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=422,
  serialized_end=518,
)


_GETLOGMETRICREQUEST = _descriptor.Descriptor(
  name='GetLogMetricRequest',
  full_name='google.logging.v2.GetLogMetricRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metric_name', full_name='google.logging.v2.GetLogMetricRequest.metric_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=520,
  serialized_end=562,
)


_CREATELOGMETRICREQUEST = _descriptor.Descriptor(
  name='CreateLogMetricRequest',
  full_name='google.logging.v2.CreateLogMetricRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.logging.v2.CreateLogMetricRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='metric', full_name='google.logging.v2.CreateLogMetricRequest.metric', index=1,
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
  serialized_start=564,
  serialized_end=650,
)


_UPDATELOGMETRICREQUEST = _descriptor.Descriptor(
  name='UpdateLogMetricRequest',
  full_name='google.logging.v2.UpdateLogMetricRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metric_name', full_name='google.logging.v2.UpdateLogMetricRequest.metric_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='metric', full_name='google.logging.v2.UpdateLogMetricRequest.metric', index=1,
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
  serialized_start=652,
  serialized_end=743,
)


_DELETELOGMETRICREQUEST = _descriptor.Descriptor(
  name='DeleteLogMetricRequest',
  full_name='google.logging.v2.DeleteLogMetricRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='metric_name', full_name='google.logging.v2.DeleteLogMetricRequest.metric_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=745,
  serialized_end=790,
)

_LOGMETRIC.fields_by_name['version'].enum_type = _LOGMETRIC_APIVERSION
_LOGMETRIC_APIVERSION.containing_type = _LOGMETRIC
_LISTLOGMETRICSRESPONSE.fields_by_name['metrics'].message_type = _LOGMETRIC
_CREATELOGMETRICREQUEST.fields_by_name['metric'].message_type = _LOGMETRIC
_UPDATELOGMETRICREQUEST.fields_by_name['metric'].message_type = _LOGMETRIC
DESCRIPTOR.message_types_by_name['LogMetric'] = _LOGMETRIC
DESCRIPTOR.message_types_by_name['ListLogMetricsRequest'] = _LISTLOGMETRICSREQUEST
DESCRIPTOR.message_types_by_name['ListLogMetricsResponse'] = _LISTLOGMETRICSRESPONSE
DESCRIPTOR.message_types_by_name['GetLogMetricRequest'] = _GETLOGMETRICREQUEST
DESCRIPTOR.message_types_by_name['CreateLogMetricRequest'] = _CREATELOGMETRICREQUEST
DESCRIPTOR.message_types_by_name['UpdateLogMetricRequest'] = _UPDATELOGMETRICREQUEST
DESCRIPTOR.message_types_by_name['DeleteLogMetricRequest'] = _DELETELOGMETRICREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LogMetric = _reflection.GeneratedProtocolMessageType('LogMetric', (_message.Message,), dict(
  DESCRIPTOR = _LOGMETRIC,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """Describes a logs-based metric. The value of the metric is the number of
  log entries that match a logs filter in a given time interval.
  
  
  Attributes:
      name:
          Required. The client-assigned metric identifier. Examples:
          ``"error_count"``, ``"nginx/requests"``.  Metric identifiers
          are limited to 100 characters and can include only the
          following characters: ``A-Z``, ``a-z``, ``0-9``, and the
          special characters ``_-.,+!*',()%/``. The forward-slash
          character (``/``) denotes a hierarchy of name pieces, and it
          cannot be the first character of the name.  The metric
          identifier in this field must not be `URL-encoded
          <https://en.wikipedia.org/wiki/Percent-encoding>`__. However,
          when the metric identifier appears as the ``[METRIC_ID]`` part
          of a ``metric_name`` API parameter, then the metric identifier
          must be URL-encoded. Example: ``"projects/my-
          project/metrics/nginx%2Frequests"``.
      description:
          Optional. A description of this metric, which is used in
          documentation.
      filter:
          Required. An `advanced logs filter
          </logging/docs/view/advanced_filters>`__ which is used to
          match log entries. Example:  ::      "resource.type=gae_app
          AND severity>=ERROR"  The maximum length of the filter is
          20000 characters.
      version:
          Output only. The API version that created or updated this
          metric. The version also dictates the syntax of the filter
          expression. When a value for this field is missing, the
          default value of V2 should be assumed.
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogMetric)
  ))
_sym_db.RegisterMessage(LogMetric)

ListLogMetricsRequest = _reflection.GeneratedProtocolMessageType('ListLogMetricsRequest', (_message.Message,), dict(
  DESCRIPTOR = _LISTLOGMETRICSREQUEST,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """The parameters to ListLogMetrics.
  
  
  Attributes:
      parent:
          Required. The name of the project containing the metrics:  ::
          "projects/[PROJECT_ID]"
      page_token:
          Optional. If present, then retrieve the next batch of results
          from the preceding call to this method. ``pageToken`` must be
          the value of ``nextPageToken`` from the previous response. The
          values of other method parameters should be identical to those
          in the previous call.
      page_size:
          Optional. The maximum number of results to return from this
          request. Non-positive values are ignored. The presence of
          ``nextPageToken`` in the response indicates that more results
          might be available.
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.ListLogMetricsRequest)
  ))
_sym_db.RegisterMessage(ListLogMetricsRequest)

ListLogMetricsResponse = _reflection.GeneratedProtocolMessageType('ListLogMetricsResponse', (_message.Message,), dict(
  DESCRIPTOR = _LISTLOGMETRICSRESPONSE,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """Result returned from ListLogMetrics.
  
  
  Attributes:
      metrics:
          A list of logs-based metrics.
      next_page_token:
          If there might be more results than appear in this response,
          then ``nextPageToken`` is included. To get the next set of
          results, call this method again using the value of
          ``nextPageToken`` as ``pageToken``.
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.ListLogMetricsResponse)
  ))
_sym_db.RegisterMessage(ListLogMetricsResponse)

GetLogMetricRequest = _reflection.GeneratedProtocolMessageType('GetLogMetricRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETLOGMETRICREQUEST,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """The parameters to GetLogMetric.
  
  
  Attributes:
      metric_name:
          The resource name of the desired metric:  ::
          "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.GetLogMetricRequest)
  ))
_sym_db.RegisterMessage(GetLogMetricRequest)

CreateLogMetricRequest = _reflection.GeneratedProtocolMessageType('CreateLogMetricRequest', (_message.Message,), dict(
  DESCRIPTOR = _CREATELOGMETRICREQUEST,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """The parameters to CreateLogMetric.
  
  
  Attributes:
      parent:
          The resource name of the project in which to create the
          metric:  ::      "projects/[PROJECT_ID]"  The new metric must
          be provided in the request.
      metric:
          The new logs-based metric, which must not have an identifier
          that already exists.
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.CreateLogMetricRequest)
  ))
_sym_db.RegisterMessage(CreateLogMetricRequest)

UpdateLogMetricRequest = _reflection.GeneratedProtocolMessageType('UpdateLogMetricRequest', (_message.Message,), dict(
  DESCRIPTOR = _UPDATELOGMETRICREQUEST,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """The parameters to UpdateLogMetric.
  
  
  Attributes:
      metric_name:
          The resource name of the metric to update:  ::
          "projects/[PROJECT_ID]/metrics/[METRIC_ID]"  The updated
          metric must be provided in the request and it's ``name`` field
          must be the same as ``[METRIC_ID]`` If the metric does not
          exist in ``[PROJECT_ID]``, then a new metric is created.
      metric:
          The updated metric.
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.UpdateLogMetricRequest)
  ))
_sym_db.RegisterMessage(UpdateLogMetricRequest)

DeleteLogMetricRequest = _reflection.GeneratedProtocolMessageType('DeleteLogMetricRequest', (_message.Message,), dict(
  DESCRIPTOR = _DELETELOGMETRICREQUEST,
  __module__ = 'google.cloud.proto.logging.v2.logging_metrics_pb2'
  ,
  __doc__ = """The parameters to DeleteLogMetric.
  
  
  Attributes:
      metric_name:
          The resource name of the metric to delete:  ::
          "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
  """,
  # @@protoc_insertion_point(class_scope:google.logging.v2.DeleteLogMetricRequest)
  ))
_sym_db.RegisterMessage(DeleteLogMetricRequest)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\025com.google.logging.v2B\023LoggingMetricsProtoP\001Z8google.golang.org/genproto/googleapis/logging/v2;logging\252\002\027Google.Cloud.Logging.V2'))
try:
  # THESE ELEMENTS WILL BE DEPRECATED.
  # Please use the generated *_pb2_grpc.py files instead.
  import grpc
  from grpc.beta import implementations as beta_implementations
  from grpc.beta import interfaces as beta_interfaces
  from grpc.framework.common import cardinality
  from grpc.framework.interfaces.face import utilities as face_utilities


  class MetricsServiceV2Stub(object):
    """Service for configuring logs-based metrics.
    """

    def __init__(self, channel):
      """Constructor.

      Args:
        channel: A grpc.Channel.
      """
      self.ListLogMetrics = channel.unary_unary(
          '/google.logging.v2.MetricsServiceV2/ListLogMetrics',
          request_serializer=ListLogMetricsRequest.SerializeToString,
          response_deserializer=ListLogMetricsResponse.FromString,
          )
      self.GetLogMetric = channel.unary_unary(
          '/google.logging.v2.MetricsServiceV2/GetLogMetric',
          request_serializer=GetLogMetricRequest.SerializeToString,
          response_deserializer=LogMetric.FromString,
          )
      self.CreateLogMetric = channel.unary_unary(
          '/google.logging.v2.MetricsServiceV2/CreateLogMetric',
          request_serializer=CreateLogMetricRequest.SerializeToString,
          response_deserializer=LogMetric.FromString,
          )
      self.UpdateLogMetric = channel.unary_unary(
          '/google.logging.v2.MetricsServiceV2/UpdateLogMetric',
          request_serializer=UpdateLogMetricRequest.SerializeToString,
          response_deserializer=LogMetric.FromString,
          )
      self.DeleteLogMetric = channel.unary_unary(
          '/google.logging.v2.MetricsServiceV2/DeleteLogMetric',
          request_serializer=DeleteLogMetricRequest.SerializeToString,
          response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
          )


  class MetricsServiceV2Servicer(object):
    """Service for configuring logs-based metrics.
    """

    def ListLogMetrics(self, request, context):
      """Lists logs-based metrics.
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')

    def GetLogMetric(self, request, context):
      """Gets a logs-based metric.
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')

    def CreateLogMetric(self, request, context):
      """Creates a logs-based metric.
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')

    def UpdateLogMetric(self, request, context):
      """Creates or updates a logs-based metric.
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')

    def DeleteLogMetric(self, request, context):
      """Deletes a logs-based metric.
      """
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')


  def add_MetricsServiceV2Servicer_to_server(servicer, server):
    rpc_method_handlers = {
        'ListLogMetrics': grpc.unary_unary_rpc_method_handler(
            servicer.ListLogMetrics,
            request_deserializer=ListLogMetricsRequest.FromString,
            response_serializer=ListLogMetricsResponse.SerializeToString,
        ),
        'GetLogMetric': grpc.unary_unary_rpc_method_handler(
            servicer.GetLogMetric,
            request_deserializer=GetLogMetricRequest.FromString,
            response_serializer=LogMetric.SerializeToString,
        ),
        'CreateLogMetric': grpc.unary_unary_rpc_method_handler(
            servicer.CreateLogMetric,
            request_deserializer=CreateLogMetricRequest.FromString,
            response_serializer=LogMetric.SerializeToString,
        ),
        'UpdateLogMetric': grpc.unary_unary_rpc_method_handler(
            servicer.UpdateLogMetric,
            request_deserializer=UpdateLogMetricRequest.FromString,
            response_serializer=LogMetric.SerializeToString,
        ),
        'DeleteLogMetric': grpc.unary_unary_rpc_method_handler(
            servicer.DeleteLogMetric,
            request_deserializer=DeleteLogMetricRequest.FromString,
            response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
        ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
        'google.logging.v2.MetricsServiceV2', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


  class BetaMetricsServiceV2Servicer(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """Service for configuring logs-based metrics.
    """
    def ListLogMetrics(self, request, context):
      """Lists logs-based metrics.
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)
    def GetLogMetric(self, request, context):
      """Gets a logs-based metric.
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)
    def CreateLogMetric(self, request, context):
      """Creates a logs-based metric.
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)
    def UpdateLogMetric(self, request, context):
      """Creates or updates a logs-based metric.
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)
    def DeleteLogMetric(self, request, context):
      """Deletes a logs-based metric.
      """
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)


  class BetaMetricsServiceV2Stub(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """Service for configuring logs-based metrics.
    """
    def ListLogMetrics(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Lists logs-based metrics.
      """
      raise NotImplementedError()
    ListLogMetrics.future = None
    def GetLogMetric(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Gets a logs-based metric.
      """
      raise NotImplementedError()
    GetLogMetric.future = None
    def CreateLogMetric(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Creates a logs-based metric.
      """
      raise NotImplementedError()
    CreateLogMetric.future = None
    def UpdateLogMetric(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Creates or updates a logs-based metric.
      """
      raise NotImplementedError()
    UpdateLogMetric.future = None
    def DeleteLogMetric(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      """Deletes a logs-based metric.
      """
      raise NotImplementedError()
    DeleteLogMetric.future = None


  def beta_create_MetricsServiceV2_server(servicer, pool=None, pool_size=None, default_timeout=None, maximum_timeout=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_deserializers = {
      ('google.logging.v2.MetricsServiceV2', 'CreateLogMetric'): CreateLogMetricRequest.FromString,
      ('google.logging.v2.MetricsServiceV2', 'DeleteLogMetric'): DeleteLogMetricRequest.FromString,
      ('google.logging.v2.MetricsServiceV2', 'GetLogMetric'): GetLogMetricRequest.FromString,
      ('google.logging.v2.MetricsServiceV2', 'ListLogMetrics'): ListLogMetricsRequest.FromString,
      ('google.logging.v2.MetricsServiceV2', 'UpdateLogMetric'): UpdateLogMetricRequest.FromString,
    }
    response_serializers = {
      ('google.logging.v2.MetricsServiceV2', 'CreateLogMetric'): LogMetric.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'DeleteLogMetric'): google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'GetLogMetric'): LogMetric.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'ListLogMetrics'): ListLogMetricsResponse.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'UpdateLogMetric'): LogMetric.SerializeToString,
    }
    method_implementations = {
      ('google.logging.v2.MetricsServiceV2', 'CreateLogMetric'): face_utilities.unary_unary_inline(servicer.CreateLogMetric),
      ('google.logging.v2.MetricsServiceV2', 'DeleteLogMetric'): face_utilities.unary_unary_inline(servicer.DeleteLogMetric),
      ('google.logging.v2.MetricsServiceV2', 'GetLogMetric'): face_utilities.unary_unary_inline(servicer.GetLogMetric),
      ('google.logging.v2.MetricsServiceV2', 'ListLogMetrics'): face_utilities.unary_unary_inline(servicer.ListLogMetrics),
      ('google.logging.v2.MetricsServiceV2', 'UpdateLogMetric'): face_utilities.unary_unary_inline(servicer.UpdateLogMetric),
    }
    server_options = beta_implementations.server_options(request_deserializers=request_deserializers, response_serializers=response_serializers, thread_pool=pool, thread_pool_size=pool_size, default_timeout=default_timeout, maximum_timeout=maximum_timeout)
    return beta_implementations.server(method_implementations, options=server_options)


  def beta_create_MetricsServiceV2_stub(channel, host=None, metadata_transformer=None, pool=None, pool_size=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_serializers = {
      ('google.logging.v2.MetricsServiceV2', 'CreateLogMetric'): CreateLogMetricRequest.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'DeleteLogMetric'): DeleteLogMetricRequest.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'GetLogMetric'): GetLogMetricRequest.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'ListLogMetrics'): ListLogMetricsRequest.SerializeToString,
      ('google.logging.v2.MetricsServiceV2', 'UpdateLogMetric'): UpdateLogMetricRequest.SerializeToString,
    }
    response_deserializers = {
      ('google.logging.v2.MetricsServiceV2', 'CreateLogMetric'): LogMetric.FromString,
      ('google.logging.v2.MetricsServiceV2', 'DeleteLogMetric'): google_dot_protobuf_dot_empty__pb2.Empty.FromString,
      ('google.logging.v2.MetricsServiceV2', 'GetLogMetric'): LogMetric.FromString,
      ('google.logging.v2.MetricsServiceV2', 'ListLogMetrics'): ListLogMetricsResponse.FromString,
      ('google.logging.v2.MetricsServiceV2', 'UpdateLogMetric'): LogMetric.FromString,
    }
    cardinalities = {
      'CreateLogMetric': cardinality.Cardinality.UNARY_UNARY,
      'DeleteLogMetric': cardinality.Cardinality.UNARY_UNARY,
      'GetLogMetric': cardinality.Cardinality.UNARY_UNARY,
      'ListLogMetrics': cardinality.Cardinality.UNARY_UNARY,
      'UpdateLogMetric': cardinality.Cardinality.UNARY_UNARY,
    }
    stub_options = beta_implementations.stub_options(host=host, metadata_transformer=metadata_transformer, request_serializers=request_serializers, response_deserializers=response_deserializers, thread_pool=pool, thread_pool_size=pool_size)
    return beta_implementations.dynamic_stub(channel, 'google.logging.v2.MetricsServiceV2', cardinalities, options=stub_options)
except ImportError:
  pass
# @@protoc_insertion_point(module_scope)
