# Ruby Client for Stackdriver Trace API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))

[Stackdriver Trace API][Product Documentation]: Send and retrieve trace data from Stackdriver Trace. Data is generated and available by default for all App Engine applications. Data from other applications can be written to Stackdriver Trace for display, reporting, and analysis.

- [Client Library Documentation][]
- [Product Documentation][]

## Quick Start
In order to use this library, you first need to go through the following steps:

1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
2. [Enable the Stackdriver Trace API.](https://console.cloud.google.com/apis/api/trace)
3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)

### Installation
```
$ gem install google-cloud-trace
```

### Preview
#### TraceServiceClient
```rb
require "google/cloud/trace"

trace_service_client = Google::Cloud::Trace.new
project_id_2 = project_id

# Iterate over all results.
trace_service_client.list_traces(project_id_2).each do |element|
  # Process element.
end

# Or iterate over results one page at a time.
trace_service_client.list_traces(project_id_2).each_page do |page|
  # Process each page at a time.
  page.each do |element|
    # Process element.
  end
end
```

### Next Steps
- Read the [Client Library Documentation][] for Stackdriver Trace API to see other available methods on the client.
- Read the [Stackdriver Trace API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
- View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.

[Client Library Documentation]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-trace/latest/google/devtools/cloudtrace/v1
[Product Documentation]: https://cloud.google.com/trace