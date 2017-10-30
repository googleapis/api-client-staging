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

namespace Google\Cloud\Tests\Unit\Bigtable\V2;

use Google\Cloud\Bigtable\V2\BigtableClient;
use Google\Bigtable\V2\BigtableGrpcClient;
use Google\Bigtable\V2\CheckAndMutateRowRequest;
use Google\Bigtable\V2\CheckAndMutateRowResponse;
use Google\Bigtable\V2\MutateRowRequest;
use Google\Bigtable\V2\MutateRowResponse;
use Google\Bigtable\V2\MutateRowsRequest;
use Google\Bigtable\V2\MutateRowsRequest_Entry as Entry;
use Google\Bigtable\V2\MutateRowsResponse;
use Google\Bigtable\V2\Mutation;
use Google\Bigtable\V2\ReadModifyWriteRowRequest;
use Google\Bigtable\V2\ReadModifyWriteRowResponse;
use Google\Bigtable\V2\ReadModifyWriteRule;
use Google\Bigtable\V2\ReadRowsRequest;
use Google\Bigtable\V2\ReadRowsResponse;
use Google\Bigtable\V2\SampleRowKeysRequest;
use Google\Bigtable\V2\SampleRowKeysResponse;
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
 * @group bigtable
 * @group grpc
 */
class BigtableClientTest extends GeneratedTest
{
    public function createMockBigtableImpl($hostname, $opts)
    {
        return new MockBigtableImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => BigtableClient::SERVICE_ADDRESS,
            'port' => BigtableClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);
        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return BigtableClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new BigtableClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function readRowsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $lastScannedRowKey = '-126';
        $expectedResponse = new ReadRowsResponse();
        $expectedResponse->setLastScannedRowKey($lastScannedRowKey);
        $grpcStub->addResponse($expectedResponse);
        $lastScannedRowKey2 = '-75';
        $expectedResponse2 = new ReadRowsResponse();
        $expectedResponse2->setLastScannedRowKey($lastScannedRowKey2);
        $grpcStub->addResponse($expectedResponse2);
        $lastScannedRowKey3 = '-74';
        $expectedResponse3 = new ReadRowsResponse();
        $expectedResponse3->setLastScannedRowKey($lastScannedRowKey3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $serverStream = $client->readRows($formattedTableName);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responses = iterator_to_array($serverStream->readAll());

        $expectedResponses = [];
        $expectedResponses[] = $expectedResponse;
        $expectedResponses[] = $expectedResponse2;
        $expectedResponses[] = $expectedResponse3;
        $this->assertEquals($expectedResponses, $responses);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/ReadRows', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function readRowsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $serverStream = $client->readRows($formattedTableName);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        }  catch (ApiException $ex) {
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
    public function sampleRowKeysTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $rowKey = '122';
        $offsetBytes = 889884095;
        $expectedResponse = new SampleRowKeysResponse();
        $expectedResponse->setRowKey($rowKey);
        $expectedResponse->setOffsetBytes($offsetBytes);
        $grpcStub->addResponse($expectedResponse);
        $rowKey2 = '-83';
        $offsetBytes2 = 480126386;
        $expectedResponse2 = new SampleRowKeysResponse();
        $expectedResponse2->setRowKey($rowKey2);
        $expectedResponse2->setOffsetBytes($offsetBytes2);
        $grpcStub->addResponse($expectedResponse2);
        $rowKey3 = '-82';
        $offsetBytes3 = 480126387;
        $expectedResponse3 = new SampleRowKeysResponse();
        $expectedResponse3->setRowKey($rowKey3);
        $expectedResponse3->setOffsetBytes($offsetBytes3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $serverStream = $client->sampleRowKeys($formattedTableName);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responses = iterator_to_array($serverStream->readAll());

        $expectedResponses = [];
        $expectedResponses[] = $expectedResponse;
        $expectedResponses[] = $expectedResponse2;
        $expectedResponses[] = $expectedResponse3;
        $this->assertEquals($expectedResponses, $responses);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/SampleRowKeys', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function sampleRowKeysExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');

        $serverStream = $client->sampleRowKeys($formattedTableName);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        }  catch (ApiException $ex) {
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
    public function mutateRowTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new MutateRowResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';
        $mutations = [];

        $response = $client->mutateRow($formattedTableName, $rowKey, $mutations);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/MutateRow', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());
        $this->assertProtobufEquals($rowKey, $actualRequestObject->getRowKey());
        $this->assertProtobufEquals($mutations, $actualRequestObject->getMutations());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function mutateRowExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

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
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';
        $mutations = [];

        try {
            $client->mutateRow($formattedTableName, $rowKey, $mutations);
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
    public function mutateRowsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new MutateRowsResponse();
        $grpcStub->addResponse($expectedResponse);
        $expectedResponse2 = new MutateRowsResponse();
        $grpcStub->addResponse($expectedResponse2);
        $expectedResponse3 = new MutateRowsResponse();
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $entries = [];

        $serverStream = $client->mutateRows($formattedTableName, $entries);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responses = iterator_to_array($serverStream->readAll());

        $expectedResponses = [];
        $expectedResponses[] = $expectedResponse;
        $expectedResponses[] = $expectedResponse2;
        $expectedResponses[] = $expectedResponse3;
        $this->assertEquals($expectedResponses, $responses);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/MutateRows', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());
        $this->assertProtobufEquals($entries, $actualRequestObject->getEntries());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function mutateRowsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $entries = [];

        $serverStream = $client->mutateRows($formattedTableName, $entries);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        }  catch (ApiException $ex) {
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
    public function checkAndMutateRowTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $predicateMatched = true;
        $expectedResponse = new CheckAndMutateRowResponse();
        $expectedResponse->setPredicateMatched($predicateMatched);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';

        $response = $client->checkAndMutateRow($formattedTableName, $rowKey);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/CheckAndMutateRow', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());
        $this->assertProtobufEquals($rowKey, $actualRequestObject->getRowKey());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function checkAndMutateRowExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

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
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';

        try {
            $client->checkAndMutateRow($formattedTableName, $rowKey);
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
    public function readModifyWriteRowTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ReadModifyWriteRowResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';
        $rules = [];

        $response = $client->readModifyWriteRow($formattedTableName, $rowKey, $rules);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.bigtable.v2.Bigtable/ReadModifyWriteRow', $actualFuncCall);

        $this->assertProtobufEquals($formattedTableName, $actualRequestObject->getTableName());
        $this->assertProtobufEquals($rowKey, $actualRequestObject->getRowKey());
        $this->assertProtobufEquals($rules, $actualRequestObject->getRules());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function readModifyWriteRowExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockBigtableImpl']);
        $client = $this->createClient('createBigtableStubFunction', $grpcStub);

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
        $formattedTableName = $client->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
        $rowKey = '122';
        $rules = [];

        try {
            $client->readModifyWriteRow($formattedTableName, $rowKey, $rules);
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