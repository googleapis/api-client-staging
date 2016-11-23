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
 * https://github.com/google/googleapis/blob/master/google/cloud/speech/v1beta1/cloud_speech.proto
 * and updates to that file get reflected here through a refresh process.
 */

namespace Google\Cloud\Speech\V1beta1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use google\cloud\speech\v1beta1\AsyncRecognizeRequest;
use google\cloud\speech\v1beta1\RecognitionAudio;
use google\cloud\speech\v1beta1\RecognitionConfig;
use google\cloud\speech\v1beta1\SyncRecognizeRequest;

/**
 * Service Description: Service that implements Google Cloud Speech API.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $speechClient = new SpeechClient();
 *     $config = new RecognitionConfig();
 *     $audio = new RecognitionAudio();
 *     $response = $speechClient->syncRecognize($config, $audio);
 * } finally {
 *     if (isset($speechClient)) {
 *         $speechClient->close();
 *     }
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class SpeechClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'speech.googleapis.com';

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
    private $speechStub;
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
     *                                  Default 'speech.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Google Cloud Speech API.
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
            'syncRecognize' => $defaultDescriptors,
            'asyncRecognize' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/speech_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.cloud.speech.v1beta1.Speech',
                    $clientConfig,
                    $options['retryingOverride'],
                    GrpcConstants::getStatusCodeNames(),
                    $options['timeoutMillis']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (array_key_exists('sslCreds', $options)) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $grpcCredentialsHelperOptions = array_diff_key($options, $defaultOptions);
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($this->scopes, $grpcCredentialsHelperOptions);

        $createSpeechStubFunction = function ($hostname, $opts) {
            return new \google\cloud\speech\v1beta1\SpeechClient($hostname, $opts);
        };
        $this->speechStub = $this->grpcCredentialsHelper->createStub(
            $createSpeechStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Perform synchronous speech-recognition: receive results after all audio
     * has been sent and processed.
     *
     * Sample code:
     * ```
     * try {
     *     $speechClient = new SpeechClient();
     *     $config = new RecognitionConfig();
     *     $audio = new RecognitionAudio();
     *     $response = $speechClient->syncRecognize($config, $audio);
     * } finally {
     *     if (isset($speechClient)) {
     *         $speechClient->close();
     *     }
     * }
     * ```
     *
     * @param RecognitionConfig $config       [Required] The `config` message provides information to the recognizer
     *                                        that specifies how to process the request.
     * @param RecognitionAudio  $audio        [Required] The audio data to be recognized.
     * @param array             $optionalArgs {
     *                                        Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\cloud\speech\v1beta1\SyncRecognizeResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function syncRecognize($config, $audio, $optionalArgs = [])
    {
        $request = new SyncRecognizeRequest();
        $request->setConfig($config);
        $request->setAudio($audio);

        $mergedSettings = $this->defaultCallSettings['syncRecognize']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->speechStub,
            'SyncRecognize',
            $mergedSettings,
            $this->descriptors['syncRecognize']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Perform asynchronous speech-recognition: receive results via the
     * google.longrunning.Operations interface. Returns either an
     * `Operation.error` or an `Operation.response` which contains
     * an `AsyncRecognizeResponse` message.
     *
     * Sample code:
     * ```
     * try {
     *     $speechClient = new SpeechClient();
     *     $config = new RecognitionConfig();
     *     $audio = new RecognitionAudio();
     *     $response = $speechClient->asyncRecognize($config, $audio);
     * } finally {
     *     if (isset($speechClient)) {
     *         $speechClient->close();
     *     }
     * }
     * ```
     *
     * @param RecognitionConfig $config       [Required] The `config` message provides information to the recognizer
     *                                        that specifies how to process the request.
     * @param RecognitionAudio  $audio        [Required] The audio data to be recognized.
     * @param array             $optionalArgs {
     *                                        Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\longrunning\Operation
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function asyncRecognize($config, $audio, $optionalArgs = [])
    {
        $request = new AsyncRecognizeRequest();
        $request->setConfig($config);
        $request->setAudio($audio);

        $mergedSettings = $this->defaultCallSettings['asyncRecognize']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->speechStub,
            'AsyncRecognize',
            $mergedSettings,
            $this->descriptors['asyncRecognize']
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
        $this->speechStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
