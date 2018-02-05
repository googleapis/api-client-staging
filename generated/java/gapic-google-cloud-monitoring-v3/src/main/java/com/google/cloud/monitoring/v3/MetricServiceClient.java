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

import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListMetricDescriptorsPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListTimeSeriesPagedResponse;

import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.stub.MetricServiceStub;
import com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings;
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
import com.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView;
import com.google.monitoring.v3.ListTimeSeriesResponse;
import com.google.monitoring.v3.MetricDescriptorName;
import com.google.monitoring.v3.MonitoredResourceDescriptorName;
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.TimeInterval;
import com.google.monitoring.v3.TimeSeries;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Manages metric descriptors, monitored resource descriptors, and time series
 * data.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
 *   MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
 *   MonitoredResourceDescriptor response = metricServiceClient.getMonitoredResourceDescriptor(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the metricServiceClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of MetricServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MetricServiceClient metricServiceClient =
 *     MetricServiceClient.create(metricServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MetricServiceClient metricServiceClient =
 *     MetricServiceClient.create(metricServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class MetricServiceClient implements BackgroundResource {
  private final MetricServiceSettings settings;
  private final MetricServiceStub stub;

  /** Constructs an instance of MetricServiceClient with default settings. */
  public static final MetricServiceClient create() throws IOException {
    return create(MetricServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MetricServiceClient create(MetricServiceSettings settings)
      throws IOException {
    return new MetricServiceClient(settings);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use MetricServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MetricServiceClient create(MetricServiceStub stub) {
    return new MetricServiceClient(stub);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected MetricServiceClient(MetricServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((MetricServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MetricServiceClient(MetricServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MetricServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MetricServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (MonitoredResourceDescriptor element : metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name The project on which to execute the request. The format is
   *     `"projects/{project_id_or_number}"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ProjectName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder().setName(name.toString()).build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   for (MonitoredResourceDescriptor element : metricServiceClient.listMonitoredResourceDescriptors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ListMonitoredResourceDescriptorsRequest request) {
    return listMonitoredResourceDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;ListMonitoredResourceDescriptorsPagedResponse&gt; future = metricServiceClient.listMonitoredResourceDescriptorsPagedCallable().futureCall(request);
   *   // Do something
   *   for (MonitoredResourceDescriptor element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable() {
    return stub.listMonitoredResourceDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   while (true) {
   *     ListMonitoredResourceDescriptorsResponse response = metricServiceClient.listMonitoredResourceDescriptorsCallable().call(request);
   *     for (MonitoredResourceDescriptor element : response.getResourceDescriptorsList()) {
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
  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return stub.listMonitoredResourceDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single monitored resource descriptor. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
   *   MonitoredResourceDescriptor response = metricServiceClient.getMonitoredResourceDescriptor(name);
   * }
   * </code></pre>
   *
   * @param name The monitored resource descriptor to get. The format is
   *     `"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}"`. The
   *     `{resource_type}` is a predefined type, such as `cloudsql_database`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      MonitoredResourceDescriptorName name) {

    GetMonitoredResourceDescriptorRequest request =
        GetMonitoredResourceDescriptorRequest.newBuilder().setName(name.toString()).build();
    return getMonitoredResourceDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single monitored resource descriptor. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
   *   GetMonitoredResourceDescriptorRequest request = GetMonitoredResourceDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   MonitoredResourceDescriptor response = metricServiceClient.getMonitoredResourceDescriptor(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      GetMonitoredResourceDescriptorRequest request) {
    return getMonitoredResourceDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single monitored resource descriptor. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
   *   GetMonitoredResourceDescriptorRequest request = GetMonitoredResourceDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;MonitoredResourceDescriptor&gt; future = metricServiceClient.getMonitoredResourceDescriptorCallable().futureCall(request);
   *   // Do something
   *   MonitoredResourceDescriptor response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
      getMonitoredResourceDescriptorCallable() {
    return stub.getMonitoredResourceDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists metric descriptors that match a filter. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (MetricDescriptor element : metricServiceClient.listMetricDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name The project on which to execute the request. The format is
   *     `"projects/{project_id_or_number}"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(ProjectName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder().setName(name.toString()).build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists metric descriptors that match a filter. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   for (MetricDescriptor element : metricServiceClient.listMetricDescriptors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(
      ListMetricDescriptorsRequest request) {
    return listMetricDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists metric descriptors that match a filter. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;ListMetricDescriptorsPagedResponse&gt; future = metricServiceClient.listMetricDescriptorsPagedCallable().futureCall(request);
   *   // Do something
   *   for (MetricDescriptor element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsPagedResponse>
      listMetricDescriptorsPagedCallable() {
    return stub.listMetricDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists metric descriptors that match a filter. This method does not require a Stackdriver
   * account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   while (true) {
   *     ListMetricDescriptorsResponse response = metricServiceClient.listMetricDescriptorsCallable().call(request);
   *     for (MetricDescriptor element : response.getMetricDescriptorsList()) {
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
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse>
      listMetricDescriptorsCallable() {
    return stub.listMetricDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single metric descriptor. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   MetricDescriptor response = metricServiceClient.getMetricDescriptor(name);
   * }
   * </code></pre>
   *
   * @param name The metric descriptor on which to execute the request. The format is
   *     `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`. An example value of
   *     `{metric_id}` is `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(MetricDescriptorName name) {

    GetMetricDescriptorRequest request =
        GetMetricDescriptorRequest.newBuilder().setName(name.toString()).build();
    return getMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single metric descriptor. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   GetMetricDescriptorRequest request = GetMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   MetricDescriptor response = metricServiceClient.getMetricDescriptor(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final MetricDescriptor getMetricDescriptor(GetMetricDescriptorRequest request) {
    return getMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a single metric descriptor. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   GetMetricDescriptorRequest request = GetMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;MetricDescriptor&gt; future = metricServiceClient.getMetricDescriptorCallable().futureCall(request);
   *   // Do something
   *   MetricDescriptor response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetMetricDescriptorRequest, MetricDescriptor>
      getMetricDescriptorCallable() {
    return stub.getMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](/monitoring/custom-metrics).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   MetricDescriptor response = metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   * }
   * </code></pre>
   *
   * @param name The project on which to execute the request. The format is
   *     `"projects/{project_id_or_number}"`.
   * @param metricDescriptor The new [custom metric](/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      ProjectName name, MetricDescriptor metricDescriptor) {

    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](/monitoring/custom-metrics).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   CreateMetricDescriptorRequest request = CreateMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .setMetricDescriptor(metricDescriptor)
   *     .build();
   *   MetricDescriptor response = metricServiceClient.createMetricDescriptor(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(CreateMetricDescriptorRequest request) {
    return createMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](/monitoring/custom-metrics).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   CreateMetricDescriptorRequest request = CreateMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .setMetricDescriptor(metricDescriptor)
   *     .build();
   *   ApiFuture&lt;MetricDescriptor&gt; future = metricServiceClient.createMetricDescriptorCallable().futureCall(request);
   *   // Do something
   *   MetricDescriptor response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateMetricDescriptorRequest, MetricDescriptor>
      createMetricDescriptorCallable() {
    return stub.createMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a metric descriptor. Only user-created [custom metrics](/monitoring/custom-metrics) can
   * be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   metricServiceClient.deleteMetricDescriptor(name);
   * }
   * </code></pre>
   *
   * @param name The metric descriptor on which to execute the request. The format is
   *     `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`. An example of
   *     `{metric_id}` is: `"custom.googleapis.com/my_test_metric"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(MetricDescriptorName name) {

    DeleteMetricDescriptorRequest request =
        DeleteMetricDescriptorRequest.newBuilder().setName(name.toString()).build();
    deleteMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a metric descriptor. Only user-created [custom metrics](/monitoring/custom-metrics) can
   * be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   DeleteMetricDescriptorRequest request = DeleteMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   metricServiceClient.deleteMetricDescriptor(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteMetricDescriptor(DeleteMetricDescriptorRequest request) {
    deleteMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a metric descriptor. Only user-created [custom metrics](/monitoring/custom-metrics) can
   * be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name = MetricDescriptorName.of("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   DeleteMetricDescriptorRequest request = DeleteMetricDescriptorRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = metricServiceClient.deleteMetricDescriptorCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteMetricDescriptorRequest, Empty>
      deleteMetricDescriptorCallable() {
    return stub.deleteMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists time series that match a filter. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   String filter = "";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
   *   for (TimeSeries element : metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name The project on which to execute the request. The format is
   *     "projects/{project_id_or_number}".
   * @param filter A [monitoring filter](/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.label.instance_name = "my-instance-name"
   * @param interval The time interval for which results should be returned. Only time series that
   *     contain data points in the specified interval are included in the response.
   * @param view Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      ProjectName name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name.toString())
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists time series that match a filter. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   String filter = "";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
   *   ListTimeSeriesRequest request = ListTimeSeriesRequest.newBuilder()
   *     .setName(name.toString())
   *     .setFilter(filter)
   *     .setInterval(interval)
   *     .setView(view)
   *     .build();
   *   for (TimeSeries element : metricServiceClient.listTimeSeries(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(ListTimeSeriesRequest request) {
    return listTimeSeriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists time series that match a filter. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   String filter = "";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
   *   ListTimeSeriesRequest request = ListTimeSeriesRequest.newBuilder()
   *     .setName(name.toString())
   *     .setFilter(filter)
   *     .setInterval(interval)
   *     .setView(view)
   *     .build();
   *   ApiFuture&lt;ListTimeSeriesPagedResponse&gt; future = metricServiceClient.listTimeSeriesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TimeSeries element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesPagedResponse>
      listTimeSeriesPagedCallable() {
    return stub.listTimeSeriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists time series that match a filter. This method does not require a Stackdriver account.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   String filter = "";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
   *   ListTimeSeriesRequest request = ListTimeSeriesRequest.newBuilder()
   *     .setName(name.toString())
   *     .setFilter(filter)
   *     .setInterval(interval)
   *     .setView(view)
   *     .build();
   *   while (true) {
   *     ListTimeSeriesResponse response = metricServiceClient.listTimeSeriesCallable().call(request);
   *     for (TimeSeries element : response.getTimeSeriesList()) {
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
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesResponse>
      listTimeSeriesCallable() {
    return stub.listTimeSeriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   List&lt;TimeSeries&gt; timeSeries = new ArrayList&lt;&gt;();
   *   metricServiceClient.createTimeSeries(name, timeSeries);
   * }
   * </code></pre>
   *
   * @param name The project on which to execute the request. The format is
   *     `"projects/{project_id_or_number}"`.
   * @param timeSeries The new data to be added to a list of time series. Adds at most one data
   *     point to each of several time series. The new data point must be more recent than any other
   *     point in its time series. Each `TimeSeries` value must fully specify a unique time series
   *     by supplying all label values for the metric and the monitored resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(ProjectName name, List<TimeSeries> timeSeries) {

    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder()
            .setName(name.toString())
            .addAllTimeSeries(timeSeries)
            .build();
    createTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   List&lt;TimeSeries&gt; timeSeries = new ArrayList&lt;&gt;();
   *   CreateTimeSeriesRequest request = CreateTimeSeriesRequest.newBuilder()
   *     .setName(name.toString())
   *     .addAllTimeSeries(timeSeries)
   *     .build();
   *   metricServiceClient.createTimeSeries(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(CreateTimeSeriesRequest request) {
    createTimeSeriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   List&lt;TimeSeries&gt; timeSeries = new ArrayList&lt;&gt;();
   *   CreateTimeSeriesRequest request = CreateTimeSeriesRequest.newBuilder()
   *     .setName(name.toString())
   *     .addAllTimeSeries(timeSeries)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = metricServiceClient.createTimeSeriesCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateTimeSeriesRequest, Empty> createTimeSeriesCallable() {
    return stub.createTimeSeriesCallable();
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
