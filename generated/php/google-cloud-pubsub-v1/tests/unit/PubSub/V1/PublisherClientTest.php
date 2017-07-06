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

use Google\Cloud\PubSub\V1\PublisherClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\Testing\GeneratedTest;
use Google\Iam\V1\Policy;
use Google\Iam\V1\TestIamPermissionsResponse;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Google\Pubsub\V1\ListTopicSubscriptionsResponse;
use Google\Pubsub\V1\ListTopicsResponse;
use Google\Pubsub\V1\PublishResponse;
use Google\Pubsub\V1\PubsubMessage;
use Google\Pubsub\V1\Topic;
use Grpc;
use stdClass;

/**
 * @group pub_sub
 * @group grpc
 */
class PublisherClientTest extends GeneratedTest
{
    public function createMockPublisherImpl($hostname, $opts)
    {
        return new MockPublisherImpl($hostname, $opts);
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
            PublisherClient::SERVICE_ADDRESS,
            PublisherClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return PublisherClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new PublisherClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function createTopicTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Topic();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->createTopic($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/CreateTopic', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createTopicExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedName = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->createTopic($formattedName);
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
    public function publishTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $messageIdsElement = 'messageIdsElement-744837059';
        $messageIds = [$messageIdsElement];
        $expectedResponse = new PublishResponse();
        $expectedResponse->setMessageIds($messageIds);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $data = '-86';
        $messagesElement = new PubsubMessage();
        $messagesElement->setData($data);
        $messages = [$messagesElement];

        $response = $client->publish($formattedTopic, $messages);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/Publish', $actualFuncCall);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());
        $this->assertRepeatedFieldEquals($messages, $actualRequestObject->getMessages());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function publishExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $data = '-86';
        $messagesElement = new PubsubMessage();
        $messagesElement->setData($data);
        $messages = [$messagesElement];

        try {
            $client->publish($formattedTopic, $messages);
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
    public function getTopicTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new Topic();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->getTopic($formattedTopic);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/GetTopic', $actualFuncCall);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTopicExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->getTopic($formattedTopic);
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
    public function listTopicsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $topicsElement = new Topic();
        $topics = [$topicsElement];
        $expectedResponse = new ListTopicsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTopics($topics);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProject = PublisherClient::formatProjectName('[PROJECT]');

        $response = $client->listTopics($formattedProject);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTopics()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/ListTopics', $actualFuncCall);

        $this->assertEquals($formattedProject, $actualRequestObject->getProject());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTopicsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedProject = PublisherClient::formatProjectName('[PROJECT]');

        try {
            $client->listTopics($formattedProject);
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
    public function listTopicSubscriptionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $subscriptionsElement = 'subscriptionsElement1698708147';
        $subscriptions = [$subscriptionsElement];
        $expectedResponse = new ListTopicSubscriptionsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setSubscriptions($subscriptions);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->listTopicSubscriptions($formattedTopic);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getSubscriptions()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/ListTopicSubscriptions', $actualFuncCall);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTopicSubscriptionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->listTopicSubscriptions($formattedTopic);
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
    public function deleteTopicTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $client->deleteTopic($formattedTopic);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.pubsub.v1.Publisher/DeleteTopic', $actualFuncCall);

        $this->assertEquals($formattedTopic, $actualRequestObject->getTopic());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteTopicExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockPublisherImpl']);
        $client = $this->createClient('createPublisherStubFunction', $grpcStub);

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
        $formattedTopic = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->deleteTopic($formattedTopic);
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
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $policy = new Policy();

        $response = $client->setIamPolicy($formattedResource, $policy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
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

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $policy = new Policy();

        try {
            $client->setIamPolicy($formattedResource, $policy);
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
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        $response = $client->getIamPolicy($formattedResource);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
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

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');

        try {
            $client->getIamPolicy($formattedResource);
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
    public function testIamPermissionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockIAMPolicyImpl']);
        $client = $this->createClient('createIamPolicyStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.iam.v1.IAMPolicy/TestIamPermissions', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertRepeatedFieldEquals($permissions, $actualRequestObject->getPermissions());

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

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = PublisherClient::formatTopicName('[PROJECT]', '[TOPIC]');
        $permissions = [];

        try {
            $client->testIamPermissions($formattedResource, $permissions);
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
