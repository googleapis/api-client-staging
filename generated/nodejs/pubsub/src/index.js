/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
'use strict';

var extend = require('extend');
var gapic = {
  v1: require('./v1')
};

const VERSION = require('../package.json').version;

/**
 * Create an publisherClient with additional helpers for common
 * tasks.
 *
 * The service that an application uses to manipulate topics, and to send
 * messages to a topic.
 *
 * @param {object=} options - [Configuration object](#/docs).
 * @param {number=} options.port - The port on which to connect to
 *     the remote host.
 * @param {string=} options.servicePath - The domain name of the
 *     API remote host.
 */
function publisherV1(options) {
  // Define the header options.
  options = extend({}, options, {
    libName: 'gccl',
    libVersion: VERSION
  });

  // Create the image annotator client with the provided options.
  var client = gapic.v1(options).publisherClient(options);
  return client;
}

/**
 * Create an subscriberClient with additional helpers for common
 * tasks.
 *
 * The service that an application uses to manipulate subscriptions and to
 * consume messages from a subscription via the `Pull` method.
 *
 * @param {object=} options - [Configuration object](#/docs).
 * @param {number=} options.port - The port on which to connect to
 *     the remote host.
 * @param {string=} options.servicePath - The domain name of the
 *     API remote host.
 */
function subscriberV1(options) {
  // Define the header options.
  options = extend({}, options, {
    libName: 'gccl',
    libVersion: VERSION
  });

  // Create the image annotator client with the provided options.
  var client = gapic.v1(options).subscriberClient(options);
  return client;
}

module.exports.publisher = publisherV1;
module.exports.subscriber = subscriberV1;
module.exports.v1.publisher = publisherV1;
module.exports.v1.subscriber = subscriberV1;