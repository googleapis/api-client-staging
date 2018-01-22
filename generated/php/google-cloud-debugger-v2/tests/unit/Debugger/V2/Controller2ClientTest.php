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

namespace Google\Cloud\Tests\Unit\Debugger\V2;

use Google\Cloud\Debugger\V2\Controller2Client;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Debugger\V2\Breakpoint;
use Google\Cloud\Debugger\V2\Debuggee;
use Google\Cloud\Debugger\V2\ListActiveBreakpointsResponse;
use Google\Cloud\Debugger\V2\RegisterDebuggeeResponse;
use Google\Cloud\Debugger\V2\UpdateActiveBreakpointResponse;
use Google\Protobuf\Any;
use Grpc;
use stdClass;

/**
 * @group debugger
 * @group grpc
 */
class Controller2ClientTest extends GeneratedTest
{
    public function createMockDebugger2Impl($hostname, $opts)
    {
        return new MockDebugger2Impl($hostname, $opts);
    }

    public function createMockController2Impl($hostname, $opts)
    {
        return new MockController2Impl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => Controller2Client::SERVICE_ADDRESS,
            'port' => Controller2Client::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return Controller2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new Controller2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function registerDebuggeeTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new RegisterDebuggeeResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggee = new Debuggee();

        $response = $client->registerDebuggee($debuggee);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Controller2/RegisterDebuggee', $actualFuncCall);

        $this->assertProtobufEquals($debuggee, $actualRequestObject->getDebuggee());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function registerDebuggeeExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $debuggee = new Debuggee();

        try {
            $client->registerDebuggee($debuggee);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listActiveBreakpointsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextWaitToken = 'nextWaitToken1006864251';
        $waitExpired = false;
        $expectedResponse = new ListActiveBreakpointsResponse();
        $expectedResponse->setNextWaitToken($nextWaitToken);
        $expectedResponse->setWaitExpired($waitExpired);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';

        $response = $client->listActiveBreakpoints($debuggeeId);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Controller2/ListActiveBreakpoints', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listActiveBreakpointsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';

        try {
            $client->listActiveBreakpoints($debuggeeId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateActiveBreakpointTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new UpdateActiveBreakpointResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $breakpoint = new Breakpoint();

        $response = $client->updateActiveBreakpoint($debuggeeId, $breakpoint);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Controller2/UpdateActiveBreakpoint', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());
        $this->assertProtobufEquals($breakpoint, $actualRequestObject->getBreakpoint());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateActiveBreakpointExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockController2Impl']);
        $client = $this->createClient('createController2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $grpcStub->addResponse(null, $status);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $breakpoint = new Breakpoint();

        try {
            $client->updateActiveBreakpoint($debuggeeId, $breakpoint);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $grpcStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
    }
}
