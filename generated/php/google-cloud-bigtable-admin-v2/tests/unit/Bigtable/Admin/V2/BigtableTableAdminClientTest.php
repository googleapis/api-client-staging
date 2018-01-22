<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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

use Google\Cloud\Bigtable\Admin\V2\BigtableTableAdminClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\LongRunning\OperationsClient;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Bigtable\Admin\V2\CheckConsistencyResponse;
use Google\Cloud\Bigtable\Admin\V2\GenerateConsistencyTokenResponse;
use Google\Cloud\Bigtable\Admin\V2\ListSnapshotsResponse;
use Google\Cloud\Bigtable\Admin\V2\ListTablesResponse;
use Google\Cloud\Bigtable\Admin\V2\Snapshot;
use Google\Cloud\Bigtable\Admin\V2\Table;
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
class BigtableTableAdminClientTest extends GeneratedTest
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
            'serviceAddress' => BigtableTableAdminClient::SERVICE_ADDRESS,
            'port' => BigtableTableAdminClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return BigtableTableAdminClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new BigtableTableAdminClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function createTableTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new Table();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $tableId = 'tableId-895419604';
        $table = new Table();

        $response = $client->createTable($formattedParent, $tableId, $table);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/CreateTable', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($tableId, $actualRequestObject->getTableId());
        $this->assertProtobufEquals($table, $actualRequestObject->getTable());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createTableExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $tableId = 'tableId-895419604';
        $table = new Table();

        try {
            $client->createTable($formattedParent, $tableId, $table);
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
    public function createTableFromSnapshotTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createTableFromSnapshotTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $expectedResponse = new Table();
        $expectedResponse->setName($name);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createTableFromSnapshotTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');
        $tableId = 'tableId-895419604';
        $sourceSnapshot = 'sourceSnapshot-947679896';

        $response = $client->createTableFromSnapshot($formattedParent, $tableId, $sourceSnapshot);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/CreateTableFromSnapshot', $actualApiFuncCall);
        $this->assertProtobufEquals($formattedParent, $actualApiRequestObject->getParent());
        $this->assertProtobufEquals($tableId, $actualApiRequestObject->getTableId());
        $this->assertProtobufEquals($sourceSnapshot, $actualApiRequestObject->getSourceSnapshot());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createTableFromSnapshotTest');

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
    public function createTableFromSnapshotExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createTableFromSnapshotTest');
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
        $tableId = 'tableId-895419604';
        $sourceSnapshot = 'sourceSnapshot-947679896';

        $response = $client->createTableFromSnapshot($formattedParent, $tableId, $sourceSnapshot);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createTableFromSnapshotTest');

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
    public function listTablesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $tablesElement = new Table();
        $tables = [$tablesElement];
        $expectedResponse = new ListTablesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTables($tables);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->instanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->listTables($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTables()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/ListTables', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTablesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
            $client->listTables($formattedParent);
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
    public function getTableTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Table();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $response = $client->getTable($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/GetTable', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTableExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        try {
            $client->getTable($formattedName);
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
    public function deleteTableTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $client->deleteTable($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/DeleteTable', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteTableExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        try {
            $client->deleteTable($formattedName);
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
    public function modifyColumnFamiliesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Table();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $modifications = [];

        $response = $client->modifyColumnFamilies($formattedName, $modifications);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/ModifyColumnFamilies', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($modifications, $actualRequestObject->getModifications());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyColumnFamiliesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $modifications = [];

        try {
            $client->modifyColumnFamilies($formattedName, $modifications);
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
    public function dropRowRangeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $client->dropRowRange($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/DropRowRange', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function dropRowRangeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        try {
            $client->dropRowRange($formattedName);
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
    public function generateConsistencyTokenTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $consistencyToken = 'consistencyToken-1090516718';
        $expectedResponse = new GenerateConsistencyTokenResponse();
        $expectedResponse->setConsistencyToken($consistencyToken);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $response = $client->generateConsistencyToken($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/GenerateConsistencyToken', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function generateConsistencyTokenExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        try {
            $client->generateConsistencyToken($formattedName);
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
    public function checkConsistencyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $consistent = true;
        $expectedResponse = new CheckConsistencyResponse();
        $expectedResponse->setConsistent($consistent);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $consistencyToken = 'consistencyToken-1090516718';

        $response = $client->checkConsistency($formattedName, $consistencyToken);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/CheckConsistency', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($consistencyToken, $actualRequestObject->getConsistencyToken());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function checkConsistencyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $consistencyToken = 'consistencyToken-1090516718';

        try {
            $client->checkConsistency($formattedName, $consistencyToken);
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
    public function snapshotTableTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name2);
        $expectedResponse->setDone($done);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $cluster = 'cluster872092154';
        $snapshotId = 'snapshotId-168585866';
        $description = 'description-1724546052';

        $response = $client->snapshotTable($formattedName, $cluster, $snapshotId, $description);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/SnapshotTable', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($cluster, $actualRequestObject->getCluster());
        $this->assertProtobufEquals($snapshotId, $actualRequestObject->getSnapshotId());
        $this->assertProtobufEquals($description, $actualRequestObject->getDescription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function snapshotTableExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $cluster = 'cluster872092154';
        $snapshotId = 'snapshotId-168585866';
        $description = 'description-1724546052';

        try {
            $client->snapshotTable($formattedName, $cluster, $snapshotId, $description);
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
    public function getSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $dataSizeBytes = 2110122398;
        $description = 'description-1724546052';
        $expectedResponse = new Snapshot();
        $expectedResponse->setName($name2);
        $expectedResponse->setDataSizeBytes($dataSizeBytes);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->snapshotName('[PROJECT]', '[INSTANCE]', '[CLUSTER]', '[SNAPSHOT]');

        $response = $client->getSnapshot($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/GetSnapshot', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->snapshotName('[PROJECT]', '[INSTANCE]', '[CLUSTER]', '[SNAPSHOT]');

        try {
            $client->getSnapshot($formattedName);
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
    public function listSnapshotsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $snapshotsElement = new Snapshot();
        $snapshots = [$snapshotsElement];
        $expectedResponse = new ListSnapshotsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setSnapshots($snapshots);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        $response = $client->listSnapshots($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSnapshots()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/ListSnapshots', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSnapshotsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedParent = $client->clusterName('[PROJECT]', '[INSTANCE]', '[CLUSTER]');

        try {
            $client->listSnapshots($formattedParent);
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
    public function deleteSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->snapshotName('[PROJECT]', '[INSTANCE]', '[CLUSTER]', '[SNAPSHOT]');

        $client->deleteSnapshot($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.admin.v2.BigtableTableAdmin/DeleteSnapshot', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableTableAdminImpl']);
        $client = $this->createClient('createBigtableTableAdminStubFunction', $grpcStub);

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
        $formattedName = $client->snapshotName('[PROJECT]', '[INSTANCE]', '[CLUSTER]', '[SNAPSHOT]');

        try {
            $client->deleteSnapshot($formattedName);
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
