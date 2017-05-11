package com.google.privacy.dlp.v2beta1;

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
    comments = "Source: google/privacy/dlp/v2beta1/dlp.proto")
public final class DlpServiceGrpc {

  private DlpServiceGrpc() {}

  public static final String SERVICE_NAME = "google.privacy.dlp.v2beta1.DlpService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.InspectContentRequest,
      com.google.privacy.dlp.v2beta1.InspectContentResponse> METHOD_INSPECT_CONTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "InspectContent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.InspectContentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.InspectContentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.RedactContentRequest,
      com.google.privacy.dlp.v2beta1.RedactContentResponse> METHOD_REDACT_CONTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "RedactContent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.RedactContentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.RedactContentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest,
      com.google.longrunning.Operation> METHOD_CREATE_INSPECT_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "CreateInspectOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest,
      com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse> METHOD_LIST_INSPECT_FINDINGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "ListInspectFindings"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.ListInfoTypesRequest,
      com.google.privacy.dlp.v2beta1.ListInfoTypesResponse> METHOD_LIST_INFO_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "ListInfoTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListInfoTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListInfoTypesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest,
      com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse> METHOD_LIST_ROOT_CATEGORIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.privacy.dlp.v2beta1.DlpService", "ListRootCategories"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.getDefaultInstance()));

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
     * Find potentially sensitive info in a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public void inspectContent(com.google.privacy.dlp.v2beta1.InspectContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.InspectContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INSPECT_CONTENT, responseObserver);
    }

    /**
     * <pre>
     * Redact potentially sensitive info from a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public void redactContent(com.google.privacy.dlp.v2beta1.RedactContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.RedactContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REDACT_CONTENT, responseObserver);
    }

    /**
     * <pre>
     * Schedule a job scanning content in a Google Cloud Platform data repository.
     * </pre>
     */
    public void createInspectOperation(com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_INSPECT_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Returns list of results for given inspect operation result set id.
     * </pre>
     */
    public void listInspectFindings(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INSPECT_FINDINGS, responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types for given category.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta1.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInfoTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INFO_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of root categories of sensitive information.
     * </pre>
     */
    public void listRootCategories(com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ROOT_CATEGORIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INSPECT_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.InspectContentRequest,
                com.google.privacy.dlp.v2beta1.InspectContentResponse>(
                  this, METHODID_INSPECT_CONTENT)))
          .addMethod(
            METHOD_REDACT_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.RedactContentRequest,
                com.google.privacy.dlp.v2beta1.RedactContentResponse>(
                  this, METHODID_REDACT_CONTENT)))
          .addMethod(
            METHOD_CREATE_INSPECT_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_INSPECT_OPERATION)))
          .addMethod(
            METHOD_LIST_INSPECT_FINDINGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest,
                com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse>(
                  this, METHODID_LIST_INSPECT_FINDINGS)))
          .addMethod(
            METHOD_LIST_INFO_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.ListInfoTypesRequest,
                com.google.privacy.dlp.v2beta1.ListInfoTypesResponse>(
                  this, METHODID_LIST_INFO_TYPES)))
          .addMethod(
            METHOD_LIST_ROOT_CATEGORIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest,
                com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse>(
                  this, METHODID_LIST_ROOT_CATEGORIES)))
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
     * Find potentially sensitive info in a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public void inspectContent(com.google.privacy.dlp.v2beta1.InspectContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.InspectContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INSPECT_CONTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redact potentially sensitive info from a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public void redactContent(com.google.privacy.dlp.v2beta1.RedactContentRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.RedactContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REDACT_CONTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule a job scanning content in a Google Cloud Platform data repository.
     * </pre>
     */
    public void createInspectOperation(com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSPECT_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns list of results for given inspect operation result set id.
     * </pre>
     */
    public void listInspectFindings(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INSPECT_FINDINGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns sensitive information types for given category.
     * </pre>
     */
    public void listInfoTypes(com.google.privacy.dlp.v2beta1.ListInfoTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInfoTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INFO_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of root categories of sensitive information.
     * </pre>
     */
    public void listRootCategories(com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest request,
        io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ROOT_CATEGORIES, getCallOptions()), request, responseObserver);
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
     * Find potentially sensitive info in a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta1.InspectContentResponse inspectContent(com.google.privacy.dlp.v2beta1.InspectContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INSPECT_CONTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Redact potentially sensitive info from a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta1.RedactContentResponse redactContent(com.google.privacy.dlp.v2beta1.RedactContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REDACT_CONTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule a job scanning content in a Google Cloud Platform data repository.
     * </pre>
     */
    public com.google.longrunning.Operation createInspectOperation(com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_INSPECT_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns list of results for given inspect operation result set id.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse listInspectFindings(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INSPECT_FINDINGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns sensitive information types for given category.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta1.ListInfoTypesResponse listInfoTypes(com.google.privacy.dlp.v2beta1.ListInfoTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INFO_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of root categories of sensitive information.
     * </pre>
     */
    public com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse listRootCategories(com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ROOT_CATEGORIES, getCallOptions(), request);
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
     * Find potentially sensitive info in a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta1.InspectContentResponse> inspectContent(
        com.google.privacy.dlp.v2beta1.InspectContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INSPECT_CONTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Redact potentially sensitive info from a list of strings.
     * This method has limits on input size, processing time, and output size.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta1.RedactContentResponse> redactContent(
        com.google.privacy.dlp.v2beta1.RedactContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REDACT_CONTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule a job scanning content in a Google Cloud Platform data repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createInspectOperation(
        com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_INSPECT_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns list of results for given inspect operation result set id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse> listInspectFindings(
        com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INSPECT_FINDINGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns sensitive information types for given category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta1.ListInfoTypesResponse> listInfoTypes(
        com.google.privacy.dlp.v2beta1.ListInfoTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INFO_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of root categories of sensitive information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse> listRootCategories(
        com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ROOT_CATEGORIES, getCallOptions()), request);
    }
  }

  private static final int METHODID_INSPECT_CONTENT = 0;
  private static final int METHODID_REDACT_CONTENT = 1;
  private static final int METHODID_CREATE_INSPECT_OPERATION = 2;
  private static final int METHODID_LIST_INSPECT_FINDINGS = 3;
  private static final int METHODID_LIST_INFO_TYPES = 4;
  private static final int METHODID_LIST_ROOT_CATEGORIES = 5;

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
          serviceImpl.inspectContent((com.google.privacy.dlp.v2beta1.InspectContentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.InspectContentResponse>) responseObserver);
          break;
        case METHODID_REDACT_CONTENT:
          serviceImpl.redactContent((com.google.privacy.dlp.v2beta1.RedactContentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.RedactContentResponse>) responseObserver);
          break;
        case METHODID_CREATE_INSPECT_OPERATION:
          serviceImpl.createInspectOperation((com.google.privacy.dlp.v2beta1.CreateInspectOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_INSPECT_FINDINGS:
          serviceImpl.listInspectFindings((com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInspectFindingsResponse>) responseObserver);
          break;
        case METHODID_LIST_INFO_TYPES:
          serviceImpl.listInfoTypes((com.google.privacy.dlp.v2beta1.ListInfoTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListInfoTypesResponse>) responseObserver);
          break;
        case METHODID_LIST_ROOT_CATEGORIES:
          serviceImpl.listRootCategories((com.google.privacy.dlp.v2beta1.ListRootCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse>) responseObserver);
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
      return com.google.privacy.dlp.v2beta1.DlpProto.getDescriptor();
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
              .addMethod(METHOD_REDACT_CONTENT)
              .addMethod(METHOD_CREATE_INSPECT_OPERATION)
              .addMethod(METHOD_LIST_INSPECT_FINDINGS)
              .addMethod(METHOD_LIST_INFO_TYPES)
              .addMethod(METHOD_LIST_ROOT_CATEGORIES)
              .build();
        }
      }
    }
    return result;
  }
}
