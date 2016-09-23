#
# Integration tests for vkit generated client library for Google Cloud ErrorReporting APIs.
#

PROJECT_NAME = "gapic-test".freeze
SERVICE = "default".freeze
VERSION = "20160920t135819".freeze
USER_NAME = "testuser".freeze
#
# Integration test for ReportErrorsServiceApi.report_error_event
#
# Report first two error events (to be one group) and third event (to be another group)
require "google/cloud/error_reporting/v1beta1/report_errors_service_api"
require "google/devtools/clouderrorreporting/v1beta1/report_errors_service_pb"
ReportErrorsServiceApi = Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceApi
ReportedErrorEvent = Google::Devtools::Clouderrorreporting::V1beta1::ReportedErrorEvent
ServiceContext = Google::Devtools::Clouderrorreporting::V1beta1::ServiceContext
ErrorContext = Google::Devtools::Clouderrorreporting::V1beta1::ErrorContext
HttpRequestContext = Google::Devtools::Clouderrorreporting::V1beta1::HttpRequestContext
SourceLocation = Google::Devtools::Clouderrorreporting::V1beta1::SourceLocation

report_errors_service_api = ReportErrorsServiceApi.new
formatted_project_name = ReportErrorsServiceApi.project_path(PROJECT_NAME)
http_request_context = HttpRequestContext.new(method: "GET", url: "https://20160920t135819-dot-gapic-test.appspot.com")
source_location1 = SourceLocation.new(file_path: "foo/bar", line_number: 20, function_name: "doGet")
source_location2 = SourceLocation.new(file_path: "foo/bar", line_number: 30, function_name: "doSet")
p "Reporting error event 1"
event1 = ReportedErrorEvent.new
event1.service_context = ServiceContext.new(service: SERVICE, version: VERSION)
event1.message = "error reporting test event1"
event1.context = ErrorContext.new(http_request: http_request_context, user: USER_NAME, report_location: source_location1)
report_errors_service_api.report_error_event(formatted_project_name, event1)
p "Reporting error event 2"
event2 = ReportedErrorEvent.new
event2.service_context = ServiceContext.new(service: SERVICE, version: VERSION)
event2.message = "error reporting test event2"
event2.context = ErrorContext.new(http_request: http_request_context, user: USER_NAME, report_location: source_location1)
report_errors_service_api.report_error_event(formatted_project_name, event2)
p "Reporting error event 3"
event3 = ReportedErrorEvent.new
event3.service_context = ServiceContext.new(service: SERVICE, version: VERSION)
event3.message = "error reporting test event3"
event3.context = ErrorContext.new(http_request: http_request_context, user: USER_NAME, report_location: source_location2)
report_errors_service_api.report_error_event(formatted_project_name, event3)

#
# Integration test for ErrorStatsServiceApi.list_group_stats, ErrorStatsServiceApi.list_events
#
require "google/cloud/error_reporting/v1beta1/error_stats_service_api"
require "google/devtools/clouderrorreporting/v1beta1/error_stats_service_pb"
ErrorStatsServiceApi = Google::Cloud::ErrorReporting::V1beta1::ErrorStatsServiceApi
QueryTimeRange = Google::Devtools::Clouderrorreporting::V1beta1::QueryTimeRange

p "Listing all the error groups"
error_stats_service_api = ErrorStatsServiceApi.new
formatted_project_name = ErrorStatsServiceApi.project_path(PROJECT_NAME)
time_range = QueryTimeRange.new(period: :PERIOD_1_DAY)
error_group_id = 0
error_stats_service_api.list_group_stats(formatted_project_name, time_range).each_with_index do |error_group_stat, index|
  p [error_group_stat.group.name, error_group_stat.group.group_id, error_group_stat.count].join(" ")
  error_group_id = error_group_stat.group.group_id if index == 0
end

p "Listing all the error events for error group " + error_group_id
error_stats_service_api.list_events(formatted_project_name, error_group_id, time_range: time_range).each do |error_event|
  p [error_event.message, error_event.service_context.service, error_event.service_context.version].join(" ")
  p [error_event.context.user].join(" ")
  p [error_event.context.http_request['method'], error_event.context.http_request.url].join(" ")
  p [error_event.context.report_location.file_path, error_event.context.report_location.line_number,
     error_event.context.report_location.function_name].join(" ")
end

#
# Integration test for ErrorGroupServiceApi.get_group and ErrorGroupServiceApi.update_group
#
require "google/cloud/error_reporting/v1beta1/error_group_service_api"
require "google/devtools/clouderrorreporting/v1beta1/error_group_service_pb"
ErrorGroupServiceApi = Google::Cloud::ErrorReporting::V1beta1::ErrorGroupServiceApi
ErrorGroup = Google::Devtools::Clouderrorreporting::V1beta1::ErrorGroup
TrackingIssue = Google::Devtools::Clouderrorreporting::V1beta1::TrackingIssue
error_group_service_api = ErrorGroupServiceApi.new
formatted_group_name = ErrorGroupServiceApi.group_path(PROJECT_NAME, error_group_id)

p "Getting error group " + formatted_group_name
response = error_group_service_api.get_group(formatted_group_name)
p [response.name, response.group_id].join(" ")
p "Associated issues"
response.tracking_issues.each {|issue| p issue.url}

p "Updating error group " + formatted_group_name
issues = [TrackingIssue.new(url: "https://github.com/testuser/project/issues/update1")]
error_group = ErrorGroup.new(name: formatted_group_name, group_id: error_group_id, tracking_issues: issues)
response = error_group_service_api.update_group(error_group)
p "Update failed" if response != error_group

#
# Integration test for ErrorStatsServiceApi.delete_events
#
p "Deleting all the events in project " + PROJECT_NAME
formatted_project_name = ErrorStatsServiceApi.project_path(PROJECT_NAME)
error_stats_service_api.delete_events(formatted_project_name)
