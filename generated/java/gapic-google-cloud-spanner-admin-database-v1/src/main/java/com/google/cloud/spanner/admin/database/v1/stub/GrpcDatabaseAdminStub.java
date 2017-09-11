/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.spanner.admin.database.v1.stub;

import static com.google.cloud.spanner.admin.database.v1.PagedResponseWrappers.ListDatabasesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import com.google.spanner.admin.database.v1.CreateDatabaseMetadata;
import com.google.spanner.admin.database.v1.CreateDatabaseRequest;
import com.google.spanner.admin.database.v1.Database;
import com.google.spanner.admin.database.v1.DropDatabaseRequest;
import com.google.spanner.admin.database.v1.GetDatabaseDdlRequest;
import com.google.spanner.admin.database.v1.GetDatabaseDdlResponse;
import com.google.spanner.admin.database.v1.GetDatabaseRequest;
import com.google.spanner.admin.database.v1.ListDatabasesRequest;
import com.google.spanner.admin.database.v1.ListDatabasesResponse;
import com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata;
import com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Cloud Spanner Database Admin API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcDatabaseAdminStub extends DatabaseAdminStub {
  private static final UnaryCallable<ListDatabasesRequest, ListDatabasesResponse>
      directListDatabasesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.database.v1.DatabaseAdmin/ListDatabases",
                  io.grpc.protobuf.ProtoUtils.marshaller(ListDatabasesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListDatabasesResponse.getDefaultInstance())));
  private static final UnaryCallable<CreateDatabaseRequest, Operation>
      directCreateDatabaseCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.database.v1.DatabaseAdmin/CreateDatabase",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      CreateDatabaseRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final UnaryCallable<GetDatabaseRequest, Database> directGetDatabaseCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.database.v1.DatabaseAdmin/GetDatabase",
              io.grpc.protobuf.ProtoUtils.marshaller(GetDatabaseRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Database.getDefaultInstance())));
  private static final UnaryCallable<UpdateDatabaseDdlRequest, Operation>
      directUpdateDatabaseDdlCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.database.v1.DatabaseAdmin/UpdateDatabaseDdl",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      UpdateDatabaseDdlRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final UnaryCallable<DropDatabaseRequest, Empty> directDropDatabaseCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.database.v1.DatabaseAdmin/DropDatabase",
              io.grpc.protobuf.ProtoUtils.marshaller(DropDatabaseRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private static final UnaryCallable<GetDatabaseDdlRequest, GetDatabaseDdlResponse>
      directGetDatabaseDdlCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.database.v1.DatabaseAdmin/GetDatabaseDdl",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      GetDatabaseDdlRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      GetDatabaseDdlResponse.getDefaultInstance())));
  private static final UnaryCallable<SetIamPolicyRequest, Policy> directSetIamPolicyCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.database.v1.DatabaseAdmin/SetIamPolicy",
              io.grpc.protobuf.ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance())));
  private static final UnaryCallable<GetIamPolicyRequest, Policy> directGetIamPolicyCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.database.v1.DatabaseAdmin/GetIamPolicy",
              io.grpc.protobuf.ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance())));
  private static final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      directTestIamPermissionsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.database.v1.DatabaseAdmin/TestIamPermissions",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      TestIamPermissionsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      TestIamPermissionsResponse.getDefaultInstance())));

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable;
  private final UnaryCallable<ListDatabasesRequest, ListDatabasesPagedResponse>
      listDatabasesPagedCallable;
  private final UnaryCallable<CreateDatabaseRequest, Operation> createDatabaseCallable;
  private final OperationCallable<
          CreateDatabaseRequest, Database, CreateDatabaseMetadata, Operation>
      createDatabaseOperationCallable;
  private final UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable;
  private final UnaryCallable<UpdateDatabaseDdlRequest, Operation> updateDatabaseDdlCallable;
  private final OperationCallable<
          UpdateDatabaseDdlRequest, Empty, UpdateDatabaseDdlMetadata, Operation>
      updateDatabaseDdlOperationCallable;
  private final UnaryCallable<DropDatabaseRequest, Empty> dropDatabaseCallable;
  private final UnaryCallable<GetDatabaseDdlRequest, GetDatabaseDdlResponse> getDatabaseDdlCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  public static final GrpcDatabaseAdminStub create(DatabaseAdminSettings settings)
      throws IOException {
    return new GrpcDatabaseAdminStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDatabaseAdminStub create(ClientContext clientContext) throws IOException {
    return new GrpcDatabaseAdminStub(DatabaseAdminSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcDatabaseAdminStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcDatabaseAdminStub(DatabaseAdminSettings settings, ClientContext clientContext)
      throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    this.listDatabasesCallable =
        GrpcCallableFactory.create(
            directListDatabasesCallable, settings.listDatabasesSettings(), clientContext);
    this.listDatabasesPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListDatabasesCallable, settings.listDatabasesSettings(), clientContext);
    this.createDatabaseCallable =
        GrpcCallableFactory.create(
            directCreateDatabaseCallable,
            settings.createDatabaseSettings().getInitialCallSettings(),
            clientContext);
    this.createDatabaseOperationCallable =
        GrpcCallableFactory.create(
            directCreateDatabaseCallable,
            settings.createDatabaseSettings(),
            clientContext,
            this.operationsStub);
    this.getDatabaseCallable =
        GrpcCallableFactory.create(
            directGetDatabaseCallable, settings.getDatabaseSettings(), clientContext);
    this.updateDatabaseDdlCallable =
        GrpcCallableFactory.create(
            directUpdateDatabaseDdlCallable,
            settings.updateDatabaseDdlSettings().getInitialCallSettings(),
            clientContext);
    this.updateDatabaseDdlOperationCallable =
        GrpcCallableFactory.create(
            directUpdateDatabaseDdlCallable,
            settings.updateDatabaseDdlSettings(),
            clientContext,
            this.operationsStub);
    this.dropDatabaseCallable =
        GrpcCallableFactory.create(
            directDropDatabaseCallable, settings.dropDatabaseSettings(), clientContext);
    this.getDatabaseDdlCallable =
        GrpcCallableFactory.create(
            directGetDatabaseDdlCallable, settings.getDatabaseDdlSettings(), clientContext);
    this.setIamPolicyCallable =
        GrpcCallableFactory.create(
            directSetIamPolicyCallable, settings.setIamPolicySettings(), clientContext);
    this.getIamPolicyCallable =
        GrpcCallableFactory.create(
            directGetIamPolicyCallable, settings.getIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        GrpcCallableFactory.create(
            directTestIamPermissionsCallable, settings.testIamPermissionsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListDatabasesRequest, ListDatabasesPagedResponse>
      listDatabasesPagedCallable() {
    return listDatabasesPagedCallable;
  }

  public UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable() {
    return listDatabasesCallable;
  }

  public OperationCallable<CreateDatabaseRequest, Database, CreateDatabaseMetadata, Operation>
      createDatabaseOperationCallable() {
    return createDatabaseOperationCallable;
  }

  public UnaryCallable<CreateDatabaseRequest, Operation> createDatabaseCallable() {
    return createDatabaseCallable;
  }

  public UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable() {
    return getDatabaseCallable;
  }

  public OperationCallable<UpdateDatabaseDdlRequest, Empty, UpdateDatabaseDdlMetadata, Operation>
      updateDatabaseDdlOperationCallable() {
    return updateDatabaseDdlOperationCallable;
  }

  public UnaryCallable<UpdateDatabaseDdlRequest, Operation> updateDatabaseDdlCallable() {
    return updateDatabaseDdlCallable;
  }

  public UnaryCallable<DropDatabaseRequest, Empty> dropDatabaseCallable() {
    return dropDatabaseCallable;
  }

  public UnaryCallable<GetDatabaseDdlRequest, GetDatabaseDdlResponse> getDatabaseDdlCallable() {
    return getDatabaseDdlCallable;
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
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
