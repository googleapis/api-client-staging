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

namespace Google\Cloud\Tests\Unit\ErrorReporting\V1beta1;

use Google\Devtools\Clouderrorreporting\V1beta1\ErrorGroupServiceGrpcClient;
use Google\GAX\ApiException;
use Google\GAX\BidiStream;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\ServerStream;
use Google\GAX\Testing\GeneratedTest;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Google\GAX\Testing\MockStubTrait;
use Google\Longrunning\GetOperationRequest;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use PHPUnit_Framework_TestCase;
use stdClass;

class MockErrorGroupServiceImpl extends ErrorGroupServiceGrpcClient
{
    use MockStubTrait;
}
