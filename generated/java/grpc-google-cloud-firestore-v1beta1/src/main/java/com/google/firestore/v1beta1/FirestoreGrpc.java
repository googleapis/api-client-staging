package com.google.firestore.v1beta1;

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
 * The Cloud Firestore service.
 * This service exposes several types of comparable timestamps:
 * *    `create_time` - The time at which a document was created. Changes only
 *      when a document is deleted, then re-created. Increases in a strict
 *       monotonic fashion.
 * *    `update_time` - The time at which a document was last updated. Changes
 *      every time a document is modified. Does not change when a write results
 *      in no modifications. Increases in a strict monotonic fashion.
 * *    `read_time` - The time at which a particular state was observed. Used
 *      to denote a consistent snapshot of the database or the time at which a
 *      Document was observed to not exist.
 * *    `commit_time` - The time at which the writes in a transaction were
 *      committed. Any read with an equal or greater `read_time` is guaranteed
 *      to see the effects of the transaction.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/firestore/v1beta1/firestore.proto")
public final class FirestoreGrpc {

  private FirestoreGrpc() {}

  public static final String SERVICE_NAME = "google.firestore.v1beta1.Firestore";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.GetDocumentRequest,
      com.google.firestore.v1beta1.Document> METHOD_GET_DOCUMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "GetDocument"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.GetDocumentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.Document.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.ListDocumentsRequest,
      com.google.firestore.v1beta1.ListDocumentsResponse> METHOD_LIST_DOCUMENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "ListDocuments"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListDocumentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListDocumentsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.CreateDocumentRequest,
      com.google.firestore.v1beta1.Document> METHOD_CREATE_DOCUMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "CreateDocument"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.CreateDocumentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.Document.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.UpdateDocumentRequest,
      com.google.firestore.v1beta1.Document> METHOD_UPDATE_DOCUMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "UpdateDocument"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.UpdateDocumentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.Document.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.DeleteDocumentRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DOCUMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "DeleteDocument"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.DeleteDocumentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.BatchGetDocumentsRequest,
      com.google.firestore.v1beta1.BatchGetDocumentsResponse> METHOD_BATCH_GET_DOCUMENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "BatchGetDocuments"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.BatchGetDocumentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.BatchGetDocumentsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.BeginTransactionRequest,
      com.google.firestore.v1beta1.BeginTransactionResponse> METHOD_BEGIN_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "BeginTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.BeginTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.BeginTransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.CommitRequest,
      com.google.firestore.v1beta1.CommitResponse> METHOD_COMMIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "Commit"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.CommitRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.CommitResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.RollbackRequest,
      com.google.protobuf.Empty> METHOD_ROLLBACK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "Rollback"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.RollbackRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.RunQueryRequest,
      com.google.firestore.v1beta1.RunQueryResponse> METHOD_RUN_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "RunQuery"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.RunQueryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.RunQueryResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.WriteRequest,
      com.google.firestore.v1beta1.WriteResponse> METHOD_WRITE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "Write"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.WriteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.WriteResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.ListenRequest,
      com.google.firestore.v1beta1.ListenResponse> METHOD_LISTEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "Listen"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListenRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListenResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.firestore.v1beta1.ListCollectionIdsRequest,
      com.google.firestore.v1beta1.ListCollectionIdsResponse> METHOD_LIST_COLLECTION_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.firestore.v1beta1.Firestore", "ListCollectionIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListCollectionIdsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.firestore.v1beta1.ListCollectionIdsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FirestoreStub newStub(io.grpc.Channel channel) {
    return new FirestoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FirestoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FirestoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static FirestoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FirestoreFutureStub(channel);
  }

  /**
   * <pre>
   * The Cloud Firestore service.
   * This service exposes several types of comparable timestamps:
   * *    `create_time` - The time at which a document was created. Changes only
   *      when a document is deleted, then re-created. Increases in a strict
   *       monotonic fashion.
   * *    `update_time` - The time at which a document was last updated. Changes
   *      every time a document is modified. Does not change when a write results
   *      in no modifications. Increases in a strict monotonic fashion.
   * *    `read_time` - The time at which a particular state was observed. Used
   *      to denote a consistent snapshot of the database or the time at which a
   *      Document was observed to not exist.
   * *    `commit_time` - The time at which the writes in a transaction were
   *      committed. Any read with an equal or greater `read_time` is guaranteed
   *      to see the effects of the transaction.
   * </pre>
   */
  public static abstract class FirestoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets a single document.
     * </pre>
     */
    public void getDocument(com.google.firestore.v1beta1.GetDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DOCUMENT, responseObserver);
    }

    /**
     * <pre>
     * Lists documents.
     * </pre>
     */
    public void listDocuments(com.google.firestore.v1beta1.ListDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListDocumentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DOCUMENTS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new document.
     * </pre>
     */
    public void createDocument(com.google.firestore.v1beta1.CreateDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DOCUMENT, responseObserver);
    }

    /**
     * <pre>
     * Updates or inserts a document.
     * </pre>
     */
    public void updateDocument(com.google.firestore.v1beta1.UpdateDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DOCUMENT, responseObserver);
    }

    /**
     * <pre>
     * Deletes a document.
     * </pre>
     */
    public void deleteDocument(com.google.firestore.v1beta1.DeleteDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DOCUMENT, responseObserver);
    }

    /**
     * <pre>
     * Gets multiple documents.
     * Documents returned by this method are not guaranteed to be returned in the
     * same order that they were requested.
     * </pre>
     */
    public void batchGetDocuments(com.google.firestore.v1beta1.BatchGetDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BatchGetDocumentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_GET_DOCUMENTS, responseObserver);
    }

    /**
     * <pre>
     * Starts a new transaction.
     * </pre>
     */
    public void beginTransaction(com.google.firestore.v1beta1.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BeginTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BEGIN_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction, while optionally updating documents.
     * </pre>
     */
    public void commit(com.google.firestore.v1beta1.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.CommitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMMIT, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public void rollback(com.google.firestore.v1beta1.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK, responseObserver);
    }

    /**
     * <pre>
     * Runs a query.
     * </pre>
     */
    public void runQuery(com.google.firestore.v1beta1.RunQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.RunQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_QUERY, responseObserver);
    }

    /**
     * <pre>
     * Streams batches of document updates and deletes, in order.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.WriteRequest> write(
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.WriteResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_WRITE, responseObserver);
    }

    /**
     * <pre>
     * Listens to changes.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListenRequest> listen(
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListenResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_LISTEN, responseObserver);
    }

    /**
     * <pre>
     * Lists all the collection IDs underneath a document.
     * </pre>
     */
    public void listCollectionIds(com.google.firestore.v1beta1.ListCollectionIdsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListCollectionIdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_COLLECTION_IDS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DOCUMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.GetDocumentRequest,
                com.google.firestore.v1beta1.Document>(
                  this, METHODID_GET_DOCUMENT)))
          .addMethod(
            METHOD_LIST_DOCUMENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.ListDocumentsRequest,
                com.google.firestore.v1beta1.ListDocumentsResponse>(
                  this, METHODID_LIST_DOCUMENTS)))
          .addMethod(
            METHOD_CREATE_DOCUMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.CreateDocumentRequest,
                com.google.firestore.v1beta1.Document>(
                  this, METHODID_CREATE_DOCUMENT)))
          .addMethod(
            METHOD_UPDATE_DOCUMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.UpdateDocumentRequest,
                com.google.firestore.v1beta1.Document>(
                  this, METHODID_UPDATE_DOCUMENT)))
          .addMethod(
            METHOD_DELETE_DOCUMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.DeleteDocumentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DOCUMENT)))
          .addMethod(
            METHOD_BATCH_GET_DOCUMENTS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.BatchGetDocumentsRequest,
                com.google.firestore.v1beta1.BatchGetDocumentsResponse>(
                  this, METHODID_BATCH_GET_DOCUMENTS)))
          .addMethod(
            METHOD_BEGIN_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.BeginTransactionRequest,
                com.google.firestore.v1beta1.BeginTransactionResponse>(
                  this, METHODID_BEGIN_TRANSACTION)))
          .addMethod(
            METHOD_COMMIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.CommitRequest,
                com.google.firestore.v1beta1.CommitResponse>(
                  this, METHODID_COMMIT)))
          .addMethod(
            METHOD_ROLLBACK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.RollbackRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ROLLBACK)))
          .addMethod(
            METHOD_RUN_QUERY,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.RunQueryRequest,
                com.google.firestore.v1beta1.RunQueryResponse>(
                  this, METHODID_RUN_QUERY)))
          .addMethod(
            METHOD_WRITE,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.WriteRequest,
                com.google.firestore.v1beta1.WriteResponse>(
                  this, METHODID_WRITE)))
          .addMethod(
            METHOD_LISTEN,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.ListenRequest,
                com.google.firestore.v1beta1.ListenResponse>(
                  this, METHODID_LISTEN)))
          .addMethod(
            METHOD_LIST_COLLECTION_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.firestore.v1beta1.ListCollectionIdsRequest,
                com.google.firestore.v1beta1.ListCollectionIdsResponse>(
                  this, METHODID_LIST_COLLECTION_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Cloud Firestore service.
   * This service exposes several types of comparable timestamps:
   * *    `create_time` - The time at which a document was created. Changes only
   *      when a document is deleted, then re-created. Increases in a strict
   *       monotonic fashion.
   * *    `update_time` - The time at which a document was last updated. Changes
   *      every time a document is modified. Does not change when a write results
   *      in no modifications. Increases in a strict monotonic fashion.
   * *    `read_time` - The time at which a particular state was observed. Used
   *      to denote a consistent snapshot of the database or the time at which a
   *      Document was observed to not exist.
   * *    `commit_time` - The time at which the writes in a transaction were
   *      committed. Any read with an equal or greater `read_time` is guaranteed
   *      to see the effects of the transaction.
   * </pre>
   */
  public static final class FirestoreStub extends io.grpc.stub.AbstractStub<FirestoreStub> {
    private FirestoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FirestoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirestoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FirestoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single document.
     * </pre>
     */
    public void getDocument(com.google.firestore.v1beta1.GetDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DOCUMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists documents.
     * </pre>
     */
    public void listDocuments(com.google.firestore.v1beta1.ListDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListDocumentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new document.
     * </pre>
     */
    public void createDocument(com.google.firestore.v1beta1.CreateDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DOCUMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates or inserts a document.
     * </pre>
     */
    public void updateDocument(com.google.firestore.v1beta1.UpdateDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DOCUMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a document.
     * </pre>
     */
    public void deleteDocument(com.google.firestore.v1beta1.DeleteDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DOCUMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets multiple documents.
     * Documents returned by this method are not guaranteed to be returned in the
     * same order that they were requested.
     * </pre>
     */
    public void batchGetDocuments(com.google.firestore.v1beta1.BatchGetDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BatchGetDocumentsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_BATCH_GET_DOCUMENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a new transaction.
     * </pre>
     */
    public void beginTransaction(com.google.firestore.v1beta1.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BeginTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction, while optionally updating documents.
     * </pre>
     */
    public void commit(com.google.firestore.v1beta1.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.CommitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public void rollback(com.google.firestore.v1beta1.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs a query.
     * </pre>
     */
    public void runQuery(com.google.firestore.v1beta1.RunQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.RunQueryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_RUN_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams batches of document updates and deletes, in order.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.WriteRequest> write(
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.WriteResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_WRITE, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Listens to changes.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListenRequest> listen(
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListenResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_LISTEN, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Lists all the collection IDs underneath a document.
     * </pre>
     */
    public void listCollectionIds(com.google.firestore.v1beta1.ListCollectionIdsRequest request,
        io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListCollectionIdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_COLLECTION_IDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Cloud Firestore service.
   * This service exposes several types of comparable timestamps:
   * *    `create_time` - The time at which a document was created. Changes only
   *      when a document is deleted, then re-created. Increases in a strict
   *       monotonic fashion.
   * *    `update_time` - The time at which a document was last updated. Changes
   *      every time a document is modified. Does not change when a write results
   *      in no modifications. Increases in a strict monotonic fashion.
   * *    `read_time` - The time at which a particular state was observed. Used
   *      to denote a consistent snapshot of the database or the time at which a
   *      Document was observed to not exist.
   * *    `commit_time` - The time at which the writes in a transaction were
   *      committed. Any read with an equal or greater `read_time` is guaranteed
   *      to see the effects of the transaction.
   * </pre>
   */
  public static final class FirestoreBlockingStub extends io.grpc.stub.AbstractStub<FirestoreBlockingStub> {
    private FirestoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FirestoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirestoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FirestoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single document.
     * </pre>
     */
    public com.google.firestore.v1beta1.Document getDocument(com.google.firestore.v1beta1.GetDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DOCUMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists documents.
     * </pre>
     */
    public com.google.firestore.v1beta1.ListDocumentsResponse listDocuments(com.google.firestore.v1beta1.ListDocumentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DOCUMENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new document.
     * </pre>
     */
    public com.google.firestore.v1beta1.Document createDocument(com.google.firestore.v1beta1.CreateDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DOCUMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates or inserts a document.
     * </pre>
     */
    public com.google.firestore.v1beta1.Document updateDocument(com.google.firestore.v1beta1.UpdateDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DOCUMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a document.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDocument(com.google.firestore.v1beta1.DeleteDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DOCUMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets multiple documents.
     * Documents returned by this method are not guaranteed to be returned in the
     * same order that they were requested.
     * </pre>
     */
    public java.util.Iterator<com.google.firestore.v1beta1.BatchGetDocumentsResponse> batchGetDocuments(
        com.google.firestore.v1beta1.BatchGetDocumentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_BATCH_GET_DOCUMENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a new transaction.
     * </pre>
     */
    public com.google.firestore.v1beta1.BeginTransactionResponse beginTransaction(com.google.firestore.v1beta1.BeginTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BEGIN_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Commits a transaction, while optionally updating documents.
     * </pre>
     */
    public com.google.firestore.v1beta1.CommitResponse commit(com.google.firestore.v1beta1.CommitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMMIT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public com.google.protobuf.Empty rollback(com.google.firestore.v1beta1.RollbackRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a query.
     * </pre>
     */
    public java.util.Iterator<com.google.firestore.v1beta1.RunQueryResponse> runQuery(
        com.google.firestore.v1beta1.RunQueryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_RUN_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all the collection IDs underneath a document.
     * </pre>
     */
    public com.google.firestore.v1beta1.ListCollectionIdsResponse listCollectionIds(com.google.firestore.v1beta1.ListCollectionIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_COLLECTION_IDS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Cloud Firestore service.
   * This service exposes several types of comparable timestamps:
   * *    `create_time` - The time at which a document was created. Changes only
   *      when a document is deleted, then re-created. Increases in a strict
   *       monotonic fashion.
   * *    `update_time` - The time at which a document was last updated. Changes
   *      every time a document is modified. Does not change when a write results
   *      in no modifications. Increases in a strict monotonic fashion.
   * *    `read_time` - The time at which a particular state was observed. Used
   *      to denote a consistent snapshot of the database or the time at which a
   *      Document was observed to not exist.
   * *    `commit_time` - The time at which the writes in a transaction were
   *      committed. Any read with an equal or greater `read_time` is guaranteed
   *      to see the effects of the transaction.
   * </pre>
   */
  public static final class FirestoreFutureStub extends io.grpc.stub.AbstractStub<FirestoreFutureStub> {
    private FirestoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FirestoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FirestoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FirestoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.Document> getDocument(
        com.google.firestore.v1beta1.GetDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DOCUMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists documents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.ListDocumentsResponse> listDocuments(
        com.google.firestore.v1beta1.ListDocumentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DOCUMENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.Document> createDocument(
        com.google.firestore.v1beta1.CreateDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DOCUMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates or inserts a document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.Document> updateDocument(
        com.google.firestore.v1beta1.UpdateDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DOCUMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDocument(
        com.google.firestore.v1beta1.DeleteDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DOCUMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a new transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.BeginTransactionResponse> beginTransaction(
        com.google.firestore.v1beta1.BeginTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Commits a transaction, while optionally updating documents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.CommitResponse> commit(
        com.google.firestore.v1beta1.CommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> rollback(
        com.google.firestore.v1beta1.RollbackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all the collection IDs underneath a document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.firestore.v1beta1.ListCollectionIdsResponse> listCollectionIds(
        com.google.firestore.v1beta1.ListCollectionIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_COLLECTION_IDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCUMENT = 0;
  private static final int METHODID_LIST_DOCUMENTS = 1;
  private static final int METHODID_CREATE_DOCUMENT = 2;
  private static final int METHODID_UPDATE_DOCUMENT = 3;
  private static final int METHODID_DELETE_DOCUMENT = 4;
  private static final int METHODID_BATCH_GET_DOCUMENTS = 5;
  private static final int METHODID_BEGIN_TRANSACTION = 6;
  private static final int METHODID_COMMIT = 7;
  private static final int METHODID_ROLLBACK = 8;
  private static final int METHODID_RUN_QUERY = 9;
  private static final int METHODID_LIST_COLLECTION_IDS = 10;
  private static final int METHODID_WRITE = 11;
  private static final int METHODID_LISTEN = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FirestoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FirestoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCUMENT:
          serviceImpl.getDocument((com.google.firestore.v1beta1.GetDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document>) responseObserver);
          break;
        case METHODID_LIST_DOCUMENTS:
          serviceImpl.listDocuments((com.google.firestore.v1beta1.ListDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListDocumentsResponse>) responseObserver);
          break;
        case METHODID_CREATE_DOCUMENT:
          serviceImpl.createDocument((com.google.firestore.v1beta1.CreateDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document>) responseObserver);
          break;
        case METHODID_UPDATE_DOCUMENT:
          serviceImpl.updateDocument((com.google.firestore.v1beta1.UpdateDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.Document>) responseObserver);
          break;
        case METHODID_DELETE_DOCUMENT:
          serviceImpl.deleteDocument((com.google.firestore.v1beta1.DeleteDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_GET_DOCUMENTS:
          serviceImpl.batchGetDocuments((com.google.firestore.v1beta1.BatchGetDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BatchGetDocumentsResponse>) responseObserver);
          break;
        case METHODID_BEGIN_TRANSACTION:
          serviceImpl.beginTransaction((com.google.firestore.v1beta1.BeginTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.BeginTransactionResponse>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((com.google.firestore.v1beta1.CommitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.CommitResponse>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((com.google.firestore.v1beta1.RollbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RUN_QUERY:
          serviceImpl.runQuery((com.google.firestore.v1beta1.RunQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.RunQueryResponse>) responseObserver);
          break;
        case METHODID_LIST_COLLECTION_IDS:
          serviceImpl.listCollectionIds((com.google.firestore.v1beta1.ListCollectionIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListCollectionIdsResponse>) responseObserver);
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
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.WriteResponse>) responseObserver);
        case METHODID_LISTEN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.listen(
              (io.grpc.stub.StreamObserver<com.google.firestore.v1beta1.ListenResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class FirestoreDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.firestore.v1beta1.FirestoreProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FirestoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FirestoreDescriptorSupplier())
              .addMethod(METHOD_GET_DOCUMENT)
              .addMethod(METHOD_LIST_DOCUMENTS)
              .addMethod(METHOD_CREATE_DOCUMENT)
              .addMethod(METHOD_UPDATE_DOCUMENT)
              .addMethod(METHOD_DELETE_DOCUMENT)
              .addMethod(METHOD_BATCH_GET_DOCUMENTS)
              .addMethod(METHOD_BEGIN_TRANSACTION)
              .addMethod(METHOD_COMMIT)
              .addMethod(METHOD_ROLLBACK)
              .addMethod(METHOD_RUN_QUERY)
              .addMethod(METHOD_WRITE)
              .addMethod(METHOD_LISTEN)
              .addMethod(METHOD_LIST_COLLECTION_IDS)
              .build();
        }
      }
    }
    return result;
  }
}
