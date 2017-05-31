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

namespace Google\Cloud\Tests\Speech\V1beta1;

use Google\Cloud\Speech\V1beta1\SpeechClient;
use Google\GAX\ApiException;
use Google\GAX\BidiStream;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\cloud\speech\v1beta1\AsyncRecognizeResponse;
use google\cloud\speech\v1beta1\RecognitionAudio;
use google\cloud\speech\v1beta1\RecognitionConfig;
use google\cloud\speech\v1beta1\RecognitionConfig\AudioEncoding;
use google\cloud\speech\v1beta1\StreamingRecognizeRequest;
use google\cloud\speech\v1beta1\StreamingRecognizeResponse;
use google\cloud\speech\v1beta1\SyncRecognizeResponse;
use google\longrunning\GetOperationRequest;
use google\longrunning\Operation;
use google\protobuf\Any;
use stdClass;

/**
 * @group speech
 * @group grpc
 */
class SpeechClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockSpeechImpl($hostname, $opts)
    {
        return new MockSpeechImpl($hostname, $opts);
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
            SpeechClient::SERVICE_ADDRESS,
            SpeechClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return SpeechClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new SpeechClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function syncRecognizeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new SyncRecognizeResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $encoding = AudioEncoding::FLAC;
        $sampleRate = 44100;
        $config = new RecognitionConfig();
        $config->setEncoding($encoding);
        $config->setSampleRate($sampleRate);
        $uri = 'gs://bucket_name/file_name.flac';
        $audio = new RecognitionAudio();
        $audio->setUri($uri);

        $response = $client->syncRecognize($config, $audio);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/SyncRecognize', $actualFuncCall);

        $this->assertEquals($config, $actualRequestObject->getConfig());
        $this->assertEquals($audio, $actualRequestObject->getAudio());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function syncRecognizeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $encoding = AudioEncoding::FLAC;
        $sampleRate = 44100;
        $config = new RecognitionConfig();
        $config->setEncoding($encoding);
        $config->setSampleRate($sampleRate);
        $uri = 'gs://bucket_name/file_name.flac';
        $audio = new RecognitionAudio();
        $audio->setUri($uri);

        try {
            $client->syncRecognize($config, $audio);
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
    public function asyncRecognizeTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/asyncRecognizeTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $expectedResponse = new AsyncRecognizeResponse();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/asyncRecognizeTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $encoding = AudioEncoding::FLAC;
        $sampleRate = 44100;
        $config = new RecognitionConfig();
        $config->setEncoding($encoding);
        $config->setSampleRate($sampleRate);
        $uri = 'gs://bucket_name/file_name.flac';
        $audio = new RecognitionAudio();
        $audio->setUri($uri);

        $response = $client->asyncRecognize($config, $audio);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->getReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/AsyncRecognize', $actualApiFuncCall);
        $this->assertEquals($config, $actualApiRequestObject->getConfig());
        $this->assertEquals($audio, $actualApiRequestObject->getAudio());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/asyncRecognizeTest');

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

    /**
     * @test
     */
    public function asyncRecognizeExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/asyncRecognizeTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $operationsStub->addResponse(null, $status);

        // Mock request
        $encoding = AudioEncoding::FLAC;
        $sampleRate = 44100;
        $config = new RecognitionConfig();
        $config->setEncoding($encoding);
        $config->setSampleRate($sampleRate);
        $uri = 'gs://bucket_name/file_name.flac';
        $audio = new RecognitionAudio();
        $audio->setUri($uri);

        $response = $client->asyncRecognize($config, $audio);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/asyncRecognizeTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call getReceivedCalls to ensure the stubs are exhausted
        $grpcStub->getReceivedCalls();
        $operationsStub->getReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function streamingRecognizeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $resultIndex = 520358448;
        $expectedResponse = new StreamingRecognizeResponse();
        $expectedResponse->setResultIndex($resultIndex);
        $grpcStub->addResponse($expectedResponse);
        $grpcStub->addResponse($expectedResponse);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $request = new StreamingRecognizeRequest();

        $bidi = $client->streamingRecognize();
        $this->assertInstanceOf(BidiStream::class, $bidi);

        $bidi->write($request);
        $responses = [];
        $responses[] = $bidi->read();

        $bidi->writeAll([$request, $request]);
        foreach ($bidi->closeWriteAndReadAll() as $response) {
            $responses[] = $response;
        }

        $this->assertEquals([$expectedResponse, $expectedResponse, $expectedResponse], $responses);

        $createStreamRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($createStreamRequests));
        $streamFuncCall = $createStreamRequests[0]->getFuncCall();
        $streamRequestObject = $createStreamRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/StreamingRecognize', $streamFuncCall);
        $this->assertNull($streamRequestObject);

        $callObjects = $grpcStub->getCallObjects();
        $this->assertSame(1, count($callObjects));
        $bidiCall = $callObjects[0];

        $writeRequests = $bidiCall->getReceivedCalls();
        $this->assertSame(3, count($writeRequests));
        foreach ($writeRequests as $writeRequest) {
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function streamingRecognizeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $grpcStub->setStreamingStatus($status);

        $this->assertTrue($grpcStub->isExhausted());

        $bidi = $client->streamingRecognize();
        $results = $bidi->closeWriteAndReadAll();

        try {
            iterator_to_array($results);
            // If the close stream method call did not throw, fail the test
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
