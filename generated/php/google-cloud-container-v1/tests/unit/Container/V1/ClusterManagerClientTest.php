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

namespace Google\Cloud\Tests\Unit\Container\V1;

use Google\Cloud\Container\V1\ClusterManagerClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Container\V1\AddonsConfig;
use Google\Cloud\Container\V1\Cluster;
use Google\Cloud\Container\V1\ClusterUpdate;
use Google\Cloud\Container\V1\ListClustersResponse;
use Google\Cloud\Container\V1\ListNodePoolsResponse;
use Google\Cloud\Container\V1\ListOperationsResponse;
use Google\Cloud\Container\V1\MaintenancePolicy;
use Google\Cloud\Container\V1\MasterAuth;
use Google\Cloud\Container\V1\NetworkPolicy;
use Google\Cloud\Container\V1\NodeManagement;
use Google\Cloud\Container\V1\NodePool;
use Google\Cloud\Container\V1\NodePoolAutoscaling;
use Google\Cloud\Container\V1\Operation;
use Google\Cloud\Container\V1\ServerConfig;
use Google\Cloud\Container\V1\SetMasterAuthRequest_Action;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group container
 * @group grpc
 */
class ClusterManagerClientTest extends GeneratedTest
{
    public function createMockClusterManagerImpl($hostname, $opts)
    {
        return new MockClusterManagerImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => ClusterManagerClient::SERVICE_ADDRESS,
            'port' => ClusterManagerClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return ClusterManagerClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ClusterManagerClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function listClustersTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListClustersResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';

        $response = $client->listClusters($projectId, $zone);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/ListClusters', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listClustersExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';

        try {
            $client->listClusters($projectId, $zone);
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
    public function getClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $description = 'description-1724546052';
        $initialNodeCount = 1682564205;
        $loggingService = 'loggingService-1700501035';
        $monitoringService = 'monitoringService1469270462';
        $network = 'network1843485230';
        $clusterIpv4Cidr = 'clusterIpv4Cidr-141875831';
        $subnetwork = 'subnetwork-1302785042';
        $enableKubernetesAlpha = false;
        $labelFingerprint = 'labelFingerprint714995737';
        $selfLink = 'selfLink-1691268851';
        $zone2 = 'zone2-696322977';
        $endpoint = 'endpoint1741102485';
        $initialClusterVersion = 'initialClusterVersion-276373352';
        $currentMasterVersion = 'currentMasterVersion-920953983';
        $currentNodeVersion = 'currentNodeVersion-407476063';
        $createTime = 'createTime-493574096';
        $statusMessage = 'statusMessage-239442758';
        $nodeIpv4CidrSize = 1181176815;
        $servicesIpv4Cidr = 'servicesIpv4Cidr1966438125';
        $currentNodeCount = 178977560;
        $expireTime = 'expireTime-96179731';
        $expectedResponse = new Cluster();
        $expectedResponse->setName($name);
        $expectedResponse->setDescription($description);
        $expectedResponse->setInitialNodeCount($initialNodeCount);
        $expectedResponse->setLoggingService($loggingService);
        $expectedResponse->setMonitoringService($monitoringService);
        $expectedResponse->setNetwork($network);
        $expectedResponse->setClusterIpv4Cidr($clusterIpv4Cidr);
        $expectedResponse->setSubnetwork($subnetwork);
        $expectedResponse->setEnableKubernetesAlpha($enableKubernetesAlpha);
        $expectedResponse->setLabelFingerprint($labelFingerprint);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setEndpoint($endpoint);
        $expectedResponse->setInitialClusterVersion($initialClusterVersion);
        $expectedResponse->setCurrentMasterVersion($currentMasterVersion);
        $expectedResponse->setCurrentNodeVersion($currentNodeVersion);
        $expectedResponse->setCreateTime($createTime);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setNodeIpv4CidrSize($nodeIpv4CidrSize);
        $expectedResponse->setServicesIpv4Cidr($servicesIpv4Cidr);
        $expectedResponse->setCurrentNodeCount($currentNodeCount);
        $expectedResponse->setExpireTime($expireTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        $response = $client->getCluster($projectId, $zone, $clusterId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/GetCluster', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        try {
            $client->getCluster($projectId, $zone, $clusterId);
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
    public function createClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $cluster = new Cluster();

        $response = $client->createCluster($projectId, $zone, $cluster);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/CreateCluster', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($cluster, $actualRequestObject->getCluster());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $cluster = new Cluster();

        try {
            $client->createCluster($projectId, $zone, $cluster);
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
    public function updateClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $update = new ClusterUpdate();

        $response = $client->updateCluster($projectId, $zone, $clusterId, $update);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/UpdateCluster', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($update, $actualRequestObject->getUpdate());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $update = new ClusterUpdate();

        try {
            $client->updateCluster($projectId, $zone, $clusterId, $update);
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
    public function updateNodePoolTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $nodeVersion = 'nodeVersion1790136219';
        $imageType = 'imageType-1442758754';

        $response = $client->updateNodePool($projectId, $zone, $clusterId, $nodePoolId, $nodeVersion, $imageType);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/UpdateNodePool', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());
        $this->assertProtobufEquals($nodeVersion, $actualRequestObject->getNodeVersion());
        $this->assertProtobufEquals($imageType, $actualRequestObject->getImageType());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateNodePoolExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $nodeVersion = 'nodeVersion1790136219';
        $imageType = 'imageType-1442758754';

        try {
            $client->updateNodePool($projectId, $zone, $clusterId, $nodePoolId, $nodeVersion, $imageType);
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
    public function setNodePoolAutoscalingTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $autoscaling = new NodePoolAutoscaling();

        $response = $client->setNodePoolAutoscaling($projectId, $zone, $clusterId, $nodePoolId, $autoscaling);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetNodePoolAutoscaling', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());
        $this->assertProtobufEquals($autoscaling, $actualRequestObject->getAutoscaling());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setNodePoolAutoscalingExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $autoscaling = new NodePoolAutoscaling();

        try {
            $client->setNodePoolAutoscaling($projectId, $zone, $clusterId, $nodePoolId, $autoscaling);
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
    public function setLoggingServiceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $loggingService = 'loggingService-1700501035';

        $response = $client->setLoggingService($projectId, $zone, $clusterId, $loggingService);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetLoggingService', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($loggingService, $actualRequestObject->getLoggingService());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setLoggingServiceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $loggingService = 'loggingService-1700501035';

        try {
            $client->setLoggingService($projectId, $zone, $clusterId, $loggingService);
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
    public function setMonitoringServiceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $monitoringService = 'monitoringService1469270462';

        $response = $client->setMonitoringService($projectId, $zone, $clusterId, $monitoringService);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetMonitoringService', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($monitoringService, $actualRequestObject->getMonitoringService());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setMonitoringServiceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $monitoringService = 'monitoringService1469270462';

        try {
            $client->setMonitoringService($projectId, $zone, $clusterId, $monitoringService);
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
    public function setAddonsConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $addonsConfig = new AddonsConfig();

        $response = $client->setAddonsConfig($projectId, $zone, $clusterId, $addonsConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetAddonsConfig', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($addonsConfig, $actualRequestObject->getAddonsConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setAddonsConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $addonsConfig = new AddonsConfig();

        try {
            $client->setAddonsConfig($projectId, $zone, $clusterId, $addonsConfig);
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
    public function setLocationsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $locations = [];

        $response = $client->setLocations($projectId, $zone, $clusterId, $locations);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetLocations', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($locations, $actualRequestObject->getLocations());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setLocationsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $locations = [];

        try {
            $client->setLocations($projectId, $zone, $clusterId, $locations);
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
    public function updateMasterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $masterVersion = 'masterVersion-2139460613';

        $response = $client->updateMaster($projectId, $zone, $clusterId, $masterVersion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/UpdateMaster', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($masterVersion, $actualRequestObject->getMasterVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateMasterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $masterVersion = 'masterVersion-2139460613';

        try {
            $client->updateMaster($projectId, $zone, $clusterId, $masterVersion);
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
    public function setMasterAuthTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $action = SetMasterAuthRequest_Action::UNKNOWN;
        $update = new MasterAuth();

        $response = $client->setMasterAuth($projectId, $zone, $clusterId, $action, $update);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetMasterAuth', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($action, $actualRequestObject->getAction());
        $this->assertProtobufEquals($update, $actualRequestObject->getUpdate());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setMasterAuthExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $action = SetMasterAuthRequest_Action::UNKNOWN;
        $update = new MasterAuth();

        try {
            $client->setMasterAuth($projectId, $zone, $clusterId, $action, $update);
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
    public function deleteClusterTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        $response = $client->deleteCluster($projectId, $zone, $clusterId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/DeleteCluster', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteClusterExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        try {
            $client->deleteCluster($projectId, $zone, $clusterId);
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
    public function listOperationsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListOperationsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';

        $response = $client->listOperations($projectId, $zone);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/ListOperations', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listOperationsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';

        try {
            $client->listOperations($projectId, $zone);
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
    public function getOperationTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $operationId = 'operationId-274116877';

        $response = $client->getOperation($projectId, $zone, $operationId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/GetOperation', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($operationId, $actualRequestObject->getOperationId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getOperationExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $operationId = 'operationId-274116877';

        try {
            $client->getOperation($projectId, $zone, $operationId);
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
    public function cancelOperationTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $operationId = 'operationId-274116877';

        $client->cancelOperation($projectId, $zone, $operationId);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/CancelOperation', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($operationId, $actualRequestObject->getOperationId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function cancelOperationExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $operationId = 'operationId-274116877';

        try {
            $client->cancelOperation($projectId, $zone, $operationId);
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
    public function getServerConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $defaultClusterVersion = 'defaultClusterVersion111003029';
        $defaultImageType = 'defaultImageType-918225828';
        $expectedResponse = new ServerConfig();
        $expectedResponse->setDefaultClusterVersion($defaultClusterVersion);
        $expectedResponse->setDefaultImageType($defaultImageType);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';

        $response = $client->getServerConfig($projectId, $zone);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/GetServerConfig', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getServerConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';

        try {
            $client->getServerConfig($projectId, $zone);
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
    public function listNodePoolsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListNodePoolsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        $response = $client->listNodePools($projectId, $zone, $clusterId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/ListNodePools', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listNodePoolsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        try {
            $client->listNodePools($projectId, $zone, $clusterId);
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
    public function getNodePoolTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $initialNodeCount = 1682564205;
        $selfLink = 'selfLink-1691268851';
        $version = 'version351608024';
        $statusMessage = 'statusMessage-239442758';
        $expectedResponse = new NodePool();
        $expectedResponse->setName($name);
        $expectedResponse->setInitialNodeCount($initialNodeCount);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setVersion($version);
        $expectedResponse->setStatusMessage($statusMessage);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        $response = $client->getNodePool($projectId, $zone, $clusterId, $nodePoolId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/GetNodePool', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getNodePoolExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        try {
            $client->getNodePool($projectId, $zone, $clusterId, $nodePoolId);
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
    public function createNodePoolTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePool = new NodePool();

        $response = $client->createNodePool($projectId, $zone, $clusterId, $nodePool);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/CreateNodePool', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePool, $actualRequestObject->getNodePool());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createNodePoolExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePool = new NodePool();

        try {
            $client->createNodePool($projectId, $zone, $clusterId, $nodePool);
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
    public function deleteNodePoolTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        $response = $client->deleteNodePool($projectId, $zone, $clusterId, $nodePoolId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/DeleteNodePool', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteNodePoolExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        try {
            $client->deleteNodePool($projectId, $zone, $clusterId, $nodePoolId);
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
    public function rollbackNodePoolUpgradeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        $response = $client->rollbackNodePoolUpgrade($projectId, $zone, $clusterId, $nodePoolId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/RollbackNodePoolUpgrade', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function rollbackNodePoolUpgradeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';

        try {
            $client->rollbackNodePoolUpgrade($projectId, $zone, $clusterId, $nodePoolId);
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
    public function setNodePoolManagementTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $management = new NodeManagement();

        $response = $client->setNodePoolManagement($projectId, $zone, $clusterId, $nodePoolId, $management);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetNodePoolManagement', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());
        $this->assertProtobufEquals($management, $actualRequestObject->getManagement());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setNodePoolManagementExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $management = new NodeManagement();

        try {
            $client->setNodePoolManagement($projectId, $zone, $clusterId, $nodePoolId, $management);
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
    public function setLabelsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $resourceLabels = [];
        $labelFingerprint = 'labelFingerprint714995737';

        $response = $client->setLabels($projectId, $zone, $clusterId, $resourceLabels, $labelFingerprint);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetLabels', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($resourceLabels, $actualRequestObject->getResourceLabels());
        $this->assertProtobufEquals($labelFingerprint, $actualRequestObject->getLabelFingerprint());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setLabelsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $resourceLabels = [];
        $labelFingerprint = 'labelFingerprint714995737';

        try {
            $client->setLabels($projectId, $zone, $clusterId, $resourceLabels, $labelFingerprint);
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
    public function setLegacyAbacTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $enabled = false;

        $response = $client->setLegacyAbac($projectId, $zone, $clusterId, $enabled);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetLegacyAbac', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($enabled, $actualRequestObject->getEnabled());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setLegacyAbacExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $enabled = false;

        try {
            $client->setLegacyAbac($projectId, $zone, $clusterId, $enabled);
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
    public function startIPRotationTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        $response = $client->startIPRotation($projectId, $zone, $clusterId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/StartIPRotation', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function startIPRotationExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        try {
            $client->startIPRotation($projectId, $zone, $clusterId);
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
    public function completeIPRotationTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        $response = $client->completeIPRotation($projectId, $zone, $clusterId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/CompleteIPRotation', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function completeIPRotationExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';

        try {
            $client->completeIPRotation($projectId, $zone, $clusterId);
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
    public function setNodePoolSizeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $nodeCount = 1539922066;

        $response = $client->setNodePoolSize($projectId, $zone, $clusterId, $nodePoolId, $nodeCount);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetNodePoolSize', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($nodePoolId, $actualRequestObject->getNodePoolId());
        $this->assertProtobufEquals($nodeCount, $actualRequestObject->getNodeCount());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setNodePoolSizeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $nodePoolId = 'nodePoolId1043384033';
        $nodeCount = 1539922066;

        try {
            $client->setNodePoolSize($projectId, $zone, $clusterId, $nodePoolId, $nodeCount);
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
    public function setNetworkPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $networkPolicy = new NetworkPolicy();

        $response = $client->setNetworkPolicy($projectId, $zone, $clusterId, $networkPolicy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetNetworkPolicy', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($networkPolicy, $actualRequestObject->getNetworkPolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setNetworkPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $networkPolicy = new NetworkPolicy();

        try {
            $client->setNetworkPolicy($projectId, $zone, $clusterId, $networkPolicy);
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
    public function setMaintenancePolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $zone2 = 'zone2-696322977';
        $detail = 'detail-1335224239';
        $statusMessage = 'statusMessage-239442758';
        $selfLink = 'selfLink-1691268851';
        $targetLink = 'targetLink-2084812312';
        $startTime = 'startTime-1573145462';
        $endTime = 'endTime1725551537';
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setZone($zone2);
        $expectedResponse->setDetail($detail);
        $expectedResponse->setStatusMessage($statusMessage);
        $expectedResponse->setSelfLink($selfLink);
        $expectedResponse->setTargetLink($targetLink);
        $expectedResponse->setStartTime($startTime);
        $expectedResponse->setEndTime($endTime);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $maintenancePolicy = new MaintenancePolicy();

        $response = $client->setMaintenancePolicy($projectId, $zone, $clusterId, $maintenancePolicy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.container.v1.ClusterManager/SetMaintenancePolicy', $actualFuncCall);

        $this->assertProtobufEquals($projectId, $actualRequestObject->getProjectId());
        $this->assertProtobufEquals($zone, $actualRequestObject->getZone());
        $this->assertProtobufEquals($clusterId, $actualRequestObject->getClusterId());
        $this->assertProtobufEquals($maintenancePolicy, $actualRequestObject->getMaintenancePolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setMaintenancePolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockClusterManagerImpl']);
        $client = $this->createClient('createClusterManagerStubFunction', $grpcStub);

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
        $zone = 'zone3744684';
        $clusterId = 'clusterId240280960';
        $maintenancePolicy = new MaintenancePolicy();

        try {
            $client->setMaintenancePolicy($projectId, $zone, $clusterId, $maintenancePolicy);
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
