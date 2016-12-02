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


class LogMetric(object):
    """
    Describes a logs-based metric.  The value of the metric is the
    number of log entries that match a logs filter.

    Attributes:
      name (string): Required. The client-assigned metric identifier.
        Examples: ``\"error_count\"``, ``\"nginx/requests\"``.

        Metric identifiers are limited to 100 characters and can include
        only the following characters: ``A-Z``, ``a-z``, ``0-9``, and the
        special characters ``_-.,+!*',()%/``.  The forward-slash character
        (``/``) denotes a hierarchy of name pieces, and it cannot be the
        first character of the name.

        The metric identifier in this field must not be
        `URL-encoded <https://en.wikipedia.org/wiki/Percent-encoding>`_.
        However, when the metric identifier appears as the ``[METRIC_ID]``
        part of a ``metric_name`` API parameter, then the metric identifier
        must be URL-encoded. Example:
        ``\"projects/my-project/metrics/nginx%2Frequests\"``.
      description (string): Optional. A description of this metric, which is used in documentation.
      filter (string): Required. An `advanced logs filter <https://cloud.google.com/logging/docs/view/advanced_filters>`_.
        Example:

        ::

            \"resource.type=gae_app AND severity>=ERROR\"

        The maximum length of the filter is 20000 characters.
      version (enum :class:`google.cloud.gapic.logging.v2.enums.LogMetric.ApiVersion`): Output only. The API version that created or updated this metric.
        The version also dictates the syntax of the filter expression. When a value
        for this field is missing, the default value of V2 should be assumed.

    """
    pass


class ListLogMetricsRequest(object):
    """
    The parameters to ListLogMetrics.

    Attributes:
      parent (string): Required. The name of the project containing the metrics:

        ::

            \"projects/[PROJECT_ID]\"
      page_token (string): Optional. If present, then retrieve the next batch of results from the
        preceding call to this method.  ``pageToken`` must be the value of
        ``nextPageToken`` from the previous response.  The values of other method
        parameters should be identical to those in the previous call.
      page_size (int): Optional. The maximum number of results to return from this request.
        Non-positive values are ignored.  The presence of ``nextPageToken`` in the
        response indicates that more results might be available.

    """
    pass


class ListLogMetricsResponse(object):
    """
    Result returned from ListLogMetrics.

    Attributes:
      metrics (list[:class:`google.cloud.grpc.logging.v2.logging_metrics_pb2.LogMetric`]): A list of logs-based metrics.
      next_page_token (string): If there might be more results than appear in this response, then
        ``nextPageToken`` is included.  To get the next set of results, call this
        method again using the value of ``nextPageToken`` as ``pageToken``.

    """
    pass


class GetLogMetricRequest(object):
    """
    The parameters to GetLogMetric.

    Attributes:
      metric_name (string): The resource name of the desired metric:

        ::

            \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"

    """
    pass


class CreateLogMetricRequest(object):
    """
    The parameters to CreateLogMetric.

    Attributes:
      parent (string): The resource name of the project in which to create the metric:

        ::

            \"projects/[PROJECT_ID]\"

        The new metric must be provided in the request.
      metric (:class:`google.cloud.grpc.logging.v2.logging_metrics_pb2.LogMetric`): The new logs-based metric, which must not have an identifier that
        already exists.

    """
    pass


class UpdateLogMetricRequest(object):
    """
    The parameters to UpdateLogMetric.

    Attributes:
      metric_name (string): The resource name of the metric to update:

        ::

            \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"

        The updated metric must be provided in the request and it's
        ``name`` field must be the same as ``[METRIC_ID]`` If the metric
        does not exist in ``[PROJECT_ID]``, then a new metric is created.
      metric (:class:`google.cloud.grpc.logging.v2.logging_metrics_pb2.LogMetric`): The updated metric.

    """
    pass


class DeleteLogMetricRequest(object):
    """
    The parameters to DeleteLogMetric.

    Attributes:
      metric_name (string): The resource name of the metric to delete:

        ::

            \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\"

    """
    pass
