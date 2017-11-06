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

/**
 * A client to Google Cloud Bigtable API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>============== BigtableClient ==============
 *
 * <p>Service Description: Service for reading from and writing to existing Bigtable tables.
 *
 * <p>Sample for BigtableClient:
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
 */
package com.google.cloud.bigtable.v2;
