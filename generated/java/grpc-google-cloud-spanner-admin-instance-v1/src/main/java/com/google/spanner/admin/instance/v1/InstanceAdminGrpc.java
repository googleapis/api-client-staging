package com.google.spanner.admin.instance.v1;

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
 * Cloud Spanner Instance Admin API
 * The Cloud Spanner Instance Admin API can be used to create, delete,
 * modify and list instances. Instances are dedicated Cloud Spanner serving
 * and storage resources to be used by Cloud Spanner databases.
 * Each instance has a "configuration", which dictates where the
 * serving resources for the Cloud Spanner instance are located (e.g.,
 * US-central, Europe). Configurations are created by Google based on
 * resource availability.
 * Cloud Spanner billing is based on the instances that exist and their
 * sizes. After an instance exists, there are no additional
 * per-database or per-operation charges for use of the instance
 * (though there may be additional network bandwidth charges).
 * Instances offer isolation: problems with databases in one instance
 * will not affect other instances. However, within an instance
 * databases can affect each other. For example, if one database in an
 * instance receives a lot of requests and consumes most of the
 * instance resources, fewer resources are available for other
 * databases in that instance, and their performance may suffer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/spanner/admin/instance/v1/spanner_instance_admin.proto")
public final class InstanceAdminGrpc {

  private InstanceAdminGrpc() {}

  public static final String SERVICE_NAME = "google.spanner.admin.instance.v1.InstanceAdmin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,
      com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse> METHOD_LIST_INSTANCE_CONFIGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "ListInstanceConfigs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,
      com.google.spanner.admin.instance.v1.InstanceConfig> METHOD_GET_INSTANCE_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "GetInstanceConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.GetInstanceConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.InstanceConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.ListInstancesRequest,
      com.google.spanner.admin.instance.v1.ListInstancesResponse> METHOD_LIST_INSTANCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "ListInstances"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.ListInstancesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.ListInstancesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.GetInstanceRequest,
      com.google.spanner.admin.instance.v1.Instance> METHOD_GET_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "GetInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.GetInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.Instance.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.CreateInstanceRequest,
      com.google.longrunning.Operation> METHOD_CREATE_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "CreateInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.CreateInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "UpdateInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.UpdateInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,
      com.google.protobuf.Empty> METHOD_DELETE_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "DeleteInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.instance.v1.DeleteInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_SET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "SetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_GET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "GetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.TestIamPermissionsRequest,
      com.google.iam.v1.TestIamPermissionsResponse> METHOD_TEST_IAM_PERMISSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.instance.v1.InstanceAdmin", "TestIamPermissions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceAdminStub newStub(io.grpc.Channel channel) {
    return new InstanceAdminStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceAdminBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceAdminBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceAdminFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceAdminFutureStub(channel);
  }

  /**
   * <pre>
   * Cloud Spanner Instance Admin API
   * The Cloud Spanner Instance Admin API can be used to create, delete,
   * modify and list instances. Instances are dedicated Cloud Spanner serving
   * and storage resources to be used by Cloud Spanner databases.
   * Each instance has a "configuration", which dictates where the
   * serving resources for the Cloud Spanner instance are located (e.g.,
   * US-central, Europe). Configurations are created by Google based on
   * resource availability.
   * Cloud Spanner billing is based on the instances that exist and their
   * sizes. After an instance exists, there are no additional
   * per-database or per-operation charges for use of the instance
   * (though there may be additional network bandwidth charges).
   * Instances offer isolation: problems with databases in one instance
   * will not affect other instances. However, within an instance
   * databases can affect each other. For example, if one database in an
   * instance receives a lot of requests and consumes most of the
   * instance resources, fewer resources are available for other
   * databases in that instance, and their performance may suffer.
   * </pre>
   */
  public static abstract class InstanceAdminImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the supported instance configurations for a given project.
     * </pre>
     */
    public void listInstanceConfigs(com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSTANCE_CONFIGS, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a particular instance configuration.
     * </pre>
     */
    public void getInstanceConfig(com.google.spanner.admin.instance.v1.GetInstanceConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.InstanceConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INSTANCE_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Lists all instances in the given project.
     * </pre>
     */
    public void listInstances(com.google.spanner.admin.instance.v1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSTANCES, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a particular instance.
     * </pre>
     */
    public void getInstance(com.google.spanner.admin.instance.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance and begins preparing it to begin serving. The
     * returned [long-running operation][google.longrunning.Operation]
     * can be used to track the progress of preparing the new
     * instance. The instance name is assigned by the caller. If the
     * named instance already exists, `CreateInstance` returns
     * `ALREADY_EXISTS`.
     * Immediately upon completion of this request:
     *   * The instance is readable via the API, with all requested attributes
     *     but no allocated resources. Its state is `CREATING`.
     * Until completion of the returned operation:
     *   * Cancelling the operation renders the instance immediately unreadable
     *     via the API.
     *   * The instance can be deleted.
     *   * All other attempts to modify the instance are rejected.
     * Upon completion of the returned operation:
     *   * Billing for all successfully-allocated resources begins (some types
     *     may have lower than the requested levels).
     *   * Databases can be created in the instance.
     *   * The instance's allocated resource levels are readable via the API.
     *   * The instance's state becomes `READY`.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track creation of the instance.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * </pre>
     */
    public void createInstance(com.google.spanner.admin.instance.v1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Updates an instance, and begins allocating or releasing resources
     * as requested. The returned [long-running
     * operation][google.longrunning.Operation] can be used to track the
     * progress of updating the instance. If the named instance does not
     * exist, returns `NOT_FOUND`.
     * Immediately upon completion of this request:
     *   * For resource types for which a decrease in the instance's allocation
     *     has been requested, billing is based on the newly-requested level.
     * Until completion of the returned operation:
     *   * Cancelling the operation sets its metadata's
     *     [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
     *     restoring resources to their pre-request values. The operation
     *     is guaranteed to succeed at undoing all resource changes,
     *     after which point it terminates with a `CANCELLED` status.
     *   * All other attempts to modify the instance are rejected.
     *   * Reading the instance via the API continues to give the pre-request
     *     resource levels.
     * Upon completion of the returned operation:
     *   * Billing begins for all successfully-allocated resources (some types
     *     may have lower than the requested levels).
     *   * All newly-reserved resources are available for serving the instance's
     *     tables.
     *   * The instance's new resource levels are readable via the API.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track the instance modification.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * Authorization requires `spanner.instances.update` permission on
     * resource [name][google.spanner.admin.instance.v1.Instance.name].
     * </pre>
     */
    public void updateInstance(com.google.spanner.admin.instance.v1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Deletes an instance.
     * Immediately upon completion of the request:
     *   * Billing ceases for all of the instance's reserved resources.
     * Soon afterward:
     *   * The instance and *all of its databases* immediately and
     *     irrevocably disappear from the API. All data in the databases
     *     is permanently deleted.
     * </pre>
     */
    public void deleteInstance(com.google.spanner.admin.instance.v1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on an instance resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.instances.setIamPolicy` on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Gets the access control policy for an instance resource. Returns an empty
     * policy if an instance exists but does not have a policy set.
     * Authorization requires `spanner.instances.getIamPolicy` on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified instance resource.
     * Attempting this RPC on a non-existent Cloud Spanner instance resource will
     * result in a NOT_FOUND error if the user has `spanner.instances.list`
     * permission on the containing Google Cloud Project. Otherwise returns an
     * empty set of permissions.
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST_IAM_PERMISSIONS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_INSTANCE_CONFIGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,
                com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse>(
                  this, METHODID_LIST_INSTANCE_CONFIGS)))
          .addMethod(
            METHOD_GET_INSTANCE_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,
                com.google.spanner.admin.instance.v1.InstanceConfig>(
                  this, METHODID_GET_INSTANCE_CONFIG)))
          .addMethod(
            METHOD_LIST_INSTANCES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.ListInstancesRequest,
                com.google.spanner.admin.instance.v1.ListInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            METHOD_GET_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.GetInstanceRequest,
                com.google.spanner.admin.instance.v1.Instance>(
                  this, METHODID_GET_INSTANCE)))
          .addMethod(
            METHOD_CREATE_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.CreateInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_INSTANCE)))
          .addMethod(
            METHOD_UPDATE_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.UpdateInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_INSTANCE)))
          .addMethod(
            METHOD_DELETE_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.instance.v1.DeleteInstanceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INSTANCE)))
          .addMethod(
            METHOD_SET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.SetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_SET_IAM_POLICY)))
          .addMethod(
            METHOD_GET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.GetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_GET_IAM_POLICY)))
          .addMethod(
            METHOD_TEST_IAM_PERMISSIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.TestIamPermissionsRequest,
                com.google.iam.v1.TestIamPermissionsResponse>(
                  this, METHODID_TEST_IAM_PERMISSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud Spanner Instance Admin API
   * The Cloud Spanner Instance Admin API can be used to create, delete,
   * modify and list instances. Instances are dedicated Cloud Spanner serving
   * and storage resources to be used by Cloud Spanner databases.
   * Each instance has a "configuration", which dictates where the
   * serving resources for the Cloud Spanner instance are located (e.g.,
   * US-central, Europe). Configurations are created by Google based on
   * resource availability.
   * Cloud Spanner billing is based on the instances that exist and their
   * sizes. After an instance exists, there are no additional
   * per-database or per-operation charges for use of the instance
   * (though there may be additional network bandwidth charges).
   * Instances offer isolation: problems with databases in one instance
   * will not affect other instances. However, within an instance
   * databases can affect each other. For example, if one database in an
   * instance receives a lot of requests and consumes most of the
   * instance resources, fewer resources are available for other
   * databases in that instance, and their performance may suffer.
   * </pre>
   */
  public static final class InstanceAdminStub extends io.grpc.stub.AbstractStub<InstanceAdminStub> {
    private InstanceAdminStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceAdminStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceAdminStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceAdminStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the supported instance configurations for a given project.
     * </pre>
     */
    public void listInstanceConfigs(com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCE_CONFIGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a particular instance configuration.
     * </pre>
     */
    public void getInstanceConfig(com.google.spanner.admin.instance.v1.GetInstanceConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.InstanceConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all instances in the given project.
     * </pre>
     */
    public void listInstances(com.google.spanner.admin.instance.v1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a particular instance.
     * </pre>
     */
    public void getInstance(com.google.spanner.admin.instance.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance and begins preparing it to begin serving. The
     * returned [long-running operation][google.longrunning.Operation]
     * can be used to track the progress of preparing the new
     * instance. The instance name is assigned by the caller. If the
     * named instance already exists, `CreateInstance` returns
     * `ALREADY_EXISTS`.
     * Immediately upon completion of this request:
     *   * The instance is readable via the API, with all requested attributes
     *     but no allocated resources. Its state is `CREATING`.
     * Until completion of the returned operation:
     *   * Cancelling the operation renders the instance immediately unreadable
     *     via the API.
     *   * The instance can be deleted.
     *   * All other attempts to modify the instance are rejected.
     * Upon completion of the returned operation:
     *   * Billing for all successfully-allocated resources begins (some types
     *     may have lower than the requested levels).
     *   * Databases can be created in the instance.
     *   * The instance's allocated resource levels are readable via the API.
     *   * The instance's state becomes `READY`.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track creation of the instance.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * </pre>
     */
    public void createInstance(com.google.spanner.admin.instance.v1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an instance, and begins allocating or releasing resources
     * as requested. The returned [long-running
     * operation][google.longrunning.Operation] can be used to track the
     * progress of updating the instance. If the named instance does not
     * exist, returns `NOT_FOUND`.
     * Immediately upon completion of this request:
     *   * For resource types for which a decrease in the instance's allocation
     *     has been requested, billing is based on the newly-requested level.
     * Until completion of the returned operation:
     *   * Cancelling the operation sets its metadata's
     *     [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
     *     restoring resources to their pre-request values. The operation
     *     is guaranteed to succeed at undoing all resource changes,
     *     after which point it terminates with a `CANCELLED` status.
     *   * All other attempts to modify the instance are rejected.
     *   * Reading the instance via the API continues to give the pre-request
     *     resource levels.
     * Upon completion of the returned operation:
     *   * Billing begins for all successfully-allocated resources (some types
     *     may have lower than the requested levels).
     *   * All newly-reserved resources are available for serving the instance's
     *     tables.
     *   * The instance's new resource levels are readable via the API.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track the instance modification.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * Authorization requires `spanner.instances.update` permission on
     * resource [name][google.spanner.admin.instance.v1.Instance.name].
     * </pre>
     */
    public void updateInstance(com.google.spanner.admin.instance.v1.UpdateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an instance.
     * Immediately upon completion of the request:
     *   * Billing ceases for all of the instance's reserved resources.
     * Soon afterward:
     *   * The instance and *all of its databases* immediately and
     *     irrevocably disappear from the API. All data in the databases
     *     is permanently deleted.
     * </pre>
     */
    public void deleteInstance(com.google.spanner.admin.instance.v1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on an instance resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.instances.setIamPolicy` on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the access control policy for an instance resource. Returns an empty
     * policy if an instance exists but does not have a policy set.
     * Authorization requires `spanner.instances.getIamPolicy` on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified instance resource.
     * Attempting this RPC on a non-existent Cloud Spanner instance resource will
     * result in a NOT_FOUND error if the user has `spanner.instances.list`
     * permission on the containing Google Cloud Project. Otherwise returns an
     * empty set of permissions.
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud Spanner Instance Admin API
   * The Cloud Spanner Instance Admin API can be used to create, delete,
   * modify and list instances. Instances are dedicated Cloud Spanner serving
   * and storage resources to be used by Cloud Spanner databases.
   * Each instance has a "configuration", which dictates where the
   * serving resources for the Cloud Spanner instance are located (e.g.,
   * US-central, Europe). Configurations are created by Google based on
   * resource availability.
   * Cloud Spanner billing is based on the instances that exist and their
   * sizes. After an instance exists, there are no additional
   * per-database or per-operation charges for use of the instance
   * (though there may be additional network bandwidth charges).
   * Instances offer isolation: problems with databases in one instance
   * will not affect other instances. However, within an instance
   * databases can affect each other. For example, if one database in an
   * instance receives a lot of requests and consumes most of the
   * instance resources, fewer resources are available for other
   * databases in that instance, and their performance may suffer.
   * </pre>
   */
  public static final class InstanceAdminBlockingStub extends io.grpc.stub.AbstractStub<InstanceAdminBlockingStub> {
    private InstanceAdminBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceAdminBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceAdminBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceAdminBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the supported instance configurations for a given project.
     * </pre>
     */
    public com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse listInstanceConfigs(com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSTANCE_CONFIGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a particular instance configuration.
     * </pre>
     */
    public com.google.spanner.admin.instance.v1.InstanceConfig getInstanceConfig(com.google.spanner.admin.instance.v1.GetInstanceConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INSTANCE_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all instances in the given project.
     * </pre>
     */
    public com.google.spanner.admin.instance.v1.ListInstancesResponse listInstances(com.google.spanner.admin.instance.v1.ListInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSTANCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a particular instance.
     * </pre>
     */
    public com.google.spanner.admin.instance.v1.Instance getInstance(com.google.spanner.admin.instance.v1.GetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance and begins preparing it to begin serving. The
     * returned [long-running operation][google.longrunning.Operation]
     * can be used to track the progress of preparing the new
     * instance. The instance name is assigned by the caller. If the
     * named instance already exists, `CreateInstance` returns
     * `ALREADY_EXISTS`.
     * Immediately upon completion of this request:
     *   * The instance is readable via the API, with all requested attributes
     *     but no allocated resources. Its state is `CREATING`.
     * Until completion of the returned operation:
     *   * Cancelling the operation renders the instance immediately unreadable
     *     via the API.
     *   * The instance can be deleted.
     *   * All other attempts to modify the instance are rejected.
     * Upon completion of the returned operation:
     *   * Billing for all successfully-allocated resources begins (some types
     *     may have lower than the requested levels).
     *   * Databases can be created in the instance.
     *   * The instance's allocated resource levels are readable via the API.
     *   * The instance's state becomes `READY`.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track creation of the instance.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * </pre>
     */
    public com.google.longrunning.Operation createInstance(com.google.spanner.admin.instance.v1.CreateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an instance, and begins allocating or releasing resources
     * as requested. The returned [long-running
     * operation][google.longrunning.Operation] can be used to track the
     * progress of updating the instance. If the named instance does not
     * exist, returns `NOT_FOUND`.
     * Immediately upon completion of this request:
     *   * For resource types for which a decrease in the instance's allocation
     *     has been requested, billing is based on the newly-requested level.
     * Until completion of the returned operation:
     *   * Cancelling the operation sets its metadata's
     *     [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
     *     restoring resources to their pre-request values. The operation
     *     is guaranteed to succeed at undoing all resource changes,
     *     after which point it terminates with a `CANCELLED` status.
     *   * All other attempts to modify the instance are rejected.
     *   * Reading the instance via the API continues to give the pre-request
     *     resource levels.
     * Upon completion of the returned operation:
     *   * Billing begins for all successfully-allocated resources (some types
     *     may have lower than the requested levels).
     *   * All newly-reserved resources are available for serving the instance's
     *     tables.
     *   * The instance's new resource levels are readable via the API.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track the instance modification.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * Authorization requires `spanner.instances.update` permission on
     * resource [name][google.spanner.admin.instance.v1.Instance.name].
     * </pre>
     */
    public com.google.longrunning.Operation updateInstance(com.google.spanner.admin.instance.v1.UpdateInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an instance.
     * Immediately upon completion of the request:
     *   * Billing ceases for all of the instance's reserved resources.
     * Soon afterward:
     *   * The instance and *all of its databases* immediately and
     *     irrevocably disappear from the API. All data in the databases
     *     is permanently deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteInstance(com.google.spanner.admin.instance.v1.DeleteInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the access control policy on an instance resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.instances.setIamPolicy` on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the access control policy for an instance resource. Returns an empty
     * policy if an instance exists but does not have a policy set.
     * Authorization requires `spanner.instances.getIamPolicy` on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified instance resource.
     * Attempting this RPC on a non-existent Cloud Spanner instance resource will
     * result in a NOT_FOUND error if the user has `spanner.instances.list`
     * permission on the containing Google Cloud Project. Otherwise returns an
     * empty set of permissions.
     * </pre>
     */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST_IAM_PERMISSIONS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Spanner Instance Admin API
   * The Cloud Spanner Instance Admin API can be used to create, delete,
   * modify and list instances. Instances are dedicated Cloud Spanner serving
   * and storage resources to be used by Cloud Spanner databases.
   * Each instance has a "configuration", which dictates where the
   * serving resources for the Cloud Spanner instance are located (e.g.,
   * US-central, Europe). Configurations are created by Google based on
   * resource availability.
   * Cloud Spanner billing is based on the instances that exist and their
   * sizes. After an instance exists, there are no additional
   * per-database or per-operation charges for use of the instance
   * (though there may be additional network bandwidth charges).
   * Instances offer isolation: problems with databases in one instance
   * will not affect other instances. However, within an instance
   * databases can affect each other. For example, if one database in an
   * instance receives a lot of requests and consumes most of the
   * instance resources, fewer resources are available for other
   * databases in that instance, and their performance may suffer.
   * </pre>
   */
  public static final class InstanceAdminFutureStub extends io.grpc.stub.AbstractStub<InstanceAdminFutureStub> {
    private InstanceAdminFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceAdminFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceAdminFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceAdminFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the supported instance configurations for a given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse> listInstanceConfigs(
        com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCE_CONFIGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a particular instance configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.instance.v1.InstanceConfig> getInstanceConfig(
        com.google.spanner.admin.instance.v1.GetInstanceConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all instances in the given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.instance.v1.ListInstancesResponse> listInstances(
        com.google.spanner.admin.instance.v1.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a particular instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.instance.v1.Instance> getInstance(
        com.google.spanner.admin.instance.v1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an instance and begins preparing it to begin serving. The
     * returned [long-running operation][google.longrunning.Operation]
     * can be used to track the progress of preparing the new
     * instance. The instance name is assigned by the caller. If the
     * named instance already exists, `CreateInstance` returns
     * `ALREADY_EXISTS`.
     * Immediately upon completion of this request:
     *   * The instance is readable via the API, with all requested attributes
     *     but no allocated resources. Its state is `CREATING`.
     * Until completion of the returned operation:
     *   * Cancelling the operation renders the instance immediately unreadable
     *     via the API.
     *   * The instance can be deleted.
     *   * All other attempts to modify the instance are rejected.
     * Upon completion of the returned operation:
     *   * Billing for all successfully-allocated resources begins (some types
     *     may have lower than the requested levels).
     *   * Databases can be created in the instance.
     *   * The instance's allocated resource levels are readable via the API.
     *   * The instance's state becomes `READY`.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track creation of the instance.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createInstance(
        com.google.spanner.admin.instance.v1.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an instance, and begins allocating or releasing resources
     * as requested. The returned [long-running
     * operation][google.longrunning.Operation] can be used to track the
     * progress of updating the instance. If the named instance does not
     * exist, returns `NOT_FOUND`.
     * Immediately upon completion of this request:
     *   * For resource types for which a decrease in the instance's allocation
     *     has been requested, billing is based on the newly-requested level.
     * Until completion of the returned operation:
     *   * Cancelling the operation sets its metadata's
     *     [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
     *     restoring resources to their pre-request values. The operation
     *     is guaranteed to succeed at undoing all resource changes,
     *     after which point it terminates with a `CANCELLED` status.
     *   * All other attempts to modify the instance are rejected.
     *   * Reading the instance via the API continues to give the pre-request
     *     resource levels.
     * Upon completion of the returned operation:
     *   * Billing begins for all successfully-allocated resources (some types
     *     may have lower than the requested levels).
     *   * All newly-reserved resources are available for serving the instance's
     *     tables.
     *   * The instance's new resource levels are readable via the API.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track the instance modification.  The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata].
     * The [response][google.longrunning.Operation.response] field type is
     * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
     * Authorization requires `spanner.instances.update` permission on
     * resource [name][google.spanner.admin.instance.v1.Instance.name].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateInstance(
        com.google.spanner.admin.instance.v1.UpdateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an instance.
     * Immediately upon completion of the request:
     *   * Billing ceases for all of the instance's reserved resources.
     * Soon afterward:
     *   * The instance and *all of its databases* immediately and
     *     irrevocably disappear from the API. All data in the databases
     *     is permanently deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInstance(
        com.google.spanner.admin.instance.v1.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the access control policy on an instance resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.instances.setIamPolicy` on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the access control policy for an instance resource. Returns an empty
     * policy if an instance exists but does not have a policy set.
     * Authorization requires `spanner.instances.getIamPolicy` on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified instance resource.
     * Attempting this RPC on a non-existent Cloud Spanner instance resource will
     * result in a NOT_FOUND error if the user has `spanner.instances.list`
     * permission on the containing Google Cloud Project. Otherwise returns an
     * empty set of permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.TestIamPermissionsResponse> testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCE_CONFIGS = 0;
  private static final int METHODID_GET_INSTANCE_CONFIG = 1;
  private static final int METHODID_LIST_INSTANCES = 2;
  private static final int METHODID_GET_INSTANCE = 3;
  private static final int METHODID_CREATE_INSTANCE = 4;
  private static final int METHODID_UPDATE_INSTANCE = 5;
  private static final int METHODID_DELETE_INSTANCE = 6;
  private static final int METHODID_SET_IAM_POLICY = 7;
  private static final int METHODID_GET_IAM_POLICY = 8;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceAdminImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceAdminImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCE_CONFIGS:
          serviceImpl.listInstanceConfigs((com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse>) responseObserver);
          break;
        case METHODID_GET_INSTANCE_CONFIG:
          serviceImpl.getInstanceConfig((com.google.spanner.admin.instance.v1.GetInstanceConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.InstanceConfig>) responseObserver);
          break;
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((com.google.spanner.admin.instance.v1.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.ListInstancesResponse>) responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance((com.google.spanner.admin.instance.v1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.instance.v1.Instance>) responseObserver);
          break;
        case METHODID_CREATE_INSTANCE:
          serviceImpl.createInstance((com.google.spanner.admin.instance.v1.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_INSTANCE:
          serviceImpl.updateInstance((com.google.spanner.admin.instance.v1.UpdateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance((com.google.spanner.admin.instance.v1.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SET_IAM_POLICY:
          serviceImpl.setIamPolicy((com.google.iam.v1.SetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_GET_IAM_POLICY:
          serviceImpl.getIamPolicy((com.google.iam.v1.GetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_TEST_IAM_PERMISSIONS:
          serviceImpl.testIamPermissions((com.google.iam.v1.TestIamPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>) responseObserver);
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

  private static final class InstanceAdminDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.spanner.admin.instance.v1.SpannerInstanceAdminProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InstanceAdminGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceAdminDescriptorSupplier())
              .addMethod(METHOD_LIST_INSTANCE_CONFIGS)
              .addMethod(METHOD_GET_INSTANCE_CONFIG)
              .addMethod(METHOD_LIST_INSTANCES)
              .addMethod(METHOD_GET_INSTANCE)
              .addMethod(METHOD_CREATE_INSTANCE)
              .addMethod(METHOD_UPDATE_INSTANCE)
              .addMethod(METHOD_DELETE_INSTANCE)
              .addMethod(METHOD_SET_IAM_POLICY)
              .addMethod(METHOD_GET_IAM_POLICY)
              .addMethod(METHOD_TEST_IAM_PERMISSIONS)
              .build();
        }
      }
    }
    return result;
  }
}
