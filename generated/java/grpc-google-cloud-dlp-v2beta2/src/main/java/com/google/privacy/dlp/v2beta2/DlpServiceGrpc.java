package com.google.privacy.dlp.v2beta2;

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
 * The DLP API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other
 * privacy-sensitive data in user-supplied, unstructured data streams, like text
 * blocks or images.
 * The service also includes methods for sensitive data redaction and
 * scheduling of data scans on Google Cloud Platform based data sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/privacy/dlp/v2beta2/dlp.proto")
public final class DlpServiceGrpc {

  private DlpServiceGrpc() {}

  public static final String SERVICE_NAME = "google.privacy.dlp.v2beta2.DlpService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest,
      com.google.privacy.dlp.v2beta2.InspectContentResponse> METHOD_INSPECT_CONTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "InspectContent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectContentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectContentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest,
      com.google.privacy.dlp.v2beta2.RedactImageResponse> METHOD_REDACT_IMAGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "RedactImage"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.RedactImageRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.RedactImageResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> METHOD_DEIDENTIFY_CONTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "DeidentifyContent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeidentifyContentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> METHOD_REIDENTIFY_CONTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "ReidentifyContent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ReidentifyContentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_INSPECT_DATA_SOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "InspectDataSource"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_ANALYZE_DATA_SOURCE_RISK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "AnalyzeDataSourceRisk"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> METHOD_LIST_INFO_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "ListInfoTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_CREATE_INSPECT_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "CreateInspectTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_UPDATE_INSPECT_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "UpdateInspectTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_GET_INSPECT_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "GetInspectTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> METHOD_LIST_INSPECT_TEMPLATES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "ListInspectTemplates"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
      com.google.protobuf.Empty> METHOD_DELETE_INSPECT_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "DeleteInspectTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_CREATE_DEIDENTIFY_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "CreateDeidentifyTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_UPDATE_DEIDENTIFY_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "UpdateDeidentifyTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_GET_DEIDENTIFY_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "GetDeidentifyTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> METHOD_LIST_DEIDENTIFY_TEMPLATES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "ListDeidentifyTemplates"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DEIDENTIFY_TEMPLATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "DeleteDeidentifyTemplate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
      com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> METHOD_LIST_DLP_JOBS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "ListDlpJobs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.ListDlpJobsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_GET_DLP_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "GetDlpJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.GetDlpJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DLP_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "DeleteDlpJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
      com.google.protobuf.Empty> METHOD_CANCEL_DLP_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta2.DlpService", "CancelDlpJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta2.CancelDlpJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DlpServiceStub newStub(io.grpc.Channel channel) {
    return new DlpServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DlpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DlpServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DlpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DlpServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The DLP API is a service that allows clients
   * to detect the presence of Personally Identifiable Information (PII) and other
   * privacy-sensitive data in user-supplied, unstructured data streams, like text
   * blocks or images.
   * The service also includes methods for sensitive data redaction and
   * scheduling of data scans on Google Cloud Platform based data sets.
   * </pre>
   */
  public static abstract class DlpServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Finds potentially sensitive info in content.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide for text](/dlp/docs/inspecting-text), [How-to guide for
     * images](/dlp/docs/inspecting-images)
     * </pre>
     */
    public void inspectContent(com.google.privacy.dlp.v2beta2.InspectContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSPECT_CONTENT, responseObserver);
    }

    /**
     * <pre>
     * Redacts potentially sensitive info from an image.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide](/dlp/docs/redacting-sensitive-data-images)
     * </pre>
     */
    public void redactImage(com.google.privacy.dlp.v2beta2.RedactImageRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.RedactImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REDACT_IMAGE, responseObserver);
    }

    /**
     * <pre>
     * De-identifies potentially sensitive info from a ContentItem.
     * This method has limits on input size and output size.
     * [How-to guide](/dlp/docs/deidentify-sensitive-data)
     * </pre>
     */
    public void deidentifyContent(com.google.privacy.dlp.v2beta2.DeidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEIDENTIFY_CONTENT, responseObserver);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public void reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REIDENTIFY_CONTENT, responseObserver);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public void inspectDataSource(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSPECT_DATA_SOURCE, responseObserver);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public void analyzeDataSourceRisk(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANALYZE_DATA_SOURCE_RISK, responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INFO_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public void createInspectTemplate(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_INSPECT_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_INSPECT_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INSPECT_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSPECT_TEMPLATES, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INSPECT_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public void createDeidentifyTemplate(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DEIDENTIFY_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DEIDENTIFY_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEIDENTIFY_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DEIDENTIFY_TEMPLATES, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEIDENTIFY_TEMPLATE, responseObserver);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public void listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DLP_JOBS, responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public void getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DLP_JOB, responseObserver);
    }

    /**
     * <pre>
     * Deletes a long-running DlpJob. This method indicates that the client is
     * no longer interested in the DlpJob result. The job will be cancelled if
     * possible.
     * </pre>
     */
    public void deleteDlpJob(com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DLP_JOB, responseObserver);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running DlpJob.  The server
     * makes a best effort to cancel the DlpJob, but success is not
     * guaranteed.
     * </pre>
     */
    public void cancelDlpJob(com.google.privacy.dlp.v2beta2.CancelDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_DLP_JOB, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INSPECT_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.InspectContentRequest,
                com.google.privacy.dlp.v2beta2.InspectContentResponse>(
                  this, METHODID_INSPECT_CONTENT)))
          .addMethod(
            METHOD_REDACT_IMAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.RedactImageRequest,
                com.google.privacy.dlp.v2beta2.RedactImageResponse>(
                  this, METHODID_REDACT_IMAGE)))
          .addMethod(
            METHOD_DEIDENTIFY_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyContentResponse>(
                  this, METHODID_DEIDENTIFY_CONTENT)))
          .addMethod(
            METHOD_REIDENTIFY_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
                com.google.privacy.dlp.v2beta2.ReidentifyContentResponse>(
                  this, METHODID_REIDENTIFY_CONTENT)))
          .addMethod(
            METHOD_INSPECT_DATA_SOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_INSPECT_DATA_SOURCE)))
          .addMethod(
            METHOD_ANALYZE_DATA_SOURCE_RISK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_ANALYZE_DATA_SOURCE_RISK)))
          .addMethod(
            METHOD_LIST_INFO_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
                com.google.privacy.dlp.v2beta2.ListInfoTypesResponse>(
                  this, METHODID_LIST_INFO_TYPES)))
          .addMethod(
            METHOD_CREATE_INSPECT_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_CREATE_INSPECT_TEMPLATE)))
          .addMethod(
            METHOD_UPDATE_INSPECT_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_UPDATE_INSPECT_TEMPLATE)))
          .addMethod(
            METHOD_GET_INSPECT_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_GET_INSPECT_TEMPLATE)))
          .addMethod(
            METHOD_LIST_INSPECT_TEMPLATES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
                com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse>(
                  this, METHODID_LIST_INSPECT_TEMPLATES)))
          .addMethod(
            METHOD_DELETE_INSPECT_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INSPECT_TEMPLATE)))
          .addMethod(
            METHOD_CREATE_DEIDENTIFY_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_CREATE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            METHOD_UPDATE_DEIDENTIFY_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_UPDATE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            METHOD_GET_DEIDENTIFY_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_GET_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            METHOD_LIST_DEIDENTIFY_TEMPLATES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
                com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse>(
                  this, METHODID_LIST_DEIDENTIFY_TEMPLATES)))
          .addMethod(
            METHOD_DELETE_DEIDENTIFY_TEMPLATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            METHOD_LIST_DLP_JOBS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
                com.google.privacy.dlp.v2beta2.ListDlpJobsResponse>(
                  this, METHODID_LIST_DLP_JOBS)))
          .addMethod(
            METHOD_GET_DLP_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_GET_DLP_JOB)))
          .addMethod(
            METHOD_DELETE_DLP_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DLP_JOB)))
          .addMethod(
            METHOD_CANCEL_DLP_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_DLP_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   * The DLP API is a service that allows clients
   * to detect the presence of Personally Identifiable Information (PII) and other
   * privacy-sensitive data in user-supplied, unstructured data streams, like text
   * blocks or images.
   * The service also includes methods for sensitive data redaction and
   * scheduling of data scans on Google Cloud Platform based data sets.
   * </pre>
   */
  public static final class DlpServiceStub extends io.grpc.stub.AbstractStub<DlpServiceStub> {
    private DlpServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DlpServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DlpServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DlpServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Finds potentially sensitive info in content.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide for text](/dlp/docs/inspecting-text), [How-to guide for
     * images](/dlp/docs/inspecting-images)
     * </pre>
     */
    public void inspectContent(com.google.privacy.dlp.v2beta2.InspectContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSPECT_CONTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redacts potentially sensitive info from an image.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide](/dlp/docs/redacting-sensitive-data-images)
     * </pre>
     */
    public void redactImage(com.google.privacy.dlp.v2beta2.RedactImageRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.RedactImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REDACT_IMAGE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * De-identifies potentially sensitive info from a ContentItem.
     * This method has limits on input size and output size.
     * [How-to guide](/dlp/docs/deidentify-sensitive-data)
     * </pre>
     */
    public void deidentifyContent(com.google.privacy.dlp.v2beta2.DeidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEIDENTIFY_CONTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public void reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REIDENTIFY_CONTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public void inspectDataSource(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSPECT_DATA_SOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public void analyzeDataSourceRisk(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_DATA_SOURCE_RISK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INFO_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public void createInspectTemplate(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSPECT_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INSPECT_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INSPECT_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSPECT_TEMPLATES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSPECT_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public void createDeidentifyTemplate(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DEIDENTIFY_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DEIDENTIFY_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEIDENTIFY_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DEIDENTIFY_TEMPLATES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEIDENTIFY_TEMPLATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public void listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DLP_JOBS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public void getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DLP_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a long-running DlpJob. This method indicates that the client is
     * no longer interested in the DlpJob result. The job will be cancelled if
     * possible.
     * </pre>
     */
    public void deleteDlpJob(com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DLP_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running DlpJob.  The server
     * makes a best effort to cancel the DlpJob, but success is not
     * guaranteed.
     * </pre>
     */
    public void cancelDlpJob(com.google.privacy.dlp.v2beta2.CancelDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_DLP_JOB, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The DLP API is a service that allows clients
   * to detect the presence of Personally Identifiable Information (PII) and other
   * privacy-sensitive data in user-supplied, unstructured data streams, like text
   * blocks or images.
   * The service also includes methods for sensitive data redaction and
   * scheduling of data scans on Google Cloud Platform based data sets.
   * </pre>
   */
  public static final class DlpServiceBlockingStub extends io.grpc.stub.AbstractStub<DlpServiceBlockingStub> {
    private DlpServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DlpServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DlpServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DlpServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Finds potentially sensitive info in content.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide for text](/dlp/docs/inspecting-text), [How-to guide for
     * images](/dlp/docs/inspecting-images)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectContentResponse inspectContent(com.google.privacy.dlp.v2beta2.InspectContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSPECT_CONTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Redacts potentially sensitive info from an image.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide](/dlp/docs/redacting-sensitive-data-images)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.RedactImageResponse redactImage(com.google.privacy.dlp.v2beta2.RedactImageRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REDACT_IMAGE, getCallOptions(), request);
    }

    /**
     * <pre>
     * De-identifies potentially sensitive info from a ContentItem.
     * This method has limits on input size and output size.
     * [How-to guide](/dlp/docs/deidentify-sensitive-data)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyContentResponse deidentifyContent(com.google.privacy.dlp.v2beta2.DeidentifyContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEIDENTIFY_CONTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ReidentifyContentResponse reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REIDENTIFY_CONTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob inspectDataSource(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSPECT_DATA_SOURCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob analyzeDataSourceRisk(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_DATA_SOURCE_RISK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INFO_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate createInspectTemplate(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_INSPECT_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_INSPECT_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INSPECT_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSPECT_TEMPLATES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.protobuf.Empty deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INSPECT_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate createDeidentifyTemplate(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DEIDENTIFY_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DEIDENTIFY_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEIDENTIFY_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DEIDENTIFY_TEMPLATES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEIDENTIFY_TEMPLATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListDlpJobsResponse listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DLP_JOBS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DLP_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a long-running DlpJob. This method indicates that the client is
     * no longer interested in the DlpJob result. The job will be cancelled if
     * possible.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDlpJob(com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DLP_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running DlpJob.  The server
     * makes a best effort to cancel the DlpJob, but success is not
     * guaranteed.
     * </pre>
     */
    public com.google.protobuf.Empty cancelDlpJob(com.google.privacy.dlp.v2beta2.CancelDlpJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_DLP_JOB, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The DLP API is a service that allows clients
   * to detect the presence of Personally Identifiable Information (PII) and other
   * privacy-sensitive data in user-supplied, unstructured data streams, like text
   * blocks or images.
   * The service also includes methods for sensitive data redaction and
   * scheduling of data scans on Google Cloud Platform based data sets.
   * </pre>
   */
  public static final class DlpServiceFutureStub extends io.grpc.stub.AbstractStub<DlpServiceFutureStub> {
    private DlpServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DlpServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DlpServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DlpServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Finds potentially sensitive info in content.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide for text](/dlp/docs/inspecting-text), [How-to guide for
     * images](/dlp/docs/inspecting-images)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectContentResponse> inspectContent(
        com.google.privacy.dlp.v2beta2.InspectContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSPECT_CONTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Redacts potentially sensitive info from an image.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide](/dlp/docs/redacting-sensitive-data-images)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.RedactImageResponse> redactImage(
        com.google.privacy.dlp.v2beta2.RedactImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REDACT_IMAGE, getCallOptions()), request);
    }

    /**
     * <pre>
     * De-identifies potentially sensitive info from a ContentItem.
     * This method has limits on input size and output size.
     * [How-to guide](/dlp/docs/deidentify-sensitive-data)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> deidentifyContent(
        com.google.privacy.dlp.v2beta2.DeidentifyContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEIDENTIFY_CONTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> reidentifyContent(
        com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REIDENTIFY_CONTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DlpJob> inspectDataSource(
        com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSPECT_DATA_SOURCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DlpJob> analyzeDataSourceRisk(
        com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_DATA_SOURCE_RISK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> listInfoTypes(
        com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INFO_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectTemplate> createInspectTemplate(
        com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSPECT_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectTemplate> updateInspectTemplate(
        com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INSPECT_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectTemplate> getInspectTemplate(
        com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INSPECT_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> listInspectTemplates(
        com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSPECT_TEMPLATES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInspectTemplate(
        com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INSPECT_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> createDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DEIDENTIFY_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> updateDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DEIDENTIFY_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEIDENTIFY_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> listDeidentifyTemplates(
        com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DEIDENTIFY_TEMPLATES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEIDENTIFY_TEMPLATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> listDlpJobs(
        com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DLP_JOBS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DlpJob> getDlpJob(
        com.google.privacy.dlp.v2beta2.GetDlpJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DLP_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a long-running DlpJob. This method indicates that the client is
     * no longer interested in the DlpJob result. The job will be cancelled if
     * possible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDlpJob(
        com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DLP_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts asynchronous cancellation on a long-running DlpJob.  The server
     * makes a best effort to cancel the DlpJob, but success is not
     * guaranteed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelDlpJob(
        com.google.privacy.dlp.v2beta2.CancelDlpJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_DLP_JOB, getCallOptions()), request);
    }
  }

  private static final int METHODID_INSPECT_CONTENT = 0;
  private static final int METHODID_REDACT_IMAGE = 1;
  private static final int METHODID_DEIDENTIFY_CONTENT = 2;
  private static final int METHODID_REIDENTIFY_CONTENT = 3;
  private static final int METHODID_INSPECT_DATA_SOURCE = 4;
  private static final int METHODID_ANALYZE_DATA_SOURCE_RISK = 5;
  private static final int METHODID_LIST_INFO_TYPES = 6;
  private static final int METHODID_CREATE_INSPECT_TEMPLATE = 7;
  private static final int METHODID_UPDATE_INSPECT_TEMPLATE = 8;
  private static final int METHODID_GET_INSPECT_TEMPLATE = 9;
  private static final int METHODID_LIST_INSPECT_TEMPLATES = 10;
  private static final int METHODID_DELETE_INSPECT_TEMPLATE = 11;
  private static final int METHODID_CREATE_DEIDENTIFY_TEMPLATE = 12;
  private static final int METHODID_UPDATE_DEIDENTIFY_TEMPLATE = 13;
  private static final int METHODID_GET_DEIDENTIFY_TEMPLATE = 14;
  private static final int METHODID_LIST_DEIDENTIFY_TEMPLATES = 15;
  private static final int METHODID_DELETE_DEIDENTIFY_TEMPLATE = 16;
  private static final int METHODID_LIST_DLP_JOBS = 17;
  private static final int METHODID_GET_DLP_JOB = 18;
  private static final int METHODID_DELETE_DLP_JOB = 19;
  private static final int METHODID_CANCEL_DLP_JOB = 20;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DlpServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DlpServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSPECT_CONTENT:
          serviceImpl.inspectContent((com.google.privacy.dlp.v2beta2.InspectContentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectContentResponse>) responseObserver);
          break;
        case METHODID_REDACT_IMAGE:
          serviceImpl.redactImage((com.google.privacy.dlp.v2beta2.RedactImageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.RedactImageResponse>) responseObserver);
          break;
        case METHODID_DEIDENTIFY_CONTENT:
          serviceImpl.deidentifyContent((com.google.privacy.dlp.v2beta2.DeidentifyContentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyContentResponse>) responseObserver);
          break;
        case METHODID_REIDENTIFY_CONTENT:
          serviceImpl.reidentifyContent((com.google.privacy.dlp.v2beta2.ReidentifyContentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse>) responseObserver);
          break;
        case METHODID_INSPECT_DATA_SOURCE:
          serviceImpl.inspectDataSource((com.google.privacy.dlp.v2beta2.InspectDataSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob>) responseObserver);
          break;
        case METHODID_ANALYZE_DATA_SOURCE_RISK:
          serviceImpl.analyzeDataSourceRisk((com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob>) responseObserver);
          break;
        case METHODID_LIST_INFO_TYPES:
          serviceImpl.listInfoTypes((com.google.privacy.dlp.v2beta2.ListInfoTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse>) responseObserver);
          break;
        case METHODID_CREATE_INSPECT_TEMPLATE:
          serviceImpl.createInspectTemplate((com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate>) responseObserver);
          break;
        case METHODID_UPDATE_INSPECT_TEMPLATE:
          serviceImpl.updateInspectTemplate((com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate>) responseObserver);
          break;
        case METHODID_GET_INSPECT_TEMPLATE:
          serviceImpl.getInspectTemplate((com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate>) responseObserver);
          break;
        case METHODID_LIST_INSPECT_TEMPLATES:
          serviceImpl.listInspectTemplates((com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse>) responseObserver);
          break;
        case METHODID_DELETE_INSPECT_TEMPLATE:
          serviceImpl.deleteInspectTemplate((com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_DEIDENTIFY_TEMPLATE:
          serviceImpl.createDeidentifyTemplate((com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate>) responseObserver);
          break;
        case METHODID_UPDATE_DEIDENTIFY_TEMPLATE:
          serviceImpl.updateDeidentifyTemplate((com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate>) responseObserver);
          break;
        case METHODID_GET_DEIDENTIFY_TEMPLATE:
          serviceImpl.getDeidentifyTemplate((com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate>) responseObserver);
          break;
        case METHODID_LIST_DEIDENTIFY_TEMPLATES:
          serviceImpl.listDeidentifyTemplates((com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEIDENTIFY_TEMPLATE:
          serviceImpl.deleteDeidentifyTemplate((com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_DLP_JOBS:
          serviceImpl.listDlpJobs((com.google.privacy.dlp.v2beta2.ListDlpJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse>) responseObserver);
          break;
        case METHODID_GET_DLP_JOB:
          serviceImpl.getDlpJob((com.google.privacy.dlp.v2beta2.GetDlpJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob>) responseObserver);
          break;
        case METHODID_DELETE_DLP_JOB:
          serviceImpl.deleteDlpJob((com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_DLP_JOB:
          serviceImpl.cancelDlpJob((com.google.privacy.dlp.v2beta2.CancelDlpJobRequest) request,
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

  private static final class DlpServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DlpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DlpServiceDescriptorSupplier())
              .addMethod(METHOD_INSPECT_CONTENT)
              .addMethod(METHOD_REDACT_IMAGE)
              .addMethod(METHOD_DEIDENTIFY_CONTENT)
              .addMethod(METHOD_REIDENTIFY_CONTENT)
              .addMethod(METHOD_INSPECT_DATA_SOURCE)
              .addMethod(METHOD_ANALYZE_DATA_SOURCE_RISK)
              .addMethod(METHOD_LIST_INFO_TYPES)
              .addMethod(METHOD_CREATE_INSPECT_TEMPLATE)
              .addMethod(METHOD_UPDATE_INSPECT_TEMPLATE)
              .addMethod(METHOD_GET_INSPECT_TEMPLATE)
              .addMethod(METHOD_LIST_INSPECT_TEMPLATES)
              .addMethod(METHOD_DELETE_INSPECT_TEMPLATE)
              .addMethod(METHOD_CREATE_DEIDENTIFY_TEMPLATE)
              .addMethod(METHOD_UPDATE_DEIDENTIFY_TEMPLATE)
              .addMethod(METHOD_GET_DEIDENTIFY_TEMPLATE)
              .addMethod(METHOD_LIST_DEIDENTIFY_TEMPLATES)
              .addMethod(METHOD_DELETE_DEIDENTIFY_TEMPLATE)
              .addMethod(METHOD_LIST_DLP_JOBS)
              .addMethod(METHOD_GET_DLP_JOB)
              .addMethod(METHOD_DELETE_DLP_JOB)
              .addMethod(METHOD_CANCEL_DLP_JOB)
              .build();
        }
      }
    }
    return result;
  }
}
