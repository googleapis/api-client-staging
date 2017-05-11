package com.google.spanner.v1;

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
 * Cloud Spanner API
 * The Cloud Spanner API can be used to manage sessions and execute
 * transactions on data stored in Cloud Spanner databases.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/spanner/v1/spanner.proto")
public final class SpannerGrpc {

  private SpannerGrpc() {}

  public static final String SERVICE_NAME = "google.spanner.v1.Spanner";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.CreateSessionRequest,
      com.google.spanner.v1.Session> METHOD_CREATE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "CreateSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.CreateSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.Session.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.GetSessionRequest,
      com.google.spanner.v1.Session> METHOD_GET_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "GetSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.GetSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.Session.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.DeleteSessionRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "DeleteSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.DeleteSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.ExecuteSqlRequest,
      com.google.spanner.v1.ResultSet> METHOD_EXECUTE_SQL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "ExecuteSql"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ExecuteSqlRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ResultSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.ExecuteSqlRequest,
      com.google.spanner.v1.PartialResultSet> METHOD_EXECUTE_STREAMING_SQL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "ExecuteStreamingSql"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ExecuteSqlRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.PartialResultSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.ReadRequest,
      com.google.spanner.v1.ResultSet> METHOD_READ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "Read"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ReadRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ResultSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.ReadRequest,
      com.google.spanner.v1.PartialResultSet> METHOD_STREAMING_READ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "StreamingRead"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.ReadRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.PartialResultSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.BeginTransactionRequest,
      com.google.spanner.v1.Transaction> METHOD_BEGIN_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "BeginTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.BeginTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.Transaction.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.CommitRequest,
      com.google.spanner.v1.CommitResponse> METHOD_COMMIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "Commit"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.CommitRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.CommitResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.spanner.v1.RollbackRequest,
      com.google.protobuf.Empty> METHOD_ROLLBACK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.spanner.v1.Spanner", "Rollback"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.spanner.v1.RollbackRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpannerStub newStub(io.grpc.Channel channel) {
    return new SpannerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpannerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpannerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SpannerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpannerFutureStub(channel);
  }

  /**
   * <pre>
   * Cloud Spanner API
   * The Cloud Spanner API can be used to manage sessions and execute
   * transactions on data stored in Cloud Spanner databases.
   * </pre>
   */
  public static abstract class SpannerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a new session. A session can be used to perform
     * transactions that read and/or modify data in a Cloud Spanner database.
     * Sessions are meant to be reused for many consecutive
     * transactions.
     * Sessions can only execute one transaction at a time. To execute
     * multiple concurrent read-write/write-only transactions, create
     * multiple sessions. Note that standalone reads and queries use a
     * transaction internally, and count toward the one transaction
     * limit.
     * Cloud Spanner limits the number of sessions that can exist at any given
     * time; thus, it is a good idea to delete idle and/or unneeded sessions.
     * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
     * operations are sent for more than an hour. If a session is deleted,
     * requests to it return `NOT_FOUND`.
     * Idle sessions can be kept alive by sending a trivial SQL query
     * periodically, e.g., `"SELECT 1"`.
     * </pre>
     */
    public void createSession(com.google.spanner.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SESSION, responseObserver);
    }

    /**
     * <pre>
     * Gets a session. Returns `NOT_FOUND` if the session does not exist.
     * This is mainly useful for determining whether a session is still
     * alive.
     * </pre>
     */
    public void getSession(com.google.spanner.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Session> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SESSION, responseObserver);
    }

    /**
     * <pre>
     * Ends a session, releasing server resources associated with it.
     * </pre>
     */
    public void deleteSession(com.google.spanner.v1.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SESSION, responseObserver);
    }

    /**
     * <pre>
     * Executes an SQL query, returning all rows in a single reply. This
     * method cannot be used to return a result set larger than 10 MiB;
     * if the query yields more data than that, the query fails with
     * a `FAILED_PRECONDITION` error.
     * Queries inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be fetched in streaming fashion by calling
     * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
     * </pre>
     */
    public void executeSql(com.google.spanner.v1.ExecuteSqlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_SQL, responseObserver);
    }

    /**
     * <pre>
     * Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result
     * set as a stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there
     * is no limit on the size of the returned result set. However, no
     * individual row in the result set can exceed 100 MiB, and no
     * column value can exceed 10 MiB.
     * </pre>
     */
    public void executeStreamingSql(com.google.spanner.v1.ExecuteSqlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_STREAMING_SQL, responseObserver);
    }

    /**
     * <pre>
     * Reads rows from the database using key lookups and scans, as a
     * simple key/value style alternative to
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].  This method cannot be used to
     * return a result set larger than 10 MiB; if the read matches more
     * data than that, the read fails with a `FAILED_PRECONDITION`
     * error.
     * Reads inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be yielded in streaming fashion by calling
     * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
     * </pre>
     */
    public void read(com.google.spanner.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ, responseObserver);
    }

    /**
     * <pre>
     * Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a
     * stream. Unlike [Read][google.spanner.v1.Spanner.Read], there is no limit on the
     * size of the returned result set. However, no individual row in
     * the result set can exceed 100 MiB, and no column value can exceed
     * 10 MiB.
     * </pre>
     */
    public void streamingRead(com.google.spanner.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STREAMING_READ, responseObserver);
    }

    /**
     * <pre>
     * Begins a new transaction. This step can often be skipped:
     * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
     * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a
     * side-effect.
     * </pre>
     */
    public void beginTransaction(com.google.spanner.v1.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BEGIN_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction. The request includes the mutations to be
     * applied to rows in the database.
     * `Commit` might return an `ABORTED` error. This can occur at any time;
     * commonly, the cause is conflicts with concurrent
     * transactions. However, it can also happen for a variety of other
     * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
     * the transaction from the beginning, re-using the same session.
     * </pre>
     */
    public void commit(com.google.spanner.v1.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.CommitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMMIT, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction, releasing any locks it holds. It is a good
     * idea to call this for any transaction that includes one or more
     * [Read][google.spanner.v1.Spanner.Read] or [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and
     * ultimately decides not to commit.
     * `Rollback` returns `OK` if it successfully aborts the transaction, the
     * transaction was already aborted, or the transaction is not
     * found. `Rollback` never returns `ABORTED`.
     * </pre>
     */
    public void rollback(com.google.spanner.v1.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.CreateSessionRequest,
                com.google.spanner.v1.Session>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            METHOD_GET_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.GetSessionRequest,
                com.google.spanner.v1.Session>(
                  this, METHODID_GET_SESSION)))
          .addMethod(
            METHOD_DELETE_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.DeleteSessionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SESSION)))
          .addMethod(
            METHOD_EXECUTE_SQL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.ExecuteSqlRequest,
                com.google.spanner.v1.ResultSet>(
                  this, METHODID_EXECUTE_SQL)))
          .addMethod(
            METHOD_EXECUTE_STREAMING_SQL,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.spanner.v1.ExecuteSqlRequest,
                com.google.spanner.v1.PartialResultSet>(
                  this, METHODID_EXECUTE_STREAMING_SQL)))
          .addMethod(
            METHOD_READ,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.ReadRequest,
                com.google.spanner.v1.ResultSet>(
                  this, METHODID_READ)))
          .addMethod(
            METHOD_STREAMING_READ,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.spanner.v1.ReadRequest,
                com.google.spanner.v1.PartialResultSet>(
                  this, METHODID_STREAMING_READ)))
          .addMethod(
            METHOD_BEGIN_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.BeginTransactionRequest,
                com.google.spanner.v1.Transaction>(
                  this, METHODID_BEGIN_TRANSACTION)))
          .addMethod(
            METHOD_COMMIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.CommitRequest,
                com.google.spanner.v1.CommitResponse>(
                  this, METHODID_COMMIT)))
          .addMethod(
            METHOD_ROLLBACK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.spanner.v1.RollbackRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ROLLBACK)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud Spanner API
   * The Cloud Spanner API can be used to manage sessions and execute
   * transactions on data stored in Cloud Spanner databases.
   * </pre>
   */
  public static final class SpannerStub extends io.grpc.stub.AbstractStub<SpannerStub> {
    private SpannerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpannerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpannerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpannerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new session. A session can be used to perform
     * transactions that read and/or modify data in a Cloud Spanner database.
     * Sessions are meant to be reused for many consecutive
     * transactions.
     * Sessions can only execute one transaction at a time. To execute
     * multiple concurrent read-write/write-only transactions, create
     * multiple sessions. Note that standalone reads and queries use a
     * transaction internally, and count toward the one transaction
     * limit.
     * Cloud Spanner limits the number of sessions that can exist at any given
     * time; thus, it is a good idea to delete idle and/or unneeded sessions.
     * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
     * operations are sent for more than an hour. If a session is deleted,
     * requests to it return `NOT_FOUND`.
     * Idle sessions can be kept alive by sending a trivial SQL query
     * periodically, e.g., `"SELECT 1"`.
     * </pre>
     */
    public void createSession(com.google.spanner.v1.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a session. Returns `NOT_FOUND` if the session does not exist.
     * This is mainly useful for determining whether a session is still
     * alive.
     * </pre>
     */
    public void getSession(com.google.spanner.v1.GetSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Session> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ends a session, releasing server resources associated with it.
     * </pre>
     */
    public void deleteSession(com.google.spanner.v1.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes an SQL query, returning all rows in a single reply. This
     * method cannot be used to return a result set larger than 10 MiB;
     * if the query yields more data than that, the query fails with
     * a `FAILED_PRECONDITION` error.
     * Queries inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be fetched in streaming fashion by calling
     * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
     * </pre>
     */
    public void executeSql(com.google.spanner.v1.ExecuteSqlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_SQL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result
     * set as a stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there
     * is no limit on the size of the returned result set. However, no
     * individual row in the result set can exceed 100 MiB, and no
     * column value can exceed 10 MiB.
     * </pre>
     */
    public void executeStreamingSql(com.google.spanner.v1.ExecuteSqlRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXECUTE_STREAMING_SQL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reads rows from the database using key lookups and scans, as a
     * simple key/value style alternative to
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].  This method cannot be used to
     * return a result set larger than 10 MiB; if the read matches more
     * data than that, the read fails with a `FAILED_PRECONDITION`
     * error.
     * Reads inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be yielded in streaming fashion by calling
     * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
     * </pre>
     */
    public void read(com.google.spanner.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a
     * stream. Unlike [Read][google.spanner.v1.Spanner.Read], there is no limit on the
     * size of the returned result set. However, no individual row in
     * the result set can exceed 100 MiB, and no column value can exceed
     * 10 MiB.
     * </pre>
     */
    public void streamingRead(com.google.spanner.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_STREAMING_READ, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Begins a new transaction. This step can often be skipped:
     * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
     * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a
     * side-effect.
     * </pre>
     */
    public void beginTransaction(com.google.spanner.v1.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction. The request includes the mutations to be
     * applied to rows in the database.
     * `Commit` might return an `ABORTED` error. This can occur at any time;
     * commonly, the cause is conflicts with concurrent
     * transactions. However, it can also happen for a variety of other
     * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
     * the transaction from the beginning, re-using the same session.
     * </pre>
     */
    public void commit(com.google.spanner.v1.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.spanner.v1.CommitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction, releasing any locks it holds. It is a good
     * idea to call this for any transaction that includes one or more
     * [Read][google.spanner.v1.Spanner.Read] or [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and
     * ultimately decides not to commit.
     * `Rollback` returns `OK` if it successfully aborts the transaction, the
     * transaction was already aborted, or the transaction is not
     * found. `Rollback` never returns `ABORTED`.
     * </pre>
     */
    public void rollback(com.google.spanner.v1.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud Spanner API
   * The Cloud Spanner API can be used to manage sessions and execute
   * transactions on data stored in Cloud Spanner databases.
   * </pre>
   */
  public static final class SpannerBlockingStub extends io.grpc.stub.AbstractStub<SpannerBlockingStub> {
    private SpannerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpannerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpannerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpannerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new session. A session can be used to perform
     * transactions that read and/or modify data in a Cloud Spanner database.
     * Sessions are meant to be reused for many consecutive
     * transactions.
     * Sessions can only execute one transaction at a time. To execute
     * multiple concurrent read-write/write-only transactions, create
     * multiple sessions. Note that standalone reads and queries use a
     * transaction internally, and count toward the one transaction
     * limit.
     * Cloud Spanner limits the number of sessions that can exist at any given
     * time; thus, it is a good idea to delete idle and/or unneeded sessions.
     * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
     * operations are sent for more than an hour. If a session is deleted,
     * requests to it return `NOT_FOUND`.
     * Idle sessions can be kept alive by sending a trivial SQL query
     * periodically, e.g., `"SELECT 1"`.
     * </pre>
     */
    public com.google.spanner.v1.Session createSession(com.google.spanner.v1.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SESSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a session. Returns `NOT_FOUND` if the session does not exist.
     * This is mainly useful for determining whether a session is still
     * alive.
     * </pre>
     */
    public com.google.spanner.v1.Session getSession(com.google.spanner.v1.GetSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SESSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Ends a session, releasing server resources associated with it.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSession(com.google.spanner.v1.DeleteSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SESSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes an SQL query, returning all rows in a single reply. This
     * method cannot be used to return a result set larger than 10 MiB;
     * if the query yields more data than that, the query fails with
     * a `FAILED_PRECONDITION` error.
     * Queries inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be fetched in streaming fashion by calling
     * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
     * </pre>
     */
    public com.google.spanner.v1.ResultSet executeSql(com.google.spanner.v1.ExecuteSqlRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_SQL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result
     * set as a stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there
     * is no limit on the size of the returned result set. However, no
     * individual row in the result set can exceed 100 MiB, and no
     * column value can exceed 10 MiB.
     * </pre>
     */
    public java.util.Iterator<com.google.spanner.v1.PartialResultSet> executeStreamingSql(
        com.google.spanner.v1.ExecuteSqlRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXECUTE_STREAMING_SQL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Reads rows from the database using key lookups and scans, as a
     * simple key/value style alternative to
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].  This method cannot be used to
     * return a result set larger than 10 MiB; if the read matches more
     * data than that, the read fails with a `FAILED_PRECONDITION`
     * error.
     * Reads inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be yielded in streaming fashion by calling
     * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
     * </pre>
     */
    public com.google.spanner.v1.ResultSet read(com.google.spanner.v1.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ, getCallOptions(), request);
    }

    /**
     * <pre>
     * Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a
     * stream. Unlike [Read][google.spanner.v1.Spanner.Read], there is no limit on the
     * size of the returned result set. However, no individual row in
     * the result set can exceed 100 MiB, and no column value can exceed
     * 10 MiB.
     * </pre>
     */
    public java.util.Iterator<com.google.spanner.v1.PartialResultSet> streamingRead(
        com.google.spanner.v1.ReadRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_STREAMING_READ, getCallOptions(), request);
    }

    /**
     * <pre>
     * Begins a new transaction. This step can often be skipped:
     * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
     * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a
     * side-effect.
     * </pre>
     */
    public com.google.spanner.v1.Transaction beginTransaction(com.google.spanner.v1.BeginTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BEGIN_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Commits a transaction. The request includes the mutations to be
     * applied to rows in the database.
     * `Commit` might return an `ABORTED` error. This can occur at any time;
     * commonly, the cause is conflicts with concurrent
     * transactions. However, it can also happen for a variety of other
     * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
     * the transaction from the beginning, re-using the same session.
     * </pre>
     */
    public com.google.spanner.v1.CommitResponse commit(com.google.spanner.v1.CommitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMMIT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Rolls back a transaction, releasing any locks it holds. It is a good
     * idea to call this for any transaction that includes one or more
     * [Read][google.spanner.v1.Spanner.Read] or [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and
     * ultimately decides not to commit.
     * `Rollback` returns `OK` if it successfully aborts the transaction, the
     * transaction was already aborted, or the transaction is not
     * found. `Rollback` never returns `ABORTED`.
     * </pre>
     */
    public com.google.protobuf.Empty rollback(com.google.spanner.v1.RollbackRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Spanner API
   * The Cloud Spanner API can be used to manage sessions and execute
   * transactions on data stored in Cloud Spanner databases.
   * </pre>
   */
  public static final class SpannerFutureStub extends io.grpc.stub.AbstractStub<SpannerFutureStub> {
    private SpannerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpannerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpannerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpannerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new session. A session can be used to perform
     * transactions that read and/or modify data in a Cloud Spanner database.
     * Sessions are meant to be reused for many consecutive
     * transactions.
     * Sessions can only execute one transaction at a time. To execute
     * multiple concurrent read-write/write-only transactions, create
     * multiple sessions. Note that standalone reads and queries use a
     * transaction internally, and count toward the one transaction
     * limit.
     * Cloud Spanner limits the number of sessions that can exist at any given
     * time; thus, it is a good idea to delete idle and/or unneeded sessions.
     * Aside from explicit deletes, Cloud Spanner can delete sessions for which no
     * operations are sent for more than an hour. If a session is deleted,
     * requests to it return `NOT_FOUND`.
     * Idle sessions can be kept alive by sending a trivial SQL query
     * periodically, e.g., `"SELECT 1"`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.Session> createSession(
        com.google.spanner.v1.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a session. Returns `NOT_FOUND` if the session does not exist.
     * This is mainly useful for determining whether a session is still
     * alive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.Session> getSession(
        com.google.spanner.v1.GetSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Ends a session, releasing server resources associated with it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSession(
        com.google.spanner.v1.DeleteSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes an SQL query, returning all rows in a single reply. This
     * method cannot be used to return a result set larger than 10 MiB;
     * if the query yields more data than that, the query fails with
     * a `FAILED_PRECONDITION` error.
     * Queries inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be fetched in streaming fashion by calling
     * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.ResultSet> executeSql(
        com.google.spanner.v1.ExecuteSqlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_SQL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Reads rows from the database using key lookups and scans, as a
     * simple key/value style alternative to
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].  This method cannot be used to
     * return a result set larger than 10 MiB; if the read matches more
     * data than that, the read fails with a `FAILED_PRECONDITION`
     * error.
     * Reads inside read-write transactions might return `ABORTED`. If
     * this occurs, the application should restart the transaction from
     * the beginning. See [Transaction][google.spanner.v1.Transaction] for more details.
     * Larger result sets can be yielded in streaming fashion by calling
     * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.ResultSet> read(
        com.google.spanner.v1.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ, getCallOptions()), request);
    }

    /**
     * <pre>
     * Begins a new transaction. This step can often be skipped:
     * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
     * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a
     * side-effect.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.Transaction> beginTransaction(
        com.google.spanner.v1.BeginTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Commits a transaction. The request includes the mutations to be
     * applied to rows in the database.
     * `Commit` might return an `ABORTED` error. This can occur at any time;
     * commonly, the cause is conflicts with concurrent
     * transactions. However, it can also happen for a variety of other
     * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt
     * the transaction from the beginning, re-using the same session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.spanner.v1.CommitResponse> commit(
        com.google.spanner.v1.CommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Rolls back a transaction, releasing any locks it holds. It is a good
     * idea to call this for any transaction that includes one or more
     * [Read][google.spanner.v1.Spanner.Read] or [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and
     * ultimately decides not to commit.
     * `Rollback` returns `OK` if it successfully aborts the transaction, the
     * transaction was already aborted, or the transaction is not
     * found. `Rollback` never returns `ABORTED`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> rollback(
        com.google.spanner.v1.RollbackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_GET_SESSION = 1;
  private static final int METHODID_DELETE_SESSION = 2;
  private static final int METHODID_EXECUTE_SQL = 3;
  private static final int METHODID_EXECUTE_STREAMING_SQL = 4;
  private static final int METHODID_READ = 5;
  private static final int METHODID_STREAMING_READ = 6;
  private static final int METHODID_BEGIN_TRANSACTION = 7;
  private static final int METHODID_COMMIT = 8;
  private static final int METHODID_ROLLBACK = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpannerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpannerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.google.spanner.v1.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.Session>) responseObserver);
          break;
        case METHODID_GET_SESSION:
          serviceImpl.getSession((com.google.spanner.v1.GetSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.Session>) responseObserver);
          break;
        case METHODID_DELETE_SESSION:
          serviceImpl.deleteSession((com.google.spanner.v1.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXECUTE_SQL:
          serviceImpl.executeSql((com.google.spanner.v1.ExecuteSqlRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet>) responseObserver);
          break;
        case METHODID_EXECUTE_STREAMING_SQL:
          serviceImpl.executeStreamingSql((com.google.spanner.v1.ExecuteSqlRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((com.google.spanner.v1.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.ResultSet>) responseObserver);
          break;
        case METHODID_STREAMING_READ:
          serviceImpl.streamingRead((com.google.spanner.v1.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.PartialResultSet>) responseObserver);
          break;
        case METHODID_BEGIN_TRANSACTION:
          serviceImpl.beginTransaction((com.google.spanner.v1.BeginTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.Transaction>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((com.google.spanner.v1.CommitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.spanner.v1.CommitResponse>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((com.google.spanner.v1.RollbackRequest) request,
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

  private static final class SpannerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.spanner.v1.SpannerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpannerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpannerDescriptorSupplier())
              .addMethod(METHOD_CREATE_SESSION)
              .addMethod(METHOD_GET_SESSION)
              .addMethod(METHOD_DELETE_SESSION)
              .addMethod(METHOD_EXECUTE_SQL)
              .addMethod(METHOD_EXECUTE_STREAMING_SQL)
              .addMethod(METHOD_READ)
              .addMethod(METHOD_STREAMING_READ)
              .addMethod(METHOD_BEGIN_TRANSACTION)
              .addMethod(METHOD_COMMIT)
              .addMethod(METHOD_ROLLBACK)
              .build();
        }
      }
    }
    return result;
  }
}
