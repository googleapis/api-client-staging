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
# https://github.com/googleapis/googleapis/blob/master/google/monitoring/v3/metric_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"
require "google/monitoring/v3/metric_service_pb"

module Google
  module Cloud
    module Monitoring
      module V3
        # Manages metric descriptors, monitored resource descriptors, and
        # time series data.
        #
        # @!attribute [r] metric_service_stub
        #   @return [Google::Monitoring::V3::MetricService::Stub]
        class MetricServiceApi
          attr_reader :metric_service_stub

          # The default address of the service.
          SERVICE_ADDRESS = "monitoring.googleapis.com".freeze

          # The default port of the service.
          DEFAULT_SERVICE_PORT = 443

          CODE_GEN_NAME_VERSION = "gapic/0.1.0".freeze

          DEFAULT_TIMEOUT = 30

          PAGE_DESCRIPTORS = {
            "list_monitored_resource_descriptors" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "resource_descriptors"),
            "list_metric_descriptors" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "metric_descriptors"),
            "list_time_series" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "time_series")
          }.freeze

          private_constant :PAGE_DESCRIPTORS

          # The scopes needed to make gRPC calls to all of the methods defined in
          # this service.
          ALL_SCOPES = [
          ].freeze

          PROJECT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}"
          )

          private_constant :PROJECT_PATH_TEMPLATE

          METRIC_DESCRIPTOR_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}/metricDescriptors/{metric_descriptor=**}"
          )

          private_constant :METRIC_DESCRIPTOR_PATH_TEMPLATE

          MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}/monitoredResourceDescriptors/{monitored_resource_descriptor}"
          )

          private_constant :MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE

          # Returns a fully-qualified project resource name string.
          # @param project [String]
          # @return [String]
          def self.project_path project
            PROJECT_PATH_TEMPLATE.render(
              :"project" => project
            )
          end

          # Returns a fully-qualified metric_descriptor resource name string.
          # @param project [String]
          # @param metric_descriptor [String]
          # @return [String]
          def self.metric_descriptor_path project, metric_descriptor
            METRIC_DESCRIPTOR_PATH_TEMPLATE.render(
              :"project" => project,
              :"metric_descriptor" => metric_descriptor
            )
          end

          # Returns a fully-qualified monitored_resource_descriptor resource name string.
          # @param project [String]
          # @param monitored_resource_descriptor [String]
          # @return [String]
          def self.monitored_resource_descriptor_path project, monitored_resource_descriptor
            MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.render(
              :"project" => project,
              :"monitored_resource_descriptor" => monitored_resource_descriptor
            )
          end

          # Parses the project from a project resource.
          # @param project_name [String]
          # @return [String]
          def self.match_project_from_project_name project_name
            PROJECT_PATH_TEMPLATE.match(project_name)["project"]
          end

          # Parses the project from a metric_descriptor resource.
          # @param metric_descriptor_name [String]
          # @return [String]
          def self.match_project_from_metric_descriptor_name metric_descriptor_name
            METRIC_DESCRIPTOR_PATH_TEMPLATE.match(metric_descriptor_name)["project"]
          end

          # Parses the metric_descriptor from a metric_descriptor resource.
          # @param metric_descriptor_name [String]
          # @return [String]
          def self.match_metric_descriptor_from_metric_descriptor_name metric_descriptor_name
            METRIC_DESCRIPTOR_PATH_TEMPLATE.match(metric_descriptor_name)["metric_descriptor"]
          end

          # Parses the project from a monitored_resource_descriptor resource.
          # @param monitored_resource_descriptor_name [String]
          # @return [String]
          def self.match_project_from_monitored_resource_descriptor_name monitored_resource_descriptor_name
            MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.match(monitored_resource_descriptor_name)["project"]
          end

          # Parses the monitored_resource_descriptor from a monitored_resource_descriptor resource.
          # @param monitored_resource_descriptor_name [String]
          # @return [String]
          def self.match_monitored_resource_descriptor_from_monitored_resource_descriptor_name monitored_resource_descriptor_name
            MONITORED_RESOURCE_DESCRIPTOR_PATH_TEMPLATE.match(monitored_resource_descriptor_name)["monitored_resource_descriptor"]
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
            require "google/monitoring/v3/metric_service_services_pb"

            google_api_client = "#{app_name}/#{app_version} " \
              "#{CODE_GEN_NAME_VERSION} gax/#{Google::Gax::VERSION} " \
              "ruby/#{RUBY_VERSION}".freeze
            headers = { :"x-goog-api-client" => google_api_client }
            client_config_file = Pathname.new(__dir__).join(
              "metric_service_client_config.json"
            )
            defaults = client_config_file.open do |f|
              Google::Gax.construct_settings(
                "google.monitoring.v3.MetricService",
                JSON.parse(f.read),
                client_config,
                Google::Gax::Grpc::STATUS_CODE_NAMES,
                timeout,
                page_descriptors: PAGE_DESCRIPTORS,
                errors: Google::Gax::Grpc::API_ERRORS,
                kwargs: headers
              )
            end
            @metric_service_stub = Google::Gax::Grpc.create_stub(
              service_path,
              port,
              chan_creds: chan_creds,
              channel: channel,
              scopes: scopes,
              &Google::Monitoring::V3::MetricService::Stub.method(:new)
            )

            @list_monitored_resource_descriptors = Google::Gax.create_api_call(
              @metric_service_stub.method(:list_monitored_resource_descriptors),
              defaults["list_monitored_resource_descriptors"]
            )
            @get_monitored_resource_descriptor = Google::Gax.create_api_call(
              @metric_service_stub.method(:get_monitored_resource_descriptor),
              defaults["get_monitored_resource_descriptor"]
            )
            @list_metric_descriptors = Google::Gax.create_api_call(
              @metric_service_stub.method(:list_metric_descriptors),
              defaults["list_metric_descriptors"]
            )
            @get_metric_descriptor = Google::Gax.create_api_call(
              @metric_service_stub.method(:get_metric_descriptor),
              defaults["get_metric_descriptor"]
            )
            @create_metric_descriptor = Google::Gax.create_api_call(
              @metric_service_stub.method(:create_metric_descriptor),
              defaults["create_metric_descriptor"]
            )
            @delete_metric_descriptor = Google::Gax.create_api_call(
              @metric_service_stub.method(:delete_metric_descriptor),
              defaults["delete_metric_descriptor"]
            )
            @list_time_series = Google::Gax.create_api_call(
              @metric_service_stub.method(:list_time_series),
              defaults["list_time_series"]
            )
            @create_time_series = Google::Gax.create_api_call(
              @metric_service_stub.method(:create_time_series),
              defaults["create_time_series"]
            )
          end

          # Service calls

          # Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
          #
          # @param name [String]
          #   The project on which to execute the request. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param filter [String]
          #   An optional {filter}[https://cloud.google.com/monitoring/api/v3/filters] describing
          #   the descriptors to be returned.  The filter can reference
          #   the descriptor's type and labels. For example, the
          #   following filter returns only Google Compute Engine descriptors
          #   that have an +id+ label:
          #
          #       resource.type = starts_with("gce_") AND resource.label:id
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Api::MonitoredResourceDescriptor>]
          #   An enumerable of Google::Api::MonitoredResourceDescriptor instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.project_path("[PROJECT]")
          #
          #   # Iterate over all results.
          #   metric_service_api.list_monitored_resource_descriptors(formatted_name).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   metric_service_api.list_monitored_resource_descriptors(formatted_name).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_monitored_resource_descriptors \
              name,
              filter: nil,
              page_size: nil,
              options: nil
            req = Google::Monitoring::V3::ListMonitoredResourceDescriptorsRequest.new(
              name: name
            )
            req.filter = filter unless filter.nil?
            req.page_size = page_size unless page_size.nil?
            @list_monitored_resource_descriptors.call(req, options)
          end

          # Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
          #
          # @param name [String]
          #   The monitored resource descriptor to get.  The format is
          #   +"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}"+.
          #   The +{resource_type}+ is a predefined type, such as
          #   +cloudsql_database+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Api::MonitoredResourceDescriptor]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.monitored_resource_descriptor_path("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")
          #   response = metric_service_api.get_monitored_resource_descriptor(formatted_name)

          def get_monitored_resource_descriptor \
              name,
              options: nil
            req = Google::Monitoring::V3::GetMonitoredResourceDescriptorRequest.new(
              name: name
            )
            @get_monitored_resource_descriptor.call(req, options)
          end

          # Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
          #
          # @param name [String]
          #   The project on which to execute the request. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param filter [String]
          #   If this field is empty, all custom and
          #   system-defined metric descriptors are returned.
          #   Otherwise, the {filter}[https://cloud.google.com/monitoring/api/v3/filters]
          #   specifies which metric descriptors are to be
          #   returned. For example, the following filter matches all
          #   {custom metrics}[https://cloud.google.com/monitoring/custom-metrics]:
          #
          #       metric.type = starts_with("custom.googleapis.com/")
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Api::MetricDescriptor>]
          #   An enumerable of Google::Api::MetricDescriptor instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.project_path("[PROJECT]")
          #
          #   # Iterate over all results.
          #   metric_service_api.list_metric_descriptors(formatted_name).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   metric_service_api.list_metric_descriptors(formatted_name).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_metric_descriptors \
              name,
              filter: nil,
              page_size: nil,
              options: nil
            req = Google::Monitoring::V3::ListMetricDescriptorsRequest.new(
              name: name
            )
            req.filter = filter unless filter.nil?
            req.page_size = page_size unless page_size.nil?
            @list_metric_descriptors.call(req, options)
          end

          # Gets a single metric descriptor. This method does not require a Stackdriver account.
          #
          # @param name [String]
          #   The metric descriptor on which to execute the request. The format is
          #   +"projects/{project_id_or_number}/metricDescriptors/{metric_id}"+.
          #   An example value of +{metric_id}+ is
          #   +"compute.googleapis.com/instance/disk/read_bytes_count"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Api::MetricDescriptor]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")
          #   response = metric_service_api.get_metric_descriptor(formatted_name)

          def get_metric_descriptor \
              name,
              options: nil
            req = Google::Monitoring::V3::GetMetricDescriptorRequest.new(
              name: name
            )
            @get_metric_descriptor.call(req, options)
          end

          # Creates a new metric descriptor.
          # User-created metric descriptors define
          # {custom metrics}[https://cloud.google.com/monitoring/custom-metrics].
          #
          # @param name [String]
          #   The project on which to execute the request. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param metric_descriptor [Google::Api::MetricDescriptor]
          #   The new {custom metric}[https://cloud.google.com/monitoring/custom-metrics]
          #   descriptor.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Api::MetricDescriptor]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricDescriptor = Google::Api::MetricDescriptor
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.project_path("[PROJECT]")
          #   metric_descriptor = MetricDescriptor.new
          #   response = metric_service_api.create_metric_descriptor(formatted_name, metric_descriptor)

          def create_metric_descriptor \
              name,
              metric_descriptor,
              options: nil
            req = Google::Monitoring::V3::CreateMetricDescriptorRequest.new(
              name: name,
              metric_descriptor: metric_descriptor
            )
            @create_metric_descriptor.call(req, options)
          end

          # Deletes a metric descriptor. Only user-created
          # {custom metrics}[https://cloud.google.com/monitoring/custom-metrics] can be deleted.
          #
          # @param name [String]
          #   The metric descriptor on which to execute the request. The format is
          #   +"projects/{project_id_or_number}/metricDescriptors/{metric_id}"+.
          #   An example of +{metric_id}+ is:
          #   +"custom.googleapis.com/my_test_metric"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.metric_descriptor_path("[PROJECT]", "[METRIC_DESCRIPTOR]")
          #   metric_service_api.delete_metric_descriptor(formatted_name)

          def delete_metric_descriptor \
              name,
              options: nil
            req = Google::Monitoring::V3::DeleteMetricDescriptorRequest.new(
              name: name
            )
            @delete_metric_descriptor.call(req, options)
          end

          # Lists time series that match a filter. This method does not require a Stackdriver account.
          #
          # @param name [String]
          #   The project on which to execute the request. The format is
          #   "projects/{project_id_or_number}".
          # @param filter [String]
          #   A {monitoring filter}[https://cloud.google.com/monitoring/api/v3/filters] that specifies which time
          #   series should be returned.  The filter must specify a single metric type,
          #   and can additionally specify metric labels and other information. For
          #   example:
          #
          #       metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
          #           metric.label.instance_name = "my-instance-name"
          # @param interval [Google::Monitoring::V3::TimeInterval]
          #   The time interval for which results should be returned. Only time series
          #   that contain data points in the specified interval are included
          #   in the response.
          # @param aggregation [Google::Monitoring::V3::Aggregation]
          #   By default, the raw time series data is returned.
          #   Use this field to combine multiple time series for different
          #   views of the data.
          # @param order_by [String]
          #   Specifies the order in which the points of the time series should
          #   be returned.  By default, results are not ordered.  Currently,
          #   this field must be left blank.
          # @param view [Google::Monitoring::V3::ListTimeSeriesRequest::TimeSeriesView]
          #   Specifies which information is returned about the time series.
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Monitoring::V3::TimeSeries>]
          #   An enumerable of Google::Monitoring::V3::TimeSeries instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #   TimeInterval = Google::Monitoring::V3::TimeInterval
          #   TimeSeriesView = Google::Monitoring::V3::ListTimeSeriesRequest::TimeSeriesView
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.project_path("[PROJECT]")
          #   filter = ''
          #   interval = TimeInterval.new
          #   view = TimeSeriesView::FULL
          #
          #   # Iterate over all results.
          #   metric_service_api.list_time_series(formatted_name, filter, interval, view).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   metric_service_api.list_time_series(formatted_name, filter, interval, view).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_time_series \
              name,
              filter,
              interval,
              view,
              aggregation: nil,
              order_by: nil,
              page_size: nil,
              options: nil
            req = Google::Monitoring::V3::ListTimeSeriesRequest.new(
              name: name,
              filter: filter,
              interval: interval,
              view: view
            )
            req.aggregation = aggregation unless aggregation.nil?
            req.order_by = order_by unless order_by.nil?
            req.page_size = page_size unless page_size.nil?
            @list_time_series.call(req, options)
          end

          # Creates or adds data to one or more time series.
          # The response is empty if all time series in the request were written.
          # If any time series could not be written, a corresponding failure message is
          # included in the error response.
          #
          # @param name [String]
          #   The project on which to execute the request. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param time_series [Array<Google::Monitoring::V3::TimeSeries>]
          #   The new data to be added to a list of time series.
          #   Adds at most one data point to each of several time series.  The new data
          #   point must be more recent than any other point in its time series.  Each
          #   +TimeSeries+ value must fully specify a unique time series by supplying
          #   all label values for the metric and the monitored resource.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/metric_service_api"
          #
          #   MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
          #
          #   metric_service_api = MetricServiceApi.new
          #   formatted_name = MetricServiceApi.project_path("[PROJECT]")
          #   time_series = []
          #   metric_service_api.create_time_series(formatted_name, time_series)

          def create_time_series \
              name,
              time_series,
              options: nil
            req = Google::Monitoring::V3::CreateTimeSeriesRequest.new(
              name: name,
              time_series: time_series
            )
            @create_time_series.call(req, options)
          end
        end
      end
    end
  end
end
