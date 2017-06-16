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

namespace Google\Cloud\Tests\ErrorReporting\V1beta1;

use Google\Cloud\ErrorReporting\V1beta1\ErrorGroupServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\ErrorGroup;
use google\protobuf\Any;
use stdClass;

/**
 * @group error_reporting
 * @group grpc
 */
class ErrorGroupServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockErrorGroupServiceImpl($hostname, $opts)
    {
        return new MockErrorGroupServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ErrorGroupServiceClient::SERVICE_ADDRESS,
            ErrorGroupServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ErrorGroupServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ErrorGroupServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function getGroupTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorGroupServiceImpl']);
        $client = $this->createClient('createErrorGroupServiceStubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/GetGroup', $actualFuncCall);

        $this->assertEquals($formattedGroupName, $actualRequestObject->getGroupName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorGroupServiceImpl']);
        $client = $this->createClient('createErrorGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedGroupName = ErrorGroupServiceClient::formatGroupName('[PROJECT]', '[GROUP]');

        try {
            $client->getGroup($formattedGroupName);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
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
        $grpcStub = $this->createStub([$this, 'createMockErrorGroupServiceImpl']);
        $client = $this->createClient('createErrorGroupServiceStubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/UpdateGroup', $actualFuncCall);

        $this->assertEquals($group, $actualRequestObject->getGroup());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateGroupExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorGroupServiceImpl']);
        $client = $this->createClient('createErrorGroupServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $group = new ErrorGroup();

        try {
            $client->updateGroup($group);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
