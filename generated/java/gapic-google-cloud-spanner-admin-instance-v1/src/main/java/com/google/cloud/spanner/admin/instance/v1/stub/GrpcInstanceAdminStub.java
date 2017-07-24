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
package com.google.cloud.spanner.admin.instance.v1.stub;

import static com.google.cloud.spanner.admin.instance.v1.PagedResponseWrappers.ListInstanceConfigsPagedResponse;
import static com.google.cloud.spanner.admin.instance.v1.PagedResponseWrappers.ListInstancesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import com.google.spanner.admin.instance.v1.CreateInstanceMetadata;
import com.google.spanner.admin.instance.v1.CreateInstanceRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceRequest;
import com.google.spanner.admin.instance.v1.GetInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.GetInstanceRequest;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import com.google.spanner.admin.instance.v1.UpdateInstanceMetadata;
import com.google.spanner.admin.instance.v1.UpdateInstanceRequest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Cloud Spanner Instance Admin API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcInstanceAdminStub extends InstanceAdminStub {
  private static final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      directListInstanceConfigsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/ListInstanceConfigs",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListInstanceConfigsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListInstanceConfigsResponse.getDefaultInstance())));
  private static final UnaryCallable<GetInstanceConfigRequest, InstanceConfig>
      directGetInstanceConfigCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/GetInstanceConfig",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      GetInstanceConfigRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(InstanceConfig.getDefaultInstance())));
  private static final UnaryCallable<ListInstancesRequest, ListInstancesResponse>
      directListInstancesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/ListInstances",
                  io.grpc.protobuf.ProtoUtils.marshaller(ListInstancesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListInstancesResponse.getDefaultInstance())));
  private static final UnaryCallable<GetInstanceRequest, Instance> directGetInstanceCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/GetInstance",
              io.grpc.protobuf.ProtoUtils.marshaller(GetInstanceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Instance.getDefaultInstance())));
  private static final UnaryCallable<CreateInstanceRequest, Operation>
      directCreateInstanceCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/CreateInstance",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      CreateInstanceRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final UnaryCallable<UpdateInstanceRequest, Operation>
      directUpdateInstanceCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/UpdateInstance",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      UpdateInstanceRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final UnaryCallable<DeleteInstanceRequest, Empty> directDeleteInstanceCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/DeleteInstance",
              io.grpc.protobuf.ProtoUtils.marshaller(DeleteInstanceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private static final UnaryCallable<SetIamPolicyRequest, Policy> directSetIamPolicyCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/SetIamPolicy",
              io.grpc.protobuf.ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance())));
  private static final UnaryCallable<GetIamPolicyRequest, Policy> directGetIamPolicyCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/GetIamPolicy",
              io.grpc.protobuf.ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance())));
  private static final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      directTestIamPermissionsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.admin.instance.v1.InstanceAdmin/TestIamPermissions",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      TestIamPermissionsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      TestIamPermissionsResponse.getDefaultInstance())));

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      listInstanceConfigsCallable;
  private final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsPagedResponse>
      listInstanceConfigsPagedCallable;
  private final UnaryCallable<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable;
  private final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable;
  private final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable;
  private final OperationCallable<
          CreateInstanceRequest, Instance, CreateInstanceMetadata, Operation>
      createInstanceOperationCallable;
  private final UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable;
  private final OperationCallable<
          UpdateInstanceRequest, Instance, UpdateInstanceMetadata, Operation>
      updateInstanceOperationCallable;
  private final UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  public static final GrpcInstanceAdminStub create(InstanceAdminSettings settings)
      throws IOException {
    return new GrpcInstanceAdminStub(settings, ClientContext.create(settings));
  }

  public static final GrpcInstanceAdminStub create(ClientContext clientContext) throws IOException {
    return new GrpcInstanceAdminStub(InstanceAdminSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcInstanceAdminStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcInstanceAdminStub(InstanceAdminSettings settings, ClientContext clientContext)
      throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    this.listInstanceConfigsCallable =
        GrpcCallableFactory.create(
            directListInstanceConfigsCallable,
            settings.listInstanceConfigsSettings(),
            clientContext);
    this.listInstanceConfigsPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListInstanceConfigsCallable,
            settings.listInstanceConfigsSettings(),
            clientContext);
    this.getInstanceConfigCallable =
        GrpcCallableFactory.create(
            directGetInstanceConfigCallable, settings.getInstanceConfigSettings(), clientContext);
    this.listInstancesCallable =
        GrpcCallableFactory.create(
            directListInstancesCallable, settings.listInstancesSettings(), clientContext);
    this.listInstancesPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListInstancesCallable, settings.listInstancesSettings(), clientContext);
    this.getInstanceCallable =
        GrpcCallableFactory.create(
            directGetInstanceCallable, settings.getInstanceSettings(), clientContext);
    this.createInstanceCallable =
        GrpcCallableFactory.create(
            directCreateInstanceCallable,
            settings.createInstanceSettings().getInitialCallSettings(),
            clientContext);
    this.createInstanceOperationCallable =
        GrpcCallableFactory.create(
            directCreateInstanceCallable,
            settings.createInstanceSettings(),
            clientContext,
            this.operationsStub);
    this.updateInstanceCallable =
        GrpcCallableFactory.create(
            directUpdateInstanceCallable,
            settings.updateInstanceSettings().getInitialCallSettings(),
            clientContext);
    this.updateInstanceOperationCallable =
        GrpcCallableFactory.create(
            directUpdateInstanceCallable,
            settings.updateInstanceSettings(),
            clientContext,
            this.operationsStub);
    this.deleteInstanceCallable =
        GrpcCallableFactory.create(
            directDeleteInstanceCallable, settings.deleteInstanceSettings(), clientContext);
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

  public UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsPagedResponse>
      listInstanceConfigsPagedCallable() {
    return listInstanceConfigsPagedCallable;
  }

  public UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      listInstanceConfigsCallable() {
    return listInstanceConfigsCallable;
  }

  public UnaryCallable<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigCallable() {
    return getInstanceConfigCallable;
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    return listInstancesCallable;
  }

  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  public OperationCallable<CreateInstanceRequest, Instance, CreateInstanceMetadata, Operation>
      createInstanceOperationCallable() {
    return createInstanceOperationCallable;
  }

  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    return createInstanceCallable;
  }

  public OperationCallable<UpdateInstanceRequest, Instance, UpdateInstanceMetadata, Operation>
      updateInstanceOperationCallable() {
    return updateInstanceOperationCallable;
  }

  public UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable() {
    return updateInstanceCallable;
  }

  public UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable() {
    return deleteInstanceCallable;
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
