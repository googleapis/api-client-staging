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

module Google
  module Iam
    module Admin
      module V1
        # A service account in the Identity and Access Management API.
        #
        # To create a service account, specify the +project_id+ and the +account_id+
        # for the account.  The +account_id+ is unique within the project, and is used
        # to generate the service account email address and a stable
        # +unique_id+.
        #
        # If the account already exists, the account's resource name is returned
        # in util::Status's ResourceInfo.resource_name in the format of
        # projects/{project}/serviceAccounts/{email}. The caller can use the name in
        # other methods to access the account.
        #
        # All other methods can identify the service account using the format
        # +projects/{project}/serviceAccounts/{account}+.
        # Using +-+ as a wildcard for the project will infer the project from
        # the account. The +account+ value can be the +email+ address or the
        # +unique_id+ of the service account.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #
        #     Requests using +-+ as a wildcard for the project will infer the project
        #     from the +account+ and the +account+ value can be the +email+ address or
        #     the +unique_id+ of the service account.
        #
        #     In responses the resource name will always be in the format
        #     +projects/{project}/serviceAccounts/{email}+.
        # @!attribute [rw] project_id
        #   @return [String]
        #     @OutputOnly The id of the project that owns the service account.
        # @!attribute [rw] unique_id
        #   @return [String]
        #     @OutputOnly The unique and stable id of the service account.
        # @!attribute [rw] email
        #   @return [String]
        #     @OutputOnly The email address of the service account.
        # @!attribute [rw] display_name
        #   @return [String]
        #     Optional. A user-specified description of the service account.  Must be
        #     fewer than 100 UTF-8 bytes.
        # @!attribute [rw] etag
        #   @return [String]
        #     Used to perform a consistent read-modify-write.
        # @!attribute [rw] oauth2_client_id
        #   @return [String]
        #     @OutputOnly. The OAuth2 client id for the service account.
        #     This is used in conjunction with the OAuth2 clientconfig API to make
        #     three legged OAuth2 (3LO) flows to access the data of Google users.
        class ServiceAccount; end

        # The service account create request.
        # @!attribute [rw] name
        #   @return [String]
        #     Required. The resource name of the project associated with the service
        #     accounts, such as +projects/my-project-123+.
        # @!attribute [rw] account_id
        #   @return [String]
        #     Required. The account id that is used to generate the service account
        #     email address and a stable unique id. It is unique within a project,
        #     must be 6-30 characters long, and match the regular expression
        #     +[a-z](https://cloud.google.com[-a-z0-9]*[a-z0-9])+ to comply with RFC1035.
        # @!attribute [rw] service_account
        #   @return [Google::Iam::Admin::V1::ServiceAccount]
        #     The {Google::Iam::Admin::V1::ServiceAccount ServiceAccount} resource to create.
        #     Currently, only the following values are user assignable:
        #     +display_name+ .
        class CreateServiceAccountRequest; end

        # The service account list request.
        # @!attribute [rw] name
        #   @return [String]
        #     Required. The resource name of the project associated with the service
        #     accounts, such as +projects/my-project-123+.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     Optional limit on the number of service accounts to include in the
        #     response. Further accounts can subsequently be obtained by including the
        #     {Google::Iam::Admin::V1::ListServiceAccountsResponse#next_page_token ListServiceAccountsResponse#next_page_token}
        #     in a subsequent request.
        # @!attribute [rw] page_token
        #   @return [String]
        #     Optional pagination token returned in an earlier
        #     {Google::Iam::Admin::V1::ListServiceAccountsResponse#next_page_token ListServiceAccountsResponse#next_page_token}.
        class ListServiceAccountsRequest; end

        # The service account list response.
        # @!attribute [rw] accounts
        #   @return [Array<Google::Iam::Admin::V1::ServiceAccount>]
        #     The list of matching service accounts.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     To retrieve the next page of results, set
        #     {Google::Iam::Admin::V1::ListServiceAccountsRequest#page_token ListServiceAccountsRequest#page_token}
        #     to this value.
        class ListServiceAccountsResponse; end

        # The service account get request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        class GetServiceAccountRequest; end

        # The service account delete request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        class DeleteServiceAccountRequest; end

        # The service account keys list request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #
        #     Using +-+ as a wildcard for the project, will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        # @!attribute [rw] key_types
        #   @return [Array<Google::Iam::Admin::V1::ListServiceAccountKeysRequest::KeyType>]
        #     Filters the types of keys the user wants to include in the list
        #     response. Duplicate key types are not allowed. If no key type
        #     is provided, all keys are returned.
        class ListServiceAccountKeysRequest
          # +KeyType+ filters to selectively retrieve certain varieties
          # of keys.
          module KeyType
            # Unspecified key type. The presence of this in the
            # message will immediately result in an error.
            KEY_TYPE_UNSPECIFIED = 0

            # User-managed keys (managed and rotated by the user).
            USER_MANAGED = 1

            # System-managed keys (managed and rotated by Google).
            SYSTEM_MANAGED = 2
          end
        end

        # The service account keys list response.
        # @!attribute [rw] keys
        #   @return [Array<Google::Iam::Admin::V1::ServiceAccountKey>]
        #     The public keys for the service account.
        class ListServiceAccountKeysResponse; end

        # The service account key get by id request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account key in the following format:
        #     +projects/{project}/serviceAccounts/{account}/keys/{key}+.
        #
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        # @!attribute [rw] public_key_type
        #   @return [Google::Iam::Admin::V1::ServiceAccountPublicKeyType]
        #     The output format of the public key requested.
        #     X509_PEM is the default output format.
        class GetServiceAccountKeyRequest; end

        # Represents a service account key.
        #
        # A service account has two sets of key-pairs: user-managed, and
        # system-managed.
        #
        # User-managed key-pairs can be created and deleted by users.  Users are
        # responsible for rotating these keys periodically to ensure security of
        # their service accounts.  Users retain the private key of these key-pairs,
        # and Google retains ONLY the public key.
        #
        # System-managed key-pairs are managed automatically by Google, and rotated
        # daily without user intervention.  The private key never leaves Google's
        # servers to maximize security.
        #
        # Public keys for all service accounts are also published at the OAuth2
        # Service Account API.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account key in the following format
        #     +projects/{project}/serviceAccounts/{account}/keys/{key}+.
        # @!attribute [rw] private_key_type
        #   @return [Google::Iam::Admin::V1::ServiceAccountPrivateKeyType]
        #     The output format for the private key.
        #     Only provided in +CreateServiceAccountKey+ responses, not
        #     in +GetServiceAccountKey+ or +ListServiceAccountKey+ responses.
        #
        #     Google never exposes system-managed private keys, and never retains
        #     user-managed private keys.
        # @!attribute [rw] key_algorithm
        #   @return [Google::Iam::Admin::V1::ServiceAccountKeyAlgorithm]
        #     Specifies the algorithm (and possibly key size) for the key.
        # @!attribute [rw] private_key_data
        #   @return [String]
        #     The private key data. Only provided in +CreateServiceAccountKey+
        #     responses.
        # @!attribute [rw] public_key_data
        #   @return [String]
        #     The public key data. Only provided in +GetServiceAccountKey+ responses.
        # @!attribute [rw] valid_after_time
        #   @return [Google::Protobuf::Timestamp]
        #     The key can be used after this timestamp.
        # @!attribute [rw] valid_before_time
        #   @return [Google::Protobuf::Timestamp]
        #     The key can be used before this timestamp.
        class ServiceAccountKey; end

        # The service account key create request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        # @!attribute [rw] private_key_type
        #   @return [Google::Iam::Admin::V1::ServiceAccountPrivateKeyType]
        #     The output format of the private key. +GOOGLE_CREDENTIALS_FILE+ is the
        #     default output format.
        # @!attribute [rw] key_algorithm
        #   @return [Google::Iam::Admin::V1::ServiceAccountKeyAlgorithm]
        #     Which type of key and algorithm to use for the key.
        #     The default is currently a 4K RSA key.  However this may change in the
        #     future.
        class CreateServiceAccountKeyRequest; end

        # The service account key delete request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account key in the following format:
        #     +projects/{project}/serviceAccounts/{account}/keys/{key}+.
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        class DeleteServiceAccountKeyRequest; end

        # The service account sign blob request.
        # @!attribute [rw] name
        #   @return [String]
        #     The resource name of the service account in the following format:
        #     +projects/{project}/serviceAccounts/{account}+.
        #     Using +-+ as a wildcard for the project will infer the project from
        #     the account. The +account+ value can be the +email+ address or the
        #     +unique_id+ of the service account.
        # @!attribute [rw] bytes_to_sign
        #   @return [String]
        #     The bytes to sign.
        class SignBlobRequest; end

        # The service account sign blob response.
        # @!attribute [rw] key_id
        #   @return [String]
        #     The id of the key used to sign the blob.
        # @!attribute [rw] signature
        #   @return [String]
        #     The signed blob.
        class SignBlobResponse; end

        # A role in the Identity and Access Management API.
        # @!attribute [rw] name
        #   @return [String]
        #     The name of the role.
        #
        #     When Role is used in CreateRole, the role name must not be set.
        #
        #     When Role is used in output and other input such as UpdateRole, the role
        #     name is the complete path, e.g., roles/logging.viewer for curated roles
        #     and organizations/{organization-id}/roles/logging.viewer for custom roles.
        # @!attribute [rw] title
        #   @return [String]
        #     Optional.  A human-readable title for the role.  Typically this
        #     is limited to 100 UTF-8 bytes.
        # @!attribute [rw] description
        #   @return [String]
        #     Optional.  A human-readable description for the role.
        class Role; end

        # The grantable role query request.
        # @!attribute [rw] full_resource_name
        #   @return [String]
        #     Required. The full resource name to query from the list of grantable roles.
        #
        #     The name follows the Google Cloud Platform resource format.
        #     For example, a Cloud Platform project with id +my-project+ will be named
        #     +//cloudresourcemanager.googleapis.com/projects/my-project+.
        class QueryGrantableRolesRequest; end

        # The grantable role query response.
        # @!attribute [rw] roles
        #   @return [Array<Google::Iam::Admin::V1::Role>]
        #     The list of matching roles.
        class QueryGrantableRolesResponse; end

        # Supported key algorithms.
        module ServiceAccountKeyAlgorithm
          # An unspecified key algorithm.
          KEY_ALG_UNSPECIFIED = 0

          # 1k RSA Key.
          KEY_ALG_RSA_1024 = 1

          # 2k RSA Key.
          KEY_ALG_RSA_2048 = 2
        end

        # Supported private key output formats.
        module ServiceAccountPrivateKeyType
          # Unspecified. Equivalent to +TYPE_GOOGLE_CREDENTIALS_FILE+.
          TYPE_UNSPECIFIED = 0

          # PKCS12 format.
          # The password for the PKCS12 file is +notasecret+.
          # For more information, see https://tools.ietf.org/html/rfc7292.
          TYPE_PKCS12_FILE = 1

          # Google Credentials File format.
          TYPE_GOOGLE_CREDENTIALS_FILE = 2
        end

        # Supported public key output formats.
        module ServiceAccountPublicKeyType
          # Unspecified. Returns nothing here.
          TYPE_NONE = 0

          # X509 PEM format.
          TYPE_X509_PEM_FILE = 1

          # Raw public key.
          TYPE_RAW_PUBLIC_KEY = 2
        end
      end
    end
  end
end