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
 * The UptimeCheckService API is used to manage (list, create, delete, edit)
 * uptime check configurations in the Stackdriver Monitoring product. An uptime
 * check is a piece of configuration that determines which resources and
 * services to monitor for availability. These configurations can also be
 * configured interactively by navigating to the [Cloud Console]
 * (http://console.cloud.google.com), selecting the appropriate project,
 * clicking on "Monitoring" on the left-hand side to navigate to Stackdriver,
 * and then clicking on "Uptime".
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/monitoring/v3/uptime_service.proto")
public final class UptimeCheckServiceGrpc {

  private UptimeCheckServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.UptimeCheckService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,
      com.google.monitoring.v3.ListUptimeCheckConfigsResponse> METHOD_LIST_UPTIME_CHECK_CONFIGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "ListUptimeCheckConfigs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListUptimeCheckConfigsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListUptimeCheckConfigsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetUptimeCheckConfigRequest,
      com.google.monitoring.v3.UptimeCheckConfig> METHOD_GET_UPTIME_CHECK_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "GetUptimeCheckConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetUptimeCheckConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,
      com.google.monitoring.v3.UptimeCheckConfig> METHOD_CREATE_UPTIME_CHECK_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "CreateUptimeCheckConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.CreateUptimeCheckConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,
      com.google.monitoring.v3.UptimeCheckConfig> METHOD_UPDATE_UPTIME_CHECK_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "UpdateUptimeCheckConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UpdateUptimeCheckConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,
      com.google.protobuf.Empty> METHOD_DELETE_UPTIME_CHECK_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "DeleteUptimeCheckConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.DeleteUptimeCheckConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListUptimeCheckIpsRequest,
      com.google.monitoring.v3.ListUptimeCheckIpsResponse> METHOD_LIST_UPTIME_CHECK_IPS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.UptimeCheckService", "ListUptimeCheckIps"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListUptimeCheckIpsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListUptimeCheckIpsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UptimeCheckServiceStub newStub(io.grpc.Channel channel) {
    return new UptimeCheckServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UptimeCheckServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UptimeCheckServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UptimeCheckServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UptimeCheckServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The UptimeCheckService API is used to manage (list, create, delete, edit)
   * uptime check configurations in the Stackdriver Monitoring product. An uptime
   * check is a piece of configuration that determines which resources and
   * services to monitor for availability. These configurations can also be
   * configured interactively by navigating to the [Cloud Console]
   * (http://console.cloud.google.com), selecting the appropriate project,
   * clicking on "Monitoring" on the left-hand side to navigate to Stackdriver,
   * and then clicking on "Uptime".
   * </pre>
   */
  public static abstract class UptimeCheckServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the existing valid uptime check configurations for the project,
     * leaving out any invalid configurations.
     * </pre>
     */
    public void listUptimeCheckConfigs(com.google.monitoring.v3.ListUptimeCheckConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckConfigsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_UPTIME_CHECK_CONFIGS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single uptime check configuration.
     * </pre>
     */
    public void getUptimeCheckConfig(com.google.monitoring.v3.GetUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UPTIME_CHECK_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Creates a new uptime check configuration.
     * </pre>
     */
    public void createUptimeCheckConfig(com.google.monitoring.v3.CreateUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_UPTIME_CHECK_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Updates an uptime check configuration. You can either replace the entire
     * configuration with a new one or replace only certain fields in the current
     * configuration by specifying the fields to be updated via `"updateMask"`.
     * Returns the updated configuration.
     * </pre>
     */
    public void updateUptimeCheckConfig(com.google.monitoring.v3.UpdateUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_UPTIME_CHECK_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Deletes an uptime check configuration. Note that this method will fail
     * if the uptime check configuration is referenced by an alert policy or
     * other dependent configs that would be rendered invalid by the deletion.
     * </pre>
     */
    public void deleteUptimeCheckConfig(com.google.monitoring.v3.DeleteUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_UPTIME_CHECK_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of IPs that checkers run from
     * </pre>
     */
    public void listUptimeCheckIps(com.google.monitoring.v3.ListUptimeCheckIpsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckIpsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_UPTIME_CHECK_IPS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_UPTIME_CHECK_CONFIGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListUptimeCheckConfigsRequest,
                com.google.monitoring.v3.ListUptimeCheckConfigsResponse>(
                  this, METHODID_LIST_UPTIME_CHECK_CONFIGS)))
          .addMethod(
            METHOD_GET_UPTIME_CHECK_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetUptimeCheckConfigRequest,
                com.google.monitoring.v3.UptimeCheckConfig>(
                  this, METHODID_GET_UPTIME_CHECK_CONFIG)))
          .addMethod(
            METHOD_CREATE_UPTIME_CHECK_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.CreateUptimeCheckConfigRequest,
                com.google.monitoring.v3.UptimeCheckConfig>(
                  this, METHODID_CREATE_UPTIME_CHECK_CONFIG)))
          .addMethod(
            METHOD_UPDATE_UPTIME_CHECK_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,
                com.google.monitoring.v3.UptimeCheckConfig>(
                  this, METHODID_UPDATE_UPTIME_CHECK_CONFIG)))
          .addMethod(
            METHOD_DELETE_UPTIME_CHECK_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_UPTIME_CHECK_CONFIG)))
          .addMethod(
            METHOD_LIST_UPTIME_CHECK_IPS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListUptimeCheckIpsRequest,
                com.google.monitoring.v3.ListUptimeCheckIpsResponse>(
                  this, METHODID_LIST_UPTIME_CHECK_IPS)))
          .build();
    }
  }

  /**
   * <pre>
   * The UptimeCheckService API is used to manage (list, create, delete, edit)
   * uptime check configurations in the Stackdriver Monitoring product. An uptime
   * check is a piece of configuration that determines which resources and
   * services to monitor for availability. These configurations can also be
   * configured interactively by navigating to the [Cloud Console]
   * (http://console.cloud.google.com), selecting the appropriate project,
   * clicking on "Monitoring" on the left-hand side to navigate to Stackdriver,
   * and then clicking on "Uptime".
   * </pre>
   */
  public static final class UptimeCheckServiceStub extends io.grpc.stub.AbstractStub<UptimeCheckServiceStub> {
    private UptimeCheckServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UptimeCheckServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UptimeCheckServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UptimeCheckServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing valid uptime check configurations for the project,
     * leaving out any invalid configurations.
     * </pre>
     */
    public void listUptimeCheckConfigs(com.google.monitoring.v3.ListUptimeCheckConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckConfigsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_UPTIME_CHECK_CONFIGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single uptime check configuration.
     * </pre>
     */
    public void getUptimeCheckConfig(com.google.monitoring.v3.GetUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_UPTIME_CHECK_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new uptime check configuration.
     * </pre>
     */
    public void createUptimeCheckConfig(com.google.monitoring.v3.CreateUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_UPTIME_CHECK_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an uptime check configuration. You can either replace the entire
     * configuration with a new one or replace only certain fields in the current
     * configuration by specifying the fields to be updated via `"updateMask"`.
     * Returns the updated configuration.
     * </pre>
     */
    public void updateUptimeCheckConfig(com.google.monitoring.v3.UpdateUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_UPTIME_CHECK_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an uptime check configuration. Note that this method will fail
     * if the uptime check configuration is referenced by an alert policy or
     * other dependent configs that would be rendered invalid by the deletion.
     * </pre>
     */
    public void deleteUptimeCheckConfig(com.google.monitoring.v3.DeleteUptimeCheckConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_UPTIME_CHECK_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of IPs that checkers run from
     * </pre>
     */
    public void listUptimeCheckIps(com.google.monitoring.v3.ListUptimeCheckIpsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckIpsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_UPTIME_CHECK_IPS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The UptimeCheckService API is used to manage (list, create, delete, edit)
   * uptime check configurations in the Stackdriver Monitoring product. An uptime
   * check is a piece of configuration that determines which resources and
   * services to monitor for availability. These configurations can also be
   * configured interactively by navigating to the [Cloud Console]
   * (http://console.cloud.google.com), selecting the appropriate project,
   * clicking on "Monitoring" on the left-hand side to navigate to Stackdriver,
   * and then clicking on "Uptime".
   * </pre>
   */
  public static final class UptimeCheckServiceBlockingStub extends io.grpc.stub.AbstractStub<UptimeCheckServiceBlockingStub> {
    private UptimeCheckServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UptimeCheckServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UptimeCheckServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UptimeCheckServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing valid uptime check configurations for the project,
     * leaving out any invalid configurations.
     * </pre>
     */
    public com.google.monitoring.v3.ListUptimeCheckConfigsResponse listUptimeCheckConfigs(com.google.monitoring.v3.ListUptimeCheckConfigsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_UPTIME_CHECK_CONFIGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single uptime check configuration.
     * </pre>
     */
    public com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig(com.google.monitoring.v3.GetUptimeCheckConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_UPTIME_CHECK_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new uptime check configuration.
     * </pre>
     */
    public com.google.monitoring.v3.UptimeCheckConfig createUptimeCheckConfig(com.google.monitoring.v3.CreateUptimeCheckConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_UPTIME_CHECK_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an uptime check configuration. You can either replace the entire
     * configuration with a new one or replace only certain fields in the current
     * configuration by specifying the fields to be updated via `"updateMask"`.
     * Returns the updated configuration.
     * </pre>
     */
    public com.google.monitoring.v3.UptimeCheckConfig updateUptimeCheckConfig(com.google.monitoring.v3.UpdateUptimeCheckConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_UPTIME_CHECK_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an uptime check configuration. Note that this method will fail
     * if the uptime check configuration is referenced by an alert policy or
     * other dependent configs that would be rendered invalid by the deletion.
     * </pre>
     */
    public com.google.protobuf.Empty deleteUptimeCheckConfig(com.google.monitoring.v3.DeleteUptimeCheckConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_UPTIME_CHECK_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of IPs that checkers run from
     * </pre>
     */
    public com.google.monitoring.v3.ListUptimeCheckIpsResponse listUptimeCheckIps(com.google.monitoring.v3.ListUptimeCheckIpsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_UPTIME_CHECK_IPS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The UptimeCheckService API is used to manage (list, create, delete, edit)
   * uptime check configurations in the Stackdriver Monitoring product. An uptime
   * check is a piece of configuration that determines which resources and
   * services to monitor for availability. These configurations can also be
   * configured interactively by navigating to the [Cloud Console]
   * (http://console.cloud.google.com), selecting the appropriate project,
   * clicking on "Monitoring" on the left-hand side to navigate to Stackdriver,
   * and then clicking on "Uptime".
   * </pre>
   */
  public static final class UptimeCheckServiceFutureStub extends io.grpc.stub.AbstractStub<UptimeCheckServiceFutureStub> {
    private UptimeCheckServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UptimeCheckServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UptimeCheckServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UptimeCheckServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the existing valid uptime check configurations for the project,
     * leaving out any invalid configurations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListUptimeCheckConfigsResponse> listUptimeCheckConfigs(
        com.google.monitoring.v3.ListUptimeCheckConfigsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_UPTIME_CHECK_CONFIGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single uptime check configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.UptimeCheckConfig> getUptimeCheckConfig(
        com.google.monitoring.v3.GetUptimeCheckConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_UPTIME_CHECK_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new uptime check configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.UptimeCheckConfig> createUptimeCheckConfig(
        com.google.monitoring.v3.CreateUptimeCheckConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_UPTIME_CHECK_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an uptime check configuration. You can either replace the entire
     * configuration with a new one or replace only certain fields in the current
     * configuration by specifying the fields to be updated via `"updateMask"`.
     * Returns the updated configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.UptimeCheckConfig> updateUptimeCheckConfig(
        com.google.monitoring.v3.UpdateUptimeCheckConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_UPTIME_CHECK_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an uptime check configuration. Note that this method will fail
     * if the uptime check configuration is referenced by an alert policy or
     * other dependent configs that would be rendered invalid by the deletion.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUptimeCheckConfig(
        com.google.monitoring.v3.DeleteUptimeCheckConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_UPTIME_CHECK_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of IPs that checkers run from
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListUptimeCheckIpsResponse> listUptimeCheckIps(
        com.google.monitoring.v3.ListUptimeCheckIpsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_UPTIME_CHECK_IPS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_UPTIME_CHECK_CONFIGS = 0;
  private static final int METHODID_GET_UPTIME_CHECK_CONFIG = 1;
  private static final int METHODID_CREATE_UPTIME_CHECK_CONFIG = 2;
  private static final int METHODID_UPDATE_UPTIME_CHECK_CONFIG = 3;
  private static final int METHODID_DELETE_UPTIME_CHECK_CONFIG = 4;
  private static final int METHODID_LIST_UPTIME_CHECK_IPS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UptimeCheckServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UptimeCheckServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_UPTIME_CHECK_CONFIGS:
          serviceImpl.listUptimeCheckConfigs((com.google.monitoring.v3.ListUptimeCheckConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckConfigsResponse>) responseObserver);
          break;
        case METHODID_GET_UPTIME_CHECK_CONFIG:
          serviceImpl.getUptimeCheckConfig((com.google.monitoring.v3.GetUptimeCheckConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig>) responseObserver);
          break;
        case METHODID_CREATE_UPTIME_CHECK_CONFIG:
          serviceImpl.createUptimeCheckConfig((com.google.monitoring.v3.CreateUptimeCheckConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig>) responseObserver);
          break;
        case METHODID_UPDATE_UPTIME_CHECK_CONFIG:
          serviceImpl.updateUptimeCheckConfig((com.google.monitoring.v3.UpdateUptimeCheckConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.UptimeCheckConfig>) responseObserver);
          break;
        case METHODID_DELETE_UPTIME_CHECK_CONFIG:
          serviceImpl.deleteUptimeCheckConfig((com.google.monitoring.v3.DeleteUptimeCheckConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_UPTIME_CHECK_IPS:
          serviceImpl.listUptimeCheckIps((com.google.monitoring.v3.ListUptimeCheckIpsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListUptimeCheckIpsResponse>) responseObserver);
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

  private static final class UptimeCheckServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.UptimeServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UptimeCheckServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UptimeCheckServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_UPTIME_CHECK_CONFIGS)
              .addMethod(METHOD_GET_UPTIME_CHECK_CONFIG)
              .addMethod(METHOD_CREATE_UPTIME_CHECK_CONFIG)
              .addMethod(METHOD_UPDATE_UPTIME_CHECK_CONFIG)
              .addMethod(METHOD_DELETE_UPTIME_CHECK_CONFIG)
              .addMethod(METHOD_LIST_UPTIME_CHECK_IPS)
              .build();
        }
      }
    }
    return result;
  }
}
