package com.google.cloud.dialogflow.v2beta1;

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
 * Manages agent versions.
 * Standard methods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/version.proto")
public final class VersionsGrpc {

  private VersionsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Versions";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ListVersionsRequest,
      com.google.cloud.dialogflow.v2beta1.ListVersionsResponse> METHOD_LIST_VERSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Versions", "ListVersions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListVersionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListVersionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetVersionRequest,
      com.google.cloud.dialogflow.v2beta1.Version> METHOD_GET_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Versions", "GetVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Version.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.CreateVersionRequest,
      com.google.cloud.dialogflow.v2beta1.Version> METHOD_CREATE_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Versions", "CreateVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.CreateVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Version.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest,
      com.google.cloud.dialogflow.v2beta1.Version> METHOD_UPDATE_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Versions", "UpdateVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Version.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest,
      com.google.protobuf.Empty> METHOD_DELETE_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Versions", "DeleteVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

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
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VersionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VersionsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages agent versions.
   * Standard methods.
   * </pre>
   */
  public static abstract class VersionsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of all versions of the specified agent.
     * </pre>
     */
    public void listVersions(com.google.cloud.dialogflow.v2beta1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_VERSIONS, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent version.
     * </pre>
     */
    public void getVersion(com.google.cloud.dialogflow.v2beta1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent version.
     * The new version points to the agent instance in the "default" runtime.
     * </pre>
     */
    public void createVersion(com.google.cloud.dialogflow.v2beta1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent version.
     * Note that this method does not allow you to update the state of the agent
     * the given version points to. It allows you to update only mutable
     * properties of the version resource.
     * </pre>
     */
    public void updateVersion(com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent version.
     * </pre>
     */
    public void deleteVersion(com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VERSION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_VERSIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ListVersionsRequest,
                com.google.cloud.dialogflow.v2beta1.ListVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            METHOD_GET_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetVersionRequest,
                com.google.cloud.dialogflow.v2beta1.Version>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            METHOD_CREATE_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.CreateVersionRequest,
                com.google.cloud.dialogflow.v2beta1.Version>(
                  this, METHODID_CREATE_VERSION)))
          .addMethod(
            METHOD_UPDATE_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest,
                com.google.cloud.dialogflow.v2beta1.Version>(
                  this, METHODID_UPDATE_VERSION)))
          .addMethod(
            METHOD_DELETE_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VERSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages agent versions.
   * Standard methods.
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
     * Returns the list of all versions of the specified agent.
     * </pre>
     */
    public void listVersions(com.google.cloud.dialogflow.v2beta1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_VERSIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent version.
     * </pre>
     */
    public void getVersion(com.google.cloud.dialogflow.v2beta1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent version.
     * The new version points to the agent instance in the "default" runtime.
     * </pre>
     */
    public void createVersion(com.google.cloud.dialogflow.v2beta1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent version.
     * Note that this method does not allow you to update the state of the agent
     * the given version points to. It allows you to update only mutable
     * properties of the version resource.
     * </pre>
     */
    public void updateVersion(com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent version.
     * </pre>
     */
    public void deleteVersion(com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VERSION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages agent versions.
   * Standard methods.
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
     * Returns the list of all versions of the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListVersionsResponse listVersions(com.google.cloud.dialogflow.v2beta1.ListVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_VERSIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent version.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Version getVersion(com.google.cloud.dialogflow.v2beta1.GetVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an agent version.
     * The new version points to the agent instance in the "default" runtime.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Version createVersion(com.google.cloud.dialogflow.v2beta1.CreateVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified agent version.
     * Note that this method does not allow you to update the state of the agent
     * the given version points to. It allows you to update only mutable
     * properties of the version resource.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Version updateVersion(com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified agent version.
     * </pre>
     */
    public com.google.protobuf.Empty deleteVersion(com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VERSION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages agent versions.
   * Standard methods.
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
     * Returns the list of all versions of the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.ListVersionsResponse> listVersions(
        com.google.cloud.dialogflow.v2beta1.ListVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_VERSIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Version> getVersion(
        com.google.cloud.dialogflow.v2beta1.GetVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an agent version.
     * The new version points to the agent instance in the "default" runtime.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Version> createVersion(
        com.google.cloud.dialogflow.v2beta1.CreateVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified agent version.
     * Note that this method does not allow you to update the state of the agent
     * the given version points to. It allows you to update only mutable
     * properties of the version resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Version> updateVersion(
        com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified agent version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVersion(
        com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VERSION, getCallOptions()), request);
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
          serviceImpl.listVersions((com.google.cloud.dialogflow.v2beta1.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListVersionsResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((com.google.cloud.dialogflow.v2beta1.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version>) responseObserver);
          break;
        case METHODID_CREATE_VERSION:
          serviceImpl.createVersion((com.google.cloud.dialogflow.v2beta1.CreateVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version>) responseObserver);
          break;
        case METHODID_UPDATE_VERSION:
          serviceImpl.updateVersion((com.google.cloud.dialogflow.v2beta1.UpdateVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Version>) responseObserver);
          break;
        case METHODID_DELETE_VERSION:
          serviceImpl.deleteVersion((com.google.cloud.dialogflow.v2beta1.DeleteVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static final class VersionsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.VersionProto.getDescriptor();
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
              .setSchemaDescriptor(new VersionsDescriptorSupplier())
              .addMethod(METHOD_LIST_VERSIONS)
              .addMethod(METHOD_GET_VERSION)
              .addMethod(METHOD_CREATE_VERSION)
              .addMethod(METHOD_UPDATE_VERSION)
              .addMethod(METHOD_DELETE_VERSION)
              .build();
        }
      }
    }
    return result;
  }
}
