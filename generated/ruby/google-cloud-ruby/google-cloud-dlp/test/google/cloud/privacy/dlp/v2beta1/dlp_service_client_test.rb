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

require "google/cloud/privacy/dlp/v2beta1/dlp_service_client"
require "google/privacy/dlp/v2beta1/dlp_services_pb"
require "google/longrunning/operations_pb"

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

describe Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient do

  describe 'inspect_content' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#inspect_content."

    it 'invokes inspect_content without error' do
      # Create request parameters
      inspect_config = {}
      items = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::InspectContentResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::InspectContentRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(items, request.items)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:inspect_content, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.inspect_content(inspect_config, items)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes inspect_content with error' do
      # Create request parameters
      inspect_config = {}
      items = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::InspectContentRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(items, request.items)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:inspect_content, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.inspect_content(inspect_config, items)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'redact_content' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#redact_content."

    it 'invokes redact_content without error' do
      # Create request parameters
      inspect_config = {}
      items = []
      replace_configs = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::RedactContentResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::RedactContentRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(items, request.items)
        assert_equal(replace_configs, request.replace_configs)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:redact_content, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.redact_content(
          inspect_config,
          items,
          replace_configs
        )

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes redact_content with error' do
      # Create request parameters
      inspect_config = {}
      items = []
      replace_configs = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::RedactContentRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(items, request.items)
        assert_equal(replace_configs, request.replace_configs)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:redact_content, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.redact_content(
            inspect_config,
            items,
            replace_configs
          )
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'create_inspect_operation' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#create_inspect_operation."

    it 'invokes create_inspect_operation without error' do
      # Create request parameters
      inspect_config = {}
      storage_config = {}
      output_config = {}

      # Create expected grpc response
      name = "name3373707"
      expected_response = { name: name }
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::InspectOperationResult)
      result = Google::Protobuf::Any.new
      result.pack(expected_response)
      operation = Google::Longrunning::Operation.new(
        name: 'operations/create_inspect_operation_test',
        done: true,
        response: result
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::CreateInspectOperationRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(Google::Gax::to_proto(storage_config, Google::Privacy::Dlp::V2beta1::StorageConfig), request.storage_config)
        assert_equal(Google::Gax::to_proto(output_config, Google::Privacy::Dlp::V2beta1::OutputStorageConfig), request.output_config)
        operation
      end
      mock_stub = MockGrpcClientStub.new(:create_inspect_operation, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.create_inspect_operation(
          inspect_config,
          storage_config,
          output_config
        )

        # Verify the response
        assert_equal(expected_response, response.response)
      end
    end

    it 'invokes create_inspect_operation and returns an operation error.' do
      # Create request parameters
      inspect_config = {}
      storage_config = {}
      output_config = {}

      # Create expected grpc response
      operation_error = Google::Rpc::Status.new(
        message: 'Operation error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#create_inspect_operation.'
      )
      operation = Google::Longrunning::Operation.new(
        name: 'operations/create_inspect_operation_test',
        done: true,
        error: operation_error
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::CreateInspectOperationRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(Google::Gax::to_proto(storage_config, Google::Privacy::Dlp::V2beta1::StorageConfig), request.storage_config)
        assert_equal(Google::Gax::to_proto(output_config, Google::Privacy::Dlp::V2beta1::OutputStorageConfig), request.output_config)
        operation
      end
      mock_stub = MockGrpcClientStub.new(:create_inspect_operation, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.create_inspect_operation(
          inspect_config,
          storage_config,
          output_config
        )

        # Verify the response
        assert(response.error?)
        assert_equal(operation_error, response.error)
      end
    end

    it 'invokes create_inspect_operation with error' do
      # Create request parameters
      inspect_config = {}
      storage_config = {}
      output_config = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::CreateInspectOperationRequest, request)
        assert_equal(Google::Gax::to_proto(inspect_config, Google::Privacy::Dlp::V2beta1::InspectConfig), request.inspect_config)
        assert_equal(Google::Gax::to_proto(storage_config, Google::Privacy::Dlp::V2beta1::StorageConfig), request.storage_config)
        assert_equal(Google::Gax::to_proto(output_config, Google::Privacy::Dlp::V2beta1::OutputStorageConfig), request.output_config)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_inspect_operation, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_inspect_operation(
            inspect_config,
            storage_config,
            output_config
          )
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_inspect_findings' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#list_inspect_findings."

    it 'invokes list_inspect_findings without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.result_path("[RESULT]")

      # Create expected grpc response
      next_page_token = "nextPageToken-1530815211"
      expected_response = { next_page_token: next_page_token }
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::ListInspectFindingsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListInspectFindingsRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_inspect_findings, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.list_inspect_findings(formatted_name)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes list_inspect_findings with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.result_path("[RESULT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListInspectFindingsRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_inspect_findings, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_inspect_findings(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_info_types' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#list_info_types."

    it 'invokes list_info_types without error' do
      # Create request parameters
      category = ''
      language_code = ''

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::ListInfoTypesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListInfoTypesRequest, request)
        assert_equal(category, request.category)
        assert_equal(language_code, request.language_code)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_info_types, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.list_info_types(category, language_code)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes list_info_types with error' do
      # Create request parameters
      category = ''
      language_code = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListInfoTypesRequest, request)
        assert_equal(category, request.category)
        assert_equal(language_code, request.language_code)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_info_types, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_info_types(category, language_code)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_root_categories' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient#list_root_categories."

    it 'invokes list_root_categories without error' do
      # Create request parameters
      language_code = ''

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Privacy::Dlp::V2beta1::ListRootCategoriesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListRootCategoriesRequest, request)
        assert_equal(language_code, request.language_code)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_root_categories, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        response = client.list_root_categories(language_code)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes list_root_categories with error' do
      # Create request parameters
      language_code = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Privacy::Dlp::V2beta1::ListRootCategoriesRequest, request)
        assert_equal(language_code, request.language_code)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_root_categories, mock_method)

      Google::Privacy::Dlp::V2beta1::DlpService::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Privacy::Dlp::V2beta1::DlpServiceClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_root_categories(language_code)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end
end