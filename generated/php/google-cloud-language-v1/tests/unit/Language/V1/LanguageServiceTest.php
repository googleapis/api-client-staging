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

namespace Google\Cloud\Tests\Language\V1;

use Google\Cloud\Language\V1\LanguageServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\cloud\language\v1\AnalyzeEntitiesResponse;
use google\cloud\language\v1\AnalyzeSentimentResponse;
use google\cloud\language\v1\AnalyzeSyntaxResponse;
use google\cloud\language\v1\AnnotateTextRequest\Features;
use google\cloud\language\v1\AnnotateTextResponse;
use google\cloud\language\v1\Document;
use google\cloud\language\v1\EncodingType;

/**
 * @group language
 * @group grpc
 */
class LanguageServiceTest extends PHPUnit_Framework_TestCase
{
    public function createMockLanguageServiceImpl($hostname, $opts)
    {
        return new MockLanguageServiceImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            LanguageServiceClient::SERVICE_ADDRESS,
            LanguageServiceClient::DEFAULT_SERVICE_PORT
        );
        $client = new LanguageServiceClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function analyzeSentimentTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLanguageServiceImpl'], 'createLanguageServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $language = 'language-1613589672';
        $expectedResponse = new AnalyzeSentimentResponse();
        $expectedResponse->setLanguage($language);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $document = new Document();

        $response = $client->analyzeSentiment($document);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('AnalyzeSentiment', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($document, $actualRequestObject->getDocument());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeEntitiesTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLanguageServiceImpl'], 'createLanguageServiceStubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('AnalyzeEntities', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeSyntaxTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLanguageServiceImpl'], 'createLanguageServiceStubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('AnalyzeSyntax', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function annotateTextTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockLanguageServiceImpl'], 'createLanguageServiceStubFunction');

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
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('AnnotateText', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($document, $actualRequestObject->getDocument());
        $this->assertEquals($features, $actualRequestObject->getFeatures());
        $this->assertEquals($encodingType, $actualRequestObject->getEncodingType());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
