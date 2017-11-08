/*
 * Copyright 2017, Google LLC All rights reserved.
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
package com.google.cloud.bigtable.v2;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.GrpcExtraHeaderData;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.bigtable.v2.CheckAndMutateRowRequest;
import com.google.bigtable.v2.CheckAndMutateRowResponse;
import com.google.bigtable.v2.MutateRowRequest;
import com.google.bigtable.v2.MutateRowResponse;
import com.google.bigtable.v2.MutateRowsRequest;
import com.google.bigtable.v2.MutateRowsResponse;
import com.google.bigtable.v2.ReadModifyWriteRowRequest;
import com.google.bigtable.v2.ReadModifyWriteRowResponse;
import com.google.bigtable.v2.ReadRowsRequest;
import com.google.bigtable.v2.ReadRowsResponse;
import com.google.bigtable.v2.SampleRowKeysRequest;
import com.google.bigtable.v2.SampleRowKeysResponse;
import com.google.cloud.bigtable.v2.stub.BigtableStub;
import com.google.cloud.bigtable.v2.stub.GrpcBigtableStub;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link BigtableClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigtable.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of mutateRow to 30 seconds:
 *
 * <pre>
 * <code>
 * BigtableSettings.Builder bigtableSettingsBuilder =
 *     BigtableSettings.newBuilder();
 * bigtableSettingsBuilder.mutateRowSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * BigtableSettings bigtableSettings = bigtableSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BigtableSettings extends ClientSettings<BigtableSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/bigtable.data")
          .add("https://www.googleapis.com/auth/bigtable.data.readonly")
          .add("https://www.googleapis.com/auth/cloud-bigtable.data")
          .add("https://www.googleapis.com/auth/cloud-bigtable.data.readonly")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/cloud/bigtable/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private final StreamingCallSettings<ReadRowsRequest, ReadRowsResponse> readRowsSettings;
  private final StreamingCallSettings<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysSettings;
  private final UnaryCallSettings<MutateRowRequest, MutateRowResponse> mutateRowSettings;
  private final StreamingCallSettings<MutateRowsRequest, MutateRowsResponse> mutateRowsSettings;
  private final UnaryCallSettings<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowSettings;
  private final UnaryCallSettings<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowSettings;

  /** Returns the object with the settings used for calls to readRows. */
  public StreamingCallSettings<ReadRowsRequest, ReadRowsResponse> readRowsSettings() {
    return readRowsSettings;
  }

  /** Returns the object with the settings used for calls to sampleRowKeys. */
  public StreamingCallSettings<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysSettings() {
    return sampleRowKeysSettings;
  }

  /** Returns the object with the settings used for calls to mutateRow. */
  public UnaryCallSettings<MutateRowRequest, MutateRowResponse> mutateRowSettings() {
    return mutateRowSettings;
  }

  /** Returns the object with the settings used for calls to mutateRows. */
  public StreamingCallSettings<MutateRowsRequest, MutateRowsResponse> mutateRowsSettings() {
    return mutateRowsSettings;
  }

  /** Returns the object with the settings used for calls to checkAndMutateRow. */
  public UnaryCallSettings<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowSettings() {
    return checkAndMutateRowSettings;
  }

  /** Returns the object with the settings used for calls to readModifyWriteRow. */
  public UnaryCallSettings<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowSettings() {
    return readModifyWriteRowSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BigtableStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBigtableStub.create(this);
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
    return "bigtable.googleapis.com:443";
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
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setApiClientHeaderLineKey("x-goog-api-client")
        .addApiClientHeaderLineData(GrpcExtraHeaderData.getXGoogApiClientData());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(
              BigtableSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
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

  private BigtableSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    readRowsSettings = settingsBuilder.readRowsSettings().build();
    sampleRowKeysSettings = settingsBuilder.sampleRowKeysSettings().build();
    mutateRowSettings = settingsBuilder.mutateRowSettings().build();
    mutateRowsSettings = settingsBuilder.mutateRowsSettings().build();
    checkAndMutateRowSettings = settingsBuilder.checkAndMutateRowSettings().build();
    readModifyWriteRowSettings = settingsBuilder.readModifyWriteRowSettings().build();
  }

  /** Builder for BigtableSettings. */
  public static class Builder extends ClientSettings.Builder<BigtableSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final StreamingCallSettings.Builder<ReadRowsRequest, ReadRowsResponse> readRowsSettings;
    private final StreamingCallSettings.Builder<SampleRowKeysRequest, SampleRowKeysResponse>
        sampleRowKeysSettings;
    private final UnaryCallSettings.Builder<MutateRowRequest, MutateRowResponse> mutateRowSettings;
    private final StreamingCallSettings.Builder<MutateRowsRequest, MutateRowsResponse>
        mutateRowsSettings;
    private final UnaryCallSettings.Builder<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
        checkAndMutateRowSettings;
    private final UnaryCallSettings.Builder<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
        readModifyWriteRowSettings;

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
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      this((ClientContext) null);
    }

    private Builder(ClientContext clientContext) {
      super(clientContext);

      readRowsSettings = StreamingCallSettings.newBuilder();

      sampleRowKeysSettings = StreamingCallSettings.newBuilder();

      mutateRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      mutateRowsSettings = StreamingCallSettings.newBuilder();

      checkAndMutateRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      readModifyWriteRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateRowSettings, checkAndMutateRowSettings, readModifyWriteRowSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .mutateRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .checkAndMutateRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .readModifyWriteRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(BigtableSettings settings) {
      super(settings);

      readRowsSettings = settings.readRowsSettings.toBuilder();
      sampleRowKeysSettings = settings.sampleRowKeysSettings.toBuilder();
      mutateRowSettings = settings.mutateRowSettings.toBuilder();
      mutateRowsSettings = settings.mutateRowsSettings.toBuilder();
      checkAndMutateRowSettings = settings.checkAndMutateRowSettings.toBuilder();
      readModifyWriteRowSettings = settings.readModifyWriteRowSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateRowSettings, checkAndMutateRowSettings, readModifyWriteRowSettings);
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

    /** Returns the builder for the settings used for calls to readRows. */
    public StreamingCallSettings.Builder<ReadRowsRequest, ReadRowsResponse> readRowsSettings() {
      return readRowsSettings;
    }

    /** Returns the builder for the settings used for calls to sampleRowKeys. */
    public StreamingCallSettings.Builder<SampleRowKeysRequest, SampleRowKeysResponse>
        sampleRowKeysSettings() {
      return sampleRowKeysSettings;
    }

    /** Returns the builder for the settings used for calls to mutateRow. */
    public UnaryCallSettings.Builder<MutateRowRequest, MutateRowResponse> mutateRowSettings() {
      return mutateRowSettings;
    }

    /** Returns the builder for the settings used for calls to mutateRows. */
    public StreamingCallSettings.Builder<MutateRowsRequest, MutateRowsResponse>
        mutateRowsSettings() {
      return mutateRowsSettings;
    }

    /** Returns the builder for the settings used for calls to checkAndMutateRow. */
    public UnaryCallSettings.Builder<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
        checkAndMutateRowSettings() {
      return checkAndMutateRowSettings;
    }

    /** Returns the builder for the settings used for calls to readModifyWriteRow. */
    public UnaryCallSettings.Builder<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
        readModifyWriteRowSettings() {
      return readModifyWriteRowSettings;
    }

    @Override
    public BigtableSettings build() throws IOException {
      return new BigtableSettings(this);
    }
  }
}
