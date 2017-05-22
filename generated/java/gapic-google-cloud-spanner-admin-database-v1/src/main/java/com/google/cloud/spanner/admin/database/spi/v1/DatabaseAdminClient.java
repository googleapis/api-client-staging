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
package com.google.cloud.spanner.admin.database.spi.v1;

import static com.google.cloud.spanner.admin.database.spi.v1.PagedResponseWrappers.ListDatabasesPagedResponse;

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
import com.google.spanner.admin.database.v1.CreateDatabaseRequest;
import com.google.spanner.admin.database.v1.Database;
import com.google.spanner.admin.database.v1.DatabaseName;
import com.google.spanner.admin.database.v1.DropDatabaseRequest;
import com.google.spanner.admin.database.v1.GetDatabaseDdlRequest;
import com.google.spanner.admin.database.v1.GetDatabaseDdlResponse;
import com.google.spanner.admin.database.v1.GetDatabaseRequest;
import com.google.spanner.admin.database.v1.InstanceName;
import com.google.spanner.admin.database.v1.ListDatabasesRequest;
import com.google.spanner.admin.database.v1.ListDatabasesResponse;
import com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Cloud Spanner Database Admin API
 *
 * <p>The Cloud Spanner Database Admin API can be used to create, drop, and list databases. It also
 * enables updating the schema of pre-existing databases.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
 *   DatabaseName name = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
 *   Database response = databaseAdminClient.getDatabase(name);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the databaseAdminClient object to clean up resources such
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
 * <p>This class can be customized by passing in a custom instance of DatabaseAdminSettings to
 * create(). For example:
 *
 * <pre>
 * <code>
 * InstantiatingChannelProvider channelProvider =
 *     DatabaseAdminSettings.defaultChannelProviderBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DatabaseAdminSettings databaseAdminSettings =
 *     DatabaseAdminSettings.defaultBuilder().setChannelProvider(channelProvider).build();
 * DatabaseAdminClient databaseAdminClient =
 *     DatabaseAdminClient.create(databaseAdminSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC")
@BetaApi
public class DatabaseAdminClient implements AutoCloseable {
  private final DatabaseAdminSettings settings;
  private final ScheduledExecutorService executor;
  private final ManagedChannel channel;
  private final OperationsClient operationsClient;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable;
  private final UnaryCallable<ListDatabasesRequest, ListDatabasesPagedResponse>
      listDatabasesPagedCallable;
  private final UnaryCallable<CreateDatabaseRequest, Operation> createDatabaseCallable;
  private final OperationCallable<CreateDatabaseRequest, Database> createDatabaseOperationCallable;
  private final UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable;
  private final UnaryCallable<UpdateDatabaseDdlRequest, Operation> updateDatabaseDdlCallable;
  private final OperationCallable<UpdateDatabaseDdlRequest, Empty>
      updateDatabaseDdlOperationCallable;
  private final UnaryCallable<DropDatabaseRequest, Empty> dropDatabaseCallable;
  private final UnaryCallable<GetDatabaseDdlRequest, GetDatabaseDdlResponse> getDatabaseDdlCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  /** Constructs an instance of DatabaseAdminClient with default settings. */
  public static final DatabaseAdminClient create() throws IOException {
    return create(DatabaseAdminSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of DatabaseAdminClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DatabaseAdminClient create(DatabaseAdminSettings settings)
      throws IOException {
    return new DatabaseAdminClient(settings);
  }

  /**
   * Constructs an instance of DatabaseAdminClient, using the given settings. This is protected so
   * that it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected DatabaseAdminClient(DatabaseAdminSettings settings) throws IOException {
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

    this.listDatabasesCallable =
        UnaryCallable.create(settings.listDatabasesSettings(), this.channel, this.executor);
    this.listDatabasesPagedCallable =
        UnaryCallable.createPagedVariant(
            settings.listDatabasesSettings(), this.channel, this.executor);
    this.createDatabaseCallable =
        UnaryCallable.create(
            settings.createDatabaseSettings().getInitialCallSettings(),
            this.channel,
            this.executor);
    this.createDatabaseOperationCallable =
        OperationCallable.create(
            settings.createDatabaseSettings(), this.channel, this.executor, this.operationsClient);
    this.getDatabaseCallable =
        UnaryCallable.create(settings.getDatabaseSettings(), this.channel, this.executor);
    this.updateDatabaseDdlCallable =
        UnaryCallable.create(
            settings.updateDatabaseDdlSettings().getInitialCallSettings(),
            this.channel,
            this.executor);
    this.updateDatabaseDdlOperationCallable =
        OperationCallable.create(
            settings.updateDatabaseDdlSettings(),
            this.channel,
            this.executor,
            this.operationsClient);
    this.dropDatabaseCallable =
        UnaryCallable.create(settings.dropDatabaseSettings(), this.channel, this.executor);
    this.getDatabaseDdlCallable =
        UnaryCallable.create(settings.getDatabaseDdlSettings(), this.channel, this.executor);
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

  public final DatabaseAdminSettings getSettings() {
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
   * Lists Cloud Spanner databases.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   for (Database element : databaseAdminClient.listDatabases(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The instance whose databases should be listed. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListDatabasesPagedResponse listDatabases(InstanceName parent) {
    ListDatabasesRequest request =
        ListDatabasesRequest.newBuilder().setParentWithInstanceName(parent).build();
    return listDatabases(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists Cloud Spanner databases.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   ListDatabasesRequest request = ListDatabasesRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .build();
   *   for (Database element : databaseAdminClient.listDatabases(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final ListDatabasesPagedResponse listDatabases(ListDatabasesRequest request) {
    return listDatabasesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists Cloud Spanner databases.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   ListDatabasesRequest request = ListDatabasesRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .build();
   *   ApiFuture&lt;ListDatabasesPagedResponse&gt; future = databaseAdminClient.listDatabasesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Database element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListDatabasesRequest, ListDatabasesPagedResponse>
      listDatabasesPagedCallable() {
    return listDatabasesPagedCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists Cloud Spanner databases.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   ListDatabasesRequest request = ListDatabasesRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .build();
   *   while (true) {
   *     ListDatabasesResponse response = databaseAdminClient.listDatabasesCallable().call(request);
   *     for (Database element : response.getDatabasesList()) {
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
  public final UnaryCallable<ListDatabasesRequest, ListDatabasesResponse> listDatabasesCallable() {
    return listDatabasesCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   * [long-running operation][google.longrunning.Operation] will have a name of the format
   * `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to track preparation of
   * the database. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Database][google.spanner.admin.database.v1.Database], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   String createStatement = "";
   *   Database response = databaseAdminClient.createDatabaseAsync(parent, createStatement).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The name of the instance that will serve the new database. Values are
   *     of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * @param createStatement Required. A `CREATE DATABASE` statement, which specifies the ID of the
   *     new database. The database ID must conform to the regular expression
   *     `[a-z][a-z0-9_\-]&#42;[a-z0-9]` and be between 2 and 30 characters in length.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Database> createDatabaseAsync(
      InstanceName parent, String createStatement) {

    CreateDatabaseRequest request =
        CreateDatabaseRequest.newBuilder()
            .setParentWithInstanceName(parent)
            .setCreateStatement(createStatement)
            .build();
    return createDatabaseAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   * [long-running operation][google.longrunning.Operation] will have a name of the format
   * `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to track preparation of
   * the database. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Database][google.spanner.admin.database.v1.Database], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   String createStatement = "";
   *   CreateDatabaseRequest request = CreateDatabaseRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .setCreateStatement(createStatement)
   *     .build();
   *   Database response = databaseAdminClient.createDatabaseAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Database> createDatabaseAsync(CreateDatabaseRequest request) {
    return createDatabaseOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   * [long-running operation][google.longrunning.Operation] will have a name of the format
   * `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to track preparation of
   * the database. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Database][google.spanner.admin.database.v1.Database], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   String createStatement = "";
   *   CreateDatabaseRequest request = CreateDatabaseRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .setCreateStatement(createStatement)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = databaseAdminClient.createDatabaseOperationCallable().futureCall(request);
   *   // Do something
   *   Database response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<CreateDatabaseRequest, Database>
      createDatabaseOperationCallable() {
    return createDatabaseOperationCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   * [long-running operation][google.longrunning.Operation] will have a name of the format
   * `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to track preparation of
   * the database. The [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Database][google.spanner.admin.database.v1.Database], if successful.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   InstanceName parent = InstanceName.create("[PROJECT]", "[INSTANCE]");
   *   String createStatement = "";
   *   CreateDatabaseRequest request = CreateDatabaseRequest.newBuilder()
   *     .setParentWithInstanceName(parent)
   *     .setCreateStatement(createStatement)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = databaseAdminClient.createDatabaseCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateDatabaseRequest, Operation> createDatabaseCallable() {
    return createDatabaseCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the state of a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName name = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   Database response = databaseAdminClient.getDatabase(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the requested database. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Database getDatabase(DatabaseName name) {

    GetDatabaseRequest request =
        GetDatabaseRequest.newBuilder().setNameWithDatabaseName(name).build();
    return getDatabase(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the state of a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName name = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   GetDatabaseRequest request = GetDatabaseRequest.newBuilder()
   *     .setNameWithDatabaseName(name)
   *     .build();
   *   Database response = databaseAdminClient.getDatabase(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Database getDatabase(GetDatabaseRequest request) {
    return getDatabaseCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the state of a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName name = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   GetDatabaseRequest request = GetDatabaseRequest.newBuilder()
   *     .setNameWithDatabaseName(name)
   *     .build();
   *   ApiFuture&lt;Database&gt; future = databaseAdminClient.getDatabaseCallable().futureCall(request);
   *   // Do something
   *   Database response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDatabaseRequest, Database> getDatabaseCallable() {
    return getDatabaseCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   * indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   * name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
   * track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   * field type is
   * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   * operation has no response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   List&lt;String&gt; statements = new ArrayList&lt;&gt;();
   *   Empty response = databaseAdminClient.updateDatabaseDdlAsync(database, statements).get();
   * }
   * </code></pre>
   *
   * @param database Required. The database to update.
   * @param statements DDL statements to be applied to the database.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty> updateDatabaseDdlAsync(
      DatabaseName database, List<String> statements) {

    UpdateDatabaseDdlRequest request =
        UpdateDatabaseDdlRequest.newBuilder()
            .setDatabaseWithDatabaseName(database)
            .addAllStatements(statements)
            .build();
    return updateDatabaseDdlAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   * indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   * name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
   * track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   * field type is
   * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   * operation has no response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   List&lt;String&gt; statements = new ArrayList&lt;&gt;();
   *   UpdateDatabaseDdlRequest request = UpdateDatabaseDdlRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .addAllStatements(statements)
   *     .build();
   *   Empty response = databaseAdminClient.updateDatabaseDdlAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty> updateDatabaseDdlAsync(UpdateDatabaseDdlRequest request) {
    return updateDatabaseDdlOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   * indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   * name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
   * track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   * field type is
   * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   * operation has no response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   List&lt;String&gt; statements = new ArrayList&lt;&gt;();
   *   UpdateDatabaseDdlRequest request = UpdateDatabaseDdlRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .addAllStatements(statements)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = databaseAdminClient.updateDatabaseDdlOperationCallable().futureCall(request);
   *   // Do something
   *   Empty response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<UpdateDatabaseDdlRequest, Empty>
      updateDatabaseDdlOperationCallable() {
    return updateDatabaseDdlOperationCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   * indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   * name of the format `&lt;database_name&gt;/operations/&lt;operation_id&gt;` and can be used to
   * track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   * field type is
   * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   * operation has no response.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   List&lt;String&gt; statements = new ArrayList&lt;&gt;();
   *   UpdateDatabaseDdlRequest request = UpdateDatabaseDdlRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .addAllStatements(statements)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = databaseAdminClient.updateDatabaseDdlCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateDatabaseDdlRequest, Operation> updateDatabaseDdlCallable() {
    return updateDatabaseDdlCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Drops (aka deletes) a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   databaseAdminClient.dropDatabase(database);
   * }
   * </code></pre>
   *
   * @param database Required. The database to be dropped.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void dropDatabase(DatabaseName database) {

    DropDatabaseRequest request =
        DropDatabaseRequest.newBuilder().setDatabaseWithDatabaseName(database).build();
    dropDatabase(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Drops (aka deletes) a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   DropDatabaseRequest request = DropDatabaseRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   databaseAdminClient.dropDatabase(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final void dropDatabase(DropDatabaseRequest request) {
    dropDatabaseCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Drops (aka deletes) a Cloud Spanner database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   DropDatabaseRequest request = DropDatabaseRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = databaseAdminClient.dropDatabaseCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DropDatabaseRequest, Empty> dropDatabaseCallable() {
    return dropDatabaseCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   * method does not show pending schema updates, those may be queried using the
   * [Operations][google.longrunning.Operations] API.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   GetDatabaseDdlResponse response = databaseAdminClient.getDatabaseDdl(database);
   * }
   * </code></pre>
   *
   * @param database Required. The database whose schema we wish to get.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final GetDatabaseDdlResponse getDatabaseDdl(DatabaseName database) {

    GetDatabaseDdlRequest request =
        GetDatabaseDdlRequest.newBuilder().setDatabaseWithDatabaseName(database).build();
    return getDatabaseDdl(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   * method does not show pending schema updates, those may be queried using the
   * [Operations][google.longrunning.Operations] API.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   GetDatabaseDdlRequest request = GetDatabaseDdlRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   GetDatabaseDdlResponse response = databaseAdminClient.getDatabaseDdl(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final GetDatabaseDdlResponse getDatabaseDdl(GetDatabaseDdlRequest request) {
    return getDatabaseDdlCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   * method does not show pending schema updates, those may be queried using the
   * [Operations][google.longrunning.Operations] API.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   GetDatabaseDdlRequest request = GetDatabaseDdlRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   ApiFuture&lt;GetDatabaseDdlResponse&gt; future = databaseAdminClient.getDatabaseDdlCallable().futureCall(request);
   *   // Do something
   *   GetDatabaseDdlResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetDatabaseDdlRequest, GetDatabaseDdlResponse>
      getDatabaseDdlCallable() {
    return getDatabaseDdlCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on a database resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.databases.setIamPolicy` permission on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = databaseAdminClient.setIamPolicy(formattedResource, policy);
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
   * Sets the access control policy on a database resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.databases.setIamPolicy` permission on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .setPolicy(policy)
   *     .build();
   *   Policy response = databaseAdminClient.setIamPolicy(request);
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
   * Sets the access control policy on a database resource. Replaces any existing policy.
   *
   * <p>Authorization requires `spanner.databases.setIamPolicy` permission on
   * [resource][google.iam.v1.SetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .setPolicy(policy)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = databaseAdminClient.setIamPolicyCallable().futureCall(request);
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
   * Gets the access control policy for a database resource. Returns an empty policy if a database
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.databases.getIamPolicy` permission on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   Policy response = databaseAdminClient.getIamPolicy(formattedResource);
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
   * Gets the access control policy for a database resource. Returns an empty policy if a database
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.databases.getIamPolicy` permission on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .build();
   *   Policy response = databaseAdminClient.getIamPolicy(request);
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
   * Gets the access control policy for a database resource. Returns an empty policy if a database
   * exists but does not have a policy set.
   *
   * <p>Authorization requires `spanner.databases.getIamPolicy` permission on
   * [resource][google.iam.v1.GetIamPolicyRequest.resource].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = databaseAdminClient.getIamPolicyCallable().futureCall(request);
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
   * Returns permissions that the caller has on the specified database resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND
   * error if the user has `spanner.databases.list` permission on the containing Cloud Spanner
   * instance. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsResponse response = databaseAdminClient.testIamPermissions(formattedResource, permissions);
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
   * Returns permissions that the caller has on the specified database resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND
   * error if the user has `spanner.databases.list` permission on the containing Cloud Spanner
   * instance. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .addAllPermissions(permissions)
   *     .build();
   *   TestIamPermissionsResponse response = databaseAdminClient.testIamPermissions(request);
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
   * Returns permissions that the caller has on the specified database resource.
   *
   * <p>Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND
   * error if the user has `spanner.databases.list` permission on the containing Cloud Spanner
   * instance. Otherwise returns an empty set of permissions.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
   *   String formattedResource = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]").toString();
   *   List&lt;String&gt; permissions = new ArrayList&lt;&gt;();
   *   TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
   *     .setResource(formattedResource)
   *     .addAllPermissions(permissions)
   *     .build();
   *   ApiFuture&lt;TestIamPermissionsResponse&gt; future = databaseAdminClient.testIamPermissionsCallable().futureCall(request);
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
