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
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/googleapis/googleapis/blob/master/google/logging/v2/logging_config.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"

require "google/logging/v2/logging_config_pb"
require "google/cloud/logging/credentials"

module Google
  module Cloud
    module Logging
      module V2
        # Service for configuring sinks used to export log entries outside of
        # Stackdriver Logging.
        #
        # @!attribute [r] config_service_v2_stub
        #   @return [Google::Logging::V2::ConfigServiceV2::Stub]
        class ConfigServiceV2Client
          attr_reader :config_service_v2_stub

          # The default address of the service.
          SERVICE_ADDRESS = "logging.googleapis.com".freeze

          # The default port of the service.
          DEFAULT_SERVICE_PORT = 443

          DEFAULT_TIMEOUT = 30

          PAGE_DESCRIPTORS = {
            "list_sinks" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "sinks")
          }.freeze

          private_constant :PAGE_DESCRIPTORS

          # The scopes needed to make gRPC calls to all of the methods defined in
          # this service.
          ALL_SCOPES = [
            "https://www.googleapis.com/auth/cloud-platform",
            "https://www.googleapis.com/auth/cloud-platform.read-only",
            "https://www.googleapis.com/auth/logging.admin",
            "https://www.googleapis.com/auth/logging.read",
            "https://www.googleapis.com/auth/logging.write"
          ].freeze

          PROJECT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}"
          )

          private_constant :PROJECT_PATH_TEMPLATE

          SINK_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}/sinks/{sink}"
          )

          private_constant :SINK_PATH_TEMPLATE

          # Returns a fully-qualified project resource name string.
          # @param project [String]
          # @return [String]
          def self.project_path project
            PROJECT_PATH_TEMPLATE.render(
              :"project" => project
            )
          end

          # Returns a fully-qualified sink resource name string.
          # @param project [String]
          # @param sink [String]
          # @return [String]
          def self.sink_path project, sink
            SINK_PATH_TEMPLATE.render(
              :"project" => project,
              :"sink" => sink
            )
          end

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
          def initialize \
              service_path: SERVICE_ADDRESS,
              port: DEFAULT_SERVICE_PORT,
              channel: nil,
              chan_creds: nil,
              updater_proc: nil,
              credentials: nil,
              scopes: ALL_SCOPES,
              client_config: {},
              timeout: DEFAULT_TIMEOUT,
              app_name: nil,
              app_version: nil,
              lib_name: nil,
              lib_version: ""
            # These require statements are intentionally placed here to initialize
            # the gRPC module only when it's required.
            # See https://github.com/googleapis/toolkit/issues/446
            require "google/gax/grpc"
            require "google/logging/v2/logging_config_services_pb"

            if channel || chan_creds || updater_proc
              warn "The `channel`, `chan_creds`, and `updater_proc` parameters will be removed " \
                "on 2017/09/08"
              credentials ||= channel
              credentials ||= chan_creds
              credentials ||= updater_proc
            end
            if app_name || app_version
              warn "`app_name` and `app_version` are no longer being used in the request headers."
            end

            credentials ||= Google::Cloud::Logging::Credentials.default

            if credentials.is_a?(String) || credentials.is_a?(Hash)
              updater_proc = Google::Cloud::Logging::Credentials.new(credentials).updater_proc
            end
            if credentials.is_a?(GRPC::Core::Channel)
              channel = credentials
            end
            if credentials.is_a?(GRPC::Core::ChannelCredentials)
              chan_creds = credentials
            end
            if credentials.is_a?(Proc)
              updater_proc = credentials
            end
            if credentials.is_a?(Google::Gax::Credentials)
              updater_proc = credentials.updater_proc
            end

            google_api_client = "gl-ruby/#{RUBY_VERSION}"
            google_api_client << " #{lib_name}/#{lib_version}" if lib_name
            google_api_client << " gapic/0.6.8 gax/#{Google::Gax::VERSION}"
            google_api_client << " grpc/#{GRPC::VERSION}"
            google_api_client.freeze

            headers = { :"x-goog-api-client" => google_api_client }
            client_config_file = Pathname.new(__dir__).join(
              "config_service_v2_client_config.json"
            )
            defaults = client_config_file.open do |f|
              Google::Gax.construct_settings(
                "google.logging.v2.ConfigServiceV2",
                JSON.parse(f.read),
                client_config,
                Google::Gax::Grpc::STATUS_CODE_NAMES,
                timeout,
                page_descriptors: PAGE_DESCRIPTORS,
                errors: Google::Gax::Grpc::API_ERRORS,
                kwargs: headers
              )
            end
            @config_service_v2_stub = Google::Gax::Grpc.create_stub(
              service_path,
              port,
              chan_creds: chan_creds,
              channel: channel,
              updater_proc: updater_proc,
              scopes: scopes,
              &Google::Logging::V2::ConfigServiceV2::Stub.method(:new)
            )

            @list_sinks = Google::Gax.create_api_call(
              @config_service_v2_stub.method(:list_sinks),
              defaults["list_sinks"]
            )
            @get_sink = Google::Gax.create_api_call(
              @config_service_v2_stub.method(:get_sink),
              defaults["get_sink"]
            )
            @create_sink = Google::Gax.create_api_call(
              @config_service_v2_stub.method(:create_sink),
              defaults["create_sink"]
            )
            @update_sink = Google::Gax.create_api_call(
              @config_service_v2_stub.method(:update_sink),
              defaults["update_sink"]
            )
            @delete_sink = Google::Gax.create_api_call(
              @config_service_v2_stub.method(:delete_sink),
              defaults["delete_sink"]
            )
          end

          # Service calls

          # Lists sinks.
          #
          # @param parent [String]
          #   Required. The parent resource whose sinks are to be listed:
          #
          #       "projects/[PROJECT_ID]"
          #       "organizations/[ORGANIZATION_ID]"
          #       "billingAccounts/[BILLING_ACCOUNT_ID]"
          #       "folders/[FOLDER_ID]"
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Logging::V2::LogSink>]
          #   An enumerable of Google::Logging::V2::LogSink instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/logging/v2"
          #
          #   config_service_v2_client = Google::Cloud::Logging::V2::Config.new
          #   formatted_parent = Google::Cloud::Logging::V2::ConfigServiceV2Client.project_path("[PROJECT]")
          #
          #   # Iterate over all results.
          #   config_service_v2_client.list_sinks(formatted_parent).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   config_service_v2_client.list_sinks(formatted_parent).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_sinks \
              parent,
              page_size: nil,
              options: nil
            req = {
              parent: parent,
              page_size: page_size
            }.delete_if { |_, v| v.nil? }
            req = Google::Gax::to_proto(req, Google::Logging::V2::ListSinksRequest)
            @list_sinks.call(req, options)
          end

          # Gets a sink.
          #
          # @param sink_name [String]
          #   Required. The resource name of the sink:
          #
          #       "projects/[PROJECT_ID]/sinks/[SINK_ID]"
          #       "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
          #       "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
          #       "folders/[FOLDER_ID]/sinks/[SINK_ID]"
          #
          #   Example: +"projects/my-project-id/sinks/my-sink-id"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Logging::V2::LogSink]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/logging/v2"
          #
          #   config_service_v2_client = Google::Cloud::Logging::V2::Config.new
          #   formatted_sink_name = Google::Cloud::Logging::V2::ConfigServiceV2Client.sink_path("[PROJECT]", "[SINK]")
          #   response = config_service_v2_client.get_sink(formatted_sink_name)

          def get_sink \
              sink_name,
              options: nil
            req = {
              sink_name: sink_name
            }.delete_if { |_, v| v.nil? }
            req = Google::Gax::to_proto(req, Google::Logging::V2::GetSinkRequest)
            @get_sink.call(req, options)
          end

          # Creates a sink that exports specified log entries to a destination.  The
          # export of newly-ingested log entries begins immediately, unless the current
          # time is outside the sink's start and end times or the sink's
          # +writer_identity+ is not permitted to write to the destination.  A sink can
          # export log entries only from the resource owning the sink.
          #
          # @param parent [String]
          #   Required. The resource in which to create the sink:
          #
          #       "projects/[PROJECT_ID]"
          #       "organizations/[ORGANIZATION_ID]"
          #       "billingAccounts/[BILLING_ACCOUNT_ID]"
          #       "folders/[FOLDER_ID]"
          #
          #   Examples: +"projects/my-logging-project"+, +"organizations/123456789"+.
          # @param sink [Google::Logging::V2::LogSink | Hash]
          #   Required. The new sink, whose +name+ parameter is a sink identifier that
          #   is not already in use.
          #   A hash of the same form as `Google::Logging::V2::LogSink`
          #   can also be provided.
          # @param unique_writer_identity [true, false]
          #   Optional. Determines the kind of IAM identity returned as +writer_identity+
          #   in the new sink.  If this value is omitted or set to false, and if the
          #   sink's parent is a project, then the value returned as +writer_identity+ is
          #   the same group or service account used by Stackdriver Logging before the
          #   addition of writer identities to this API. The sink's destination must be
          #   in the same project as the sink itself.
          #
          #   If this field is set to true, or if the sink is owned by a non-project
          #   resource such as an organization, then the value of +writer_identity+ will
          #   be a unique service account used only for exports from the new sink.  For
          #   more information, see +writer_identity+ in {Google::Logging::V2::LogSink LogSink}.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Logging::V2::LogSink]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/logging/v2"
          #
          #   config_service_v2_client = Google::Cloud::Logging::V2::Config.new
          #   formatted_parent = Google::Cloud::Logging::V2::ConfigServiceV2Client.project_path("[PROJECT]")
          #   sink = {}
          #   response = config_service_v2_client.create_sink(formatted_parent, sink)

          def create_sink \
              parent,
              sink,
              unique_writer_identity: nil,
              options: nil
            req = {
              parent: parent,
              sink: sink,
              unique_writer_identity: unique_writer_identity
            }.delete_if { |_, v| v.nil? }
            req = Google::Gax::to_proto(req, Google::Logging::V2::CreateSinkRequest)
            @create_sink.call(req, options)
          end

          # Updates a sink. If the named sink doesn't exist, then this method is
          # identical to
          # [sinks.create](https://cloud.google.com/logging/docs/api/reference/rest/v2/projects.sinks/create).
          # If the named sink does exist, then this method replaces the following
          # fields in the existing sink with values from the new sink: +destination+,
          # +filter+, +output_version_format+, +start_time+, and +end_time+.
          # The updated filter might also have a new +writer_identity+; see the
          # +unique_writer_identity+ field.
          #
          # @param sink_name [String]
          #   Required. The full resource name of the sink to update, including the
          #   parent resource and the sink identifier:
          #
          #       "projects/[PROJECT_ID]/sinks/[SINK_ID]"
          #       "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
          #       "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
          #       "folders/[FOLDER_ID]/sinks/[SINK_ID]"
          #
          #   Example: +"projects/my-project-id/sinks/my-sink-id"+.
          # @param sink [Google::Logging::V2::LogSink | Hash]
          #   Required. The updated sink, whose name is the same identifier that appears
          #   as part of +sink_name+.  If +sink_name+ does not exist, then
          #   this method creates a new sink.
          #   A hash of the same form as `Google::Logging::V2::LogSink`
          #   can also be provided.
          # @param unique_writer_identity [true, false]
          #   Optional. See
          #   [sinks.create](https://cloud.google.com/logging/docs/api/reference/rest/v2/projects.sinks/create)
          #   for a description of this field.  When updating a sink, the effect of this
          #   field on the value of +writer_identity+ in the updated sink depends on both
          #   the old and new values of this field:
          #
          #   * If the old and new values of this field are both false or both true,
          #     then there is no change to the sink's +writer_identity+.
          #   * If the old value is false and the new value is true, then
          #     +writer_identity+ is changed to a unique service account.
          #   * It is an error if the old value is true and the new value is false.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Logging::V2::LogSink]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/logging/v2"
          #
          #   config_service_v2_client = Google::Cloud::Logging::V2::Config.new
          #   formatted_sink_name = Google::Cloud::Logging::V2::ConfigServiceV2Client.sink_path("[PROJECT]", "[SINK]")
          #   sink = {}
          #   response = config_service_v2_client.update_sink(formatted_sink_name, sink)

          def update_sink \
              sink_name,
              sink,
              unique_writer_identity: nil,
              options: nil
            req = {
              sink_name: sink_name,
              sink: sink,
              unique_writer_identity: unique_writer_identity
            }.delete_if { |_, v| v.nil? }
            req = Google::Gax::to_proto(req, Google::Logging::V2::UpdateSinkRequest)
            @update_sink.call(req, options)
          end

          # Deletes a sink. If the sink has a unique +writer_identity+, then that
          # service account is also deleted.
          #
          # @param sink_name [String]
          #   Required. The full resource name of the sink to delete, including the
          #   parent resource and the sink identifier:
          #
          #       "projects/[PROJECT_ID]/sinks/[SINK_ID]"
          #       "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
          #       "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
          #       "folders/[FOLDER_ID]/sinks/[SINK_ID]"
          #
          #   Example: +"projects/my-project-id/sinks/my-sink-id"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/logging/v2"
          #
          #   config_service_v2_client = Google::Cloud::Logging::V2::Config.new
          #   formatted_sink_name = Google::Cloud::Logging::V2::ConfigServiceV2Client.sink_path("[PROJECT]", "[SINK]")
          #   config_service_v2_client.delete_sink(formatted_sink_name)

          def delete_sink \
              sink_name,
              options: nil
            req = {
              sink_name: sink_name
            }.delete_if { |_, v| v.nil? }
            req = Google::Gax::to_proto(req, Google::Logging::V2::DeleteSinkRequest)
            @delete_sink.call(req, options)
            nil
          end
        end
      end
    end
  end
end
