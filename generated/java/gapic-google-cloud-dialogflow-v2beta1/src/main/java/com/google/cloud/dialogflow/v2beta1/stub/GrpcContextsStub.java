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
package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.PagedResponseWrappers.ListContextsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2beta1.Context;
import com.google.cloud.dialogflow.v2beta1.CreateContextRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteAllContextsRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteContextRequest;
import com.google.cloud.dialogflow.v2beta1.GetContextRequest;
import com.google.cloud.dialogflow.v2beta1.ListContextsRequest;
import com.google.cloud.dialogflow.v2beta1.ListContextsResponse;
import com.google.cloud.dialogflow.v2beta1.UpdateContextRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Dialogflow API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcContextsStub extends ContextsStub {

  private static final MethodDescriptor<ListContextsRequest, ListContextsResponse>
      listContextsMethodDescriptor =
          MethodDescriptor.<ListContextsRequest, ListContextsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/ListContexts")
              .setRequestMarshaller(ProtoUtils.marshaller(ListContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListContextsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetContextRequest, Context> getContextMethodDescriptor =
      MethodDescriptor.<GetContextRequest, Context>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/GetContext")
          .setRequestMarshaller(ProtoUtils.marshaller(GetContextRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreateContextRequest, Context>
      createContextMethodDescriptor =
          MethodDescriptor.<CreateContextRequest, Context>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/CreateContext")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdateContextRequest, Context>
      updateContextMethodDescriptor =
          MethodDescriptor.<UpdateContextRequest, Context>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/UpdateContext")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Context.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteContextRequest, Empty> deleteContextMethodDescriptor =
      MethodDescriptor.<DeleteContextRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/DeleteContext")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteContextRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteAllContextsRequest, Empty>
      deleteAllContextsMethodDescriptor =
          MethodDescriptor.<DeleteAllContextsRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Contexts/DeleteAllContexts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteAllContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListContextsRequest, ListContextsResponse> listContextsCallable;
  private final UnaryCallable<ListContextsRequest, ListContextsPagedResponse>
      listContextsPagedCallable;
  private final UnaryCallable<GetContextRequest, Context> getContextCallable;
  private final UnaryCallable<CreateContextRequest, Context> createContextCallable;
  private final UnaryCallable<UpdateContextRequest, Context> updateContextCallable;
  private final UnaryCallable<DeleteContextRequest, Empty> deleteContextCallable;
  private final UnaryCallable<DeleteAllContextsRequest, Empty> deleteAllContextsCallable;

  public static final GrpcContextsStub create(ContextsStubSettings settings) throws IOException {
    return new GrpcContextsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcContextsStub create(ClientContext clientContext) throws IOException {
    return new GrpcContextsStub(ContextsStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcContextsStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcContextsStub(ContextsStubSettings settings, ClientContext clientContext)
      throws IOException {

    GrpcCallSettings<ListContextsRequest, ListContextsResponse> listContextsTransportSettings =
        GrpcCallSettings.<ListContextsRequest, ListContextsResponse>newBuilder()
            .setMethodDescriptor(listContextsMethodDescriptor)
            .build();
    GrpcCallSettings<GetContextRequest, Context> getContextTransportSettings =
        GrpcCallSettings.<GetContextRequest, Context>newBuilder()
            .setMethodDescriptor(getContextMethodDescriptor)
            .build();
    GrpcCallSettings<CreateContextRequest, Context> createContextTransportSettings =
        GrpcCallSettings.<CreateContextRequest, Context>newBuilder()
            .setMethodDescriptor(createContextMethodDescriptor)
            .build();
    GrpcCallSettings<UpdateContextRequest, Context> updateContextTransportSettings =
        GrpcCallSettings.<UpdateContextRequest, Context>newBuilder()
            .setMethodDescriptor(updateContextMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteContextRequest, Empty> deleteContextTransportSettings =
        GrpcCallSettings.<DeleteContextRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteContextMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteAllContextsRequest, Empty> deleteAllContextsTransportSettings =
        GrpcCallSettings.<DeleteAllContextsRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAllContextsMethodDescriptor)
            .build();

    this.listContextsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listContextsTransportSettings, settings.listContextsSettings(), clientContext);
    this.listContextsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listContextsTransportSettings, settings.listContextsSettings(), clientContext);
    this.getContextCallable =
        GrpcCallableFactory.createUnaryCallable(
            getContextTransportSettings, settings.getContextSettings(), clientContext);
    this.createContextCallable =
        GrpcCallableFactory.createUnaryCallable(
            createContextTransportSettings, settings.createContextSettings(), clientContext);
    this.updateContextCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateContextTransportSettings, settings.updateContextSettings(), clientContext);
    this.deleteContextCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteContextTransportSettings, settings.deleteContextSettings(), clientContext);
    this.deleteAllContextsCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteAllContextsTransportSettings,
            settings.deleteAllContextsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ListContextsRequest, ListContextsPagedResponse> listContextsPagedCallable() {
    return listContextsPagedCallable;
  }

  public UnaryCallable<ListContextsRequest, ListContextsResponse> listContextsCallable() {
    return listContextsCallable;
  }

  public UnaryCallable<GetContextRequest, Context> getContextCallable() {
    return getContextCallable;
  }

  public UnaryCallable<CreateContextRequest, Context> createContextCallable() {
    return createContextCallable;
  }

  public UnaryCallable<UpdateContextRequest, Context> updateContextCallable() {
    return updateContextCallable;
  }

  public UnaryCallable<DeleteContextRequest, Empty> deleteContextCallable() {
    return deleteContextCallable;
  }

  public UnaryCallable<DeleteAllContextsRequest, Empty> deleteAllContextsCallable() {
    return deleteAllContextsCallable;
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
