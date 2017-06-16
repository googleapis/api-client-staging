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

use Google\Cloud\ErrorReporting\V1beta1\ErrorStatsServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\DeleteEventsResponse;
use google\devtools\clouderrorreporting\v1beta1\ErrorEvent;
use google\devtools\clouderrorreporting\v1beta1\ErrorGroupStats;
use google\devtools\clouderrorreporting\v1beta1\ListEventsResponse;
use google\devtools\clouderrorreporting\v1beta1\ListGroupStatsResponse;
use google\devtools\clouderrorreporting\v1beta1\QueryTimeRange;
use google\protobuf\Any;
use stdClass;

/**
 * @group error_reporting
 * @group grpc
 */
class ErrorStatsServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockErrorStatsServiceImpl($hostname, $opts)
    {
        return new MockErrorStatsServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ErrorStatsServiceClient::SERVICE_ADDRESS,
            ErrorStatsServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ErrorStatsServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ErrorStatsServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listGroupStatsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $errorGroupStatsElement = new ErrorGroupStats();
        $errorGroupStats = [$errorGroupStatsElement];
        $expectedResponse = new ListGroupStatsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($errorGroupStats as $elem) {
            $expectedResponse->addErrorGroupStats($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');
        $timeRange = new QueryTimeRange();

        $response = $client->listGroupStats($formattedProjectName, $timeRange);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getErrorGroupStatsList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListGroupStats', $actualFuncCall);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($timeRange, $actualRequestObject->getTimeRange());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listGroupStatsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

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
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');
        $timeRange = new QueryTimeRange();

        try {
            $client->listGroupStats($formattedProjectName, $timeRange);
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
    public function listEventsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $errorEventsElement = new ErrorEvent();
        $errorEvents = [$errorEventsElement];
        $expectedResponse = new ListEventsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($errorEvents as $elem) {
            $expectedResponse->addErrorEvents($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');
        $groupId = 'groupId506361563';

        $response = $client->listEvents($formattedProjectName, $groupId);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getErrorEventsList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListEvents', $actualFuncCall);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($groupId, $actualRequestObject->getGroupId());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listEventsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

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
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');
        $groupId = 'groupId506361563';

        try {
            $client->listEvents($formattedProjectName, $groupId);
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
    public function deleteEventsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new DeleteEventsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');

        $response = $client->deleteEvents($formattedProjectName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/DeleteEvents', $actualFuncCall);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteEventsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockErrorStatsServiceImpl']);
        $client = $this->createClient('createErrorStatsServiceStubFunction', $grpcStub);

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
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');

        try {
            $client->deleteEvents($formattedProjectName);
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
