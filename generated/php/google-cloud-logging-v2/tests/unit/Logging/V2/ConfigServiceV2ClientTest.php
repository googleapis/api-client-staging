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

namespace Google\Cloud\Tests\Logging\V2;

use Google\Cloud\Logging\V2\ConfigServiceV2Client;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\logging\v2\ListSinksResponse;
use google\logging\v2\LogSink;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use stdClass;

/**
 * @group logging
 * @group grpc
 */
class ConfigServiceV2ClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockConfigServiceV2Impl($hostname, $opts)
    {
        return new MockConfigServiceV2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ConfigServiceV2Client::SERVICE_ADDRESS,
            ConfigServiceV2Client::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ConfigServiceV2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ConfigServiceV2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listSinksTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $sinksElement = new LogSink();
        $sinks = [$sinksElement];
        $expectedResponse = new ListSinksResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($sinks as $elem) {
            $expectedResponse->addSinks($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');

        $response = $client->listSinks($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSinksList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/ListSinks', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSinksExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');

        try {
            $client->listSinks($formattedParent);
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
    public function getSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $includeChildren = true;
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $expectedResponse->setIncludeChildren($includeChildren);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        $response = $client->getSink($formattedSinkName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/GetSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSinkExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        try {
            $client->getSink($formattedSinkName);
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
    public function createSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $includeChildren = true;
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $expectedResponse->setIncludeChildren($includeChildren);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');
        $sink = new LogSink();

        $response = $client->createSink($formattedParent, $sink);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/CreateSink', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSinkExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');
        $sink = new LogSink();

        try {
            $client->createSink($formattedParent, $sink);
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
    public function updateSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $includeChildren = true;
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $expectedResponse->setIncludeChildren($includeChildren);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');
        $sink = new LogSink();

        $response = $client->updateSink($formattedSinkName, $sink);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/UpdateSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSinkExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');
        $sink = new LogSink();

        try {
            $client->updateSink($formattedSinkName, $sink);
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
    public function deleteSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        $client->deleteSink($formattedSinkName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/DeleteSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSinkExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        try {
            $client->deleteSink($formattedSinkName);
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
