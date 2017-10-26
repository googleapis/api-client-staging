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

namespace Google\Cloud\Tests\System\Language\V1beta2;

use Google\Cloud\Language\V1beta2\LanguageServiceClient;
use Google\Cloud\Language\V1beta2\AnalyzeSentimentRequest;
use Google\Cloud\Language\V1beta2\AnalyzeSentimentResponse;
use Google\Cloud\Language\V1beta2\Document;
use Google\Cloud\Language\V1beta2\Document_Type as Type;
use Google\GAX\Testing\GeneratedTest;

/**
 * @group language
 * @group grpc
 */
class LanguageServiceSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function analyzeSentimentTest()
    {

        $languageServiceClient = new LanguageServiceClient();
        $content = 'Hello, world!';
        $type = Type::PLAIN_TEXT;
        $document = new Document();
        $document->setContent($content);
        $document->setType($type);
        $languageServiceClient->analyzeSentiment($document);
    }
}
