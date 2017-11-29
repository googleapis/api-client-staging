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
from google.rpc import status_pb2

from google.cloud import functions_v1beta2
from google.cloud.proto.functions.v1beta2 import functions_pb2
from google.longrunning import operations_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestCloudFunctionsServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_functions(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        location = client.location_path('[PROJECT]', '[LOCATION]')

        # Mock response
        next_page_token = ''
        functions_element = {}
        functions = [functions_element]
        expected_response = {
            'next_page_token': next_page_token,
            'functions': functions
        }
        expected_response = functions_pb2.ListFunctionsResponse(
            **expected_response)
        grpc_stub.ListFunctions.return_value = expected_response

        paged_list_response = client.list_functions(location)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.functions[0], resources[0])

        grpc_stub.ListFunctions.assert_called_once()
        args, kwargs = grpc_stub.ListFunctions.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.ListFunctionsRequest(
            location=location)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_functions_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        location = client.location_path('[PROJECT]', '[LOCATION]')

        # Mock exception response
        grpc_stub.ListFunctions.side_effect = CustomException()

        paged_list_response = client.list_functions(location)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_function(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')

        # Mock response
        name_2 = 'name2-1052831874'
        source_archive_url = 'sourceArchiveUrl-289007026'
        latest_operation = 'latestOperation-1633164625'
        entry_point = 'entryPoint-799136893'
        available_memory_mb = 1964533661
        service_account = 'serviceAccount-1948028253'
        expected_response = {
            'name': name_2,
            'source_archive_url': source_archive_url,
            'latest_operation': latest_operation,
            'entry_point': entry_point,
            'available_memory_mb': available_memory_mb,
            'service_account': service_account
        }
        expected_response = functions_pb2.CloudFunction(**expected_response)
        grpc_stub.GetFunction.return_value = expected_response

        response = client.get_function(name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetFunction.assert_called_once()
        args, kwargs = grpc_stub.GetFunction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.GetFunctionRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_function_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')

        # Mock exception response
        grpc_stub.GetFunction.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_function, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_function(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        location = client.location_path('[PROJECT]', '[LOCATION]')
        function = {}

        # Mock response
        name = 'name3373707'
        source_archive_url = 'sourceArchiveUrl-289007026'
        latest_operation = 'latestOperation-1633164625'
        entry_point = 'entryPoint-799136893'
        available_memory_mb = 1964533661
        service_account = 'serviceAccount-1948028253'
        expected_response = {
            'name': name,
            'source_archive_url': source_archive_url,
            'latest_operation': latest_operation,
            'entry_point': entry_point,
            'available_memory_mb': available_memory_mb,
            'service_account': service_account
        }
        expected_response = functions_pb2.CloudFunction(**expected_response)
        operation = operations_pb2.Operation(
            name='operations/test_create_function', done=True)
        operation.response.Pack(expected_response)
        grpc_stub.CreateFunction.return_value = operation

        response = client.create_function(location, function)
        self.assertEqual(expected_response, response.result())

        grpc_stub.CreateFunction.assert_called_once()
        args, kwargs = grpc_stub.CreateFunction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.CreateFunctionRequest(
            location=location, function=function)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_function_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        location = client.location_path('[PROJECT]', '[LOCATION]')
        function = {}

        # Mock exception response
        error = status_pb2.Status()
        operation = operations_pb2.Operation(
            name='operations/test_create_function_exception', done=True)
        operation.error.CopyFrom(error)
        grpc_stub.CreateFunction.return_value = operation

        response = client.create_function(location, function)
        self.assertEqual(error, response.exception())

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_function(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
        function = {}

        # Mock response
        name_2 = 'name2-1052831874'
        source_archive_url = 'sourceArchiveUrl-289007026'
        latest_operation = 'latestOperation-1633164625'
        entry_point = 'entryPoint-799136893'
        available_memory_mb = 1964533661
        service_account = 'serviceAccount-1948028253'
        expected_response = {
            'name': name_2,
            'source_archive_url': source_archive_url,
            'latest_operation': latest_operation,
            'entry_point': entry_point,
            'available_memory_mb': available_memory_mb,
            'service_account': service_account
        }
        expected_response = functions_pb2.CloudFunction(**expected_response)
        operation = operations_pb2.Operation(
            name='operations/test_update_function', done=True)
        operation.response.Pack(expected_response)
        grpc_stub.UpdateFunction.return_value = operation

        response = client.update_function(name, function)
        self.assertEqual(expected_response, response.result())

        grpc_stub.UpdateFunction.assert_called_once()
        args, kwargs = grpc_stub.UpdateFunction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.UpdateFunctionRequest(
            name=name, function=function)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_function_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
        function = {}

        # Mock exception response
        error = status_pb2.Status()
        operation = operations_pb2.Operation(
            name='operations/test_update_function_exception', done=True)
        operation.error.CopyFrom(error)
        grpc_stub.UpdateFunction.return_value = operation

        response = client.update_function(name, function)
        self.assertEqual(error, response.exception())

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_function(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')

        # Mock response
        expected_response = {}
        expected_response = empty_pb2.Empty(**expected_response)
        operation = operations_pb2.Operation(
            name='operations/test_delete_function', done=True)
        operation.response.Pack(expected_response)
        grpc_stub.DeleteFunction.return_value = operation

        response = client.delete_function(name)
        self.assertEqual(expected_response, response.result())

        grpc_stub.DeleteFunction.assert_called_once()
        args, kwargs = grpc_stub.DeleteFunction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.DeleteFunctionRequest(name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_function_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')

        # Mock exception response
        error = status_pb2.Status()
        operation = operations_pb2.Operation(
            name='operations/test_delete_function_exception', done=True)
        operation.error.CopyFrom(error)
        grpc_stub.DeleteFunction.return_value = operation

        response = client.delete_function(name)
        self.assertEqual(error, response.exception())

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_call_function(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
        data = 'data3076010'

        # Mock response
        execution_id = 'executionId-1217171550'
        result = 'result-934426595'
        error = 'error96784904'
        expected_response = {
            'execution_id': execution_id,
            'result': result,
            'error': error
        }
        expected_response = functions_pb2.CallFunctionResponse(
            **expected_response)
        grpc_stub.CallFunction.return_value = expected_response

        response = client.call_function(name, data)
        self.assertEqual(expected_response, response)

        grpc_stub.CallFunction.assert_called_once()
        args, kwargs = grpc_stub.CallFunction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = functions_pb2.CallFunctionRequest(
            name=name, data=data)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_call_function_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = functions_v1beta2.CloudFunctionsServiceClient()

        # Mock request
        name = client.function_path('[PROJECT]', '[LOCATION]', '[FUNCTION]')
        data = 'data3076010'

        # Mock exception response
        grpc_stub.CallFunction.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.call_function, name, data)
