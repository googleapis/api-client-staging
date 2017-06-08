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

from google.cloud.gapic.logging.v2 import metrics_service_v2_client
from google.cloud.proto.logging.v2 import logging_metrics_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestMetricsServiceV2Client(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_log_metrics(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        metrics_element = logging_metrics_pb2.LogMetric()
        metrics = [metrics_element]
        expected_response = logging_metrics_pb2.ListLogMetricsResponse(
            next_page_token=next_page_token, metrics=metrics)
        grpc_stub.ListLogMetrics.return_value = expected_response

        paged_list_response = client.list_log_metrics(parent)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.metrics[0], resources[0])

        grpc_stub.ListLogMetrics.assert_called_once()
        args, kwargs = grpc_stub.ListLogMetrics.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_metrics_pb2.ListLogMetricsRequest(
            parent=parent)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_log_metrics_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListLogMetrics.side_effect = CustomException()

        paged_list_response = client.list_log_metrics(parent)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_log_metric(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')

        # Mock response
        name = 'name3373707'
        description = 'description-1724546052'
        filter_ = 'filter-1274492040'
        expected_response = logging_metrics_pb2.LogMetric(
            name=name, description=description, filter=filter_)
        grpc_stub.GetLogMetric.return_value = expected_response

        response = client.get_log_metric(metric_name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetLogMetric.assert_called_once()
        args, kwargs = grpc_stub.GetLogMetric.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_metrics_pb2.GetLogMetricRequest(
            metric_name=metric_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_log_metric_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')

        # Mock exception response
        grpc_stub.GetLogMetric.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_log_metric, metric_name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_log_metric(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')
        metric = logging_metrics_pb2.LogMetric()

        # Mock response
        name = 'name3373707'
        description = 'description-1724546052'
        filter_ = 'filter-1274492040'
        expected_response = logging_metrics_pb2.LogMetric(
            name=name, description=description, filter=filter_)
        grpc_stub.CreateLogMetric.return_value = expected_response

        response = client.create_log_metric(parent, metric)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateLogMetric.assert_called_once()
        args, kwargs = grpc_stub.CreateLogMetric.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_metrics_pb2.CreateLogMetricRequest(
            parent=parent, metric=metric)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_log_metric_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        parent = client.project_path('[PROJECT]')
        metric = logging_metrics_pb2.LogMetric()

        # Mock exception response
        grpc_stub.CreateLogMetric.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_log_metric, parent,
                          metric)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_log_metric(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')
        metric = logging_metrics_pb2.LogMetric()

        # Mock response
        name = 'name3373707'
        description = 'description-1724546052'
        filter_ = 'filter-1274492040'
        expected_response = logging_metrics_pb2.LogMetric(
            name=name, description=description, filter=filter_)
        grpc_stub.UpdateLogMetric.return_value = expected_response

        response = client.update_log_metric(metric_name, metric)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateLogMetric.assert_called_once()
        args, kwargs = grpc_stub.UpdateLogMetric.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_metrics_pb2.UpdateLogMetricRequest(
            metric_name=metric_name, metric=metric)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_log_metric_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')
        metric = logging_metrics_pb2.LogMetric()

        # Mock exception response
        grpc_stub.UpdateLogMetric.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_log_metric,
                          metric_name, metric)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_log_metric(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')

        client.delete_log_metric(metric_name)

        grpc_stub.DeleteLogMetric.assert_called_once()
        args, kwargs = grpc_stub.DeleteLogMetric.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = logging_metrics_pb2.DeleteLogMetricRequest(
            metric_name=metric_name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_log_metric_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metrics_service_v2_client.MetricsServiceV2Client()

        # Mock request
        metric_name = client.metric_path('[PROJECT]', '[METRIC]')

        # Mock exception response
        grpc_stub.DeleteLogMetric.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_log_metric,
                          metric_name)
