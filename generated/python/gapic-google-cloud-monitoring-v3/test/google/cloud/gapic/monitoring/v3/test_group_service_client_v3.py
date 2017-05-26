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
from google.cloud.gapic.monitoring.v3 import group_service_client
from google.cloud.proto.monitoring.v3 import group_pb2
from google.cloud.proto.monitoring.v3 import group_service_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestGroupServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_groups(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        group_element = group_pb2.Group()
        group = [group_element]
        expected_response = group_service_pb2.ListGroupsResponse(
            next_page_token=next_page_token, group=group)
        grpc_stub.ListGroups.return_value = expected_response

        paged_list_response = client.list_groups(name)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.group[0], resources[0])

        grpc_stub.ListGroups.assert_called_once()
        args, kwargs = grpc_stub.ListGroups.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.ListGroupsRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_groups_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListGroups.side_effect = CustomException()

        paged_list_response = client.list_groups(name)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock response
        name_2 = 'name2-1052831874'
        display_name = 'displayName1615086568'
        parent_name = 'parentName1015022848'
        filter_ = 'filter-1274492040'
        is_cluster = False
        expected_response = group_pb2.Group(
            name=name_2,
            display_name=display_name,
            parent_name=parent_name,
            filter=filter_,
            is_cluster=is_cluster)
        grpc_stub.GetGroup.return_value = expected_response

        response = client.get_group(name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetGroup.assert_called_once()
        args, kwargs = grpc_stub.GetGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.GetGroupRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock exception response
        grpc_stub.GetGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_group, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        group = group_pb2.Group()

        # Mock response
        name_2 = 'name2-1052831874'
        display_name = 'displayName1615086568'
        parent_name = 'parentName1015022848'
        filter_ = 'filter-1274492040'
        is_cluster = False
        expected_response = group_pb2.Group(
            name=name_2,
            display_name=display_name,
            parent_name=parent_name,
            filter=filter_,
            is_cluster=is_cluster)
        grpc_stub.CreateGroup.return_value = expected_response

        response = client.create_group(name, group)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateGroup.assert_called_once()
        args, kwargs = grpc_stub.CreateGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.CreateGroupRequest(
            name=name, group=group)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        group = group_pb2.Group()

        # Mock exception response
        grpc_stub.CreateGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_group, name, group)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        group = group_pb2.Group()

        # Mock response
        name = 'name3373707'
        display_name = 'displayName1615086568'
        parent_name = 'parentName1015022848'
        filter_ = 'filter-1274492040'
        is_cluster = False
        expected_response = group_pb2.Group(
            name=name,
            display_name=display_name,
            parent_name=parent_name,
            filter=filter_,
            is_cluster=is_cluster)
        grpc_stub.UpdateGroup.return_value = expected_response

        response = client.update_group(group)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateGroup.assert_called_once()
        args, kwargs = grpc_stub.UpdateGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.UpdateGroupRequest(group=group)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        group = group_pb2.Group()

        # Mock exception response
        grpc_stub.UpdateGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_group, group)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_group(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        client.delete_group(name)

        grpc_stub.DeleteGroup.assert_called_once()
        args, kwargs = grpc_stub.DeleteGroup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.DeleteGroupRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_group_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock exception response
        grpc_stub.DeleteGroup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_group, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_group_members(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock response
        next_page_token = ''
        total_size = -705419236
        members_element = monitored_resource_pb2.MonitoredResource()
        members = [members_element]
        expected_response = group_service_pb2.ListGroupMembersResponse(
            next_page_token=next_page_token,
            total_size=total_size,
            members=members)
        grpc_stub.ListGroupMembers.return_value = expected_response

        paged_list_response = client.list_group_members(name)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.members[0], resources[0])

        grpc_stub.ListGroupMembers.assert_called_once()
        args, kwargs = grpc_stub.ListGroupMembers.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = group_service_pb2.ListGroupMembersRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_group_members_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = group_service_client.GroupServiceClient()

        # Mock request
        name = client.group_path('[PROJECT]', '[GROUP]')

        # Mock exception response
        grpc_stub.ListGroupMembers.side_effect = CustomException()

        paged_list_response = client.list_group_members(name)
        self.assertRaises(errors.GaxError, list, paged_list_response)
