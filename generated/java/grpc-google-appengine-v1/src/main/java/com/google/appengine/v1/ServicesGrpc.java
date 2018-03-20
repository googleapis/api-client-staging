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
 * Manages services of an application.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/appengine/v1/appengine.proto")
public final class ServicesGrpc {

  private ServicesGrpc() {}

  public static final String SERVICE_NAME = "google.appengine.v1.Services";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest,
      com.google.appengine.v1.ListServicesResponse> METHOD_LIST_SERVICES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Services", "ListServices"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.ListServicesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.ListServicesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest,
      com.google.appengine.v1.Service> METHOD_GET_SERVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Services", "GetService"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.GetServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.Service.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_SERVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Services", "UpdateService"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> METHOD_DELETE_SERVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Services", "DeleteService"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.DeleteServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicesStub newStub(io.grpc.Channel channel) {
    return new ServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServicesFutureStub(channel);
  }

  /**
   * <pre>
   * Manages services of an application.
   * </pre>
   */
  public static abstract class ServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists all the services in the application.
     * </pre>
     */
    public void listServices(com.google.appengine.v1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListServicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SERVICES, responseObserver);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public void getService(com.google.appengine.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Service> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVICE, responseObserver);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public void updateService(com.google.appengine.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SERVICE, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public void deleteService(com.google.appengine.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SERVICE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_SERVICES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.ListServicesRequest,
                com.google.appengine.v1.ListServicesResponse>(
                  this, METHODID_LIST_SERVICES)))
          .addMethod(
            METHOD_GET_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.GetServiceRequest,
                com.google.appengine.v1.Service>(
                  this, METHODID_GET_SERVICE)))
          .addMethod(
            METHOD_UPDATE_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.UpdateServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_SERVICE)))
          .addMethod(
            METHOD_DELETE_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.DeleteServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages services of an application.
   * </pre>
   */
  public static final class ServicesStub extends io.grpc.stub.AbstractStub<ServicesStub> {
    private ServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the services in the application.
     * </pre>
     */
    public void listServices(com.google.appengine.v1.ListServicesRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.ListServicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public void getService(com.google.appengine.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Service> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public void updateService(com.google.appengine.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public void deleteService(com.google.appengine.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages services of an application.
   * </pre>
   */
  public static final class ServicesBlockingStub extends io.grpc.stub.AbstractStub<ServicesBlockingStub> {
    private ServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the services in the application.
     * </pre>
     */
    public com.google.appengine.v1.ListServicesResponse listServices(com.google.appengine.v1.ListServicesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SERVICES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public com.google.appengine.v1.Service getService(com.google.appengine.v1.GetServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public com.google.longrunning.Operation updateService(com.google.appengine.v1.UpdateServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SERVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public com.google.longrunning.Operation deleteService(com.google.appengine.v1.DeleteServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SERVICE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages services of an application.
   * </pre>
   */
  public static final class ServicesFutureStub extends io.grpc.stub.AbstractStub<ServicesFutureStub> {
    private ServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the services in the application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.ListServicesResponse> listServices(
        com.google.appengine.v1.ListServicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.Service> getService(
        com.google.appengine.v1.GetServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateService(
        com.google.appengine.v1.UpdateServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SERVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteService(
        com.google.appengine.v1.DeleteServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICES = 0;
  private static final int METHODID_GET_SERVICE = 1;
  private static final int METHODID_UPDATE_SERVICE = 2;
  private static final int METHODID_DELETE_SERVICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((com.google.appengine.v1.ListServicesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.ListServicesResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE:
          serviceImpl.getService((com.google.appengine.v1.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.Service>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE:
          serviceImpl.updateService((com.google.appengine.v1.UpdateServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE:
          serviceImpl.deleteService((com.google.appengine.v1.DeleteServiceRequest) request,
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

  private static final class ServicesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.appengine.v1.AppengineProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicesDescriptorSupplier())
              .addMethod(METHOD_LIST_SERVICES)
              .addMethod(METHOD_GET_SERVICE)
              .addMethod(METHOD_UPDATE_SERVICE)
              .addMethod(METHOD_DELETE_SERVICE)
              .build();
        }
      }
    }
    return result;
  }
}
