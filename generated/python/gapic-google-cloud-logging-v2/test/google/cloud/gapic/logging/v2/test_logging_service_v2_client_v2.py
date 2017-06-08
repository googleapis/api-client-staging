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

from google.api import monitored_resource_pb2
from google.cloud.gapic.logging.v2 import logging_service_v2_client
from google.cloud.proto.logging.v2 import log_entry_pb2
from google.cloud.proto.logging.v2 import logging_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestLoggingServiceV2Client(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_log(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        log_name = client.log_path('[PROJECT]', '[LOG]')

        client.delete_log(log_name)

        grpc_stub.DeleteLog.assert_called_once()
        args, kwargs = grpc_stub.DeleteLog.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_pb2.DeleteLogRequest(log_name=log_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_log_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        log_name = client.log_path('[PROJECT]', '[LOG]')

        # Mock exception response
        grpc_stub.DeleteLog.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_log, log_name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_write_log_entries(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        entries = []

        # Mock response
        expected_response = logging_pb2.WriteLogEntriesResponse()
        grpc_stub.WriteLogEntries.return_value = expected_response

        response = client.write_log_entries(entries)
        self.assertEqual(expected_response, response)

        grpc_stub.WriteLogEntries.assert_called_once()
        args, kwargs = grpc_stub.WriteLogEntries.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_pb2.WriteLogEntriesRequest(entries=entries)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_write_log_entries_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        entries = []

        # Mock exception response
        grpc_stub.WriteLogEntries.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.write_log_entries, entries)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_log_entries(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        resource_names = []

        # Mock response
        next_page_token = ''
        entries_element = log_entry_pb2.LogEntry()
        entries = [entries_element]
        expected_response = logging_pb2.ListLogEntriesResponse(
            next_page_token=next_page_token, entries=entries)
        grpc_stub.ListLogEntries.return_value = expected_response

        paged_list_response = client.list_log_entries(resource_names)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.entries[0], resources[0])

        grpc_stub.ListLogEntries.assert_called_once()
        args, kwargs = grpc_stub.ListLogEntries.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_pb2.ListLogEntriesRequest(
            resource_names=resource_names)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_log_entries_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        resource_names = []

        # Mock exception response
        grpc_stub.ListLogEntries.side_effect = CustomException()

        paged_list_response = client.list_log_entries(resource_names)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_monitored_resource_descriptors(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock response
        next_page_token = ''
        resource_descriptors_element = monitored_resource_pb2.MonitoredResourceDescriptor(
        )
        resource_descriptors = [resource_descriptors_element]
        expected_response = logging_pb2.ListMonitoredResourceDescriptorsResponse(
            next_page_token=next_page_token,
            resource_descriptors=resource_descriptors)
        grpc_stub.ListMonitoredResourceDescriptors.return_value = expected_response

        paged_list_response = client.list_monitored_resource_descriptors()
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.resource_descriptors[0],
                         resources[0])

        grpc_stub.ListMonitoredResourceDescriptors.assert_called_once()
        args, kwargs = grpc_stub.ListMonitoredResourceDescriptors.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_pb2.ListMonitoredResourceDescriptorsRequest(
        )
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_monitored_resource_descriptors_exception(
            self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock exception response
        grpc_stub.ListMonitoredResourceDescriptors.side_effect = CustomException(
        )

        paged_list_response = client.list_monitored_resource_descriptors()
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_logs(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        log_names_element = 'logNamesElement-1079688374'
        log_names = [log_names_element]
        expected_response = logging_pb2.ListLogsResponse(
            next_page_token=next_page_token, log_names=log_names)
        grpc_stub.ListLogs.return_value = expected_response

        paged_list_response = client.list_logs(parent)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.log_names[0], resources[0])

        grpc_stub.ListLogs.assert_called_once()
        args, kwargs = grpc_stub.ListLogs.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_pb2.ListLogsRequest(parent=parent)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_logs_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = logging_service_v2_client.LoggingServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListLogs.side_effect = CustomException()

        paged_list_response = client.list_logs(parent)
        self.assertRaises(errors.GaxError, list, paged_list_response)
