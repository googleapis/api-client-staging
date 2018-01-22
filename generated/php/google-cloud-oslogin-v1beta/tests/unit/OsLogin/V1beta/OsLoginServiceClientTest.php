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

namespace Google\Cloud\Tests\Unit\OsLogin\V1beta;

use Google\Cloud\OsLogin\V1beta\OsLoginServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\OsLogin\Common\SshPublicKey;
use Google\Cloud\OsLogin\V1beta\ImportSshPublicKeyResponse;
use Google\Cloud\OsLogin\V1beta\LoginProfile;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
use Grpc;
use stdClass;

/**
 * @group os_login
 * @group grpc
 */
class OsLoginServiceClientTest extends GeneratedTest
{
    public function createMockOsLoginServiceImpl($hostname, $opts)
    {
        return new MockOsLoginServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => OsLoginServiceClient::SERVICE_ADDRESS,
            'port' => OsLoginServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return OsLoginServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new OsLoginServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function deletePosixAccountTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->projectName('[USER]', '[PROJECT]');

        $client->deletePosixAccount($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/DeletePosixAccount', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deletePosixAccountExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedName = $client->projectName('[USER]', '[PROJECT]');

        try {
            $client->deletePosixAccount($formattedName);
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
    public function deleteSshPublicKeyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');

        $client->deleteSshPublicKey($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/DeleteSshPublicKey', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteSshPublicKeyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');

        try {
            $client->deleteSshPublicKey($formattedName);
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
    public function getLoginProfileTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $suspended = false;
        $expectedResponse = new LoginProfile();
        $expectedResponse->setName($name2);
        $expectedResponse->setSuspended($suspended);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->userName('[USER]');

        $response = $client->getLoginProfile($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/GetLoginProfile', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getLoginProfileExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedName = $client->userName('[USER]');

        try {
            $client->getLoginProfile($formattedName);
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
    public function getSshPublicKeyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $key = 'key106079';
        $expirationTimeUsec = 2058878882;
        $fingerprint = 'fingerprint-1375934236';
        $expectedResponse = new SshPublicKey();
        $expectedResponse->setKey($key);
        $expectedResponse->setExpirationTimeUsec($expirationTimeUsec);
        $expectedResponse->setFingerprint($fingerprint);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');

        $response = $client->getSshPublicKey($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/GetSshPublicKey', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getSshPublicKeyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');

        try {
            $client->getSshPublicKey($formattedName);
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
    public function importSshPublicKeyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ImportSshPublicKeyResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->userName('[USER]');
        $sshPublicKey = new SshPublicKey();

        $response = $client->importSshPublicKey($formattedParent, $sshPublicKey);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/ImportSshPublicKey', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($sshPublicKey, $actualRequestObject->getSshPublicKey());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function importSshPublicKeyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->userName('[USER]');
        $sshPublicKey = new SshPublicKey();

        try {
            $client->importSshPublicKey($formattedParent, $sshPublicKey);
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
    public function updateSshPublicKeyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $key = 'key106079';
        $expirationTimeUsec = 2058878882;
        $fingerprint = 'fingerprint-1375934236';
        $expectedResponse = new SshPublicKey();
        $expectedResponse->setKey($key);
        $expectedResponse->setExpirationTimeUsec($expirationTimeUsec);
        $expectedResponse->setFingerprint($fingerprint);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');
        $sshPublicKey = new SshPublicKey();

        $response = $client->updateSshPublicKey($formattedName, $sshPublicKey);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.oslogin.v1beta.OsLoginService/UpdateSshPublicKey', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());
        $this->assertProtobufEquals($sshPublicKey, $actualRequestObject->getSshPublicKey());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateSshPublicKeyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockOsLoginServiceImpl']);
        $client = $this->createClient('createOsLoginServiceStubFunction', $grpcStub);

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
        $formattedName = $client->fingerprintName('[USER]', '[FINGERPRINT]');
        $sshPublicKey = new SshPublicKey();

        try {
            $client->updateSshPublicKey($formattedName, $sshPublicKey);
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
