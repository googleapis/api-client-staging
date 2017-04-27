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

from google.cloud.gapic.datastore.v1 import datastore_client
from google.cloud.gapic.datastore.v1 import enums
from google.cloud.proto.datastore.v1 import datastore_pb2
from google.cloud.proto.datastore.v1 import entity_pb2


class CustomException(Exception):
    pass


class TestDatastoreClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_lookup(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        keys = []

        # Mock response
        expected_response = datastore_pb2.LookupResponse()
        grpc_stub.Lookup.return_value = expected_response

        response = client.lookup(project_id, keys)
        self.assertEqual(expected_response, response)

        grpc_stub.Lookup.assert_called_once()
        args, kwargs = grpc_stub.Lookup.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.LookupRequest(
            project_id=project_id, keys=keys)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_lookup_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        keys = []

        # Mock exception response
        grpc_stub.Lookup.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.lookup, project_id, keys)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_run_query(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        partition_id = entity_pb2.PartitionId()

        # Mock response
        expected_response = datastore_pb2.RunQueryResponse()
        grpc_stub.RunQuery.return_value = expected_response

        response = client.run_query(project_id, partition_id)
        self.assertEqual(expected_response, response)

        grpc_stub.RunQuery.assert_called_once()
        args, kwargs = grpc_stub.RunQuery.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.RunQueryRequest(
            project_id=project_id, partition_id=partition_id)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_run_query_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        partition_id = entity_pb2.PartitionId()

        # Mock exception response
        grpc_stub.RunQuery.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.run_query, project_id,
                          partition_id)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_begin_transaction(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'

        # Mock response
        transaction = b'-34'
        expected_response = datastore_pb2.BeginTransactionResponse(
            transaction=transaction)
        grpc_stub.BeginTransaction.return_value = expected_response

        response = client.begin_transaction(project_id)
        self.assertEqual(expected_response, response)

        grpc_stub.BeginTransaction.assert_called_once()
        args, kwargs = grpc_stub.BeginTransaction.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.BeginTransactionRequest(
            project_id=project_id)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_begin_transaction_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'

        # Mock exception response
        grpc_stub.BeginTransaction.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.begin_transaction,
                          project_id)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_commit(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        mode = enums.CommitRequest.Mode.MODE_UNSPECIFIED
        mutations = []

        # Mock response
        index_updates = -1425228195
        expected_response = datastore_pb2.CommitResponse(
            index_updates=index_updates)
        grpc_stub.Commit.return_value = expected_response

        response = client.commit(project_id, mode, mutations)
        self.assertEqual(expected_response, response)

        grpc_stub.Commit.assert_called_once()
        args, kwargs = grpc_stub.Commit.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.CommitRequest(
            project_id=project_id, mode=mode, mutations=mutations)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_commit_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        mode = enums.CommitRequest.Mode.MODE_UNSPECIFIED
        mutations = []

        # Mock exception response
        grpc_stub.Commit.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.commit, project_id, mode,
                          mutations)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_rollback(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        transaction = b'-34'

        # Mock response
        expected_response = datastore_pb2.RollbackResponse()
        grpc_stub.Rollback.return_value = expected_response

        response = client.rollback(project_id, transaction)
        self.assertEqual(expected_response, response)

        grpc_stub.Rollback.assert_called_once()
        args, kwargs = grpc_stub.Rollback.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.RollbackRequest(
            project_id=project_id, transaction=transaction)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_rollback_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        transaction = b'-34'

        # Mock exception response
        grpc_stub.Rollback.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.rollback, project_id,
                          transaction)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_allocate_ids(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        keys = []

        # Mock response
        expected_response = datastore_pb2.AllocateIdsResponse()
        grpc_stub.AllocateIds.return_value = expected_response

        response = client.allocate_ids(project_id, keys)
        self.assertEqual(expected_response, response)

        grpc_stub.AllocateIds.assert_called_once()
        args, kwargs = grpc_stub.AllocateIds.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = datastore_pb2.AllocateIdsRequest(
            project_id=project_id, keys=keys)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_allocate_ids_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = datastore_client.DatastoreClient()

        # Mock request
        project_id = 'projectId-1969970175'
        keys = []

        # Mock exception response
        grpc_stub.AllocateIds.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.allocate_ids, project_id,
                          keys)
