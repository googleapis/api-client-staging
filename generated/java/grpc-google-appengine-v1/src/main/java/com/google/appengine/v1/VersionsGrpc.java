package com.google.appengine.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Manages versions of a service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/appengine/v1/appengine.proto")
public final class VersionsGrpc {

  private VersionsGrpc() {}

  public static final String SERVICE_NAME = "google.appengine.v1.Versions";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListVersionsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.ListVersionsRequest,
      com.google.appengine.v1.ListVersionsResponse> METHOD_LIST_VERSIONS = getListVersionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.ListVersionsRequest,
      com.google.appengine.v1.ListVersionsResponse> getListVersionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.ListVersionsRequest,
      com.google.appengine.v1.ListVersionsResponse> getListVersionsMethod() {
    return getListVersionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.ListVersionsRequest,
      com.google.appengine.v1.ListVersionsResponse> getListVersionsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.ListVersionsRequest, com.google.appengine.v1.ListVersionsResponse> getListVersionsMethod;
    if ((getListVersionsMethod = VersionsGrpc.getListVersionsMethod) == null) {
      synchronized (VersionsGrpc.class) {
        if ((getListVersionsMethod = VersionsGrpc.getListVersionsMethod) == null) {
          VersionsGrpc.getListVersionsMethod = getListVersionsMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.ListVersionsRequest, com.google.appengine.v1.ListVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Versions", "ListVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.ListVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.ListVersionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VersionsMethodDescriptorSupplier("ListVersions"))
                  .build();
          }
        }
     }
     return getListVersionsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVersionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.GetVersionRequest,
      com.google.appengine.v1.Version> METHOD_GET_VERSION = getGetVersionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.GetVersionRequest,
      com.google.appengine.v1.Version> getGetVersionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.GetVersionRequest,
      com.google.appengine.v1.Version> getGetVersionMethod() {
    return getGetVersionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.GetVersionRequest,
      com.google.appengine.v1.Version> getGetVersionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.GetVersionRequest, com.google.appengine.v1.Version> getGetVersionMethod;
    if ((getGetVersionMethod = VersionsGrpc.getGetVersionMethod) == null) {
      synchronized (VersionsGrpc.class) {
        if ((getGetVersionMethod = VersionsGrpc.getGetVersionMethod) == null) {
          VersionsGrpc.getGetVersionMethod = getGetVersionMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.GetVersionRequest, com.google.appengine.v1.Version>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Versions", "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.Version.getDefaultInstance()))
                  .setSchemaDescriptor(new VersionsMethodDescriptorSupplier("GetVersion"))
                  .build();
          }
        }
     }
     return getGetVersionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateVersionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.CreateVersionRequest,
      com.google.longrunning.Operation> METHOD_CREATE_VERSION = getCreateVersionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.CreateVersionRequest,
      com.google.longrunning.Operation> getCreateVersionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.CreateVersionRequest,
      com.google.longrunning.Operation> getCreateVersionMethod() {
    return getCreateVersionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.CreateVersionRequest,
      com.google.longrunning.Operation> getCreateVersionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.CreateVersionRequest, com.google.longrunning.Operation> getCreateVersionMethod;
    if ((getCreateVersionMethod = VersionsGrpc.getCreateVersionMethod) == null) {
      synchronized (VersionsGrpc.class) {
        if ((getCreateVersionMethod = VersionsGrpc.getCreateVersionMethod) == null) {
          VersionsGrpc.getCreateVersionMethod = getCreateVersionMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.CreateVersionRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Versions", "CreateVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.CreateVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VersionsMethodDescriptorSupplier("CreateVersion"))
                  .build();
          }
        }
     }
     return getCreateVersionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateVersionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateVersionRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_VERSION = getUpdateVersionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateVersionRequest,
      com.google.longrunning.Operation> getUpdateVersionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateVersionRequest,
      com.google.longrunning.Operation> getUpdateVersionMethod() {
    return getUpdateVersionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateVersionRequest,
      com.google.longrunning.Operation> getUpdateVersionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateVersionRequest, com.google.longrunning.Operation> getUpdateVersionMethod;
    if ((getUpdateVersionMethod = VersionsGrpc.getUpdateVersionMethod) == null) {
      synchronized (VersionsGrpc.class) {
        if ((getUpdateVersionMethod = VersionsGrpc.getUpdateVersionMethod) == null) {
          VersionsGrpc.getUpdateVersionMethod = getUpdateVersionMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.UpdateVersionRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Versions", "UpdateVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.UpdateVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VersionsMethodDescriptorSupplier("UpdateVersion"))
                  .build();
          }
        }
     }
     return getUpdateVersionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteVersionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteVersionRequest,
      com.google.longrunning.Operation> METHOD_DELETE_VERSION = getDeleteVersionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteVersionRequest,
      com.google.longrunning.Operation> getDeleteVersionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteVersionRequest,
      com.google.longrunning.Operation> getDeleteVersionMethod() {
    return getDeleteVersionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteVersionRequest,
      com.google.longrunning.Operation> getDeleteVersionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteVersionRequest, com.google.longrunning.Operation> getDeleteVersionMethod;
    if ((getDeleteVersionMethod = VersionsGrpc.getDeleteVersionMethod) == null) {
      synchronized (VersionsGrpc.class) {
        if ((getDeleteVersionMethod = VersionsGrpc.getDeleteVersionMethod) == null) {
          VersionsGrpc.getDeleteVersionMethod = getDeleteVersionMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.DeleteVersionRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Versions", "DeleteVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.DeleteVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new VersionsMethodDescriptorSupplier("DeleteVersion"))
                  .build();
          }
        }
     }
     return getDeleteVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VersionsStub newStub(io.grpc.Channel channel) {
    return new VersionsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VersionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VersionsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VersionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VersionsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages versions of a service.
   * </pre>
   */
  public static abstract class VersionsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the versions of a service.
     * </pre>
     */
    public void listVersions(com.google.appengine.v1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVersionsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets the specified Version resource.
     * By default, only a `BASIC_VIEW` will be returned.
     * Specify the `FULL_VIEW` parameter to get the full resource.
     * </pre>
     */
    public void getVersion(com.google.appengine.v1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVersionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deploys code and resource files to a new version.
     * </pre>
     */
    public void createVersion(com.google.appengine.v1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVersionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Version resource.
     * You can specify the following fields depending on the App Engine
     * environment and type of scaling that the version resource uses:
     * * [`serving_status`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):
     *   For Version resources that use basic scaling, manual scaling, or run in
     *   the App Engine flexible environment.
     * * [`instance_class`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):
     *   For Version resources that run in the App Engine standard environment.
     * * [`automatic_scaling.min_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * * [`automatic_scaling.max_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * </pre>
     */
    public void updateVersion(com.google.appengine.v1.UpdateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVersionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing Version resource.
     * </pre>
     */
    public void deleteVersion(com.google.appengine.v1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVersionMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListVersionsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.ListVersionsRequest,
                com.google.appengine.v1.ListVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            getGetVersionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.GetVersionRequest,
                com.google.appengine.v1.Version>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            getCreateVersionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.CreateVersionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_VERSION)))
          .addMethod(
            getUpdateVersionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.UpdateVersionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_VERSION)))
          .addMethod(
            getDeleteVersionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.DeleteVersionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_VERSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages versions of a service.
   * </pre>
   */
  public static final class VersionsStub extends io.grpc.stub.AbstractStub<VersionsStub> {
    private VersionsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the versions of a service.
     * </pre>
     */
    public void listVersions(com.google.appengine.v1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVersionsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the specified Version resource.
     * By default, only a `BASIC_VIEW` will be returned.
     * Specify the `FULL_VIEW` parameter to get the full resource.
     * </pre>
     */
    public void getVersion(com.google.appengine.v1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVersionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deploys code and resource files to a new version.
     * </pre>
     */
    public void createVersion(com.google.appengine.v1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVersionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified Version resource.
     * You can specify the following fields depending on the App Engine
     * environment and type of scaling that the version resource uses:
     * * [`serving_status`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):
     *   For Version resources that use basic scaling, manual scaling, or run in
     *   the App Engine flexible environment.
     * * [`instance_class`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):
     *   For Version resources that run in the App Engine standard environment.
     * * [`automatic_scaling.min_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * * [`automatic_scaling.max_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * </pre>
     */
    public void updateVersion(com.google.appengine.v1.UpdateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVersionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing Version resource.
     * </pre>
     */
    public void deleteVersion(com.google.appengine.v1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVersionMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages versions of a service.
   * </pre>
   */
  public static final class VersionsBlockingStub extends io.grpc.stub.AbstractStub<VersionsBlockingStub> {
    private VersionsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the versions of a service.
     * </pre>
     */
    public com.google.appengine.v1.ListVersionsResponse listVersions(com.google.appengine.v1.ListVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVersionsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the specified Version resource.
     * By default, only a `BASIC_VIEW` will be returned.
     * Specify the `FULL_VIEW` parameter to get the full resource.
     * </pre>
     */
    public com.google.appengine.v1.Version getVersion(com.google.appengine.v1.GetVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVersionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deploys code and resource files to a new version.
     * </pre>
     */
    public com.google.longrunning.Operation createVersion(com.google.appengine.v1.CreateVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVersionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified Version resource.
     * You can specify the following fields depending on the App Engine
     * environment and type of scaling that the version resource uses:
     * * [`serving_status`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):
     *   For Version resources that use basic scaling, manual scaling, or run in
     *   the App Engine flexible environment.
     * * [`instance_class`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):
     *   For Version resources that run in the App Engine standard environment.
     * * [`automatic_scaling.min_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * * [`automatic_scaling.max_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * </pre>
     */
    public com.google.longrunning.Operation updateVersion(com.google.appengine.v1.UpdateVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVersionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing Version resource.
     * </pre>
     */
    public com.google.longrunning.Operation deleteVersion(com.google.appengine.v1.DeleteVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVersionMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages versions of a service.
   * </pre>
   */
  public static final class VersionsFutureStub extends io.grpc.stub.AbstractStub<VersionsFutureStub> {
    private VersionsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VersionsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VersionsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VersionsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the versions of a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.ListVersionsResponse> listVersions(
        com.google.appengine.v1.ListVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVersionsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the specified Version resource.
     * By default, only a `BASIC_VIEW` will be returned.
     * Specify the `FULL_VIEW` parameter to get the full resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.Version> getVersion(
        com.google.appengine.v1.GetVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVersionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deploys code and resource files to a new version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createVersion(
        com.google.appengine.v1.CreateVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVersionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified Version resource.
     * You can specify the following fields depending on the App Engine
     * environment and type of scaling that the version resource uses:
     * * [`serving_status`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):
     *   For Version resources that use basic scaling, manual scaling, or run in
     *   the App Engine flexible environment.
     * * [`instance_class`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):
     *   For Version resources that run in the App Engine standard environment.
     * * [`automatic_scaling.min_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * * [`automatic_scaling.max_idle_instances`](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):
     *   For Version resources that use automatic scaling and run in the App
     *   Engine standard environment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateVersion(
        com.google.appengine.v1.UpdateVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVersionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing Version resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteVersion(
        com.google.appengine.v1.DeleteVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVersionMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_VERSIONS = 0;
  private static final int METHODID_GET_VERSION = 1;
  private static final int METHODID_CREATE_VERSION = 2;
  private static final int METHODID_UPDATE_VERSION = 3;
  private static final int METHODID_DELETE_VERSION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VersionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VersionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((com.google.appengine.v1.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.ListVersionsResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((com.google.appengine.v1.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.Version>) responseObserver);
          break;
        case METHODID_CREATE_VERSION:
          serviceImpl.createVersion((com.google.appengine.v1.CreateVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_VERSION:
          serviceImpl.updateVersion((com.google.appengine.v1.UpdateVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_VERSION:
          serviceImpl.deleteVersion((com.google.appengine.v1.DeleteVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static abstract class VersionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VersionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.appengine.v1.AppengineProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Versions");
    }
  }

  private static final class VersionsFileDescriptorSupplier
      extends VersionsBaseDescriptorSupplier {
    VersionsFileDescriptorSupplier() {}
  }

  private static final class VersionsMethodDescriptorSupplier
      extends VersionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VersionsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VersionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VersionsFileDescriptorSupplier())
              .addMethod(getListVersionsMethodHelper())
              .addMethod(getGetVersionMethodHelper())
              .addMethod(getCreateVersionMethodHelper())
              .addMethod(getUpdateVersionMethodHelper())
              .addMethod(getDeleteVersionMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
