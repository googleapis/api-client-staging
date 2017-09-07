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
package com.google.cloud.spanner.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.grpc.GrpcTransport;
import com.google.api.gax.grpc.GrpcTransportProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.SimpleCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.spanner.v1.stub.GrpcSpannerStub;
import com.google.cloud.spanner.v1.stub.SpannerStub;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
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

  public SpannerStub createStub() throws IOException {
    if (getTransportProvider().getTransportName().equals(GrpcTransport.getGrpcTransportName())) {
      return GrpcSpannerStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportProvider().getTransportName());
    }
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
  public static InstantiatingChannelProvider.Builder defaultGrpcChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion());
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static GrpcTransportProvider.Builder defaultGrpcTransportProviderBuilder() {
    return GrpcTransportProvider.newBuilder()
        .setChannelProvider(defaultGrpcChannelProviderBuilder().build());
  }

  public static TransportProvider defaultTransportProvider() {
    return defaultGrpcTransportProviderBuilder().build();
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

  /**
   * Returns a builder for this class with recommended defaults for API methods, and the given
   * ClientContext used for executor/transport/credentials.
   */
  public static Builder defaultBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private SpannerSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

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

    private static final ImmutableMap<String, ImmutableSet<StatusCode>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode>newArrayList(
                  GrpcStatusCode.of(Status.Code.DEADLINE_EXCEEDED),
                  GrpcStatusCode.of(Status.Code.UNAVAILABLE))));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode>newArrayList()));
      definitions.put(
          "long_running",
          ImmutableSet.copyOf(
              Lists.<StatusCode>newArrayList(GrpcStatusCode.of(Status.Code.UNAVAILABLE))));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(32000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(32000L))
              .setInitialRpcTimeout(Duration.ofMillis(3600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(3600000L))
              .setTotalTimeout(Duration.ofMillis(3600000L))
              .build();
      definitions.put("long_running", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      this((ClientContext) null);
    }

    private Builder(ClientContext clientContext) {
      super(clientContext);

      createSessionSettings = SimpleCallSettings.newBuilder();

      getSessionSettings = SimpleCallSettings.newBuilder();

      deleteSessionSettings = SimpleCallSettings.newBuilder();

      executeSqlSettings = SimpleCallSettings.newBuilder();

      executeStreamingSqlSettings = StreamingCallSettings.newBuilder();

      readSettings = SimpleCallSettings.newBuilder();

      streamingReadSettings = StreamingCallSettings.newBuilder();

      beginTransactionSettings = SimpleCallSettings.newBuilder();

      commitSettings = SimpleCallSettings.newBuilder();

      rollbackSettings = SimpleCallSettings.newBuilder();

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

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportProvider(defaultTransportProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .createSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSessionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .executeSqlSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .readSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .beginTransactionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .commitSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("long_running"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("long_running"));

      builder
          .rollbackSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

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
    public Builder setTransportProvider(TransportProvider transportProvider) {
      super.setTransportProvider(transportProvider);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      return this;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
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
