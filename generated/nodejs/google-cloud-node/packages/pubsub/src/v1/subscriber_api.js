/*
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * EDITING INSTRUCTIONS
 * This file was generated from the file
 * https://github.com/googleapis/googleapis/blob/master/google/pubsub/v1/pubsub.proto,
 * and updates to that file get reflected here through a refresh process.
 * For the short term, the refresh process will only be runnable by Google
 * engineers.
 *
 * The only allowed edits are to method and file documentation. A 3-way
 * merge preserves those additions if the generated source changes.
 */
/* TODO: introduce line-wrapping so that it never exceeds the limit. */
/* jscs: disable maximumLineLength */
'use strict';

var configData = require('./subscriber_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'pubsub.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';


var PAGE_DESCRIPTORS = {
  listSubscriptions: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'subscriptions')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform',
  'https://www.googleapis.com/auth/pubsub'
];

/**
 * The service that an application uses to manipulate subscriptions and to
 * consume messages from a subscription via the `Pull` method.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link subscriberApi}
 *
 * @example
 * var pubsubV1 = require('@google-cloud/pubsub').v1({
 *   // optional auth parameters.
 * });
 * var api = pubsubV1.subscriberApi();
 *
 * @class
 */
function SubscriberApi(gaxGrpc, grpcClients, opts) {
  opts = opts || {};
  var servicePath = opts.servicePath || SERVICE_ADDRESS;
  var port = opts.port || DEFAULT_SERVICE_PORT;
  var sslCreds = opts.sslCreds || null;
  var clientConfig = opts.clientConfig || {};
  var appName = opts.appName || 'gax';
  var appVersion = opts.appVersion || gax.version;

  var googleApiClient = [
    appName + '/' + appVersion,
    CODE_GEN_NAME_VERSION,
    'gax/' + gax.version,
    'nodejs/' + process.version].join(' ');

  var defaults = gaxGrpc.constructSettings(
      'google.pubsub.v1.Subscriber',
      configData,
      clientConfig,
      PAGE_DESCRIPTORS,
      null,
      {'x-goog-api-client': googleApiClient});

  var iamPolicyStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.iamPolicyClient.google.iam.v1.IAMPolicy,
      {sslCreds: sslCreds});
  var iamPolicyStubMethods = [
    'setIamPolicy',
    'getIamPolicy',
    'testIamPermissions'
  ];
  iamPolicyStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      iamPolicyStub.then(function(iamPolicyStub) {
        return iamPolicyStub[methodName].bind(iamPolicyStub);
      }),
      defaults[methodName]);
  }.bind(this));

  var subscriberStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.subscriberClient.google.pubsub.v1.Subscriber,
      {sslCreds: sslCreds});
  var subscriberStubMethods = [
    'createSubscription',
    'getSubscription',
    'listSubscriptions',
    'deleteSubscription',
    'modifyAckDeadline',
    'acknowledge',
    'pull',
    'modifyPushConfig'
  ];
  subscriberStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      subscriberStub.then(function(subscriberStub) {
        return subscriberStub[methodName].bind(subscriberStub);
      }),
      defaults[methodName]);
  }.bind(this));
}

// Path templates

var PROJECT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}');

var SUBSCRIPTION_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/subscriptions/{subscription}');

var TOPIC_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/topics/{topic}');

/**
 * Returns a fully-qualified project resource name string.
 * @param {String} project
 * @returns {String}
 */
SubscriberApi.prototype.projectPath = function(project) {
  return PROJECT_PATH_TEMPLATE.render({
    project: project
  });
};

/**
 * Parses the projectName from a project resource.
 * @param {String} projectName
 *   A fully-qualified path representing a project resources.
 * @returns {String} - A string representing the project.
 */
SubscriberApi.prototype.matchProjectFromProjectName = function(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

/**
 * Returns a fully-qualified subscription resource name string.
 * @param {String} project
 * @param {String} subscription
 * @returns {String}
 */
SubscriberApi.prototype.subscriptionPath = function(project, subscription) {
  return SUBSCRIPTION_PATH_TEMPLATE.render({
    project: project,
    subscription: subscription
  });
};

/**
 * Parses the subscriptionName from a subscription resource.
 * @param {String} subscriptionName
 *   A fully-qualified path representing a subscription resources.
 * @returns {String} - A string representing the project.
 */
SubscriberApi.prototype.matchProjectFromSubscriptionName = function(subscriptionName) {
  return SUBSCRIPTION_PATH_TEMPLATE.match(subscriptionName).project;
};

/**
 * Parses the subscriptionName from a subscription resource.
 * @param {String} subscriptionName
 *   A fully-qualified path representing a subscription resources.
 * @returns {String} - A string representing the subscription.
 */
SubscriberApi.prototype.matchSubscriptionFromSubscriptionName = function(subscriptionName) {
  return SUBSCRIPTION_PATH_TEMPLATE.match(subscriptionName).subscription;
};

/**
 * Returns a fully-qualified topic resource name string.
 * @param {String} project
 * @param {String} topic
 * @returns {String}
 */
SubscriberApi.prototype.topicPath = function(project, topic) {
  return TOPIC_PATH_TEMPLATE.render({
    project: project,
    topic: topic
  });
};

/**
 * Parses the topicName from a topic resource.
 * @param {String} topicName
 *   A fully-qualified path representing a topic resources.
 * @returns {String} - A string representing the project.
 */
SubscriberApi.prototype.matchProjectFromTopicName = function(topicName) {
  return TOPIC_PATH_TEMPLATE.match(topicName).project;
};

/**
 * Parses the topicName from a topic resource.
 * @param {String} topicName
 *   A fully-qualified path representing a topic resources.
 * @returns {String} - A string representing the topic.
 */
SubscriberApi.prototype.matchTopicFromTopicName = function(topicName) {
  return TOPIC_PATH_TEMPLATE.match(topicName).topic;
};

// Service calls

/**
 * Creates a subscription to a given topic.
 * If the subscription already exists, returns `ALREADY_EXISTS`.
 * If the corresponding topic doesn't exist, returns `NOT_FOUND`.
 *
 * If the name is not provided in the request, the server will assign a random
 * name for this subscription on the same project as the topic. Note that
 * for REST API requests, you must specify a name.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The name of the subscription. It must have the format
 *   `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must
 *   start with a letter, and contain only letters (`[A-Za-z]`), numbers
 *   (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
 *   plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters
 *   in length, and it must not start with `"goog"`.
 * @param {string} request.topic
 *   The name of the topic from which this subscription is receiving messages.
 *   The value of this field will be `_deleted-topic_` if the topic has been
 *   deleted.
 * @param {Object=} request.pushConfig
 *   If push delivery is used with this subscription, this field is
 *   used to configure it. An empty `pushConfig` signifies that the subscriber
 *   will pull and ack messages using API methods.
 *
 *   This object should have the same structure as [PushConfig]{@link PushConfig}
 * @param {number=} request.ackDeadlineSeconds
 *   This value is the maximum time after a subscriber receives a message
 *   before the subscriber should acknowledge the message. After message
 *   delivery but before the ack deadline expires and before the message is
 *   acknowledged, it is an outstanding message and will not be delivered
 *   again during that time (on a best-effort basis).
 *
 *   For pull subscriptions, this value is used as the initial value for the ack
 *   deadline. To override this value for a given message, call
 *   `ModifyAckDeadline` with the corresponding `ack_id` if using
 *   pull.
 *   The maximum custom deadline you can specify is 600 seconds (10 minutes).
 *
 *   For push delivery, this value is also used to set the request timeout for
 *   the call to the push endpoint.
 *
 *   If the subscriber never acknowledges the message, the Pub/Sub
 *   system will eventually redeliver the message.
 *
 *   If this parameter is 0, a default value of 10 seconds is used.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Subscription]{@link Subscription}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedName = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var formattedTopic = api.topicPath("[PROJECT]", "[TOPIC]");
 * var request = {
 *     name: formattedName,
 *     topic: formattedTopic
 * };
 * api.createSubscription(request).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.createSubscription = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._createSubscription(request, options, callback);
};

/**
 * Gets the configuration details of a subscription.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The name of the subscription to get.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Subscription]{@link Subscription}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * api.getSubscription({subscription: formattedSubscription}).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.getSubscription = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._getSubscription(request, options, callback);
};

/**
 * Lists matching subscriptions.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.project
 *   The name of the cloud project that subscriptions belong to.
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object, ?string)=} callback
 *   When specified, the results are not streamed but this callback
 *   will be called with the response object representing [ListSubscriptionsResponse]{@link ListSubscriptionsResponse}.
 *   The third item will be set if the response contains the token for the further results
 *   and can be reused to `pageToken` field in the options in the next request.
 * @returns {Stream|Promise}
 *   An object stream which emits an object representing
 *   [Subscription]{@link Subscription} on 'data' event.
 *   When the callback is specified or streaming is suppressed through options,
 *   it will return a promise that resolves to the response object. The promise
 *   has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedProject = api.projectPath("[PROJECT]");
 * // Iterate over all elements.
 * api.listSubscriptions({project: formattedProject}).on('data', function(element) {
 *     // doThingsWith(element)
 * });
 *
 * // Or obtain the paged response through the callback.
 * function callback(err, response, nextPageToken) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 *     if (nextPageToken) {
 *         // fetch the next page.
 *         api.listSubscriptions({project: formattedProject}, {pageToken: nextPageToken}, callback);
 *     }
 * }
 * api.listSubscriptions({project: formattedProject}, {flattenPages: false}, callback);
 */
SubscriberApi.prototype.listSubscriptions = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._listSubscriptions(request, options, callback);
};

/**
 * Deletes an existing subscription. All pending messages in the subscription
 * are immediately dropped. Calls to `Pull` after deletion will return
 * `NOT_FOUND`. After a subscription is deleted, a new one may be created with
 * the same name, but the new one has no association with the old
 * subscription, or its topic unless the same topic is specified.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The subscription to delete.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * api.deleteSubscription({subscription: formattedSubscription}).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.deleteSubscription = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._deleteSubscription(request, options, callback);
};

/**
 * Modifies the ack deadline for a specific message. This method is useful
 * to indicate that more time is needed to process a message by the
 * subscriber, or to make the message available for redelivery if the
 * processing was interrupted. Note that this does not modify the
 * subscription-level `ackDeadlineSeconds` used for subsequent messages.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The name of the subscription.
 * @param {string[]} request.ackIds
 *   List of acknowledgment IDs.
 * @param {number} request.ackDeadlineSeconds
 *   The new ack deadline with respect to the time this request was sent to
 *   the Pub/Sub system. Must be >= 0. For example, if the value is 10, the new
 *   ack deadline will expire 10 seconds after the `ModifyAckDeadline` call
 *   was made. Specifying zero may immediately make the message available for
 *   another pull request.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var ackIds = [];
 * var ackDeadlineSeconds = 0;
 * var request = {
 *     subscription: formattedSubscription,
 *     ackIds: ackIds,
 *     ackDeadlineSeconds: ackDeadlineSeconds
 * };
 * api.modifyAckDeadline(request).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.modifyAckDeadline = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._modifyAckDeadline(request, options, callback);
};

/**
 * Acknowledges the messages associated with the `ack_ids` in the
 * `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages
 * from the subscription.
 *
 * Acknowledging a message whose ack deadline has expired may succeed,
 * but such a message may be redelivered later. Acknowledging a message more
 * than once will not result in an error.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The subscription whose message is being acknowledged.
 * @param {string[]} request.ackIds
 *   The acknowledgment ID for the messages being acknowledged that was returned
 *   by the Pub/Sub system in the `Pull` response. Must not be empty.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var ackIds = [];
 * var request = {
 *     subscription: formattedSubscription,
 *     ackIds: ackIds
 * };
 * api.acknowledge(request).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.acknowledge = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._acknowledge(request, options, callback);
};

/**
 * Pulls messages from the server. Returns an empty list if there are no
 * messages available in the backlog. The server may return `UNAVAILABLE` if
 * there are too many concurrent pull requests pending for the given
 * subscription.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The subscription from which messages should be pulled.
 * @param {number} request.maxMessages
 *   The maximum number of messages returned for this request. The Pub/Sub
 *   system may return fewer than the number specified.
 * @param {boolean=} request.returnImmediately
 *   If this is specified as true the system will respond immediately even if
 *   it is not able to return a message in the `Pull` response. Otherwise the
 *   system is allowed to wait until at least one message is available rather
 *   than returning no messages. The client may cancel the request if it does
 *   not wish to wait any longer for the response.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [PullResponse]{@link PullResponse}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var maxMessages = 0;
 * var request = {
 *     subscription: formattedSubscription,
 *     maxMessages: maxMessages
 * };
 * api.pull(request).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.pull = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._pull(request, options, callback);
};

/**
 * Modifies the `PushConfig` for a specified subscription.
 *
 * This may be used to change a push subscription to a pull one (signified by
 * an empty `PushConfig`) or vice versa, or change the endpoint URL and other
 * attributes of a push subscription. Messages will accumulate for delivery
 * continuously through the call regardless of changes to the `PushConfig`.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.subscription
 *   The name of the subscription.
 * @param {Object} request.pushConfig
 *   The push configuration for future deliveries.
 *
 *   An empty `pushConfig` indicates that the Pub/Sub system should
 *   stop pushing messages from the given subscription and allow
 *   messages to be pulled and acknowledged - effectively pausing
 *   the subscription if `Pull` is not called.
 *
 *   This object should have the same structure as [PushConfig]{@link PushConfig}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedSubscription = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var pushConfig = {};
 * var request = {
 *     subscription: formattedSubscription,
 *     pushConfig: pushConfig
 * };
 * api.modifyPushConfig(request).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.modifyPushConfig = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._modifyPushConfig(request, options, callback);
};

/**
 * Sets the access control policy on the specified resource. Replaces any
 * existing policy.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy is being specified.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {Object} request.policy
 *   REQUIRED: The complete policy to be applied to the `resource`. The size of
 *   the policy is limited to a few 10s of KB. An empty policy is a
 *   valid policy but certain Cloud Platform services (such as Projects)
 *   might reject them.
 *
 *   This object should have the same structure as [Policy]{@link Policy}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedResource = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var policy = {};
 * var request = {
 *     resource: formattedResource,
 *     policy: policy
 * };
 * api.setIamPolicy(request).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.setIamPolicy = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._setIamPolicy(request, options, callback);
};

/**
 * Gets the access control policy for a resource.
 * Returns an empty policy if the resource exists and does not have a policy
 * set.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy is being requested.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedResource = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * api.getIamPolicy({resource: formattedResource}).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.getIamPolicy = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._getIamPolicy(request, options, callback);
};

/**
 * Returns permissions that a caller has on the specified resource.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy detail is being requested.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {string[]} request.permissions
 *   The set of permissions to check for the `resource`. Permissions with
 *   wildcards (such as '*' or 'storage.*') are not allowed. For more
 *   information see
 *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link TestIamPermissionsResponse}
 * @returns {Promise} - The promise which resolves to the response object.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var api = pubsubV1.subscriberApi();
 * var formattedResource = api.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
 * var permissions = [];
 * var request = {
 *     resource: formattedResource,
 *     permissions: permissions
 * };
 * api.testIamPermissions(request).then(function(response) {
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
SubscriberApi.prototype.testIamPermissions = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  return this._testIamPermissions(request, options, callback);
};

function SubscriberApiBuilder(gaxGrpc) {
  if (!(this instanceof SubscriberApiBuilder)) {
    return new SubscriberApiBuilder(gaxGrpc);
  }

  var iamPolicyClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/iam/v1/iam_policy.proto'
  }]);
  extend(this, iamPolicyClient.google.iam.v1);

  var subscriberClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/pubsub/v1/pubsub.proto'
  }]);
  extend(this, subscriberClient.google.pubsub.v1);

  var grpcClients = {
    iamPolicyClient: iamPolicyClient,
    subscriberClient: subscriberClient
  };

  /**
   * Build a new instance of {@link SubscriberApi}.
   *
   * @param {Object=} opts - The optional parameters.
   * @param {String=} opts.servicePath
   *   The domain name of the API remote host.
   * @param {number=} opts.port
   *   The port on which to connect to the remote host.
   * @param {grpc.ClientCredentials=} opts.sslCreds
   *   A ClientCredentials for use with an SSL-enabled channel.
   * @param {Object=} opts.clientConfig
   *   The customized config to build the call settings. See
   *   {@link gax.constructSettings} for the format.
   * @param {number=} opts.appName
   *   The codename of the calling service.
   * @param {String=} opts.appVersion
   *   The version of the calling service.
   */
  this.subscriberApi = function(opts) {
    return new SubscriberApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.subscriberApi, SubscriberApi);
}
module.exports = SubscriberApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;