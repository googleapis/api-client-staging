/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dataproc.v1.stub;

import static com.google.cloud.dataproc.v1.ClusterControllerClient.ListClustersPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dataproc.v1.Cluster;
import com.google.cloud.dataproc.v1.ClusterOperationMetadata;
import com.google.cloud.dataproc.v1.CreateClusterRequest;
import com.google.cloud.dataproc.v1.DeleteClusterRequest;
import com.google.cloud.dataproc.v1.DiagnoseClusterRequest;
import com.google.cloud.dataproc.v1.DiagnoseClusterResults;
import com.google.cloud.dataproc.v1.GetClusterRequest;
import com.google.cloud.dataproc.v1.ListClustersRequest;
import com.google.cloud.dataproc.v1.ListClustersResponse;
import com.google.cloud.dataproc.v1.UpdateClusterRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Cloud Dataproc API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcClusterControllerStub extends ClusterControllerStub {

  private static final MethodDescriptor<CreateClusterRequest, Operation>
      createClusterMethodDescriptor =
          MethodDescriptor.<CreateClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataproc.v1.ClusterController/CreateCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateClusterRequest, Operation>
      updateClusterMethodDescriptor =
          MethodDescriptor.<UpdateClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataproc.v1.ClusterController/UpdateCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteClusterRequest, Operation>
      deleteClusterMethodDescriptor =
          MethodDescriptor.<DeleteClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataproc.v1.ClusterController/DeleteCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetClusterRequest, Cluster> getClusterMethodDescriptor =
      MethodDescriptor.<GetClusterRequest, Cluster>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dataproc.v1.ClusterController/GetCluster")
          .setRequestMarshaller(ProtoUtils.marshaller(GetClusterRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Cluster.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListClustersRequest, ListClustersResponse>
      listClustersMethodDescriptor =
          MethodDescriptor.<ListClustersRequest, ListClustersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataproc.v1.ClusterController/ListClusters")
              .setRequestMarshaller(ProtoUtils.marshaller(ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListClustersResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DiagnoseClusterRequest, Operation>
      diagnoseClusterMethodDescriptor =
          MethodDescriptor.<DiagnoseClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dataproc.v1.ClusterController/DiagnoseCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DiagnoseClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<CreateClusterRequest, Operation> createClusterCallable;
  private final OperationCallable<CreateClusterRequest, Cluster, ClusterOperationMetadata>
      createClusterOperationCallable;
  private final UnaryCallable<UpdateClusterRequest, Operation> updateClusterCallable;
  private final OperationCallable<UpdateClusterRequest, Cluster, ClusterOperationMetadata>
      updateClusterOperationCallable;
  private final UnaryCallable<DeleteClusterRequest, Operation> deleteClusterCallable;
  private final OperationCallable<DeleteClusterRequest, Empty, ClusterOperationMetadata>
      deleteClusterOperationCallable;
  private final UnaryCallable<GetClusterRequest, Cluster> getClusterCallable;
  private final UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable;
  private final UnaryCallable<ListClustersRequest, ListClustersPagedResponse>
      listClustersPagedCallable;
  private final UnaryCallable<DiagnoseClusterRequest, Operation> diagnoseClusterCallable;
  private final OperationCallable<DiagnoseClusterRequest, Empty, DiagnoseClusterResults>
      diagnoseClusterOperationCallable;

  public static final GrpcClusterControllerStub create(ClusterControllerStubSettings settings)
      throws IOException {
    return new GrpcClusterControllerStub(settings, ClientContext.create(settings));
  }

  public static final GrpcClusterControllerStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcClusterControllerStub(
        ClusterControllerStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcClusterControllerStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcClusterControllerStub(
      ClusterControllerStubSettings settings, ClientContext clientContext) throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    GrpcCallSettings<CreateClusterRequest, Operation> createClusterTransportSettings =
        GrpcCallSettings.<CreateClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(createClusterMethodDescriptor)
            .build();
    GrpcCallSettings<UpdateClusterRequest, Operation> updateClusterTransportSettings =
        GrpcCallSettings.<UpdateClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(updateClusterMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteClusterRequest, Operation> deleteClusterTransportSettings =
        GrpcCallSettings.<DeleteClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteClusterMethodDescriptor)
            .build();
    GrpcCallSettings<GetClusterRequest, Cluster> getClusterTransportSettings =
        GrpcCallSettings.<GetClusterRequest, Cluster>newBuilder()
            .setMethodDescriptor(getClusterMethodDescriptor)
            .build();
    GrpcCallSettings<ListClustersRequest, ListClustersResponse> listClustersTransportSettings =
        GrpcCallSettings.<ListClustersRequest, ListClustersResponse>newBuilder()
            .setMethodDescriptor(listClustersMethodDescriptor)
            .build();
    GrpcCallSettings<DiagnoseClusterRequest, Operation> diagnoseClusterTransportSettings =
        GrpcCallSettings.<DiagnoseClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(diagnoseClusterMethodDescriptor)
            .build();

    this.createClusterCallable =
        GrpcCallableFactory.createUnaryCallable(
            createClusterTransportSettings, settings.createClusterSettings(), clientContext);
    this.createClusterOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            createClusterTransportSettings,
            settings.createClusterOperationSettings(),
            clientContext,
            this.operationsStub);
    this.updateClusterCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateClusterTransportSettings, settings.updateClusterSettings(), clientContext);
    this.updateClusterOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            updateClusterTransportSettings,
            settings.updateClusterOperationSettings(),
            clientContext,
            this.operationsStub);
    this.deleteClusterCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteClusterTransportSettings, settings.deleteClusterSettings(), clientContext);
    this.deleteClusterOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            deleteClusterTransportSettings,
            settings.deleteClusterOperationSettings(),
            clientContext,
            this.operationsStub);
    this.getClusterCallable =
        GrpcCallableFactory.createUnaryCallable(
            getClusterTransportSettings, settings.getClusterSettings(), clientContext);
    this.listClustersCallable =
        GrpcCallableFactory.createUnaryCallable(
            listClustersTransportSettings, settings.listClustersSettings(), clientContext);
    this.listClustersPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listClustersTransportSettings, settings.listClustersSettings(), clientContext);
    this.diagnoseClusterCallable =
        GrpcCallableFactory.createUnaryCallable(
            diagnoseClusterTransportSettings, settings.diagnoseClusterSettings(), clientContext);
    this.diagnoseClusterOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            diagnoseClusterTransportSettings,
            settings.diagnoseClusterOperationSettings(),
            clientContext,
            this.operationsStub);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public OperationCallable<CreateClusterRequest, Cluster, ClusterOperationMetadata>
      createClusterOperationCallable() {
    return createClusterOperationCallable;
  }

  public UnaryCallable<CreateClusterRequest, Operation> createClusterCallable() {
    return createClusterCallable;
  }

  public OperationCallable<UpdateClusterRequest, Cluster, ClusterOperationMetadata>
      updateClusterOperationCallable() {
    return updateClusterOperationCallable;
  }

  public UnaryCallable<UpdateClusterRequest, Operation> updateClusterCallable() {
    return updateClusterCallable;
  }

  public OperationCallable<DeleteClusterRequest, Empty, ClusterOperationMetadata>
      deleteClusterOperationCallable() {
    return deleteClusterOperationCallable;
  }

  public UnaryCallable<DeleteClusterRequest, Operation> deleteClusterCallable() {
    return deleteClusterCallable;
  }

  public UnaryCallable<GetClusterRequest, Cluster> getClusterCallable() {
    return getClusterCallable;
  }

  public UnaryCallable<ListClustersRequest, ListClustersPagedResponse> listClustersPagedCallable() {
    return listClustersPagedCallable;
  }

  public UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable() {
    return listClustersCallable;
  }

  public OperationCallable<DiagnoseClusterRequest, Empty, DiagnoseClusterResults>
      diagnoseClusterOperationCallable() {
    return diagnoseClusterOperationCallable;
  }

  public UnaryCallable<DiagnoseClusterRequest, Operation> diagnoseClusterCallable() {
    return diagnoseClusterCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
