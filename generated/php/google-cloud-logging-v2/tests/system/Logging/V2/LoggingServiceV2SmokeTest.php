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

namespace Google\Cloud\Tests\System\Logging\V2;

use Google\Cloud\Logging\V2\LoggingServiceV2Client;
use Google\Api\MonitoredResource;
use Google\GAX\Testing\GeneratedTest;
use Google\Logging\V2\LogEntry;
use Google\Logging\V2\WriteLogEntriesRequest;
use Google\Logging\V2\WriteLogEntriesResponse;

/**
 * @group logging
 * @group grpc
 */
class LoggingServiceV2SmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function writeLogEntriesTest()
    {
        $projectId = getenv('PROJECT_ID');

        $loggingServiceV2Client = new LoggingServiceV2Client();
        $formattedLogName = $loggingServiceV2Client->logName($projectId, 'test-'. time());
        $resource = new MonitoredResource();
        $labels = [];
        $entries = [];
        $loggingServiceV2Client->writeLogEntries($entries, ['logName' => $formattedLogName, 'resource' => $resource, 'labels' => $labels]);
    }
}
