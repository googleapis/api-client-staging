<?php
/*
 * Copyright 2017 Google LLC
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

use Google\Cloud\Debugger\V2\Debugger2Client;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Devtools\Clouddebugger\V2\Breakpoint;
use Google\Devtools\Clouddebugger\V2\GetBreakpointResponse;
use Google\Devtools\Clouddebugger\V2\ListBreakpointsResponse;
use Google\Devtools\Clouddebugger\V2\ListDebuggeesResponse;
use Google\Devtools\Clouddebugger\V2\SetBreakpointResponse;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group debugger
 * @group grpc
 */
class Debugger2ClientTest extends GeneratedTest
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
            'serviceAddress' => Debugger2Client::SERVICE_ADDRESS,
            'port' => Debugger2Client::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return Debugger2Client
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new Debugger2Client($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function setBreakpointTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new SetBreakpointResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $breakpoint = new Breakpoint();
        $clientVersion = 'clientVersion-1506231196';

        $response = $client->setBreakpoint($debuggeeId, $breakpoint, $clientVersion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Debugger2/SetBreakpoint', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());
        $this->assertProtobufEquals($breakpoint, $actualRequestObject->getBreakpoint());
        $this->assertProtobufEquals($clientVersion, $actualRequestObject->getClientVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setBreakpointExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

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
        $clientVersion = 'clientVersion-1506231196';

        try {
            $client->setBreakpoint($debuggeeId, $breakpoint, $clientVersion);
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
    public function getBreakpointTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GetBreakpointResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $breakpointId = 'breakpointId498424873';
        $clientVersion = 'clientVersion-1506231196';

        $response = $client->getBreakpoint($debuggeeId, $breakpointId, $clientVersion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Debugger2/GetBreakpoint', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());
        $this->assertProtobufEquals($breakpointId, $actualRequestObject->getBreakpointId());
        $this->assertProtobufEquals($clientVersion, $actualRequestObject->getClientVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getBreakpointExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

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
        $breakpointId = 'breakpointId498424873';
        $clientVersion = 'clientVersion-1506231196';

        try {
            $client->getBreakpoint($debuggeeId, $breakpointId, $clientVersion);
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
    public function deleteBreakpointTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $breakpointId = 'breakpointId498424873';
        $clientVersion = 'clientVersion-1506231196';

        $client->deleteBreakpoint($debuggeeId, $breakpointId, $clientVersion);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Debugger2/DeleteBreakpoint', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());
        $this->assertProtobufEquals($breakpointId, $actualRequestObject->getBreakpointId());
        $this->assertProtobufEquals($clientVersion, $actualRequestObject->getClientVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteBreakpointExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

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
        $breakpointId = 'breakpointId498424873';
        $clientVersion = 'clientVersion-1506231196';

        try {
            $client->deleteBreakpoint($debuggeeId, $breakpointId, $clientVersion);
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
    public function listBreakpointsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextWaitToken = 'nextWaitToken1006864251';
        $expectedResponse = new ListBreakpointsResponse();
        $expectedResponse->setNextWaitToken($nextWaitToken);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $debuggeeId = 'debuggeeId-997255898';
        $clientVersion = 'clientVersion-1506231196';

        $response = $client->listBreakpoints($debuggeeId, $clientVersion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Debugger2/ListBreakpoints', $actualFuncCall);

        $this->assertProtobufEquals($debuggeeId, $actualRequestObject->getDebuggeeId());
        $this->assertProtobufEquals($clientVersion, $actualRequestObject->getClientVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listBreakpointsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

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
        $clientVersion = 'clientVersion-1506231196';

        try {
            $client->listBreakpoints($debuggeeId, $clientVersion);
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
    public function listDebuggeesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListDebuggeesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $project = 'project-309310695';
        $clientVersion = 'clientVersion-1506231196';

        $response = $client->listDebuggees($project, $clientVersion);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.devtools.clouddebugger.v2.Debugger2/ListDebuggees', $actualFuncCall);

        $this->assertProtobufEquals($project, $actualRequestObject->getProject());
        $this->assertProtobufEquals($clientVersion, $actualRequestObject->getClientVersion());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listDebuggeesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDebugger2Impl']);
        $client = $this->createClient('createDebugger2StubFunction', $grpcStub);

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
        $project = 'project-309310695';
        $clientVersion = 'clientVersion-1506231196';

        try {
            $client->listDebuggees($project, $clientVersion);
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
