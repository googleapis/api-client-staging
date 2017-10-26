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

namespace Google\Cloud\Tests\System\Speech\V1beta1;

use Google\Cloud\Speech\V1beta1\SpeechClient;
use Google\Cloud\Speech\V1beta1\RecognitionAudio;
use Google\Cloud\Speech\V1beta1\RecognitionConfig;
use Google\Cloud\Speech\V1beta1\RecognitionConfig_AudioEncoding as AudioEncoding;
use Google\Cloud\Speech\V1beta1\SyncRecognizeRequest;
use Google\Cloud\Speech\V1beta1\SyncRecognizeResponse;
use Google\GAX\Testing\GeneratedTest;

/**
 * @group speech
 * @group grpc
 */
class SpeechSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function syncRecognizeTest()
    {

        $speechClient = new SpeechClient();
        $languageCode = 'en-US';
        $sampleRate = 44100;
        $encoding = AudioEncoding::FLAC;
        $config = new RecognitionConfig();
        $config->setLanguageCode($languageCode);
        $config->setSampleRate($sampleRate);
        $config->setEncoding($encoding);
        $uri = 'gs://gapic-toolkit/hello.flac';
        $audio = new RecognitionAudio();
        $audio->setUri($uri);
        $speechClient->syncRecognize($config, $audio);
    }
}
