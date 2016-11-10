/*
 * Copyright 2016, Google Inc. All rights reserved.
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
package com.google.cloud.logging.spi.v2;

import static com.google.cloud.logging.spi.v2.PagedResponseWrappers.ListLogMetricsPagedResponse;

import com.google.api.gax.grpc.ApiException;
import com.google.api.gax.testing.MockGrpcService;
import com.google.api.gax.testing.MockServiceHelper;
import com.google.common.collect.Lists;
import com.google.logging.v2.CreateLogMetricRequest;
import com.google.logging.v2.DeleteLogMetricRequest;
import com.google.logging.v2.GetLogMetricRequest;
import com.google.logging.v2.ListLogMetricsRequest;
import com.google.logging.v2.ListLogMetricsResponse;
import com.google.logging.v2.LogMetric;
import com.google.logging.v2.UpdateLogMetricRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class MetricsServiceV2Test {
  private static MockLoggingServiceV2 mockLoggingServiceV2;
  private static MockConfigServiceV2 mockConfigServiceV2;
  private static MockMetricsServiceV2 mockMetricsServiceV2;
  private static MockServiceHelper serviceHelper;
  private MetricsServiceV2Api api;

  @BeforeClass
  public static void startStaticServer() {
    mockLoggingServiceV2 = new MockLoggingServiceV2();
    mockConfigServiceV2 = new MockConfigServiceV2();
    mockMetricsServiceV2 = new MockMetricsServiceV2();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1",
            Arrays.<MockGrpcService>asList(
                mockLoggingServiceV2, mockConfigServiceV2, mockMetricsServiceV2));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    MetricsServiceV2Settings settings =
        MetricsServiceV2Settings.defaultBuilder()
            .setChannelProvider(serviceHelper.createChannelProvider())
            .build();
    api = MetricsServiceV2Api.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    api.close();
  }

  @Test
  @SuppressWarnings("all")
  public void listLogMetricsTest() {
    String nextPageToken = "";
    LogMetric metricsElement = LogMetric.newBuilder().build();
    List<LogMetric> metrics = Arrays.asList(metricsElement);
    ListLogMetricsResponse expectedResponse =
        ListLogMetricsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllMetrics(metrics)
            .build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    String formattedParent = MetricsServiceV2Api.formatParentName("[PROJECT]");

    ListLogMetricsPagedResponse pagedListResponse = api.listLogMetrics(formattedParent);

    List<LogMetric> resources = Lists.newArrayList(pagedListResponse.iterateAllElements());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getMetricsList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListLogMetricsRequest actualRequest = (ListLogMetricsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
  }

  @Test
  @SuppressWarnings("all")
  public void listLogMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INTERNAL);
    mockMetricsServiceV2.addException(exception);

    try {
      String formattedParent = MetricsServiceV2Api.formatParentName("[PROJECT]");

      api.listLogMetrics(formattedParent);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INTERNAL.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getLogMetricTest() {
    String name = "name3373707";
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    LogMetric expectedResponse =
        LogMetric.newBuilder().setName(name).setDescription(description).setFilter(filter).build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");

    LogMetric actualResponse = api.getLogMetric(formattedMetricName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLogMetricRequest actualRequest = (GetLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(formattedMetricName, actualRequest.getMetricName());
  }

  @Test
  @SuppressWarnings("all")
  public void getLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INTERNAL);
    mockMetricsServiceV2.addException(exception);

    try {
      String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");

      api.getLogMetric(formattedMetricName);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INTERNAL.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createLogMetricTest() {
    String name = "name3373707";
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    LogMetric expectedResponse =
        LogMetric.newBuilder().setName(name).setDescription(description).setFilter(filter).build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    String formattedParent = MetricsServiceV2Api.formatParentName("[PROJECT]");
    LogMetric metric = LogMetric.newBuilder().build();

    LogMetric actualResponse = api.createLogMetric(formattedParent, metric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateLogMetricRequest actualRequest = (CreateLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(metric, actualRequest.getMetric());
  }

  @Test
  @SuppressWarnings("all")
  public void createLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INTERNAL);
    mockMetricsServiceV2.addException(exception);

    try {
      String formattedParent = MetricsServiceV2Api.formatParentName("[PROJECT]");
      LogMetric metric = LogMetric.newBuilder().build();

      api.createLogMetric(formattedParent, metric);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INTERNAL.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateLogMetricTest() {
    String name = "name3373707";
    String description = "description-1724546052";
    String filter = "filter-1274492040";
    LogMetric expectedResponse =
        LogMetric.newBuilder().setName(name).setDescription(description).setFilter(filter).build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");
    LogMetric metric = LogMetric.newBuilder().build();

    LogMetric actualResponse = api.updateLogMetric(formattedMetricName, metric);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateLogMetricRequest actualRequest = (UpdateLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(formattedMetricName, actualRequest.getMetricName());
    Assert.assertEquals(metric, actualRequest.getMetric());
  }

  @Test
  @SuppressWarnings("all")
  public void updateLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INTERNAL);
    mockMetricsServiceV2.addException(exception);

    try {
      String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");
      LogMetric metric = LogMetric.newBuilder().build();

      api.updateLogMetric(formattedMetricName, metric);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INTERNAL.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteLogMetricTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockMetricsServiceV2.addResponse(expectedResponse);

    String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");

    api.deleteLogMetric(formattedMetricName);

    List<GeneratedMessageV3> actualRequests = mockMetricsServiceV2.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteLogMetricRequest actualRequest = (DeleteLogMetricRequest) actualRequests.get(0);

    Assert.assertEquals(formattedMetricName, actualRequest.getMetricName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteLogMetricExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INTERNAL);
    mockMetricsServiceV2.addException(exception);

    try {
      String formattedMetricName = MetricsServiceV2Api.formatMetricName("[PROJECT]", "[METRIC]");

      api.deleteLogMetric(formattedMetricName);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INTERNAL.getCode(), e.getStatusCode());
    }
  }
}
