# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/googleapis/googleapis/blob/master/google/iam/admin/v1/iam.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"
require "google/iam/admin/v1/iam_pb"

module Google
  module Cloud
    module Iam
      module Admin
        module V1
          # Creates and manages service account objects.
          #
          # Service account is an account that belongs to your project instead
          # of to an individual end user. It is used to authenticate calls
          # to a Google API.
          #
          # To create a service account, specify the +project_id+ and +account_id+
          # for the account.  The +account_id+ is unique within the project, and used
          # to generate the service account email address and a stable
          # +unique_id+.
          #
          # All other methods can identify accounts using the format
          # +projects/{project}/serviceAccounts/{account}+.
          # Using +-+ as a wildcard for the project will infer the project from
          # the account. The +account+ value can be the +email+ address or the
          # +unique_id+ of the service account.
          #
          # @!attribute [r] iam_stub
          #   @return [Google::Iam::Admin::V1::IAM::Stub]
          class IAMApi
            attr_reader :iam_stub

            # The default address of the service.
            SERVICE_ADDRESS = "iam.googleapis.com".freeze

            # The default port of the service.
            DEFAULT_SERVICE_PORT = 443

            CODE_GEN_NAME_VERSION = "gapic/0.1.0".freeze

            DEFAULT_TIMEOUT = 30

            PAGE_DESCRIPTORS = {
              "list_service_accounts" => Google::Gax::PageDescriptor.new(
                "page_token",
                "next_page_token",
                "accounts")
            }.freeze

            private_constant :PAGE_DESCRIPTORS

            # The scopes needed to make gRPC calls to all of the methods defined in
            # this service.
            ALL_SCOPES = [
              "https://www.googleapis.com/auth/cloud-platform",
              "https://www.googleapis.com/auth/iam"
            ].freeze

            PROJECT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
              "projects/{project}"
            )

            private_constant :PROJECT_PATH_TEMPLATE

            SERVICE_ACCOUNT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
              "projects/{project}/serviceAccounts/{service_account}"
            )

            private_constant :SERVICE_ACCOUNT_PATH_TEMPLATE

            KEY_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
              "projects/{project}/serviceAccounts/{service_account}/keys/{key}"
            )

            private_constant :KEY_PATH_TEMPLATE

            # Returns a fully-qualified project resource name string.
            # @param project [String]
            # @return [String]
            def self.project_path project
              PROJECT_PATH_TEMPLATE.render(
                :"project" => project
              )
            end

            # Returns a fully-qualified service_account resource name string.
            # @param project [String]
            # @param service_account [String]
            # @return [String]
            def self.service_account_path project, service_account
              SERVICE_ACCOUNT_PATH_TEMPLATE.render(
                :"project" => project,
                :"service_account" => service_account
              )
            end

            # Returns a fully-qualified key resource name string.
            # @param project [String]
            # @param service_account [String]
            # @param key [String]
            # @return [String]
            def self.key_path project, service_account, key
              KEY_PATH_TEMPLATE.render(
                :"project" => project,
                :"service_account" => service_account,
                :"key" => key
              )
            end

            # Parses the project from a project resource.
            # @param project_name [String]
            # @return [String]
            def self.match_project_from_project_name project_name
              PROJECT_PATH_TEMPLATE.match(project_name)["project"]
            end

            # Parses the project from a service_account resource.
            # @param service_account_name [String]
            # @return [String]
            def self.match_project_from_service_account_name service_account_name
              SERVICE_ACCOUNT_PATH_TEMPLATE.match(service_account_name)["project"]
            end

            # Parses the service_account from a service_account resource.
            # @param service_account_name [String]
            # @return [String]
            def self.match_service_account_from_service_account_name service_account_name
              SERVICE_ACCOUNT_PATH_TEMPLATE.match(service_account_name)["service_account"]
            end

            # Parses the project from a key resource.
            # @param key_name [String]
            # @return [String]
            def self.match_project_from_key_name key_name
              KEY_PATH_TEMPLATE.match(key_name)["project"]
            end

            # Parses the service_account from a key resource.
            # @param key_name [String]
            # @return [String]
            def self.match_service_account_from_key_name key_name
              KEY_PATH_TEMPLATE.match(key_name)["service_account"]
            end

            # Parses the key from a key resource.
            # @param key_name [String]
            # @return [String]
            def self.match_key_from_key_name key_name
              KEY_PATH_TEMPLATE.match(key_name)["key"]
            end

            # @param service_path [String]
            #   The domain name of the API remote host.
            # @param port [Integer]
            #   The port on which to connect to the remote host.
            # @param channel [Channel]
            #   A Channel object through which to make calls.
            # @param chan_creds [Grpc::ChannelCredentials]
            #   A ChannelCredentials for the setting up the RPC client.
            # @param client_config[Hash]
            #   A Hash for call options for each method. See
            #   Google::Gax#construct_settings for the structure of
            #   this data. Falls back to the default config if not specified
            #   or the specified config is missing data points.
            # @param timeout [Numeric]
            #   The default timeout, in seconds, for calls made through this client.
            # @param app_name [String]
            #   The codename of the calling service.
            # @param app_version [String]
            #   The version of the calling service.
            def initialize \
                service_path: SERVICE_ADDRESS,
                port: DEFAULT_SERVICE_PORT,
                channel: nil,
                chan_creds: nil,
                scopes: ALL_SCOPES,
                client_config: {},
                timeout: DEFAULT_TIMEOUT,
                app_name: "gax",
                app_version: Google::Gax::VERSION
              # These require statements are intentionally placed here to initialize
              # the gRPC module only when it's required.
              # See https://github.com/googleapis/toolkit/issues/446
              require "google/gax/grpc"
              require "google/iam/admin/v1/iam_services_pb"

              google_api_client = "#{app_name}/#{app_version} " \
                "#{CODE_GEN_NAME_VERSION} gax/#{Google::Gax::VERSION} " \
                "ruby/#{RUBY_VERSION}".freeze
              headers = { :"x-goog-api-client" => google_api_client }
              client_config_file = Pathname.new(__dir__).join(
                "iam_client_config.json"
              )
              defaults = client_config_file.open do |f|
                Google::Gax.construct_settings(
                  "google.iam.admin.v1.IAM",
                  JSON.parse(f.read),
                  client_config,
                  Google::Gax::Grpc::STATUS_CODE_NAMES,
                  timeout,
                  page_descriptors: PAGE_DESCRIPTORS,
                  errors: Google::Gax::Grpc::API_ERRORS,
                  kwargs: headers
                )
              end
              @iam_stub = Google::Gax::Grpc.create_stub(
                service_path,
                port,
                chan_creds: chan_creds,
                channel: channel,
                scopes: scopes,
                &Google::Iam::Admin::V1::IAM::Stub.method(:new)
              )

              @list_service_accounts = Google::Gax.create_api_call(
                @iam_stub.method(:list_service_accounts),
                defaults["list_service_accounts"]
              )
              @get_service_account = Google::Gax.create_api_call(
                @iam_stub.method(:get_service_account),
                defaults["get_service_account"]
              )
              @create_service_account = Google::Gax.create_api_call(
                @iam_stub.method(:create_service_account),
                defaults["create_service_account"]
              )
              @update_service_account = Google::Gax.create_api_call(
                @iam_stub.method(:update_service_account),
                defaults["update_service_account"]
              )
              @delete_service_account = Google::Gax.create_api_call(
                @iam_stub.method(:delete_service_account),
                defaults["delete_service_account"]
              )
              @list_service_account_keys = Google::Gax.create_api_call(
                @iam_stub.method(:list_service_account_keys),
                defaults["list_service_account_keys"]
              )
              @get_service_account_key = Google::Gax.create_api_call(
                @iam_stub.method(:get_service_account_key),
                defaults["get_service_account_key"]
              )
              @create_service_account_key = Google::Gax.create_api_call(
                @iam_stub.method(:create_service_account_key),
                defaults["create_service_account_key"]
              )
              @delete_service_account_key = Google::Gax.create_api_call(
                @iam_stub.method(:delete_service_account_key),
                defaults["delete_service_account_key"]
              )
              @sign_blob = Google::Gax.create_api_call(
                @iam_stub.method(:sign_blob),
                defaults["sign_blob"]
              )
              @get_iam_policy = Google::Gax.create_api_call(
                @iam_stub.method(:get_iam_policy),
                defaults["get_iam_policy"]
              )
              @set_iam_policy = Google::Gax.create_api_call(
                @iam_stub.method(:set_iam_policy),
                defaults["set_iam_policy"]
              )
              @test_iam_permissions = Google::Gax.create_api_call(
                @iam_stub.method(:test_iam_permissions),
                defaults["test_iam_permissions"]
              )
              @query_grantable_roles = Google::Gax.create_api_call(
                @iam_stub.method(:query_grantable_roles),
                defaults["query_grantable_roles"]
              )
            end

            # Service calls

            # Lists ServiceAccounts for a project.
            #
            # @param name [String]
            #   Required. The resource name of the project associated with the service
            #   accounts, such as +projects/my-project-123+.
            # @param page_size [Integer]
            #   The maximum number of resources contained in the underlying API
            #   response. If page streaming is performed per-resource, this
            #   parameter does not affect the return value. If page streaming is
            #   performed per-page, this determines the maximum number of
            #   resources in a page.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Gax::PagedEnumerable<Google::Iam::Admin::V1::ServiceAccount>]
            #   An enumerable of Google::Iam::Admin::V1::ServiceAccount instances.
            #   See Google::Gax::PagedEnumerable documentation for other
            #   operations such as per-page iteration or access to the response
            #   object.
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.project_path("[PROJECT]")
            #
            #   # Iterate over all results.
            #   iam_api.list_service_accounts(formatted_name).each do |element|
            #     # Process element.
            #   end
            #
            #   # Or iterate over results one page at a time.
            #   iam_api.list_service_accounts(formatted_name).each_page do |page|
            #     # Process each page at a time.
            #     page.each do |element|
            #       # Process element.
            #     end
            #   end

            def list_service_accounts \
                name,
                page_size: nil,
                options: nil
              req = Google::Iam::Admin::V1::ListServiceAccountsRequest.new(
                name: name
              )
              req.page_size = page_size unless page_size.nil?
              @list_service_accounts.call(req, options)
            end

            # Gets a ServiceAccount.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ServiceAccount]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   response = iam_api.get_service_account(formatted_name)

            def get_service_account \
                name,
                options: nil
              req = Google::Iam::Admin::V1::GetServiceAccountRequest.new(
                name: name
              )
              @get_service_account.call(req, options)
            end

            # Creates a ServiceAccount
            # and returns it.
            #
            # @param name [String]
            #   Required. The resource name of the project associated with the service
            #   accounts, such as +projects/my-project-123+.
            # @param account_id [String]
            #   Required. The account id that is used to generate the service account
            #   email address and a stable unique id. It is unique within a project,
            #   must be 6-30 characters long, and match the regular expression
            #   +{a-z}[https://cloud.google.com[-a-z0-9]*[a-z0-9]]+ to comply with RFC1035.
            # @param service_account [Google::Iam::Admin::V1::ServiceAccount]
            #   The ServiceAccount resource to create.
            #   Currently, only the following values are user assignable:
            #   +display_name+ .
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ServiceAccount]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.project_path("[PROJECT]")
            #   account_id = ''
            #   response = iam_api.create_service_account(formatted_name, account_id)

            def create_service_account \
                name,
                account_id,
                service_account: nil,
                options: nil
              req = Google::Iam::Admin::V1::CreateServiceAccountRequest.new(
                name: name,
                account_id: account_id
              )
              req.service_account = service_account unless service_account.nil?
              @create_service_account.call(req, options)
            end

            # Updates a ServiceAccount.
            #
            # Currently, only the following fields are updatable:
            # +display_name+ .
            # The +etag+ is mandatory.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #
            #   Requests using +-+ as a wildcard for the project will infer the project
            #   from the +account+ and the +account+ value can be the +email+ address or
            #   the +unique_id+ of the service account.
            #
            #   In responses the resource name will always be in the format
            #   +projects/{project}/serviceAccounts/{email}+.
            # @param project_id [String]
            #   @OutputOnly The id of the project that owns the service account.
            # @param unique_id [String]
            #   @OutputOnly The unique and stable id of the service account.
            # @param email [String]
            #   @OutputOnly The email address of the service account.
            # @param display_name [String]
            #   Optional. A user-specified description of the service account.  Must be
            #   fewer than 100 UTF-8 bytes.
            # @param etag [String]
            #   Used to perform a consistent read-modify-write.
            # @param oauth2_client_id [String]
            #   @OutputOnly. The OAuth2 client id for the service account.
            #   This is used in conjunction with the OAuth2 clientconfig API to make
            #   three legged OAuth2 (3LO) flows to access the data of Google users.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ServiceAccount]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   etag = ''
            #   response = iam_api.update_service_account(etag)

            def update_service_account \
                etag,
                name: nil,
                project_id: nil,
                unique_id: nil,
                email: nil,
                display_name: nil,
                oauth2_client_id: nil,
                options: nil
              req = Google::Iam::Admin::V1::ServiceAccount.new(
                etag: etag
              )
              req.name = name unless name.nil?
              req.project_id = project_id unless project_id.nil?
              req.unique_id = unique_id unless unique_id.nil?
              req.email = email unless email.nil?
              req.display_name = display_name unless display_name.nil?
              req.oauth2_client_id = oauth2_client_id unless oauth2_client_id.nil?
              @update_service_account.call(req, options)
            end

            # Deletes a ServiceAccount.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   iam_api.delete_service_account(formatted_name)

            def delete_service_account \
                name,
                options: nil
              req = Google::Iam::Admin::V1::DeleteServiceAccountRequest.new(
                name: name
              )
              @delete_service_account.call(req, options)
            end

            # Lists ServiceAccountKeys.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #
            #   Using +-+ as a wildcard for the project, will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param key_types [Array<Google::Iam::Admin::V1::ListServiceAccountKeysRequest::KeyType>]
            #   Filters the types of keys the user wants to include in the list
            #   response. Duplicate key types are not allowed. If no key type
            #   is provided, all keys are returned.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ListServiceAccountKeysResponse]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   response = iam_api.list_service_account_keys(formatted_name)

            def list_service_account_keys \
                name,
                key_types: nil,
                options: nil
              req = Google::Iam::Admin::V1::ListServiceAccountKeysRequest.new(
                name: name
              )
              req.key_types = key_types unless key_types.nil?
              @list_service_account_keys.call(req, options)
            end

            # Gets the ServiceAccountKey
            # by key id.
            #
            # @param name [String]
            #   The resource name of the service account key in the following format:
            #   +projects/{project}/serviceAccounts/{account}/keys/{key}+.
            #
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param public_key_type [Google::Iam::Admin::V1::ServiceAccountPublicKeyType]
            #   The output format of the public key requested.
            #   X509_PEM is the default output format.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ServiceAccountKey]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")
            #   response = iam_api.get_service_account_key(formatted_name)

            def get_service_account_key \
                name,
                public_key_type: nil,
                options: nil
              req = Google::Iam::Admin::V1::GetServiceAccountKeyRequest.new(
                name: name
              )
              req.public_key_type = public_key_type unless public_key_type.nil?
              @get_service_account_key.call(req, options)
            end

            # Creates a ServiceAccountKey
            # and returns it.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param private_key_type [Google::Iam::Admin::V1::ServiceAccountPrivateKeyType]
            #   The output format of the private key. +GOOGLE_CREDENTIALS_FILE+ is the
            #   default output format.
            # @param key_algorithm [Google::Iam::Admin::V1::ServiceAccountKeyAlgorithm]
            #   Which type of key and algorithm to use for the key.
            #   The default is currently a 4K RSA key.  However this may change in the
            #   future.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::ServiceAccountKey]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   response = iam_api.create_service_account_key(formatted_name)

            def create_service_account_key \
                name,
                private_key_type: nil,
                key_algorithm: nil,
                options: nil
              req = Google::Iam::Admin::V1::CreateServiceAccountKeyRequest.new(
                name: name
              )
              req.private_key_type = private_key_type unless private_key_type.nil?
              req.key_algorithm = key_algorithm unless key_algorithm.nil?
              @create_service_account_key.call(req, options)
            end

            # Deletes a ServiceAccountKey.
            #
            # @param name [String]
            #   The resource name of the service account key in the following format:
            #   +projects/{project}/serviceAccounts/{account}/keys/{key}+.
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.key_path("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]")
            #   iam_api.delete_service_account_key(formatted_name)

            def delete_service_account_key \
                name,
                options: nil
              req = Google::Iam::Admin::V1::DeleteServiceAccountKeyRequest.new(
                name: name
              )
              @delete_service_account_key.call(req, options)
            end

            # Signs a blob using a service account's system-managed private key.
            #
            # @param name [String]
            #   The resource name of the service account in the following format:
            #   +projects/{project}/serviceAccounts/{account}+.
            #   Using +-+ as a wildcard for the project will infer the project from
            #   the account. The +account+ value can be the +email+ address or the
            #   +unique_id+ of the service account.
            # @param bytes_to_sign [String]
            #   The bytes to sign.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::SignBlobResponse]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_name = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   bytes_to_sign = ''
            #   response = iam_api.sign_blob(formatted_name, bytes_to_sign)

            def sign_blob \
                name,
                bytes_to_sign,
                options: nil
              req = Google::Iam::Admin::V1::SignBlobRequest.new(
                name: name,
                bytes_to_sign: bytes_to_sign
              )
              @sign_blob.call(req, options)
            end

            # Returns the IAM access control policy for a
            # ServiceAccount.
            #
            # @param resource [String]
            #   REQUIRED: The resource for which the policy is being requested.
            #   +resource+ is usually specified as a path. For example, a Project
            #   resource is specified as +projects/{project}+.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::V1::Policy]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_resource = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   response = iam_api.get_iam_policy(formatted_resource)

            def get_iam_policy \
                resource,
                options: nil
              req = Google::Iam::V1::GetIamPolicyRequest.new(
                resource: resource
              )
              @get_iam_policy.call(req, options)
            end

            # Sets the IAM access control policy for a
            # ServiceAccount.
            #
            # @param resource [String]
            #   REQUIRED: The resource for which the policy is being specified.
            #   +resource+ is usually specified as a path. For example, a Project
            #   resource is specified as +projects/{project}+.
            # @param policy [Google::Iam::V1::Policy]
            #   REQUIRED: The complete policy to be applied to the +resource+. The size of
            #   the policy is limited to a few 10s of KB. An empty policy is a
            #   valid policy but certain Cloud Platform services (such as Projects)
            #   might reject them.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::V1::Policy]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #   Policy = Google::Iam::V1::Policy
            #
            #   iam_api = IamApi.new
            #   formatted_resource = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   policy = Policy.new
            #   response = iam_api.set_iam_policy(formatted_resource, policy)

            def set_iam_policy \
                resource,
                policy,
                options: nil
              req = Google::Iam::V1::SetIamPolicyRequest.new(
                resource: resource,
                policy: policy
              )
              @set_iam_policy.call(req, options)
            end

            # Tests the specified permissions against the IAM access control policy
            # for a ServiceAccount.
            #
            # @param resource [String]
            #   REQUIRED: The resource for which the policy detail is being requested.
            #   +resource+ is usually specified as a path. For example, a Project
            #   resource is specified as +projects/{project}+.
            # @param permissions [Array<String>]
            #   The set of permissions to check for the +resource+. Permissions with
            #   wildcards (such as '*' or 'storage.*') are not allowed. For more
            #   information see
            #   {IAM Overview}[https://cloud.google.com/iam/docs/overview#permissions].
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::V1::TestIamPermissionsResponse]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   formatted_resource = IamApi.service_account_path("[PROJECT]", "[SERVICE_ACCOUNT]")
            #   permissions = []
            #   response = iam_api.test_iam_permissions(formatted_resource, permissions)

            def test_iam_permissions \
                resource,
                permissions,
                options: nil
              req = Google::Iam::V1::TestIamPermissionsRequest.new(
                resource: resource,
                permissions: permissions
              )
              @test_iam_permissions.call(req, options)
            end

            # Queries roles that can be granted on a particular resource.
            # A role is grantable if it can be used as the role in a binding for a policy
            # for that resource.
            #
            # @param full_resource_name [String]
            #   Required. The full resource name to query from the list of grantable roles.
            #
            #   The name follows the Google Cloud Platform resource format.
            #   For example, a Cloud Platform project with id +my-project+ will be named
            #   +//cloudresourcemanager.googleapis.com/projects/my-project+.
            # @param options [Google::Gax::CallOptions]
            #   Overrides the default settings for this call, e.g, timeout,
            #   retries, etc.
            # @return [Google::Iam::Admin::V1::QueryGrantableRolesResponse]
            # @raise [Google::Gax::GaxError] if the RPC is aborted.
            # @example
            #   require "google/cloud/iam/admin/v1/iam_api"
            #
            #   IamApi = Google::Cloud::Iam::Admin::V1::IamApi
            #
            #   iam_api = IamApi.new
            #   full_resource_name = ''
            #   response = iam_api.query_grantable_roles(full_resource_name)

            def query_grantable_roles \
                full_resource_name,
                options: nil
              req = Google::Iam::Admin::V1::QueryGrantableRolesRequest.new(
                full_resource_name: full_resource_name
              )
              @query_grantable_roles.call(req, options)
            end
          end
        end
      end
    end
  end
end
