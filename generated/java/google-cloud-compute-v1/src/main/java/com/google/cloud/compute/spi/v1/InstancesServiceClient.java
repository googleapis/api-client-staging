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

import com.google.api.gax.grpc.ChannelAndExecutor;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceList;
import com.google.cloud.compute.v1.InstancesDeleteRequest;
import com.google.cloud.compute.v1.InstancesGetRequest;
import com.google.cloud.compute.v1.InstancesInsertRequest;
import com.google.cloud.compute.v1.InstancesListRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.protobuf.ExperimentalApi;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description:
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
 *   String project = "";
 *   String zone = "";
 *   String instance = "";
 *   Instance response = instancesServiceClient.getInstance(project, zone, instance);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the instancesServiceClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of InstancesServiceSettings to
 * create(). For example:
 *
 * <pre>
 * <code>
 * InstantiatingChannelProvider channelProvider =
 *     InstancesServiceSettings.defaultChannelProviderBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InstancesServiceSettings instancesServiceSettings =
 *     InstancesServiceSettings.defaultBuilder().setChannelProvider(channelProvider).build();
 * InstancesServiceClient instancesServiceClient =
 *     InstancesServiceClient.create(instancesServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC")
@ExperimentalApi
public class InstancesServiceClient implements AutoCloseable {
  private final InstancesServiceSettings settings;
  private final ScheduledExecutorService executor;
  private final ManagedChannel channel;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<InstancesListRequest, InstanceList> listInstancesCallable;
  private final UnaryCallable<InstancesListRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable;
  private final UnaryCallable<InstancesGetRequest, Instance> getInstanceCallable;
  private final UnaryCallable<InstancesInsertRequest, Operation> insertInstanceCallable;
  private final UnaryCallable<InstancesDeleteRequest, Operation> deleteInstanceCallable;

  /** Constructs an instance of InstancesServiceClient with default settings. */
  public static final InstancesServiceClient create() throws IOException {
    return create(InstancesServiceSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of InstancesServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final InstancesServiceClient create(InstancesServiceSettings settings)
      throws IOException {
    return new InstancesServiceClient(settings);
  }

  /**
   * Constructs an instance of InstancesServiceClient, using the given settings. This is protected
   * so that it easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected InstancesServiceClient(InstancesServiceSettings settings) throws IOException {
    this.settings = settings;
    ChannelAndExecutor channelAndExecutor = settings.getChannelAndExecutor();
    this.executor = channelAndExecutor.getExecutor();
    this.channel = channelAndExecutor.getChannel();

    this.listInstancesCallable =
        UnaryCallable.create(settings.listInstancesSettings(), this.channel, this.executor);
    this.listInstancesPagedCallable =
        UnaryCallable.createPagedVariant(
            settings.listInstancesSettings(), this.channel, this.executor);
    this.getInstanceCallable =
        UnaryCallable.create(settings.getInstanceSettings(), this.channel, this.executor);
    this.insertInstanceCallable =
        UnaryCallable.create(settings.insertInstanceSettings(), this.channel, this.executor);
    this.deleteInstanceCallable =
        UnaryCallable.create(settings.deleteInstanceSettings(), this.channel, this.executor);

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

  public final InstancesServiceSettings getSettings() {
    return settings;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   int maxResults = 0;
   *   String filter = "";
   *   String orderBy = "";
   *   String project = "";
   *   String zone = "";
   *   InstancesListRequest request = InstancesListRequest.newBuilder()
   *     .setMaxResults(maxResults)
   *     .setFilter(filter)
   *     .setOrderBy(orderBy)
   *     .setProject(project)
   *     .setZone(zone)
   *     .build();
   *   for (Instance element : instancesServiceClient.listInstances(request).iterateAllElements()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(InstancesListRequest request) {
    return listInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   int maxResults = 0;
   *   String filter = "";
   *   String orderBy = "";
   *   String project = "";
   *   String zone = "";
   *   InstancesListRequest request = InstancesListRequest.newBuilder()
   *     .setMaxResults(maxResults)
   *     .setFilter(filter)
   *     .setOrderBy(orderBy)
   *     .setProject(project)
   *     .setZone(zone)
   *     .build();
   *   ApiFuture&lt;ListInstancesPagedResponse&gt; future = instancesServiceClient.listInstancesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Instance element : future.get().iterateAllElements()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstancesListRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of instances contained within the specified zone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   int maxResults = 0;
   *   String filter = "";
   *   String orderBy = "";
   *   String project = "";
   *   String zone = "";
   *   InstancesListRequest request = InstancesListRequest.newBuilder()
   *     .setMaxResults(maxResults)
   *     .setFilter(filter)
   *     .setOrderBy(orderBy)
   *     .setProject(project)
   *     .setZone(zone)
   *     .build();
   *   while (true) {
   *     InstanceList response = instancesServiceClient.listInstancesCallable().call(request);
   *     for (Instance element : response.getItemsList()) {
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
  public final UnaryCallable<InstancesListRequest, InstanceList> listInstancesCallable() {
    return listInstancesCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a
   * &lt;code&gt;list()&lt;/code&gt; request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   Instance response = instancesServiceClient.getInstance(project, zone, instance);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param zone The name of the zone for this request.
   * @param instance Name of the instance resource to return.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Instance getInstance(String project, String zone, String instance) {

    InstancesGetRequest request =
        InstancesGetRequest.newBuilder()
            .setProject(project)
            .setZone(zone)
            .setInstance(instance)
            .build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a
   * &lt;code&gt;list()&lt;/code&gt; request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   InstancesGetRequest request = InstancesGetRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setInstance(instance)
   *     .build();
   *   Instance response = instancesServiceClient.getInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Instance getInstance(InstancesGetRequest request) {
    return getInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified Instance resource. Get a list of available instances by making a
   * &lt;code&gt;list()&lt;/code&gt; request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   InstancesGetRequest request = InstancesGetRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setInstance(instance)
   *     .build();
   *   ApiFuture&lt;Instance&gt; future = instancesServiceClient.getInstanceCallable().futureCall(request);
   *   // Do something
   *   Instance response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstancesGetRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   Instance resource = Instance.newBuilder().build();
   *   Operation response = instancesServiceClient.insertInstance(project, zone, resource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param zone The name of the zone for this request.
   * @param resource
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Operation insertInstance(String project, String zone, Instance resource) {

    InstancesInsertRequest request =
        InstancesInsertRequest.newBuilder()
            .setProject(project)
            .setZone(zone)
            .setResource(resource)
            .build();
    return insertInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   Instance resource = Instance.newBuilder().build();
   *   InstancesInsertRequest request = InstancesInsertRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setResource(resource)
   *     .build();
   *   Operation response = instancesServiceClient.insertInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Operation insertInstance(InstancesInsertRequest request) {
    return insertInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an instance resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   Instance resource = Instance.newBuilder().build();
   *   InstancesInsertRequest request = InstancesInsertRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setResource(resource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instancesServiceClient.insertInstanceCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstancesInsertRequest, Operation> insertInstanceCallable() {
    return insertInstanceCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see &lt;a
   * href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an
   * Instance&lt;/a&gt;.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   Operation response = instancesServiceClient.deleteInstance(project, zone, instance);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param zone The name of the zone for this request.
   * @param instance Name of the instance resource to delete.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Operation deleteInstance(String project, String zone, String instance) {

    InstancesDeleteRequest request =
        InstancesDeleteRequest.newBuilder()
            .setProject(project)
            .setZone(zone)
            .setInstance(instance)
            .build();
    return deleteInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see &lt;a
   * href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an
   * Instance&lt;/a&gt;.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   InstancesDeleteRequest request = InstancesDeleteRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setInstance(instance)
   *     .build();
   *   Operation response = instancesServiceClient.deleteInstance(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Operation deleteInstance(InstancesDeleteRequest request) {
    return deleteInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified Instance resource. For more information, see &lt;a
   * href="/compute/docs/instances/stopping-or-deleting-an-instance"&gt;Stopping or Deleting an
   * Instance&lt;/a&gt;.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
   *   String project = "";
   *   String zone = "";
   *   String instance = "";
   *   InstancesDeleteRequest request = InstancesDeleteRequest.newBuilder()
   *     .setProject(project)
   *     .setZone(zone)
   *     .setInstance(instance)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = instancesServiceClient.deleteInstanceCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstancesDeleteRequest, Operation> deleteInstanceCallable() {
    return deleteInstanceCallable;
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
