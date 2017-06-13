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

namespace Google\Cloud\Tests\ErrorReporting\V1beta1;

use Google\Cloud\ErrorReporting\V1beta1\ReportErrorsServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\devtools\clouderrorreporting\v1beta1\ReportErrorEventResponse;
use google\devtools\clouderrorreporting\v1beta1\ReportedErrorEvent;
use google\protobuf\Any;
use stdClass;

/**
 * @group error_reporting
 * @group grpc
 */
class ReportErrorsServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockReportErrorsServiceImpl($hostname, $opts)
    {
        return new MockReportErrorsServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            ReportErrorsServiceClient::SERVICE_ADDRESS,
            ReportErrorsServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return ReportErrorsServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new ReportErrorsServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function reportErrorEventTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockReportErrorsServiceImpl']);
        $client = $this->createClient('createReportErrorsServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ReportErrorEventResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedProjectName = ReportErrorsServiceClient::formatProjectName('[PROJECT]');
        $event = new ReportedErrorEvent();

        $response = $client->reportErrorEvent($formattedProjectName, $event);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouderrorreporting.v1beta1.ReportErrorsService/ReportErrorEvent', $actualFuncCall);

        $this->assertEquals($formattedProjectName, $actualRequestObject->getProjectName());
        $this->assertEquals($event, $actualRequestObject->getEvent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function reportErrorEventExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockReportErrorsServiceImpl']);
        $client = $this->createClient('createReportErrorsServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedProjectName = ReportErrorsServiceClient::formatProjectName('[PROJECT]');
        $event = new ReportedErrorEvent();

        try {
            $client->reportErrorEvent($formattedProjectName, $event);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
