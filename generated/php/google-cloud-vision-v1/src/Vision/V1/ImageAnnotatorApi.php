<?php
/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

/*
 * GENERATED CODE WARNING
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/cloud/vision/v1/image_annotator.proto
 * and updates to that file get reflected here through a refresh process.
 */

namespace Google\Cloud\Vision\V1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use google\cloud\vision\v1\AnnotateImageRequest;
use google\cloud\vision\v1\BatchAnnotateImagesRequest;
use google\cloud\vision\v1\ImageAnnotatorClient;

/**
 * Service Description: Service that performs Google Cloud Vision API detection tasks, such as face,
 * landmark, logo, label, and text detection, over client images, and returns
 * detected entities from the images.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $imageAnnotatorApi = new ImageAnnotatorApi();
 *     $requests = [];
 *     $response = $imageAnnotatorApi->batchAnnotateImages($requests);
 * } finally {
 *     if (isset($imageAnnotatorApi)) {
 *         $imageAnnotatorApi->close();
 *     }
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class ImageAnnotatorApi
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'vision.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    const _GAX_VERSION = '0.1.0';
    const _CODEGEN_NAME = 'GAPIC';
    const _CODEGEN_VERSION = '0.0.0';

    private $grpcCredentialsHelper;
    private $imageAnnotatorStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    private static function getPageStreamingDescriptors()
    {
        $pageStreamingDescriptors = [
        ];

        return $pageStreamingDescriptors;
    }

    // TODO(garrettjones): add channel (when supported in gRPC)
    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'vision.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Google Cloud Vision API.
     *     @type array $retryingOverride
     *           An associative array of string => RetryOptions, where the keys
     *           are method names (e.g. 'createFoo'), that overrides default retrying
     *           settings. A value of null indicates that the method in question should
     *           not retry.
     *     @type int $timeoutMillis The timeout in milliseconds to use for calls
     *                              that don't use retries. For calls that use retries,
     *                              set the timeout in RetryOptions.
     *                              Default: 30000 (30 seconds)
     *     @type string $appName The codename of the calling service. Default 'gax'.
     *     @type string $appVersion The version of the calling service.
     *                              Default: the current version of GAX.
     *     @type Google\Auth\CredentialsLoader $credentialsLoader
     *                              A CredentialsLoader object created using the
     *                              Google\Auth library.
     * }
     */
    public function __construct($options = [])
    {
        $defaultScopes = [
            'https://www.googleapis.com/auth/cloud-platform',
        ];
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => $defaultScopes,
            'retryingOverride' => null,
            'timeoutMillis' => self::DEFAULT_TIMEOUT_MILLIS,
            'appName' => 'gax',
            'appVersion' => self::_GAX_VERSION,
            'credentialsLoader' => null,
        ];
        $options = array_merge($defaultOptions, $options);

        $headerDescriptor = new AgentHeaderDescriptor([
            'clientName' => $options['appName'],
            'clientVersion' => $options['appVersion'],
            'codeGenName' => self::_CODEGEN_NAME,
            'codeGenVersion' => self::_CODEGEN_VERSION,
            'gaxVersion' => self::_GAX_VERSION,
            'phpVersion' => phpversion(),
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'batchAnnotateImages' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/image_annotator_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.cloud.vision.v1.ImageAnnotator',
                    $clientConfig,
                    $options['retryingOverride'],
                    GrpcConstants::getStatusCodeNames(),
                    $options['timeoutMillis']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (!empty($options['sslCreds'])) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $grpcCredentialsHelperOptions = array_diff_key($options, $defaultOptions);
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($this->scopes, $grpcCredentialsHelperOptions);

        $createImageAnnotatorStubFunction = function ($hostname, $opts) {
            return new ImageAnnotatorClient($hostname, $opts);
        };
        $this->imageAnnotatorStub = $this->grpcCredentialsHelper->createStub(
            $createImageAnnotatorStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Run image detection and annotation for a batch of images.
     *
     * Sample code:
     * ```
     * try {
     *     $imageAnnotatorApi = new ImageAnnotatorApi();
     *     $requests = [];
     *     $response = $imageAnnotatorApi->batchAnnotateImages($requests);
     * } finally {
     *     if (isset($imageAnnotatorApi)) {
     *         $imageAnnotatorApi->close();
     *     }
     * }
     * ```
     *
     * @param AnnotateImageRequest[] $requests     Individual image annotation requests for this batch.
     * @param array                  $optionalArgs {
     *                                             Optional.
     *
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return google\cloud\vision\v1\BatchAnnotateImagesResponse
     *
     * @throws Google\GAX\ApiException if the remote call fails
     */
    public function batchAnnotateImages($requests, $optionalArgs = [])
    {
        $request = new BatchAnnotateImagesRequest();
        foreach ($requests as $elem) {
            $request->addRequests($elem);
        }

        $mergedSettings = $this->defaultCallSettings['batchAnnotateImages']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->imageAnnotatorStub,
            'BatchAnnotateImages',
            $mergedSettings,
            $this->descriptors['batchAnnotateImages']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Initiates an orderly shutdown in which preexisting calls continue but new
     * calls are immediately cancelled.
     */
    public function close()
    {
        $this->imageAnnotatorStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
