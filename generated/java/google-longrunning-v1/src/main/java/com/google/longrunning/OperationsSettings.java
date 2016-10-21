/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.longrunning;

import static com.google.longrunning.PagedResponseWrappers.ListOperationsPagedResponse;

import com.google.api.gax.core.ConnectionSettings;
import com.google.api.gax.core.RetrySettings;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.PageStreamingCallSettings;
import com.google.api.gax.grpc.PageStreamingDescriptor;
import com.google.api.gax.grpc.PagedListResponseFactory;
import com.google.api.gax.grpc.ServiceApiSettings;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.UnaryApiCallSettings;
import com.google.api.gax.grpc.UnaryApiCallable;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.joda.time.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/** Settings class to configure an instance of {@link OperationsApi}. */
@javax.annotation.Generated("by GAPIC")
public class OperationsSettings extends ServiceApiSettings {

  /** The default port of the service. */
  private static final int DEFAULT_SERVICE_PORT = 443;

  private final SimpleCallSettings<GetOperationRequest, Operation> getOperationSettings;
  private final PageStreamingCallSettings<
          ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
      listOperationsSettings;
  private final SimpleCallSettings<CancelOperationRequest, Empty> cancelOperationSettings;
  private final SimpleCallSettings<DeleteOperationRequest, Empty> deleteOperationSettings;

  /** Returns the object with the settings used for calls to getOperation. */
  public SimpleCallSettings<GetOperationRequest, Operation> getOperationSettings() {
    return getOperationSettings;
  }

  /** Returns the object with the settings used for calls to listOperations. */
  public PageStreamingCallSettings<
          ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
      listOperationsSettings() {
    return listOperationsSettings;
  }

  /** Returns the object with the settings used for calls to cancelOperation. */
  public SimpleCallSettings<CancelOperationRequest, Empty> cancelOperationSettings() {
    return cancelOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteOperation. */
  public SimpleCallSettings<DeleteOperationRequest, Empty> deleteOperationSettings() {
    return deleteOperationSettings;
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return DEFAULT_SERVICE_PORT;
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

  private OperationsSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getChannelProvider(),
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getGeneratorName(),
        settingsBuilder.getGeneratorVersion(),
        settingsBuilder.getClientLibName(),
        settingsBuilder.getClientLibVersion());

    getOperationSettings = settingsBuilder.getOperationSettings().build();
    listOperationsSettings = settingsBuilder.listOperationsSettings().build();
    cancelOperationSettings = settingsBuilder.cancelOperationSettings().build();
    deleteOperationSettings = settingsBuilder.deleteOperationSettings().build();
  }

  private static final PageStreamingDescriptor<
          ListOperationsRequest, ListOperationsResponse, Operation>
      LIST_OPERATIONS_PAGE_STR_DESC =
          new PageStreamingDescriptor<ListOperationsRequest, ListOperationsResponse, Operation>() {
            @Override
            public Object emptyToken() {
              return "";
            }

            @Override
            public ListOperationsRequest injectToken(ListOperationsRequest payload, Object token) {
              return ListOperationsRequest.newBuilder(payload).setPageToken((String) token).build();
            }

            @Override
            public ListOperationsRequest injectPageSize(
                ListOperationsRequest payload, int pageSize) {
              return ListOperationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListOperationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public Object extractNextToken(ListOperationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Operation> extractResources(ListOperationsResponse payload) {
              return payload.getOperationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
      LIST_OPERATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>() {
            @Override
            public ListOperationsPagedResponse createPagedListResponse(
                UnaryApiCallable<ListOperationsRequest, ListOperationsResponse> callable,
                ListOperationsRequest request,
                CallContext context) {
              return new ListOperationsPagedResponse(
                  callable, LIST_OPERATIONS_PAGE_STR_DESC, request, context);
            }
          };

  /** Builder for OperationsSettings. */
  public static class Builder extends ServiceApiSettings.Builder {
    private final ImmutableList<UnaryApiCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<GetOperationRequest, Operation> getOperationSettings;
    private final PageStreamingCallSettings.Builder<
            ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
        listOperationsSettings;
    private final SimpleCallSettings.Builder<CancelOperationRequest, Empty> cancelOperationSettings;
    private final SimpleCallSettings.Builder<DeleteOperationRequest, Empty> deleteOperationSettings;

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

      getOperationSettings = SimpleCallSettings.newBuilder(OperationsGrpc.METHOD_GET_OPERATION);

      listOperationsSettings =
          PageStreamingCallSettings.newBuilder(
              OperationsGrpc.METHOD_LIST_OPERATIONS, LIST_OPERATIONS_PAGE_STR_FACT);

      cancelOperationSettings =
          SimpleCallSettings.newBuilder(OperationsGrpc.METHOD_CANCEL_OPERATION);

      deleteOperationSettings =
          SimpleCallSettings.newBuilder(OperationsGrpc.METHOD_DELETE_OPERATION);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryApiCallSettings.Builder>of(
              getOperationSettings,
              listOperationsSettings,
              cancelOperationSettings,
              deleteOperationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .getOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .cancelOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(OperationsSettings settings) {
      super(settings);

      getOperationSettings = settings.getOperationSettings.toBuilder();
      listOperationsSettings = settings.listOperationsSettings.toBuilder();
      cancelOperationSettings = settings.cancelOperationSettings.toBuilder();
      deleteOperationSettings = settings.deleteOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryApiCallSettings.Builder>of(
              getOperationSettings,
              listOperationsSettings,
              cancelOperationSettings,
              deleteOperationSettings);
    }

    private static ConnectionSettings.Builder s_getDefaultConnectionSettingsBuilder() {
      return ConnectionSettings.newBuilder().setPort(DEFAULT_SERVICE_PORT);
    }

    @Override
    protected ConnectionSettings.Builder getDefaultConnectionSettingsBuilder() {
      return s_getDefaultConnectionSettingsBuilder();
    }

    @Override
    public Builder provideExecutorWith(ScheduledExecutorService executor, boolean shouldAutoClose) {
      super.provideExecutorWith(executor, shouldAutoClose);
      return this;
    }

    @Override
    public Builder provideChannelWith(ManagedChannel channel, boolean shouldAutoClose) {
      super.provideChannelWith(channel, shouldAutoClose);
      return this;
    }

    @Override
    public Builder provideChannelWith(ConnectionSettings settings) {
      super.provideChannelWith(settings);
      return this;
    }

    @Override
    public Builder provideChannelWith(Credentials credentials) {
      super.provideChannelWith(credentials);
      return this;
    }

    @Override
    public Builder provideChannelWith(List<String> scopes) {
      super.provideChannelWith(scopes);
      return this;
    }

    @Override
    public Builder setGeneratorHeader(String name, String version) {
      super.setGeneratorHeader(name, version);
      return this;
    }

    @Override
    public Builder setClientLibHeader(String name, String version) {
      super.setClientLibHeader(name, version);
      return this;
    }

    /**
     * Applies the given settings to all of the unary API methods in this service. Only values that
     * are non-null will be applied, so this method is not capable of un-setting any values.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllApiMethods(UnaryApiCallSettings.Builder apiCallSettings)
        throws Exception {
      super.applyToAllApiMethods(unaryMethodSettingsBuilders, apiCallSettings);
      return this;
    }

    /** Returns the builder for the settings used for calls to getOperation. */
    public SimpleCallSettings.Builder<GetOperationRequest, Operation> getOperationSettings() {
      return getOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listOperations. */
    public PageStreamingCallSettings.Builder<
            ListOperationsRequest, ListOperationsResponse, ListOperationsPagedResponse>
        listOperationsSettings() {
      return listOperationsSettings;
    }

    /** Returns the builder for the settings used for calls to cancelOperation. */
    public SimpleCallSettings.Builder<CancelOperationRequest, Empty> cancelOperationSettings() {
      return cancelOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteOperation. */
    public SimpleCallSettings.Builder<DeleteOperationRequest, Empty> deleteOperationSettings() {
      return deleteOperationSettings;
    }

    @Override
    public OperationsSettings build() throws IOException {
      return new OperationsSettings(this);
    }
  }
}
