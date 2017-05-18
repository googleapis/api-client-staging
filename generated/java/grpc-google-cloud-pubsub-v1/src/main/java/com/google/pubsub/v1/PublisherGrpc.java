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
 * The service that an application uses to manipulate topics, and to send
 * messages to a topic.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/pubsub/v1/pubsub.proto")
public final class PublisherGrpc {

  private PublisherGrpc() {}

  public static final String SERVICE_NAME = "google.pubsub.v1.Publisher";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.Topic,
      com.google.pubsub.v1.Topic> METHOD_CREATE_TOPIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "CreateTopic"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Topic.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Topic.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.PublishRequest,
      com.google.pubsub.v1.PublishResponse> METHOD_PUBLISH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "Publish"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.PublishRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.PublishResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.GetTopicRequest,
      com.google.pubsub.v1.Topic> METHOD_GET_TOPIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "GetTopic"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.GetTopicRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.Topic.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ListTopicsRequest,
      com.google.pubsub.v1.ListTopicsResponse> METHOD_LIST_TOPICS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "ListTopics"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListTopicsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListTopicsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.ListTopicSubscriptionsRequest,
      com.google.pubsub.v1.ListTopicSubscriptionsResponse> METHOD_LIST_TOPIC_SUBSCRIPTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "ListTopicSubscriptions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListTopicSubscriptionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.ListTopicSubscriptionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1.DeleteTopicRequest,
      com.google.protobuf.Empty> METHOD_DELETE_TOPIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1.Publisher", "DeleteTopic"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1.DeleteTopicRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublisherStub newStub(io.grpc.Channel channel) {
    return new PublisherStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublisherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PublisherBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PublisherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PublisherFutureStub(channel);
  }

  /**
   * <pre>
   * The service that an application uses to manipulate topics, and to send
   * messages to a topic.
   * </pre>
   */
  public static abstract class PublisherImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates the given topic with the given name.
     * </pre>
     */
    public void createTopic(com.google.pubsub.v1.Topic request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TOPIC, responseObserver);
    }

    /**
     * <pre>
     * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
     * does not exist. The message payload must not be empty; it must contain
     *  either a non-empty data field, or at least one attribute.
     * </pre>
     */
    public void publish(com.google.pubsub.v1.PublishRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.PublishResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PUBLISH, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration of a topic.
     * </pre>
     */
    public void getTopic(com.google.pubsub.v1.GetTopicRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOPIC, responseObserver);
    }

    /**
     * <pre>
     * Lists matching topics.
     * </pre>
     */
    public void listTopics(com.google.pubsub.v1.ListTopicsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TOPICS, responseObserver);
    }

    /**
     * <pre>
     * Lists the name of the subscriptions for this topic.
     * </pre>
     */
    public void listTopicSubscriptions(com.google.pubsub.v1.ListTopicSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicSubscriptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TOPIC_SUBSCRIPTIONS, responseObserver);
    }

    /**
     * <pre>
     * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
     * does not exist. After a topic is deleted, a new topic may be created with
     * the same name; this is an entirely new topic with none of the old
     * configuration or subscriptions. Existing subscriptions to this topic are
     * not deleted, but their `topic` field is set to `_deleted-topic_`.
     * </pre>
     */
    public void deleteTopic(com.google.pubsub.v1.DeleteTopicRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TOPIC, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.Topic,
                com.google.pubsub.v1.Topic>(
                  this, METHODID_CREATE_TOPIC)))
          .addMethod(
            METHOD_PUBLISH,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.PublishRequest,
                com.google.pubsub.v1.PublishResponse>(
                  this, METHODID_PUBLISH)))
          .addMethod(
            METHOD_GET_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.GetTopicRequest,
                com.google.pubsub.v1.Topic>(
                  this, METHODID_GET_TOPIC)))
          .addMethod(
            METHOD_LIST_TOPICS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ListTopicsRequest,
                com.google.pubsub.v1.ListTopicsResponse>(
                  this, METHODID_LIST_TOPICS)))
          .addMethod(
            METHOD_LIST_TOPIC_SUBSCRIPTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.ListTopicSubscriptionsRequest,
                com.google.pubsub.v1.ListTopicSubscriptionsResponse>(
                  this, METHODID_LIST_TOPIC_SUBSCRIPTIONS)))
          .addMethod(
            METHOD_DELETE_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1.DeleteTopicRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TOPIC)))
          .build();
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate topics, and to send
   * messages to a topic.
   * </pre>
   */
  public static final class PublisherStub extends io.grpc.stub.AbstractStub<PublisherStub> {
    private PublisherStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublisherStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublisherStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the given topic with the given name.
     * </pre>
     */
    public void createTopic(com.google.pubsub.v1.Topic request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
     * does not exist. The message payload must not be empty; it must contain
     *  either a non-empty data field, or at least one attribute.
     * </pre>
     */
    public void publish(com.google.pubsub.v1.PublishRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.PublishResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUBLISH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration of a topic.
     * </pre>
     */
    public void getTopic(com.google.pubsub.v1.GetTopicRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists matching topics.
     * </pre>
     */
    public void listTopics(com.google.pubsub.v1.ListTopicsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPICS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the name of the subscriptions for this topic.
     * </pre>
     */
    public void listTopicSubscriptions(com.google.pubsub.v1.ListTopicSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicSubscriptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPIC_SUBSCRIPTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
     * does not exist. After a topic is deleted, a new topic may be created with
     * the same name; this is an entirely new topic with none of the old
     * configuration or subscriptions. Existing subscriptions to this topic are
     * not deleted, but their `topic` field is set to `_deleted-topic_`.
     * </pre>
     */
    public void deleteTopic(com.google.pubsub.v1.DeleteTopicRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TOPIC, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate topics, and to send
   * messages to a topic.
   * </pre>
   */
  public static final class PublisherBlockingStub extends io.grpc.stub.AbstractStub<PublisherBlockingStub> {
    private PublisherBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublisherBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublisherBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the given topic with the given name.
     * </pre>
     */
    public com.google.pubsub.v1.Topic createTopic(com.google.pubsub.v1.Topic request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TOPIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
     * does not exist. The message payload must not be empty; it must contain
     *  either a non-empty data field, or at least one attribute.
     * </pre>
     */
    public com.google.pubsub.v1.PublishResponse publish(com.google.pubsub.v1.PublishRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUBLISH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the configuration of a topic.
     * </pre>
     */
    public com.google.pubsub.v1.Topic getTopic(com.google.pubsub.v1.GetTopicRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOPIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists matching topics.
     * </pre>
     */
    public com.google.pubsub.v1.ListTopicsResponse listTopics(com.google.pubsub.v1.ListTopicsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TOPICS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the name of the subscriptions for this topic.
     * </pre>
     */
    public com.google.pubsub.v1.ListTopicSubscriptionsResponse listTopicSubscriptions(com.google.pubsub.v1.ListTopicSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TOPIC_SUBSCRIPTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
     * does not exist. After a topic is deleted, a new topic may be created with
     * the same name; this is an entirely new topic with none of the old
     * configuration or subscriptions. Existing subscriptions to this topic are
     * not deleted, but their `topic` field is set to `_deleted-topic_`.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTopic(com.google.pubsub.v1.DeleteTopicRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TOPIC, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate topics, and to send
   * messages to a topic.
   * </pre>
   */
  public static final class PublisherFutureStub extends io.grpc.stub.AbstractStub<PublisherFutureStub> {
    private PublisherFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublisherFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublisherFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates the given topic with the given name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Topic> createTopic(
        com.google.pubsub.v1.Topic request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TOPIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic
     * does not exist. The message payload must not be empty; it must contain
     *  either a non-empty data field, or at least one attribute.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.PublishResponse> publish(
        com.google.pubsub.v1.PublishRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUBLISH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the configuration of a topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.Topic> getTopic(
        com.google.pubsub.v1.GetTopicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists matching topics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.ListTopicsResponse> listTopics(
        com.google.pubsub.v1.ListTopicsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPICS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the name of the subscriptions for this topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1.ListTopicSubscriptionsResponse> listTopicSubscriptions(
        com.google.pubsub.v1.ListTopicSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TOPIC_SUBSCRIPTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic
     * does not exist. After a topic is deleted, a new topic may be created with
     * the same name; this is an entirely new topic with none of the old
     * configuration or subscriptions. Existing subscriptions to this topic are
     * not deleted, but their `topic` field is set to `_deleted-topic_`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTopic(
        com.google.pubsub.v1.DeleteTopicRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TOPIC, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOPIC = 0;
  private static final int METHODID_PUBLISH = 1;
  private static final int METHODID_GET_TOPIC = 2;
  private static final int METHODID_LIST_TOPICS = 3;
  private static final int METHODID_LIST_TOPIC_SUBSCRIPTIONS = 4;
  private static final int METHODID_DELETE_TOPIC = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublisherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublisherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TOPIC:
          serviceImpl.createTopic((com.google.pubsub.v1.Topic) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic>) responseObserver);
          break;
        case METHODID_PUBLISH:
          serviceImpl.publish((com.google.pubsub.v1.PublishRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.PublishResponse>) responseObserver);
          break;
        case METHODID_GET_TOPIC:
          serviceImpl.getTopic((com.google.pubsub.v1.GetTopicRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.Topic>) responseObserver);
          break;
        case METHODID_LIST_TOPICS:
          serviceImpl.listTopics((com.google.pubsub.v1.ListTopicsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicsResponse>) responseObserver);
          break;
        case METHODID_LIST_TOPIC_SUBSCRIPTIONS:
          serviceImpl.listTopicSubscriptions((com.google.pubsub.v1.ListTopicSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1.ListTopicSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_TOPIC:
          serviceImpl.deleteTopic((com.google.pubsub.v1.DeleteTopicRequest) request,
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

  private static final class PublisherDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.pubsub.v1.PubsubProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PublisherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublisherDescriptorSupplier())
              .addMethod(METHOD_CREATE_TOPIC)
              .addMethod(METHOD_PUBLISH)
              .addMethod(METHOD_GET_TOPIC)
              .addMethod(METHOD_LIST_TOPICS)
              .addMethod(METHOD_LIST_TOPIC_SUBSCRIPTIONS)
              .addMethod(METHOD_DELETE_TOPIC)
              .build();
        }
      }
    }
    return result;
  }
}
