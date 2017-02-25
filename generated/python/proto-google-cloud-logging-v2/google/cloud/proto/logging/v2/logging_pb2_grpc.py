import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2
import google.cloud.proto.logging.v2.logging_pb2 as google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2


class LoggingServiceV2Stub(object):
  """Service for ingesting and querying logs.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.DeleteLog = channel.unary_unary(
        '/google.logging.v2.LoggingServiceV2/DeleteLog',
        request_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.DeleteLogRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.WriteLogEntries = channel.unary_unary(
        '/google.logging.v2.LoggingServiceV2/WriteLogEntries',
        request_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.WriteLogEntriesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.WriteLogEntriesResponse.FromString,
        )
    self.ListLogEntries = channel.unary_unary(
        '/google.logging.v2.LoggingServiceV2/ListLogEntries',
        request_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogEntriesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogEntriesResponse.FromString,
        )
    self.ListMonitoredResourceDescriptors = channel.unary_unary(
        '/google.logging.v2.LoggingServiceV2/ListMonitoredResourceDescriptors',
        request_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListMonitoredResourceDescriptorsRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListMonitoredResourceDescriptorsResponse.FromString,
        )
    self.ListLogs = channel.unary_unary(
        '/google.logging.v2.LoggingServiceV2/ListLogs',
        request_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogsRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogsResponse.FromString,
        )


class LoggingServiceV2Servicer(object):
  """Service for ingesting and querying logs.
  """

  def DeleteLog(self, request, context):
    """Deletes all the log entries in a log.
    The log reappears if it receives new entries.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def WriteLogEntries(self, request, context):
    """Writes log entries to Stackdriver Logging.  All log entries are
    written by this method.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListLogEntries(self, request, context):
    """Lists log entries.  Use this method to retrieve log entries from
    Stackdriver Logging.  For ways to export log entries, see
    [Exporting Logs](/logging/docs/export).
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListMonitoredResourceDescriptors(self, request, context):
    """Lists the descriptors for monitored resource types used by Stackdriver
    Logging.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListLogs(self, request, context):
    """Lists the logs in projects or organizations.
    Only logs that have entries are listed.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_LoggingServiceV2Servicer_to_server(servicer, server):
  rpc_method_handlers = {
      'DeleteLog': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteLog,
          request_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.DeleteLogRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'WriteLogEntries': grpc.unary_unary_rpc_method_handler(
          servicer.WriteLogEntries,
          request_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.WriteLogEntriesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.WriteLogEntriesResponse.SerializeToString,
      ),
      'ListLogEntries': grpc.unary_unary_rpc_method_handler(
          servicer.ListLogEntries,
          request_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogEntriesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogEntriesResponse.SerializeToString,
      ),
      'ListMonitoredResourceDescriptors': grpc.unary_unary_rpc_method_handler(
          servicer.ListMonitoredResourceDescriptors,
          request_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListMonitoredResourceDescriptorsRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListMonitoredResourceDescriptorsResponse.SerializeToString,
      ),
      'ListLogs': grpc.unary_unary_rpc_method_handler(
          servicer.ListLogs,
          request_deserializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogsRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_logging_dot_v2_dot_logging__pb2.ListLogsResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.logging.v2.LoggingServiceV2', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
