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

namespace Google\Cloud\Tests\PubSub\V1;

use Google\Cloud\PubSub\V1\SubscriberClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\iam\v1\Policy;
use google\iam\v1\TestIamPermissionsResponse;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use google\protobuf\FieldMask;
use google\pubsub\v1\ListSnapshotsResponse;
use google\pubsub\v1\ListSubscriptionsResponse;
use google\pubsub\v1\PullResponse;
use google\pubsub\v1\PushConfig;
use google\pubsub\v1\SeekResponse;
use google\pubsub\v1\Snapshot;
use google\pubsub\v1\Subscription;
use stdClass;

/**
 * @group pub_sub
 * @group grpc
 */
class SubscriberClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockSubscriberImpl($hostname, $opts)
    {
        return new MockSubscriberImpl($hostname, $opts);
    }

    public function createMockIAMPolicyImpl($hostname, $opts)
    {
        return new MockIAMPolicyImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            SubscriberClient::SERVICE_ADDRESS,
            SubscriberClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return SubscriberClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new SubscriberClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function createSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $topic2 = 'topic2-1139259102';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name2);
        $expectedResponse->setTopic($topic2);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $formattedTopic = SubscriberClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->createSubscription($formattedName, $formattedTopic);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/CreateSubscription', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $formattedTopic = SubscriberClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->createSubscription($formattedName, $formattedTopic);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $topic = 'topic110546223';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name);
        $expectedResponse->setTopic($topic);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->getSubscription($formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/GetSubscription', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->getSubscription($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $topic = 'topic110546223';
        $ackDeadlineSeconds = 2135351438;
        $retainAckedMessages = false;
        $expectedResponse = new Subscription();
        $expectedResponse->setName($name);
        $expectedResponse->setTopic($topic);
        $expectedResponse->setAckDeadlineSeconds($ackDeadlineSeconds);
        $expectedResponse->setRetainAckedMessages($retainAckedMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $subscription = new Subscription();
        $updateMask = new FieldMask();

        $response = $client->updateSubscription($subscription, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/UpdateSubscription', $actualFuncCall);

        $this->assertEquals($subscription, $actualRequestObject->getSubscription());
        $this->assertEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $subscription = new Subscription();
        $updateMask = new FieldMask();

        try {
            $client->updateSubscription($subscription, $updateMask);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSubscriptionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSubscriptionsList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ListSubscriptions', $actualFuncCall);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSubscriptionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        try {
            $client->listSubscriptions($formattedProject);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSubscriptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $client->deleteSubscription($formattedSubscription);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/DeleteSubscription', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSubscriptionExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->deleteSubscription($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyAckDeadlineTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];
        $ackDeadlineSeconds = 2135351438;

        $client->modifyAckDeadline($formattedSubscription, $ackIds, $ackDeadlineSeconds);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ModifyAckDeadline', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($ackIds, $actualRequestObject->getAckIdsList());
        $this->assertEquals($ackDeadlineSeconds, $actualRequestObject->getAckDeadlineSeconds());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyAckDeadlineExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];
        $ackDeadlineSeconds = 2135351438;

        try {
            $client->modifyAckDeadline($formattedSubscription, $ackIds, $ackDeadlineSeconds);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function acknowledgeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];

        $client->acknowledge($formattedSubscription, $ackIds);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Acknowledge', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($ackIds, $actualRequestObject->getAckIdsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function acknowledgeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $ackIds = [];

        try {
            $client->acknowledge($formattedSubscription, $ackIds);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function pullTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new PullResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $maxMessages = 496131527;

        $response = $client->pull($formattedSubscription, $maxMessages);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Pull', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($maxMessages, $actualRequestObject->getMaxMessages());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function pullExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $maxMessages = 496131527;

        try {
            $client->pull($formattedSubscription, $maxMessages);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyPushConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $pushConfig = new PushConfig();

        $client->modifyPushConfig($formattedSubscription, $pushConfig);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ModifyPushConfig', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());
        $this->assertEquals($pushConfig, $actualRequestObject->getPushConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function modifyPushConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $pushConfig = new PushConfig();

        try {
            $client->modifyPushConfig($formattedSubscription, $pushConfig);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSnapshotsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $snapshotsElement = new Snapshot();
        $snapshots = [$snapshotsElement];
        $expectedResponse = new ListSnapshotsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($snapshots as $elem) {
            $expectedResponse->addSnapshots($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        $response = $client->listSnapshots($formattedProject);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSnapshotsList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/ListSnapshots', $actualFuncCall);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listSnapshotsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedProject = SubscriberClient::formatProjectName('[PROJECT]');

        try {
            $client->listSnapshots($formattedProject);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $topic = 'topic110546223';
        $expectedResponse = new Snapshot();
        $expectedResponse->setName($name2);
        $expectedResponse->setTopic($topic);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->createSnapshot($formattedName, $formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/CreateSnapshot', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());
        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->createSnapshot($formattedName, $formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSnapshotTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSnapshot = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');

        $client->deleteSnapshot($formattedSnapshot);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/DeleteSnapshot', $actualFuncCall);

        $this->assertEquals($formattedSnapshot, $actualRequestObject->getSnapshot());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSnapshotExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSnapshot = SubscriberClient::formatSnapshotName('[PROJECT]', '[SNAPSHOT]');

        try {
            $client->deleteSnapshot($formattedSnapshot);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function seekTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new SeekResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        $response = $client->seek($formattedSubscription);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Subscriber/Seek', $actualFuncCall);

        $this->assertEquals($formattedSubscription, $actualRequestObject->getSubscription());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function seekExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSubscriberImpl']);
        $client = $this->createClient('createSubscriberStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedSubscription = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->seek($formattedSubscription);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/SetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($policy, $actualRequestObject->getPolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $policy = new Policy();

        try {
            $client->setIamPolicy($formattedResource, $policy);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

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
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/GetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');

        try {
            $client->getIamPolicy($formattedResource);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/TestIamPermissions', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($permissions, $actualRequestObject->getPermissionsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = SubscriberClient::formatSubscriptionName('[PROJECT]', '[SUBSCRIPTION]');
        $permissions = [];

        try {
            $client->testIamPermissions($formattedResource, $permissions);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stub is exhausted
        $grpcStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
