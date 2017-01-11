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

namespace Google\Cloud\Tests\Speech\V1beta1;

use Google\Cloud\Speech\V1beta1\SpeechClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\cloud\speech\v1beta1\RecognitionAudio;
use google\cloud\speech\v1beta1\RecognitionConfig;
use google\cloud\speech\v1beta1\SyncRecognizeResponse;

/**
 * @group speech
 * @group grpc
 */
class SpeechTest extends PHPUnit_Framework_TestCase
{
    public function createMockSpeechImpl($hostname, $opts)
    {
        return new MockSpeechImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            SpeechClient::SERVICE_ADDRESS,
            SpeechClient::DEFAULT_SERVICE_PORT
        );
        $client = new SpeechClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function syncRecognizeTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockSpeechImpl'], 'createSpeechStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new SyncRecognizeResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $config = new RecognitionConfig();
        $audio = new RecognitionAudio();

        $response = $client->syncRecognize($config, $audio);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('SyncRecognize', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($config, $actualRequestObject->getConfig());
        $this->assertEquals($audio, $actualRequestObject->getAudio());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
