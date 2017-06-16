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

namespace Google\Cloud\Tests\Vision\V1;

use Google\Cloud\Vision\V1\ImageAnnotatorClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\cloud\vision\v1\BatchAnnotateImagesResponse;
use google\protobuf\Any;
use stdClass;

/**
 * @group vision
 * @group grpc
 */
class ImageAnnotatorClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockImageAnnotatorImpl($hostname, $opts)
    {
        return new MockImageAnnotatorImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ImageAnnotatorClient::SERVICE_ADDRESS,
            ImageAnnotatorClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ImageAnnotatorClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ImageAnnotatorClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function batchAnnotateImagesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockImageAnnotatorImpl']);
        $client = $this->createClient('createImageAnnotatorStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new BatchAnnotateImagesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $requests = [];

        $response = $client->batchAnnotateImages($requests);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.vision.v1.ImageAnnotator/BatchAnnotateImages', $actualFuncCall);

        $this->assertEquals($requests, $actualRequestObject->getRequestsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchAnnotateImagesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockImageAnnotatorImpl']);
        $client = $this->createClient('createImageAnnotatorStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $requests = [];

        try {
            $client->batchAnnotateImages($requests);
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
