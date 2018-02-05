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
package com.google.cloud.errorreporting.v1beta1.stub;

import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListEventsPagedResponse;
import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListGroupStatsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Error Reporting API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcErrorStatsServiceStub extends ErrorStatsServiceStub {

  private static final MethodDescriptor<ListGroupStatsRequest, ListGroupStatsResponse>
      listGroupStatsMethodDescriptor =
          MethodDescriptor.<ListGroupStatsRequest, ListGroupStatsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListGroupStats")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListGroupStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListGroupStatsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListEventsRequest, ListEventsResponse>
      listEventsMethodDescriptor =
          MethodDescriptor.<ListEventsRequest, ListEventsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListEvents")
              .setRequestMarshaller(ProtoUtils.marshaller(ListEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListEventsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteEventsRequest, DeleteEventsResponse>
      deleteEventsMethodDescriptor =
          MethodDescriptor.<DeleteEventsRequest, DeleteEventsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/DeleteEvents")
              .setRequestMarshaller(ProtoUtils.marshaller(DeleteEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DeleteEventsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListGroupStatsRequest, ListGroupStatsResponse> listGroupStatsCallable;
  private final UnaryCallable<ListGroupStatsRequest, ListGroupStatsPagedResponse>
      listGroupStatsPagedCallable;
  private final UnaryCallable<ListEventsRequest, ListEventsResponse> listEventsCallable;
  private final UnaryCallable<ListEventsRequest, ListEventsPagedResponse> listEventsPagedCallable;
  private final UnaryCallable<DeleteEventsRequest, DeleteEventsResponse> deleteEventsCallable;

  public static final GrpcErrorStatsServiceStub create(ErrorStatsServiceStubSettings settings)
      throws IOException {
    return new GrpcErrorStatsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcErrorStatsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcErrorStatsServiceStub(
        ErrorStatsServiceStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcErrorStatsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcErrorStatsServiceStub(
      ErrorStatsServiceStubSettings settings, ClientContext clientContext) throws IOException {

    GrpcCallSettings<ListGroupStatsRequest, ListGroupStatsResponse>
        listGroupStatsTransportSettings =
            GrpcCallSettings.<ListGroupStatsRequest, ListGroupStatsResponse>newBuilder()
                .setMethodDescriptor(listGroupStatsMethodDescriptor)
                .build();
    GrpcCallSettings<ListEventsRequest, ListEventsResponse> listEventsTransportSettings =
        GrpcCallSettings.<ListEventsRequest, ListEventsResponse>newBuilder()
            .setMethodDescriptor(listEventsMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteEventsRequest, DeleteEventsResponse> deleteEventsTransportSettings =
        GrpcCallSettings.<DeleteEventsRequest, DeleteEventsResponse>newBuilder()
            .setMethodDescriptor(deleteEventsMethodDescriptor)
            .build();

    this.listGroupStatsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listGroupStatsTransportSettings, settings.listGroupStatsSettings(), clientContext);
    this.listGroupStatsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listGroupStatsTransportSettings, settings.listGroupStatsSettings(), clientContext);
    this.listEventsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listEventsTransportSettings, settings.listEventsSettings(), clientContext);
    this.listEventsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listEventsTransportSettings, settings.listEventsSettings(), clientContext);
    this.deleteEventsCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteEventsTransportSettings, settings.deleteEventsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsPagedResponse>
      listGroupStatsPagedCallable() {
    return listGroupStatsPagedCallable;
  }

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsResponse> listGroupStatsCallable() {
    return listGroupStatsCallable;
  }

  public UnaryCallable<ListEventsRequest, ListEventsPagedResponse> listEventsPagedCallable() {
    return listEventsPagedCallable;
  }

  public UnaryCallable<ListEventsRequest, ListEventsResponse> listEventsCallable() {
    return listEventsCallable;
  }

  public UnaryCallable<DeleteEventsRequest, DeleteEventsResponse> deleteEventsCallable() {
    return deleteEventsCallable;
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
