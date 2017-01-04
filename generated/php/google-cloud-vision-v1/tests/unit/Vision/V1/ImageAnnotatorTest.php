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

namespace Google\Cloud\Tests\Vision\V1;

use Google\Cloud\Vision\V1\ImageAnnotatorClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\cloud\vision\v1\BatchAnnotateImagesResponse;

class ImageAnnotatorTest extends PHPUnit_Framework_TestCase
{
    public function createMockImageAnnotatorImpl($hostname, $opts)
    {
        return new MockImageAnnotatorImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ImageAnnotatorClient::SERVICE_ADDRESS,
            ImageAnnotatorClient::DEFAULT_SERVICE_PORT
        );
        $client = new ImageAnnotatorClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function batchAnnotateImagesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockImageAnnotatorImpl'], 'createImageAnnotatorStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new BatchAnnotateImagesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $requests = [];

        $response = $client->batchAnnotateImages($requests);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('BatchAnnotateImages', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($requests, $actualRequestObject->getRequestsList());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
