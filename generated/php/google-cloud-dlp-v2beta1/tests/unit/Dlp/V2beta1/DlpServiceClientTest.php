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

namespace Google\Cloud\Tests\Unit\Dlp\V2beta1;

use Google\Cloud\Dlp\V2beta1\DlpServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\LongRunning\OperationsClient;
use Google\ApiCore\Testing\GeneratedTest;
use Google\ApiCore\Testing\MockTransport;
use Google\Cloud\Dlp\V2beta1\BigQueryTable;
use Google\Cloud\Dlp\V2beta1\CloudStorageOptions;
use Google\Cloud\Dlp\V2beta1\CloudStorageOptions_FileSet;
use Google\Cloud\Dlp\V2beta1\ContentItem;
use Google\Cloud\Dlp\V2beta1\DeidentifyConfig;
use Google\Cloud\Dlp\V2beta1\DeidentifyContentResponse;
use Google\Cloud\Dlp\V2beta1\InfoType;
use Google\Cloud\Dlp\V2beta1\InspectConfig;
use Google\Cloud\Dlp\V2beta1\InspectContentResponse;
use Google\Cloud\Dlp\V2beta1\InspectOperationResult;
use Google\Cloud\Dlp\V2beta1\ListInfoTypesResponse;
use Google\Cloud\Dlp\V2beta1\ListInspectFindingsResponse;
use Google\Cloud\Dlp\V2beta1\ListRootCategoriesResponse;
use Google\Cloud\Dlp\V2beta1\OutputStorageConfig;
use Google\Cloud\Dlp\V2beta1\PrivacyMetric;
use Google\Cloud\Dlp\V2beta1\RedactContentRequest_ReplaceConfig;
use Google\Cloud\Dlp\V2beta1\RedactContentResponse;
use Google\Cloud\Dlp\V2beta1\RiskAnalysisOperationResult;
use Google\Cloud\Dlp\V2beta1\StorageConfig;
use Google\LongRunning\GetOperationRequest;
use Google\LongRunning\Operation;
use Google\Protobuf\Any;
use Grpc;
use stdClass;

/**
 * @group dlp
 * @group grpc
 */
class DlpServiceClientTest extends GeneratedTest
{
    /**
     * @return TransportInterface
     */
    private function createTransport($deserialize = null)
    {
        return new MockTransport($deserialize);
    }

    /**
     * @return DlpServiceClient
     */
    private function createClient(array $options = [])
    {
        return new DlpServiceClient($options);
    }

    /**
     * @test
     */
    public function inspectContentTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new InspectContentResponse();
        $transport->addResponse($expectedResponse);

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
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/InspectContent', $actualFuncCall);

        $actualValue = $actualRequestObject->getInspectConfig();

        $this->assertProtobufEquals($inspectConfig, $actualValue);
        $actualValue = $actualRequestObject->getItems();

        $this->assertProtobufEquals($items, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function inspectContentExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function redactContentTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new RedactContentResponse();
        $transport->addResponse($expectedResponse);

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
        $replaceConfigsElement = new RedactContentRequest_ReplaceConfig();
        $replaceConfigsElement->setInfoType($infoType);
        $replaceConfigsElement->setReplaceWith($replaceWith);
        $replaceConfigs = [$replaceConfigsElement];

        $response = $client->redactContent($inspectConfig, $items, ['replaceConfigs' => $replaceConfigs]);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/RedactContent', $actualFuncCall);

        $actualValue = $actualRequestObject->getInspectConfig();

        $this->assertProtobufEquals($inspectConfig, $actualValue);
        $actualValue = $actualRequestObject->getItems();

        $this->assertProtobufEquals($items, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function redactContentExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $replaceConfigsElement = new RedactContentRequest_ReplaceConfig();
        $replaceConfigsElement->setInfoType($infoType);
        $replaceConfigsElement->setReplaceWith($replaceWith);
        $replaceConfigs = [$replaceConfigsElement];

        try {
            $client->redactContent($inspectConfig, $items, ['replaceConfigs' => $replaceConfigs]);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($expectedExceptionMessage, $ex->getMessage());
        }

        // Call popReceivedCalls to ensure the stub is exhausted
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deidentifyContentTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new DeidentifyContentResponse();
        $transport->addResponse($expectedResponse);

        // Mock request
        $deidentifyConfig = new DeidentifyConfig();
        $inspectConfig = new InspectConfig();
        $items = [];

        $response = $client->deidentifyContent($deidentifyConfig, $inspectConfig, $items);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/DeidentifyContent', $actualFuncCall);

        $actualValue = $actualRequestObject->getDeidentifyConfig();

        $this->assertProtobufEquals($deidentifyConfig, $actualValue);
        $actualValue = $actualRequestObject->getInspectConfig();

        $this->assertProtobufEquals($inspectConfig, $actualValue);
        $actualValue = $actualRequestObject->getItems();

        $this->assertProtobufEquals($items, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function deidentifyContentExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeDataSourceRiskTest()
    {
        $operationsTransport = $this->createTransport();
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'transport' => $operationsTransport,
        ]);
        $transport = $this->createTransport();
        $client = $this->createClient([
            'transport' => $transport,
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/analyzeDataSourceRiskTest');
        $incompleteOperation->setDone(false);
        $transport->addResponse($incompleteOperation);
        $expectedResponse = new RiskAnalysisOperationResult();
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/analyzeDataSourceRiskTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsTransport->addResponse($completeOperation);

        // Mock request
        $privacyMetric = new PrivacyMetric();
        $sourceTable = new BigQueryTable();

        $response = $client->analyzeDataSourceRisk($privacyMetric, $sourceTable);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsTransport->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/AnalyzeDataSourceRisk', $actualApiFuncCall);
        $actualValue = $actualApiRequestObject->getPrivacyMetric();

        $this->assertProtobufEquals($privacyMetric, $actualValue);
        $actualValue = $actualApiRequestObject->getSourceTable();

        $this->assertProtobufEquals($sourceTable, $actualValue);

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/analyzeDataSourceRiskTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $transport->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsTransport->popReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeDataSourceRiskExceptionTest()
    {
        $operationsTransport = $this->createTransport();
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'transport' => $operationsTransport,
        ]);
        $transport = $this->createTransport();
        $client = $this->createClient([
            'transport' => $transport,
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/analyzeDataSourceRiskTest');
        $incompleteOperation->setDone(false);
        $transport->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsTransport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $operationsTransport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());
    }

    /**
     * @test
     */
    public function createInspectOperationTest()
    {
        $operationsTransport = $this->createTransport();
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'transport' => $operationsTransport,
        ]);
        $transport = $this->createTransport();
        $client = $this->createClient([
            'transport' => $transport,
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInspectOperationTest');
        $incompleteOperation->setDone(false);
        $transport->addResponse($incompleteOperation);
        $name2 = 'name2-1052831874';
        $expectedResponse = new InspectOperationResult();
        $expectedResponse->setName($name2);
        $anyResponse = new Any();
        $anyResponse->setValue($expectedResponse->serializeToString());
        $completeOperation = new Operation();
        $completeOperation->setName('operations/createInspectOperationTest');
        $completeOperation->setDone(true);
        $completeOperation->setResponse($anyResponse);
        $operationsTransport->addResponse($completeOperation);

        // Mock request
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $url = 'gs://example_bucket/example_file.png';
        $fileSet = new CloudStorageOptions_FileSet();
        $fileSet->setUrl($url);
        $cloudStorageOptions = new CloudStorageOptions();
        $cloudStorageOptions->setFileSet($fileSet);
        $storageConfig = new StorageConfig();
        $storageConfig->setCloudStorageOptions($cloudStorageOptions);
        $outputConfig = new OutputStorageConfig();

        $response = $client->createInspectOperation($inspectConfig, $storageConfig, $outputConfig);
        $this->assertFalse($response->isDone());
        $this->assertNull($response->getResult());
        $apiRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($apiRequests));
        $operationsRequestsEmpty = $operationsTransport->popReceivedCalls();
        $this->assertSame(0, count($operationsRequestsEmpty));

        $actualApiFuncCall = $apiRequests[0]->getFuncCall();
        $actualApiRequestObject = $apiRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/CreateInspectOperation', $actualApiFuncCall);
        $actualValue = $actualApiRequestObject->getInspectConfig();

        $this->assertProtobufEquals($inspectConfig, $actualValue);
        $actualValue = $actualApiRequestObject->getStorageConfig();

        $this->assertProtobufEquals($storageConfig, $actualValue);
        $actualValue = $actualApiRequestObject->getOutputConfig();

        $this->assertProtobufEquals($outputConfig, $actualValue);

        $expectedOperationsRequestObject = new GetOperationRequest();
        $expectedOperationsRequestObject->setName('operations/createInspectOperationTest');

        $response->pollUntilComplete();
        $this->assertTrue($response->isDone());
        $this->assertEquals($expectedResponse, $response->getResult());
        $apiRequestsEmpty = $transport->popReceivedCalls();
        $this->assertSame(0, count($apiRequestsEmpty));
        $operationsRequests = $operationsTransport->popReceivedCalls();
        $this->assertSame(1, count($operationsRequests));

        $actualOperationsFuncCall = $operationsRequests[0]->getFuncCall();
        $actualOperationsRequestObject = $operationsRequests[0]->getRequestObject();
        $this->assertSame('/google.longrunning.Operations/GetOperation', $actualOperationsFuncCall);
        $this->assertEquals($expectedOperationsRequestObject, $actualOperationsRequestObject);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());
    }

    /**
     * @test
     */
    public function createInspectOperationExceptionTest()
    {
        $operationsTransport = $this->createTransport();
        $operationsClient = new OperationsClient([
            'serviceAddress' => '',
            'scopes' => [],
            'transport' => $operationsTransport,
        ]);
        $transport = $this->createTransport();
        $client = $this->createClient([
            'transport' => $transport,
            'operationsClient' => $operationsClient,
        ]);

        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());

        // Mock response
        $incompleteOperation = new Operation();
        $incompleteOperation->setName('operations/createInspectOperationTest');
        $incompleteOperation->setDone(false);
        $transport->addResponse($incompleteOperation);

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $operationsTransport->addResponse(null, $status);

        // Mock request
        $name = 'EMAIL_ADDRESS';
        $infoTypesElement = new InfoType();
        $infoTypesElement->setName($name);
        $infoTypes = [$infoTypesElement];
        $inspectConfig = new InspectConfig();
        $inspectConfig->setInfoTypes($infoTypes);
        $url = 'gs://example_bucket/example_file.png';
        $fileSet = new CloudStorageOptions_FileSet();
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
        $transport->popReceivedCalls();
        $operationsTransport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
        $this->assertTrue($operationsTransport->isExhausted());
    }

    /**
     * @test
     */
    public function listInspectFindingsTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $nextPageToken = 'nextPageToken-1530815211';
        $expectedResponse = new ListInspectFindingsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $transport->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->resultName('[RESULT]');

        $response = $client->listInspectFindings($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInspectFindings', $actualFuncCall);

        $actualValue = $actualRequestObject->getName();

        $this->assertProtobufEquals($formattedName, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listInspectFindingsExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listInfoTypesTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new ListInfoTypesResponse();
        $transport->addResponse($expectedResponse);

        // Mock request
        $category = 'PII';
        $languageCode = 'en';

        $response = $client->listInfoTypes($category, $languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListInfoTypes', $actualFuncCall);

        $actualValue = $actualRequestObject->getCategory();

        $this->assertProtobufEquals($category, $actualValue);
        $actualValue = $actualRequestObject->getLanguageCode();

        $this->assertProtobufEquals($languageCode, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listInfoTypesExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listRootCategoriesTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        // Mock response
        $expectedResponse = new ListRootCategoriesResponse();
        $transport->addResponse($expectedResponse);

        // Mock request
        $languageCode = 'en';

        $response = $client->listRootCategories($languageCode);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $transport->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta1.DlpService/ListRootCategories', $actualFuncCall);

        $actualValue = $actualRequestObject->getLanguageCode();

        $this->assertProtobufEquals($languageCode, $actualValue);

        $this->assertTrue($transport->isExhausted());
    }

    /**
     * @test
     */
    public function listRootCategoriesExceptionTest()
    {
        $transport = $this->createTransport();
        $client = $this->createClient(['transport' => $transport]);

        $this->assertTrue($transport->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_DATA_LOSS;
        $status->details = 'internal error';

        $expectedExceptionMessage = json_encode([
           'message' => 'internal error',
           'code' => Grpc\STATUS_DATA_LOSS,
           'status' => 'DATA_LOSS',
           'details' => [],
        ], JSON_PRETTY_PRINT);
        $transport->addResponse(null, $status);

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
        $transport->popReceivedCalls();
        $this->assertTrue($transport->isExhausted());
    }
}
