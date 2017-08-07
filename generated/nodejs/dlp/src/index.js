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
  v2beta1: require('./v2beta1')
};
var gaxGrpc = require('google-gax').grpc();

const VERSION = require('../package.json').version;

/**
 * Create an dlpServiceClient with additional helpers for common
 * tasks.
 *
 * The DLP API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other
 * privacy-sensitive data in user-supplied, unstructured data streams, like text
 * blocks or images.
 * The service also includes methods for sensitive data redaction and
 * scheduling of data scans on Google Cloud Platform based data sets.
 *
 * @param {object=} options - [Configuration object](#/docs).
 * @param {number=} options.port - The port on which to connect to
 *     the remote host.
 * @param {string=} options.servicePath - The domain name of the
 *     API remote host.
 */
function dlpV2beta1(options) {
  // Define the header options.
  options = extend({}, options, {
    libName: 'gccl',
    libVersion: VERSION
  });

  // Create the client with the provided options.
  var client = gapic.v2beta1(options).dlpServiceClient(options);
  return client;
}

var v2beta1Protos = {};

extend(v2beta1Protos, gaxGrpc.load([{
  root: require('google-proto-files')('..'),
  file: 'google/privacy/dlp/v2beta1/dlp.proto'
}]).google.privacy.dlp.v2beta1);

module.exports = dlpV2beta1;
module.exports.types = v2beta1Protos;
module.exports.v2beta1 = dlpV2beta1;
module.exports.v2beta1.types = v2beta1Protos;