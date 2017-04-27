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

from google.api import metric_pb2
from google.api import monitored_resource_pb2
from google.cloud.gapic.monitoring.v3 import enums
from google.cloud.gapic.monitoring.v3 import metric_service_client
from google.cloud.proto.monitoring.v3 import common_pb2
from google.cloud.proto.monitoring.v3 import metric_pb2
from google.cloud.proto.monitoring.v3 import metric_service_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestMetricServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_monitored_resource_descriptors(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        resource_descriptors_element = monitored_resource_pb2.MonitoredResourceDescriptor(
        )
        resource_descriptors = [resource_descriptors_element]
        expected_response = metric_service_pb2.ListMonitoredResourceDescriptorsResponse(
            next_page_token=next_page_token,
            resource_descriptors=resource_descriptors)
        grpc_stub.ListMonitoredResourceDescriptors.return_value = expected_response

        paged_list_response = client.list_monitored_resource_descriptors(name)
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

        expected_request = metric_service_pb2.ListMonitoredResourceDescriptorsRequest(
            name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_monitored_resource_descriptors_exception(
            self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListMonitoredResourceDescriptors.side_effect = CustomException(
        )

        paged_list_response = client.list_monitored_resource_descriptors(name)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_monitored_resource_descriptor(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.monitored_resource_descriptor_path(
            '[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]')

        # Mock response
        name_2 = 'name2-1052831874'
        type_ = 'type3575610'
        display_name = 'displayName1615086568'
        description = 'description-1724546052'
        expected_response = monitored_resource_pb2.MonitoredResourceDescriptor(
            name=name_2,
            type=type_,
            display_name=display_name,
            description=description)
        grpc_stub.GetMonitoredResourceDescriptor.return_value = expected_response

        response = client.get_monitored_resource_descriptor(name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetMonitoredResourceDescriptor.assert_called_once()
        args, kwargs = grpc_stub.GetMonitoredResourceDescriptor.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.GetMonitoredResourceDescriptorRequest(
            name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_monitored_resource_descriptor_exception(
            self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.monitored_resource_descriptor_path(
            '[PROJECT]', '[MONITORED_RESOURCE_DESCRIPTOR]')

        # Mock exception response
        grpc_stub.GetMonitoredResourceDescriptor.side_effect = CustomException(
        )

        self.assertRaises(errors.GaxError,
                          client.get_monitored_resource_descriptor, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_metric_descriptors(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        metric_descriptors_element = metric_pb2.MetricDescriptor()
        metric_descriptors = [metric_descriptors_element]
        expected_response = metric_service_pb2.ListMetricDescriptorsResponse(
            next_page_token=next_page_token,
            metric_descriptors=metric_descriptors)
        grpc_stub.ListMetricDescriptors.return_value = expected_response

        paged_list_response = client.list_metric_descriptors(name)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.metric_descriptors[0], resources[0])

        grpc_stub.ListMetricDescriptors.assert_called_once()
        args, kwargs = grpc_stub.ListMetricDescriptors.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.ListMetricDescriptorsRequest(
            name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_metric_descriptors_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListMetricDescriptors.side_effect = CustomException()

        paged_list_response = client.list_metric_descriptors(name)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_metric_descriptor(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.metric_descriptor_path('[PROJECT]',
                                             '[METRIC_DESCRIPTOR]')

        # Mock response
        name_2 = 'name2-1052831874'
        type_ = 'type3575610'
        unit = 'unit3594628'
        description = 'description-1724546052'
        display_name = 'displayName1615086568'
        expected_response = metric_pb2.MetricDescriptor(
            name=name_2,
            type=type_,
            unit=unit,
            description=description,
            display_name=display_name)
        grpc_stub.GetMetricDescriptor.return_value = expected_response

        response = client.get_metric_descriptor(name)
        self.assertEqual(expected_response, response)

        grpc_stub.GetMetricDescriptor.assert_called_once()
        args, kwargs = grpc_stub.GetMetricDescriptor.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.GetMetricDescriptorRequest(
            name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_metric_descriptor_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.metric_descriptor_path('[PROJECT]',
                                             '[METRIC_DESCRIPTOR]')

        # Mock exception response
        grpc_stub.GetMetricDescriptor.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_metric_descriptor, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_metric_descriptor(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        metric_descriptor = metric_pb2.MetricDescriptor()

        # Mock response
        name_2 = 'name2-1052831874'
        type_ = 'type3575610'
        unit = 'unit3594628'
        description = 'description-1724546052'
        display_name = 'displayName1615086568'
        expected_response = metric_pb2.MetricDescriptor(
            name=name_2,
            type=type_,
            unit=unit,
            description=description,
            display_name=display_name)
        grpc_stub.CreateMetricDescriptor.return_value = expected_response

        response = client.create_metric_descriptor(name, metric_descriptor)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateMetricDescriptor.assert_called_once()
        args, kwargs = grpc_stub.CreateMetricDescriptor.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.CreateMetricDescriptorRequest(
            name=name, metric_descriptor=metric_descriptor)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_metric_descriptor_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        metric_descriptor = metric_pb2.MetricDescriptor()

        # Mock exception response
        grpc_stub.CreateMetricDescriptor.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_metric_descriptor,
                          name, metric_descriptor)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_metric_descriptor(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.metric_descriptor_path('[PROJECT]',
                                             '[METRIC_DESCRIPTOR]')

        client.delete_metric_descriptor(name)

        grpc_stub.DeleteMetricDescriptor.assert_called_once()
        args, kwargs = grpc_stub.DeleteMetricDescriptor.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.DeleteMetricDescriptorRequest(
            name=name)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_metric_descriptor_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.metric_descriptor_path('[PROJECT]',
                                             '[METRIC_DESCRIPTOR]')

        # Mock exception response
        grpc_stub.DeleteMetricDescriptor.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_metric_descriptor,
                          name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_time_series(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        filter_ = 'filter-1274492040'
        interval = common_pb2.TimeInterval()
        view = enums.ListTimeSeriesRequest.TimeSeriesView.FULL

        # Mock response
        next_page_token = ''
        time_series_element = metric_pb2.TimeSeries()
        time_series = [time_series_element]
        expected_response = metric_service_pb2.ListTimeSeriesResponse(
            next_page_token=next_page_token, time_series=time_series)
        grpc_stub.ListTimeSeries.return_value = expected_response

        paged_list_response = client.list_time_series(name, filter_, interval,
                                                      view)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.time_series[0], resources[0])

        grpc_stub.ListTimeSeries.assert_called_once()
        args, kwargs = grpc_stub.ListTimeSeries.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.ListTimeSeriesRequest(
            name=name, filter=filter_, interval=interval, view=view)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_time_series_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        filter_ = 'filter-1274492040'
        interval = common_pb2.TimeInterval()
        view = enums.ListTimeSeriesRequest.TimeSeriesView.FULL

        # Mock exception response
        grpc_stub.ListTimeSeries.side_effect = CustomException()

        paged_list_response = client.list_time_series(name, filter_, interval,
                                                      view)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_time_series(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        time_series = []

        client.create_time_series(name, time_series)

        grpc_stub.CreateTimeSeries.assert_called_once()
        args, kwargs = grpc_stub.CreateTimeSeries.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = metric_service_pb2.CreateTimeSeriesRequest(
            name=name, time_series=time_series)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_time_series_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = metric_service_client.MetricServiceClient()

        # Mock request
        name = client.project_path('[PROJECT]')
        time_series = []

        # Mock exception response
        grpc_stub.CreateTimeSeries.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_time_series, name,
                          time_series)
