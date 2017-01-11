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

namespace Google\Cloud\Tests\Monitoring\V3;

use Google\Cloud\Monitoring\V3\MetricServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\api\MetricDescriptor;
use google\api\MonitoredResourceDescriptor;
use google\monitoring\v3\ListMetricDescriptorsResponse;
use google\monitoring\v3\ListMonitoredResourceDescriptorsResponse;
use google\monitoring\v3\ListTimeSeriesRequest\TimeSeriesView;
use google\monitoring\v3\ListTimeSeriesResponse;
use google\monitoring\v3\TimeInterval;
use google\monitoring\v3\TimeSeries;

/**
 * @group monitoring
 * @group grpc
 */
class MetricServiceTest extends PHPUnit_Framework_TestCase
{
    public function createMockMetricServiceImpl($hostname, $opts)
    {
        return new MockMetricServiceImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            MetricServiceClient::SERVICE_ADDRESS,
            MetricServiceClient::DEFAULT_SERVICE_PORT
        );
        $client = new MetricServiceClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function listMonitoredResourceDescriptorsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $resourceDescriptorsElement = new MonitoredResourceDescriptor();
        $resourceDescriptors = [$resourceDescriptorsElement];
        $expectedResponse = new ListMonitoredResourceDescriptorsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($resourceDescriptors as $elem) {
            $expectedResponse->addResourceDescriptors($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatProjectName('[PROJECT]');

        $response = $client->listMonitoredResourceDescriptors($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListMonitoredResourceDescriptors', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getResourceDescriptorsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getMonitoredResourceDescriptorTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $type = 'type3575610';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new MonitoredResourceDescriptor();
        $expectedResponse->setName($name2);
        $expectedResponse->setType($type);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatMonitoredResourceDescriptorName('[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]');

        $response = $client->getMonitoredResourceDescriptor($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetMonitoredResourceDescriptor', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listMetricDescriptorsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $metricDescriptorsElement = new MetricDescriptor();
        $metricDescriptors = [$metricDescriptorsElement];
        $expectedResponse = new ListMetricDescriptorsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($metricDescriptors as $elem) {
            $expectedResponse->addMetricDescriptors($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatProjectName('[PROJECT]');

        $response = $client->listMetricDescriptors($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListMetricDescriptors', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getMetricDescriptorsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getMetricDescriptorTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $type = 'type3575610';
        $unit = 'unit3594628';
        $description = 'description-1724546052';
        $displayName = 'displayName1615086568';
        $expectedResponse = new MetricDescriptor();
        $expectedResponse->setName($name2);
        $expectedResponse->setType($type);
        $expectedResponse->setUnit($unit);
        $expectedResponse->setDescription($description);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatMetricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        $response = $client->getMetricDescriptor($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetMetricDescriptor', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createMetricDescriptorTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $type = 'type3575610';
        $unit = 'unit3594628';
        $description = 'description-1724546052';
        $displayName = 'displayName1615086568';
        $expectedResponse = new MetricDescriptor();
        $expectedResponse->setName($name2);
        $expectedResponse->setType($type);
        $expectedResponse->setUnit($unit);
        $expectedResponse->setDescription($description);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatProjectName('[PROJECT]');
        $metricDescriptor = new MetricDescriptor();

        $response = $client->createMetricDescriptor($formattedName, $metricDescriptor);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateMetricDescriptor', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($metricDescriptor, $actualRequestObject->getMetricDescriptor());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteMetricDescriptorTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedName = MetricServiceClient::formatMetricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        $client->deleteMetricDescriptor($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteMetricDescriptor', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTimeSeriesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $timeSeriesElement = new TimeSeries();
        $timeSeries = [$timeSeriesElement];
        $expectedResponse = new ListTimeSeriesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($timeSeries as $elem) {
            $expectedResponse->addTimeSeries($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = MetricServiceClient::formatProjectName('[PROJECT]');
        $filter = 'filter-1274492040';
        $interval = new TimeInterval();
        $view = TimeSeriesView::FULL;

        $response = $client->listTimeSeries($formattedName, $filter, $interval, $view);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListTimeSeries', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($filter, $actualRequestObject->getFilter());
        $this->assertEquals($interval, $actualRequestObject->getInterval());
        $this->assertEquals($view, $actualRequestObject->getView());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTimeSeriesList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createTimeSeriesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockMetricServiceImpl'], 'createMetricServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedName = MetricServiceClient::formatProjectName('[PROJECT]');
        $timeSeries = [];

        $client->createTimeSeries($formattedName, $timeSeries);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateTimeSeries', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($timeSeries, $actualRequestObject->getTimeSeriesList());

        $this->assertTrue($grpcStub->isExhausted());
    }
}
