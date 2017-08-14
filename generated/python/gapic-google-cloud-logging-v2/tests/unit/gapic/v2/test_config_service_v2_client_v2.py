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

from google.cloud.logging_v2.gapic import config_service_v2_client
from google.cloud.proto.logging.v2 import logging_config_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestConfigServiceV2Client(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_sinks(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        sinks_element = logging_config_pb2.LogSink()
        sinks = [sinks_element]
        expected_response = logging_config_pb2.ListSinksResponse(
            next_page_token=next_page_token, sinks=sinks)
        grpc_stub.ListSinks.return_value = expected_response

        paged_list_response = client.list_sinks(parent)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.sinks[0], resources[0])

        grpc_stub.ListSinks.assert_called_once()
        args, kwargs = grpc_stub.ListSinks.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_config_pb2.ListSinksRequest(parent=parent)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_sinks_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListSinks.side_effect = CustomException()

        paged_list_response = client.list_sinks(parent)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_sink(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')

        # Mock response
        name = 'name3373707'
        destination = 'destination-1429847026'
        filter_ = 'filter-1274492040'
        writer_identity = 'writerIdentity775638794'
        include_children = True
        expected_response = logging_config_pb2.LogSink(
            name=name,
            destination=destination,
            filter=filter_,
            writer_identity=writer_identity,
            include_children=include_children)
        grpc_stub.GetSink.return_value = expected_response

        response = client.get_sink(sink_name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetSink.assert_called_once()
        args, kwargs = grpc_stub.GetSink.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_config_pb2.GetSinkRequest(
            sink_name=sink_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_sink_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')

        # Mock exception response
        grpc_stub.GetSink.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_sink, sink_name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_sink(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')
        sink = logging_config_pb2.LogSink()

        # Mock response
        name = 'name3373707'
        destination = 'destination-1429847026'
        filter_ = 'filter-1274492040'
        writer_identity = 'writerIdentity775638794'
        include_children = True
        expected_response = logging_config_pb2.LogSink(
            name=name,
            destination=destination,
            filter=filter_,
            writer_identity=writer_identity,
            include_children=include_children)
        grpc_stub.CreateSink.return_value = expected_response

        response = client.create_sink(parent, sink)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateSink.assert_called_once()
        args, kwargs = grpc_stub.CreateSink.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_config_pb2.CreateSinkRequest(
            parent=parent, sink=sink)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_sink_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')
        sink = logging_config_pb2.LogSink()

        # Mock exception response
        grpc_stub.CreateSink.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_sink, parent, sink)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_sink(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')
        sink = logging_config_pb2.LogSink()

        # Mock response
        name = 'name3373707'
        destination = 'destination-1429847026'
        filter_ = 'filter-1274492040'
        writer_identity = 'writerIdentity775638794'
        include_children = True
        expected_response = logging_config_pb2.LogSink(
            name=name,
            destination=destination,
            filter=filter_,
            writer_identity=writer_identity,
            include_children=include_children)
        grpc_stub.UpdateSink.return_value = expected_response

        response = client.update_sink(sink_name, sink)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateSink.assert_called_once()
        args, kwargs = grpc_stub.UpdateSink.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_config_pb2.UpdateSinkRequest(
            sink_name=sink_name, sink=sink)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_sink_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')
        sink = logging_config_pb2.LogSink()

        # Mock exception response
        grpc_stub.UpdateSink.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_sink, sink_name, sink)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_sink(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')

        client.delete_sink(sink_name)

        grpc_stub.DeleteSink.assert_called_once()
        args, kwargs = grpc_stub.DeleteSink.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_config_pb2.DeleteSinkRequest(
            sink_name=sink_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_sink_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = config_service_v2_client.ConfigServiceV2Client()

        # Mock request
        sink_name = client.sink_path('[PROJECT]', '[SINK]')

        # Mock exception response
        grpc_stub.DeleteSink.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_sink, sink_name)
