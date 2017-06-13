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

namespace Google\Cloud\Tests\Spanner\Admin\Database\V1;

use Google\Cloud\Spanner\Admin\Database\V1\DatabaseAdminClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\iam\v1\Policy;
use google\iam\v1\TestIamPermissionsResponse;
use google\longrunning\GetOperationRequest;
use google\longrunning\Operation;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use google\spanner\admin\database\v1\Database;
use google\spanner\admin\database\v1\GetDatabaseDdlResponse;
use google\spanner\admin\database\v1\ListDatabasesResponse;
use stdClass;

/**
 * @group database
 * @group grpc
 */
class DatabaseAdminClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockDatabaseAdminImpl($hostname, $opts)
    {
        return new MockDatabaseAdminImpl($hostname, $opts);
    }

    public function createMockOperationsStub($hostname, $opts)
    {
        return new MockOperationsImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            DatabaseAdminClient::SERVICE_ADDRESS,
            DatabaseAdminClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return DatabaseAdminClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new DatabaseAdminClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function listDatabasesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $databasesElement = new Database();
        $databases = [$databasesElement];
        $expectedResponse = new ListDatabasesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($databases as $elem) {
            $expectedResponse->addDatabases($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = DatabaseAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        $response = $client->listDatabases($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getDatabasesList()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/ListDatabases', $actualFuncCall);

        $this->assertEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listDatabasesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedParent = DatabaseAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');

        try {
            $client->listDatabases($formattedParent);
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

    /**
     * @test
     */
    public function createDatabaseTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createDatabaseTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $expectedResponse = new Database();
        $expectedResponse->setName($name);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createDatabaseTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedParent = DatabaseAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $createStatement = 'createStatement552974828';

        $response = $client->createDatabase($formattedParent, $createStatement);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/CreateDatabase', $actualApiFuncCall);
        $this->assertEquals($formattedParent, $actualApiRequestObject->getParent());
        $this->assertEquals($createStatement, $actualApiRequestObject->getCreateStatement());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createDatabaseTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function createDatabaseExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createDatabaseTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedParent = DatabaseAdminClient::formatInstanceName('[PROJECT]', '[INSTANCE]');
        $createStatement = 'createStatement552974828';

        $response = $client->createDatabase($formattedParent, $createStatement);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createDatabaseTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDatabaseTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new Database();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->getDatabase($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/GetDatabase', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDatabaseExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedName = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->getDatabase($formattedName);
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

    /**
     * @test
     */
    public function updateDatabaseDdlTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateDatabaseDdlTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $expectedResponse = new EmptyC();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serialize());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/updateDatabaseDdlTest')->setDone(true)->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $statements = [];

        $response = $client->updateDatabaseDdl($formattedDatabase, $statements);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/UpdateDatabaseDdl', $actualApiFuncCall);
        $this->assertEquals($formattedDatabase, $actualApiRequestObject->getDatabase());
        $this->assertEquals($statements, $actualApiRequestObject->getStatementsList());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateDatabaseDdlTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $grpcStub->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsStub->popReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateDatabaseDdlExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/updateDatabaseDdlTest')->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $operationsStub->addResponse(null, $status);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $statements = [];

        $response = $client->updateDatabaseDdl($formattedDatabase, $statements);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/updateDatabaseDdlTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stubs are exhausted
        $grpcStub->popReceivedCalls();
        $operationsStub->popReceivedCalls();
        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());
    }

    /**
     * @test
     */
    public function dropDatabaseTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $client->dropDatabase($formattedDatabase);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/DropDatabase', $actualFuncCall);

        $this->assertEquals($formattedDatabase, $actualRequestObject->getDatabase());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function dropDatabaseExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->dropDatabase($formattedDatabase);
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

    /**
     * @test
     */
    public function getDatabaseDdlTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GetDatabaseDdlResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->getDatabaseDdl($formattedDatabase);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/GetDatabaseDdl', $actualFuncCall);

        $this->assertEquals($formattedDatabase, $actualRequestObject->getDatabase());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDatabaseDdlExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedDatabase = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->getDatabaseDdl($formattedDatabase);
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

    /**
     * @test
     */
    public function setIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $policy = new Policy();

        $response = $client->setIamPolicy($formattedResource, $policy);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/SetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($policy, $actualRequestObject->getPolicy());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function setIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $policy = new Policy();

        try {
            $client->setIamPolicy($formattedResource, $policy);
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

    /**
     * @test
     */
    public function getIamPolicyTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $version = 351608024;
        $etag = '21';
        $expectedResponse = new Policy();
        $expectedResponse->setVersion($version);
        $expectedResponse->setEtag($etag);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        $response = $client->getIamPolicy($formattedResource);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/GetIamPolicy', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getIamPolicyExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');

        try {
            $client->getIamPolicy($formattedResource);
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

    /**
     * @test
     */
    public function testIamPermissionsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new TestIamPermissionsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $permissions = [];

        $response = $client->testIamPermissions($formattedResource, $permissions);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.spanner.admin.database.v1.DatabaseAdmin/TestIamPermissions', $actualFuncCall);

        $this->assertEquals($formattedResource, $actualRequestObject->getResource());
        $this->assertEquals($permissions, $actualRequestObject->getPermissionsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function testIamPermissionsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDatabaseAdminImpl']);
        $client = $this->createClient('createDatabaseAdminStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $formattedResource = DatabaseAdminClient::formatDatabaseName('[PROJECT]', '[INSTANCE]', '[DATABASE]');
        $permissions = [];

        try {
            $client->testIamPermissions($formattedResource, $permissions);
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
