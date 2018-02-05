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
package com.google.cloud.monitoring.v3;

import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListUptimeCheckConfigsPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListUptimeCheckIpsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStub;
import com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings;
import com.google.monitoring.v3.CreateUptimeCheckConfigRequest;
import com.google.monitoring.v3.DeleteUptimeCheckConfigRequest;
import com.google.monitoring.v3.GetUptimeCheckConfigRequest;
import com.google.monitoring.v3.ListUptimeCheckConfigsRequest;
import com.google.monitoring.v3.ListUptimeCheckConfigsResponse;
import com.google.monitoring.v3.ListUptimeCheckIpsRequest;
import com.google.monitoring.v3.ListUptimeCheckIpsResponse;
import com.google.monitoring.v3.UpdateUptimeCheckConfigRequest;
import com.google.monitoring.v3.UptimeCheckConfig;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The UptimeCheckService API is used to manage (list, create, delete, edit)
 * uptime check configurations in the Stackdriver Monitoring product. An uptime check is a piece of
 * configuration that determines which resources and services to monitor for availability. These
 * configurations can also be configured interactively by navigating to the [Cloud Console]
 * (http://console.cloud.google.com), selecting the appropriate project, clicking on "Monitoring" on
 * the left-hand side to navigate to Stackdriver, and then clicking on "Uptime".
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
 *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
 *   UptimeCheckConfig response = uptimeCheckServiceClient.getUptimeCheckConfig(formattedName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the uptimeCheckServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of UptimeCheckServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * UptimeCheckServiceSettings uptimeCheckServiceSettings =
 *     UptimeCheckServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UptimeCheckServiceClient uptimeCheckServiceClient =
 *     UptimeCheckServiceClient.create(uptimeCheckServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * UptimeCheckServiceSettings uptimeCheckServiceSettings =
 *     UptimeCheckServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UptimeCheckServiceClient uptimeCheckServiceClient =
 *     UptimeCheckServiceClient.create(uptimeCheckServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class UptimeCheckServiceClient implements BackgroundResource {
  private final UptimeCheckServiceSettings settings;
  private final UptimeCheckServiceStub stub;

  /** Constructs an instance of UptimeCheckServiceClient with default settings. */
  public static final UptimeCheckServiceClient create() throws IOException {
    return create(UptimeCheckServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UptimeCheckServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final UptimeCheckServiceClient create(UptimeCheckServiceSettings settings)
      throws IOException {
    return new UptimeCheckServiceClient(settings);
  }

  /**
   * Constructs an instance of UptimeCheckServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use UptimeCheckServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final UptimeCheckServiceClient create(UptimeCheckServiceStub stub) {
    return new UptimeCheckServiceClient(stub);
  }

  /**
   * Constructs an instance of UptimeCheckServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected UptimeCheckServiceClient(UptimeCheckServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((UptimeCheckServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected UptimeCheckServiceClient(UptimeCheckServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UptimeCheckServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public UptimeCheckServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing valid uptime check configurations for the project, leaving out any invalid
   * configurations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   for (UptimeCheckConfig element : uptimeCheckServiceClient.listUptimeCheckConfigs(formattedParent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent The project whose uptime check configurations are listed. The format is
   *     <p>`projects/[PROJECT_ID]`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListUptimeCheckConfigsPagedResponse listUptimeCheckConfigs(String parent) {
    ListUptimeCheckConfigsRequest request =
        ListUptimeCheckConfigsRequest.newBuilder().setParent(parent).build();
    return listUptimeCheckConfigs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing valid uptime check configurations for the project, leaving out any invalid
   * configurations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   ListUptimeCheckConfigsRequest request = ListUptimeCheckConfigsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   for (UptimeCheckConfig element : uptimeCheckServiceClient.listUptimeCheckConfigs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListUptimeCheckConfigsPagedResponse listUptimeCheckConfigs(
      ListUptimeCheckConfigsRequest request) {
    return listUptimeCheckConfigsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing valid uptime check configurations for the project, leaving out any invalid
   * configurations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   ListUptimeCheckConfigsRequest request = ListUptimeCheckConfigsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   ApiFuture&lt;ListUptimeCheckConfigsPagedResponse&gt; future = uptimeCheckServiceClient.listUptimeCheckConfigsPagedCallable().futureCall(request);
   *   // Do something
   *   for (UptimeCheckConfig element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListUptimeCheckConfigsRequest, ListUptimeCheckConfigsPagedResponse>
      listUptimeCheckConfigsPagedCallable() {
    return stub.listUptimeCheckConfigsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing valid uptime check configurations for the project, leaving out any invalid
   * configurations.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   ListUptimeCheckConfigsRequest request = ListUptimeCheckConfigsRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .build();
   *   while (true) {
   *     ListUptimeCheckConfigsResponse response = uptimeCheckServiceClient.listUptimeCheckConfigsCallable().call(request);
   *     for (UptimeCheckConfig element : response.getUptimeCheckConfigsList()) {
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
  public final UnaryCallable<ListUptimeCheckConfigsRequest, ListUptimeCheckConfigsResponse>
      listUptimeCheckConfigsCallable() {
    return stub.listUptimeCheckConfigsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   UptimeCheckConfig response = uptimeCheckServiceClient.getUptimeCheckConfig(formattedName);
   * }
   * </code></pre>
   *
   * @param name The uptime check configuration to retrieve. The format is
   *     <p>`projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UptimeCheckConfig getUptimeCheckConfig(String name) {

    GetUptimeCheckConfigRequest request =
        GetUptimeCheckConfigRequest.newBuilder().setName(name).build();
    return getUptimeCheckConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   GetUptimeCheckConfigRequest request = GetUptimeCheckConfigRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   UptimeCheckConfig response = uptimeCheckServiceClient.getUptimeCheckConfig(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final UptimeCheckConfig getUptimeCheckConfig(GetUptimeCheckConfigRequest request) {
    return getUptimeCheckConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   GetUptimeCheckConfigRequest request = GetUptimeCheckConfigRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;UptimeCheckConfig&gt; future = uptimeCheckServiceClient.getUptimeCheckConfigCallable().futureCall(request);
   *   // Do something
   *   UptimeCheckConfig response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetUptimeCheckConfigRequest, UptimeCheckConfig>
      getUptimeCheckConfigCallable() {
    return stub.getUptimeCheckConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   UptimeCheckConfig response = uptimeCheckServiceClient.createUptimeCheckConfig(formattedParent, uptimeCheckConfig);
   * }
   * </code></pre>
   *
   * @param parent The project in which to create the uptime check. The format is:
   *     <p>`projects/[PROJECT_ID]`.
   * @param uptimeCheckConfig The new uptime check configuration.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UptimeCheckConfig createUptimeCheckConfig(
      String parent, UptimeCheckConfig uptimeCheckConfig) {

    CreateUptimeCheckConfigRequest request =
        CreateUptimeCheckConfigRequest.newBuilder()
            .setParent(parent)
            .setUptimeCheckConfig(uptimeCheckConfig)
            .build();
    return createUptimeCheckConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   CreateUptimeCheckConfigRequest request = CreateUptimeCheckConfigRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .setUptimeCheckConfig(uptimeCheckConfig)
   *     .build();
   *   UptimeCheckConfig response = uptimeCheckServiceClient.createUptimeCheckConfig(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UptimeCheckConfig createUptimeCheckConfig(CreateUptimeCheckConfigRequest request) {
    return createUptimeCheckConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new uptime check configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedParent = ProjectName.format("[PROJECT]");
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   CreateUptimeCheckConfigRequest request = CreateUptimeCheckConfigRequest.newBuilder()
   *     .setParent(formattedParent)
   *     .setUptimeCheckConfig(uptimeCheckConfig)
   *     .build();
   *   ApiFuture&lt;UptimeCheckConfig&gt; future = uptimeCheckServiceClient.createUptimeCheckConfigCallable().futureCall(request);
   *   // Do something
   *   UptimeCheckConfig response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateUptimeCheckConfigRequest, UptimeCheckConfig>
      createUptimeCheckConfigCallable() {
    return stub.createUptimeCheckConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an uptime check configuration. You can either replace the entire configuration with a
   * new one or replace only certain fields in the current configuration by specifying the fields to
   * be updated via `"updateMask"`. Returns the updated configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   UptimeCheckConfig response = uptimeCheckServiceClient.updateUptimeCheckConfig(uptimeCheckConfig);
   * }
   * </code></pre>
   *
   * @param uptimeCheckConfig Required. If an `"updateMask"` has been specified, this field gives
   *     the values for the set of fields mentioned in the `"updateMask"`. If an `"updateMask"` has
   *     not been given, this uptime check configuration replaces the current configuration. If a
   *     field is mentioned in `"updateMask`" but the corresonding field is omitted in this partial
   *     uptime check configuration, it has the effect of deleting/clearing the field from the
   *     configuration on the server.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UptimeCheckConfig updateUptimeCheckConfig(UptimeCheckConfig uptimeCheckConfig) {

    UpdateUptimeCheckConfigRequest request =
        UpdateUptimeCheckConfigRequest.newBuilder().setUptimeCheckConfig(uptimeCheckConfig).build();
    return updateUptimeCheckConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an uptime check configuration. You can either replace the entire configuration with a
   * new one or replace only certain fields in the current configuration by specifying the fields to
   * be updated via `"updateMask"`. Returns the updated configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   UpdateUptimeCheckConfigRequest request = UpdateUptimeCheckConfigRequest.newBuilder()
   *     .setUptimeCheckConfig(uptimeCheckConfig)
   *     .build();
   *   UptimeCheckConfig response = uptimeCheckServiceClient.updateUptimeCheckConfig(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UptimeCheckConfig updateUptimeCheckConfig(UpdateUptimeCheckConfigRequest request) {
    return updateUptimeCheckConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an uptime check configuration. You can either replace the entire configuration with a
   * new one or replace only certain fields in the current configuration by specifying the fields to
   * be updated via `"updateMask"`. Returns the updated configuration.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   UptimeCheckConfig uptimeCheckConfig = UptimeCheckConfig.newBuilder().build();
   *   UpdateUptimeCheckConfigRequest request = UpdateUptimeCheckConfigRequest.newBuilder()
   *     .setUptimeCheckConfig(uptimeCheckConfig)
   *     .build();
   *   ApiFuture&lt;UptimeCheckConfig&gt; future = uptimeCheckServiceClient.updateUptimeCheckConfigCallable().futureCall(request);
   *   // Do something
   *   UptimeCheckConfig response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateUptimeCheckConfigRequest, UptimeCheckConfig>
      updateUptimeCheckConfigCallable() {
    return stub.updateUptimeCheckConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an uptime check configuration. Note that this method will fail if the uptime check
   * configuration is referenced by an alert policy or other dependent configs that would be
   * rendered invalid by the deletion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   uptimeCheckServiceClient.deleteUptimeCheckConfig(formattedName);
   * }
   * </code></pre>
   *
   * @param name The uptime check configuration to delete. The format is
   *     <p>`projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteUptimeCheckConfig(String name) {

    DeleteUptimeCheckConfigRequest request =
        DeleteUptimeCheckConfigRequest.newBuilder().setName(name).build();
    deleteUptimeCheckConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an uptime check configuration. Note that this method will fail if the uptime check
   * configuration is referenced by an alert policy or other dependent configs that would be
   * rendered invalid by the deletion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   DeleteUptimeCheckConfigRequest request = DeleteUptimeCheckConfigRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   uptimeCheckServiceClient.deleteUptimeCheckConfig(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteUptimeCheckConfig(DeleteUptimeCheckConfigRequest request) {
    deleteUptimeCheckConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an uptime check configuration. Note that this method will fail if the uptime check
   * configuration is referenced by an alert policy or other dependent configs that would be
   * rendered invalid by the deletion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   String formattedName = UptimeCheckConfigName.format("[PROJECT]", "[UPTIME_CHECK_CONFIG]");
   *   DeleteUptimeCheckConfigRequest request = DeleteUptimeCheckConfigRequest.newBuilder()
   *     .setName(formattedName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = uptimeCheckServiceClient.deleteUptimeCheckConfigCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteUptimeCheckConfigRequest, Empty>
      deleteUptimeCheckConfigCallable() {
    return stub.deleteUptimeCheckConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of IPs that checkers run from
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
   *   for (UptimeCheckIp element : uptimeCheckServiceClient.listUptimeCheckIps(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListUptimeCheckIpsPagedResponse listUptimeCheckIps(
      ListUptimeCheckIpsRequest request) {
    return listUptimeCheckIpsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of IPs that checkers run from
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
   *   ApiFuture&lt;ListUptimeCheckIpsPagedResponse&gt; future = uptimeCheckServiceClient.listUptimeCheckIpsPagedCallable().futureCall(request);
   *   // Do something
   *   for (UptimeCheckIp element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListUptimeCheckIpsRequest, ListUptimeCheckIpsPagedResponse>
      listUptimeCheckIpsPagedCallable() {
    return stub.listUptimeCheckIpsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the list of IPs that checkers run from
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (UptimeCheckServiceClient uptimeCheckServiceClient = UptimeCheckServiceClient.create()) {
   *   ListUptimeCheckIpsRequest request = ListUptimeCheckIpsRequest.newBuilder().build();
   *   while (true) {
   *     ListUptimeCheckIpsResponse response = uptimeCheckServiceClient.listUptimeCheckIpsCallable().call(request);
   *     for (UptimeCheckIp element : response.getUptimeCheckIpsList()) {
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
  public final UnaryCallable<ListUptimeCheckIpsRequest, ListUptimeCheckIpsResponse>
      listUptimeCheckIpsCallable() {
    return stub.listUptimeCheckIpsCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
