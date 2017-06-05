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

require "minitest/autorun"
require "minitest/spec"

require "google/gax"

require "google/cloud/monitoring/v3/metric_service_client"
require "google/monitoring/v3/metric_service_services_pb"

class CustomTestError < StandardError; end

# Mock for the GRPC::ClientStub class.
class MockGrpcClientStub

  # @param expected_symbol [Symbol] the symbol of the grpc method to be mocked.
  # @param mock_method [Proc] The method that is being mocked.
  def initialize(expected_symbol, mock_method)
    @expected_symbol = expected_symbol
    @mock_method = mock_method
  end

  # This overrides the Object#method method to return the mocked method when the mocked method
  # is being requested. For methods that aren't being tested, this method returns a proc that
  # will raise an error when called. This is to assure that only the mocked grpc method is being
  # called.
  #
  # @param symbol [Symbol] The symbol of the method being requested.
  # @return [Proc] The proc of the requested method. If the requested method is not being mocked
  #   the proc returned will raise when called.
  def method(symbol)
    return @mock_method if symbol == @expected_symbol

    # The requested method is not being tested, raise if it called.
    proc do
      raise "The method #{symbol} was unexpectedly called during the " \
        "test for #{@expected_symbol}."
    end
  end
end

describe Google::Cloud::Monitoring::V3::MetricServiceClient do

  describe 'list_monitored_resource_descriptors' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#list_monitored_resource_descriptors."

    it 'invokes list_monitored_resource_descriptors without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      resource_descriptors_element = Google::Api::MonitoredResourceDescriptor.new
      resource_descriptors = [resource_descriptors_element]
      expected_response = Google::Monitoring::V3::ListMonitoredResourceDescriptorsResponse.new(next_page_token: next_page_token, resource_descriptors: resource_descriptors)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_monitored_resource_descriptors, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.list_monitored_resource_descriptors(formatted_name)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.resource_descriptors.to_a, response.to_a)
      end
    end

    it 'invokes list_monitored_resource_descriptors with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_monitored_resource_descriptors, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_monitored_resource_descriptors(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'get_monitored_resource_descriptor' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#get_monitored_resource_descriptor."

    it 'invokes get_monitored_resource_descriptor without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.monitored_resource_descriptor_path("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      type = "type3575610"
      display_name = "displayName1615086568"
      description = "description-1724546052"
      expected_response = Google::Api::MonitoredResourceDescriptor.new(
        name: name_2,
        type: type,
        display_name: display_name,
        description: description
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_monitored_resource_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.get_monitored_resource_descriptor(formatted_name)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_monitored_resource_descriptor with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.monitored_resource_descriptor_path("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_monitored_resource_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.get_monitored_resource_descriptor(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_metric_descriptors' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#list_metric_descriptors."

    it 'invokes list_metric_descriptors without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      metric_descriptors_element = Google::Api::MetricDescriptor.new
      metric_descriptors = [metric_descriptors_element]
      expected_response = Google::Monitoring::V3::ListMetricDescriptorsResponse.new(next_page_token: next_page_token, metric_descriptors: metric_descriptors)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_metric_descriptors, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.list_metric_descriptors(formatted_name)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.metric_descriptors.to_a, response.to_a)
      end
    end

    it 'invokes list_metric_descriptors with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_metric_descriptors, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_metric_descriptors(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'get_metric_descriptor' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#get_metric_descriptor."

    it 'invokes get_metric_descriptor without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      type = "type3575610"
      unit = "unit3594628"
      description = "description-1724546052"
      display_name = "displayName1615086568"
      expected_response = Google::Api::MetricDescriptor.new(
        name: name_2,
        type: type,
        unit: unit,
        description: description,
        display_name: display_name
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.get_metric_descriptor(formatted_name)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_metric_descriptor with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.get_metric_descriptor(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'create_metric_descriptor' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#create_metric_descriptor."

    it 'invokes create_metric_descriptor without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      metric_descriptor = Google::Api::MetricDescriptor.new

      # Create expected grpc response
      name_2 = "name2-1052831874"
      type = "type3575610"
      unit = "unit3594628"
      description = "description-1724546052"
      display_name = "displayName1615086568"
      expected_response = Google::Api::MetricDescriptor.new(
        name: name_2,
        type: type,
        unit: unit,
        description: description,
        display_name: display_name
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(metric_descriptor, request.metric_descriptor)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.create_metric_descriptor(formatted_name, metric_descriptor)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes create_metric_descriptor with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      metric_descriptor = Google::Api::MetricDescriptor.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(metric_descriptor, request.metric_descriptor)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_metric_descriptor(formatted_name, metric_descriptor)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'delete_metric_descriptor' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#delete_metric_descriptor."

    it 'invokes delete_metric_descriptor without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.delete_metric_descriptor(formatted_name)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes delete_metric_descriptor with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_metric_descriptor, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.delete_metric_descriptor(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_time_series' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#list_time_series."

    it 'invokes list_time_series without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      filter = ''
      interval = Google::Monitoring::V3::TimeInterval.new
      view = :FULL

      # Create expected grpc response
      next_page_token = ""
      time_series_element = Google::Monitoring::V3::TimeSeries.new
      time_series = [time_series_element]
      expected_response = Google::Monitoring::V3::ListTimeSeriesResponse.new(next_page_token: next_page_token, time_series: time_series)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(filter, request.filter)
        assert_equal(interval, request.interval)
        assert_equal(view, request.view)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_time_series, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.list_time_series(
          formatted_name,
          filter,
          interval,
          view
        )

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.time_series.to_a, response.to_a)
      end
    end

    it 'invokes list_time_series with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      filter = ''
      interval = Google::Monitoring::V3::TimeInterval.new
      view = :FULL

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(filter, request.filter)
        assert_equal(interval, request.interval)
        assert_equal(view, request.view)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_time_series, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_time_series(
            formatted_name,
            filter,
            interval,
            view
          )
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'create_time_series' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Monitoring::V3::MetricServiceClient#create_time_series."

    it 'invokes create_time_series without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      time_series = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(time_series, request.time_series)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:create_time_series, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        response = client.create_time_series(formatted_name, time_series)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes create_time_series with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Monitoring::V3::MetricServiceClient.project_path("[PROJECT]")
      time_series = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(time_series, request.time_series)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_time_series, mock_method)

      Google::Monitoring::V3::MetricService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Monitoring::V3::MetricServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_time_series(formatted_name, time_series)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end
end