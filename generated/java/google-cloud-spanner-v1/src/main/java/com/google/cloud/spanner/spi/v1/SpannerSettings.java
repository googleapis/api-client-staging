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
package com.google.cloud.spanner.spi.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.ChannelProvider;
import com.google.api.gax.grpc.ClientSettings;
import com.google.api.gax.grpc.ExecutorProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.grpc.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.StreamingCallSettings;
import com.google.api.gax.grpc.UnaryCallSettings;
import com.google.api.gax.retrying.RetrySettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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
import io.grpc.Status;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link SpannerClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (spanner.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of createSession to 30 seconds:
 *
 * <pre>
 * <code>
 * SpannerSettings.Builder spannerSettingsBuilder =
 *     SpannerSettings.defaultBuilder();
 * spannerSettingsBuilder.createSessionSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * SpannerSettings spannerSettings = spannerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SpannerSettings extends ClientSettings {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/spanner.data")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/cloud/spanner/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private static final io.grpc.MethodDescriptor<CreateSessionRequest, Session>
      METHOD_CREATE_SESSION =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/CreateSession",
              io.grpc.protobuf.ProtoUtils.marshaller(CreateSessionRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Session.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<GetSessionRequest, Session> METHOD_GET_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/GetSession",
          io.grpc.protobuf.ProtoUtils.marshaller(GetSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Session.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<DeleteSessionRequest, Empty> METHOD_DELETE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/DeleteSession",
          io.grpc.protobuf.ProtoUtils.marshaller(DeleteSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ExecuteSqlRequest, ResultSet> METHOD_EXECUTE_SQL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/ExecuteSql",
          io.grpc.protobuf.ProtoUtils.marshaller(ExecuteSqlRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultSet.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ExecuteSqlRequest, PartialResultSet>
      METHOD_EXECUTE_STREAMING_SQL =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
              "google.spanner.v1.Spanner/ExecuteStreamingSql",
              io.grpc.protobuf.ProtoUtils.marshaller(ExecuteSqlRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(PartialResultSet.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ReadRequest, ResultSet> METHOD_READ =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/Read",
          io.grpc.protobuf.ProtoUtils.marshaller(ReadRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultSet.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ReadRequest, PartialResultSet>
      METHOD_STREAMING_READ =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
              "google.spanner.v1.Spanner/StreamingRead",
              io.grpc.protobuf.ProtoUtils.marshaller(ReadRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(PartialResultSet.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<BeginTransactionRequest, Transaction>
      METHOD_BEGIN_TRANSACTION =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.v1.Spanner/BeginTransaction",
              io.grpc.protobuf.ProtoUtils.marshaller(BeginTransactionRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Transaction.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<CommitRequest, CommitResponse> METHOD_COMMIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/Commit",
          io.grpc.protobuf.ProtoUtils.marshaller(CommitRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(CommitResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<RollbackRequest, Empty> METHOD_ROLLBACK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.v1.Spanner/Rollback",
          io.grpc.protobuf.ProtoUtils.marshaller(RollbackRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()));

  private final SimpleCallSettings<CreateSessionRequest, Session> createSessionSettings;
  private final SimpleCallSettings<GetSessionRequest, Session> getSessionSettings;
  private final SimpleCallSettings<DeleteSessionRequest, Empty> deleteSessionSettings;
  private final SimpleCallSettings<ExecuteSqlRequest, ResultSet> executeSqlSettings;
  private final StreamingCallSettings<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlSettings;
  private final SimpleCallSettings<ReadRequest, ResultSet> readSettings;
  private final StreamingCallSettings<ReadRequest, PartialResultSet> streamingReadSettings;
  private final SimpleCallSettings<BeginTransactionRequest, Transaction> beginTransactionSettings;
  private final SimpleCallSettings<CommitRequest, CommitResponse> commitSettings;
  private final SimpleCallSettings<RollbackRequest, Empty> rollbackSettings;

  /** Returns the object with the settings used for calls to createSession. */
  public SimpleCallSettings<CreateSessionRequest, Session> createSessionSettings() {
    return createSessionSettings;
  }

  /** Returns the object with the settings used for calls to getSession. */
  public SimpleCallSettings<GetSessionRequest, Session> getSessionSettings() {
    return getSessionSettings;
  }

  /** Returns the object with the settings used for calls to deleteSession. */
  public SimpleCallSettings<DeleteSessionRequest, Empty> deleteSessionSettings() {
    return deleteSessionSettings;
  }

  /** Returns the object with the settings used for calls to executeSql. */
  public SimpleCallSettings<ExecuteSqlRequest, ResultSet> executeSqlSettings() {
    return executeSqlSettings;
  }

  /** Returns the object with the settings used for calls to executeStreamingSql. */
  public StreamingCallSettings<ExecuteSqlRequest, PartialResultSet> executeStreamingSqlSettings() {
    return executeStreamingSqlSettings;
  }

  /** Returns the object with the settings used for calls to read. */
  public SimpleCallSettings<ReadRequest, ResultSet> readSettings() {
    return readSettings;
  }

  /** Returns the object with the settings used for calls to streamingRead. */
  public StreamingCallSettings<ReadRequest, PartialResultSet> streamingReadSettings() {
    return streamingReadSettings;
  }

  /** Returns the object with the settings used for calls to beginTransaction. */
  public SimpleCallSettings<BeginTransactionRequest, Transaction> beginTransactionSettings() {
    return beginTransactionSettings;
  }

  /** Returns the object with the settings used for calls to commit. */
  public SimpleCallSettings<CommitRequest, CommitResponse> commitSettings() {
    return commitSettings;
  }

  /** Returns the object with the settings used for calls to rollback. */
  public SimpleCallSettings<RollbackRequest, Empty> rollbackSettings() {
    return rollbackSettings;
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "spanner.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingChannelProvider.Builder defaultChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setCredentialsProvider(defaultCredentialsProviderBuilder().build());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(SpannerSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /** Returns a builder for this class with recommended defaults. */
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private SpannerSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder.getExecutorProvider(), settingsBuilder.getChannelProvider());

    createSessionSettings = settingsBuilder.createSessionSettings().build();
    getSessionSettings = settingsBuilder.getSessionSettings().build();
    deleteSessionSettings = settingsBuilder.deleteSessionSettings().build();
    executeSqlSettings = settingsBuilder.executeSqlSettings().build();
    executeStreamingSqlSettings = settingsBuilder.executeStreamingSqlSettings().build();
    readSettings = settingsBuilder.readSettings().build();
    streamingReadSettings = settingsBuilder.streamingReadSettings().build();
    beginTransactionSettings = settingsBuilder.beginTransactionSettings().build();
    commitSettings = settingsBuilder.commitSettings().build();
    rollbackSettings = settingsBuilder.rollbackSettings().build();
  }

  /** Builder for SpannerSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<CreateSessionRequest, Session> createSessionSettings;
    private final SimpleCallSettings.Builder<GetSessionRequest, Session> getSessionSettings;
    private final SimpleCallSettings.Builder<DeleteSessionRequest, Empty> deleteSessionSettings;
    private final SimpleCallSettings.Builder<ExecuteSqlRequest, ResultSet> executeSqlSettings;
    private final StreamingCallSettings.Builder<ExecuteSqlRequest, PartialResultSet>
        executeStreamingSqlSettings;
    private final SimpleCallSettings.Builder<ReadRequest, ResultSet> readSettings;
    private final StreamingCallSettings.Builder<ReadRequest, PartialResultSet>
        streamingReadSettings;
    private final SimpleCallSettings.Builder<BeginTransactionRequest, Transaction>
        beginTransactionSettings;
    private final SimpleCallSettings.Builder<CommitRequest, CommitResponse> commitSettings;
    private final SimpleCallSettings.Builder<RollbackRequest, Empty> rollbackSettings;

    private static final ImmutableMap<String, ImmutableSet<Status.Code>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<Status.Code>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          Sets.immutableEnumSet(
              Lists.<Status.Code>newArrayList(
                  Status.Code.DEADLINE_EXCEEDED, Status.Code.UNAVAILABLE)));
      definitions.put(
          "non_idempotent",
          Sets.immutableEnumSet(Lists.<Status.Code>newArrayList(Status.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings.Builder> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings.Builder> definitions = ImmutableMap.builder();
      RetrySettings.Builder settingsBuilder = null;
      settingsBuilder =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(32000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(600000L));
      definitions.put("default", settingsBuilder);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      super(defaultChannelProviderBuilder().build());

      createSessionSettings = SimpleCallSettings.newBuilder(METHOD_CREATE_SESSION);

      getSessionSettings = SimpleCallSettings.newBuilder(METHOD_GET_SESSION);

      deleteSessionSettings = SimpleCallSettings.newBuilder(METHOD_DELETE_SESSION);

      executeSqlSettings = SimpleCallSettings.newBuilder(METHOD_EXECUTE_SQL);

      executeStreamingSqlSettings = StreamingCallSettings.newBuilder(METHOD_EXECUTE_STREAMING_SQL);

      readSettings = SimpleCallSettings.newBuilder(METHOD_READ);

      streamingReadSettings = StreamingCallSettings.newBuilder(METHOD_STREAMING_READ);

      beginTransactionSettings = SimpleCallSettings.newBuilder(METHOD_BEGIN_TRANSACTION);

      commitSettings = SimpleCallSettings.newBuilder(METHOD_COMMIT);

      rollbackSettings = SimpleCallSettings.newBuilder(METHOD_ROLLBACK);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              createSessionSettings,
              getSessionSettings,
              deleteSessionSettings,
              executeSqlSettings,
              readSettings,
              beginTransactionSettings,
              commitSettings,
              rollbackSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .createSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .executeSqlSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .readSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .beginTransactionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .commitSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .rollbackSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(SpannerSettings settings) {
      super(settings);

      createSessionSettings = settings.createSessionSettings.toBuilder();
      getSessionSettings = settings.getSessionSettings.toBuilder();
      deleteSessionSettings = settings.deleteSessionSettings.toBuilder();
      executeSqlSettings = settings.executeSqlSettings.toBuilder();
      executeStreamingSqlSettings = settings.executeStreamingSqlSettings.toBuilder();
      readSettings = settings.readSettings.toBuilder();
      streamingReadSettings = settings.streamingReadSettings.toBuilder();
      beginTransactionSettings = settings.beginTransactionSettings.toBuilder();
      commitSettings = settings.commitSettings.toBuilder();
      rollbackSettings = settings.rollbackSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              createSessionSettings,
              getSessionSettings,
              deleteSessionSettings,
              executeSqlSettings,
              readSettings,
              beginTransactionSettings,
              commitSettings,
              rollbackSettings);
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setChannelProvider(ChannelProvider channelProvider) {
      super.setChannelProvider(channelProvider);
      return this;
    }

    /**
     * Applies the given settings to all of the unary API methods in this service. Only values that
     * are non-null will be applied, so this method is not capable of un-setting any values.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(UnaryCallSettings.Builder unaryCallSettings)
        throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, unaryCallSettings);
      return this;
    }

    /** Returns the builder for the settings used for calls to createSession. */
    public SimpleCallSettings.Builder<CreateSessionRequest, Session> createSessionSettings() {
      return createSessionSettings;
    }

    /** Returns the builder for the settings used for calls to getSession. */
    public SimpleCallSettings.Builder<GetSessionRequest, Session> getSessionSettings() {
      return getSessionSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSession. */
    public SimpleCallSettings.Builder<DeleteSessionRequest, Empty> deleteSessionSettings() {
      return deleteSessionSettings;
    }

    /** Returns the builder for the settings used for calls to executeSql. */
    public SimpleCallSettings.Builder<ExecuteSqlRequest, ResultSet> executeSqlSettings() {
      return executeSqlSettings;
    }

    /** Returns the builder for the settings used for calls to executeStreamingSql. */
    public StreamingCallSettings.Builder<ExecuteSqlRequest, PartialResultSet>
        executeStreamingSqlSettings() {
      return executeStreamingSqlSettings;
    }

    /** Returns the builder for the settings used for calls to read. */
    public SimpleCallSettings.Builder<ReadRequest, ResultSet> readSettings() {
      return readSettings;
    }

    /** Returns the builder for the settings used for calls to streamingRead. */
    public StreamingCallSettings.Builder<ReadRequest, PartialResultSet> streamingReadSettings() {
      return streamingReadSettings;
    }

    /** Returns the builder for the settings used for calls to beginTransaction. */
    public SimpleCallSettings.Builder<BeginTransactionRequest, Transaction>
        beginTransactionSettings() {
      return beginTransactionSettings;
    }

    /** Returns the builder for the settings used for calls to commit. */
    public SimpleCallSettings.Builder<CommitRequest, CommitResponse> commitSettings() {
      return commitSettings;
    }

    /** Returns the builder for the settings used for calls to rollback. */
    public SimpleCallSettings.Builder<RollbackRequest, Empty> rollbackSettings() {
      return rollbackSettings;
    }

    @Override
    public SpannerSettings build() throws IOException {
      return new SpannerSettings(this);
    }
  }
}
