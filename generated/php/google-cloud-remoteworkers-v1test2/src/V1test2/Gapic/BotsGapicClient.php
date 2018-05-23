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
 * https://github.com/google/googleapis/blob/master/google/devtools/remoteworkers/v1test2/bots.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Devtools\Remoteworkers\V1test2\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Devtools\Remoteworkers\V1test2\BotSession;
use Google\Devtools\Remoteworkers\V1test2\CreateBotSessionRequest;
use Google\Devtools\Remoteworkers\V1test2\PostBotEventTempRequest;
use Google\Devtools\Remoteworkers\V1test2\PostBotEventTempRequest_Type;
use Google\Devtools\Remoteworkers\V1test2\UpdateBotSessionRequest;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;

/**
 * Service Description: Design doc: https://goo.gl/oojM5H.
 *
 * Loosely speaking, the Bots interface monitors a collection of workers (think
 * of them as "computers" for a moment). This collection is known as a "farm,"
 * and its purpose is to perform work on behalf of a client.
 *
 * Each worker runs a small program known as a "bot" that allows it to be
 * controlled by the server. This interface contains only methods that are
 * called by the bots themselves; admin functionality is out of scope for this
 * interface.
 *
 * More precisely, we use the term "worker" to refer to the physical "thing"
 * running the bot. We use the term "worker," and not "machine" or "computer,"
 * since a worker may consist of more than one machine - e.g., a computer with
 * multiple attached devices, or even a cluster of computers, with only one of
 * them running the bot. Conversely, a single machine may host several bots, in
 * which case each bot has a "worker" corresponding to the slice of the machine
 * being managed by that bot.
 *
 * The main resource in the Bots interface is not, surprisingly, a Bot - it is a
 * BotSession, which represents a period of time in which a bot is in continuous
 * contact with the server (see the BotSession message for more information).
 * The parent of a bot session can be thought of as an instance of a farm. That
 * is, one endpoint may be able to manage many farms for many users. For
 * example, for a farm managed through GCP, the parent resource will typically
 * take the form "projects/{project_id}". This is referred to below as "the farm
 * resource."
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $botsClient = new BotsClient();
 * try {
 *     $parent = '';
 *     $botSession = new BotSession();
 *     $response = $botsClient->createBotSession($parent, $botSession);
 * } finally {
 *     $botsClient->close();
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
class BotsGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.remoteworkers.v1test2.Bots';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'remoteworkers.googleapis.com';

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
    private static $botSessionNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/bots_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/bots_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/bots_rest_client_config.php',
                ],
            ],
            'versionFile' => __DIR__.'/../../../VERSION',
        ];
    }

    private static function getBotSessionNameTemplate()
    {
        if (self::$botSessionNameTemplate == null) {
            self::$botSessionNameTemplate = new PathTemplate('{unknown_path=**}/botSessions/{bot_session}');
        }

        return self::$botSessionNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'botSession' => self::getBotSessionNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a bot_session resource.
     *
     * @param string $unknownPath
     * @param string $botSession
     *
     * @return string The formatted bot_session resource.
     * @experimental
     */
    public static function botSessionName($unknownPath, $botSession)
    {
        return self::getBotSessionNameTemplate()->render([
            'unknown_path' => $unknownPath,
            'bot_session' => $botSession,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - botSession: {unknown_path=**}/botSessions/{bot_session}.
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
     *           as "<uri>:<port>". Default 'remoteworkers.googleapis.com:443'.
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
     * CreateBotSession is called when the bot first joins the farm, and
     * establishes a session ID to ensure that multiple machines do not register
     * using the same name accidentally.
     *
     * Sample code:
     * ```
     * $botsClient = new BotsClient();
     * try {
     *     $parent = '';
     *     $botSession = new BotSession();
     *     $response = $botsClient->createBotSession($parent, $botSession);
     * } finally {
     *     $botsClient->close();
     * }
     * ```
     *
     * @param string     $parent       The farm resource.
     * @param BotSession $botSession   The bot session to create. Server-assigned fields like name must be unset.
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
     * @return \Google\Devtools\Remoteworkers\V1test2\BotSession
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createBotSession($parent, $botSession, $optionalArgs = [])
    {
        $request = new CreateBotSessionRequest();
        $request->setParent($parent);
        $request->setBotSession($botSession);

        return $this->startCall(
            'CreateBotSession',
            BotSession::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * UpdateBotSession must be called periodically by the bot (on a schedule
     * determined by the server) to let the server know about its status, and to
     * pick up new lease requests from the server.
     *
     * Sample code:
     * ```
     * $botsClient = new BotsClient();
     * try {
     *     $formattedName = $botsClient->botSessionName('[UNKNOWN_PATH]', '[BOT_SESSION]');
     *     $botSession = new BotSession();
     *     $updateMask = new FieldMask();
     *     $response = $botsClient->updateBotSession($formattedName, $botSession, $updateMask);
     * } finally {
     *     $botsClient->close();
     * }
     * ```
     *
     * @param string     $name         The bot session name. Must match bot_session.name.
     * @param BotSession $botSession   The bot session resource to update.
     * @param FieldMask  $updateMask   The fields on the bot that should be updated. See the BotSession resource
     *                                 for which fields are updatable by which caller.
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
     * @return \Google\Devtools\Remoteworkers\V1test2\BotSession
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateBotSession($name, $botSession, $updateMask, $optionalArgs = [])
    {
        $request = new UpdateBotSessionRequest();
        $request->setName($name);
        $request->setBotSession($botSession);
        $request->setUpdateMask($updateMask);

        return $this->startCall(
            'UpdateBotSession',
            BotSession::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * PostBotEventTemp may be called by the bot to indicate that some exceptional
     * event has occurred. This method is subject to change or removal in future
     * revisions of this API; we may simply want to replace it with StackDriver or
     * some other common interface.
     *
     * Sample code:
     * ```
     * $botsClient = new BotsClient();
     * try {
     *     $formattedName = $botsClient->botSessionName('[UNKNOWN_PATH]', '[BOT_SESSION]');
     *     $type = PostBotEventTempRequest_Type::UNSPECIFIED;
     *     $msg = '';
     *     $botsClient->postBotEventTemp($formattedName, $type, $msg);
     * } finally {
     *     $botsClient->close();
     * }
     * ```
     *
     * @param string $name         The bot session name.
     * @param int    $type         The type of bot event.
     *                             For allowed values, use constants defined on {@see \Google\Devtools\Remoteworkers\V1test2\PostBotEventTempRequest_Type}
     * @param string $msg          A human-readable message.
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
    public function postBotEventTemp($name, $type, $msg, $optionalArgs = [])
    {
        $request = new PostBotEventTempRequest();
        $request->setName($name);
        $request->setType($type);
        $request->setMsg($msg);

        return $this->startCall(
            'PostBotEventTemp',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
