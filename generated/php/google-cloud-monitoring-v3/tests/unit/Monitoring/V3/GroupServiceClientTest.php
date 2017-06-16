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

namespace Google\Cloud\Tests\Monitoring\V3;

use Google\Cloud\Monitoring\V3\GroupServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\api\MonitoredResource;
use google\monitoring\v3\Group;
use google\monitoring\v3\ListGroupMembersResponse;
use google\monitoring\v3\ListGroupsResponse;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use stdClass;

/**
 * @group monitoring
 * @group grpc
 */
class GroupServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockGroupServiceImpl($hostname, $opts)
    {
        return new MockGroupServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            GroupServiceClient::SERVICE_ADDRESS,
            GroupServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return GroupServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new GroupServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listGroupsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $groupElement = new Group();
        $group = [$groupElement];
        $expectedResponse = new ListGroupsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($group as $elem) {
            $expectedResponse->addGroup($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = GroupServiceClient::formatProjectName('[PROJECT]');

        $response = $client->listGroups($formattedName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getGroupList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/ListGroups', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listGroupsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $formattedName = GroupServiceClient::formatProjectName('[PROJECT]');

        try {
            $client->listGroups($formattedName);
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
    public function getGroupTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $parentName = 'parentName1015022848';
        $filter = 'filter-1274492040';
        $isCluster = false;
        $expectedResponse = new Group();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setParentName($parentName);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setIsCluster($isCluster);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        $response = $client->getGroup($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/GetGroup', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        try {
            $client->getGroup($formattedName);
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
    public function createGroupTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $parentName = 'parentName1015022848';
        $filter = 'filter-1274492040';
        $isCluster = false;
        $expectedResponse = new Group();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setParentName($parentName);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setIsCluster($isCluster);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = GroupServiceClient::formatProjectName('[PROJECT]');
        $group = new Group();

        $response = $client->createGroup($formattedName, $group);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/CreateGroup', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($group, $actualRequestObject->getGroup());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $formattedName = GroupServiceClient::formatProjectName('[PROJECT]');
        $group = new Group();

        try {
            $client->createGroup($formattedName, $group);
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
    public function updateGroupTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $parentName = 'parentName1015022848';
        $filter = 'filter-1274492040';
        $isCluster = false;
        $expectedResponse = new Group();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setParentName($parentName);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setIsCluster($isCluster);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $group = new Group();

        $response = $client->updateGroup($group);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/UpdateGroup', $actualFuncCall);

        $this->assertEquals($group, $actualRequestObject->getGroup());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $group = new Group();

        try {
            $client->updateGroup($group);
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
    public function deleteGroupTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        $client->deleteGroup($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/DeleteGroup', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        try {
            $client->deleteGroup($formattedName);
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
    public function listGroupMembersTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $totalSize = -705419236;
        $membersElement = new MonitoredResource();
        $members = [$membersElement];
        $expectedResponse = new ListGroupMembersResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTotalSize($totalSize);
        foreach ($members as $elem) {
            $expectedResponse->addMembers($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        $response = $client->listGroupMembers($formattedName);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getMembersList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.monitoring.v3.GroupService/ListGroupMembers', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listGroupMembersExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockGroupServiceImpl']);
        $client = $this->createClient('createGroupServiceStubFunction', $grpcStub);

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
        $formattedName = GroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        try {
            $client->listGroupMembers($formattedName);
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
