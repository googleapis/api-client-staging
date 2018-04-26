package com.google.privacy.dlp.v2beta2;

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
 * The DLP API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other
 * privacy-sensitive data in user-supplied, unstructured data streams, like text
 * blocks or images.
 * The service also includes methods for sensitive data redaction and
 * scheduling of data scans on Google Cloud Platform based data sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/privacy/dlp/v2beta2/dlp.proto")
public final class DlpServiceGrpc {

  private DlpServiceGrpc() {}

  public static final String SERVICE_NAME = "google.privacy.dlp.v2beta2.DlpService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInspectContentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest,
      com.google.privacy.dlp.v2beta2.InspectContentResponse> METHOD_INSPECT_CONTENT = getInspectContentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest,
      com.google.privacy.dlp.v2beta2.InspectContentResponse> getInspectContentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest,
      com.google.privacy.dlp.v2beta2.InspectContentResponse> getInspectContentMethod() {
    return getInspectContentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest,
      com.google.privacy.dlp.v2beta2.InspectContentResponse> getInspectContentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectContentRequest, com.google.privacy.dlp.v2beta2.InspectContentResponse> getInspectContentMethod;
    if ((getInspectContentMethod = DlpServiceGrpc.getInspectContentMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getInspectContentMethod = DlpServiceGrpc.getInspectContentMethod) == null) {
          DlpServiceGrpc.getInspectContentMethod = getInspectContentMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.InspectContentRequest, com.google.privacy.dlp.v2beta2.InspectContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "InspectContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectContentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("InspectContent"))
                  .build();
          }
        }
     }
     return getInspectContentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRedactImageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest,
      com.google.privacy.dlp.v2beta2.RedactImageResponse> METHOD_REDACT_IMAGE = getRedactImageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest,
      com.google.privacy.dlp.v2beta2.RedactImageResponse> getRedactImageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest,
      com.google.privacy.dlp.v2beta2.RedactImageResponse> getRedactImageMethod() {
    return getRedactImageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest,
      com.google.privacy.dlp.v2beta2.RedactImageResponse> getRedactImageMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.RedactImageRequest, com.google.privacy.dlp.v2beta2.RedactImageResponse> getRedactImageMethod;
    if ((getRedactImageMethod = DlpServiceGrpc.getRedactImageMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getRedactImageMethod = DlpServiceGrpc.getRedactImageMethod) == null) {
          DlpServiceGrpc.getRedactImageMethod = getRedactImageMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.RedactImageRequest, com.google.privacy.dlp.v2beta2.RedactImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "RedactImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.RedactImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.RedactImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("RedactImage"))
                  .build();
          }
        }
     }
     return getRedactImageMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeidentifyContentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> METHOD_DEIDENTIFY_CONTENT = getDeidentifyContentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> getDeidentifyContentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> getDeidentifyContentMethod() {
    return getDeidentifyContentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> getDeidentifyContentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest, com.google.privacy.dlp.v2beta2.DeidentifyContentResponse> getDeidentifyContentMethod;
    if ((getDeidentifyContentMethod = DlpServiceGrpc.getDeidentifyContentMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getDeidentifyContentMethod = DlpServiceGrpc.getDeidentifyContentMethod) == null) {
          DlpServiceGrpc.getDeidentifyContentMethod = getDeidentifyContentMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.DeidentifyContentRequest, com.google.privacy.dlp.v2beta2.DeidentifyContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "DeidentifyContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeidentifyContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("DeidentifyContent"))
                  .build();
          }
        }
     }
     return getDeidentifyContentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReidentifyContentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> METHOD_REIDENTIFY_CONTENT = getReidentifyContentMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> getReidentifyContentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> getReidentifyContentMethod() {
    return getReidentifyContentMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
      com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> getReidentifyContentMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest, com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> getReidentifyContentMethod;
    if ((getReidentifyContentMethod = DlpServiceGrpc.getReidentifyContentMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getReidentifyContentMethod = DlpServiceGrpc.getReidentifyContentMethod) == null) {
          DlpServiceGrpc.getReidentifyContentMethod = getReidentifyContentMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ReidentifyContentRequest, com.google.privacy.dlp.v2beta2.ReidentifyContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ReidentifyContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ReidentifyContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ReidentifyContentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ReidentifyContent"))
                  .build();
          }
        }
     }
     return getReidentifyContentMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInspectDataSourceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_INSPECT_DATA_SOURCE = getInspectDataSourceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getInspectDataSourceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getInspectDataSourceMethod() {
    return getInspectDataSourceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getInspectDataSourceMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest, com.google.privacy.dlp.v2beta2.DlpJob> getInspectDataSourceMethod;
    if ((getInspectDataSourceMethod = DlpServiceGrpc.getInspectDataSourceMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getInspectDataSourceMethod = DlpServiceGrpc.getInspectDataSourceMethod) == null) {
          DlpServiceGrpc.getInspectDataSourceMethod = getInspectDataSourceMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.InspectDataSourceRequest, com.google.privacy.dlp.v2beta2.DlpJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "InspectDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectDataSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("InspectDataSource"))
                  .build();
          }
        }
     }
     return getInspectDataSourceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAnalyzeDataSourceRiskMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_ANALYZE_DATA_SOURCE_RISK = getAnalyzeDataSourceRiskMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getAnalyzeDataSourceRiskMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getAnalyzeDataSourceRiskMethod() {
    return getAnalyzeDataSourceRiskMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getAnalyzeDataSourceRiskMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest, com.google.privacy.dlp.v2beta2.DlpJob> getAnalyzeDataSourceRiskMethod;
    if ((getAnalyzeDataSourceRiskMethod = DlpServiceGrpc.getAnalyzeDataSourceRiskMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getAnalyzeDataSourceRiskMethod = DlpServiceGrpc.getAnalyzeDataSourceRiskMethod) == null) {
          DlpServiceGrpc.getAnalyzeDataSourceRiskMethod = getAnalyzeDataSourceRiskMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest, com.google.privacy.dlp.v2beta2.DlpJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "AnalyzeDataSourceRisk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("AnalyzeDataSourceRisk"))
                  .build();
          }
        }
     }
     return getAnalyzeDataSourceRiskMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListInfoTypesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> METHOD_LIST_INFO_TYPES = getListInfoTypesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> getListInfoTypesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> getListInfoTypesMethod() {
    return getListInfoTypesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> getListInfoTypesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest, com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> getListInfoTypesMethod;
    if ((getListInfoTypesMethod = DlpServiceGrpc.getListInfoTypesMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getListInfoTypesMethod = DlpServiceGrpc.getListInfoTypesMethod) == null) {
          DlpServiceGrpc.getListInfoTypesMethod = getListInfoTypesMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ListInfoTypesRequest, com.google.privacy.dlp.v2beta2.ListInfoTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ListInfoTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListInfoTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ListInfoTypes"))
                  .build();
          }
        }
     }
     return getListInfoTypesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateInspectTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_CREATE_INSPECT_TEMPLATE = getCreateInspectTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getCreateInspectTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getCreateInspectTemplateMethod() {
    return getCreateInspectTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getCreateInspectTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate> getCreateInspectTemplateMethod;
    if ((getCreateInspectTemplateMethod = DlpServiceGrpc.getCreateInspectTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getCreateInspectTemplateMethod = DlpServiceGrpc.getCreateInspectTemplateMethod) == null) {
          DlpServiceGrpc.getCreateInspectTemplateMethod = getCreateInspectTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "CreateInspectTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("CreateInspectTemplate"))
                  .build();
          }
        }
     }
     return getCreateInspectTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateInspectTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_UPDATE_INSPECT_TEMPLATE = getUpdateInspectTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getUpdateInspectTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getUpdateInspectTemplateMethod() {
    return getUpdateInspectTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getUpdateInspectTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate> getUpdateInspectTemplateMethod;
    if ((getUpdateInspectTemplateMethod = DlpServiceGrpc.getUpdateInspectTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getUpdateInspectTemplateMethod = DlpServiceGrpc.getUpdateInspectTemplateMethod) == null) {
          DlpServiceGrpc.getUpdateInspectTemplateMethod = getUpdateInspectTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "UpdateInspectTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("UpdateInspectTemplate"))
                  .build();
          }
        }
     }
     return getUpdateInspectTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetInspectTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> METHOD_GET_INSPECT_TEMPLATE = getGetInspectTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getGetInspectTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getGetInspectTemplateMethod() {
    return getGetInspectTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
      com.google.privacy.dlp.v2beta2.InspectTemplate> getGetInspectTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate> getGetInspectTemplateMethod;
    if ((getGetInspectTemplateMethod = DlpServiceGrpc.getGetInspectTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getGetInspectTemplateMethod = DlpServiceGrpc.getGetInspectTemplateMethod) == null) {
          DlpServiceGrpc.getGetInspectTemplateMethod = getGetInspectTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest, com.google.privacy.dlp.v2beta2.InspectTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "GetInspectTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.InspectTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("GetInspectTemplate"))
                  .build();
          }
        }
     }
     return getGetInspectTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListInspectTemplatesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> METHOD_LIST_INSPECT_TEMPLATES = getListInspectTemplatesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> getListInspectTemplatesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> getListInspectTemplatesMethod() {
    return getListInspectTemplatesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> getListInspectTemplatesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest, com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> getListInspectTemplatesMethod;
    if ((getListInspectTemplatesMethod = DlpServiceGrpc.getListInspectTemplatesMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getListInspectTemplatesMethod = DlpServiceGrpc.getListInspectTemplatesMethod) == null) {
          DlpServiceGrpc.getListInspectTemplatesMethod = getListInspectTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest, com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ListInspectTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ListInspectTemplates"))
                  .build();
          }
        }
     }
     return getListInspectTemplatesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteInspectTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
      com.google.protobuf.Empty> METHOD_DELETE_INSPECT_TEMPLATE = getDeleteInspectTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
      com.google.protobuf.Empty> getDeleteInspectTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
      com.google.protobuf.Empty> getDeleteInspectTemplateMethod() {
    return getDeleteInspectTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
      com.google.protobuf.Empty> getDeleteInspectTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest, com.google.protobuf.Empty> getDeleteInspectTemplateMethod;
    if ((getDeleteInspectTemplateMethod = DlpServiceGrpc.getDeleteInspectTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getDeleteInspectTemplateMethod = DlpServiceGrpc.getDeleteInspectTemplateMethod) == null) {
          DlpServiceGrpc.getDeleteInspectTemplateMethod = getDeleteInspectTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "DeleteInspectTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("DeleteInspectTemplate"))
                  .build();
          }
        }
     }
     return getDeleteInspectTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateDeidentifyTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_CREATE_DEIDENTIFY_TEMPLATE = getCreateDeidentifyTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getCreateDeidentifyTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getCreateDeidentifyTemplateMethod() {
    return getCreateDeidentifyTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getCreateDeidentifyTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getCreateDeidentifyTemplateMethod;
    if ((getCreateDeidentifyTemplateMethod = DlpServiceGrpc.getCreateDeidentifyTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getCreateDeidentifyTemplateMethod = DlpServiceGrpc.getCreateDeidentifyTemplateMethod) == null) {
          DlpServiceGrpc.getCreateDeidentifyTemplateMethod = getCreateDeidentifyTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "CreateDeidentifyTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("CreateDeidentifyTemplate"))
                  .build();
          }
        }
     }
     return getCreateDeidentifyTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateDeidentifyTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_UPDATE_DEIDENTIFY_TEMPLATE = getUpdateDeidentifyTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getUpdateDeidentifyTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getUpdateDeidentifyTemplateMethod() {
    return getUpdateDeidentifyTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getUpdateDeidentifyTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getUpdateDeidentifyTemplateMethod;
    if ((getUpdateDeidentifyTemplateMethod = DlpServiceGrpc.getUpdateDeidentifyTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getUpdateDeidentifyTemplateMethod = DlpServiceGrpc.getUpdateDeidentifyTemplateMethod) == null) {
          DlpServiceGrpc.getUpdateDeidentifyTemplateMethod = getUpdateDeidentifyTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "UpdateDeidentifyTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("UpdateDeidentifyTemplate"))
                  .build();
          }
        }
     }
     return getUpdateDeidentifyTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDeidentifyTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> METHOD_GET_DEIDENTIFY_TEMPLATE = getGetDeidentifyTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getGetDeidentifyTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getGetDeidentifyTemplateMethod() {
    return getGetDeidentifyTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
      com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getGetDeidentifyTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getGetDeidentifyTemplateMethod;
    if ((getGetDeidentifyTemplateMethod = DlpServiceGrpc.getGetDeidentifyTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getGetDeidentifyTemplateMethod = DlpServiceGrpc.getGetDeidentifyTemplateMethod) == null) {
          DlpServiceGrpc.getGetDeidentifyTemplateMethod = getGetDeidentifyTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest, com.google.privacy.dlp.v2beta2.DeidentifyTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "GetDeidentifyTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeidentifyTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("GetDeidentifyTemplate"))
                  .build();
          }
        }
     }
     return getGetDeidentifyTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDeidentifyTemplatesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> METHOD_LIST_DEIDENTIFY_TEMPLATES = getListDeidentifyTemplatesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> getListDeidentifyTemplatesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> getListDeidentifyTemplatesMethod() {
    return getListDeidentifyTemplatesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
      com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> getListDeidentifyTemplatesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest, com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> getListDeidentifyTemplatesMethod;
    if ((getListDeidentifyTemplatesMethod = DlpServiceGrpc.getListDeidentifyTemplatesMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getListDeidentifyTemplatesMethod = DlpServiceGrpc.getListDeidentifyTemplatesMethod) == null) {
          DlpServiceGrpc.getListDeidentifyTemplatesMethod = getListDeidentifyTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest, com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ListDeidentifyTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ListDeidentifyTemplates"))
                  .build();
          }
        }
     }
     return getListDeidentifyTemplatesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteDeidentifyTemplateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DEIDENTIFY_TEMPLATE = getDeleteDeidentifyTemplateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
      com.google.protobuf.Empty> getDeleteDeidentifyTemplateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
      com.google.protobuf.Empty> getDeleteDeidentifyTemplateMethod() {
    return getDeleteDeidentifyTemplateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
      com.google.protobuf.Empty> getDeleteDeidentifyTemplateMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest, com.google.protobuf.Empty> getDeleteDeidentifyTemplateMethod;
    if ((getDeleteDeidentifyTemplateMethod = DlpServiceGrpc.getDeleteDeidentifyTemplateMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getDeleteDeidentifyTemplateMethod = DlpServiceGrpc.getDeleteDeidentifyTemplateMethod) == null) {
          DlpServiceGrpc.getDeleteDeidentifyTemplateMethod = getDeleteDeidentifyTemplateMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "DeleteDeidentifyTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("DeleteDeidentifyTemplate"))
                  .build();
          }
        }
     }
     return getDeleteDeidentifyTemplateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateJobTriggerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> METHOD_CREATE_JOB_TRIGGER = getCreateJobTriggerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getCreateJobTriggerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getCreateJobTriggerMethod() {
    return getCreateJobTriggerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getCreateJobTriggerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger> getCreateJobTriggerMethod;
    if ((getCreateJobTriggerMethod = DlpServiceGrpc.getCreateJobTriggerMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getCreateJobTriggerMethod = DlpServiceGrpc.getCreateJobTriggerMethod) == null) {
          DlpServiceGrpc.getCreateJobTriggerMethod = getCreateJobTriggerMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "CreateJobTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.JobTrigger.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("CreateJobTrigger"))
                  .build();
          }
        }
     }
     return getCreateJobTriggerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateJobTriggerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> METHOD_UPDATE_JOB_TRIGGER = getUpdateJobTriggerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getUpdateJobTriggerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getUpdateJobTriggerMethod() {
    return getUpdateJobTriggerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getUpdateJobTriggerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger> getUpdateJobTriggerMethod;
    if ((getUpdateJobTriggerMethod = DlpServiceGrpc.getUpdateJobTriggerMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getUpdateJobTriggerMethod = DlpServiceGrpc.getUpdateJobTriggerMethod) == null) {
          DlpServiceGrpc.getUpdateJobTriggerMethod = getUpdateJobTriggerMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "UpdateJobTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.JobTrigger.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("UpdateJobTrigger"))
                  .build();
          }
        }
     }
     return getUpdateJobTriggerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetJobTriggerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> METHOD_GET_JOB_TRIGGER = getGetJobTriggerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getGetJobTriggerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getGetJobTriggerMethod() {
    return getGetJobTriggerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest,
      com.google.privacy.dlp.v2beta2.JobTrigger> getGetJobTriggerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger> getGetJobTriggerMethod;
    if ((getGetJobTriggerMethod = DlpServiceGrpc.getGetJobTriggerMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getGetJobTriggerMethod = DlpServiceGrpc.getGetJobTriggerMethod) == null) {
          DlpServiceGrpc.getGetJobTriggerMethod = getGetJobTriggerMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.GetJobTriggerRequest, com.google.privacy.dlp.v2beta2.JobTrigger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "GetJobTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.GetJobTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.JobTrigger.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("GetJobTrigger"))
                  .build();
          }
        }
     }
     return getGetJobTriggerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListJobTriggersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest,
      com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> METHOD_LIST_JOB_TRIGGERS = getListJobTriggersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest,
      com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> getListJobTriggersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest,
      com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> getListJobTriggersMethod() {
    return getListJobTriggersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest,
      com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> getListJobTriggersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest, com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> getListJobTriggersMethod;
    if ((getListJobTriggersMethod = DlpServiceGrpc.getListJobTriggersMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getListJobTriggersMethod = DlpServiceGrpc.getListJobTriggersMethod) == null) {
          DlpServiceGrpc.getListJobTriggersMethod = getListJobTriggersMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ListJobTriggersRequest, com.google.privacy.dlp.v2beta2.ListJobTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ListJobTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListJobTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListJobTriggersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ListJobTriggers"))
                  .build();
          }
        }
     }
     return getListJobTriggersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteJobTriggerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest,
      com.google.protobuf.Empty> METHOD_DELETE_JOB_TRIGGER = getDeleteJobTriggerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest,
      com.google.protobuf.Empty> getDeleteJobTriggerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest,
      com.google.protobuf.Empty> getDeleteJobTriggerMethod() {
    return getDeleteJobTriggerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest,
      com.google.protobuf.Empty> getDeleteJobTriggerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest, com.google.protobuf.Empty> getDeleteJobTriggerMethod;
    if ((getDeleteJobTriggerMethod = DlpServiceGrpc.getDeleteJobTriggerMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getDeleteJobTriggerMethod = DlpServiceGrpc.getDeleteJobTriggerMethod) == null) {
          DlpServiceGrpc.getDeleteJobTriggerMethod = getDeleteJobTriggerMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "DeleteJobTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("DeleteJobTrigger"))
                  .build();
          }
        }
     }
     return getDeleteJobTriggerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDlpJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
      com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> METHOD_LIST_DLP_JOBS = getListDlpJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
      com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> getListDlpJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
      com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> getListDlpJobsMethod() {
    return getListDlpJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
      com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> getListDlpJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest, com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> getListDlpJobsMethod;
    if ((getListDlpJobsMethod = DlpServiceGrpc.getListDlpJobsMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getListDlpJobsMethod = DlpServiceGrpc.getListDlpJobsMethod) == null) {
          DlpServiceGrpc.getListDlpJobsMethod = getListDlpJobsMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.ListDlpJobsRequest, com.google.privacy.dlp.v2beta2.ListDlpJobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "ListDlpJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.ListDlpJobsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("ListDlpJobs"))
                  .build();
          }
        }
     }
     return getListDlpJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDlpJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> METHOD_GET_DLP_JOB = getGetDlpJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getGetDlpJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getGetDlpJobMethod() {
    return getGetDlpJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
      com.google.privacy.dlp.v2beta2.DlpJob> getGetDlpJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.GetDlpJobRequest, com.google.privacy.dlp.v2beta2.DlpJob> getGetDlpJobMethod;
    if ((getGetDlpJobMethod = DlpServiceGrpc.getGetDlpJobMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getGetDlpJobMethod = DlpServiceGrpc.getGetDlpJobMethod) == null) {
          DlpServiceGrpc.getGetDlpJobMethod = getGetDlpJobMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.GetDlpJobRequest, com.google.privacy.dlp.v2beta2.DlpJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "GetDlpJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.GetDlpJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DlpJob.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("GetDlpJob"))
                  .build();
          }
        }
     }
     return getGetDlpJobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteDlpJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DLP_JOB = getDeleteDlpJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
      com.google.protobuf.Empty> getDeleteDlpJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
      com.google.protobuf.Empty> getDeleteDlpJobMethod() {
    return getDeleteDlpJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
      com.google.protobuf.Empty> getDeleteDlpJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest, com.google.protobuf.Empty> getDeleteDlpJobMethod;
    if ((getDeleteDlpJobMethod = DlpServiceGrpc.getDeleteDlpJobMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getDeleteDlpJobMethod = DlpServiceGrpc.getDeleteDlpJobMethod) == null) {
          DlpServiceGrpc.getDeleteDlpJobMethod = getDeleteDlpJobMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "DeleteDlpJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("DeleteDlpJob"))
                  .build();
          }
        }
     }
     return getDeleteDlpJobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCancelDlpJobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
      com.google.protobuf.Empty> METHOD_CANCEL_DLP_JOB = getCancelDlpJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
      com.google.protobuf.Empty> getCancelDlpJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
      com.google.protobuf.Empty> getCancelDlpJobMethod() {
    return getCancelDlpJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest,
      com.google.protobuf.Empty> getCancelDlpJobMethodHelper() {
    io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest, com.google.protobuf.Empty> getCancelDlpJobMethod;
    if ((getCancelDlpJobMethod = DlpServiceGrpc.getCancelDlpJobMethod) == null) {
      synchronized (DlpServiceGrpc.class) {
        if ((getCancelDlpJobMethod = DlpServiceGrpc.getCancelDlpJobMethod) == null) {
          DlpServiceGrpc.getCancelDlpJobMethod = getCancelDlpJobMethod = 
              io.grpc.MethodDescriptor.<com.google.privacy.dlp.v2beta2.CancelDlpJobRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.privacy.dlp.v2beta2.DlpService", "CancelDlpJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.privacy.dlp.v2beta2.CancelDlpJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DlpServiceMethodDescriptorSupplier("CancelDlpJob"))
                  .build();
          }
        }
     }
     return getCancelDlpJobMethod;
  }

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
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
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
      asyncUnimplementedUnaryCall(getInspectContentMethodHelper(), responseObserver);
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
      asyncUnimplementedUnaryCall(getRedactImageMethodHelper(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeidentifyContentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public void reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReidentifyContentMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public void inspectDataSource(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(getInspectDataSourceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public void analyzeDataSourceRisk(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(getAnalyzeDataSourceRiskMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInfoTypesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public void createInspectTemplate(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInspectTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInspectTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInspectTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInspectTemplatesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInspectTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public void createDeidentifyTemplate(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDeidentifyTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDeidentifyTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeidentifyTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeidentifyTemplatesMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDeidentifyTemplateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates a job to run DLP actions such as scanning storage for sensitive
     * information on a set schedule.
     * </pre>
     */
    public void createJobTrigger(com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateJobTriggerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates a job trigger.
     * </pre>
     */
    public void updateJobTrigger(com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobTriggerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets a job trigger.
     * </pre>
     */
    public void getJobTrigger(com.google.privacy.dlp.v2beta2.GetJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobTriggerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Lists job triggers.
     * </pre>
     */
    public void listJobTriggers(com.google.privacy.dlp.v2beta2.ListJobTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListJobTriggersMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a job trigger.
     * </pre>
     */
    public void deleteJobTrigger(com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteJobTriggerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public void listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListDlpJobsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public void getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDlpJobMethodHelper(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteDlpJobMethodHelper(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCancelDlpJobMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInspectContentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.InspectContentRequest,
                com.google.privacy.dlp.v2beta2.InspectContentResponse>(
                  this, METHODID_INSPECT_CONTENT)))
          .addMethod(
            getRedactImageMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.RedactImageRequest,
                com.google.privacy.dlp.v2beta2.RedactImageResponse>(
                  this, METHODID_REDACT_IMAGE)))
          .addMethod(
            getDeidentifyContentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeidentifyContentRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyContentResponse>(
                  this, METHODID_DEIDENTIFY_CONTENT)))
          .addMethod(
            getReidentifyContentMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ReidentifyContentRequest,
                com.google.privacy.dlp.v2beta2.ReidentifyContentResponse>(
                  this, METHODID_REIDENTIFY_CONTENT)))
          .addMethod(
            getInspectDataSourceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.InspectDataSourceRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_INSPECT_DATA_SOURCE)))
          .addMethod(
            getAnalyzeDataSourceRiskMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_ANALYZE_DATA_SOURCE_RISK)))
          .addMethod(
            getListInfoTypesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListInfoTypesRequest,
                com.google.privacy.dlp.v2beta2.ListInfoTypesResponse>(
                  this, METHODID_LIST_INFO_TYPES)))
          .addMethod(
            getCreateInspectTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_CREATE_INSPECT_TEMPLATE)))
          .addMethod(
            getUpdateInspectTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_UPDATE_INSPECT_TEMPLATE)))
          .addMethod(
            getGetInspectTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest,
                com.google.privacy.dlp.v2beta2.InspectTemplate>(
                  this, METHODID_GET_INSPECT_TEMPLATE)))
          .addMethod(
            getListInspectTemplatesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest,
                com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse>(
                  this, METHODID_LIST_INSPECT_TEMPLATES)))
          .addMethod(
            getDeleteInspectTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INSPECT_TEMPLATE)))
          .addMethod(
            getCreateDeidentifyTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_CREATE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            getUpdateDeidentifyTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_UPDATE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            getGetDeidentifyTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest,
                com.google.privacy.dlp.v2beta2.DeidentifyTemplate>(
                  this, METHODID_GET_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            getListDeidentifyTemplatesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest,
                com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse>(
                  this, METHODID_LIST_DEIDENTIFY_TEMPLATES)))
          .addMethod(
            getDeleteDeidentifyTemplateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEIDENTIFY_TEMPLATE)))
          .addMethod(
            getCreateJobTriggerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest,
                com.google.privacy.dlp.v2beta2.JobTrigger>(
                  this, METHODID_CREATE_JOB_TRIGGER)))
          .addMethod(
            getUpdateJobTriggerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest,
                com.google.privacy.dlp.v2beta2.JobTrigger>(
                  this, METHODID_UPDATE_JOB_TRIGGER)))
          .addMethod(
            getGetJobTriggerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetJobTriggerRequest,
                com.google.privacy.dlp.v2beta2.JobTrigger>(
                  this, METHODID_GET_JOB_TRIGGER)))
          .addMethod(
            getListJobTriggersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListJobTriggersRequest,
                com.google.privacy.dlp.v2beta2.ListJobTriggersResponse>(
                  this, METHODID_LIST_JOB_TRIGGERS)))
          .addMethod(
            getDeleteJobTriggerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_JOB_TRIGGER)))
          .addMethod(
            getListDlpJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.ListDlpJobsRequest,
                com.google.privacy.dlp.v2beta2.ListDlpJobsResponse>(
                  this, METHODID_LIST_DLP_JOBS)))
          .addMethod(
            getGetDlpJobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.GetDlpJobRequest,
                com.google.privacy.dlp.v2beta2.DlpJob>(
                  this, METHODID_GET_DLP_JOB)))
          .addMethod(
            getDeleteDlpJobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DLP_JOB)))
          .addMethod(
            getCancelDlpJobMethodHelper(),
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
          getChannel().newCall(getInspectContentMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getRedactImageMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getDeidentifyContentMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public void reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReidentifyContentMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getInspectDataSourceMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getAnalyzeDataSourceRiskMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInfoTypesMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getCreateInspectTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInspectTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.InspectTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInspectTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInspectTemplatesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInspectTemplateMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getCreateDeidentifyTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public void updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDeidentifyTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public void getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeidentifyTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public void listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeidentifyTemplatesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public void deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDeidentifyTemplateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a job to run DLP actions such as scanning storage for sensitive
     * information on a set schedule.
     * </pre>
     */
    public void createJobTrigger(com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateJobTriggerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a job trigger.
     * </pre>
     */
    public void updateJobTrigger(com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateJobTriggerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a job trigger.
     * </pre>
     */
    public void getJobTrigger(com.google.privacy.dlp.v2beta2.GetJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobTriggerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists job triggers.
     * </pre>
     */
    public void listJobTriggers(com.google.privacy.dlp.v2beta2.ListJobTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListJobTriggersMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a job trigger.
     * </pre>
     */
    public void deleteJobTrigger(com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteJobTriggerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public void listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDlpJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public void getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.DlpJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDlpJobMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getDeleteDlpJobMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getCancelDlpJobMethodHelper(), getCallOptions()), request, responseObserver);
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
          getChannel(), getInspectContentMethodHelper(), getCallOptions(), request);
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
          getChannel(), getRedactImageMethodHelper(), getCallOptions(), request);
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
          getChannel(), getDeidentifyContentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ReidentifyContentResponse reidentifyContent(com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request) {
      return blockingUnaryCall(
          getChannel(), getReidentifyContentMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](/dlp/docs/inspecting-storage)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob inspectDataSource(com.google.privacy.dlp.v2beta2.InspectDataSourceRequest request) {
      return blockingUnaryCall(
          getChannel(), getInspectDataSourceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide](/dlp/docs/compute-risk-analysis)
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob analyzeDataSourceRisk(com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnalyzeDataSourceRiskMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse listInfoTypes(com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInfoTypesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate createInspectTemplate(com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateInspectTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate updateInspectTemplate(com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInspectTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.InspectTemplate getInspectTemplate(com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInspectTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse listInspectTemplates(com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInspectTemplatesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.protobuf.Empty deleteInspectTemplate(com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInspectTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate createDeidentifyTemplate(com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDeidentifyTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate updateDeidentifyTemplate(com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDeidentifyTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DeidentifyTemplate getDeidentifyTemplate(com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDeidentifyTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse listDeidentifyTemplates(com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDeidentifyTemplatesMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDeidentifyTemplate(com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDeidentifyTemplateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a job to run DLP actions such as scanning storage for sensitive
     * information on a set schedule.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.JobTrigger createJobTrigger(com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateJobTriggerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a job trigger.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.JobTrigger updateJobTrigger(com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateJobTriggerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a job trigger.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.JobTrigger getJobTrigger(com.google.privacy.dlp.v2beta2.GetJobTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobTriggerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists job triggers.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListJobTriggersResponse listJobTriggers(com.google.privacy.dlp.v2beta2.ListJobTriggersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListJobTriggersMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a job trigger.
     * </pre>
     */
    public com.google.protobuf.Empty deleteJobTrigger(com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteJobTriggerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.ListDlpJobsResponse listDlpJobs(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDlpJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta2.DlpJob getDlpJob(com.google.privacy.dlp.v2beta2.GetDlpJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDlpJobMethodHelper(), getCallOptions(), request);
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
          getChannel(), getDeleteDlpJobMethodHelper(), getCallOptions(), request);
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
          getChannel(), getCancelDlpJobMethodHelper(), getCallOptions(), request);
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
          getChannel().newCall(getInspectContentMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getRedactImageMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getDeidentifyContentMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-identify content that has been de-identified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ReidentifyContentResponse> reidentifyContent(
        com.google.privacy.dlp.v2beta2.ReidentifyContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReidentifyContentMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getInspectDataSourceMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getAnalyzeDataSourceRiskMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns sensitive information types DLP supports.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListInfoTypesResponse> listInfoTypes(
        com.google.privacy.dlp.v2beta2.ListInfoTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInfoTypesMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getCreateInspectTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectTemplate> updateInspectTemplate(
        com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInspectTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.InspectTemplate> getInspectTemplate(
        com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInspectTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse> listInspectTemplates(
        com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInspectTemplatesMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInspectTemplate(
        com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInspectTemplateMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getCreateDeidentifyTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> updateDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDeidentifyTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an inspect template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DeidentifyTemplate> getDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeidentifyTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse> listDeidentifyTemplates(
        com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeidentifyTemplatesMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes inspect templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDeidentifyTemplate(
        com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDeidentifyTemplateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a job to run DLP actions such as scanning storage for sensitive
     * information on a set schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.JobTrigger> createJobTrigger(
        com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateJobTriggerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a job trigger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.JobTrigger> updateJobTrigger(
        com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateJobTriggerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a job trigger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.JobTrigger> getJobTrigger(
        com.google.privacy.dlp.v2beta2.GetJobTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobTriggerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists job triggers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListJobTriggersResponse> listJobTriggers(
        com.google.privacy.dlp.v2beta2.ListJobTriggersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListJobTriggersMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a job trigger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteJobTrigger(
        com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteJobTriggerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists DlpJobs that match the specified filter in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.ListDlpJobsResponse> listDlpJobs(
        com.google.privacy.dlp.v2beta2.ListDlpJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDlpJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the latest state of a long-running DlpJob.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta2.DlpJob> getDlpJob(
        com.google.privacy.dlp.v2beta2.GetDlpJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDlpJobMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getDeleteDlpJobMethodHelper(), getCallOptions()), request);
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
          getChannel().newCall(getCancelDlpJobMethodHelper(), getCallOptions()), request);
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
  private static final int METHODID_CREATE_JOB_TRIGGER = 17;
  private static final int METHODID_UPDATE_JOB_TRIGGER = 18;
  private static final int METHODID_GET_JOB_TRIGGER = 19;
  private static final int METHODID_LIST_JOB_TRIGGERS = 20;
  private static final int METHODID_DELETE_JOB_TRIGGER = 21;
  private static final int METHODID_LIST_DLP_JOBS = 22;
  private static final int METHODID_GET_DLP_JOB = 23;
  private static final int METHODID_DELETE_DLP_JOB = 24;
  private static final int METHODID_CANCEL_DLP_JOB = 25;

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
        case METHODID_CREATE_JOB_TRIGGER:
          serviceImpl.createJobTrigger((com.google.privacy.dlp.v2beta2.CreateJobTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger>) responseObserver);
          break;
        case METHODID_UPDATE_JOB_TRIGGER:
          serviceImpl.updateJobTrigger((com.google.privacy.dlp.v2beta2.UpdateJobTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger>) responseObserver);
          break;
        case METHODID_GET_JOB_TRIGGER:
          serviceImpl.getJobTrigger((com.google.privacy.dlp.v2beta2.GetJobTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.JobTrigger>) responseObserver);
          break;
        case METHODID_LIST_JOB_TRIGGERS:
          serviceImpl.listJobTriggers((com.google.privacy.dlp.v2beta2.ListJobTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta2.ListJobTriggersResponse>) responseObserver);
          break;
        case METHODID_DELETE_JOB_TRIGGER:
          serviceImpl.deleteJobTrigger((com.google.privacy.dlp.v2beta2.DeleteJobTriggerRequest) request,
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

  private static abstract class DlpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DlpServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DlpService");
    }
  }

  private static final class DlpServiceFileDescriptorSupplier
      extends DlpServiceBaseDescriptorSupplier {
    DlpServiceFileDescriptorSupplier() {}
  }

  private static final class DlpServiceMethodDescriptorSupplier
      extends DlpServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DlpServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DlpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DlpServiceFileDescriptorSupplier())
              .addMethod(getInspectContentMethodHelper())
              .addMethod(getRedactImageMethodHelper())
              .addMethod(getDeidentifyContentMethodHelper())
              .addMethod(getReidentifyContentMethodHelper())
              .addMethod(getInspectDataSourceMethodHelper())
              .addMethod(getAnalyzeDataSourceRiskMethodHelper())
              .addMethod(getListInfoTypesMethodHelper())
              .addMethod(getCreateInspectTemplateMethodHelper())
              .addMethod(getUpdateInspectTemplateMethodHelper())
              .addMethod(getGetInspectTemplateMethodHelper())
              .addMethod(getListInspectTemplatesMethodHelper())
              .addMethod(getDeleteInspectTemplateMethodHelper())
              .addMethod(getCreateDeidentifyTemplateMethodHelper())
              .addMethod(getUpdateDeidentifyTemplateMethodHelper())
              .addMethod(getGetDeidentifyTemplateMethodHelper())
              .addMethod(getListDeidentifyTemplatesMethodHelper())
              .addMethod(getDeleteDeidentifyTemplateMethodHelper())
              .addMethod(getCreateJobTriggerMethodHelper())
              .addMethod(getUpdateJobTriggerMethodHelper())
              .addMethod(getGetJobTriggerMethodHelper())
              .addMethod(getListJobTriggersMethodHelper())
              .addMethod(getDeleteJobTriggerMethodHelper())
              .addMethod(getListDlpJobsMethodHelper())
              .addMethod(getGetDlpJobMethodHelper())
              .addMethod(getDeleteDlpJobMethodHelper())
              .addMethod(getCancelDlpJobMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
