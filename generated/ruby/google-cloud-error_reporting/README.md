# Ruby Client for Stackdriver Error Reporting API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))

[Stackdriver Error Reporting API][Product Documentation]: 
Stackdriver Error Reporting groups and counts similar errors from cloud services. The Stackdriver Error Reporting API provides a way to report new errors and read access to error groups and their associated errors.
- [Client Library Documentation][]
- [Product Documentation][]

## Quick Start
In order to use this library, you first need to go through the following steps:

1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
2. [Enable the Stackdriver Error Reporting API.](https://console.cloud.google.com/apis/api/error-reporting)
3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)

### Installation
```
$ gem install google-cloud-error_reporting
```

### Preview
#### ReportErrorsServiceClient
```rb
require "google/cloud/error_reporting"

report_errors_service_client = Google::Cloud::ErrorReporting::ReportErrors.new
formatted_project_name = Google::Cloud::ErrorReporting::V1beta1::ReportErrorsServiceClient.project_path(project_id)
message = "[MESSAGE]"
service = "[SERVICE]"
service_context = { service: service }
file_path = "path/to/file.lang"
line_number = 42
function_name = "meaningOfLife"
report_location = {
  file_path: file_path,
  line_number: line_number,
  function_name: function_name
}
context = { report_location: report_location }
event = {
  message: message,
  service_context: service_context,
  context: context
}
response = report_errors_service_client.report_error_event(formatted_project_name, event)
```

### Next Steps
- Read the [Client Library Documentation][] for Stackdriver Error Reporting API to see other available methods on the client.
- Read the [Stackdriver Error Reporting API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
- View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.

[Client Library Documentation]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-error_reporting/latest/google/devtools/clouderrorreporting/v1beta1
[Product Documentation]: https://cloud.google.com/error-reporting