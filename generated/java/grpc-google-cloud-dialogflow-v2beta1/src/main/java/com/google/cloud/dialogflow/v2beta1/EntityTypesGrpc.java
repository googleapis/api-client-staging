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
 * Manages agent entity types.
 * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/entities)
 * for more details about entity types.
 * #
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/entity_type.proto")
public final class EntityTypesGrpc {

  private EntityTypesGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.EntityTypes";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,
      com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse> METHOD_LIST_ENTITY_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "ListEntityTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.EntityType> METHOD_GET_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "GetEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.EntityType> METHOD_CREATE_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "CreateEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.EntityType> METHOD_UPDATE_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "UpdateEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,
      com.google.protobuf.Empty> METHOD_DELETE_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "DeleteEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,
      com.google.longrunning.Operation> METHOD_BATCH_UPDATE_ENTITY_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "BatchUpdateEntityTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,
      com.google.longrunning.Operation> METHOD_BATCH_DELETE_ENTITY_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "BatchDeleteEntityTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,
      com.google.longrunning.Operation> METHOD_BATCH_CREATE_ENTITIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "BatchCreateEntities"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,
      com.google.longrunning.Operation> METHOD_BATCH_UPDATE_ENTITIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "BatchUpdateEntities"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,
      com.google.longrunning.Operation> METHOD_BATCH_DELETE_ENTITIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.EntityTypes", "BatchDeleteEntities"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntityTypesStub newStub(io.grpc.Channel channel) {
    return new EntityTypesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntityTypesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EntityTypesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static EntityTypesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EntityTypesFutureStub(channel);
  }

  /**
   * <pre>
   * Manages agent entity types.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/entities)
   * for more details about entity types.
   * #
   * </pre>
   */
  public static abstract class EntityTypesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public void listEntityTypes(com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ENTITY_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public void getEntityType(com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public void createEntityType(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public void updateEntityType(com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public void deleteEntityType(com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &lt;response: [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchUpdateEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_ENTITY_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchDeleteEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_DELETE_ENTITY_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Creates multiple new entities in the specified entity type (extends the
     * existing collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void batchCreateEntities(com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_CREATE_ENTITIES, responseObserver);
    }

    /**
     * <pre>
     * Updates entities in the specified entity type (replaces the existing
     * collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchUpdateEntities(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_ENTITIES, responseObserver);
    }

    /**
     * <pre>
     * Deletes entities in the specified entity type.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchDeleteEntities(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_DELETE_ENTITIES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_ENTITY_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,
                com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse>(
                  this, METHODID_LIST_ENTITY_TYPES)))
          .addMethod(
            METHOD_GET_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.EntityType>(
                  this, METHODID_GET_ENTITY_TYPE)))
          .addMethod(
            METHOD_CREATE_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.EntityType>(
                  this, METHODID_CREATE_ENTITY_TYPE)))
          .addMethod(
            METHOD_UPDATE_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.EntityType>(
                  this, METHODID_UPDATE_ENTITY_TYPE)))
          .addMethod(
            METHOD_DELETE_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ENTITY_TYPE)))
          .addMethod(
            METHOD_BATCH_UPDATE_ENTITY_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_UPDATE_ENTITY_TYPES)))
          .addMethod(
            METHOD_BATCH_DELETE_ENTITY_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_DELETE_ENTITY_TYPES)))
          .addMethod(
            METHOD_BATCH_CREATE_ENTITIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_CREATE_ENTITIES)))
          .addMethod(
            METHOD_BATCH_UPDATE_ENTITIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_UPDATE_ENTITIES)))
          .addMethod(
            METHOD_BATCH_DELETE_ENTITIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_DELETE_ENTITIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages agent entity types.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/entities)
   * for more details about entity types.
   * #
   * </pre>
   */
  public static final class EntityTypesStub extends io.grpc.stub.AbstractStub<EntityTypesStub> {
    private EntityTypesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityTypesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityTypesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public void listEntityTypes(com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ENTITY_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public void getEntityType(com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public void createEntityType(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public void updateEntityType(com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public void deleteEntityType(com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &lt;response: [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchUpdateEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_ENTITY_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchDeleteEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_ENTITY_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates multiple new entities in the specified entity type (extends the
     * existing collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public void batchCreateEntities(com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_CREATE_ENTITIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates entities in the specified entity type (replaces the existing
     * collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchUpdateEntities(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_ENTITIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes entities in the specified entity type.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public void batchDeleteEntities(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_ENTITIES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages agent entity types.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/entities)
   * for more details about entity types.
   * #
   * </pre>
   */
  public static final class EntityTypesBlockingStub extends io.grpc.stub.AbstractStub<EntityTypesBlockingStub> {
    private EntityTypesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityTypesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityTypesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse listEntityTypes(com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ENTITY_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType getEntityType(com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType createEntityType(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType updateEntityType(com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEntityType(com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &lt;response: [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchUpdateEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_ENTITY_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchDeleteEntityTypes(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_DELETE_ENTITY_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates multiple new entities in the specified entity type (extends the
     * existing collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchCreateEntities(com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_CREATE_ENTITIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates entities in the specified entity type (replaces the existing
     * collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchUpdateEntities(com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_ENTITIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes entities in the specified entity type.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.longrunning.Operation batchDeleteEntities(com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_DELETE_ENTITIES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages agent entity types.
   * Refer to the [Dialogflow documentation](https://dialogflow.com/docs/entities)
   * for more details about entity types.
   * #
   * </pre>
   */
  public static final class EntityTypesFutureStub extends io.grpc.stub.AbstractStub<EntityTypesFutureStub> {
    private EntityTypesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntityTypesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityTypesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntityTypesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all entity types in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse> listEntityTypes(
        com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ENTITY_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.EntityType> getEntityType(
        com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an entity type in the specified agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.EntityType> createEntityType(
        com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.EntityType> updateEntityType(
        com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEntityType(
        com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates/Creates multiple entity types in the specified agent.
     * Operation &lt;response: [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchUpdateEntityTypes(
        com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_ENTITY_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes entity types in the specified agent.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchDeleteEntityTypes(
        com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_ENTITY_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates multiple new entities in the specified entity type (extends the
     * existing collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchCreateEntities(
        com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_CREATE_ENTITIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates entities in the specified entity type (replaces the existing
     * collection of entries).
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchUpdateEntities(
        com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_ENTITIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes entities in the specified entity type.
     * Operation &lt;response: [google.protobuf.Empty][google.protobuf.Empty],
     *            metadata: [google.protobuf.Struct][google.protobuf.Struct]&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchDeleteEntities(
        com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_ENTITIES, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ENTITY_TYPES = 0;
  private static final int METHODID_GET_ENTITY_TYPE = 1;
  private static final int METHODID_CREATE_ENTITY_TYPE = 2;
  private static final int METHODID_UPDATE_ENTITY_TYPE = 3;
  private static final int METHODID_DELETE_ENTITY_TYPE = 4;
  private static final int METHODID_BATCH_UPDATE_ENTITY_TYPES = 5;
  private static final int METHODID_BATCH_DELETE_ENTITY_TYPES = 6;
  private static final int METHODID_BATCH_CREATE_ENTITIES = 7;
  private static final int METHODID_BATCH_UPDATE_ENTITIES = 8;
  private static final int METHODID_BATCH_DELETE_ENTITIES = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EntityTypesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EntityTypesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ENTITY_TYPES:
          serviceImpl.listEntityTypes((com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse>) responseObserver);
          break;
        case METHODID_GET_ENTITY_TYPE:
          serviceImpl.getEntityType((com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY_TYPE:
          serviceImpl.createEntityType((com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY_TYPE:
          serviceImpl.updateEntityType((com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.EntityType>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY_TYPE:
          serviceImpl.deleteEntityType((com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_ENTITY_TYPES:
          serviceImpl.batchUpdateEntityTypes((com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ENTITY_TYPES:
          serviceImpl.batchDeleteEntityTypes((com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ENTITIES:
          serviceImpl.batchCreateEntities((com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_ENTITIES:
          serviceImpl.batchUpdateEntities((com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_ENTITIES:
          serviceImpl.batchDeleteEntities((com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest) request,
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

  private static final class EntityTypesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EntityTypesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntityTypesDescriptorSupplier())
              .addMethod(METHOD_LIST_ENTITY_TYPES)
              .addMethod(METHOD_GET_ENTITY_TYPE)
              .addMethod(METHOD_CREATE_ENTITY_TYPE)
              .addMethod(METHOD_UPDATE_ENTITY_TYPE)
              .addMethod(METHOD_DELETE_ENTITY_TYPE)
              .addMethod(METHOD_BATCH_UPDATE_ENTITY_TYPES)
              .addMethod(METHOD_BATCH_DELETE_ENTITY_TYPES)
              .addMethod(METHOD_BATCH_CREATE_ENTITIES)
              .addMethod(METHOD_BATCH_UPDATE_ENTITIES)
              .addMethod(METHOD_BATCH_DELETE_ENTITIES)
              .build();
        }
      }
    }
    return result;
  }
}
