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
package com.google.cloud.monitoring.spi.v3;

import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResource;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.PageStreamingDescriptor;
import com.google.api.gax.grpc.PagedListResponseImpl;
import com.google.api.gax.grpc.UnaryApiCallable;
import com.google.monitoring.v3.Group;
import com.google.monitoring.v3.ListGroupMembersRequest;
import com.google.monitoring.v3.ListGroupMembersResponse;
import com.google.monitoring.v3.ListGroupsRequest;
import com.google.monitoring.v3.ListGroupsResponse;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ListMetricDescriptorsResponse;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse;
import com.google.monitoring.v3.ListTimeSeriesRequest;
import com.google.monitoring.v3.ListTimeSeriesResponse;
import com.google.monitoring.v3.TimeSeries;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@javax.annotation.Generated("by GAPIC")
public class PagedResponseWrappers {

  public static class ListGroupsPagedResponse
      extends PagedListResponseImpl<ListGroupsRequest, ListGroupsResponse, Group> {

    public ListGroupsPagedResponse(
        UnaryApiCallable<ListGroupsRequest, ListGroupsResponse> callable,
        PageStreamingDescriptor<ListGroupsRequest, ListGroupsResponse, Group> pageDescriptor,
        ListGroupsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListGroupMembersPagedResponse
      extends PagedListResponseImpl<
          ListGroupMembersRequest, ListGroupMembersResponse, MonitoredResource> {

    public ListGroupMembersPagedResponse(
        UnaryApiCallable<ListGroupMembersRequest, ListGroupMembersResponse> callable,
        PageStreamingDescriptor<
                ListGroupMembersRequest, ListGroupMembersResponse, MonitoredResource>
            pageDescriptor,
        ListGroupMembersRequest request,
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

  public static class ListMetricDescriptorsPagedResponse
      extends PagedListResponseImpl<
          ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor> {

    public ListMetricDescriptorsPagedResponse(
        UnaryApiCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse> callable,
        PageStreamingDescriptor<
                ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            pageDescriptor,
        ListMetricDescriptorsRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }

  public static class ListTimeSeriesPagedResponse
      extends PagedListResponseImpl<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> {

    public ListTimeSeriesPagedResponse(
        UnaryApiCallable<ListTimeSeriesRequest, ListTimeSeriesResponse> callable,
        PageStreamingDescriptor<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries>
            pageDescriptor,
        ListTimeSeriesRequest request,
        CallContext context) {
      super(callable, pageDescriptor, request, context);
    }
  }
}
