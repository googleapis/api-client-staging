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
package com.google.cloud.errorreporting.v1beta1.stub;

import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListEventsPagedResponse;
import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListGroupStatsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Stackdriver Error Reporting API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class ErrorStatsServiceStub implements BackgroundResource {

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsPagedResponse>
      listGroupStatsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listGroupStatsPagedCallable()");
  }

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsResponse> listGroupStatsCallable() {
    throw new UnsupportedOperationException("Not implemented: listGroupStatsCallable()");
  }

  public UnaryCallable<ListEventsRequest, ListEventsPagedResponse> listEventsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listEventsPagedCallable()");
  }

  public UnaryCallable<ListEventsRequest, ListEventsResponse> listEventsCallable() {
    throw new UnsupportedOperationException("Not implemented: listEventsCallable()");
  }

  public UnaryCallable<DeleteEventsRequest, DeleteEventsResponse> deleteEventsCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteEventsCallable()");
  }
}
