package com.google.cloud.dialogflow.v2beta1;

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
 * Manages agent intents.
 * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents)
 * for more details about agent intents.
 * #
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/intent.proto")
public final class IntentsGrpc {

  private IntentsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Intents";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,
      com.google.cloud.dialogflow.v2beta1.ListIntentsResponse> METHOD_LIST_INTENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "ListIntents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListIntentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListIntentsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetIntentRequest,
      com.google.cloud.dialogflow.v2beta1.Intent> METHOD_GET_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "GetIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,
      com.google.cloud.dialogflow.v2beta1.Intent> METHOD_CREATE_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "CreateIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,
      com.google.cloud.dialogflow.v2beta1.Intent> METHOD_UPDATE_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "UpdateIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,
      com.google.protobuf.Empty> METHOD_DELETE_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "DeleteIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,
      com.google.longrunning.Operation> METHOD_BATCH_UPDATE_INTENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "BatchUpdateIntents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,
      com.google.longrunning.Operation> METHOD_BATCH_DELETE_INTENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Intents", "BatchDeleteIntents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntentsStub newStub(io.grpc.Channel channel) {
    return new IntentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntentsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IntentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntentsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages agent intents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents)
   * for more details about agent intents.
   * #
   * </pre>
   */
  public static abstract class IntentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public void listIntents(com.google.cloud.dialogflow.v2beta1.ListIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListIntentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_INTENTS, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public void getIntent(com.google.cloud.dialogflow.v2beta1.GetIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INTENT, responseObserver);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public void createIntent(com.google.cloud.dialogflow.v2beta1.CreateIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_INTENT, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public void updateIntent(com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_INTENT, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public void deleteIntent(com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_INTENT, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &lt;response: [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
     * </pre>
     */
    public void batchUpdateIntents(com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_INTENTS, responseObserver);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void batchDeleteIntents(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_DELETE_INTENTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_INTENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,
                com.google.cloud.dialogflow.v2beta1.ListIntentsResponse>(
                  this, METHODID_LIST_INTENTS)))
          .addMethod(
            METHOD_GET_INTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetIntentRequest,
                com.google.cloud.dialogflow.v2beta1.Intent>(
                  this, METHODID_GET_INTENT)))
          .addMethod(
            METHOD_CREATE_INTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,
                com.google.cloud.dialogflow.v2beta1.Intent>(
                  this, METHODID_CREATE_INTENT)))
          .addMethod(
            METHOD_UPDATE_INTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,
                com.google.cloud.dialogflow.v2beta1.Intent>(
                  this, METHODID_UPDATE_INTENT)))
          .addMethod(
            METHOD_DELETE_INTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INTENT)))
          .addMethod(
            METHOD_BATCH_UPDATE_INTENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_UPDATE_INTENTS)))
          .addMethod(
            METHOD_BATCH_DELETE_INTENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_DELETE_INTENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages agent intents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents)
   * for more details about agent intents.
   * #
   * </pre>
   */
  public static final class IntentsStub extends io.grpc.stub.AbstractStub<IntentsStub> {
    private IntentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntentsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public void listIntents(com.google.cloud.dialogflow.v2beta1.ListIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListIntentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_INTENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public void getIntent(com.google.cloud.dialogflow.v2beta1.GetIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public void createIntent(com.google.cloud.dialogflow.v2beta1.CreateIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_INTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public void updateIntent(com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public void deleteIntent(com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_INTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &lt;response: [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
     * </pre>
     */
    public void batchUpdateIntents(com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_INTENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void batchDeleteIntents(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_INTENTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages agent intents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents)
   * for more details about agent intents.
   * #
   * </pre>
   */
  public static final class IntentsBlockingStub extends io.grpc.stub.AbstractStub<IntentsBlockingStub> {
    private IntentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntentsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListIntentsResponse listIntents(com.google.cloud.dialogflow.v2beta1.ListIntentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_INTENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent getIntent(com.google.cloud.dialogflow.v2beta1.GetIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent createIntent(com.google.cloud.dialogflow.v2beta1.CreateIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_INTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent updateIntent(com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_INTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteIntent(com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_INTENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &lt;response: [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchUpdateIntents(com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_INTENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchDeleteIntents(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_DELETE_INTENTS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages agent intents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/intents)
   * for more details about agent intents.
   * #
   * </pre>
   */
  public static final class IntentsFutureStub extends io.grpc.stub.AbstractStub<IntentsFutureStub> {
    private IntentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntentsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntentsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all intents in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.ListIntentsResponse> listIntents(
        com.google.cloud.dialogflow.v2beta1.ListIntentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_INTENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Intent> getIntent(
        com.google.cloud.dialogflow.v2beta1.GetIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an intent in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Intent> createIntent(
        com.google.cloud.dialogflow.v2beta1.CreateIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_INTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Intent> updateIntent(
        com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_INTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified intent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIntent(
        com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_INTENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple intents in the specified agent.
     * Operation &lt;response: [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchUpdateIntents(
        com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_INTENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes intents in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchDeleteIntents(
        com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_INTENTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INTENTS = 0;
  private static final int METHODID_GET_INTENT = 1;
  private static final int METHODID_CREATE_INTENT = 2;
  private static final int METHODID_UPDATE_INTENT = 3;
  private static final int METHODID_DELETE_INTENT = 4;
  private static final int METHODID_BATCH_UPDATE_INTENTS = 5;
  private static final int METHODID_BATCH_DELETE_INTENTS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INTENTS:
          serviceImpl.listIntents((com.google.cloud.dialogflow.v2beta1.ListIntentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListIntentsResponse>) responseObserver);
          break;
        case METHODID_GET_INTENT:
          serviceImpl.getIntent((com.google.cloud.dialogflow.v2beta1.GetIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent>) responseObserver);
          break;
        case METHODID_CREATE_INTENT:
          serviceImpl.createIntent((com.google.cloud.dialogflow.v2beta1.CreateIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent>) responseObserver);
          break;
        case METHODID_UPDATE_INTENT:
          serviceImpl.updateIntent((com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Intent>) responseObserver);
          break;
        case METHODID_DELETE_INTENT:
          serviceImpl.deleteIntent((com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_INTENTS:
          serviceImpl.batchUpdateIntents((com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_INTENTS:
          serviceImpl.batchDeleteIntents((com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static final class IntentsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IntentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntentsDescriptorSupplier())
              .addMethod(METHOD_LIST_INTENTS)
              .addMethod(METHOD_GET_INTENT)
              .addMethod(METHOD_CREATE_INTENT)
              .addMethod(METHOD_UPDATE_INTENT)
              .addMethod(METHOD_DELETE_INTENT)
              .addMethod(METHOD_BATCH_UPDATE_INTENTS)
              .addMethod(METHOD_BATCH_DELETE_INTENTS)
              .build();
        }
      }
    }
    return result;
  }
}
