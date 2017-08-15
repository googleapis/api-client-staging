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

require "google/cloud/spanner/admin/instance/v1/instance_admin_client"

module Google
  module Cloud
    module Spanner
      module Admin
        # rubocop:disable LineLength

        ##
        # # Ruby Client for Cloud Spanner Instance Admin API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
        #
        # [Cloud Spanner Instance Admin API][Product Documentation]:
        # - [Product Documentation][]
        #
        # ## Quick Start
        # In order to use this library, you first need to go through the following steps:
        #
        # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
        # 2. [Enable the Cloud Spanner Instance Admin API.](https://console.cloud.google.com/apis/api/spanner-admin-instance)
        # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
        #
        # ### Installation
        # ```
        # $ gem install google-cloud-spanner-admin-instance
        # ```
        #
        # ### Next Steps
        # - Read the [Cloud Spanner Instance Admin API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
        # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
        #
        # [Product Documentation]: https://cloud.google.com/spanner-admin-instance
        #
        #
        module Instance
          ##
          # # Cloud Spanner Instance Admin API Contents
          #
          # | Class | Description |
          # | ----- | ----------- |
          # | [InstanceAdminClient][] |  |
          # | [Data Types][] | Data types for Google::Cloud::Spanner::Admin::Instance::V1 |
          #
          # [InstanceAdminClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-spanner-admin-instance/latest/google/spanner/admin/instance/v1/v1/instanceadminclient
          # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-spanner-admin-instance/latest/google/spanner/admin/instance/v1/v1/datatypes
          #
          module V1
            # rubocop:enable LineLength

            ##
            # Cloud Spanner Instance Admin API
            #
            # The Cloud Spanner Instance Admin API can be used to create, delete,
            # modify and list instances. Instances are dedicated Cloud Spanner serving
            # and storage resources to be used by Cloud Spanner databases.
            #
            # Each instance has a "configuration", which dictates where the
            # serving resources for the Cloud Spanner instance are located (e.g.,
            # US-central, Europe). Configurations are created by Google based on
            # resource availability.
            #
            # Cloud Spanner billing is based on the instances that exist and their
            # sizes. After an instance exists, there are no additional
            # per-database or per-operation charges for use of the instance
            # (though there may be additional network bandwidth charges).
            # Instances offer isolation: problems with databases in one instance
            # will not affect other instances. However, within an instance
            # databases can affect each other. For example, if one database in an
            # instance receives a lot of requests and consumes most of the
            # instance resources, fewer resources are available for other
            # databases in that instance, and their performance may suffer.
            #
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
            def self.new(*args, **kwargs)
              Google::Cloud::Spanner::Admin::Instance::V1::InstanceAdminClient.new(*args, **kwargs)
            end
          end
        end
      end
    end
  end
end