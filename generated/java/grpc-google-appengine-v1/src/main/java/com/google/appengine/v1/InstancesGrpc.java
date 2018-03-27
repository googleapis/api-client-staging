package com.google.appengine.v1;

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
 * Manages instances of a version.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/appengine/v1/appengine.proto")
public final class InstancesGrpc {

  private InstancesGrpc() {}

  public static final String SERVICE_NAME = "google.appengine.v1.Instances";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.ListInstancesRequest,
      com.google.appengine.v1.ListInstancesResponse> METHOD_LIST_INSTANCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Instances", "ListInstances"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.ListInstancesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.ListInstancesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.GetInstanceRequest,
      com.google.appengine.v1.Instance> METHOD_GET_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Instances", "GetInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.GetInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.Instance.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteInstanceRequest,
      com.google.longrunning.Operation> METHOD_DELETE_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Instances", "DeleteInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.DeleteInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.DebugInstanceRequest,
      com.google.longrunning.Operation> METHOD_DEBUG_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Instances", "DebugInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.DebugInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstancesStub newStub(io.grpc.Channel channel) {
    return new InstancesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstancesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstancesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InstancesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstancesFutureStub(channel);
  }

  /**
   * <pre>
   * Manages instances of a version.
   * </pre>
   */
  public static abstract class InstancesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the instances of a version.
     * </pre>
     */
    public void listInstances(com.google.appengine.v1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListInstancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSTANCES, responseObserver);
    }

    /**
     * <pre>
     * Gets instance information.
     * </pre>
     */
    public void getInstance(com.google.appengine.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Stops a running instance.
     * </pre>
     */
    public void deleteInstance(com.google.appengine.v1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Enables debugging on a VM instance. This allows you to use the SSH
     * command to connect to the virtual machine where the instance lives.
     * While in "debug mode", the instance continues to serve live traffic.
     * You should delete the instance when you are done debugging and then
     * allow the system to take over and determine if another instance
     * should be started.
     * Only applicable for instances in App Engine flexible environment.
     * </pre>
     */
    public void debugInstance(com.google.appengine.v1.DebugInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEBUG_INSTANCE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_INSTANCES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.ListInstancesRequest,
                com.google.appengine.v1.ListInstancesResponse>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            METHOD_GET_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.GetInstanceRequest,
                com.google.appengine.v1.Instance>(
                  this, METHODID_GET_INSTANCE)))
          .addMethod(
            METHOD_DELETE_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.DeleteInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_INSTANCE)))
          .addMethod(
            METHOD_DEBUG_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.DebugInstanceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DEBUG_INSTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages instances of a version.
   * </pre>
   */
  public static final class InstancesStub extends io.grpc.stub.AbstractStub<InstancesStub> {
    private InstancesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the instances of a version.
     * </pre>
     */
    public void listInstances(com.google.appengine.v1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListInstancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets instance information.
     * </pre>
     */
    public void getInstance(com.google.appengine.v1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stops a running instance.
     * </pre>
     */
    public void deleteInstance(com.google.appengine.v1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables debugging on a VM instance. This allows you to use the SSH
     * command to connect to the virtual machine where the instance lives.
     * While in "debug mode", the instance continues to serve live traffic.
     * You should delete the instance when you are done debugging and then
     * allow the system to take over and determine if another instance
     * should be started.
     * Only applicable for instances in App Engine flexible environment.
     * </pre>
     */
    public void debugInstance(com.google.appengine.v1.DebugInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEBUG_INSTANCE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages instances of a version.
   * </pre>
   */
  public static final class InstancesBlockingStub extends io.grpc.stub.AbstractStub<InstancesBlockingStub> {
    private InstancesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the instances of a version.
     * </pre>
     */
    public com.google.appengine.v1.ListInstancesResponse listInstances(com.google.appengine.v1.ListInstancesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSTANCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets instance information.
     * </pre>
     */
    public com.google.appengine.v1.Instance getInstance(com.google.appengine.v1.GetInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Stops a running instance.
     * </pre>
     */
    public com.google.longrunning.Operation deleteInstance(com.google.appengine.v1.DeleteInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables debugging on a VM instance. This allows you to use the SSH
     * command to connect to the virtual machine where the instance lives.
     * While in "debug mode", the instance continues to serve live traffic.
     * You should delete the instance when you are done debugging and then
     * allow the system to take over and determine if another instance
     * should be started.
     * Only applicable for instances in App Engine flexible environment.
     * </pre>
     */
    public com.google.longrunning.Operation debugInstance(com.google.appengine.v1.DebugInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEBUG_INSTANCE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages instances of a version.
   * </pre>
   */
  public static final class InstancesFutureStub extends io.grpc.stub.AbstractStub<InstancesFutureStub> {
    private InstancesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the instances of a version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.ListInstancesResponse> listInstances(
        com.google.appengine.v1.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets instance information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.Instance> getInstance(
        com.google.appengine.v1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Stops a running instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteInstance(
        com.google.appengine.v1.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables debugging on a VM instance. This allows you to use the SSH
     * command to connect to the virtual machine where the instance lives.
     * While in "debug mode", the instance continues to serve live traffic.
     * You should delete the instance when you are done debugging and then
     * allow the system to take over and determine if another instance
     * should be started.
     * Only applicable for instances in App Engine flexible environment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> debugInstance(
        com.google.appengine.v1.DebugInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEBUG_INSTANCE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_DELETE_INSTANCE = 2;
  private static final int METHODID_DEBUG_INSTANCE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstancesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstancesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((com.google.appengine.v1.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.ListInstancesResponse>) responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance((com.google.appengine.v1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.Instance>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance((com.google.appengine.v1.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DEBUG_INSTANCE:
          serviceImpl.debugInstance((com.google.appengine.v1.DebugInstanceRequest) request,
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

  private static final class InstancesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.appengine.v1.AppengineProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InstancesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstancesDescriptorSupplier())
              .addMethod(METHOD_LIST_INSTANCES)
              .addMethod(METHOD_GET_INSTANCE)
              .addMethod(METHOD_DELETE_INSTANCE)
              .addMethod(METHOD_DEBUG_INSTANCE)
              .build();
        }
      }
    }
    return result;
  }
}
