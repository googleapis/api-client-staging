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
package com.google.cloud.spanner.admin.instance.spi.v1;

import static com.google.cloud.spanner.admin.instance.spi.v1.PagedResponseWrappers.ListInstanceConfigsPagedResponse;
import static com.google.cloud.spanner.admin.instance.spi.v1.PagedResponseWrappers.ListInstancesPagedResponse;

import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.ChannelProvider;
import com.google.api.gax.grpc.ClientSettings;
import com.google.api.gax.grpc.ExecutorProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.grpc.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.OperationCallSettings;
import com.google.api.gax.grpc.PageContext;
import com.google.api.gax.grpc.PagedCallSettings;
import com.google.api.gax.grpc.PagedListDescriptor;
import com.google.api.gax.grpc.PagedListResponseFactory;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.UnaryCallSettings;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.api.gax.retrying.RetrySettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.spanner.admin.instance.v1.CreateInstanceRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceRequest;
import com.google.spanner.admin.instance.v1.GetInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.GetInstanceRequest;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import com.google.spanner.admin.instance.v1.UpdateInstanceRequest;
import io.grpc.Status;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceAdminClient}.
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
 * example, to set the total timeout of getInstanceConfig to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceAdminSettings.Builder instanceAdminSettingsBuilder =
 *     InstanceAdminSettings.defaultBuilder();
 * instanceAdminSettingsBuilder.getInstanceConfigSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * InstanceAdminSettings instanceAdminSettings = instanceAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class InstanceAdminSettings extends ClientSettings {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/spanner.admin")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE =
      "/com/google/cloud/spanner/admin/instance/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private static final io.grpc.MethodDescriptor<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      METHOD_LIST_INSTANCE_CONFIGS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/ListInstanceConfigs",
              io.grpc.protobuf.ProtoUtils.marshaller(
                  ListInstanceConfigsRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(
                  ListInstanceConfigsResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<GetInstanceConfigRequest, InstanceConfig>
      METHOD_GET_INSTANCE_CONFIG =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/GetInstanceConfig",
              io.grpc.protobuf.ProtoUtils.marshaller(GetInstanceConfigRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(InstanceConfig.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ListInstancesRequest, ListInstancesResponse>
      METHOD_LIST_INSTANCES =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/ListInstances",
              io.grpc.protobuf.ProtoUtils.marshaller(ListInstancesRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ListInstancesResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<GetInstanceRequest, Instance> METHOD_GET_INSTANCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.admin.instance.v1.InstanceAdmin/GetInstance",
          io.grpc.protobuf.ProtoUtils.marshaller(GetInstanceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Instance.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<CreateInstanceRequest, Operation>
      METHOD_CREATE_INSTANCE =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/CreateInstance",
              io.grpc.protobuf.ProtoUtils.marshaller(CreateInstanceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<UpdateInstanceRequest, Operation>
      METHOD_UPDATE_INSTANCE =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/UpdateInstance",
              io.grpc.protobuf.ProtoUtils.marshaller(UpdateInstanceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<DeleteInstanceRequest, Empty>
      METHOD_DELETE_INSTANCE =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/DeleteInstance",
              io.grpc.protobuf.ProtoUtils.marshaller(DeleteInstanceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<SetIamPolicyRequest, Policy> METHOD_SET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.admin.instance.v1.InstanceAdmin/SetIamPolicy",
          io.grpc.protobuf.ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<GetIamPolicyRequest, Policy> METHOD_GET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.spanner.admin.instance.v1.InstanceAdmin/GetIamPolicy",
          io.grpc.protobuf.ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Policy.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<
          TestIamPermissionsRequest, TestIamPermissionsResponse>
      METHOD_TEST_IAM_PERMISSIONS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.spanner.admin.instance.v1.InstanceAdmin/TestIamPermissions",
              io.grpc.protobuf.ProtoUtils.marshaller(
                  TestIamPermissionsRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(
                  TestIamPermissionsResponse.getDefaultInstance()));

  private final PagedCallSettings<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, ListInstanceConfigsPagedResponse>
      listInstanceConfigsSettings;
  private final SimpleCallSettings<GetInstanceConfigRequest, InstanceConfig>
      getInstanceConfigSettings;
  private final PagedCallSettings<
          ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings;
  private final SimpleCallSettings<GetInstanceRequest, Instance> getInstanceSettings;
  private final OperationCallSettings<CreateInstanceRequest, Instance> createInstanceSettings;
  private final OperationCallSettings<UpdateInstanceRequest, Instance> updateInstanceSettings;
  private final SimpleCallSettings<DeleteInstanceRequest, Empty> deleteInstanceSettings;
  private final SimpleCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final SimpleCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final SimpleCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  /** Returns the object with the settings used for calls to listInstanceConfigs. */
  public PagedCallSettings<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, ListInstanceConfigsPagedResponse>
      listInstanceConfigsSettings() {
    return listInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to getInstanceConfig. */
  public SimpleCallSettings<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigSettings() {
    return getInstanceConfigSettings;
  }

  /** Returns the object with the settings used for calls to listInstances. */
  public PagedCallSettings<ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      listInstancesSettings() {
    return listInstancesSettings;
  }

  /** Returns the object with the settings used for calls to getInstance. */
  public SimpleCallSettings<GetInstanceRequest, Instance> getInstanceSettings() {
    return getInstanceSettings;
  }

  /** Returns the object with the settings used for calls to createInstance. */
  public OperationCallSettings<CreateInstanceRequest, Instance> createInstanceSettings() {
    return createInstanceSettings;
  }

  /** Returns the object with the settings used for calls to updateInstance. */
  public OperationCallSettings<UpdateInstanceRequest, Instance> updateInstanceSettings() {
    return updateInstanceSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstance. */
  public SimpleCallSettings<DeleteInstanceRequest, Empty> deleteInstanceSettings() {
    return deleteInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public SimpleCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public SimpleCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public SimpleCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
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
          PropertiesProvider.loadProperty(
              InstanceAdminSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
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

  private InstanceAdminSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder.getExecutorProvider(), settingsBuilder.getChannelProvider());

    listInstanceConfigsSettings = settingsBuilder.listInstanceConfigsSettings().build();
    getInstanceConfigSettings = settingsBuilder.getInstanceConfigSettings().build();
    listInstancesSettings = settingsBuilder.listInstancesSettings().build();
    getInstanceSettings = settingsBuilder.getInstanceSettings().build();
    createInstanceSettings = settingsBuilder.createInstanceSettings().build();
    updateInstanceSettings = settingsBuilder.updateInstanceSettings().build();
    deleteInstanceSettings = settingsBuilder.deleteInstanceSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  private static final PagedListDescriptor<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
      LIST_INSTANCE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstanceConfigsRequest injectToken(
                ListInstanceConfigsRequest payload, String token) {
              return ListInstanceConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInstanceConfigsRequest injectPageSize(
                ListInstanceConfigsRequest payload, int pageSize) {
              return ListInstanceConfigsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInstanceConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListInstanceConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceConfig> extractResources(ListInstanceConfigsResponse payload) {
              return payload.getInstanceConfigsList();
            }
          };

  private static final PagedListDescriptor<ListInstancesRequest, ListInstancesResponse, Instance>
      LIST_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<ListInstancesRequest, ListInstancesResponse, Instance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstancesRequest injectToken(ListInstancesRequest payload, String token) {
              return ListInstancesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListInstancesRequest injectPageSize(ListInstancesRequest payload, int pageSize) {
              return ListInstancesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListInstancesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Instance> extractResources(ListInstancesResponse payload) {
              return payload.getInstancesList();
            }
          };

  private static final PagedListResponseFactory<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, ListInstanceConfigsPagedResponse>
      LIST_INSTANCE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstanceConfigsRequest, ListInstanceConfigsResponse,
              ListInstanceConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListInstanceConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse> callable,
                ListInstanceConfigsRequest request,
                CallContext context,
                ApiFuture<ListInstanceConfigsResponse> futureResponse) {
              PageContext<ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_INSTANCE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListInstanceConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
      LIST_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstancesRequest, ListInstancesResponse> callable,
                ListInstancesRequest request,
                CallContext context,
                ApiFuture<ListInstancesResponse> futureResponse) {
              PageContext<ListInstancesRequest, ListInstancesResponse, Instance> pageContext =
                  PageContext.create(callable, LIST_INSTANCES_PAGE_STR_DESC, request, context);
              return ListInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for InstanceAdminSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<
            ListInstanceConfigsRequest, ListInstanceConfigsResponse,
            ListInstanceConfigsPagedResponse>
        listInstanceConfigsSettings;
    private final SimpleCallSettings.Builder<GetInstanceConfigRequest, InstanceConfig>
        getInstanceConfigSettings;
    private final PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings;
    private final SimpleCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings;
    private final OperationCallSettings.Builder<CreateInstanceRequest, Instance>
        createInstanceSettings;
    private final OperationCallSettings.Builder<UpdateInstanceRequest, Instance>
        updateInstanceSettings;
    private final SimpleCallSettings.Builder<DeleteInstanceRequest, Empty> deleteInstanceSettings;
    private final SimpleCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final SimpleCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final SimpleCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;

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

      listInstanceConfigsSettings =
          PagedCallSettings.newBuilder(
              METHOD_LIST_INSTANCE_CONFIGS, LIST_INSTANCE_CONFIGS_PAGE_STR_FACT);

      getInstanceConfigSettings = SimpleCallSettings.newBuilder(METHOD_GET_INSTANCE_CONFIG);

      listInstancesSettings =
          PagedCallSettings.newBuilder(METHOD_LIST_INSTANCES, LIST_INSTANCES_PAGE_STR_FACT);

      getInstanceSettings = SimpleCallSettings.newBuilder(METHOD_GET_INSTANCE);

      createInstanceSettings =
          OperationCallSettings.newBuilder(METHOD_CREATE_INSTANCE, Instance.class);

      updateInstanceSettings =
          OperationCallSettings.newBuilder(METHOD_UPDATE_INSTANCE, Instance.class);

      deleteInstanceSettings = SimpleCallSettings.newBuilder(METHOD_DELETE_INSTANCE);

      setIamPolicySettings = SimpleCallSettings.newBuilder(METHOD_SET_IAM_POLICY);

      getIamPolicySettings = SimpleCallSettings.newBuilder(METHOD_GET_IAM_POLICY);

      testIamPermissionsSettings = SimpleCallSettings.newBuilder(METHOD_TEST_IAM_PERMISSIONS);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              listInstanceConfigsSettings,
              getInstanceConfigSettings,
              listInstancesSettings,
              getInstanceSettings,
              deleteInstanceSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .listInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .createInstanceSettings()
          .getInitialCallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .updateInstanceSettings()
          .getInitialCallSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(InstanceAdminSettings settings) {
      super(settings);

      listInstanceConfigsSettings = settings.listInstanceConfigsSettings.toBuilder();
      getInstanceConfigSettings = settings.getInstanceConfigSettings.toBuilder();
      listInstancesSettings = settings.listInstancesSettings.toBuilder();
      getInstanceSettings = settings.getInstanceSettings.toBuilder();
      createInstanceSettings = settings.createInstanceSettings.toBuilder();
      updateInstanceSettings = settings.updateInstanceSettings.toBuilder();
      deleteInstanceSettings = settings.deleteInstanceSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              listInstanceConfigsSettings,
              getInstanceConfigSettings,
              listInstancesSettings,
              getInstanceSettings,
              deleteInstanceSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
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

    /** Returns the builder for the settings used for calls to listInstanceConfigs. */
    public PagedCallSettings.Builder<
            ListInstanceConfigsRequest, ListInstanceConfigsResponse,
            ListInstanceConfigsPagedResponse>
        listInstanceConfigsSettings() {
      return listInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to getInstanceConfig. */
    public SimpleCallSettings.Builder<GetInstanceConfigRequest, InstanceConfig>
        getInstanceConfigSettings() {
      return getInstanceConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listInstances. */
    public PagedCallSettings.Builder<
            ListInstancesRequest, ListInstancesResponse, ListInstancesPagedResponse>
        listInstancesSettings() {
      return listInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to getInstance. */
    public SimpleCallSettings.Builder<GetInstanceRequest, Instance> getInstanceSettings() {
      return getInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to createInstance. */
    public OperationCallSettings.Builder<CreateInstanceRequest, Instance> createInstanceSettings() {
      return createInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to updateInstance. */
    public OperationCallSettings.Builder<UpdateInstanceRequest, Instance> updateInstanceSettings() {
      return updateInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstance. */
    public SimpleCallSettings.Builder<DeleteInstanceRequest, Empty> deleteInstanceSettings() {
      return deleteInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public SimpleCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public SimpleCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public SimpleCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public InstanceAdminSettings build() throws IOException {
      return new InstanceAdminSettings(this);
    }
  }
}
