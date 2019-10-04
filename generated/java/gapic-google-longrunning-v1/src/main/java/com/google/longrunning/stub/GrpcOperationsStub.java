/*
 * Copyright 2019 Google LLC
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
package com.google.longrunning.stub;

import static com.google.longrunning.OperationsClient.ListOperationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.CancelOperationRequest;
import com.google.longrunning.DeleteOperationRequest;
import com.google.longrunning.GetOperationRequest;
import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Long Running Operations API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcOperationsStub extends OperationsStub {

  private static final MethodDescriptor<GetOperationRequest, Operation>
      getOperationMethodDescriptor =
          MethodDescriptor.<GetOperationRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/GetOperation")
              .setRequestMarshaller(ProtoUtils.marshaller(GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListOperationsRequest, ListOperationsResponse>
      listOperationsMethodDescriptor =
          MethodDescriptor.<ListOperationsRequest, ListOperationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/ListOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListOperationsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<CancelOperationRequest, Empty>
      cancelOperationMethodDescriptor =
          MethodDescriptor.<CancelOperationRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/CancelOperation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CancelOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeleteOperationRequest, Empty>
      deleteOperationMethodDescriptor =
          MethodDescriptor.<DeleteOperationRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/DeleteOperation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetOperationRequest, Operation> getOperationCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable;
  private final UnaryCallable<CancelOperationRequest, Empty> cancelOperationCallable;
  private final UnaryCallable<DeleteOperationRequest, Empty> deleteOperationCallable;

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcOperationsStub create(OperationsStubSettings settings)
      throws IOException {
    return new GrpcOperationsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcOperationsStub create(ClientContext clientContext) throws IOException {
    return new GrpcOperationsStub(OperationsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcOperationsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcOperationsStub(
        OperationsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcOperationsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcOperationsStub(OperationsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcOperationsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcOperationsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcOperationsStub(
      OperationsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<GetOperationRequest, Operation> getOperationTransportSettings =
        GrpcCallSettings.<GetOperationRequest, Operation>newBuilder()
            .setMethodDescriptor(getOperationMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetOperationRequest>() {
                  @Override
                  public Map<String, String> extract(GetOperationRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ListOperationsRequest, ListOperationsResponse>
        listOperationsTransportSettings =
            GrpcCallSettings.<ListOperationsRequest, ListOperationsResponse>newBuilder()
                .setMethodDescriptor(listOperationsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListOperationsRequest>() {
                      @Override
                      public Map<String, String> extract(ListOperationsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<CancelOperationRequest, Empty> cancelOperationTransportSettings =
        GrpcCallSettings.<CancelOperationRequest, Empty>newBuilder()
            .setMethodDescriptor(cancelOperationMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CancelOperationRequest>() {
                  @Override
                  public Map<String, String> extract(CancelOperationRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteOperationRequest, Empty> deleteOperationTransportSettings =
        GrpcCallSettings.<DeleteOperationRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteOperationMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteOperationRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteOperationRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();

    this.getOperationCallable =
        callableFactory.createUnaryCallable(
            getOperationTransportSettings, settings.getOperationSettings(), clientContext);
    this.listOperationsCallable =
        callableFactory.createUnaryCallable(
            listOperationsTransportSettings, settings.listOperationsSettings(), clientContext);
    this.listOperationsPagedCallable =
        callableFactory.createPagedCallable(
            listOperationsTransportSettings, settings.listOperationsSettings(), clientContext);
    this.cancelOperationCallable =
        callableFactory.createUnaryCallable(
            cancelOperationTransportSettings, settings.cancelOperationSettings(), clientContext);
    this.deleteOperationCallable =
        callableFactory.createUnaryCallable(
            deleteOperationTransportSettings, settings.deleteOperationSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetOperationRequest, Operation> getOperationCallable() {
    return getOperationCallable;
  }

  public UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable() {
    return listOperationsPagedCallable;
  }

  public UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable() {
    return listOperationsCallable;
  }

  public UnaryCallable<CancelOperationRequest, Empty> cancelOperationCallable() {
    return cancelOperationCallable;
  }

  public UnaryCallable<DeleteOperationRequest, Empty> deleteOperationCallable() {
    return deleteOperationCallable;
  }

  @Override
  public final void close() {
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
