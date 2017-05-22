package com.google.spanner.admin.database.v1;

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
 * Cloud Spanner Database Admin API
 * The Cloud Spanner Database Admin API can be used to create, drop, and
 * list databases. It also enables updating the schema of pre-existing
 * databases.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/spanner/admin/database/v1/spanner_database_admin.proto")
public final class DatabaseAdminGrpc {

  private DatabaseAdminGrpc() {}

  public static final String SERVICE_NAME = "google.spanner.admin.database.v1.DatabaseAdmin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.ListDatabasesRequest,
      com.google.spanner.admin.database.v1.ListDatabasesResponse> METHOD_LIST_DATABASES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "ListDatabases"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.ListDatabasesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.ListDatabasesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.CreateDatabaseRequest,
      com.google.longrunning.Operation> METHOD_CREATE_DATABASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "CreateDatabase"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.CreateDatabaseRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.GetDatabaseRequest,
      com.google.spanner.admin.database.v1.Database> METHOD_GET_DATABASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "GetDatabase"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.GetDatabaseRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.Database.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_DATABASE_DDL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "UpdateDatabaseDdl"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.DropDatabaseRequest,
      com.google.protobuf.Empty> METHOD_DROP_DATABASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "DropDatabase"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.DropDatabaseRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse> METHOD_GET_DATABASE_DDL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "GetDatabaseDdl"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.GetDatabaseDdlRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_SET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "SetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_GET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "GetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.TestIamPermissionsRequest,
      com.google.iam.v1.TestIamPermissionsResponse> METHOD_TEST_IAM_PERMISSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.admin.database.v1.DatabaseAdmin", "TestIamPermissions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseAdminStub newStub(io.grpc.Channel channel) {
    return new DatabaseAdminStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseAdminBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatabaseAdminBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseAdminFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatabaseAdminFutureStub(channel);
  }

  /**
   * <pre>
   * Cloud Spanner Database Admin API
   * The Cloud Spanner Database Admin API can be used to create, drop, and
   * list databases. It also enables updating the schema of pre-existing
   * databases.
   * </pre>
   */
  public static abstract class DatabaseAdminImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists Cloud Spanner databases.
     * </pre>
     */
    public void listDatabases(com.google.spanner.admin.database.v1.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.ListDatabasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DATABASES, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Cloud Spanner database and starts to prepare it for serving.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track preparation of the database. The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
     * [response][google.longrunning.Operation.response] field type is
     * [Database][google.spanner.admin.database.v1.Database], if successful.
     * </pre>
     */
    public void createDatabase(com.google.spanner.admin.database.v1.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DATABASE, responseObserver);
    }

    /**
     * <pre>
     * Gets the state of a Cloud Spanner database.
     * </pre>
     */
    public void getDatabase(com.google.spanner.admin.database.v1.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.Database> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATABASE, responseObserver);
    }

    /**
     * <pre>
     * Updates the schema of a Cloud Spanner database by
     * creating/altering/dropping tables, columns, indexes, etc. The returned
     * [long-running operation][google.longrunning.Operation] will have a name of
     * the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
     * track execution of the schema change(s). The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
     * </pre>
     */
    public void updateDatabaseDdl(com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DATABASE_DDL, responseObserver);
    }

    /**
     * <pre>
     * Drops (aka deletes) a Cloud Spanner database.
     * </pre>
     */
    public void dropDatabase(com.google.spanner.admin.database.v1.DropDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DROP_DATABASE, responseObserver);
    }

    /**
     * <pre>
     * Returns the schema of a Cloud Spanner database as a list of formatted
     * DDL statements. This method does not show pending schema updates, those may
     * be queried using the [Operations][google.longrunning.Operations] API.
     * </pre>
     */
    public void getDatabaseDdl(com.google.spanner.admin.database.v1.GetDatabaseDdlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.GetDatabaseDdlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATABASE_DDL, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on a database resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.databases.setIamPolicy` permission on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Gets the access control policy for a database resource. Returns an empty
     * policy if a database exists but does not have a policy set.
     * Authorization requires `spanner.databases.getIamPolicy` permission on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified database resource.
     * Attempting this RPC on a non-existent Cloud Spanner database will result in
     * a NOT_FOUND error if the user has `spanner.databases.list` permission on
     * the containing Cloud Spanner instance. Otherwise returns an empty set of
     * permissions.
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST_IAM_PERMISSIONS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_DATABASES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.ListDatabasesRequest,
                com.google.spanner.admin.database.v1.ListDatabasesResponse>(
                  this, METHODID_LIST_DATABASES)))
          .addMethod(
            METHOD_CREATE_DATABASE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.CreateDatabaseRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_DATABASE)))
          .addMethod(
            METHOD_GET_DATABASE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.GetDatabaseRequest,
                com.google.spanner.admin.database.v1.Database>(
                  this, METHODID_GET_DATABASE)))
          .addMethod(
            METHOD_UPDATE_DATABASE_DDL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_DATABASE_DDL)))
          .addMethod(
            METHOD_DROP_DATABASE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.DropDatabaseRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DROP_DATABASE)))
          .addMethod(
            METHOD_GET_DATABASE_DDL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,
                com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>(
                  this, METHODID_GET_DATABASE_DDL)))
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
   * Cloud Spanner Database Admin API
   * The Cloud Spanner Database Admin API can be used to create, drop, and
   * list databases. It also enables updating the schema of pre-existing
   * databases.
   * </pre>
   */
  public static final class DatabaseAdminStub extends io.grpc.stub.AbstractStub<DatabaseAdminStub> {
    private DatabaseAdminStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseAdminStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseAdminStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseAdminStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists Cloud Spanner databases.
     * </pre>
     */
    public void listDatabases(com.google.spanner.admin.database.v1.ListDatabasesRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.ListDatabasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DATABASES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Cloud Spanner database and starts to prepare it for serving.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track preparation of the database. The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
     * [response][google.longrunning.Operation.response] field type is
     * [Database][google.spanner.admin.database.v1.Database], if successful.
     * </pre>
     */
    public void createDatabase(com.google.spanner.admin.database.v1.CreateDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DATABASE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the state of a Cloud Spanner database.
     * </pre>
     */
    public void getDatabase(com.google.spanner.admin.database.v1.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.Database> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the schema of a Cloud Spanner database by
     * creating/altering/dropping tables, columns, indexes, etc. The returned
     * [long-running operation][google.longrunning.Operation] will have a name of
     * the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
     * track execution of the schema change(s). The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
     * </pre>
     */
    public void updateDatabaseDdl(com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DATABASE_DDL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Drops (aka deletes) a Cloud Spanner database.
     * </pre>
     */
    public void dropDatabase(com.google.spanner.admin.database.v1.DropDatabaseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DROP_DATABASE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the schema of a Cloud Spanner database as a list of formatted
     * DDL statements. This method does not show pending schema updates, those may
     * be queried using the [Operations][google.longrunning.Operations] API.
     * </pre>
     */
    public void getDatabaseDdl(com.google.spanner.admin.database.v1.GetDatabaseDdlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.GetDatabaseDdlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_DDL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on a database resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.databases.setIamPolicy` permission on
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
     * Gets the access control policy for a database resource. Returns an empty
     * policy if a database exists but does not have a policy set.
     * Authorization requires `spanner.databases.getIamPolicy` permission on
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
     * Returns permissions that the caller has on the specified database resource.
     * Attempting this RPC on a non-existent Cloud Spanner database will result in
     * a NOT_FOUND error if the user has `spanner.databases.list` permission on
     * the containing Cloud Spanner instance. Otherwise returns an empty set of
     * permissions.
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
   * Cloud Spanner Database Admin API
   * The Cloud Spanner Database Admin API can be used to create, drop, and
   * list databases. It also enables updating the schema of pre-existing
   * databases.
   * </pre>
   */
  public static final class DatabaseAdminBlockingStub extends io.grpc.stub.AbstractStub<DatabaseAdminBlockingStub> {
    private DatabaseAdminBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseAdminBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseAdminBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseAdminBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists Cloud Spanner databases.
     * </pre>
     */
    public com.google.spanner.admin.database.v1.ListDatabasesResponse listDatabases(com.google.spanner.admin.database.v1.ListDatabasesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DATABASES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Cloud Spanner database and starts to prepare it for serving.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track preparation of the database. The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
     * [response][google.longrunning.Operation.response] field type is
     * [Database][google.spanner.admin.database.v1.Database], if successful.
     * </pre>
     */
    public com.google.longrunning.Operation createDatabase(com.google.spanner.admin.database.v1.CreateDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DATABASE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the state of a Cloud Spanner database.
     * </pre>
     */
    public com.google.spanner.admin.database.v1.Database getDatabase(com.google.spanner.admin.database.v1.GetDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATABASE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the schema of a Cloud Spanner database by
     * creating/altering/dropping tables, columns, indexes, etc. The returned
     * [long-running operation][google.longrunning.Operation] will have a name of
     * the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
     * track execution of the schema change(s). The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
     * </pre>
     */
    public com.google.longrunning.Operation updateDatabaseDdl(com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DATABASE_DDL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Drops (aka deletes) a Cloud Spanner database.
     * </pre>
     */
    public com.google.protobuf.Empty dropDatabase(com.google.spanner.admin.database.v1.DropDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DROP_DATABASE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the schema of a Cloud Spanner database as a list of formatted
     * DDL statements. This method does not show pending schema updates, those may
     * be queried using the [Operations][google.longrunning.Operations] API.
     * </pre>
     */
    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDatabaseDdl(com.google.spanner.admin.database.v1.GetDatabaseDdlRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATABASE_DDL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the access control policy on a database resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.databases.setIamPolicy` permission on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the access control policy for a database resource. Returns an empty
     * policy if a database exists but does not have a policy set.
     * Authorization requires `spanner.databases.getIamPolicy` permission on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     * </pre>
     */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns permissions that the caller has on the specified database resource.
     * Attempting this RPC on a non-existent Cloud Spanner database will result in
     * a NOT_FOUND error if the user has `spanner.databases.list` permission on
     * the containing Cloud Spanner instance. Otherwise returns an empty set of
     * permissions.
     * </pre>
     */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST_IAM_PERMISSIONS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Spanner Database Admin API
   * The Cloud Spanner Database Admin API can be used to create, drop, and
   * list databases. It also enables updating the schema of pre-existing
   * databases.
   * </pre>
   */
  public static final class DatabaseAdminFutureStub extends io.grpc.stub.AbstractStub<DatabaseAdminFutureStub> {
    private DatabaseAdminFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatabaseAdminFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseAdminFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatabaseAdminFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists Cloud Spanner databases.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.database.v1.ListDatabasesResponse> listDatabases(
        com.google.spanner.admin.database.v1.ListDatabasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DATABASES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Cloud Spanner database and starts to prepare it for serving.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and
     * can be used to track preparation of the database. The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
     * [response][google.longrunning.Operation.response] field type is
     * [Database][google.spanner.admin.database.v1.Database], if successful.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createDatabase(
        com.google.spanner.admin.database.v1.CreateDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DATABASE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the state of a Cloud Spanner database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.database.v1.Database> getDatabase(
        com.google.spanner.admin.database.v1.GetDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the schema of a Cloud Spanner database by
     * creating/altering/dropping tables, columns, indexes, etc. The returned
     * [long-running operation][google.longrunning.Operation] will have a name of
     * the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
     * track execution of the schema change(s). The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateDatabaseDdl(
        com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DATABASE_DDL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Drops (aka deletes) a Cloud Spanner database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> dropDatabase(
        com.google.spanner.admin.database.v1.DropDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DROP_DATABASE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the schema of a Cloud Spanner database as a list of formatted
     * DDL statements. This method does not show pending schema updates, those may
     * be queried using the [Operations][google.longrunning.Operations] API.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.admin.database.v1.GetDatabaseDdlResponse> getDatabaseDdl(
        com.google.spanner.admin.database.v1.GetDatabaseDdlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATABASE_DDL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the access control policy on a database resource. Replaces any
     * existing policy.
     * Authorization requires `spanner.databases.setIamPolicy` permission on
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
     * Gets the access control policy for a database resource. Returns an empty
     * policy if a database exists but does not have a policy set.
     * Authorization requires `spanner.databases.getIamPolicy` permission on
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
     * Returns permissions that the caller has on the specified database resource.
     * Attempting this RPC on a non-existent Cloud Spanner database will result in
     * a NOT_FOUND error if the user has `spanner.databases.list` permission on
     * the containing Cloud Spanner instance. Otherwise returns an empty set of
     * permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.TestIamPermissionsResponse> testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATABASES = 0;
  private static final int METHODID_CREATE_DATABASE = 1;
  private static final int METHODID_GET_DATABASE = 2;
  private static final int METHODID_UPDATE_DATABASE_DDL = 3;
  private static final int METHODID_DROP_DATABASE = 4;
  private static final int METHODID_GET_DATABASE_DDL = 5;
  private static final int METHODID_SET_IAM_POLICY = 6;
  private static final int METHODID_GET_IAM_POLICY = 7;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabaseAdminImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseAdminImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DATABASES:
          serviceImpl.listDatabases((com.google.spanner.admin.database.v1.ListDatabasesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.ListDatabasesResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATABASE:
          serviceImpl.createDatabase((com.google.spanner.admin.database.v1.CreateDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_DATABASE:
          serviceImpl.getDatabase((com.google.spanner.admin.database.v1.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.Database>) responseObserver);
          break;
        case METHODID_UPDATE_DATABASE_DDL:
          serviceImpl.updateDatabaseDdl((com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DROP_DATABASE:
          serviceImpl.dropDatabase((com.google.spanner.admin.database.v1.DropDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DATABASE_DDL:
          serviceImpl.getDatabaseDdl((com.google.spanner.admin.database.v1.GetDatabaseDdlRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>) responseObserver);
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

  private static final class DatabaseAdminDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DatabaseAdminGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseAdminDescriptorSupplier())
              .addMethod(METHOD_LIST_DATABASES)
              .addMethod(METHOD_CREATE_DATABASE)
              .addMethod(METHOD_GET_DATABASE)
              .addMethod(METHOD_UPDATE_DATABASE_DDL)
              .addMethod(METHOD_DROP_DATABASE)
              .addMethod(METHOD_GET_DATABASE_DDL)
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
