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
 * https://github.com/googleapis/googleapis/blob/master/google/devtools/cloudtrace/v1/trace.proto,
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

var configData = require('./trace_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'cloudtrace.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

var PAGE_DESCRIPTORS = {
  listTraces: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'traces')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform',
  'https://www.googleapis.com/auth/trace.append',
  'https://www.googleapis.com/auth/trace.readonly'
];

/**
 * This file describes an API for collecting and viewing traces and spans
 * within a trace.  A Trace is a collection of spans corresponding to a single
 * operation or set of operations for an application. A span is an individual
 * timed event which forms a node of the trace tree. Spans for a single trace
 * may span multiple services.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link traceServiceClient}
 *
 * @example
 * var traceV1 = require('@google-cloud/trace').v1({
 *   // optional auth parameters.
 * });
 * var client = traceV1.traceServiceClient();
 *
 * @class
 */
function TraceServiceClient(gaxGrpc, grpcClients, opts) {
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
      'google.devtools.cloudtrace.v1.TraceService',
      configData,
      clientConfig,
      {'x-goog-api-client': googleApiClient});

  var traceServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.traceServiceClient.google.devtools.cloudtrace.v1.TraceService,
      {sslCreds: sslCreds});
  var traceServiceStubMethods = [
    'patchTraces',
    'getTrace',
    'listTraces'
  ];
  traceServiceStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      traceServiceStub.then(function(traceServiceStub) {
        return traceServiceStub[methodName].bind(traceServiceStub);
      }),
      defaults[methodName],
      PAGE_DESCRIPTORS[methodName]);
  }.bind(this));
}

// Service calls

/**
 * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
 * of a trace that you send matches that of an existing trace, any fields
 * in the existing trace and its spans are overwritten by the provided values,
 * and any new fields provided are merged with the existing trace data. If the
 * ID does not match, a new trace is created.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {Object} request.traces
 *   The body of the message.
 *
 *   This object should have the same structure as [Traces]{@link Traces}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @return {Promise} - The promise which resolves when API call finishes.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = traceV1.traceServiceClient();
 * var projectId = '';
 * var traces = {};
 * var request = {
 *     projectId: projectId,
 *     traces: traces
 * };
 * client.patchTraces(request).catch(function(err) {
 *     console.error(err);
 * });
 */
TraceServiceClient.prototype.patchTraces = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._patchTraces(request, options, callback);
};

/**
 * Gets a single trace by its ID.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {string} request.traceId
 *   ID of the trace to return.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Trace]{@link Trace}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Trace]{@link Trace}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = traceV1.traceServiceClient();
 * var projectId = '';
 * var traceId = '';
 * var request = {
 *     projectId: projectId,
 *     traceId: traceId
 * };
 * client.getTrace(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
TraceServiceClient.prototype.getTrace = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._getTrace(request, options, callback);
};

/**
 * Returns of a list of traces that match the specified filter conditions.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {number=} request.view
 *   Type of data returned for traces in the list. Optional. Default is
 *   `MINIMAL`.
 *
 *   The number should be among the values of [ViewType]{@link ViewType}
 * @param {number=} request.pageSize
 *   Maximum number of traces to return. If not specified or <= 0, the
 *   implementation selects a reasonable value.  The implementation may
 *   return fewer traces than the requested page size. Optional.
 * @param {Object=} request.startTime
 *   End of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {Object=} request.endTime
 *   Start of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {string=} request.filter
 *   An optional filter for the request.
 * @param {string=} request.orderBy
 *   Field used to sort the returned traces. Optional.
 *   Can be one of the following:
 *
 *   *   `trace_id`
 *   *   `name` (`name` field of root span in the trace)
 *   *   `duration` (difference between `end_time` and `start_time` fields of
 *        the root span)
 *   *   `start` (`start_time` field of the root span)
 *
 *   Descending order can be specified by appending `desc` to the sort field
 *   (for example, `name desc`).
 *
 *   Only one sort field is permitted.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Array, ?Object, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is Array of [Trace]{@link Trace}.
 *
 *   When autoPaginate: false is specified through options, it contains the result
 *   in a single response. If the response indicates the next page exists, the third
 *   parameter is set to be used for the next request object. The fourth parameter keeps
 *   the raw response object of an object representing [ListTracesResponse]{@link ListTracesResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is Array of [Trace]{@link Trace}.
 *
 *   When autoPaginate: false is specified through options, the array has three elements.
 *   The first element is Array of [Trace]{@link Trace} in a single response.
 *   The second element is the next request object if the response
 *   indicates the next page exists, or null. The third element is
 *   an object representing [ListTracesResponse]{@link ListTracesResponse}.
 *
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = traceV1.traceServiceClient();
 * var projectId = '';
 * // Iterate over all elements.
 * client.listTraces({projectId: projectId}).then(function(responses) {
 *     var resources = responses[0];
 *     for (var i = 0; i < resources.length; ++i) {
 *         // doThingsWith(resources[i])
 *     }
 * }).catch(function(err) {
 *     console.error(err);
 * });
 *
 * // Or obtain the paged response.
 * var options = {autoPaginate: false};
 * function callback(responses) {
 *     // The actual resources in a response.
 *     var resources = responses[0];
 *     // The next request if the response shows there's more responses.
 *     var nextRequest = responses[1];
 *     // The actual response object, if necessary.
 *     // var rawResponse = responses[2];
 *     for (var i = 0; i < resources.length; ++i) {
 *         // doThingsWith(resources[i]);
 *     }
 *     if (nextRequest) {
 *         // Fetch the next page.
 *         return client.listTraces(nextRequest, options).then(callback);
 *     }
 * }
 * client.listTraces({projectId: projectId}, options)
 *     .then(callback)
 *     .catch(function(err) {
 *         console.error(err);
 *     });
 */
TraceServiceClient.prototype.listTraces = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listTraces(request, options, callback);
};

/**
 * Equivalent to {@link listTraces}, but returns a NodeJS Stream object.
 *
 * This fetches the paged responses for {@link listTraces} continuously
 * and invokes the callback registered for 'data' event for each element in the
 * responses.
 *
 * The returned object has 'end' method when no more elements are required.
 *
 * autoPaginate option will be ignored.
 *
 * @see {@link https://nodejs.org/api/stream.html}
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {number=} request.view
 *   Type of data returned for traces in the list. Optional. Default is
 *   `MINIMAL`.
 *
 *   The number should be among the values of [ViewType]{@link ViewType}
 * @param {number=} request.pageSize
 *   Maximum number of traces to return. If not specified or <= 0, the
 *   implementation selects a reasonable value.  The implementation may
 *   return fewer traces than the requested page size. Optional.
 * @param {Object=} request.startTime
 *   End of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {Object=} request.endTime
 *   Start of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {string=} request.filter
 *   An optional filter for the request.
 * @param {string=} request.orderBy
 *   Field used to sort the returned traces. Optional.
 *   Can be one of the following:
 *
 *   *   `trace_id`
 *   *   `name` (`name` field of root span in the trace)
 *   *   `duration` (difference between `end_time` and `start_time` fields of
 *        the root span)
 *   *   `start` (`start_time` field of the root span)
 *
 *   Descending order can be specified by appending `desc` to the sort field
 *   (for example, `name desc`).
 *
 *   Only one sort field is permitted.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @return {Stream}
 *   An object stream which emits an object representing [Trace]{@link Trace} on 'data' event.
 *
 * @example
 *
 * var client = traceV1.traceServiceClient();
 * var projectId = '';
 * client.listTracesStream({projectId: projectId}).on('data', function(element) {
 *     // doThingsWith(element)
 * }).on('error', function(err) {
 *     console.error(err);
 * });
 */
TraceServiceClient.prototype.listTracesStream = function(request, options) {
  if (options === undefined) {
    options = {};
  }

  return PAGE_DESCRIPTORS.listTraces.createStream(this._listTraces, request, options);
};

function TraceServiceClientBuilder(gaxGrpc) {
  if (!(this instanceof TraceServiceClientBuilder)) {
    return new TraceServiceClientBuilder(gaxGrpc);
  }

  var traceServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/devtools/cloudtrace/v1/trace.proto'
  }]);
  extend(this, traceServiceClient.google.devtools.cloudtrace.v1);

  var grpcClients = {
    traceServiceClient: traceServiceClient
  };

  /**
   * Build a new instance of {@link TraceServiceClient}.
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
  this.traceServiceClient = function(opts) {
    return new TraceServiceClient(gaxGrpc, grpcClients, opts);
  };
  extend(this.traceServiceClient, TraceServiceClient);
}
module.exports = TraceServiceClientBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;