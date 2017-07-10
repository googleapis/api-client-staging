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

namespace Google\Cloud\Tests\Dlp\V2beta1;

use Google\Cloud\Dlp\V2beta1\DlpServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\GeneratedTest;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Google\Longrunning\GetOperationRequest;
use Google\Longrunning\Operation;
use Google\Privacy\Dlp\V2beta1\InspectConfig;
use Google\Privacy\Dlp\V2beta1\InspectContentResponse;
use Google\Privacy\Dlp\V2beta1\InspectOperationResult;
use Google\Privacy\Dlp\V2beta1\ListInfoTypesResponse;
use Google\Privacy\Dlp\V2beta1\ListInspectFindingsResponse;
use Google\Privacy\Dlp\V2beta1\ListRootCategoriesResponse;
use Google\Privacy\Dlp\V2beta1\OutputStorageConfig;
use Google\Privacy\Dlp\V2beta1\RedactContentResponse;
use Google\Privacy\Dlp\V2beta1\StorageConfig;
use Google\Protobuf\Any;
use Grpc;
use stdClass;

/**
 * @group dlp
 * @group grpc
 */
class DlpServiceClientTest extends GeneratedTest
{
    public function createMockDlpServiceImpl($hostname, $opts)
    {
        return new MockDlpServiceImpl($hostname, $opts);
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
            DlpServiceClient::SERVICE_ADDRESS,
            DlpServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return DlpServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new DlpServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function inspectContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new InspectContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $inspectConfig = new InspectConfig();
        $items = [];

        $response = $client->inspectContent($inspectConfig, $items);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/InspectContent', $actualFuncCall);

        $this->assertEquals($inspectConfig, $actualRequestObject->getInspectConfig());
        $this->assertRepeatedFieldEquals($items, $actualRequestObject->getItems());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function inspectContentExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

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
        $inspectConfig = new InspectConfig();
        $items = [];

        try {
            $client->inspectContent($inspectConfig, $items);
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
    public function redactContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new RedactContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $inspectConfig = new InspectConfig();
        $items = [];
        $replaceConfigs = [];

        $response = $client->redactContent($inspectConfig, $items, $replaceConfigs);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/RedactContent', $actualFuncCall);

        $this->assertEquals($inspectConfig, $actualRequestObject->getInspectConfig());
        $this->assertRepeatedFieldEquals($items, $actualRequestObject->getItems());
        $this->assertRepeatedFieldEquals($replaceConfigs, $actualRequestObject->getReplaceConfigs());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function redactContentExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

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
        $inspectConfig = new InspectConfig();
        $items = [];
        $replaceConfigs = [];

        try {
            $client->redactContent($inspectConfig, $items, $replaceConfigs);
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
    public function createInspectOperationTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInspectOperationTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $name = 'name3373707';
        $expectedResponse = new InspectOperationResult();
        $expectedResponse->setName($name);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createInspectOperationTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $inspectConfig = new InspectConfig();
        $storageConfig = new StorageConfig();
        $outputConfig = new OutputStorageConfig();

        $response = $client->createInspectOperation($inspectConfig, $storageConfig, $outputConfig);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/CreateInspectOperation', $actualApiFuncCall);
        $this->assertEquals($inspectConfig, $actualApiRequestObject->getInspectConfig());
        $this->assertEquals($storageConfig, $actualApiRequestObject->getStorageConfig());
        $this->assertEquals($outputConfig, $actualApiRequestObject->getOutputConfig());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInspectOperationTest');

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
    public function createInspectOperationExceptionTest()
    {
        $operationsStub = $this->createStub([$this, 'createMockOperationsStub']);
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'createOperationsStubFunction' => function ($hostname, $opts) use ($operationsStub) {
                return $operationsStub;
            },
        ]);
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub, [
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($grpcStub->isExhausted());
        $this->assertTrue($operationsStub->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInspectOperationTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsStub->addResponse(null, $status);

        // Mock request
        $inspectConfig = new InspectConfig();
        $storageConfig = new StorageConfig();
        $outputConfig = new OutputStorageConfig();

        $response = $client->createInspectOperation($inspectConfig, $storageConfig, $outputConfig);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInspectOperationTest');

        try {
            $response->pollUntilComplete();
            // If the pollUntilComplete() method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
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
    public function listInspectFindingsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = 'nextPageToken-1530815211';
        $expectedResponse = new ListInspectFindingsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = DlpServiceClient::formatResultName('[RESULT]');

        $response = $client->listInspectFindings($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInspectFindings', $actualFuncCall);

        $this->assertEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInspectFindingsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

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
        $formattedName = DlpServiceClient::formatResultName('[RESULT]');

        try {
            $client->listInspectFindings($formattedName);
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
    public function listInfoTypesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListInfoTypesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $category = 'category50511102';
        $languageCode = 'languageCode-412800396';

        $response = $client->listInfoTypes($category, $languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInfoTypes', $actualFuncCall);

        $this->assertEquals($category, $actualRequestObject->getCategory());
        $this->assertEquals($languageCode, $actualRequestObject->getLanguageCode());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInfoTypesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

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
        $category = 'category50511102';
        $languageCode = 'languageCode-412800396';

        try {
            $client->listInfoTypes($category, $languageCode);
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
    public function listRootCategoriesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ListRootCategoriesResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $languageCode = 'languageCode-412800396';

        $response = $client->listRootCategories($languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListRootCategories', $actualFuncCall);

        $this->assertEquals($languageCode, $actualRequestObject->getLanguageCode());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listRootCategoriesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

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
        $languageCode = 'languageCode-412800396';

        try {
            $client->listRootCategories($languageCode);
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
