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

use Google\Cloud\Bigtable\Admin\V2\BigtableTableAdminClient;
use Google\Bigtable\Admin\V2\BigtableTableAdminGrpcClient;
use Google\Bigtable\Admin\V2\CreateTableRequest;
use Google\Bigtable\Admin\V2\DeleteTableRequest;
use Google\Bigtable\Admin\V2\DropRowRangeRequest;
use Google\Bigtable\Admin\V2\GetTableRequest;
use Google\Bigtable\Admin\V2\ListTablesRequest;
use Google\Bigtable\Admin\V2\ListTablesResponse;
use Google\Bigtable\Admin\V2\ModifyColumnFamiliesRequest;
use Google\Bigtable\Admin\V2\ModifyColumnFamiliesRequest_Modification as Modification;
use Google\Bigtable\Admin\V2\Table;
use Google\GAX\ApiException;
use Google\GAX\BidiStream;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\ServerStream;
use Google\GAX\Testing\GeneratedTest;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Google\GAX\Testing\MockStubTrait;
use Google\Longrunning\GetOperationRequest;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use PHPUnit_Framework_TestCase;
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

}