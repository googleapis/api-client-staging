# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/monitoring/v3/group_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.monitoring.v3 GroupService API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.monitoring.v3 import enums
from google.cloud.proto.monitoring.v3 import common_pb2
from google.cloud.proto.monitoring.v3 import group_pb2
from google.cloud.proto.monitoring.v3 import group_service_pb2

_PageDesc = google.gax.PageDescriptor


class GroupServiceClient(object):
    """
    The Group API lets you inspect and manage your
    `groups <https://cloud.google.comgoogle.monitoring.v3.Group>`_.

    A group is a named filter that is used to identify
    a collection of monitored resources. Groups are typically used to
    mirror the physical and/or logical topology of the environment.
    Because group membership is computed dynamically, monitored
    resources that are started in the future are automatically placed
    in matching groups. By using a group to name monitored resources in,
    for example, an alert policy, the target of that alert policy is
    updated automatically as monitored resources are added and removed
    from the infrastructure.
    """

    SERVICE_ADDRESS = 'monitoring.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_groups': _PageDesc('page_token', 'next_page_token', 'group'),
        'list_group_members': _PageDesc('page_token', 'next_page_token',
                                        'members')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/monitoring',
        'https://www.googleapis.com/auth/monitoring.read',
        'https://www.googleapis.com/auth/monitoring.write', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _GROUP_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/groups/{group}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def group_path(cls, project, group):
        """Returns a fully-qualified group resource name string."""
        return cls._GROUP_PATH_TEMPLATE.render({
            'project': project,
            'group': group,
        })

    @classmethod
    def match_project_from_project_name(cls, project_name):
        """Parses the project from a project resource.

        Args:
          project_name (string): A fully-qualified path representing a project
            resource.

        Returns:
          A string representing the project.
        """
        return cls._PROJECT_PATH_TEMPLATE.match(project_name).get('project')

    @classmethod
    def match_project_from_group_name(cls, group_name):
        """Parses the project from a group resource.

        Args:
          group_name (string): A fully-qualified path representing a group
            resource.

        Returns:
          A string representing the project.
        """
        return cls._GROUP_PATH_TEMPLATE.match(group_name).get('project')

    @classmethod
    def match_group_from_group_name(cls, group_name):
        """Parses the group from a group resource.

        Args:
          group_name (string): A fully-qualified path representing a group
            resource.

        Returns:
          A string representing the group.
        """
        return cls._GROUP_PATH_TEMPLATE.match(group_name).get('group')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name=None,
                 app_version='UNKNOWN',
                 lib_name=None,
                 lib_version='UNKNOWN',
                 metrics_headers=()):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The name of the application calling
            the service. Recommended for analytics purposes.
          app_version (string): The version of the application calling
            the service. Recommended for analytics purposes.
          lib_name (string): The API library software used for calling
            the service. (Unless you are writing an API client itself,
            leave this as default.)
          lib_version (string): The API library software version used
            for calling the service. (Unless you are writing an API client
            itself, leave this as default.)
          metrics_headers (dict): A dictionary of values for tracking
            client library metrics. Ultimately serializes to a string
            (e.g. 'foo/1.2.3 bar/3.14.1'). This argument should be
            considered private.

        Returns:
          A GroupServiceClient object.
        """
        # Unless the calling application specifically requested
        # OAuth scopes, request everything.
        if scopes is None:
            scopes = self._ALL_SCOPES

        # Initialize an empty client config, if none is set.
        if client_config is None:
            client_config = {}

        # Initialize metrics_headers as an ordered dictionary
        # (cuts down on cardinality of the resulting string slightly).
        metrics_headers = collections.OrderedDict(metrics_headers)
        metrics_headers['gl-python'] = platform.python_version()

        # The library may or may not be set, depending on what is
        # calling this client. Newer client libraries set the library name
        # and version.
        if lib_name:
            metrics_headers[lib_name] = lib_version

        # Finally, track the GAPIC package version.
        metrics_headers['gapic'] = pkg_resources.get_distribution(
            'gapic-google-cloud-monitoring-v3', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'group_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.monitoring.v3.GroupService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.group_service_stub = config.create_stub(
            group_service_pb2.GroupServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._list_groups = api_callable.create_api_call(
            self.group_service_stub.ListGroups,
            settings=defaults['list_groups'])
        self._get_group = api_callable.create_api_call(
            self.group_service_stub.GetGroup, settings=defaults['get_group'])
        self._create_group = api_callable.create_api_call(
            self.group_service_stub.CreateGroup,
            settings=defaults['create_group'])
        self._update_group = api_callable.create_api_call(
            self.group_service_stub.UpdateGroup,
            settings=defaults['update_group'])
        self._delete_group = api_callable.create_api_call(
            self.group_service_stub.DeleteGroup,
            settings=defaults['delete_group'])
        self._list_group_members = api_callable.create_api_call(
            self.group_service_stub.ListGroupMembers,
            settings=defaults['list_group_members'])

    # Service calls
    def list_groups(self,
                    name,
                    children_of_group=None,
                    ancestors_of_group=None,
                    descendants_of_group=None,
                    page_size=0,
                    options=None):
        """
        Lists the existing groups.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = group_service_client.GroupServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_groups(name):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_groups(name, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The project whose groups are to be listed. The format is
            ``\"projects/{project_id_or_number}\"``.
          children_of_group (string): A group name: ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
            Returns groups whose ``parentName`` field contains the group
            name.  If no groups have this parent, the results are empty.
          ancestors_of_group (string): A group name: ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
            Returns groups that are ancestors of the specified group.
            The groups are returned in order, starting with the immediate parent and
            ending with the most distant ancestor.  If the specified group has no
            immediate parent, the results are empty.
          descendants_of_group (string): A group name: ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
            Returns the descendants of the specified group.  This is a superset of
            the results returned by the ``childrenOfGroup`` filter, and includes
            children-of-children, and so forth.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.monitoring.v3.group_pb2.Group` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = group_service_pb2.ListGroupsRequest(
            name=name,
            children_of_group=children_of_group,
            ancestors_of_group=ancestors_of_group,
            descendants_of_group=descendants_of_group,
            page_size=page_size)
        return self._list_groups(request, options)

    def get_group(self, name, options=None):
        """
        Gets a single group.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> api = group_service_client.GroupServiceClient()
          >>> name = api.group_path('[PROJECT]', '[GROUP]')
          >>> response = api.get_group(name)

        Args:
          name (string): The group to retrieve. The format is
            ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.monitoring.v3.group_pb2.Group` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = group_service_pb2.GetGroupRequest(name=name)
        return self._get_group(request, options)

    def create_group(self, name, group, validate_only=False, options=None):
        """
        Creates a new group.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> from google.cloud.proto.monitoring.v3 import group_pb2
          >>> api = group_service_client.GroupServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>> group = group_pb2.Group()
          >>> response = api.create_group(name, group)

        Args:
          name (string): The project in which to create the group. The format is
            ``\"projects/{project_id_or_number}\"``.
          group (:class:`google.cloud.proto.monitoring.v3.group_pb2.Group`): A group definition. It is an error to define the ``name`` field because
            the system assigns the name.
          validate_only (bool): If true, validate this request but do not create the group.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.monitoring.v3.group_pb2.Group` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = group_service_pb2.CreateGroupRequest(
            name=name, group=group, validate_only=validate_only)
        return self._create_group(request, options)

    def update_group(self, group, validate_only=False, options=None):
        """
        Updates an existing group.
        You can change any group attributes except ``name``.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> from google.cloud.proto.monitoring.v3 import group_pb2
          >>> api = group_service_client.GroupServiceClient()
          >>> group = group_pb2.Group()
          >>> response = api.update_group(group)

        Args:
          group (:class:`google.cloud.proto.monitoring.v3.group_pb2.Group`): The new definition of the group.  All fields of the existing group,
            excepting ``name``, are replaced with the corresponding fields of this group.
          validate_only (bool): If true, validate this request but do not update the existing group.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.monitoring.v3.group_pb2.Group` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = group_service_pb2.UpdateGroupRequest(
            group=group, validate_only=validate_only)
        return self._update_group(request, options)

    def delete_group(self, name, options=None):
        """
        Deletes an existing group.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> api = group_service_client.GroupServiceClient()
          >>> name = api.group_path('[PROJECT]', '[GROUP]')
          >>> api.delete_group(name)

        Args:
          name (string): The group to delete. The format is
            ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = group_service_pb2.DeleteGroupRequest(name=name)
        self._delete_group(request, options)

    def list_group_members(self,
                           name,
                           page_size=0,
                           filter_='',
                           interval=None,
                           options=None):
        """
        Lists the monitored resources that are members of a group.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import group_service_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = group_service_client.GroupServiceClient()
          >>> name = api.group_path('[PROJECT]', '[GROUP]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_group_members(name):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_group_members(name, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The group whose members are listed. The format is
            ``\"projects/{project_id_or_number}/groups/{group_id}\"``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          filter_ (string): An optional `list filter <https://cloud.google.com/monitoring/api/learn_more#filtering>`_ describing
            the members to be returned.  The filter may reference the type, labels, and
            metadata of monitored resources that comprise the group.
            For example, to return only resources representing Compute Engine VM
            instances, use this filter:

            ::

                resource.type = \"gce_instance\"
          interval (:class:`google.cloud.proto.monitoring.v3.common_pb2.TimeInterval`): An optional time interval for which results should be returned. Only
            members that were part of the group during the specified interval are
            included in the response.  If no interval is provided then the group
            membership over the last minute is returned.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.api.monitored_resource_pb2.MonitoredResource` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if interval is None:
            interval = common_pb2.TimeInterval()
        request = group_service_pb2.ListGroupMembersRequest(
            name=name, page_size=page_size, filter=filter_, interval=interval)
        return self._list_group_members(request, options)
