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
 * https://github.com/google/googleapis/blob/master/google/monitoring/v3/notification_service.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Monitoring\V3\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\Call;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Auth\CredentialsLoader;
use Google\Cloud\Monitoring\V3\CreateNotificationChannelRequest;
use Google\Cloud\Monitoring\V3\DeleteNotificationChannelRequest;
use Google\Cloud\Monitoring\V3\GetNotificationChannelDescriptorRequest;
use Google\Cloud\Monitoring\V3\GetNotificationChannelRequest;
use Google\Cloud\Monitoring\V3\ListNotificationChannelDescriptorsRequest;
use Google\Cloud\Monitoring\V3\ListNotificationChannelDescriptorsResponse;
use Google\Cloud\Monitoring\V3\ListNotificationChannelsRequest;
use Google\Cloud\Monitoring\V3\ListNotificationChannelsResponse;
use Google\Cloud\Monitoring\V3\NotificationChannel;
use Google\Cloud\Monitoring\V3\NotificationChannelDescriptor;
use Google\Cloud\Monitoring\V3\UpdateNotificationChannelRequest;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: The Notification Channel API provides access to configuration that
 * controls how messages related to incidents are sent.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $notificationChannelServiceClient = new NotificationChannelServiceClient();
 * try {
 *     $formattedName = $notificationChannelServiceClient->projectName('[PROJECT]');
 *     // Iterate through all elements
 *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannelDescriptors($formattedName);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannelDescriptors($formattedName);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $notificationChannelServiceClient->close();
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
class NotificationChannelServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.monitoring.v3.NotificationChannelService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'monitoring.googleapis.com';

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
    private static $notificationChannelNameTemplate;
    private static $notificationChannelDescriptorNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
                'https://www.googleapis.com/auth/monitoring',
                'https://www.googleapis.com/auth/monitoring.read',
                'https://www.googleapis.com/auth/monitoring.write',
            ],
            'clientConfigPath' => __DIR__.'/../resources/notification_channel_service_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/notification_channel_service_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/notification_channel_service_descriptor_config.php',
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

    private static function getNotificationChannelNameTemplate()
    {
        if (self::$notificationChannelNameTemplate == null) {
            self::$notificationChannelNameTemplate = new PathTemplate('projects/{project}/notificationChannels/{notification_channel}');
        }

        return self::$notificationChannelNameTemplate;
    }

    private static function getNotificationChannelDescriptorNameTemplate()
    {
        if (self::$notificationChannelDescriptorNameTemplate == null) {
            self::$notificationChannelDescriptorNameTemplate = new PathTemplate('projects/{project}/notificationChannelDescriptors/{channel_descriptor}');
        }

        return self::$notificationChannelDescriptorNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'project' => self::getProjectNameTemplate(),
                'notificationChannel' => self::getNotificationChannelNameTemplate(),
                'notificationChannelDescriptor' => self::getNotificationChannelDescriptorNameTemplate(),
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
     * Formats a string containing the fully-qualified path to represent
     * a notification_channel resource.
     *
     * @param string $project
     * @param string $notificationChannel
     *
     * @return string The formatted notification_channel resource.
     * @experimental
     */
    public static function notificationChannelName($project, $notificationChannel)
    {
        return self::getNotificationChannelNameTemplate()->render([
            'project' => $project,
            'notification_channel' => $notificationChannel,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a notification_channel_descriptor resource.
     *
     * @param string $project
     * @param string $channelDescriptor
     *
     * @return string The formatted notification_channel_descriptor resource.
     * @experimental
     */
    public static function notificationChannelDescriptorName($project, $channelDescriptor)
    {
        return self::getNotificationChannelDescriptorNameTemplate()->render([
            'project' => $project,
            'channel_descriptor' => $channelDescriptor,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - project: projects/{project}
     * - notificationChannel: projects/{project}/notificationChannels/{notification_channel}
     * - notificationChannelDescriptor: projects/{project}/notificationChannelDescriptors/{channel_descriptor}.
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
     *                                  Default 'monitoring.googleapis.com'.
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
     *                          Defaults to the scopes for the Stackdriver Monitoring API.
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
     * Lists the descriptors for supported channel types. The use of descriptors
     * makes it possible for new channel types to be dynamically added.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannelDescriptors($formattedName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannelDescriptors($formattedName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name The REST resource name of the parent from which to retrieve
     *                     the notification channel descriptors. The expected syntax is:
     *
     *     projects/[PROJECT_ID]
     *
     * Note that this names the parent container in which to look for the
     * descriptors; to retrieve a single descriptor by name, use the
     * [GetNotificationChannelDescriptor][google.monitoring.v3.NotificationChannelService.GetNotificationChannelDescriptor]
     * operation, instead.
     * @param array $optionalArgs {
     *                            Optional.
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
    public function listNotificationChannelDescriptors($name, $optionalArgs = [])
    {
        $request = new ListNotificationChannelDescriptorsRequest();
        $request->setName($name);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListNotificationChannelDescriptors',
            $optionalArgs,
            ListNotificationChannelDescriptorsResponse::class,
            $request
        );
    }

    /**
     * Gets a single channel descriptor. The descriptor indicates which fields
     * are expected / permitted for a notification channel of the given type.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->notificationChannelDescriptorName('[PROJECT]', '[CHANNEL_DESCRIPTOR]');
     *     $response = $notificationChannelServiceClient->getNotificationChannelDescriptor($formattedName);
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The channel type for which to execute the request. The format is
     *                             `projects/[PROJECT_ID]/notificationChannelDescriptors/{channel_type}`.
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
     * @return \Google\Cloud\Monitoring\V3\NotificationChannelDescriptor
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getNotificationChannelDescriptor($name, $optionalArgs = [])
    {
        $request = new GetNotificationChannelDescriptorRequest();
        $request->setName($name);

        return $this->startCall(
            'GetNotificationChannelDescriptor',
            NotificationChannelDescriptor::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists the notification channels that have been created for the project.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannels($formattedName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $notificationChannelServiceClient->listNotificationChannels($formattedName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The project on which to execute the request. The format is
     *                             `projects/[PROJECT_ID]`. That is, this names the container
     *                             in which to look for the notification channels; it does not name a
     *                             specific channel. To query a specific channel by REST resource name, use
     *                             the
     *                             [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $filter
     *          If provided, this field specifies the criteria that must be met by
     *          notification channels to be included in the response.
     *
     *          For more details, see [sorting and
     *          filtering](https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
     *     @type string $orderBy
     *          A comma-separated list of fields by which to sort the result. Supports
     *          the same set of fields as in `filter`. Entries can be prefixed with
     *          a minus sign to sort in descending rather than ascending order.
     *
     *          For more details, see [sorting and
     *          filtering](https://cloud.google.com/monitoring/api/v3/sorting-and-filtering).
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
    public function listNotificationChannels($name, $optionalArgs = [])
    {
        $request = new ListNotificationChannelsRequest();
        $request->setName($name);
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['orderBy'])) {
            $request->setOrderBy($optionalArgs['orderBy']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListNotificationChannels',
            $optionalArgs,
            ListNotificationChannelsResponse::class,
            $request
        );
    }

    /**
     * Gets a single notification channel. The channel includes the relevant
     * configuration details with which the channel was created. However, the
     * response may truncate or omit passwords, API keys, or other private key
     * matter and thus the response may not be 100% identical to the information
     * that was supplied in the call to the create method.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->notificationChannelName('[PROJECT]', '[NOTIFICATION_CHANNEL]');
     *     $response = $notificationChannelServiceClient->getNotificationChannel($formattedName);
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The channel for which to execute the request. The format is
     *                             `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
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
     * @return \Google\Cloud\Monitoring\V3\NotificationChannel
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getNotificationChannel($name, $optionalArgs = [])
    {
        $request = new GetNotificationChannelRequest();
        $request->setName($name);

        return $this->startCall(
            'GetNotificationChannel',
            NotificationChannel::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new notification channel, representing a single notification
     * endpoint such as an email address, SMS number, or pagerduty service.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->projectName('[PROJECT]');
     *     $notificationChannel = new NotificationChannel();
     *     $response = $notificationChannelServiceClient->createNotificationChannel($formattedName, $notificationChannel);
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name The project on which to execute the request. The format is:
     *
     *     projects/[PROJECT_ID]
     *
     * Note that this names the container into which the channel will be
     * written. This does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * @param NotificationChannel $notificationChannel The definition of the `NotificationChannel` to create.
     * @param array               $optionalArgs        {
     *                                                 Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Monitoring\V3\NotificationChannel
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createNotificationChannel($name, $notificationChannel, $optionalArgs = [])
    {
        $request = new CreateNotificationChannelRequest();
        $request->setName($name);
        $request->setNotificationChannel($notificationChannel);

        return $this->startCall(
            'CreateNotificationChannel',
            NotificationChannel::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates a notification channel. Fields not specified in the field mask
     * remain unchanged.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $notificationChannel = new NotificationChannel();
     *     $response = $notificationChannelServiceClient->updateNotificationChannel($notificationChannel);
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param NotificationChannel $notificationChannel A description of the changes to be applied to the specified
     *                                                 notification channel. The description must provide a definition for
     *                                                 fields to be updated; the names of these fields should also be
     *                                                 included in the `update_mask`.
     * @param array               $optionalArgs        {
     *                                                 Optional.
     *
     *     @type FieldMask $updateMask
     *          The fields to update.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Monitoring\V3\NotificationChannel
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateNotificationChannel($notificationChannel, $optionalArgs = [])
    {
        $request = new UpdateNotificationChannelRequest();
        $request->setNotificationChannel($notificationChannel);
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        return $this->startCall(
            'UpdateNotificationChannel',
            NotificationChannel::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a notification channel.
     *
     * Sample code:
     * ```
     * $notificationChannelServiceClient = new NotificationChannelServiceClient();
     * try {
     *     $formattedName = $notificationChannelServiceClient->notificationChannelName('[PROJECT]', '[NOTIFICATION_CHANNEL]');
     *     $notificationChannelServiceClient->deleteNotificationChannel($formattedName);
     * } finally {
     *     $notificationChannelServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The channel for which to execute the request. The format is
     *                             `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type bool $force
     *          If true, the notification channel will be deleted regardless of its
     *          use in alert policies (the policies will be updated to remove the
     *          channel). If false, channels that are still referenced by an existing
     *          alerting policy will fail to be deleted in a delete operation.
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
    public function deleteNotificationChannel($name, $optionalArgs = [])
    {
        $request = new DeleteNotificationChannelRequest();
        $request->setName($name);
        if (isset($optionalArgs['force'])) {
            $request->setForce($optionalArgs['force']);
        }

        return $this->startCall(
            'DeleteNotificationChannel',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
