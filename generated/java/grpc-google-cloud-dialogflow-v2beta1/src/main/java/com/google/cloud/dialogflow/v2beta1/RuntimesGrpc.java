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
 * Manages agent runtimes.
 * Standard methods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/runtime.proto")
public final class RuntimesGrpc {

  private RuntimesGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Runtimes";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest,
      com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse> METHOD_LIST_RUNTIMES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "ListRuntimes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest,
      com.google.cloud.dialogflow.v2beta1.Runtime> METHOD_GET_RUNTIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "GetRuntime"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Runtime.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest,
      com.google.cloud.dialogflow.v2beta1.Runtime> METHOD_CREATE_RUNTIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "CreateRuntime"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Runtime.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_RUNTIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "UpdateRuntime"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest,
      com.google.protobuf.Empty> METHOD_DELETE_RUNTIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "DeleteRuntime"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest,
      com.google.cloud.dialogflow.v2beta1.RuntimeHistory> METHOD_GET_RUNTIME_HISTORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Runtimes", "GetRuntimeHistory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.RuntimeHistory.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RuntimesStub newStub(io.grpc.Channel channel) {
    return new RuntimesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RuntimesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RuntimesFutureStub(channel);
  }

  /**
   * <pre>
   * Manages agent runtimes.
   * Standard methods.
   * </pre>
   */
  public static abstract class RuntimesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of all runtimes of the specified agent.
     * </pre>
     */
    public void listRuntimes(com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_RUNTIMES, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent runtime.
     * </pre>
     */
    public void getRuntime(com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RUNTIME, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent runtime.
     * </pre>
     */
    public void createRuntime(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_RUNTIME, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent runtime.
     * This method allows you to deploy new agent versions into the runtime.
     * When a runtime is pointed to a new agent version by setting
     * `runtime.agent_version`, the runtime is temporarily set to the `LOADING`
     * state. During that time, the runtime keeps on serving the previous version
     * of the agent. After the new agent version is done loading, the runtime is
     * set back to the `RUNNING` state.
     * Operation&lt;response: Runtime&gt;
     * </pre>
     */
    public void updateRuntime(com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_RUNTIME, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent runtime.
     * </pre>
     */
    public void deleteRuntime(com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_RUNTIME, responseObserver);
    }

    /**
     * <pre>
     * Gets the history of the specified runtime.
     * </pre>
     */
    public void getRuntimeHistory(com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.RuntimeHistory> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RUNTIME_HISTORY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_RUNTIMES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest,
                com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse>(
                  this, METHODID_LIST_RUNTIMES)))
          .addMethod(
            METHOD_GET_RUNTIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest,
                com.google.cloud.dialogflow.v2beta1.Runtime>(
                  this, METHODID_GET_RUNTIME)))
          .addMethod(
            METHOD_CREATE_RUNTIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest,
                com.google.cloud.dialogflow.v2beta1.Runtime>(
                  this, METHODID_CREATE_RUNTIME)))
          .addMethod(
            METHOD_UPDATE_RUNTIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_RUNTIME)))
          .addMethod(
            METHOD_DELETE_RUNTIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_RUNTIME)))
          .addMethod(
            METHOD_GET_RUNTIME_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest,
                com.google.cloud.dialogflow.v2beta1.RuntimeHistory>(
                  this, METHODID_GET_RUNTIME_HISTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages agent runtimes.
   * Standard methods.
   * </pre>
   */
  public static final class RuntimesStub extends io.grpc.stub.AbstractStub<RuntimesStub> {
    private RuntimesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all runtimes of the specified agent.
     * </pre>
     */
    public void listRuntimes(com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_RUNTIMES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified agent runtime.
     * </pre>
     */
    public void getRuntime(com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RUNTIME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent runtime.
     * </pre>
     */
    public void createRuntime(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_RUNTIME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified agent runtime.
     * This method allows you to deploy new agent versions into the runtime.
     * When a runtime is pointed to a new agent version by setting
     * `runtime.agent_version`, the runtime is temporarily set to the `LOADING`
     * state. During that time, the runtime keeps on serving the previous version
     * of the agent. After the new agent version is done loading, the runtime is
     * set back to the `RUNNING` state.
     * Operation&lt;response: Runtime&gt;
     * </pre>
     */
    public void updateRuntime(com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RUNTIME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified agent runtime.
     * </pre>
     */
    public void deleteRuntime(com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_RUNTIME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the history of the specified runtime.
     * </pre>
     */
    public void getRuntimeHistory(com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.RuntimeHistory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RUNTIME_HISTORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages agent runtimes.
   * Standard methods.
   * </pre>
   */
  public static final class RuntimesBlockingStub extends io.grpc.stub.AbstractStub<RuntimesBlockingStub> {
    private RuntimesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all runtimes of the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse listRuntimes(com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_RUNTIMES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent runtime.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Runtime getRuntime(com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RUNTIME, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an agent runtime.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Runtime createRuntime(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_RUNTIME, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified agent runtime.
     * This method allows you to deploy new agent versions into the runtime.
     * When a runtime is pointed to a new agent version by setting
     * `runtime.agent_version`, the runtime is temporarily set to the `LOADING`
     * state. During that time, the runtime keeps on serving the previous version
     * of the agent. After the new agent version is done loading, the runtime is
     * set back to the `RUNNING` state.
     * Operation&lt;response: Runtime&gt;
     * </pre>
     */
    public com.google.longrunning.Operation updateRuntime(com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_RUNTIME, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified agent runtime.
     * </pre>
     */
    public com.google.protobuf.Empty deleteRuntime(com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_RUNTIME, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the history of the specified runtime.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.RuntimeHistory getRuntimeHistory(com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RUNTIME_HISTORY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages agent runtimes.
   * Standard methods.
   * </pre>
   */
  public static final class RuntimesFutureStub extends io.grpc.stub.AbstractStub<RuntimesFutureStub> {
    private RuntimesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all runtimes of the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse> listRuntimes(
        com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_RUNTIMES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified agent runtime.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Runtime> getRuntime(
        com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RUNTIME, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an agent runtime.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Runtime> createRuntime(
        com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_RUNTIME, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified agent runtime.
     * This method allows you to deploy new agent versions into the runtime.
     * When a runtime is pointed to a new agent version by setting
     * `runtime.agent_version`, the runtime is temporarily set to the `LOADING`
     * state. During that time, the runtime keeps on serving the previous version
     * of the agent. After the new agent version is done loading, the runtime is
     * set back to the `RUNNING` state.
     * Operation&lt;response: Runtime&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateRuntime(
        com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RUNTIME, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified agent runtime.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRuntime(
        com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_RUNTIME, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the history of the specified runtime.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.RuntimeHistory> getRuntimeHistory(
        com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RUNTIME_HISTORY, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_RUNTIMES = 0;
  private static final int METHODID_GET_RUNTIME = 1;
  private static final int METHODID_CREATE_RUNTIME = 2;
  private static final int METHODID_UPDATE_RUNTIME = 3;
  private static final int METHODID_DELETE_RUNTIME = 4;
  private static final int METHODID_GET_RUNTIME_HISTORY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RuntimesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RuntimesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_RUNTIMES:
          serviceImpl.listRuntimes((com.google.cloud.dialogflow.v2beta1.ListRuntimesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListRuntimesResponse>) responseObserver);
          break;
        case METHODID_GET_RUNTIME:
          serviceImpl.getRuntime((com.google.cloud.dialogflow.v2beta1.GetRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime>) responseObserver);
          break;
        case METHODID_CREATE_RUNTIME:
          serviceImpl.createRuntime((com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Runtime>) responseObserver);
          break;
        case METHODID_UPDATE_RUNTIME:
          serviceImpl.updateRuntime((com.google.cloud.dialogflow.v2beta1.UpdateRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_RUNTIME:
          serviceImpl.deleteRuntime((com.google.cloud.dialogflow.v2beta1.DeleteRuntimeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_RUNTIME_HISTORY:
          serviceImpl.getRuntimeHistory((com.google.cloud.dialogflow.v2beta1.GetRuntimeHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.RuntimeHistory>) responseObserver);
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

  private static final class RuntimesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.RuntimeProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RuntimesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RuntimesDescriptorSupplier())
              .addMethod(METHOD_LIST_RUNTIMES)
              .addMethod(METHOD_GET_RUNTIME)
              .addMethod(METHOD_CREATE_RUNTIME)
              .addMethod(METHOD_UPDATE_RUNTIME)
              .addMethod(METHOD_DELETE_RUNTIME)
              .addMethod(METHOD_GET_RUNTIME_HISTORY)
              .build();
        }
      }
    }
    return result;
  }
}
