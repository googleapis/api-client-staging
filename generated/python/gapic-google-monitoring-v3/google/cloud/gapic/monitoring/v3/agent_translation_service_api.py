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
# https://github.com/google/googleapis/blob/master/google/monitoring/v3/agent_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.monitoring.v3 AgentTranslationService API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.api import monitored_resource_pb2
from google.cloud.gapic.monitoring.v3 import enums
from google.monitoring.v3 import agent_pb2
from google.monitoring.v3 import agent_service_pb2


class AgentTranslationServiceApi(object):
    """
    The AgentTranslation API allows ``collectd``-based agents to
    write time series data to Cloud Monitoring.
    See [google.monitoring.v3.MetricService.CreateTimeSeries] instead.
    """

    SERVICE_ADDRESS = 'monitoring.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ()

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

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
          A AgentTranslationServiceApi object.
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
                __name__, 'agent_translation_service_client_config.json')
            .decode())
        defaults = api_callable.construct_settings(
            'google.monitoring.v3.AgentTranslationService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata})
        self.agent_translation_service_stub = config.create_stub(
            agent_service_pb2.AgentTranslationServiceStub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)

        self._create_collectd_time_series = api_callable.create_api_call(
            self.agent_translation_service_stub.CreateCollectdTimeSeries,
            settings=defaults['create_collectd_time_series'])

    # Service calls
    def create_collectd_time_series(self,
                                    name,
                                    resource,
                                    collectd_version,
                                    collectd_payloads,
                                    options=None):
        """
        **Stackdriver Monitoring Agent only:** Creates a new time series.
        <aside class=\"caution\">This method is only for use by the Google Monitoring Agent.
        Use ``projects.timeSeries.create``
        instead.</aside>

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import agent_translation_service_api
          >>> from google.api import monitored_resource_pb2
          >>> from google.monitoring.v3 import agent_pb2
          >>> api = agent_translation_service_api.AgentTranslationServiceApi()
          >>> name = api.project_path('[PROJECT]')
          >>> resource = monitored_resource_pb2.MonitoredResource()
          >>> collectd_version = ''
          >>> collectd_payloads = []
          >>> api.create_collectd_time_series(name, resource, collectd_version, collectd_payloads)

        Args:
          name (string): The project in which to create the time series. The format is
            ``\"projects/PROJECT_ID_OR_NUMBER\"``.
          resource (:class:`google.api.monitored_resource_pb2.MonitoredResource`): The monitored resource associated with the time series.
          collectd_version (string): The version of ``collectd`` that collected the data. Example: ``\"5.3.0-192.el6\"``.
          collectd_payloads (list[:class:`google.monitoring.v3.agent_pb2.CollectdPayload`]): The ``collectd`` payloads representing the time series data.
            You must not include more than a single point for each
            time series, so no two payloads can have the same values
            for all of the fields ``plugin``, ``plugin_instance``, ``type``, and ``type_instance``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = agent_service_pb2.CreateCollectdTimeSeriesRequest(
            name=name,
            resource=resource,
            collectd_version=collectd_version,
            collectd_payloads=collectd_payloads)
        self._create_collectd_time_series(request, options)
