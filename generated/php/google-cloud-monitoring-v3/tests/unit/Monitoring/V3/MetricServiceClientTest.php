<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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

namespace Google\Cloud\Tests\Unit\Monitoring\V3;

use Google\Cloud\Monitoring\V3\MetricServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Api\MetricDescriptor;
use Google\Api\MonitoredResourceDescriptor;
use Google\Cloud\Monitoring\V3\ListMetricDescriptorsResponse;
use Google\Cloud\Monitoring\V3\ListMonitoredResourceDescriptorsResponse;
use Google\Cloud\Monitoring\V3\ListTimeSeriesRequest_TimeSeriesView;
use Google\Cloud\Monitoring\V3\ListTimeSeriesResponse;
use Google\Cloud\Monitoring\V3\TimeInterval;
use Google\Cloud\Monitoring\V3\TimeSeries;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group monitoring
 * @group grpc
 */
class MetricServiceClientTest extends GeneratedTest
{
    public function createMockGroupServiceImpl($hostname, $opts)
    {
        return new MockGroupServiceImpl($hostname, $opts);
    }

    public function createMockMetricServiceImpl($hostname, $opts)
    {
        return new MockMetricServiceImpl($hostname, $opts);
    }

    public function createMockUptimeCheckServiceImpl($hostname, $opts)
    {
        return new MockUptimeCheckServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => MetricServiceClient::SERVICE_ADDRESS,
            'port' => MetricServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return MetricServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new MetricServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function listMonitoredResourceDescriptorsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $resourceDescriptorsElement = new MonitoredResourceDescriptor();
        $resourceDescriptors = [$resourceDescriptorsElement];
        $expectedResponse = new ListMonitoredResourceDescriptorsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setResourceDescriptors($resourceDescriptors);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[PROJECT]');

        $response = $client->listMonitoredResourceDescriptors($formattedName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getResourceDescriptors()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/ListMonitoredResourceDescriptors', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listMonitoredResourceDescriptorsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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

        try {
            $client->listMonitoredResourceDescriptors($formattedName);
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
    public function getMonitoredResourceDescriptorTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->monitoredResourceDescriptorName('[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]');

        $response = $client->getMonitoredResourceDescriptor($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/GetMonitoredResourceDescriptor', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getMonitoredResourceDescriptorExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->monitoredResourceDescriptorName('[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]');

        try {
            $client->getMonitoredResourceDescriptor($formattedName);
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
    public function listMetricDescriptorsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $metricDescriptorsElement = new MetricDescriptor();
        $metricDescriptors = [$metricDescriptorsElement];
        $expectedResponse = new ListMetricDescriptorsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setMetricDescriptors($metricDescriptors);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[PROJECT]');

        $response = $client->listMetricDescriptors($formattedName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getMetricDescriptors()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/ListMetricDescriptors', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listMetricDescriptorsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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

        try {
            $client->listMetricDescriptors($formattedName);
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
    public function getMetricDescriptorTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->metricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        $response = $client->getMetricDescriptor($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/GetMetricDescriptor', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getMetricDescriptorExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->metricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        try {
            $client->getMetricDescriptor($formattedName);
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
    public function createMetricDescriptorTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->projectName('[PROJECT]');
        $metricDescriptor = new MetricDescriptor();

        $response = $client->createMetricDescriptor($formattedName, $metricDescriptor);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/CreateMetricDescriptor', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($metricDescriptor, $actualRequestObject->getMetricDescriptor());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createMetricDescriptorExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $metricDescriptor = new MetricDescriptor();

        try {
            $client->createMetricDescriptor($formattedName, $metricDescriptor);
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
    public function deleteMetricDescriptorTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->metricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        $client->deleteMetricDescriptor($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/DeleteMetricDescriptor', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteMetricDescriptorExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $formattedName = $client->metricDescriptorName('[PROJECT]', '[METRIC_DESCRIPTOR]');

        try {
            $client->deleteMetricDescriptor($formattedName);
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
    public function listTimeSeriesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $timeSeriesElement = new TimeSeries();
        $timeSeries = [$timeSeriesElement];
        $expectedResponse = new ListTimeSeriesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTimeSeries($timeSeries);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[PROJECT]');
        $filter = 'filter-1274492040';
        $interval = new TimeInterval();
        $view = ListTimeSeriesRequest_TimeSeriesView::FULL;

        $response = $client->listTimeSeries($formattedName, $filter, $interval, $view);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTimeSeries()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/ListTimeSeries', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($filter, $actualRequestObject->getFilter());
        $this->assertProtobufEquals($interval, $actualRequestObject->getInterval());
        $this->assertProtobufEquals($view, $actualRequestObject->getView());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTimeSeriesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $filter = 'filter-1274492040';
        $interval = new TimeInterval();
        $view = ListTimeSeriesRequest_TimeSeriesView::FULL;

        try {
            $client->listTimeSeries($formattedName, $filter, $interval, $view);
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
    public function createTimeSeriesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[PROJECT]');
        $timeSeries = [];

        $client->createTimeSeries($formattedName, $timeSeries);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.MetricService/CreateTimeSeries', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($timeSeries, $actualRequestObject->getTimeSeries());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createTimeSeriesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockMetricServiceImpl']);
        $client = $this->createClient('createMetricServiceStubFunction', $grpcStub);

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
        $timeSeries = [];

        try {
            $client->createTimeSeries($formattedName, $timeSeries);
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
