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

from google.protobuf import timestamp_pb2


class LogSink(object):
    """
    Describes a sink used to export log entries outside of Stackdriver Logging.
    A logs filter controls which log entries are exported.  Sinks can have a
    start time and an end time; these can be used to place log entries from an
    exact time range into a particular destination.  If both ``start_time`` and
    ``end_time`` are present, then ``start_time`` must be less than ``end_time``.

    Attributes:
      name (string): Required. The client-assigned sink identifier, unique within the
        project. Example: ``\"my-syslog-errors-to-pubsub\"``.  Sink identifiers are
        limited to 100 characters and can include only the following characters:
        upper and lower-case alphanumeric characters, underscores, hyphens, and
        periods.
      destination (string): Required. The export destination:

        ::

            \"storage.googleapis.com/[GCS_BUCKET]\"
            \"bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]\"
            \"pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]\"

        For more information,  see
        `Exporting Logs With Sinks <https://cloud.google.com/logging/docs/api/tasks/exporting-logs>`_.
      filter (string): Optional. An `advanced logs filter <https://cloud.google.com/logging/docs/view/advanced_filters>`_.
        Only log entries matching the filter are exported. The filter
        must be consistent with the log entry format specified by the
        ``outputVersionFormat`` parameter, regardless of the format of the
        log entry that was originally ingested by Stackdriver Logging.
        The following example uses field names in the v2 log entry format:

        ::

            logName=\"projects/[PROJECT_ID]/logs/[LOG_ID]\" AND severity>=ERROR
      output_version_format (enum :class:`google.cloud.gapic.logging.v2.enums.LogSink.VersionFormat`): Optional. The log entry version to use for this sink's exported log
        entries.  This version does not have to correspond to the version of the
        log entry that was written to Stackdriver Logging. If omitted, the
        v2 format is used.
      writer_identity (string): Output only. An IAM identity&mdash;a service account or group&mdash;that
        will write exported log entries to the destination on behalf of Stackdriver
        Logging. You must grant this identity write-access to the destination.
        Consult the destination service's documentation to determine the exact role
        that must be granted.
      start_time (:class:`google.protobuf.timestamp_pb2.Timestamp`): Optional. The time at which this sink will begin exporting log entries.  If
        this value is present, then log entries are exported only if ``start_time``
        <=``entry.timestamp``.
      end_time (:class:`google.protobuf.timestamp_pb2.Timestamp`): Optional. Time at which this sink will stop exporting log entries.  If this
        value is present, then log entries are exported only if ``entry.timestamp`` <
        ``end_time``.

    """
    pass


class ListSinksRequest(object):
    """
    The parameters to ``ListSinks``.

    Attributes:
      parent (string): Required. The resource name where this sink was created:

        ::

            \"projects/[PROJECT_ID]\"
            \"organizations/[ORGANIZATION_ID]\"
      page_token (string): Optional. If present, then retrieve the next batch of results from the
        preceding call to this method.  ``pageToken`` must be the value of
        ``nextPageToken`` from the previous response.  The values of other method
        parameters should be identical to those in the previous call.
      page_size (int): Optional. The maximum number of results to return from this request.
        Non-positive values are ignored.  The presence of ``nextPageToken`` in the
        response indicates that more results might be available.

    """
    pass


class ListSinksResponse(object):
    """
    Result returned from ``ListSinks``.

    Attributes:
      sinks (list[:class:`google.cloud.grpc.logging.v2.logging_config_pb2.LogSink`]): A list of sinks.
      next_page_token (string): If there might be more results than appear in this response, then
        ``nextPageToken`` is included.  To get the next set of results, call the same
        method again using the value of ``nextPageToken`` as ``pageToken``.

    """
    pass


class GetSinkRequest(object):
    """
    The parameters to ``GetSink``.

    Attributes:
      sink_name (string): Required. The resource name of the sink to return:

        ::

            \"projects/[PROJECT_ID]/sinks/[SINK_ID]\"
            \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\"

    """
    pass


class CreateSinkRequest(object):
    """
    The parameters to ``CreateSink``.

    Attributes:
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

    """
    pass


class UpdateSinkRequest(object):
    """
    The parameters to ``UpdateSink``.

    Attributes:
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

    """
    pass


class DeleteSinkRequest(object):
    """
    The parameters to ``DeleteSink``.

    Attributes:
      sink_name (string): Required. The resource name of the sink to delete, including the parent
        resource and the sink identifier:

        ::

            \"projects/[PROJECT_ID]/sinks/[SINK_ID]\"
            \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\"

        It is an error if the sink does not exist.

    """
    pass
