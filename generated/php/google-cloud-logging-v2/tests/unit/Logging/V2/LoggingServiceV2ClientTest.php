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

namespace Google\Cloud\Tests\Logging\V2;

use Google\Cloud\Logging\V2\LoggingServiceV2Client;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\api\MonitoredResourceDescriptor;
use google\logging\v2\ListLogEntriesResponse;
use google\logging\v2\ListLogsResponse;
use google\logging\v2\ListMonitoredResourceDescriptorsResponse;
use google\logging\v2\LogEntry;
use google\logging\v2\WriteLogEntriesResponse;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use stdClass;

/**
 * @group logging
 * @group grpc
 */
class LoggingServiceV2ClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockLoggingServiceV2Impl($hostname, $opts)
    {
        return new MockLoggingServiceV2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            LoggingServiceV2Client::SERVICE_ADDRESS,
            LoggingServiceV2Client::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return LoggingServiceV2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new LoggingServiceV2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function deleteLogTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedLogName = LoggingServiceV2Client::formatLogName('[PROJECT]', '[LOG]');

        $client->deleteLog($formattedLogName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.LoggingServiceV2/DeleteLog', $actualFuncCall);

        $this->assertEquals($formattedLogName, $actualRequestObject->getLogName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteLogExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedLogName = LoggingServiceV2Client::formatLogName('[PROJECT]', '[LOG]');

        try {
            $client->deleteLog($formattedLogName);
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
    public function writeLogEntriesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new WriteLogEntriesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $entries = [];

        $response = $client->writeLogEntries($entries);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.LoggingServiceV2/WriteLogEntries', $actualFuncCall);

        $this->assertEquals($entries, $actualRequestObject->getEntriesList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function writeLogEntriesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $entries = [];

        try {
            $client->writeLogEntries($entries);
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
    public function listLogEntriesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getEntriesList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.LoggingServiceV2/ListLogEntries', $actualFuncCall);

        $this->assertEquals($resourceNames, $actualRequestObject->getResourceNamesList());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listLogEntriesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $resourceNames = [];

        try {
            $client->listLogEntries($resourceNames);
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
    public function listMonitoredResourceDescriptorsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getResourceDescriptorsList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.LoggingServiceV2/ListMonitoredResourceDescriptors', $actualFuncCall);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listMonitoredResourceDescriptorsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        try {
            $client->listMonitoredResourceDescriptors();
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
    public function listLogsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getLogNamesList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.LoggingServiceV2/ListLogs', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listLogsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLoggingServiceV2Impl']);
        $client = $this->createClient('createLoggingServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = LoggingServiceV2Client::formatProjectName('[PROJECT]');

        try {
            $client->listLogs($formattedParent);
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
