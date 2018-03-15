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
package com.google.cloud.trace.v1;

import static com.google.cloud.trace.v1.TraceServiceClient.ListTracesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.trace.v1.stub.TraceServiceStubSettings;
import com.google.devtools.cloudtrace.v1.GetTraceRequest;
import com.google.devtools.cloudtrace.v1.ListTracesRequest;
import com.google.devtools.cloudtrace.v1.ListTracesResponse;
import com.google.devtools.cloudtrace.v1.PatchTracesRequest;
import com.google.devtools.cloudtrace.v1.Trace;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TraceServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudtrace.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of patchTraces to 30 seconds:
 *
 * <pre>
 * <code>
 * TraceServiceSettings.Builder traceServiceSettingsBuilder =
 *     TraceServiceSettings.newBuilder();
 * traceServiceSettingsBuilder.patchTracesSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TraceServiceSettings traceServiceSettings = traceServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TraceServiceSettings extends ClientSettings<TraceServiceSettings> {
  /** Returns the object with the settings used for calls to patchTraces. */
  public UnaryCallSettings<PatchTracesRequest, Empty> patchTracesSettings() {
    return ((TraceServiceStubSettings) getStubSettings()).patchTracesSettings();
  }

  /** Returns the object with the settings used for calls to getTrace. */
  public UnaryCallSettings<GetTraceRequest, Trace> getTraceSettings() {
    return ((TraceServiceStubSettings) getStubSettings()).getTraceSettings();
  }

  /** Returns the object with the settings used for calls to listTraces. */
  public PagedCallSettings<ListTracesRequest, ListTracesResponse, ListTracesPagedResponse>
      listTracesSettings() {
    return ((TraceServiceStubSettings) getStubSettings()).listTracesSettings();
  }

  public static final TraceServiceSettings create(TraceServiceStubSettings stub)
      throws IOException {
    return new TraceServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TraceServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TraceServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TraceServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TraceServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return TraceServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TraceServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TraceServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TraceServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TraceServiceSettings. */
  public static class Builder extends ClientSettings.Builder<TraceServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(TraceServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(TraceServiceStubSettings.newBuilder());
    }

    protected Builder(TraceServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TraceServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public TraceServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((TraceServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to patchTraces. */
    public UnaryCallSettings.Builder<PatchTracesRequest, Empty> patchTracesSettings() {
      return getStubSettingsBuilder().patchTracesSettings();
    }

    /** Returns the builder for the settings used for calls to getTrace. */
    public UnaryCallSettings.Builder<GetTraceRequest, Trace> getTraceSettings() {
      return getStubSettingsBuilder().getTraceSettings();
    }

    /** Returns the builder for the settings used for calls to listTraces. */
    public PagedCallSettings.Builder<ListTracesRequest, ListTracesResponse, ListTracesPagedResponse>
        listTracesSettings() {
      return getStubSettingsBuilder().listTracesSettings();
    }

    @Override
    public TraceServiceSettings build() throws IOException {
      return new TraceServiceSettings(this);
    }
  }
}
