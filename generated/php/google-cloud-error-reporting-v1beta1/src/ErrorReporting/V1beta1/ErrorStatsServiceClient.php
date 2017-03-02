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
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 */

namespace Google\Cloud\ErrorReporting\V1beta1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\PageStreamingDescriptor;
use Google\GAX\PathTemplate;
use google\devtools\clouderrorreporting\v1beta1\DeleteEventsRequest;
use google\devtools\clouderrorreporting\v1beta1\ErrorGroupOrder;
use google\devtools\clouderrorreporting\v1beta1\ErrorStatsServiceGrpcClient;
use google\devtools\clouderrorreporting\v1beta1\ListEventsRequest;
use google\devtools\clouderrorreporting\v1beta1\ListGroupStatsRequest;
use google\devtools\clouderrorreporting\v1beta1\QueryTimeRange;
use google\devtools\clouderrorreporting\v1beta1\ServiceContextFilter;
use google\devtools\clouderrorreporting\v1beta1\TimedCountAlignment;
use google\protobuf\Duration;
use google\protobuf\Timestamp;

/**
 * Service Description: An API for retrieving and managing error statistics as well as data for
 * individual events.
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
 *     $errorStatsServiceClient = new ErrorStatsServiceClient();
 *     $formattedProjectName = ErrorStatsServiceClient::formatProjectName("[PROJECT]");
 *     $timeRange = new QueryTimeRange();
 *     // Iterate through all elements
 *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements, with the maximum page size set to 5
 *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange, ['pageSize' => 5]);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $errorStatsServiceClient->close();
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class ErrorStatsServiceClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The code generator version, to be included in the agent header.
     */
    const CODEGEN_VERSION = '0.0.5';

    private static $projectNameTemplate;

    private $grpcCredentialsHelper;
    private $errorStatsServiceStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project resource.
     */
    public static function formatProjectName($project)
    {
        return self::getProjectNameTemplate()->render([
            'project' => $project,
        ]);
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a project resource.
     */
    public static function parseProjectFromProjectName($projectName)
    {
        return self::getProjectNameTemplate()->match($projectName)['project'];
    }

    private static function getProjectNameTemplate()
    {
        if (self::$projectNameTemplate == null) {
            self::$projectNameTemplate = new PathTemplate('projects/{project}');
        }

        return self::$projectNameTemplate;
    }

    private static function getPageStreamingDescriptors()
    {
        $listGroupStatsPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenField' => 'page_token',
                    'requestPageSizeField' => 'page_size',
                    'responsePageTokenField' => 'next_page_token',
                    'resourceField' => 'error_group_stats',
                ]);
        $listEventsPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenField' => 'page_token',
                    'requestPageSizeField' => 'page_size',
                    'responsePageTokenField' => 'next_page_token',
                    'resourceField' => 'error_events',
                ]);

        $pageStreamingDescriptors = [
            'listGroupStats' => $listGroupStatsPageStreamingDescriptor,
            'listEvents' => $listEventsPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    private static function getGapicVersion()
    {
        if (file_exists(__DIR__.'/../VERSION')) {
            return trim(file_get_contents(__DIR__.'/../VERSION'));
        } elseif (class_exists('\Google\Cloud\ServiceBuilder')) {
            return \Google\Cloud\ServiceBuilder::VERSION;
        } else {
            return;
        }
    }

    // TODO(garrettjones): add channel (when supported in gRPC)
    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'clouderrorreporting.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Stackdriver Error Reporting API.
     *     @type array $retryingOverride
     *           An associative array of string => RetryOptions, where the keys
     *           are method names (e.g. 'createFoo'), that overrides default retrying
     *           settings. A value of null indicates that the method in question should
     *           not retry.
     *     @type int $timeoutMillis The timeout in milliseconds to use for calls
     *                              that don't use retries. For calls that use retries,
     *                              set the timeout in RetryOptions.
     *                              Default: 30000 (30 seconds)
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
            'libName' => null,
            'libVersion' => null,
        ];
        $options = array_merge($defaultOptions, $options);

        $gapicVersion = $options['libVersion'] ?: self::getGapicVersion();

        $headerDescriptor = new AgentHeaderDescriptor([
            'libName' => $options['libName'],
            'libVersion' => $options['libVersion'],
            'gapicVersion' => $gapicVersion,
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'listGroupStats' => $defaultDescriptors,
            'listEvents' => $defaultDescriptors,
            'deleteEvents' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/error_stats_service_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.devtools.clouderrorreporting.v1beta1.ErrorStatsService',
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

        $createErrorStatsServiceStubFunction = function ($hostname, $opts) {
            return new ErrorStatsServiceGrpcClient($hostname, $opts);
        };
        if (array_key_exists('createErrorStatsServiceStubFunction', $options)) {
            $createErrorStatsServiceStubFunction = $options['createErrorStatsServiceStubFunction'];
        }
        $this->errorStatsServiceStub = $this->grpcCredentialsHelper->createStub(
            $createErrorStatsServiceStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Lists the specified groups.
     *
     * Sample code:
     * ```
     * try {
     *     $errorStatsServiceClient = new ErrorStatsServiceClient();
     *     $formattedProjectName = ErrorStatsServiceClient::formatProjectName("[PROJECT]");
     *     $timeRange = new QueryTimeRange();
     *     // Iterate through all elements
     *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements, with the maximum page size set to 5
     *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange, ['pageSize' => 5]);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $errorStatsServiceClient->close();
     * }
     * ```
     *
     * @param string $projectName [Required] The resource name of the Google Cloud Platform project. Written
     *                            as <code>projects/</code> plus the
     *                            <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
     *                            Platform project ID</a>.
     *
     * Example: <code>projects/my-project-123</code>.
     * @param QueryTimeRange $timeRange    [Optional] List data for the given time range.
     *                                     If not set a default time range is used. The field time_range_begin
     *                                     in the response will specify the beginning of this time range.
     *                                     Only <code>ErrorGroupStats</code> with a non-zero count in the given time
     *                                     range are returned, unless the request contains an explicit group_id list.
     *                                     If a group_id list is given, also <code>ErrorGroupStats</code> with zero
     *                                     occurrences are returned.
     * @param array          $optionalArgs {
     *                                     Optional.
     *
     *     @type string[] $groupId
     *          [Optional] List all <code>ErrorGroupStats</code> with these IDs.
     *     @type ServiceContextFilter $serviceFilter
     *          [Optional] List only <code>ErrorGroupStats</code> which belong to a service
     *          context that matches the filter.
     *          Data for all service contexts is returned if this field is not specified.
     *     @type Duration $timedCountDuration
     *          [Optional] The preferred duration for a single returned `TimedCount`.
     *          If not set, no timed counts are returned.
     *     @type TimedCountAlignment $alignment
     *          [Optional] The alignment of the timed counts to be returned.
     *          Default is `ALIGNMENT_EQUAL_AT_END`.
     *     @type Timestamp $alignmentTime
     *          [Optional] Time where the timed counts shall be aligned if rounded
     *          alignment is chosen. Default is 00:00 UTC.
     *     @type ErrorGroupOrder $order
     *          [Optional] The sort order in which the results are returned.
     *          Default is `COUNT_DESC`.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\GAX\PagedListResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function listGroupStats($projectName, $timeRange, $optionalArgs = [])
    {
        $request = new ListGroupStatsRequest();
        $request->setProjectName($projectName);
        $request->setTimeRange($timeRange);
        if (isset($optionalArgs['groupId'])) {
            foreach ($optionalArgs['groupId'] as $elem) {
                $request->addGroupId($elem);
            }
        }
        if (isset($optionalArgs['serviceFilter'])) {
            $request->setServiceFilter($optionalArgs['serviceFilter']);
        }
        if (isset($optionalArgs['timedCountDuration'])) {
            $request->setTimedCountDuration($optionalArgs['timedCountDuration']);
        }
        if (isset($optionalArgs['alignment'])) {
            $request->setAlignment($optionalArgs['alignment']);
        }
        if (isset($optionalArgs['alignmentTime'])) {
            $request->setAlignmentTime($optionalArgs['alignmentTime']);
        }
        if (isset($optionalArgs['order'])) {
            $request->setOrder($optionalArgs['order']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        $mergedSettings = $this->defaultCallSettings['listGroupStats']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->errorStatsServiceStub,
            'ListGroupStats',
            $mergedSettings,
            $this->descriptors['listGroupStats']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists the specified events.
     *
     * Sample code:
     * ```
     * try {
     *     $errorStatsServiceClient = new ErrorStatsServiceClient();
     *     $formattedProjectName = ErrorStatsServiceClient::formatProjectName("[PROJECT]");
     *     $groupId = "";
     *     // Iterate through all elements
     *     $pagedResponse = $errorStatsServiceClient->listEvents($formattedProjectName, $groupId);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements, with the maximum page size set to 5
     *     $pagedResponse = $errorStatsServiceClient->listEvents($formattedProjectName, $groupId, ['pageSize' => 5]);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $errorStatsServiceClient->close();
     * }
     * ```
     *
     * @param string $projectName  [Required] The resource name of the Google Cloud Platform project. Written
     *                             as `projects/` plus the
     *                             [Google Cloud Platform project
     *                             ID](https://support.google.com/cloud/answer/6158840).
     *                             Example: `projects/my-project-123`.
     * @param string $groupId      [Required] The group for which events shall be returned.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type ServiceContextFilter $serviceFilter
     *          [Optional] List only ErrorGroups which belong to a service context that
     *          matches the filter.
     *          Data for all service contexts is returned if this field is not specified.
     *     @type QueryTimeRange $timeRange
     *          [Optional] List only data for the given time range.
     *          If not set a default time range is used. The field time_range_begin
     *          in the response will specify the beginning of this time range.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\GAX\PagedListResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function listEvents($projectName, $groupId, $optionalArgs = [])
    {
        $request = new ListEventsRequest();
        $request->setProjectName($projectName);
        $request->setGroupId($groupId);
        if (isset($optionalArgs['serviceFilter'])) {
            $request->setServiceFilter($optionalArgs['serviceFilter']);
        }
        if (isset($optionalArgs['timeRange'])) {
            $request->setTimeRange($optionalArgs['timeRange']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        $mergedSettings = $this->defaultCallSettings['listEvents']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->errorStatsServiceStub,
            'ListEvents',
            $mergedSettings,
            $this->descriptors['listEvents']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes all error events of a given project.
     *
     * Sample code:
     * ```
     * try {
     *     $errorStatsServiceClient = new ErrorStatsServiceClient();
     *     $formattedProjectName = ErrorStatsServiceClient::formatProjectName("[PROJECT]");
     *     $response = $errorStatsServiceClient->deleteEvents($formattedProjectName);
     * } finally {
     *     $errorStatsServiceClient->close();
     * }
     * ```
     *
     * @param string $projectName  [Required] The resource name of the Google Cloud Platform project. Written
     *                             as `projects/` plus the
     *                             [Google Cloud Platform project
     *                             ID](https://support.google.com/cloud/answer/6158840).
     *                             Example: `projects/my-project-123`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \google\devtools\clouderrorreporting\v1beta1\DeleteEventsResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function deleteEvents($projectName, $optionalArgs = [])
    {
        $request = new DeleteEventsRequest();
        $request->setProjectName($projectName);

        $mergedSettings = $this->defaultCallSettings['deleteEvents']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->errorStatsServiceStub,
            'DeleteEvents',
            $mergedSettings,
            $this->descriptors['deleteEvents']
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
        $this->errorStatsServiceStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
