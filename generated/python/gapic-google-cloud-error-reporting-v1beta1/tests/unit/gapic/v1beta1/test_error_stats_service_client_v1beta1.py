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
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import common_pb2
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import error_stats_service_pb2


class CustomException(Exception):
    pass


class TestErrorStatsServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_group_stats(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        time_range = {}

        # Mock response
        next_page_token = ''
        error_group_stats_element = {}
        error_group_stats = [error_group_stats_element]
        expected_response = {
            'next_page_token': next_page_token,
            'error_group_stats': error_group_stats
        }
        expected_response = error_stats_service_pb2.ListGroupStatsResponse(
            **expected_response)
        grpc_stub.ListGroupStats.return_value = expected_response

        paged_list_response = client.list_group_stats(project_name, time_range)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.error_group_stats[0], resources[0])

        grpc_stub.ListGroupStats.assert_called_once()
        args, kwargs = grpc_stub.ListGroupStats.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = error_stats_service_pb2.ListGroupStatsRequest(
            project_name=project_name, time_range=time_range)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_group_stats_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        time_range = {}

        # Mock exception response
        grpc_stub.ListGroupStats.side_effect = CustomException()

        paged_list_response = client.list_group_stats(project_name, time_range)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_events(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        group_id = 'groupId506361563'

        # Mock response
        next_page_token = ''
        error_events_element = {}
        error_events = [error_events_element]
        expected_response = {
            'next_page_token': next_page_token,
            'error_events': error_events
        }
        expected_response = error_stats_service_pb2.ListEventsResponse(
            **expected_response)
        grpc_stub.ListEvents.return_value = expected_response

        paged_list_response = client.list_events(project_name, group_id)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.error_events[0], resources[0])

        grpc_stub.ListEvents.assert_called_once()
        args, kwargs = grpc_stub.ListEvents.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = error_stats_service_pb2.ListEventsRequest(
            project_name=project_name, group_id=group_id)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_events_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')
        group_id = 'groupId506361563'

        # Mock exception response
        grpc_stub.ListEvents.side_effect = CustomException()

        paged_list_response = client.list_events(project_name, group_id)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_events(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')

        # Mock response
        expected_response = {}
        expected_response = error_stats_service_pb2.DeleteEventsResponse(
            **expected_response)
        grpc_stub.DeleteEvents.return_value = expected_response

        response = client.delete_events(project_name)
        self.assertEqual(expected_response, response)

        grpc_stub.DeleteEvents.assert_called_once()
        args, kwargs = grpc_stub.DeleteEvents.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = error_stats_service_pb2.DeleteEventsRequest(
            project_name=project_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_events_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorStatsServiceClient()

        # Mock request
        project_name = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.DeleteEvents.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_events, project_name)
