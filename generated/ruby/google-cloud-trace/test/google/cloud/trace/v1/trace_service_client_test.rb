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

require "google/cloud/trace"
require "google/cloud/trace/v1/trace_service_client"
require "google/devtools/cloudtrace/v1/trace_services_pb"

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

class MockCredentialsClass < Google::Cloud::Trace::Credentials
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

describe Google::Cloud::Trace::V1::TraceServiceClient do

  describe 'patch_traces' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Trace::V1::TraceServiceClient#patch_traces."

    it 'invokes patch_traces without error' do
      # Create request parameters
      project_id = ''
      traces = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::PatchTracesRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(Google::Gax::to_proto(traces, Google::Devtools::Cloudtrace::V1::Traces), request.traces)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:patch_traces, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("patch_traces")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          response = client.patch_traces(project_id, traces)

          # Verify the response
          assert_nil(response)
        end
      end
    end

    it 'invokes patch_traces with error' do
      # Create request parameters
      project_id = ''
      traces = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::PatchTracesRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(Google::Gax::to_proto(traces, Google::Devtools::Cloudtrace::V1::Traces), request.traces)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:patch_traces, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("patch_traces")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.patch_traces(project_id, traces)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'get_trace' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Trace::V1::TraceServiceClient#get_trace."

    it 'invokes get_trace without error' do
      # Create request parameters
      project_id = ''
      trace_id = ''

      # Create expected grpc response
      project_id_2 = "projectId2939242356"
      trace_id_2 = "traceId2987826376"
      expected_response = { project_id: project_id_2, trace_id: trace_id_2 }
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Cloudtrace::V1::Trace)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::GetTraceRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(trace_id, request.trace_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_trace, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_trace")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          response = client.get_trace(project_id, trace_id)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes get_trace with error' do
      # Create request parameters
      project_id = ''
      trace_id = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::GetTraceRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(trace_id, request.trace_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_trace, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_trace")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.get_trace(project_id, trace_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_traces' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Trace::V1::TraceServiceClient#list_traces."

    it 'invokes list_traces without error' do
      # Create request parameters
      project_id = ''

      # Create expected grpc response
      next_page_token = ""
      traces_element = {}
      traces = [traces_element]
      expected_response = { next_page_token: next_page_token, traces: traces }
      expected_response = Google::Gax::to_proto(expected_response, Google::Devtools::Cloudtrace::V1::ListTracesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::ListTracesRequest, request)
        assert_equal(project_id, request.project_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_traces, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_traces")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          response = client.list_traces(project_id)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.traces.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_traces with error' do
      # Create request parameters
      project_id = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Devtools::Cloudtrace::V1::ListTracesRequest, request)
        assert_equal(project_id, request.project_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_traces, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_traces")

      Google::Devtools::Cloudtrace::V1::TraceService::Stub.stub(:new, mock_stub) do
        Google::Cloud::Trace::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Trace.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_traces(project_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end