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
# https://github.com/google/googleapis/blob/master/google/logging/v2/logging_metrics.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.logging.v2 MetricsServiceV2 API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.logging.v2 import enums
from google.cloud.proto.logging.v2 import logging_metrics_pb2

_PageDesc = google.gax.PageDescriptor


class MetricsServiceV2Client(object):
    """Service for configuring logs-based metrics."""

    SERVICE_ADDRESS = 'logging.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_log_metrics': _PageDesc('page_token', 'next_page_token',
                                      'metrics')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/cloud-platform.read-only',
        'https://www.googleapis.com/auth/logging.admin',
        'https://www.googleapis.com/auth/logging.read',
        'https://www.googleapis.com/auth/logging.write', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _METRIC_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/metrics/{metric}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def metric_path(cls, project, metric):
        """Returns a fully-qualified metric resource name string."""
        return cls._METRIC_PATH_TEMPLATE.render({
            'project': project,
            'metric': metric,
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
    def match_project_from_metric_name(cls, metric_name):
        """Parses the project from a metric resource.

        Args:
          metric_name (string): A fully-qualified path representing a metric
            resource.

        Returns:
          A string representing the project.
        """
        return cls._METRIC_PATH_TEMPLATE.match(metric_name).get('project')

    @classmethod
    def match_metric_from_metric_name(cls, metric_name):
        """Parses the metric from a metric resource.

        Args:
          metric_name (string): A fully-qualified path representing a metric
            resource.

        Returns:
          A string representing the metric.
        """
        return cls._METRIC_PATH_TEMPLATE.match(metric_name).get('metric')

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
          A MetricsServiceV2Client object.
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
            'gapic-google-cloud-logging-v2', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'metrics_service_v2_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.logging.v2.MetricsServiceV2',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS, )
        self.metrics_service_v2_stub = config.create_stub(
            logging_metrics_pb2.MetricsServiceV2Stub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._list_log_metrics = api_callable.create_api_call(
            self.metrics_service_v2_stub.ListLogMetrics,
            settings=defaults['list_log_metrics'])
        self._get_log_metric = api_callable.create_api_call(
            self.metrics_service_v2_stub.GetLogMetric,
            settings=defaults['get_log_metric'])
        self._create_log_metric = api_callable.create_api_call(
            self.metrics_service_v2_stub.CreateLogMetric,
            settings=defaults['create_log_metric'])
        self._update_log_metric = api_callable.create_api_call(
            self.metrics_service_v2_stub.UpdateLogMetric,
            settings=defaults['update_log_metric'])
        self._delete_log_metric = api_callable.create_api_call(
            self.metrics_service_v2_stub.DeleteLogMetric,
            settings=defaults['delete_log_metric'])

    # Service calls
    def list_log_metrics(self, parent, page_size=0, options=None):
        """
        Lists logs-based metrics.

        Example:
          >>> from google.cloud.gapic.logging.v2 import metrics_service_v2_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = metrics_service_v2_client.MetricsServiceV2Client()
          >>> parent = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_log_metrics(parent):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_log_metrics(parent, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          parent (string): Required. The name of the project containing the metrics:

            ::

                \"projects/[PROJECT_ID]\"
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = logging_metrics_pb2.ListLogMetricsRequest(
            parent=parent, page_size=page_size)
        return self._list_log_metrics(request, options)

    def get_log_metric(self, metric_name, options=None):
        """
        Gets a logs-based metric.

        Example:
          >>> from google.cloud.gapic.logging.v2 import metrics_service_v2_client
          >>> api = metrics_service_v2_client.MetricsServiceV2Client()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> response = api.get_log_metric(metric_name)

        Args:
          metric_name (string): The resource name of the desired metric:

            ::

                \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = logging_metrics_pb2.GetLogMetricRequest(
            metric_name=metric_name)
        return self._get_log_metric(request, options)

    def create_log_metric(self, parent, metric, options=None):
        """
        Creates a logs-based metric.

        Example:
          >>> from google.cloud.gapic.logging.v2 import metrics_service_v2_client
          >>> from google.cloud.proto.logging.v2 import logging_metrics_pb2
          >>> api = metrics_service_v2_client.MetricsServiceV2Client()
          >>> parent = api.project_path('[PROJECT]')
          >>> metric = logging_metrics_pb2.LogMetric()
          >>> response = api.create_log_metric(parent, metric)

        Args:
          parent (string): The resource name of the project in which to create the metric:

            ::

                \"projects/[PROJECT_ID]\"

            The new metric must be provided in the request.
          metric (:class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric`): The new logs-based metric, which must not have an identifier that
            already exists.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = logging_metrics_pb2.CreateLogMetricRequest(
            parent=parent, metric=metric)
        return self._create_log_metric(request, options)

    def update_log_metric(self, metric_name, metric, options=None):
        """
        Creates or updates a logs-based metric.

        Example:
          >>> from google.cloud.gapic.logging.v2 import metrics_service_v2_client
          >>> from google.cloud.proto.logging.v2 import logging_metrics_pb2
          >>> api = metrics_service_v2_client.MetricsServiceV2Client()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> metric = logging_metrics_pb2.LogMetric()
          >>> response = api.update_log_metric(metric_name, metric)

        Args:
          metric_name (string): The resource name of the metric to update:

            ::

                \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"

            The updated metric must be provided in the request and it's
            ``name`` field must be the same as ``[METRIC_ID]`` If the metric
            does not exist in ``[PROJECT_ID]``, then a new metric is created.
          metric (:class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric`): The updated metric.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = logging_metrics_pb2.UpdateLogMetricRequest(
            metric_name=metric_name, metric=metric)
        return self._update_log_metric(request, options)

    def delete_log_metric(self, metric_name, options=None):
        """
        Deletes a logs-based metric.

        Example:
          >>> from google.cloud.gapic.logging.v2 import metrics_service_v2_client
          >>> api = metrics_service_v2_client.MetricsServiceV2Client()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> api.delete_log_metric(metric_name)

        Args:
          metric_name (string): The resource name of the metric to delete:

            ::

                \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = logging_metrics_pb2.DeleteLogMetricRequest(
            metric_name=metric_name)
        self._delete_log_metric(request, options)
