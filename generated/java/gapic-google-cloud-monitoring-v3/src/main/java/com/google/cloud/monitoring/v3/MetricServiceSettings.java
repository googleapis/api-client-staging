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
package com.google.cloud.monitoring.v3;

import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListMetricDescriptorsPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListTimeSeriesPagedResponse;

import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
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
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.stub.GrpcMetricServiceStub;
import com.google.cloud.monitoring.v3.stub.MetricServiceStub;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.monitoring.v3.CreateMetricDescriptorRequest;
import com.google.monitoring.v3.CreateTimeSeriesRequest;
import com.google.monitoring.v3.DeleteMetricDescriptorRequest;
import com.google.monitoring.v3.GetMetricDescriptorRequest;
import com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ListMetricDescriptorsResponse;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse;
import com.google.monitoring.v3.ListTimeSeriesRequest;
import com.google.monitoring.v3.ListTimeSeriesResponse;
import com.google.monitoring.v3.TimeSeries;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link MetricServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (monitoring.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getMonitoredResourceDescriptor to 30 seconds:
 *
 * <pre>
 * <code>
 * MetricServiceSettings.Builder metricServiceSettingsBuilder =
 *     MetricServiceSettings.newBuilder();
 * metricServiceSettingsBuilder.getMonitoredResourceDescriptorSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * MetricServiceSettings metricServiceSettings = metricServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class MetricServiceSettings extends ClientSettings<MetricServiceSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/monitoring")
          .add("https://www.googleapis.com/auth/monitoring.read")
          .add("https://www.googleapis.com/auth/monitoring.write")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/cloud/monitoring/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private final PagedCallSettings<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsSettings;
  private final UnaryCallSettings<
          GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
      getMonitoredResourceDescriptorSettings;
  private final PagedCallSettings<
          ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
          ListMetricDescriptorsPagedResponse>
      listMetricDescriptorsSettings;
  private final UnaryCallSettings<GetMetricDescriptorRequest, MetricDescriptor>
      getMetricDescriptorSettings;
  private final UnaryCallSettings<CreateMetricDescriptorRequest, MetricDescriptor>
      createMetricDescriptorSettings;
  private final UnaryCallSettings<DeleteMetricDescriptorRequest, Empty>
      deleteMetricDescriptorSettings;
  private final PagedCallSettings<
          ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>
      listTimeSeriesSettings;
  private final UnaryCallSettings<CreateTimeSeriesRequest, Empty> createTimeSeriesSettings;

  /** Returns the object with the settings used for calls to listMonitoredResourceDescriptors. */
  public PagedCallSettings<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsSettings() {
    return listMonitoredResourceDescriptorsSettings;
  }

  /** Returns the object with the settings used for calls to getMonitoredResourceDescriptor. */
  public UnaryCallSettings<GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
      getMonitoredResourceDescriptorSettings() {
    return getMonitoredResourceDescriptorSettings;
  }

  /** Returns the object with the settings used for calls to listMetricDescriptors. */
  public PagedCallSettings<
          ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
          ListMetricDescriptorsPagedResponse>
      listMetricDescriptorsSettings() {
    return listMetricDescriptorsSettings;
  }

  /** Returns the object with the settings used for calls to getMetricDescriptor. */
  public UnaryCallSettings<GetMetricDescriptorRequest, MetricDescriptor>
      getMetricDescriptorSettings() {
    return getMetricDescriptorSettings;
  }

  /** Returns the object with the settings used for calls to createMetricDescriptor. */
  public UnaryCallSettings<CreateMetricDescriptorRequest, MetricDescriptor>
      createMetricDescriptorSettings() {
    return createMetricDescriptorSettings;
  }

  /** Returns the object with the settings used for calls to deleteMetricDescriptor. */
  public UnaryCallSettings<DeleteMetricDescriptorRequest, Empty> deleteMetricDescriptorSettings() {
    return deleteMetricDescriptorSettings;
  }

  /** Returns the object with the settings used for calls to listTimeSeries. */
  public PagedCallSettings<
          ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>
      listTimeSeriesSettings() {
    return listTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to createTimeSeries. */
  public UnaryCallSettings<CreateTimeSeriesRequest, Empty> createTimeSeriesSettings() {
    return createTimeSeriesSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MetricServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMetricServiceStub.create(this);
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
    return "monitoring.googleapis.com:443";
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
              MetricServiceSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private MetricServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listMonitoredResourceDescriptorsSettings =
        settingsBuilder.listMonitoredResourceDescriptorsSettings().build();
    getMonitoredResourceDescriptorSettings =
        settingsBuilder.getMonitoredResourceDescriptorSettings().build();
    listMetricDescriptorsSettings = settingsBuilder.listMetricDescriptorsSettings().build();
    getMetricDescriptorSettings = settingsBuilder.getMetricDescriptorSettings().build();
    createMetricDescriptorSettings = settingsBuilder.createMetricDescriptorSettings().build();
    deleteMetricDescriptorSettings = settingsBuilder.deleteMetricDescriptorSettings().build();
    listTimeSeriesSettings = settingsBuilder.listTimeSeriesSettings().build();
    createTimeSeriesSettings = settingsBuilder.createTimeSeriesSettings().build();
  }

  private static final PagedListDescriptor<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor>
      LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
              MonitoredResourceDescriptor>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMonitoredResourceDescriptorsRequest injectToken(
                ListMonitoredResourceDescriptorsRequest payload, String token) {
              return ListMonitoredResourceDescriptorsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListMonitoredResourceDescriptorsRequest injectPageSize(
                ListMonitoredResourceDescriptorsRequest payload, int pageSize) {
              return ListMonitoredResourceDescriptorsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListMonitoredResourceDescriptorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMonitoredResourceDescriptorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MonitoredResourceDescriptor> extractResources(
                ListMonitoredResourceDescriptorsResponse payload) {
              return payload.getResourceDescriptorsList();
            }
          };

  private static final PagedListDescriptor<
          ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
      LIST_METRIC_DESCRIPTORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMetricDescriptorsRequest injectToken(
                ListMetricDescriptorsRequest payload, String token) {
              return ListMetricDescriptorsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListMetricDescriptorsRequest injectPageSize(
                ListMetricDescriptorsRequest payload, int pageSize) {
              return ListMetricDescriptorsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListMetricDescriptorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMetricDescriptorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MetricDescriptor> extractResources(
                ListMetricDescriptorsResponse payload) {
              return payload.getMetricDescriptorsList();
            }
          };

  private static final PagedListDescriptor<
          ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries>
      LIST_TIME_SERIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTimeSeriesRequest injectToken(ListTimeSeriesRequest payload, String token) {
              return ListTimeSeriesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTimeSeriesRequest injectPageSize(
                ListTimeSeriesRequest payload, int pageSize) {
              return ListTimeSeriesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTimeSeriesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTimeSeriesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TimeSeries> extractResources(ListTimeSeriesResponse payload) {
              return payload.getTimeSeriesList();
            }
          };

  private static final PagedListResponseFactory<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          ListMonitoredResourceDescriptorsPagedResponse>
      LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
              ListMonitoredResourceDescriptorsPagedResponse>() {
            @Override
            public ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListMonitoredResourceDescriptorsRequest,
                        ListMonitoredResourceDescriptorsResponse>
                    callable,
                ListMonitoredResourceDescriptorsRequest request,
                ApiCallContext context,
                ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
              PageContext<
                      ListMonitoredResourceDescriptorsRequest,
                      ListMonitoredResourceDescriptorsResponse, MonitoredResourceDescriptor>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_DESC,
                          request,
                          context);
              return ListMonitoredResourceDescriptorsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
          ListMetricDescriptorsPagedResponse>
      LIST_METRIC_DESCRIPTORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
              ListMetricDescriptorsPagedResponse>() {
            @Override
            public ApiFuture<ListMetricDescriptorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse> callable,
                ListMetricDescriptorsRequest request,
                ApiCallContext context,
                ApiFuture<ListMetricDescriptorsResponse> futureResponse) {
              PageContext<
                      ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
                  pageContext =
                      PageContext.create(
                          callable, LIST_METRIC_DESCRIPTORS_PAGE_STR_DESC, request, context);
              return ListMetricDescriptorsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>
      LIST_TIME_SERIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>() {
            @Override
            public ApiFuture<ListTimeSeriesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesResponse> callable,
                ListTimeSeriesRequest request,
                ApiCallContext context,
                ApiFuture<ListTimeSeriesResponse> futureResponse) {
              PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> pageContext =
                  PageContext.create(callable, LIST_TIME_SERIES_PAGE_STR_DESC, request, context);
              return ListTimeSeriesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for MetricServiceSettings. */
  public static class Builder extends ClientSettings.Builder<MetricServiceSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<
            ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
            ListMonitoredResourceDescriptorsPagedResponse>
        listMonitoredResourceDescriptorsSettings;
    private final UnaryCallSettings.Builder<
            GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
        getMonitoredResourceDescriptorSettings;
    private final PagedCallSettings.Builder<
            ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
            ListMetricDescriptorsPagedResponse>
        listMetricDescriptorsSettings;
    private final UnaryCallSettings.Builder<GetMetricDescriptorRequest, MetricDescriptor>
        getMetricDescriptorSettings;
    private final UnaryCallSettings.Builder<CreateMetricDescriptorRequest, MetricDescriptor>
        createMetricDescriptorSettings;
    private final UnaryCallSettings.Builder<DeleteMetricDescriptorRequest, Empty>
        deleteMetricDescriptorSettings;
    private final PagedCallSettings.Builder<
            ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>
        listTimeSeriesSettings;
    private final UnaryCallSettings.Builder<CreateTimeSeriesRequest, Empty>
        createTimeSeriesSettings;

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

      listMonitoredResourceDescriptorsSettings =
          PagedCallSettings.newBuilder(LIST_MONITORED_RESOURCE_DESCRIPTORS_PAGE_STR_FACT);

      getMonitoredResourceDescriptorSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listMetricDescriptorsSettings =
          PagedCallSettings.newBuilder(LIST_METRIC_DESCRIPTORS_PAGE_STR_FACT);

      getMetricDescriptorSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createMetricDescriptorSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteMetricDescriptorSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listTimeSeriesSettings = PagedCallSettings.newBuilder(LIST_TIME_SERIES_PAGE_STR_FACT);

      createTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listMonitoredResourceDescriptorsSettings,
              getMonitoredResourceDescriptorSettings,
              listMetricDescriptorsSettings,
              getMetricDescriptorSettings,
              createMetricDescriptorSettings,
              deleteMetricDescriptorSettings,
              listTimeSeriesSettings,
              createTimeSeriesSettings);

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
          .listMonitoredResourceDescriptorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getMonitoredResourceDescriptorSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listMetricDescriptorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getMetricDescriptorSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createMetricDescriptorSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteMetricDescriptorSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(MetricServiceSettings settings) {
      super(settings);

      listMonitoredResourceDescriptorsSettings =
          settings.listMonitoredResourceDescriptorsSettings.toBuilder();
      getMonitoredResourceDescriptorSettings =
          settings.getMonitoredResourceDescriptorSettings.toBuilder();
      listMetricDescriptorsSettings = settings.listMetricDescriptorsSettings.toBuilder();
      getMetricDescriptorSettings = settings.getMetricDescriptorSettings.toBuilder();
      createMetricDescriptorSettings = settings.createMetricDescriptorSettings.toBuilder();
      deleteMetricDescriptorSettings = settings.deleteMetricDescriptorSettings.toBuilder();
      listTimeSeriesSettings = settings.listTimeSeriesSettings.toBuilder();
      createTimeSeriesSettings = settings.createTimeSeriesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listMonitoredResourceDescriptorsSettings,
              getMonitoredResourceDescriptorSettings,
              listMetricDescriptorsSettings,
              getMetricDescriptorSettings,
              createMetricDescriptorSettings,
              deleteMetricDescriptorSettings,
              listTimeSeriesSettings,
              createTimeSeriesSettings);
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

    /** Returns the builder for the settings used for calls to listMonitoredResourceDescriptors. */
    public PagedCallSettings.Builder<
            ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
            ListMonitoredResourceDescriptorsPagedResponse>
        listMonitoredResourceDescriptorsSettings() {
      return listMonitoredResourceDescriptorsSettings;
    }

    /** Returns the builder for the settings used for calls to getMonitoredResourceDescriptor. */
    public UnaryCallSettings.Builder<
            GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
        getMonitoredResourceDescriptorSettings() {
      return getMonitoredResourceDescriptorSettings;
    }

    /** Returns the builder for the settings used for calls to listMetricDescriptors. */
    public PagedCallSettings.Builder<
            ListMetricDescriptorsRequest, ListMetricDescriptorsResponse,
            ListMetricDescriptorsPagedResponse>
        listMetricDescriptorsSettings() {
      return listMetricDescriptorsSettings;
    }

    /** Returns the builder for the settings used for calls to getMetricDescriptor. */
    public UnaryCallSettings.Builder<GetMetricDescriptorRequest, MetricDescriptor>
        getMetricDescriptorSettings() {
      return getMetricDescriptorSettings;
    }

    /** Returns the builder for the settings used for calls to createMetricDescriptor. */
    public UnaryCallSettings.Builder<CreateMetricDescriptorRequest, MetricDescriptor>
        createMetricDescriptorSettings() {
      return createMetricDescriptorSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMetricDescriptor. */
    public UnaryCallSettings.Builder<DeleteMetricDescriptorRequest, Empty>
        deleteMetricDescriptorSettings() {
      return deleteMetricDescriptorSettings;
    }

    /** Returns the builder for the settings used for calls to listTimeSeries. */
    public PagedCallSettings.Builder<
            ListTimeSeriesRequest, ListTimeSeriesResponse, ListTimeSeriesPagedResponse>
        listTimeSeriesSettings() {
      return listTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to createTimeSeries. */
    public UnaryCallSettings.Builder<CreateTimeSeriesRequest, Empty> createTimeSeriesSettings() {
      return createTimeSeriesSettings;
    }

    @Override
    public MetricServiceSettings build() throws IOException {
      return new MetricServiceSettings(this);
    }
  }
}
