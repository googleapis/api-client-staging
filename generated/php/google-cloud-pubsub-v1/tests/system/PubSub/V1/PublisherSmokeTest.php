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

namespace Google\Cloud\Tests\System\PubSub\V1;

use Google\Cloud\PubSub\V1\PublisherClient;
use Google\GAX\Testing\GeneratedTest;
use Google\Pubsub\V1\ListTopicsRequest;
use Google\Pubsub\V1\ListTopicsResponse;
use Google\Pubsub\V1\Topic;

/**
 * @group pub_sub
 * @group grpc
 */
class PublisherSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function listTopicsTest()
    {
        $projectId = getenv('PROJECT_ID');

        $publisherClient = new PublisherClient();
        $formattedProject = $publisherClient->projectName($projectId);
        $publisherClient->listTopics($formattedProject);
    }
}
