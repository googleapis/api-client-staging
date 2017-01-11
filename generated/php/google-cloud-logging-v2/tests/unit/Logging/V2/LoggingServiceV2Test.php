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

namespace Google\Cloud\Tests\Logging\V2;

use Google\Cloud\Logging\V2\LoggingServiceV2Client;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\api\MonitoredResourceDescriptor;
use google\logging\v2\ListLogEntriesResponse;
use google\logging\v2\ListLogsResponse;
use google\logging\v2\ListMonitoredResourceDescriptorsResponse;
use google\logging\v2\LogEntry;
use google\logging\v2\WriteLogEntriesResponse;

/**
 * @group logging
 * @group grpc
 */
class LoggingServiceV2Test extends PHPUnit_Framework_TestCase
{
    public function createMockLoggingServiceV2Impl($hostname, $opts)
    {
        return new MockLoggingServiceV2Impl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            LoggingServiceV2Client::SERVICE_ADDRESS,
            LoggingServiceV2Client::DEFAULT_SERVICE_PORT
        );
        $client = new LoggingServiceV2Client([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function deleteLogTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLoggingServiceV2Impl'], 'createLoggingServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedLogName = LoggingServiceV2Client::formatLogName('[PROJECT]', '[LOG]');

        $client->deleteLog($formattedLogName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteLog', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedLogName, $actualRequestObject->getLogName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function writeLogEntriesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLoggingServiceV2Impl'], 'createLoggingServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new WriteLogEntriesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $entries = [];

        $response = $client->writeLogEntries($entries);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('WriteLogEntries', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($entries, $actualRequestObject->getEntriesList());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listLogEntriesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLoggingServiceV2Impl'], 'createLoggingServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $entriesElement = new LogEntry();
        $entries = [$entriesElement];
        $expectedResponse = new ListLogEntriesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($entries as $elem) {
            $expectedResponse->addEntries($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $resourceNames = [];

        $response = $client->listLogEntries($resourceNames);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListLogEntries', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($resourceNames, $actualRequestObject->getResourceNamesList());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getEntriesList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listMonitoredResourceDescriptorsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLoggingServiceV2Impl'], 'createLoggingServiceV2StubFunction');

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

        $response = $client->listMonitoredResourceDescriptors();
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListMonitoredResourceDescriptors', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getResourceDescriptorsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listLogsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLoggingServiceV2Impl'], 'createLoggingServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $logNamesElement = 'logNamesElement-1079688374';
        $logNames = [$logNamesElement];
        $expectedResponse = new ListLogsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($logNames as $elem) {
            $expectedResponse->addLogNames($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = LoggingServiceV2Client::formatProjectName('[PROJECT]');

        $response = $client->listLogs($formattedParent);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListLogs', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getLogNamesList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
