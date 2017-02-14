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
# https://github.com/google/googleapis/blob/master/google/spanner/admin/instance/v1/spanner_instance_admin.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.spanner.admin.instance.v1 InstanceAdmin API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gapic.longrunning import operations_client
from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.spanner_admin_instance.v1 import enums
from google.cloud.proto.spanner.admin.instance.v1 import spanner_instance_admin_pb2
from google.iam.v1 import iam_policy_pb2
from google.iam.v1 import policy_pb2
from google.protobuf import field_mask_pb2

_PageDesc = google.gax.PageDescriptor


class InstanceAdminClient(object):
    """
    Cloud Spanner Instance Admin API

    The Cloud Spanner Instance Admin API can be used to create, delete,
    modify and list instances. Instances are dedicated Cloud Spanner serving
    and storage resources to be used by Cloud Spanner databases.

    Each instance has a \"configuration\", which dictates where the
    serving resources for the Cloud Spanner instance are located (e.g.,
    US-central, Europe). Configurations are created by Google based on
    resource availability.

    Cloud Spanner billing is based on the instances that exist and their
    sizes. After an instance exists, there are no additional
    per-database or per-operation charges for use of the instance
    (though there may be additional network bandwidth charges).
    Instances offer isolation: problems with databases in one instance
    will not affect other instances. However, within an instance
    databases can affect each other. For example, if one database in an
    instance receives a lot of requests and consumes most of the
    instance resources, fewer resources are available for other
    databases in that instance, and their performance may suffer.
    """

    SERVICE_ADDRESS = 'spanner.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_instance_configs': _PageDesc('page_token', 'next_page_token',
                                           'instance_configs'),
        'list_instances': _PageDesc('page_token', 'next_page_token',
                                    'instances')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/spanner.admin', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _INSTANCE_CONFIG_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/instanceConfigs/{instance_config}')
    _INSTANCE_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/instances/{instance}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def instance_config_path(cls, project, instance_config):
        """Returns a fully-qualified instance_config resource name string."""
        return cls._INSTANCE_CONFIG_PATH_TEMPLATE.render({
            'project': project,
            'instance_config': instance_config,
        })

    @classmethod
    def instance_path(cls, project, instance):
        """Returns a fully-qualified instance resource name string."""
        return cls._INSTANCE_PATH_TEMPLATE.render({
            'project': project,
            'instance': instance,
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
    def match_project_from_instance_config_name(cls, instance_config_name):
        """Parses the project from a instance_config resource.

        Args:
          instance_config_name (string): A fully-qualified path representing a instance_config
            resource.

        Returns:
          A string representing the project.
        """
        return cls._INSTANCE_CONFIG_PATH_TEMPLATE.match(
            instance_config_name).get('project')

    @classmethod
    def match_instance_config_from_instance_config_name(cls,
                                                        instance_config_name):
        """Parses the instance_config from a instance_config resource.

        Args:
          instance_config_name (string): A fully-qualified path representing a instance_config
            resource.

        Returns:
          A string representing the instance_config.
        """
        return cls._INSTANCE_CONFIG_PATH_TEMPLATE.match(
            instance_config_name).get('instance_config')

    @classmethod
    def match_project_from_instance_name(cls, instance_name):
        """Parses the project from a instance resource.

        Args:
          instance_name (string): A fully-qualified path representing a instance
            resource.

        Returns:
          A string representing the project.
        """
        return cls._INSTANCE_PATH_TEMPLATE.match(instance_name).get('project')

    @classmethod
    def match_instance_from_instance_name(cls, instance_name):
        """Parses the instance from a instance resource.

        Args:
          instance_name (string): A fully-qualified path representing a instance
            resource.

        Returns:
          A string representing the instance.
        """
        return cls._INSTANCE_PATH_TEMPLATE.match(instance_name).get('instance')

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
          A InstanceAdminClient object.
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
            'gapic-google-cloud-spanner-admin-instance-v1', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'instance_admin_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.spanner.admin.instance.v1.InstanceAdmin',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.instance_admin_stub = config.create_stub(
            spanner_instance_admin_pb2.InstanceAdminStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self.operations_client = operations_client.OperationsClient(
            service_path=service_path,
            port=port,
            channel=channel,
            credentials=credentials,
            ssl_credentials=ssl_credentials,
            scopes=scopes,
            client_config=client_config,
            app_name=app_name,
            app_version=app_version)

        self._list_instance_configs = api_callable.create_api_call(
            self.instance_admin_stub.ListInstanceConfigs,
            settings=defaults['list_instance_configs'])
        self._get_instance_config = api_callable.create_api_call(
            self.instance_admin_stub.GetInstanceConfig,
            settings=defaults['get_instance_config'])
        self._list_instances = api_callable.create_api_call(
            self.instance_admin_stub.ListInstances,
            settings=defaults['list_instances'])
        self._get_instance = api_callable.create_api_call(
            self.instance_admin_stub.GetInstance,
            settings=defaults['get_instance'])
        self._create_instance = api_callable.create_api_call(
            self.instance_admin_stub.CreateInstance,
            settings=defaults['create_instance'])
        self._update_instance = api_callable.create_api_call(
            self.instance_admin_stub.UpdateInstance,
            settings=defaults['update_instance'])
        self._delete_instance = api_callable.create_api_call(
            self.instance_admin_stub.DeleteInstance,
            settings=defaults['delete_instance'])
        self._set_iam_policy = api_callable.create_api_call(
            self.instance_admin_stub.SetIamPolicy,
            settings=defaults['set_iam_policy'])
        self._get_iam_policy = api_callable.create_api_call(
            self.instance_admin_stub.GetIamPolicy,
            settings=defaults['get_iam_policy'])
        self._test_iam_permissions = api_callable.create_api_call(
            self.instance_admin_stub.TestIamPermissions,
            settings=defaults['test_iam_permissions'])

    # Service calls
    def list_instance_configs(self, parent, page_size=0, options=None):
        """
        Lists the supported instance configurations for a given project.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> parent = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_instance_configs(parent):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_instance_configs(parent, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          parent (string): Required. The name of the project for which a list of supported instance
            configurations is requested. Values are of the form
            ``projects/<project>``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.InstanceConfig` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.ListInstanceConfigsRequest(
            parent=parent, page_size=page_size)
        return self._list_instance_configs(request, options)

    def get_instance_config(self, name, options=None):
        """
        Gets information about a particular instance configuration.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> name = api.instance_config_path('[PROJECT]', '[INSTANCE_CONFIG]')
          >>> response = api.get_instance_config(name)

        Args:
          name (string): Required. The name of the requested instance configuration. Values are of
            the form ``projects/<project>/instanceConfigs/<config>``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.InstanceConfig` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.GetInstanceConfigRequest(
            name=name)
        return self._get_instance_config(request, options)

    def list_instances(self, parent, page_size=0, filter_='', options=None):
        """
        Lists all instances in the given project.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> parent = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_instances(parent):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_instances(parent, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          parent (string): Required. The name of the project for which a list of instances is
            requested. Values are of the form ``projects/<project>``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          filter_ (string): An expression for filtering the results of the request. Filter rules are
            case insensitive. The fields eligible for filtering are:

              * name
              * display_name
              * labels.key where key is the name of a label

            Some examples of using filters are:

              * name:* --> The instance has a name.
              * name:Howl --> The instance's name contains the string \"howl\".
              * name:HOWL --> Equivalent to above.
              * NAME:howl --> Equivalent to above.
              * labels.env:* --> The instance has the label \"env\".
              * labels.env:dev --> The instance has the label \"env\" and the value of
            ::

                                   the label contains the string \"dev\".
              * name:howl labels.env:dev --> The instance's name contains \"howl\" and
            ::

                                             it has the label \"env\" with its value
                                             containing \"dev\".
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.Instance` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.ListInstancesRequest(
            parent=parent, page_size=page_size, filter=filter_)
        return self._list_instances(request, options)

    def get_instance(self, name, options=None):
        """
        Gets information about a particular instance.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> name = api.instance_path('[PROJECT]', '[INSTANCE]')
          >>> response = api.get_instance(name)

        Args:
          name (string): Required. The name of the requested instance. Values are of the form
            ``projects/<project>/instances/<instance>``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.Instance` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.GetInstanceRequest(name=name)
        return self._get_instance(request, options)

    def create_instance(self, parent, instance_id, instance, options=None):
        """
        Creates an instance and begins preparing it to begin serving. The
        returned ``long-running operation``
        can be used to track the progress of preparing the new
        instance. The instance name is assigned by the caller. If the
        named instance already exists, ``CreateInstance`` returns
        ``ALREADY_EXISTS``.
        Immediately upon completion of this request:
        * The instance is readable via the API, with all requested attributes
        but no allocated resources. Its state is `CREATING`.
        Until completion of the returned operation:
        * Cancelling the operation renders the instance immediately unreadable
        via the API.
        * The instance can be deleted.
        * All other attempts to modify the instance are rejected.
        Upon completion of the returned operation:
        * Billing for all successfully-allocated resources begins (some types
        may have lower than the requested levels).
        * Databases can be created in the instance.
        * The instance's allocated resource levels are readable via the API.
        * The instance's state becomes ``READY``.
        The returned ``long-running operation`` will
        have a name of the format ``<instance_name>/operations/<operation_id>`` and
        can be used to track creation of the instance.  The
        ``metadata`` field type is
        ``CreateInstanceMetadata``.
        The ``response`` field type is
        ``Instance``, if successful.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> from google.cloud.proto.spanner.admin.instance.v1 import spanner_instance_admin_pb2
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> parent = api.project_path('[PROJECT]')
          >>> instance_id = ''
          >>> instance = spanner_instance_admin_pb2.Instance()
          >>> response = api.create_instance(parent, instance_id, instance)
          >>>
          >>> def callback(operation_future):
          >>>     # Handle result.
          >>>     result = operation_future.result()
          >>>
          >>> response.add_done_callback(callback)
          >>>
          >>> # Handle metadata.
          >>> metadata = response.metadata()

        Args:
          parent (string): Required. The name of the project in which to create the instance. Values
            are of the form ``projects/<project>``.
          instance_id (string): Required. The ID of the instance to create.  Valid identifiers are of the
            form ``[a-z][-a-z0-9]*[a-z0-9]`` and must be between 6 and 30 characters in
            length.
          instance (:class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.Instance`): Required. The instance to create.  The name may be omitted, but if
            specified must be ``<parent>/instances/<instance_id>``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax._OperationFuture` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.CreateInstanceRequest(
            parent=parent, instance_id=instance_id, instance=instance)
        return google.gax._OperationFuture(
            self._create_instance(request, options), self.operations_client,
            spanner_instance_admin_pb2.Instance,
            spanner_instance_admin_pb2.CreateInstanceMetadata, options)

    def update_instance(self, instance, field_mask, options=None):
        """
        Updates an instance, and begins allocating or releasing resources
        as requested. The returned [long-running
        operation][google.longrunning.Operation] can be used to track the
        progress of updating the instance. If the named instance does not
        exist, returns ``NOT_FOUND``.
        Immediately upon completion of this request:
        * For resource types for which a decrease in the instance's allocation
        has been requested, billing is based on the newly-requested level.
        Until completion of the returned operation:
        * Cancelling the operation sets its metadata's
        [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
        restoring resources to their pre-request values. The operation
        is guaranteed to succeed at undoing all resource changes,
        after which point it terminates with a `CANCELLED` status.
        * All other attempts to modify the instance are rejected.
        * Reading the instance via the API continues to give the pre-request
        resource levels.
        Upon completion of the returned operation:
        * Billing begins for all successfully-allocated resources (some types
        may have lower than the requested levels).
        * All newly-reserved resources are available for serving the instance's
        tables.
        * The instance's new resource levels are readable via the API.
        The returned ``long-running operation`` will
        have a name of the format ``<instance_name>/operations/<operation_id>`` and
        can be used to track the instance modification.  The
        ``metadata`` field type is
        ``UpdateInstanceMetadata``.
        The ``response`` field type is
        ``Instance``, if successful.
        Authorization requires ``spanner.instances.update`` permission on
        resource ``name``.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> from google.cloud.proto.spanner.admin.instance.v1 import spanner_instance_admin_pb2
          >>> from google.protobuf import field_mask_pb2
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> instance = spanner_instance_admin_pb2.Instance()
          >>> field_mask = field_mask_pb2.FieldMask()
          >>> response = api.update_instance(instance, field_mask)
          >>>
          >>> def callback(operation_future):
          >>>     # Handle result.
          >>>     result = operation_future.result()
          >>>
          >>> response.add_done_callback(callback)
          >>>
          >>> # Handle metadata.
          >>> metadata = response.metadata()

        Args:
          instance (:class:`google.cloud.proto.spanner.admin.instance.v1.spanner_instance_admin_pb2.Instance`): Required. The instance to update, which must always include the instance
            name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
          field_mask (:class:`google.protobuf.field_mask_pb2.FieldMask`): Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
            The field mask must always be specified; this prevents any future fields in
            [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
            about them.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax._OperationFuture` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.UpdateInstanceRequest(
            instance=instance, field_mask=field_mask)
        return google.gax._OperationFuture(
            self._update_instance(request, options), self.operations_client,
            spanner_instance_admin_pb2.Instance,
            spanner_instance_admin_pb2.UpdateInstanceMetadata, options)

    def delete_instance(self, name, options=None):
        """
        Deletes an instance.
        Immediately upon completion of the request:
        * Billing ceases for all of the instance's reserved resources.
        Soon afterward:
        * The instance and *all of its databases* immediately and
        irrevocably disappear from the API. All data in the databases
        is permanently deleted.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> name = api.instance_path('[PROJECT]', '[INSTANCE]')
          >>> api.delete_instance(name)

        Args:
          name (string): Required. The name of the instance to be deleted. Values are of the form
            ``projects/<project>/instances/<instance>``
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = spanner_instance_admin_pb2.DeleteInstanceRequest(name=name)
        self._delete_instance(request, options)

    def set_iam_policy(self, resource, policy, options=None):
        """
        Sets the access control policy on an instance resource. Replaces any
        existing policy.
        Authorization requires ``spanner.instances.setIamPolicy`` on
        ``resource``.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> from google.iam.v1 import policy_pb2
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> resource = api.instance_path('[PROJECT]', '[INSTANCE]')
          >>> policy = policy_pb2.Policy()
          >>> response = api.set_iam_policy(resource, policy)

        Args:
          resource (string): REQUIRED: The resource for which the policy is being specified.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          policy (:class:`google.iam.v1.policy_pb2.Policy`): REQUIRED: The complete policy to be applied to the ``resource``. The size of
            the policy is limited to a few 10s of KB. An empty policy is a
            valid policy but certain Cloud Platform services (such as Projects)
            might reject them.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.SetIamPolicyRequest(
            resource=resource, policy=policy)
        return self._set_iam_policy(request, options)

    def get_iam_policy(self, resource, options=None):
        """
        Gets the access control policy for an instance resource. Returns an empty
        policy if an instance exists but does not have a policy set.
        Authorization requires ``spanner.instances.getIamPolicy`` on
        ``resource``.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> resource = api.instance_path('[PROJECT]', '[INSTANCE]')
          >>> response = api.get_iam_policy(resource)

        Args:
          resource (string): REQUIRED: The resource for which the policy is being requested.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.GetIamPolicyRequest(resource=resource)
        return self._get_iam_policy(request, options)

    def test_iam_permissions(self, resource, permissions, options=None):
        """
        Returns permissions that the caller has on the specified instance resource.
        Attempting this RPC on a non-existent Cloud Spanner instance resource will
        result in a NOT_FOUND error if the user has ``spanner.instances.list``
        permission on the containing Google Cloud Project. Otherwise returns an
        empty set of permissions.

        Example:
          >>> from google.cloud.gapic.spanner_admin_instance.v1 import instance_admin_client
          >>> api = instance_admin_client.InstanceAdminClient()
          >>> resource = api.instance_path('[PROJECT]', '[INSTANCE]')
          >>> permissions = []
          >>> response = api.test_iam_permissions(resource, permissions)

        Args:
          resource (string): REQUIRED: The resource for which the policy detail is being requested.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          permissions (list[string]): The set of permissions to check for the ``resource``. Permissions with
            wildcards (such as '*' or 'storage.*') are not allowed. For more
            information see
            `IAM Overview <https://cloud.google.com/iam/docs/overview#permissions>`_.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.iam_policy_pb2.TestIamPermissionsResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.TestIamPermissionsRequest(
            resource=resource, permissions=permissions)
        return self._test_iam_permissions(request, options)
