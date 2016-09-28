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
# Stackdriver ErrorReporting APIs.
#
require "google/cloud/error_reporting/v1beta1"

if ARGV.length != 3
  puts "Usage: #{$0} <project_id> <service> <version>"
  exit
end

PROJECT_NAME = ARGV[0].freeze
SERVICE = ARGV[1].freeze
VERSION = ARGV[2].freeze
USER_NAME = "testuser".freeze

#
# Integration test for ReportErrorsServiceApi.report_error_event
#
# Report first two error events (to be one group) and third event (to be another group)
ReportErrorsServiceApi =
  Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceApi
report_errors_service_api = ReportErrorsServiceApi.new
Grpc = Google::Devtools::Clouderrorreporting::V1beta1
ReportedErrorEvent = Grpc::ReportedErrorEvent
ServiceContext = Grpc::ServiceContext
ErrorContext = Grpc::ErrorContext
HttpRequestContext = Grpc::HttpRequestContext
SourceLocation = Grpc::SourceLocation


formatted_project_name = ReportErrorsServiceApi.project_path(PROJECT_NAME)
http_request_context = HttpRequestContext.new(
  method: "GET",
  url: "https://example.com")
source_location1 = SourceLocation.new(
  file_path: "foo/bar",
  line_number: 20,
  function_name: "doGet")
source_location2 = SourceLocation.new(
  file_path: "foo/bar",
  line_number: 30,
  function_name: "doSet")
puts "Reporting error event 1"
event1 = ReportedErrorEvent.new
event1.service_context = ServiceContext.new(
  service: SERVICE,
  version: VERSION)
event1.message = "error reporting test event1"
event1.context = ErrorContext.new(
  http_request: http_request_context,
  user: USER_NAME,
  report_location: source_location1)
report_errors_service_api.report_error_event(formatted_project_name, event1)
puts "Reporting error event 2"
event2 = ReportedErrorEvent.new
event2.service_context = ServiceContext.new(
  service: SERVICE,
  version: VERSION)
event2.message = "error reporting test event2"
event2.context = ErrorContext.new(
  http_request: http_request_context,
  user: USER_NAME,
  report_location: source_location1)
report_errors_service_api.report_error_event(formatted_project_name, event2)
puts "Reporting error event 3"
event3 = ReportedErrorEvent.new
event3.service_context = ServiceContext.new(
  service: SERVICE,
  version: VERSION)
event3.message = "error reporting test event3"
event3.context = ErrorContext.new(
  http_request: http_request_context,
  user: USER_NAME,
  report_location: source_location2)
report_errors_service_api.report_error_event(formatted_project_name, event3)

#
# Integration test for ErrorStatsServiceApi.list_group_stats and
#                      ErrorStatsServiceApi.list_events
#
ErrorStatsServiceApi =
  Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceApi
error_stats_service_api = ErrorStatsServiceApi.new
Grpc = Google::Devtools::Clouderrorreporting::V1beta1
QueryTimeRange = Grpc::QueryTimeRange

puts "Listing all the error groups"
formatted_project_name = ErrorStatsServiceApi.project_path(PROJECT_NAME)
time_range = QueryTimeRange.new(period: :PERIOD_1_DAY)
error_group_id = 0
error_stats_service_api.list_group_stats(formatted_project_name, time_range)
  .each_with_index do |error_group_stat, index|
    puts [error_group_stat.group.name,
          error_group_stat.group.group_id,
          error_group_stat.count].join(" ")
    error_group_id = error_group_stat.group.group_id if index == 0
end

puts "Listing all the error events for error group #{error_group_id}"
error_stats_service_api.list_events(
  formatted_project_name,
  error_group_id,
  time_range: time_range).each do |error_event|
    puts [error_event.message,
          error_event.service_context.service,
          error_event.service_context.version].join(" ")
    puts [error_event.context.user].join(" ")
    puts [error_event.context.http_request['method'],
          error_event.context.http_request.url].join(" ")
    puts [error_event.context.report_location.file_path,
          error_event.context.report_location.line_number,
          error_event.context.report_location.function_name].join(" ")
end

#
# Integration test for ErrorGroupServiceApi.get_group and
#                      ErrorGroupServiceApi.update_group
#
ErrorGroupServiceApi =
  Google::Cloud::ErrorReporting::V1beta1::ErrorGroupServiceApi
error_group_service_api = ErrorGroupServiceApi.new
Grpc = Google::Devtools::Clouderrorreporting::V1beta1
ErrorGroup = Grpc::ErrorGroup
TrackingIssue = Grpc::TrackingIssue

formatted_group_name = ErrorGroupServiceApi.group_path(
  PROJECT_NAME,
  error_group_id)

puts "Getting error group #{formatted_group_name}"
response = error_group_service_api.get_group(formatted_group_name)
puts [response.name, response.group_id].join(" ")
puts "Associated issues"
response.tracking_issues.each {|issue| puts issue.url}

puts "Updating error group  #{formatted_group_name}"
issues = [TrackingIssue.new(
  url: "https://github.com/testuser/project/issues/update1")]
error_group = ErrorGroup.new(
  name: formatted_group_name,
  group_id: error_group_id,
  tracking_issues: issues)
response = error_group_service_api.update_group(error_group)
puts "Update failed" unless response == error_group

#
# Integration test for ErrorStatsServiceApi.delete_events
#
puts "Deleting all the events in project " + PROJECT_NAME
formatted_project_name = ErrorStatsServiceApi.project_path(PROJECT_NAME)
error_stats_service_api.delete_events(formatted_project_name)
