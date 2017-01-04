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

namespace Google\Cloud\Tests\PubSub\V1;

use Google\Cloud\PubSub\V1\PublisherClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\iam\v1\Policy;
use google\iam\v1\TestIamPermissionsResponse;
use google\pubsub\v1\ListTopicSubscriptionsResponse;
use google\pubsub\v1\ListTopicsResponse;
use google\pubsub\v1\PublishResponse;
use google\pubsub\v1\PubsubMessage;
use google\pubsub\v1\Topic;

class PublisherTest extends PHPUnit_Framework_TestCase
{
    public function createMockPublisherImpl($hostname, $opts)
    {
        return new MockPublisherImpl($hostname, $opts);
    }

    public function createMockIAMPolicyImpl($hostname, $opts)
    {
        return new MockIAMPolicyImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            PublisherClient::SERVICE_ADDRESS,
            PublisherClient::DEFAULT_SERVICE_PORT
        );
        $client = new PublisherClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function createTopicTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Topic();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->createTopic($formattedName);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateTopic', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function publishTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $messageIdsElement = 'messageIdsElement-744837059';
        $messageIds = [$messageIdsElement];
        $expectedResponse = new PublishResponse();
        foreach ($messageIds as $elem) {
            $expectedResponse->addMessageIds($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $data = '-86';
        $messagesElement = new PubsubMessage();
        $messagesElement->setData($data);
        $messages = [$messagesElement];

        $response = $client->publish($formattedTopic, $messages);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('Publish', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());
        $this->assertEquals($messages, $actualRequestObject->getMessagesList());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTopicTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new Topic();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->getTopic($formattedTopic);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetTopic', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTopicsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $topicsElement = new Topic();
        $topics = [$topicsElement];
        $expectedResponse = new ListTopicsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($topics as $elem) {
            $expectedResponse->addTopics($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = PublisherClient::formatProjectName('[PROJECT]');

        $response = $client->listTopics($formattedProject);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListTopics', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTopicsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTopicSubscriptionsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $subscriptionsElement = 'subscriptionsElement1698708147';
        $subscriptions = [$subscriptionsElement];
        $expectedResponse = new ListTopicSubscriptionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($subscriptions as $elem) {
            $expectedResponse->addSubscriptions($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->listTopicSubscriptions($formattedTopic);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListTopicSubscriptions', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSubscriptionsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteTopicTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockPublisherImpl'], 'createPublisherStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $client->deleteTopic($formattedTopic);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteTopic', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockIAMPolicyImpl'], 'createIamPolicyStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $policy = new Policy();

        $response = $client->setIamPolicy($formattedResource, $policy);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('SetIamPolicy', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($policy, $actualRequestObject->getPolicy());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockIAMPolicyImpl'], 'createIamPolicyStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->getIamPolicy($formattedResource);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetIamPolicy', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockIAMPolicyImpl'], 'createIamPolicyStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('TestIamPermissions', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($permissions, $actualRequestObject->getPermissionsList());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
