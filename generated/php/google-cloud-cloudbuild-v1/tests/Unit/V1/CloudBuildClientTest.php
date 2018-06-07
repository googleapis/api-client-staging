<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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

namespace Google\Cloud\Devtools\Cloudbuild\Tests\Unit\V1;

use Google\Cloud\Devtools\Cloudbuild\V1\CloudBuildClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\ApiCore\Testing\MockTransport;
use Google\Devtools\Cloudbuild\V1\Build;
use Google\Devtools\Cloudbuild\V1\BuildTrigger;
use Google\Devtools\Cloudbuild\V1\ListBuildTriggersResponse;
use Google\Devtools\Cloudbuild\V1\ListBuildsResponse;
use Google\Devtools\Cloudbuild\V1\RepoSource;
use Google\LongRunning\Operation;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Google\Rpc\Code;
use stdClass;

/**
 * @group cloudbuild
 * @group grpc
 */
class CloudBuildClientTest extends GeneratedTest
{
    /**
     * @return TransportInterface
     */
    private function createTransport($deserialize = null)
    {
        return new MockTransport($deserialize);
    }

    /**
     * @return CloudBuildClient
     */
    private function createClient(array $options = [])
    {
        $options += [
            'credentials' => $this->getMockBuilder(CredentialsWrapper::class)
                ->disableOriginalConstructor()
                ->getMock(),
        ];

        return new CloudBuildClient($options);
    }

    /**
     * @test
     */
    public function createBuildTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $build = new Build();

        $response = $client->createBuild($projectId, $build);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/CreateBuild', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getBuild();

        $this->assertProtobufEquals($build, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createBuildExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $build = new Build();

        try {
            $client->createBuild($projectId, $build);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getBuildTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $id2 = 'id23227150';
        $projectId2 = 'projectId2939242356';
        $statusDetail = 'statusDetail2089931070';
        $logsBucket = 'logsBucket1565363834';
        $buildTriggerId = 'buildTriggerId1105559411';
        $logUrl = 'logUrl342054388';
        $expectedResponse = new Build();
        $expectedResponse->setId($id2);
        $expectedResponse->setProjectId($projectId2);
        $expectedResponse->setStatusDetail($statusDetail);
        $expectedResponse->setLogsBucket($logsBucket);
        $expectedResponse->setBuildTriggerId($buildTriggerId);
        $expectedResponse->setLogUrl($logUrl);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        $response = $client->getBuild($projectId, $id);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/GetBuild', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getId();

        $this->assertProtobufEquals($id, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getBuildExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        try {
            $client->getBuild($projectId, $id);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listBuildsTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $nextPageToken = '';
        $buildsElement = new Build();
        $builds = [$buildsElement];
        $expectedResponse = new ListBuildsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setBuilds($builds);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';

        $response = $client->listBuilds($projectId);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getBuilds()[0], $resources[0]);

        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/ListBuilds', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listBuildsExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';

        try {
            $client->listBuilds($projectId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function cancelBuildTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $id2 = 'id23227150';
        $projectId2 = 'projectId2939242356';
        $statusDetail = 'statusDetail2089931070';
        $logsBucket = 'logsBucket1565363834';
        $buildTriggerId = 'buildTriggerId1105559411';
        $logUrl = 'logUrl342054388';
        $expectedResponse = new Build();
        $expectedResponse->setId($id2);
        $expectedResponse->setProjectId($projectId2);
        $expectedResponse->setStatusDetail($statusDetail);
        $expectedResponse->setLogsBucket($logsBucket);
        $expectedResponse->setBuildTriggerId($buildTriggerId);
        $expectedResponse->setLogUrl($logUrl);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        $response = $client->cancelBuild($projectId, $id);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/CancelBuild', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getId();

        $this->assertProtobufEquals($id, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function cancelBuildExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        try {
            $client->cancelBuild($projectId, $id);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createBuildTriggerTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $id = 'id3355';
        $description = 'description-1724546052';
        $filename = 'filename-734768633';
        $disabled = true;
        $expectedResponse = new BuildTrigger();
        $expectedResponse->setId($id);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilename($filename);
        $expectedResponse->setDisabled($disabled);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $trigger = new BuildTrigger();

        $response = $client->createBuildTrigger($projectId, $trigger);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/CreateBuildTrigger', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getTrigger();

        $this->assertProtobufEquals($trigger, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function createBuildTriggerExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $trigger = new BuildTrigger();

        try {
            $client->createBuildTrigger($projectId, $trigger);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getBuildTriggerTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $id = 'id3355';
        $description = 'description-1724546052';
        $filename = 'filename-734768633';
        $disabled = true;
        $expectedResponse = new BuildTrigger();
        $expectedResponse->setId($id);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilename($filename);
        $expectedResponse->setDisabled($disabled);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';

        $response = $client->getBuildTrigger($projectId, $triggerId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/GetBuildTrigger', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getTriggerId();

        $this->assertProtobufEquals($triggerId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function getBuildTriggerExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';

        try {
            $client->getBuildTrigger($projectId, $triggerId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listBuildTriggersTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new ListBuildTriggersResponse();
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';

        $response = $client->listBuildTriggers($projectId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/ListBuildTriggers', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listBuildTriggersExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';

        try {
            $client->listBuildTriggers($projectId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deleteBuildTriggerTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';

        $client->deleteBuildTrigger($projectId, $triggerId);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/DeleteBuildTrigger', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getTriggerId();

        $this->assertProtobufEquals($triggerId, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deleteBuildTriggerExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';

        try {
            $client->deleteBuildTrigger($projectId, $triggerId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function updateBuildTriggerTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $id = 'id3355';
        $description = 'description-1724546052';
        $filename = 'filename-734768633';
        $disabled = true;
        $expectedResponse = new BuildTrigger();
        $expectedResponse->setId($id);
        $expectedResponse->setDescription($description);
        $expectedResponse->setFilename($filename);
        $expectedResponse->setDisabled($disabled);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';
        $trigger = new BuildTrigger();

        $response = $client->updateBuildTrigger($projectId, $triggerId, $trigger);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/UpdateBuildTrigger', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getTriggerId();

        $this->assertProtobufEquals($triggerId, $actualValue);
        $actualValue = $actualRequestObject->getTrigger();

        $this->assertProtobufEquals($trigger, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function updateBuildTriggerExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';
        $trigger = new BuildTrigger();

        try {
            $client->updateBuildTrigger($projectId, $triggerId, $trigger);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function runBuildTriggerTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';
        $source = new RepoSource();

        $response = $client->runBuildTrigger($projectId, $triggerId, $source);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/RunBuildTrigger', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getTriggerId();

        $this->assertProtobufEquals($triggerId, $actualValue);
        $actualValue = $actualRequestObject->getSource();

        $this->assertProtobufEquals($source, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function runBuildTriggerExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $triggerId = 'triggerId1363517698';
        $source = new RepoSource();

        try {
            $client->runBuildTrigger($projectId, $triggerId, $source);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function retryBuildTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $name = 'name3373707';
        $done = true;
        $expectedResponse = new Operation();
        $expectedResponse->setName($name);
        $expectedResponse->setDone($done);
        $transport->addResponse($expectedResponse);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        $response = $client->retryBuild($projectId, $id);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.cloudbuild.v1.CloudBuild/RetryBuild', $actualFuncCall);

        $actualValue = $actualRequestObject->getProjectId();

        $this->assertProtobufEquals($projectId, $actualValue);
        $actualValue = $actualRequestObject->getId();

        $this->assertProtobufEquals($id, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function retryBuildExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Code::DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Code::DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

        // Mock request
        $projectId = 'projectId-1969970175';
        $id = 'id3355';

        try {
            $client->retryBuild($projectId, $id);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }
}
