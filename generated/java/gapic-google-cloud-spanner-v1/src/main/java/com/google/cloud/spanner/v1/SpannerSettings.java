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

import static com.google.cloud.spanner.v1.PagedResponseWrappers.ListSessionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.GrpcExtraHeaderData;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
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
import com.google.spanner.v1.ListSessionsRequest;
import com.google.spanner.v1.ListSessionsResponse;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.ResultSet;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.Transaction;
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
 *     SpannerSettings.newBuilder();
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

  private final UnaryCallSettings<CreateSessionRequest, Session> createSessionSettings;
  private final UnaryCallSettings<GetSessionRequest, Session> getSessionSettings;
  private final PagedCallSettings<
          ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>
      listSessionsSettings;
  private final UnaryCallSettings<DeleteSessionRequest, Empty> deleteSessionSettings;
  private final UnaryCallSettings<ExecuteSqlRequest, ResultSet> executeSqlSettings;
  private final StreamingCallSettings<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlSettings;
  private final UnaryCallSettings<ReadRequest, ResultSet> readSettings;
  private final StreamingCallSettings<ReadRequest, PartialResultSet> streamingReadSettings;
  private final UnaryCallSettings<BeginTransactionRequest, Transaction> beginTransactionSettings;
  private final UnaryCallSettings<CommitRequest, CommitResponse> commitSettings;
  private final UnaryCallSettings<RollbackRequest, Empty> rollbackSettings;

  /** Returns the object with the settings used for calls to createSession. */
  public UnaryCallSettings<CreateSessionRequest, Session> createSessionSettings() {
    return createSessionSettings;
  }

  /** Returns the object with the settings used for calls to getSession. */
  public UnaryCallSettings<GetSessionRequest, Session> getSessionSettings() {
    return getSessionSettings;
  }

  /** Returns the object with the settings used for calls to listSessions. */
  public PagedCallSettings<ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>
      listSessionsSettings() {
    return listSessionsSettings;
  }

  /** Returns the object with the settings used for calls to deleteSession. */
  public UnaryCallSettings<DeleteSessionRequest, Empty> deleteSessionSettings() {
    return deleteSessionSettings;
  }

  /** Returns the object with the settings used for calls to executeSql. */
  public UnaryCallSettings<ExecuteSqlRequest, ResultSet> executeSqlSettings() {
    return executeSqlSettings;
  }

  /** Returns the object with the settings used for calls to executeStreamingSql. */
  public StreamingCallSettings<ExecuteSqlRequest, PartialResultSet> executeStreamingSqlSettings() {
    return executeStreamingSqlSettings;
  }

  /** Returns the object with the settings used for calls to read. */
  public UnaryCallSettings<ReadRequest, ResultSet> readSettings() {
    return readSettings;
  }

  /** Returns the object with the settings used for calls to streamingRead. */
  public StreamingCallSettings<ReadRequest, PartialResultSet> streamingReadSettings() {
    return streamingReadSettings;
  }

  /** Returns the object with the settings used for calls to beginTransaction. */
  public UnaryCallSettings<BeginTransactionRequest, Transaction> beginTransactionSettings() {
    return beginTransactionSettings;
  }

  /** Returns the object with the settings used for calls to commit. */
  public UnaryCallSettings<CommitRequest, CommitResponse> commitSettings() {
    return commitSettings;
  }

  /** Returns the object with the settings used for calls to rollback. */
  public UnaryCallSettings<RollbackRequest, Empty> rollbackSettings() {
    return rollbackSettings;
  }

  public SpannerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSpannerStub.of(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
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
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder().setEndpoint(getDefaultEndpoint());
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setApiClientHeaderLineKey("x-goog-api-client")
        .addApiClientHeaderLineData(GrpcExtraHeaderData.getXGoogApiClientData());
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
  @Deprecated
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /**
   * Returns a builder for this class with recommended defaults for API methods, and the given
   * ClientContext used for executor/transport/credentials.
   */
  @Deprecated
  public static Builder defaultBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
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
        settingsBuilder.getTransportChannelProvider(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getHeaderProvider(),
        settingsBuilder.getClock());

    createSessionSettings = settingsBuilder.createSessionSettings().build();
    getSessionSettings = settingsBuilder.getSessionSettings().build();
    listSessionsSettings = settingsBuilder.listSessionsSettings().build();
    deleteSessionSettings = settingsBuilder.deleteSessionSettings().build();
    executeSqlSettings = settingsBuilder.executeSqlSettings().build();
    executeStreamingSqlSettings = settingsBuilder.executeStreamingSqlSettings().build();
    readSettings = settingsBuilder.readSettings().build();
    streamingReadSettings = settingsBuilder.streamingReadSettings().build();
    beginTransactionSettings = settingsBuilder.beginTransactionSettings().build();
    commitSettings = settingsBuilder.commitSettings().build();
    rollbackSettings = settingsBuilder.rollbackSettings().build();
  }

  private static final PagedListDescriptor<ListSessionsRequest, ListSessionsResponse, Session>
      LIST_SESSIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListSessionsRequest, ListSessionsResponse, Session>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSessionsRequest injectToken(ListSessionsRequest payload, String token) {
              return ListSessionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSessionsRequest injectPageSize(ListSessionsRequest payload, int pageSize) {
              return ListSessionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSessionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSessionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Session> extractResources(ListSessionsResponse payload) {
              return payload.getSessionsList();
            }
          };

  private static final PagedListResponseFactory<
          ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>
      LIST_SESSIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>() {
            @Override
            public ApiFuture<ListSessionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSessionsRequest, ListSessionsResponse> callable,
                ListSessionsRequest request,
                ApiCallContext context,
                ApiFuture<ListSessionsResponse> futureResponse) {
              PageContext<ListSessionsRequest, ListSessionsResponse, Session> pageContext =
                  PageContext.of(callable, LIST_SESSIONS_PAGE_STR_DESC, request, context);
              return ListSessionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for SpannerSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateSessionRequest, Session> createSessionSettings;
    private final UnaryCallSettings.Builder<GetSessionRequest, Session> getSessionSettings;
    private final PagedCallSettings.Builder<
            ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>
        listSessionsSettings;
    private final UnaryCallSettings.Builder<DeleteSessionRequest, Empty> deleteSessionSettings;
    private final UnaryCallSettings.Builder<ExecuteSqlRequest, ResultSet> executeSqlSettings;
    private final StreamingCallSettings.Builder<ExecuteSqlRequest, PartialResultSet>
        executeStreamingSqlSettings;
    private final UnaryCallSettings.Builder<ReadRequest, ResultSet> readSettings;
    private final StreamingCallSettings.Builder<ReadRequest, PartialResultSet>
        streamingReadSettings;
    private final UnaryCallSettings.Builder<BeginTransactionRequest, Transaction>
        beginTransactionSettings;
    private final UnaryCallSettings.Builder<CommitRequest, CommitResponse> commitSettings;
    private final UnaryCallSettings.Builder<RollbackRequest, Empty> rollbackSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "long_running",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
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

      createSessionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSessionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSessionsSettings = PagedCallSettings.newBuilder(LIST_SESSIONS_PAGE_STR_FACT);

      deleteSessionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      executeSqlSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      executeStreamingSqlSettings = StreamingCallSettings.newBuilder();

      readSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      streamingReadSettings = StreamingCallSettings.newBuilder();

      beginTransactionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      commitSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      rollbackSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSessionSettings,
              getSessionSettings,
              listSessionsSettings,
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
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
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
          .listSessionsSettings()
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
      listSessionsSettings = settings.listSessionsSettings.toBuilder();
      deleteSessionSettings = settings.deleteSessionSettings.toBuilder();
      executeSqlSettings = settings.executeSqlSettings.toBuilder();
      executeStreamingSqlSettings = settings.executeStreamingSqlSettings.toBuilder();
      readSettings = settings.readSettings.toBuilder();
      streamingReadSettings = settings.streamingReadSettings.toBuilder();
      beginTransactionSettings = settings.beginTransactionSettings.toBuilder();
      commitSettings = settings.commitSettings.toBuilder();
      rollbackSettings = settings.rollbackSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createSessionSettings,
              getSessionSettings,
              listSessionsSettings,
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
    public Builder setTransportChannelProvider(TransportChannelProvider transportProvider) {
      super.setTransportChannelProvider(transportProvider);
      return this;
    }

    @Override
    public Builder setHeaderProvider(HeaderProvider headerProvider) {
      super.setHeaderProvider(headerProvider);
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
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createSession. */
    public UnaryCallSettings.Builder<CreateSessionRequest, Session> createSessionSettings() {
      return createSessionSettings;
    }

    /** Returns the builder for the settings used for calls to getSession. */
    public UnaryCallSettings.Builder<GetSessionRequest, Session> getSessionSettings() {
      return getSessionSettings;
    }

    /** Returns the builder for the settings used for calls to listSessions. */
    public PagedCallSettings.Builder<
            ListSessionsRequest, ListSessionsResponse, ListSessionsPagedResponse>
        listSessionsSettings() {
      return listSessionsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteSession. */
    public UnaryCallSettings.Builder<DeleteSessionRequest, Empty> deleteSessionSettings() {
      return deleteSessionSettings;
    }

    /** Returns the builder for the settings used for calls to executeSql. */
    public UnaryCallSettings.Builder<ExecuteSqlRequest, ResultSet> executeSqlSettings() {
      return executeSqlSettings;
    }

    /** Returns the builder for the settings used for calls to executeStreamingSql. */
    public StreamingCallSettings.Builder<ExecuteSqlRequest, PartialResultSet>
        executeStreamingSqlSettings() {
      return executeStreamingSqlSettings;
    }

    /** Returns the builder for the settings used for calls to read. */
    public UnaryCallSettings.Builder<ReadRequest, ResultSet> readSettings() {
      return readSettings;
    }

    /** Returns the builder for the settings used for calls to streamingRead. */
    public StreamingCallSettings.Builder<ReadRequest, PartialResultSet> streamingReadSettings() {
      return streamingReadSettings;
    }

    /** Returns the builder for the settings used for calls to beginTransaction. */
    public UnaryCallSettings.Builder<BeginTransactionRequest, Transaction>
        beginTransactionSettings() {
      return beginTransactionSettings;
    }

    /** Returns the builder for the settings used for calls to commit. */
    public UnaryCallSettings.Builder<CommitRequest, CommitResponse> commitSettings() {
      return commitSettings;
    }

    /** Returns the builder for the settings used for calls to rollback. */
    public UnaryCallSettings.Builder<RollbackRequest, Empty> rollbackSettings() {
      return rollbackSettings;
    }

    @Override
    public SpannerSettings build() throws IOException {
      return new SpannerSettings(this);
    }
  }
}
