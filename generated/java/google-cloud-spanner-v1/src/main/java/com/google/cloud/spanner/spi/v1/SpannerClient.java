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
package com.google.cloud.spanner.spi.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.ChannelAndExecutor;
import com.google.api.gax.grpc.StreamingCallable;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.spanner.v1.BeginTransactionRequest;
import com.google.spanner.v1.CommitRequest;
import com.google.spanner.v1.CommitResponse;
import com.google.spanner.v1.CreateSessionRequest;
import com.google.spanner.v1.DatabaseName;
import com.google.spanner.v1.DeleteSessionRequest;
import com.google.spanner.v1.ExecuteSqlRequest;
import com.google.spanner.v1.GetSessionRequest;
import com.google.spanner.v1.Mutation;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.ResultSet;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.SessionName;
import com.google.spanner.v1.Transaction;
import com.google.spanner.v1.TransactionOptions;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Cloud Spanner API
 *
 * <p>The Cloud Spanner API can be used to manage sessions and execute transactions on data stored
 * in Cloud Spanner databases.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SpannerClient spannerClient = SpannerClient.create()) {
 *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
 *   Session response = spannerClient.createSession(database);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the spannerClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of SpannerSettings to create().
 * For example:
 *
 * <pre>
 * <code>
 * InstantiatingChannelProvider channelProvider =
 *     SpannerSettings.defaultChannelProviderBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SpannerSettings spannerSettings =
 *     SpannerSettings.defaultBuilder().setChannelProvider(channelProvider).build();
 * SpannerClient spannerClient =
 *     SpannerClient.create(spannerSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC")
@BetaApi
public class SpannerClient implements AutoCloseable {
  private final SpannerSettings settings;
  private final ScheduledExecutorService executor;
  private final ManagedChannel channel;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<CreateSessionRequest, Session> createSessionCallable;
  private final UnaryCallable<GetSessionRequest, Session> getSessionCallable;
  private final UnaryCallable<DeleteSessionRequest, Empty> deleteSessionCallable;
  private final UnaryCallable<ExecuteSqlRequest, ResultSet> executeSqlCallable;
  private final StreamingCallable<ExecuteSqlRequest, PartialResultSet> executeStreamingSqlCallable;
  private final UnaryCallable<ReadRequest, ResultSet> readCallable;
  private final StreamingCallable<ReadRequest, PartialResultSet> streamingReadCallable;
  private final UnaryCallable<BeginTransactionRequest, Transaction> beginTransactionCallable;
  private final UnaryCallable<CommitRequest, CommitResponse> commitCallable;
  private final UnaryCallable<RollbackRequest, Empty> rollbackCallable;

  /** Constructs an instance of SpannerClient with default settings. */
  public static final SpannerClient create() throws IOException {
    return create(SpannerSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of SpannerClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SpannerClient create(SpannerSettings settings) throws IOException {
    return new SpannerClient(settings);
  }

  /**
   * Constructs an instance of SpannerClient, using the given settings. This is protected so that it
   * easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected SpannerClient(SpannerSettings settings) throws IOException {
    this.settings = settings;
    ChannelAndExecutor channelAndExecutor = settings.getChannelAndExecutor();
    this.executor = channelAndExecutor.getExecutor();
    this.channel = channelAndExecutor.getChannel();

    this.createSessionCallable =
        UnaryCallable.create(settings.createSessionSettings(), this.channel, this.executor);
    this.getSessionCallable =
        UnaryCallable.create(settings.getSessionSettings(), this.channel, this.executor);
    this.deleteSessionCallable =
        UnaryCallable.create(settings.deleteSessionSettings(), this.channel, this.executor);
    this.executeSqlCallable =
        UnaryCallable.create(settings.executeSqlSettings(), this.channel, this.executor);
    this.executeStreamingSqlCallable =
        StreamingCallable.create(settings.executeStreamingSqlSettings(), this.channel);
    this.readCallable = UnaryCallable.create(settings.readSettings(), this.channel, this.executor);
    this.streamingReadCallable =
        StreamingCallable.create(settings.streamingReadSettings(), this.channel);
    this.beginTransactionCallable =
        UnaryCallable.create(settings.beginTransactionSettings(), this.channel, this.executor);
    this.commitCallable =
        UnaryCallable.create(settings.commitSettings(), this.channel, this.executor);
    this.rollbackCallable =
        UnaryCallable.create(settings.rollbackSettings(), this.channel, this.executor);

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

  public final SpannerSettings getSettings() {
    return settings;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   Session response = spannerClient.createSession(database);
   * }
   * </code></pre>
   *
   * @param database Required. The database in which the new session is created.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Session createSession(DatabaseName database) {

    CreateSessionRequest request =
        CreateSessionRequest.newBuilder().setDatabaseWithDatabaseName(database).build();
    return createSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   CreateSessionRequest request = CreateSessionRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   Session response = spannerClient.createSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Session createSession(CreateSessionRequest request) {
    return createSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   CreateSessionRequest request = CreateSessionRequest.newBuilder()
   *     .setDatabaseWithDatabaseName(database)
   *     .build();
   *   ApiFuture&lt;Session&gt; future = spannerClient.createSessionCallable().futureCall(request);
   *   // Do something
   *   Session response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSessionRequest, Session> createSessionCallable() {
    return createSessionCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   Session response = spannerClient.getSession(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the session to retrieve.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Session getSession(SessionName name) {

    GetSessionRequest request = GetSessionRequest.newBuilder().setNameWithSessionName(name).build();
    return getSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   GetSessionRequest request = GetSessionRequest.newBuilder()
   *     .setNameWithSessionName(name)
   *     .build();
   *   Session response = spannerClient.getSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Session getSession(GetSessionRequest request) {
    return getSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   GetSessionRequest request = GetSessionRequest.newBuilder()
   *     .setNameWithSessionName(name)
   *     .build();
   *   ApiFuture&lt;Session&gt; future = spannerClient.getSessionCallable().futureCall(request);
   *   // Do something
   *   Session response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSessionRequest, Session> getSessionCallable() {
    return getSessionCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   spannerClient.deleteSession(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the session to delete.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void deleteSession(SessionName name) {

    DeleteSessionRequest request =
        DeleteSessionRequest.newBuilder().setNameWithSessionName(name).build();
    deleteSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   DeleteSessionRequest request = DeleteSessionRequest.newBuilder()
   *     .setNameWithSessionName(name)
   *     .build();
   *   spannerClient.deleteSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final void deleteSession(DeleteSessionRequest request) {
    deleteSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   DeleteSessionRequest request = DeleteSessionRequest.newBuilder()
   *     .setNameWithSessionName(name)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = spannerClient.deleteSessionCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteSessionRequest, Empty> deleteSessionCallable() {
    return deleteSessionCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Executes an SQL query, returning all rows in a single reply. This method cannot be used to
   * return a result set larger than 10 MiB; if the query yields more data than that, the query
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Queries inside read-write transactions might return `ABORTED`. If this occurs, the
   * application should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be fetched in streaming fashion by calling
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setSql(sql)
   *     .build();
   *   ResultSet response = spannerClient.executeSql(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ResultSet executeSql(ExecuteSqlRequest request) {
    return executeSqlCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Executes an SQL query, returning all rows in a single reply. This method cannot be used to
   * return a result set larger than 10 MiB; if the query yields more data than that, the query
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Queries inside read-write transactions might return `ABORTED`. If this occurs, the
   * application should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be fetched in streaming fashion by calling
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setSql(sql)
   *     .build();
   *   ApiFuture&lt;ResultSet&gt; future = spannerClient.executeSqlCallable().futureCall(request);
   *   // Do something
   *   ResultSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ExecuteSqlRequest, ResultSet> executeSqlCallable() {
    return executeSqlCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result set as a
   * stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there is no limit on the
   * size of the returned result set. However, no individual row in the result set can exceed 100
   * MiB, and no column value can exceed 10 MiB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   ApiStreamObserver&lt;PartialResultSet&gt; responseObserver =
   *       new ApiStreamObserver&lt;PartialResultSet&gt;() {
   *         {@literal @}Override
   *         public void onNext(PartialResultSet response) {
   *           // Do something when receive a response
   *         }
   *
   *         {@literal @}Override
   *         public void onError(Throwable t) {
   *           // Add error-handling
   *         }
   *
   *         {@literal @}Override
   *         public void onCompleted() {
   *           // Do something when complete.
   *         }
   *       };
   *
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setSql(sql)
   *     .build();
   *
   *   spannerClient.executeStreamingSqlCallable().serverStreamingCall(request, responseObserver)});
   * }
   * </code></pre>
   */
  public final StreamingCallable<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlCallable() {
    return executeStreamingSqlCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Reads rows from the database using key lookups and scans, as a simple key/value style
   * alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   * to return a result set larger than 10 MiB; if the read matches more data than that, the read
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   * should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be yielded in streaming fashion by calling
   * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *   ResultSet response = spannerClient.read(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ResultSet read(ReadRequest request) {
    return readCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Reads rows from the database using key lookups and scans, as a simple key/value style
   * alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   * to return a result set larger than 10 MiB; if the read matches more data than that, the read
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   * should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be yielded in streaming fashion by calling
   * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *   ApiFuture&lt;ResultSet&gt; future = spannerClient.readCallable().futureCall(request);
   *   // Do something
   *   ResultSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ReadRequest, ResultSet> readCallable() {
    return readCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a stream. Unlike
   * [Read][google.spanner.v1.Spanner.Read], there is no limit on the size of the returned result
   * set. However, no individual row in the result set can exceed 100 MiB, and no column value can
   * exceed 10 MiB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   ApiStreamObserver&lt;PartialResultSet&gt; responseObserver =
   *       new ApiStreamObserver&lt;PartialResultSet&gt;() {
   *         {@literal @}Override
   *         public void onNext(PartialResultSet response) {
   *           // Do something when receive a response
   *         }
   *
   *         {@literal @}Override
   *         public void onError(Throwable t) {
   *           // Add error-handling
   *         }
   *
   *         {@literal @}Override
   *         public void onCompleted() {
   *           // Do something when complete.
   *         }
   *       };
   *
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *
   *   spannerClient.streamingReadCallable().serverStreamingCall(request, responseObserver)});
   * }
   * </code></pre>
   */
  public final StreamingCallable<ReadRequest, PartialResultSet> streamingReadCallable() {
    return streamingReadCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   Transaction response = spannerClient.beginTransaction(session, options);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction runs.
   * @param options Required. Options for the new transaction.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Transaction beginTransaction(SessionName session, TransactionOptions options) {

    BeginTransactionRequest request =
        BeginTransactionRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setOptions(options)
            .build();
    return beginTransaction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setOptions(options)
   *     .build();
   *   Transaction response = spannerClient.beginTransaction(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Transaction beginTransaction(BeginTransactionRequest request) {
    return beginTransactionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setOptions(options)
   *     .build();
   *   ApiFuture&lt;Transaction&gt; future = spannerClient.beginTransactionCallable().futureCall(request);
   *   // Do something
   *   Transaction response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BeginTransactionRequest, Transaction> beginTransactionCallable() {
    return beginTransactionCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitResponse response = spannerClient.commit(session, transactionId, mutations);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to be committed is running.
   * @param transactionId Commit a previously-started transaction.
   * @param mutations The mutations to be executed when this transaction commits. All mutations are
   *     applied atomically, in the order they appear in this list.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(
      SessionName session, ByteString transactionId, List<Mutation> mutations) {

    CommitRequest request =
        CommitRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setTransactionId(transactionId)
            .addAllMutations(mutations)
            .build();
    return commit(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions singleUseTransaction = TransactionOptions.newBuilder().build();
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitResponse response = spannerClient.commit(session, singleUseTransaction, mutations);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to be committed is running.
   * @param singleUseTransaction Execute mutations in a temporary transaction. Note that unlike
   *     commit of a previously-started transaction, commit with a temporary transaction is
   *     non-idempotent. That is, if the `CommitRequest` is sent to Cloud Spanner more than once
   *     (for instance, due to retries in the application, or in the transport library), it is
   *     possible that the mutations are executed more than once. If this is undesirable, use
   *     [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   *     [Commit][google.spanner.v1.Spanner.Commit] instead.
   * @param mutations The mutations to be executed when this transaction commits. All mutations are
   *     applied atomically, in the order they appear in this list.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(
      SessionName session, TransactionOptions singleUseTransaction, List<Mutation> mutations) {

    CommitRequest request =
        CommitRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setSingleUseTransaction(singleUseTransaction)
            .addAllMutations(mutations)
            .build();
    return commit(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitRequest request = CommitRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .addAllMutations(mutations)
   *     .build();
   *   CommitResponse response = spannerClient.commit(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(CommitRequest request) {
    return commitCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitRequest request = CommitRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .addAllMutations(mutations)
   *     .build();
   *   ApiFuture&lt;CommitResponse&gt; future = spannerClient.commitCallable().futureCall(request);
   *   // Do something
   *   CommitResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CommitRequest, CommitResponse> commitCallable() {
    return commitCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   spannerClient.rollback(session, transactionId);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to roll back is running.
   * @param transactionId Required. The transaction to roll back.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void rollback(SessionName session, ByteString transactionId) {

    RollbackRequest request =
        RollbackRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setTransactionId(transactionId)
            .build();
    rollback(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   RollbackRequest request = RollbackRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setTransactionId(transactionId)
   *     .build();
   *   spannerClient.rollback(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void rollback(RollbackRequest request) {
    rollbackCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   RollbackRequest request = RollbackRequest.newBuilder()
   *     .setSessionWithSessionName(session)
   *     .setTransactionId(transactionId)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = spannerClient.rollbackCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RollbackRequest, Empty> rollbackCallable() {
    return rollbackCallable;
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
