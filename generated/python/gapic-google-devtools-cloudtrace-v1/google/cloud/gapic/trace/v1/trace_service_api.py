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
# https://github.com/google/googleapis/blob/master/google/devtools/cloudtrace/v1/trace.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.devtools.cloudtrace.v1 TraceService API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.trace.v1 import enums
from google.devtools.cloudtrace.v1 import trace_pb2
from google.protobuf import timestamp_pb2

_PageDesc = google.gax.PageDescriptor


class TraceServiceApi(object):
    """
    This file describes an API for collecting and viewing traces and spans
    within a trace.  A Trace is a collection of spans corresponding to a single
    operation or set of operations for an application. A span is an individual
    timed event which forms a node of the trace tree. Spans for a single trace
    may span multiple services.
    """

    SERVICE_ADDRESS = 'cloudtrace.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_traces': _PageDesc('page_token', 'next_page_token', 'traces')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
                   'https://www.googleapis.com/auth/trace.append',
                   'https://www.googleapis.com/auth/trace.readonly', )

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
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          ssl_creds (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
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
          A TraceServiceApi object.
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
                __name__, 'trace_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.devtools.cloudtrace.v1.TraceService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.trace_service_stub = config.create_stub(
            trace_pb2.TraceServiceStub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)

        self._patch_traces = api_callable.create_api_call(
            self.trace_service_stub.PatchTraces,
            settings=defaults['patch_traces'])
        self._get_trace = api_callable.create_api_call(
            self.trace_service_stub.GetTrace, settings=defaults['get_trace'])
        self._list_traces = api_callable.create_api_call(
            self.trace_service_stub.ListTraces,
            settings=defaults['list_traces'])

    # Service calls
    def patch_traces(self, project_id, traces, options=None):
        """
        Sends new traces to Stackdriver Trace or updates existing traces. If the ID
        of a trace that you send matches that of an existing trace, any fields
        in the existing trace and its spans are overwritten by the provided values,
        and any new fields provided are merged with the existing trace data. If the
        ID does not match, a new trace is created.

        Example:
          >>> from google.cloud.gapic.trace.v1 import trace_service_api
          >>> from google.devtools.cloudtrace.v1 import trace_pb2
          >>> api = trace_service_api.TraceServiceApi()
          >>> project_id = ''
          >>> traces = trace_pb2.Traces()
          >>> api.patch_traces(project_id, traces)

        Args:
          project_id (string): ID of the Cloud project where the trace data is stored.
          traces (:class:`google.devtools.cloudtrace.v1.trace_pb2.Traces`): The body of the message.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = trace_pb2.PatchTracesRequest(
            project_id=project_id, traces=traces)
        self._patch_traces(request, options)

    def get_trace(self, project_id, trace_id, options=None):
        """
        Gets a single trace by its ID.

        Example:
          >>> from google.cloud.gapic.trace.v1 import trace_service_api
          >>> api = trace_service_api.TraceServiceApi()
          >>> project_id = ''
          >>> trace_id = ''
          >>> response = api.get_trace(project_id, trace_id)

        Args:
          project_id (string): ID of the Cloud project where the trace data is stored.
          trace_id (string): ID of the trace to return.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.devtools.cloudtrace.v1.trace_pb2.Trace` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = trace_pb2.GetTraceRequest(
            project_id=project_id, trace_id=trace_id)
        return self._get_trace(request, options)

    def list_traces(self,
                    project_id,
                    view=None,
                    page_size=0,
                    start_time=None,
                    end_time=None,
                    filter_='',
                    order_by='',
                    options=None):
        """
        Returns of a list of traces that match the specified filter conditions.

        Example:
          >>> from google.cloud.gapic.trace.v1 import trace_service_api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = trace_service_api.TraceServiceApi()
          >>> project_id = ''
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_traces(project_id):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_traces(project_id, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project_id (string): ID of the Cloud project where the trace data is stored.
          view (enum :class:`google.cloud.gapic.trace.v1.enums.ListTracesRequest.ViewType`): Type of data returned for traces in the list. Optional. Default is
            ``MINIMAL``.
          page_size (int): Maximum number of traces to return. If not specified or <= 0, the
            implementation selects a reasonable value.  The implementation may
            return fewer traces than the requested page size. Optional.
          start_time (:class:`google.protobuf.timestamp_pb2.Timestamp`): End of the time interval (inclusive) during which the trace data was
            collected from the application.
          end_time (:class:`google.protobuf.timestamp_pb2.Timestamp`): Start of the time interval (inclusive) during which the trace data was
            collected from the application.
          filter_ (string): An optional filter for the request.
          order_by (string): Field used to sort the returned traces. Optional.
            Can be one of the following:

            *   ``trace_id``
            *   ``name`` (``name`` field of root span in the trace)
            *   ``duration`` (difference between ``end_time`` and ``start_time`` fields of
                 the root span)
            *   ``start`` (``start_time`` field of the root span)

            Descending order can be specified by appending ``desc`` to the sort field
            (for example, ``name desc``).

            Only one sort field is permitted.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.devtools.cloudtrace.v1.trace_pb2.Trace` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if view is None:
            view = enums.ListTracesRequest.ViewType.VIEW_TYPE_UNSPECIFIED
        if start_time is None:
            start_time = timestamp_pb2.Timestamp()
        if end_time is None:
            end_time = timestamp_pb2.Timestamp()
        request = trace_pb2.ListTracesRequest(
            project_id=project_id,
            view=view,
            page_size=page_size,
            start_time=start_time,
            end_time=end_time,
            filter=filter_,
            order_by=order_by)
        return self._list_traces(request, options)
