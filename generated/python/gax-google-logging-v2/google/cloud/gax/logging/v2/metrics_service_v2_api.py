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
# https://github.com/google/googleapis/blob/master/google/logging/v2/logging_metrics.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.logging.v2 MetricsServiceV2 API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.logging.v2 import logging_metrics_pb2

_PageDesc = google.gax.PageDescriptor


class MetricsServiceV2Api(object):
    """Service for configuring logs-based metrics."""

    SERVICE_ADDRESS = 'logging.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_log_metrics': _PageDesc('page_token', 'next_page_token',
                                      'metrics')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
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
          channel (:class:`grpc.beta.implementations.Channel`): A ``Channel``
            object through which to make calls.
          ssl_creds (:class:`grpc.beta.implementations.ClientCredentials`):
            A `ClientCredentials` for use with an SSL-enabled channel.
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
          A MetricsServiceV2Api object.
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
                __name__, 'metrics_service_v2_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.logging.v2.MetricsServiceV2',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.stub = config.create_stub(
            logging_metrics_pb2.beta_create_MetricsServiceV2_stub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)
        self._list_log_metrics = api_callable.create_api_call(
            self.stub.ListLogMetrics, settings=defaults['list_log_metrics'])
        self._get_log_metric = api_callable.create_api_call(
            self.stub.GetLogMetric, settings=defaults['get_log_metric'])
        self._create_log_metric = api_callable.create_api_call(
            self.stub.CreateLogMetric, settings=defaults['create_log_metric'])
        self._update_log_metric = api_callable.create_api_call(
            self.stub.UpdateLogMetric, settings=defaults['update_log_metric'])
        self._delete_log_metric = api_callable.create_api_call(
            self.stub.DeleteLogMetric, settings=defaults['delete_log_metric'])

    # Service calls
    def list_log_metrics(self, parent, page_size=0, options=None):
        """
        Lists logs-based metrics.

        Example:
          >>> from google.cloud.logging.v2.metrics_service_v2_api import MetricsServiceV2Api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = MetricsServiceV2Api()
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
          parent (string): Required. The resource name containing the metrics.
            Example: ``"projects/my-project-id"``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.logging.v2.logging_metrics_pb2.LogMetric` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_metrics_pb2.ListLogMetricsRequest(
            parent=parent, page_size=page_size)
        return self._list_log_metrics(request, options)

    def get_log_metric(self, metric_name, options=None):
        """
        Gets a logs-based metric.

        Example:
          >>> from google.cloud.logging.v2.metrics_service_v2_api import MetricsServiceV2Api
          >>> api = MetricsServiceV2Api()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> response = api.get_log_metric(metric_name)

        Args:
          metric_name (string): The resource name of the desired metric.
            Example: ``"projects/my-project-id/metrics/my-metric-id"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_metrics_pb2.GetLogMetricRequest(
            metric_name=metric_name)
        return self._get_log_metric(request, options)

    def create_log_metric(self, parent, metric, options=None):
        """
        Creates a logs-based metric.

        Example:
          >>> from google.cloud.logging.v2.metrics_service_v2_api import MetricsServiceV2Api
          >>> from google.logging.v2 import logging_metrics_pb2
          >>> api = MetricsServiceV2Api()
          >>> parent = api.project_path('[PROJECT]')
          >>> metric = logging_metrics_pb2.LogMetric()
          >>> response = api.create_log_metric(parent, metric)

        Args:
          parent (string): The resource name of the project in which to create the metric.
            Example: ``"projects/my-project-id"``.

            The new metric must be provided in the request.
          metric (:class:`google.logging.v2.logging_metrics_pb2.LogMetric`): The new logs-based metric, which must not have an identifier that
            already exists.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_metrics_pb2.CreateLogMetricRequest(
            parent=parent, metric=metric)
        return self._create_log_metric(request, options)

    def update_log_metric(self, metric_name, metric, options=None):
        """
        Creates or updates a logs-based metric.

        Example:
          >>> from google.cloud.logging.v2.metrics_service_v2_api import MetricsServiceV2Api
          >>> from google.logging.v2 import logging_metrics_pb2
          >>> api = MetricsServiceV2Api()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> metric = logging_metrics_pb2.LogMetric()
          >>> response = api.update_log_metric(metric_name, metric)

        Args:
          metric_name (string): The resource name of the metric to update.
            Example: ``"projects/my-project-id/metrics/my-metric-id"``.

            The updated metric must be provided in the request and have the
            same identifier that is specified in ``metricName``.
            If the metric does not exist, it is created.
          metric (:class:`google.logging.v2.logging_metrics_pb2.LogMetric`): The updated metric, whose name must be the same as the
            metric identifier in ``metricName``. If ``metricName`` does not
            exist, then a new metric is created.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.logging.v2.logging_metrics_pb2.LogMetric` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_metrics_pb2.UpdateLogMetricRequest(
            metric_name=metric_name, metric=metric)
        return self._update_log_metric(request, options)

    def delete_log_metric(self, metric_name, options=None):
        """
        Deletes a logs-based metric.

        Example:
          >>> from google.cloud.logging.v2.metrics_service_v2_api import MetricsServiceV2Api
          >>> api = MetricsServiceV2Api()
          >>> metric_name = api.metric_path('[PROJECT]', '[METRIC]')
          >>> api.delete_log_metric(metric_name)

        Args:
          metric_name (string): The resource name of the metric to delete.
            Example: ``"projects/my-project-id/metrics/my-metric-id"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_metrics_pb2.DeleteLogMetricRequest(
            metric_name=metric_name)
        self._delete_log_metric(request, options)
