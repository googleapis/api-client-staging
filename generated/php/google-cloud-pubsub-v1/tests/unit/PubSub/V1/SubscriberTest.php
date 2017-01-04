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

use Google\Cloud\PubSub\V1\SubscriberClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\iam\v1\Policy;
use google\iam\v1\TestIamPermissionsResponse;
use google\pubsub\v1\ListSubscriptionsResponse;
use google\pubsub\v1\PullResponse;
use google\pubsub\v1\PushConfig;
use google\pubsub\v1\Subscription;

class SubscriberTest extends PHPUnit_Framework_TestCase
{
    public function createMockSubscriberImpl($hostname, $opts)
    {
        return new MockSubscriberImpl($hostname, $opts);
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
            SubscriberClient::SERVICE_ADDRESS,
            SubscriberClient::DEFAULT_SERVICE_PORT
        );
        $client = new SubscriberClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function createSubscriptionTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $topic2 = 'topic2-1139259102';
        $ackDeadlineSeconds = 2135351438;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name2);
        $expectedResponse->setTopic($topic2);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $formattedTopic = SubscriberClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->createSubscription($formattedName, $formattedTopic);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('CreateSubscription', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSubscriptionTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $topic = 'topic110546223';
        $ackDeadlineSeconds = 2135351438;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name);
        $expectedResponse->setTopic($topic);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->getSubscription($formattedSubscription);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('GetSubscription', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSubscriptionsTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $subscriptionsElement = new Subscription();
        $subscriptions = [$subscriptionsElement];
        $expectedResponse = new ListSubscriptionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($subscriptions as $elem) {
            $expectedResponse->addSubscriptions($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        $response = $client->listSubscriptions($formattedProject);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ListSubscriptions', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());

        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSubscriptionsList()[0], $resources[0]);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSubscriptionTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $client->deleteSubscription($formattedSubscription);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('DeleteSubscription', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyAckDeadlineTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];
        $ackDeadlineSeconds = 2135351438;

        $client->modifyAckDeadline($formattedSubscription, $ackIds, $ackDeadlineSeconds);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ModifyAckDeadline', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($ackIds, $actualRequestObject->getAckIdsList());
        $this->assertEquals($ackDeadlineSeconds, $actualRequestObject->getAckDeadlineSeconds());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function acknowledgeTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];

        $client->acknowledge($formattedSubscription, $ackIds);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('Acknowledge', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($ackIds, $actualRequestObject->getAckIdsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function pullTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new PullResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $maxMessages = 496131527;

        $response = $client->pull($formattedSubscription, $maxMessages);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('Pull', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($maxMessages, $actualRequestObject->getMaxMessages());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyPushConfigTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSubscriberImpl'], 'createSubscriberStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $pushConfig = new PushConfig();

        $client->modifyPushConfig($formattedSubscription, $pushConfig);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ModifyPushConfig', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($pushConfig, $actualRequestObject->getPushConfig());

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
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
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
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

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
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
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
