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

package com.google.longrunning;

import com.google.api.gax.core.PagedListResponse;
import com.google.api.gax.testing.MockGrpcService;
import com.google.api.gax.testing.MockServiceHelper;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class OperationsTest {
  private static MockOperations mockOperations;
  private static MockServiceHelper serviceHelper;
  private OperationsApi api;

  @BeforeClass
  public static void startStaticServer() {
    mockOperations = new MockOperations();
    serviceHelper =
        new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockOperations));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    OperationsSettings settings =
        OperationsSettings.defaultBuilder()
            .provideChannelWith(serviceHelper.createChannel(), true)
            .build();
    api = OperationsApi.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    api.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getOperationTest() {
    String formattedName2 = OperationsApi.formatOperationPathName("[OPERATION_PATH]");
    boolean done = true;
    Operation expectedResponse =
        Operation.newBuilder().setName(formattedName2).setDone(done).build();
    List<GeneratedMessageV3> expectedResponses = new ArrayList<>();
    expectedResponses.add(expectedResponse);
    mockOperations.setResponses(expectedResponses);

    String formattedName = OperationsApi.formatOperationPathName("[OPERATION_PATH]");

    Operation actualResponse = api.getOperation(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockOperations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetOperationRequest actualRequest = (GetOperationRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
  }

  @Test
  @SuppressWarnings("all")
  public void listOperationsTest() {
    String nextPageToken = "";
    Operation operationsElement = Operation.newBuilder().build();
    List<Operation> operations = Arrays.asList(operationsElement);
    ListOperationsResponse expectedResponse =
        ListOperationsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllOperations(operations)
            .build();
    List<GeneratedMessageV3> expectedResponses = new ArrayList<>();
    expectedResponses.add(expectedResponse);
    mockOperations.setResponses(expectedResponses);

    String name = "name3373707";
    String filter = "filter-1274492040";

    PagedListResponse<ListOperationsRequest, ListOperationsResponse, Operation> pagedListResponse =
        api.listOperations(name, filter);

    List<Operation> resources = Lists.newArrayList(pagedListResponse.iterateAllElements());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getOperationsList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockOperations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListOperationsRequest actualRequest = (ListOperationsRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(filter, actualRequest.getFilter());
  }

  @Test
  @SuppressWarnings("all")
  public void cancelOperationTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    List<GeneratedMessageV3> expectedResponses = new ArrayList<>();
    expectedResponses.add(expectedResponse);
    mockOperations.setResponses(expectedResponses);

    String formattedName = OperationsApi.formatOperationPathName("[OPERATION_PATH]");

    api.cancelOperation(formattedName);

    List<GeneratedMessageV3> actualRequests = mockOperations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelOperationRequest actualRequest = (CancelOperationRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteOperationTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    List<GeneratedMessageV3> expectedResponses = new ArrayList<>();
    expectedResponses.add(expectedResponse);
    mockOperations.setResponses(expectedResponses);

    String formattedName = OperationsApi.formatOperationPathName("[OPERATION_PATH]");

    api.deleteOperation(formattedName);

    List<GeneratedMessageV3> actualRequests = mockOperations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteOperationRequest actualRequest = (DeleteOperationRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
  }
}
