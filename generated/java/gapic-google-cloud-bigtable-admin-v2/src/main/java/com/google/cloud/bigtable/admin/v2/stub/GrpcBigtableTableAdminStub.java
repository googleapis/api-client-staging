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
package com.google.cloud.bigtable.admin.v2.stub;

import static com.google.cloud.bigtable.admin.v2.PagedResponseWrappers.ListSnapshotsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.PagedResponseWrappers.ListTablesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.bigtable.admin.v2.CheckConsistencyRequest;
import com.google.bigtable.admin.v2.CheckConsistencyResponse;
import com.google.bigtable.admin.v2.CreateTableFromSnapshotMetadata;
import com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest;
import com.google.bigtable.admin.v2.CreateTableRequest;
import com.google.bigtable.admin.v2.DeleteSnapshotRequest;
import com.google.bigtable.admin.v2.DeleteTableRequest;
import com.google.bigtable.admin.v2.DropRowRangeRequest;
import com.google.bigtable.admin.v2.GenerateConsistencyTokenRequest;
import com.google.bigtable.admin.v2.GenerateConsistencyTokenResponse;
import com.google.bigtable.admin.v2.GetSnapshotRequest;
import com.google.bigtable.admin.v2.GetTableRequest;
import com.google.bigtable.admin.v2.ListSnapshotsRequest;
import com.google.bigtable.admin.v2.ListSnapshotsResponse;
import com.google.bigtable.admin.v2.ListTablesRequest;
import com.google.bigtable.admin.v2.ListTablesResponse;
import com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest;
import com.google.bigtable.admin.v2.Snapshot;
import com.google.bigtable.admin.v2.SnapshotTableRequest;
import com.google.bigtable.admin.v2.Table;
import com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings;
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
 * gRPC stub implementation for Cloud Bigtable Admin API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcBigtableTableAdminStub extends BigtableTableAdminStub {

  private static final MethodDescriptor<CreateTableRequest, Table> createTableMethodDescriptor =
      MethodDescriptor.<CreateTableRequest, Table>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/CreateTable")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateTableRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Table.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotMethodDescriptor =
          MethodDescriptor.<CreateTableFromSnapshotRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableTableAdmin/CreateTableFromSnapshot")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateTableFromSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListTablesRequest, ListTablesResponse>
      listTablesMethodDescriptor =
          MethodDescriptor.<ListTablesRequest, ListTablesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/ListTables")
              .setRequestMarshaller(ProtoUtils.marshaller(ListTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListTablesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetTableRequest, Table> getTableMethodDescriptor =
      MethodDescriptor.<GetTableRequest, Table>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/GetTable")
          .setRequestMarshaller(ProtoUtils.marshaller(GetTableRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Table.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteTableRequest, Empty> deleteTableMethodDescriptor =
      MethodDescriptor.<DeleteTableRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/DeleteTable")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteTableRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ModifyColumnFamiliesRequest, Table>
      modifyColumnFamiliesMethodDescriptor =
          MethodDescriptor.<ModifyColumnFamiliesRequest, Table>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/ModifyColumnFamilies")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ModifyColumnFamiliesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Table.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DropRowRangeRequest, Empty> dropRowRangeMethodDescriptor =
      MethodDescriptor.<DropRowRangeRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/DropRowRange")
          .setRequestMarshaller(ProtoUtils.marshaller(DropRowRangeRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<
          GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenMethodDescriptor =
          MethodDescriptor
              .<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableTableAdmin/GenerateConsistencyToken")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GenerateConsistencyTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GenerateConsistencyTokenResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencyMethodDescriptor =
          MethodDescriptor.<CheckConsistencyRequest, CheckConsistencyResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/CheckConsistency")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CheckConsistencyRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CheckConsistencyResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<SnapshotTableRequest, Operation>
      snapshotTableMethodDescriptor =
          MethodDescriptor.<SnapshotTableRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/SnapshotTable")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SnapshotTableRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetSnapshotRequest, Snapshot> getSnapshotMethodDescriptor =
      MethodDescriptor.<GetSnapshotRequest, Snapshot>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/GetSnapshot")
          .setRequestMarshaller(ProtoUtils.marshaller(GetSnapshotRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Snapshot.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListSnapshotsRequest, ListSnapshotsResponse>
      listSnapshotsMethodDescriptor =
          MethodDescriptor.<ListSnapshotsRequest, ListSnapshotsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/ListSnapshots")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListSnapshotsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteSnapshotRequest, Empty>
      deleteSnapshotMethodDescriptor =
          MethodDescriptor.<DeleteSnapshotRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableTableAdmin/DeleteSnapshot")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<CreateTableRequest, Table> createTableCallable;
  private final UnaryCallable<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotCallable;
  private final OperationCallable<
          CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
      createTableFromSnapshotOperationCallable;
  private final UnaryCallable<ListTablesRequest, ListTablesResponse> listTablesCallable;
  private final UnaryCallable<ListTablesRequest, ListTablesPagedResponse> listTablesPagedCallable;
  private final UnaryCallable<GetTableRequest, Table> getTableCallable;
  private final UnaryCallable<DeleteTableRequest, Empty> deleteTableCallable;
  private final UnaryCallable<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesCallable;
  private final UnaryCallable<DropRowRangeRequest, Empty> dropRowRangeCallable;
  private final UnaryCallable<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenCallable;
  private final UnaryCallable<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencyCallable;
  private final UnaryCallable<SnapshotTableRequest, Operation> snapshotTableCallable;
  private final UnaryCallable<GetSnapshotRequest, Snapshot> getSnapshotCallable;
  private final UnaryCallable<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsCallable;
  private final UnaryCallable<ListSnapshotsRequest, ListSnapshotsPagedResponse>
      listSnapshotsPagedCallable;
  private final UnaryCallable<DeleteSnapshotRequest, Empty> deleteSnapshotCallable;

  public static final GrpcBigtableTableAdminStub create(BigtableTableAdminSettings settings)
      throws IOException {
    return new GrpcBigtableTableAdminStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBigtableTableAdminStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBigtableTableAdminStub(
        BigtableTableAdminSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcBigtableTableAdminStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBigtableTableAdminStub(
      BigtableTableAdminSettings settings, ClientContext clientContext) throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    GrpcCallSettings<CreateTableRequest, Table> createTableTransportSettings =
        GrpcCallSettings.<CreateTableRequest, Table>newBuilder()
            .setMethodDescriptor(createTableMethodDescriptor)
            .build();
    GrpcCallSettings<CreateTableFromSnapshotRequest, Operation>
        createTableFromSnapshotTransportSettings =
            GrpcCallSettings.<CreateTableFromSnapshotRequest, Operation>newBuilder()
                .setMethodDescriptor(createTableFromSnapshotMethodDescriptor)
                .build();
    GrpcCallSettings<ListTablesRequest, ListTablesResponse> listTablesTransportSettings =
        GrpcCallSettings.<ListTablesRequest, ListTablesResponse>newBuilder()
            .setMethodDescriptor(listTablesMethodDescriptor)
            .build();
    GrpcCallSettings<GetTableRequest, Table> getTableTransportSettings =
        GrpcCallSettings.<GetTableRequest, Table>newBuilder()
            .setMethodDescriptor(getTableMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteTableRequest, Empty> deleteTableTransportSettings =
        GrpcCallSettings.<DeleteTableRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteTableMethodDescriptor)
            .build();
    GrpcCallSettings<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesTransportSettings =
        GrpcCallSettings.<ModifyColumnFamiliesRequest, Table>newBuilder()
            .setMethodDescriptor(modifyColumnFamiliesMethodDescriptor)
            .build();
    GrpcCallSettings<DropRowRangeRequest, Empty> dropRowRangeTransportSettings =
        GrpcCallSettings.<DropRowRangeRequest, Empty>newBuilder()
            .setMethodDescriptor(dropRowRangeMethodDescriptor)
            .build();
    GrpcCallSettings<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
        generateConsistencyTokenTransportSettings =
            GrpcCallSettings
                .<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>newBuilder()
                .setMethodDescriptor(generateConsistencyTokenMethodDescriptor)
                .build();
    GrpcCallSettings<CheckConsistencyRequest, CheckConsistencyResponse>
        checkConsistencyTransportSettings =
            GrpcCallSettings.<CheckConsistencyRequest, CheckConsistencyResponse>newBuilder()
                .setMethodDescriptor(checkConsistencyMethodDescriptor)
                .build();
    GrpcCallSettings<SnapshotTableRequest, Operation> snapshotTableTransportSettings =
        GrpcCallSettings.<SnapshotTableRequest, Operation>newBuilder()
            .setMethodDescriptor(snapshotTableMethodDescriptor)
            .build();
    GrpcCallSettings<GetSnapshotRequest, Snapshot> getSnapshotTransportSettings =
        GrpcCallSettings.<GetSnapshotRequest, Snapshot>newBuilder()
            .setMethodDescriptor(getSnapshotMethodDescriptor)
            .build();
    GrpcCallSettings<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsTransportSettings =
        GrpcCallSettings.<ListSnapshotsRequest, ListSnapshotsResponse>newBuilder()
            .setMethodDescriptor(listSnapshotsMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteSnapshotRequest, Empty> deleteSnapshotTransportSettings =
        GrpcCallSettings.<DeleteSnapshotRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteSnapshotMethodDescriptor)
            .build();

    this.createTableCallable =
        GrpcCallableFactory.createUnaryCallable(
            createTableTransportSettings, settings.createTableSettings(), clientContext);
    this.createTableFromSnapshotCallable =
        GrpcCallableFactory.createUnaryCallable(
            createTableFromSnapshotTransportSettings,
            settings.createTableFromSnapshotSettings(),
            clientContext);
    this.createTableFromSnapshotOperationCallable =
        GrpcCallableFactory.createOperationCallable(
            createTableFromSnapshotTransportSettings,
            settings.createTableFromSnapshotOperationSettings(),
            clientContext,
            this.operationsStub);
    this.listTablesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listTablesTransportSettings, settings.listTablesSettings(), clientContext);
    this.listTablesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listTablesTransportSettings, settings.listTablesSettings(), clientContext);
    this.getTableCallable =
        GrpcCallableFactory.createUnaryCallable(
            getTableTransportSettings, settings.getTableSettings(), clientContext);
    this.deleteTableCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteTableTransportSettings, settings.deleteTableSettings(), clientContext);
    this.modifyColumnFamiliesCallable =
        GrpcCallableFactory.createUnaryCallable(
            modifyColumnFamiliesTransportSettings,
            settings.modifyColumnFamiliesSettings(),
            clientContext);
    this.dropRowRangeCallable =
        GrpcCallableFactory.createUnaryCallable(
            dropRowRangeTransportSettings, settings.dropRowRangeSettings(), clientContext);
    this.generateConsistencyTokenCallable =
        GrpcCallableFactory.createUnaryCallable(
            generateConsistencyTokenTransportSettings,
            settings.generateConsistencyTokenSettings(),
            clientContext);
    this.checkConsistencyCallable =
        GrpcCallableFactory.createUnaryCallable(
            checkConsistencyTransportSettings, settings.checkConsistencySettings(), clientContext);
    this.snapshotTableCallable =
        GrpcCallableFactory.createUnaryCallable(
            snapshotTableTransportSettings, settings.snapshotTableSettings(), clientContext);
    this.getSnapshotCallable =
        GrpcCallableFactory.createUnaryCallable(
            getSnapshotTransportSettings, settings.getSnapshotSettings(), clientContext);
    this.listSnapshotsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listSnapshotsTransportSettings, settings.listSnapshotsSettings(), clientContext);
    this.listSnapshotsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listSnapshotsTransportSettings, settings.listSnapshotsSettings(), clientContext);
    this.deleteSnapshotCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteSnapshotTransportSettings, settings.deleteSnapshotSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<CreateTableRequest, Table> createTableCallable() {
    return createTableCallable;
  }

  public OperationCallable<CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
      createTableFromSnapshotOperationCallable() {
    return createTableFromSnapshotOperationCallable;
  }

  public UnaryCallable<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotCallable() {
    return createTableFromSnapshotCallable;
  }

  public UnaryCallable<ListTablesRequest, ListTablesPagedResponse> listTablesPagedCallable() {
    return listTablesPagedCallable;
  }

  public UnaryCallable<ListTablesRequest, ListTablesResponse> listTablesCallable() {
    return listTablesCallable;
  }

  public UnaryCallable<GetTableRequest, Table> getTableCallable() {
    return getTableCallable;
  }

  public UnaryCallable<DeleteTableRequest, Empty> deleteTableCallable() {
    return deleteTableCallable;
  }

  public UnaryCallable<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesCallable() {
    return modifyColumnFamiliesCallable;
  }

  public UnaryCallable<DropRowRangeRequest, Empty> dropRowRangeCallable() {
    return dropRowRangeCallable;
  }

  public UnaryCallable<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenCallable() {
    return generateConsistencyTokenCallable;
  }

  public UnaryCallable<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencyCallable() {
    return checkConsistencyCallable;
  }

  public UnaryCallable<SnapshotTableRequest, Operation> snapshotTableCallable() {
    return snapshotTableCallable;
  }

  public UnaryCallable<GetSnapshotRequest, Snapshot> getSnapshotCallable() {
    return getSnapshotCallable;
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsPagedResponse>
      listSnapshotsPagedCallable() {
    return listSnapshotsPagedCallable;
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsCallable() {
    return listSnapshotsCallable;
  }

  public UnaryCallable<DeleteSnapshotRequest, Empty> deleteSnapshotCallable() {
    return deleteSnapshotCallable;
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
