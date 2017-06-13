# Node.js Clients for Google Cloud Pub/Sub API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-node#versioning))

[Google Cloud Pub/Sub API][Product Documentation]: Provides reliable, many-to-many, asynchronous messaging between applications.

- [Client Library Documentation][]
- [Product Documentation][]

## Quick Start
In order to use this library, you first need to go through the following steps:

1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
2. [Enable the Google Cloud Pub/Sub API.](https://console.cloud.google.com/apis/api/pubsub)
3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-node/#/docs/google-cloud/master/guides/authentication)

### Installation
```
$ npm install --save @google-cloud/pubsub
```

### Preview
#### PublisherClient
```js
 var pubsubV1 = require('@google-cloud/pubsub').v1({
   // optional auth parameters.
 });

 var client = pubsubV1.publisherClient();
 var formattedProject = client.projectPath(projectId);
 // Iterate over all elements.
 client.listTopics({project: formattedProject}).then(function(responses) {
     var resources = responses[0];
     for (var i = 0; i < resources.length; ++i) {
         // doThingsWith(resources[i])
     }
 }).catch(function(err) {
     console.error(err);
 });

 // Or obtain the paged response.
 var options = {autoPaginate: false};
 function callback(responses) {
     // The actual resources in a response.
     var resources = responses[0];
     // The next request if the response shows there's more responses.
     var nextRequest = responses[1];
     // The actual response object, if necessary.
     // var rawResponse = responses[2];
     for (var i = 0; i < resources.length; ++i) {
         // doThingsWith(resources[i]);
     }
     if (nextRequest) {
         // Fetch the next page.
         return client.listTopics(nextRequest, options).then(callback);
     }
 }
 client.listTopics({project: formattedProject}, options)
     .then(callback)
     .catch(function(err) {
         console.error(err);
     });
```

### Next Steps
- Read the [Client Library Documentation][] for Google Cloud Pub/Sub API to see other available methods on the client.
- Read the [Google Cloud Pub/Sub API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
- View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-node/blob/master/README.md) to see the full list of Cloud APIs that we cover.

[Client Library Documentation]: https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub
[Product Documentation]: https://cloud.google.com/pubsub