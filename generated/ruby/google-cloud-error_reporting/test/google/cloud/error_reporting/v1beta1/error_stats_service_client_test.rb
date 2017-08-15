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

require "google/cloud/error_reporting"
require "google/cloud/error_reporting/v1beta1/error_stats_service_client"
require "google/devtools/clouderrorreporting/v1beta1/error_stats_service_services_pb"

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

class MockCredentialsClass < Google::Cloud::ErrorReporting::Credentials
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

describe Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient do

  describe 'list_group_stats' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient#list_group_stats."

    it 'invokes list_group_stats without error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")
      time_range = {}

      # Create expected grpc response
      next_page_token = ""
      error_group_stats_element = {}
      error_group_stats = [error_group_stats_element]
      expected_response = { next_page_token: next_page_token, error_group_stats: error_group_stats }
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Clouderrorreporting::V1beta1::ListGroupStatsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ListGroupStatsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(Google::Gax::to_proto(time_range, Google::Devtools::Clouderrorreporting::V1beta1::QueryTimeRange), request.time_range)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_group_stats, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_group_stats")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          response = client.list_group_stats(formatted_project_name, time_range)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.error_group_stats.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_group_stats with error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")
      time_range = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ListGroupStatsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(Google::Gax::to_proto(time_range, Google::Devtools::Clouderrorreporting::V1beta1::QueryTimeRange), request.time_range)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_group_stats, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_group_stats")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_group_stats(formatted_project_name, time_range)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_events' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient#list_events."

    it 'invokes list_events without error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")
      group_id = ''

      # Create expected grpc response
      next_page_token = ""
      error_events_element = {}
      error_events = [error_events_element]
      expected_response = { next_page_token: next_page_token, error_events: error_events }
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Clouderrorreporting::V1beta1::ListEventsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ListEventsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(group_id, request.group_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_events, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_events")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          response = client.list_events(formatted_project_name, group_id)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.error_events.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_events with error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")
      group_id = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ListEventsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(group_id, request.group_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_events, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_events")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_events(formatted_project_name, group_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'delete_events' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient#delete_events."

    it 'invokes delete_events without error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Clouderrorreporting::V1beta1::DeleteEventsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::DeleteEventsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:delete_events, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_events")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          response = client.delete_events(formatted_project_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes delete_events with error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::DeleteEventsRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_events, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_events")

      Google::Devtools::Clouderrorreporting::V1beta1::ErrorStatsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ErrorStats.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.delete_events(formatted_project_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end