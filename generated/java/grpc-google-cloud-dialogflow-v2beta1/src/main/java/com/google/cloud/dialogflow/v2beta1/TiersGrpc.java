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
 * # Manages agent tier.
 * Standard methods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/tier.proto")
public final class TiersGrpc {

  private TiersGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Tiers";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest,
      com.google.cloud.dialogflow.v2beta1.AgentTier> METHOD_GET_AGENT_TIER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Tiers", "GetAgentTier"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.AgentTier.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest,
      com.google.cloud.dialogflow.v2beta1.AgentTier> METHOD_UPDATE_AGENT_TIER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Tiers", "UpdateAgentTier"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.AgentTier.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TiersStub newStub(io.grpc.Channel channel) {
    return new TiersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TiersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TiersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TiersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TiersFutureStub(channel);
  }

  /**
   * <pre>
   * # Manages agent tier.
   * Standard methods.
   * </pre>
   */
  public static abstract class TiersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the tier of the specified agent.
     * </pre>
     */
    public void getAgentTier(com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AGENT_TIER, responseObserver);
    }

    /**
     * <pre>
     * Updates the tier of the specified agent.
     * </pre>
     */
    public void updateAgentTier(com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_AGENT_TIER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AGENT_TIER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest,
                com.google.cloud.dialogflow.v2beta1.AgentTier>(
                  this, METHODID_GET_AGENT_TIER)))
          .addMethod(
            METHOD_UPDATE_AGENT_TIER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest,
                com.google.cloud.dialogflow.v2beta1.AgentTier>(
                  this, METHODID_UPDATE_AGENT_TIER)))
          .build();
    }
  }

  /**
   * <pre>
   * # Manages agent tier.
   * Standard methods.
   * </pre>
   */
  public static final class TiersStub extends io.grpc.stub.AbstractStub<TiersStub> {
    private TiersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TiersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TiersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the tier of the specified agent.
     * </pre>
     */
    public void getAgentTier(com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AGENT_TIER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the tier of the specified agent.
     * </pre>
     */
    public void updateAgentTier(com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_AGENT_TIER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * # Manages agent tier.
   * Standard methods.
   * </pre>
   */
  public static final class TiersBlockingStub extends io.grpc.stub.AbstractStub<TiersBlockingStub> {
    private TiersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TiersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TiersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the tier of the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.AgentTier getAgentTier(com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AGENT_TIER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the tier of the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.AgentTier updateAgentTier(com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_AGENT_TIER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * # Manages agent tier.
   * Standard methods.
   * </pre>
   */
  public static final class TiersFutureStub extends io.grpc.stub.AbstractStub<TiersFutureStub> {
    private TiersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TiersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TiersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TiersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the tier of the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.AgentTier> getAgentTier(
        com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AGENT_TIER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the tier of the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.AgentTier> updateAgentTier(
        com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_AGENT_TIER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_TIER = 0;
  private static final int METHODID_UPDATE_AGENT_TIER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TiersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TiersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT_TIER:
          serviceImpl.getAgentTier((com.google.cloud.dialogflow.v2beta1.GetAgentTierRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_TIER:
          serviceImpl.updateAgentTier((com.google.cloud.dialogflow.v2beta1.UpdateAgentTierRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.AgentTier>) responseObserver);
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

  private static final class TiersDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.TierProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TiersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TiersDescriptorSupplier())
              .addMethod(METHOD_GET_AGENT_TIER)
              .addMethod(METHOD_UPDATE_AGENT_TIER)
              .build();
        }
      }
    }
    return result;
  }
}
