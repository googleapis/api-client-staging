<?php
/*
 * Copyright 2017, Google LLC All rights reserved.
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

namespace Google\Cloud\Tests\Unit\BigQuery\DataTransfer\V1;

use Google\Cloud\BigQuery\DataTransfer\V1\DataTransferServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\BigQuery\DataTransfer\V1\CheckValidCredsResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\DataSource;
use Google\Cloud\BigQuery\DataTransfer\V1\ListDataSourcesResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\ListTransferConfigsResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\ListTransferLogsResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\ListTransferRunsResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\ScheduleTransferRunsResponse;
use Google\Cloud\BigQuery\DataTransfer\V1\TransferConfig;
use Google\Cloud\BigQuery\DataTransfer\V1\TransferMessage;
use Google\Cloud\BigQuery\DataTransfer\V1\TransferRun;
use Google\Protobuf\Any;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Google\Protobuf\Timestamp;
use Grpc;
use stdClass;

/**
 * @group data_transfer
 * @group grpc
 */
class DataTransferServiceClientTest extends GeneratedTest
{
    public function createMockDataTransferServiceImpl($hostname, $opts)
    {
        return new MockDataTransferServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([
            'serviceAddress' => DataTransferServiceClient::SERVICE_ADDRESS,
            'port' => DataTransferServiceClient::DEFAULT_SERVICE_PORT,
            'scopes' => ['unknown-service-scopes'],
        ]);

        return $grpcCredentialsHelper->createStub($createGrpcStub);
    }

    /**
     * @return DataTransferServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new DataTransferServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }

    /**
     * @test
     */
    public function getDataSourceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $dataSourceId = 'dataSourceId-1015796374';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $clientId = 'clientId-1904089585';
        $supportsMultipleTransfers = true;
        $updateDeadlineSeconds = 991471694;
        $defaultSchedule = 'defaultSchedule-800168235';
        $supportsCustomSchedule = true;
        $helpUrl = 'helpUrl-789431439';
        $defaultDataRefreshWindowDays = -1804935157;
        $manualRunsDisabled = true;
        $expectedResponse = new DataSource();
        $expectedResponse->setName($name2);
        $expectedResponse->setDataSourceId($dataSourceId);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $expectedResponse->setClientId($clientId);
        $expectedResponse->setSupportsMultipleTransfers($supportsMultipleTransfers);
        $expectedResponse->setUpdateDeadlineSeconds($updateDeadlineSeconds);
        $expectedResponse->setDefaultSchedule($defaultSchedule);
        $expectedResponse->setSupportsCustomSchedule($supportsCustomSchedule);
        $expectedResponse->setHelpUrl($helpUrl);
        $expectedResponse->setDefaultDataRefreshWindowDays($defaultDataRefreshWindowDays);
        $expectedResponse->setManualRunsDisabled($manualRunsDisabled);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationDataSourceName('[PROJECT]', '[LOCATION]', '[DATA_SOURCE]');

        $response = $client->getDataSource($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/GetDataSource', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDataSourceExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationDataSourceName('[PROJECT]', '[LOCATION]', '[DATA_SOURCE]');

        try {
            $client->getDataSource($formattedName);
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
    public function listDataSourcesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $dataSourcesElement = new DataSource();
        $dataSources = [$dataSourcesElement];
        $expectedResponse = new ListDataSourcesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setDataSources($dataSources);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');

        $response = $client->listDataSources($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getDataSources()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/ListDataSources', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listDataSourcesExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');

        try {
            $client->listDataSources($formattedParent);
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
    public function createTransferConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destinationDatasetId = 'destinationDatasetId1541564179';
        $displayName = 'displayName1615086568';
        $dataSourceId = 'dataSourceId-1015796374';
        $schedule = 'schedule-697920873';
        $dataRefreshWindowDays = 327632845;
        $disabled = true;
        $userId = -147132913;
        $datasetRegion = 'datasetRegion959248539';
        $expectedResponse = new TransferConfig();
        $expectedResponse->setName($name);
        $expectedResponse->setDestinationDatasetId($destinationDatasetId);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDataSourceId($dataSourceId);
        $expectedResponse->setSchedule($schedule);
        $expectedResponse->setDataRefreshWindowDays($dataRefreshWindowDays);
        $expectedResponse->setDisabled($disabled);
        $expectedResponse->setUserId($userId);
        $expectedResponse->setDatasetRegion($datasetRegion);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');
        $transferConfig = new TransferConfig();

        $response = $client->createTransferConfig($formattedParent, $transferConfig);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/CreateTransferConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($transferConfig, $actualRequestObject->getTransferConfig());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createTransferConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');
        $transferConfig = new TransferConfig();

        try {
            $client->createTransferConfig($formattedParent, $transferConfig);
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
    public function updateTransferConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $destinationDatasetId = 'destinationDatasetId1541564179';
        $displayName = 'displayName1615086568';
        $dataSourceId = 'dataSourceId-1015796374';
        $schedule = 'schedule-697920873';
        $dataRefreshWindowDays = 327632845;
        $disabled = true;
        $userId = -147132913;
        $datasetRegion = 'datasetRegion959248539';
        $expectedResponse = new TransferConfig();
        $expectedResponse->setName($name);
        $expectedResponse->setDestinationDatasetId($destinationDatasetId);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDataSourceId($dataSourceId);
        $expectedResponse->setSchedule($schedule);
        $expectedResponse->setDataRefreshWindowDays($dataRefreshWindowDays);
        $expectedResponse->setDisabled($disabled);
        $expectedResponse->setUserId($userId);
        $expectedResponse->setDatasetRegion($datasetRegion);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $transferConfig = new TransferConfig();
        $updateMask = new FieldMask();

        $response = $client->updateTransferConfig($transferConfig, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/UpdateTransferConfig', $actualFuncCall);

        $this->assertProtobufEquals($transferConfig, $actualRequestObject->getTransferConfig());
        $this->assertProtobufEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateTransferConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $transferConfig = new TransferConfig();
        $updateMask = new FieldMask();

        try {
            $client->updateTransferConfig($transferConfig, $updateMask);
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
    public function deleteTransferConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        $client->deleteTransferConfig($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/DeleteTransferConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteTransferConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        try {
            $client->deleteTransferConfig($formattedName);
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
    public function getTransferConfigTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $destinationDatasetId = 'destinationDatasetId1541564179';
        $displayName = 'displayName1615086568';
        $dataSourceId = 'dataSourceId-1015796374';
        $schedule = 'schedule-697920873';
        $dataRefreshWindowDays = 327632845;
        $disabled = true;
        $userId = -147132913;
        $datasetRegion = 'datasetRegion959248539';
        $expectedResponse = new TransferConfig();
        $expectedResponse->setName($name2);
        $expectedResponse->setDestinationDatasetId($destinationDatasetId);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDataSourceId($dataSourceId);
        $expectedResponse->setSchedule($schedule);
        $expectedResponse->setDataRefreshWindowDays($dataRefreshWindowDays);
        $expectedResponse->setDisabled($disabled);
        $expectedResponse->setUserId($userId);
        $expectedResponse->setDatasetRegion($datasetRegion);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        $response = $client->getTransferConfig($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/GetTransferConfig', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTransferConfigExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        try {
            $client->getTransferConfig($formattedName);
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
    public function listTransferConfigsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $transferConfigsElement = new TransferConfig();
        $transferConfigs = [$transferConfigsElement];
        $expectedResponse = new ListTransferConfigsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTransferConfigs($transferConfigs);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');

        $response = $client->listTransferConfigs($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTransferConfigs()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/ListTransferConfigs', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTransferConfigsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationName('[PROJECT]', '[LOCATION]');

        try {
            $client->listTransferConfigs($formattedParent);
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
    public function scheduleTransferRunsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ScheduleTransferRunsResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');
        $startTime = new Timestamp();
        $endTime = new Timestamp();

        $response = $client->scheduleTransferRuns($formattedParent, $startTime, $endTime);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/ScheduleTransferRuns', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertProtobufEquals($startTime, $actualRequestObject->getStartTime());
        $this->assertProtobufEquals($endTime, $actualRequestObject->getEndTime());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function scheduleTransferRunsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');
        $startTime = new Timestamp();
        $endTime = new Timestamp();

        try {
            $client->scheduleTransferRuns($formattedParent, $startTime, $endTime);
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
    public function getTransferRunTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $destinationDatasetId = 'destinationDatasetId1541564179';
        $dataSourceId = 'dataSourceId-1015796374';
        $userId = -147132913;
        $schedule = 'schedule-697920873';
        $expectedResponse = new TransferRun();
        $expectedResponse->setName($name2);
        $expectedResponse->setDestinationDatasetId($destinationDatasetId);
        $expectedResponse->setDataSourceId($dataSourceId);
        $expectedResponse->setUserId($userId);
        $expectedResponse->setSchedule($schedule);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        $response = $client->getTransferRun($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/GetTransferRun', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getTransferRunExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        try {
            $client->getTransferRun($formattedName);
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
    public function deleteTransferRunTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        $client->deleteTransferRun($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/DeleteTransferRun', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteTransferRunExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        try {
            $client->deleteTransferRun($formattedName);
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
    public function listTransferRunsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $transferRunsElement = new TransferRun();
        $transferRuns = [$transferRunsElement];
        $expectedResponse = new ListTransferRunsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTransferRuns($transferRuns);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        $response = $client->listTransferRuns($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTransferRuns()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/ListTransferRuns', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTransferRunsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationTransferConfigName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]');

        try {
            $client->listTransferRuns($formattedParent);
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
    public function listTransferLogsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $transferMessagesElement = new TransferMessage();
        $transferMessages = [$transferMessagesElement];
        $expectedResponse = new ListTransferLogsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setTransferMessages($transferMessages);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        $response = $client->listTransferLogs($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getTransferMessages()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/ListTransferLogs', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listTransferLogsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedParent = $client->locationRunName('[PROJECT]', '[LOCATION]', '[TRANSFER_CONFIG]', '[RUN]');

        try {
            $client->listTransferLogs($formattedParent);
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
    public function checkValidCredsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $hasValidCreds = false;
        $expectedResponse = new CheckValidCredsResponse();
        $expectedResponse->setHasValidCreds($hasValidCreds);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->locationDataSourceName('[PROJECT]', '[LOCATION]', '[DATA_SOURCE]');

        $response = $client->checkValidCreds($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.cloud.bigquery.datatransfer.v1.DataTransferService/CheckValidCreds', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function checkValidCredsExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDataTransferServiceImpl']);
        $client = $this->createClient('createDataTransferServiceStubFunction', $grpcStub);

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
        $formattedName = $client->locationDataSourceName('[PROJECT]', '[LOCATION]', '[DATA_SOURCE]');

        try {
            $client->checkValidCreds($formattedName);
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
