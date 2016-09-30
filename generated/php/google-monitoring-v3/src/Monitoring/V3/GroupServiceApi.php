<?php
/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

/*
 * GENERATED CODE WARNING
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/monitoring/v3/group_service.proto
 * and updates to that file get reflected here through a refresh process.
 */

namespace Google\Cloud\Monitoring\V3;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\PageStreamingDescriptor;
use Google\GAX\PathTemplate;
use google\monitoring\v3\CreateGroupRequest;
use google\monitoring\v3\DeleteGroupRequest;
use google\monitoring\v3\GetGroupRequest;
use google\monitoring\v3\Group;
use google\monitoring\v3\GroupServiceClient;
use google\monitoring\v3\ListGroupMembersRequest;
use google\monitoring\v3\ListGroupsRequest;
use google\monitoring\v3\TimeInterval;
use google\monitoring\v3\UpdateGroupRequest;

/**
 * Service Description: The Group API lets you inspect and manage your
 * [groups](google.monitoring.v3.Group).
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
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $groupServiceApi = new GroupServiceApi();
 *     $formattedName = GroupServiceApi::formatProjectName("[PROJECT]");
 *     foreach ($groupServiceApi->listGroups($formattedName) as $element) {
 *         // doThingsWith(element);
 *     }
 * } finally {
 *     if (isset($groupServiceApi)) {
 *         $groupServiceApi->close();
 *     }
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class GroupServiceApi
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'monitoring.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    const _GAX_VERSION = '0.1.0';
    const _CODEGEN_NAME = 'GAPIC';
    const _CODEGEN_VERSION = '0.0.0';

    private static $projectNameTemplate;
    private static $groupNameTemplate;

    private $grpcCredentialsHelper;
    private $groupServiceStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project resource.
     */
    public static function formatProjectName($project)
    {
        return self::getProjectNameTemplate()->render([
            'project' => $project,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a group resource.
     */
    public static function formatGroupName($project, $group)
    {
        return self::getGroupNameTemplate()->render([
            'project' => $project,
            'group' => $group,
        ]);
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a project resource.
     */
    public static function parseProjectFromProjectName($projectName)
    {
        return self::getProjectNameTemplate()->match($projectName)['project'];
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a group resource.
     */
    public static function parseProjectFromGroupName($groupName)
    {
        return self::getGroupNameTemplate()->match($groupName)['project'];
    }

    /**
     * Parses the group from the given fully-qualified path which
     * represents a group resource.
     */
    public static function parseGroupFromGroupName($groupName)
    {
        return self::getGroupNameTemplate()->match($groupName)['group'];
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

    private static function getPageStreamingDescriptors()
    {
        $listGroupsPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenField' => 'page_token',
                    'requestPageSizeField' => 'page_size',
                    'responsePageTokenField' => 'next_page_token',
                    'resourceField' => 'group',
                ]);
        $listGroupMembersPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenField' => 'page_token',
                    'requestPageSizeField' => 'page_size',
                    'responsePageTokenField' => 'next_page_token',
                    'resourceField' => 'members',
                ]);

        $pageStreamingDescriptors = [
            'listGroups' => $listGroupsPageStreamingDescriptor,
            'listGroupMembers' => $listGroupMembersPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    // TODO(garrettjones): add channel (when supported in gRPC)
    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'monitoring.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Stackdriver Monitoring API.
     *     @type array $retryingOverride
     *           An associative array of string => RetryOptions, where the keys
     *           are method names (e.g. 'createFoo'), that overrides default retrying
     *           settings. A value of null indicates that the method in question should
     *           not retry.
     *     @type int $timeoutMillis The timeout in milliseconds to use for calls
     *                              that don't use retries. For calls that use retries,
     *                              set the timeout in RetryOptions.
     *                              Default: 30000 (30 seconds)
     *     @type string $appName The codename of the calling service. Default 'gax'.
     *     @type string $appVersion The version of the calling service.
     *                              Default: the current version of GAX.
     *     @type Google\Auth\CredentialsLoader $credentialsLoader
     *                              A CredentialsLoader object created using the
     *                              Google\Auth library.
     * }
     */
    public function __construct($options = [])
    {
        $defaultScopes = [
        ];
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => $defaultScopes,
            'retryingOverride' => null,
            'timeoutMillis' => self::DEFAULT_TIMEOUT_MILLIS,
            'appName' => 'gax',
            'appVersion' => self::_GAX_VERSION,
            'credentialsLoader' => null,
        ];
        $options = array_merge($defaultOptions, $options);

        $headerDescriptor = new AgentHeaderDescriptor([
            'clientName' => $options['appName'],
            'clientVersion' => $options['appVersion'],
            'codeGenName' => self::_CODEGEN_NAME,
            'codeGenVersion' => self::_CODEGEN_VERSION,
            'gaxVersion' => self::_GAX_VERSION,
            'phpVersion' => phpversion(),
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'listGroups' => $defaultDescriptors,
            'getGroup' => $defaultDescriptors,
            'createGroup' => $defaultDescriptors,
            'updateGroup' => $defaultDescriptors,
            'deleteGroup' => $defaultDescriptors,
            'listGroupMembers' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        // TODO load the client config in a more package-friendly way
        // https://github.com/googleapis/toolkit/issues/332
        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/group_service_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.monitoring.v3.GroupService',
                    $clientConfig,
                    $options['retryingOverride'],
                    GrpcConstants::getStatusCodeNames(),
                    $options['timeoutMillis']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (!empty($options['sslCreds'])) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $grpcCredentialsHelperOptions = array_diff_key($options, $defaultOptions);
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($this->scopes, $grpcCredentialsHelperOptions);

        $createGroupServiceStubFunction = function ($hostname, $opts) {
            return new GroupServiceClient($hostname, $opts);
        };
        $this->groupServiceStub = $this->grpcCredentialsHelper->createStub(
            $createGroupServiceStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Lists the existing groups.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $formattedName = GroupServiceApi::formatProjectName("[PROJECT]");
     *     foreach ($groupServiceApi->listGroups($formattedName) as $element) {
     *         // doThingsWith(element);
     *     }
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
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
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return Google\GAX\PagedListResponse
     *
     * @throws Google\GAX\ApiException if the remote call fails
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

        $mergedSettings = $this->defaultCallSettings['listGroups']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'ListGroups',
            $mergedSettings,
            $this->descriptors['listGroups']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets a single group.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $formattedName = GroupServiceApi::formatGroupName("[PROJECT]", "[GROUP]");
     *     $response = $groupServiceApi->getGroup($formattedName);
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
     * }
     * ```
     *
     * @param string $name         The group to retrieve. The format is
     *                             `"projects/{project_id_or_number}/groups/{group_id}"`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return google\monitoring\v3\Group
     *
     * @throws Google\GAX\ApiException if the remote call fails
     */
    public function getGroup($name, $optionalArgs = [])
    {
        $request = new GetGroupRequest();
        $request->setName($name);

        $mergedSettings = $this->defaultCallSettings['getGroup']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'GetGroup',
            $mergedSettings,
            $this->descriptors['getGroup']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Creates a new group.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $formattedName = GroupServiceApi::formatProjectName("[PROJECT]");
     *     $group = new Group();
     *     $response = $groupServiceApi->createGroup($formattedName, $group);
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
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
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return google\monitoring\v3\Group
     *
     * @throws Google\GAX\ApiException if the remote call fails
     */
    public function createGroup($name, $group, $optionalArgs = [])
    {
        $request = new CreateGroupRequest();
        $request->setName($name);
        $request->setGroup($group);
        if (isset($optionalArgs['validateOnly'])) {
            $request->setValidateOnly($optionalArgs['validateOnly']);
        }

        $mergedSettings = $this->defaultCallSettings['createGroup']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'CreateGroup',
            $mergedSettings,
            $this->descriptors['createGroup']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates an existing group.
     * You can change any group attributes except `name`.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $group = new Group();
     *     $response = $groupServiceApi->updateGroup($group);
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
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
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return google\monitoring\v3\Group
     *
     * @throws Google\GAX\ApiException if the remote call fails
     */
    public function updateGroup($group, $optionalArgs = [])
    {
        $request = new UpdateGroupRequest();
        $request->setGroup($group);
        if (isset($optionalArgs['validateOnly'])) {
            $request->setValidateOnly($optionalArgs['validateOnly']);
        }

        $mergedSettings = $this->defaultCallSettings['updateGroup']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'UpdateGroup',
            $mergedSettings,
            $this->descriptors['updateGroup']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes an existing group.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $formattedName = GroupServiceApi::formatGroupName("[PROJECT]", "[GROUP]");
     *     $groupServiceApi->deleteGroup($formattedName);
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
     * }
     * ```
     *
     * @param string $name         The group to delete. The format is
     *                             `"projects/{project_id_or_number}/groups/{group_id}"`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @throws Google\GAX\ApiException if the remote call fails
     */
    public function deleteGroup($name, $optionalArgs = [])
    {
        $request = new DeleteGroupRequest();
        $request->setName($name);

        $mergedSettings = $this->defaultCallSettings['deleteGroup']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'DeleteGroup',
            $mergedSettings,
            $this->descriptors['deleteGroup']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists the monitored resources that are members of a group.
     *
     * Sample code:
     * ```
     * try {
     *     $groupServiceApi = new GroupServiceApi();
     *     $formattedName = GroupServiceApi::formatGroupName("[PROJECT]", "[GROUP]");
     *     foreach ($groupServiceApi->listGroupMembers($formattedName) as $element) {
     *         // doThingsWith(element);
     *     }
     * } finally {
     *     if (isset($groupServiceApi)) {
     *         $groupServiceApi->close();
     *     }
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
     *          An optional [list filter](/monitoring/api/learn_more#filtering) describing
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
     *     @type Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return Google\GAX\PagedListResponse
     *
     * @throws Google\GAX\ApiException if the remote call fails
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

        $mergedSettings = $this->defaultCallSettings['listGroupMembers']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->groupServiceStub,
            'ListGroupMembers',
            $mergedSettings,
            $this->descriptors['listGroupMembers']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Initiates an orderly shutdown in which preexisting calls continue but new
     * calls are immediately cancelled.
     */
    public function close()
    {
        $this->groupServiceStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
