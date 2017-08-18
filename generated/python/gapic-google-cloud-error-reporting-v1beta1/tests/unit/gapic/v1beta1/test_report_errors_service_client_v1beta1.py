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
"""Unit tests."""

import mock
import unittest

from google.gax import errors

from google.cloud import errorreporting_v1beta1
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import report_errors_service_pb2


class CustomException(Exception):
    pass


class TestReportErrorsServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_report_error_event(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ReportErrorsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        event = {}

        # Mock response
        expected_response = {}
        expected_response = report_errors_service_pb2.ReportErrorEventResponse(
            **expected_response)
        grpc_stub.ReportErrorEvent.return_value = expected_response

        response = client.report_error_event(project_name, event)
        self.assertEqual(expected_response, response)

        grpc_stub.ReportErrorEvent.assert_called_once()
        args, kwargs = grpc_stub.ReportErrorEvent.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = report_errors_service_pb2.ReportErrorEventRequest(
            project_name=project_name, event=event)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_report_error_event_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ReportErrorsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        event = {}

        # Mock exception response
        grpc_stub.ReportErrorEvent.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.report_error_event,
                          project_name, event)
