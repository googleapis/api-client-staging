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
# https://github.com/google/googleapis/blob/master/google/logging/v2/logging.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.logging.v2 LoggingServiceV2 API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.api import monitored_resource_pb2
from google.cloud.logging_v2.gapic import enums
from google.cloud.proto.logging.v2 import log_entry_pb2
from google.cloud.proto.logging.v2 import logging_pb2

_PageDesc = google.gax.PageDescriptor


class LoggingServiceV2Client(object):
    """Service for ingesting and querying logs."""

    SERVICE_ADDRESS = 'logging.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_log_entries':
        _PageDesc('page_token', 'next_page_token', 'entries'),
        'list_monitored_resource_descriptors':
        _PageDesc('page_token', 'next_page_token', 'resource_descriptors'),
        'list_logs':
        _PageDesc('page_token', 'next_page_token', 'log_names')
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
        return cls._PROJECT_PATH_TEMPLATE.render({
            'project': project,
        })

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
          A LoggingServiceV2Client object.
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
                __name__, 'logging_service_v2_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.logging.v2.LoggingServiceV2',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS, )
        self.logging_service_v2_stub = config.create_stub(
            logging_pb2.LoggingServiceV2Stub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._delete_log = api_callable.create_api_call(
            self.logging_service_v2_stub.DeleteLog,
            settings=defaults['delete_log'])
        self._write_log_entries = api_callable.create_api_call(
            self.logging_service_v2_stub.WriteLogEntries,
            settings=defaults['write_log_entries'])
        self._list_log_entries = api_callable.create_api_call(
            self.logging_service_v2_stub.ListLogEntries,
            settings=defaults['list_log_entries'])
        self._list_monitored_resource_descriptors = api_callable.create_api_call(
            self.logging_service_v2_stub.ListMonitoredResourceDescriptors,
            settings=defaults['list_monitored_resource_descriptors'])
        self._list_logs = api_callable.create_api_call(
            self.logging_service_v2_stub.ListLogs,
            settings=defaults['list_logs'])

    # Service calls
    def delete_log(self, log_name, options=None):
        """
        Deletes all the log entries in a log.
        The log reappears if it receives new entries.
        Log entries written shortly before the delete operation might not be
        deleted.

        Example:
          >>> from google.cloud.logging_v2.gapic import logging_service_v2_client
          >>> client = logging_service_v2_client.LoggingServiceV2Client()
          >>> log_name = client.log_path('[PROJECT]', '[LOG]')
          >>> client.delete_log(log_name)

        Args:
          log_name (string): Required. The resource name of the log to delete:

            ::

                \"projects/[PROJECT_ID]/logs/[LOG_ID]\"
                \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\"
                \"billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]\"
                \"folders/[FOLDER_ID]/logs/[LOG_ID]\"

            ``[LOG_ID]`` must be URL-encoded. For example,
            ``\"projects/my-project-id/logs/syslog\"``,
            ``\"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\"``.
            For more information about log names, see
            ``LogEntry``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_pb2.DeleteLogRequest(log_name=log_name)
        self._delete_log(request, options)

    def write_log_entries(self,
                          entries,
                          log_name=None,
                          resource=None,
                          labels=None,
                          partial_success=None,
                          options=None):
        """
        Writes log entries to Stackdriver Logging.

        Example:
          >>> from google.cloud.logging_v2.gapic import logging_service_v2_client
          >>> client = logging_service_v2_client.LoggingServiceV2Client()
          >>> entries = []
          >>> response = client.write_log_entries(entries)

        Args:
          entries (list[:class:`google.cloud.proto.logging.v2.log_entry_pb2.LogEntry`]): Required.  The log entries to write. Values supplied for the fields
            ``log_name``, ``resource``, and ``labels`` in this ``entries.write`` request are
            inserted into those log entries in this list that do not provide their own
            values.

            Stackdriver Logging also creates and inserts values for ``timestamp`` and
            ``insert_id`` if the entries do not provide them. The created ``insert_id`` for
            the N'th entry in this list will be greater than earlier entries and less
            than later entries.  Otherwise, the order of log entries in this list does
            not matter.

            To improve throughput and to avoid exceeding the
            `quota limit <https://cloud.google.com/logging/quota-policy>`_ for calls to ``entries.write``,
            you should write multiple log entries at once rather than
            calling this method for each individual log entry.
          log_name (string): Optional. A default log resource name that is assigned to all log entries
            in ``entries`` that do not specify a value for ``log_name``:

            ::

                \"projects/[PROJECT_ID]/logs/[LOG_ID]\"
                \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\"
                \"billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]\"
                \"folders/[FOLDER_ID]/logs/[LOG_ID]\"

            ``[LOG_ID]`` must be URL-encoded. For example,
            ``\"projects/my-project-id/logs/syslog\"`` or
            ``\"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\"``.
            For more information about log names, see
            ``LogEntry``.
          resource (:class:`google.api.monitored_resource_pb2.MonitoredResource`): Optional. A default monitored resource object that is assigned to all log
            entries in ``entries`` that do not specify a value for ``resource``. Example:

            ::

                { \"type\": \"gce_instance\",
                  \"labels\": {
                    \"zone\": \"us-central1-a\", \"instance_id\": \"00000000000000000000\" }}

            See ``LogEntry``.
          labels (dict[string -> string]): Optional. Default labels that are added to the ``labels`` field of all log
            entries in ``entries``. If a log entry already has a label with the same key
            as a label in this parameter, then the log entry's label is not changed.
            See ``LogEntry``.
          partial_success (bool): Optional. Whether valid entries should be written even if some other
            entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any
            entry is not written, then the response status is the error associated
            with one of the failed entries and the response includes error details
            keyed by the entries' zero-based index in the ``entries.write`` method.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.logging.v2.logging_pb2.WriteLogEntriesResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_pb2.WriteLogEntriesRequest(
            entries=entries,
            log_name=log_name,
            resource=resource,
            labels=labels,
            partial_success=partial_success)
        return self._write_log_entries(request, options)

    def list_log_entries(self,
                         resource_names,
                         project_ids=None,
                         filter_=None,
                         order_by=None,
                         page_size=None,
                         options=None):
        """
        Lists log entries.  Use this method to retrieve log entries from
        Stackdriver Logging.  For ways to export log entries, see
        `Exporting Logs <https://cloud.google.com/logging/docs/export>`_.

        Example:
          >>> from google.cloud.logging_v2.gapic import logging_service_v2_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> client = logging_service_v2_client.LoggingServiceV2Client()
          >>> resource_names = []
          >>>
          >>> # Iterate over all results
          >>> for element in client.list_log_entries(resource_names):
          >>>     # process element
          >>>     pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in client.list_log_entries(resource_names, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>     for element in page:
          >>>         # process element
          >>>         pass

        Args:
          resource_names (list[string]): Required. Names of one or more parent resources from which to
            retrieve log entries:

            ::

                \"projects/[PROJECT_ID]\"
                \"organizations/[ORGANIZATION_ID]\"
                \"billingAccounts/[BILLING_ACCOUNT_ID]\"
                \"folders/[FOLDER_ID]\"

            Projects listed in the ``project_ids`` field are added to this list.
          project_ids (list[string]): Deprecated. Use ``resource_names`` instead.  One or more project identifiers
            or project numbers from which to retrieve log entries.  Example:
            ``\"my-project-1A\"``. If present, these project identifiers are converted to
            resource name format and added to the list of resources in
            ``resource_names``.
          filter_ (string): Optional. A filter that chooses which log entries to return.  See [Advanced
            Logs Filters](/logging/docs/view/advanced_filters).  Only log entries that
            match the filter are returned.  An empty filter matches all log entries in
            the resources listed in ``resource_names``. Referencing a parent resource
            that is not listed in ``resource_names`` will cause the filter to return no
            results.
            The maximum length of the filter is 20000 characters.
          order_by (string): Optional. How the results should be sorted.  Presently, the only permitted
            values are ``\"timestamp asc\"`` (default) and ``\"timestamp desc\"``. The first
            option returns entries in order of increasing values of
            ``LogEntry.timestamp`` (oldest first), and the second option returns entries
            in order of decreasing timestamps (newest first).  Entries with equal
            timestamps are returned in order of their ``insert_id`` values.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.logging.v2.log_entry_pb2.LogEntry` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_pb2.ListLogEntriesRequest(
            resource_names=resource_names,
            project_ids=project_ids,
            filter=filter_,
            order_by=order_by,
            page_size=page_size)
        return self._list_log_entries(request, options)

    def list_monitored_resource_descriptors(self, page_size=None,
                                            options=None):
        """
        Lists the descriptors for monitored resource types used by Stackdriver
        Logging.

        Example:
          >>> from google.cloud.logging_v2.gapic import logging_service_v2_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> client = logging_service_v2_client.LoggingServiceV2Client()
          >>>
          >>> # Iterate over all results
          >>> for element in client.list_monitored_resource_descriptors():
          >>>     # process element
          >>>     pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in client.list_monitored_resource_descriptors(options=CallOptions(page_token=INITIAL_PAGE)):
          >>>     for element in page:
          >>>         # process element
          >>>         pass

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
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_pb2.ListMonitoredResourceDescriptorsRequest(
            page_size=page_size)
        return self._list_monitored_resource_descriptors(request, options)

    def list_logs(self, parent, page_size=None, options=None):
        """
        Lists the logs in projects, organizations, folders, or billing accounts.
        Only logs that have entries are listed.

        Example:
          >>> from google.cloud.logging_v2.gapic import logging_service_v2_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> client = logging_service_v2_client.LoggingServiceV2Client()
          >>> parent = client.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in client.list_logs(parent):
          >>>     # process element
          >>>     pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in client.list_logs(parent, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>     for element in page:
          >>>         # process element
          >>>         pass

        Args:
          parent (string): Required. The resource name that owns the logs:

            ::

                \"projects/[PROJECT_ID]\"
                \"organizations/[ORGANIZATION_ID]\"
                \"billingAccounts/[BILLING_ACCOUNT_ID]\"
                \"folders/[FOLDER_ID]\"
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of string instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = logging_pb2.ListLogsRequest(
            parent=parent, page_size=page_size)
        return self._list_logs(request, options)
