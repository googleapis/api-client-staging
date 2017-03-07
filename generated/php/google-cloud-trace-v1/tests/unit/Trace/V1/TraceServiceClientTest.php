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

namespace Google\Cloud\Tests\Trace\V1;

use Google\Cloud\Trace\V1\TraceServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\devtools\cloudtrace\v1\ListTracesResponse;
use google\devtools\cloudtrace\v1\Trace;
use google\devtools\cloudtrace\v1\Traces;
use google\protobuf\Any;
use google\protobuf\EmptyC;

/**
 * @group trace
 * @group grpc
 */
class TraceServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockTraceServiceImpl($hostname, $opts)
    {
        return new MockTraceServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            TraceServiceClient::SERVICE_ADDRESS,
            TraceServiceClient::DEFAULT_SERVICE_PORT
        );
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

        // Add empty response to the grpc stub
        $grpcStub->addResponse(new EmptyC());
        // Mock request
        $projectId = 'projectId-1969970175';
        $traces = new Traces();

        $client->patchTraces($projectId, $traces);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/PatchTraces', $actualFuncCall);

        $this->assertEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertEquals($traces, $actualRequestObject->getTraces());

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/GetTrace', $actualFuncCall);

        $this->assertEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertEquals($traceId, $actualRequestObject->getTraceId());

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
        foreach ($traces as $elem) {
            $expectedResponse->addTraces($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';

        $response = $client->listTraces($projectId);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTracesList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v1.TraceService/ListTraces', $actualFuncCall);

        $this->assertEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertTrue($grpcStub->isExhausted());
    }
}
