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

require "google/cloud/iam/admin"
require "google/cloud/iam/admin/v1/iam_client"
require "google/iam/admin/v1/iam_services_pb"

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

class MockCredentialsClass < Google::Cloud::Iam::Admin::Credentials
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

describe Google::Cloud::Iam::Admin::V1::IamClient do

  describe 'list_service_accounts' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#list_service_accounts."

    it 'invokes list_service_accounts without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      accounts_element = {}
      accounts = [accounts_element]
      expected_response = { next_page_token: next_page_token, accounts: accounts }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ListServiceAccountsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ListServiceAccountsRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_service_accounts, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_service_accounts")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.list_service_accounts(formatted_name)

          # Verify the response
          assert(response.instance_of?(Google::Gax::PagedEnumerable))
          assert_equal(expected_response, response.page.response)
          assert_nil(response.next_page)
          assert_equal(expected_response.accounts.to_a, response.to_a)
        end
      end
    end

    it 'invokes list_service_accounts with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ListServiceAccountsRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_service_accounts, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_service_accounts")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_service_accounts(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'get_service_account' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#get_service_account."

    it 'invokes get_service_account without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      project_id = "projectId-1969970175"
      unique_id = "uniqueId-538310583"
      email = "email96619420"
      display_name = "displayName1615086568"
      etag = "21"
      oauth2_client_id = "oauth2ClientId-1833466037"
      expected_response = {
        name: name_2,
        project_id: project_id,
        unique_id: unique_id,
        email: email,
        display_name: display_name,
        etag: etag,
        oauth2_client_id: oauth2_client_id
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ServiceAccount)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::GetServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.get_service_account(formatted_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes get_service_account with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::GetServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.get_service_account(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'create_service_account' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#create_service_account."

    it 'invokes create_service_account without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.project_path("[PROJECT]")
      account_id = ''

      # Create expected grpc response
      name_2 = "name2-1052831874"
      project_id = "projectId-1969970175"
      unique_id = "uniqueId-538310583"
      email = "email96619420"
      display_name = "displayName1615086568"
      etag = "21"
      oauth2_client_id = "oauth2ClientId-1833466037"
      expected_response = {
        name: name_2,
        project_id: project_id,
        unique_id: unique_id,
        email: email,
        display_name: display_name,
        etag: etag,
        oauth2_client_id: oauth2_client_id
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ServiceAccount)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::CreateServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        assert_equal(account_id, request.account_id)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.create_service_account(formatted_name, account_id)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes create_service_account with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.project_path("[PROJECT]")
      account_id = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::CreateServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        assert_equal(account_id, request.account_id)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.create_service_account(formatted_name, account_id)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'update_service_account' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#update_service_account."

    it 'invokes update_service_account without error' do
      # Create request parameters
      etag = ''

      # Create expected grpc response
      name = "name3373707"
      project_id = "projectId-1969970175"
      unique_id = "uniqueId-538310583"
      email = "email96619420"
      display_name = "displayName1615086568"
      etag_2 = "-120"
      oauth2_client_id = "oauth2ClientId-1833466037"
      expected_response = {
        name: name,
        project_id: project_id,
        unique_id: unique_id,
        email: email,
        display_name: display_name,
        etag: etag_2,
        oauth2_client_id: oauth2_client_id
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ServiceAccount)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ServiceAccount, request)
        assert_equal(etag, request.etag)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:update_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("update_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.update_service_account(etag)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes update_service_account with error' do
      # Create request parameters
      etag = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ServiceAccount, request)
        assert_equal(etag, request.etag)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:update_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("update_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.update_service_account(etag)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'delete_service_account' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#delete_service_account."

    it 'invokes delete_service_account without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::DeleteServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.delete_service_account(formatted_name)

          # Verify the response
          assert_nil(response)
        end
      end
    end

    it 'invokes delete_service_account with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::DeleteServiceAccountRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_service_account, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_service_account")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.delete_service_account(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'list_service_account_keys' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#list_service_account_keys."

    it 'invokes list_service_account_keys without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ListServiceAccountKeysResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ListServiceAccountKeysRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_service_account_keys, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_service_account_keys")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.list_service_account_keys(formatted_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes list_service_account_keys with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::ListServiceAccountKeysRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_service_account_keys, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("list_service_account_keys")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.list_service_account_keys(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'get_service_account_key' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#get_service_account_key."

    it 'invokes get_service_account_key without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      private_key_data = "-58"
      public_key_data = "-96"
      expected_response = {
        name: name_2,
        private_key_data: private_key_data,
        public_key_data: public_key_data
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ServiceAccountKey)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::GetServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.get_service_account_key(formatted_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes get_service_account_key with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::GetServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.get_service_account_key(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'create_service_account_key' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#create_service_account_key."

    it 'invokes create_service_account_key without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      private_key_data = "-58"
      public_key_data = "-96"
      expected_response = {
        name: name_2,
        private_key_data: private_key_data,
        public_key_data: public_key_data
      }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::ServiceAccountKey)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::CreateServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.create_service_account_key(formatted_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes create_service_account_key with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::CreateServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("create_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.create_service_account_key(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'delete_service_account_key' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#delete_service_account_key."

    it 'invokes delete_service_account_key without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::DeleteServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.delete_service_account_key(formatted_name)

          # Verify the response
          assert_nil(response)
        end
      end
    end

    it 'invokes delete_service_account_key with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::DeleteServiceAccountKeyRequest, request)
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_service_account_key, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("delete_service_account_key")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.delete_service_account_key(formatted_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'sign_blob' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#sign_blob."

    it 'invokes sign_blob without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      bytes_to_sign = ''

      # Create expected grpc response
      key_id = "keyId-1134673157"
      signature = "-72"
      expected_response = { key_id: key_id, signature: signature }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::SignBlobResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::SignBlobRequest, request)
        assert_equal(formatted_name, request.name)
        assert_equal(bytes_to_sign, request.bytes_to_sign)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:sign_blob, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("sign_blob")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.sign_blob(formatted_name, bytes_to_sign)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes sign_blob with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      bytes_to_sign = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::SignBlobRequest, request)
        assert_equal(formatted_name, request.name)
        assert_equal(bytes_to_sign, request.bytes_to_sign)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:sign_blob, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("sign_blob")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.sign_blob(formatted_name, bytes_to_sign)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'get_iam_policy' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#get_iam_policy."

    it 'invokes get_iam_policy without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = { version: version, etag: etag }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::V1::Policy)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::GetIamPolicyRequest, request)
        assert_equal(formatted_resource, request.resource)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_iam_policy")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.get_iam_policy(formatted_resource)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes get_iam_policy with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::GetIamPolicyRequest, request)
        assert_equal(formatted_resource, request.resource)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("get_iam_policy")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.get_iam_policy(formatted_resource)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'set_iam_policy' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#set_iam_policy."

    it 'invokes set_iam_policy without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      policy = {}

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = { version: version, etag: etag }
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::V1::Policy)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::SetIamPolicyRequest, request)
        assert_equal(formatted_resource, request.resource)
        assert_equal(Google::Gax::to_proto(policy, Google::Iam::V1::Policy), request.policy)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("set_iam_policy")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.set_iam_policy(formatted_resource, policy)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes set_iam_policy with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      policy = {}

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::SetIamPolicyRequest, request)
        assert_equal(formatted_resource, request.resource)
        assert_equal(Google::Gax::to_proto(policy, Google::Iam::V1::Policy), request.policy)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("set_iam_policy")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.set_iam_policy(formatted_resource, policy)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'test_iam_permissions' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#test_iam_permissions."

    it 'invokes test_iam_permissions without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      permissions = []

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::V1::TestIamPermissionsResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::TestIamPermissionsRequest, request)
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("test_iam_permissions")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.test_iam_permissions(formatted_resource, permissions)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes test_iam_permissions with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Iam::Admin::V1::IamClient.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
      permissions = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::V1::TestIamPermissionsRequest, request)
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("test_iam_permissions")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.test_iam_permissions(formatted_resource, permissions)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'query_grantable_roles' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Iam::Admin::V1::IamClient#query_grantable_roles."

    it 'invokes query_grantable_roles without error' do
      # Create request parameters
      full_resource_name = ''

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Iam::Admin::V1::QueryGrantableRolesResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::QueryGrantableRolesRequest, request)
        assert_equal(full_resource_name, request.full_resource_name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:query_grantable_roles, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("query_grantable_roles")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          response = client.query_grantable_roles(full_resource_name)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes query_grantable_roles with error' do
      # Create request parameters
      full_resource_name = ''

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Iam::Admin::V1::QueryGrantableRolesRequest, request)
        assert_equal(full_resource_name, request.full_resource_name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:query_grantable_roles, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("query_grantable_roles")

      Google::Iam::Admin::V1::IAM::Stub.stub(:new, mock_stub) do
        Google::Cloud::Iam::Admin::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Iam::Admin.new(version: :v1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.query_grantable_roles(full_resource_name)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end