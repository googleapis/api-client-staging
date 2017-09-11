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
package com.google.cloud.spanner.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.spanner.v1.SpannerSettings;
import com.google.protobuf.Empty;
import com.google.spanner.v1.BeginTransactionRequest;
import com.google.spanner.v1.CommitRequest;
import com.google.spanner.v1.CommitResponse;
import com.google.spanner.v1.CreateSessionRequest;
import com.google.spanner.v1.DeleteSessionRequest;
import com.google.spanner.v1.ExecuteSqlRequest;
import com.google.spanner.v1.GetSessionRequest;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.ResultSet;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.Transaction;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Cloud Spanner API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcSpannerStub extends SpannerStub {
  private static final UnaryCallable<CreateSessionRequest, Session> directCreateSessionCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/CreateSession",
              io.grpc.protobuf.ProtoUtils.marshaller(CreateSessionRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Session.getDefaultInstance())));
  private static final UnaryCallable<GetSessionRequest, Session> directGetSessionCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/GetSession",
              io.grpc.protobuf.ProtoUtils.marshaller(GetSessionRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Session.getDefaultInstance())));
  private static final UnaryCallable<DeleteSessionRequest, Empty> directDeleteSessionCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/DeleteSession",
              io.grpc.protobuf.ProtoUtils.marshaller(DeleteSessionRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private static final UnaryCallable<ExecuteSqlRequest, ResultSet> directExecuteSqlCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/ExecuteSql",
              io.grpc.protobuf.ProtoUtils.marshaller(ExecuteSqlRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ResultSet.getDefaultInstance())));
  private static final ServerStreamingCallable<ExecuteSqlRequest, PartialResultSet>
      directExecuteStreamingSqlCallable =
          GrpcCallableFactory.createDirectServerStreamingCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
                  "google.spanner.v1.Spanner/ExecuteStreamingSql",
                  io.grpc.protobuf.ProtoUtils.marshaller(ExecuteSqlRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(PartialResultSet.getDefaultInstance())));
  private static final UnaryCallable<ReadRequest, ResultSet> directReadCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/Read",
              io.grpc.protobuf.ProtoUtils.marshaller(ReadRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ResultSet.getDefaultInstance())));
  private static final ServerStreamingCallable<ReadRequest, PartialResultSet>
      directStreamingReadCallable =
          GrpcCallableFactory.createDirectServerStreamingCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
                  "google.spanner.v1.Spanner/StreamingRead",
                  io.grpc.protobuf.ProtoUtils.marshaller(ReadRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(PartialResultSet.getDefaultInstance())));
  private static final UnaryCallable<BeginTransactionRequest, Transaction>
      directBeginTransactionCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.spanner.v1.Spanner/BeginTransaction",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      BeginTransactionRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Transaction.getDefaultInstance())));
  private static final UnaryCallable<CommitRequest, CommitResponse> directCommitCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/Commit",
              io.grpc.protobuf.ProtoUtils.marshaller(CommitRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(CommitResponse.getDefaultInstance())));
  private static final UnaryCallable<RollbackRequest, Empty> directRollbackCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/Rollback",
              io.grpc.protobuf.ProtoUtils.marshaller(RollbackRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreateSessionRequest, Session> createSessionCallable;
  private final UnaryCallable<GetSessionRequest, Session> getSessionCallable;
  private final UnaryCallable<DeleteSessionRequest, Empty> deleteSessionCallable;
  private final UnaryCallable<ExecuteSqlRequest, ResultSet> executeSqlCallable;
  private final ServerStreamingCallable<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlCallable;
  private final UnaryCallable<ReadRequest, ResultSet> readCallable;
  private final ServerStreamingCallable<ReadRequest, PartialResultSet> streamingReadCallable;
  private final UnaryCallable<BeginTransactionRequest, Transaction> beginTransactionCallable;
  private final UnaryCallable<CommitRequest, CommitResponse> commitCallable;
  private final UnaryCallable<RollbackRequest, Empty> rollbackCallable;

  public static final GrpcSpannerStub create(SpannerSettings settings) throws IOException {
    return new GrpcSpannerStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSpannerStub create(ClientContext clientContext) throws IOException {
    return new GrpcSpannerStub(SpannerSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcSpannerStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcSpannerStub(SpannerSettings settings, ClientContext clientContext)
      throws IOException {

    this.createSessionCallable =
        GrpcCallableFactory.create(
            directCreateSessionCallable, settings.createSessionSettings(), clientContext);
    this.getSessionCallable =
        GrpcCallableFactory.create(
            directGetSessionCallable, settings.getSessionSettings(), clientContext);
    this.deleteSessionCallable =
        GrpcCallableFactory.create(
            directDeleteSessionCallable, settings.deleteSessionSettings(), clientContext);
    this.executeSqlCallable =
        GrpcCallableFactory.create(
            directExecuteSqlCallable, settings.executeSqlSettings(), clientContext);
    this.executeStreamingSqlCallable =
        GrpcCallableFactory.create(
            directExecuteStreamingSqlCallable,
            settings.executeStreamingSqlSettings(),
            clientContext);
    this.readCallable =
        GrpcCallableFactory.create(directReadCallable, settings.readSettings(), clientContext);
    this.streamingReadCallable =
        GrpcCallableFactory.create(
            directStreamingReadCallable, settings.streamingReadSettings(), clientContext);
    this.beginTransactionCallable =
        GrpcCallableFactory.create(
            directBeginTransactionCallable, settings.beginTransactionSettings(), clientContext);
    this.commitCallable =
        GrpcCallableFactory.create(directCommitCallable, settings.commitSettings(), clientContext);
    this.rollbackCallable =
        GrpcCallableFactory.create(
            directRollbackCallable, settings.rollbackSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<CreateSessionRequest, Session> createSessionCallable() {
    return createSessionCallable;
  }

  public UnaryCallable<GetSessionRequest, Session> getSessionCallable() {
    return getSessionCallable;
  }

  public UnaryCallable<DeleteSessionRequest, Empty> deleteSessionCallable() {
    return deleteSessionCallable;
  }

  public UnaryCallable<ExecuteSqlRequest, ResultSet> executeSqlCallable() {
    return executeSqlCallable;
  }

  public ServerStreamingCallable<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlCallable() {
    return executeStreamingSqlCallable;
  }

  public UnaryCallable<ReadRequest, ResultSet> readCallable() {
    return readCallable;
  }

  public ServerStreamingCallable<ReadRequest, PartialResultSet> streamingReadCallable() {
    return streamingReadCallable;
  }

  public UnaryCallable<BeginTransactionRequest, Transaction> beginTransactionCallable() {
    return beginTransactionCallable;
  }

  public UnaryCallable<CommitRequest, CommitResponse> commitCallable() {
    return commitCallable;
  }

  public UnaryCallable<RollbackRequest, Empty> rollbackCallable() {
    return rollbackCallable;
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
