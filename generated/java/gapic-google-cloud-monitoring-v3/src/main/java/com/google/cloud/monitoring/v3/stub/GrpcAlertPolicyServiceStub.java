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
package com.google.cloud.monitoring.v3.stub;

import static com.google.cloud.monitoring.v3.AlertPolicyServiceClient.ListAlertPoliciesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.monitoring.v3.AlertPolicy;
import com.google.monitoring.v3.CreateAlertPolicyRequest;
import com.google.monitoring.v3.DeleteAlertPolicyRequest;
import com.google.monitoring.v3.GetAlertPolicyRequest;
import com.google.monitoring.v3.ListAlertPoliciesRequest;
import com.google.monitoring.v3.ListAlertPoliciesResponse;
import com.google.monitoring.v3.UpdateAlertPolicyRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Monitoring API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcAlertPolicyServiceStub extends AlertPolicyServiceStub {

  private static final MethodDescriptor<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
      listAlertPoliciesMethodDescriptor =
          MethodDescriptor.<ListAlertPoliciesRequest, ListAlertPoliciesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.AlertPolicyService/ListAlertPolicies")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAlertPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAlertPoliciesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetAlertPolicyRequest, AlertPolicy>
      getAlertPolicyMethodDescriptor =
          MethodDescriptor.<GetAlertPolicyRequest, AlertPolicy>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.AlertPolicyService/GetAlertPolicy")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAlertPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AlertPolicy.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CreateAlertPolicyRequest, AlertPolicy>
      createAlertPolicyMethodDescriptor =
          MethodDescriptor.<CreateAlertPolicyRequest, AlertPolicy>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.AlertPolicyService/CreateAlertPolicy")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateAlertPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AlertPolicy.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteAlertPolicyRequest, Empty>
      deleteAlertPolicyMethodDescriptor =
          MethodDescriptor.<DeleteAlertPolicyRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.AlertPolicyService/DeleteAlertPolicy")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteAlertPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateAlertPolicyRequest, AlertPolicy>
      updateAlertPolicyMethodDescriptor =
          MethodDescriptor.<UpdateAlertPolicyRequest, AlertPolicy>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.AlertPolicyService/UpdateAlertPolicy")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateAlertPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AlertPolicy.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
      listAlertPoliciesCallable;
  private final UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesPagedResponse>
      listAlertPoliciesPagedCallable;
  private final UnaryCallable<GetAlertPolicyRequest, AlertPolicy> getAlertPolicyCallable;
  private final UnaryCallable<CreateAlertPolicyRequest, AlertPolicy> createAlertPolicyCallable;
  private final UnaryCallable<DeleteAlertPolicyRequest, Empty> deleteAlertPolicyCallable;
  private final UnaryCallable<UpdateAlertPolicyRequest, AlertPolicy> updateAlertPolicyCallable;

  public static final GrpcAlertPolicyServiceStub create(AlertPolicyServiceStubSettings settings)
      throws IOException {
    return new GrpcAlertPolicyServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAlertPolicyServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAlertPolicyServiceStub(
        AlertPolicyServiceStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcAlertPolicyServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAlertPolicyServiceStub(
      AlertPolicyServiceStubSettings settings, ClientContext clientContext) throws IOException {

    GrpcCallSettings<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
        listAlertPoliciesTransportSettings =
            GrpcCallSettings.<ListAlertPoliciesRequest, ListAlertPoliciesResponse>newBuilder()
                .setMethodDescriptor(listAlertPoliciesMethodDescriptor)
                .build();
    GrpcCallSettings<GetAlertPolicyRequest, AlertPolicy> getAlertPolicyTransportSettings =
        GrpcCallSettings.<GetAlertPolicyRequest, AlertPolicy>newBuilder()
            .setMethodDescriptor(getAlertPolicyMethodDescriptor)
            .build();
    GrpcCallSettings<CreateAlertPolicyRequest, AlertPolicy> createAlertPolicyTransportSettings =
        GrpcCallSettings.<CreateAlertPolicyRequest, AlertPolicy>newBuilder()
            .setMethodDescriptor(createAlertPolicyMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteAlertPolicyRequest, Empty> deleteAlertPolicyTransportSettings =
        GrpcCallSettings.<DeleteAlertPolicyRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAlertPolicyMethodDescriptor)
            .build();
    GrpcCallSettings<UpdateAlertPolicyRequest, AlertPolicy> updateAlertPolicyTransportSettings =
        GrpcCallSettings.<UpdateAlertPolicyRequest, AlertPolicy>newBuilder()
            .setMethodDescriptor(updateAlertPolicyMethodDescriptor)
            .build();

    this.listAlertPoliciesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listAlertPoliciesTransportSettings,
            settings.listAlertPoliciesSettings(),
            clientContext);
    this.listAlertPoliciesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listAlertPoliciesTransportSettings,
            settings.listAlertPoliciesSettings(),
            clientContext);
    this.getAlertPolicyCallable =
        GrpcCallableFactory.createUnaryCallable(
            getAlertPolicyTransportSettings, settings.getAlertPolicySettings(), clientContext);
    this.createAlertPolicyCallable =
        GrpcCallableFactory.createUnaryCallable(
            createAlertPolicyTransportSettings,
            settings.createAlertPolicySettings(),
            clientContext);
    this.deleteAlertPolicyCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteAlertPolicyTransportSettings,
            settings.deleteAlertPolicySettings(),
            clientContext);
    this.updateAlertPolicyCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateAlertPolicyTransportSettings,
            settings.updateAlertPolicySettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesPagedResponse>
      listAlertPoliciesPagedCallable() {
    return listAlertPoliciesPagedCallable;
  }

  public UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
      listAlertPoliciesCallable() {
    return listAlertPoliciesCallable;
  }

  public UnaryCallable<GetAlertPolicyRequest, AlertPolicy> getAlertPolicyCallable() {
    return getAlertPolicyCallable;
  }

  public UnaryCallable<CreateAlertPolicyRequest, AlertPolicy> createAlertPolicyCallable() {
    return createAlertPolicyCallable;
  }

  public UnaryCallable<DeleteAlertPolicyRequest, Empty> deleteAlertPolicyCallable() {
    return deleteAlertPolicyCallable;
  }

  public UnaryCallable<UpdateAlertPolicyRequest, AlertPolicy> updateAlertPolicyCallable() {
    return updateAlertPolicyCallable;
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
