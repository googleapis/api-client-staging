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

namespace Google\Cloud\Api\Servicemanagement\Tests\Unit\V1;

use Google\Cloud\Api\Servicemanagement\V1\ServiceManagerClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\ApiCore\Testing\MockTransport;
use Google\Api\Service;
use Google\Cloud\ServiceManagement\V1\ConfigSource;
use Google\Cloud\ServiceManagement\V1\GenerateConfigReportResponse;
use Google\Cloud\ServiceManagement\V1\ListServiceConfigsResponse;
use Google\Cloud\ServiceManagement\V1\ListServiceRolloutsResponse;
use Google\Cloud\ServiceManagement\V1\ListServicesResponse;
use Google\Cloud\ServiceManagement\V1\ManagedService;
use Google\Cloud\ServiceManagement\V1\Rollout;
use Google\LongRunning\Operation;
use Google\Protobuf\Any;
use Google\Rpc\Code;
use stdClass;

/**
 * @group servicemanagement
 * @group grpc
 */
class ServiceManagerClientTest extends GeneratedTest
{
    /**
     * @return TransportInterface
     */
    private function createTransport($deserialize = null)
    {
        return new MockTransport($deserialize);
    }

    /**
     * @return ServiceManagerClient
     */
    private function createClient(array $options = [])
    {
        $options += [
            'credentials' => $this->getMockBuilder(CredentialsWrapper::class)
                ->disableOriginalConstructor()
                ->getMock(),
        ];

        return new ServiceManagerClient($options);
    }

    /**
     * @test
     */
    public function listServicesTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $nextPageToken = '';
        $servicesElement = new ManagedService();
        $services = [$servicesElement];
        $expectedResponse = new ListServicesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setServices($services);
        $transport->addResponse($expectedResponse);

        $response = $client->listServices();
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getServices()[0], $resources[0]);

        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/ListServices', $actualFuncCall);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listServicesExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        try {
            $client->listServices();
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $serviceName2 = 'serviceName2-2047524792';
        $producerProjectId = 'producerProjectId1450187470';
        $expectedResponse = new ManagedService();
        $expectedResponse->setServiceName($serviceName2);
        $expectedResponse->setProducerProjectId($producerProjectId);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';

        $response = $client->getService($serviceName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/GetService', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';

        try {
            $client->getService($serviceName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $service = new ManagedService();

        $response = $client->createService($service);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/CreateService', $actualFuncCall);

        $actualValue = $actualRequestObject->getService();

        $this->assertProtobufEquals($service, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $service = new ManagedService();

        try {
            $client->createService($service);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deleteServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';

        $response = $client->deleteService($serviceName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/DeleteService', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deleteServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';

        try {
            $client->deleteService($serviceName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function undeleteServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';

        $response = $client->undeleteService($serviceName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/UndeleteService', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function undeleteServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';

        try {
            $client->undeleteService($serviceName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listServiceConfigsTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $nextPageToken = '';
        $serviceConfigsElement = new Service();
        $serviceConfigs = [$serviceConfigsElement];
        $expectedResponse = new ListServiceConfigsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setServiceConfigs($serviceConfigs);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';

        $response = $client->listServiceConfigs($serviceName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getServiceConfigs()[0], $resources[0]);

        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/ListServiceConfigs', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listServiceConfigsExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';

        try {
            $client->listServiceConfigs($serviceName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceConfigTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $id = 'id3355';
        $title = 'title110371416';
        $producerProjectId = 'producerProjectId1450187470';
        $expectedResponse = new Service();
        $expectedResponse->setName($name);
        $expectedResponse->setId($id);
        $expectedResponse->setTitle($title);
        $expectedResponse->setProducerProjectId($producerProjectId);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $configId = 'configId-804450504';

        $response = $client->getServiceConfig($serviceName, $configId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/GetServiceConfig', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getConfigId();

        $this->assertProtobufEquals($configId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceConfigExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $configId = 'configId-804450504';

        try {
            $client->getServiceConfig($serviceName, $configId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceConfigTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $id = 'id3355';
        $title = 'title110371416';
        $producerProjectId = 'producerProjectId1450187470';
        $expectedResponse = new Service();
        $expectedResponse->setName($name);
        $expectedResponse->setId($id);
        $expectedResponse->setTitle($title);
        $expectedResponse->setProducerProjectId($producerProjectId);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $serviceConfig = new Service();

        $response = $client->createServiceConfig($serviceName, $serviceConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/CreateServiceConfig', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getServiceConfig();

        $this->assertProtobufEquals($serviceConfig, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceConfigExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $serviceConfig = new Service();

        try {
            $client->createServiceConfig($serviceName, $serviceConfig);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function submitConfigSourceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $configSource = new ConfigSource();

        $response = $client->submitConfigSource($serviceName, $configSource);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/SubmitConfigSource', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getConfigSource();

        $this->assertProtobufEquals($configSource, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function submitConfigSourceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $configSource = new ConfigSource();

        try {
            $client->submitConfigSource($serviceName, $configSource);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listServiceRolloutsTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $nextPageToken = '';
        $rolloutsElement = new Rollout();
        $rollouts = [$rolloutsElement];
        $expectedResponse = new ListServiceRolloutsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setRollouts($rollouts);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';

        $response = $client->listServiceRollouts($serviceName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getRollouts()[0], $resources[0]);

        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/ListServiceRollouts', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listServiceRolloutsExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';

        try {
            $client->listServiceRollouts($serviceName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceRolloutTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $rolloutId2 = 'rolloutId2-1688642596';
        $createdBy = 'createdBy1369680142';
        $serviceName2 = 'serviceName2-2047524792';
        $expectedResponse = new Rollout();
        $expectedResponse->setRolloutId($rolloutId2);
        $expectedResponse->setCreatedBy($createdBy);
        $expectedResponse->setServiceName($serviceName2);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $rolloutId = 'rolloutId-91142551';

        $response = $client->getServiceRollout($serviceName, $rolloutId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/GetServiceRollout', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getRolloutId();

        $this->assertProtobufEquals($rolloutId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getServiceRolloutExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $rolloutId = 'rolloutId-91142551';

        try {
            $client->getServiceRollout($serviceName, $rolloutId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceRolloutTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $rollout = new Rollout();

        $response = $client->createServiceRollout($serviceName, $rollout);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/CreateServiceRollout', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getRollout();

        $this->assertProtobufEquals($rollout, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createServiceRolloutExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $rollout = new Rollout();

        try {
            $client->createServiceRollout($serviceName, $rollout);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function generateConfigReportTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $serviceName = 'serviceName359880149';
        $id = 'id3355';
        $expectedResponse = new GenerateConfigReportResponse();
        $expectedResponse->setServiceName($serviceName);
        $expectedResponse->setId($id);
        $transport->addResponse($expectedResponse);

        // Mock request
        $newConfig = new Any();
        $oldConfig = new Any();

        $response = $client->generateConfigReport($newConfig, $oldConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/GenerateConfigReport', $actualFuncCall);

        $actualValue = $actualRequestObject->getNewConfig();

        $this->assertProtobufEquals($newConfig, $actualValue);
        $actualValue = $actualRequestObject->getOldConfig();

        $this->assertProtobufEquals($oldConfig, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function generateConfigReportExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $newConfig = new Any();
        $oldConfig = new Any();

        try {
            $client->generateConfigReport($newConfig, $oldConfig);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function enableServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $consumerId = 'consumerId-858398204';

        $response = $client->enableService($serviceName, $consumerId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/EnableService', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getConsumerId();

        $this->assertProtobufEquals($consumerId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function enableServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $consumerId = 'consumerId-858398204';

        try {
            $client->enableService($serviceName, $consumerId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function disableServiceTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $serviceName = 'serviceName359880149';
        $consumerId = 'consumerId-858398204';

        $response = $client->disableService($serviceName, $consumerId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.api.servicemanagement.v1.ServiceManager/DisableService', $actualFuncCall);

        $actualValue = $actualRequestObject->getServiceName();

        $this->assertProtobufEquals($serviceName, $actualValue);
        $actualValue = $actualRequestObject->getConsumerId();

        $this->assertProtobufEquals($consumerId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function disableServiceExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $serviceName = 'serviceName359880149';
        $consumerId = 'consumerId-858398204';

        try {
            $client->disableService($serviceName, $consumerId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }
}
