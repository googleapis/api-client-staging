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
# https://github.com/googleapis/googleapis/blob/master/google/monitoring/v3/agent_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"

module Google
  module Cloud
    module Monitoring
      module V3
        # The AgentTranslation API allows +collectd+-based agents to
        # write time series data to Cloud Monitoring.
        # See [google.monitoring.v3.MetricService.CreateTimeSeries] instead.
        #
        # @!attribute [r] agent_translation_service_stub
        #   @return [Google::Monitoring::V3::AgentTranslationService::Stub]
        class AgentTranslationServiceApi
          attr_reader :agent_translation_service_stub

          # The default address of the service.
          SERVICE_ADDRESS = "monitoring.googleapis.com".freeze

          # The default port of the service.
          DEFAULT_SERVICE_PORT = 443

          CODE_GEN_NAME_VERSION = "gapic/0.1.0".freeze

          DEFAULT_TIMEOUT = 30

          # The scopes needed to make gRPC calls to all of the methods defined in
          # this service.
          ALL_SCOPES = [
          ].freeze

          PROJECT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}"
          )

          private_constant :PROJECT_PATH_TEMPLATE

          # Returns a fully-qualified project resource name string.
          # @param project [String]
          # @return [String]
          def self.project_path project
            PROJECT_PATH_TEMPLATE.render(
              :"project" => project
            )
          end

          # Parses the project from a project resource.
          # @param project_name [String]
          # @return [String]
          def self.match_project_from_project_name project_name
            PROJECT_PATH_TEMPLATE.match(project_name)["project"]
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
            require "google/monitoring/v3/agent_service_services_pb"

            google_api_client = "#{app_name}/#{app_version} " \
              "#{CODE_GEN_NAME_VERSION} gax/#{Google::Gax::VERSION} " \
              "ruby/#{RUBY_VERSION}".freeze
            headers = { :"x-goog-api-client" => google_api_client }
            client_config_file = Pathname.new(__dir__).join(
              "agent_translation_service_client_config.json"
            )
            defaults = client_config_file.open do |f|
              Google::Gax.construct_settings(
                "google.monitoring.v3.AgentTranslationService",
                JSON.parse(f.read),
                client_config,
                Google::Gax::Grpc::STATUS_CODE_NAMES,
                timeout,
                errors: Google::Gax::Grpc::API_ERRORS,
                kwargs: headers
              )
            end
            @agent_translation_service_stub = Google::Gax::Grpc.create_stub(
              service_path,
              port,
              chan_creds: chan_creds,
              channel: channel,
              scopes: scopes,
              &Google::Monitoring::V3::AgentTranslationService::Stub.method(:new)
            )

            @create_collectd_time_series = Google::Gax.create_api_call(
              @agent_translation_service_stub.method(:create_collectd_time_series),
              defaults["create_collectd_time_series"]
            )
          end

          # Service calls

          # **Stackdriver Monitoring Agent only:** Creates a new time series.
          #
          # <aside class="caution">This method is only for use by the Google Monitoring Agent.
          # Use Projects::TimeSeries::Create
          # instead.</aside>
          #
          # @param name [String]
          #   The project in which to create the time series. The format is
          #   +"projects/PROJECT_ID_OR_NUMBER"+.
          # @param resource [Google::Api::MonitoredResource]
          #   The monitored resource associated with the time series.
          # @param collectd_version [String]
          #   The version of +collectd+ that collected the data. Example: +"5.3.0-192.el6"+.
          # @param collectd_payloads [Array<Google::Monitoring::V3::CollectdPayload>]
          #   The +collectd+ payloads representing the time series data.
          #   You must not include more than a single point for each
          #   time series, so no two payloads can have the same values
          #   for all of the fields +plugin+, +plugin_instance+, +type+, and +type_instance+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/agent_translation_service_api"
          #
          #   AgentTranslationServiceApi = Google::Cloud::Monitoring::V3::AgentTranslationServiceApi
          #   MonitoredResource = Google::Api::MonitoredResource
          #
          #   agent_translation_service_api = AgentTranslationServiceApi.new
          #   formatted_name = AgentTranslationServiceApi.project_path("[PROJECT]")
          #   resource = MonitoredResource.new
          #   collectd_version = ''
          #   collectd_payloads = []
          #   agent_translation_service_api.create_collectd_time_series(formatted_name, resource, collectd_version, collectd_payloads)

          def create_collectd_time_series \
              name,
              resource,
              collectd_version,
              collectd_payloads,
              options: nil
            req = Google::Monitoring::V3::CreateCollectdTimeSeriesRequest.new(
              name: name,
              resource: resource,
              collectd_version: collectd_version,
              collectd_payloads: collectd_payloads
            )
            @create_collectd_time_series.call(req, options)
          end
        end
      end
    end
  end
end
