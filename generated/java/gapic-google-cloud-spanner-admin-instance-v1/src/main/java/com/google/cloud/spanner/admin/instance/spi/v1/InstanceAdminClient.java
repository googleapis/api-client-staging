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

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.ChannelAndExecutor;
import com.google.api.gax.grpc.FixedChannelProvider;
import com.google.api.gax.grpc.FixedExecutorProvider;
import com.google.api.gax.grpc.OperationCallable;
import com.google.api.gax.grpc.OperationFuture;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.longrunning.OperationsSettings;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.spanner.admin.instance.v1.CreateInstanceRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceRequest;
import com.google.spanner.admin.instance.v1.GetInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.GetInstanceRequest;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.InstanceConfigName;
import com.google.spanner.admin.instance.v1.InstanceName;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import com.google.spanner.admin.instance.v1.ProjectName;
import com.google.spanner.admin.instance.v1.UpdateInstanceRequest;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Cloud Spanner Instance Admin API
 *
 * <p>The Cloud Spanner Instance Admin API can be used to create, delete, modify and list instances.
 * Instances are dedicated Cloud Spanner serving and storage resources to be used by Cloud Spanner
 * databases.
 *
 * <p>Each instance has a "configuration", which dictates where the serving resources for the Cloud
 * Spanner instance are located (e.g., US-central, Europe). Configurations are created by Google
 * based on resource availability.
 *
 * <p>Cloud Spanner billing is based on the instances that exist and their sizes. After an instance
 * exists, there are no additional per-database or per-operation charges for use of the instance
 * (though there may be additional network bandwidth charges). Instances offer isolation: problems
 * with databases in one instance will not affect other instances. However, within an instance
 * databases can affect each other. For example, if one database in an instance receives a lot of
 * requests and consumes most of the instance resources, fewer resources are available for other
 * databases in that instance, and their performance may suffer.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
 *   InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
 *   InstanceConfig response = instanceAdminClient.getInstanceConfig(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instanceAdminClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of InstanceAdminSettings to
 * create(). For example:
 *
 * <pre>
 * <code>
 * InstantiatingChannelProvider channelProvider =
 *     InstanceAdminSettings.defaultChannelProviderBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstanceAdminSettings instanceAdminSettings =
 *     InstanceAdminSettings.defaultBuilder().setChannelProvider(channelProvider).build();
 * InstanceAdminClient instanceAdminClient =
 *     InstanceAdminClient.create(instanceAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC")
@BetaApi
public class InstanceAdminClient implements AutoCloseable {
  private final InstanceAdminSettings settings;
  private final ScheduledExecutorService executor;
  private final ManagedChannel channel;
  private final OperationsClient operationsClient;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      listInstanceConfigsCallable;
  private final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsPagedResponse>
      listInstanceConfigsPagedCallable;
  private final UnaryCallable<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable;
  private final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable;
  private final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable;
  private final OperationCallable<CreateInstanceRequest, Instance> createInstanceOperationCallable;
  private final UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable;
  private final OperationCallable<UpdateInstanceRequest, Instance> updateInstanceOperationCallable;
  private final UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  /** Constructs an instance of InstanceAdminClient with default settings. */
  public static final InstanceAdminClient create() throws IOException {
    return create(InstanceAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of InstanceAdminClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final InstanceAdminClient create(InstanceAdminSettings settings)
      throws IOException {
    return new InstanceAdminClient(settings);
  }

  /**
   * Constructs an instance of InstanceAdminClient, using the given settings. This is protected so
   * that it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected InstanceAdminClient(InstanceAdminSettings settings) throws IOException {
    this.settings = settings;
    ChannelAndExecutor channelAndExecutor = settings.getChannelAndExecutor();
    this.executor = channelAndExecutor.getExecutor();
    this.channel = channelAndExecutor.getChannel();

    FixedExecutorProvider executorProvider = FixedExecutorProvider.create(this.executor);
    FixedChannelProvider channelProvider = FixedChannelProvider.create(this.channel);
    OperationsSettings operationsSettings =
        OperationsSettings.defaultBuilder()
            .setExecutorProvider(executorProvider)
            .setChannelProvider(channelProvider)
            .build();
    this.operationsClient = OperationsClient.create(operationsSettings);

    this.listInstanceConfigsCallable =
        UnaryCallable.create(settings.listInstanceConfigsSettings(), this.channel, this.executor);
    this.listInstanceConfigsPagedCallable =
        UnaryCallable.createPagedVariant(
            settings.listInstanceConfigsSettings(), this.channel, this.executor);
    this.getInstanceConfigCallable =
        UnaryCallable.create(settings.getInstanceConfigSettings(), this.channel, this.executor);
    this.listInstancesCallable =
        UnaryCallable.create(settings.listInstancesSettings(), this.channel, this.executor);
    this.listInstancesPagedCallable =
        UnaryCallable.createPagedVariant(
            settings.listInstancesSettings(), this.channel, this.executor);
    this.getInstanceCallable =
        UnaryCallable.create(settings.getInstanceSettings(), this.channel, this.executor);
    this.createInstanceCallable =
        UnaryCallable.create(
            settings.createInstanceSettings().getInitialCallSettings(),
            this.channel,
            this.executor);
    this.createInstanceOperationCallable =
        OperationCallable.create(
            settings.createInstanceSettings(), this.channel, this.executor, this.operationsClient);
    this.updateInstanceCallable =
        UnaryCallable.create(
            settings.updateInstanceSettings().getInitialCallSettings(),
            this.channel,
            this.executor);
    this.updateInstanceOperationCallable =
        OperationCallable.create(
            settings.updateInstanceSettings(), this.channel, this.executor, this.operationsClient);
    this.deleteInstanceCallable =
        UnaryCallable.create(settings.deleteInstanceSettings(), this.channel, this.executor);
    this.setIamPolicyCallable =
        UnaryCallable.create(settings.setIamPolicySettings(), this.channel, this.executor);
    this.getIamPolicyCallable =
        UnaryCallable.create(settings.getIamPolicySettings(), this.channel, this.executor);
    this.testIamPermissionsCallable =
        UnaryCallable.create(settings.testIamPermissionsSettings(), this.channel, this.executor);

    if (settings.getChannelProvider().shouldAutoClose()) {
      closeables.add(
          new Closeable() {
            @Override
            public void close() throws IOException {
              channel.shutdown();
            }
          });
    }
    if (settings.getExecutorProvider().shouldAutoClose()) {
      closeables.add(
          new Closeable() {
            @Override
            public void close() throws IOException {
              executor.shutdown();
            }
          });
    }
  }

  public final InstanceAdminSettings getSettings() {
    return settings;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the supported instance configurations for a given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   for (InstanceConfig element : instanceAdminClient.listInstanceConfigs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the project for which a list of supported instance
   *     configurations is requested. Values are of the form `projects/&lt;project&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListInstanceConfigsPagedResponse listInstanceConfigs(ProjectName parent) {
    ListInstanceConfigsRequest request =
        ListInstanceConfigsRequest.newBuilder().setParentWithProjectName(parent).build();
    return listInstanceConfigs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the supported instance configurations for a given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstanceConfigsRequest request = ListInstanceConfigsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   for (InstanceConfig element : instanceAdminClient.listInstanceConfigs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final ListInstanceConfigsPagedResponse listInstanceConfigs(
      ListInstanceConfigsRequest request) {
    return listInstanceConfigsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the supported instance configurations for a given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstanceConfigsRequest request = ListInstanceConfigsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   ApiFuture&lt;ListInstanceConfigsPagedResponse&gt; future = instanceAdminClient.listInstanceConfigsPagedCallable().futureCall(request);
   *   // Do something
   *   for (InstanceConfig element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsPagedResponse>
      listInstanceConfigsPagedCallable() {
    return listInstanceConfigsPagedCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the supported instance configurations for a given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstanceConfigsRequest request = ListInstanceConfigsRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   while (true) {
   *     ListInstanceConfigsResponse response = instanceAdminClient.listInstanceConfigsCallable().call(request);
   *     for (InstanceConfig element : response.getInstanceConfigsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListInstanceConfigsRequest, ListInstanceConfigsResponse>
      listInstanceConfigsCallable() {
    return listInstanceConfigsCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
   *   InstanceConfig response = instanceAdminClient.getInstanceConfig(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the requested instance configuration. Values are of the form
   *     `projects/&lt;project&gt;/instanceConfigs/&lt;config&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final InstanceConfig getInstanceConfig(InstanceConfigName name) {

    GetInstanceConfigRequest request =
        GetInstanceConfigRequest.newBuilder().setNameWithInstanceConfigName(name).build();
    return getInstanceConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
   *   GetInstanceConfigRequest request = GetInstanceConfigRequest.newBuilder()
   *     .setNameWithInstanceConfigName(name)
   *     .build();
   *   InstanceConfig response = instanceAdminClient.getInstanceConfig(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final InstanceConfig getInstanceConfig(GetInstanceConfigRequest request) {
    return getInstanceConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
   *   GetInstanceConfigRequest request = GetInstanceConfigRequest.newBuilder()
   *     .setNameWithInstanceConfigName(name)
   *     .build();
   *   ApiFuture&lt;InstanceConfig&gt; future = instanceAdminClient.getInstanceConfigCallable().futureCall(request);
   *   // Do something
   *   InstanceConfig response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetInstanceConfigRequest, InstanceConfig> getInstanceConfigCallable() {
    return getInstanceConfigCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all instances in the given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   for (Instance element : instanceAdminClient.listInstances(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the project for which a list of instances is requested.
   *     Values are of the form `projects/&lt;project&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(ProjectName parent) {
    ListInstancesRequest request =
        ListInstancesRequest.newBuilder().setParentWithProjectName(parent).build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all instances in the given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstancesRequest request = ListInstancesRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   for (Instance element : instanceAdminClient.listInstances(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(ListInstancesRequest request) {
    return listInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all instances in the given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstancesRequest request = ListInstancesRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   ApiFuture&lt;ListInstancesPagedResponse&gt; future = instanceAdminClient.listInstancesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Instance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all instances in the given project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   ListInstancesRequest request = ListInstancesRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .build();
   *   while (true) {
   *     ListInstancesResponse response = instanceAdminClient.listInstancesCallable().call(request);
   *     for (Instance element : response.getInstancesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    return listInstancesCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   Instance response = instanceAdminClient.getInstance(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the requested instance. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Instance getInstance(InstanceName name) {

    GetInstanceRequest request =
        GetInstanceRequest.newBuilder().setNameWithInstanceName(name).build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   GetInstanceRequest request = GetInstanceRequest.newBuilder()
   *     .setNameWithInstanceName(name)
   *     .build();
   *   Instance response = instanceAdminClient.getInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Instance getInstance(GetInstanceRequest request) {
    return getInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets information about a particular instance.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   GetInstanceRequest request = GetInstanceRequest.newBuilder()
   *     .setNameWithInstanceName(name)
   *     .build();
   *   ApiFuture&lt;Instance&gt; future = instanceAdminClient.getInstanceCallable().futureCall(request);
   *   // Do something
   *   Instance response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance and begins preparing it to begin serving. The returned [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   * instance. The instance name is assigned by the caller. If the named instance already exists,
   * `CreateInstance` returns `ALREADY_EXISTS`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; The instance is readable via the API, with all requested attributes but no allocated
   * resources. Its state is `CREATING`.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation renders the instance immediately unreadable via the API.
   * &#42; The instance can be deleted. &#42; All other attempts to modify the instance are
   * rejected.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing for all successfully-allocated resources begins (some types may have lower
   * than the requested levels). &#42; Databases can be created in the instance. &#42; The
   * instance's allocated resource levels are readable via the API. &#42; The instance's state
   * becomes `READY`.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track
   * creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   Instance instance = Instance.newBuilder().build();
   *   Instance response = instanceAdminClient.createInstanceAsync(parent, instanceId, instance).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the project in which to create the instance. Values are of
   *     the form `projects/&lt;project&gt;`.
   * @param instanceId Required. The ID of the instance to create. Valid identifiers are of the form
   *     `[a-z][-a-z0-9]&#42;[a-z0-9]` and must be between 6 and 30 characters in length.
   * @param instance Required. The instance to create. The name may be omitted, but if specified
   *     must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance> createInstanceAsync(
      ProjectName parent, InstanceName instanceId, Instance instance) {

    CreateInstanceRequest request =
        CreateInstanceRequest.newBuilder()
            .setParentWithProjectName(parent)
            .setInstanceIdWithInstanceName(instanceId)
            .setInstance(instance)
            .build();
    return createInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance and begins preparing it to begin serving. The returned [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   * instance. The instance name is assigned by the caller. If the named instance already exists,
   * `CreateInstance` returns `ALREADY_EXISTS`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; The instance is readable via the API, with all requested attributes but no allocated
   * resources. Its state is `CREATING`.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation renders the instance immediately unreadable via the API.
   * &#42; The instance can be deleted. &#42; All other attempts to modify the instance are
   * rejected.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing for all successfully-allocated resources begins (some types may have lower
   * than the requested levels). &#42; Databases can be created in the instance. &#42; The
   * instance's allocated resource levels are readable via the API. &#42; The instance's state
   * becomes `READY`.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track
   * creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   Instance instance = Instance.newBuilder().build();
   *   CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .setInstanceIdWithInstanceName(instanceId)
   *     .setInstance(instance)
   *     .build();
   *   Instance response = instanceAdminClient.createInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance> createInstanceAsync(CreateInstanceRequest request) {
    return createInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance and begins preparing it to begin serving. The returned [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   * instance. The instance name is assigned by the caller. If the named instance already exists,
   * `CreateInstance` returns `ALREADY_EXISTS`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; The instance is readable via the API, with all requested attributes but no allocated
   * resources. Its state is `CREATING`.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation renders the instance immediately unreadable via the API.
   * &#42; The instance can be deleted. &#42; All other attempts to modify the instance are
   * rejected.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing for all successfully-allocated resources begins (some types may have lower
   * than the requested levels). &#42; Databases can be created in the instance. &#42; The
   * instance's allocated resource levels are readable via the API. &#42; The instance's state
   * becomes `READY`.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track
   * creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   Instance instance = Instance.newBuilder().build();
   *   CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .setInstanceIdWithInstanceName(instanceId)
   *     .setInstance(instance)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = instanceAdminClient.createInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   Instance response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<CreateInstanceRequest, Instance>
      createInstanceOperationCallable() {
    return createInstanceOperationCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance and begins preparing it to begin serving. The returned [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   * instance. The instance name is assigned by the caller. If the named instance already exists,
   * `CreateInstance` returns `ALREADY_EXISTS`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; The instance is readable via the API, with all requested attributes but no allocated
   * resources. Its state is `CREATING`.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation renders the instance immediately unreadable via the API.
   * &#42; The instance can be deleted. &#42; All other attempts to modify the instance are
   * rejected.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing for all successfully-allocated resources begins (some types may have lower
   * than the requested levels). &#42; Databases can be created in the instance. &#42; The
   * instance's allocated resource levels are readable via the API. &#42; The instance's state
   * becomes `READY`.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track
   * creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   ProjectName parent = ProjectName.create("[PROJECT]");
   *   InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   Instance instance = Instance.newBuilder().build();
   *   CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
   *     .setParentWithProjectName(parent)
   *     .setInstanceIdWithInstanceName(instanceId)
   *     .setInstance(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.createInstanceCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    return createInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance, and begins allocating or releasing resources as requested. The returned
   * [long-running operation][google.longrunning.Operation] can be used to track the progress of
   * updating the instance. If the named instance does not exist, returns `NOT_FOUND`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; For resource types for which a decrease in the instance's allocation has been
   * requested, billing is based on the newly-requested level.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation sets its metadata's
   * [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   * restoring resources to their pre-request values. The operation is guaranteed to succeed at
   * undoing all resource changes, after which point it terminates with a `CANCELLED` status. &#42;
   * All other attempts to modify the instance are rejected. &#42; Reading the instance via the API
   * continues to give the pre-request resource levels.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing begins for all successfully-allocated resources (some types may have lower
   * than the requested levels). &#42; All newly-reserved resources are available for serving the
   * instance's tables. &#42; The instance's new resource levels are readable via the API.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track the
   * instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Authorization requires `spanner.instances.update` permission on resource
   * [name][google.spanner.admin.instance.v1.Instance.name].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   Instance instance = Instance.newBuilder().build();
   *   FieldMask fieldMask = FieldMask.newBuilder().build();
   *   Instance response = instanceAdminClient.updateInstanceAsync(instance, fieldMask).get();
   * }
   * </code></pre>
   *
   * @param instance Required. The instance to update, which must always include the instance name.
   *     Otherwise, only fields mentioned in
   *     [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
   * @param fieldMask Required. A mask specifying which fields in
   *     [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated. The
   *     field mask must always be specified; this prevents any future fields in
   *     [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients
   *     that do not know about them.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance> updateInstanceAsync(
      Instance instance, FieldMask fieldMask) {

    UpdateInstanceRequest request =
        UpdateInstanceRequest.newBuilder().setInstance(instance).setFieldMask(fieldMask).build();
    return updateInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance, and begins allocating or releasing resources as requested. The returned
   * [long-running operation][google.longrunning.Operation] can be used to track the progress of
   * updating the instance. If the named instance does not exist, returns `NOT_FOUND`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; For resource types for which a decrease in the instance's allocation has been
   * requested, billing is based on the newly-requested level.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation sets its metadata's
   * [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   * restoring resources to their pre-request values. The operation is guaranteed to succeed at
   * undoing all resource changes, after which point it terminates with a `CANCELLED` status. &#42;
   * All other attempts to modify the instance are rejected. &#42; Reading the instance via the API
   * continues to give the pre-request resource levels.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing begins for all successfully-allocated resources (some types may have lower
   * than the requested levels). &#42; All newly-reserved resources are available for serving the
   * instance's tables. &#42; The instance's new resource levels are readable via the API.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track the
   * instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Authorization requires `spanner.instances.update` permission on resource
   * [name][google.spanner.admin.instance.v1.Instance.name].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   Instance instance = Instance.newBuilder().build();
   *   FieldMask fieldMask = FieldMask.newBuilder().build();
   *   UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
   *     .setInstance(instance)
   *     .setFieldMask(fieldMask)
   *     .build();
   *   Instance response = instanceAdminClient.updateInstanceAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance> updateInstanceAsync(UpdateInstanceRequest request) {
    return updateInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance, and begins allocating or releasing resources as requested. The returned
   * [long-running operation][google.longrunning.Operation] can be used to track the progress of
   * updating the instance. If the named instance does not exist, returns `NOT_FOUND`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; For resource types for which a decrease in the instance's allocation has been
   * requested, billing is based on the newly-requested level.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation sets its metadata's
   * [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   * restoring resources to their pre-request values. The operation is guaranteed to succeed at
   * undoing all resource changes, after which point it terminates with a `CANCELLED` status. &#42;
   * All other attempts to modify the instance are rejected. &#42; Reading the instance via the API
   * continues to give the pre-request resource levels.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing begins for all successfully-allocated resources (some types may have lower
   * than the requested levels). &#42; All newly-reserved resources are available for serving the
   * instance's tables. &#42; The instance's new resource levels are readable via the API.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track the
   * instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Authorization requires `spanner.instances.update` permission on resource
   * [name][google.spanner.admin.instance.v1.Instance.name].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   Instance instance = Instance.newBuilder().build();
   *   FieldMask fieldMask = FieldMask.newBuilder().build();
   *   UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
   *     .setInstance(instance)
   *     .setFieldMask(fieldMask)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = instanceAdminClient.updateInstanceOperationCallable().futureCall(request);
   *   // Do something
   *   Instance response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<UpdateInstanceRequest, Instance>
      updateInstanceOperationCallable() {
    return updateInstanceOperationCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an instance, and begins allocating or releasing resources as requested. The returned
   * [long-running operation][google.longrunning.Operation] can be used to track the progress of
   * updating the instance. If the named instance does not exist, returns `NOT_FOUND`.
   *
   * <p>Immediately upon completion of this request:
   *
   * <p>&#42; For resource types for which a decrease in the instance's allocation has been
   * requested, billing is based on the newly-requested level.
   *
   * <p>Until completion of the returned operation:
   *
   * <p>&#42; Cancelling the operation sets its metadata's
   * [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   * restoring resources to their pre-request values. The operation is guaranteed to succeed at
   * undoing all resource changes, after which point it terminates with a `CANCELLED` status. &#42;
   * All other attempts to modify the instance are rejected. &#42; Reading the instance via the API
   * continues to give the pre-request resource levels.
   *
   * <p>Upon completion of the returned operation:
   *
   * <p>&#42; Billing begins for all successfully-allocated resources (some types may have lower
   * than the requested levels). &#42; All newly-reserved resources are available for serving the
   * instance's tables. &#42; The instance's new resource levels are readable via the API.
   *
   * <p>The returned [long-running operation][google.longrunning.Operation] will have a name of the
   * format `&lt;instance_name&gt;/operations/&lt;operation_id&gt;` and can be used to track the
   * instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   * [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Instance][google.spanner.admin.instance.v1.Instance], if successful.
   *
   * <p>Authorization requires `spanner.instances.update` permission on resource
   * [name][google.spanner.admin.instance.v1.Instance.name].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   Instance instance = Instance.newBuilder().build();
   *   FieldMask fieldMask = FieldMask.newBuilder().build();
   *   UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
   *     .setInstance(instance)
   *     .setFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instanceAdminClient.updateInstanceCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable() {
    return updateInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an instance.
   *
   * <p>Immediately upon completion of the request:
   *
   * <p>&#42; Billing ceases for all of the instance's reserved resources.
   *
   * <p>Soon afterward:
   *
   * <p>&#42; The instance and &#42;all of its databases&#42; immediately and irrevocably disappear
   * from the API. All data in the databases is permanently deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   instanceAdminClient.deleteInstance(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the instance to be deleted. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;`
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void deleteInstance(InstanceName name) {

    DeleteInstanceRequest request =
        DeleteInstanceRequest.newBuilder().setNameWithInstanceName(name).build();
    deleteInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an instance.
   *
   * <p>Immediately upon completion of the request:
   *
   * <p>&#42; Billing ceases for all of the instance's reserved resources.
   *
   * <p>Soon afterward:
   *
   * <p>&#42; The instance and &#42;all of its databases&#42; immediately and irrevocably disappear
   * from the API. All data in the databases is permanently deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder()
   *     .setNameWithInstanceName(name)
   *     .build();
   *   instanceAdminClient.deleteInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final void deleteInstance(DeleteInstanceRequest request) {
    deleteInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an instance.
   *
   * <p>Immediately upon completion of the request:
   *
   * <p>&#42; Billing ceases for all of the instance's reserved resources.
   *
   * <p>Soon afterward:
   *
   * <p>&#42; The instance and &#42;all of its databases&#42; immediately and irrevocably disappear
   * from the API. All data in the databases is permanently deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder()
   *     .setNameWithInstanceName(name)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = instanceAdminClient.deleteInstanceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable() {
    return deleteInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on an instance resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.instances.setIamPolicy` on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = instanceAdminClient.setIamPolicy(formattedResource, policy);
   * }
   * </code></pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. `resource` is
   *     usually specified as a path. For example, a Project resource is specified as
   *     `projects/{project}`.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(String resource, Policy policy) {

    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder().setResource(resource).setPolicy(policy).build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on an instance resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.instances.setIamPolicy` on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .setPolicy(policy)
   *     .build();
   *   Policy response = instanceAdminClient.setIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on an instance resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.instances.setIamPolicy` on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .setPolicy(policy)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = instanceAdminClient.setIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for an instance resource. Returns an empty policy if an instance
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.instances.getIamPolicy` on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   Policy response = instanceAdminClient.getIamPolicy(formattedResource);
   * }
   * </code></pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. `resource` is
   *     usually specified as a path. For example, a Project resource is specified as
   *     `projects/{project}`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String resource) {

    GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().setResource(resource).build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for an instance resource. Returns an empty policy if an instance
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.instances.getIamPolicy` on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .build();
   *   Policy response = instanceAdminClient.getIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for an instance resource. Returns an empty policy if an instance
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.instances.getIamPolicy` on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = instanceAdminClient.getIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that the caller has on the specified instance resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a
   * NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google
   * Cloud Project. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsResponse response = instanceAdminClient.testIamPermissions(formattedResource, permissions);
   * }
   * </code></pre>
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested.
   *     `resource` is usually specified as a path. For example, a Project resource is specified as
   *     `projects/{project}`.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      String resource, List<String> permissions) {

    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource)
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that the caller has on the specified instance resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a
   * NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google
   * Cloud Project. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .addAllPermissions(permissions)
   *     .build();
   *   TestIamPermissionsResponse response = instanceAdminClient.testIamPermissions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that the caller has on the specified instance resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a
   * NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google
   * Cloud Project. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
   *   String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .addAllPermissions(permissions)
   *     .build();
   *   ApiFuture&lt;TestIamPermissionsResponse&gt; future = instanceAdminClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something
   *   TestIamPermissionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  /**
   * Initiates an orderly shutdown in which preexisting calls continue but new calls are immediately
   * cancelled.
   */
  @Override
  public final void close() throws Exception {
    for (AutoCloseable closeable : closeables) {
      closeable.close();
    }
  }
}
