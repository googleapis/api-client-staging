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
# Integration tests for vkit generated client library for
# Stackdriver Monitoring APIs.
#
require "google/cloud/monitoring/v3"

if ARGV.empty?
  puts "Usage: #{$0} <project_id>"
  exit
end

PROJECT_NAME = ARGV[0].freeze

#
# Integration test for GroupServiceApi.create_group
#
GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
group_service_api = GroupServiceApi.new
Group = Google::Monitoring::V3::Group
group = Group.new(
  display_name: "displayName",
  filter: "resource.type = gce_instance")

formatted_project_name = GroupServiceApi.project_path(PROJECT_NAME)
created_group = group_service_api.create_group(formatted_project_name, group)
puts "New group created: #{created_group.name}"

#
# Integration test for GroupServiceApi.update_group
#
group_to_update = Group.new(
  name: created_group.name,
  display_name: "displayNameUpdate",
  filter: "resource.type = gce_instance"
)
updated_group = group_service_api.update_group(group_to_update)
puts "Group updated: #{updated_group.display_name}"

#
# Integration test for GroupServiceApi.get_group
#
group_id = GroupServiceApi.match_group_from_group_name(created_group.name)
formatted_group_name = GroupServiceApi.group_path(PROJECT_NAME, group_id)
fetched_group = group_service_api.get_group(formatted_group_name)
puts "Group fetched: #{fetched_group.name}"

#
# Integration test for GroupServiceApi.list_groups
#
group_service_api.list_groups(formatted_project_name).each do |group|
  puts "Listed group: #{group.name}"
end

#
# Integration test for GroupServiceApi.list_group_members
#
group_service_api.list_group_members(formatted_group_name).each do |member|
  puts "Listed group member: #{member.type}"
end

#
# Integration test for GroupServiceApi.delete_group
#
group_service_api.delete_group(formatted_group_name)
puts "Group deleted: #{formatted_group_name}"

#
# Integration test for MetricServiceApi.create_metric_descriptor
#
METRIC_ID = "custom.googleapis.com/instance/cpu/usage_time".freeze
MetricServiceApi = Google::Cloud::Monitoring::V3::MetricServiceApi
metric_service_api = MetricServiceApi.new
MetricDescriptor = Google::Api::MetricDescriptor

formatted_project_name = MetricServiceApi.project_path(PROJECT_NAME)
metric_descriptor = MetricDescriptor.new(
  type: METRIC_ID,
  metric_kind: :GAUGE,
  value_type: :BOOL
)

created_metric_descriptor = metric_service_api.create_metric_descriptor(
  formatted_project_name,
  metric_descriptor
)
puts "Metric descriptor created: #{created_metric_descriptor.name}"

#
# Integration test for MetricServiceApi.get_metric_descriptor
#
formatted_metric_descriptor_name = MetricServiceApi.metric_descriptor_path_path(
  PROJECT_NAME, METRIC_ID)
fetched_metric_descriptor = metric_service_api.get_metric_descriptor(
  formatted_metric_descriptor_name)
puts "Fetched metric descriptor #{fetched_metric_descriptor.name}"

#
# Integration test for MetricServiceApi.list_metric_descriptors
#
metric_service_api.list_metric_descriptors(
  formatted_project_name).each do |metric_descriptor|
  puts "Listed metric_descriptor: #{metric_descriptor.name}"
end

#
# Integration test for MetricServiceApi.delete_metric_descriptor
#
metric_service_api.delete_metric_descriptor(formatted_metric_descriptor_name)
puts "Metric descriptor deleted: #{formatted_metric_descriptor_name}"

#
# Integration test for MetricServiceApi.create_time_series
#
formatted_project_name = MetricServiceApi.project_path(PROJECT_NAME)
Metric = Google::Api::Metric
metric = Metric.new(type: METRIC_ID)
Common = Google::Monitoring::V3
time_interval = Common::TimeInterval.new(
  end_time: Google::Protobuf::Timestamp.new(seconds: Time.now.to_i - 1000)
)
typed_value = Common::TypedValue.new(bool_value: true)
point = Common::Point.new(
  interval: time_interval,
  value: typed_value
)
time = Common::TimeSeries.new(
  metric: metric,
  points: [point]
)
time_series = [time]
metric_service_api.create_time_series(formatted_project_name, time_series)
puts "TimeSeries created"

#
# Integration test for MetricServiceApi.list_time_series
#
FILTER = 'metric.type = "custom.googleapis.com/instance/cpu/usage_time"'
view = Common::ListTimeSeriesRequest::TimeSeriesView::FULL
metric_service_api.list_time_series(
  formatted_project_name, FILTER, time_interval, view).each do |time_series|
    puts "Listed time series: #{time_series.resource.type}"
end

#
# Integration test for MetricServiceApi.list_monitored_resource_descriptors
#
metric_service_api.list_monitored_resource_descriptors(
  formatted_project_name).each do |monitored_resource_descriptor|
    puts "Listed monitored_resource_descriptor: #{monitored_resource_descriptor.name}"
end

#
# Integration test for MetricServiceApi.get_monitored_resource_descriptor
#
formatted_monitored_resource_descriptor_name =
  MetricServiceApi.monitored_resource_descriptor_path(PROJECT_NAME, "uptime_url")
monitored_resource_descriptor = metric_service_api.get_monitored_resource_descriptor(
  formatted_monitored_resource_descriptor_name)
puts "Get monitored resource descriptor: #{monitored_resource_descriptor.name}"


