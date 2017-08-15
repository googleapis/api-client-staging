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

require "google/cloud/logging"
require "google/cloud/logging/v2/metrics_service_v2_client"
require "google/logging/v2/logging_metrics_services_pb"

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

class MockCredentialsClass < Google::Cloud::Logging::Credentials
  def initialize(method_name)
    @method_name = method_name
  end

  def updater_proc
    proc do
      raise "The method `#{@method_name}` was trying to make a grpc request. This should not " \
          "happen since the grpc layer is being mocked."
    end
  end
end

describe Google::Cloud::Logging::V2::MetricsServiceV2Client do

  describe 'list_log_metrics' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::MetricsServiceV2Client#list_log_metrics."

    it 'invokes list_log_metrics without error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::MetricsServiceV2Client.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      metrics_element = {}
      metrics = [metrics_element]
      expected_response = { next_page_token: next_page_token, metrics: metrics }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::ListLogMetricsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogMetricsRequest, request)
        assert_equal(formatted_parent, request.parent)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_log_metrics, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_log_metrics")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          response = client.list_log_metrics(formatted_parent)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.metrics.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_log_metrics with error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::MetricsServiceV2Client.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogMetricsRequest, request)
        assert_equal(formatted_parent, request.parent)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_log_metrics, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_log_metrics")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_log_metrics(formatted_parent)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'get_log_metric' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::MetricsServiceV2Client#get_log_metric."

    it 'invokes get_log_metric without error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")

      # Create expected grpc response
      name = "name3373707"
      description = "description-1724546052"
      filter = "filter-1274492040"
      expected_response = {
        name: name,
        description: description,
        filter: filter
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::LogMetric)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::GetLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          response = client.get_log_metric(formatted_metric_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes get_log_metric with error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::GetLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.get_log_metric(formatted_metric_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'create_log_metric' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::MetricsServiceV2Client#create_log_metric."

    it 'invokes create_log_metric without error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::MetricsServiceV2Client.project_path("[PROJECT]")
      metric = {}

      # Create expected grpc response
      name = "name3373707"
      description = "description-1724546052"
      filter = "filter-1274492040"
      expected_response = {
        name: name,
        description: description,
        filter: filter
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::LogMetric)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::CreateLogMetricRequest, request)
        assert_equal(formatted_parent, request.parent)
        assert_equal(Google::Gax::to_proto(metric, Google::Logging::V2::LogMetric), request.metric)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          response = client.create_log_metric(formatted_parent, metric)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes create_log_metric with error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::MetricsServiceV2Client.project_path("[PROJECT]")
      metric = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::CreateLogMetricRequest, request)
        assert_equal(formatted_parent, request.parent)
        assert_equal(Google::Gax::to_proto(metric, Google::Logging::V2::LogMetric), request.metric)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.create_log_metric(formatted_parent, metric)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'update_log_metric' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::MetricsServiceV2Client#update_log_metric."

    it 'invokes update_log_metric without error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")
      metric = {}

      # Create expected grpc response
      name = "name3373707"
      description = "description-1724546052"
      filter = "filter-1274492040"
      expected_response = {
        name: name,
        description: description,
        filter: filter
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::LogMetric)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::UpdateLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        assert_equal(Google::Gax::to_proto(metric, Google::Logging::V2::LogMetric), request.metric)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:update_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("update_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          response = client.update_log_metric(formatted_metric_name, metric)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes update_log_metric with error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")
      metric = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::UpdateLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        assert_equal(Google::Gax::to_proto(metric, Google::Logging::V2::LogMetric), request.metric)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:update_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("update_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.update_log_metric(formatted_metric_name, metric)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'delete_log_metric' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::MetricsServiceV2Client#delete_log_metric."

    it 'invokes delete_log_metric without error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::DeleteLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          response = client.delete_log_metric(formatted_metric_name)

          # Verify the response
          assert_nil(response)
        end
      end
    end

    it 'invokes delete_log_metric with error' do
      # Create request parameters
      formatted_metric_name = Google::Cloud::Logging::V2::MetricsServiceV2Client.metric_path("[PROJECT]", "[METRIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::DeleteLogMetricRequest, request)
        assert_equal(formatted_metric_name, request.metric_name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_log_metric, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_log_metric")

      Google::Logging::V2::MetricsServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Metrics.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.delete_log_metric(formatted_metric_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end