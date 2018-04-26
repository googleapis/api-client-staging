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
 * Manages services of an application.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/appengine/v1/appengine.proto")
public final class ServicesGrpc {

  private ServicesGrpc() {}

  public static final String SERVICE_NAME = "google.appengine.v1.Services";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListServicesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest,
      com.google.appengine.v1.ListServicesResponse> METHOD_LIST_SERVICES = getListServicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest,
      com.google.appengine.v1.ListServicesResponse> getListServicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest,
      com.google.appengine.v1.ListServicesResponse> getListServicesMethod() {
    return getListServicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest,
      com.google.appengine.v1.ListServicesResponse> getListServicesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.ListServicesRequest, com.google.appengine.v1.ListServicesResponse> getListServicesMethod;
    if ((getListServicesMethod = ServicesGrpc.getListServicesMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getListServicesMethod = ServicesGrpc.getListServicesMethod) == null) {
          ServicesGrpc.getListServicesMethod = getListServicesMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.ListServicesRequest, com.google.appengine.v1.ListServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Services", "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.ListServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.ListServicesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("ListServices"))
                  .build();
          }
        }
     }
     return getListServicesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetServiceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest,
      com.google.appengine.v1.Service> METHOD_GET_SERVICE = getGetServiceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest,
      com.google.appengine.v1.Service> getGetServiceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest,
      com.google.appengine.v1.Service> getGetServiceMethod() {
    return getGetServiceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest,
      com.google.appengine.v1.Service> getGetServiceMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.GetServiceRequest, com.google.appengine.v1.Service> getGetServiceMethod;
    if ((getGetServiceMethod = ServicesGrpc.getGetServiceMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getGetServiceMethod = ServicesGrpc.getGetServiceMethod) == null) {
          ServicesGrpc.getGetServiceMethod = getGetServiceMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.GetServiceRequest, com.google.appengine.v1.Service>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Services", "GetService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.GetServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.Service.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("GetService"))
                  .build();
          }
        }
     }
     return getGetServiceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateServiceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_SERVICE = getUpdateServiceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> getUpdateServiceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> getUpdateServiceMethod() {
    return getUpdateServiceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest,
      com.google.longrunning.Operation> getUpdateServiceMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.UpdateServiceRequest, com.google.longrunning.Operation> getUpdateServiceMethod;
    if ((getUpdateServiceMethod = ServicesGrpc.getUpdateServiceMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getUpdateServiceMethod = ServicesGrpc.getUpdateServiceMethod) == null) {
          ServicesGrpc.getUpdateServiceMethod = getUpdateServiceMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.UpdateServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Services", "UpdateService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.UpdateServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("UpdateService"))
                  .build();
          }
        }
     }
     return getUpdateServiceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteServiceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> METHOD_DELETE_SERVICE = getDeleteServiceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> getDeleteServiceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> getDeleteServiceMethod() {
    return getDeleteServiceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest,
      com.google.longrunning.Operation> getDeleteServiceMethodHelper() {
    io.grpc.MethodDescriptor<com.google.appengine.v1.DeleteServiceRequest, com.google.longrunning.Operation> getDeleteServiceMethod;
    if ((getDeleteServiceMethod = ServicesGrpc.getDeleteServiceMethod) == null) {
      synchronized (ServicesGrpc.class) {
        if ((getDeleteServiceMethod = ServicesGrpc.getDeleteServiceMethod) == null) {
          ServicesGrpc.getDeleteServiceMethod = getDeleteServiceMethod = 
              io.grpc.MethodDescriptor.<com.google.appengine.v1.DeleteServiceRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.appengine.v1.Services", "DeleteService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.appengine.v1.DeleteServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicesMethodDescriptorSupplier("DeleteService"))
                  .build();
          }
        }
     }
     return getDeleteServiceMethod;
  }

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
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
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
      asyncUnimplementedUnaryCall(getListServicesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public void getService(com.google.appengine.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Service> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public void updateService(com.google.appengine.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public void deleteService(com.google.appengine.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServiceMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListServicesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.ListServicesRequest,
                com.google.appengine.v1.ListServicesResponse>(
                  this, METHODID_LIST_SERVICES)))
          .addMethod(
            getGetServiceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.GetServiceRequest,
                com.google.appengine.v1.Service>(
                  this, METHODID_GET_SERVICE)))
          .addMethod(
            getUpdateServiceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.UpdateServiceRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_SERVICE)))
          .addMethod(
            getDeleteServiceMethodHelper(),
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
          getChannel().newCall(getListServicesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public void getService(com.google.appengine.v1.GetServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Service> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public void updateService(com.google.appengine.v1.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public void deleteService(com.google.appengine.v1.DeleteServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServiceMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel(), getListServicesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public com.google.appengine.v1.Service getService(com.google.appengine.v1.GetServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public com.google.longrunning.Operation updateService(com.google.appengine.v1.UpdateServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public com.google.longrunning.Operation deleteService(com.google.appengine.v1.DeleteServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServiceMethodHelper(), getCallOptions(), request);
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
          getChannel().newCall(getListServicesMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the current configuration of the specified service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.Service> getService(
        com.google.appengine.v1.GetServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the configuration of the specified service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateService(
        com.google.appengine.v1.UpdateServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified service and all enclosed versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteService(
        com.google.appengine.v1.DeleteServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServiceMethodHelper(), getCallOptions()), request);
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

  private static abstract class ServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.appengine.v1.AppengineProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Services");
    }
  }

  private static final class ServicesFileDescriptorSupplier
      extends ServicesBaseDescriptorSupplier {
    ServicesFileDescriptorSupplier() {}
  }

  private static final class ServicesMethodDescriptorSupplier
      extends ServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicesFileDescriptorSupplier())
              .addMethod(getListServicesMethodHelper())
              .addMethod(getGetServiceMethodHelper())
              .addMethod(getUpdateServiceMethodHelper())
              .addMethod(getDeleteServiceMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
