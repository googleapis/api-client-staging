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

namespace Google\Cloud\Tests\Errorreporting\V1beta1;

use Google\Cloud\Errorreporting\V1beta1\ReportErrorsServiceClient;
use Google\GAX\GrpcCredentialsHelper;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\ReportErrorEventResponse;
use google\devtools\clouderrorreporting\v1beta1\ReportedErrorEvent;

/**
 * @group errorreporting
 * @group grpc
 */
class ReportErrorsServiceTest extends PHPUnit_Framework_TestCase
{
    public function createMockReportErrorsServiceImpl($hostname, $opts)
    {
        return new MockReportErrorsServiceImpl($hostname, $opts);
    }

    private function createStubAndClient($createGrpcStub, $createStubArg)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);
        $grpcStub = $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ReportErrorsServiceClient::SERVICE_ADDRESS,
            ReportErrorsServiceClient::DEFAULT_SERVICE_PORT
        );
        $client = new ReportErrorsServiceClient([$createStubArg => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
        },
        ]);

        return [$grpcStub, $client];
    }
    /**
     * @test
     */
    public function reportErrorEventTest()
    {
        list($grpcStub, $client) = $this->createStubAndClient([$this, 'createMockReportErrorsServiceImpl'], 'createReportErrorsServiceStubFunction');

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ReportErrorEventResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ReportErrorsServiceClient::formatProjectName('[PROJECT]');
        $event = new ReportedErrorEvent();

        $response = $client->reportErrorEvent($formattedProjectName, $event);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        list($actualFuncCall, $actualRequestObject) = $actualRequests[0];
        $this->assertSame('ReportErrorEvent', explode('/', $actualFuncCall)[2]);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($event, $actualRequestObject->getEvent());

        $this->assertEquals($expectedResponse, $response);

        $this->assertTrue($grpcStub->isExhausted());
    }
}
