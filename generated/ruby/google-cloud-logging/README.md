# Ruby Client for Stackdriver Logging API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))

[Stackdriver Logging API][Product Documentation]: The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics.
- [Client Library Documentation][]
- [Product Documentation][]

## Quick Start
In order to use this library, you first need to go through the following steps:

1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
2. [Enable the Stackdriver Logging API.](https://console.cloud.google.com/apis/api/logging)
3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)

### Installation
```
$ gem install google-cloud-logging
```

### Preview
#### LoggingServiceV2Client
```rb
require "google/cloud/logging"

logging_service_v2_client = Google::Cloud::Logging::Logging.new
formatted_log_name = Google::Cloud::Logging::V2::LoggingServiceV2Client.log_path(project_id, "test-" + Time.new.to_i.to_s)
resource = {}
labels = {}
entries = []
response = logging_service_v2_client.write_log_entries(formatted_log_name, resource, labels, entries)
```

### Next Steps
- Read the [Client Library Documentation][] for Stackdriver Logging API to see other available methods on the client.
- Read the [Stackdriver Logging API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
- View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.

[Client Library Documentation]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-logging/latest/google/logging/v2
[Product Documentation]: https://cloud.google.com/logging