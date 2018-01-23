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
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\ErrorReporting\V1beta1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\Call;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Auth\CredentialsLoader;
use Google\Cloud\ErrorReporting\V1beta1\DeleteEventsRequest;
use Google\Cloud\ErrorReporting\V1beta1\DeleteEventsResponse;
use Google\Cloud\ErrorReporting\V1beta1\ListEventsRequest;
use Google\Cloud\ErrorReporting\V1beta1\ListEventsResponse;
use Google\Cloud\ErrorReporting\V1beta1\ListGroupStatsRequest;
use Google\Cloud\ErrorReporting\V1beta1\ListGroupStatsResponse;
use Google\Cloud\ErrorReporting\V1beta1\QueryTimeRange;
use Google\Cloud\ErrorReporting\V1beta1\ServiceContextFilter;
use Google\Protobuf\Duration;
use Google\Protobuf\Timestamp;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: An API for retrieving and managing error statistics as well as data for
 * individual events.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $errorStatsServiceClient = new ErrorStatsServiceClient();
 * try {
 *     $formattedProjectName = $errorStatsServiceClient->projectName('[PROJECT]');
 *     $timeRange = new QueryTimeRange();
 *     // Iterate through all elements
 *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
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
 * a parseName method to extract the individual identifiers contained within formatted names
 * that are returned by the API.
 *
 * @experimental
 */
class ErrorStatsServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.clouderrorreporting.v1beta1.ErrorStatsService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The code generator version, to be included in the agent header.
     */
    const CODEGEN_VERSION = '0.0.5';

    private static $projectNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
            ],
            'clientConfigPath' => __DIR__.'/../resources/error_stats_service_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/error_stats_service_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/error_stats_service_descriptor_config.php',
            'versionFile' => __DIR__.'/../../VERSION',
        ];
    }

    private static function getProjectNameTemplate()
    {
        if (self::$projectNameTemplate == null) {
            self::$projectNameTemplate = new PathTemplate('projects/{project}');
        }

        return self::$projectNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'project' => self::getProjectNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project resource.
     *
     * @param string $project
     *
     * @return string The formatted project resource.
     * @experimental
     */
    public static function projectName($project)
    {
        return self::getProjectNameTemplate()->render([
            'project' => $project,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - project: projects/{project}.
     *
     * The optional $template argument can be supplied to specify a particular pattern, and must
     * match one of the templates listed above. If no $template argument is provided, or if the
     * $template argument does not match one of the templates listed, then parseName will check
     * each of the supported templates, and return the first match.
     *
     * @param string $formattedName The formatted name string
     * @param string $template      Optional name of template to match
     *
     * @return array An associative array from name component IDs to component values.
     *
     * @throws ValidationException If $formattedName could not be matched.
     * @experimental
     */
    public static function parseName($formattedName, $template = null)
    {
        $templateMap = self::getPathTemplateMap();

        if ($template) {
            if (!isset($templateMap[$template])) {
                throw new ValidationException("Template name $template does not exist");
            }

            return $templateMap[$template]->match($formattedName);
        }

        foreach ($templateMap as $templateName => $pathTemplate) {
            try {
                return $pathTemplate->match($formattedName);
            } catch (ValidationException $ex) {
                // Swallow the exception to continue trying other path templates
            }
        }
        throw new ValidationException("Input did not match any known format. Input: $formattedName");
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'clouderrorreporting.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type Channel $channel
     *           A `Channel` object. If not specified, a channel will be constructed.
     *           NOTE: This option is only valid when utilizing the gRPC transport.
     *     @type ChannelCredentials $sslCreds
     *           A `ChannelCredentials` object for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl().
     *           NOTE: This option is only valid when utilizing the gRPC transport. Also, if the $channel
     *           optional argument is specified, then this argument is unused.
     *     @type bool $forceNewChannel
     *           If true, this forces gRPC to create a new channel instead of using a persistent channel.
     *           Defaults to false.
     *           NOTE: This option is only valid when utilizing the gRPC transport. Also, if the $channel
     *           optional argument is specified, then this option is unused.
     *     @type CredentialsLoader $credentialsLoader
     *           A CredentialsLoader object created using the Google\Auth library.
     *     @type string[] $scopes A string array of scopes to use when acquiring credentials.
     *                          Defaults to the scopes for the Stackdriver Error Reporting API.
     *     @type string $clientConfigPath
     *           Path to a JSON file containing client method configuration, including retry settings.
     *           Specify this setting to specify the retry behavior of all methods on the client.
     *           By default this settings points to the default client config file, which is provided
     *           in the resources folder. The retry settings provided in this option can be overridden
     *           by settings in $retryingOverride
     *     @type array $retryingOverride
     *           An associative array in which the keys are method names (e.g. 'createFoo'), and
     *           the values are retry settings to use for that method. The retry settings for each
     *           method can be a {@see Google\ApiCore\RetrySettings} object, or an associative array
     *           of retry settings parameters. See the documentation on {@see Google\ApiCore\RetrySettings}
     *           for example usage. Passing a value of null is equivalent to a value of
     *           ['retriesEnabled' => false]. Retry settings provided in this setting override the
     *           settings in $clientConfigPath.
     *     @type callable $authHttpHandler A handler used to deliver PSR-7 requests specifically
     *           for authentication. Should match a signature of
     *           `function (RequestInterface $request, array $options) : ResponseInterface`.
     *     @type callable $httpHandler A handler used to deliver PSR-7 requests. Should match a
     *           signature of `function (RequestInterface $request, array $options) : PromiseInterface`.
     *           NOTE: This option is only valid when utilizing the REST transport.
     *     @type string|TransportInterface $transport The transport used for executing network
     *           requests. May be either the string `rest` or `grpc`. Additionally, it is possible
     *           to pass in an already instantiated transport. Defaults to `grpc` if gRPC support is
     *           detected on the system.
     * }
     * @experimental
     */
    public function __construct($options = [])
    {
        $this->setClientOptions($options + self::getClientDefaults());
    }

    /**
     * Lists the specified groups.
     *
     * Sample code:
     * ```
     * $errorStatsServiceClient = new ErrorStatsServiceClient();
     * try {
     *     $formattedProjectName = $errorStatsServiceClient->projectName('[PROJECT]');
     *     $timeRange = new QueryTimeRange();
     *     // Iterate through all elements
     *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $errorStatsServiceClient->listGroupStats($formattedProjectName, $timeRange);
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
     *     @type int $alignment
     *          [Optional] The alignment of the timed counts to be returned.
     *          Default is `ALIGNMENT_EQUAL_AT_END`.
     *          For allowed values, use constants defined on {@see \Google\Cloud\ErrorReporting\V1beta1\TimedCountAlignment}
     *     @type Timestamp $alignmentTime
     *          [Optional] Time where the timed counts shall be aligned if rounded
     *          alignment is chosen. Default is 00:00 UTC.
     *     @type int $order
     *          [Optional] The sort order in which the results are returned.
     *          Default is `COUNT_DESC`.
     *          For allowed values, use constants defined on {@see \Google\Cloud\ErrorReporting\V1beta1\ErrorGroupOrder}
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listGroupStats($projectName, $timeRange, $optionalArgs = [])
    {
        $request = new ListGroupStatsRequest();
        $request->setProjectName($projectName);
        $request->setTimeRange($timeRange);
        if (isset($optionalArgs['groupId'])) {
            $request->setGroupId($optionalArgs['groupId']);
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

        return $this->getPagedListResponse(
            'ListGroupStats',
            $optionalArgs,
            ListGroupStatsResponse::class,
            $request
        );
    }

    /**
     * Lists the specified events.
     *
     * Sample code:
     * ```
     * $errorStatsServiceClient = new ErrorStatsServiceClient();
     * try {
     *     $formattedProjectName = $errorStatsServiceClient->projectName('[PROJECT]');
     *     $groupId = '';
     *     // Iterate through all elements
     *     $pagedResponse = $errorStatsServiceClient->listEvents($formattedProjectName, $groupId);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $errorStatsServiceClient->listEvents($formattedProjectName, $groupId);
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
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

        return $this->getPagedListResponse(
            'ListEvents',
            $optionalArgs,
            ListEventsResponse::class,
            $request
        );
    }

    /**
     * Deletes all error events of a given project.
     *
     * Sample code:
     * ```
     * $errorStatsServiceClient = new ErrorStatsServiceClient();
     * try {
     *     $formattedProjectName = $errorStatsServiceClient->projectName('[PROJECT]');
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ErrorReporting\V1beta1\DeleteEventsResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteEvents($projectName, $optionalArgs = [])
    {
        $request = new DeleteEventsRequest();
        $request->setProjectName($projectName);

        return $this->startCall(
            'DeleteEvents',
            DeleteEventsResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
