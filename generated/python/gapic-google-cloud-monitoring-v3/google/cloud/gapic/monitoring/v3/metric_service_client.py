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
# https://github.com/google/googleapis/blob/master/google/monitoring/v3/metric_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.monitoring.v3 MetricService API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.api import metric_pb2 as api_metric_pb2
from google.cloud.gapic.monitoring.v3 import enums
from google.cloud.proto.monitoring.v3 import common_pb2
from google.cloud.proto.monitoring.v3 import metric_pb2 as v3_metric_pb2
from google.cloud.proto.monitoring.v3 import metric_service_pb2

_PageDesc = google.gax.PageDescriptor


class MetricServiceClient(object):
    """
    Manages metric descriptors, monitored resource descriptors, and
    time series data.
    """

    SERVICE_ADDRESS = 'monitoring.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_monitored_resource_descriptors':
        _PageDesc('page_token', 'next_page_token', 'resource_descriptors'),
        'list_metric_descriptors': _PageDesc('page_token', 'next_page_token',
                                             'metric_descriptors'),
        'list_time_series': _PageDesc('page_token', 'next_page_token',
                                      'time_series')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/monitoring',
        'https://www.googleapis.com/auth/monitoring.read',
        'https://www.googleapis.com/auth/monitoring.write', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _METRIC_DESCRIPTOR_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/metricDescriptors/{metric_descriptor=**}')
    _MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/monitoredResourceDescriptors/{monitored_resource_descriptor}'
    )

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def metric_descriptor_path(cls, project, metric_descriptor):
        """Returns a fully-qualified metric_descriptor resource name string."""
        return cls._METRIC_DESCRIPTOR_PATH_TEMPLATE.render({
            'project': project,
            'metric_descriptor': metric_descriptor,
        })

    @classmethod
    def monitored_resource_descriptor_path(cls, project,
                                           monitored_resource_descriptor):
        """Returns a fully-qualified monitored_resource_descriptor resource name string."""
        return cls._MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.render({
            'project': project,
            'monitored_resource_descriptor': monitored_resource_descriptor,
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
    def match_project_from_metric_descriptor_name(cls, metric_descriptor_name):
        """Parses the project from a metric_descriptor resource.

        Args:
          metric_descriptor_name (string): A fully-qualified path representing a metric_descriptor
            resource.

        Returns:
          A string representing the project.
        """
        return cls._METRIC_DESCRIPTOR_PATH_TEMPLATE.match(
            metric_descriptor_name).get('project')

    @classmethod
    def match_metric_descriptor_from_metric_descriptor_name(
            cls, metric_descriptor_name):
        """Parses the metric_descriptor from a metric_descriptor resource.

        Args:
          metric_descriptor_name (string): A fully-qualified path representing a metric_descriptor
            resource.

        Returns:
          A string representing the metric_descriptor.
        """
        return cls._METRIC_DESCRIPTOR_PATH_TEMPLATE.match(
            metric_descriptor_name).get('metric_descriptor')

    @classmethod
    def match_project_from_monitored_resource_descriptor_name(
            cls, monitored_resource_descriptor_name):
        """Parses the project from a monitored_resource_descriptor resource.

        Args:
          monitored_resource_descriptor_name (string): A fully-qualified path representing a monitored_resource_descriptor
            resource.

        Returns:
          A string representing the project.
        """
        return cls._MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.match(
            monitored_resource_descriptor_name).get('project')

    @classmethod
    def match_monitored_resource_descriptor_from_monitored_resource_descriptor_name(
            cls, monitored_resource_descriptor_name):
        """Parses the monitored_resource_descriptor from a monitored_resource_descriptor resource.

        Args:
          monitored_resource_descriptor_name (string): A fully-qualified path representing a monitored_resource_descriptor
            resource.

        Returns:
          A string representing the monitored_resource_descriptor.
        """
        return cls._MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.match(
            monitored_resource_descriptor_name).get(
                'monitored_resource_descriptor')

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
          A MetricServiceClient object.
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
                __name__, 'metric_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.monitoring.v3.MetricService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.metric_service_stub = config.create_stub(
            metric_service_pb2.MetricServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._list_monitored_resource_descriptors = api_callable.create_api_call(
            self.metric_service_stub.ListMonitoredResourceDescriptors,
            settings=defaults['list_monitored_resource_descriptors'])
        self._get_monitored_resource_descriptor = api_callable.create_api_call(
            self.metric_service_stub.GetMonitoredResourceDescriptor,
            settings=defaults['get_monitored_resource_descriptor'])
        self._list_metric_descriptors = api_callable.create_api_call(
            self.metric_service_stub.ListMetricDescriptors,
            settings=defaults['list_metric_descriptors'])
        self._get_metric_descriptor = api_callable.create_api_call(
            self.metric_service_stub.GetMetricDescriptor,
            settings=defaults['get_metric_descriptor'])
        self._create_metric_descriptor = api_callable.create_api_call(
            self.metric_service_stub.CreateMetricDescriptor,
            settings=defaults['create_metric_descriptor'])
        self._delete_metric_descriptor = api_callable.create_api_call(
            self.metric_service_stub.DeleteMetricDescriptor,
            settings=defaults['delete_metric_descriptor'])
        self._list_time_series = api_callable.create_api_call(
            self.metric_service_stub.ListTimeSeries,
            settings=defaults['list_time_series'])
        self._create_time_series = api_callable.create_api_call(
            self.metric_service_stub.CreateTimeSeries,
            settings=defaults['create_time_series'])

    # Service calls
    def list_monitored_resource_descriptors(self,
                                            name,
                                            filter_='',
                                            page_size=0,
                                            options=None):
        """
        Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_monitored_resource_descriptors(name):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_monitored_resource_descriptors(name, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The project on which to execute the request. The format is
            ``\"projects/{project_id_or_number}\"``.
          filter_ (string): An optional `filter <https://cloud.google.com/monitoring/api/v3/filters>`_ describing
            the descriptors to be returned.  The filter can reference
            the descriptor's type and labels. For example, the
            following filter returns only Google Compute Engine descriptors
            that have an ``id`` label:

            ::

                resource.type = starts_with(\"gce_\") AND resource.label:id
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.api.monitored_resource_pb2.MonitoredResourceDescriptor` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.ListMonitoredResourceDescriptorsRequest(
            name=name, filter=filter_, page_size=page_size)
        return self._list_monitored_resource_descriptors(request, options)

    def get_monitored_resource_descriptor(self, name, options=None):
        """
        Gets a single monitored resource descriptor. This method does not require a Stackdriver account.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.monitored_resource_descriptor_path('[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]')
          >>> response = api.get_monitored_resource_descriptor(name)

        Args:
          name (string): The monitored resource descriptor to get.  The format is
            ``\"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}\"``.
            The ``{resource_type}`` is a predefined type, such as
            ``cloudsql_database``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.api.monitored_resource_pb2.MonitoredResourceDescriptor` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.GetMonitoredResourceDescriptorRequest(
            name=name)
        return self._get_monitored_resource_descriptor(request, options)

    def list_metric_descriptors(self,
                                name,
                                filter_='',
                                page_size=0,
                                options=None):
        """
        Lists metric descriptors that match a filter. This method does not require a Stackdriver account.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_metric_descriptors(name):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_metric_descriptors(name, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The project on which to execute the request. The format is
            ``\"projects/{project_id_or_number}\"``.
          filter_ (string): If this field is empty, all custom and
            system-defined metric descriptors are returned.
            Otherwise, the `filter <https://cloud.google.com/monitoring/api/v3/filters>`_
            specifies which metric descriptors are to be
            returned. For example, the following filter matches all
            `custom metrics <https://cloud.google.com/monitoring/custom-metrics>`_:

            ::

                metric.type = starts_with(\"custom.googleapis.com/\")
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.api.metric_pb2.MetricDescriptor` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.ListMetricDescriptorsRequest(
            name=name, filter=filter_, page_size=page_size)
        return self._list_metric_descriptors(request, options)

    def get_metric_descriptor(self, name, options=None):
        """
        Gets a single metric descriptor. This method does not require a Stackdriver account.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.metric_descriptor_path('[PROJECT]', '[METRIC_DESCRIPTOR]')
          >>> response = api.get_metric_descriptor(name)

        Args:
          name (string): The metric descriptor on which to execute the request. The format is
            ``\"projects/{project_id_or_number}/metricDescriptors/{metric_id}\"``.
            An example value of ``{metric_id}`` is
            ``\"compute.googleapis.com/instance/disk/read_bytes_count\"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.api.metric_pb2.MetricDescriptor` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.GetMetricDescriptorRequest(name=name)
        return self._get_metric_descriptor(request, options)

    def create_metric_descriptor(self, name, metric_descriptor, options=None):
        """
        Creates a new metric descriptor.
        User-created metric descriptors define
        `custom metrics <https://cloud.google.com/monitoring/custom-metrics>`_.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> from google.api import metric_pb2 as api_metric_pb2
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>> metric_descriptor = api_metric_pb2.MetricDescriptor()
          >>> response = api.create_metric_descriptor(name, metric_descriptor)

        Args:
          name (string): The project on which to execute the request. The format is
            ``\"projects/{project_id_or_number}\"``.
          metric_descriptor (:class:`google.api.metric_pb2.MetricDescriptor`): The new `custom metric <https://cloud.google.com/monitoring/custom-metrics>`_
            descriptor.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.api.metric_pb2.MetricDescriptor` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.CreateMetricDescriptorRequest(
            name=name, metric_descriptor=metric_descriptor)
        return self._create_metric_descriptor(request, options)

    def delete_metric_descriptor(self, name, options=None):
        """
        Deletes a metric descriptor. Only user-created
        `custom metrics <https://cloud.google.com/monitoring/custom-metrics>`_ can be deleted.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.metric_descriptor_path('[PROJECT]', '[METRIC_DESCRIPTOR]')
          >>> api.delete_metric_descriptor(name)

        Args:
          name (string): The metric descriptor on which to execute the request. The format is
            ``\"projects/{project_id_or_number}/metricDescriptors/{metric_id}\"``.
            An example of ``{metric_id}`` is:
            ``\"custom.googleapis.com/my_test_metric\"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.DeleteMetricDescriptorRequest(name=name)
        self._delete_metric_descriptor(request, options)

    def list_time_series(self,
                         name,
                         filter_,
                         interval,
                         view,
                         aggregation=None,
                         order_by='',
                         page_size=0,
                         options=None):
        """
        Lists time series that match a filter. This method does not require a Stackdriver account.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> from google.cloud.gapic.monitoring.v3 import enums
          >>> from google.cloud.proto.monitoring.v3 import common_pb2
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>> filter_ = ''
          >>> interval = common_pb2.TimeInterval()
          >>> view = enums.ListTimeSeriesRequest.TimeSeriesView.FULL
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_time_series(name, filter_, interval, view):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_time_series(name, filter_, interval, view, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): The project on which to execute the request. The format is
            \"projects/{project_id_or_number}\".
          filter_ (string): A `monitoring filter <https://cloud.google.com/monitoring/api/v3/filters>`_ that specifies which time
            series should be returned.  The filter must specify a single metric type,
            and can additionally specify metric labels and other information. For
            example:

            ::

                metric.type = \"compute.googleapis.com/instance/cpu/usage_time\" AND
                    metric.label.instance_name = \"my-instance-name\"
          interval (:class:`google.cloud.proto.monitoring.v3.common_pb2.TimeInterval`): The time interval for which results should be returned. Only time series
            that contain data points in the specified interval are included
            in the response.
          aggregation (:class:`google.cloud.proto.monitoring.v3.common_pb2.Aggregation`): By default, the raw time series data is returned.
            Use this field to combine multiple time series for different
            views of the data.
          order_by (string): Specifies the order in which the points of the time series should
            be returned.  By default, results are not ordered.  Currently,
            this field must be left blank.
          view (enum :class:`google.cloud.gapic.monitoring.v3.enums.ListTimeSeriesRequest.TimeSeriesView`): Specifies which information is returned about the time series.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.monitoring.v3.metric_pb2.TimeSeries` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if aggregation is None:
            aggregation = common_pb2.Aggregation()
        request = metric_service_pb2.ListTimeSeriesRequest(
            name=name,
            filter=filter_,
            interval=interval,
            view=view,
            aggregation=aggregation,
            order_by=order_by,
            page_size=page_size)
        return self._list_time_series(request, options)

    def create_time_series(self, name, time_series, options=None):
        """
        Creates or adds data to one or more time series.
        The response is empty if all time series in the request were written.
        If any time series could not be written, a corresponding failure message is
        included in the error response.

        Example:
          >>> from google.cloud.gapic.monitoring.v3 import metric_service_client
          >>> from google.cloud.proto.monitoring.v3 import metric_pb2 as v3_metric_pb2
          >>> api = metric_service_client.MetricServiceClient()
          >>> name = api.project_path('[PROJECT]')
          >>> time_series = []
          >>> api.create_time_series(name, time_series)

        Args:
          name (string): The project on which to execute the request. The format is
            ``\"projects/{project_id_or_number}\"``.
          time_series (list[:class:`google.cloud.proto.monitoring.v3.metric_pb2.TimeSeries`]): The new data to be added to a list of time series.
            Adds at most one data point to each of several time series.  The new data
            point must be more recent than any other point in its time series.  Each
            ``TimeSeries`` value must fully specify a unique time series by supplying
            all label values for the metric and the monitored resource.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = metric_service_pb2.CreateTimeSeriesRequest(
            name=name, time_series=time_series)
        self._create_time_series(request, options)
