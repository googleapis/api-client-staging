<?php
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

/*
 * GENERATED CODE WARNING
 * This file was automatically generated - do not edit!
 */

namespace Google\Cloud\Tests\Unit\Bigtable\Admin\V2;

use Google\Cloud\Bigtable\Admin\V2\BigtableInstanceAdminClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\LongRunning\OperationsClient;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Bigtable\Admin\V2\Cluster;
use Google\Cloud\Bigtable\Admin\V2\Instance;
use Google\Cloud\Bigtable\Admin\V2\Instance_Type as Type;
use Google\Cloud\Bigtable\Admin\V2\ListClustersResponse;
use Google\Cloud\Bigtable\Admin\V2\ListInstancesResponse;
use Google\Cloud\Bigtable\Admin\V2\StorageType;
use Google\LongRunning\GetOperationRequest;
use Google\LongRunning\Operation;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group admin
 * @group grpc
 */
class BigtableInstanceAdminClientTest extends GeneratedTest
{
    public function createMockBigtableInstanceAdminImpl($hostname, $opts)
    {
        return new MockBigtableInstanceAdminImpl($hostname, $opts);
    }

    public function createMockBigtableTableAdminImpl($hostname, $opts)
    {
        return new MockBigtableTableAdminImpl($hostname, $opts);
    }

    public function createMockOperationsStub($hostname, $opts)
    {
        return new MockOperationsImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => BigtableInstanceAdminClient::SERVICE_ADDRESS,
            'port' => BigtableInstanceAdminClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return BigtableInstanceAdminClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new BigtableInstanceAdminClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
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
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInstanceTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $expectedResponse = new Instance();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createInstanceTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');
        $instanceId = 'instanceId-2101995259';
        $instance = new Instance();
        $clusters = [];

        $response = $client->createInstance($formattedParent, $instanceId, $instance, $clusters);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/CreateInstance', $actualApiFuncCall);
        $this->assertProtobufEquals($formattedParent, $actualApiRequestObject->getParent());
        $this->assertProtobufEquals($instanceId, $actualApiRequestObject->getInstanceId());
        $this->assertProtobufEquals($instance, $actualApiRequestObject->getInstance());
        $this->assertProtobufEquals($clusters, $actualApiRequestObject->getClusters());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInstanceTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
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
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInstanceTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');
        $instanceId = 'instanceId-2101995259';
        $instance = new Instance();
        $clusters = [];

        $response = $client->createInstance($formattedParent, $instanceId, $instance, $clusters);
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
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $expectedResponse = new Instance();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->getInstance($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/GetInstance', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInstanceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->getInstance($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInstancesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = 'nextPageToken-1530815211';
        $expectedResponse = new ListInstancesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->listInstances($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/ListInstances', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInstancesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->listInstances($formattedParent);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateInstanceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName2 = 'displayName21615000987';
        $expectedResponse = new Instance();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $displayName = 'displayName1615086568';
        $type = Type::TYPE_UNSPECIFIED;

        $response = $client->updateInstance($formattedName, $displayName, $type);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateInstance', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($displayName, $actualRequestObject->getDisplayName());
        $this->assertProtobufEquals($type, $actualRequestObject->getType());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateInstanceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $displayName = 'displayName1615086568';
        $type = Type::TYPE_UNSPECIFIED;

        try {
            $client->updateInstance($formattedName, $displayName, $type);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteInstanceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');

        $client->deleteInstance($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteInstance', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteInstanceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->instanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->deleteInstance($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createClusterTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createClusterTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $location = 'location1901043637';
        $serveNodes = -1288838783;
        $expectedResponse = new Cluster();
        $expectedResponse->setName($name);
        $expectedResponse->setLocation($location);
        $expectedResponse->setServeNodes($serveNodes);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createClusterTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $clusterId = 'clusterId240280960';
        $cluster = new Cluster();

        $response = $client->createCluster($formattedParent, $clusterId, $cluster);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/CreateCluster', $actualApiFuncCall);
        $this->assertProtobufEquals($formattedParent, $actualApiRequestObject->getParent());
        $this->assertProtobufEquals($clusterId, $actualApiRequestObject->getClusterId());
        $this->assertProtobufEquals($cluster, $actualApiRequestObject->getCluster());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createClusterTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
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
    public function createClusterExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createClusterTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $clusterId = 'clusterId240280960';
        $cluster = new Cluster();

        $response = $client->createCluster($formattedParent, $clusterId, $cluster);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createClusterTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function getClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $location = 'location1901043637';
        $serveNodes = -1288838783;
        $expectedResponse = new Cluster();
        $expectedResponse->setName($name2);
        $expectedResponse->setLocation($location);
        $expectedResponse->setServeNodes($serveNodes);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        $response = $client->getCluster($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/GetCluster', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        try {
            $client->getCluster($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listClustersTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = 'nextPageToken-1530815211';
        $expectedResponse = new ListClustersResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->listClusters($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/ListClusters', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listClustersExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->listClusters($formattedParent);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateClusterTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateClusterTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name2 = 'name2-1052831874';
        $location2 = 'location21541837352';
        $serveNodes2 = -1623486220;
        $expectedResponse = new Cluster();
        $expectedResponse->setName($name2);
        $expectedResponse->setLocation($location2);
        $expectedResponse->setServeNodes($serveNodes2);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/updateClusterTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');
        $location = 'location1901043637';
        $serveNodes = -1288838783;
        $defaultStorageType = StorageType::STORAGE_TYPE_UNSPECIFIED;

        $response = $client->updateCluster($formattedName, $location, $serveNodes, $defaultStorageType);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateCluster', $actualApiFuncCall);
        $this->assertProtobufEquals($formattedName, $actualApiRequestObject->getName());
        $this->assertProtobufEquals($location, $actualApiRequestObject->getLocation());
        $this->assertProtobufEquals($serveNodes, $actualApiRequestObject->getServeNodes());
        $this->assertProtobufEquals($defaultStorageType, $actualApiRequestObject->getDefaultStorageType());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateClusterTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
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
    public function updateClusterExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateClusterTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');
        $location = 'location1901043637';
        $serveNodes = -1288838783;
        $defaultStorageType = StorageType::STORAGE_TYPE_UNSPECIFIED;

        $response = $client->updateCluster($formattedName, $location, $serveNodes, $defaultStorageType);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateClusterTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        $client->deleteCluster($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteCluster', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableInstanceAdminImpl']);
        $client = $this->createClient('createBigtableInstanceAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        try {
            $client->deleteCluster($formattedName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
