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
# https://github.com/google/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.devtools.clouderrorreporting.v1beta1 ErrorStatsService API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.errorreporting.v1beta1 import enums
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import error_stats_service_pb2
from google.protobuf import duration_pb2
from google.protobuf import timestamp_pb2

_PageDesc = google.gax.PageDescriptor


class ErrorStatsServiceClient(object):
    """
    An API for retrieving and managing error statistics as well as data for
    individual events.
    """

    SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_group_stats': _PageDesc('page_token', 'next_page_token',
                                      'error_group_stats'),
        'list_events': _PageDesc('page_token', 'next_page_token',
                                 'error_events')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform', )

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
          A ErrorStatsServiceClient object.
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
            'gapic-google-cloud-error-reporting-v1beta1', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'error_stats_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.devtools.clouderrorreporting.v1beta1.ErrorStatsService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS, )
        self.error_stats_service_stub = config.create_stub(
            error_stats_service_pb2.ErrorStatsServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._list_group_stats = api_callable.create_api_call(
            self.error_stats_service_stub.ListGroupStats,
            settings=defaults['list_group_stats'])
        self._list_events = api_callable.create_api_call(
            self.error_stats_service_stub.ListEvents,
            settings=defaults['list_events'])
        self._delete_events = api_callable.create_api_call(
            self.error_stats_service_stub.DeleteEvents,
            settings=defaults['delete_events'])

    # Service calls
    def list_group_stats(self,
                         project_name,
                         time_range,
                         group_id=None,
                         service_filter=None,
                         timed_count_duration=None,
                         alignment=None,
                         alignment_time=None,
                         order=None,
                         page_size=0,
                         options=None):
        """
        Lists the specified groups.

        Example:
          >>> from google.cloud.gapic.errorreporting.v1beta1 import error_stats_service_client
          >>> from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import error_stats_service_pb2
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = error_stats_service_client.ErrorStatsServiceClient()
          >>> project_name = api.project_path('[PROJECT]')
          >>> time_range = error_stats_service_pb2.QueryTimeRange()
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_group_stats(project_name, time_range):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_group_stats(project_name, time_range, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project_name (string): [Required] The resource name of the Google Cloud Platform project. Written
            as <code>projects/</code> plus the
            <a href=\"https://support.google.com/cloud/answer/6158840\">Google Cloud
            Platform project ID</a>.

            Example: <code>projects/my-project-123</code>.
          group_id (list[string]): [Optional] List all <code>ErrorGroupStats</code> with these IDs.
          service_filter (:class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.ServiceContextFilter`): [Optional] List only <code>ErrorGroupStats</code> which belong to a service
            context that matches the filter.
            Data for all service contexts is returned if this field is not specified.
          time_range (:class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.QueryTimeRange`): [Optional] List data for the given time range.
            If not set a default time range is used. The field time_range_begin
            in the response will specify the beginning of this time range.
            Only <code>ErrorGroupStats</code> with a non-zero count in the given time
            range are returned, unless the request contains an explicit group_id list.
            If a group_id list is given, also <code>ErrorGroupStats</code> with zero
            occurrences are returned.
          timed_count_duration (:class:`google.protobuf.duration_pb2.Duration`): [Optional] The preferred duration for a single returned ``TimedCount``.
            If not set, no timed counts are returned.
          alignment (enum :class:`google.cloud.gapic.errorreporting.v1beta1.enums.TimedCountAlignment`): [Optional] The alignment of the timed counts to be returned.
            Default is ``ALIGNMENT_EQUAL_AT_END``.
          alignment_time (:class:`google.protobuf.timestamp_pb2.Timestamp`): [Optional] Time where the timed counts shall be aligned if rounded
            alignment is chosen. Default is 00:00 UTC.
          order (enum :class:`google.cloud.gapic.errorreporting.v1beta1.enums.ErrorGroupOrder`): [Optional] The sort order in which the results are returned.
            Default is ``COUNT_DESC``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.ErrorGroupStats` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if group_id is None:
            group_id = []
        if service_filter is None:
            service_filter = error_stats_service_pb2.ServiceContextFilter()
        if timed_count_duration is None:
            timed_count_duration = duration_pb2.Duration()
        if alignment is None:
            alignment = enums.TimedCountAlignment.ERROR_COUNT_ALIGNMENT_UNSPECIFIED
        if alignment_time is None:
            alignment_time = timestamp_pb2.Timestamp()
        if order is None:
            order = enums.ErrorGroupOrder.GROUP_ORDER_UNSPECIFIED
        # Create the request object.
        request = error_stats_service_pb2.ListGroupStatsRequest(
            project_name=project_name,
            time_range=time_range,
            group_id=group_id,
            service_filter=service_filter,
            timed_count_duration=timed_count_duration,
            alignment=alignment,
            alignment_time=alignment_time,
            order=order,
            page_size=page_size)
        return self._list_group_stats(request, options)

    def list_events(self,
                    project_name,
                    group_id,
                    service_filter=None,
                    time_range=None,
                    page_size=0,
                    options=None):
        """
        Lists the specified events.

        Example:
          >>> from google.cloud.gapic.errorreporting.v1beta1 import error_stats_service_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = error_stats_service_client.ErrorStatsServiceClient()
          >>> project_name = api.project_path('[PROJECT]')
          >>> group_id = ''
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_events(project_name, group_id):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_events(project_name, group_id, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project_name (string): [Required] The resource name of the Google Cloud Platform project. Written
            as ``projects/`` plus the
            [Google Cloud Platform project
            ID](https://support.google.com/cloud/answer/6158840).
            Example: ``projects/my-project-123``.
          group_id (string): [Required] The group for which events shall be returned.
          service_filter (:class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.ServiceContextFilter`): [Optional] List only ErrorGroups which belong to a service context that
            matches the filter.
            Data for all service contexts is returned if this field is not specified.
          time_range (:class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.QueryTimeRange`): [Optional] List only data for the given time range.
            If not set a default time range is used. The field time_range_begin
            in the response will specify the beginning of this time range.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.common_pb2.ErrorEvent` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if service_filter is None:
            service_filter = error_stats_service_pb2.ServiceContextFilter()
        if time_range is None:
            time_range = error_stats_service_pb2.QueryTimeRange()
        # Create the request object.
        request = error_stats_service_pb2.ListEventsRequest(
            project_name=project_name,
            group_id=group_id,
            service_filter=service_filter,
            time_range=time_range,
            page_size=page_size)
        return self._list_events(request, options)

    def delete_events(self, project_name, options=None):
        """
        Deletes all error events of a given project.

        Example:
          >>> from google.cloud.gapic.errorreporting.v1beta1 import error_stats_service_client
          >>> api = error_stats_service_client.ErrorStatsServiceClient()
          >>> project_name = api.project_path('[PROJECT]')
          >>> response = api.delete_events(project_name)

        Args:
          project_name (string): [Required] The resource name of the Google Cloud Platform project. Written
            as ``projects/`` plus the
            [Google Cloud Platform project
            ID](https://support.google.com/cloud/answer/6158840).
            Example: ``projects/my-project-123``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.devtools.clouderrorreporting.v1beta1.error_stats_service_pb2.DeleteEventsResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = error_stats_service_pb2.DeleteEventsRequest(
            project_name=project_name)
        return self._delete_events(request, options)
