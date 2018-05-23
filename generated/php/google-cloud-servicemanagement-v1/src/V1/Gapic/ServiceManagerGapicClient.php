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
 * https://github.com/google/googleapis/blob/master/google/api/servicemanagement/v1/servicemanager.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Api\Servicemanagement\V1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Api\Service;
use Google\Cloud\ServiceManagement\V1\ConfigSource;
use Google\Cloud\ServiceManagement\V1\CreateServiceConfigRequest;
use Google\Cloud\ServiceManagement\V1\CreateServiceRequest;
use Google\Cloud\ServiceManagement\V1\CreateServiceRolloutRequest;
use Google\Cloud\ServiceManagement\V1\DeleteServiceRequest;
use Google\Cloud\ServiceManagement\V1\DisableServiceRequest;
use Google\Cloud\ServiceManagement\V1\EnableServiceRequest;
use Google\Cloud\ServiceManagement\V1\GenerateConfigReportRequest;
use Google\Cloud\ServiceManagement\V1\GenerateConfigReportResponse;
use Google\Cloud\ServiceManagement\V1\GetServiceConfigRequest;
use Google\Cloud\ServiceManagement\V1\GetServiceRequest;
use Google\Cloud\ServiceManagement\V1\GetServiceRolloutRequest;
use Google\Cloud\ServiceManagement\V1\ListServiceConfigsRequest;
use Google\Cloud\ServiceManagement\V1\ListServiceConfigsResponse;
use Google\Cloud\ServiceManagement\V1\ListServiceRolloutsRequest;
use Google\Cloud\ServiceManagement\V1\ListServiceRolloutsResponse;
use Google\Cloud\ServiceManagement\V1\ListServicesRequest;
use Google\Cloud\ServiceManagement\V1\ListServicesResponse;
use Google\Cloud\ServiceManagement\V1\ManagedService;
use Google\Cloud\ServiceManagement\V1\Rollout;
use Google\Cloud\ServiceManagement\V1\SubmitConfigSourceRequest;
use Google\Cloud\ServiceManagement\V1\UndeleteServiceRequest;
use Google\LongRunning\Operation;
use Google\Protobuf\Any;

/**
 * Service Description: [Google Service Management API](https://cloud.google.com/service-management/overview).
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $serviceManagerClient = new ServiceManagerClient();
 * try {
 *
 *     // Iterate through all elements
 *     $pagedResponse = $serviceManagerClient->listServices();
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $serviceManagerClient->listServices();
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $serviceManagerClient->close();
 * }
 * ```
 *
 * @experimental
 */
class ServiceManagerGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.api.servicemanagement.v1.ServiceManager';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'servicemanagement.googleapis.com';

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
        'https://www.googleapis.com/auth/cloud-platform.read-only',
        'https://www.googleapis.com/auth/service.management',
        'https://www.googleapis.com/auth/service.management.readonly',
    ];

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/service_manager_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/service_manager_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/service_manager_rest_client_config.php',
                ],
            ],
            'versionFile' => __DIR__.'/../../../VERSION',
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
     *           as "<uri>:<port>". Default 'servicemanagement.googleapis.com:443'.
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
     *           See the {@see \Google\Cloud\ApiCore\Transport\GrpcTransport::build()} and
     *           {@see \Google\Cloud\ApiCore\Transport\RestTransport::build()} methods for the
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
     * Lists managed services.
     *
     * Returns all public services. For authenticated users, also returns all
     * services the calling user has "servicemanagement.services.get" permission
     * for.
     *
     * **BETA:** If the caller specifies the `consumer_id`, it returns only the
     * services enabled on the consumer. The `consumer_id` must have the format
     * of "project:{PROJECT-ID}".
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *
     *     // Iterate through all elements
     *     $pagedResponse = $serviceManagerClient->listServices();
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $serviceManagerClient->listServices();
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type string $producerProjectId
     *          Include services produced by the specified project.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type string $consumerId
     *          Include services consumed by the specified consumer.
     *
     *          The Google Service Management implementation accepts the following
     *          forms:
     *          - project:<project_id>
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
    public function listServices($optionalArgs = [])
    {
        $request = new ListServicesRequest();
        if (isset($optionalArgs['producerProjectId'])) {
            $request->setProducerProjectId($optionalArgs['producerProjectId']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['consumerId'])) {
            $request->setConsumerId($optionalArgs['consumerId']);
        }

        return $this->getPagedListResponse(
            'ListServices',
            $optionalArgs,
            ListServicesResponse::class,
            $request
        );
    }

    /**
     * Gets a managed service. Authentication is required unless the service is
     * public.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $response = $serviceManagerClient->getService($serviceName);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the `ServiceManager` overview for naming
     *                             requirements.  For example: `example.googleapis.com`.
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
     * @return \Google\Cloud\ServiceManagement\V1\ManagedService
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getService($serviceName, $optionalArgs = [])
    {
        $request = new GetServiceRequest();
        $request->setServiceName($serviceName);

        return $this->startCall(
            'GetService',
            ManagedService::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new managed service.
     * Please note one producer project can own no more than 20 services.
     *
     * Operation<response: ManagedService>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $service = new ManagedService();
     *     $response = $serviceManagerClient->createService($service);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param ManagedService $service      Initial values for the service resource.
     * @param array          $optionalArgs {
     *                                     Optional.
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
    public function createService($service, $optionalArgs = [])
    {
        $request = new CreateServiceRequest();
        $request->setService($service);

        return $this->startCall(
            'CreateService',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a managed service. This method will change the service to the
     * `Soft-Delete` state for 30 days. Within this period, service producers may
     * call [UndeleteService][google.api.servicemanagement.v1.ServiceManager.UndeleteService] to restore the service.
     * After 30 days, the service will be permanently deleted.
     *
     * Operation<response: google.protobuf.Empty>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $response = $serviceManagerClient->deleteService($serviceName);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements.  For example: `example.googleapis.com`.
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
    public function deleteService($serviceName, $optionalArgs = [])
    {
        $request = new DeleteServiceRequest();
        $request->setServiceName($serviceName);

        return $this->startCall(
            'DeleteService',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Revives a previously deleted managed service. The method restores the
     * service using the configuration at the time the service was deleted.
     * The target service must exist and must have been deleted within the
     * last 30 days.
     *
     * Operation<response: UndeleteServiceResponse>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $response = $serviceManagerClient->undeleteService($serviceName);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service. See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements. For example: `example.googleapis.com`.
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
    public function undeleteService($serviceName, $optionalArgs = [])
    {
        $request = new UndeleteServiceRequest();
        $request->setServiceName($serviceName);

        return $this->startCall(
            'UndeleteService',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists the history of the service configuration for a managed service,
     * from the newest to the oldest.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     // Iterate through all elements
     *     $pagedResponse = $serviceManagerClient->listServiceConfigs($serviceName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $serviceManagerClient->listServiceConfigs($serviceName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements.  For example: `example.googleapis.com`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
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
    public function listServiceConfigs($serviceName, $optionalArgs = [])
    {
        $request = new ListServiceConfigsRequest();
        $request->setServiceName($serviceName);
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }

        return $this->getPagedListResponse(
            'ListServiceConfigs',
            $optionalArgs,
            ListServiceConfigsResponse::class,
            $request
        );
    }

    /**
     * Gets a service configuration (version) for a managed service.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $configId = '';
     *     $response = $serviceManagerClient->getServiceConfig($serviceName, $configId);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements.  For example: `example.googleapis.com`.
     * @param string $configId     The id of the service configuration resource.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $view
     *          Specifies which parts of the Service Config should be returned in the
     *          response.
     *          For allowed values, use constants defined on {@see \Google\Cloud\ServiceManagement\V1\GetServiceConfigRequest_ConfigView}
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Api\Service
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getServiceConfig($serviceName, $configId, $optionalArgs = [])
    {
        $request = new GetServiceConfigRequest();
        $request->setServiceName($serviceName);
        $request->setConfigId($configId);
        if (isset($optionalArgs['view'])) {
            $request->setView($optionalArgs['view']);
        }

        return $this->startCall(
            'GetServiceConfig',
            Service::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new service configuration (version) for a managed service.
     * This method only stores the service configuration. To roll out the service
     * configuration to backend systems please call
     * [CreateServiceRollout][google.api.servicemanagement.v1.ServiceManager.CreateServiceRollout].
     *
     * Only the 100 most recent service configurations and ones referenced by
     * existing rollouts are kept for each service. The rest will be deleted
     * eventually.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $serviceConfig = new Service();
     *     $response = $serviceManagerClient->createServiceConfig($serviceName, $serviceConfig);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string  $serviceName   The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                               for naming requirements.  For example: `example.googleapis.com`.
     * @param Service $serviceConfig The service configuration resource.
     * @param array   $optionalArgs  {
     *                               Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Api\Service
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createServiceConfig($serviceName, $serviceConfig, $optionalArgs = [])
    {
        $request = new CreateServiceConfigRequest();
        $request->setServiceName($serviceName);
        $request->setServiceConfig($serviceConfig);

        return $this->startCall(
            'CreateServiceConfig',
            Service::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new service configuration (version) for a managed service based
     * on
     * user-supplied configuration source files (for example: OpenAPI
     * Specification). This method stores the source configurations as well as the
     * generated service configuration. To rollout the service configuration to
     * other services,
     * please call [CreateServiceRollout][google.api.servicemanagement.v1.ServiceManager.CreateServiceRollout].
     *
     * Only the 100 most recent configuration sources and ones referenced by
     * existing service configurtions are kept for each service. The rest will be
     * deleted eventually.
     *
     * Operation<response: SubmitConfigSourceResponse>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $configSource = new ConfigSource();
     *     $response = $serviceManagerClient->submitConfigSource($serviceName, $configSource);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string       $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                                   for naming requirements.  For example: `example.googleapis.com`.
     * @param ConfigSource $configSource The source configuration for the service.
     * @param array        $optionalArgs {
     *                                   Optional.
     *
     *     @type bool $validateOnly
     *          Optional. If set, this will result in the generation of a
     *          `google.api.Service` configuration based on the `ConfigSource` provided,
     *          but the generated config and the sources will NOT be persisted.
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
    public function submitConfigSource($serviceName, $configSource, $optionalArgs = [])
    {
        $request = new SubmitConfigSourceRequest();
        $request->setServiceName($serviceName);
        $request->setConfigSource($configSource);
        if (isset($optionalArgs['validateOnly'])) {
            $request->setValidateOnly($optionalArgs['validateOnly']);
        }

        return $this->startCall(
            'SubmitConfigSource',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists the history of the service configuration rollouts for a managed
     * service, from the newest to the oldest.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     // Iterate through all elements
     *     $pagedResponse = $serviceManagerClient->listServiceRollouts($serviceName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $serviceManagerClient->listServiceRollouts($serviceName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements.  For example: `example.googleapis.com`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $filter
     *          Use `filter` to return subset of rollouts.
     *          The following filters are supported:
     *            -- To limit the results to only those in
     *               [status](https://cloud.google.comgoogle.api.servicemanagement.v1.RolloutStatus) 'SUCCESS',
     *               use filter='status=SUCCESS'
     *            -- To limit the results to those in
     *               [status](https://cloud.google.comgoogle.api.servicemanagement.v1.RolloutStatus) 'CANCELLED'
     *               or 'FAILED', use filter='status=CANCELLED OR status=FAILED'
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
    public function listServiceRollouts($serviceName, $optionalArgs = [])
    {
        $request = new ListServiceRolloutsRequest();
        $request->setServiceName($serviceName);
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }

        return $this->getPagedListResponse(
            'ListServiceRollouts',
            $optionalArgs,
            ListServiceRolloutsResponse::class,
            $request
        );
    }

    /**
     * Gets a service configuration [rollout][google.api.servicemanagement.v1.Rollout].
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $rolloutId = '';
     *     $response = $serviceManagerClient->getServiceRollout($serviceName, $rolloutId);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                             for naming requirements.  For example: `example.googleapis.com`.
     * @param string $rolloutId    The id of the rollout resource.
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
     * @return \Google\Cloud\ServiceManagement\V1\Rollout
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getServiceRollout($serviceName, $rolloutId, $optionalArgs = [])
    {
        $request = new GetServiceRolloutRequest();
        $request->setServiceName($serviceName);
        $request->setRolloutId($rolloutId);

        return $this->startCall(
            'GetServiceRollout',
            Rollout::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new service configuration rollout. Based on rollout, the
     * Google Service Management will roll out the service configurations to
     * different backend services. For example, the logging configuration will be
     * pushed to Google Cloud Logging.
     *
     * Please note that any previous pending and running Rollouts and associated
     * Operations will be automatically cancelled so that the latest Rollout will
     * not be blocked by previous Rollouts.
     *
     * Only the 100 most recent (in any state) and the last 10 successful (if not
     * already part of the set of 100 most recent) rollouts are kept for each
     * service. The rest will be deleted eventually.
     *
     * Operation<response: Rollout>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $rollout = new Rollout();
     *     $response = $serviceManagerClient->createServiceRollout($serviceName, $rollout);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string  $serviceName  The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     *                              for naming requirements.  For example: `example.googleapis.com`.
     * @param Rollout $rollout      The rollout resource. The `service_name` field is output only.
     * @param array   $optionalArgs {
     *                              Optional.
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
    public function createServiceRollout($serviceName, $rollout, $optionalArgs = [])
    {
        $request = new CreateServiceRolloutRequest();
        $request->setServiceName($serviceName);
        $request->setRollout($rollout);

        return $this->startCall(
            'CreateServiceRollout',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Generates and returns a report (errors, warnings and changes from
     * existing configurations) associated with
     * GenerateConfigReportRequest.new_value.
     *
     * If GenerateConfigReportRequest.old_value is specified,
     * GenerateConfigReportRequest will contain a single ChangeReport based on the
     * comparison between GenerateConfigReportRequest.new_value and
     * GenerateConfigReportRequest.old_value.
     * If GenerateConfigReportRequest.old_value is not specified, this method
     * will compare GenerateConfigReportRequest.new_value with the last pushed
     * service configuration.
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $newConfig = new Any();
     *     $oldConfig = new Any();
     *     $response = $serviceManagerClient->generateConfigReport($newConfig, $oldConfig);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param Any   $newConfig    Service configuration for which we want to generate the report.
     *                            For this version of API, the supported types are
     *                            [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
     *                            [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
     *                            and [google.api.Service][google.api.Service]
     * @param Any   $oldConfig    Service configuration against which the comparison will be done.
     *                            For this version of API, the supported types are
     *                            [google.api.servicemanagement.v1.ConfigRef][google.api.servicemanagement.v1.ConfigRef],
     *                            [google.api.servicemanagement.v1.ConfigSource][google.api.servicemanagement.v1.ConfigSource],
     *                            and [google.api.Service][google.api.Service]
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ServiceManagement\V1\GenerateConfigReportResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function generateConfigReport($newConfig, $oldConfig, $optionalArgs = [])
    {
        $request = new GenerateConfigReportRequest();
        $request->setNewConfig($newConfig);
        $request->setOldConfig($oldConfig);

        return $this->startCall(
            'GenerateConfigReport',
            GenerateConfigReportResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Enables a [service][google.api.servicemanagement.v1.ManagedService] for a project, so it can be used
     * for the project. See
     * [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
     * more information.
     *
     * Operation<response: EnableServiceResponse>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $consumerId = '';
     *     $response = $serviceManagerClient->enableService($serviceName, $consumerId);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName Name of the service to enable. Specifying an unknown service name will
     *                            cause the request to fail.
     * @param string $consumerId  The identity of consumer resource which service enablement will be
     *                            applied to.
     *
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:<project_id>"
     *
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * @param array $optionalArgs {
     *                            Optional.
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
    public function enableService($serviceName, $consumerId, $optionalArgs = [])
    {
        $request = new EnableServiceRequest();
        $request->setServiceName($serviceName);
        $request->setConsumerId($consumerId);

        return $this->startCall(
            'EnableService',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Disables a [service][google.api.servicemanagement.v1.ManagedService] for a project, so it can no longer be
     * be used for the project. It prevents accidental usage that may cause
     * unexpected billing charges or security leaks.
     *
     * Operation<response: DisableServiceResponse>
     *
     * Sample code:
     * ```
     * $serviceManagerClient = new ServiceManagerClient();
     * try {
     *     $serviceName = '';
     *     $consumerId = '';
     *     $response = $serviceManagerClient->disableService($serviceName, $consumerId);
     * } finally {
     *     $serviceManagerClient->close();
     * }
     * ```
     *
     * @param string $serviceName Name of the service to disable. Specifying an unknown service name
     *                            will cause the request to fail.
     * @param string $consumerId  The identity of consumer resource which service disablement will be
     *                            applied to.
     *
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:<project_id>"
     *
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * @param array $optionalArgs {
     *                            Optional.
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
    public function disableService($serviceName, $consumerId, $optionalArgs = [])
    {
        $request = new DisableServiceRequest();
        $request->setServiceName($serviceName);
        $request->setConsumerId($consumerId);

        return $this->startCall(
            'DisableService',
            Operation::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
