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

namespace Google\Cloud\Tests\Unit\Dlp\V2beta2;

use Google\Cloud\Dlp\V2beta2\DlpServiceClient;
use Google\ApiCore\ApiException;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\Testing\GeneratedTest;
use Google\Cloud\Dlp\V2beta2\DeidentifyContentResponse;
use Google\Cloud\Dlp\V2beta2\DeidentifyTemplate;
use Google\Cloud\Dlp\V2beta2\DlpJob;
use Google\Cloud\Dlp\V2beta2\InspectContentResponse;
use Google\Cloud\Dlp\V2beta2\InspectTemplate;
use Google\Cloud\Dlp\V2beta2\ListDeidentifyTemplatesResponse;
use Google\Cloud\Dlp\V2beta2\ListDlpJobsResponse;
use Google\Cloud\Dlp\V2beta2\ListInfoTypesResponse;
use Google\Cloud\Dlp\V2beta2\ListInspectTemplatesResponse;
use Google\Cloud\Dlp\V2beta2\RedactImageResponse;
use Google\Cloud\Dlp\V2beta2\ReidentifyContentResponse;
use Google\Protobuf\Any;
use Google\Protobuf\GPBEmpty;
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
    public function inspectContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new InspectContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->inspectContent($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/InspectContent', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->inspectContent($formattedParent);
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
    public function redactImageTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $redactedImage = '28';
        $extractedText = 'extractedText998260012';
        $expectedResponse = new RedactImageResponse();
        $expectedResponse->setRedactedImage($redactedImage);
        $expectedResponse->setExtractedText($extractedText);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->redactImage($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/RedactImage', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function redactImageExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->redactImage($formattedParent);
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
    public function deidentifyContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new DeidentifyContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->deidentifyContent($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/DeidentifyContent', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->deidentifyContent($formattedParent);
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
    public function reidentifyContentTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new ReidentifyContentResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->reidentifyContent($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/ReidentifyContent', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function reidentifyContentExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->reidentifyContent($formattedParent);
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
    public function inspectDataSourceTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new DlpJob();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->inspectDataSource($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/InspectDataSource', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function inspectDataSourceExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->inspectDataSource($formattedParent);
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
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $expectedResponse = new DlpJob();
        $expectedResponse->setName($name);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->analyzeDataSourceRisk($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/AnalyzeDataSourceRisk', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function analyzeDataSourceRiskExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->analyzeDataSourceRisk($formattedParent);
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

        $response = $client->listInfoTypes();
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/ListInfoTypes', $actualFuncCall);

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

        try {
            $client->listInfoTypes();
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
    public function createInspectTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new InspectTemplate();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        $response = $client->createInspectTemplate($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/CreateInspectTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createInspectTemplateExceptionTest()
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
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        try {
            $client->createInspectTemplate($formattedParent);
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
    public function updateInspectTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new InspectTemplate();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');

        $response = $client->updateInspectTemplate($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/UpdateInspectTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateInspectTemplateExceptionTest()
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
        $formattedName = $client->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');

        try {
            $client->updateInspectTemplate($formattedName);
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
    public function getInspectTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new InspectTemplate();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        $response = $client->getInspectTemplate();
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/GetInspectTemplate', $actualFuncCall);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getInspectTemplateExceptionTest()
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

        try {
            $client->getInspectTemplate();
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
    public function listInspectTemplatesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $inspectTemplatesElement = new InspectTemplate();
        $inspectTemplates = [$inspectTemplatesElement];
        $expectedResponse = new ListInspectTemplatesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setInspectTemplates($inspectTemplates);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        $response = $client->listInspectTemplates($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getInspectTemplates()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/ListInspectTemplates', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listInspectTemplatesExceptionTest()
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
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        try {
            $client->listInspectTemplates($formattedParent);
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
    public function deleteInspectTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');

        $client->deleteInspectTemplate($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/DeleteInspectTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteInspectTemplateExceptionTest()
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
        $formattedName = $client->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');

        try {
            $client->deleteInspectTemplate($formattedName);
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
    public function createDeidentifyTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name = 'name3373707';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new DeidentifyTemplate();
        $expectedResponse->setName($name);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        $response = $client->createDeidentifyTemplate($formattedParent);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/CreateDeidentifyTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createDeidentifyTemplateExceptionTest()
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
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        try {
            $client->createDeidentifyTemplate($formattedParent);
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
    public function updateDeidentifyTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new DeidentifyTemplate();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        $response = $client->updateDeidentifyTemplate($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/UpdateDeidentifyTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updateDeidentifyTemplateExceptionTest()
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
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        try {
            $client->updateDeidentifyTemplate($formattedName);
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
    public function getDeidentifyTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $displayName = 'displayName1615086568';
        $description = 'description-1724546052';
        $expectedResponse = new DeidentifyTemplate();
        $expectedResponse->setName($name2);
        $expectedResponse->setDisplayName($displayName);
        $expectedResponse->setDescription($description);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        $response = $client->getDeidentifyTemplate($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/GetDeidentifyTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDeidentifyTemplateExceptionTest()
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
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        try {
            $client->getDeidentifyTemplate($formattedName);
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
    public function listDeidentifyTemplatesTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $deidentifyTemplatesElement = new DeidentifyTemplate();
        $deidentifyTemplates = [$deidentifyTemplatesElement];
        $expectedResponse = new ListDeidentifyTemplatesResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setDeidentifyTemplates($deidentifyTemplates);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        $response = $client->listDeidentifyTemplates($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getDeidentifyTemplates()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/ListDeidentifyTemplates', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listDeidentifyTemplatesExceptionTest()
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
        $formattedParent = $client->organizationName('[ORGANIZATION]');

        try {
            $client->listDeidentifyTemplates($formattedParent);
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
    public function deleteDeidentifyTemplateTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        $client->deleteDeidentifyTemplate($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/DeleteDeidentifyTemplate', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteDeidentifyTemplateExceptionTest()
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
        $formattedName = $client->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');

        try {
            $client->deleteDeidentifyTemplate($formattedName);
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
    public function listDlpJobsTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $jobsElement = new DlpJob();
        $jobs = [$jobsElement];
        $expectedResponse = new ListDlpJobsResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        $expectedResponse->setJobs($jobs);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedParent = $client->projectName('[PROJECT]');

        $response = $client->listDlpJobs($formattedParent);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getJobs()[0], $resources[0]);

        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/ListDlpJobs', $actualFuncCall);

        $this->assertProtobufEquals($formattedParent, $actualRequestObject->getParent());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listDlpJobsExceptionTest()
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
        $formattedParent = $client->projectName('[PROJECT]');

        try {
            $client->listDlpJobs($formattedParent);
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
    public function getDlpJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $name2 = 'name2-1052831874';
        $expectedResponse = new DlpJob();
        $expectedResponse->setName($name2);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        $response = $client->getDlpJob($formattedName);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/GetDlpJob', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getDlpJobExceptionTest()
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
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        try {
            $client->getDlpJob($formattedName);
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
    public function deleteDlpJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        $client->deleteDlpJob($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/DeleteDlpJob', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deleteDlpJobExceptionTest()
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
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        try {
            $client->deleteDlpJob($formattedName);
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
    public function cancelDlpJobTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockDlpServiceImpl']);
        $client = $this->createClient('createDlpServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new GPBEmpty();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        $client->cancelDlpJob($formattedName);
        $actualRequests = $grpcStub->popReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.privacy.dlp.v2beta2.DlpService/CancelDlpJob', $actualFuncCall);

        $this->assertProtobufEquals($formattedName, $actualRequestObject->getName());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function cancelDlpJobExceptionTest()
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
        $formattedName = $client->dlpJobName('[PROJECT]', '[DLP_JOB]');

        try {
            $client->cancelDlpJob($formattedName);
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
