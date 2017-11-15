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
 * Manages session entity types.
 * Session entity types can be redefined on a session level, allowing for
 * specific concepts, like a user's playlists.
 * Standard methods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/session_entity_type.proto")
public final class SessionEntityTypesGrpc {

  private SessionEntityTypesGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.SessionEntityTypes";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,
      com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse> METHOD_LIST_SESSION_ENTITY_TYPES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.SessionEntityTypes", "ListSessionEntityTypes"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.SessionEntityType> METHOD_GET_SESSION_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.SessionEntityTypes", "GetSessionEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.SessionEntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.SessionEntityType> METHOD_CREATE_SESSION_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.SessionEntityTypes", "CreateSessionEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.SessionEntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest,
      com.google.cloud.dialogflow.v2beta1.SessionEntityType> METHOD_UPDATE_SESSION_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.SessionEntityTypes", "UpdateSessionEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.SessionEntityType.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SESSION_ENTITY_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.SessionEntityTypes", "DeleteSessionEntityType"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionEntityTypesStub newStub(io.grpc.Channel channel) {
    return new SessionEntityTypesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionEntityTypesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SessionEntityTypesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SessionEntityTypesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SessionEntityTypesFutureStub(channel);
  }

  /**
   * <pre>
   * Manages session entity types.
   * Session entity types can be redefined on a session level, allowing for
   * specific concepts, like a user's playlists.
   * Standard methods.
   * </pre>
   */
  public static abstract class SessionEntityTypesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the list of all session entity types in the specified session.
     * </pre>
     */
    public void listSessionEntityTypes(com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SESSION_ENTITY_TYPES, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified session entity type.
     * </pre>
     */
    public void getSessionEntityType(com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SESSION_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * </pre>
     */
    public void createSessionEntityType(com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SESSION_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * </pre>
     */
    public void updateSessionEntityType(com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SESSION_ENTITY_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * </pre>
     */
    public void deleteSessionEntityType(com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SESSION_ENTITY_TYPE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_SESSION_ENTITY_TYPES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,
                com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse>(
                  this, METHODID_LIST_SESSION_ENTITY_TYPES)))
          .addMethod(
            METHOD_GET_SESSION_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.SessionEntityType>(
                  this, METHODID_GET_SESSION_ENTITY_TYPE)))
          .addMethod(
            METHOD_CREATE_SESSION_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.SessionEntityType>(
                  this, METHODID_CREATE_SESSION_ENTITY_TYPE)))
          .addMethod(
            METHOD_UPDATE_SESSION_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest,
                com.google.cloud.dialogflow.v2beta1.SessionEntityType>(
                  this, METHODID_UPDATE_SESSION_ENTITY_TYPE)))
          .addMethod(
            METHOD_DELETE_SESSION_ENTITY_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SESSION_ENTITY_TYPE)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages session entity types.
   * Session entity types can be redefined on a session level, allowing for
   * specific concepts, like a user's playlists.
   * Standard methods.
   * </pre>
   */
  public static final class SessionEntityTypesStub extends io.grpc.stub.AbstractStub<SessionEntityTypesStub> {
    private SessionEntityTypesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionEntityTypesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all session entity types in the specified session.
     * </pre>
     */
    public void listSessionEntityTypes(com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SESSION_ENTITY_TYPES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the specified session entity type.
     * </pre>
     */
    public void getSessionEntityType(com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * </pre>
     */
    public void createSessionEntityType(com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * </pre>
     */
    public void updateSessionEntityType(com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SESSION_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * </pre>
     */
    public void deleteSessionEntityType(com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION_ENTITY_TYPE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages session entity types.
   * Session entity types can be redefined on a session level, allowing for
   * specific concepts, like a user's playlists.
   * Standard methods.
   * </pre>
   */
  public static final class SessionEntityTypesBlockingStub extends io.grpc.stub.AbstractStub<SessionEntityTypesBlockingStub> {
    private SessionEntityTypesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionEntityTypesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all session entity types in the specified session.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse listSessionEntityTypes(com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SESSION_ENTITY_TYPES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the specified session entity type.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.SessionEntityType getSessionEntityType(com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SESSION_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.SessionEntityType createSessionEntityType(com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SESSION_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.SessionEntityType updateSessionEntityType(com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SESSION_ENTITY_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSessionEntityType(com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SESSION_ENTITY_TYPE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages session entity types.
   * Session entity types can be redefined on a session level, allowing for
   * specific concepts, like a user's playlists.
   * Standard methods.
   * </pre>
   */
  public static final class SessionEntityTypesFutureStub extends io.grpc.stub.AbstractStub<SessionEntityTypesFutureStub> {
    private SessionEntityTypesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionEntityTypesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionEntityTypesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionEntityTypesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the list of all session entity types in the specified session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse> listSessionEntityTypes(
        com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SESSION_ENTITY_TYPES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the specified session entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.SessionEntityType> getSessionEntityType(
        com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SESSION_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a session entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.SessionEntityType> createSessionEntityType(
        com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified session entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.SessionEntityType> updateSessionEntityType(
        com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SESSION_ENTITY_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the specified session entity type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSessionEntityType(
        com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION_ENTITY_TYPE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SESSION_ENTITY_TYPES = 0;
  private static final int METHODID_GET_SESSION_ENTITY_TYPE = 1;
  private static final int METHODID_CREATE_SESSION_ENTITY_TYPE = 2;
  private static final int METHODID_UPDATE_SESSION_ENTITY_TYPE = 3;
  private static final int METHODID_DELETE_SESSION_ENTITY_TYPE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionEntityTypesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionEntityTypesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SESSION_ENTITY_TYPES:
          serviceImpl.listSessionEntityTypes((com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_ENTITY_TYPE:
          serviceImpl.getSessionEntityType((com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType>) responseObserver);
          break;
        case METHODID_CREATE_SESSION_ENTITY_TYPE:
          serviceImpl.createSessionEntityType((com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType>) responseObserver);
          break;
        case METHODID_UPDATE_SESSION_ENTITY_TYPE:
          serviceImpl.updateSessionEntityType((com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.SessionEntityType>) responseObserver);
          break;
        case METHODID_DELETE_SESSION_ENTITY_TYPE:
          serviceImpl.deleteSessionEntityType((com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest) request,
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

  private static final class SessionEntityTypesDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SessionEntityTypesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionEntityTypesDescriptorSupplier())
              .addMethod(METHOD_LIST_SESSION_ENTITY_TYPES)
              .addMethod(METHOD_GET_SESSION_ENTITY_TYPE)
              .addMethod(METHOD_CREATE_SESSION_ENTITY_TYPE)
              .addMethod(METHOD_UPDATE_SESSION_ENTITY_TYPE)
              .addMethod(METHOD_DELETE_SESSION_ENTITY_TYPE)
              .build();
        }
      }
    }
    return result;
  }
}
