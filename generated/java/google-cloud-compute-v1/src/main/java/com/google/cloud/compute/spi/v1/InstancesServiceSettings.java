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
package com.google.cloud.compute.spi.v1;

import static com.google.cloud.compute.spi.v1.PagedResponseWrappers.ListInstancesPagedResponse;

import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.core.RetrySettings;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.ChannelProvider;
import com.google.api.gax.grpc.ClientSettings;
import com.google.api.gax.grpc.ExecutorProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.grpc.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.PagedCallSettings;
import com.google.api.gax.grpc.PagedListDescriptor;
import com.google.api.gax.grpc.PagedListResponseFactory;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.UnaryCallSettings;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceList;
import com.google.cloud.compute.v1.InstancesDeleteRequest;
import com.google.cloud.compute.v1.InstancesGetRequest;
import com.google.cloud.compute.v1.InstancesInsertRequest;
import com.google.cloud.compute.v1.InstancesListRequest;
import com.google.cloud.compute.v1.InstancesServiceGrpc;
import com.google.cloud.compute.v1.Operation;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.protobuf.ExperimentalApi;
import io.grpc.Status;
import java.io.IOException;
import javax.annotation.Generated;
import org.joda.time.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstancesServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getInstance to 30 seconds:
 *
 * <pre>
 * <code>
 * InstancesServiceSettings.Builder instancesServiceSettingsBuilder =
 *     InstancesServiceSettings.defaultBuilder();
 * instancesServiceSettingsBuilder.getInstanceSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.standardSeconds(30));
 * InstancesServiceSettings instancesServiceSettings = instancesServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@ExperimentalApi
public class InstancesServiceSettings extends ClientSettings {
  /** The default address of the service. */
  private static final String DEFAULT_SERVICE_ADDRESS = "compute.googleapis.com";

  /** The default port of the service. */
  private static final int DEFAULT_SERVICE_PORT = 443;

  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private final PagedCallSettings<InstancesListRequest, InstanceList, ListInstancesPagedResponse>
      listInstancesSettings;
  private final SimpleCallSettings<InstancesGetRequest, Instance> getInstanceSettings;
  private final SimpleCallSettings<InstancesInsertRequest, Operation> insertInstanceSettings;
  private final SimpleCallSettings<InstancesDeleteRequest, Operation> deleteInstanceSettings;

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<InstancesListRequest, InstanceList, ListInstancesPagedResponse>
      listInstancesSettings() {
    return listInstancesSettings;
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public SimpleCallSettings<InstancesGetRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /** Returns the object with the settings used for calls to insertInstance. */
  public SimpleCallSettings<InstancesInsertRequest, Operation> insertInstanceSettings() {
    return insertInstanceSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public SimpleCallSettings<InstancesDeleteRequest, Operation> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service address. */
  public static String getDefaultServiceAddress() {
    return DEFAULT_SERVICE_ADDRESS;
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return DEFAULT_SERVICE_PORT;
  }

  /** Returns the default service scopes. */
  public static ImmutableList<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingChannelProvider.Builder defaultChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setServiceAddress(DEFAULT_SERVICE_ADDRESS)
        .setPort(DEFAULT_SERVICE_PORT)
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion())
        .setCredentialsProvider(defaultCredentialsProviderBuilder().build());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(
              InstancesServiceSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstancesServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder.getExecutorProvider(), settingsBuilder.getChannelProvider());

    listInstancesSettings = settingsBuilder.listInstancesSettings().build();
    getInstanceSettings = settingsBuilder.getInstanceSettings().build();
    insertInstanceSettings = settingsBuilder.insertInstanceSettings().build();
    deleteInstanceSettings = settingsBuilder.deleteInstanceSettings().build();
  }

  private static final PagedListDescriptor<InstancesListRequest, InstanceList, Instance>
      LIST_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<InstancesListRequest, InstanceList, Instance>() {
            @Override
            public Object emptyToken() {
              return "";
            }

            @Override
            public InstancesListRequest injectToken(InstancesListRequest payload, Object token) {
              return InstancesListRequest.newBuilder(payload).setPageToken((String) token).build();
            }

            @Override
            public InstancesListRequest injectPageSize(InstancesListRequest payload, int pageSize) {
              throw new UnsupportedOperationException(
                  "page size is not supported by this API method");
            }

            @Override
            public Integer extractPageSize(InstancesListRequest payload) {
              throw new UnsupportedOperationException(
                  "page size is not supported by this API method");
            }

            @Override
            public Object extractNextToken(InstanceList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Instance> extractResources(InstanceList payload) {
              return payload.getItemsList();
            }
          };

  private static final PagedListResponseFactory<
          InstancesListRequest, InstanceList, ListInstancesPagedResponse>
      LIST_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              InstancesListRequest, InstanceList, ListInstancesPagedResponse>() {
            @Override
            public ListInstancesPagedResponse createPagedListResponse(
                UnaryCallable<InstancesListRequest, InstanceList> callable,
                InstancesListRequest request,
                CallContext context) {
              return new ListInstancesPagedResponse(
                  callable, LIST_INSTANCES_PAGE_STR_DESC, request, context);
            }
          };

  /** Builder for InstancesServiceSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<
            InstancesListRequest, InstanceList, ListInstancesPagedResponse>
        listInstancesSettings;
    private final SimpleCallSettings.Builder<InstancesGetRequest, Instance> getInstanceSettings;
    private final SimpleCallSettings.Builder<InstancesInsertRequest, Operation>
        insertInstanceSettings;
    private final SimpleCallSettings.Builder<InstancesDeleteRequest, Operation>
        deleteInstanceSettings;

    private static final ImmutableMap<String, ImmutableSet<Status.Code>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<Status.Code>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          Sets.immutableEnumSet(
              Lists.<Status.Code>newArrayList(
                  Status.Code.DEADLINE_EXCEEDED, Status.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", Sets.immutableEnumSet(Lists.<Status.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings.Builder> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings.Builder> definitions = ImmutableMap.builder();
      RetrySettings.Builder settingsBuilder = null;
      settingsBuilder =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.millis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.millis(60000L))
              .setInitialRpcTimeout(Duration.millis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.millis(20000L))
              .setTotalTimeout(Duration.millis(600000L));
      definitions.put("default", settingsBuilder);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      super(defaultChannelProviderBuilder().build());

      listInstancesSettings =
          PagedCallSettings.newBuilder(
              InstancesServiceGrpc.METHOD_LIST_INSTANCES, LIST_INSTANCES_PAGE_STR_FACT);

      getInstanceSettings = SimpleCallSettings.newBuilder(InstancesServiceGrpc.METHOD_GET_INSTANCE);

      insertInstanceSettings =
          SimpleCallSettings.newBuilder(InstancesServiceGrpc.METHOD_INSERT_INSTANCE);

      deleteInstanceSettings =
          SimpleCallSettings.newBuilder(InstancesServiceGrpc.METHOD_DELETE_INSTANCE);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              listInstancesSettings,
              getInstanceSettings,
              insertInstanceSettings,
              deleteInstanceSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .listInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(InstancesServiceSettings settings) {
      super(settings);

      listInstancesSettings = settings.listInstancesSettings.toBuilder();
      getInstanceSettings = settings.getInstanceSettings.toBuilder();
      insertInstanceSettings = settings.insertInstanceSettings.toBuilder();
      deleteInstanceSettings = settings.deleteInstanceSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              listInstancesSettings,
              getInstanceSettings,
              insertInstanceSettings,
              deleteInstanceSettings);
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

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<InstancesListRequest, InstanceList, ListInstancesPagedResponse>
        listInstancesSettings() {
      return listInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public SimpleCallSettings.Builder<InstancesGetRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to insertInstance. */
    public SimpleCallSettings.Builder<InstancesInsertRequest, Operation> insertInstanceSettings() {
      return insertInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public SimpleCallSettings.Builder<InstancesDeleteRequest, Operation> deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    @Override
    public InstancesServiceSettings build() throws IOException {
      return new InstancesServiceSettings(this);
    }
  }
}
