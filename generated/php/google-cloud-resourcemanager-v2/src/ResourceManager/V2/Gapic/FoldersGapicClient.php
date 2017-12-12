<?php
/*
 * Copyright 2017, Google LLC All rights reserved.
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
 * https://github.com/google/googleapis/blob/master/google/cloud/resourcemanager/v2/folders.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * @experimental
 */

namespace Google\Cloud\ResourceManager\V2\Gapic;

use Google\ApiCore\AgentHeaderDescriptor;
use Google\ApiCore\ApiCallable;
use Google\ApiCore\CallSettings;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\PageStreamingDescriptor;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\ValidationException;
use Google\Cloud\Iam\V1\GetIamPolicyRequest;
use Google\Cloud\Iam\V1\Policy;
use Google\Cloud\Iam\V1\SetIamPolicyRequest;
use Google\Cloud\Iam\V1\TestIamPermissionsRequest;
use Google\Cloud\ResourceManager\V2\CreateFolderRequest;
use Google\Cloud\ResourceManager\V2\DeleteFolderRequest;
use Google\Cloud\ResourceManager\V2\Folder;
use Google\Cloud\ResourceManager\V2\FoldersGrpcClient;
use Google\Cloud\ResourceManager\V2\GetFolderRequest;
use Google\Cloud\ResourceManager\V2\ListFoldersRequest;
use Google\Cloud\ResourceManager\V2\MoveFolderRequest;
use Google\Cloud\ResourceManager\V2\SearchFoldersRequest;
use Google\Cloud\ResourceManager\V2\UndeleteFolderRequest;
use Google\Cloud\ResourceManager\V2\UpdateFolderRequest;
use Google\Cloud\Version;
use Google\Protobuf\FieldMask;

/**
 * Service Description: Manages Cloud Resource Folders.
 * Cloud Resource Folders can be used to organize the resources under an
 * organization and to control the IAM policies applied to groups of resources.
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
 *     $foldersClient = new FoldersClient();
 *     $formattedParent = $foldersClient->organizationName('[ORG_ID]');
 *     // Iterate through all elements
 *     $pagedResponse = $foldersClient->listFolders($formattedParent);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $foldersClient->listFolders($formattedParent);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $foldersClient->close();
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
class FoldersGapicClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'cloudresourcemanager.googleapis.com';

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

    private static $folderNameTemplate;
    private static $organizationNameTemplate;
    private static $pathTemplateMap;
    private static $gapicVersion;
    private static $gapicVersionLoaded = false;

    protected $grpcCredentialsHelper;
    protected $foldersStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    private static function getFolderNameTemplate()
    {
        if (self::$folderNameTemplate == null) {
            self::$folderNameTemplate = new PathTemplate('folders/{folder}');
        }

        return self::$folderNameTemplate;
    }

    private static function getOrganizationNameTemplate()
    {
        if (self::$organizationNameTemplate == null) {
            self::$organizationNameTemplate = new PathTemplate('organizations/{org_id}');
        }

        return self::$organizationNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'folder' => self::getFolderNameTemplate(),
                'organization' => self::getOrganizationNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    private static function getPageStreamingDescriptors()
    {
        $listFoldersPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getFolders',
                ]);
        $searchFoldersPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getFolders',
                ]);

        $pageStreamingDescriptors = [
            'listFolders' => $listFoldersPageStreamingDescriptor,
            'searchFolders' => $searchFoldersPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    private static function getGapicVersion()
    {
        if (!self::$gapicVersionLoaded) {
            if (file_exists(__DIR__.'/../VERSION')) {
                self::$gapicVersion = trim(file_get_contents(__DIR__.'/../VERSION'));
            } elseif (class_exists(Version::class)) {
                self::$gapicVersion = Version::VERSION;
            }
            self::$gapicVersionLoaded = true;
        }

        return self::$gapicVersion;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a folder resource.
     *
     * @param string $folder
     *
     * @return string The formatted folder resource.
     * @experimental
     */
    public static function folderName($folder)
    {
        return self::getFolderNameTemplate()->render([
            'folder' => $folder,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a organization resource.
     *
     * @param string $orgId
     *
     * @return string The formatted organization resource.
     * @experimental
     */
    public static function organizationName($orgId)
    {
        return self::getOrganizationNameTemplate()->render([
            'org_id' => $orgId,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - folder: folders/{folder}
     * - organization: organizations/{org_id}.
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
     *                                  Default 'cloudresourcemanager.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\Channel $channel
     *           A `Channel` object to be used by gRPC. If not specified, a channel will be constructed.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` object for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *           NOTE: if the $channel optional argument is specified, then this argument is unused.
     *     @type bool $forceNewChannel
     *           If true, this forces gRPC to create a new channel instead of using a persistent channel.
     *           Defaults to false.
     *           NOTE: if the $channel optional argument is specified, then this option is unused.
     *     @type \Google\Auth\CredentialsLoader $credentialsLoader
     *           A CredentialsLoader object created using the Google\Auth library.
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                          Defaults to the scopes for the Google Cloud Resource Manager API.
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
     * }
     * @experimental
     */
    public function __construct($options = [])
    {
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
                'https://www.googleapis.com/auth/cloud-platform.read-only',
            ],
            'retryingOverride' => null,
            'libName' => null,
            'libVersion' => null,
            'clientConfigPath' => __DIR__.'/../resources/folders_client_config.json',
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
            'listFolders' => $defaultDescriptors,
            'searchFolders' => $defaultDescriptors,
            'getFolder' => $defaultDescriptors,
            'createFolder' => $defaultDescriptors,
            'updateFolder' => $defaultDescriptors,
            'moveFolder' => $defaultDescriptors,
            'deleteFolder' => $defaultDescriptors,
            'undeleteFolder' => $defaultDescriptors,
            'getIamPolicy' => $defaultDescriptors,
            'setIamPolicy' => $defaultDescriptors,
            'testIamPermissions' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents($options['clientConfigPath']);
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.cloud.resourcemanager.v2.Folders',
                    $clientConfig,
                    $options['retryingOverride']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (array_key_exists('sslCreds', $options)) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($options);

        $createFoldersStubFunction = function ($hostname, $opts, $channel) {
            return new FoldersGrpcClient($hostname, $opts, $channel);
        };
        if (array_key_exists('createFoldersStubFunction', $options)) {
            $createFoldersStubFunction = $options['createFoldersStubFunction'];
        }
        $this->foldersStub = $this->grpcCredentialsHelper->createStub($createFoldersStubFunction);
    }

    /**
     * Lists the Folders that are direct descendants of supplied parent resource.
     * List provides a strongly consistent view of the Folders underneath
     * the specified parent resource.
     * List returns Folders sorted based upon the (ascending) lexical ordering
     * of their display_name.
     * The caller must have `resourcemanager.folders.list` permission on the
     * identified parent.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedParent = $foldersClient->organizationName('[ORG_ID]');
     *     // Iterate through all elements
     *     $pagedResponse = $foldersClient->listFolders($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $foldersClient->listFolders($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $parent       The resource name of the Organization or Folder whose Folders are
     *                             being listed.
     *                             Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     *                             Access to this method is controlled by checking the
     *                             `resourcemanager.folders.list` permission on the `parent`.
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
     *     @type bool $showDeleted
     *          Controls whether Folders in the [DELETE_REQUESTED} state should
     *          be returned.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function listFolders($parent, $optionalArgs = [])
    {
        $request = new ListFoldersRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['showDeleted'])) {
            $request->setShowDeleted($optionalArgs['showDeleted']);
        }

        $defaultCallSettings = $this->defaultCallSettings['listFolders'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'ListFolders',
            $mergedSettings,
            $this->descriptors['listFolders']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Search for folders that match specific filter criteria.
     * Search provides an eventually consistent view of the folders a user has
     * access to which meet the specified filter criteria.
     *
     * This will only return folders on which the caller has the
     * permission `resourcemanager.folders.get`.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *
     *     // Iterate through all elements
     *     $pagedResponse = $foldersClient->searchFolders();
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $foldersClient->searchFolders();
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
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
     *     @type string $query
     *          Search criteria used to select the Folders to return.
     *          If no search criteria is specified then all accessible folders will be
     *          returned.
     *
     *          Query expressions can be used to restrict results based upon displayName,
     *          lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
     *          can be used along with the suffix wildcard symbol `*`.
     *
     *          Some example queries are:
     *          |Query|Description|
     *          |------|-----------|
     *          |displayName=Test*|Folders whose display name starts with "Test".|
     *          |lifecycleState=ACTIVE|Folders whose lifecycleState is ACTIVE.|
     *          |parent=folders/123|Folders whose parent is "folders/123".|
     *          |parent=folders/123 AND lifecycleState=ACTIVE|Active folders whose
     *          parent is "folders/123".|
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function searchFolders($optionalArgs = [])
    {
        $request = new SearchFoldersRequest();
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['query'])) {
            $request->setQuery($optionalArgs['query']);
        }

        $defaultCallSettings = $this->defaultCallSettings['searchFolders'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'SearchFolders',
            $mergedSettings,
            $this->descriptors['searchFolders']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Retrieves a Folder identified by the supplied resource name.
     * Valid Folder resource names have the format `folders/{folder_id}`
     * (for example, `folders/1234`).
     * The caller must have `resourcemanager.folders.get` permission on the
     * identified folder.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedName = $foldersClient->folderName('[FOLDER]');
     *     $response = $foldersClient->getFolder($formattedName);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $name         The resource name of the Folder to retrieve.
     *                             Must be of the form `folders/{folder_id}`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ResourceManager\V2\Folder
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function getFolder($name, $optionalArgs = [])
    {
        $request = new GetFolderRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['getFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'GetFolder',
            $mergedSettings,
            $this->descriptors['getFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Creates a Folder in the resource hierarchy.
     * Returns an Operation which can be used to track the progress of the
     * folder creation workflow.
     * Upon success the Operation.response field will be populated with the
     * created Folder.
     *
     * In order to succeed, the addition of this new Folder must not violate
     * the Folder naming, height or fanout constraints.
     * + The Folder's display_name must be distinct from all other Folder's that
     * share its parent.
     * + The addition of the Folder must not cause the active Folder hierarchy
     * to exceed a height of 4. Note, the full active + deleted Folder hierarchy
     * is allowed to reach a height of 8; this provides additional headroom when
     * moving folders that contain deleted folders.
     * + The addition of the Folder must not cause the total number of Folders
     * under its parent to exceed 100.
     *
     * If the operation fails due to a folder constraint violation,
     * a PreconditionFailure explaining the violation will be returned.
     * If the failure occurs synchronously then the PreconditionFailure
     * will be returned via the Status.details field and if it occurs
     * asynchronously then the PreconditionFailure will be returned
     * via the the Operation.error field.
     *
     * The caller must have `resourcemanager.folders.create` permission on the
     * identified parent.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedParent = $foldersClient->organizationName('[ORG_ID]');
     *     $folder = new Folder();
     *     $response = $foldersClient->createFolder($formattedParent, $folder);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $parent       The resource name of the new Folder's parent.
     *                             Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * @param Folder $folder       The Folder being created, only the display name will be consulted.
     *                             All other fields will be ignored.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\LongRunning\Operation
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function createFolder($parent, $folder, $optionalArgs = [])
    {
        $request = new CreateFolderRequest();
        $request->setParent($parent);
        $request->setFolder($folder);

        $defaultCallSettings = $this->defaultCallSettings['createFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'CreateFolder',
            $mergedSettings,
            $this->descriptors['createFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates a Folder, changing its display_name.
     * Changes to the folder display_name will be rejected if they violate either
     * the display_name formatting rules or naming constraints described in
     * the [CreateFolder] documentation.
     * + The Folder's display name must start and end with a letter or digit,
     * may contain letters, digits, spaces, hyphens and underscores and can be
     * no longer than 30 characters. This is captured by the regular expression:
     * [\p{L}\p{N}](https://cloud.google.com{\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?.
     * The caller must have `resourcemanager.folders.update` permission on the
     * identified folder.
     *
     * If the update fails due to the unique name constraint then a
     * PreconditionFailure explaining this violation will be returned
     * in the Status.details field.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $folder = new Folder();
     *     $updateMask = new FieldMask();
     *     $response = $foldersClient->updateFolder($folder, $updateMask);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param Folder    $folder       The new definition of the Folder. It must include a
     *                                a `name` and `display_name` field. The other fields
     *                                will be ignored.
     * @param FieldMask $updateMask   Fields to be updated.
     *                                Only the `display_name` can be updated.
     * @param array     $optionalArgs {
     *                                Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ResourceManager\V2\Folder
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function updateFolder($folder, $updateMask, $optionalArgs = [])
    {
        $request = new UpdateFolderRequest();
        $request->setFolder($folder);
        $request->setUpdateMask($updateMask);

        $defaultCallSettings = $this->defaultCallSettings['updateFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'UpdateFolder',
            $mergedSettings,
            $this->descriptors['updateFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Moves a Folder under a new resource parent.
     * Returns an Operation which can be used to track the progress of the
     * folder move workflow.
     * Upon success the Operation.response field will be populated with the
     * moved Folder.
     * Upon failure, a FolderOperationError categorizing the failure cause will
     * be returned - if the failure occurs synchronously then the
     * FolderOperationError will be returned via the Status.details field
     * and if it occurs asynchronously then the FolderOperation will be returned
     * via the the Operation.error field.
     * In addition, the Operation.metadata field will be populated with a
     * FolderOperation message as an aid to stateless clients.
     * Folder moves will be rejected if they violate either the naming, height
     * or fanout constraints described in the [CreateFolder] documentation.
     * The caller must have `resourcemanager.folders.move` permission on the
     * folder's current and proposed new parent.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedName = $foldersClient->folderName('[FOLDER]');
     *     $formattedDestinationParent = $foldersClient->organizationName('[ORG_ID]');
     *     $response = $foldersClient->moveFolder($formattedName, $formattedDestinationParent);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $name              The resource name of the Folder to move.
     *                                  Must be of the form folders/{folder_id}
     * @param string $destinationParent The resource name of the Folder or Organization to reparent
     *                                  the folder under.
     *                                  Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * @param array  $optionalArgs      {
     *                                  Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\LongRunning\Operation
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function moveFolder($name, $destinationParent, $optionalArgs = [])
    {
        $request = new MoveFolderRequest();
        $request->setName($name);
        $request->setDestinationParent($destinationParent);

        $defaultCallSettings = $this->defaultCallSettings['moveFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'MoveFolder',
            $mergedSettings,
            $this->descriptors['moveFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Requests deletion of a Folder. The Folder is moved into the
     * [DELETE_REQUESTED] state immediately, and is deleted approximately 30 days
     * later. This method may only be called on an empty Folder in the [ACTIVE]
     * state, where a Folder is empty if it doesn't contain any Folders or
     * Projects in the [ACTIVE] state.
     * The caller must have `resourcemanager.folders.delete` permission on the
     * identified folder.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedName = $foldersClient->folderName('[FOLDER]');
     *     $response = $foldersClient->deleteFolder($formattedName);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $name         the resource name of the Folder to be deleted.
     *                             Must be of the form `folders/{folder_id}`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type bool $recursiveDelete
     *          Instructs DeleteFolderAction to delete a folder even when the folder is not
     *          empty.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ResourceManager\V2\Folder
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function deleteFolder($name, $optionalArgs = [])
    {
        $request = new DeleteFolderRequest();
        $request->setName($name);
        if (isset($optionalArgs['recursiveDelete'])) {
            $request->setRecursiveDelete($optionalArgs['recursiveDelete']);
        }

        $defaultCallSettings = $this->defaultCallSettings['deleteFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'DeleteFolder',
            $mergedSettings,
            $this->descriptors['deleteFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Cancels the deletion request for a Folder. This method may only be
     * called on a Folder in the [DELETE_REQUESTED] state.
     * In order to succeed, the Folder's parent must be in the [ACTIVE] state.
     * In addition, reintroducing the folder into the tree must not violate
     * folder naming, height and fanout constraints described in the
     * [CreateFolder] documentation.
     * The caller must have `resourcemanager.folders.undelete` permission on the
     * identified folder.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedName = $foldersClient->folderName('[FOLDER]');
     *     $response = $foldersClient->undeleteFolder($formattedName);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $name         The resource name of the Folder to undelete.
     *                             Must be of the form `folders/{folder_id}`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\ResourceManager\V2\Folder
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function undeleteFolder($name, $optionalArgs = [])
    {
        $request = new UndeleteFolderRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['undeleteFolder'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'UndeleteFolder',
            $mergedSettings,
            $this->descriptors['undeleteFolder']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the access control policy for a Folder. The returned policy may be
     * empty if no such policy or resource exists. The `resource` field should
     * be the Folder's resource name, e.g. "folders/1234".
     * The caller must have `resourcemanager.folders.getIamPolicy` permission
     * on the identified folder.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedResource = $foldersClient->folderName('[FOLDER]');
     *     $response = $foldersClient->getIamPolicy($formattedResource);
     * } finally {
     *     $foldersClient->close();
     * }
     * ```
     *
     * @param string $resource     REQUIRED: The resource for which the policy is being requested.
     *                             `resource` is usually specified as a path. For example, a Project
     *                             resource is specified as `projects/{project}`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Iam\V1\Policy
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function getIamPolicy($resource, $optionalArgs = [])
    {
        $request = new GetIamPolicyRequest();
        $request->setResource($resource);

        $defaultCallSettings = $this->defaultCallSettings['getIamPolicy'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'GetIamPolicy',
            $mergedSettings,
            $this->descriptors['getIamPolicy']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Sets the access control policy on a Folder, replacing any existing policy.
     * The `resource` field should be the Folder's resource name, e.g.
     * "folders/1234".
     * The caller must have `resourcemanager.folders.setIamPolicy` permission
     * on the identified folder.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedResource = $foldersClient->folderName('[FOLDER]');
     *     $policy = new Policy();
     *     $response = $foldersClient->setIamPolicy($formattedResource, $policy);
     * } finally {
     *     $foldersClient->close();
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
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Iam\V1\Policy
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function setIamPolicy($resource, $policy, $optionalArgs = [])
    {
        $request = new SetIamPolicyRequest();
        $request->setResource($resource);
        $request->setPolicy($policy);

        $defaultCallSettings = $this->defaultCallSettings['setIamPolicy'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'SetIamPolicy',
            $mergedSettings,
            $this->descriptors['setIamPolicy']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Returns permissions that a caller has on the specified Folder.
     * The `resource` field should be the Folder's resource name,
     * e.g. "folders/1234".
     *
     * There are no permissions required for making this API call.
     *
     * Sample code:
     * ```
     * try {
     *     $foldersClient = new FoldersClient();
     *     $formattedResource = $foldersClient->folderName('[FOLDER]');
     *     $permissions = [];
     *     $response = $foldersClient->testIamPermissions($formattedResource, $permissions);
     * } finally {
     *     $foldersClient->close();
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
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Iam\V1\TestIamPermissionsResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function testIamPermissions($resource, $permissions, $optionalArgs = [])
    {
        $request = new TestIamPermissionsRequest();
        $request->setResource($resource);
        $request->setPermissions($permissions);

        $defaultCallSettings = $this->defaultCallSettings['testIamPermissions'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->foldersStub,
            'TestIamPermissions',
            $mergedSettings,
            $this->descriptors['testIamPermissions']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Initiates an orderly shutdown in which preexisting calls continue but new
     * calls are immediately cancelled.
     *
     * @experimental
     */
    public function close()
    {
        $this->foldersStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
