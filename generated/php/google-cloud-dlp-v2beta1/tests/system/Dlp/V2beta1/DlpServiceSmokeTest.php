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

namespace Google\Cloud\Tests\System\Dlp\V2beta1;

use Google\Cloud\Dlp\V2beta1\DlpServiceClient;
use Google\GAX\Testing\GeneratedTest;
use Google\Privacy\Dlp\V2beta1\ContentItem;
use Google\Privacy\Dlp\V2beta1\InspectConfig;
use Google\Privacy\Dlp\V2beta1\Likelihood;

/**
 * @group dlp
 * @group grpc
 */
class DlpServiceSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function inspectContentTest()
    {
        $dlpServiceClient = new DlpServiceClient();
        $minLikelihood = Likelihood::POSSIBLE;
        $inspectConfig = new InspectConfig();
        $inspectConfig->setMinLikelihood($minLikelihood);
        $type = 'text/plain';
        $value = 'my phone number is 215-512-1212';
        $itemsElement = new ContentItem();
        $itemsElement->setType($type);
        $itemsElement->setValue($value);
        $items = [$itemsElement];
        $dlpServiceClient->inspectContent($inspectConfig, $items);
    }
}
