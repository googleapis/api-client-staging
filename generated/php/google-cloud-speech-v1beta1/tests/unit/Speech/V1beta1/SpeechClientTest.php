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

namespace Google\Cloud\Tests\Unit\Speech\V1beta1;

use Google\Cloud\Speech\V1beta1\SpeechClient;
use Google\Cloud\Speech\V1beta1\AsyncRecognizeRequest;
use Google\Cloud\Speech\V1beta1\AsyncRecognizeResponse;
use Google\Cloud\Speech\V1beta1\RecognitionAudio;
use Google\Cloud\Speech\V1beta1\RecognitionConfig;
use Google\Cloud\Speech\V1beta1\RecognitionConfig_AudioEncoding as AudioEncoding;
use Google\Cloud\Speech\V1beta1\SpeechGrpcClient;
use Google\Cloud\Speech\V1beta1\StreamingRecognizeRequest;
use Google\Cloud\Speech\V1beta1\StreamingRecognizeResponse;
use Google\Cloud\Speech\V1beta1\SyncRecognizeRequest;
use Google\Cloud\Speech\V1beta1\SyncRecognizeResponse;
use Google\GAX\ApiException;
use Google\GAX\BidiStream;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\ServerStream;
use Google\GAX\Testing\GeneratedTest;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Google\GAX\Testing\MockStubTrait;
use Google\Longrunning\GetOperationRequest;
use Google\Longrunning\Operation;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use PHPUnit_Framework_TestCase;
use stdClass;

/**
 * @group speech
 * @group grpc
 */
class SpeechClientTest extends GeneratedTest
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
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => SpeechClient::SERVICE_ADDRESS,
            'port' => SpeechClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);
        return $grpcCredentialsHelper->createStub($createGrpcStub);
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
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/SyncRecognize', $actualFuncCall);

        $this->assertProtobufEquals($config, $actualRequestObject->getConfig());
        $this->assertProtobufEquals($audio, $actualRequestObject->getAudio());

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

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
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
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
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
            }
        ]);
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/asyncRecognizeTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $expectedResponse = new AsyncRecognizeResponse();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/asyncRecognizeTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
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
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/AsyncRecognize', $actualApiFuncCall);
        $this->assertProtobufEquals($config, $actualApiRequestObject->getConfig());
        $this->assertProtobufEquals($audio, $actualApiRequestObject->getAudio());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/asyncRecognizeTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
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
            }
        ]);
        $grpcStub = $this->createStub([$this, 'createMockSpeechImpl']);
        $client = $this->createClient('createSpeechStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/asyncRecognizeTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
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
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
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
        $resultIndex2 = 1848265187;
        $expectedResponse2 = new StreamingRecognizeResponse();
        $expectedResponse2->setResultIndex($resultIndex2);
        $grpcStub->addResponse($expectedResponse2);
        $resultIndex3 = 1848265188;
        $expectedResponse3 = new StreamingRecognizeResponse();
        $expectedResponse3->setResultIndex($resultIndex3);
        $grpcStub->addResponse($expectedResponse3);

        // Mock request
        $request = new StreamingRecognizeRequest();
        $request2 = new StreamingRecognizeRequest();
        $request3 = new StreamingRecognizeRequest();

        $bidi = $client->streamingRecognize();
        $this->assertInstanceOf(BidiStream::class, $bidi);

        $bidi->write($request);
        $responses = [];
        $responses[] = $bidi->read();

        $bidi->writeAll([$request2, $request3]);
        foreach ($bidi->closeWriteAndReadAll() as $response) {
            $responses[] = $response;
        }

        $expectedResponses = [];
        $expectedResponses[] = $expectedResponse;
        $expectedResponses[] = $expectedResponse2;
        $expectedResponses[] = $expectedResponse3;
        $this->assertEquals($expectedResponses, $responses);

        $createStreamRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($createStreamRequests));
        $streamFuncCall = $createStreamRequests[0]->getFuncCall();
        $streamRequestObject = $createStreamRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.speech.v1beta1.Speech/StreamingRecognize', $streamFuncCall);
        $this->assertNull($streamRequestObject);

        $callObjects = $grpcStub->popCallObjects();
        $this->assertSame(1, count($callObjects));
        $bidiCall = $callObjects[0];

        $writeRequests = $bidiCall->popReceivedCalls();
        $expectedRequests = [];
        $expectedRequests[] = $request;
        $expectedRequests[] = $request2;
        $expectedRequests[] = $request3;
        $this->assertEquals($expectedRequests, $writeRequests);

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

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);

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
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
