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

namespace Google\Cloud\Tests\Language\V1;

use Google\Cloud\Language\V1\LanguageServiceClient;
use Google\Cloud\Language\V1\AnalyzeEntitiesResponse;
use Google\Cloud\Language\V1\AnalyzeEntitySentimentResponse;
use Google\Cloud\Language\V1\AnalyzeSentimentResponse;
use Google\Cloud\Language\V1\AnalyzeSyntaxResponse;
use Google\Cloud\Language\V1\AnnotateTextRequest_Features as Features;
use Google\Cloud\Language\V1\AnnotateTextResponse;
use Google\Cloud\Language\V1\Document;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\Testing\GeneratedTest;
use Google\Protobuf\Any;
use Grpc;
use stdClass;

/**
 * @group language
 * @group grpc
 */
class LanguageServiceClientTest extends GeneratedTest
{
    public function createMockLanguageServiceImpl($hostname, $opts)
    {
        return new MockLanguageServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => LanguageServiceClient::SERVICE_ADDRESS,
            'port' => LanguageServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return LanguageServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new LanguageServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function analyzeSentimentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnalyzeSentimentResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();

        $response = $client->analyzeSentiment($document);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1.LanguageService/AnalyzeSentiment', $actualFuncCall);

        $this->assertProtobufEquals($document, $actualRequestObject->getDocument());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeSentimentExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

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
        $document = new Document();

        try {
            $client->analyzeSentiment($document);
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
    public function analyzeEntitiesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnalyzeEntitiesResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();

        $response = $client->analyzeEntities($document);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1.LanguageService/AnalyzeEntities', $actualFuncCall);

        $this->assertProtobufEquals($document, $actualRequestObject->getDocument());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeEntitiesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

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
        $document = new Document();

        try {
            $client->analyzeEntities($document);
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
    public function analyzeEntitySentimentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnalyzeEntitySentimentResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();

        $response = $client->analyzeEntitySentiment($document);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1.LanguageService/AnalyzeEntitySentiment', $actualFuncCall);

        $this->assertProtobufEquals($document, $actualRequestObject->getDocument());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeEntitySentimentExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

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
        $document = new Document();

        try {
            $client->analyzeEntitySentiment($document);
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
    public function analyzeSyntaxTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnalyzeSyntaxResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();

        $response = $client->analyzeSyntax($document);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1.LanguageService/AnalyzeSyntax', $actualFuncCall);

        $this->assertProtobufEquals($document, $actualRequestObject->getDocument());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeSyntaxExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

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
        $document = new Document();

        try {
            $client->analyzeSyntax($document);
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
    public function annotateTextTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnnotateTextResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();
        $features = new Features();

        $response = $client->annotateText($document, $features);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1.LanguageService/AnnotateText', $actualFuncCall);

        $this->assertProtobufEquals($document, $actualRequestObject->getDocument());
        $this->assertProtobufEquals($features, $actualRequestObject->getFeatures());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function annotateTextExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockLanguageServiceImpl']);
        $client = $this->createClient('createLanguageServiceStubFunction', $grpcStub);

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
        $document = new Document();
        $features = new Features();

        try {
            $client->annotateText($document, $features);
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
