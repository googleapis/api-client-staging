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
package com.google.cloud.logging.v2;

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListExclusionsPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListSinksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.logging.v2.stub.ConfigServiceV2Stub;
import com.google.logging.v2.CreateExclusionRequest;
import com.google.logging.v2.CreateSinkRequest;
import com.google.logging.v2.DeleteExclusionRequest;
import com.google.logging.v2.DeleteSinkRequest;
import com.google.logging.v2.ExclusionNameOneof;
import com.google.logging.v2.GetExclusionRequest;
import com.google.logging.v2.GetSinkRequest;
import com.google.logging.v2.ListExclusionsRequest;
import com.google.logging.v2.ListExclusionsResponse;
import com.google.logging.v2.ListSinksRequest;
import com.google.logging.v2.ListSinksResponse;
import com.google.logging.v2.LogExclusion;
import com.google.logging.v2.LogSink;
import com.google.logging.v2.ParentNameOneof;
import com.google.logging.v2.SinkNameOneof;
import com.google.logging.v2.UpdateExclusionRequest;
import com.google.logging.v2.UpdateSinkRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service for configuring sinks used to export log entries outside of
 * Stackdriver Logging.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ConfigClient configClient = ConfigClient.create()) {
 *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
 *   LogSink response = configClient.getSink(sinkName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the configClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of ConfigSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ConfigSettings configSettings =
 *     ConfigSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ConfigClient configClient =
 *     ConfigClient.create(configSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ConfigSettings configSettings =
 *     ConfigSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ConfigClient configClient =
 *     ConfigClient.create(configSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class ConfigClient implements BackgroundResource {
  private final ConfigSettings settings;
  private final ConfigServiceV2Stub stub;

  /** Constructs an instance of ConfigClient with default settings. */
  public static final ConfigClient create() throws IOException {
    return create(ConfigSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ConfigClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ConfigClient create(ConfigSettings settings) throws IOException {
    return new ConfigClient(settings);
  }

  /**
   * Constructs an instance of ConfigClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ConfigSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ConfigClient create(ConfigServiceV2Stub stub) {
    return new ConfigClient(stub);
  }

  /**
   * Constructs an instance of ConfigClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected ConfigClient(ConfigSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ConfigClient(ConfigServiceV2Stub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ConfigSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ConfigServiceV2Stub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists sinks.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   for (LogSink element : configClient.listSinks(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The parent resource whose sinks are to be listed:
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSinksPagedResponse listSinks(ParentNameOneof parent) {
    ListSinksRequest request =
        ListSinksRequest.newBuilder().setParentWithParentNameOneof(parent).build();
    return listSinks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists sinks.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListSinksRequest request = ListSinksRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   for (LogSink element : configClient.listSinks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSinksPagedResponse listSinks(ListSinksRequest request) {
    return listSinksPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists sinks.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListSinksRequest request = ListSinksRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   ApiFuture&lt;ListSinksPagedResponse&gt; future = configClient.listSinksPagedCallable().futureCall(request);
   *   // Do something
   *   for (LogSink element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSinksRequest, ListSinksPagedResponse> listSinksPagedCallable() {
    return stub.listSinksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists sinks.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListSinksRequest request = ListSinksRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   while (true) {
   *     ListSinksResponse response = configClient.listSinksCallable().call(request);
   *     for (LogSink element : response.getSinksList()) {
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
  public final UnaryCallable<ListSinksRequest, ListSinksResponse> listSinksCallable() {
    return stub.listSinksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   LogSink response = configClient.getSink(sinkName);
   * }
   * </code></pre>
   *
   * @param sinkName Required. The resource name of the sink:
   *     <p>"projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *     <p>Example: `"projects/my-project-id/sinks/my-sink-id"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogSink getSink(SinkNameOneof sinkName) {

    GetSinkRequest request =
        GetSinkRequest.newBuilder().setSinkNameWithSinkNameOneof(sinkName).build();
    return getSink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   GetSinkRequest request = GetSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .build();
   *   LogSink response = configClient.getSink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final LogSink getSink(GetSinkRequest request) {
    return getSinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   GetSinkRequest request = GetSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .build();
   *   ApiFuture&lt;LogSink&gt; future = configClient.getSinkCallable().futureCall(request);
   *   // Do something
   *   LogSink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSinkRequest, LogSink> getSinkCallable() {
    return stub.getSinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a sink that exports specified log entries to a destination. The export of
   * newly-ingested log entries begins immediately, unless the sink's `writer_identity` is not
   * permitted to write to the destination. A sink can export log entries only from the resource
   * owning the sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   LogSink response = configClient.createSink(parent, sink);
   * }
   * </code></pre>
   *
   * @param parent Required. The resource in which to create the sink:
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   *     <p>Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * @param sink Required. The new sink, whose `name` parameter is a sink identifier that is not
   *     already in use.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogSink createSink(ParentNameOneof parent, LogSink sink) {

    CreateSinkRequest request =
        CreateSinkRequest.newBuilder().setParentWithParentNameOneof(parent).setSink(sink).build();
    return createSink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a sink that exports specified log entries to a destination. The export of
   * newly-ingested log entries begins immediately, unless the sink's `writer_identity` is not
   * permitted to write to the destination. A sink can export log entries only from the resource
   * owning the sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   CreateSinkRequest request = CreateSinkRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setSink(sink)
   *     .build();
   *   LogSink response = configClient.createSink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogSink createSink(CreateSinkRequest request) {
    return createSinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a sink that exports specified log entries to a destination. The export of
   * newly-ingested log entries begins immediately, unless the sink's `writer_identity` is not
   * permitted to write to the destination. A sink can export log entries only from the resource
   * owning the sink.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   CreateSinkRequest request = CreateSinkRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setSink(sink)
   *     .build();
   *   ApiFuture&lt;LogSink&gt; future = configClient.createSinkCallable().futureCall(request);
   *   // Do something
   *   LogSink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSinkRequest, LogSink> createSinkCallable() {
    return stub.createSinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a sink. This method replaces the following fields in the existing sink with values from
   * the new sink: `destination`, and `filter`. The updated sink might also have a new
   * `writer_identity`; see the `unique_writer_identity` field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   LogSink response = configClient.updateSink(sinkName, sink);
   * }
   * </code></pre>
   *
   * @param sinkName Required. The full resource name of the sink to update, including the parent
   *     resource and the sink identifier:
   *     <p>"projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *     <p>Example: `"projects/my-project-id/sinks/my-sink-id"`.
   * @param sink Required. The updated sink, whose name is the same identifier that appears as part
   *     of `sink_name`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogSink updateSink(SinkNameOneof sinkName, LogSink sink) {

    UpdateSinkRequest request =
        UpdateSinkRequest.newBuilder().setSinkNameWithSinkNameOneof(sinkName).setSink(sink).build();
    return updateSink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a sink. This method replaces the following fields in the existing sink with values from
   * the new sink: `destination`, and `filter`. The updated sink might also have a new
   * `writer_identity`; see the `unique_writer_identity` field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   UpdateSinkRequest request = UpdateSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .setSink(sink)
   *     .build();
   *   LogSink response = configClient.updateSink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogSink updateSink(UpdateSinkRequest request) {
    return updateSinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a sink. This method replaces the following fields in the existing sink with values from
   * the new sink: `destination`, and `filter`. The updated sink might also have a new
   * `writer_identity`; see the `unique_writer_identity` field.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   LogSink sink = LogSink.newBuilder().build();
   *   UpdateSinkRequest request = UpdateSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .setSink(sink)
   *     .build();
   *   ApiFuture&lt;LogSink&gt; future = configClient.updateSinkCallable().futureCall(request);
   *   // Do something
   *   LogSink response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateSinkRequest, LogSink> updateSinkCallable() {
    return stub.updateSinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a sink. If the sink has a unique `writer_identity`, then that service account is also
   * deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   configClient.deleteSink(sinkName);
   * }
   * </code></pre>
   *
   * @param sinkName Required. The full resource name of the sink to delete, including the parent
   *     resource and the sink identifier:
   *     <p>"projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *     <p>Example: `"projects/my-project-id/sinks/my-sink-id"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSink(SinkNameOneof sinkName) {

    DeleteSinkRequest request =
        DeleteSinkRequest.newBuilder().setSinkNameWithSinkNameOneof(sinkName).build();
    deleteSink(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a sink. If the sink has a unique `writer_identity`, then that service account is also
   * deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   DeleteSinkRequest request = DeleteSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .build();
   *   configClient.deleteSink(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteSink(DeleteSinkRequest request) {
    deleteSinkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a sink. If the sink has a unique `writer_identity`, then that service account is also
   * deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   SinkNameOneof sinkName = SinkNameOneof.from(SinkName.of("[PROJECT]", "[SINK]"));
   *   DeleteSinkRequest request = DeleteSinkRequest.newBuilder()
   *     .setSinkNameWithSinkNameOneof(sinkName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = configClient.deleteSinkCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteSinkRequest, Empty> deleteSinkCallable() {
    return stub.deleteSinkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the exclusions in a parent resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   for (LogExclusion element : configClient.listExclusions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The parent resource whose exclusions are to be listed.
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListExclusionsPagedResponse listExclusions(ParentNameOneof parent) {
    ListExclusionsRequest request =
        ListExclusionsRequest.newBuilder().setParentWithParentNameOneof(parent).build();
    return listExclusions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the exclusions in a parent resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListExclusionsRequest request = ListExclusionsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   for (LogExclusion element : configClient.listExclusions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListExclusionsPagedResponse listExclusions(ListExclusionsRequest request) {
    return listExclusionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the exclusions in a parent resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListExclusionsRequest request = ListExclusionsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   ApiFuture&lt;ListExclusionsPagedResponse&gt; future = configClient.listExclusionsPagedCallable().futureCall(request);
   *   // Do something
   *   for (LogExclusion element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListExclusionsRequest, ListExclusionsPagedResponse>
      listExclusionsPagedCallable() {
    return stub.listExclusionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the exclusions in a parent resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListExclusionsRequest request = ListExclusionsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   while (true) {
   *     ListExclusionsResponse response = configClient.listExclusionsCallable().call(request);
   *     for (LogExclusion element : response.getExclusionsList()) {
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
  public final UnaryCallable<ListExclusionsRequest, ListExclusionsResponse>
      listExclusionsCallable() {
    return stub.listExclusionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the description of an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   LogExclusion response = configClient.getExclusion(name);
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of an existing exclusion:
   *     <p>"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   *     <p>Example: `"projects/my-project-id/exclusions/my-exclusion-id"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogExclusion getExclusion(ExclusionNameOneof name) {

    GetExclusionRequest request =
        GetExclusionRequest.newBuilder().setNameWithExclusionNameOneof(name).build();
    return getExclusion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the description of an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   GetExclusionRequest request = GetExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .build();
   *   LogExclusion response = configClient.getExclusion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final LogExclusion getExclusion(GetExclusionRequest request) {
    return getExclusionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the description of an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   GetExclusionRequest request = GetExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .build();
   *   ApiFuture&lt;LogExclusion&gt; future = configClient.getExclusionCallable().futureCall(request);
   *   // Do something
   *   LogExclusion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetExclusionRequest, LogExclusion> getExclusionCallable() {
    return stub.getExclusionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new exclusion in a specified parent resource. Only log entries belonging to that
   * resource can be excluded. You can have up to 10 exclusions in a resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   LogExclusion response = configClient.createExclusion(parent, exclusion);
   * }
   * </code></pre>
   *
   * @param parent Required. The parent resource in which to create the exclusion:
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   *     <p>Examples: `"projects/my-logging-project"`, `"organizations/123456789"`.
   * @param exclusion Required. The new exclusion, whose `name` parameter is an exclusion name that
   *     is not already used in the parent resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogExclusion createExclusion(ParentNameOneof parent, LogExclusion exclusion) {

    CreateExclusionRequest request =
        CreateExclusionRequest.newBuilder()
            .setParentWithParentNameOneof(parent)
            .setExclusion(exclusion)
            .build();
    return createExclusion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new exclusion in a specified parent resource. Only log entries belonging to that
   * resource can be excluded. You can have up to 10 exclusions in a resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   CreateExclusionRequest request = CreateExclusionRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setExclusion(exclusion)
   *     .build();
   *   LogExclusion response = configClient.createExclusion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogExclusion createExclusion(CreateExclusionRequest request) {
    return createExclusionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new exclusion in a specified parent resource. Only log entries belonging to that
   * resource can be excluded. You can have up to 10 exclusions in a resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   CreateExclusionRequest request = CreateExclusionRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setExclusion(exclusion)
   *     .build();
   *   ApiFuture&lt;LogExclusion&gt; future = configClient.createExclusionCallable().futureCall(request);
   *   // Do something
   *   LogExclusion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateExclusionRequest, LogExclusion> createExclusionCallable() {
    return stub.createExclusionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes one or more properties of an existing exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   LogExclusion response = configClient.updateExclusion(name, exclusion, updateMask);
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of the exclusion to update:
   *     <p>"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   *     <p>Example: `"projects/my-project-id/exclusions/my-exclusion-id"`.
   * @param exclusion Required. New values for the existing exclusion. Only the fields specified in
   *     `update_mask` are relevant.
   * @param updateMask Required. A nonempty list of fields to change in the existing exclusion. New
   *     values for the fields are taken from the corresponding fields in the
   *     [LogExclusion][google.logging.v2.LogExclusion] included in this request. Fields not
   *     mentioned in `update_mask` are not changed and are ignored in the request.
   *     <p>For example, to change the filter and description of an exclusion, specify an
   *     `update_mask` of `"filter,description"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogExclusion updateExclusion(
      ExclusionNameOneof name, LogExclusion exclusion, FieldMask updateMask) {

    UpdateExclusionRequest request =
        UpdateExclusionRequest.newBuilder()
            .setNameWithExclusionNameOneof(name)
            .setExclusion(exclusion)
            .setUpdateMask(updateMask)
            .build();
    return updateExclusion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes one or more properties of an existing exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateExclusionRequest request = UpdateExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .setExclusion(exclusion)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   LogExclusion response = configClient.updateExclusion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogExclusion updateExclusion(UpdateExclusionRequest request) {
    return updateExclusionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes one or more properties of an existing exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   LogExclusion exclusion = LogExclusion.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateExclusionRequest request = UpdateExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .setExclusion(exclusion)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;LogExclusion&gt; future = configClient.updateExclusionCallable().futureCall(request);
   *   // Do something
   *   LogExclusion response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateExclusionRequest, LogExclusion> updateExclusionCallable() {
    return stub.updateExclusionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   configClient.deleteExclusion(name);
   * }
   * </code></pre>
   *
   * @param name Required. The resource name of an existing exclusion to delete:
   *     <p>"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
   *     "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
   *     "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
   *     <p>Example: `"projects/my-project-id/exclusions/my-exclusion-id"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteExclusion(ExclusionNameOneof name) {

    DeleteExclusionRequest request =
        DeleteExclusionRequest.newBuilder().setNameWithExclusionNameOneof(name).build();
    deleteExclusion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   DeleteExclusionRequest request = DeleteExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .build();
   *   configClient.deleteExclusion(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteExclusion(DeleteExclusionRequest request) {
    deleteExclusionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes an exclusion.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ConfigClient configClient = ConfigClient.create()) {
   *   ExclusionNameOneof name = ExclusionNameOneof.from(ExclusionName.of("[PROJECT]", "[EXCLUSION]"));
   *   DeleteExclusionRequest request = DeleteExclusionRequest.newBuilder()
   *     .setNameWithExclusionNameOneof(name)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = configClient.deleteExclusionCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteExclusionRequest, Empty> deleteExclusionCallable() {
    return stub.deleteExclusionCallable();
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
