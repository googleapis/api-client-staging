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

use Google\Cloud\Logging\V2\MetricsServiceV2Client;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\logging\v2\ListLogMetricsResponse;
use google\logging\v2\LogMetric;
use google\protobuf\Any;
use google\protobuf\EmptyC;

/**
 * @group logging
 * @group grpc
 */
class MetricsServiceV2ClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockMetricsServiceV2Impl($hostname, $opts)
    {
        return new MockMetricsServiceV2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            MetricsServiceV2Client::SERVICE_ADDRESS,
            MetricsServiceV2Client::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return MetricsServiceV2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new MetricsServiceV2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listLogMetricsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricsServiceV2Impl']);
        $client = $this->createClient('createMetricsServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $metricsElement = new LogMetric();
        $metrics = [$metricsElement];
        $expectedResponse = new ListLogMetricsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($metrics as $elem) {
            $expectedResponse->addMetrics($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = MetricsServiceV2Client::formatProjectName('[PROJECT]');

        $response = $client->listLogMetrics($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getMetricsList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.MetricsServiceV2/ListLogMetrics', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getLogMetricTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricsServiceV2Impl']);
        $client = $this->createClient('createMetricsServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $expectedResponse = new LogMetric();
        $expectedResponse->setName($name);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedMetricName = MetricsServiceV2Client::formatMetricName('[PROJECT]', '[METRIC]');

        $response = $client->getLogMetric($formattedMetricName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.MetricsServiceV2/GetLogMetric', $actualFuncCall);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createLogMetricTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricsServiceV2Impl']);
        $client = $this->createClient('createMetricsServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $expectedResponse = new LogMetric();
        $expectedResponse->setName($name);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = MetricsServiceV2Client::formatProjectName('[PROJECT]');
        $metric = new LogMetric();

        $response = $client->createLogMetric($formattedParent, $metric);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.MetricsServiceV2/CreateLogMetric', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertEquals($metric, $actualRequestObject->getMetric());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateLogMetricTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricsServiceV2Impl']);
        $client = $this->createClient('createMetricsServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $description = 'description-1724546052';
        $filter = 'filter-1274492040';
        $expectedResponse = new LogMetric();
        $expectedResponse->setName($name);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilter($filter);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedMetricName = MetricsServiceV2Client::formatMetricName('[PROJECT]', '[METRIC]');
        $metric = new LogMetric();

        $response = $client->updateLogMetric($formattedMetricName, $metric);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.MetricsServiceV2/UpdateLogMetric', $actualFuncCall);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());
        $this->assertEquals($metric, $actualRequestObject->getMetric());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteLogMetricTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricsServiceV2Impl']);
        $client = $this->createClient('createMetricsServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Add empty response to the grpc stub
        $grpcStub->addResponse(new EmptyC());
        // Mock request
        $formattedMetricName = MetricsServiceV2Client::formatMetricName('[PROJECT]', '[METRIC]');

        $client->deleteLogMetric($formattedMetricName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.MetricsServiceV2/DeleteLogMetric', $actualFuncCall);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());

        $this->assertTrue($grpcStub->isExhausted());
    }
}
