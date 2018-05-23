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
 * https://github.com/google/googleapis/blob/master/google/home/graph/v1/homegraph.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Home\Graph\V1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Home\Graph\V1\DeleteAgentUserRequest;
use Google\Home\Graph\V1\ReportStateAndNotificationRequest;
use Google\Home\Graph\V1\ReportStateAndNotificationResponse;
use Google\Home\Graph\V1\RequestSyncDevicesRequest;
use Google\Home\Graph\V1\RequestSyncDevicesResponse;
use Google\Home\Graph\V1\StateAndNotificationPayload;
use Google\Protobuf\GPBEmpty;

/**
 * Service Description: Google HomeGraph API. HomeGraph Service provides the support for storing
 * and querying first-party and third-party devices, rooms and structures,
 * the relationships among them and their state in the home. It stores
 * entities and their relationships in the home.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $homeGraphApiServiceClient = new HomeGraphApiServiceClient();
 * try {
 *     $agentUserId = '';
 *     $response = $homeGraphApiServiceClient->requestSyncDevices($agentUserId);
 * } finally {
 *     $homeGraphApiServiceClient->close();
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
class HomeGraphApiServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.home.graph.v1.HomeGraphApiService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'homegraph.googleapis.com';

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
    ];
    private static $agentUserPathNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/home_graph_api_service_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/home_graph_api_service_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/home_graph_api_service_rest_client_config.php',
                ],
            ],
            'versionFile' => __DIR__.'/../../../VERSION',
        ];
    }

    private static function getAgentUserPathNameTemplate()
    {
        if (self::$agentUserPathNameTemplate == null) {
            self::$agentUserPathNameTemplate = new PathTemplate('agentUsers/{agent_user_path=**}');
        }

        return self::$agentUserPathNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'agentUserPath' => self::getAgentUserPathNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a agent_user_path resource.
     *
     * @param string $agentUserPath
     *
     * @return string The formatted agent_user_path resource.
     * @experimental
     */
    public static function agentUserPathName($agentUserPath)
    {
        return self::getAgentUserPathNameTemplate()->render([
            'agent_user_path' => $agentUserPath,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - agentUserPath: agentUsers/{agent_user_path=**}.
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
     *     @type string $serviceAddress
     *           The address of the API remote host. May optionally include the port, formatted
     *           as "<uri>:<port>". Default 'homegraph.googleapis.com:443'.
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
     * Requests a Sync call from Google to a 3p partner's home control agent for
     * a user.
     *
     *
     * Third-party user's identity is passed in as agent_user_id.
     * (see [RequestSyncDevicesRequest][google.home.graph.v1.RequestSyncDevicesRequest]) and forwarded back to the agent.
     * Agent is identified by the API key or JWT signed by the partner's service
     * account.
     *
     * Sample code:
     * ```
     * $homeGraphApiServiceClient = new HomeGraphApiServiceClient();
     * try {
     *     $agentUserId = '';
     *     $response = $homeGraphApiServiceClient->requestSyncDevices($agentUserId);
     * } finally {
     *     $homeGraphApiServiceClient->close();
     * }
     * ```
     *
     * @param string $agentUserId  Required. Third-party user id issued by agent's third-party identity
     *                             provider.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type bool $async
     *          Optional. If set, the request will be added to a queue and a response will
     *          be returned immediately. The queue allows for de-duplication of
     *          simultaneous requests.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Home\Graph\V1\RequestSyncDevicesResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function requestSyncDevices($agentUserId, $optionalArgs = [])
    {
        $request = new RequestSyncDevicesRequest();
        $request->setAgentUserId($agentUserId);
        if (isset($optionalArgs['async'])) {
            $request->setAsync($optionalArgs['async']);
        }

        return $this->startCall(
            'RequestSyncDevices',
            RequestSyncDevicesResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Reports device state and optionally sends device notifications. Called by
     * an agent when the device state of a third-party changes or the agent wants
     * to send a notification about the device.
     * This method updates a predefined set of States for a device, which all
     * devices have (for example a light will have OnOff, Color, Brightness).
     * A new State may not be created and an INVALID_ARGUMENT code will be thrown
     * if so. It also optionally takes in a list of Notifications that may be
     * created, which are associated to this State change.
     *
     * Third-party user's identity is passed in as agent_user_id.
     * Agent is identified by the JWT signed by the partner's service account.
     *
     * Sample code:
     * ```
     * $homeGraphApiServiceClient = new HomeGraphApiServiceClient();
     * try {
     *     $agentUserId = '';
     *     $payload = new StateAndNotificationPayload();
     *     $response = $homeGraphApiServiceClient->reportStateAndNotification($agentUserId, $payload);
     * } finally {
     *     $homeGraphApiServiceClient->close();
     * }
     * ```
     *
     * @param string                      $agentUserId  Required. Third-party user id.
     * @param StateAndNotificationPayload $payload      State of devices to update and notification metadata for devices. For
     *                                                  example, if a user turns a light on manually, a State update should be
     *                                                  sent so that the information is always the current status of the device.
     *                                                  Notifications are independent from the state and its piece of the payload
     *                                                  should contain everything necessary to notify the user. Although it may be
     *                                                  related to a state change, it does not need to be. For example, if a
     *                                                  device can turn on/off and change temperature, the states reported would
     *                                                  include both "on" and "70 degrees" but the 3p may choose not to send any
     *                                                  notification for that, or to only say that the "the room is heating up",
     *                                                  keeping state and notification independent.
     * @param array                       $optionalArgs {
     *                                                  Optional.
     *
     *     @type string $requestId
     *          Request id used for debugging.
     *     @type string $eventId
     *          Unique identifier per event (eg: doorbell press).
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Home\Graph\V1\ReportStateAndNotificationResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function reportStateAndNotification($agentUserId, $payload, $optionalArgs = [])
    {
        $request = new ReportStateAndNotificationRequest();
        $request->setAgentUserId($agentUserId);
        $request->setPayload($payload);
        if (isset($optionalArgs['requestId'])) {
            $request->setRequestId($optionalArgs['requestId']);
        }
        if (isset($optionalArgs['eventId'])) {
            $request->setEventId($optionalArgs['eventId']);
        }

        return $this->startCall(
            'ReportStateAndNotification',
            ReportStateAndNotificationResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Unlink an agent user from Google. As result, all data related to this user
     * will be deleted.
     *
     * Third-party user's identity is passed in as agent_user_id.
     * Agent is identified by the JWT signed by the partner's service account.
     *
     * Note: Special characters (except "/") in agent_user_id must be URL encoded.
     *
     * Sample code:
     * ```
     * $homeGraphApiServiceClient = new HomeGraphApiServiceClient();
     * try {
     *     $formattedAgentUserId = $homeGraphApiServiceClient->agentUserPathName('[AGENT_USER_PATH]');
     *     $homeGraphApiServiceClient->deleteAgentUser($formattedAgentUserId);
     * } finally {
     *     $homeGraphApiServiceClient->close();
     * }
     * ```
     *
     * @param string $agentUserId  Required. Third-party user id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $requestId
     *          Request id used for debugging.
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
    public function deleteAgentUser($agentUserId, $optionalArgs = [])
    {
        $request = new DeleteAgentUserRequest();
        $request->setAgentUserId($agentUserId);
        if (isset($optionalArgs['requestId'])) {
            $request->setRequestId($optionalArgs['requestId']);
        }

        return $this->startCall(
            'DeleteAgentUser',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
