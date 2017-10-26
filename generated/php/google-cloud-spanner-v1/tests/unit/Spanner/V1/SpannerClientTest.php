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

namespace Google\Cloud\Tests\Unit\Spanner\V1;

use Google\Cloud\Spanner\V1\SpannerClient;
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
use Google\Spanner\V1\BeginTransactionRequest;
use Google\Spanner\V1\CommitRequest;
use Google\Spanner\V1\CommitResponse;
use Google\Spanner\V1\CreateSessionRequest;
use Google\Spanner\V1\DeleteSessionRequest;
use Google\Spanner\V1\ExecuteSqlRequest;
use Google\Spanner\V1\GetSessionRequest;
use Google\Spanner\V1\KeySet;
use Google\Spanner\V1\ListSessionsRequest;
use Google\Spanner\V1\ListSessionsResponse;
use Google\Spanner\V1\Mutation;
use Google\Spanner\V1\PartialResultSet;
use Google\Spanner\V1\ReadRequest;
use Google\Spanner\V1\ResultSet;
use Google\Spanner\V1\RollbackRequest;
use Google\Spanner\V1\Session;
use Google\Spanner\V1\SpannerGrpcClient;
use Google\Spanner\V1\Transaction;
use Google\Spanner\V1\TransactionOptions;
use Grpc;
use PHPUnit_Framework_TestCase;
use stdClass;

/**
 * @group spanner
 * @group grpc
 */
class SpannerClientTest extends GeneratedTest
{
    public function createMockSpannerImpl($hostname, $opts)
    {
        return new MockSpannerImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => SpannerClient::SERVICE_ADDRESS,
            'port' => SpannerClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);
        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return SpannerClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new SpannerClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function createSessionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new Session();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedDatabase = $client->databaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->createSession($formattedDatabase);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/CreateSession', $actualFuncCall);

        $this->assertProtobufEquals($formattedDatabase, $actualRequestObject->getDatabase());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSessionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedDatabase = $client->databaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->createSession($formattedDatabase);
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
    public function getSessionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Session();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        $response = $client->getSession($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/GetSession', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSessionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedName = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        try {
            $client->getSession($formattedName);
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
    public function listSessionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $sessionsElement = new Session();
        $sessions = [$sessionsElement];
        $expectedResponse = new ListSessionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setSessions($sessions);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedDatabase = $client->databaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->listSessions($formattedDatabase);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSessions()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/ListSessions', $actualFuncCall);

        $this->assertProtobufEquals($formattedDatabase, $actualRequestObject->getDatabase());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSessionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedDatabase = $client->databaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->listSessions($formattedDatabase);
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
    public function deleteSessionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        $client->deleteSession($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/DeleteSession', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSessionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedName = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        try {
            $client->deleteSession($formattedName);
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
    public function executeSqlTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ResultSet();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $response = $client->executeSql($formattedSession, $sql);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/ExecuteSql', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($sql, $actualRequestObject->getSql());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function executeSqlExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        try {
            $client->executeSql($formattedSession, $sql);
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
    public function executeStreamingSqlTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $chunkedValue = true;
        $resumeToken = '103';
        $expectedResponse = new PartialResultSet();
        $expectedResponse->setChunkedValue($chunkedValue);
        $expectedResponse->setResumeToken($resumeToken);
        $grpcStub->addResponse($expectedResponse);
        $chunkedValue2 = false;
        $resumeToken2 = '90';
        $expectedResponse2 = new PartialResultSet();
        $expectedResponse2->setChunkedValue($chunkedValue2);
        $expectedResponse2->setResumeToken($resumeToken2);
        $grpcStub->addResponse($expectedResponse2);
        $chunkedValue3 = true;
        $resumeToken3 = '91';
        $expectedResponse3 = new PartialResultSet();
        $expectedResponse3->setChunkedValue($chunkedValue3);
        $expectedResponse3->setResumeToken($resumeToken3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $serverStream = $client->executeStreamingSql($formattedSession, $sql);
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
        $this->assertSame('/google.spanner.v1.Spanner/ExecuteStreamingSql', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($sql, $actualRequestObject->getSql());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function executeStreamingSqlExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $serverStream = $client->executeStreamingSql($formattedSession, $sql);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
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
    public function readTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ResultSet();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        $response = $client->read($formattedSession, $table, $columns, $keySet);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Read', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($table, $actualRequestObject->getTable());
        $this->assertProtobufEquals($columns, $actualRequestObject->getColumns());
        $this->assertProtobufEquals($keySet, $actualRequestObject->getKeySet());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function readExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        try {
            $client->read($formattedSession, $table, $columns, $keySet);
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
    public function streamingReadTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $chunkedValue = true;
        $resumeToken = '103';
        $expectedResponse = new PartialResultSet();
        $expectedResponse->setChunkedValue($chunkedValue);
        $expectedResponse->setResumeToken($resumeToken);
        $grpcStub->addResponse($expectedResponse);
        $chunkedValue2 = false;
        $resumeToken2 = '90';
        $expectedResponse2 = new PartialResultSet();
        $expectedResponse2->setChunkedValue($chunkedValue2);
        $expectedResponse2->setResumeToken($resumeToken2);
        $grpcStub->addResponse($expectedResponse2);
        $chunkedValue3 = true;
        $resumeToken3 = '91';
        $expectedResponse3 = new PartialResultSet();
        $expectedResponse3->setChunkedValue($chunkedValue3);
        $expectedResponse3->setResumeToken($resumeToken3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        $serverStream = $client->streamingRead($formattedSession, $table, $columns, $keySet);
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
        $this->assertSame('/google.spanner.v1.Spanner/StreamingRead', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($table, $actualRequestObject->getTable());
        $this->assertProtobufEquals($columns, $actualRequestObject->getColumns());
        $this->assertProtobufEquals($keySet, $actualRequestObject->getKeySet());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function streamingReadExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        $serverStream = $client->streamingRead($formattedSession, $table, $columns, $keySet);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
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
    public function beginTransactionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $id = '27';
        $expectedResponse = new Transaction();
        $expectedResponse->setId($id);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $options = new TransactionOptions();

        $response = $client->beginTransaction($formattedSession, $options);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/BeginTransaction', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($options, $actualRequestObject->getOptions());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function beginTransactionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $options = new TransactionOptions();

        try {
            $client->beginTransaction($formattedSession, $options);
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
    public function commitTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new CommitResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $mutations = [];

        $response = $client->commit($formattedSession, $mutations);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Commit', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($mutations, $actualRequestObject->getMutations());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function commitExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $mutations = [];

        try {
            $client->commit($formattedSession, $mutations);
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
    public function rollbackTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $transactionId = '28';

        $client->rollback($formattedSession, $transactionId);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Rollback', $actualFuncCall);

        $this->assertProtobufEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertProtobufEquals($transactionId, $actualRequestObject->getTransactionId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function rollbackExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

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
        $formattedSession = $client->sessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $transactionId = '28';

        try {
            $client->rollback($formattedSession, $transactionId);
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
