package com.google.cloud.compute.v1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/compute/v1/compute_instances.proto")
public class InstancesServiceGrpc {

  private InstancesServiceGrpc() {}

  public static final String SERVICE_NAME = "google.compute.v1.InstancesService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.compute.v1.InstancesListRequest,
      com.google.cloud.compute.v1.InstanceList> METHOD_LIST_INSTANCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.compute.v1.InstancesService", "ListInstances"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.InstancesListRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.InstanceList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.compute.v1.InstancesGetRequest,
      com.google.cloud.compute.v1.Instance> METHOD_GET_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.compute.v1.InstancesService", "GetInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.InstancesGetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.Instance.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.compute.v1.InstancesInsertRequest,
      com.google.cloud.compute.v1.Operation> METHOD_INSERT_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.compute.v1.InstancesService", "InsertInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.InstancesInsertRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.compute.v1.InstancesDeleteRequest,
      com.google.cloud.compute.v1.Operation> METHOD_DELETE_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.compute.v1.InstancesService", "DeleteInstance"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.InstancesDeleteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.compute.v1.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstancesServiceStub newStub(io.grpc.Channel channel) {
    return new InstancesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstancesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstancesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InstancesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstancesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InstancesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the list of instances contained within
     * the specified zone.
     * </pre>
     */
    public void listInstances(com.google.cloud.compute.v1.InstancesListRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.InstanceList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSTANCES, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Instance resource. Get a list of available instances
     * by making a &lt;code&gt;list()&lt;/code&gt; request.
     * </pre>
     */
    public void getInstance(com.google.cloud.compute.v1.InstancesGetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance resource in the specified project using the data
     * included in the request.
     * </pre>
     */
    public void insertInstance(com.google.cloud.compute.v1.InstancesInsertRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSERT_INSTANCE, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Instance resource. For more information, see
     * &lt;a href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an Instance&lt;/a&gt;.
     * </pre>
     */
    public void deleteInstance(com.google.cloud.compute.v1.InstancesDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INSTANCE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_INSTANCES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.compute.v1.InstancesListRequest,
                com.google.cloud.compute.v1.InstanceList>(
                  this, METHODID_LIST_INSTANCES)))
          .addMethod(
            METHOD_GET_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.compute.v1.InstancesGetRequest,
                com.google.cloud.compute.v1.Instance>(
                  this, METHODID_GET_INSTANCE)))
          .addMethod(
            METHOD_INSERT_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.compute.v1.InstancesInsertRequest,
                com.google.cloud.compute.v1.Operation>(
                  this, METHODID_INSERT_INSTANCE)))
          .addMethod(
            METHOD_DELETE_INSTANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.compute.v1.InstancesDeleteRequest,
                com.google.cloud.compute.v1.Operation>(
                  this, METHODID_DELETE_INSTANCE)))
          .build();
    }
  }

  /**
   */
  public static final class InstancesServiceStub extends io.grpc.stub.AbstractStub<InstancesServiceStub> {
    private InstancesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of instances contained within
     * the specified zone.
     * </pre>
     */
    public void listInstances(com.google.cloud.compute.v1.InstancesListRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.InstanceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified Instance resource. Get a list of available instances
     * by making a &lt;code&gt;list()&lt;/code&gt; request.
     * </pre>
     */
    public void getInstance(com.google.cloud.compute.v1.InstancesGetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an instance resource in the specified project using the data
     * included in the request.
     * </pre>
     */
    public void insertInstance(com.google.cloud.compute.v1.InstancesInsertRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSERT_INSTANCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified Instance resource. For more information, see
     * &lt;a href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an Instance&lt;/a&gt;.
     * </pre>
     */
    public void deleteInstance(com.google.cloud.compute.v1.InstancesDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstancesServiceBlockingStub extends io.grpc.stub.AbstractStub<InstancesServiceBlockingStub> {
    private InstancesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of instances contained within
     * the specified zone.
     * </pre>
     */
    public com.google.cloud.compute.v1.InstanceList listInstances(com.google.cloud.compute.v1.InstancesListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSTANCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified Instance resource. Get a list of available instances
     * by making a &lt;code&gt;list()&lt;/code&gt; request.
     * </pre>
     */
    public com.google.cloud.compute.v1.Instance getInstance(com.google.cloud.compute.v1.InstancesGetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an instance resource in the specified project using the data
     * included in the request.
     * </pre>
     */
    public com.google.cloud.compute.v1.Operation insertInstance(com.google.cloud.compute.v1.InstancesInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSERT_INSTANCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified Instance resource. For more information, see
     * &lt;a href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an Instance&lt;/a&gt;.
     * </pre>
     */
    public com.google.cloud.compute.v1.Operation deleteInstance(com.google.cloud.compute.v1.InstancesDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INSTANCE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstancesServiceFutureStub extends io.grpc.stub.AbstractStub<InstancesServiceFutureStub> {
    private InstancesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstancesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstancesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstancesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the list of instances contained within
     * the specified zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.compute.v1.InstanceList> listInstances(
        com.google.cloud.compute.v1.InstancesListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSTANCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified Instance resource. Get a list of available instances
     * by making a &lt;code&gt;list()&lt;/code&gt; request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.compute.v1.Instance> getInstance(
        com.google.cloud.compute.v1.InstancesGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an instance resource in the specified project using the data
     * included in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.compute.v1.Operation> insertInstance(
        com.google.cloud.compute.v1.InstancesInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSERT_INSTANCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified Instance resource. For more information, see
     * &lt;a href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an Instance&lt;/a&gt;.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.compute.v1.Operation> deleteInstance(
        com.google.cloud.compute.v1.InstancesDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSTANCE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_INSERT_INSTANCE = 2;
  private static final int METHODID_DELETE_INSTANCE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstancesServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(InstancesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances((com.google.cloud.compute.v1.InstancesListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.InstanceList>) responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance((com.google.cloud.compute.v1.InstancesGetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Instance>) responseObserver);
          break;
        case METHODID_INSERT_INSTANCE:
          serviceImpl.insertInstance((com.google.cloud.compute.v1.InstancesInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance((com.google.cloud.compute.v1.InstancesDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.compute.v1.Operation>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_LIST_INSTANCES,
        METHOD_GET_INSTANCE,
        METHOD_INSERT_INSTANCE,
        METHOD_DELETE_INSTANCE);
  }

}
