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
from google.logging.type import http_request_pb2
from google.protobuf import any_pb2
from google.protobuf import timestamp_pb2


class LogEntry(object):
    """
    An individual entry in a log.

    Attributes:
      log_name (string): Required. The resource name of the log to which this log entry belongs:

        ::

            \"projects/[PROJECT_ID]/logs/[LOG_ID]\"
            \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\"

        ``[LOG_ID]`` must be URL-encoded within ``log_name``. Example:
        ``\"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\"``.
        ``[LOG_ID]`` must be less than 512 characters long and can only include the
        following characters: upper and lower case alphanumeric characters,
        forward-slash, underscore, hyphen, and period.

        For backward compatibility, if ``log_name`` begins with a forward-slash, such
        as ``/projects/...``, then the log entry is ingested as usual but the
        forward-slash is removed. Listing the log entry will not show the leading
        slash and filtering for a log name with a leading slash will never return
        any results.
      resource (:class:`google.api.monitored_resource_pb2.MonitoredResource`): Required. The monitored resource associated with this log entry.
        Example: a log entry that reports a database error would be
        associated with the monitored resource designating the particular
        database that reported the error.
      proto_payload (:class:`google.protobuf.any_pb2.Any`): The log entry payload, represented as a protocol buffer.  Some
        Google Cloud Platform services use this field for their log
        entry payloads.
      text_payload (string): The log entry payload, represented as a Unicode string (UTF-8).
      json_payload (:class:`google.protobuf.struct_pb2.Struct`): The log entry payload, represented as a structure that is
        expressed as a JSON object.
      timestamp (:class:`google.protobuf.timestamp_pb2.Timestamp`): Optional. The time the event described by the log entry occurred.  If
        omitted, Stackdriver Logging will use the time the log entry is received.
      severity (enum :class:`google.cloud.gapic.logging.v2.enums.LogSeverity`): Optional. The severity of the log entry. The default value is
        ``LogSeverity.DEFAULT``.
      insert_id (string): Optional. A unique ID for the log entry. If you provide this
        field, the logging service considers other log entries in the
        same project with the same ID as duplicates which can be removed.  If
        omitted, Stackdriver Logging will generate a unique ID for this
        log entry.
      http_request (:class:`google.logging.type.http_request_pb2.HttpRequest`): Optional. Information about the HTTP request associated with this
        log entry, if applicable.
      labels (dict[string -> :class:`google.cloud.grpc.logging.v2.log_entry_pb2.LogEntry.LabelsEntry`]): Optional. A set of user-defined (key, value) data that provides additional
        information about the log entry.
      operation (:class:`google.cloud.grpc.logging.v2.log_entry_pb2.LogEntryOperation`): Optional. Information about an operation associated with the log entry, if
        applicable.

    """
    pass


class LogEntryOperation(object):
    """
    Additional information about a potentially long-running operation with which
    a log entry is associated.

    Attributes:
      id (string): Optional. An arbitrary operation identifier. Log entries with the
        same identifier are assumed to be part of the same operation.
      producer (string): Optional. An arbitrary producer identifier. The combination of
        ``id`` and ``producer`` must be globally unique.  Examples for ``producer``:
        ``\"MyDivision.MyBigCompany.com\"``, ``\"github.com/MyProject/MyApplication\"``.
      first (bool): Optional. Set this to True if this is the first log entry in the operation.
      last (bool): Optional. Set this to True if this is the last log entry in the operation.

    """
    pass
