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
 * https://github.com/googleapis/googleapis/blob/master/google/cloud/language/v1/language_service.proto,
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

var configData = require('./language_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'language.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform'
];

/**
 * Provides text analysis operations such as sentiment analysis and entity
 * recognition.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link languageServiceClient}
 *
 * @example
 * var languageV1 = require('@google-cloud/language').v1({
 *   // optional auth parameters.
 * });
 * var client = languageV1.languageServiceClient();
 *
 * @class
 */
function LanguageServiceClient(gaxGrpc, grpcClients, opts) {
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
      'google.cloud.language.v1.LanguageService',
      configData,
      clientConfig,
      {'x-goog-api-client': googleApiClient});

  var languageServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.languageServiceClient.google.cloud.language.v1.LanguageService,
      {sslCreds: sslCreds});
  var languageServiceStubMethods = [
    'analyzeSentiment',
    'analyzeEntities',
    'analyzeSyntax',
    'annotateText'
  ];
  languageServiceStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      languageServiceStub.then(function(languageServiceStub) {
        return languageServiceStub[methodName].bind(languageServiceStub);
      }),
      defaults[methodName],
      null);
  }.bind(this));
}

// Service calls

/**
 * Analyzes the sentiment of the provided text.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.document
 *   Input document. Currently, `analyzeSentiment` only supports English text
 *   ({@link Document.language}="EN").
 *
 *   This object should have the same structure as [Document]{@link Document}
 * @param {number=} request.encodingType
 *   The encoding type used by the API to calculate sentence offsets.
 *
 *   The number should be among the values of [EncodingType]{@link EncodingType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [AnalyzeSentimentResponse]{@link AnalyzeSentimentResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [AnalyzeSentimentResponse]{@link AnalyzeSentimentResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = languageV1.languageServiceClient();
 * var document = {};
 * client.analyzeSentiment({document: document}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
LanguageServiceClient.prototype.analyzeSentiment = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._analyzeSentiment(request, options, callback);
};

/**
 * Finds named entities (currently finds proper names) in the text,
 * entity types, salience, mentions for each entity, and other properties.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.document
 *   Input document.
 *
 *   This object should have the same structure as [Document]{@link Document}
 * @param {number} request.encodingType
 *   The encoding type used by the API to calculate offsets.
 *
 *   The number should be among the values of [EncodingType]{@link EncodingType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [AnalyzeEntitiesResponse]{@link AnalyzeEntitiesResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [AnalyzeEntitiesResponse]{@link AnalyzeEntitiesResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = languageV1.languageServiceClient();
 * var document = {};
 * var encodingType = languageV1.EncodingType.NONE;
 * var request = {
 *     document: document,
 *     encodingType: encodingType
 * };
 * client.analyzeEntities(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
LanguageServiceClient.prototype.analyzeEntities = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._analyzeEntities(request, options, callback);
};

/**
 * Analyzes the syntax of the text and provides sentence boundaries and
 * tokenization along with part of speech tags, dependency trees, and other
 * properties.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.document
 *   Input document.
 *
 *   This object should have the same structure as [Document]{@link Document}
 * @param {number} request.encodingType
 *   The encoding type used by the API to calculate offsets.
 *
 *   The number should be among the values of [EncodingType]{@link EncodingType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [AnalyzeSyntaxResponse]{@link AnalyzeSyntaxResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [AnalyzeSyntaxResponse]{@link AnalyzeSyntaxResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = languageV1.languageServiceClient();
 * var document = {};
 * var encodingType = languageV1.EncodingType.NONE;
 * var request = {
 *     document: document,
 *     encodingType: encodingType
 * };
 * client.analyzeSyntax(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
LanguageServiceClient.prototype.analyzeSyntax = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._analyzeSyntax(request, options, callback);
};

/**
 * A convenience method that provides all the features that analyzeSentiment,
 * analyzeEntities, and analyzeSyntax provide in one call.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.document
 *   Input document.
 *
 *   This object should have the same structure as [Document]{@link Document}
 * @param {Object} request.features
 *   The enabled features.
 *
 *   This object should have the same structure as [Features]{@link Features}
 * @param {number} request.encodingType
 *   The encoding type used by the API to calculate offsets.
 *
 *   The number should be among the values of [EncodingType]{@link EncodingType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [AnnotateTextResponse]{@link AnnotateTextResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [AnnotateTextResponse]{@link AnnotateTextResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = languageV1.languageServiceClient();
 * var document = {};
 * var features = {};
 * var encodingType = languageV1.EncodingType.NONE;
 * var request = {
 *     document: document,
 *     features: features,
 *     encodingType: encodingType
 * };
 * client.annotateText(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
LanguageServiceClient.prototype.annotateText = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._annotateText(request, options, callback);
};

function LanguageServiceClientBuilder(gaxGrpc) {
  if (!(this instanceof LanguageServiceClientBuilder)) {
    return new LanguageServiceClientBuilder(gaxGrpc);
  }

  var languageServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/cloud/language/v1/language_service.proto'
  }]);
  extend(this, languageServiceClient.google.cloud.language.v1);

  var grpcClients = {
    languageServiceClient: languageServiceClient
  };

  /**
   * Build a new instance of {@link LanguageServiceClient}.
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
  this.languageServiceClient = function(opts) {
    return new LanguageServiceClient(gaxGrpc, grpcClients, opts);
  };
  extend(this.languageServiceClient, LanguageServiceClient);
}
module.exports = LanguageServiceClientBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;