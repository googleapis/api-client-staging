package com.google.monitoring.v3;

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
 * Manages metric descriptors, monitored resource descriptors, and
 * time series data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/monitoring/v3/metric_service.proto")
public final class MetricServiceGrpc {

  private MetricServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.MetricService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse> METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "ListMonitoredResourceDescriptors"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
      com.google.api.MonitoredResourceDescriptor> METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "GetMonitoredResourceDescriptor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.api.MonitoredResourceDescriptor.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListMetricDescriptorsRequest,
      com.google.monitoring.v3.ListMetricDescriptorsResponse> METHOD_LIST_METRIC_DESCRIPTORS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "ListMetricDescriptors"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListMetricDescriptorsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListMetricDescriptorsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetMetricDescriptorRequest,
      com.google.api.MetricDescriptor> METHOD_GET_METRIC_DESCRIPTOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "GetMetricDescriptor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetMetricDescriptorRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.api.MetricDescriptor.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.CreateMetricDescriptorRequest,
      com.google.api.MetricDescriptor> METHOD_CREATE_METRIC_DESCRIPTOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "CreateMetricDescriptor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.CreateMetricDescriptorRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.api.MetricDescriptor.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.DeleteMetricDescriptorRequest,
      com.google.protobuf.Empty> METHOD_DELETE_METRIC_DESCRIPTOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "DeleteMetricDescriptor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.DeleteMetricDescriptorRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListTimeSeriesRequest,
      com.google.monitoring.v3.ListTimeSeriesResponse> METHOD_LIST_TIME_SERIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "ListTimeSeries"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListTimeSeriesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListTimeSeriesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.CreateTimeSeriesRequest,
      com.google.protobuf.Empty> METHOD_CREATE_TIME_SERIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.MetricService", "CreateTimeSeries"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.CreateTimeSeriesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetricServiceStub newStub(io.grpc.Channel channel) {
    return new MetricServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetricServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetricServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetricServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static abstract class MetricServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMonitoredResourceDescriptor(com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR, responseObserver);
    }

    /**
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMetricDescriptors(com.google.monitoring.v3.ListMetricDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_METRIC_DESCRIPTORS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMetricDescriptor(com.google.monitoring.v3.GetMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_METRIC_DESCRIPTOR, responseObserver);
    }

    /**
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](/monitoring/custom-metrics).
     * </pre>
     */
    public void createMetricDescriptor(com.google.monitoring.v3.CreateMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_METRIC_DESCRIPTOR, responseObserver);
    }

    /**
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](/monitoring/custom-metrics) can be deleted.
     * </pre>
     */
    public void deleteMetricDescriptor(com.google.monitoring.v3.DeleteMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_METRIC_DESCRIPTOR, responseObserver);
    }

    /**
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listTimeSeries(com.google.monitoring.v3.ListTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TIME_SERIES, responseObserver);
    }

    /**
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public void createTimeSeries(com.google.monitoring.v3.CreateTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TIME_SERIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
                com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>(
                  this, METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS)))
          .addMethod(
            METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
                com.google.api.MonitoredResourceDescriptor>(
                  this, METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR)))
          .addMethod(
            METHOD_LIST_METRIC_DESCRIPTORS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListMetricDescriptorsRequest,
                com.google.monitoring.v3.ListMetricDescriptorsResponse>(
                  this, METHODID_LIST_METRIC_DESCRIPTORS)))
          .addMethod(
            METHOD_GET_METRIC_DESCRIPTOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetMetricDescriptorRequest,
                com.google.api.MetricDescriptor>(
                  this, METHODID_GET_METRIC_DESCRIPTOR)))
          .addMethod(
            METHOD_CREATE_METRIC_DESCRIPTOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.CreateMetricDescriptorRequest,
                com.google.api.MetricDescriptor>(
                  this, METHODID_CREATE_METRIC_DESCRIPTOR)))
          .addMethod(
            METHOD_DELETE_METRIC_DESCRIPTOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.DeleteMetricDescriptorRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_METRIC_DESCRIPTOR)))
          .addMethod(
            METHOD_LIST_TIME_SERIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListTimeSeriesRequest,
                com.google.monitoring.v3.ListTimeSeriesResponse>(
                  this, METHODID_LIST_TIME_SERIES)))
          .addMethod(
            METHOD_CREATE_TIME_SERIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.CreateTimeSeriesRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_TIME_SERIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceStub extends io.grpc.stub.AbstractStub<MetricServiceStub> {
    private MetricServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMonitoredResourceDescriptor(com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMetricDescriptors(com.google.monitoring.v3.ListMetricDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_METRIC_DESCRIPTORS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMetricDescriptor(com.google.monitoring.v3.GetMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_METRIC_DESCRIPTOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](/monitoring/custom-metrics).
     * </pre>
     */
    public void createMetricDescriptor(com.google.monitoring.v3.CreateMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_METRIC_DESCRIPTOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](/monitoring/custom-metrics) can be deleted.
     * </pre>
     */
    public void deleteMetricDescriptor(com.google.monitoring.v3.DeleteMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_METRIC_DESCRIPTOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listTimeSeries(com.google.monitoring.v3.ListTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TIME_SERIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public void createTimeSeries(com.google.monitoring.v3.CreateTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TIME_SERIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceBlockingStub extends io.grpc.stub.AbstractStub<MetricServiceBlockingStub> {
    private MetricServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse listMonitoredResourceDescriptors(com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.api.MonitoredResourceDescriptor getMonitoredResourceDescriptor(com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListMetricDescriptorsResponse listMetricDescriptors(com.google.monitoring.v3.ListMetricDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_METRIC_DESCRIPTORS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.api.MetricDescriptor getMetricDescriptor(com.google.monitoring.v3.GetMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_METRIC_DESCRIPTOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](/monitoring/custom-metrics).
     * </pre>
     */
    public com.google.api.MetricDescriptor createMetricDescriptor(com.google.monitoring.v3.CreateMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_METRIC_DESCRIPTOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](/monitoring/custom-metrics) can be deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMetricDescriptor(com.google.monitoring.v3.DeleteMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_METRIC_DESCRIPTOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListTimeSeriesResponse listTimeSeries(com.google.monitoring.v3.ListTimeSeriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TIME_SERIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public com.google.protobuf.Empty createTimeSeries(com.google.monitoring.v3.CreateTimeSeriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TIME_SERIES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceFutureStub extends io.grpc.stub.AbstractStub<MetricServiceFutureStub> {
    private MetricServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetricServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetricServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse> listMonitoredResourceDescriptors(
        com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.MonitoredResourceDescriptor> getMonitoredResourceDescriptor(
        com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListMetricDescriptorsResponse> listMetricDescriptors(
        com.google.monitoring.v3.ListMetricDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_METRIC_DESCRIPTORS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.MetricDescriptor> getMetricDescriptor(
        com.google.monitoring.v3.GetMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_METRIC_DESCRIPTOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](/monitoring/custom-metrics).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.MetricDescriptor> createMetricDescriptor(
        com.google.monitoring.v3.CreateMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_METRIC_DESCRIPTOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](/monitoring/custom-metrics) can be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMetricDescriptor(
        com.google.monitoring.v3.DeleteMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_METRIC_DESCRIPTOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListTimeSeriesResponse> listTimeSeries(
        com.google.monitoring.v3.ListTimeSeriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TIME_SERIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createTimeSeries(
        com.google.monitoring.v3.CreateTimeSeriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TIME_SERIES, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS = 0;
  private static final int METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR = 1;
  private static final int METHODID_LIST_METRIC_DESCRIPTORS = 2;
  private static final int METHODID_GET_METRIC_DESCRIPTOR = 3;
  private static final int METHODID_CREATE_METRIC_DESCRIPTOR = 4;
  private static final int METHODID_DELETE_METRIC_DESCRIPTOR = 5;
  private static final int METHODID_LIST_TIME_SERIES = 6;
  private static final int METHODID_CREATE_TIME_SERIES = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS:
          serviceImpl.listMonitoredResourceDescriptors((com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>) responseObserver);
          break;
        case METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR:
          serviceImpl.getMonitoredResourceDescriptor((com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor>) responseObserver);
          break;
        case METHODID_LIST_METRIC_DESCRIPTORS:
          serviceImpl.listMetricDescriptors((com.google.monitoring.v3.ListMetricDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse>) responseObserver);
          break;
        case METHODID_GET_METRIC_DESCRIPTOR:
          serviceImpl.getMetricDescriptor((com.google.monitoring.v3.GetMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor>) responseObserver);
          break;
        case METHODID_CREATE_METRIC_DESCRIPTOR:
          serviceImpl.createMetricDescriptor((com.google.monitoring.v3.CreateMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor>) responseObserver);
          break;
        case METHODID_DELETE_METRIC_DESCRIPTOR:
          serviceImpl.deleteMetricDescriptor((com.google.monitoring.v3.DeleteMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TIME_SERIES:
          serviceImpl.listTimeSeries((com.google.monitoring.v3.ListTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse>) responseObserver);
          break;
        case METHODID_CREATE_TIME_SERIES:
          serviceImpl.createTimeSeries((com.google.monitoring.v3.CreateTimeSeriesRequest) request,
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

  private static final class MetricServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetricServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetricServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_MONITORED_RESOURCE_DESCRIPTORS)
              .addMethod(METHOD_GET_MONITORED_RESOURCE_DESCRIPTOR)
              .addMethod(METHOD_LIST_METRIC_DESCRIPTORS)
              .addMethod(METHOD_GET_METRIC_DESCRIPTOR)
              .addMethod(METHOD_CREATE_METRIC_DESCRIPTOR)
              .addMethod(METHOD_DELETE_METRIC_DESCRIPTOR)
              .addMethod(METHOD_LIST_TIME_SERIES)
              .addMethod(METHOD_CREATE_TIME_SERIES)
              .build();
        }
      }
    }
    return result;
  }
}
