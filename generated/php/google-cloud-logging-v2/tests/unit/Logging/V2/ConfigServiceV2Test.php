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

use Google\Cloud\Logging\V2\ConfigServiceV2Client;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\logging\v2\ListSinksResponse;
use google\logging\v2\LogSink;

/**
 * @group logging
 * @group grpc
 */
class ConfigServiceV2Test extends PHPUnit_Framework_TestCase
{
    public function createMockConfigServiceV2Impl($hostname, $opts)
    {
        return new MockConfigServiceV2Impl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ConfigServiceV2Client::SERVICE_ADDRESS,
            ConfigServiceV2Client::DEFAULT_SERVICE_PORT
        );
        $client = new ConfigServiceV2Client([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function listSinksTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockConfigServiceV2Impl'], 'createConfigServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $sinksElement = new LogSink();
        $sinks = [$sinksElement];
        $expectedResponse = new ListSinksResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($sinks as $elem) {
            $expectedResponse->addSinks($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');

        $response = $client->listSinks($formattedParent);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListSinks', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSinksList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSinkTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockConfigServiceV2Impl'], 'createConfigServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        $response = $client->getSink($formattedSinkName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetSink', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSinkTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockConfigServiceV2Impl'], 'createConfigServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = ConfigServiceV2Client::formatProjectName('[PROJECT]');
        $sink = new LogSink();

        $response = $client->createSink($formattedParent, $sink);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateSink', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSinkTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockConfigServiceV2Impl'], 'createConfigServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destination = 'destination-1429847026';
        $filter = 'filter-1274492040';
        $writerIdentity = 'writerIdentity775638794';
        $expectedResponse = new LogSink();
        $expectedResponse->setName($name);
        $expectedResponse->setDestination($destination);
        $expectedResponse->setFilter($filter);
        $expectedResponse->setWriterIdentity($writerIdentity);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');
        $sink = new LogSink();

        $response = $client->updateSink($formattedSinkName, $sink);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('UpdateSink', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSinkTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockConfigServiceV2Impl'], 'createConfigServiceV2StubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        $client->deleteSink($formattedSinkName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteSink', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertTrue($grpcStub->isExhausted());
    }
}
