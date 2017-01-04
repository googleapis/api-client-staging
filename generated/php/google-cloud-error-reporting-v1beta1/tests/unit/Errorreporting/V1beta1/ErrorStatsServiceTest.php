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

namespace Google\Cloud\Tests\Errorreporting\V1beta1;

use Google\Cloud\Errorreporting\V1beta1\ErrorStatsServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\DeleteEventsResponse;
use google\devtools\clouderrorreporting\v1beta1\ErrorEvent;
use google\devtools\clouderrorreporting\v1beta1\ErrorGroupStats;
use google\devtools\clouderrorreporting\v1beta1\ListEventsResponse;
use google\devtools\clouderrorreporting\v1beta1\ListGroupStatsResponse;
use google\devtools\clouderrorreporting\v1beta1\QueryTimeRange;

class ErrorStatsServiceTest extends PHPUnit_Framework_TestCase
{
    public function createMockErrorStatsServiceImpl($hostname, $opts)
    {
        return new MockErrorStatsServiceImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ErrorStatsServiceClient::SERVICE_ADDRESS,
            ErrorStatsServiceClient::DEFAULT_SERVICE_PORT
        );
        $client = new ErrorStatsServiceClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function listGroupStatsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockErrorStatsServiceImpl'], 'createErrorStatsServiceStubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListGroupStats', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($timeRange, $actualRequestObject->getTimeRange());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getErrorGroupStatsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listEventsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockErrorStatsServiceImpl'], 'createErrorStatsServiceStubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListEvents', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($groupId, $actualRequestObject->getGroupId());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getErrorEventsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteEventsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockErrorStatsServiceImpl'], 'createErrorStatsServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new DeleteEventsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ErrorStatsServiceClient::formatProjectName('[PROJECT]');

        $response = $client->deleteEvents($formattedProjectName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteEvents', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
