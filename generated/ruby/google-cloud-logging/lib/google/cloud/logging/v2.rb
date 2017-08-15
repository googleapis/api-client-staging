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

require "google/cloud/logging/v2/logging_service_v2_client"
require "google/cloud/logging/v2/config_service_v2_client"
require "google/cloud/logging/v2/metrics_service_v2_client"

module Google
  module Cloud
    # rubocop:disable LineLength

    ##
    # # Ruby Client for Stackdriver Logging API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
    #
    # [Stackdriver Logging API][Product Documentation]: The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics.
    # - [Product Documentation][]
    #
    # ## Quick Start
    # In order to use this library, you first need to go through the following steps:
    #
    # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
    # 2. [Enable the Stackdriver Logging API.](https://console.cloud.google.com/apis/api/logging)
    # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
    #
    # ### Installation
    # ```
    # $ gem install google-cloud-logging
    # ```
    #
    # ### Preview
    # #### LoggingServiceV2Client
    # ```rb
    # require "google/cloud/logging/v2"
    #
    # logging_service_v2_client = Google::Cloud::Logging::V2::Logging.new
    # formatted_log_name = Google::Cloud::Logging::V2::LoggingServiceV2Client.log_path(project_id, "test-" + Time.new.to_i.to_s)
    # resource = {}
    # labels = {}
    # entries = []
    # response = logging_service_v2_client.write_log_entries(formatted_log_name, resource, labels, entries)
    # ```
    #
    # ### Next Steps
    # - Read the [Stackdriver Logging API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
    # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
    #
    # [Product Documentation]: https://cloud.google.com/logging
    #
    #
    module Logging
      ##
      # # Stackdriver Logging API Contents
      #
      # | Class | Description |
      # | ----- | ----------- |
      # | [LoggingServiceV2Client][] | The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics. |
      # | [ConfigServiceV2Client][] | The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics. |
      # | [MetricsServiceV2Client][] | The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics. |
      # | [Data Types][] | Data types for Google::Cloud::Logging::V2 |
      #
      # [LoggingServiceV2Client]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-logging/latest/google/logging/v2/v2/loggingservicev2client
      # [ConfigServiceV2Client]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-logging/latest/google/logging/v2/v2/configservicev2client
      # [MetricsServiceV2Client]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-logging/latest/google/logging/v2/v2/metricsservicev2client
      # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-logging/latest/google/logging/v2/v2/datatypes
      #
      module V2
        # rubocop:enable LineLength

        module Logging
          ##
          # Service for ingesting and querying logs.
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
            Google::Cloud::Logging::V2::LoggingServiceV2Client.new(*args, **kwargs)
          end
        end

        module Config
          ##
          # Service for configuring sinks used to export log entries outside of
          # Stackdriver Logging.
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
            Google::Cloud::Logging::V2::ConfigServiceV2Client.new(*args, **kwargs)
          end
        end

        module Metrics
          ##
          # Service for configuring logs-based metrics.
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
            Google::Cloud::Logging::V2::MetricsServiceV2Client.new(*args, **kwargs)
          end
        end
      end
    end
  end
end