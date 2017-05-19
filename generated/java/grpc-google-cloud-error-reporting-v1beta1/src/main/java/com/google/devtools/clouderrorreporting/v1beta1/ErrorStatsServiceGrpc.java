package com.google.devtools.clouderrorreporting.v1beta1;

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
 * An API for retrieving and managing error statistics as well as data for
 * individual events.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto")
public final class ErrorStatsServiceGrpc {

  private ErrorStatsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,
      com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse> METHOD_LIST_GROUP_STATS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService", "ListGroupStats"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,
      com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse> METHOD_LIST_EVENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService", "ListEvents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,
      com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse> METHOD_DELETE_EVENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService", "DeleteEvents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ErrorStatsServiceStub newStub(io.grpc.Channel channel) {
    return new ErrorStatsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ErrorStatsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ErrorStatsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ErrorStatsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ErrorStatsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * An API for retrieving and managing error statistics as well as data for
   * individual events.
   * </pre>
   */
  public static abstract class ErrorStatsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the specified groups.
     * </pre>
     */
    public void listGroupStats(com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_GROUP_STATS, responseObserver);
    }

    /**
     * <pre>
     * Lists the specified events.
     * </pre>
     */
    public void listEvents(com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_EVENTS, responseObserver);
    }

    /**
     * <pre>
     * Deletes all error events of a given project.
     * </pre>
     */
    public void deleteEvents(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_EVENTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_GROUP_STATS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,
                com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse>(
                  this, METHODID_LIST_GROUP_STATS)))
          .addMethod(
            METHOD_LIST_EVENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,
                com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse>(
                  this, METHODID_LIST_EVENTS)))
          .addMethod(
            METHOD_DELETE_EVENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,
                com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>(
                  this, METHODID_DELETE_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * An API for retrieving and managing error statistics as well as data for
   * individual events.
   * </pre>
   */
  public static final class ErrorStatsServiceStub extends io.grpc.stub.AbstractStub<ErrorStatsServiceStub> {
    private ErrorStatsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorStatsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorStatsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorStatsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the specified groups.
     * </pre>
     */
    public void listGroupStats(com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_STATS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the specified events.
     * </pre>
     */
    public void listEvents(com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_EVENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes all error events of a given project.
     * </pre>
     */
    public void deleteEvents(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_EVENTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An API for retrieving and managing error statistics as well as data for
   * individual events.
   * </pre>
   */
  public static final class ErrorStatsServiceBlockingStub extends io.grpc.stub.AbstractStub<ErrorStatsServiceBlockingStub> {
    private ErrorStatsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorStatsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorStatsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorStatsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the specified groups.
     * </pre>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse listGroupStats(com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_GROUP_STATS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the specified events.
     * </pre>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse listEvents(com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_EVENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all error events of a given project.
     * </pre>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse deleteEvents(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_EVENTS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An API for retrieving and managing error statistics as well as data for
   * individual events.
   * </pre>
   */
  public static final class ErrorStatsServiceFutureStub extends io.grpc.stub.AbstractStub<ErrorStatsServiceFutureStub> {
    private ErrorStatsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ErrorStatsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ErrorStatsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ErrorStatsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the specified groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse> listGroupStats(
        com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_GROUP_STATS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the specified events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse> listEvents(
        com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_EVENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes all error events of a given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse> deleteEvents(
        com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_EVENTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GROUP_STATS = 0;
  private static final int METHODID_LIST_EVENTS = 1;
  private static final int METHODID_DELETE_EVENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ErrorStatsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ErrorStatsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GROUP_STATS:
          serviceImpl.listGroupStats((com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVENTS:
          serviceImpl.deleteEvents((com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>) responseObserver);
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

  private static final class ErrorStatsServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ErrorStatsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ErrorStatsServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_GROUP_STATS)
              .addMethod(METHOD_LIST_EVENTS)
              .addMethod(METHOD_DELETE_EVENTS)
              .build();
        }
      }
    }
    return result;
  }
}
