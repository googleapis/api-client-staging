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
 * https://github.com/google/googleapis/blob/master/google/devtools/cloudtrace/v1/trace.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Trace\V1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\Call;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\Auth\CredentialsLoader;
use Google\Cloud\Trace\V1\GetTraceRequest;
use Google\Cloud\Trace\V1\ListTracesRequest;
use Google\Cloud\Trace\V1\ListTracesResponse;
use Google\Cloud\Trace\V1\PatchTracesRequest;
use Google\Cloud\Trace\V1\Trace;
use Google\Cloud\Trace\V1\Traces;
use Google\Protobuf\GPBEmpty;
use Google\Protobuf\Timestamp;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: This file describes an API for collecting and viewing traces and spans
 * within a trace.  A Trace is a collection of spans corresponding to a single
 * operation or set of operations for an application. A span is an individual
 * timed event which forms a node of the trace tree. Spans for a single trace
 * may span multiple services.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $traceServiceClient = new TraceServiceClient();
 * try {
 *     $projectId = '';
 *     $traces = new Traces();
 *     $traceServiceClient->patchTraces($projectId, $traces);
 * } finally {
 *     $traceServiceClient->close();
 * }
 * ```
 *
 * @experimental
 */
class TraceServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.cloudtrace.v1.TraceService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'cloudtrace.googleapis.com';

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

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
                'https://www.googleapis.com/auth/trace.append',
                'https://www.googleapis.com/auth/trace.readonly',
            ],
            'clientConfigPath' => __DIR__.'/../resources/trace_service_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/trace_service_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/trace_service_descriptor_config.php',
            'versionFile' => __DIR__.'/../../VERSION',
        ];
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'cloudtrace.googleapis.com'.
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
     *                          Defaults to the scopes for the Stackdriver Trace API.
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
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
     * of a trace that you send matches that of an existing trace, any fields
     * in the existing trace and its spans are overwritten by the provided values,
     * and any new fields provided are merged with the existing trace data. If the
     * ID does not match, a new trace is created.
     *
     * Sample code:
     * ```
     * $traceServiceClient = new TraceServiceClient();
     * try {
     *     $projectId = '';
     *     $traces = new Traces();
     *     $traceServiceClient->patchTraces($projectId, $traces);
     * } finally {
     *     $traceServiceClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the Cloud project where the trace data is stored.
     * @param Traces $traces       The body of the message.
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
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function patchTraces($projectId, $traces, $optionalArgs = [])
    {
        $request = new PatchTracesRequest();
        $request->setProjectId($projectId);
        $request->setTraces($traces);

        return $this->startCall(
            'PatchTraces',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets a single trace by its ID.
     *
     * Sample code:
     * ```
     * $traceServiceClient = new TraceServiceClient();
     * try {
     *     $projectId = '';
     *     $traceId = '';
     *     $response = $traceServiceClient->getTrace($projectId, $traceId);
     * } finally {
     *     $traceServiceClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the Cloud project where the trace data is stored.
     * @param string $traceId      ID of the trace to return.
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
     * @return \Google\Cloud\Trace\V1\Trace
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getTrace($projectId, $traceId, $optionalArgs = [])
    {
        $request = new GetTraceRequest();
        $request->setProjectId($projectId);
        $request->setTraceId($traceId);

        return $this->startCall(
            'GetTrace',
            Trace::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns of a list of traces that match the specified filter conditions.
     *
     * Sample code:
     * ```
     * $traceServiceClient = new TraceServiceClient();
     * try {
     *     $projectId = '';
     *     // Iterate through all elements
     *     $pagedResponse = $traceServiceClient->listTraces($projectId);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $traceServiceClient->listTraces($projectId);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $traceServiceClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the Cloud project where the trace data is stored.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $view
     *          Type of data returned for traces in the list. Optional. Default is
     *          `MINIMAL`.
     *          For allowed values, use constants defined on {@see \Google\Cloud\Trace\V1\ListTracesRequest_ViewType}
     *     @type int $pageSize
     *          Maximum number of traces to return. If not specified or <= 0, the
     *          implementation selects a reasonable value.  The implementation may
     *          return fewer traces than the requested page size. Optional.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type Timestamp $startTime
     *          Start of the time interval (inclusive) during which the trace data was
     *          collected from the application.
     *     @type Timestamp $endTime
     *          End of the time interval (inclusive) during which the trace data was
     *          collected from the application.
     *     @type string $filter
     *          An optional filter against labels for the request.
     *
     *          By default, searches use prefix matching. To specify exact match, prepend
     *          a plus symbol (`+`) to the search term.
     *          Multiple terms are ANDed. Syntax:
     *
     *          *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root
     *              span starts with `NAME_PREFIX`.
     *          *   `+root:NAME` or `+NAME`: Return traces where any root span's name is
     *              exactly `NAME`.
     *          *   `span:NAME_PREFIX`: Return traces where any span starts with
     *              `NAME_PREFIX`.
     *          *   `+span:NAME`: Return traces where any span's name is exactly
     *              `NAME`.
     *          *   `latency:DURATION`: Return traces whose overall latency is
     *              greater or equal to than `DURATION`. Accepted units are nanoseconds
     *              (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For
     *              example, `latency:24ms` returns traces whose overall latency
     *              is greater than or equal to 24 milliseconds.
     *          *   `label:LABEL_KEY`: Return all traces containing the specified
     *              label key (exact match, case-sensitive) regardless of the key:value
     *              pair's value (including empty values).
     *          *   `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified
     *              label key (exact match, case-sensitive) whose value starts with
     *              `VALUE_PREFIX`. Both a key and a value must be specified.
     *          *   `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair
     *              exactly matching the specified text. Both a key and a value must be
     *              specified.
     *          *   `method:VALUE`: Equivalent to `/http/method:VALUE`.
     *          *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
     *     @type string $orderBy
     *          Field used to sort the returned traces. Optional.
     *          Can be one of the following:
     *
     *          *   `trace_id`
     *          *   `name` (`name` field of root span in the trace)
     *          *   `duration` (difference between `end_time` and `start_time` fields of
     *               the root span)
     *          *   `start` (`start_time` field of the root span)
     *
     *          Descending order can be specified by appending `desc` to the sort field
     *          (for example, `name desc`).
     *
     *          Only one sort field is permitted.
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
    public function listTraces($projectId, $optionalArgs = [])
    {
        $request = new ListTracesRequest();
        $request->setProjectId($projectId);
        if (isset($optionalArgs['view'])) {
            $request->setView($optionalArgs['view']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['startTime'])) {
            $request->setStartTime($optionalArgs['startTime']);
        }
        if (isset($optionalArgs['endTime'])) {
            $request->setEndTime($optionalArgs['endTime']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['orderBy'])) {
            $request->setOrderBy($optionalArgs['orderBy']);
        }

        return $this->getPagedListResponse(
            'ListTraces',
            $optionalArgs,
            ListTracesResponse::class,
            $request
        );
    }
}
