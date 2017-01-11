<?php
/*
 * Copyright 2016, Google Inc. All rights reserved.
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

/**
 * @group logging
 * @group grpc
 */
class MetricsServiceV2Test extends PHPUnit_Framework_TestCase
{
    public function createMockMetricsServiceV2Impl($hostname, $opts)
    {
        return new MockMetricsServiceV2Impl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            MetricsServiceV2Client::SERVICE_ADDRESS,
            MetricsServiceV2Client::DEFAULT_SERVICE_PORT
        );
        $client = new MetricsServiceV2Client([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function listLogMetricsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricsServiceV2Impl'], 'createMetricsServiceV2StubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListLogMetrics', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getMetricsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getLogMetricTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricsServiceV2Impl'], 'createMetricsServiceV2StubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetLogMetric', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createLogMetricTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricsServiceV2Impl'], 'createMetricsServiceV2StubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateLogMetric', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertEquals($metric, $actualRequestObject->getMetric());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateLogMetricTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricsServiceV2Impl'], 'createMetricsServiceV2StubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('UpdateLogMetric', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());
        $this->assertEquals($metric, $actualRequestObject->getMetric());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteLogMetricTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricsServiceV2Impl'], 'createMetricsServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedMetricName = MetricsServiceV2Client::formatMetricName('[PROJECT]', '[METRIC]');

        $client->deleteLogMetric($formattedMetricName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteLogMetric', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedMetricName, $actualRequestObject->getMetricName());

        $this->assertTrue($grpcStub->isExhausted());
    }
}
