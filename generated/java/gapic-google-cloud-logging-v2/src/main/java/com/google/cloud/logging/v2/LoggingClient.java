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

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogEntriesPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogsPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.MonitoredResource;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.logging.v2.stub.LoggingServiceV2Stub;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogsRequest;
import com.google.logging.v2.ListLogsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.LogEntry;
import com.google.logging.v2.LogNameOneof;
import com.google.logging.v2.ParentNameOneof;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service for ingesting and querying logs.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (LoggingClient loggingClient = LoggingClient.create()) {
 *   LogNameOneof logName = LogNameOneof.from(LogName.of("[PROJECT]", "[LOG]"));
 *   loggingClient.deleteLog(logName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the loggingClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of LoggingSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * LoggingSettings loggingSettings =
 *     LoggingSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LoggingClient loggingClient =
 *     LoggingClient.create(loggingSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LoggingSettings loggingSettings =
 *     LoggingSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LoggingClient loggingClient =
 *     LoggingClient.create(loggingSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class LoggingClient implements BackgroundResource {
  private final LoggingSettings settings;
  private final LoggingServiceV2Stub stub;

  /** Constructs an instance of LoggingClient with default settings. */
  public static final LoggingClient create() throws IOException {
    return create(LoggingSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LoggingClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LoggingClient create(LoggingSettings settings) throws IOException {
    return new LoggingClient(settings);
  }

  /**
   * Constructs an instance of LoggingClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use LoggingSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LoggingClient create(LoggingServiceV2Stub stub) {
    return new LoggingClient(stub);
  }

  /**
   * Constructs an instance of LoggingClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected LoggingClient(LoggingSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LoggingClient(LoggingServiceV2Stub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LoggingSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LoggingServiceV2Stub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries
   * written shortly before the delete operation might not be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   LogNameOneof logName = LogNameOneof.from(LogName.of("[PROJECT]", "[LOG]"));
   *   loggingClient.deleteLog(logName);
   * }
   * </code></pre>
   *
   * @param logName Required. The resource name of the log to delete:
   *     <p>"projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]"
   *     <p>`[LOG_ID]` must be URL-encoded. For example, `"projects/my-project-id/logs/syslog"`,
   *     `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`. For more
   *     information about log names, see [LogEntry][google.logging.v2.LogEntry].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteLog(LogNameOneof logName) {

    DeleteLogRequest request =
        DeleteLogRequest.newBuilder().setLogNameWithLogNameOneof(logName).build();
    deleteLog(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries
   * written shortly before the delete operation might not be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   LogNameOneof logName = LogNameOneof.from(LogName.of("[PROJECT]", "[LOG]"));
   *   DeleteLogRequest request = DeleteLogRequest.newBuilder()
   *     .setLogNameWithLogNameOneof(logName)
   *     .build();
   *   loggingClient.deleteLog(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteLog(DeleteLogRequest request) {
    deleteLogCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries
   * written shortly before the delete operation might not be deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   LogNameOneof logName = LogNameOneof.from(LogName.of("[PROJECT]", "[LOG]"));
   *   DeleteLogRequest request = DeleteLogRequest.newBuilder()
   *     .setLogNameWithLogNameOneof(logName)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = loggingClient.deleteLogCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteLogRequest, Empty> deleteLogCallable() {
    return stub.deleteLogCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * ## Log entry resources
   *
   * <p>Writes log entries to Stackdriver Logging. This API method is the only way to send log
   * entries to Stackdriver Logging. This method is used, directly or indirectly, by the Stackdriver
   * Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   LogNameOneof logName = LogNameOneof.from(LogName.of("[PROJECT]", "[LOG]"));
   *   MonitoredResource resource = MonitoredResource.newBuilder().build();
   *   Map&lt;String, String&gt; labels = new HashMap&lt;&gt;();
   *   List&lt;LogEntry&gt; entries = new ArrayList&lt;&gt;();
   *   WriteLogEntriesResponse response = loggingClient.writeLogEntries(logName, resource, labels, entries);
   * }
   * </code></pre>
   *
   * @param logName Optional. A default log resource name that is assigned to all log entries in
   *     `entries` that do not specify a value for `log_name`:
   *     <p>"projects/[PROJECT_ID]/logs/[LOG_ID]" "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]" "folders/[FOLDER_ID]/logs/[LOG_ID]"
   *     <p>`[LOG_ID]` must be URL-encoded. For example, `"projects/my-project-id/logs/syslog"` or
   *     `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`. For more
   *     information about log names, see [LogEntry][google.logging.v2.LogEntry].
   * @param resource Optional. A default monitored resource object that is assigned to all log
   *     entries in `entries` that do not specify a value for `resource`. Example:
   *     <p>{ "type": "gce_instance", "labels": { "zone": "us-central1-a", "instance_id":
   *     "00000000000000000000" }}
   *     <p>See [LogEntry][google.logging.v2.LogEntry].
   * @param labels Optional. Default labels that are added to the `labels` field of all log entries
   *     in `entries`. If a log entry already has a label with the same key as a label in this
   *     parameter, then the log entry's label is not changed. See
   *     [LogEntry][google.logging.v2.LogEntry].
   * @param entries Required. The log entries to send to Stackdriver Logging. The order of log
   *     entries in this list does not matter. Values supplied in this method's `log_name`,
   *     `resource`, and `labels` fields are copied into those log entries in this list that do not
   *     include values for their corresponding fields. For more information, see the
   *     [LogEntry][google.logging.v2.LogEntry] type.
   *     <p>If the `timestamp` or `insert_id` fields are missing in log entries, then this method
   *     supplies the current time or a unique identifier, respectively. The supplied values are
   *     chosen so that, among the log entries that did not supply their own values, the entries
   *     earlier in the list will sort before the entries later in the list. See the `entries.list`
   *     method.
   *     <p>Log entries with timestamps that are more than the [logs retention
   *     period](/logging/quota-policy) in the past or more than 24 hours in the future might be
   *     discarded. Discarding does not return an error.
   *     <p>To improve throughput and to avoid exceeding the [quota limit](/logging/quota-policy)
   *     for calls to `entries.write`, you should try to include several log entries in this list,
   *     rather than calling this method for each individual log entry.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WriteLogEntriesResponse writeLogEntries(
      LogNameOneof logName,
      MonitoredResource resource,
      Map<String, String> labels,
      List<LogEntry> entries) {

    WriteLogEntriesRequest request =
        WriteLogEntriesRequest.newBuilder()
            .setLogNameWithLogNameOneof(logName)
            .setResource(resource)
            .putAllLabels(labels)
            .addAllEntries(entries)
            .build();
    return writeLogEntries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * ## Log entry resources
   *
   * <p>Writes log entries to Stackdriver Logging. This API method is the only way to send log
   * entries to Stackdriver Logging. This method is used, directly or indirectly, by the Stackdriver
   * Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;LogEntry&gt; entries = new ArrayList&lt;&gt;();
   *   WriteLogEntriesRequest request = WriteLogEntriesRequest.newBuilder()
   *     .addAllEntries(entries)
   *     .build();
   *   WriteLogEntriesResponse response = loggingClient.writeLogEntries(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WriteLogEntriesResponse writeLogEntries(WriteLogEntriesRequest request) {
    return writeLogEntriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * ## Log entry resources
   *
   * <p>Writes log entries to Stackdriver Logging. This API method is the only way to send log
   * entries to Stackdriver Logging. This method is used, directly or indirectly, by the Stackdriver
   * Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;LogEntry&gt; entries = new ArrayList&lt;&gt;();
   *   WriteLogEntriesRequest request = WriteLogEntriesRequest.newBuilder()
   *     .addAllEntries(entries)
   *     .build();
   *   ApiFuture&lt;WriteLogEntriesResponse&gt; future = loggingClient.writeLogEntriesCallable().futureCall(request);
   *   // Do something
   *   WriteLogEntriesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesCallable() {
    return stub.writeLogEntriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways
   * to export log entries, see [Exporting Logs](/logging/docs/export).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;String&gt; resourceNames = new ArrayList&lt;&gt;();
   *   String filter = "";
   *   String orderBy = "";
   *   for (LogEntry element : loggingClient.listLogEntries(resourceNames, filter, orderBy).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param resourceNames Required. Names of one or more parent resources from which to retrieve log
   *     entries:
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   *     <p>Projects listed in the `project_ids` field are added to this list.
   * @param filter Optional. A filter that chooses which log entries to return. See [Advanced Logs
   *     Filters](/logging/docs/view/advanced_filters). Only log entries that match the filter are
   *     returned. An empty filter matches all log entries in the resources listed in
   *     `resource_names`. Referencing a parent resource that is not listed in `resource_names` will
   *     cause the filter to return no results. The maximum length of the filter is 20000
   *     characters.
   * @param orderBy Optional. How the results should be sorted. Presently, the only permitted values
   *     are `"timestamp asc"` (default) and `"timestamp desc"`. The first option returns entries in
   *     order of increasing values of `LogEntry.timestamp` (oldest first), and the second option
   *     returns entries in order of decreasing timestamps (newest first). Entries with equal
   *     timestamps are returned in order of their `insert_id` values.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogEntriesPagedResponse listLogEntries(
      List<String> resourceNames, String filter, String orderBy) {
    ListLogEntriesRequest request =
        ListLogEntriesRequest.newBuilder()
            .addAllResourceNames(resourceNames)
            .setFilter(filter)
            .setOrderBy(orderBy)
            .build();
    return listLogEntries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways
   * to export log entries, see [Exporting Logs](/logging/docs/export).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;String&gt; resourceNames = new ArrayList&lt;&gt;();
   *   ListLogEntriesRequest request = ListLogEntriesRequest.newBuilder()
   *     .addAllResourceNames(resourceNames)
   *     .build();
   *   for (LogEntry element : loggingClient.listLogEntries(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogEntriesPagedResponse listLogEntries(ListLogEntriesRequest request) {
    return listLogEntriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways
   * to export log entries, see [Exporting Logs](/logging/docs/export).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;String&gt; resourceNames = new ArrayList&lt;&gt;();
   *   ListLogEntriesRequest request = ListLogEntriesRequest.newBuilder()
   *     .addAllResourceNames(resourceNames)
   *     .build();
   *   ApiFuture&lt;ListLogEntriesPagedResponse&gt; future = loggingClient.listLogEntriesPagedCallable().futureCall(request);
   *   // Do something
   *   for (LogEntry element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListLogEntriesRequest, ListLogEntriesPagedResponse>
      listLogEntriesPagedCallable() {
    return stub.listLogEntriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways
   * to export log entries, see [Exporting Logs](/logging/docs/export).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   List&lt;String&gt; resourceNames = new ArrayList&lt;&gt;();
   *   ListLogEntriesRequest request = ListLogEntriesRequest.newBuilder()
   *     .addAllResourceNames(resourceNames)
   *     .build();
   *   while (true) {
   *     ListLogEntriesResponse response = loggingClient.listLogEntriesCallable().call(request);
   *     for (LogEntry element : response.getEntriesList()) {
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
  public final UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse>
      listLogEntriesCallable() {
    return stub.listLogEntriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the descriptors for monitored resource types used by Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
   *   for (MonitoredResourceDescriptor element : loggingClient.listMonitoredResourceDescriptors(request).iterateAll()) {
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
   * Lists the descriptors for monitored resource types used by Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
   *   ApiFuture&lt;ListMonitoredResourceDescriptorsPagedResponse&gt; future = loggingClient.listMonitoredResourceDescriptorsPagedCallable().futureCall(request);
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
   * Lists the descriptors for monitored resource types used by Stackdriver Logging.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
   *   while (true) {
   *     ListMonitoredResourceDescriptorsResponse response = loggingClient.listMonitoredResourceDescriptorsCallable().call(request);
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
   * Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   * entries are listed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   for (String element : loggingClient.listLogs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The resource name that owns the logs:
   *     <p>"projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogsPagedResponse listLogs(ParentNameOneof parent) {
    ListLogsRequest request =
        ListLogsRequest.newBuilder().setParentWithParentNameOneof(parent).build();
    return listLogs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   * entries are listed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogsRequest request = ListLogsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   for (String element : loggingClient.listLogs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLogsPagedResponse listLogs(ListLogsRequest request) {
    return listLogsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   * entries are listed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogsRequest request = ListLogsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   ApiFuture&lt;ListLogsPagedResponse&gt; future = loggingClient.listLogsPagedCallable().futureCall(request);
   *   // Do something
   *   for (String element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListLogsRequest, ListLogsPagedResponse> listLogsPagedCallable() {
    return stub.listLogsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   * entries are listed.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LoggingClient loggingClient = LoggingClient.create()) {
   *   ParentNameOneof parent = ParentNameOneof.from(ProjectName.of("[PROJECT]"));
   *   ListLogsRequest request = ListLogsRequest.newBuilder()
   *     .setParentWithParentNameOneof(parent)
   *     .build();
   *   while (true) {
   *     ListLogsResponse response = loggingClient.listLogsCallable().call(request);
   *     for (String element : response.getLogNamesList()) {
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
  public final UnaryCallable<ListLogsRequest, ListLogsResponse> listLogsCallable() {
    return stub.listLogsCallable();
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
