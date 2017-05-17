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

namespace Google\Cloud\Tests\VideoIntelligence\V1Beta1;

use Google\Cloud\VideoIntelligence\V1Beta1\VideoIntelligenceServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use PHPUnit_Framework_TestCase;
use google\cloud\videointelligence\v1beta1\AnnotateVideoResponse;
use google\longrunning\GetOperationRequest;
use google\longrunning\Operation;
use google\protobuf\Any;

/**
 * @group video_intelligence
 * @group grpc
 */
class VideoIntelligenceServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockVideoIntelligenceServiceImpl($hostname, $opts)
    {
        return new MockVideoIntelligenceServiceImpl($hostname, $opts);
    }

    public function createMockOperationsStub($hostname, $opts)
    {
        return new MockOperationsImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            VideoIntelligenceServiceClient::SERVICE_ADDRESS,
            VideoIntelligenceServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return VideoIntelligenceServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new VideoIntelligenceServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function annotateVideoTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockVideoIntelligenceServiceImpl']);
        $client = $this->createClient('createVideoIntelligenceServiceStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/annotateVideoTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $expectedResponse = new AnnotateVideoResponse();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/annotateVideoTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $inputUri = 'inputUri1707300727';
        $features = [];

        $response = $client->annotateVideo($inputUri, $features);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->getReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.videointelligence.v1beta1.VideoIntelligenceService/AnnotateVideo', $actualApiFuncCall);
        $this->assertEquals($inputUri, $actualApiRequestObject->getInputUri());
        $this->assertEquals($features, $actualApiRequestObject->getFeaturesList());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/annotateVideoTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->getReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->getReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }
}
