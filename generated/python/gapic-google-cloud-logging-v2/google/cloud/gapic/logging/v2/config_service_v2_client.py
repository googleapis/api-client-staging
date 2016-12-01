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
# https://github.com/google/googleapis/blob/master/google/logging/v2/logging_config.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.logging.v2 ConfigServiceV2 API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.logging.v2 import enums
from google.cloud.grpc.logging.v2 import logging_config_pb2

_PageDesc = google.gax.PageDescriptor


class ConfigServiceV2Client(object):
    """
    Service for configuring sinks used to export log entries outside of
    Stackdriver Logging.
    """

    SERVICE_ADDRESS = 'logging.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_sinks': _PageDesc('page_token', 'next_page_token', 'sinks')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/cloud-platform.read-only',
        'https://www.googleapis.com/auth/logging.admin',
        'https://www.googleapis.com/auth/logging.read',
        'https://www.googleapis.com/auth/logging.write', )

    _PARENT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _SINK_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/sinks/{sink}')

    @classmethod
    def parent_path(cls, project):
        """Returns a fully-qualified parent resource name string."""
        return cls._PARENT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def sink_path(cls, project, sink):
        """Returns a fully-qualified sink resource name string."""
        return cls._SINK_PATH_TEMPLATE.render({
            'project': project,
            'sink': sink,
        })

    @classmethod
    def match_project_from_parent_name(cls, parent_name):
        """Parses the project from a parent resource.

        Args:
          parent_name (string): A fully-qualified path representing a parent
            resource.

        Returns:
          A string representing the project.
        """
        return cls._PARENT_PATH_TEMPLATE.match(parent_name).get('project')

    @classmethod
    def match_project_from_sink_name(cls, sink_name):
        """Parses the project from a sink resource.

        Args:
          sink_name (string): A fully-qualified path representing a sink
            resource.

        Returns:
          A string representing the project.
        """
        return cls._SINK_PATH_TEMPLATE.match(sink_name).get('project')

    @classmethod
    def match_sink_from_sink_name(cls, sink_name):
        """Parses the sink from a sink resource.

        Args:
          sink_name (string): A fully-qualified path representing a sink
            resource.

        Returns:
          A string representing the sink.
        """
        return cls._SINK_PATH_TEMPLATE.match(sink_name).get('sink')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
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
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A ConfigServiceV2Client object.
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
                __name__, 'config_service_v2_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.logging.v2.ConfigServiceV2',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.config_service_v2_stub = config.create_stub(
            logging_config_pb2.ConfigServiceV2Stub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._list_sinks = api_callable.create_api_call(
            self.config_service_v2_stub.ListSinks,
            settings=defaults['list_sinks'])
        self._get_sink = api_callable.create_api_call(
            self.config_service_v2_stub.GetSink, settings=defaults['get_sink'])
        self._create_sink = api_callable.create_api_call(
            self.config_service_v2_stub.CreateSink,
            settings=defaults['create_sink'])
        self._update_sink = api_callable.create_api_call(
            self.config_service_v2_stub.UpdateSink,
            settings=defaults['update_sink'])
        self._delete_sink = api_callable.create_api_call(
            self.config_service_v2_stub.DeleteSink,
            settings=defaults['delete_sink'])

    # Service calls
    def list_sinks(self, parent, page_size=0, options=None):
        """
        Lists sinks.

        Example:
          >>> from google.cloud.gapic.logging.v2 import config_service_v2_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = config_service_v2_client.ConfigServiceV2Client()
          >>> parent = api.parent_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_sinks(parent):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_sinks(parent, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          parent (string): Required. The resource name where this sink was created:

            ::

                \"projects/[PROJECT_ID]\"
                \"organizations/[ORGANIZATION_ID]\"
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_config_pb2.ListSinksRequest(
            parent=parent, page_size=page_size)
        return self._list_sinks(request, options)

    def get_sink(self, sink_name, options=None):
        """
        Gets a sink.

        Example:
          >>> from google.cloud.gapic.logging.v2 import config_service_v2_client
          >>> api = config_service_v2_client.ConfigServiceV2Client()
          >>> sink_name = api.sink_path('[PROJECT]', '[SINK]')
          >>> response = api.get_sink(sink_name)

        Args:
          sink_name (string): Required. The resource name of the sink to return:

            ::

                \"projects/[PROJECT_ID]/sinks/[SINK_ID]\"
                \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\"
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_config_pb2.GetSinkRequest(sink_name=sink_name)
        return self._get_sink(request, options)

    def create_sink(self,
                    parent,
                    sink,
                    unique_writer_identity=False,
                    options=None):
        """
        Creates a sink.

        Example:
          >>> from google.cloud.gapic.logging.v2 import config_service_v2_client
          >>> from google.cloud.grpc.logging.v2 import logging_config_pb2
          >>> api = config_service_v2_client.ConfigServiceV2Client()
          >>> parent = api.parent_path('[PROJECT]')
          >>> sink = logging_config_pb2.LogSink()
          >>> response = api.create_sink(parent, sink)

        Args:
          parent (string): Required. The resource in which to create the sink:

            ::

                \"projects/[PROJECT_ID]\"
                \"organizations/[ORGANIZATION_ID]\"
          sink (:class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink`): Required. The new sink, whose ``name`` parameter is a sink identifier that
            is not already in use.
          unique_writer_identity (bool): Optional. Whether the sink will have a dedicated service account returned
            in the sink's writer_identity. Set this field to be true to export
            logs from one project to a different project. This field is ignored for
            non-project sinks (e.g. organization sinks) because those sinks are
            required to have dedicated service accounts.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_config_pb2.CreateSinkRequest(
            parent=parent,
            sink=sink,
            unique_writer_identity=unique_writer_identity)
        return self._create_sink(request, options)

    def update_sink(self,
                    sink_name,
                    sink,
                    unique_writer_identity=False,
                    options=None):
        """
        Updates or creates a sink.

        Example:
          >>> from google.cloud.gapic.logging.v2 import config_service_v2_client
          >>> from google.cloud.grpc.logging.v2 import logging_config_pb2
          >>> api = config_service_v2_client.ConfigServiceV2Client()
          >>> sink_name = api.sink_path('[PROJECT]', '[SINK]')
          >>> sink = logging_config_pb2.LogSink()
          >>> response = api.update_sink(sink_name, sink)

        Args:
          sink_name (string): Required. The resource name of the sink to update, including the parent
            resource and the sink identifier:

            ::

                \"projects/[PROJECT_ID]/sinks/[SINK_ID]\"
                \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\"

            Example: ``\"projects/my-project-id/sinks/my-sink-id\"``.
          sink (:class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink`): Required. The updated sink, whose name is the same identifier that appears
            as part of ``sinkName``.  If ``sinkName`` does not exist, then
            this method creates a new sink.
          unique_writer_identity (bool): Optional. Whether the sink will have a dedicated service account returned
            in the sink's writer_identity. Set this field to be true to export
            logs from one project to a different project. This field is ignored for
            non-project sinks (e.g. organization sinks) because those sinks are
            required to have dedicated service accounts.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_config_pb2.UpdateSinkRequest(
            sink_name=sink_name,
            sink=sink,
            unique_writer_identity=unique_writer_identity)
        return self._update_sink(request, options)

    def delete_sink(self, sink_name, options=None):
        """
        Deletes a sink.

        Example:
          >>> from google.cloud.gapic.logging.v2 import config_service_v2_client
          >>> api = config_service_v2_client.ConfigServiceV2Client()
          >>> sink_name = api.sink_path('[PROJECT]', '[SINK]')
          >>> api.delete_sink(sink_name)

        Args:
          sink_name (string): Required. The resource name of the sink to delete, including the parent
            resource and the sink identifier:

            ::

                \"projects/[PROJECT_ID]/sinks/[SINK_ID]\"
                \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\"

            It is an error if the sink does not exist.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_config_pb2.DeleteSinkRequest(sink_name=sink_name)
        self._delete_sink(request, options)
