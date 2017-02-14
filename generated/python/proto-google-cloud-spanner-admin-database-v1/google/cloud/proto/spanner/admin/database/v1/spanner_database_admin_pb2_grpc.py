import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.cloud.proto.spanner.admin.database.v1.spanner_database_admin_pb2 as google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2
import google.iam.v1.iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
import google.iam.v1.policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
import google.iam.v1.iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
import google.iam.v1.policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
import google.iam.v1.iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
import google.iam.v1.iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2


class DatabaseAdminStub(object):
  """Cloud Spanner Database Admin API

  The Cloud Spanner Database Admin API can be used to create, drop, and
  list databases. It also enables updating the schema of pre-existing
  databases.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListDatabases = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/ListDatabases',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.ListDatabasesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.ListDatabasesResponse.FromString,
        )
    self.CreateDatabase = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/CreateDatabase',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.CreateDatabaseRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.GetDatabase = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/GetDatabase',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.Database.FromString,
        )
    self.UpdateDatabaseDdl = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/UpdateDatabaseDdl',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.UpdateDatabaseDdlRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.DropDatabase = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/DropDatabase',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.DropDatabaseRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.GetDatabaseDdl = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/GetDatabaseDdl',
        request_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseDdlRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseDdlResponse.FromString,
        )
    self.SetIamPolicy = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/SetIamPolicy',
        request_serializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.SetIamPolicyRequest.SerializeToString,
        response_deserializer=google_dot_iam_dot_v1_dot_policy__pb2.Policy.FromString,
        )
    self.GetIamPolicy = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/GetIamPolicy',
        request_serializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.GetIamPolicyRequest.SerializeToString,
        response_deserializer=google_dot_iam_dot_v1_dot_policy__pb2.Policy.FromString,
        )
    self.TestIamPermissions = channel.unary_unary(
        '/google.spanner.admin.database.v1.DatabaseAdmin/TestIamPermissions',
        request_serializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.TestIamPermissionsRequest.SerializeToString,
        response_deserializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.TestIamPermissionsResponse.FromString,
        )


class DatabaseAdminServicer(object):
  """Cloud Spanner Database Admin API

  The Cloud Spanner Database Admin API can be used to create, drop, and
  list databases. It also enables updating the schema of pre-existing
  databases.
  """

  def ListDatabases(self, request, context):
    """Lists Cloud Spanner databases.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateDatabase(self, request, context):
    """Creates a new Cloud Spanner database and starts to prepare it for serving.
    The returned [long-running operation][google.longrunning.Operation] will
    have a name of the format `<database_name>/operations/<operation_id>` and
    can be used to track preparation of the database. The
    [metadata][google.longrunning.Operation.metadata] field type is
    [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
    [response][google.longrunning.Operation.response] field type is
    [Database][google.spanner.admin.database.v1.Database], if successful.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetDatabase(self, request, context):
    """Gets the state of a Cloud Spanner database.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateDatabaseDdl(self, request, context):
    """Updates the schema of a Cloud Spanner database by
    creating/altering/dropping tables, columns, indexes, etc. The returned
    [long-running operation][google.longrunning.Operation] will have a name of
    the format `<database_name>/operations/<operation_id>` and can be used to
    track execution of the schema change(s). The
    [metadata][google.longrunning.Operation.metadata] field type is
    [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DropDatabase(self, request, context):
    """Drops (aka deletes) a Cloud Spanner database.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetDatabaseDdl(self, request, context):
    """Returns the schema of a Cloud Spanner database as a list of formatted
    DDL statements. This method does not show pending schema updates, those may
    be queried using the [Operations][google.longrunning.Operations] API.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def SetIamPolicy(self, request, context):
    """Sets the access control policy on a database resource. Replaces any
    existing policy.

    Authorization requires `spanner.databases.setIamPolicy` permission on
    [resource][google.iam.v1.SetIamPolicyRequest.resource].
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetIamPolicy(self, request, context):
    """Gets the access control policy for a database resource. Returns an empty
    policy if a database exists but does not have a policy set.

    Authorization requires `spanner.databases.getIamPolicy` permission on
    [resource][google.iam.v1.GetIamPolicyRequest.resource].
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def TestIamPermissions(self, request, context):
    """Returns permissions that the caller has on the specified database resource.

    Attempting this RPC on a non-existent Cloud Spanner database will result in
    a NOT_FOUND error if the user has `spanner.databases.list` permission on
    the containing Cloud Spanner instance. Otherwise returns an empty set of
    permissions.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_DatabaseAdminServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListDatabases': grpc.unary_unary_rpc_method_handler(
          servicer.ListDatabases,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.ListDatabasesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.ListDatabasesResponse.SerializeToString,
      ),
      'CreateDatabase': grpc.unary_unary_rpc_method_handler(
          servicer.CreateDatabase,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.CreateDatabaseRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'GetDatabase': grpc.unary_unary_rpc_method_handler(
          servicer.GetDatabase,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.Database.SerializeToString,
      ),
      'UpdateDatabaseDdl': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateDatabaseDdl,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.UpdateDatabaseDdlRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'DropDatabase': grpc.unary_unary_rpc_method_handler(
          servicer.DropDatabase,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.DropDatabaseRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'GetDatabaseDdl': grpc.unary_unary_rpc_method_handler(
          servicer.GetDatabaseDdl,
          request_deserializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseDdlRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_spanner_dot_admin_dot_database_dot_v1_dot_spanner__database__admin__pb2.GetDatabaseDdlResponse.SerializeToString,
      ),
      'SetIamPolicy': grpc.unary_unary_rpc_method_handler(
          servicer.SetIamPolicy,
          request_deserializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.SetIamPolicyRequest.FromString,
          response_serializer=google_dot_iam_dot_v1_dot_policy__pb2.Policy.SerializeToString,
      ),
      'GetIamPolicy': grpc.unary_unary_rpc_method_handler(
          servicer.GetIamPolicy,
          request_deserializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.GetIamPolicyRequest.FromString,
          response_serializer=google_dot_iam_dot_v1_dot_policy__pb2.Policy.SerializeToString,
      ),
      'TestIamPermissions': grpc.unary_unary_rpc_method_handler(
          servicer.TestIamPermissions,
          request_deserializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.TestIamPermissionsRequest.FromString,
          response_serializer=google_dot_iam_dot_v1_dot_iam__policy__pb2.TestIamPermissionsResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.spanner.admin.database.v1.DatabaseAdmin', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
