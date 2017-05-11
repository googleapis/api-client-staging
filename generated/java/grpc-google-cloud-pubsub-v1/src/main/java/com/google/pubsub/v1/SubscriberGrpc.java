package com.google.pubsub.v1;

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
 * The service that an application uses to manipulate subscriptions and to
 * consume messages from a subscription via the `Pull` method.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/pubsub/v1/pubsub.proto")
public final class SubscriberGrpc {

  private SubscriberGrpc() {}

  public static final String SERVICE_NAME = "google.pubsub.v1.Subscriber";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.Subscription,
      com.google.pubsub.v1.Subscription> METHOD_CREATE_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "CreateSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Subscription.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Subscription.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.GetSubscriptionRequest,
      com.google.pubsub.v1.Subscription> METHOD_GET_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "GetSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.GetSubscriptionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Subscription.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.UpdateSubscriptionRequest,
      com.google.pubsub.v1.Subscription> METHOD_UPDATE_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "UpdateSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.UpdateSubscriptionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Subscription.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ListSubscriptionsRequest,
      com.google.pubsub.v1.ListSubscriptionsResponse> METHOD_LIST_SUBSCRIPTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "ListSubscriptions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListSubscriptionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListSubscriptionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.DeleteSubscriptionRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "DeleteSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.DeleteSubscriptionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ModifyAckDeadlineRequest,
      com.google.protobuf.Empty> METHOD_MODIFY_ACK_DEADLINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "ModifyAckDeadline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ModifyAckDeadlineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.AcknowledgeRequest,
      com.google.protobuf.Empty> METHOD_ACKNOWLEDGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "Acknowledge"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.AcknowledgeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.PullRequest,
      com.google.pubsub.v1.PullResponse> METHOD_PULL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "Pull"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.PullRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.PullResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.StreamingPullRequest,
      com.google.pubsub.v1.StreamingPullResponse> METHOD_STREAMING_PULL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "StreamingPull"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.StreamingPullRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.StreamingPullResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ModifyPushConfigRequest,
      com.google.protobuf.Empty> METHOD_MODIFY_PUSH_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "ModifyPushConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ModifyPushConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ListSnapshotsRequest,
      com.google.pubsub.v1.ListSnapshotsResponse> METHOD_LIST_SNAPSHOTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "ListSnapshots"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListSnapshotsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListSnapshotsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.CreateSnapshotRequest,
      com.google.pubsub.v1.Snapshot> METHOD_CREATE_SNAPSHOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "CreateSnapshot"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.CreateSnapshotRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Snapshot.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.DeleteSnapshotRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SNAPSHOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "DeleteSnapshot"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.DeleteSnapshotRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.SeekRequest,
      com.google.pubsub.v1.SeekResponse> METHOD_SEEK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Subscriber", "Seek"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.SeekRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.SeekResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscriberStub newStub(io.grpc.Channel channel) {
    return new SubscriberStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriberBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubscriberBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriberFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubscriberFutureStub(channel);
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the `Pull` method.
   * </pre>
   */
  public static abstract class SubscriberImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a subscription to a given topic.
     * If the subscription already exists, returns `ALREADY_EXISTS`.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Subscription object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public void createSubscription(com.google.pubsub.v1.Subscription request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public void getSubscription(com.google.pubsub.v1.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing subscription. Note that certain properties of a
     * subscription, such as its topic, are not modifiable.
     * </pre>
     */
    public void updateSubscription(com.google.pubsub.v1.UpdateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public void listSubscriptions(com.google.pubsub.v1.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSubscriptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SUBSCRIPTIONS, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All messages retained in the subscription
     * are immediately dropped. Calls to `Pull` after deletion will return
     * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription or its topic unless the same topic is specified.
     * </pre>
     */
    public void deleteSubscription(com.google.pubsub.v1.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful
     * to indicate that more time is needed to process a message by the
     * subscriber, or to make the message available for redelivery if the
     * processing was interrupted. Note that this does not modify the
     * subscription-level `ackDeadlineSeconds` used for subsequent messages.
     * </pre>
     */
    public void modifyAckDeadline(com.google.pubsub.v1.ModifyAckDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_ACK_DEADLINE, responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the `ack_ids` in the
     * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public void acknowledge(com.google.pubsub.v1.AcknowledgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACKNOWLEDGE, responseObserver);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return `UNAVAILABLE` if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public void pull(com.google.pubsub.v1.PullRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.PullResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PULL, responseObserver);
    }

    /**
     * <pre>
     * (EXPERIMENTAL) StreamingPull is an experimental feature. This RPC will
     * respond with UNIMPLEMENTED errors unless you have been invited to test
     * this feature. Contact cloud-pubsub&#64;google.com with any questions.
     * Establishes a stream with the server, which sends messages down to the
     * client. The client streams acknowledgements and ack deadline modifications
     * back to the server. The server will close the stream and return the status
     * on any error. The server may close the stream with status `OK` to reassign
     * server-side resources, in which case, the client should re-establish the
     * stream. `UNAVAILABLE` may also be returned in the case of a transient error
     * (e.g., a server restart). These should also be retried by the client. Flow
     * control can be achieved by configuring the underlying RPC channel.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.pubsub.v1.StreamingPullRequest> streamingPull(
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.StreamingPullResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_STREAMING_PULL, responseObserver);
    }

    /**
     * <pre>
     * Modifies the `PushConfig` for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified by
     * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for delivery
     * continuously through the call regardless of changes to the `PushConfig`.
     * </pre>
     */
    public void modifyPushConfig(com.google.pubsub.v1.ModifyPushConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_PUSH_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Lists the existing snapshots.
     * </pre>
     */
    public void listSnapshots(com.google.pubsub.v1.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSnapshotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SNAPSHOTS, responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot from the requested subscription.
     * If the snapshot already exists, returns `ALREADY_EXISTS`.
     * If the requested subscription doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Snapshot object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public void createSnapshot(com.google.pubsub.v1.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Snapshot> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SNAPSHOT, responseObserver);
    }

    /**
     * <pre>
     * Removes an existing snapshot. All messages retained in the snapshot
     * are immediately dropped. After a snapshot is deleted, a new one may be
     * created with the same name, but the new one has no association with the old
     * snapshot or its subscription, unless the same subscription is specified.
     * </pre>
     */
    public void deleteSnapshot(com.google.pubsub.v1.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SNAPSHOT, responseObserver);
    }

    /**
     * <pre>
     * Seeks an existing subscription to a point in time or to a given snapshot,
     * whichever is provided in the request.
     * </pre>
     */
    public void seek(com.google.pubsub.v1.SeekRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.SeekResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEEK, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.Subscription,
                com.google.pubsub.v1.Subscription>(
                  this, METHODID_CREATE_SUBSCRIPTION)))
          .addMethod(
            METHOD_GET_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.GetSubscriptionRequest,
                com.google.pubsub.v1.Subscription>(
                  this, METHODID_GET_SUBSCRIPTION)))
          .addMethod(
            METHOD_UPDATE_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.UpdateSubscriptionRequest,
                com.google.pubsub.v1.Subscription>(
                  this, METHODID_UPDATE_SUBSCRIPTION)))
          .addMethod(
            METHOD_LIST_SUBSCRIPTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ListSubscriptionsRequest,
                com.google.pubsub.v1.ListSubscriptionsResponse>(
                  this, METHODID_LIST_SUBSCRIPTIONS)))
          .addMethod(
            METHOD_DELETE_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.DeleteSubscriptionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SUBSCRIPTION)))
          .addMethod(
            METHOD_MODIFY_ACK_DEADLINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ModifyAckDeadlineRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_MODIFY_ACK_DEADLINE)))
          .addMethod(
            METHOD_ACKNOWLEDGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.AcknowledgeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ACKNOWLEDGE)))
          .addMethod(
            METHOD_PULL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.PullRequest,
                com.google.pubsub.v1.PullResponse>(
                  this, METHODID_PULL)))
          .addMethod(
            METHOD_STREAMING_PULL,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.google.pubsub.v1.StreamingPullRequest,
                com.google.pubsub.v1.StreamingPullResponse>(
                  this, METHODID_STREAMING_PULL)))
          .addMethod(
            METHOD_MODIFY_PUSH_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ModifyPushConfigRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_MODIFY_PUSH_CONFIG)))
          .addMethod(
            METHOD_LIST_SNAPSHOTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ListSnapshotsRequest,
                com.google.pubsub.v1.ListSnapshotsResponse>(
                  this, METHODID_LIST_SNAPSHOTS)))
          .addMethod(
            METHOD_CREATE_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.CreateSnapshotRequest,
                com.google.pubsub.v1.Snapshot>(
                  this, METHODID_CREATE_SNAPSHOT)))
          .addMethod(
            METHOD_DELETE_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.DeleteSnapshotRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SNAPSHOT)))
          .addMethod(
            METHOD_SEEK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.SeekRequest,
                com.google.pubsub.v1.SeekResponse>(
                  this, METHODID_SEEK)))
          .build();
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the `Pull` method.
   * </pre>
   */
  public static final class SubscriberStub extends io.grpc.stub.AbstractStub<SubscriberStub> {
    private SubscriberStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic.
     * If the subscription already exists, returns `ALREADY_EXISTS`.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Subscription object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public void createSubscription(com.google.pubsub.v1.Subscription request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public void getSubscription(com.google.pubsub.v1.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing subscription. Note that certain properties of a
     * subscription, such as its topic, are not modifiable.
     * </pre>
     */
    public void updateSubscription(com.google.pubsub.v1.UpdateSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public void listSubscriptions(com.google.pubsub.v1.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSubscriptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIPTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All messages retained in the subscription
     * are immediately dropped. Calls to `Pull` after deletion will return
     * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription or its topic unless the same topic is specified.
     * </pre>
     */
    public void deleteSubscription(com.google.pubsub.v1.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful
     * to indicate that more time is needed to process a message by the
     * subscriber, or to make the message available for redelivery if the
     * processing was interrupted. Note that this does not modify the
     * subscription-level `ackDeadlineSeconds` used for subsequent messages.
     * </pre>
     */
    public void modifyAckDeadline(com.google.pubsub.v1.ModifyAckDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_ACK_DEADLINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the `ack_ids` in the
     * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public void acknowledge(com.google.pubsub.v1.AcknowledgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return `UNAVAILABLE` if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public void pull(com.google.pubsub.v1.PullRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.PullResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PULL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * (EXPERIMENTAL) StreamingPull is an experimental feature. This RPC will
     * respond with UNIMPLEMENTED errors unless you have been invited to test
     * this feature. Contact cloud-pubsub&#64;google.com with any questions.
     * Establishes a stream with the server, which sends messages down to the
     * client. The client streams acknowledgements and ack deadline modifications
     * back to the server. The server will close the stream and return the status
     * on any error. The server may close the stream with status `OK` to reassign
     * server-side resources, in which case, the client should re-establish the
     * stream. `UNAVAILABLE` may also be returned in the case of a transient error
     * (e.g., a server restart). These should also be retried by the client. Flow
     * control can be achieved by configuring the underlying RPC channel.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.pubsub.v1.StreamingPullRequest> streamingPull(
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.StreamingPullResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_STREAMING_PULL, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Modifies the `PushConfig` for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified by
     * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for delivery
     * continuously through the call regardless of changes to the `PushConfig`.
     * </pre>
     */
    public void modifyPushConfig(com.google.pubsub.v1.ModifyPushConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_PUSH_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the existing snapshots.
     * </pre>
     */
    public void listSnapshots(com.google.pubsub.v1.ListSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSnapshotsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SNAPSHOTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a snapshot from the requested subscription.
     * If the snapshot already exists, returns `ALREADY_EXISTS`.
     * If the requested subscription doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Snapshot object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public void createSnapshot(com.google.pubsub.v1.CreateSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Snapshot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes an existing snapshot. All messages retained in the snapshot
     * are immediately dropped. After a snapshot is deleted, a new one may be
     * created with the same name, but the new one has no association with the old
     * snapshot or its subscription, unless the same subscription is specified.
     * </pre>
     */
    public void deleteSnapshot(com.google.pubsub.v1.DeleteSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Seeks an existing subscription to a point in time or to a given snapshot,
     * whichever is provided in the request.
     * </pre>
     */
    public void seek(com.google.pubsub.v1.SeekRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.SeekResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEEK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the `Pull` method.
   * </pre>
   */
  public static final class SubscriberBlockingStub extends io.grpc.stub.AbstractStub<SubscriberBlockingStub> {
    private SubscriberBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic.
     * If the subscription already exists, returns `ALREADY_EXISTS`.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Subscription object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public com.google.pubsub.v1.Subscription createSubscription(com.google.pubsub.v1.Subscription request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public com.google.pubsub.v1.Subscription getSubscription(com.google.pubsub.v1.GetSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing subscription. Note that certain properties of a
     * subscription, such as its topic, are not modifiable.
     * </pre>
     */
    public com.google.pubsub.v1.Subscription updateSubscription(com.google.pubsub.v1.UpdateSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public com.google.pubsub.v1.ListSubscriptionsResponse listSubscriptions(com.google.pubsub.v1.ListSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SUBSCRIPTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All messages retained in the subscription
     * are immediately dropped. Calls to `Pull` after deletion will return
     * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription or its topic unless the same topic is specified.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSubscription(com.google.pubsub.v1.DeleteSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful
     * to indicate that more time is needed to process a message by the
     * subscriber, or to make the message available for redelivery if the
     * processing was interrupted. Note that this does not modify the
     * subscription-level `ackDeadlineSeconds` used for subsequent messages.
     * </pre>
     */
    public com.google.protobuf.Empty modifyAckDeadline(com.google.pubsub.v1.ModifyAckDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_ACK_DEADLINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the `ack_ids` in the
     * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public com.google.protobuf.Empty acknowledge(com.google.pubsub.v1.AcknowledgeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACKNOWLEDGE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return `UNAVAILABLE` if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public com.google.pubsub.v1.PullResponse pull(com.google.pubsub.v1.PullRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PULL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the `PushConfig` for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified by
     * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for delivery
     * continuously through the call regardless of changes to the `PushConfig`.
     * </pre>
     */
    public com.google.protobuf.Empty modifyPushConfig(com.google.pubsub.v1.ModifyPushConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_PUSH_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the existing snapshots.
     * </pre>
     */
    public com.google.pubsub.v1.ListSnapshotsResponse listSnapshots(com.google.pubsub.v1.ListSnapshotsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SNAPSHOTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a snapshot from the requested subscription.
     * If the snapshot already exists, returns `ALREADY_EXISTS`.
     * If the requested subscription doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Snapshot object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public com.google.pubsub.v1.Snapshot createSnapshot(com.google.pubsub.v1.CreateSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SNAPSHOT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an existing snapshot. All messages retained in the snapshot
     * are immediately dropped. After a snapshot is deleted, a new one may be
     * created with the same name, but the new one has no association with the old
     * snapshot or its subscription, unless the same subscription is specified.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSnapshot(com.google.pubsub.v1.DeleteSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SNAPSHOT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Seeks an existing subscription to a point in time or to a given snapshot,
     * whichever is provided in the request.
     * </pre>
     */
    public com.google.pubsub.v1.SeekResponse seek(com.google.pubsub.v1.SeekRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEEK, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the `Pull` method.
   * </pre>
   */
  public static final class SubscriberFutureStub extends io.grpc.stub.AbstractStub<SubscriberFutureStub> {
    private SubscriberFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic.
     * If the subscription already exists, returns `ALREADY_EXISTS`.
     * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Subscription object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Subscription> createSubscription(
        com.google.pubsub.v1.Subscription request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Subscription> getSubscription(
        com.google.pubsub.v1.GetSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing subscription. Note that certain properties of a
     * subscription, such as its topic, are not modifiable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Subscription> updateSubscription(
        com.google.pubsub.v1.UpdateSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.ListSubscriptionsResponse> listSubscriptions(
        com.google.pubsub.v1.ListSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIPTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All messages retained in the subscription
     * are immediately dropped. Calls to `Pull` after deletion will return
     * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription or its topic unless the same topic is specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSubscription(
        com.google.pubsub.v1.DeleteSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful
     * to indicate that more time is needed to process a message by the
     * subscriber, or to make the message available for redelivery if the
     * processing was interrupted. Note that this does not modify the
     * subscription-level `ackDeadlineSeconds` used for subsequent messages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> modifyAckDeadline(
        com.google.pubsub.v1.ModifyAckDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_ACK_DEADLINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the `ack_ids` in the
     * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> acknowledge(
        com.google.pubsub.v1.AcknowledgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return `UNAVAILABLE` if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.PullResponse> pull(
        com.google.pubsub.v1.PullRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PULL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the `PushConfig` for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified by
     * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for delivery
     * continuously through the call regardless of changes to the `PushConfig`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> modifyPushConfig(
        com.google.pubsub.v1.ModifyPushConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_PUSH_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the existing snapshots.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.ListSnapshotsResponse> listSnapshots(
        com.google.pubsub.v1.ListSnapshotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SNAPSHOTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a snapshot from the requested subscription.
     * If the snapshot already exists, returns `ALREADY_EXISTS`.
     * If the requested subscription doesn't exist, returns `NOT_FOUND`.
     * If the name is not provided in the request, the server will assign a random
     * name for this snapshot on the same project as the subscription, conforming
     * to the
     * [resource name format](https://cloud.google.com/pubsub/docs/overview#names).
     * The generated name is populated in the returned Snapshot object.
     * Note that for REST API requests, you must specify a name in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Snapshot> createSnapshot(
        com.google.pubsub.v1.CreateSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SNAPSHOT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes an existing snapshot. All messages retained in the snapshot
     * are immediately dropped. After a snapshot is deleted, a new one may be
     * created with the same name, but the new one has no association with the old
     * snapshot or its subscription, unless the same subscription is specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSnapshot(
        com.google.pubsub.v1.DeleteSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SNAPSHOT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Seeks an existing subscription to a point in time or to a given snapshot,
     * whichever is provided in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.SeekResponse> seek(
        com.google.pubsub.v1.SeekRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEEK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSCRIPTION = 0;
  private static final int METHODID_GET_SUBSCRIPTION = 1;
  private static final int METHODID_UPDATE_SUBSCRIPTION = 2;
  private static final int METHODID_LIST_SUBSCRIPTIONS = 3;
  private static final int METHODID_DELETE_SUBSCRIPTION = 4;
  private static final int METHODID_MODIFY_ACK_DEADLINE = 5;
  private static final int METHODID_ACKNOWLEDGE = 6;
  private static final int METHODID_PULL = 7;
  private static final int METHODID_MODIFY_PUSH_CONFIG = 8;
  private static final int METHODID_LIST_SNAPSHOTS = 9;
  private static final int METHODID_CREATE_SNAPSHOT = 10;
  private static final int METHODID_DELETE_SNAPSHOT = 11;
  private static final int METHODID_SEEK = 12;
  private static final int METHODID_STREAMING_PULL = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscriberImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscriberImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUBSCRIPTION:
          serviceImpl.createSubscription((com.google.pubsub.v1.Subscription) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIPTION:
          serviceImpl.getSubscription((com.google.pubsub.v1.GetSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription>) responseObserver);
          break;
        case METHODID_UPDATE_SUBSCRIPTION:
          serviceImpl.updateSubscription((com.google.pubsub.v1.UpdateSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Subscription>) responseObserver);
          break;
        case METHODID_LIST_SUBSCRIPTIONS:
          serviceImpl.listSubscriptions((com.google.pubsub.v1.ListSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSCRIPTION:
          serviceImpl.deleteSubscription((com.google.pubsub.v1.DeleteSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MODIFY_ACK_DEADLINE:
          serviceImpl.modifyAckDeadline((com.google.pubsub.v1.ModifyAckDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE:
          serviceImpl.acknowledge((com.google.pubsub.v1.AcknowledgeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PULL:
          serviceImpl.pull((com.google.pubsub.v1.PullRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.PullResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PUSH_CONFIG:
          serviceImpl.modifyPushConfig((com.google.pubsub.v1.ModifyPushConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((com.google.pubsub.v1.ListSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListSnapshotsResponse>) responseObserver);
          break;
        case METHODID_CREATE_SNAPSHOT:
          serviceImpl.createSnapshot((com.google.pubsub.v1.CreateSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Snapshot>) responseObserver);
          break;
        case METHODID_DELETE_SNAPSHOT:
          serviceImpl.deleteSnapshot((com.google.pubsub.v1.DeleteSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEEK:
          serviceImpl.seek((com.google.pubsub.v1.SeekRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.SeekResponse>) responseObserver);
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
        case METHODID_STREAMING_PULL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingPull(
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.StreamingPullResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class SubscriberDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.pubsub.v1.PubsubProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SubscriberGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscriberDescriptorSupplier())
              .addMethod(METHOD_CREATE_SUBSCRIPTION)
              .addMethod(METHOD_GET_SUBSCRIPTION)
              .addMethod(METHOD_UPDATE_SUBSCRIPTION)
              .addMethod(METHOD_LIST_SUBSCRIPTIONS)
              .addMethod(METHOD_DELETE_SUBSCRIPTION)
              .addMethod(METHOD_MODIFY_ACK_DEADLINE)
              .addMethod(METHOD_ACKNOWLEDGE)
              .addMethod(METHOD_PULL)
              .addMethod(METHOD_STREAMING_PULL)
              .addMethod(METHOD_MODIFY_PUSH_CONFIG)
              .addMethod(METHOD_LIST_SNAPSHOTS)
              .addMethod(METHOD_CREATE_SNAPSHOT)
              .addMethod(METHOD_DELETE_SNAPSHOT)
              .addMethod(METHOD_SEEK)
              .build();
        }
      }
    }
    return result;
  }
}
