package com.google.cloud.bigquery.datatransfer.v1;

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
 * The Google BigQuery Data Transfer Service API enables BigQuery users to
 * configure the transfer of their data from other Google Products into BigQuery.
 * This service contains methods that are end user exposed. It backs up the
 * frontend.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto")
public final class DataTransferServiceGrpc {

  private DataTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.bigquery.datatransfer.v1.DataTransferService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSource> METHOD_GET_DATA_SOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "GetDataSource"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.DataSource.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse> METHOD_LIST_DATA_SOURCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "ListDataSources"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferConfig> METHOD_CREATE_TRANSFER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "CreateTransferConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.TransferConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferConfig> METHOD_UPDATE_TRANSFER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "UpdateTransferConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.TransferConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,
      com.google.protobuf.Empty> METHOD_DELETE_TRANSFER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "DeleteTransferConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferConfig> METHOD_GET_TRANSFER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "GetTransferConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.TransferConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse> METHOD_LIST_TRANSFER_CONFIGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "ListTransferConfigs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse> METHOD_SCHEDULE_TRANSFER_RUNS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "ScheduleTransferRuns"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferRun> METHOD_GET_TRANSFER_RUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "GetTransferRun"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,
      com.google.protobuf.Empty> METHOD_DELETE_TRANSFER_RUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "DeleteTransferRun"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse> METHOD_LIST_TRANSFER_RUNS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "ListTransferRuns"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse> METHOD_LIST_TRANSFER_LOGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "ListTransferLogs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,
      com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse> METHOD_CHECK_VALID_CREDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.bigquery.datatransfer.v1.DataTransferService", "CheckValidCreds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataTransferServiceStub newStub(io.grpc.Channel channel) {
    return new DataTransferServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataTransferServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DataTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataTransferServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Google BigQuery Data Transfer Service API enables BigQuery users to
   * configure the transfer of their data from other Google Products into BigQuery.
   * This service contains methods that are end user exposed. It backs up the
   * frontend.
   * </pre>
   */
  public static abstract class DataTransferServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves a supported data source and returns its settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public void getDataSource(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSource> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATA_SOURCE, responseObserver);
    }

    /**
     * <pre>
     * Lists supported data sources and returns their settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public void listDataSources(com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DATA_SOURCES, responseObserver);
    }

    /**
     * <pre>
     * Creates a new data transfer configuration.
     * </pre>
     */
    public void createTransferConfig(com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TRANSFER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Updates a data transfer configuration.
     * All fields must be set, even if they are not updated.
     * </pre>
     */
    public void updateTransferConfig(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TRANSFER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Deletes a data transfer configuration,
     * including any associated transfer runs and logs.
     * </pre>
     */
    public void deleteTransferConfig(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TRANSFER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Returns information about a data transfer config.
     * </pre>
     */
    public void getTransferConfig(com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSFER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Returns information about all data transfers in the project.
     * </pre>
     */
    public void listTransferConfigs(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRANSFER_CONFIGS, responseObserver);
    }

    /**
     * <pre>
     * Creates transfer runs for a time range [start_time, end_time].
     * For each date - or whatever granularity the data source supports - in the
     * range, one transfer run is created.
     * Note that runs are created per UTC time in the time range.
     * </pre>
     */
    public void scheduleTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SCHEDULE_TRANSFER_RUNS, responseObserver);
    }

    /**
     * <pre>
     * Returns information about the particular transfer run.
     * </pre>
     */
    public void getTransferRun(com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSFER_RUN, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified transfer run.
     * </pre>
     */
    public void deleteTransferRun(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TRANSFER_RUN, responseObserver);
    }

    /**
     * <pre>
     * Returns information about running and completed jobs.
     * </pre>
     */
    public void listTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRANSFER_RUNS, responseObserver);
    }

    /**
     * <pre>
     * Returns user facing log messages for the data transfer run.
     * </pre>
     */
    public void listTransferLogs(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRANSFER_LOGS, responseObserver);
    }

    /**
     * <pre>
     * Returns true if valid credentials exist for the given data source and
     * requesting user.
     * Some data sources doesn't support service account, so we need to talk to
     * them on behalf of the end user. This API just checks whether we have OAuth
     * token for the particular user, which is a pre-requisite before user can
     * create a transfer config.
     * </pre>
     */
    public void checkValidCreds(com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_VALID_CREDS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DATA_SOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,
                com.google.cloud.bigquery.datatransfer.v1.DataSource>(
                  this, METHODID_GET_DATA_SOURCE)))
          .addMethod(
            METHOD_LIST_DATA_SOURCES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,
                com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse>(
                  this, METHODID_LIST_DATA_SOURCES)))
          .addMethod(
            METHOD_CREATE_TRANSFER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,
                com.google.cloud.bigquery.datatransfer.v1.TransferConfig>(
                  this, METHODID_CREATE_TRANSFER_CONFIG)))
          .addMethod(
            METHOD_UPDATE_TRANSFER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,
                com.google.cloud.bigquery.datatransfer.v1.TransferConfig>(
                  this, METHODID_UPDATE_TRANSFER_CONFIG)))
          .addMethod(
            METHOD_DELETE_TRANSFER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TRANSFER_CONFIG)))
          .addMethod(
            METHOD_GET_TRANSFER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,
                com.google.cloud.bigquery.datatransfer.v1.TransferConfig>(
                  this, METHODID_GET_TRANSFER_CONFIG)))
          .addMethod(
            METHOD_LIST_TRANSFER_CONFIGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,
                com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse>(
                  this, METHODID_LIST_TRANSFER_CONFIGS)))
          .addMethod(
            METHOD_SCHEDULE_TRANSFER_RUNS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,
                com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>(
                  this, METHODID_SCHEDULE_TRANSFER_RUNS)))
          .addMethod(
            METHOD_GET_TRANSFER_RUN,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,
                com.google.cloud.bigquery.datatransfer.v1.TransferRun>(
                  this, METHODID_GET_TRANSFER_RUN)))
          .addMethod(
            METHOD_DELETE_TRANSFER_RUN,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TRANSFER_RUN)))
          .addMethod(
            METHOD_LIST_TRANSFER_RUNS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,
                com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse>(
                  this, METHODID_LIST_TRANSFER_RUNS)))
          .addMethod(
            METHOD_LIST_TRANSFER_LOGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,
                com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse>(
                  this, METHODID_LIST_TRANSFER_LOGS)))
          .addMethod(
            METHOD_CHECK_VALID_CREDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,
                com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>(
                  this, METHODID_CHECK_VALID_CREDS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Google BigQuery Data Transfer Service API enables BigQuery users to
   * configure the transfer of their data from other Google Products into BigQuery.
   * This service contains methods that are end user exposed. It backs up the
   * frontend.
   * </pre>
   */
  public static final class DataTransferServiceStub extends io.grpc.stub.AbstractStub<DataTransferServiceStub> {
    private DataTransferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a supported data source and returns its settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public void getDataSource(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATA_SOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists supported data sources and returns their settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public void listDataSources(com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DATA_SOURCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new data transfer configuration.
     * </pre>
     */
    public void createTransferConfig(com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TRANSFER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a data transfer configuration.
     * All fields must be set, even if they are not updated.
     * </pre>
     */
    public void updateTransferConfig(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TRANSFER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a data transfer configuration,
     * including any associated transfer runs and logs.
     * </pre>
     */
    public void deleteTransferConfig(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TRANSFER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about a data transfer config.
     * </pre>
     */
    public void getTransferConfig(com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about all data transfers in the project.
     * </pre>
     */
    public void listTransferConfigs(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_CONFIGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates transfer runs for a time range [start_time, end_time].
     * For each date - or whatever granularity the data source supports - in the
     * range, one transfer run is created.
     * Note that runs are created per UTC time in the time range.
     * </pre>
     */
    public void scheduleTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SCHEDULE_TRANSFER_RUNS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about the particular transfer run.
     * </pre>
     */
    public void getTransferRun(com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_RUN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified transfer run.
     * </pre>
     */
    public void deleteTransferRun(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TRANSFER_RUN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about running and completed jobs.
     * </pre>
     */
    public void listTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_RUNS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns user facing log messages for the data transfer run.
     * </pre>
     */
    public void listTransferLogs(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_LOGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns true if valid credentials exist for the given data source and
     * requesting user.
     * Some data sources doesn't support service account, so we need to talk to
     * them on behalf of the end user. This API just checks whether we have OAuth
     * token for the particular user, which is a pre-requisite before user can
     * create a transfer config.
     * </pre>
     */
    public void checkValidCreds(com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_VALID_CREDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Google BigQuery Data Transfer Service API enables BigQuery users to
   * configure the transfer of their data from other Google Products into BigQuery.
   * This service contains methods that are end user exposed. It backs up the
   * frontend.
   * </pre>
   */
  public static final class DataTransferServiceBlockingStub extends io.grpc.stub.AbstractStub<DataTransferServiceBlockingStub> {
    private DataTransferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a supported data source and returns its settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSource getDataSource(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATA_SOURCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists supported data sources and returns their settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse listDataSources(com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DATA_SOURCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new data transfer configuration.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig createTransferConfig(com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TRANSFER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a data transfer configuration.
     * All fields must be set, even if they are not updated.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig updateTransferConfig(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TRANSFER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a data transfer configuration,
     * including any associated transfer runs and logs.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTransferConfig(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TRANSFER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about a data transfer config.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfig(com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSFER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about all data transfers in the project.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse listTransferConfigs(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRANSFER_CONFIGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates transfer runs for a time range [start_time, end_time].
     * For each date - or whatever granularity the data source supports - in the
     * range, one transfer run is created.
     * Note that runs are created per UTC time in the time range.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse scheduleTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SCHEDULE_TRANSFER_RUNS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about the particular transfer run.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRun(com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSFER_RUN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified transfer run.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTransferRun(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TRANSFER_RUN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about running and completed jobs.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse listTransferRuns(com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRANSFER_RUNS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns user facing log messages for the data transfer run.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse listTransferLogs(com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRANSFER_LOGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns true if valid credentials exist for the given data source and
     * requesting user.
     * Some data sources doesn't support service account, so we need to talk to
     * them on behalf of the end user. This API just checks whether we have OAuth
     * token for the particular user, which is a pre-requisite before user can
     * create a transfer config.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse checkValidCreds(com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_VALID_CREDS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Google BigQuery Data Transfer Service API enables BigQuery users to
   * configure the transfer of their data from other Google Products into BigQuery.
   * This service contains methods that are end user exposed. It backs up the
   * frontend.
   * </pre>
   */
  public static final class DataTransferServiceFutureStub extends io.grpc.stub.AbstractStub<DataTransferServiceFutureStub> {
    private DataTransferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataTransferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataTransferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataTransferServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves a supported data source and returns its settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.DataSource> getDataSource(
        com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATA_SOURCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists supported data sources and returns their settings,
     * which can be used for UI rendering.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse> listDataSources(
        com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DATA_SOURCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new data transfer configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> createTransferConfig(
        com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TRANSFER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a data transfer configuration.
     * All fields must be set, even if they are not updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> updateTransferConfig(
        com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TRANSFER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a data transfer configuration,
     * including any associated transfer runs and logs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTransferConfig(
        com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TRANSFER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about a data transfer config.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> getTransferConfig(
        com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about all data transfers in the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse> listTransferConfigs(
        com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_CONFIGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates transfer runs for a time range [start_time, end_time].
     * For each date - or whatever granularity the data source supports - in the
     * range, one transfer run is created.
     * Note that runs are created per UTC time in the time range.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse> scheduleTransferRuns(
        com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SCHEDULE_TRANSFER_RUNS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about the particular transfer run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getTransferRun(
        com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_RUN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified transfer run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTransferRun(
        com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TRANSFER_RUN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about running and completed jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse> listTransferRuns(
        com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_RUNS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns user facing log messages for the data transfer run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse> listTransferLogs(
        com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_LOGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns true if valid credentials exist for the given data source and
     * requesting user.
     * Some data sources doesn't support service account, so we need to talk to
     * them on behalf of the end user. This API just checks whether we have OAuth
     * token for the particular user, which is a pre-requisite before user can
     * create a transfer config.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse> checkValidCreds(
        com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_VALID_CREDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATA_SOURCE = 0;
  private static final int METHODID_LIST_DATA_SOURCES = 1;
  private static final int METHODID_CREATE_TRANSFER_CONFIG = 2;
  private static final int METHODID_UPDATE_TRANSFER_CONFIG = 3;
  private static final int METHODID_DELETE_TRANSFER_CONFIG = 4;
  private static final int METHODID_GET_TRANSFER_CONFIG = 5;
  private static final int METHODID_LIST_TRANSFER_CONFIGS = 6;
  private static final int METHODID_SCHEDULE_TRANSFER_RUNS = 7;
  private static final int METHODID_GET_TRANSFER_RUN = 8;
  private static final int METHODID_DELETE_TRANSFER_RUN = 9;
  private static final int METHODID_LIST_TRANSFER_RUNS = 10;
  private static final int METHODID_LIST_TRANSFER_LOGS = 11;
  private static final int METHODID_CHECK_VALID_CREDS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataTransferServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataTransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATA_SOURCE:
          serviceImpl.getDataSource((com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSource>) responseObserver);
          break;
        case METHODID_LIST_DATA_SOURCES:
          serviceImpl.listDataSources((com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSFER_CONFIG:
          serviceImpl.createTransferConfig((com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_CONFIG:
          serviceImpl.updateTransferConfig((com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig>) responseObserver);
          break;
        case METHODID_DELETE_TRANSFER_CONFIG:
          serviceImpl.deleteTransferConfig((com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_CONFIG:
          serviceImpl.getTransferConfig((com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferConfig>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_CONFIGS:
          serviceImpl.listTransferConfigs((com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_TRANSFER_RUNS:
          serviceImpl.scheduleTransferRuns((com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_RUN:
          serviceImpl.getTransferRun((com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun>) responseObserver);
          break;
        case METHODID_DELETE_TRANSFER_RUN:
          serviceImpl.deleteTransferRun((com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_RUNS:
          serviceImpl.listTransferRuns((com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_LOGS:
          serviceImpl.listTransferLogs((com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse>) responseObserver);
          break;
        case METHODID_CHECK_VALID_CREDS:
          serviceImpl.checkValidCreds((com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>) responseObserver);
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

  private static final class DataTransferServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataTransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataTransferServiceDescriptorSupplier())
              .addMethod(METHOD_GET_DATA_SOURCE)
              .addMethod(METHOD_LIST_DATA_SOURCES)
              .addMethod(METHOD_CREATE_TRANSFER_CONFIG)
              .addMethod(METHOD_UPDATE_TRANSFER_CONFIG)
              .addMethod(METHOD_DELETE_TRANSFER_CONFIG)
              .addMethod(METHOD_GET_TRANSFER_CONFIG)
              .addMethod(METHOD_LIST_TRANSFER_CONFIGS)
              .addMethod(METHOD_SCHEDULE_TRANSFER_RUNS)
              .addMethod(METHOD_GET_TRANSFER_RUN)
              .addMethod(METHOD_DELETE_TRANSFER_RUN)
              .addMethod(METHOD_LIST_TRANSFER_RUNS)
              .addMethod(METHOD_LIST_TRANSFER_LOGS)
              .addMethod(METHOD_CHECK_VALID_CREDS)
              .build();
        }
      }
    }
    return result;
  }
}
