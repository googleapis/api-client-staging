<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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

namespace Google\Cloud\Vision\Tests\System\V1;

use Google\Cloud\Vision\V1\ImageAnnotatorClient;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Vision\V1\AnnotateImageRequest;
use Google\Cloud\Vision\V1\Feature;
use Google\Cloud\Vision\V1\Feature_Type;
use Google\Cloud\Vision\V1\Image;
use Google\Cloud\Vision\V1\ImageSource;

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
        $type = Feature_Type::FACE_DETECTION;
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
