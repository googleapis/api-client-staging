/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.logging.spi.v2;

import com.google.api.MonitoredResourceDescriptor;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.PageStreamingDescriptor;
import com.google.api.gax.grpc.PagedListResponseImpl;
import com.google.api.gax.grpc.UnaryApiCallable;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogMetricsRequest;
import com.google.logging.v2.ListLogMetricsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.ListSinksRequest;
import com.google.logging.v2.ListSinksResponse;
import com.google.logging.v2.LogEntry;
import com.google.logging.v2.LogMetric;
import com.google.logging.v2.LogSink;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@javax.annotation.Generated("by GAPIC")
public class PagedResponseWrappers {

  public static class ListLogEntriesPagedResponse
      extends PagedListResponseImpl<ListLogEntriesRequest, ListLogEntriesResponse, LogEntry> {

    public ListLogEntriesPagedResponse(
        UnaryApiCallable<ListLogEntriesRequest, ListLogEntriesResponse> callable,
        PageStreamingDescriptor<ListLogEntriesRequest, ListLogEntriesResponse, LogEntry>
            pageDescriptor,
        ListLogEntriesRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListMonitoredResourceDescriptorsPagedResponse
      extends PagedListResponseImpl<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor> {

    public ListMonitoredResourceDescriptorsPagedResponse(
        UnaryApiCallable<
                ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
            callable,
        PageStreamingDescriptor<
                ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            pageDescriptor,
        ListMonitoredResourceDescriptorsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListSinksPagedResponse
      extends PagedListResponseImpl<ListSinksRequest, ListSinksResponse, LogSink> {

    public ListSinksPagedResponse(
        UnaryApiCallable<ListSinksRequest, ListSinksResponse> callable,
        PageStreamingDescriptor<ListSinksRequest, ListSinksResponse, LogSink> pageDescriptor,
        ListSinksRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListLogMetricsPagedResponse
      extends PagedListResponseImpl<ListLogMetricsRequest, ListLogMetricsResponse, LogMetric> {

    public ListLogMetricsPagedResponse(
        UnaryApiCallable<ListLogMetricsRequest, ListLogMetricsResponse> callable,
        PageStreamingDescriptor<ListLogMetricsRequest, ListLogMetricsResponse, LogMetric>
            pageDescriptor,
        ListLogMetricsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }
}
