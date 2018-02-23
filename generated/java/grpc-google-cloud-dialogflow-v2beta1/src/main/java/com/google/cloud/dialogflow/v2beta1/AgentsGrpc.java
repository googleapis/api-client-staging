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
 * Manages conversational agents.
 * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/agents)
 * for more details about agents.
 * #
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/agent.proto")
public final class AgentsGrpc {

  private AgentsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Agents";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
      com.google.cloud.dialogflow.v2beta1.Agent> METHOD_GET_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "GetAgent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetAgentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.Agent.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
      com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse> METHOD_SEARCH_AGENTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "SearchAgents"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,
      com.google.longrunning.Operation> METHOD_TRAIN_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "TrainAgent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
      com.google.longrunning.Operation> METHOD_EXPORT_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "ExportAgent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
      com.google.longrunning.Operation> METHOD_IMPORT_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "ImportAgent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
      com.google.longrunning.Operation> METHOD_RESTORE_AGENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Agents", "RestoreAgent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentsStub newStub(io.grpc.Channel channel) {
    return new AgentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AgentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages conversational agents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/agents)
   * for more details about agents.
   * #
   * </pre>
   */
  public static abstract class AgentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public void getAgent(com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AGENT, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public void searchAgents(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_AGENTS, responseObserver);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void trainAgent(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRAIN_AGENT, responseObserver);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void exportAgent(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXPORT_AGENT, responseObserver);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void importAgent(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IMPORT_AGENT, responseObserver);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void restoreAgent(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESTORE_AGENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AGENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetAgentRequest,
                com.google.cloud.dialogflow.v2beta1.Agent>(
                  this, METHODID_GET_AGENT)))
          .addMethod(
            METHOD_SEARCH_AGENTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest,
                com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>(
                  this, METHODID_SEARCH_AGENTS)))
          .addMethod(
            METHOD_TRAIN_AGENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.TrainAgentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_TRAIN_AGENT)))
          .addMethod(
            METHOD_EXPORT_AGENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ExportAgentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_AGENT)))
          .addMethod(
            METHOD_IMPORT_AGENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ImportAgentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_IMPORT_AGENT)))
          .addMethod(
            METHOD_RESTORE_AGENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RESTORE_AGENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages conversational agents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/agents)
   * for more details about agents.
   * #
   * </pre>
   */
  public static final class AgentsStub extends io.grpc.stub.AbstractStub<AgentsStub> {
    private AgentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public void getAgent(com.google.cloud.dialogflow.v2beta1.GetAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AGENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public void searchAgents(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_AGENTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void trainAgent(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRAIN_AGENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void exportAgent(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXPORT_AGENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void importAgent(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IMPORT_AGENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void restoreAgent(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESTORE_AGENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages conversational agents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/agents)
   * for more details about agents.
   * #
   * </pre>
   */
  public static final class AgentsBlockingStub extends io.grpc.stub.AbstractStub<AgentsBlockingStub> {
    private AgentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.Agent getAgent(com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AGENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse searchAgents(com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_AGENTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation trainAgent(com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRAIN_AGENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation exportAgent(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXPORT_AGENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation importAgent(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IMPORT_AGENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation restoreAgent(com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESTORE_AGENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages conversational agents.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/agents)
   * for more details about agents.
   * #
   * </pre>
   */
  public static final class AgentsFutureStub extends io.grpc.stub.AbstractStub<AgentsFutureStub> {
    private AgentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.Agent> getAgent(
        com.google.cloud.dialogflow.v2beta1.GetAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AGENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of agents.
     * Since there is at most one conversational agent per project, this method is
     * useful primarily for listing all agents across projects the caller has
     * access to. One can achieve that with a wildcard project collection id "-".
     * Refer to [List
     * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse> searchAgents(
        com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_AGENTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Trains the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> trainAgent(
        com.google.cloud.dialogflow.v2beta1.TrainAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRAIN_AGENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports the specified agent to a ZIP file.
     * Operation &lt;response: [ExportAgentResponse][google.cloud.dialogflow.v2beta1.ExportAgentResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportAgent(
        com.google.cloud.dialogflow.v2beta1.ExportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXPORT_AGENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Imports the specified agent from a ZIP file.
     * Uploads new intents and entity types without deleting the existing ones.
     * Intents and entity types with the same name are replaced with the new
     * versions from ImportAgentRequest.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> importAgent(
        com.google.cloud.dialogflow.v2beta1.ImportAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IMPORT_AGENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Restores the specified agent from a ZIP file.
     * Replaces the current agent version with a new one. All the intents and
     * entity types in the older version are deleted.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> restoreAgent(
        com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESTORE_AGENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT = 0;
  private static final int METHODID_SEARCH_AGENTS = 1;
  private static final int METHODID_TRAIN_AGENT = 2;
  private static final int METHODID_EXPORT_AGENT = 3;
  private static final int METHODID_IMPORT_AGENT = 4;
  private static final int METHODID_RESTORE_AGENT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT:
          serviceImpl.getAgent((com.google.cloud.dialogflow.v2beta1.GetAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.Agent>) responseObserver);
          break;
        case METHODID_SEARCH_AGENTS:
          serviceImpl.searchAgents((com.google.cloud.dialogflow.v2beta1.SearchAgentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SearchAgentsResponse>) responseObserver);
          break;
        case METHODID_TRAIN_AGENT:
          serviceImpl.trainAgent((com.google.cloud.dialogflow.v2beta1.TrainAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_AGENT:
          serviceImpl.exportAgent((com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IMPORT_AGENT:
          serviceImpl.importAgent((com.google.cloud.dialogflow.v2beta1.ImportAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESTORE_AGENT:
          serviceImpl.restoreAgent((com.google.cloud.dialogflow.v2beta1.RestoreAgentRequest) request,
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

  private static final class AgentsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AgentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentsDescriptorSupplier())
              .addMethod(METHOD_GET_AGENT)
              .addMethod(METHOD_SEARCH_AGENTS)
              .addMethod(METHOD_TRAIN_AGENT)
              .addMethod(METHOD_EXPORT_AGENT)
              .addMethod(METHOD_IMPORT_AGENT)
              .addMethod(METHOD_RESTORE_AGENT)
              .build();
        }
      }
    }
    return result;
  }
}
