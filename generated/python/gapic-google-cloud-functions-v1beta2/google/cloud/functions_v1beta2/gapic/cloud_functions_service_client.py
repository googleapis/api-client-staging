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
# https://github.com/google/googleapis/blob/master/google/cloud/functions/v1beta2/functions.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.cloud.functions.v1beta2 CloudFunctionsService API."""

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

from google.cloud.functions_v1beta2.gapic import enums
from google.cloud.proto.functions.v1beta2 import functions_pb2
from google.cloud.proto.functions.v1beta2 import operations_pb2
from google.protobuf import empty_pb2

_PageDesc = google.gax.PageDescriptor


class CloudFunctionsServiceClient(object):
    """A service that application uses to manipulate triggers and functions."""

    SERVICE_ADDRESS = 'cloudfunctions.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_functions': _PageDesc('page_token', 'next_page_token',
                                    'functions')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform', )

    _LOCATION_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/locations/{location}')
    _FUNCTION_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/locations/{location}/functions/{function}')

    @classmethod
    def location_path(cls, project, location):
        """Returns a fully-qualified location resource name string."""
        return cls._LOCATION_PATH_TEMPLATE.render({
            'project': project,
            'location': location,
        })

    @classmethod
    def function_path(cls, project, location, function):
        """Returns a fully-qualified function resource name string."""
        return cls._FUNCTION_PATH_TEMPLATE.render({
            'project': project,
            'location': location,
            'function': function,
        })

    @classmethod
    def match_project_from_location_name(cls, location_name):
        """Parses the project from a location resource.

        Args:
          location_name (string): A fully-qualified path representing a location
            resource.

        Returns:
          A string representing the project.
        """
        return cls._LOCATION_PATH_TEMPLATE.match(location_name).get('project')

    @classmethod
    def match_location_from_location_name(cls, location_name):
        """Parses the location from a location resource.

        Args:
          location_name (string): A fully-qualified path representing a location
            resource.

        Returns:
          A string representing the location.
        """
        return cls._LOCATION_PATH_TEMPLATE.match(location_name).get('location')

    @classmethod
    def match_project_from_function_name(cls, function_name):
        """Parses the project from a function resource.

        Args:
          function_name (string): A fully-qualified path representing a function
            resource.

        Returns:
          A string representing the project.
        """
        return cls._FUNCTION_PATH_TEMPLATE.match(function_name).get('project')

    @classmethod
    def match_location_from_function_name(cls, function_name):
        """Parses the location from a function resource.

        Args:
          function_name (string): A fully-qualified path representing a function
            resource.

        Returns:
          A string representing the location.
        """
        return cls._FUNCTION_PATH_TEMPLATE.match(function_name).get('location')

    @classmethod
    def match_function_from_function_name(cls, function_name):
        """Parses the function from a function resource.

        Args:
          function_name (string): A fully-qualified path representing a function
            resource.

        Returns:
          A string representing the function.
        """
        return cls._FUNCTION_PATH_TEMPLATE.match(function_name).get('function')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name=None,
                 app_version='',
                 lib_name=None,
                 lib_version='',
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
          A CloudFunctionsServiceClient object.
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
            'gapic-google-cloud-functions-v1beta2', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'cloud_functions_service_client_config.json')
            .decode())
        defaults = api_callable.construct_settings(
            'google.cloud.functions.v1beta2.CloudFunctionsService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS, )
        self.cloud_functions_service_stub = config.create_stub(
            functions_pb2.CloudFunctionsServiceStub,
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
            metrics_headers=metrics_headers, )

        self._list_functions = api_callable.create_api_call(
            self.cloud_functions_service_stub.ListFunctions,
            settings=defaults['list_functions'])
        self._get_function = api_callable.create_api_call(
            self.cloud_functions_service_stub.GetFunction,
            settings=defaults['get_function'])
        self._create_function = api_callable.create_api_call(
            self.cloud_functions_service_stub.CreateFunction,
            settings=defaults['create_function'])
        self._update_function = api_callable.create_api_call(
            self.cloud_functions_service_stub.UpdateFunction,
            settings=defaults['update_function'])
        self._delete_function = api_callable.create_api_call(
            self.cloud_functions_service_stub.DeleteFunction,
            settings=defaults['delete_function'])
        self._call_function = api_callable.create_api_call(
            self.cloud_functions_service_stub.CallFunction,
            settings=defaults['call_function'])

    # Service calls
    def list_functions(self, location, page_size=None, options=None):
        """
        Returns a list of functions that belong to the requested project.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> location = client.location_path('[PROJECT]', '[LOCATION]')
          >>>
          >>> # Iterate over all results
          >>> for element in client.list_functions(location):
          >>>     # process element
          >>>     pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in client.list_functions(location, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>     for element in page:
          >>>         # process element
          >>>         pass

        Args:
          location (str): The project and location from which the function should be listed,
            specified in the format ``projects/*/locations/*``
            If you want to list functions in all locations, use \"-\" in place of a
            location.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.ListFunctionsRequest(
            location=location, page_size=page_size)
        return self._list_functions(request, options)

    def get_function(self, name, options=None):
        """
        Returns a function with the given name from the requested project.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
          >>> response = client.get_function(name)

        Args:
          name (str): The name of the function which details should be obtained.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.GetFunctionRequest(name=name)
        return self._get_function(request, options)

    def create_function(self, location, function, options=None):
        """
        Creates a new function. If a function with the given name already exists in
        the specified project, the long running operation will return
        ``ALREADY_EXISTS`` error.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> location = client.location_path('[PROJECT]', '[LOCATION]')
          >>> function = {}
          >>> response = client.create_function(location, function)
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
          location (str): The project and location in which the function should be created, specified
            in the format ``projects/*/locations/*``
          function (Union[dict|:class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction`]): Function to be created.
            If a dict is provided, it must be of the same form as the protobuf
            message :class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction`
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax._OperationFuture` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.CreateFunctionRequest(
            location=location, function=function)
        return google.gax._OperationFuture(
            self._create_function(request, options), self.operations_client,
            functions_pb2.CloudFunction,
            operations_pb2.OperationMetadataV1Beta2, options)

    def update_function(self, name, function, options=None):
        """
        Updates existing function.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
          >>> function = {}
          >>> response = client.update_function(name, function)
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
          name (str): The name of the function to be updated.
          function (Union[dict|:class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction`]): New version of the function.
            If a dict is provided, it must be of the same form as the protobuf
            message :class:`google.cloud.proto.functions.v1beta2.functions_pb2.CloudFunction`
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax._OperationFuture` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.UpdateFunctionRequest(
            name=name, function=function)
        return google.gax._OperationFuture(
            self._update_function(request, options), self.operations_client,
            functions_pb2.CloudFunction,
            operations_pb2.OperationMetadataV1Beta2, options)

    def delete_function(self, name, options=None):
        """
        Deletes a function with the given name from the specified project. If the
        given function is used by some trigger, the trigger will be updated to
        remove this function.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
          >>> response = client.delete_function(name)
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
          name (str): The name of the function which should be deleted.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax._OperationFuture` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.DeleteFunctionRequest(name=name)
        return google.gax._OperationFuture(
            self._delete_function(request, options), self.operations_client,
            empty_pb2.Empty, operations_pb2.OperationMetadataV1Beta2, options)

    def call_function(self, name, data, options=None):
        """
        Invokes synchronously deployed function. To be used for testing, very
        limited traffic allowed.

        Example:
          >>> from google.cloud import functions_v1beta2
          >>> client = functions_v1beta2.CloudFunctionsServiceClient()
          >>> name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
          >>> data = ''
          >>> response = client.call_function(name, data)

        Args:
          name (str): The name of the function to be called.
          data (str): Input to be passed to the function.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.functions.v1beta2.functions_pb2.CallFunctionResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = functions_pb2.CallFunctionRequest(name=name, data=data)
        return self._call_function(request, options)
