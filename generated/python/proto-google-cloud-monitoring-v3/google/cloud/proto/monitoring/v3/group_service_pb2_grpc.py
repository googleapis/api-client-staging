import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.protobuf.empty_pb2 as google_dot_protobuf_dot_empty__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2
import google.cloud.proto.monitoring.v3.group_service_pb2 as google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2


class GroupServiceStub(object):
  """The Group API lets you inspect and manage your
  [groups](google.monitoring.v3.Group).

  A group is a named filter that is used to identify
  a collection of monitored resources. Groups are typically used to
  mirror the physical and/or logical topology of the environment.
  Because group membership is computed dynamically, monitored
  resources that are started in the future are automatically placed
  in matching groups. By using a group to name monitored resources in,
  for example, an alert policy, the target of that alert policy is
  updated automatically as monitored resources are added and removed
  from the infrastructure.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListGroups = channel.unary_unary(
        '/google.monitoring.v3.GroupService/ListGroups',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupsRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupsResponse.FromString,
        )
    self.GetGroup = channel.unary_unary(
        '/google.monitoring.v3.GroupService/GetGroup',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.GetGroupRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.FromString,
        )
    self.CreateGroup = channel.unary_unary(
        '/google.monitoring.v3.GroupService/CreateGroup',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.CreateGroupRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.FromString,
        )
    self.UpdateGroup = channel.unary_unary(
        '/google.monitoring.v3.GroupService/UpdateGroup',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.UpdateGroupRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.FromString,
        )
    self.DeleteGroup = channel.unary_unary(
        '/google.monitoring.v3.GroupService/DeleteGroup',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.DeleteGroupRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.ListGroupMembers = channel.unary_unary(
        '/google.monitoring.v3.GroupService/ListGroupMembers',
        request_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupMembersRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupMembersResponse.FromString,
        )


class GroupServiceServicer(object):
  """The Group API lets you inspect and manage your
  [groups](google.monitoring.v3.Group).

  A group is a named filter that is used to identify
  a collection of monitored resources. Groups are typically used to
  mirror the physical and/or logical topology of the environment.
  Because group membership is computed dynamically, monitored
  resources that are started in the future are automatically placed
  in matching groups. By using a group to name monitored resources in,
  for example, an alert policy, the target of that alert policy is
  updated automatically as monitored resources are added and removed
  from the infrastructure.
  """

  def ListGroups(self, request, context):
    """Lists the existing groups.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetGroup(self, request, context):
    """Gets a single group.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateGroup(self, request, context):
    """Creates a new group.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateGroup(self, request, context):
    """Updates an existing group.
    You can change any group attributes except `name`.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteGroup(self, request, context):
    """Deletes an existing group.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListGroupMembers(self, request, context):
    """Lists the monitored resources that are members of a group.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_GroupServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListGroups': grpc.unary_unary_rpc_method_handler(
          servicer.ListGroups,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupsRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupsResponse.SerializeToString,
      ),
      'GetGroup': grpc.unary_unary_rpc_method_handler(
          servicer.GetGroup,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.GetGroupRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.SerializeToString,
      ),
      'CreateGroup': grpc.unary_unary_rpc_method_handler(
          servicer.CreateGroup,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.CreateGroupRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.SerializeToString,
      ),
      'UpdateGroup': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateGroup,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.UpdateGroupRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__pb2.Group.SerializeToString,
      ),
      'DeleteGroup': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteGroup,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.DeleteGroupRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'ListGroupMembers': grpc.unary_unary_rpc_method_handler(
          servicer.ListGroupMembers,
          request_deserializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupMembersRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_monitoring_dot_v3_dot_group__service__pb2.ListGroupMembersResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.monitoring.v3.GroupService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
