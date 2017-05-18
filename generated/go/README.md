Directory Structure
===================
Most files in this directory are automatically generated from [`toolkit`](https://github.com/googleapis/api-client-staging).
There are placed in the `vendor` directory so that canonical import path is not checked.

`internal` directory
--------------------
Packages in directory `vendor/cloud.google.com/go/internal` are handwritten specifically for this repository.
They replace [similar packages in `google-cloud-go`](https://github.com/GoogleCloudPlatform/google-cloud-go/tree/master/internal)
since internal packages within `google-cloud-go` cannot be imported in this repository.
