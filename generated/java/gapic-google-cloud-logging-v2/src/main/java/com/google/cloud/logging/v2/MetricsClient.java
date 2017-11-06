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

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogMetricsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.logging.v2.stub.MetricsServiceV2Stub;
import com.google.logging.v2.CreateLogMetricRequest;
import com.google.logging.v2.DeleteLogMetricRequest;
import com.google.logging.v2.GetLogMetricRequest;
import com.google.logging.v2.ListLogMetricsRequest;
import com.google.logging.v2.ListLogMetricsResponse;
import com.google.logging.v2.LogMetric;
import com.google.logging.v2.MetricNameOneof;
import com.google.logging.v2.ParentNameOneof;
import com.google.logging.v2.UpdateLogMetricRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service for configuring logs-based metrics.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (MetricsClient metricsClient = MetricsClient.create()) {
 *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
 *   LogMetric response = metricsClient.getLogMetric(metricName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the metricsClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of MetricsSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * MetricsSettings metricsSettings =
 *     MetricsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MetricsClient metricsClient =
 *     MetricsClient.create(metricsSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MetricsSettings metricsSettings =
 *     MetricsSettings.newBuilder()
 *         .setTransportChannelProvider(MetricsSettings.defaultGrpcTransportProviderBuilder()
 *             .setEndpoint(myEndpoint)
 *             .build())
 *         .build();
 * MetricsClient metricsClient =
 *     MetricsClient.create(metricsSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class MetricsClient implements BackgroundResource {
  private final MetricsSettings settings;
  private final MetricsServiceV2Stub stub;

  /** Constructs an instance of MetricsClient with default settings. */
  public static final MetricsClient create() throws IOException {
    return create(MetricsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MetricsClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MetricsClient create(MetricsSettings settings) throws IOException {
    return new MetricsClient(settings);
  }

  /**
   * Constructs an instance of MetricsClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use MetricsSettings}.
   */
  @BetaApi
  public static final MetricsClient create(MetricsServiceV2Stub stub) {
    return new MetricsClient(stub);
  }

  /**
   * Constructs an instance of MetricsClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected MetricsClient(MetricsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  protected MetricsClient(MetricsServiceV2Stub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MetricsSettings getSettings() {
    return settings;
  }

  @BetaApi
  public MetricsServiceV2Stub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists logs-based metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   for (LogMetric element : metricsClient.listLogMetrics(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the project containing the metrics:
   *     <p>"projects/[PROJECT_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogMetricsPagedResponse listLogMetrics(ParentNameOneof parent) {
    ListLogMetricsRequest request =
        ListLogMetricsRequest.newBuilder().setParentWithParentNameOneof(parent).build();
    return listLogMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists logs-based metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogMetricsRequest request = ListLogMetricsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   for (LogMetric element : metricsClient.listLogMetrics(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogMetricsPagedResponse listLogMetrics(ListLogMetricsRequest request) {
    return listLogMetricsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists logs-based metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogMetricsRequest request = ListLogMetricsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   ApiFuture&lt;ListLogMetricsPagedResponse&gt; future = metricsClient.listLogMetricsPagedCallable().futureCall(request);
   *   // Do something
   *   for (LogMetric element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListLogMetricsRequest, ListLogMetricsPagedResponse>
      listLogMetricsPagedCallable() {
    return stub.listLogMetricsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists logs-based metrics.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogMetricsRequest request = ListLogMetricsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   while (true) {
   *     ListLogMetricsResponse response = metricsClient.listLogMetricsCallable().call(request);
   *     for (LogMetric element : response.getMetricsList()) {
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
  public final UnaryCallable<ListLogMetricsRequest, ListLogMetricsResponse>
      listLogMetricsCallable() {
    return stub.listLogMetricsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   LogMetric response = metricsClient.getLogMetric(metricName);
   * }
   * </code></pre>
   *
   * @param metricName The resource name of the desired metric:
   *     <p>"projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogMetric getLogMetric(MetricNameOneof metricName) {

    GetLogMetricRequest request =
        GetLogMetricRequest.newBuilder().setMetricNameWithMetricNameOneof(metricName).build();
    return getLogMetric(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   GetLogMetricRequest request = GetLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .build();
   *   LogMetric response = metricsClient.getLogMetric(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final LogMetric getLogMetric(GetLogMetricRequest request) {
    return getLogMetricCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   GetLogMetricRequest request = GetLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .build();
   *   ApiFuture&lt;LogMetric&gt; future = metricsClient.getLogMetricCallable().futureCall(request);
   *   // Do something
   *   LogMetric response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetLogMetricRequest, LogMetric> getLogMetricCallable() {
    return stub.getLogMetricCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   LogMetric response = metricsClient.createLogMetric(parent, metric);
   * }
   * </code></pre>
   *
   * @param parent The resource name of the project in which to create the metric:
   *     <p>"projects/[PROJECT_ID]"
   *     <p>The new metric must be provided in the request.
   * @param metric The new logs-based metric, which must not have an identifier that already exists.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogMetric createLogMetric(ParentNameOneof parent, LogMetric metric) {

    CreateLogMetricRequest request =
        CreateLogMetricRequest.newBuilder()
            .setParentWithParentNameOneof(parent)
            .setMetric(metric)
            .build();
    return createLogMetric(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   CreateLogMetricRequest request = CreateLogMetricRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setMetric(metric)
   *     .build();
   *   LogMetric response = metricsClient.createLogMetric(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogMetric createLogMetric(CreateLogMetricRequest request) {
    return createLogMetricCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   CreateLogMetricRequest request = CreateLogMetricRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .setMetric(metric)
   *     .build();
   *   ApiFuture&lt;LogMetric&gt; future = metricsClient.createLogMetricCallable().futureCall(request);
   *   // Do something
   *   LogMetric response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateLogMetricRequest, LogMetric> createLogMetricCallable() {
    return stub.createLogMetricCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   LogMetric response = metricsClient.updateLogMetric(metricName, metric);
   * }
   * </code></pre>
   *
   * @param metricName The resource name of the metric to update:
   *     <p>"projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   *     <p>The updated metric must be provided in the request and it's `name` field must be the
   *     same as `[METRIC_ID]` If the metric does not exist in `[PROJECT_ID]`, then a new metric is
   *     created.
   * @param metric The updated metric.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogMetric updateLogMetric(MetricNameOneof metricName, LogMetric metric) {

    UpdateLogMetricRequest request =
        UpdateLogMetricRequest.newBuilder()
            .setMetricNameWithMetricNameOneof(metricName)
            .setMetric(metric)
            .build();
    return updateLogMetric(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   UpdateLogMetricRequest request = UpdateLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .setMetric(metric)
   *     .build();
   *   LogMetric response = metricsClient.updateLogMetric(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LogMetric updateLogMetric(UpdateLogMetricRequest request) {
    return updateLogMetricCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or updates a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   LogMetric metric = LogMetric.newBuilder().build();
   *   UpdateLogMetricRequest request = UpdateLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .setMetric(metric)
   *     .build();
   *   ApiFuture&lt;LogMetric&gt; future = metricsClient.updateLogMetricCallable().futureCall(request);
   *   // Do something
   *   LogMetric response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateLogMetricRequest, LogMetric> updateLogMetricCallable() {
    return stub.updateLogMetricCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   metricsClient.deleteLogMetric(metricName);
   * }
   * </code></pre>
   *
   * @param metricName The resource name of the metric to delete:
   *     <p>"projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteLogMetric(MetricNameOneof metricName) {

    DeleteLogMetricRequest request =
        DeleteLogMetricRequest.newBuilder().setMetricNameWithMetricNameOneof(metricName).build();
    deleteLogMetric(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   DeleteLogMetricRequest request = DeleteLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .build();
   *   metricsClient.deleteLogMetric(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteLogMetric(DeleteLogMetricRequest request) {
    deleteLogMetricCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a logs-based metric.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricsClient metricsClient = MetricsClient.create()) {
   *   MetricNameOneof metricName = MetricNameOneof.from(MetricName.of("[PROJECT]", "[METRIC]"));
   *   DeleteLogMetricRequest request = DeleteLogMetricRequest.newBuilder()
   *     .setMetricNameWithMetricNameOneof(metricName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = metricsClient.deleteLogMetricCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteLogMetricRequest, Empty> deleteLogMetricCallable() {
    return stub.deleteLogMetricCallable();
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
