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

namespace Google\Cloud\Tests\System\Vision\V1;

use Google\Cloud\Vision\V1\ImageAnnotatorClient;
use Google\Cloud\Vision\V1\AnnotateImageRequest;
use Google\Cloud\Vision\V1\Feature;
use Google\Cloud\Vision\V1\Feature_Type as Type;
use Google\Cloud\Vision\V1\Image;
use Google\Cloud\Vision\V1\ImageSource;
use Google\GAX\Testing\GeneratedTest;

/**
 * @group vision
 * @group grpc
 */
class ImageAnnotatorSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function batchAnnotateImagesTest()
    {
        $imageAnnotatorClient = new ImageAnnotatorClient();
        $gcsImageUri = 'gs://gapic-toolkit/President_Barack_Obama.jpg';
        $source = new ImageSource();
        $source->setGcsImageUri($gcsImageUri);
        $image = new Image();
        $image->setSource($source);
        $type = Type::FACE_DETECTION;
        $featuresElement = new Feature();
        $featuresElement->setType($type);
        $features = [$featuresElement];
        $requestsElement = new AnnotateImageRequest();
        $requestsElement->setImage($image);
        $requestsElement->setFeatures($features);
        $requests = [$requestsElement];
        $imageAnnotatorClient->batchAnnotateImages($requests);
    }
}
