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

var arguejs = require('arguejs');
var configData = require('./trace_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'cloudtrace.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

var DEFAULT_TIMEOUT = 30;

var PAGE_DESCRIPTORS = {
  listTraces: new gax.PageDescriptor(
      'page_token',
      'next_page_token',
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
 * @see {@link traceServiceApi}
 *
 * @example
 * var cloudtraceV1 = require('@google-cloud/trace').v1({
 *   // optional auth parameters.
 * });
 * var api = cloudtraceV1.traceServiceApi();
 *
 * @class
 */
function TraceServiceApi(gaxGrpc, grpcClients, opts) {
  opts = opts || {};
  var servicePath = opts.servicePath || SERVICE_ADDRESS;
  var port = opts.port || DEFAULT_SERVICE_PORT;
  var sslCreds = opts.sslCreds || null;
  var clientConfig = opts.clientConfig || {};
  var timeout = opts.timeout || DEFAULT_TIMEOUT;
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
      timeout,
      PAGE_DESCRIPTORS,
      null,
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
      defaults[methodName]);
  }.bind(this));
}

// Service calls

/**
 * Sends new traces to Cloud Trace or updates existing traces. If the ID of
 * a trace that you send matches that of an existing trace, any fields
 * in the existing trace and its spans are overwritten by the provided values,
 * and any new fields provided are merged with the existing trace data. If the
 * ID does not match, a new trace is created.
 *
 * @param {string} projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {Object} traces
 *   The body of the message.
 *
 *   This object should have the same structure as [Traces]{@link Traces}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = cloudtraceV1.traceServiceApi();
 * var projectId = '';
 * var traces = {};
 * api.patchTraces(projectId, traces, function(err) {
 *     if (err) {
 *         console.error(err);
 *     }
 * });
 */
TraceServiceApi.prototype.patchTraces = function patchTraces() {
  var args = arguejs({
    projectId: String,
    traces: Object,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_id: args.projectId,
    traces: args.traces
  };
  return this._patchTraces(req, args.options, args.callback);
};

/**
 * Gets a single trace by its ID.
 *
 * @param {string} projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {string} traceId
 *   ID of the trace to return.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Trace]{@link Trace}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = cloudtraceV1.traceServiceApi();
 * var projectId = '';
 * var traceId = '';
 * api.getTrace(projectId, traceId, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
TraceServiceApi.prototype.getTrace = function getTrace() {
  var args = arguejs({
    projectId: String,
    traceId: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_id: args.projectId,
    trace_id: args.traceId
  };
  return this._getTrace(req, args.options, args.callback);
};

/**
 * Returns of a list of traces that match the specified filter conditions.
 *
 * @param {string} projectId
 *   ID of the Cloud project where the trace data is stored.
 * @param {Object=} otherArgs
 * @param {number=} otherArgs.view
 *   Type of data returned for traces in the list. Optional. Default is
 *   `MINIMAL`.
 *
 *   The number should be among the values of [ViewType]{@link ViewType}
 * @param {number=} otherArgs.pageSize
 *   Maximum number of traces to return. If not specified or <= 0, the
 *   implementation selects a reasonable value.  The implementation may
 *   return fewer traces than the requested page size. Optional.
 * @param {Object=} otherArgs.startTime
 *   End of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {Object=} otherArgs.endTime
 *   Start of the time interval (inclusive) during which the trace data was
 *   collected from the application.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {string=} otherArgs.filter
 *   An optional filter for the request.
 * @param {string=} otherArgs.orderBy
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
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @returns {Stream}
 *   An object stream. By default, this emits an object representing
 *   [Trace]{@link Trace} on 'data' event.
 *   This object can also be configured to emit
 *   pages of the responses through the options parameter.
 *
 * @example
 *
 * var api = cloudtraceV1.traceServiceApi();
 * var projectId = '';
 * api.listTraces(projectId).on('data', function(element) {
 *     // doThingsWith(element)
 * });
 */
TraceServiceApi.prototype.listTraces = function listTraces() {
  var args = arguejs({
    projectId: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_id: args.projectId
  };
  if ('view' in args.otherArgs) {
    req.view = args.otherArgs.view;
  }
  if ('pageSize' in args.otherArgs) {
    req.page_size = args.otherArgs.pageSize;
  }
  if ('startTime' in args.otherArgs) {
    req.start_time = args.otherArgs.startTime;
  }
  if ('endTime' in args.otherArgs) {
    req.end_time = args.otherArgs.endTime;
  }
  if ('filter' in args.otherArgs) {
    req.filter = args.otherArgs.filter;
  }
  if ('orderBy' in args.otherArgs) {
    req.order_by = args.otherArgs.orderBy;
  }
  return this._listTraces(req, args.options, args.callback);
};

function TraceServiceApiBuilder(gaxGrpc) {
  if (!(this instanceof TraceServiceApiBuilder)) {
    return new TraceServiceApiBuilder(gaxGrpc);
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
   * Build a new instance of {@link TraceServiceApi}.
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
   * @param {number=} opts.timeout
   *   The default timeout, in seconds, for calls made through this client.
   * @param {number=} opts.appName
   *   The codename of the calling service.
   * @param {String=} opts.appVersion
   *   The version of the calling service.
   */
  this.traceServiceApi = function(opts) {
    return new TraceServiceApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.traceServiceApi, TraceServiceApi);
}
module.exports = TraceServiceApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;