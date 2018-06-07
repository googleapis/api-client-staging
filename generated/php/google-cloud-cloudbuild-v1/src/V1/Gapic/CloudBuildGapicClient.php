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
 * https://github.com/google/googleapis/blob/master/google/devtools/cloudbuild/v1/cloudbuild.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Devtools\Cloudbuild\V1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Devtools\Cloudbuild\V1\Build;
use Google\Devtools\Cloudbuild\V1\BuildTrigger;
use Google\Devtools\Cloudbuild\V1\CancelBuildRequest;
use Google\Devtools\Cloudbuild\V1\CreateBuildRequest;
use Google\Devtools\Cloudbuild\V1\CreateBuildTriggerRequest;
use Google\Devtools\Cloudbuild\V1\DeleteBuildTriggerRequest;
use Google\Devtools\Cloudbuild\V1\GetBuildRequest;
use Google\Devtools\Cloudbuild\V1\GetBuildTriggerRequest;
use Google\Devtools\Cloudbuild\V1\ListBuildTriggersRequest;
use Google\Devtools\Cloudbuild\V1\ListBuildTriggersResponse;
use Google\Devtools\Cloudbuild\V1\ListBuildsRequest;
use Google\Devtools\Cloudbuild\V1\ListBuildsResponse;
use Google\Devtools\Cloudbuild\V1\RepoSource;
use Google\Devtools\Cloudbuild\V1\RetryBuildRequest;
use Google\Devtools\Cloudbuild\V1\RunBuildTriggerRequest;
use Google\Devtools\Cloudbuild\V1\UpdateBuildTriggerRequest;
use Google\LongRunning\Operation;
use Google\Protobuf\GPBEmpty;

/**
 * Service Description: Manages build requests on Google Cloud Platform.
 *
 * The main concept used by this API is a `Build`, which describes the location
 * of the source to build, how to build the source, and where to store the
 * built artifacts, if any.
 *
 * A user can list previously-requested builds or get builds by their ID to
 * determine the status of the build.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $cloudBuildClient = new CloudBuildClient();
 * try {
 *     $projectId = '';
 *     $build = new Build();
 *     $response = $cloudBuildClient->createBuild($projectId, $build);
 * } finally {
 *     $cloudBuildClient->close();
 * }
 * ```
 *
 * @experimental
 */
class CloudBuildGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.cloudbuild.v1.CloudBuild';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'cloudbuild.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The default scopes required by the service.
     */
    public static $serviceScopes = [
        'https://www.googleapis.com/auth/cloud-platform',
    ];

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/cloud_build_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/cloud_build_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/cloud_build_rest_client_config.php',
                ],
            ],
        ];
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress
     *           The address of the API remote host. May optionally include the port, formatted
     *           as "<uri>:<port>". Default 'cloudbuild.googleapis.com:443'.
     *     @type string|array|FetchAuthTokenInterface|CredentialsWrapper $credentials
     *           The credentials to be used by the client to authorize API calls. This option
     *           accepts either a path to a credentials file, or a decoded credentials file as a
     *           PHP array.
     *           *Advanced usage*: In addition, this option can also accept a pre-constructed
     *           {@see \Google\Auth\FetchAuthTokenInterface} object or
     *           {@see \Google\ApiCore\CredentialsWrapper} object. Note that when one of these
     *           objects are provided, any settings in $credentialsConfig will be ignored.
     *     @type array $credentialsConfig
     *           Options used to configure credentials, including auth token caching, for the client.
     *           For a full list of supporting configuration options, see
     *           {@see \Google\ApiCore\CredentialsWrapper::build()}.
     *     @type bool $disableRetries
     *           Determines whether or not retries defined by the client configuration should be
     *           disabled. Defaults to `false`.
     *     @type string|array $clientConfig
     *           Client method configuration, including retry settings. This option can be either a
     *           path to a JSON file, or a PHP array containing the decoded JSON data.
     *           By default this settings points to the default client config file, which is provided
     *           in the resources folder.
     *     @type string|TransportInterface $transport
     *           The transport used for executing network requests. May be either the string `rest`
     *           or `grpc`. Defaults to `grpc` if gRPC support is detected on the system.
     *           *Advanced usage*: Additionally, it is possible to pass in an already instantiated
     *           {@see \Google\ApiCore\Transport\TransportInterface} object. Note that when this
     *           object is provided, any settings in $transportConfig, and any $serviceAddress
     *           setting, will be ignored.
     *     @type array $transportConfig
     *           Configuration options that will be used to construct the transport. Options for
     *           each supported transport type should be passed in a key for that transport. For
     *           example:
     *           $transportConfig = [
     *               'grpc' => [...],
     *               'rest' => [...]
     *           ];
     *           See the {@see \Google\ApiCore\Transport\GrpcTransport::build()} and
     *           {@see \Google\ApiCore\Transport\RestTransport::build()} methods for the
     *           supported options.
     * }
     *
     * @throws ValidationException
     * @experimental
     */
    public function __construct($options = [])
    {
        $clientOptions = $this->buildClientOptions($options);
        $this->setClientOptions($clientOptions);
    }

    /**
     * Starts a build with the specified configuration.
     *
     * This method returns a long-running `Operation`, which includes the build
     * ID. Pass the build ID to `GetBuild` to determine the build status (such as
     * `SUCCESS` or `FAILURE`).
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $build = new Build();
     *     $response = $cloudBuildClient->createBuild($projectId, $build);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project.
     * @param Build  $build        Build resource to create.
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
     * @return \Google\LongRunning\Operation
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createBuild($projectId, $build, $optionalArgs = [])
    {
        $request = new CreateBuildRequest();
        $request->setProjectId($projectId);
        $request->setBuild($build);

        return $this->startCall(
            'CreateBuild',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns information about a previously requested build.
     *
     * The `Build` that is returned includes its status (such as `SUCCESS`,
     * `FAILURE`, or `WORKING`), and timing information.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $id = '';
     *     $response = $cloudBuildClient->getBuild($projectId, $id);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project.
     * @param string $id           ID of the build.
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
     * @return \Google\Devtools\Cloudbuild\V1\Build
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getBuild($projectId, $id, $optionalArgs = [])
    {
        $request = new GetBuildRequest();
        $request->setProjectId($projectId);
        $request->setId($id);

        return $this->startCall(
            'GetBuild',
            Build::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists previously requested builds.
     *
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     // Iterate through all elements
     *     $pagedResponse = $cloudBuildClient->listBuilds($projectId);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $cloudBuildClient->listBuilds($projectId);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type string $filter
     *          The raw filter text to constrain the results.
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
    public function listBuilds($projectId, $optionalArgs = [])
    {
        $request = new ListBuildsRequest();
        $request->setProjectId($projectId);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }

        return $this->getPagedListResponse(
            'ListBuilds',
            $optionalArgs,
            ListBuildsResponse::class,
            $request
        );
    }

    /**
     * Cancels a build in progress.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $id = '';
     *     $response = $cloudBuildClient->cancelBuild($projectId, $id);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project.
     * @param string $id           ID of the build.
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
     * @return \Google\Devtools\Cloudbuild\V1\Build
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function cancelBuild($projectId, $id, $optionalArgs = [])
    {
        $request = new CancelBuildRequest();
        $request->setProjectId($projectId);
        $request->setId($id);

        return $this->startCall(
            'CancelBuild',
            Build::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new `BuildTrigger`.
     *
     * This API is experimental.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $trigger = new BuildTrigger();
     *     $response = $cloudBuildClient->createBuildTrigger($projectId, $trigger);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string       $projectId    ID of the project for which to configure automatic builds.
     * @param BuildTrigger $trigger      `BuildTrigger` to create.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Cloudbuild\V1\BuildTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createBuildTrigger($projectId, $trigger, $optionalArgs = [])
    {
        $request = new CreateBuildTriggerRequest();
        $request->setProjectId($projectId);
        $request->setTrigger($trigger);

        return $this->startCall(
            'CreateBuildTrigger',
            BuildTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns information about a `BuildTrigger`.
     *
     * This API is experimental.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $triggerId = '';
     *     $response = $cloudBuildClient->getBuildTrigger($projectId, $triggerId);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project that owns the trigger.
     * @param string $triggerId    ID of the `BuildTrigger` to get.
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
     * @return \Google\Devtools\Cloudbuild\V1\BuildTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getBuildTrigger($projectId, $triggerId, $optionalArgs = [])
    {
        $request = new GetBuildTriggerRequest();
        $request->setProjectId($projectId);
        $request->setTriggerId($triggerId);

        return $this->startCall(
            'GetBuildTrigger',
            BuildTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists existing `BuildTrigger`s.
     *
     * This API is experimental.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $response = $cloudBuildClient->listBuildTriggers($projectId);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project for which to list BuildTriggers.
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
     * @return \Google\Devtools\Cloudbuild\V1\ListBuildTriggersResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listBuildTriggers($projectId, $optionalArgs = [])
    {
        $request = new ListBuildTriggersRequest();
        $request->setProjectId($projectId);

        return $this->startCall(
            'ListBuildTriggers',
            ListBuildTriggersResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a `BuildTrigger` by its project ID and trigger ID.
     *
     * This API is experimental.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $triggerId = '';
     *     $cloudBuildClient->deleteBuildTrigger($projectId, $triggerId);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project that owns the trigger.
     * @param string $triggerId    ID of the `BuildTrigger` to delete.
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
    public function deleteBuildTrigger($projectId, $triggerId, $optionalArgs = [])
    {
        $request = new DeleteBuildTriggerRequest();
        $request->setProjectId($projectId);
        $request->setTriggerId($triggerId);

        return $this->startCall(
            'DeleteBuildTrigger',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates a `BuildTrigger` by its project ID and trigger ID.
     *
     * This API is experimental.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $triggerId = '';
     *     $trigger = new BuildTrigger();
     *     $response = $cloudBuildClient->updateBuildTrigger($projectId, $triggerId, $trigger);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string       $projectId    ID of the project that owns the trigger.
     * @param string       $triggerId    ID of the `BuildTrigger` to update.
     * @param BuildTrigger $trigger      `BuildTrigger` to update.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Cloudbuild\V1\BuildTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateBuildTrigger($projectId, $triggerId, $trigger, $optionalArgs = [])
    {
        $request = new UpdateBuildTriggerRequest();
        $request->setProjectId($projectId);
        $request->setTriggerId($triggerId);
        $request->setTrigger($trigger);

        return $this->startCall(
            'UpdateBuildTrigger',
            BuildTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Runs a `BuildTrigger` at a particular source revision.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $triggerId = '';
     *     $source = new RepoSource();
     *     $response = $cloudBuildClient->runBuildTrigger($projectId, $triggerId, $source);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string     $projectId    ID of the project.
     * @param string     $triggerId    ID of the trigger.
     * @param RepoSource $source       Source to build against this trigger.
     * @param array      $optionalArgs {
     *                                 Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\LongRunning\Operation
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function runBuildTrigger($projectId, $triggerId, $source, $optionalArgs = [])
    {
        $request = new RunBuildTriggerRequest();
        $request->setProjectId($projectId);
        $request->setTriggerId($triggerId);
        $request->setSource($source);

        return $this->startCall(
            'RunBuildTrigger',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new build based on the specified build.
     *
     * This method creates a new build using the original build request, which may
     * or may not result in an identical build.
     *
     * For triggered builds:
     *
     * * Triggered builds resolve to a precise revision; therefore a retry of a
     * triggered build will result in a build that uses the same revision.
     *
     * For non-triggered builds that specify `RepoSource`:
     *
     * * If the original build built from the tip of a branch, the retried build
     * will build from the tip of that branch, which may not be the same revision
     * as the original build.
     * * If the original build specified a commit sha or revision ID, the retried
     * build will use the identical source.
     *
     * For builds that specify `StorageSource`:
     *
     * * If the original build pulled source from Google Cloud Storage without
     * specifying the generation of the object, the new build will use the current
     * object, which may be different from the original build source.
     * * If the original build pulled source from Cloud Storage and specified the
     * generation of the object, the new build will attempt to use the same
     * object, which may or may not be available depending on the bucket's
     * lifecycle management settings.
     *
     * Sample code:
     * ```
     * $cloudBuildClient = new CloudBuildClient();
     * try {
     *     $projectId = '';
     *     $id = '';
     *     $response = $cloudBuildClient->retryBuild($projectId, $id);
     * } finally {
     *     $cloudBuildClient->close();
     * }
     * ```
     *
     * @param string $projectId    ID of the project.
     * @param string $id           Build ID of the original build.
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
     * @return \Google\LongRunning\Operation
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function retryBuild($projectId, $id, $optionalArgs = [])
    {
        $request = new RetryBuildRequest();
        $request->setProjectId($projectId);
        $request->setId($id);

        return $this->startCall(
            'RetryBuild',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
