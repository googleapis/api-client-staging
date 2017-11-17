package com.google.container.v1;

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
 * Google Container Engine Cluster Manager v1
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/container/v1/cluster_service.proto")
public final class ClusterManagerGrpc {

  private ClusterManagerGrpc() {}

  public static final String SERVICE_NAME = "google.container.v1.ClusterManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListClustersRequest,
      com.google.container.v1.ListClustersResponse> METHOD_LIST_CLUSTERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListClusters"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListClustersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListClustersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetClusterRequest,
      com.google.container.v1.Cluster> METHOD_GET_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Cluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CreateClusterRequest,
      com.google.container.v1.Operation> METHOD_CREATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CreateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CreateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.UpdateClusterRequest,
      com.google.container.v1.Operation> METHOD_UPDATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "UpdateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.UpdateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.UpdateNodePoolRequest,
      com.google.container.v1.Operation> METHOD_UPDATE_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "UpdateNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.UpdateNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetNodePoolAutoscalingRequest,
      com.google.container.v1.Operation> METHOD_SET_NODE_POOL_AUTOSCALING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetNodePoolAutoscaling"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetNodePoolAutoscalingRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetLoggingServiceRequest,
      com.google.container.v1.Operation> METHOD_SET_LOGGING_SERVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetLoggingService"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetLoggingServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetMonitoringServiceRequest,
      com.google.container.v1.Operation> METHOD_SET_MONITORING_SERVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetMonitoringService"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetMonitoringServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetAddonsConfigRequest,
      com.google.container.v1.Operation> METHOD_SET_ADDONS_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetAddonsConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetAddonsConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetLocationsRequest,
      com.google.container.v1.Operation> METHOD_SET_LOCATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetLocations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetLocationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.UpdateMasterRequest,
      com.google.container.v1.Operation> METHOD_UPDATE_MASTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "UpdateMaster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.UpdateMasterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetMasterAuthRequest,
      com.google.container.v1.Operation> METHOD_SET_MASTER_AUTH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetMasterAuth"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetMasterAuthRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.DeleteClusterRequest,
      com.google.container.v1.Operation> METHOD_DELETE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "DeleteCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.DeleteClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListOperationsRequest,
      com.google.container.v1.ListOperationsResponse> METHOD_LIST_OPERATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListOperations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListOperationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListOperationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetOperationRequest,
      com.google.container.v1.Operation> METHOD_GET_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CancelOperationRequest,
      com.google.protobuf.Empty> METHOD_CANCEL_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CancelOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CancelOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetServerConfigRequest,
      com.google.container.v1.ServerConfig> METHOD_GET_SERVER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetServerConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetServerConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ServerConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListNodePoolsRequest,
      com.google.container.v1.ListNodePoolsResponse> METHOD_LIST_NODE_POOLS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListNodePools"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListNodePoolsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListNodePoolsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetNodePoolRequest,
      com.google.container.v1.NodePool> METHOD_GET_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.NodePool.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CreateNodePoolRequest,
      com.google.container.v1.Operation> METHOD_CREATE_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CreateNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CreateNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.DeleteNodePoolRequest,
      com.google.container.v1.Operation> METHOD_DELETE_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "DeleteNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.DeleteNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.RollbackNodePoolUpgradeRequest,
      com.google.container.v1.Operation> METHOD_ROLLBACK_NODE_POOL_UPGRADE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "RollbackNodePoolUpgrade"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.RollbackNodePoolUpgradeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetNodePoolManagementRequest,
      com.google.container.v1.Operation> METHOD_SET_NODE_POOL_MANAGEMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetNodePoolManagement"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetNodePoolManagementRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetLabelsRequest,
      com.google.container.v1.Operation> METHOD_SET_LABELS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetLabels"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetLabelsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetLegacyAbacRequest,
      com.google.container.v1.Operation> METHOD_SET_LEGACY_ABAC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetLegacyAbac"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetLegacyAbacRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.StartIPRotationRequest,
      com.google.container.v1.Operation> METHOD_START_IPROTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "StartIPRotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.StartIPRotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CompleteIPRotationRequest,
      com.google.container.v1.Operation> METHOD_COMPLETE_IPROTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CompleteIPRotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CompleteIPRotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetNodePoolSizeRequest,
      com.google.container.v1.Operation> METHOD_SET_NODE_POOL_SIZE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetNodePoolSize"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetNodePoolSizeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetNetworkPolicyRequest,
      com.google.container.v1.Operation> METHOD_SET_NETWORK_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetNetworkPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetNetworkPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetMaintenancePolicyRequest,
      com.google.container.v1.Operation> METHOD_SET_MAINTENANCE_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetMaintenancePolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetMaintenancePolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterManagerStub newStub(io.grpc.Channel channel) {
    return new ClusterManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterManagerFutureStub(channel);
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static abstract class ClusterManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public void listClusters(com.google.container.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CLUSTERS, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public void getCluster(com.google.container.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Cluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public void createCluster(com.google.container.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public void updateCluster(com.google.container.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Updates the version and/or image type of a specific node pool.
     * </pre>
     */
    public void updateNodePool(com.google.container.v1.UpdateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Sets the autoscaling settings of a specific node pool.
     * </pre>
     */
    public void setNodePoolAutoscaling(com.google.container.v1.SetNodePoolAutoscalingRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NODE_POOL_AUTOSCALING, responseObserver);
    }

    /**
     * <pre>
     * Sets the logging service of a specific cluster.
     * </pre>
     */
    public void setLoggingService(com.google.container.v1.SetLoggingServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_LOGGING_SERVICE, responseObserver);
    }

    /**
     * <pre>
     * Sets the monitoring service of a specific cluster.
     * </pre>
     */
    public void setMonitoringService(com.google.container.v1.SetMonitoringServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_MONITORING_SERVICE, responseObserver);
    }

    /**
     * <pre>
     * Sets the addons of a specific cluster.
     * </pre>
     */
    public void setAddonsConfig(com.google.container.v1.SetAddonsConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_ADDONS_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Sets the locations of a specific cluster.
     * </pre>
     */
    public void setLocations(com.google.container.v1.SetLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_LOCATIONS, responseObserver);
    }

    /**
     * <pre>
     * Updates the master of a specific cluster.
     * </pre>
     */
    public void updateMaster(com.google.container.v1.UpdateMasterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_MASTER, responseObserver);
    }

    /**
     * <pre>
     * Used to set master auth materials. Currently supports :-
     * Changing the admin password of a specific cluster.
     * This can be either via password generation or explicitly set the password.
     * </pre>
     */
    public void setMasterAuth(com.google.container.v1.SetMasterAuthRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_MASTER_AUTH, responseObserver);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public void deleteCluster(com.google.container.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public void listOperations(com.google.container.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_OPERATIONS, responseObserver);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public void getOperation(com.google.container.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public void cancelOperation(com.google.container.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public void getServerConfig(com.google.container.v1.GetServerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public void listNodePools(com.google.container.v1.ListNodePoolsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_NODE_POOLS, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public void getNodePool(com.google.container.v1.GetNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.NodePool> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public void createNodePool(com.google.container.v1.CreateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public void deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public void rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, responseObserver);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public void setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NODE_POOL_MANAGEMENT, responseObserver);
    }

    /**
     * <pre>
     * Sets labels on a cluster.
     * </pre>
     */
    public void setLabels(com.google.container.v1.SetLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_LABELS, responseObserver);
    }

    /**
     * <pre>
     * Enables or disables the ABAC authorization mechanism on a cluster.
     * </pre>
     */
    public void setLegacyAbac(com.google.container.v1.SetLegacyAbacRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_LEGACY_ABAC, responseObserver);
    }

    /**
     * <pre>
     * Start master IP rotation.
     * </pre>
     */
    public void startIPRotation(com.google.container.v1.StartIPRotationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START_IPROTATION, responseObserver);
    }

    /**
     * <pre>
     * Completes master IP rotation.
     * </pre>
     */
    public void completeIPRotation(com.google.container.v1.CompleteIPRotationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMPLETE_IPROTATION, responseObserver);
    }

    /**
     * <pre>
     * Sets the size of a specific node pool.
     * </pre>
     */
    public void setNodePoolSize(com.google.container.v1.SetNodePoolSizeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NODE_POOL_SIZE, responseObserver);
    }

    /**
     * <pre>
     * Enables/Disables Network Policy for a cluster.
     * </pre>
     */
    public void setNetworkPolicy(com.google.container.v1.SetNetworkPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NETWORK_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Sets the maintenance policy for a cluster.
     * </pre>
     */
    public void setMaintenancePolicy(com.google.container.v1.SetMaintenancePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_MAINTENANCE_POLICY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_CLUSTERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListClustersRequest,
                com.google.container.v1.ListClustersResponse>(
                  this, METHODID_LIST_CLUSTERS)))
          .addMethod(
            METHOD_GET_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetClusterRequest,
                com.google.container.v1.Cluster>(
                  this, METHODID_GET_CLUSTER)))
          .addMethod(
            METHOD_CREATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CreateClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_CREATE_CLUSTER)))
          .addMethod(
            METHOD_UPDATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.UpdateClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_UPDATE_CLUSTER)))
          .addMethod(
            METHOD_UPDATE_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.UpdateNodePoolRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_UPDATE_NODE_POOL)))
          .addMethod(
            METHOD_SET_NODE_POOL_AUTOSCALING,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetNodePoolAutoscalingRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_NODE_POOL_AUTOSCALING)))
          .addMethod(
            METHOD_SET_LOGGING_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetLoggingServiceRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_LOGGING_SERVICE)))
          .addMethod(
            METHOD_SET_MONITORING_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetMonitoringServiceRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_MONITORING_SERVICE)))
          .addMethod(
            METHOD_SET_ADDONS_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetAddonsConfigRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_ADDONS_CONFIG)))
          .addMethod(
            METHOD_SET_LOCATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetLocationsRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_LOCATIONS)))
          .addMethod(
            METHOD_UPDATE_MASTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.UpdateMasterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_UPDATE_MASTER)))
          .addMethod(
            METHOD_SET_MASTER_AUTH,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetMasterAuthRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_MASTER_AUTH)))
          .addMethod(
            METHOD_DELETE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.DeleteClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_DELETE_CLUSTER)))
          .addMethod(
            METHOD_LIST_OPERATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListOperationsRequest,
                com.google.container.v1.ListOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            METHOD_GET_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetOperationRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_GET_OPERATION)))
          .addMethod(
            METHOD_CANCEL_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CancelOperationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_OPERATION)))
          .addMethod(
            METHOD_GET_SERVER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetServerConfigRequest,
                com.google.container.v1.ServerConfig>(
                  this, METHODID_GET_SERVER_CONFIG)))
          .addMethod(
            METHOD_LIST_NODE_POOLS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListNodePoolsRequest,
                com.google.container.v1.ListNodePoolsResponse>(
                  this, METHODID_LIST_NODE_POOLS)))
          .addMethod(
            METHOD_GET_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetNodePoolRequest,
                com.google.container.v1.NodePool>(
                  this, METHODID_GET_NODE_POOL)))
          .addMethod(
            METHOD_CREATE_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CreateNodePoolRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_CREATE_NODE_POOL)))
          .addMethod(
            METHOD_DELETE_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.DeleteNodePoolRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_DELETE_NODE_POOL)))
          .addMethod(
            METHOD_ROLLBACK_NODE_POOL_UPGRADE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.RollbackNodePoolUpgradeRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_ROLLBACK_NODE_POOL_UPGRADE)))
          .addMethod(
            METHOD_SET_NODE_POOL_MANAGEMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetNodePoolManagementRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_NODE_POOL_MANAGEMENT)))
          .addMethod(
            METHOD_SET_LABELS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetLabelsRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_LABELS)))
          .addMethod(
            METHOD_SET_LEGACY_ABAC,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetLegacyAbacRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_LEGACY_ABAC)))
          .addMethod(
            METHOD_START_IPROTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.StartIPRotationRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_START_IPROTATION)))
          .addMethod(
            METHOD_COMPLETE_IPROTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CompleteIPRotationRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_COMPLETE_IPROTATION)))
          .addMethod(
            METHOD_SET_NODE_POOL_SIZE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetNodePoolSizeRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_NODE_POOL_SIZE)))
          .addMethod(
            METHOD_SET_NETWORK_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetNetworkPolicyRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_NETWORK_POLICY)))
          .addMethod(
            METHOD_SET_MAINTENANCE_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetMaintenancePolicyRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_MAINTENANCE_POLICY)))
          .build();
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerStub extends io.grpc.stub.AbstractStub<ClusterManagerStub> {
    private ClusterManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public void listClusters(com.google.container.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public void getCluster(com.google.container.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Cluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public void createCluster(com.google.container.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public void updateCluster(com.google.container.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the version and/or image type of a specific node pool.
     * </pre>
     */
    public void updateNodePool(com.google.container.v1.UpdateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the autoscaling settings of a specific node pool.
     * </pre>
     */
    public void setNodePoolAutoscaling(com.google.container.v1.SetNodePoolAutoscalingRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_AUTOSCALING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the logging service of a specific cluster.
     * </pre>
     */
    public void setLoggingService(com.google.container.v1.SetLoggingServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_LOGGING_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the monitoring service of a specific cluster.
     * </pre>
     */
    public void setMonitoringService(com.google.container.v1.SetMonitoringServiceRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_MONITORING_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the addons of a specific cluster.
     * </pre>
     */
    public void setAddonsConfig(com.google.container.v1.SetAddonsConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_ADDONS_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the locations of a specific cluster.
     * </pre>
     */
    public void setLocations(com.google.container.v1.SetLocationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_LOCATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the master of a specific cluster.
     * </pre>
     */
    public void updateMaster(com.google.container.v1.UpdateMasterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_MASTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to set master auth materials. Currently supports :-
     * Changing the admin password of a specific cluster.
     * This can be either via password generation or explicitly set the password.
     * </pre>
     */
    public void setMasterAuth(com.google.container.v1.SetMasterAuthRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_MASTER_AUTH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public void deleteCluster(com.google.container.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public void listOperations(com.google.container.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_OPERATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public void getOperation(com.google.container.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public void cancelOperation(com.google.container.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public void getServerConfig(com.google.container.v1.GetServerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public void listNodePools(com.google.container.v1.ListNodePoolsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_NODE_POOLS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public void getNodePool(com.google.container.v1.GetNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.NodePool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public void createNodePool(com.google.container.v1.CreateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public void deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public void rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public void setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets labels on a cluster.
     * </pre>
     */
    public void setLabels(com.google.container.v1.SetLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_LABELS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables or disables the ABAC authorization mechanism on a cluster.
     * </pre>
     */
    public void setLegacyAbac(com.google.container.v1.SetLegacyAbacRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_LEGACY_ABAC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start master IP rotation.
     * </pre>
     */
    public void startIPRotation(com.google.container.v1.StartIPRotationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START_IPROTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Completes master IP rotation.
     * </pre>
     */
    public void completeIPRotation(com.google.container.v1.CompleteIPRotationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_IPROTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the size of a specific node pool.
     * </pre>
     */
    public void setNodePoolSize(com.google.container.v1.SetNodePoolSizeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_SIZE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables/Disables Network Policy for a cluster.
     * </pre>
     */
    public void setNetworkPolicy(com.google.container.v1.SetNetworkPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NETWORK_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the maintenance policy for a cluster.
     * </pre>
     */
    public void setMaintenancePolicy(com.google.container.v1.SetMaintenancePolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_MAINTENANCE_POLICY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerBlockingStub extends io.grpc.stub.AbstractStub<ClusterManagerBlockingStub> {
    private ClusterManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public com.google.container.v1.ListClustersResponse listClusters(com.google.container.v1.ListClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CLUSTERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Cluster getCluster(com.google.container.v1.GetClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public com.google.container.v1.Operation createCluster(com.google.container.v1.CreateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation updateCluster(com.google.container.v1.UpdateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the version and/or image type of a specific node pool.
     * </pre>
     */
    public com.google.container.v1.Operation updateNodePool(com.google.container.v1.UpdateNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the autoscaling settings of a specific node pool.
     * </pre>
     */
    public com.google.container.v1.Operation setNodePoolAutoscaling(com.google.container.v1.SetNodePoolAutoscalingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NODE_POOL_AUTOSCALING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the logging service of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setLoggingService(com.google.container.v1.SetLoggingServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_LOGGING_SERVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the monitoring service of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setMonitoringService(com.google.container.v1.SetMonitoringServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_MONITORING_SERVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the addons of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setAddonsConfig(com.google.container.v1.SetAddonsConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_ADDONS_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the locations of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setLocations(com.google.container.v1.SetLocationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_LOCATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the master of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation updateMaster(com.google.container.v1.UpdateMasterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_MASTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to set master auth materials. Currently supports :-
     * Changing the admin password of a specific cluster.
     * This can be either via password generation or explicitly set the password.
     * </pre>
     */
    public com.google.container.v1.Operation setMasterAuth(com.google.container.v1.SetMasterAuthRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_MASTER_AUTH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public com.google.container.v1.Operation deleteCluster(com.google.container.v1.DeleteClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public com.google.container.v1.ListOperationsResponse listOperations(com.google.container.v1.ListOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_OPERATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public com.google.container.v1.Operation getOperation(com.google.container.v1.GetOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public com.google.protobuf.Empty cancelOperation(com.google.container.v1.CancelOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public com.google.container.v1.ServerConfig getServerConfig(com.google.container.v1.GetServerConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public com.google.container.v1.ListNodePoolsResponse listNodePools(com.google.container.v1.ListNodePoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_NODE_POOLS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public com.google.container.v1.NodePool getNodePool(com.google.container.v1.GetNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation createNodePool(com.google.container.v1.CreateNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public com.google.container.v1.Operation rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public com.google.container.v1.Operation setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets labels on a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setLabels(com.google.container.v1.SetLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_LABELS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables or disables the ABAC authorization mechanism on a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setLegacyAbac(com.google.container.v1.SetLegacyAbacRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_LEGACY_ABAC, getCallOptions(), request);
    }

    /**
     * <pre>
     * Start master IP rotation.
     * </pre>
     */
    public com.google.container.v1.Operation startIPRotation(com.google.container.v1.StartIPRotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START_IPROTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Completes master IP rotation.
     * </pre>
     */
    public com.google.container.v1.Operation completeIPRotation(com.google.container.v1.CompleteIPRotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMPLETE_IPROTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the size of a specific node pool.
     * </pre>
     */
    public com.google.container.v1.Operation setNodePoolSize(com.google.container.v1.SetNodePoolSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NODE_POOL_SIZE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables/Disables Network Policy for a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setNetworkPolicy(com.google.container.v1.SetNetworkPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NETWORK_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the maintenance policy for a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation setMaintenancePolicy(com.google.container.v1.SetMaintenancePolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_MAINTENANCE_POLICY, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerFutureStub extends io.grpc.stub.AbstractStub<ClusterManagerFutureStub> {
    private ClusterManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListClustersResponse> listClusters(
        com.google.container.v1.ListClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Cluster> getCluster(
        com.google.container.v1.GetClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> createCluster(
        com.google.container.v1.CreateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> updateCluster(
        com.google.container.v1.UpdateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the version and/or image type of a specific node pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> updateNodePool(
        com.google.container.v1.UpdateNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the autoscaling settings of a specific node pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setNodePoolAutoscaling(
        com.google.container.v1.SetNodePoolAutoscalingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_AUTOSCALING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the logging service of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setLoggingService(
        com.google.container.v1.SetLoggingServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_LOGGING_SERVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the monitoring service of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setMonitoringService(
        com.google.container.v1.SetMonitoringServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_MONITORING_SERVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the addons of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setAddonsConfig(
        com.google.container.v1.SetAddonsConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_ADDONS_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the locations of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setLocations(
        com.google.container.v1.SetLocationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_LOCATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the master of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> updateMaster(
        com.google.container.v1.UpdateMasterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_MASTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to set master auth materials. Currently supports :-
     * Changing the admin password of a specific cluster.
     * This can be either via password generation or explicitly set the password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setMasterAuth(
        com.google.container.v1.SetMasterAuthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_MASTER_AUTH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> deleteCluster(
        com.google.container.v1.DeleteClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListOperationsResponse> listOperations(
        com.google.container.v1.ListOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_OPERATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> getOperation(
        com.google.container.v1.GetOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOperation(
        com.google.container.v1.CancelOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ServerConfig> getServerConfig(
        com.google.container.v1.GetServerConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListNodePoolsResponse> listNodePools(
        com.google.container.v1.ListNodePoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_NODE_POOLS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.NodePool> getNodePool(
        com.google.container.v1.GetNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> createNodePool(
        com.google.container.v1.CreateNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> deleteNodePool(
        com.google.container.v1.DeleteNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> rollbackNodePoolUpgrade(
        com.google.container.v1.RollbackNodePoolUpgradeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setNodePoolManagement(
        com.google.container.v1.SetNodePoolManagementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets labels on a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setLabels(
        com.google.container.v1.SetLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_LABELS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables or disables the ABAC authorization mechanism on a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setLegacyAbac(
        com.google.container.v1.SetLegacyAbacRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_LEGACY_ABAC, getCallOptions()), request);
    }

    /**
     * <pre>
     * Start master IP rotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> startIPRotation(
        com.google.container.v1.StartIPRotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START_IPROTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Completes master IP rotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> completeIPRotation(
        com.google.container.v1.CompleteIPRotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_IPROTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the size of a specific node pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setNodePoolSize(
        com.google.container.v1.SetNodePoolSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_SIZE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables/Disables Network Policy for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setNetworkPolicy(
        com.google.container.v1.SetNetworkPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NETWORK_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the maintenance policy for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setMaintenancePolicy(
        com.google.container.v1.SetMaintenancePolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_MAINTENANCE_POLICY, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CLUSTERS = 0;
  private static final int METHODID_GET_CLUSTER = 1;
  private static final int METHODID_CREATE_CLUSTER = 2;
  private static final int METHODID_UPDATE_CLUSTER = 3;
  private static final int METHODID_UPDATE_NODE_POOL = 4;
  private static final int METHODID_SET_NODE_POOL_AUTOSCALING = 5;
  private static final int METHODID_SET_LOGGING_SERVICE = 6;
  private static final int METHODID_SET_MONITORING_SERVICE = 7;
  private static final int METHODID_SET_ADDONS_CONFIG = 8;
  private static final int METHODID_SET_LOCATIONS = 9;
  private static final int METHODID_UPDATE_MASTER = 10;
  private static final int METHODID_SET_MASTER_AUTH = 11;
  private static final int METHODID_DELETE_CLUSTER = 12;
  private static final int METHODID_LIST_OPERATIONS = 13;
  private static final int METHODID_GET_OPERATION = 14;
  private static final int METHODID_CANCEL_OPERATION = 15;
  private static final int METHODID_GET_SERVER_CONFIG = 16;
  private static final int METHODID_LIST_NODE_POOLS = 17;
  private static final int METHODID_GET_NODE_POOL = 18;
  private static final int METHODID_CREATE_NODE_POOL = 19;
  private static final int METHODID_DELETE_NODE_POOL = 20;
  private static final int METHODID_ROLLBACK_NODE_POOL_UPGRADE = 21;
  private static final int METHODID_SET_NODE_POOL_MANAGEMENT = 22;
  private static final int METHODID_SET_LABELS = 23;
  private static final int METHODID_SET_LEGACY_ABAC = 24;
  private static final int METHODID_START_IPROTATION = 25;
  private static final int METHODID_COMPLETE_IPROTATION = 26;
  private static final int METHODID_SET_NODE_POOL_SIZE = 27;
  private static final int METHODID_SET_NETWORK_POLICY = 28;
  private static final int METHODID_SET_MAINTENANCE_POLICY = 29;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CLUSTERS:
          serviceImpl.listClusters((com.google.container.v1.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER:
          serviceImpl.getCluster((com.google.container.v1.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Cluster>) responseObserver);
          break;
        case METHODID_CREATE_CLUSTER:
          serviceImpl.createCluster((com.google.container.v1.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_CLUSTER:
          serviceImpl.updateCluster((com.google.container.v1.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_NODE_POOL:
          serviceImpl.updateNodePool((com.google.container.v1.UpdateNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_NODE_POOL_AUTOSCALING:
          serviceImpl.setNodePoolAutoscaling((com.google.container.v1.SetNodePoolAutoscalingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_LOGGING_SERVICE:
          serviceImpl.setLoggingService((com.google.container.v1.SetLoggingServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_MONITORING_SERVICE:
          serviceImpl.setMonitoringService((com.google.container.v1.SetMonitoringServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_ADDONS_CONFIG:
          serviceImpl.setAddonsConfig((com.google.container.v1.SetAddonsConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_LOCATIONS:
          serviceImpl.setLocations((com.google.container.v1.SetLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_MASTER:
          serviceImpl.updateMaster((com.google.container.v1.UpdateMasterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_MASTER_AUTH:
          serviceImpl.setMasterAuth((com.google.container.v1.SetMasterAuthRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CLUSTER:
          serviceImpl.deleteCluster((com.google.container.v1.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((com.google.container.v1.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_OPERATION:
          serviceImpl.getOperation((com.google.container.v1.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((com.google.container.v1.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SERVER_CONFIG:
          serviceImpl.getServerConfig((com.google.container.v1.GetServerConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig>) responseObserver);
          break;
        case METHODID_LIST_NODE_POOLS:
          serviceImpl.listNodePools((com.google.container.v1.ListNodePoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse>) responseObserver);
          break;
        case METHODID_GET_NODE_POOL:
          serviceImpl.getNodePool((com.google.container.v1.GetNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.NodePool>) responseObserver);
          break;
        case METHODID_CREATE_NODE_POOL:
          serviceImpl.createNodePool((com.google.container.v1.CreateNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_DELETE_NODE_POOL:
          serviceImpl.deleteNodePool((com.google.container.v1.DeleteNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_ROLLBACK_NODE_POOL_UPGRADE:
          serviceImpl.rollbackNodePoolUpgrade((com.google.container.v1.RollbackNodePoolUpgradeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_NODE_POOL_MANAGEMENT:
          serviceImpl.setNodePoolManagement((com.google.container.v1.SetNodePoolManagementRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_LABELS:
          serviceImpl.setLabels((com.google.container.v1.SetLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_LEGACY_ABAC:
          serviceImpl.setLegacyAbac((com.google.container.v1.SetLegacyAbacRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_START_IPROTATION:
          serviceImpl.startIPRotation((com.google.container.v1.StartIPRotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_COMPLETE_IPROTATION:
          serviceImpl.completeIPRotation((com.google.container.v1.CompleteIPRotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_NODE_POOL_SIZE:
          serviceImpl.setNodePoolSize((com.google.container.v1.SetNodePoolSizeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_NETWORK_POLICY:
          serviceImpl.setNetworkPolicy((com.google.container.v1.SetNetworkPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_MAINTENANCE_POLICY:
          serviceImpl.setMaintenancePolicy((com.google.container.v1.SetMaintenancePolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
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

  private static final class ClusterManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.container.v1.ClusterServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClusterManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterManagerDescriptorSupplier())
              .addMethod(METHOD_LIST_CLUSTERS)
              .addMethod(METHOD_GET_CLUSTER)
              .addMethod(METHOD_CREATE_CLUSTER)
              .addMethod(METHOD_UPDATE_CLUSTER)
              .addMethod(METHOD_UPDATE_NODE_POOL)
              .addMethod(METHOD_SET_NODE_POOL_AUTOSCALING)
              .addMethod(METHOD_SET_LOGGING_SERVICE)
              .addMethod(METHOD_SET_MONITORING_SERVICE)
              .addMethod(METHOD_SET_ADDONS_CONFIG)
              .addMethod(METHOD_SET_LOCATIONS)
              .addMethod(METHOD_UPDATE_MASTER)
              .addMethod(METHOD_SET_MASTER_AUTH)
              .addMethod(METHOD_DELETE_CLUSTER)
              .addMethod(METHOD_LIST_OPERATIONS)
              .addMethod(METHOD_GET_OPERATION)
              .addMethod(METHOD_CANCEL_OPERATION)
              .addMethod(METHOD_GET_SERVER_CONFIG)
              .addMethod(METHOD_LIST_NODE_POOLS)
              .addMethod(METHOD_GET_NODE_POOL)
              .addMethod(METHOD_CREATE_NODE_POOL)
              .addMethod(METHOD_DELETE_NODE_POOL)
              .addMethod(METHOD_ROLLBACK_NODE_POOL_UPGRADE)
              .addMethod(METHOD_SET_NODE_POOL_MANAGEMENT)
              .addMethod(METHOD_SET_LABELS)
              .addMethod(METHOD_SET_LEGACY_ABAC)
              .addMethod(METHOD_START_IPROTATION)
              .addMethod(METHOD_COMPLETE_IPROTATION)
              .addMethod(METHOD_SET_NODE_POOL_SIZE)
              .addMethod(METHOD_SET_NETWORK_POLICY)
              .addMethod(METHOD_SET_MAINTENANCE_POLICY)
              .build();
        }
      }
    }
    return result;
  }
}
