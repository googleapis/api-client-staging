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

use Google\Cloud\Monitoring\V3\UptimeCheckServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Monitoring\V3\ListUptimeCheckConfigsResponse;
use Google\Cloud\Monitoring\V3\ListUptimeCheckIpsResponse;
use Google\Cloud\Monitoring\V3\UptimeCheckConfig;
use Google\Cloud\Monitoring\V3\UptimeCheckIp;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group monitoring
 * @group grpc
 */
class UptimeCheckServiceClientTest extends GeneratedTest
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
            'serviceAddress' => UptimeCheckServiceClient::SERVICE_ADDRESS,
            'port' => UptimeCheckServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return UptimeCheckServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new UptimeCheckServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function listUptimeCheckConfigsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $uptimeCheckConfigsElement = new UptimeCheckConfig();
        $uptimeCheckConfigs = [$uptimeCheckConfigsElement];
        $expectedResponse = new ListUptimeCheckConfigsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setUptimeCheckConfigs($uptimeCheckConfigs);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->listUptimeCheckConfigs($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getUptimeCheckConfigs()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/ListUptimeCheckConfigs', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listUptimeCheckConfigsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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
            $client->listUptimeCheckConfigs($formattedParent);
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
    public function getUptimeCheckConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $expectedResponse = new UptimeCheckConfig();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->uptimeCheckConfigName('[PROJECT]', '[UPTIME_CHECK_CONFIG]');

        $response = $client->getUptimeCheckConfig($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/GetUptimeCheckConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getUptimeCheckConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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
        $formattedName = $client->uptimeCheckConfigName('[PROJECT]', '[UPTIME_CHECK_CONFIG]');

        try {
            $client->getUptimeCheckConfig($formattedName);
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
    public function createUptimeCheckConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $expectedResponse = new UptimeCheckConfig();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');
        $uptimeCheckConfig = new UptimeCheckConfig();

        $response = $client->createUptimeCheckConfig($formattedParent, $uptimeCheckConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/CreateUptimeCheckConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($uptimeCheckConfig, $actualRequestObject->getUptimeCheckConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createUptimeCheckConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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
        $uptimeCheckConfig = new UptimeCheckConfig();

        try {
            $client->createUptimeCheckConfig($formattedParent, $uptimeCheckConfig);
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
    public function updateUptimeCheckConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $expectedResponse = new UptimeCheckConfig();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $uptimeCheckConfig = new UptimeCheckConfig();

        $response = $client->updateUptimeCheckConfig($uptimeCheckConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/UpdateUptimeCheckConfig', $actualFuncCall);

        $this->assertProtobufEquals($uptimeCheckConfig, $actualRequestObject->getUptimeCheckConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateUptimeCheckConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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
        $uptimeCheckConfig = new UptimeCheckConfig();

        try {
            $client->updateUptimeCheckConfig($uptimeCheckConfig);
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
    public function deleteUptimeCheckConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->uptimeCheckConfigName('[PROJECT]', '[UPTIME_CHECK_CONFIG]');

        $client->deleteUptimeCheckConfig($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/DeleteUptimeCheckConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteUptimeCheckConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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
        $formattedName = $client->uptimeCheckConfigName('[PROJECT]', '[UPTIME_CHECK_CONFIG]');

        try {
            $client->deleteUptimeCheckConfig($formattedName);
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
    public function listUptimeCheckIpsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $uptimeCheckIpsElement = new UptimeCheckIp();
        $uptimeCheckIps = [$uptimeCheckIpsElement];
        $expectedResponse = new ListUptimeCheckIpsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setUptimeCheckIps($uptimeCheckIps);
        $grpcStub->addResponse($expectedResponse);

        $response = $client->listUptimeCheckIps();
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getUptimeCheckIps()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.UptimeCheckService/ListUptimeCheckIps', $actualFuncCall);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listUptimeCheckIpsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockUptimeCheckServiceImpl']);
        $client = $this->createClient('createUptimeCheckServiceStubFunction', $grpcStub);

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

        try {
            $client->listUptimeCheckIps();
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
