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

namespace Google\Cloud\Tests\Unit\Logging\V2;

use Google\Cloud\Logging\V2\ConfigServiceV2Client;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\Testing\GeneratedTest;
use Google\Logging\V2\ListExclusionsResponse;
use Google\Logging\V2\ListSinksResponse;
use Google\Logging\V2\LogExclusion;
use Google\Logging\V2\LogSink;
use Google\Protobuf\Any;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group logging
 * @group grpc
 */
class ConfigServiceV2ClientTest extends GeneratedTest
{
    public function createMockLoggingServiceV2Impl($hostname, $opts)
    {
        return new MockLoggingServiceV2Impl($hostname, $opts);
    }

    public function createMockConfigServiceV2Impl($hostname, $opts)
    {
        return new MockConfigServiceV2Impl($hostname, $opts);
    }

    public function createMockMetricsServiceV2Impl($hostname, $opts)
    {
        return new MockMetricsServiceV2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => ConfigServiceV2Client::SERVICE_ADDRESS,
            'port' => ConfigServiceV2Client::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
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
        $expectedResponse->setSinks($sinks);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->listSinks($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSinks()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/ListSinks', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
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
        $formattedParent = $client->projectName('[PROJECT]');

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
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');

        $response = $client->getSink($formattedSinkName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/GetSink', $actualFuncCall);

        $this->assertProtobufEquals($formattedSinkName, $actualRequestObject->getSinkName());

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
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');

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
        $formattedParent = $client->projectName('[PROJECT]');
        $sink = new LogSink();

        $response = $client->createSink($formattedParent, $sink);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/CreateSink', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($sink, $actualRequestObject->getSink());

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
        $formattedParent = $client->projectName('[PROJECT]');
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
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');
        $sink = new LogSink();

        $response = $client->updateSink($formattedSinkName, $sink);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/UpdateSink', $actualFuncCall);

        $this->assertProtobufEquals($formattedSinkName, $actualRequestObject->getSinkName());
        $this->assertProtobufEquals($sink, $actualRequestObject->getSink());

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
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');
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
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');

        $client->deleteSink($formattedSinkName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/DeleteSink', $actualFuncCall);

        $this->assertProtobufEquals($formattedSinkName, $actualRequestObject->getSinkName());

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
        $formattedSinkName = $client->sinkName('[PROJECT]', '[SINK]');

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

    /**
     * @test
     */
    public function listExclusionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $exclusionsElement = new LogExclusion();
        $exclusions = [$exclusionsElement];
        $expectedResponse = new ListExclusionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setExclusions($exclusions);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->listExclusions($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getExclusions()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/ListExclusions', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listExclusionsExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->listExclusions($formattedParent);
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
    public function getExclusionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $disabled = true;
        $expectedResponse = new LogExclusion();
        $expectedResponse->setName($name2);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setDisabled($disabled);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');

        $response = $client->getExclusion($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/GetExclusion', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getExclusionExceptionTest()
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
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');

        try {
            $client->getExclusion($formattedName);
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
    public function createExclusionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $disabled = true;
        $expectedResponse = new LogExclusion();
        $expectedResponse->setName($name);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setDisabled($disabled);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');
        $exclusion = new LogExclusion();

        $response = $client->createExclusion($formattedParent, $exclusion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/CreateExclusion', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($exclusion, $actualRequestObject->getExclusion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createExclusionExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');
        $exclusion = new LogExclusion();

        try {
            $client->createExclusion($formattedParent, $exclusion);
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
    public function updateExclusionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $disabled = true;
        $expectedResponse = new LogExclusion();
        $expectedResponse->setName($name2);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setDisabled($disabled);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');
        $exclusion = new LogExclusion();
        $updateMask = new FieldMask();

        $response = $client->updateExclusion($formattedName, $exclusion, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/UpdateExclusion', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($exclusion, $actualRequestObject->getExclusion());
        $this->assertProtobufEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateExclusionExceptionTest()
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
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');
        $exclusion = new LogExclusion();
        $updateMask = new FieldMask();

        try {
            $client->updateExclusion($formattedName, $exclusion, $updateMask);
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
    public function deleteExclusionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');

        $client->deleteExclusion($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/DeleteExclusion', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteExclusionExceptionTest()
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
        $formattedName = $client->exclusionName('[PROJECT]', '[EXCLUSION]');

        try {
            $client->deleteExclusion($formattedName);
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
