<?php
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

/*
 * GENERATED CODE WARNING
 * This file was automatically generated - do not edit!
 */

namespace Google\Cloud\Tests\Spanner\Admin\Instance\V1;

use Google\Cloud\Spanner\Admin\Instance\V1\InstanceAdminClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\iam\v1\Policy;
use google\iam\v1\TestIamPermissionsResponse;
use google\longrunning\GetOperationRequest;
use google\longrunning\Operation;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use google\protobuf\FieldMask;
use google\spanner\admin\instance\v1\Instance;
use google\spanner\admin\instance\v1\InstanceConfig;
use google\spanner\admin\instance\v1\ListInstanceConfigsResponse;
use google\spanner\admin\instance\v1\ListInstancesResponse;
use stdClass;

/**
 * @group instance
 * @group grpc
 */
class InstanceAdminClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockInstanceAdminImpl($hostname, $opts)
    {
        return new MockInstanceAdminImpl($hostname, $opts);
    }

    public function createMockOperationsStub($hostname, $opts)
    {
        return new MockOperationsImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            InstanceAdminClient::SERVICE_ADDRESS,
            InstanceAdminClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return InstanceAdminClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new InstanceAdminClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listInstanceConfigsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $instanceConfigsElement = new InstanceConfig();
        $instanceConfigs = [$instanceConfigsElement];
        $expectedResponse = new ListInstanceConfigsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($instanceConfigs as $elem) {
            $expectedResponse->addInstanceConfigs($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');

        $response = $client->listInstanceConfigs($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getInstanceConfigsList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/ListInstanceConfigs', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInstanceConfigsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');

        try {
            $client->listInstanceConfigs($formattedParent);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $expectedResponse = new InstanceConfig();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceConfigName('[PROJECT]', '[INSTANCE_CONFIG]');

        $response = $client->getInstanceConfig($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/GetInstanceConfig', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceConfigName('[PROJECT]', '[INSTANCE_CONFIG]');

        try {
            $client->getInstanceConfig($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInstancesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $instancesElement = new Instance();
        $instances = [$instancesElement];
        $expectedResponse = new ListInstancesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($instances as $elem) {
            $expectedResponse->addInstances($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');

        $response = $client->listInstances($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getInstancesList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/ListInstances', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInstancesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');

        try {
            $client->listInstances($formattedParent);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $config = 'config-1354792126';
        $displayName = 'displayName1615086568';
        $nodeCount = 1539922066;
        $expectedResponse = new Instance();
        $expectedResponse->setName($name2);
        $expectedResponse->setConfig($config);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setNodeCount($nodeCount);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->getInstance($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/GetInstance', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->getInstance($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createInstanceTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInstanceTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $config = 'config-1354792126';
        $displayName = 'displayName1615086568';
        $nodeCount = 1539922066;
        $expectedResponse = new Instance();
        $expectedResponse->setName($name);
        $expectedResponse->setConfig($config);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setNodeCount($nodeCount);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createInstanceTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');
        $instanceId = 'instanceId-2101995259';
        $instance = new Instance();

        $response = $client->createInstance($formattedParent, $instanceId, $instance);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->getReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/CreateInstance', $actualApiFuncCall);
        $this->assertEquals($formattedParent, $actualApiRequestObject->getParent());
        $this->assertEquals($instanceId, $actualApiRequestObject->getInstanceId());
        $this->assertEquals($instance, $actualApiRequestObject->getInstance());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInstanceTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->getReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->getReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function createInstanceExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInstanceTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedParent = InstanceAdminClient::formatProjectName('[PROJECT]');
        $instanceId = 'instanceId-2101995259';
        $instance = new Instance();

        $response = $client->createInstance($formattedParent, $instanceId, $instance);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInstanceTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stubs are exhausted
        $grpcStub->getReceivedCalls();
        $operationsStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateInstanceTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateInstanceTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $config = 'config-1354792126';
        $displayName = 'displayName1615086568';
        $nodeCount = 1539922066;
        $expectedResponse = new Instance();
        $expectedResponse->setName($name);
        $expectedResponse->setConfig($config);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setNodeCount($nodeCount);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/updateInstanceTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $instance = new Instance();
        $fieldMask = new FieldMask();

        $response = $client->updateInstance($instance, $fieldMask);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->getReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/UpdateInstance', $actualApiFuncCall);
        $this->assertEquals($instance, $actualApiRequestObject->getInstance());
        $this->assertEquals($fieldMask, $actualApiRequestObject->getFieldMask());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateInstanceTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->getReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->getReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateInstanceExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateInstanceTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $operationsStub->addResponse(null, $status);

        // Mock request
        $instance = new Instance();
        $fieldMask = new FieldMask();

        $response = $client->updateInstance($instance, $fieldMask);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateInstanceTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stubs are exhausted
        $grpcStub->getReceivedCalls();
        $operationsStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteInstanceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        $client->deleteInstance($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/DeleteInstance', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteInstanceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->deleteInstance($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $policy = new Policy();

        $response = $client->setIamPolicy($formattedResource, $policy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/SetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($policy, $actualRequestObject->getPolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $policy = new Policy();

        try {
            $client->setIamPolicy($formattedResource, $policy);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->getIamPolicy($formattedResource);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/GetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->getIamPolicy($formattedResource);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.instance.v1.InstanceAdmin/TestIamPermissions', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($permissions, $actualRequestObject->getPermissionsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockInstanceAdminImpl']);
        $client = $this->createClient('createInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = InstanceAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $permissions = [];

        try {
            $client->testIamPermissions($formattedResource, $permissions);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
