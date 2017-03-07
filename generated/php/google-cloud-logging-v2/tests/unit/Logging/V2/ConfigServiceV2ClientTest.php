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

use Google\Cloud\Logging\V2\ConfigServiceV2Client;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\logging\v2\ListSinksResponse;
use google\logging\v2\LogSink;
use google\protobuf\Any;
use google\protobuf\EmptyC;

/**
 * @group logging
 * @group grpc
 */
class ConfigServiceV2ClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockConfigServiceV2Impl($hostname, $opts)
    {
        return new MockConfigServiceV2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ConfigServiceV2Client::SERVICE_ADDRESS,
            ConfigServiceV2Client::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ConfigServiceV2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ConfigServiceV2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listSinksTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSinksList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/ListSinks', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/GetSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/CreateSink', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/UpdateSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());
        $this->assertEquals($sink, $actualRequestObject->getSink());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSinkTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockConfigServiceV2Impl']);
        $client = $this->createClient('createConfigServiceV2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Add empty response to the grpc stub
        $grpcStub->addResponse(new EmptyC());
        // Mock request
        $formattedSinkName = ConfigServiceV2Client::formatSinkName('[PROJECT]', '[SINK]');

        $client->deleteSink($formattedSinkName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.logging.v2.ConfigServiceV2/DeleteSink', $actualFuncCall);

        $this->assertEquals($formattedSinkName, $actualRequestObject->getSinkName());

        $this->assertTrue($grpcStub->isExhausted());
    }
}
