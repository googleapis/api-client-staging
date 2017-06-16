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

namespace Google\Cloud\Tests\Language\V1beta2;

use Google\Cloud\Language\V1beta2\LanguageServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\cloud\language\v1beta2\AnalyzeEntitiesResponse;
use google\cloud\language\v1beta2\AnalyzeEntitySentimentResponse;
use google\cloud\language\v1beta2\AnalyzeSentimentResponse;
use google\cloud\language\v1beta2\AnalyzeSyntaxResponse;
use google\cloud\language\v1beta2\AnnotateTextRequest\Features;
use google\cloud\language\v1beta2\AnnotateTextResponse;
use google\cloud\language\v1beta2\Document;
use google\cloud\language\v1beta2\EncodingType;
use google\protobuf\Any;
use stdClass;

/**
 * @group language
 * @group grpc
 */
class LanguageServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockLanguageServiceImpl($hostname, $opts)
    {
        return new MockLanguageServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            LanguageServiceClient::SERVICE_ADDRESS,
            LanguageServiceClient::DEFAULT_SERVICE_PORT
        );
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
        $this->assertSame('/google.cloud.language.v1beta2.LanguageService/AnalyzeSentiment', $actualFuncCall);

        $this->assertEquals($document, $actualRequestObject->getDocument());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $document = new Document();

        try {
            $client->analyzeSentiment($document);
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
        $encodingType = EncodingType::NONE;

        $response = $client->analyzeEntities($document, $encodingType);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1beta2.LanguageService/AnalyzeEntities', $actualFuncCall);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $document = new Document();
        $encodingType = EncodingType::NONE;

        try {
            $client->analyzeEntities($document, $encodingType);
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
        $encodingType = EncodingType::NONE;

        $response = $client->analyzeEntitySentiment($document, $encodingType);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1beta2.LanguageService/AnalyzeEntitySentiment', $actualFuncCall);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $document = new Document();
        $encodingType = EncodingType::NONE;

        try {
            $client->analyzeEntitySentiment($document, $encodingType);
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
        $encodingType = EncodingType::NONE;

        $response = $client->analyzeSyntax($document, $encodingType);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1beta2.LanguageService/AnalyzeSyntax', $actualFuncCall);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $document = new Document();
        $encodingType = EncodingType::NONE;

        try {
            $client->analyzeSyntax($document, $encodingType);
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
        $encodingType = EncodingType::NONE;

        $response = $client->annotateText($document, $features, $encodingType);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.language.v1beta2.LanguageService/AnnotateText', $actualFuncCall);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($features, $actualRequestObject->getFeatures());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

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
        $grpcStub->addResponse(null, $status);

        // Mock request
        $document = new Document();
        $features = new Features();
        $encodingType = EncodingType::NONE;

        try {
            $client->annotateText($document, $features, $encodingType);
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
