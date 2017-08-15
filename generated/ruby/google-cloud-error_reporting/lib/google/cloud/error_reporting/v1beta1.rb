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

require "google/cloud/error_reporting/v1beta1/error_group_service_client"
require "google/cloud/error_reporting/v1beta1/error_stats_service_client"
require "google/cloud/error_reporting/v1beta1/report_errors_service_client"

module Google
  module Cloud
    # rubocop:disable LineLength

    ##
    # # Ruby Client for Stackdriver Error Reporting API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
    #
    # [Stackdriver Error Reporting API][Product Documentation]:
    # Stackdriver Error Reporting groups and counts similar errors from cloud services. The Stackdriver Error Reporting API provides a way to report new errors and read access to error groups and their associated errors.
    # - [Product Documentation][]
    #
    # ## Quick Start
    # In order to use this library, you first need to go through the following steps:
    #
    # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
    # 2. [Enable the Stackdriver Error Reporting API.](https://console.cloud.google.com/apis/api/error-reporting)
    # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
    #
    # ### Installation
    # ```
    # $ gem install google-cloud-error_reporting
    # ```
    #
    # ### Preview
    # #### ReportErrorsServiceClient
    # ```rb
    # require "google/cloud/error_reporting/v1beta1"
    #
    # report_errors_service_client = Google::Cloud::ErrorReporting::V1beta1::ReportErrors.new
    # formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient.project_path(project_id)
    # message = "[MESSAGE]"
    # service = "[SERVICE]"
    # service_context = { service: service }
    # file_path = "path/to/file.lang"
    # line_number = 42
    # function_name = "meaningOfLife"
    # report_location = {
    #   file_path: file_path,
    #   line_number: line_number,
    #   function_name: function_name
    # }
    # context = { report_location: report_location }
    # event = {
    #   message: message,
    #   service_context: service_context,
    #   context: context
    # }
    # response = report_errors_service_client.report_error_event(formatted_project_name, event)
    # ```
    #
    # ### Next Steps
    # - Read the [Stackdriver Error Reporting API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
    # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
    #
    # [Product Documentation]: https://cloud.google.com/error-reporting
    #
    #
    module ErrorReporting
      ##
      # # Stackdriver Error Reporting API Contents
      #
      # | Class | Description |
      # | ----- | ----------- |
      # | [ErrorGroupServiceClient][] | Stackdriver Error Reporting groups and counts similar errors from cloud services. The Stackdriver Error Reporting API provides a way to report new errors and read access to error groups and their associated errors. |
      # | [ErrorStatsServiceClient][] | Stackdriver Error Reporting groups and counts similar errors from cloud services. The Stackdriver Error Reporting API provides a way to report new errors and read access to error groups and their associated errors. |
      # | [ReportErrorsServiceClient][] | Stackdriver Error Reporting groups and counts similar errors from cloud services. The Stackdriver Error Reporting API provides a way to report new errors and read access to error groups and their associated errors. |
      # | [Data Types][] | Data types for Google::Cloud::ErrorReporting::V1beta1 |
      #
      # [ErrorGroupServiceClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-error_reporting/latest/google/devtools/clouderrorreporting/v1beta1/v1beta1/errorgroupserviceclient
      # [ErrorStatsServiceClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-error_reporting/latest/google/devtools/clouderrorreporting/v1beta1/v1beta1/errorstatsserviceclient
      # [ReportErrorsServiceClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-error_reporting/latest/google/devtools/clouderrorreporting/v1beta1/v1beta1/reporterrorsserviceclient
      # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-error_reporting/latest/google/devtools/clouderrorreporting/v1beta1/v1beta1/datatypes
      #
      module V1beta1
        # rubocop:enable LineLength

        module ErrorGroup
          ##
          # Service for retrieving and updating individual error groups.
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
            Google::Cloud::ErrorReporting::V1beta1::ErrorGroupServiceClient.new(*args, **kwargs)
          end
        end

        module ErrorStats
          ##
          # An API for retrieving and managing error statistics as well as data for
          # individual events.
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
            Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceClient.new(*args, **kwargs)
          end
        end

        module ReportErrors
          ##
          # An API for reporting error events.
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
            Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient.new(*args, **kwargs)
          end
        end
      end
    end
  end
end