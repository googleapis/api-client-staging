package com.google.cloud.oslogin.v1;

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
 * Cloud OS Login API
 * The Cloud OS Login API allows you to manage users and their associated SSH
 * public keys for logging into virtual machines on Google Cloud Platform.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/oslogin/v1/oslogin.proto")
public final class OsLoginServiceGrpc {

  private OsLoginServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.oslogin.v1.OsLoginService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.DeletePosixAccountRequest,
      com.google.protobuf.Empty> METHOD_DELETE_POSIX_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "DeletePosixAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.DeletePosixAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SSH_PUBLIC_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "DeleteSshPublicKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.GetLoginProfileRequest,
      com.google.cloud.oslogin.v1.LoginProfile> METHOD_GET_LOGIN_PROFILE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "GetLoginProfile"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.GetLoginProfileRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.LoginProfile.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> METHOD_GET_SSH_PUBLIC_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "GetSshPublicKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.GetSshPublicKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse> METHOD_IMPORT_SSH_PUBLIC_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "ImportSshPublicKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
      com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> METHOD_UPDATE_SSH_PUBLIC_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.oslogin.v1.OsLoginService", "UpdateSshPublicKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OsLoginServiceStub newStub(io.grpc.Channel channel) {
    return new OsLoginServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OsLoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OsLoginServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static OsLoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OsLoginServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Cloud OS Login API
   * The Cloud OS Login API allows you to manage users and their associated SSH
   * public keys for logging into virtual machines on Google Cloud Platform.
   * </pre>
   */
  public static abstract class OsLoginServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Deletes a POSIX account.
     * </pre>
     */
    public void deletePosixAccount(com.google.cloud.oslogin.v1.DeletePosixAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_POSIX_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Deletes an SSH public key.
     * </pre>
     */
    public void deleteSshPublicKey(com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SSH_PUBLIC_KEY, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the profile information used for logging in to a virtual machine
     * on Google Compute Engine.
     * </pre>
     */
    public void getLoginProfile(com.google.cloud.oslogin.v1.GetLoginProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LOGIN_PROFILE, responseObserver);
    }

    /**
     * <pre>
     * Retrieves an SSH public key.
     * </pre>
     */
    public void getSshPublicKey(com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SSH_PUBLIC_KEY, responseObserver);
    }

    /**
     * <pre>
     * Adds an SSH public key and returns the profile information. Default POSIX
     * account information is set when no username and UID exist as part of the
     * login profile.
     * </pre>
     */
    public void importSshPublicKey(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IMPORT_SSH_PUBLIC_KEY, responseObserver);
    }

    /**
     * <pre>
     * Updates an SSH public key and returns the profile information. This method
     * supports patch semantics.
     * </pre>
     */
    public void updateSshPublicKey(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SSH_PUBLIC_KEY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DELETE_POSIX_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.DeletePosixAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_POSIX_ACCOUNT)))
          .addMethod(
            METHOD_DELETE_SSH_PUBLIC_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SSH_PUBLIC_KEY)))
          .addMethod(
            METHOD_GET_LOGIN_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.GetLoginProfileRequest,
                com.google.cloud.oslogin.v1.LoginProfile>(
                  this, METHODID_GET_LOGIN_PROFILE)))
          .addMethod(
            METHOD_GET_SSH_PUBLIC_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.GetSshPublicKeyRequest,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>(
                  this, METHODID_GET_SSH_PUBLIC_KEY)))
          .addMethod(
            METHOD_IMPORT_SSH_PUBLIC_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest,
                com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>(
                  this, METHODID_IMPORT_SSH_PUBLIC_KEY)))
          .addMethod(
            METHOD_UPDATE_SSH_PUBLIC_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>(
                  this, METHODID_UPDATE_SSH_PUBLIC_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud OS Login API
   * The Cloud OS Login API allows you to manage users and their associated SSH
   * public keys for logging into virtual machines on Google Cloud Platform.
   * </pre>
   */
  public static final class OsLoginServiceStub extends io.grpc.stub.AbstractStub<OsLoginServiceStub> {
    private OsLoginServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OsLoginServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OsLoginServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a POSIX account.
     * </pre>
     */
    public void deletePosixAccount(com.google.cloud.oslogin.v1.DeletePosixAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_POSIX_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an SSH public key.
     * </pre>
     */
    public void deleteSshPublicKey(com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SSH_PUBLIC_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the profile information used for logging in to a virtual machine
     * on Google Compute Engine.
     * </pre>
     */
    public void getLoginProfile(com.google.cloud.oslogin.v1.GetLoginProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LOGIN_PROFILE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves an SSH public key.
     * </pre>
     */
    public void getSshPublicKey(com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SSH_PUBLIC_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds an SSH public key and returns the profile information. Default POSIX
     * account information is set when no username and UID exist as part of the
     * login profile.
     * </pre>
     */
    public void importSshPublicKey(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IMPORT_SSH_PUBLIC_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an SSH public key and returns the profile information. This method
     * supports patch semantics.
     * </pre>
     */
    public void updateSshPublicKey(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SSH_PUBLIC_KEY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud OS Login API
   * The Cloud OS Login API allows you to manage users and their associated SSH
   * public keys for logging into virtual machines on Google Cloud Platform.
   * </pre>
   */
  public static final class OsLoginServiceBlockingStub extends io.grpc.stub.AbstractStub<OsLoginServiceBlockingStub> {
    private OsLoginServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OsLoginServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OsLoginServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a POSIX account.
     * </pre>
     */
    public com.google.protobuf.Empty deletePosixAccount(com.google.cloud.oslogin.v1.DeletePosixAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_POSIX_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an SSH public key.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSshPublicKey(com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SSH_PUBLIC_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the profile information used for logging in to a virtual machine
     * on Google Compute Engine.
     * </pre>
     */
    public com.google.cloud.oslogin.v1.LoginProfile getLoginProfile(com.google.cloud.oslogin.v1.GetLoginProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LOGIN_PROFILE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves an SSH public key.
     * </pre>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey(com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SSH_PUBLIC_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds an SSH public key and returns the profile information. Default POSIX
     * account information is set when no username and UID exist as part of the
     * login profile.
     * </pre>
     */
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse importSshPublicKey(com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IMPORT_SSH_PUBLIC_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an SSH public key and returns the profile information. This method
     * supports patch semantics.
     * </pre>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey updateSshPublicKey(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SSH_PUBLIC_KEY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud OS Login API
   * The Cloud OS Login API allows you to manage users and their associated SSH
   * public keys for logging into virtual machines on Google Cloud Platform.
   * </pre>
   */
  public static final class OsLoginServiceFutureStub extends io.grpc.stub.AbstractStub<OsLoginServiceFutureStub> {
    private OsLoginServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OsLoginServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OsLoginServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OsLoginServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deletes a POSIX account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePosixAccount(
        com.google.cloud.oslogin.v1.DeletePosixAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_POSIX_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an SSH public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSshPublicKey(
        com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SSH_PUBLIC_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the profile information used for logging in to a virtual machine
     * on Google Compute Engine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.oslogin.v1.LoginProfile> getLoginProfile(
        com.google.cloud.oslogin.v1.GetLoginProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LOGIN_PROFILE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves an SSH public key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> getSshPublicKey(
        com.google.cloud.oslogin.v1.GetSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SSH_PUBLIC_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds an SSH public key and returns the profile information. Default POSIX
     * account information is set when no username and UID exist as part of the
     * login profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse> importSshPublicKey(
        com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IMPORT_SSH_PUBLIC_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an SSH public key and returns the profile information. This method
     * supports patch semantics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey> updateSshPublicKey(
        com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SSH_PUBLIC_KEY, getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_POSIX_ACCOUNT = 0;
  private static final int METHODID_DELETE_SSH_PUBLIC_KEY = 1;
  private static final int METHODID_GET_LOGIN_PROFILE = 2;
  private static final int METHODID_GET_SSH_PUBLIC_KEY = 3;
  private static final int METHODID_IMPORT_SSH_PUBLIC_KEY = 4;
  private static final int METHODID_UPDATE_SSH_PUBLIC_KEY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OsLoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OsLoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_POSIX_ACCOUNT:
          serviceImpl.deletePosixAccount((com.google.cloud.oslogin.v1.DeletePosixAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_SSH_PUBLIC_KEY:
          serviceImpl.deleteSshPublicKey((com.google.cloud.oslogin.v1.DeleteSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_LOGIN_PROFILE:
          serviceImpl.getLoginProfile((com.google.cloud.oslogin.v1.GetLoginProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.LoginProfile>) responseObserver);
          break;
        case METHODID_GET_SSH_PUBLIC_KEY:
          serviceImpl.getSshPublicKey((com.google.cloud.oslogin.v1.GetSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>) responseObserver);
          break;
        case METHODID_IMPORT_SSH_PUBLIC_KEY:
          serviceImpl.importSshPublicKey((com.google.cloud.oslogin.v1.ImportSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SSH_PUBLIC_KEY:
          serviceImpl.updateSshPublicKey((com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>) responseObserver);
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

  private static final class OsLoginServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OsLoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OsLoginServiceDescriptorSupplier())
              .addMethod(METHOD_DELETE_POSIX_ACCOUNT)
              .addMethod(METHOD_DELETE_SSH_PUBLIC_KEY)
              .addMethod(METHOD_GET_LOGIN_PROFILE)
              .addMethod(METHOD_GET_SSH_PUBLIC_KEY)
              .addMethod(METHOD_IMPORT_SSH_PUBLIC_KEY)
              .addMethod(METHOD_UPDATE_SSH_PUBLIC_KEY)
              .build();
        }
      }
    }
    return result;
  }
}
