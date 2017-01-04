<?php
/*
 * Copyright 2016, Google Inc. All rights reserved.
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
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/cloud/language/v1/language_service.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 */

namespace Google\Cloud\Language\V1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use google\cloud\language\v1\AnalyzeEntitiesRequest;
use google\cloud\language\v1\AnalyzeSentimentRequest;
use google\cloud\language\v1\AnalyzeSyntaxRequest;
use google\cloud\language\v1\AnnotateTextRequest;
use google\cloud\language\v1\AnnotateTextRequest\Features;
use google\cloud\language\v1\Document;
use google\cloud\language\v1\EncodingType;
use google\cloud\language\v1\LanguageServiceGrpcClient;

/**
 * Service Description: Provides text analysis operations such as sentiment analysis and entity
 * recognition.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $languageServiceClient = new LanguageServiceClient();
 *     $document = new Document();
 *     $response = $languageServiceClient->analyzeSentiment($document);
 * } finally {
 *     if (isset($languageServiceClient)) {
 *         $languageServiceClient->close();
 *     }
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class LanguageServiceClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'language.googleapis.com';
    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    const _CODEGEN_NAME = 'gapic';
    const _CODEGEN_VERSION = '0.1.0';

    private $grpcCredentialsHelper;
    private $languageServiceStub;
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
     *                                  Default 'language.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Google Cloud Natural Language API.
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
     *     @type \Google\Auth\CredentialsLoader $credentialsLoader
     *                              A CredentialsLoader object created using the
     *                              Google\Auth library.
     * }
     */
    public function __construct($options = [])
    {
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
            ],
            'retryingOverride' => null,
            'timeoutMillis' => self::DEFAULT_TIMEOUT_MILLIS,
            'appName' => 'gax',
            'appVersion' => AgentHeaderDescriptor::getGaxVersion(),
        ];
        $options = array_merge($defaultOptions, $options);

        $headerDescriptor = new AgentHeaderDescriptor([
            'clientName' => $options['appName'],
            'clientVersion' => $options['appVersion'],
            'codeGenName' => self::_CODEGEN_NAME,
            'codeGenVersion' => self::_CODEGEN_VERSION,
            'gaxVersion' => AgentHeaderDescriptor::getGaxVersion(),
            'phpVersion' => phpversion(),
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'analyzeSentiment' => $defaultDescriptors,
            'analyzeEntities' => $defaultDescriptors,
            'analyzeSyntax' => $defaultDescriptors,
            'annotateText' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/language_service_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.cloud.language.v1.LanguageService',
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

        $createLanguageServiceStubFunction = function ($hostname, $opts) {
            return new LanguageServiceGrpcClient($hostname, $opts);
        };
        if (array_key_exists('createLanguageServiceStubFunction', $options)) {
            $createLanguageServiceStubFunction = $options['createLanguageServiceStubFunction'];
        }
        $this->languageServiceStub = $this->grpcCredentialsHelper->createStub(
            $createLanguageServiceStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Analyzes the sentiment of the provided text.
     *
     * Sample code:
     * ```
     * try {
     *     $languageServiceClient = new LanguageServiceClient();
     *     $document = new Document();
     *     $response = $languageServiceClient->analyzeSentiment($document);
     * } finally {
     *     if (isset($languageServiceClient)) {
     *         $languageServiceClient->close();
     *     }
     * }
     * ```
     *
     * @param Document $document     Input document. Currently, `analyzeSentiment` only supports English text
     *                               ([Document.language][google.cloud.language.v1.Document.language]="EN").
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type EncodingType $encodingType
     *          The encoding type used by the API to calculate sentence offsets.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\cloud\language\v1\AnalyzeSentimentResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function analyzeSentiment($document, $optionalArgs = [])
    {
        $request = new AnalyzeSentimentRequest();
        $request->setDocument($document);
        if (isset($optionalArgs['encodingType'])) {
            $request->setEncodingType($optionalArgs['encodingType']);
        }

        $mergedSettings = $this->defaultCallSettings['analyzeSentiment']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->languageServiceStub,
            'AnalyzeSentiment',
            $mergedSettings,
            $this->descriptors['analyzeSentiment']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Finds named entities (currently finds proper names) in the text,
     * entity types, salience, mentions for each entity, and other properties.
     *
     * Sample code:
     * ```
     * try {
     *     $languageServiceClient = new LanguageServiceClient();
     *     $document = new Document();
     *     $encodingType = EncodingType::NONE;
     *     $response = $languageServiceClient->analyzeEntities($document, $encodingType);
     * } finally {
     *     if (isset($languageServiceClient)) {
     *         $languageServiceClient->close();
     *     }
     * }
     * ```
     *
     * @param Document     $document     Input document.
     * @param EncodingType $encodingType The encoding type used by the API to calculate offsets.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\cloud\language\v1\AnalyzeEntitiesResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function analyzeEntities($document, $encodingType, $optionalArgs = [])
    {
        $request = new AnalyzeEntitiesRequest();
        $request->setDocument($document);
        $request->setEncodingType($encodingType);

        $mergedSettings = $this->defaultCallSettings['analyzeEntities']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->languageServiceStub,
            'AnalyzeEntities',
            $mergedSettings,
            $this->descriptors['analyzeEntities']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Analyzes the syntax of the text and provides sentence boundaries and
     * tokenization along with part of speech tags, dependency trees, and other
     * properties.
     *
     * Sample code:
     * ```
     * try {
     *     $languageServiceClient = new LanguageServiceClient();
     *     $document = new Document();
     *     $encodingType = EncodingType::NONE;
     *     $response = $languageServiceClient->analyzeSyntax($document, $encodingType);
     * } finally {
     *     if (isset($languageServiceClient)) {
     *         $languageServiceClient->close();
     *     }
     * }
     * ```
     *
     * @param Document     $document     Input document.
     * @param EncodingType $encodingType The encoding type used by the API to calculate offsets.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\cloud\language\v1\AnalyzeSyntaxResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function analyzeSyntax($document, $encodingType, $optionalArgs = [])
    {
        $request = new AnalyzeSyntaxRequest();
        $request->setDocument($document);
        $request->setEncodingType($encodingType);

        $mergedSettings = $this->defaultCallSettings['analyzeSyntax']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->languageServiceStub,
            'AnalyzeSyntax',
            $mergedSettings,
            $this->descriptors['analyzeSyntax']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * A convenience method that provides all the features that analyzeSentiment,
     * analyzeEntities, and analyzeSyntax provide in one call.
     *
     * Sample code:
     * ```
     * try {
     *     $languageServiceClient = new LanguageServiceClient();
     *     $document = new Document();
     *     $features = new Features();
     *     $encodingType = EncodingType::NONE;
     *     $response = $languageServiceClient->annotateText($document, $features, $encodingType);
     * } finally {
     *     if (isset($languageServiceClient)) {
     *         $languageServiceClient->close();
     *     }
     * }
     * ```
     *
     * @param Document     $document     Input document.
     * @param Features     $features     The enabled features.
     * @param EncodingType $encodingType The encoding type used by the API to calculate offsets.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\cloud\language\v1\AnnotateTextResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function annotateText($document, $features, $encodingType, $optionalArgs = [])
    {
        $request = new AnnotateTextRequest();
        $request->setDocument($document);
        $request->setFeatures($features);
        $request->setEncodingType($encodingType);

        $mergedSettings = $this->defaultCallSettings['annotateText']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->languageServiceStub,
            'AnnotateText',
            $mergedSettings,
            $this->descriptors['annotateText']
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
        $this->languageServiceStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
