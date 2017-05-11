package com.google.logging.v2;

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
 * Service for configuring logs-based metrics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/logging/v2/logging_metrics.proto")
public final class MetricsServiceV2Grpc {

  private MetricsServiceV2Grpc() {}

  public static final String SERVICE_NAME = "google.logging.v2.MetricsServiceV2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.ListLogMetricsRequest,
      com.google.logging.v2.ListLogMetricsResponse> METHOD_LIST_LOG_METRICS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.logging.v2.MetricsServiceV2", "ListLogMetrics"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.ListLogMetricsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.ListLogMetricsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.GetLogMetricRequest,
      com.google.logging.v2.LogMetric> METHOD_GET_LOG_METRIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.logging.v2.MetricsServiceV2", "GetLogMetric"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.GetLogMetricRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.LogMetric.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.CreateLogMetricRequest,
      com.google.logging.v2.LogMetric> METHOD_CREATE_LOG_METRIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.logging.v2.MetricsServiceV2", "CreateLogMetric"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.CreateLogMetricRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.LogMetric.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.UpdateLogMetricRequest,
      com.google.logging.v2.LogMetric> METHOD_UPDATE_LOG_METRIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.logging.v2.MetricsServiceV2", "UpdateLogMetric"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.UpdateLogMetricRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.LogMetric.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.logging.v2.DeleteLogMetricRequest,
      com.google.protobuf.Empty> METHOD_DELETE_LOG_METRIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.logging.v2.MetricsServiceV2", "DeleteLogMetric"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.logging.v2.DeleteLogMetricRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetricsServiceV2Stub newStub(io.grpc.Channel channel) {
    return new MetricsServiceV2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricsServiceV2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetricsServiceV2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetricsServiceV2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetricsServiceV2FutureStub(channel);
  }

  /**
   * <pre>
   * Service for configuring logs-based metrics.
   * </pre>
   */
  public static abstract class MetricsServiceV2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists logs-based metrics.
     * </pre>
     */
    public void listLogMetrics(com.google.logging.v2.ListLogMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogMetricsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_LOG_METRICS, responseObserver);
    }

    /**
     * <pre>
     * Gets a logs-based metric.
     * </pre>
     */
    public void getLogMetric(com.google.logging.v2.GetLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LOG_METRIC, responseObserver);
    }

    /**
     * <pre>
     * Creates a logs-based metric.
     * </pre>
     */
    public void createLogMetric(com.google.logging.v2.CreateLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_LOG_METRIC, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a logs-based metric.
     * </pre>
     */
    public void updateLogMetric(com.google.logging.v2.UpdateLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_LOG_METRIC, responseObserver);
    }

    /**
     * <pre>
     * Deletes a logs-based metric.
     * </pre>
     */
    public void deleteLogMetric(com.google.logging.v2.DeleteLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_LOG_METRIC, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_LOG_METRICS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.ListLogMetricsRequest,
                com.google.logging.v2.ListLogMetricsResponse>(
                  this, METHODID_LIST_LOG_METRICS)))
          .addMethod(
            METHOD_GET_LOG_METRIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.GetLogMetricRequest,
                com.google.logging.v2.LogMetric>(
                  this, METHODID_GET_LOG_METRIC)))
          .addMethod(
            METHOD_CREATE_LOG_METRIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.CreateLogMetricRequest,
                com.google.logging.v2.LogMetric>(
                  this, METHODID_CREATE_LOG_METRIC)))
          .addMethod(
            METHOD_UPDATE_LOG_METRIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.UpdateLogMetricRequest,
                com.google.logging.v2.LogMetric>(
                  this, METHODID_UPDATE_LOG_METRIC)))
          .addMethod(
            METHOD_DELETE_LOG_METRIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.logging.v2.DeleteLogMetricRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_LOG_METRIC)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for configuring logs-based metrics.
   * </pre>
   */
  public static final class MetricsServiceV2Stub extends io.grpc.stub.AbstractStub<MetricsServiceV2Stub> {
    private MetricsServiceV2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricsServiceV2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceV2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricsServiceV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists logs-based metrics.
     * </pre>
     */
    public void listLogMetrics(com.google.logging.v2.ListLogMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogMetricsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_LOG_METRICS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a logs-based metric.
     * </pre>
     */
    public void getLogMetric(com.google.logging.v2.GetLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LOG_METRIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a logs-based metric.
     * </pre>
     */
    public void createLogMetric(com.google.logging.v2.CreateLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_LOG_METRIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a logs-based metric.
     * </pre>
     */
    public void updateLogMetric(com.google.logging.v2.UpdateLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_LOG_METRIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a logs-based metric.
     * </pre>
     */
    public void deleteLogMetric(com.google.logging.v2.DeleteLogMetricRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOG_METRIC, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for configuring logs-based metrics.
   * </pre>
   */
  public static final class MetricsServiceV2BlockingStub extends io.grpc.stub.AbstractStub<MetricsServiceV2BlockingStub> {
    private MetricsServiceV2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricsServiceV2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceV2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricsServiceV2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists logs-based metrics.
     * </pre>
     */
    public com.google.logging.v2.ListLogMetricsResponse listLogMetrics(com.google.logging.v2.ListLogMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_LOG_METRICS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a logs-based metric.
     * </pre>
     */
    public com.google.logging.v2.LogMetric getLogMetric(com.google.logging.v2.GetLogMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LOG_METRIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a logs-based metric.
     * </pre>
     */
    public com.google.logging.v2.LogMetric createLogMetric(com.google.logging.v2.CreateLogMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_LOG_METRIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates a logs-based metric.
     * </pre>
     */
    public com.google.logging.v2.LogMetric updateLogMetric(com.google.logging.v2.UpdateLogMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_LOG_METRIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a logs-based metric.
     * </pre>
     */
    public com.google.protobuf.Empty deleteLogMetric(com.google.logging.v2.DeleteLogMetricRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_LOG_METRIC, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for configuring logs-based metrics.
   * </pre>
   */
  public static final class MetricsServiceV2FutureStub extends io.grpc.stub.AbstractStub<MetricsServiceV2FutureStub> {
    private MetricsServiceV2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricsServiceV2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceV2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricsServiceV2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists logs-based metrics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.ListLogMetricsResponse> listLogMetrics(
        com.google.logging.v2.ListLogMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_LOG_METRICS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a logs-based metric.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogMetric> getLogMetric(
        com.google.logging.v2.GetLogMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LOG_METRIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a logs-based metric.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogMetric> createLogMetric(
        com.google.logging.v2.CreateLogMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_LOG_METRIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates a logs-based metric.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.logging.v2.LogMetric> updateLogMetric(
        com.google.logging.v2.UpdateLogMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_LOG_METRIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a logs-based metric.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLogMetric(
        com.google.logging.v2.DeleteLogMetricRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOG_METRIC, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_LOG_METRICS = 0;
  private static final int METHODID_GET_LOG_METRIC = 1;
  private static final int METHODID_CREATE_LOG_METRIC = 2;
  private static final int METHODID_UPDATE_LOG_METRIC = 3;
  private static final int METHODID_DELETE_LOG_METRIC = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricsServiceV2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricsServiceV2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_LOG_METRICS:
          serviceImpl.listLogMetrics((com.google.logging.v2.ListLogMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.ListLogMetricsResponse>) responseObserver);
          break;
        case METHODID_GET_LOG_METRIC:
          serviceImpl.getLogMetric((com.google.logging.v2.GetLogMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric>) responseObserver);
          break;
        case METHODID_CREATE_LOG_METRIC:
          serviceImpl.createLogMetric((com.google.logging.v2.CreateLogMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric>) responseObserver);
          break;
        case METHODID_UPDATE_LOG_METRIC:
          serviceImpl.updateLogMetric((com.google.logging.v2.UpdateLogMetricRequest) request,
              (io.grpc.stub.StreamObserver<com.google.logging.v2.LogMetric>) responseObserver);
          break;
        case METHODID_DELETE_LOG_METRIC:
          serviceImpl.deleteLogMetric((com.google.logging.v2.DeleteLogMetricRequest) request,
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

  private static final class MetricsServiceV2DescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.logging.v2.LoggingMetricsProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetricsServiceV2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetricsServiceV2DescriptorSupplier())
              .addMethod(METHOD_LIST_LOG_METRICS)
              .addMethod(METHOD_GET_LOG_METRIC)
              .addMethod(METHOD_CREATE_LOG_METRIC)
              .addMethod(METHOD_UPDATE_LOG_METRIC)
              .addMethod(METHOD_DELETE_LOG_METRIC)
              .build();
        }
      }
    }
    return result;
  }
}
