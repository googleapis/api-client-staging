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
require "google/cloud/logging/v2/logging_service_v2_client"
require "google/logging/v2/logging_services_pb"

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

describe Google::Cloud::Logging::V2::LoggingServiceV2Client do

  describe 'delete_log' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::LoggingServiceV2Client#delete_log."

    it 'invokes delete_log without error' do
      # Create request parameters
      formatted_log_name = Google::Cloud::Logging::V2::LoggingServiceV2Client.log_path("[PROJECT]", "[LOG]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::DeleteLogRequest, request)
        assert_equal(formatted_log_name, request.log_name)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_log, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_log")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          response = client.delete_log(formatted_log_name)

          # Verify the response
          assert_nil(response)
        end
      end
    end

    it 'invokes delete_log with error' do
      # Create request parameters
      formatted_log_name = Google::Cloud::Logging::V2::LoggingServiceV2Client.log_path("[PROJECT]", "[LOG]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::DeleteLogRequest, request)
        assert_equal(formatted_log_name, request.log_name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_log, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_log")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.delete_log(formatted_log_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'write_log_entries' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::LoggingServiceV2Client#write_log_entries."

    it 'invokes write_log_entries without error' do
      # Create request parameters
      entries = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::WriteLogEntriesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::WriteLogEntriesRequest, request)
        entries = entries.map do |req|
          Google::Gax::to_proto(req, Google::Logging::V2::LogEntry)
        end
        assert_equal(entries, request.entries)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:write_log_entries, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("write_log_entries")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          response = client.write_log_entries(entries)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes write_log_entries with error' do
      # Create request parameters
      entries = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::WriteLogEntriesRequest, request)
        entries = entries.map do |req|
          Google::Gax::to_proto(req, Google::Logging::V2::LogEntry)
        end
        assert_equal(entries, request.entries)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:write_log_entries, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("write_log_entries")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.write_log_entries(entries)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_log_entries' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::LoggingServiceV2Client#list_log_entries."

    it 'invokes list_log_entries without error' do
      # Create request parameters
      resource_names = []

      # Create expected grpc response
      next_page_token = ""
      entries_element = {}
      entries = [entries_element]
      expected_response = { next_page_token: next_page_token, entries: entries }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::ListLogEntriesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogEntriesRequest, request)
        assert_equal(resource_names, request.resource_names)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_log_entries, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_log_entries")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          response = client.list_log_entries(resource_names)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.entries.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_log_entries with error' do
      # Create request parameters
      resource_names = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogEntriesRequest, request)
        assert_equal(resource_names, request.resource_names)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_log_entries, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_log_entries")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_log_entries(resource_names)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_monitored_resource_descriptors' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::LoggingServiceV2Client#list_monitored_resource_descriptors."

    it 'invokes list_monitored_resource_descriptors without error' do
      # Create expected grpc response
      next_page_token = ""
      resource_descriptors_element = {}
      resource_descriptors = [resource_descriptors_element]
      expected_response = { next_page_token: next_page_token, resource_descriptors: resource_descriptors }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::ListMonitoredResourceDescriptorsResponse)

      # Mock Grpc layer
      mock_method = proc do
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_monitored_resource_descriptors, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_monitored_resource_descriptors")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          response = client.list_monitored_resource_descriptors

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.resource_descriptors.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_monitored_resource_descriptors with error' do
      # Mock Grpc layer
      mock_method = proc do
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_monitored_resource_descriptors, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_monitored_resource_descriptors")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_monitored_resource_descriptors
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_logs' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Logging::V2::LoggingServiceV2Client#list_logs."

    it 'invokes list_logs without error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::LoggingServiceV2Client.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      log_names_element = "logNamesElement-1079688374"
      log_names = [log_names_element]
      expected_response = { next_page_token: next_page_token, log_names: log_names }
      expected_response = Google::Gax::to_proto(expected_response, Google::Logging::V2::ListLogsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogsRequest, request)
        assert_equal(formatted_parent, request.parent)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_logs, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_logs")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          response = client.list_logs(formatted_parent)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.log_names.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_logs with error' do
      # Create request parameters
      formatted_parent = Google::Cloud::Logging::V2::LoggingServiceV2Client.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Logging::V2::ListLogsRequest, request)
        assert_equal(formatted_parent, request.parent)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_logs, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_logs")

      Google::Logging::V2::LoggingServiceV2::Stub.stub(:new, mock_stub) do
        Google::Cloud::Logging::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Logging::Logging.new(version: :v2)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_logs(formatted_parent)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end