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

namespace Google\Cloud\Tests\Unit\Dlp\V2beta1;

use Google\Cloud\Dlp\V2beta1\DlpServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\Testing\GeneratedTest;
use Google\GAX\Testing\LongRunning\MockOperationsImpl;
use Google\Longrunning\GetOperationRequest;
use Google\Longrunning\Operation;
use Google\Privacy\Dlp\V2beta1\BigQueryTable;
use Google\Privacy\Dlp\V2beta1\CloudStorageOptions;
use Google\Privacy\Dlp\V2beta1\CloudStorageOptions_FileSet as FileSet;
use Google\Privacy\Dlp\V2beta1\ContentItem;
use Google\Privacy\Dlp\V2beta1\DeidentifyConfig;
use Google\Privacy\Dlp\V2beta1\DeidentifyContentResponse;
use Google\Privacy\Dlp\V2beta1\InfoType;
use Google\Privacy\Dlp\V2beta1\InspectConfig;
use Google\Privacy\Dlp\V2beta1\InspectContentResponse;
use Google\Privacy\Dlp\V2beta1\InspectOperationResult;
use Google\Privacy\Dlp\V2beta1\ListInfoTypesResponse;
use Google\Privacy\Dlp\V2beta1\ListInspectFindingsResponse;
use Google\Privacy\Dlp\V2beta1\ListRootCategoriesResponse;
use Google\Privacy\Dlp\V2beta1\OutputStorageConfig;
use Google\Privacy\Dlp\V2beta1\PrivacyMetric;
use Google\Privacy\Dlp\V2beta1\RedactContentRequest_ReplaceConfig as ReplaceConfig;
use Google\Privacy\Dlp\V2beta1\RedactContentResponse;
use Google\Privacy\Dlp\V2beta1\RiskAnalysisOperationResult;
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
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => DlpServiceClient::SERVICE_ADDRESS,
            'port' => DlpServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
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
    public function deidentifyContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new DeidentifyContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $deidentifyConfig = new DeidentifyConfig();
        $inspectConfig = new InspectConfig();
        $items = [];

        $response = $client->deidentifyContent($deidentifyConfig, $inspectConfig, $items);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/DeidentifyContent', $actualFuncCall);

        $this->assertProtobufEquals($deidentifyConfig, $actualRequestObject->getDeidentifyConfig());
        $this->assertProtobufEquals($inspectConfig, $actualRequestObject->getInspectConfig());
        $this->assertProtobufEquals($items, $actualRequestObject->getItems());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deidentifyContentExceptionTest()
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
        $deidentifyConfig = new DeidentifyConfig();
        $inspectConfig = new InspectConfig();
        $items = [];

        try {
            $client->deidentifyContent($deidentifyConfig, $inspectConfig, $items);
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
    public function analyzeDataSourceRiskTest()
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
        $incompleteOperation->setName('operations/analyzeDataSourceRiskTest');
        $incompleteOperation->setDone(false);
        $grpcStub->addResponse($incompleteOperation);
        $expectedResponse = new RiskAnalysisOperationResult();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/analyzeDataSourceRiskTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $privacyMetric = new PrivacyMetric();
        $sourceTable = new BigQueryTable();

        $response = $client->analyzeDataSourceRisk($privacyMetric, $sourceTable);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsStub->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/AnalyzeDataSourceRisk', $actualApiFuncCall);
        $this->assertProtobufEquals($privacyMetric, $actualApiRequestObject->getPrivacyMetric());
        $this->assertProtobufEquals($sourceTable, $actualApiRequestObject->getSourceTable());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/analyzeDataSourceRiskTest');

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
    public function analyzeDataSourceRiskExceptionTest()
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
        $incompleteOperation->setName('operations/analyzeDataSourceRiskTest');
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
        $privacyMetric = new PrivacyMetric();
        $sourceTable = new BigQueryTable();

        $response = $client->analyzeDataSourceRisk($privacyMetric, $sourceTable);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/analyzeDataSourceRiskTest');

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
    public function inspectContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new InspectContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $type = 'text/plain';
        $value = 'My email is example@example.com.';
        $itemsElement = new ContentItem();
        $itemsElement->setType($type);
        $itemsElement->setValue($value);
        $items = [$itemsElement];

        $response = $client->inspectContent($inspectConfig, $items);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/InspectContent', $actualFuncCall);

        $this->assertProtobufEquals($inspectConfig, $actualRequestObject->getInspectConfig());
        $this->assertProtobufEquals($items, $actualRequestObject->getItems());

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
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $type = 'text/plain';
        $value = 'My email is example@example.com.';
        $itemsElement = new ContentItem();
        $itemsElement->setType($type);
        $itemsElement->setValue($value);
        $items = [$itemsElement];

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
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $type = 'text/plain';
        $value = 'My email is example@example.com.';
        $itemsElement = new ContentItem();
        $itemsElement->setType($type);
        $itemsElement->setValue($value);
        $items = [$itemsElement];
        $name2 = 'EMAIL_ADDRESS';
        $infoType = new InfoType();
        $infoType->setName($name2);
        $replaceWith = 'REDACTED';
        $replaceConfigsElement = new ReplaceConfig();
        $replaceConfigsElement->setInfoType($infoType);
        $replaceConfigsElement->setReplaceWith($replaceWith);
        $replaceConfigs = [$replaceConfigsElement];

        $response = $client->redactContent($inspectConfig, $items, $replaceConfigs);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/RedactContent', $actualFuncCall);

        $this->assertProtobufEquals($inspectConfig, $actualRequestObject->getInspectConfig());
        $this->assertProtobufEquals($items, $actualRequestObject->getItems());
        $this->assertProtobufEquals($replaceConfigs, $actualRequestObject->getReplaceConfigs());

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
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $type = 'text/plain';
        $value = 'My email is example@example.com.';
        $itemsElement = new ContentItem();
        $itemsElement->setType($type);
        $itemsElement->setValue($value);
        $items = [$itemsElement];
        $name2 = 'EMAIL_ADDRESS';
        $infoType = new InfoType();
        $infoType->setName($name2);
        $replaceWith = 'REDACTED';
        $replaceConfigsElement = new ReplaceConfig();
        $replaceConfigsElement->setInfoType($infoType);
        $replaceConfigsElement->setReplaceWith($replaceWith);
        $replaceConfigs = [$replaceConfigsElement];

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
        $name2 = 'name2-1052831874';
        $expectedResponse = new InspectOperationResult();
        $expectedResponse->setName($name2);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createInspectOperationTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsStub->addResponse($completeOperation);

        // Mock request
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $url = 'gs://example_bucket/example_file.png';
        $fileSet = new FileSet();
        $fileSet->setUrl($url);
        $cloudStorageOptions = new CloudStorageOptions();
        $cloudStorageOptions->setFileSet($fileSet);
        $storageConfig = new StorageConfig();
        $storageConfig->setCloudStorageOptions($cloudStorageOptions);
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
        $this->assertProtobufEquals($inspectConfig, $actualApiRequestObject->getInspectConfig());
        $this->assertProtobufEquals($storageConfig, $actualApiRequestObject->getStorageConfig());
        $this->assertProtobufEquals($outputConfig, $actualApiRequestObject->getOutputConfig());

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
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $url = 'gs://example_bucket/example_file.png';
        $fileSet = new FileSet();
        $fileSet->setUrl($url);
        $cloudStorageOptions = new CloudStorageOptions();
        $cloudStorageOptions->setFileSet($fileSet);
        $storageConfig = new StorageConfig();
        $storageConfig->setCloudStorageOptions($cloudStorageOptions);
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
        $formattedName = $client->resultName('[RESULT]');

        $response = $client->listInspectFindings($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInspectFindings', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

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
        $formattedName = $client->resultName('[RESULT]');

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
        $category = 'PII';
        $languageCode = 'en';

        $response = $client->listInfoTypes($category, $languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInfoTypes', $actualFuncCall);

        $this->assertProtobufEquals($category, $actualRequestObject->getCategory());
        $this->assertProtobufEquals($languageCode, $actualRequestObject->getLanguageCode());

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
        $category = 'PII';
        $languageCode = 'en';

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
        $languageCode = 'en';

        $response = $client->listRootCategories($languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListRootCategories', $actualFuncCall);

        $this->assertProtobufEquals($languageCode, $actualRequestObject->getLanguageCode());

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
        $languageCode = 'en';

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
