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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStub;
import com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings;
import com.google.monitoring.v3.AlertPolicy;
import com.google.monitoring.v3.AlertPolicyName;
import com.google.monitoring.v3.CreateAlertPolicyRequest;
import com.google.monitoring.v3.DeleteAlertPolicyRequest;
import com.google.monitoring.v3.GetAlertPolicyRequest;
import com.google.monitoring.v3.ListAlertPoliciesRequest;
import com.google.monitoring.v3.ListAlertPoliciesResponse;
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.UpdateAlertPolicyRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The AlertPolicyService API is used to manage (list, create, delete, edit)
 * alert policies in Stackdriver Monitoring. An alerting policy is a description of the conditions
 * under which some aspect of your system is considered to be "unhealthy" and the ways to notify
 * people or services about this state. In addition to using this API, alert policies can also be
 * managed through [Stackdriver Monitoring](https://cloud.google.com/monitoring/docs/), which can be
 * reached by clicking the "Monitoring" tab in [Cloud Console](https://console.cloud.google.com/).
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
 *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
 *   AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the alertPolicyServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of AlertPolicyServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AlertPolicyServiceSettings alertPolicyServiceSettings =
 *     AlertPolicyServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AlertPolicyServiceClient alertPolicyServiceClient =
 *     AlertPolicyServiceClient.create(alertPolicyServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AlertPolicyServiceSettings alertPolicyServiceSettings =
 *     AlertPolicyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AlertPolicyServiceClient alertPolicyServiceClient =
 *     AlertPolicyServiceClient.create(alertPolicyServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class AlertPolicyServiceClient implements BackgroundResource {
  private final AlertPolicyServiceSettings settings;
  private final AlertPolicyServiceStub stub;

  /** Constructs an instance of AlertPolicyServiceClient with default settings. */
  public static final AlertPolicyServiceClient create() throws IOException {
    return create(AlertPolicyServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AlertPolicyServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AlertPolicyServiceClient create(AlertPolicyServiceSettings settings)
      throws IOException {
    return new AlertPolicyServiceClient(settings);
  }

  /**
   * Constructs an instance of AlertPolicyServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use AlertPolicyServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AlertPolicyServiceClient create(AlertPolicyServiceStub stub) {
    return new AlertPolicyServiceClient(stub);
  }

  /**
   * Constructs an instance of AlertPolicyServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AlertPolicyServiceClient(AlertPolicyServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AlertPolicyServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AlertPolicyServiceClient(AlertPolicyServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AlertPolicyServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AlertPolicyServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing alerting policies for the project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (AlertPolicy element : alertPolicyServiceClient.listAlertPolicies(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name The project whose alert policies are to be listed. The format is
   *     <p>projects/[PROJECT_ID]
   *     <p>Note that this field names the parent container in which the alerting policies to be
   *     listed are stored. To retrieve a single alerting policy by name, use the
   *     [GetAlertPolicy][google.monitoring.v3.AlertPolicyService.GetAlertPolicy] operation,
   *     instead.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAlertPoliciesPagedResponse listAlertPolicies(ProjectName name) {
    ListAlertPoliciesRequest request =
        ListAlertPoliciesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listAlertPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing alerting policies for the project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (AlertPolicy element : alertPolicyServiceClient.listAlertPolicies(name.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name The project whose alert policies are to be listed. The format is
   *     <p>projects/[PROJECT_ID]
   *     <p>Note that this field names the parent container in which the alerting policies to be
   *     listed are stored. To retrieve a single alerting policy by name, use the
   *     [GetAlertPolicy][google.monitoring.v3.AlertPolicyService.GetAlertPolicy] operation,
   *     instead.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAlertPoliciesPagedResponse listAlertPolicies(String name) {
    ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder().setName(name).build();
    return listAlertPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing alerting policies for the project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   for (AlertPolicy element : alertPolicyServiceClient.listAlertPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAlertPoliciesPagedResponse listAlertPolicies(ListAlertPoliciesRequest request) {
    return listAlertPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing alerting policies for the project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;ListAlertPoliciesPagedResponse&gt; future = alertPolicyServiceClient.listAlertPoliciesPagedCallable().futureCall(request);
   *   // Do something
   *   for (AlertPolicy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesPagedResponse>
      listAlertPoliciesPagedCallable() {
    return stub.listAlertPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the existing alerting policies for the project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   while (true) {
   *     ListAlertPoliciesResponse response = alertPolicyServiceClient.listAlertPoliciesCallable().call(request);
   *     for (AlertPolicy element : response.getAlertPoliciesList()) {
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
  public final UnaryCallable<ListAlertPoliciesRequest, ListAlertPoliciesResponse>
      listAlertPoliciesCallable() {
    return stub.listAlertPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(name);
   * }
   * </code></pre>
   *
   * @param name The alerting policy to retrieve. The format is
   *     <p>projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy getAlertPolicy(AlertPolicyName name) {

    GetAlertPolicyRequest request =
        GetAlertPolicyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(name.toString());
   * }
   * </code></pre>
   *
   * @param name The alerting policy to retrieve. The format is
   *     <p>projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy getAlertPolicy(String name) {

    GetAlertPolicyRequest request = GetAlertPolicyRequest.newBuilder().setName(name).build();
    return getAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   GetAlertPolicyRequest request = GetAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy getAlertPolicy(GetAlertPolicyRequest request) {
    return getAlertPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   GetAlertPolicyRequest request = GetAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;AlertPolicy&gt; future = alertPolicyServiceClient.getAlertPolicyCallable().futureCall(request);
   *   // Do something
   *   AlertPolicy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAlertPolicyRequest, AlertPolicy> getAlertPolicyCallable() {
    return stub.getAlertPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   AlertPolicy response = alertPolicyServiceClient.createAlertPolicy(name, alertPolicy);
   * }
   * </code></pre>
   *
   * @param name The project in which to create the alerting policy. The format is
   *     `projects/[PROJECT_ID]`.
   *     <p>Note that this field names the parent container in which the alerting policy will be
   *     written, not the name of the created policy. The alerting policy that is returned will have
   *     a name that contains a normalized representation of this name as a prefix but adds a suffix
   *     of the form `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * @param alertPolicy The requested alerting policy. You should omit the `name` field in this
   *     policy. The name will be returned in the new policy, including a new [ALERT_POLICY_ID]
   *     value.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy createAlertPolicy(ProjectName name, AlertPolicy alertPolicy) {

    CreateAlertPolicyRequest request =
        CreateAlertPolicyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setAlertPolicy(alertPolicy)
            .build();
    return createAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   AlertPolicy response = alertPolicyServiceClient.createAlertPolicy(name.toString(), alertPolicy);
   * }
   * </code></pre>
   *
   * @param name The project in which to create the alerting policy. The format is
   *     `projects/[PROJECT_ID]`.
   *     <p>Note that this field names the parent container in which the alerting policy will be
   *     written, not the name of the created policy. The alerting policy that is returned will have
   *     a name that contains a normalized representation of this name as a prefix but adds a suffix
   *     of the form `/alertPolicies/[POLICY_ID]`, identifying the policy in the container.
   * @param alertPolicy The requested alerting policy. You should omit the `name` field in this
   *     policy. The name will be returned in the new policy, including a new [ALERT_POLICY_ID]
   *     value.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy createAlertPolicy(String name, AlertPolicy alertPolicy) {

    CreateAlertPolicyRequest request =
        CreateAlertPolicyRequest.newBuilder().setName(name).setAlertPolicy(alertPolicy).build();
    return createAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   CreateAlertPolicyRequest request = CreateAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .setAlertPolicy(alertPolicy)
   *     .build();
   *   AlertPolicy response = alertPolicyServiceClient.createAlertPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy createAlertPolicy(CreateAlertPolicyRequest request) {
    return createAlertPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   CreateAlertPolicyRequest request = CreateAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .setAlertPolicy(alertPolicy)
   *     .build();
   *   ApiFuture&lt;AlertPolicy&gt; future = alertPolicyServiceClient.createAlertPolicyCallable().futureCall(request);
   *   // Do something
   *   AlertPolicy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateAlertPolicyRequest, AlertPolicy> createAlertPolicyCallable() {
    return stub.createAlertPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   alertPolicyServiceClient.deleteAlertPolicy(name);
   * }
   * </code></pre>
   *
   * @param name The alerting policy to delete. The format is:
   *     <p>projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
   *     <p>For more information, see [AlertPolicy][google.monitoring.v3.AlertPolicy].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAlertPolicy(AlertPolicyName name) {

    DeleteAlertPolicyRequest request =
        DeleteAlertPolicyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   alertPolicyServiceClient.deleteAlertPolicy(name.toString());
   * }
   * </code></pre>
   *
   * @param name The alerting policy to delete. The format is:
   *     <p>projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
   *     <p>For more information, see [AlertPolicy][google.monitoring.v3.AlertPolicy].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAlertPolicy(String name) {

    DeleteAlertPolicyRequest request = DeleteAlertPolicyRequest.newBuilder().setName(name).build();
    deleteAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   DeleteAlertPolicyRequest request = DeleteAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   alertPolicyServiceClient.deleteAlertPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAlertPolicy(DeleteAlertPolicyRequest request) {
    deleteAlertPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicyName name = AlertPolicyName.of("[PROJECT]", "[ALERT_POLICY]");
   *   DeleteAlertPolicyRequest request = DeleteAlertPolicyRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = alertPolicyServiceClient.deleteAlertPolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteAlertPolicyRequest, Empty> deleteAlertPolicyCallable() {
    return stub.deleteAlertPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an alerting policy. You can either replace the entire policy with a new one or replace
   * only certain fields in the current alerting policy by specifying the fields to be updated via
   * `updateMask`. Returns the updated alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   AlertPolicy response = alertPolicyServiceClient.updateAlertPolicy(updateMask, alertPolicy);
   * }
   * </code></pre>
   *
   * @param updateMask Optional. A list of alerting policy field names. If this field is not empty,
   *     each listed field in the existing alerting policy is set to the value of the corresponding
   *     field in the supplied policy (`alert_policy`), or to the field's default value if the field
   *     is not in the supplied alerting policy. Fields not listed retain their previous value.
   *     <p>Examples of valid field masks include `display_name`, `documentation`,
   *     `documentation.content`, `documentation.mime_type`, `user_labels`, `user_label.nameofkey`,
   *     `enabled`, `conditions`, `combiner`, etc.
   *     <p>If this field is empty, then the supplied alerting policy replaces the existing policy.
   *     It is the same as deleting the existing policy and adding the supplied policy, except for
   *     the following:
   *     <p>+ The new policy will have the same `[ALERT_POLICY_ID]` as the former policy. This gives
   *     you continuity with the former policy in your notifications and incidents. + Conditions in
   *     the new policy will keep their former `[CONDITION_ID]` if the supplied condition includes
   *     the `name` field with that `[CONDITION_ID]`. If the supplied condition omits the `name`
   *     field, then a new `[CONDITION_ID]` is created.
   * @param alertPolicy Required. The updated alerting policy or the updated values for the fields
   *     listed in `update_mask`. If `update_mask` is not empty, any fields in this policy that are
   *     not in `update_mask` are ignored.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy updateAlertPolicy(FieldMask updateMask, AlertPolicy alertPolicy) {

    UpdateAlertPolicyRequest request =
        UpdateAlertPolicyRequest.newBuilder()
            .setUpdateMask(updateMask)
            .setAlertPolicy(alertPolicy)
            .build();
    return updateAlertPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an alerting policy. You can either replace the entire policy with a new one or replace
   * only certain fields in the current alerting policy by specifying the fields to be updated via
   * `updateMask`. Returns the updated alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   UpdateAlertPolicyRequest request = UpdateAlertPolicyRequest.newBuilder()
   *     .setAlertPolicy(alertPolicy)
   *     .build();
   *   AlertPolicy response = alertPolicyServiceClient.updateAlertPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AlertPolicy updateAlertPolicy(UpdateAlertPolicyRequest request) {
    return updateAlertPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates an alerting policy. You can either replace the entire policy with a new one or replace
   * only certain fields in the current alerting policy by specifying the fields to be updated via
   * `updateMask`. Returns the updated alerting policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
   *   AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
   *   UpdateAlertPolicyRequest request = UpdateAlertPolicyRequest.newBuilder()
   *     .setAlertPolicy(alertPolicy)
   *     .build();
   *   ApiFuture&lt;AlertPolicy&gt; future = alertPolicyServiceClient.updateAlertPolicyCallable().futureCall(request);
   *   // Do something
   *   AlertPolicy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateAlertPolicyRequest, AlertPolicy> updateAlertPolicyCallable() {
    return stub.updateAlertPolicyCallable();
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

  public static class ListAlertPoliciesPagedResponse
      extends AbstractPagedListResponse<
          ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy, ListAlertPoliciesPage,
          ListAlertPoliciesFixedSizeCollection> {

    public static ApiFuture<ListAlertPoliciesPagedResponse> createAsync(
        PageContext<ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy> context,
        ApiFuture<ListAlertPoliciesResponse> futureResponse) {
      ApiFuture<ListAlertPoliciesPage> futurePage =
          ListAlertPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAlertPoliciesPage, ListAlertPoliciesPagedResponse>() {
            @Override
            public ListAlertPoliciesPagedResponse apply(ListAlertPoliciesPage input) {
              return new ListAlertPoliciesPagedResponse(input);
            }
          });
    }

    private ListAlertPoliciesPagedResponse(ListAlertPoliciesPage page) {
      super(page, ListAlertPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAlertPoliciesPage
      extends AbstractPage<
          ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy, ListAlertPoliciesPage> {

    private ListAlertPoliciesPage(
        PageContext<ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy> context,
        ListAlertPoliciesResponse response) {
      super(context, response);
    }

    private static ListAlertPoliciesPage createEmptyPage() {
      return new ListAlertPoliciesPage(null, null);
    }

    @Override
    protected ListAlertPoliciesPage createPage(
        PageContext<ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy> context,
        ListAlertPoliciesResponse response) {
      return new ListAlertPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<ListAlertPoliciesPage> createPageAsync(
        PageContext<ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy> context,
        ApiFuture<ListAlertPoliciesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAlertPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAlertPoliciesRequest, ListAlertPoliciesResponse, AlertPolicy, ListAlertPoliciesPage,
          ListAlertPoliciesFixedSizeCollection> {

    private ListAlertPoliciesFixedSizeCollection(
        List<ListAlertPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAlertPoliciesFixedSizeCollection createEmptyCollection() {
      return new ListAlertPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAlertPoliciesFixedSizeCollection createCollection(
        List<ListAlertPoliciesPage> pages, int collectionSize) {
      return new ListAlertPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }
}
