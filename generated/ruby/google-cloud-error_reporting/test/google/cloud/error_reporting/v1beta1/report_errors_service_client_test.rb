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
require "google/cloud/error_reporting/v1beta1/report_errors_service_client"
require "google/devtools/clouderrorreporting/v1beta1/report_errors_service_services_pb"

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

describe Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient do

  describe 'report_error_event' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient#report_error_event."

    it 'invokes report_error_event without error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient.project_path("[PROJECT]")
      event = {}

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Clouderrorreporting::V1beta1::ReportErrorEventResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ReportErrorEventRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(Google::Gax::to_proto(event, Google::Devtools::Clouderrorreporting::V1beta1::ReportedErrorEvent), request.event)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:report_error_event, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("report_error_event")

      Google::Devtools::Clouderrorreporting::V1beta1::ReportErrorsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ReportErrors.new(version: :v1beta1)

          # Call method
          response = client.report_error_event(formatted_project_name, event)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes report_error_event with error' do
      # Create request parameters
      formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient.project_path("[PROJECT]")
      event = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Clouderrorreporting::V1beta1::ReportErrorEventRequest, request)
        assert_equal(formatted_project_name, request.project_name)
        assert_equal(Google::Gax::to_proto(event, Google::Devtools::Clouderrorreporting::V1beta1::ReportedErrorEvent), request.event)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:report_error_event, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("report_error_event")

      Google::Devtools::Clouderrorreporting::V1beta1::ReportErrorsService::Stub.stub(:new, mock_stub) do
        Google::Cloud::ErrorReporting::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::ErrorReporting::ReportErrors.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.report_error_event(formatted_project_name, event)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end