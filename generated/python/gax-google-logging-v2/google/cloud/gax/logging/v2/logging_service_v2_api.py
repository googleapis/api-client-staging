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
# https://github.com/google/googleapis/blob/master/google/logging/v2/logging.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.logging.v2 LoggingServiceV2 API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.api import monitored_resource_pb2
from google.logging.v2 import log_entry_pb2
from google.logging.v2 import logging_pb2

_PageDesc = google.gax.PageDescriptor


class LoggingServiceV2Api(object):
    """Service for ingesting and querying logs."""

    SERVICE_ADDRESS = 'logging.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_log_entries': _PageDesc('page_token', 'next_page_token',
                                      'entries'),
        'list_monitored_resource_descriptors':
        _PageDesc('page_token', 'next_page_token', 'resource_descriptors')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
                   'https://www.googleapis.com/auth/cloud-platform.read-only',
                   'https://www.googleapis.com/auth/logging.admin',
                   'https://www.googleapis.com/auth/logging.read',
                   'https://www.googleapis.com/auth/logging.write', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _LOG_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/logs/{log}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def log_path(cls, project, log):
        """Returns a fully-qualified log resource name string."""
        return cls._LOG_PATH_TEMPLATE.render({
            'project': project,
            'log': log,
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
    def match_project_from_log_name(cls, log_name):
        """Parses the project from a log resource.

        Args:
          log_name (string): A fully-qualified path representing a log
            resource.

        Returns:
          A string representing the project.
        """
        return cls._LOG_PATH_TEMPLATE.match(log_name).get('project')

    @classmethod
    def match_log_from_log_name(cls, log_name):
        """Parses the log from a log resource.

        Args:
          log_name (string): A fully-qualified path representing a log
            resource.

        Returns:
          A string representing the log.
        """
        return cls._LOG_PATH_TEMPLATE.match(log_name).get('log')

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
          A LoggingServiceV2Api object.
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
                __name__, 'logging_service_v2_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.logging.v2.LoggingServiceV2',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.stub = config.create_stub(
            logging_pb2.beta_create_LoggingServiceV2_stub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)
        self._delete_log = api_callable.create_api_call(
            self.stub.DeleteLog, settings=defaults['delete_log'])
        self._write_log_entries = api_callable.create_api_call(
            self.stub.WriteLogEntries, settings=defaults['write_log_entries'])
        self._list_log_entries = api_callable.create_api_call(
            self.stub.ListLogEntries, settings=defaults['list_log_entries'])
        self._list_monitored_resource_descriptors = api_callable.create_api_call(
            self.stub.ListMonitoredResourceDescriptors,
            settings=defaults['list_monitored_resource_descriptors'])

    # Service calls
    def delete_log(self, log_name, options=None):
        """
        Deletes a log and all its log entries.
        The log will reappear if it receives new entries.

        Example:
          >>> from google.cloud.logging.v2.logging_service_v2_api import LoggingServiceV2Api
          >>> api = LoggingServiceV2Api()
          >>> log_name = api.log_path('[PROJECT]', '[LOG]')
          >>> api.delete_log(log_name)

        Args:
          log_name (string): Required. The resource name of the log to delete.  Example:
            ``"projects/my-project/logs/syslog"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_pb2.DeleteLogRequest(log_name=log_name)
        self._delete_log(request, options)

    def write_log_entries(self,
                          entries,
                          log_name='',
                          resource=None,
                          labels=None,
                          partial_success=False,
                          options=None):
        """
        Writes log entries to Stackdriver Logging.  All log entries are
        written by this method.

        Example:
          >>> from google.cloud.logging.v2.logging_service_v2_api import LoggingServiceV2Api
          >>> from google.logging.v2 import logging_pb2
          >>> api = LoggingServiceV2Api()
          >>> entries = []
          >>> response = api.write_log_entries(entries)

        Args:
          log_name (string): Optional. A default log resource name for those log entries in ``entries``
            that do not specify their own ``logName``.  Example:
            ``"projects/my-project/logs/syslog"``.  See
            ``LogEntry``.
          resource (:class:`google.api.monitored_resource_pb2.MonitoredResource`): Optional. A default monitored resource for those log entries in ``entries``
            that do not specify their own ``resource``.
          labels (dict[string -> :class:`google.logging.v2.logging_pb2.WriteLogEntriesRequest.LabelsEntry`]): Optional. User-defined ``key:value`` items that are added to
            the ``labels`` field of each log entry in ``entries``, except when a log
            entry specifies its own ``key:value`` item with the same key.
            Example: ``{ "size": "large", "color":"red" }``
          entries (list[:class:`google.logging.v2.log_entry_pb2.LogEntry`]): Required. The log entries to write. The log entries must have values for
            all required fields.

            To improve throughput and to avoid exceeding the quota limit for calls
            to ``entries.write``, use this field to write multiple log entries at once
            rather than  // calling this method for each log entry.
          partial_success (bool): Optional. Whether valid entries should be written even if some other
            entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any
            entry is not written, the response status will be the error associated
            with one of the failed entries and include error details in the form of
            WriteLogEntriesPartialErrors.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        if resource is None:
            resource = monitored_resource_pb2.MonitoredResource()
        if labels is None:
            labels = []
        request = logging_pb2.WriteLogEntriesRequest(
            entries=entries,
            log_name=log_name,
            resource=resource,
            labels=labels,
            partial_success=partial_success)
        self._write_log_entries(request, options)

    def list_log_entries(self,
                         project_ids,
                         filter_='',
                         order_by='',
                         page_size=0,
                         options=None):
        """
        Lists log entries.  Use this method to retrieve log entries from Cloud
        Logging.  For ways to export log entries, see
        `Exporting Logs <https://cloud.google.com/logging/docs/export>`_.

        Example:
          >>> from google.cloud.logging.v2.logging_service_v2_api import LoggingServiceV2Api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = LoggingServiceV2Api()
          >>> project_ids = []
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_log_entries(project_ids):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_log_entries(project_ids, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project_ids (list[string]): Required. One or more project IDs or project numbers from which to retrieve
            log entries.  Examples of a project ID: ``"my-project-1A"``, ``"1234567890"``.
          filter_ (string): Optional. An `advanced logs filter <https://cloud.google.com/logging/docs/view/advanced_filters>`_.
            The filter is compared against all log entries in the projects specified by
            ``projectIds``.  Only entries that match the filter are retrieved.  An empty
            filter matches all log entries.
          order_by (string): Optional. How the results should be sorted.  Presently, the only permitted
            values are ``"timestamp asc"`` (default) and ``"timestamp desc"``. The first
            option returns entries in order of increasing values of
            ``LogEntry.timestamp`` (oldest first), and the second option returns entries
            in order of decreasing timestamps (newest first).  Entries with equal
            timestamps are returned in order of ``LogEntry.insertId``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.logging.v2.log_entry_pb2.LogEntry` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = logging_pb2.ListLogEntriesRequest(
            project_ids=project_ids,
            filter=filter_,
            order_by=order_by,
            page_size=page_size)
        return self._list_log_entries(request, options)

    def list_monitored_resource_descriptors(self, page_size=0, options=None):
        """
        Lists the monitored resource descriptors used by Stackdriver Logging.

        Example:
          >>> from google.cloud.logging.v2.logging_service_v2_api import LoggingServiceV2Api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = LoggingServiceV2Api()
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_monitored_resource_descriptors():
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_monitored_resource_descriptors(options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
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
        """
        request = logging_pb2.ListMonitoredResourceDescriptorsRequest(
            page_size=page_size)
        return self._list_monitored_resource_descriptors(request, options)
