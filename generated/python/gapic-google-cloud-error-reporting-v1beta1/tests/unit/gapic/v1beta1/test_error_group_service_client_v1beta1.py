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
from google.cloud.proto.devtools.clouderrorreporting.v1beta1 import error_group_service_pb2


class CustomException(Exception):
    pass


class TestErrorGroupServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorGroupServiceClient()

        # Mock request
        group_name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock response
        name = 'name3373707'
        group_id = 'groupId506361563'
        expected_response = {'name': name, 'group_id': group_id}
        expected_response = common_pb2.ErrorGroup(**expected_response)
        grpc_stub.GetGroup.return_value = expected_response

        response = client.get_group(group_name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetGroup.assert_called_once()
        args, kwargs = grpc_stub.GetGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = error_group_service_pb2.GetGroupRequest(
            group_name=group_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorGroupServiceClient()

        # Mock request
        group_name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock exception response
        grpc_stub.GetGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_group, group_name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorGroupServiceClient()

        # Mock request
        group = {}

        # Mock response
        name = 'name3373707'
        group_id = 'groupId506361563'
        expected_response = {'name': name, 'group_id': group_id}
        expected_response = common_pb2.ErrorGroup(**expected_response)
        grpc_stub.UpdateGroup.return_value = expected_response

        response = client.update_group(group)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateGroup.assert_called_once()
        args, kwargs = grpc_stub.UpdateGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = error_group_service_pb2.UpdateGroupRequest(
            group=group)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = errorreporting_v1beta1.ErrorGroupServiceClient()

        # Mock request
        group = {}

        # Mock exception response
        grpc_stub.UpdateGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_group, group)
