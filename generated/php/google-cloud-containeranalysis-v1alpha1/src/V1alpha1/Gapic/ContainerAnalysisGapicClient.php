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
 * https://github.com/google/googleapis/blob/master/google/devtools/containeranalysis/v1alpha1/containeranalysis.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Devtools\Containeranalysis\V1alpha1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Cloud\Iam\V1\GetIamPolicyRequest;
use Google\Cloud\Iam\V1\Policy;
use Google\Cloud\Iam\V1\SetIamPolicyRequest;
use Google\Cloud\Iam\V1\TestIamPermissionsRequest;
use Google\Cloud\Iam\V1\TestIamPermissionsResponse;
use Google\Devtools\Containeranalysis\V1alpha1\CreateNoteRequest;
use Google\Devtools\Containeranalysis\V1alpha1\CreateOccurrenceRequest;
use Google\Devtools\Containeranalysis\V1alpha1\DeleteNoteRequest;
use Google\Devtools\Containeranalysis\V1alpha1\DeleteOccurrenceRequest;
use Google\Devtools\Containeranalysis\V1alpha1\GetNoteRequest;
use Google\Devtools\Containeranalysis\V1alpha1\GetOccurrenceNoteRequest;
use Google\Devtools\Containeranalysis\V1alpha1\GetOccurrenceRequest;
use Google\Devtools\Containeranalysis\V1alpha1\GetVulnzOccurrencesSummaryRequest;
use Google\Devtools\Containeranalysis\V1alpha1\GetVulnzOccurrencesSummaryResponse;
use Google\Devtools\Containeranalysis\V1alpha1\ListNoteOccurrencesRequest;
use Google\Devtools\Containeranalysis\V1alpha1\ListNoteOccurrencesResponse;
use Google\Devtools\Containeranalysis\V1alpha1\ListNotesRequest;
use Google\Devtools\Containeranalysis\V1alpha1\ListNotesResponse;
use Google\Devtools\Containeranalysis\V1alpha1\ListOccurrencesRequest;
use Google\Devtools\Containeranalysis\V1alpha1\ListOccurrencesResponse;
use Google\Devtools\Containeranalysis\V1alpha1\Note;
use Google\Devtools\Containeranalysis\V1alpha1\Occurrence;
use Google\Devtools\Containeranalysis\V1alpha1\UpdateNoteRequest;
use Google\Devtools\Containeranalysis\V1alpha1\UpdateOccurrenceRequest;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;

/**
 * Service Description: Retrieves the results of vulnerability scanning of cloud components such as
 * container images. The Container Analysis API is an implementation of the
 * [Grafeas](https://cloud.google.comgrafeas.io) API.
 *
 * The vulnerability results are stored as a series of Occurrences.
 * An `Occurrence` contains information about a specific vulnerability in a
 * resource. An `Occurrence` references a `Note`. A `Note` contains details
 * about the vulnerability and is stored in a stored in a separate project.
 * Multiple `Occurrences` can reference the same `Note`. For example, an SSL
 * vulnerability could affect multiple packages in an image. In this case,
 * there would be one `Note` for the vulnerability and an `Occurrence` for
 * each package with the vulnerability referencing that `Note`.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $containerAnalysisClient = new ContainerAnalysisClient();
 * try {
 *     $formattedName = $containerAnalysisClient->occurrenceName('[PROJECT]', '[OCCURRENCE]');
 *     $response = $containerAnalysisClient->getOccurrence($formattedName);
 * } finally {
 *     $containerAnalysisClient->close();
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
class ContainerAnalysisGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.devtools.containeranalysis.v1alpha1.ContainerAnalysis';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'containeranalysis.googleapis.com';

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
    private static $projectNameTemplate;
    private static $noteNameTemplate;
    private static $occurrenceNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/container_analysis_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/container_analysis_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/container_analysis_rest_client_config.php',
                ],
            ],
        ];
    }

    private static function getProjectNameTemplate()
    {
        if (self::$projectNameTemplate == null) {
            self::$projectNameTemplate = new PathTemplate('projects/{project}');
        }

        return self::$projectNameTemplate;
    }

    private static function getNoteNameTemplate()
    {
        if (self::$noteNameTemplate == null) {
            self::$noteNameTemplate = new PathTemplate('projects/{project}/notes/{note}');
        }

        return self::$noteNameTemplate;
    }

    private static function getOccurrenceNameTemplate()
    {
        if (self::$occurrenceNameTemplate == null) {
            self::$occurrenceNameTemplate = new PathTemplate('projects/{project}/occurrences/{occurrence}');
        }

        return self::$occurrenceNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'project' => self::getProjectNameTemplate(),
                'note' => self::getNoteNameTemplate(),
                'occurrence' => self::getOccurrenceNameTemplate(),
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
     * a note resource.
     *
     * @param string $project
     * @param string $note
     *
     * @return string The formatted note resource.
     * @experimental
     */
    public static function noteName($project, $note)
    {
        return self::getNoteNameTemplate()->render([
            'project' => $project,
            'note' => $note,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a occurrence resource.
     *
     * @param string $project
     * @param string $occurrence
     *
     * @return string The formatted occurrence resource.
     * @experimental
     */
    public static function occurrenceName($project, $occurrence)
    {
        return self::getOccurrenceNameTemplate()->render([
            'project' => $project,
            'occurrence' => $occurrence,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - project: projects/{project}
     * - note: projects/{project}/notes/{note}
     * - occurrence: projects/{project}/occurrences/{occurrence}.
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
     *           as "<uri>:<port>". Default 'containeranalysis.googleapis.com:443'.
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
     * Returns the requested `Occurrence`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->occurrenceName('[PROJECT]', '[OCCURRENCE]');
     *     $response = $containerAnalysisClient->getOccurrence($formattedName);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the occurrence of the form
     *                             "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Occurrence
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getOccurrence($name, $optionalArgs = [])
    {
        $request = new GetOccurrenceRequest();
        $request->setName($name);

        return $this->startCall(
            'GetOccurrence',
            Occurrence::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists active `Occurrences` for a given project matching the filters.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedParent = $containerAnalysisClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $containerAnalysisClient->listOccurrences($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $containerAnalysisClient->listOccurrences($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $parent       This contains the project Id for example: projects/{project_id}.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $name
     *          The name field contains the project Id. For example:
     *          "projects/{project_id}
     *          &#64;Deprecated
     *     @type string $filter
     *          The filter expression.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $kind
     *          The kind of occurrences to filter on.
     *          For allowed values, use constants defined on {@see \Google\Devtools\Containeranalysis\V1alpha1\Note_Kind}
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
    public function listOccurrences($parent, $optionalArgs = [])
    {
        $request = new ListOccurrencesRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['kind'])) {
            $request->setKind($optionalArgs['kind']);
        }

        return $this->getPagedListResponse(
            'ListOccurrences',
            $optionalArgs,
            ListOccurrencesResponse::class,
            $request
        );
    }

    /**
     * Deletes the given `Occurrence` from the system. Use this when
     * an `Occurrence` is no longer applicable for the given resource.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->occurrenceName('[PROJECT]', '[OCCURRENCE]');
     *     $containerAnalysisClient->deleteOccurrence($formattedName);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the occurrence in the form of
     *                             "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
    public function deleteOccurrence($name, $optionalArgs = [])
    {
        $request = new DeleteOccurrenceRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteOccurrence',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new `Occurrence`. Use this method to create `Occurrences`
     * for a resource.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedParent = $containerAnalysisClient->projectName('[PROJECT]');
     *     $occurrence = new Occurrence();
     *     $response = $containerAnalysisClient->createOccurrence($formattedParent, $occurrence);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string     $parent       This field contains the project Id for example: "projects/{project_id}"
     * @param Occurrence $occurrence   The occurrence to be inserted
     * @param array      $optionalArgs {
     *                                 Optional.
     *
     *     @type string $name
     *          The name of the project.  Should be of the form "projects/{project_id}".
     *          &#64;Deprecated
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Occurrence
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createOccurrence($parent, $occurrence, $optionalArgs = [])
    {
        $request = new CreateOccurrenceRequest();
        $request->setParent($parent);
        $request->setOccurrence($occurrence);
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }

        return $this->startCall(
            'CreateOccurrence',
            Occurrence::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates an existing occurrence.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->occurrenceName('[PROJECT]', '[OCCURRENCE]');
     *     $occurrence = new Occurrence();
     *     $response = $containerAnalysisClient->updateOccurrence($formattedName, $occurrence);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string     $name         The name of the occurrence.
     *                                 Should be of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}".
     * @param Occurrence $occurrence   The updated occurrence.
     * @param array      $optionalArgs {
     *                                 Optional.
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
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Occurrence
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateOccurrence($name, $occurrence, $optionalArgs = [])
    {
        $request = new UpdateOccurrenceRequest();
        $request->setName($name);
        $request->setOccurrence($occurrence);
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        return $this->startCall(
            'UpdateOccurrence',
            Occurrence::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets the `Note` attached to the given `Occurrence`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->occurrenceName('[PROJECT]', '[OCCURRENCE]');
     *     $response = $containerAnalysisClient->getOccurrenceNote($formattedName);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the occurrence in the form
     *                             "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Note
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getOccurrenceNote($name, $optionalArgs = [])
    {
        $request = new GetOccurrenceNoteRequest();
        $request->setName($name);

        return $this->startCall(
            'GetOccurrenceNote',
            Note::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns the requested `Note`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $response = $containerAnalysisClient->getNote($formattedName);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the note in the form of
     *                             "providers/{provider_id}/notes/{NOTE_ID}"
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
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Note
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getNote($name, $optionalArgs = [])
    {
        $request = new GetNoteRequest();
        $request->setName($name);

        return $this->startCall(
            'GetNote',
            Note::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists all `Notes` for a given project.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedParent = $containerAnalysisClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $containerAnalysisClient->listNotes($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $containerAnalysisClient->listNotes($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $parent       This field contains the project Id for example: "projects/{PROJECT_ID}".
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $name
     *          The name field will contain the project Id for example:
     *          "providers/{provider_id}
     *          &#64;Deprecated
     *     @type string $filter
     *          The filter expression.
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
    public function listNotes($parent, $optionalArgs = [])
    {
        $request = new ListNotesRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListNotes',
            $optionalArgs,
            ListNotesResponse::class,
            $request
        );
    }

    /**
     * Deletes the given `Note` from the system.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $containerAnalysisClient->deleteNote($formattedName);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the note in the form of
     *                             "providers/{provider_id}/notes/{NOTE_ID}"
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
    public function deleteNote($name, $optionalArgs = [])
    {
        $request = new DeleteNoteRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteNote',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new `Note`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedParent = $containerAnalysisClient->projectName('[PROJECT]');
     *     $noteId = '';
     *     $note = new Note();
     *     $response = $containerAnalysisClient->createNote($formattedParent, $noteId, $note);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $parent       This field contains the project Id for example:
     *                             "projects/{project_id}
     * @param string $noteId       The ID to use for this note.
     * @param Note   $note         The Note to be inserted
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $name
     *          The name of the project.
     *          Should be of the form "providers/{provider_id}".
     *          &#64;Deprecated
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Note
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createNote($parent, $noteId, $note, $optionalArgs = [])
    {
        $request = new CreateNoteRequest();
        $request->setParent($parent);
        $request->setNoteId($noteId);
        $request->setNote($note);
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }

        return $this->startCall(
            'CreateNote',
            Note::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates an existing `Note`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $note = new Note();
     *     $response = $containerAnalysisClient->updateNote($formattedName, $note);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the note.
     *                             Should be of the form "projects/{provider_id}/notes/{note_id}".
     * @param Note   $note         The updated note.
     * @param array  $optionalArgs {
     *                             Optional.
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
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Note
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateNote($name, $note, $optionalArgs = [])
    {
        $request = new UpdateNoteRequest();
        $request->setName($name);
        $request->setNote($note);
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        return $this->startCall(
            'UpdateNote',
            Note::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists `Occurrences` referencing the specified `Note`. Use this method to
     * get all occurrences referencing your `Note` across all your customer
     * projects.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedName = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     // Iterate through all elements
     *     $pagedResponse = $containerAnalysisClient->listNoteOccurrences($formattedName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $containerAnalysisClient->listNoteOccurrences($formattedName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $name         The name field will contain the note name for example:
     *                             "provider/{provider_id}/notes/{note_id}"
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $filter
     *          The filter expression.
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
    public function listNoteOccurrences($name, $optionalArgs = [])
    {
        $request = new ListNoteOccurrencesRequest();
        $request->setName($name);
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListNoteOccurrences',
            $optionalArgs,
            ListNoteOccurrencesResponse::class,
            $request
        );
    }

    /**
     * Gets a summary of the number and severity of occurrences.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedParent = $containerAnalysisClient->projectName('[PROJECT]');
     *     $response = $containerAnalysisClient->getVulnzOccurrencesSummary($formattedParent);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $parent       This contains the project Id for example: projects/{project_id}
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $filter
     *          The filter expression.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Devtools\Containeranalysis\V1alpha1\GetVulnzOccurrencesSummaryResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getVulnzOccurrencesSummary($parent, $optionalArgs = [])
    {
        $request = new GetVulnzOccurrencesSummaryRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }

        return $this->startCall(
            'GetVulnzOccurrencesSummary',
            GetVulnzOccurrencesSummaryResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Sets the access control policy on the specified `Note` or `Occurrence`.
     * Requires `containeranalysis.notes.setIamPolicy` or
     * `containeranalysis.occurrences.setIamPolicy` permission if the resource is
     * a `Note` or an `Occurrence`, respectively.
     * Attempting to call this method without these permissions will result in a `
     * `PERMISSION_DENIED` error.
     * Attempting to call this method on a non-existent resource will result in a
     * `NOT_FOUND` error if the user has `containeranalysis.notes.list` permission
     * on a `Note` or `containeranalysis.occurrences.list` on an `Occurrence`, or
     * a `PERMISSION_DENIED` error otherwise. The resource takes the following
     * formats: `projects/{projectid}/occurrences/{occurrenceid}` for occurrences
     * and projects/{projectid}/notes/{noteid} for notes.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedResource = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $policy = new Policy();
     *     $response = $containerAnalysisClient->setIamPolicy($formattedResource, $policy);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $resource     REQUIRED: The resource for which the policy is being specified.
     *                             `resource` is usually specified as a path. For example, a Project
     *                             resource is specified as `projects/{project}`.
     * @param Policy $policy       REQUIRED: The complete policy to be applied to the `resource`. The size of
     *                             the policy is limited to a few 10s of KB. An empty policy is a
     *                             valid policy but certain Cloud Platform services (such as Projects)
     *                             might reject them.
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
     * @return \Google\Cloud\Iam\V1\Policy
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function setIamPolicy($resource, $policy, $optionalArgs = [])
    {
        $request = new SetIamPolicyRequest();
        $request->setResource($resource);
        $request->setPolicy($policy);

        return $this->startCall(
            'SetIamPolicy',
            Policy::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets the access control policy for a note or an `Occurrence` resource.
     * Requires `containeranalysis.notes.setIamPolicy` or
     * `containeranalysis.occurrences.setIamPolicy` permission if the resource is
     * a note or occurrence, respectively.
     * Attempting to call this method on a resource without the required
     * permission will result in a `PERMISSION_DENIED` error. Attempting to call
     * this method on a non-existent resource will result in a `NOT_FOUND` error
     * if the user has list permission on the project, or a `PERMISSION_DENIED`
     * error otherwise. The resource takes the following formats:
     * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and
     * projects/{PROJECT_ID}/notes/{NOTE_ID} for notes.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedResource = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $response = $containerAnalysisClient->getIamPolicy($formattedResource);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string $resource     REQUIRED: The resource for which the policy is being requested.
     *                             `resource` is usually specified as a path. For example, a Project
     *                             resource is specified as `projects/{project}`.
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
     * @return \Google\Cloud\Iam\V1\Policy
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getIamPolicy($resource, $optionalArgs = [])
    {
        $request = new GetIamPolicyRequest();
        $request->setResource($resource);

        return $this->startCall(
            'GetIamPolicy',
            Policy::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns the permissions that a caller has on the specified note or
     * occurrence resource. Requires list permission on the project (for example,
     * "storage.objects.list" on the containing bucket for testing permission of
     * an object). Attempting to call this method on a non-existent resource will
     * result in a `NOT_FOUND` error if the user has list permission on the
     * project, or a `PERMISSION_DENIED` error otherwise. The resource takes the
     * following formats: `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for
     * `Occurrences` and `projects/{PROJECT_ID}/notes/{NOTE_ID}` for `Notes`.
     *
     * Sample code:
     * ```
     * $containerAnalysisClient = new ContainerAnalysisClient();
     * try {
     *     $formattedResource = $containerAnalysisClient->noteName('[PROJECT]', '[NOTE]');
     *     $permissions = [];
     *     $response = $containerAnalysisClient->testIamPermissions($formattedResource, $permissions);
     * } finally {
     *     $containerAnalysisClient->close();
     * }
     * ```
     *
     * @param string   $resource     REQUIRED: The resource for which the policy detail is being requested.
     *                               `resource` is usually specified as a path. For example, a Project
     *                               resource is specified as `projects/{project}`.
     * @param string[] $permissions  The set of permissions to check for the `resource`. Permissions with
     *                               wildcards (such as '*' or 'storage.*') are not allowed. For more
     *                               information see
     *                               [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Iam\V1\TestIamPermissionsResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function testIamPermissions($resource, $permissions, $optionalArgs = [])
    {
        $request = new TestIamPermissionsRequest();
        $request->setResource($resource);
        $request->setPermissions($permissions);

        return $this->startCall(
            'TestIamPermissions',
            TestIamPermissionsResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
