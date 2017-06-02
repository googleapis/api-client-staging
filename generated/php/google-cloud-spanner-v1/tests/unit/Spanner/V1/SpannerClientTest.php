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

namespace Google\Cloud\Tests\Spanner\V1;

use Google\Cloud\Spanner\V1\SpannerClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\ServerStream;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use google\spanner\v1\CommitResponse;
use google\spanner\v1\KeySet;
use google\spanner\v1\PartialResultSet;
use google\spanner\v1\ResultSet;
use google\spanner\v1\Session;
use google\spanner\v1\Transaction;
use google\spanner\v1\TransactionOptions;
use stdClass;

/**
 * @group spanner
 * @group grpc
 */
class SpannerClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockSpannerImpl($hostname, $opts)
    {
        return new MockSpannerImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            SpannerClient::SERVICE_ADDRESS,
            SpannerClient::DEFAULT_SERVICE_PORT
        );
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
        $formattedDatabase = SpannerClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->createSession($formattedDatabase);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/CreateSession', $actualFuncCall);

        $this->assertEquals($formattedDatabase, $actualRequestObject->getDatabase());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedDatabase = SpannerClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->createSession($formattedDatabase);
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
        $formattedName = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        $response = $client->getSession($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/GetSession', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        try {
            $client->getSession($formattedName);
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
    public function deleteSessionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        $client->deleteSession($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/DeleteSession', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');

        try {
            $client->deleteSession($formattedName);
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
    public function executeSqlTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ResultSet();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $response = $client->executeSql($formattedSession, $sql);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/ExecuteSql', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($sql, $actualRequestObject->getSql());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        try {
            $client->executeSql($formattedSession, $sql);
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
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $serverStream = $client->executeStreamingSql($formattedSession, $sql);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responseList = iterator_to_array($serverStream->readAll());
        $this->assertEquals([$expectedResponse, $expectedResponse], $responseList);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/ExecuteStreamingSql', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($sql, $actualRequestObject->getSql());

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

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $sql = 'sql114126';

        $serverStream = $client->executeStreamingSql($formattedSession, $sql);
        $results = $serverStream->readAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
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
    public function readTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ResultSet();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        $response = $client->read($formattedSession, $table, $columns, $keySet);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Read', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($table, $actualRequestObject->getTable());
        $this->assertEquals($columns, $actualRequestObject->getColumnsList());
        $this->assertEquals($keySet, $actualRequestObject->getKeySet());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        try {
            $client->read($formattedSession, $table, $columns, $keySet);
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
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $table = 'table110115790';
        $columns = [];
        $keySet = new KeySet();

        $serverStream = $client->streamingRead($formattedSession, $table, $columns, $keySet);
        $this->assertInstanceOf(ServerStream::class, $serverStream);

        $responseList = iterator_to_array($serverStream->readAll());
        $this->assertEquals([$expectedResponse, $expectedResponse], $responseList);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/StreamingRead', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($table, $actualRequestObject->getTable());
        $this->assertEquals($columns, $actualRequestObject->getColumnsList());
        $this->assertEquals($keySet, $actualRequestObject->getKeySet());

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

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
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
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
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
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $options = new TransactionOptions();

        $response = $client->beginTransaction($formattedSession, $options);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/BeginTransaction', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($options, $actualRequestObject->getOptions());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $options = new TransactionOptions();

        try {
            $client->beginTransaction($formattedSession, $options);
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
    public function commitTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new CommitResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $mutations = [];

        $response = $client->commit($formattedSession, $mutations);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Commit', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($mutations, $actualRequestObject->getMutationsList());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $mutations = [];

        try {
            $client->commit($formattedSession, $mutations);
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
    public function rollbackTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpannerImpl']);
        $client = $this->createClient('createSpannerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $transactionId = '28';

        $client->rollback($formattedSession, $transactionId);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.v1.Spanner/Rollback', $actualFuncCall);

        $this->assertEquals($formattedSession, $actualRequestObject->getSession());
        $this->assertEquals($transactionId, $actualRequestObject->getTransactionId());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSession = SpannerClient::formatSessionName('[PROJECT]', '[INSTANCE]', '[DATABASE]', '[SESSION]');
        $transactionId = '28';

        try {
            $client->rollback($formattedSession, $transactionId);
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
