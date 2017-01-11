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

namespace Google\Cloud\Tests\ErrorReporting\V1beta1;

use Google\Cloud\ErrorReporting\V1beta1\ErrorGroupServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\ErrorGroup;

/**
 * @group error_reporting
 * @group grpc
 */
class ErrorGroupServiceTest extends PHPUnit_Framework_TestCase
{
    public function createMockErrorGroupServiceImpl($hostname, $opts)
    {
        return new MockErrorGroupServiceImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ErrorGroupServiceClient::SERVICE_ADDRESS,
            ErrorGroupServiceClient::DEFAULT_SERVICE_PORT
        );
        $client = new ErrorGroupServiceClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function getGroupTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockErrorGroupServiceImpl'], 'createErrorGroupServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $groupId = 'groupId506361563';
        $expectedResponse = new ErrorGroup();
        $expectedResponse->setName($name);
        $expectedResponse->setGroupId($groupId);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedGroupName = ErrorGroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        $response = $client->getGroup($formattedGroupName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetGroup', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedGroupName, $actualRequestObject->getGroupName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateGroupTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockErrorGroupServiceImpl'], 'createErrorGroupServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $groupId = 'groupId506361563';
        $expectedResponse = new ErrorGroup();
        $expectedResponse->setName($name);
        $expectedResponse->setGroupId($groupId);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $group = new ErrorGroup();

        $response = $client->updateGroup($group);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('UpdateGroup', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($group, $actualRequestObject->getGroup());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
