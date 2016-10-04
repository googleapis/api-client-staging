# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/longrunning/operations.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.longrunning Operations API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.longrunning import operations_pb2

_PageDesc = google.gax.PageDescriptor


class OperationsApi(object):
    """
    Manages long-running operations with an API service.

    When an API method normally takes long time to complete, it can be designed
    to return ``Operation`` to the client, and the client can use this
    interface to receive the real response asynchronously by polling the
    operation resource, or pass the operation resource to another API (such as
    Google Cloud Pub/Sub API) to receive the response.  Any API service that
    returns long-running operations should implement the ``Operations`` interface
    so developers can have a consistent client experience.
    """

    SERVICE_ADDRESS = 'longrunning.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_operations': _PageDesc('page_token', 'next_page_token',
                                     'operations')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ()

    _OPERATION_PATH_PATH_TEMPLATE = path_template.PathTemplate(
        'operations/{operation_path=**}')

    @classmethod
    def operation_path_path(cls, operation_path):
        """Returns a fully-qualified operation_path resource name string."""
        return cls._OPERATION_PATH_PATH_TEMPLATE.render({
            'operation_path': operation_path,
        })

    @classmethod
    def match_operation_path_from_operation_path_name(cls,
                                                      operation_path_name):
        """Parses the operation_path from a operation_path resource.

        Args:
          operation_path_name (string): A fully-qualified path representing a operation_path
            resource.

        Returns:
          A string representing the operation_path.
        """
        return cls._OPERATION_PATH_PATH_TEMPLATE.match(
            operation_path_name).get('operation_path')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 metadata_transformer=None,
                 ssl_creds=None,
                 scopes=None,
                 client_config=None,
                 app_name='gax',
                 app_version=_GAX_VERSION):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          ssl_creds (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          metadata_transformer (Callable[[], list]): A function that creates
             the metadata for requests.
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A OperationsApi object.
        """
        if scopes is None:
            scopes = self._ALL_SCOPES
        if client_config is None:
            client_config = {}
        goog_api_client = '{}/{} {} gax/{} python/{}'.format(
            app_name, app_version, self._CODE_GEN_NAME_VERSION,
            self._GAX_VERSION, platform.python_version())
        metadata = [('x-goog-api-client', goog_api_client)]
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'operations_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.longrunning.Operations',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.operations_stub = config.create_stub(
            operations_pb2.OperationsStub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)

        self._get_operation = api_callable.create_api_call(
            self.operations_stub.GetOperation,
            settings=defaults['get_operation'])
        self._list_operations = api_callable.create_api_call(
            self.operations_stub.ListOperations,
            settings=defaults['list_operations'])
        self._cancel_operation = api_callable.create_api_call(
            self.operations_stub.CancelOperation,
            settings=defaults['cancel_operation'])
        self._delete_operation = api_callable.create_api_call(
            self.operations_stub.DeleteOperation,
            settings=defaults['delete_operation'])

    # Service calls
    def get_operation(self, name, options=None):
        """
        Gets the latest state of a long-running operation.  Clients can use this
        method to poll the operation result at intervals as recommended by the API
        service.

        Example:
          >>> from google.cloud.gapic.longrunning import operations_api
          >>> api = operations_api.OperationsApi()
          >>> name = api.operation_path_path('[OPERATION_PATH]')
          >>> response = api.get_operation(name)

        Args:
          name (string): The name of the operation resource.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.longrunning.operations_pb2.Operation` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = operations_pb2.GetOperationRequest(name=name)
        return self._get_operation(request, options)

    def list_operations(self, name, filter_, page_size=0, options=None):
        """
        Lists operations that match the specified filter in the request. If the
        server doesn't support this method, it returns ``UNIMPLEMENTED``.
        NOTE: the ``name`` binding below allows API services to override the binding
        to use different resource name schemes, such as ``users/*/operations``.

        Example:
          >>> from google.cloud.gapic.longrunning import operations_api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = operations_api.OperationsApi()
          >>> name = ''
          >>> filter_ = ''
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_operations(name, filter_):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_operations(name, filter_, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The name of the operation collection.
          filter_ (string): The standard list filter.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.longrunning.operations_pb2.Operation` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = operations_pb2.ListOperationsRequest(
            name=name, filter=filter_, page_size=page_size)
        return self._list_operations(request, options)

    def cancel_operation(self, name, options=None):
        """
        Starts asynchronous cancellation on a long-running operation.  The server
        makes a best effort to cancel the operation, but success is not
        guaranteed.  If the server doesn't support this method, it returns
        ``google.rpc.Code.UNIMPLEMENTED``.  Clients can use
        ``Operations.GetOperation`` or
        other methods to check whether the cancellation succeeded or whether the
        operation completed despite cancellation.

        Example:
          >>> from google.cloud.gapic.longrunning import operations_api
          >>> api = operations_api.OperationsApi()
          >>> name = api.operation_path_path('[OPERATION_PATH]')
          >>> api.cancel_operation(name)

        Args:
          name (string): The name of the operation resource to be cancelled.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = operations_pb2.CancelOperationRequest(name=name)
        self._cancel_operation(request, options)

    def delete_operation(self, name, options=None):
        """
        Deletes a long-running operation. This method indicates that the client is
        no longer interested in the operation result. It does not cancel the
        operation. If the server doesn't support this method, it returns
        ``google.rpc.Code.UNIMPLEMENTED``.

        Example:
          >>> from google.cloud.gapic.longrunning import operations_api
          >>> api = operations_api.OperationsApi()
          >>> name = api.operation_path_path('[OPERATION_PATH]')
          >>> api.delete_operation(name)

        Args:
          name (string): The name of the operation resource to be deleted.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = operations_pb2.DeleteOperationRequest(name=name)
        self._delete_operation(request, options)
