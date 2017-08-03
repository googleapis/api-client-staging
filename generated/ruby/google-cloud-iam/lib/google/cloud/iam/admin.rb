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

require "google/gax"
require "pathname"

module Google
  module Cloud
    module Iam
      # rubocop:disable LineLength

      ##
      # # Ruby Client for Google Identity and Access Management (IAM) API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
      #
      # [Google Identity and Access Management (IAM) API][Product Documentation]: Manages identity and access control for Google Cloud Platform resources, including the creation of service accounts, which you can use to authenticate to Google and make API calls.
      # - [Product Documentation][]
      #
      # ## Quick Start
      # In order to use this library, you first need to go through the following steps:
      #
      # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
      # 2. [Enable the Google Identity and Access Management (IAM) API.](https://console.cloud.google.com/apis/api/iam-admin)
      # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
      #
      # ### Installation
      # ```
      # $ gem install google-cloud-iam-admin
      # ```
      #
      # ### Next Steps
      # - Read the [Google Identity and Access Management (IAM) API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
      # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
      #
      # [Product Documentation]: https://cloud.google.com/iam-admin
      #
      #
      module Admin
        # rubocop:enable LineLength

        FILE_DIR = File.realdirpath(Pathname.new(__FILE__).join("..").join("admin"))

        AVAILABLE_VERSIONS = Dir["#{FILE_DIR}/*"]
          .select {|file| File.directory?(file)}
          .select {|dir| Google::Gax::VERSION_MATCHER.match(File.basename(dir))}
          .select {|dir| File.exist?(dir + ".rb")}
          .map {|dir| File.basename(dir)}

        ##
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
        # @param version [Symbol, String]
        #   The major version of the service to be used. By default :v1
        #   is used.
        # @param service_path [String]
        #   The domain name of the API remote host.
        # @param port [Integer]
        #   The port on which to connect to the remote host.
        # @param credentials
        #   [Google::Gax::Credentials, String, Hash, GRPC::Core::Channel, GRPC::Core::ChannelCredentials, Proc]
        #   Provides the means for authenticating requests made by the client. This parameter can
        #   be many types.
        #   A `Google::Gax::Credentials` uses a the properties of its represented keyfile for
        #   authenticating requests made by this client.
        #   A `String` will be treated as the path to the keyfile to be used for the construction of
        #   credentials for this client.
        #   A `Hash` will be treated as the contents of a keyfile to be used for the construction of
        #   credentials for this client.
        #   A `GRPC::Core::Channel` will be used to make calls through.
        #   A `GRPC::Core::ChannelCredentials` for the setting up the RPC client. The channel credentials
        #   should already be composed with a `GRPC::Core::CallCredentials` object.
        #   A `Proc` will be used as an updater_proc for the Grpc channel. The proc transforms the
        #   metadata for requests, generally, to give OAuth credentials.
        # @param scopes [Array<String>]
        #   The OAuth scopes for this service. This parameter is ignored if
        #   an updater_proc is supplied.
        # @param client_config[Hash]
        #   A Hash for call options for each method. See
        #   Google::Gax#construct_settings for the structure of
        #   this data. Falls back to the default config if not specified
        #   or the specified config is missing data points.
        # @param timeout [Numeric]
        #   The default timeout, in seconds, for calls made through this client.
        def self.new(*args, version: :v1, **kwargs)
          unless AVAILABLE_VERSIONS.include?(version.to_s.downcase)
            raise "The version: #{version} is not available. The available versions " \
              "are: [#{AVAILABLE_VERSIONS.join(", ")}]"
          end

          require "#{FILE_DIR}/#{version.to_s.downcase}"
          version_module = Google::Cloud::Iam::Admin
            .constants
            .select {|sym| sym.to_s.downcase == version.to_s.downcase}
            .first
          Google::Cloud::Iam::Admin.const_get(version_module).new(*args, **kwargs)
        end
      end
    end
  end
end