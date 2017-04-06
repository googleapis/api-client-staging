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
package com.google.cloud.compute.spi.v1;

import com.google.api.gax.grpc.ApiException;
import com.google.api.gax.testing.MockGrpcService;
import com.google.api.gax.testing.MockServiceHelper;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstancesDeleteRequest;
import com.google.cloud.compute.v1.InstancesGetRequest;
import com.google.cloud.compute.v1.InstancesInsertRequest;
import com.google.cloud.compute.v1.Operation;
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
public class InstancesServiceClientTest {
  private static MockInstancesService mockInstancesService;
  private static MockServiceHelper serviceHelper;
  private InstancesServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockInstancesService = new MockInstancesService();
    serviceHelper =
        new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockInstancesService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    InstancesServiceSettings settings =
        InstancesServiceSettings.defaultBuilder()
            .setChannelProvider(serviceHelper.createChannelProvider())
            .build();
    client = InstancesServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceTest() {
    String kind = "kind3292052";
    long id = 3355;
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String description = "description-1724546052";
    String machineType = "machineType1838323762";
    String statusMessage = "statusMessage-239442758";
    String zone2 = "zone2-696322977";
    boolean canIpForward = true;
    String selfLink = "selfLink-1691268851";
    String cpuPlatform = "cpuPlatform947156266";
    Instance expectedResponse =
        Instance.newBuilder()
            .setKind(kind)
            .setId(id)
            .setCreationTimestamp(creationTimestamp)
            .setName(name)
            .setDescription(description)
            .setMachineType(machineType)
            .setStatusMessage(statusMessage)
            .setZone(zone2)
            .setCanIpForward(canIpForward)
            .setSelfLink(selfLink)
            .setCpuPlatform(cpuPlatform)
            .build();
    mockInstancesService.addResponse(expectedResponse);

    String project = "project-309310695";
    String zone = "zone3744684";
    String instance = "instance555127957";

    Instance actualResponse = client.getInstance(project, zone, instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstancesService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstancesGetRequest actualRequest = (InstancesGetRequest) actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProject());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(instance, actualRequest.getInstance());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstancesService.addException(exception);

    try {
      String project = "project-309310695";
      String zone = "zone3744684";
      String instance = "instance555127957";

      client.getInstance(project, zone, instance);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceTest() {
    String kind = "kind3292052";
    long id = 3355;
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String clientOperationId = "clientOperationId-239630617";
    String operationType = "operationType-1432962286";
    String targetLink = "targetLink-2084812312";
    long targetId = -815576439;
    String statusMessage = "statusMessage-239442758";
    String user = "user3599307";
    int progress = -1001078227;
    String insertTime = "insertTime-103148397";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    int httpErrorStatusCode = 1386087020;
    String httpErrorMessage = "httpErrorMessage1276263769";
    String selfLink = "selfLink-1691268851";
    String region = "region-934795532";
    String description = "description-1724546052";
    Operation expectedResponse =
        Operation.newBuilder()
            .setKind(kind)
            .setId(id)
            .setCreationTimestamp(creationTimestamp)
            .setName(name)
            .setZone(zone2)
            .setClientOperationId(clientOperationId)
            .setOperationType(operationType)
            .setTargetLink(targetLink)
            .setTargetId(targetId)
            .setStatusMessage(statusMessage)
            .setUser(user)
            .setProgress(progress)
            .setInsertTime(insertTime)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .setHttpErrorStatusCode(httpErrorStatusCode)
            .setHttpErrorMessage(httpErrorMessage)
            .setSelfLink(selfLink)
            .setRegion(region)
            .setDescription(description)
            .build();
    mockInstancesService.addResponse(expectedResponse);

    String project = "project-309310695";
    String zone = "zone3744684";
    Instance resource = Instance.newBuilder().build();

    Operation actualResponse = client.insertInstance(project, zone, resource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstancesService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstancesInsertRequest actualRequest = (InstancesInsertRequest) actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProject());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(resource, actualRequest.getResource());
  }

  @Test
  @SuppressWarnings("all")
  public void insertInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstancesService.addException(exception);

    try {
      String project = "project-309310695";
      String zone = "zone3744684";
      Instance resource = Instance.newBuilder().build();

      client.insertInstance(project, zone, resource);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceTest() {
    String kind = "kind3292052";
    long id = 3355;
    String creationTimestamp = "creationTimestamp567396278";
    String name = "name3373707";
    String zone2 = "zone2-696322977";
    String clientOperationId = "clientOperationId-239630617";
    String operationType = "operationType-1432962286";
    String targetLink = "targetLink-2084812312";
    long targetId = -815576439;
    String statusMessage = "statusMessage-239442758";
    String user = "user3599307";
    int progress = -1001078227;
    String insertTime = "insertTime-103148397";
    String startTime = "startTime-1573145462";
    String endTime = "endTime1725551537";
    int httpErrorStatusCode = 1386087020;
    String httpErrorMessage = "httpErrorMessage1276263769";
    String selfLink = "selfLink-1691268851";
    String region = "region-934795532";
    String description = "description-1724546052";
    Operation expectedResponse =
        Operation.newBuilder()
            .setKind(kind)
            .setId(id)
            .setCreationTimestamp(creationTimestamp)
            .setName(name)
            .setZone(zone2)
            .setClientOperationId(clientOperationId)
            .setOperationType(operationType)
            .setTargetLink(targetLink)
            .setTargetId(targetId)
            .setStatusMessage(statusMessage)
            .setUser(user)
            .setProgress(progress)
            .setInsertTime(insertTime)
            .setStartTime(startTime)
            .setEndTime(endTime)
            .setHttpErrorStatusCode(httpErrorStatusCode)
            .setHttpErrorMessage(httpErrorMessage)
            .setSelfLink(selfLink)
            .setRegion(region)
            .setDescription(description)
            .build();
    mockInstancesService.addResponse(expectedResponse);

    String project = "project-309310695";
    String zone = "zone3744684";
    String instance = "instance555127957";

    Operation actualResponse = client.deleteInstance(project, zone, instance);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstancesService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    InstancesDeleteRequest actualRequest = (InstancesDeleteRequest) actualRequests.get(0);

    Assert.assertEquals(project, actualRequest.getProject());
    Assert.assertEquals(zone, actualRequest.getZone());
    Assert.assertEquals(instance, actualRequest.getInstance());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstancesService.addException(exception);

    try {
      String project = "project-309310695";
      String zone = "zone3744684";
      String instance = "instance555127957";

      client.deleteInstance(project, zone, instance);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }
}
