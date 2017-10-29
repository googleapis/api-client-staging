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

namespace Google\Cloud\Tests\System\Trace\V1;

use Google\Cloud\Trace\V1\TraceServiceClient;
use Google\Devtools\Cloudtrace\V1\Trace;
use Google\GAX\Testing\GeneratedTest;

/**
 * @group trace
 * @group grpc
 */
class TraceServiceSmokeTest extends GeneratedTest
{
    /**
     * @test
     */
    public function listTracesTest()
    {
        $traceServiceClient = new TraceServiceClient();
        $projectId2 = projectId;
        $traceServiceClient->listTraces($projectId2);
    }
}
