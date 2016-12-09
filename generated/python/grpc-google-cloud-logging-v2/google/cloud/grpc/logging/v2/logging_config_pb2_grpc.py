import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.cloud.grpc.logging.v2.logging_config_pb2 as google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2


class ConfigServiceV2Stub(object):
  """Service for configuring sinks used to export log entries outside of
  Stackdriver Logging.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListSinks = channel.unary_unary(
        '/google.logging.v2.ConfigServiceV2/ListSinks',
        request_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.ListSinksRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.ListSinksResponse.FromString,
        )
    self.GetSink = channel.unary_unary(
        '/google.logging.v2.ConfigServiceV2/GetSink',
        request_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.GetSinkRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.FromString,
        )
    self.CreateSink = channel.unary_unary(
        '/google.logging.v2.ConfigServiceV2/CreateSink',
        request_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.CreateSinkRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.FromString,
        )
    self.UpdateSink = channel.unary_unary(
        '/google.logging.v2.ConfigServiceV2/UpdateSink',
        request_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.UpdateSinkRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.FromString,
        )
    self.DeleteSink = channel.unary_unary(
        '/google.logging.v2.ConfigServiceV2/DeleteSink',
        request_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.DeleteSinkRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class ConfigServiceV2Servicer(object):
  """Service for configuring sinks used to export log entries outside of
  Stackdriver Logging.
  """

  def ListSinks(self, request, context):
    """Lists sinks.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetSink(self, request, context):
    """Gets a sink.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateSink(self, request, context):
    """Creates a sink.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateSink(self, request, context):
    """Updates or creates a sink.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteSink(self, request, context):
    """Deletes a sink.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ConfigServiceV2Servicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListSinks': grpc.unary_unary_rpc_method_handler(
          servicer.ListSinks,
          request_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.ListSinksRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.ListSinksResponse.SerializeToString,
      ),
      'GetSink': grpc.unary_unary_rpc_method_handler(
          servicer.GetSink,
          request_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.GetSinkRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.SerializeToString,
      ),
      'CreateSink': grpc.unary_unary_rpc_method_handler(
          servicer.CreateSink,
          request_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.CreateSinkRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.SerializeToString,
      ),
      'UpdateSink': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateSink,
          request_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.UpdateSinkRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.LogSink.SerializeToString,
      ),
      'DeleteSink': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteSink,
          request_deserializer=google_dot_cloud_dot_grpc_dot_logging_dot_v2_dot_logging__config__pb2.DeleteSinkRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.logging.v2.ConfigServiceV2', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
