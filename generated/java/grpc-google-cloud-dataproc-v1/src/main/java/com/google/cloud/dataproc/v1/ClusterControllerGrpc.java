package com.google.cloud.dataproc.v1;

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
 * The ClusterControllerService provides methods to manage clusters
 * of Google Compute Engine instances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dataproc/v1/clusters.proto")
public final class ClusterControllerGrpc {

  private ClusterControllerGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dataproc.v1.ClusterController";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.CreateClusterRequest,
      com.google.longrunning.Operation> METHOD_CREATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "CreateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.CreateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.UpdateClusterRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "UpdateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.UpdateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.DeleteClusterRequest,
      com.google.longrunning.Operation> METHOD_DELETE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "DeleteCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.DeleteClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.GetClusterRequest,
      com.google.cloud.dataproc.v1.Cluster> METHOD_GET_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "GetCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.GetClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.Cluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.ListClustersRequest,
      com.google.cloud.dataproc.v1.ListClustersResponse> METHOD_LIST_CLUSTERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "ListClusters"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.ListClustersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.ListClustersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.DiagnoseClusterRequest,
      com.google.longrunning.Operation> METHOD_DIAGNOSE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.ClusterController", "DiagnoseCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.DiagnoseClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterControllerStub newStub(io.grpc.Channel channel) {
    return new ClusterControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterControllerFutureStub(channel);
  }

  /**
   * <pre>
   * The ClusterControllerService provides methods to manage clusters
   * of Google Compute Engine instances.
   * </pre>
   */
  public static abstract class ClusterControllerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a cluster in a project.
     * </pre>
     */
    public void createCluster(com.google.cloud.dataproc.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Updates a cluster in a project.
     * </pre>
     */
    public void updateCluster(com.google.cloud.dataproc.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Deletes a cluster in a project.
     * </pre>
     */
    public void deleteCluster(com.google.cloud.dataproc.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Gets the resource representation for a cluster in a project.
     * </pre>
     */
    public void getCluster(com.google.cloud.dataproc.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Cluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Lists all regions/{region}/clusters in a project.
     * </pre>
     */
    public void listClusters(com.google.cloud.dataproc.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListClustersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CLUSTERS, responseObserver);
    }

    /**
     * <pre>
     * Gets cluster diagnostic information.
     * After the operation completes, the Operation.response field
     * contains `DiagnoseClusterOutputLocation`.
     * </pre>
     */
    public void diagnoseCluster(com.google.cloud.dataproc.v1.DiagnoseClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DIAGNOSE_CLUSTER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.CreateClusterRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_CLUSTER)))
          .addMethod(
            METHOD_UPDATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.UpdateClusterRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_CLUSTER)))
          .addMethod(
            METHOD_DELETE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.DeleteClusterRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_CLUSTER)))
          .addMethod(
            METHOD_GET_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.GetClusterRequest,
                com.google.cloud.dataproc.v1.Cluster>(
                  this, METHODID_GET_CLUSTER)))
          .addMethod(
            METHOD_LIST_CLUSTERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.ListClustersRequest,
                com.google.cloud.dataproc.v1.ListClustersResponse>(
                  this, METHODID_LIST_CLUSTERS)))
          .addMethod(
            METHOD_DIAGNOSE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.DiagnoseClusterRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DIAGNOSE_CLUSTER)))
          .build();
    }
  }

  /**
   * <pre>
   * The ClusterControllerService provides methods to manage clusters
   * of Google Compute Engine instances.
   * </pre>
   */
  public static final class ClusterControllerStub extends io.grpc.stub.AbstractStub<ClusterControllerStub> {
    private ClusterControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterControllerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a cluster in a project.
     * </pre>
     */
    public void createCluster(com.google.cloud.dataproc.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a cluster in a project.
     * </pre>
     */
    public void updateCluster(com.google.cloud.dataproc.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a cluster in a project.
     * </pre>
     */
    public void deleteCluster(com.google.cloud.dataproc.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the resource representation for a cluster in a project.
     * </pre>
     */
    public void getCluster(com.google.cloud.dataproc.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Cluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all regions/{region}/clusters in a project.
     * </pre>
     */
    public void listClusters(com.google.cloud.dataproc.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListClustersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets cluster diagnostic information.
     * After the operation completes, the Operation.response field
     * contains `DiagnoseClusterOutputLocation`.
     * </pre>
     */
    public void diagnoseCluster(com.google.cloud.dataproc.v1.DiagnoseClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DIAGNOSE_CLUSTER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The ClusterControllerService provides methods to manage clusters
   * of Google Compute Engine instances.
   * </pre>
   */
  public static final class ClusterControllerBlockingStub extends io.grpc.stub.AbstractStub<ClusterControllerBlockingStub> {
    private ClusterControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterControllerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a cluster in a project.
     * </pre>
     */
    public com.google.longrunning.Operation createCluster(com.google.cloud.dataproc.v1.CreateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a cluster in a project.
     * </pre>
     */
    public com.google.longrunning.Operation updateCluster(com.google.cloud.dataproc.v1.UpdateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a cluster in a project.
     * </pre>
     */
    public com.google.longrunning.Operation deleteCluster(com.google.cloud.dataproc.v1.DeleteClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the resource representation for a cluster in a project.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.Cluster getCluster(com.google.cloud.dataproc.v1.GetClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all regions/{region}/clusters in a project.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.ListClustersResponse listClusters(com.google.cloud.dataproc.v1.ListClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CLUSTERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets cluster diagnostic information.
     * After the operation completes, the Operation.response field
     * contains `DiagnoseClusterOutputLocation`.
     * </pre>
     */
    public com.google.longrunning.Operation diagnoseCluster(com.google.cloud.dataproc.v1.DiagnoseClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DIAGNOSE_CLUSTER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The ClusterControllerService provides methods to manage clusters
   * of Google Compute Engine instances.
   * </pre>
   */
  public static final class ClusterControllerFutureStub extends io.grpc.stub.AbstractStub<ClusterControllerFutureStub> {
    private ClusterControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterControllerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a cluster in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createCluster(
        com.google.cloud.dataproc.v1.CreateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a cluster in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateCluster(
        com.google.cloud.dataproc.v1.UpdateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a cluster in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteCluster(
        com.google.cloud.dataproc.v1.DeleteClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the resource representation for a cluster in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.Cluster> getCluster(
        com.google.cloud.dataproc.v1.GetClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all regions/{region}/clusters in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.ListClustersResponse> listClusters(
        com.google.cloud.dataproc.v1.ListClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets cluster diagnostic information.
     * After the operation completes, the Operation.response field
     * contains `DiagnoseClusterOutputLocation`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> diagnoseCluster(
        com.google.cloud.dataproc.v1.DiagnoseClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DIAGNOSE_CLUSTER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLUSTER = 0;
  private static final int METHODID_UPDATE_CLUSTER = 1;
  private static final int METHODID_DELETE_CLUSTER = 2;
  private static final int METHODID_GET_CLUSTER = 3;
  private static final int METHODID_LIST_CLUSTERS = 4;
  private static final int METHODID_DIAGNOSE_CLUSTER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CLUSTER:
          serviceImpl.createCluster((com.google.cloud.dataproc.v1.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_CLUSTER:
          serviceImpl.updateCluster((com.google.cloud.dataproc.v1.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CLUSTER:
          serviceImpl.deleteCluster((com.google.cloud.dataproc.v1.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_CLUSTER:
          serviceImpl.getCluster((com.google.cloud.dataproc.v1.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Cluster>) responseObserver);
          break;
        case METHODID_LIST_CLUSTERS:
          serviceImpl.listClusters((com.google.cloud.dataproc.v1.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListClustersResponse>) responseObserver);
          break;
        case METHODID_DIAGNOSE_CLUSTER:
          serviceImpl.diagnoseCluster((com.google.cloud.dataproc.v1.DiagnoseClusterRequest) request,
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

  private static final class ClusterControllerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClusterControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterControllerDescriptorSupplier())
              .addMethod(METHOD_CREATE_CLUSTER)
              .addMethod(METHOD_UPDATE_CLUSTER)
              .addMethod(METHOD_DELETE_CLUSTER)
              .addMethod(METHOD_GET_CLUSTER)
              .addMethod(METHOD_LIST_CLUSTERS)
              .addMethod(METHOD_DIAGNOSE_CLUSTER)
              .build();
        }
      }
    }
    return result;
  }
}
