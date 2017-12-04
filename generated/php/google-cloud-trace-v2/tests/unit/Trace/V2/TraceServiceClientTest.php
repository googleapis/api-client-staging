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

namespace Google\Cloud\Tests\Unit\Trace\V2;

use Google\Cloud\Trace\V2\TraceServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Trace\V2\Span;
use Google\Cloud\Trace\V2\TruncatableString;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Google\Protobuf\Timestamp;
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
    public function batchWriteSpansTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[PROJECT]');
        $spans = [];

        $client->batchWriteSpans($formattedName, $spans);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v2.TraceService/BatchWriteSpans', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($spans, $actualRequestObject->getSpans());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchWriteSpansExceptionTest()
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
        $formattedName = $client->projectName('[PROJECT]');
        $spans = [];

        try {
            $client->batchWriteSpans($formattedName, $spans);
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
    public function createSpanTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockTraceServiceImpl']);
        $client = $this->createClient('createTraceServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $spanId2 = 'spanId2-643891741';
        $parentSpanId = 'parentSpanId-1757797477';
        $expectedResponse = new Span();
        $expectedResponse->setName($name2);
        $expectedResponse->setSpanId($spanId2);
        $expectedResponse->setParentSpanId($parentSpanId);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->spanName('[PROJECT]', '[TRACE]', '[SPAN]');
        $spanId = 'spanId-2011840976';
        $displayName = new TruncatableString();
        $startTime = new Timestamp();
        $endTime = new Timestamp();

        $response = $client->createSpan($formattedName, $spanId, $displayName, $startTime, $endTime);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudtrace.v2.TraceService/CreateSpan', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($spanId, $actualRequestObject->getSpanId());
        $this->assertProtobufEquals($displayName, $actualRequestObject->getDisplayName());
        $this->assertProtobufEquals($startTime, $actualRequestObject->getStartTime());
        $this->assertProtobufEquals($endTime, $actualRequestObject->getEndTime());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSpanExceptionTest()
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
        $formattedName = $client->spanName('[PROJECT]', '[TRACE]', '[SPAN]');
        $spanId = 'spanId-2011840976';
        $displayName = new TruncatableString();
        $startTime = new Timestamp();
        $endTime = new Timestamp();

        try {
            $client->createSpan($formattedName, $spanId, $displayName, $startTime, $endTime);
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
