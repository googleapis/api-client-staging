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
 * Manages App Engine applications.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/appengine/v1/appengine.proto")
public final class ApplicationsGrpc {

  private ApplicationsGrpc() {}

  public static final String SERVICE_NAME = "google.appengine.v1.Applications";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.GetApplicationRequest,
      com.google.appengine.v1.Application> METHOD_GET_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Applications", "GetApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.GetApplicationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.Application.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.appengine.v1.RepairApplicationRequest,
      com.google.longrunning.Operation> METHOD_REPAIR_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.appengine.v1.Applications", "RepairApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.appengine.v1.RepairApplicationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationsStub newStub(io.grpc.Channel channel) {
    return new ApplicationsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApplicationsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApplicationsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages App Engine applications.
   * </pre>
   */
  public static abstract class ApplicationsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets information about an application.
     * </pre>
     */
    public void getApplication(com.google.appengine.v1.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Application> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APPLICATION, responseObserver);
    }

    /**
     * <pre>
     * Recreates the required App Engine features for the application in your
     * project, for example a Cloud Storage bucket or App Engine service account.
     * Use this method if you receive an error message about a missing feature,
     * for example "*Error retrieving the App Engine service account*".
     * </pre>
     */
    public void repairApplication(com.google.appengine.v1.RepairApplicationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REPAIR_APPLICATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.GetApplicationRequest,
                com.google.appengine.v1.Application>(
                  this, METHODID_GET_APPLICATION)))
          .addMethod(
            METHOD_REPAIR_APPLICATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.appengine.v1.RepairApplicationRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_REPAIR_APPLICATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages App Engine applications.
   * </pre>
   */
  public static final class ApplicationsStub extends io.grpc.stub.AbstractStub<ApplicationsStub> {
    private ApplicationsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about an application.
     * </pre>
     */
    public void getApplication(com.google.appengine.v1.GetApplicationRequest request,
        io.grpc.stub.StreamObserver<com.google.appengine.v1.Application> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Recreates the required App Engine features for the application in your
     * project, for example a Cloud Storage bucket or App Engine service account.
     * Use this method if you receive an error message about a missing feature,
     * for example "*Error retrieving the App Engine service account*".
     * </pre>
     */
    public void repairApplication(com.google.appengine.v1.RepairApplicationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REPAIR_APPLICATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages App Engine applications.
   * </pre>
   */
  public static final class ApplicationsBlockingStub extends io.grpc.stub.AbstractStub<ApplicationsBlockingStub> {
    private ApplicationsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about an application.
     * </pre>
     */
    public com.google.appengine.v1.Application getApplication(com.google.appengine.v1.GetApplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APPLICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Recreates the required App Engine features for the application in your
     * project, for example a Cloud Storage bucket or App Engine service account.
     * Use this method if you receive an error message about a missing feature,
     * for example "*Error retrieving the App Engine service account*".
     * </pre>
     */
    public com.google.longrunning.Operation repairApplication(com.google.appengine.v1.RepairApplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REPAIR_APPLICATION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages App Engine applications.
   * </pre>
   */
  public static final class ApplicationsFutureStub extends io.grpc.stub.AbstractStub<ApplicationsFutureStub> {
    private ApplicationsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about an application.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.appengine.v1.Application> getApplication(
        com.google.appengine.v1.GetApplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Recreates the required App Engine features for the application in your
     * project, for example a Cloud Storage bucket or App Engine service account.
     * Use this method if you receive an error message about a missing feature,
     * for example "*Error retrieving the App Engine service account*".
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> repairApplication(
        com.google.appengine.v1.RepairApplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REPAIR_APPLICATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_APPLICATION = 0;
  private static final int METHODID_REPAIR_APPLICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApplicationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_APPLICATION:
          serviceImpl.getApplication((com.google.appengine.v1.GetApplicationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.appengine.v1.Application>) responseObserver);
          break;
        case METHODID_REPAIR_APPLICATION:
          serviceImpl.repairApplication((com.google.appengine.v1.RepairApplicationRequest) request,
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

  private static final class ApplicationsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.appengine.v1.AppengineProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApplicationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationsDescriptorSupplier())
              .addMethod(METHOD_GET_APPLICATION)
              .addMethod(METHOD_REPAIR_APPLICATION)
              .build();
        }
      }
    }
    return result;
  }
}
