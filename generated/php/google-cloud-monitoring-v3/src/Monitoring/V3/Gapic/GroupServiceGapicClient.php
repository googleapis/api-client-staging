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
 * https://github.com/google/googleapis/blob/master/google/monitoring/v3/group_service.proto
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
use Google\Cloud\Monitoring\V3\CreateGroupRequest;
use Google\Cloud\Monitoring\V3\DeleteGroupRequest;
use Google\Cloud\Monitoring\V3\GetGroupRequest;
use Google\Cloud\Monitoring\V3\Group;
use Google\Cloud\Monitoring\V3\ListGroupMembersRequest;
use Google\Cloud\Monitoring\V3\ListGroupMembersResponse;
use Google\Cloud\Monitoring\V3\ListGroupsRequest;
use Google\Cloud\Monitoring\V3\ListGroupsResponse;
use Google\Cloud\Monitoring\V3\TimeInterval;
use Google\Cloud\Monitoring\V3\UpdateGroupRequest;
use Google\Protobuf\GPBEmpty;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: The Group API lets you inspect and manage your
 * [groups](https://cloud.google.comgoogle.monitoring.v3.Group).
 *
 * A group is a named filter that is used to identify
 * a collection of monitored resources. Groups are typically used to
 * mirror the physical and/or logical topology of the environment.
 * Because group membership is computed dynamically, monitored
 * resources that are started in the future are automatically placed
 * in matching groups. By using a group to name monitored resources in,
 * for example, an alert policy, the target of that alert policy is
 * updated automatically as monitored resources are added and removed
 * from the infrastructure.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $groupServiceClient = new GroupServiceClient();
 * try {
 *     $formattedName = $groupServiceClient->projectName('[PROJECT]');
 *     // Iterate through all elements
 *     $pagedResponse = $groupServiceClient->listGroups($formattedName);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $groupServiceClient->listGroups($formattedName);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $groupServiceClient->close();
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
class GroupServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.monitoring.v3.GroupService';

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
    private static $groupNameTemplate;
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
            'clientConfigPath' => __DIR__.'/../resources/group_service_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/group_service_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/group_service_descriptor_config.php',
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

    private static function getGroupNameTemplate()
    {
        if (self::$groupNameTemplate == null) {
            self::$groupNameTemplate = new PathTemplate('projects/{project}/groups/{group}');
        }

        return self::$groupNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'project' => self::getProjectNameTemplate(),
                'group' => self::getGroupNameTemplate(),
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
     * a group resource.
     *
     * @param string $project
     * @param string $group
     *
     * @return string The formatted group resource.
     * @experimental
     */
    public static function groupName($project, $group)
    {
        return self::getGroupNameTemplate()->render([
            'project' => $project,
            'group' => $group,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - project: projects/{project}
     * - group: projects/{project}/groups/{group}.
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
     * Lists the existing groups.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $formattedName = $groupServiceClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $groupServiceClient->listGroups($formattedName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $groupServiceClient->listGroups($formattedName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The project whose groups are to be listed. The format is
     *                             `"projects/{project_id_or_number}"`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $childrenOfGroup
     *          A group name: `"projects/{project_id_or_number}/groups/{group_id}"`.
     *          Returns groups whose `parentName` field contains the group
     *          name.  If no groups have this parent, the results are empty.
     *     @type string $ancestorsOfGroup
     *          A group name: `"projects/{project_id_or_number}/groups/{group_id}"`.
     *          Returns groups that are ancestors of the specified group.
     *          The groups are returned in order, starting with the immediate parent and
     *          ending with the most distant ancestor.  If the specified group has no
     *          immediate parent, the results are empty.
     *     @type string $descendantsOfGroup
     *          A group name: `"projects/{project_id_or_number}/groups/{group_id}"`.
     *          Returns the descendants of the specified group.  This is a superset of
     *          the results returned by the `childrenOfGroup` filter, and includes
     *          children-of-children, and so forth.
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
    public function listGroups($name, $optionalArgs = [])
    {
        $request = new ListGroupsRequest();
        $request->setName($name);
        if (isset($optionalArgs['childrenOfGroup'])) {
            $request->setChildrenOfGroup($optionalArgs['childrenOfGroup']);
        }
        if (isset($optionalArgs['ancestorsOfGroup'])) {
            $request->setAncestorsOfGroup($optionalArgs['ancestorsOfGroup']);
        }
        if (isset($optionalArgs['descendantsOfGroup'])) {
            $request->setDescendantsOfGroup($optionalArgs['descendantsOfGroup']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListGroups',
            $optionalArgs,
            ListGroupsResponse::class,
            $request
        );
    }

    /**
     * Gets a single group.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $formattedName = $groupServiceClient->groupName('[PROJECT]', '[GROUP]');
     *     $response = $groupServiceClient->getGroup($formattedName);
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The group to retrieve. The format is
     *                             `"projects/{project_id_or_number}/groups/{group_id}"`.
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
     * @return \Google\Cloud\Monitoring\V3\Group
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getGroup($name, $optionalArgs = [])
    {
        $request = new GetGroupRequest();
        $request->setName($name);

        return $this->startCall(
            'GetGroup',
            Group::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new group.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $formattedName = $groupServiceClient->projectName('[PROJECT]');
     *     $group = new Group();
     *     $response = $groupServiceClient->createGroup($formattedName, $group);
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The project in which to create the group. The format is
     *                             `"projects/{project_id_or_number}"`.
     * @param Group  $group        A group definition. It is an error to define the `name` field because
     *                             the system assigns the name.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type bool $validateOnly
     *          If true, validate this request but do not create the group.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Monitoring\V3\Group
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createGroup($name, $group, $optionalArgs = [])
    {
        $request = new CreateGroupRequest();
        $request->setName($name);
        $request->setGroup($group);
        if (isset($optionalArgs['validateOnly'])) {
            $request->setValidateOnly($optionalArgs['validateOnly']);
        }

        return $this->startCall(
            'CreateGroup',
            Group::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates an existing group.
     * You can change any group attributes except `name`.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $group = new Group();
     *     $response = $groupServiceClient->updateGroup($group);
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param Group $group        The new definition of the group.  All fields of the existing group,
     *                            excepting `name`, are replaced with the corresponding fields of this group.
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type bool $validateOnly
     *          If true, validate this request but do not update the existing group.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Monitoring\V3\Group
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateGroup($group, $optionalArgs = [])
    {
        $request = new UpdateGroupRequest();
        $request->setGroup($group);
        if (isset($optionalArgs['validateOnly'])) {
            $request->setValidateOnly($optionalArgs['validateOnly']);
        }

        return $this->startCall(
            'UpdateGroup',
            Group::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes an existing group.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $formattedName = $groupServiceClient->groupName('[PROJECT]', '[GROUP]');
     *     $groupServiceClient->deleteGroup($formattedName);
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The group to delete. The format is
     *                             `"projects/{project_id_or_number}/groups/{group_id}"`.
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
    public function deleteGroup($name, $optionalArgs = [])
    {
        $request = new DeleteGroupRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteGroup',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists the monitored resources that are members of a group.
     *
     * Sample code:
     * ```
     * $groupServiceClient = new GroupServiceClient();
     * try {
     *     $formattedName = $groupServiceClient->groupName('[PROJECT]', '[GROUP]');
     *     // Iterate through all elements
     *     $pagedResponse = $groupServiceClient->listGroupMembers($formattedName);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $groupServiceClient->listGroupMembers($formattedName);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $groupServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The group whose members are listed. The format is
     *                             `"projects/{project_id_or_number}/groups/{group_id}"`.
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
     *          An optional [list filter](https://cloud.google.com/monitoring/api/learn_more#filtering) describing
     *          the members to be returned.  The filter may reference the type, labels, and
     *          metadata of monitored resources that comprise the group.
     *          For example, to return only resources representing Compute Engine VM
     *          instances, use this filter:
     *
     *              resource.type = "gce_instance"
     *     @type TimeInterval $interval
     *          An optional time interval for which results should be returned. Only
     *          members that were part of the group during the specified interval are
     *          included in the response.  If no interval is provided then the group
     *          membership over the last minute is returned.
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
    public function listGroupMembers($name, $optionalArgs = [])
    {
        $request = new ListGroupMembersRequest();
        $request->setName($name);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['interval'])) {
            $request->setInterval($optionalArgs['interval']);
        }

        return $this->getPagedListResponse(
            'ListGroupMembers',
            $optionalArgs,
            ListGroupMembersResponse::class,
            $request
        );
    }
}
