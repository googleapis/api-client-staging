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
package com.google.cloud.bigtable.v2.stub;

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
import com.google.bigtable.v2.ReadModifyWriteRowRequest;
import com.google.bigtable.v2.ReadModifyWriteRowResponse;
import com.google.bigtable.v2.ReadRowsRequest;
import com.google.bigtable.v2.ReadRowsResponse;
import com.google.bigtable.v2.SampleRowKeysRequest;
import com.google.bigtable.v2.SampleRowKeysResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Cloud Bigtable API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class BigtableStub implements BackgroundResource {

  public ServerStreamingCallable<ReadRowsRequest, ReadRowsResponse> readRowsCallable() {
    throw new UnsupportedOperationException("Not implemented: readRowsCallable()");
  }

  public ServerStreamingCallable<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysCallable() {
    throw new UnsupportedOperationException("Not implemented: sampleRowKeysCallable()");
  }

  public UnaryCallable<MutateRowRequest, MutateRowResponse> mutateRowCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateRowCallable()");
  }

  public ServerStreamingCallable<MutateRowsRequest, MutateRowsResponse> mutateRowsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateRowsCallable()");
  }

  public UnaryCallable<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowCallable() {
    throw new UnsupportedOperationException("Not implemented: checkAndMutateRowCallable()");
  }

  public UnaryCallable<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowCallable() {
    throw new UnsupportedOperationException("Not implemented: readModifyWriteRowCallable()");
  }
}
