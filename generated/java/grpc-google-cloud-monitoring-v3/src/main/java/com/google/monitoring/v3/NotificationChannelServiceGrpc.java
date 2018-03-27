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
 * The Notification Channel API provides access to configuration that
 * controls how messages related to incidents are sent.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/monitoring/v3/notification_service.proto")
public final class NotificationChannelServiceGrpc {

  private NotificationChannelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.NotificationChannelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
      com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse> METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "ListNotificationChannelDescriptors"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
      com.google.monitoring.v3.NotificationChannelDescriptor> METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "GetNotificationChannelDescriptor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetNotificationChannelDescriptorRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.NotificationChannelDescriptor.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.ListNotificationChannelsRequest,
      com.google.monitoring.v3.ListNotificationChannelsResponse> METHOD_LIST_NOTIFICATION_CHANNELS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "ListNotificationChannels"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListNotificationChannelsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.ListNotificationChannelsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetNotificationChannelRequest,
      com.google.monitoring.v3.NotificationChannel> METHOD_GET_NOTIFICATION_CHANNEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "GetNotificationChannel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetNotificationChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.NotificationChannel.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.CreateNotificationChannelRequest,
      com.google.monitoring.v3.NotificationChannel> METHOD_CREATE_NOTIFICATION_CHANNEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "CreateNotificationChannel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.CreateNotificationChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.NotificationChannel.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.UpdateNotificationChannelRequest,
      com.google.monitoring.v3.NotificationChannel> METHOD_UPDATE_NOTIFICATION_CHANNEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "UpdateNotificationChannel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.UpdateNotificationChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.NotificationChannel.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.DeleteNotificationChannelRequest,
      com.google.protobuf.Empty> METHOD_DELETE_NOTIFICATION_CHANNEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "DeleteNotificationChannel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.DeleteNotificationChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
      com.google.protobuf.Empty> METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "SendNotificationChannelVerificationCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse> METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "GetNotificationChannelVerificationCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.monitoring.v3.VerifyNotificationChannelRequest,
      com.google.monitoring.v3.NotificationChannel> METHOD_VERIFY_NOTIFICATION_CHANNEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.monitoring.v3.NotificationChannelService", "VerifyNotificationChannel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.VerifyNotificationChannelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.monitoring.v3.NotificationChannel.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationChannelServiceStub newStub(io.grpc.Channel channel) {
    return new NotificationChannelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationChannelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationChannelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationChannelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationChannelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Notification Channel API provides access to configuration that
   * controls how messages related to incidents are sent.
   * </pre>
   */
  public static abstract class NotificationChannelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists the descriptors for supported channel types. The use of descriptors
     * makes it possible for new channel types to be dynamically added.
     * </pre>
     */
    public void listNotificationChannelDescriptors(com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single channel descriptor. The descriptor indicates which fields
     * are expected / permitted for a notification channel of the given type.
     * </pre>
     */
    public void getNotificationChannelDescriptor(com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR, responseObserver);
    }

    /**
     * <pre>
     * Lists the notification channels that have been created for the project.
     * </pre>
     */
    public void listNotificationChannels(com.google.monitoring.v3.ListNotificationChannelsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_NOTIFICATION_CHANNELS, responseObserver);
    }

    /**
     * <pre>
     * Gets a single notification channel. The channel includes the relevant
     * configuration details with which the channel was created. However, the
     * response may truncate or omit passwords, API keys, or other private key
     * matter and thus the response may not be 100% identical to the information
     * that was supplied in the call to the create method.
     * </pre>
     */
    public void getNotificationChannel(com.google.monitoring.v3.GetNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NOTIFICATION_CHANNEL, responseObserver);
    }

    /**
     * <pre>
     * Creates a new notification channel, representing a single notification
     * endpoint such as an email address, SMS number, or pagerduty service.
     * </pre>
     */
    public void createNotificationChannel(com.google.monitoring.v3.CreateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_NOTIFICATION_CHANNEL, responseObserver);
    }

    /**
     * <pre>
     * Updates a notification channel. Fields not specified in the field mask
     * remain unchanged.
     * </pre>
     */
    public void updateNotificationChannel(com.google.monitoring.v3.UpdateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NOTIFICATION_CHANNEL, responseObserver);
    }

    /**
     * <pre>
     * Deletes a notification channel.
     * </pre>
     */
    public void deleteNotificationChannel(com.google.monitoring.v3.DeleteNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_NOTIFICATION_CHANNEL, responseObserver);
    }

    /**
     * <pre>
     * Causes a verification code to be delivered to the channel. The code
     * can then be supplied in `VerifyNotificationChannel` to verify the channel.
     * </pre>
     */
    public void sendNotificationChannelVerificationCode(com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE, responseObserver);
    }

    /**
     * <pre>
     * Requests a verification code for an already verified channel that can then
     * be used in a call to VerifyNotificationChannel() on a different channel
     * with an equivalent identity in the same or in a different project. This
     * makes it possible to copy a channel between projects without requiring
     * manual reverification of the channel. If the channel is not in the
     * verified state, this method will fail (in other words, this may only be
     * used if the SendNotificationChannelVerificationCode and
     * VerifyNotificationChannel paths have already been used to put the given
     * channel into the verified state).
     * There is no guarantee that the verification codes returned by this method
     * will be of a similar structure or form as the ones that are delivered
     * to the channel via SendNotificationChannelVerificationCode; while
     * VerifyNotificationChannel() will recognize both the codes delivered via
     * SendNotificationChannelVerificationCode() and returned from
     * GetNotificationChannelVerificationCode(), it is typically the case that
     * the verification codes delivered via
     * SendNotificationChannelVerificationCode() will be shorter and also
     * have a shorter expiration (e.g. codes such as "G-123456") whereas
     * GetVerificationCode() will typically return a much longer, websafe base
     * 64 encoded string that has a longer expiration time.
     * </pre>
     */
    public void getNotificationChannelVerificationCode(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE, responseObserver);
    }

    /**
     * <pre>
     * Verifies a `NotificationChannel` by proving receipt of the code
     * delivered to the channel as a result of calling
     * `SendNotificationChannelVerificationCode`.
     * </pre>
     */
    public void verifyNotificationChannel(com.google.monitoring.v3.VerifyNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VERIFY_NOTIFICATION_CHANNEL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
                com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>(
                  this, METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS)))
          .addMethod(
            METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
                com.google.monitoring.v3.NotificationChannelDescriptor>(
                  this, METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR)))
          .addMethod(
            METHOD_LIST_NOTIFICATION_CHANNELS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.ListNotificationChannelsRequest,
                com.google.monitoring.v3.ListNotificationChannelsResponse>(
                  this, METHODID_LIST_NOTIFICATION_CHANNELS)))
          .addMethod(
            METHOD_GET_NOTIFICATION_CHANNEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetNotificationChannelRequest,
                com.google.monitoring.v3.NotificationChannel>(
                  this, METHODID_GET_NOTIFICATION_CHANNEL)))
          .addMethod(
            METHOD_CREATE_NOTIFICATION_CHANNEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.CreateNotificationChannelRequest,
                com.google.monitoring.v3.NotificationChannel>(
                  this, METHODID_CREATE_NOTIFICATION_CHANNEL)))
          .addMethod(
            METHOD_UPDATE_NOTIFICATION_CHANNEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.UpdateNotificationChannelRequest,
                com.google.monitoring.v3.NotificationChannel>(
                  this, METHODID_UPDATE_NOTIFICATION_CHANNEL)))
          .addMethod(
            METHOD_DELETE_NOTIFICATION_CHANNEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.DeleteNotificationChannelRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NOTIFICATION_CHANNEL)))
          .addMethod(
            METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE)))
          .addMethod(
            METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
                com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>(
                  this, METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE)))
          .addMethod(
            METHOD_VERIFY_NOTIFICATION_CHANNEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.monitoring.v3.VerifyNotificationChannelRequest,
                com.google.monitoring.v3.NotificationChannel>(
                  this, METHODID_VERIFY_NOTIFICATION_CHANNEL)))
          .build();
    }
  }

  /**
   * <pre>
   * The Notification Channel API provides access to configuration that
   * controls how messages related to incidents are sent.
   * </pre>
   */
  public static final class NotificationChannelServiceStub extends io.grpc.stub.AbstractStub<NotificationChannelServiceStub> {
    private NotificationChannelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationChannelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the descriptors for supported channel types. The use of descriptors
     * makes it possible for new channel types to be dynamically added.
     * </pre>
     */
    public void listNotificationChannelDescriptors(com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single channel descriptor. The descriptor indicates which fields
     * are expected / permitted for a notification channel of the given type.
     * </pre>
     */
    public void getNotificationChannelDescriptor(com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the notification channels that have been created for the project.
     * </pre>
     */
    public void listNotificationChannels(com.google.monitoring.v3.ListNotificationChannelsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_NOTIFICATION_CHANNELS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single notification channel. The channel includes the relevant
     * configuration details with which the channel was created. However, the
     * response may truncate or omit passwords, API keys, or other private key
     * matter and thus the response may not be 100% identical to the information
     * that was supplied in the call to the create method.
     * </pre>
     */
    public void getNotificationChannel(com.google.monitoring.v3.GetNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new notification channel, representing a single notification
     * endpoint such as an email address, SMS number, or pagerduty service.
     * </pre>
     */
    public void createNotificationChannel(com.google.monitoring.v3.CreateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_NOTIFICATION_CHANNEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a notification channel. Fields not specified in the field mask
     * remain unchanged.
     * </pre>
     */
    public void updateNotificationChannel(com.google.monitoring.v3.UpdateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NOTIFICATION_CHANNEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a notification channel.
     * </pre>
     */
    public void deleteNotificationChannel(com.google.monitoring.v3.DeleteNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_NOTIFICATION_CHANNEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Causes a verification code to be delivered to the channel. The code
     * can then be supplied in `VerifyNotificationChannel` to verify the channel.
     * </pre>
     */
    public void sendNotificationChannelVerificationCode(com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests a verification code for an already verified channel that can then
     * be used in a call to VerifyNotificationChannel() on a different channel
     * with an equivalent identity in the same or in a different project. This
     * makes it possible to copy a channel between projects without requiring
     * manual reverification of the channel. If the channel is not in the
     * verified state, this method will fail (in other words, this may only be
     * used if the SendNotificationChannelVerificationCode and
     * VerifyNotificationChannel paths have already been used to put the given
     * channel into the verified state).
     * There is no guarantee that the verification codes returned by this method
     * will be of a similar structure or form as the ones that are delivered
     * to the channel via SendNotificationChannelVerificationCode; while
     * VerifyNotificationChannel() will recognize both the codes delivered via
     * SendNotificationChannelVerificationCode() and returned from
     * GetNotificationChannelVerificationCode(), it is typically the case that
     * the verification codes delivered via
     * SendNotificationChannelVerificationCode() will be shorter and also
     * have a shorter expiration (e.g. codes such as "G-123456") whereas
     * GetVerificationCode() will typically return a much longer, websafe base
     * 64 encoded string that has a longer expiration time.
     * </pre>
     */
    public void getNotificationChannelVerificationCode(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verifies a `NotificationChannel` by proving receipt of the code
     * delivered to the channel as a result of calling
     * `SendNotificationChannelVerificationCode`.
     * </pre>
     */
    public void verifyNotificationChannel(com.google.monitoring.v3.VerifyNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VERIFY_NOTIFICATION_CHANNEL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Notification Channel API provides access to configuration that
   * controls how messages related to incidents are sent.
   * </pre>
   */
  public static final class NotificationChannelServiceBlockingStub extends io.grpc.stub.AbstractStub<NotificationChannelServiceBlockingStub> {
    private NotificationChannelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationChannelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the descriptors for supported channel types. The use of descriptors
     * makes it possible for new channel types to be dynamically added.
     * </pre>
     */
    public com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse listNotificationChannelDescriptors(com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single channel descriptor. The descriptor indicates which fields
     * are expected / permitted for a notification channel of the given type.
     * </pre>
     */
    public com.google.monitoring.v3.NotificationChannelDescriptor getNotificationChannelDescriptor(com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the notification channels that have been created for the project.
     * </pre>
     */
    public com.google.monitoring.v3.ListNotificationChannelsResponse listNotificationChannels(com.google.monitoring.v3.ListNotificationChannelsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_NOTIFICATION_CHANNELS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single notification channel. The channel includes the relevant
     * configuration details with which the channel was created. However, the
     * response may truncate or omit passwords, API keys, or other private key
     * matter and thus the response may not be 100% identical to the information
     * that was supplied in the call to the create method.
     * </pre>
     */
    public com.google.monitoring.v3.NotificationChannel getNotificationChannel(com.google.monitoring.v3.GetNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NOTIFICATION_CHANNEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new notification channel, representing a single notification
     * endpoint such as an email address, SMS number, or pagerduty service.
     * </pre>
     */
    public com.google.monitoring.v3.NotificationChannel createNotificationChannel(com.google.monitoring.v3.CreateNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_NOTIFICATION_CHANNEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a notification channel. Fields not specified in the field mask
     * remain unchanged.
     * </pre>
     */
    public com.google.monitoring.v3.NotificationChannel updateNotificationChannel(com.google.monitoring.v3.UpdateNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NOTIFICATION_CHANNEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a notification channel.
     * </pre>
     */
    public com.google.protobuf.Empty deleteNotificationChannel(com.google.monitoring.v3.DeleteNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_NOTIFICATION_CHANNEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Causes a verification code to be delivered to the channel. The code
     * can then be supplied in `VerifyNotificationChannel` to verify the channel.
     * </pre>
     */
    public com.google.protobuf.Empty sendNotificationChannelVerificationCode(com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests a verification code for an already verified channel that can then
     * be used in a call to VerifyNotificationChannel() on a different channel
     * with an equivalent identity in the same or in a different project. This
     * makes it possible to copy a channel between projects without requiring
     * manual reverification of the channel. If the channel is not in the
     * verified state, this method will fail (in other words, this may only be
     * used if the SendNotificationChannelVerificationCode and
     * VerifyNotificationChannel paths have already been used to put the given
     * channel into the verified state).
     * There is no guarantee that the verification codes returned by this method
     * will be of a similar structure or form as the ones that are delivered
     * to the channel via SendNotificationChannelVerificationCode; while
     * VerifyNotificationChannel() will recognize both the codes delivered via
     * SendNotificationChannelVerificationCode() and returned from
     * GetNotificationChannelVerificationCode(), it is typically the case that
     * the verification codes delivered via
     * SendNotificationChannelVerificationCode() will be shorter and also
     * have a shorter expiration (e.g. codes such as "G-123456") whereas
     * GetVerificationCode() will typically return a much longer, websafe base
     * 64 encoded string that has a longer expiration time.
     * </pre>
     */
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse getNotificationChannelVerificationCode(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Verifies a `NotificationChannel` by proving receipt of the code
     * delivered to the channel as a result of calling
     * `SendNotificationChannelVerificationCode`.
     * </pre>
     */
    public com.google.monitoring.v3.NotificationChannel verifyNotificationChannel(com.google.monitoring.v3.VerifyNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VERIFY_NOTIFICATION_CHANNEL, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Notification Channel API provides access to configuration that
   * controls how messages related to incidents are sent.
   * </pre>
   */
  public static final class NotificationChannelServiceFutureStub extends io.grpc.stub.AbstractStub<NotificationChannelServiceFutureStub> {
    private NotificationChannelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationChannelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the descriptors for supported channel types. The use of descriptors
     * makes it possible for new channel types to be dynamically added.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse> listNotificationChannelDescriptors(
        com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single channel descriptor. The descriptor indicates which fields
     * are expected / permitted for a notification channel of the given type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.NotificationChannelDescriptor> getNotificationChannelDescriptor(
        com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the notification channels that have been created for the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.ListNotificationChannelsResponse> listNotificationChannels(
        com.google.monitoring.v3.ListNotificationChannelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_NOTIFICATION_CHANNELS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single notification channel. The channel includes the relevant
     * configuration details with which the channel was created. However, the
     * response may truncate or omit passwords, API keys, or other private key
     * matter and thus the response may not be 100% identical to the information
     * that was supplied in the call to the create method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.NotificationChannel> getNotificationChannel(
        com.google.monitoring.v3.GetNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new notification channel, representing a single notification
     * endpoint such as an email address, SMS number, or pagerduty service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.NotificationChannel> createNotificationChannel(
        com.google.monitoring.v3.CreateNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_NOTIFICATION_CHANNEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a notification channel. Fields not specified in the field mask
     * remain unchanged.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.NotificationChannel> updateNotificationChannel(
        com.google.monitoring.v3.UpdateNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NOTIFICATION_CHANNEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a notification channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNotificationChannel(
        com.google.monitoring.v3.DeleteNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_NOTIFICATION_CHANNEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Causes a verification code to be delivered to the channel. The code
     * can then be supplied in `VerifyNotificationChannel` to verify the channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendNotificationChannelVerificationCode(
        com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests a verification code for an already verified channel that can then
     * be used in a call to VerifyNotificationChannel() on a different channel
     * with an equivalent identity in the same or in a different project. This
     * makes it possible to copy a channel between projects without requiring
     * manual reverification of the channel. If the channel is not in the
     * verified state, this method will fail (in other words, this may only be
     * used if the SendNotificationChannelVerificationCode and
     * VerifyNotificationChannel paths have already been used to put the given
     * channel into the verified state).
     * There is no guarantee that the verification codes returned by this method
     * will be of a similar structure or form as the ones that are delivered
     * to the channel via SendNotificationChannelVerificationCode; while
     * VerifyNotificationChannel() will recognize both the codes delivered via
     * SendNotificationChannelVerificationCode() and returned from
     * GetNotificationChannelVerificationCode(), it is typically the case that
     * the verification codes delivered via
     * SendNotificationChannelVerificationCode() will be shorter and also
     * have a shorter expiration (e.g. codes such as "G-123456") whereas
     * GetVerificationCode() will typically return a much longer, websafe base
     * 64 encoded string that has a longer expiration time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse> getNotificationChannelVerificationCode(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Verifies a `NotificationChannel` by proving receipt of the code
     * delivered to the channel as a result of calling
     * `SendNotificationChannelVerificationCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.monitoring.v3.NotificationChannel> verifyNotificationChannel(
        com.google.monitoring.v3.VerifyNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VERIFY_NOTIFICATION_CHANNEL, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS = 0;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR = 1;
  private static final int METHODID_LIST_NOTIFICATION_CHANNELS = 2;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL = 3;
  private static final int METHODID_CREATE_NOTIFICATION_CHANNEL = 4;
  private static final int METHODID_UPDATE_NOTIFICATION_CHANNEL = 5;
  private static final int METHODID_DELETE_NOTIFICATION_CHANNEL = 6;
  private static final int METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE = 7;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE = 8;
  private static final int METHODID_VERIFY_NOTIFICATION_CHANNEL = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationChannelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationChannelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS:
          serviceImpl.listNotificationChannelDescriptors((com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR:
          serviceImpl.getNotificationChannelDescriptor((com.google.monitoring.v3.GetNotificationChannelDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATION_CHANNELS:
          serviceImpl.listNotificationChannels((com.google.monitoring.v3.ListNotificationChannelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelsResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL:
          serviceImpl.getNotificationChannel((com.google.monitoring.v3.GetNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>) responseObserver);
          break;
        case METHODID_CREATE_NOTIFICATION_CHANNEL:
          serviceImpl.createNotificationChannel((com.google.monitoring.v3.CreateNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION_CHANNEL:
          serviceImpl.updateNotificationChannel((com.google.monitoring.v3.UpdateNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION_CHANNEL:
          serviceImpl.deleteNotificationChannel((com.google.monitoring.v3.DeleteNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE:
          serviceImpl.sendNotificationChannelVerificationCode((com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE:
          serviceImpl.getNotificationChannelVerificationCode((com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>) responseObserver);
          break;
        case METHODID_VERIFY_NOTIFICATION_CHANNEL:
          serviceImpl.verifyNotificationChannel((com.google.monitoring.v3.VerifyNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>) responseObserver);
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

  private static final class NotificationChannelServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationChannelServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS)
              .addMethod(METHOD_GET_NOTIFICATION_CHANNEL_DESCRIPTOR)
              .addMethod(METHOD_LIST_NOTIFICATION_CHANNELS)
              .addMethod(METHOD_GET_NOTIFICATION_CHANNEL)
              .addMethod(METHOD_CREATE_NOTIFICATION_CHANNEL)
              .addMethod(METHOD_UPDATE_NOTIFICATION_CHANNEL)
              .addMethod(METHOD_DELETE_NOTIFICATION_CHANNEL)
              .addMethod(METHOD_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE)
              .addMethod(METHOD_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE)
              .addMethod(METHOD_VERIFY_NOTIFICATION_CHANNEL)
              .build();
        }
      }
    }
    return result;
  }
}
