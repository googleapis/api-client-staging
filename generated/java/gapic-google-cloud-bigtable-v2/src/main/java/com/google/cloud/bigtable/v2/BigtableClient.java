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
package com.google.cloud.bigtable.v2;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.bigtable.v2.CheckAndMutateRowRequest;
import com.google.bigtable.v2.CheckAndMutateRowResponse;
import com.google.bigtable.v2.MutateRowRequest;
import com.google.bigtable.v2.MutateRowResponse;
import com.google.bigtable.v2.MutateRowsRequest;
import com.google.bigtable.v2.MutateRowsResponse;
import com.google.bigtable.v2.Mutation;
import com.google.bigtable.v2.ReadModifyWriteRowRequest;
import com.google.bigtable.v2.ReadModifyWriteRowResponse;
import com.google.bigtable.v2.ReadModifyWriteRule;
import com.google.bigtable.v2.ReadRowsRequest;
import com.google.bigtable.v2.ReadRowsResponse;
import com.google.bigtable.v2.RowFilter;
import com.google.bigtable.v2.SampleRowKeysRequest;
import com.google.bigtable.v2.SampleRowKeysResponse;
import com.google.bigtable.v2.TableName;
import com.google.cloud.bigtable.v2.stub.BigtableStub;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service for reading from and writing to existing Bigtable tables.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (BigtableClient bigtableClient = BigtableClient.create()) {
 *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
 *   ByteString rowKey = ByteString.copyFromUtf8("");
 *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
 *   MutateRowResponse response = bigtableClient.mutateRow(tableName, rowKey, mutations);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the bigtableClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of BigtableSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * BigtableSettings bigtableSettings =
 *     BigtableSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BigtableClient bigtableClient =
 *     BigtableClient.create(bigtableSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * BigtableSettings bigtableSettings =
 *     BigtableSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BigtableClient bigtableClient =
 *     BigtableClient.create(bigtableSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class BigtableClient implements BackgroundResource {
  private final BigtableSettings settings;
  private final BigtableStub stub;

  /** Constructs an instance of BigtableClient with default settings. */
  public static final BigtableClient create() throws IOException {
    return create(BigtableSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BigtableClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BigtableClient create(BigtableSettings settings) throws IOException {
    return new BigtableClient(settings);
  }

  /**
   * Constructs an instance of BigtableClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use BigtableSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final BigtableClient create(BigtableStub stub) {
    return new BigtableClient(stub);
  }

  /**
   * Constructs an instance of BigtableClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected BigtableClient(BigtableSettings settings) throws IOException {
    this.settings = settings;
    this.stub = settings.createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected BigtableClient(BigtableStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BigtableSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public BigtableStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Streams back the contents of all requested rows in key order, optionally applying the same
   * Reader filter to each. Depending on their size, rows and cells may be broken up across multiple
   * responses, but atomicity of each row will still be preserved. See the ReadRowsResponse
   * documentation for details.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   ApiStreamObserver&lt;ReadRowsResponse&gt; responseObserver =
   *       new ApiStreamObserver&lt;ReadRowsResponse&gt;() {
   *         {@literal @}Override
   *         public void onNext(ReadRowsResponse response) {
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
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ReadRowsRequest request = ReadRowsRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .build();
   *
   *   bigtableClient.readRowsCallable().serverStreamingCall(request, responseObserver));
   * }
   * </code></pre>
   */
  public final ServerStreamingCallable<ReadRowsRequest, ReadRowsResponse> readRowsCallable() {
    return stub.readRowsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a sample of row keys in the table. The returned row keys will delimit contiguous
   * sections of the table of approximately equal size, which can be used to break up the data for
   * distributed tasks like mapreduces.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   ApiStreamObserver&lt;SampleRowKeysResponse&gt; responseObserver =
   *       new ApiStreamObserver&lt;SampleRowKeysResponse&gt;() {
   *         {@literal @}Override
   *         public void onNext(SampleRowKeysResponse response) {
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
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   SampleRowKeysRequest request = SampleRowKeysRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .build();
   *
   *   bigtableClient.sampleRowKeysCallable().serverStreamingCall(request, responseObserver));
   * }
   * </code></pre>
   */
  public final ServerStreamingCallable<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysCallable() {
    return stub.sampleRowKeysCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically. Cells already present in the row are left unchanged unless explicitly
   * changed by `mutation`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   MutateRowResponse response = bigtableClient.mutateRow(tableName, rowKey, mutations);
   * }
   * </code></pre>
   *
   * @param tableName The unique name of the table to which the mutation should be applied. Values
   *     are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * @param rowKey The key of the row to which the mutation should be applied.
   * @param mutations Changes to be atomically applied to the specified row. Entries are applied in
   *     order, meaning that earlier mutations can be masked by later ones. Must contain at least
   *     one entry and at most 100000.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRowResponse mutateRow(
      TableName tableName, ByteString rowKey, List<Mutation> mutations) {

    MutateRowRequest request =
        MutateRowRequest.newBuilder()
            .setTableNameWithTableName(tableName)
            .setRowKey(rowKey)
            .addAllMutations(mutations)
            .build();
    return mutateRow(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically. Cells already present in the row are left unchanged unless explicitly
   * changed by `mutation`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   MutateRowRequest request = MutateRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .addAllMutations(mutations)
   *     .build();
   *   MutateRowResponse response = bigtableClient.mutateRow(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateRowResponse mutateRow(MutateRowRequest request) {
    return mutateRowCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically. Cells already present in the row are left unchanged unless explicitly
   * changed by `mutation`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   MutateRowRequest request = MutateRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .addAllMutations(mutations)
   *     .build();
   *   ApiFuture&lt;MutateRowResponse&gt; future = bigtableClient.mutateRowCallable().futureCall(request);
   *   // Do something
   *   MutateRowResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateRowRequest, MutateRowResponse> mutateRowCallable() {
    return stub.mutateRowCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates multiple rows in a batch. Each individual row is mutated atomically as in MutateRow,
   * but the entire batch is not executed atomically.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   ApiStreamObserver&lt;MutateRowsResponse&gt; responseObserver =
   *       new ApiStreamObserver&lt;MutateRowsResponse&gt;() {
   *         {@literal @}Override
   *         public void onNext(MutateRowsResponse response) {
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
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   List&lt;MutateRowsRequest.Entry&gt; entries = new ArrayList&lt;&gt;();
   *   MutateRowsRequest request = MutateRowsRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .addAllEntries(entries)
   *     .build();
   *
   *   bigtableClient.mutateRowsCallable().serverStreamingCall(request, responseObserver));
   * }
   * </code></pre>
   */
  public final ServerStreamingCallable<MutateRowsRequest, MutateRowsResponse> mutateRowsCallable() {
    return stub.mutateRowsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically based on the output of a predicate Reader filter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   RowFilter predicateFilter = RowFilter.newBuilder().build();
   *   List&lt;Mutation&gt; trueMutations = new ArrayList&lt;&gt;();
   *   List&lt;Mutation&gt; falseMutations = new ArrayList&lt;&gt;();
   *   CheckAndMutateRowResponse response = bigtableClient.checkAndMutateRow(tableName, rowKey, predicateFilter, trueMutations, falseMutations);
   * }
   * </code></pre>
   *
   * @param tableName The unique name of the table to which the conditional mutation should be
   *     applied. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * @param rowKey The key of the row to which the conditional mutation should be applied.
   * @param predicateFilter The filter to be applied to the contents of the specified row. Depending
   *     on whether or not any results are yielded, either `true_mutations` or `false_mutations`
   *     will be executed. If unset, checks that the row contains any values at all.
   * @param trueMutations Changes to be atomically applied to the specified row if
   *     `predicate_filter` yields at least one cell when applied to `row_key`. Entries are applied
   *     in order, meaning that earlier mutations can be masked by later ones. Must contain at least
   *     one entry if `false_mutations` is empty, and at most 100000.
   * @param falseMutations Changes to be atomically applied to the specified row if
   *     `predicate_filter` does not yield any cells when applied to `row_key`. Entries are applied
   *     in order, meaning that earlier mutations can be masked by later ones. Must contain at least
   *     one entry if `true_mutations` is empty, and at most 100000.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckAndMutateRowResponse checkAndMutateRow(
      TableName tableName,
      ByteString rowKey,
      RowFilter predicateFilter,
      List<Mutation> trueMutations,
      List<Mutation> falseMutations) {

    CheckAndMutateRowRequest request =
        CheckAndMutateRowRequest.newBuilder()
            .setTableNameWithTableName(tableName)
            .setRowKey(rowKey)
            .setPredicateFilter(predicateFilter)
            .addAllTrueMutations(trueMutations)
            .addAllFalseMutations(falseMutations)
            .build();
    return checkAndMutateRow(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically based on the output of a predicate Reader filter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   CheckAndMutateRowRequest request = CheckAndMutateRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .build();
   *   CheckAndMutateRowResponse response = bigtableClient.checkAndMutateRow(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckAndMutateRowResponse checkAndMutateRow(CheckAndMutateRowRequest request) {
    return checkAndMutateRowCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Mutates a row atomically based on the output of a predicate Reader filter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   CheckAndMutateRowRequest request = CheckAndMutateRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .build();
   *   ApiFuture&lt;CheckAndMutateRowResponse&gt; future = bigtableClient.checkAndMutateRowCallable().futureCall(request);
   *   // Do something
   *   CheckAndMutateRowResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowCallable() {
    return stub.checkAndMutateRowCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies a row atomically. The method reads the latest existing timestamp and value from the
   * specified columns and writes a new entry based on pre-defined read/modify/write rules. The new
   * value for the timestamp is the greater of the existing timestamp or the current server time.
   * The method returns the new contents of all modified cells.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;ReadModifyWriteRule&gt; rules = new ArrayList&lt;&gt;();
   *   ReadModifyWriteRowResponse response = bigtableClient.readModifyWriteRow(tableName, rowKey, rules);
   * }
   * </code></pre>
   *
   * @param tableName The unique name of the table to which the read/modify/write rules should be
   *     applied. Values are of the form
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * @param rowKey The key of the row to which the read/modify/write rules should be applied.
   * @param rules Rules specifying how the specified row's contents are to be transformed into
   *     writes. Entries are applied in order, meaning that earlier rules will affect the results of
   *     later ones.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReadModifyWriteRowResponse readModifyWriteRow(
      TableName tableName, ByteString rowKey, List<ReadModifyWriteRule> rules) {

    ReadModifyWriteRowRequest request =
        ReadModifyWriteRowRequest.newBuilder()
            .setTableNameWithTableName(tableName)
            .setRowKey(rowKey)
            .addAllRules(rules)
            .build();
    return readModifyWriteRow(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies a row atomically. The method reads the latest existing timestamp and value from the
   * specified columns and writes a new entry based on pre-defined read/modify/write rules. The new
   * value for the timestamp is the greater of the existing timestamp or the current server time.
   * The method returns the new contents of all modified cells.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;ReadModifyWriteRule&gt; rules = new ArrayList&lt;&gt;();
   *   ReadModifyWriteRowRequest request = ReadModifyWriteRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .addAllRules(rules)
   *     .build();
   *   ReadModifyWriteRowResponse response = bigtableClient.readModifyWriteRow(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReadModifyWriteRowResponse readModifyWriteRow(ReadModifyWriteRowRequest request) {
    return readModifyWriteRowCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Modifies a row atomically. The method reads the latest existing timestamp and value from the
   * specified columns and writes a new entry based on pre-defined read/modify/write rules. The new
   * value for the timestamp is the greater of the existing timestamp or the current server time.
   * The method returns the new contents of all modified cells.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (BigtableClient bigtableClient = BigtableClient.create()) {
   *   TableName tableName = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ByteString rowKey = ByteString.copyFromUtf8("");
   *   List&lt;ReadModifyWriteRule&gt; rules = new ArrayList&lt;&gt;();
   *   ReadModifyWriteRowRequest request = ReadModifyWriteRowRequest.newBuilder()
   *     .setTableNameWithTableName(tableName)
   *     .setRowKey(rowKey)
   *     .addAllRules(rules)
   *     .build();
   *   ApiFuture&lt;ReadModifyWriteRowResponse&gt; future = bigtableClient.readModifyWriteRowCallable().futureCall(request);
   *   // Do something
   *   ReadModifyWriteRowResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowCallable() {
    return stub.readModifyWriteRowCallable();
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
