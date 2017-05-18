package com.google.monitoring.v3;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The Group API lets you inspect and manage your
 * [groups](google.monitoring.v3.Group).
 * A group is a named filter that is used to identify
 * a collection of monitored resources. Groups are typically used to
 * mirror the physical and/or logical topology of the environment.
 * Because group membership is computed dynamically, monitored
 * resources that are started in the future are automatically placed
 * in matching groups. By using a group to name monitored resources in,
 * for example, an alert policy, the target of that alert policy is
 * updated automatically as monitored resources are added and removed
 * from the infrastructure.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/monitoring/v3/group_service.proto")
public final class GroupServiceGrpc {

  private GroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.GroupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListGroupsRequest,
      com.google.monitoring.v3.ListGroupsResponse> METHOD_LIST_GROUPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "ListGroups"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListGroupsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListGroupsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetGroupRequest,
      com.google.monitoring.v3.Group> METHOD_GET_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "GetGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.Group.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.CreateGroupRequest,
      com.google.monitoring.v3.Group> METHOD_CREATE_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "CreateGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.CreateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.Group.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.UpdateGroupRequest,
      com.google.monitoring.v3.Group> METHOD_UPDATE_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "UpdateGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UpdateGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.Group.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.DeleteGroupRequest,
      com.google.protobuf.Empty> METHOD_DELETE_GROUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "DeleteGroup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.DeleteGroupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListGroupMembersRequest,
      com.google.monitoring.v3.ListGroupMembersResponse> METHOD_LIST_GROUP_MEMBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.GroupService", "ListGroupMembers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListGroupMembersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListGroupMembersResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupServiceStub newStub(io.grpc.Channel channel) {
    return new GroupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GroupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GroupServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Group API lets you inspect and manage your
   * [groups](google.monitoring.v3.Group).
   * A group is a named filter that is used to identify
   * a collection of monitored resources. Groups are typically used to
   * mirror the physical and/or logical topology of the environment.
   * Because group membership is computed dynamically, monitored
   * resources that are started in the future are automatically placed
   * in matching groups. By using a group to name monitored resources in,
   * for example, an alert policy, the target of that alert policy is
   * updated automatically as monitored resources are added and removed
   * from the infrastructure.
   * </pre>
   */
  public static abstract class GroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the existing groups.
     * </pre>
     */
    public void listGroups(com.google.monitoring.v3.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUPS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single group.
     * </pre>
     */
    public void getGroup(com.google.monitoring.v3.GetGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GROUP, responseObserver);
    }

    /**
     * <pre>
     * Creates a new group.
     * </pre>
     */
    public void createGroup(com.google.monitoring.v3.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_GROUP, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing group.
     * You can change any group attributes except `name`.
     * </pre>
     */
    public void updateGroup(com.google.monitoring.v3.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_GROUP, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing group.
     * </pre>
     */
    public void deleteGroup(com.google.monitoring.v3.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_GROUP, responseObserver);
    }

    /**
     * <pre>
     * Lists the monitored resources that are members of a group.
     * </pre>
     */
    public void listGroupMembers(com.google.monitoring.v3.ListGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupMembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_MEMBERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_GROUPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListGroupsRequest,
                com.google.monitoring.v3.ListGroupsResponse>(
                  this, METHODID_LIST_GROUPS)))
          .addMethod(
            METHOD_GET_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetGroupRequest,
                com.google.monitoring.v3.Group>(
                  this, METHODID_GET_GROUP)))
          .addMethod(
            METHOD_CREATE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.CreateGroupRequest,
                com.google.monitoring.v3.Group>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            METHOD_UPDATE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.UpdateGroupRequest,
                com.google.monitoring.v3.Group>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            METHOD_DELETE_GROUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.DeleteGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_GROUP)))
          .addMethod(
            METHOD_LIST_GROUP_MEMBERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListGroupMembersRequest,
                com.google.monitoring.v3.ListGroupMembersResponse>(
                  this, METHODID_LIST_GROUP_MEMBERS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Group API lets you inspect and manage your
   * [groups](google.monitoring.v3.Group).
   * A group is a named filter that is used to identify
   * a collection of monitored resources. Groups are typically used to
   * mirror the physical and/or logical topology of the environment.
   * Because group membership is computed dynamically, monitored
   * resources that are started in the future are automatically placed
   * in matching groups. By using a group to name monitored resources in,
   * for example, an alert policy, the target of that alert policy is
   * updated automatically as monitored resources are added and removed
   * from the infrastructure.
   * </pre>
   */
  public static final class GroupServiceStub extends io.grpc.stub.AbstractStub<GroupServiceStub> {
    private GroupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing groups.
     * </pre>
     */
    public void listGroups(com.google.monitoring.v3.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUPS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single group.
     * </pre>
     */
    public void getGroup(com.google.monitoring.v3.GetGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new group.
     * </pre>
     */
    public void createGroup(com.google.monitoring.v3.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing group.
     * You can change any group attributes except `name`.
     * </pre>
     */
    public void updateGroup(com.google.monitoring.v3.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing group.
     * </pre>
     */
    public void deleteGroup(com.google.monitoring.v3.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_GROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the monitored resources that are members of a group.
     * </pre>
     */
    public void listGroupMembers(com.google.monitoring.v3.ListGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupMembersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Group API lets you inspect and manage your
   * [groups](google.monitoring.v3.Group).
   * A group is a named filter that is used to identify
   * a collection of monitored resources. Groups are typically used to
   * mirror the physical and/or logical topology of the environment.
   * Because group membership is computed dynamically, monitored
   * resources that are started in the future are automatically placed
   * in matching groups. By using a group to name monitored resources in,
   * for example, an alert policy, the target of that alert policy is
   * updated automatically as monitored resources are added and removed
   * from the infrastructure.
   * </pre>
   */
  public static final class GroupServiceBlockingStub extends io.grpc.stub.AbstractStub<GroupServiceBlockingStub> {
    private GroupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing groups.
     * </pre>
     */
    public com.google.monitoring.v3.ListGroupsResponse listGroups(com.google.monitoring.v3.ListGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUPS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single group.
     * </pre>
     */
    public com.google.monitoring.v3.Group getGroup(com.google.monitoring.v3.GetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new group.
     * </pre>
     */
    public com.google.monitoring.v3.Group createGroup(com.google.monitoring.v3.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing group.
     * You can change any group attributes except `name`.
     * </pre>
     */
    public com.google.monitoring.v3.Group updateGroup(com.google.monitoring.v3.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing group.
     * </pre>
     */
    public com.google.protobuf.Empty deleteGroup(com.google.monitoring.v3.DeleteGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_GROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the monitored resources that are members of a group.
     * </pre>
     */
    public com.google.monitoring.v3.ListGroupMembersResponse listGroupMembers(com.google.monitoring.v3.ListGroupMembersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_MEMBERS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Group API lets you inspect and manage your
   * [groups](google.monitoring.v3.Group).
   * A group is a named filter that is used to identify
   * a collection of monitored resources. Groups are typically used to
   * mirror the physical and/or logical topology of the environment.
   * Because group membership is computed dynamically, monitored
   * resources that are started in the future are automatically placed
   * in matching groups. By using a group to name monitored resources in,
   * for example, an alert policy, the target of that alert policy is
   * updated automatically as monitored resources are added and removed
   * from the infrastructure.
   * </pre>
   */
  public static final class GroupServiceFutureStub extends io.grpc.stub.AbstractStub<GroupServiceFutureStub> {
    private GroupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GroupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListGroupsResponse> listGroups(
        com.google.monitoring.v3.ListGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUPS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.Group> getGroup(
        com.google.monitoring.v3.GetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.Group> createGroup(
        com.google.monitoring.v3.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing group.
     * You can change any group attributes except `name`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.Group> updateGroup(
        com.google.monitoring.v3.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteGroup(
        com.google.monitoring.v3.DeleteGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_GROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the monitored resources that are members of a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListGroupMembersResponse> listGroupMembers(
        com.google.monitoring.v3.ListGroupMembersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_MEMBERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUPS = 0;
  private static final int METHODID_GET_GROUP = 1;
  private static final int METHODID_CREATE_GROUP = 2;
  private static final int METHODID_UPDATE_GROUP = 3;
  private static final int METHODID_DELETE_GROUP = 4;
  private static final int METHODID_LIST_GROUP_MEMBERS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups((com.google.monitoring.v3.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((com.google.monitoring.v3.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.google.monitoring.v3.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((com.google.monitoring.v3.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.Group>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((com.google.monitoring.v3.DeleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_GROUP_MEMBERS:
          serviceImpl.listGroupMembers((com.google.monitoring.v3.ListGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListGroupMembersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class GroupServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.GroupServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_GROUPS)
              .addMethod(METHOD_GET_GROUP)
              .addMethod(METHOD_CREATE_GROUP)
              .addMethod(METHOD_UPDATE_GROUP)
              .addMethod(METHOD_DELETE_GROUP)
              .addMethod(METHOD_LIST_GROUP_MEMBERS)
              .build();
        }
      }
    }
    return result;
  }
}
