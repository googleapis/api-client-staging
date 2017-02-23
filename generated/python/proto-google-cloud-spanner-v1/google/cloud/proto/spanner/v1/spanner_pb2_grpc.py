import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.result_set_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.result_set_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.result_set_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.result_set_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.transaction_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_transaction__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.cloud.proto.spanner.v1.spanner_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2


class SpannerStub(object):
  """Cloud Spanner API

  The Cloud Spanner API can be used to manage sessions and execute
  transactions on data stored in Cloud Spanner databases.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.CreateSession = channel.unary_unary(
        '/google.spanner.v1.Spanner/CreateSession',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CreateSessionRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.Session.FromString,
        )
    self.GetSession = channel.unary_unary(
        '/google.spanner.v1.Spanner/GetSession',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.GetSessionRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.Session.FromString,
        )
    self.DeleteSession = channel.unary_unary(
        '/google.spanner.v1.Spanner/DeleteSession',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.DeleteSessionRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.ExecuteSql = channel.unary_unary(
        '/google.spanner.v1.Spanner/ExecuteSql',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ExecuteSqlRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.ResultSet.FromString,
        )
    self.ExecuteStreamingSql = channel.unary_stream(
        '/google.spanner.v1.Spanner/ExecuteStreamingSql',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ExecuteSqlRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.PartialResultSet.FromString,
        )
    self.Read = channel.unary_unary(
        '/google.spanner.v1.Spanner/Read',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ReadRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.ResultSet.FromString,
        )
    self.StreamingRead = channel.unary_stream(
        '/google.spanner.v1.Spanner/StreamingRead',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ReadRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.PartialResultSet.FromString,
        )
    self.BeginTransaction = channel.unary_unary(
        '/google.spanner.v1.Spanner/BeginTransaction',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.BeginTransactionRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_transaction__pb2.Transaction.FromString,
        )
    self.Commit = channel.unary_unary(
        '/google.spanner.v1.Spanner/Commit',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CommitRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CommitResponse.FromString,
        )
    self.Rollback = channel.unary_unary(
        '/google.spanner.v1.Spanner/Rollback',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.RollbackRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class SpannerServicer(object):
  """Cloud Spanner API

  The Cloud Spanner API can be used to manage sessions and execute
  transactions on data stored in Cloud Spanner databases.
  """

  def CreateSession(self, request, context):
    """Creates a new session. A session can be used to perform
    transactions that read and/or modify data in a Cloud Spanner database.
    Sessions are meant to be reused for many consecutive
    transactions.

    Sessions can only execute one transaction at a time. To execute
    multiple concurrent read-write/write-only transactions, create
    multiple sessions. Note that standalone reads and queries use a
    transaction internally, and count toward the one transaction
    limit.

    Cloud Spanner limits the number of sessions that can exist at any given
    time; thus, it is a good idea to delete idle and/or unneeded sessions.
    Aside from explicit deletes, Cloud Spanner can delete sessions for which no
    operations are sent for more than an hour. If a session is deleted,
    requests to it return `NOT_FOUND`.

    Idle sessions can be kept alive by sending a trivial SQL query
    periodically, e.g., `"SELECT 1"`.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetSession(self, request, context):
    """Gets a session. Returns `NOT_FOUND` if the session does not exist.
    This is mainly useful for determining whether a session is still
    alive.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteSession(self, request, context):
    """Ends a session, releasing server resources associated with it.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ExecuteSql(self, request, context):
    """Executes an SQL query, returning all rows in a single reply. This
    method cannot be used to return a result set larger than 10 MiB;
    if the query yields more data than that, the query fails with
    a `FAILED_PRECONDITION` error.

    Queries inside read-write transactions might return `ABORTED`. If
    this occurs, the application should restart the transaction from
    the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.

    Larger result sets can be fetched in streaming fashion by calling
    [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ExecuteStreamingSql(self, request, context):
    """Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result
    set as a stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there
    is no limit on the size of the returned result set. However, no
    individual row in the result set can exceed 100 MiB, and no
    column value can exceed 10 MiB.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Read(self, request, context):
    """Reads rows from the database using key lookups and scans, as a
    simple key/value style alternative to
    [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].  This method cannot be used to
    return a result set larger than 10 MiB; if the read matches more
    data than that, the read fails with a `FAILED_PRECONDITION`
    error.

    Reads inside read-write transactions might return `ABORTED`. If
    this occurs, the application should restart the transaction from
    the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.

    Larger result sets can be yielded in streaming fashion by calling
    [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def StreamingRead(self, request, context):
    """Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a
    stream. Unlike [Read][google.spanner.v1.Spanner.Read], there is no limit on the
    size of the returned result set. However, no individual row in
    the result set can exceed 100 MiB, and no column value can exceed
    10 MiB.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BeginTransaction(self, request, context):
    """Begins a new transaction. This step can often be skipped:
    [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
    [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a
    side-effect.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Commit(self, request, context):
    """Commits a transaction. The request includes the mutations to be
    applied to rows in the database.

    `Commit` might return an `ABORTED` error. This can occur at any time;
    commonly, the cause is conflicts with concurrent
    transactions. However, it can also happen for a variety of other
    reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
    the transaction from the beginning, re-using the same session.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Rollback(self, request, context):
    """Rolls back a transaction, releasing any locks it holds. It is a good
    idea to call this for any transaction that includes one or more
    [Read][google.spanner.v1.Spanner.Read] or [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and
    ultimately decides not to commit.

    `Rollback` returns `OK` if it successfully aborts the transaction, the
    transaction was already aborted, or the transaction is not
    found. `Rollback` never returns `ABORTED`.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_SpannerServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'CreateSession': grpc.unary_unary_rpc_method_handler(
          servicer.CreateSession,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CreateSessionRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.Session.SerializeToString,
      ),
      'GetSession': grpc.unary_unary_rpc_method_handler(
          servicer.GetSession,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.GetSessionRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.Session.SerializeToString,
      ),
      'DeleteSession': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteSession,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.DeleteSessionRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'ExecuteSql': grpc.unary_unary_rpc_method_handler(
          servicer.ExecuteSql,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ExecuteSqlRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.ResultSet.SerializeToString,
      ),
      'ExecuteStreamingSql': grpc.unary_stream_rpc_method_handler(
          servicer.ExecuteStreamingSql,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ExecuteSqlRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.PartialResultSet.SerializeToString,
      ),
      'Read': grpc.unary_unary_rpc_method_handler(
          servicer.Read,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ReadRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.ResultSet.SerializeToString,
      ),
      'StreamingRead': grpc.unary_stream_rpc_method_handler(
          servicer.StreamingRead,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.ReadRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_result__set__pb2.PartialResultSet.SerializeToString,
      ),
      'BeginTransaction': grpc.unary_unary_rpc_method_handler(
          servicer.BeginTransaction,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.BeginTransactionRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_transaction__pb2.Transaction.SerializeToString,
      ),
      'Commit': grpc.unary_unary_rpc_method_handler(
          servicer.Commit,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CommitRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.CommitResponse.SerializeToString,
      ),
      'Rollback': grpc.unary_unary_rpc_method_handler(
          servicer.Rollback,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_v1_dot_spanner__pb2.RollbackRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.spanner.v1.Spanner', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
