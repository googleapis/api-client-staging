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

require "google/cloud/datastore"
require "google/cloud/datastore/v1/datastore_client"
require "google/datastore/v1/datastore_services_pb"

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

class MockCredentialsClass < Google::Cloud::Datastore::Credentials
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

describe Google::Cloud::Datastore::V1::DatastoreClient do

  describe 'lookup' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#lookup."

    it 'invokes lookup without error' do
      # Create request parameters
      project_id = ''
      keys = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::LookupResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::LookupRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(keys, request.keys)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:lookup, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("lookup")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.lookup(project_id, keys)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes lookup with error' do
      # Create request parameters
      project_id = ''
      keys = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::LookupRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(keys, request.keys)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:lookup, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("lookup")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.lookup(project_id, keys)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'run_query' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#run_query."

    it 'invokes run_query without error' do
      # Create request parameters
      project_id = ''
      partition_id = {}

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::RunQueryResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::RunQueryRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(Google::Gax::to_proto(partition_id, Google::Datastore::V1::PartitionId), request.partition_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:run_query, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("run_query")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.run_query(project_id, partition_id)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes run_query with error' do
      # Create request parameters
      project_id = ''
      partition_id = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::RunQueryRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(Google::Gax::to_proto(partition_id, Google::Datastore::V1::PartitionId), request.partition_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:run_query, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("run_query")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.run_query(project_id, partition_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'begin_transaction' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#begin_transaction."

    it 'invokes begin_transaction without error' do
      # Create request parameters
      project_id = ''

      # Create expected grpc response
      transaction = "-34"
      expected_response = { transaction: transaction }
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::BeginTransactionResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::BeginTransactionRequest, request)
        assert_equal(project_id, request.project_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:begin_transaction, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("begin_transaction")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.begin_transaction(project_id)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes begin_transaction with error' do
      # Create request parameters
      project_id = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::BeginTransactionRequest, request)
        assert_equal(project_id, request.project_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:begin_transaction, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("begin_transaction")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.begin_transaction(project_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'commit' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#commit."

    it 'invokes commit without error' do
      # Create request parameters
      project_id = ''
      mode = :MODE_UNSPECIFIED
      mutations = []

      # Create expected grpc response
      index_updates = -1425228195
      expected_response = { index_updates: index_updates }
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::CommitResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::CommitRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(mode, request.mode)
        assert_equal(mutations, request.mutations)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:commit, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("commit")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.commit(
            project_id,
            mode,
            mutations
          )

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes commit with error' do
      # Create request parameters
      project_id = ''
      mode = :MODE_UNSPECIFIED
      mutations = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::CommitRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(mode, request.mode)
        assert_equal(mutations, request.mutations)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:commit, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("commit")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.commit(
              project_id,
              mode,
              mutations
            )
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'rollback' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#rollback."

    it 'invokes rollback without error' do
      # Create request parameters
      project_id = ''
      transaction = ''

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::RollbackResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::RollbackRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(transaction, request.transaction)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:rollback, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("rollback")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.rollback(project_id, transaction)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes rollback with error' do
      # Create request parameters
      project_id = ''
      transaction = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::RollbackRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(transaction, request.transaction)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:rollback, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("rollback")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.rollback(project_id, transaction)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'allocate_ids' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Datastore::V1::DatastoreClient#allocate_ids."

    it 'invokes allocate_ids without error' do
      # Create request parameters
      project_id = ''
      keys = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Datastore::V1::AllocateIdsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::AllocateIdsRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(keys, request.keys)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:allocate_ids, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("allocate_ids")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          response = client.allocate_ids(project_id, keys)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes allocate_ids with error' do
      # Create request parameters
      project_id = ''
      keys = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Datastore::V1::AllocateIdsRequest, request)
        assert_equal(project_id, request.project_id)
        assert_equal(keys, request.keys)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:allocate_ids, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("allocate_ids")

      Google::Datastore::V1::Datastore::Stub.stub(:new, mock_stub) do
        Google::Cloud::Datastore::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Datastore.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.allocate_ids(project_id, keys)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end