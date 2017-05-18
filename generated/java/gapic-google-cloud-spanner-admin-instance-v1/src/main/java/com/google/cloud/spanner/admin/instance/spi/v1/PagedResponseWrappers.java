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
package com.google.cloud.spanner.admin.instance.spi.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.AbstractFixedSizeCollection;
import com.google.api.gax.grpc.AbstractPage;
import com.google.api.gax.grpc.AbstractPagedListResponse;
import com.google.api.gax.grpc.PageContext;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@Generated("by GAPIC")
@BetaApi
public class PagedResponseWrappers {

  public static class ListInstanceConfigsPagedResponse
      extends AbstractPagedListResponse<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig,
          ListInstanceConfigsPage, ListInstanceConfigsFixedSizeCollection> {

    public static ApiFuture<ListInstanceConfigsPagedResponse> createAsync(
        PageContext<ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
            context,
        ApiFuture<ListInstanceConfigsResponse> futureResponse) {
      ApiFuture<ListInstanceConfigsPage> futurePage =
          ListInstanceConfigsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstanceConfigsPage, ListInstanceConfigsPagedResponse>() {
            @Override
            public ListInstanceConfigsPagedResponse apply(ListInstanceConfigsPage input) {
              return new ListInstanceConfigsPagedResponse(input);
            }
          });
    }

    private ListInstanceConfigsPagedResponse(ListInstanceConfigsPage page) {
      super(page, ListInstanceConfigsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInstanceConfigsPage
      extends AbstractPage<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig,
          ListInstanceConfigsPage> {

    private ListInstanceConfigsPage(
        PageContext<ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
            context,
        ListInstanceConfigsResponse response) {
      super(context, response);
    }

    private static ListInstanceConfigsPage createEmptyPage() {
      return new ListInstanceConfigsPage(null, null);
    }

    @Override
    protected ListInstanceConfigsPage createPage(
        PageContext<ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
            context,
        ListInstanceConfigsResponse response) {
      return new ListInstanceConfigsPage(context, response);
    }

    @Override
    protected ApiFuture<ListInstanceConfigsPage> createPageAsync(
        PageContext<ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig>
            context,
        ApiFuture<ListInstanceConfigsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInstanceConfigsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInstanceConfigsRequest, ListInstanceConfigsResponse, InstanceConfig,
          ListInstanceConfigsPage, ListInstanceConfigsFixedSizeCollection> {

    private ListInstanceConfigsFixedSizeCollection(
        List<ListInstanceConfigsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstanceConfigsFixedSizeCollection createEmptyCollection() {
      return new ListInstanceConfigsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstanceConfigsFixedSizeCollection createCollection(
        List<ListInstanceConfigsPage> pages, int collectionSize) {
      return new ListInstanceConfigsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListInstancesPagedResponse
      extends AbstractPagedListResponse<
          ListInstancesRequest, ListInstancesResponse, Instance, ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    public static ApiFuture<ListInstancesPagedResponse> createAsync(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ApiFuture<ListInstancesResponse> futureResponse) {
      ApiFuture<ListInstancesPage> futurePage =
          ListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListInstancesPage, ListInstancesPagedResponse>() {
            @Override
            public ListInstancesPagedResponse apply(ListInstancesPage input) {
              return new ListInstancesPagedResponse(input);
            }
          });
    }

    private ListInstancesPagedResponse(ListInstancesPage page) {
      super(page, ListInstancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInstancesPage
      extends AbstractPage<
          ListInstancesRequest, ListInstancesResponse, Instance, ListInstancesPage> {

    private ListInstancesPage(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ListInstancesResponse response) {
      super(context, response);
    }

    private static ListInstancesPage createEmptyPage() {
      return new ListInstancesPage(null, null);
    }

    @Override
    protected ListInstancesPage createPage(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ListInstancesResponse response) {
      return new ListInstancesPage(context, response);
    }

    @Override
    protected ApiFuture<ListInstancesPage> createPageAsync(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ApiFuture<ListInstancesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInstancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInstancesRequest, ListInstancesResponse, Instance, ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    private ListInstancesFixedSizeCollection(List<ListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesFixedSizeCollection createEmptyCollection() {
      return new ListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesFixedSizeCollection createCollection(
        List<ListInstancesPage> pages, int collectionSize) {
      return new ListInstancesFixedSizeCollection(pages, collectionSize);
    }
  }
}
