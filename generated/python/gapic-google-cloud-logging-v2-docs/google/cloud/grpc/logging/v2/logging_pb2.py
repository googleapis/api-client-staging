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

from google.api import monitored_resource_pb2
from google.cloud.grpc.logging.v2 import log_entry_pb2


class DeleteLogRequest(object):
    """
    The parameters to DeleteLog.

    Attributes:
      log_name (string): Required. The resource name of the log to delete:

        ::

            \"projects/[PROJECT_ID]/logs/[LOG_ID]\"
            \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\"

        ``[LOG_ID]`` must be URL-encoded. For example,
        ``\"projects/my-project-id/logs/syslog\"``,
        ``\"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\"``.
        For more information about log names, see
        ``LogEntry``.

    """
    pass


class WriteLogEntriesRequest(object):
    """
    The parameters to WriteLogEntries.

    Attributes:
      log_name (string): Optional. A default log resource name that is assigned to all log entries
        in ``entries`` that do not specify a value for ``log_name``:

        ::

            \"projects/[PROJECT_ID]/logs/[LOG_ID]\"
            \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\"

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
      labels (dict[string -> :class:`google.cloud.grpc.logging.v2.logging_pb2.WriteLogEntriesRequest.LabelsEntry`]): Optional. Default labels that are added to the ``labels`` field of all log
        entries in ``entries``. If a log entry already has a label with the same key
        as a label in this parameter, then the log entry's label is not changed.
        See ``LogEntry``.
      entries (list[:class:`google.cloud.grpc.logging.v2.log_entry_pb2.LogEntry`]): Required. The log entries to write. Values supplied for the fields
        ``log_name``, ``resource``, and ``labels`` in this ``entries.write`` request are
        added to those log entries that do not provide their own values for the
        fields.

        To improve throughput and to avoid exceeding the
        `quota limit <https://cloud.google.com/logging/quota-policy>`_ for calls to ``entries.write``,
        you should write multiple log entries at once rather than
        calling this method for each individual log entry.
      partial_success (bool): Optional. Whether valid entries should be written even if some other
        entries fail due to INVALID_ARGUMENT or PERMISSION_DENIED errors. If any
        entry is not written, the response status will be the error associated
        with one of the failed entries and include error details in the form of
        WriteLogEntriesPartialErrors.

    """
    pass


class WriteLogEntriesResponse(object):
    """
    Result returned from WriteLogEntries.
    empty

    Attributes:

    """
    pass


class ListLogEntriesRequest(object):
    """
    The parameters to ``ListLogEntries``.

    Attributes:
      project_ids (list[string]): Deprecated. One or more project identifiers or project numbers from which
        to retrieve log entries.  Example: ``\"my-project-1A\"``. If
        present, these project identifiers are converted to resource format and
        added to the list of resources in ``resourceNames``. Callers should use
        ``resourceNames`` rather than this parameter.
      resource_names (list[string]): Required. One or more cloud resources from which to retrieve log
        entries:

        ::

            \"projects/[PROJECT_ID]\"
            \"organizations/[ORGANIZATION_ID]\"

        Projects listed in the ``project_ids`` field are added to this list.
      filter (string): Optional. A filter that chooses which log entries to return.  See [Advanced
        Logs Filters](/logging/docs/view/advanced_filters).  Only log entries that
        match the filter are returned.  An empty filter matches all log entries.
        The maximum length of the filter is 20000 characters.
      order_by (string): Optional. How the results should be sorted.  Presently, the only permitted
        values are ``\"timestamp asc\"`` (default) and ``\"timestamp desc\"``. The first
        option returns entries in order of increasing values of
        ``LogEntry.timestamp`` (oldest first), and the second option returns entries
        in order of decreasing timestamps (newest first).  Entries with equal
        timestamps are returned in order of ``LogEntry.insertId``.
      page_size (int): Optional. The maximum number of results to return from this request.
        Non-positive values are ignored.  The presence of ``nextPageToken`` in the
        response indicates that more results might be available.
      page_token (string): Optional. If present, then retrieve the next batch of results from the
        preceding call to this method.  ``pageToken`` must be the value of
        ``nextPageToken`` from the previous response.  The values of other method
        parameters should be identical to those in the previous call.

    """
    pass


class ListLogEntriesResponse(object):
    """
    Result returned from ``ListLogEntries``.

    Attributes:
      entries (list[:class:`google.cloud.grpc.logging.v2.log_entry_pb2.LogEntry`]): A list of log entries.
      next_page_token (string): If there might be more results than appear in this response, then
        ``nextPageToken`` is included.  To get the next set of results, call this
        method again using the value of ``nextPageToken`` as ``pageToken``.

    """
    pass


class ListMonitoredResourceDescriptorsRequest(object):
    """
    The parameters to ListMonitoredResourceDescriptors

    Attributes:
      page_size (int): Optional. The maximum number of results to return from this request.
        Non-positive values are ignored.  The presence of ``nextPageToken`` in the
        response indicates that more results might be available.
      page_token (string): Optional. If present, then retrieve the next batch of results from the
        preceding call to this method.  ``pageToken`` must be the value of
        ``nextPageToken`` from the previous response.  The values of other method
        parameters should be identical to those in the previous call.

    """
    pass


class ListMonitoredResourceDescriptorsResponse(object):
    """
    Result returned from ListMonitoredResourceDescriptors.

    Attributes:
      resource_descriptors (list[:class:`google.api.monitored_resource_pb2.MonitoredResourceDescriptor`]): A list of resource descriptors.
      next_page_token (string): If there might be more results than appear in this response, then
        ``nextPageToken`` is included.  To get the next set of results, call this
        method again using the value of ``nextPageToken`` as ``pageToken``.

    """
    pass
