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

import static com.google.cloud.spanner.admin.instance.spi.v1.PagedResponseWrappers.ListInstanceConfigsPagedResponse;
import static com.google.cloud.spanner.admin.instance.spi.v1.PagedResponseWrappers.ListInstancesPagedResponse;

import com.google.api.gax.grpc.ApiException;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.GeneratedMessageV3;
import com.google.spanner.admin.instance.v1.CreateInstanceRequest;
import com.google.spanner.admin.instance.v1.DeleteInstanceRequest;
import com.google.spanner.admin.instance.v1.GetInstanceConfigRequest;
import com.google.spanner.admin.instance.v1.GetInstanceRequest;
import com.google.spanner.admin.instance.v1.Instance;
import com.google.spanner.admin.instance.v1.InstanceConfig;
import com.google.spanner.admin.instance.v1.InstanceConfigName;
import com.google.spanner.admin.instance.v1.InstanceName;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest;
import com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse;
import com.google.spanner.admin.instance.v1.ListInstancesRequest;
import com.google.spanner.admin.instance.v1.ListInstancesResponse;
import com.google.spanner.admin.instance.v1.ProjectName;
import com.google.spanner.admin.instance.v1.UpdateInstanceRequest;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class InstanceAdminClientTest {
  private static MockInstanceAdmin mockInstanceAdmin;
  private static MockServiceHelper serviceHelper;
  private InstanceAdminClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockInstanceAdmin = new MockInstanceAdmin();
    serviceHelper =
        new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockInstanceAdmin));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    InstanceAdminSettings settings =
        InstanceAdminSettings.defaultBuilder()
            .setChannelProvider(serviceHelper.createChannelProvider())
            .build();
    client = InstanceAdminClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceConfigsTest() {
    String nextPageToken = "";
    InstanceConfig instanceConfigsElement = InstanceConfig.newBuilder().build();
    List<InstanceConfig> instanceConfigs = Arrays.asList(instanceConfigsElement);
    ListInstanceConfigsResponse expectedResponse =
        ListInstanceConfigsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllInstanceConfigs(instanceConfigs)
            .build();
    mockInstanceAdmin.addResponse(expectedResponse);

    ProjectName parent = ProjectName.create("[PROJECT]");

    ListInstanceConfigsPagedResponse pagedListResponse = client.listInstanceConfigs(parent);

    List<InstanceConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstanceConfigsList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstanceConfigsRequest actualRequest = (ListInstanceConfigsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, actualRequest.getParentAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstanceConfigsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      ProjectName parent = ProjectName.create("[PROJECT]");

      client.listInstanceConfigs(parent);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceConfigTest() {
    InstanceConfigName name2 = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
    String displayName = "displayName1615086568";
    InstanceConfig expectedResponse =
        InstanceConfig.newBuilder()
            .setNameWithInstanceConfigName(name2)
            .setDisplayName(displayName)
            .build();
    mockInstanceAdmin.addResponse(expectedResponse);

    InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");

    InstanceConfig actualResponse = client.getInstanceConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInstanceConfigRequest actualRequest = (GetInstanceConfigRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getNameAsInstanceConfigName());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      InstanceConfigName name = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");

      client.getInstanceConfig(name);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesTest() {
    String nextPageToken = "";
    Instance instancesElement = Instance.newBuilder().build();
    List<Instance> instances = Arrays.asList(instancesElement);
    ListInstancesResponse expectedResponse =
        ListInstancesResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllInstances(instances)
            .build();
    mockInstanceAdmin.addResponse(expectedResponse);

    ProjectName parent = ProjectName.create("[PROJECT]");

    ListInstancesPagedResponse pagedListResponse = client.listInstances(parent);

    List<Instance> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInstancesList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInstancesRequest actualRequest = (ListInstancesRequest) actualRequests.get(0);

    Assert.assertEquals(parent, actualRequest.getParentAsProjectName());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      ProjectName parent = ProjectName.create("[PROJECT]");

      client.listInstances(parent);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceTest() {
    InstanceName name2 = InstanceName.create("[PROJECT]", "[INSTANCE]");
    InstanceConfigName config = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
    String displayName = "displayName1615086568";
    int nodeCount = 1539922066;
    Instance expectedResponse =
        Instance.newBuilder()
            .setNameWithInstanceName(name2)
            .setConfigWithInstanceConfigName(config)
            .setDisplayName(displayName)
            .setNodeCount(nodeCount)
            .build();
    mockInstanceAdmin.addResponse(expectedResponse);

    InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");

    Instance actualResponse = client.getInstance(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInstanceRequest actualRequest = (GetInstanceRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getNameAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void getInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");

      client.getInstance(name);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createInstanceTest() throws Exception {
    InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
    InstanceConfigName config = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
    String displayName = "displayName1615086568";
    int nodeCount = 1539922066;
    Instance expectedResponse =
        Instance.newBuilder()
            .setNameWithInstanceName(name)
            .setConfigWithInstanceConfigName(config)
            .setDisplayName(displayName)
            .setNodeCount(nodeCount)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceAdmin.addResponse(resultOperation);

    ProjectName parent = ProjectName.create("[PROJECT]");
    InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
    Instance instance = Instance.newBuilder().build();

    Instance actualResponse = client.createInstanceAsync(parent, instanceId, instance).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateInstanceRequest actualRequest = (CreateInstanceRequest) actualRequests.get(0);

    Assert.assertEquals(parent, actualRequest.getParentAsProjectName());
    Assert.assertEquals(instanceId, actualRequest.getInstanceIdAsInstanceName());
    Assert.assertEquals(instance, actualRequest.getInstance());
  }

  @Test
  @SuppressWarnings("all")
  public void createInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      ProjectName parent = ProjectName.create("[PROJECT]");
      InstanceName instanceId = InstanceName.create("[PROJECT]", "[INSTANCE]");
      Instance instance = Instance.newBuilder().build();

      client.createInstanceAsync(parent, instanceId, instance).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(ApiException.class, e.getCause().getClass());
      ApiException apiException = (ApiException) e.getCause();
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), apiException.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateInstanceTest() throws Exception {
    InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");
    InstanceConfigName config = InstanceConfigName.create("[PROJECT]", "[INSTANCE_CONFIG]");
    String displayName = "displayName1615086568";
    int nodeCount = 1539922066;
    Instance expectedResponse =
        Instance.newBuilder()
            .setNameWithInstanceName(name)
            .setConfigWithInstanceConfigName(config)
            .setDisplayName(displayName)
            .setNodeCount(nodeCount)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateInstanceTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInstanceAdmin.addResponse(resultOperation);

    Instance instance = Instance.newBuilder().build();
    FieldMask fieldMask = FieldMask.newBuilder().build();

    Instance actualResponse = client.updateInstanceAsync(instance, fieldMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateInstanceRequest actualRequest = (UpdateInstanceRequest) actualRequests.get(0);

    Assert.assertEquals(instance, actualRequest.getInstance());
    Assert.assertEquals(fieldMask, actualRequest.getFieldMask());
  }

  @Test
  @SuppressWarnings("all")
  public void updateInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      Instance instance = Instance.newBuilder().build();
      FieldMask fieldMask = FieldMask.newBuilder().build();

      client.updateInstanceAsync(instance, fieldMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(ApiException.class, e.getCause().getClass());
      ApiException apiException = (ApiException) e.getCause();
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), apiException.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockInstanceAdmin.addResponse(expectedResponse);

    InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");

    client.deleteInstance(name);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInstanceRequest actualRequest = (DeleteInstanceRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getNameAsInstanceName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteInstanceExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      InstanceName name = InstanceName.create("[PROJECT]", "[INSTANCE]");

      client.deleteInstance(name);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicyTest() {
    int version = 351608024;
    ByteString etag = ByteString.copyFromUtf8("21");
    Policy expectedResponse = Policy.newBuilder().setVersion(version).setEtag(etag).build();
    mockInstanceAdmin.addResponse(expectedResponse);

    String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
    Policy policy = Policy.newBuilder().build();

    Policy actualResponse = client.setIamPolicy(formattedResource, policy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = (SetIamPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResource, actualRequest.getResource());
    Assert.assertEquals(policy, actualRequest.getPolicy());
  }

  @Test
  @SuppressWarnings("all")
  public void setIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
      Policy policy = Policy.newBuilder().build();

      client.setIamPolicy(formattedResource, policy);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicyTest() {
    int version = 351608024;
    ByteString etag = ByteString.copyFromUtf8("21");
    Policy expectedResponse = Policy.newBuilder().setVersion(version).setEtag(etag).build();
    mockInstanceAdmin.addResponse(expectedResponse);

    String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();

    Policy actualResponse = client.getIamPolicy(formattedResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = (GetIamPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResource, actualRequest.getResource());
  }

  @Test
  @SuppressWarnings("all")
  public void getIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();

      client.getIamPolicy(formattedResource);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsTest() {
    TestIamPermissionsResponse expectedResponse = TestIamPermissionsResponse.newBuilder().build();
    mockInstanceAdmin.addResponse(expectedResponse);

    String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
    List<String> permissions = new ArrayList<>();

    TestIamPermissionsResponse actualResponse =
        client.testIamPermissions(formattedResource, permissions);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockInstanceAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = (TestIamPermissionsRequest) actualRequests.get(0);

    Assert.assertEquals(formattedResource, actualRequest.getResource());
    Assert.assertEquals(permissions, actualRequest.getPermissionsList());
  }

  @Test
  @SuppressWarnings("all")
  public void testIamPermissionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockInstanceAdmin.addException(exception);

    try {
      String formattedResource = InstanceName.create("[PROJECT]", "[INSTANCE]").toString();
      List<String> permissions = new ArrayList<>();

      client.testIamPermissions(formattedResource, permissions);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }
}
