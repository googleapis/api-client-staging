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

namespace Google\Cloud\Tests\Unit\Trace\V1;

use Google\Cloud\Trace\V1\TraceServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Trace\V1\ListTracesResponse;
use Google\Cloud\Trace\V1\Trace;
use Google\Cloud\Trace\V1\Traces;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group trace
 * @group grpc
 */
class TraceServiceClientTest extends GeneratedTest
{
    public function createMockTraceServiceImpl($hostname, $opts)
    {
        return new MockTraceServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => TraceServiceClient::SERVICE_ADDRESS,
            'port' => TraceServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return TraceServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new TraceServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function patchTracesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $traces = new Traces();

        $client->patchTraces($projectId, $traces);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/PatchTraces', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($traces, $actualRequestObject->getTraces());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function patchTracesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

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
        $projectId = 'projectId-1969970175';
        $traces = new Traces();

        try {
            $client->patchTraces($projectId, $traces);
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
    public function getTraceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $projectId2 = 'projectId2939242356';
        $traceId2 = 'traceId2987826376';
        $expectedResponse = new Trace();
        $expectedResponse->setProjectId($projectId2);
        $expectedResponse->setTraceId($traceId2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $traceId = 'traceId1270300245';

        $response = $client->getTrace($projectId, $traceId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/GetTrace', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($traceId, $actualRequestObject->getTraceId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTraceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

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
        $projectId = 'projectId-1969970175';
        $traceId = 'traceId1270300245';

        try {
            $client->getTrace($projectId, $traceId);
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
    public function listTracesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $tracesElement = new Trace();
        $traces = [$tracesElement];
        $expectedResponse = new ListTracesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTraces($traces);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';

        $response = $client->listTraces($projectId);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTraces()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/ListTraces', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTracesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

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
        $projectId = 'projectId-1969970175';

        try {
            $client->listTraces($projectId);
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
