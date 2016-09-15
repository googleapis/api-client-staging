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
 * https://github.com/googleapis/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto,
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
var configData = require('./error_stats_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

var DEFAULT_TIMEOUT = 30;

var PAGE_DESCRIPTORS = {
  listGroupStats: new gax.PageDescriptor(
      'page_token',
      'next_page_token',
      'error_group_stats'),
  listEvents: new gax.PageDescriptor(
      'page_token',
      'next_page_token',
      'error_events')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform'
];

/**
 * An API for retrieving and managing error statistics as well as data for
 * individual events.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link errorStatsServiceApi}
 *
 * @example
 * var clouderrorreportingV1beta1 = require('@google-cloud/errorreporting').v1beta1({
 *   // optional auth parameters.
 * });
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 *
 * @class
 */
function ErrorStatsServiceApi(gaxGrpc, grpcClients, opts) {
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
      'google.devtools.clouderrorreporting.v1beta1.ErrorStatsService',
      configData,
      clientConfig,
      timeout,
      PAGE_DESCRIPTORS,
      null,
      {'x-goog-api-client': googleApiClient});

  var errorStatsServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.errorStatsServiceClient.google.devtools.clouderrorreporting.v1beta1.ErrorStatsService,
      {sslCreds: sslCreds});
  var errorStatsServiceStubMethods = [
    'listGroupStats',
    'listEvents',
    'deleteEvents'
  ];
  errorStatsServiceStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      errorStatsServiceStub.then(function(errorStatsServiceStub) {
        return errorStatsServiceStub[methodName].bind(errorStatsServiceStub);
      }),
      defaults[methodName]);
  }.bind(this));
}

// Path templates

var PROJECT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}');

/**
 * Returns a fully-qualified project resource name string.
 * @param {String} project
 * @returns {String}
 */
ErrorStatsServiceApi.prototype.projectPath = function projectPath(project) {
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
ErrorStatsServiceApi.prototype.matchProjectFromProjectName =
    function matchProjectFromProjectName(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

// Service calls

/**
 * Lists the specified groups.
 *
 * @param {string} projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as <code>projects/</code> plus the
 *   <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
 *   Platform project ID</a>.
 *
 *   Example: <code>projects/my-project-123</code>.
 * @param {Object} timeRange
 *   [Required] List data for the given time range.
 *   The service is tuned for retrieving data up to (approximately) 'now'.
 *   Retrieving data for arbitrary time periods in the past can result in
 *   higher response times or in returning incomplete results.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {Object=} otherArgs
 * @param {string[]=} otherArgs.groupId
 *   [Optional] List all <code>ErrorGroupStats</code> with these IDs.
 *   If not specified, all error group stats with a non-zero error count
 *   for the given selection criteria are returned.
 * @param {Object=} otherArgs.serviceFilter
 *   [Optional] List only <code>ErrorGroupStats</code> which belong to a service
 *   context that matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} otherArgs.timedCountDuration
 *   [Optional] The preferred duration for a single returned `TimedCount`.
 *   If not set, no timed counts are returned.
 *
 *   This object should have the same structure as [google.protobuf.Duration]{@link external:"google.protobuf.Duration"}
 * @param {number=} otherArgs.alignment
 *   [Optional] The alignment of the timed counts to be returned.
 *   Default is `ALIGNMENT_EQUAL_AT_END`.
 *
 *   The number should be among the values of [TimedCountAlignment]{@link TimedCountAlignment}
 * @param {Object=} otherArgs.alignmentTime
 *   [Optional] Time where the timed counts shall be aligned if rounded
 *   alignment is chosen. Default is 00:00 UTC.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {number=} otherArgs.order
 *   [Optional] The sort order in which the results are returned.
 *   Default is `COUNT_DESC`.
 *
 *   The number should be among the values of [ErrorGroupOrder]{@link ErrorGroupOrder}
 * @param {number=} otherArgs.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @returns {Stream}
 *   An object stream. By default, this emits an object representing
 *   [ErrorGroupStats]{@link ErrorGroupStats} on 'data' event.
 *   This object can also be configured to emit
 *   pages of the responses through the options parameter.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * var timeRange = {};
 * api.listGroupStats(formattedProjectName, timeRange).on('data', function(element) {
 *     // doThingsWith(element)
 * });
 */
ErrorStatsServiceApi.prototype.listGroupStats = function listGroupStats() {
  var args = arguejs({
    projectName: String,
    timeRange: Object,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_name: args.projectName,
    time_range: args.timeRange
  };
  if ('groupId' in args.otherArgs) {
    req.group_id = args.otherArgs.groupId;
  }
  if ('serviceFilter' in args.otherArgs) {
    req.service_filter = args.otherArgs.serviceFilter;
  }
  if ('timedCountDuration' in args.otherArgs) {
    req.timed_count_duration = args.otherArgs.timedCountDuration;
  }
  if ('alignment' in args.otherArgs) {
    req.alignment = args.otherArgs.alignment;
  }
  if ('alignmentTime' in args.otherArgs) {
    req.alignment_time = args.otherArgs.alignmentTime;
  }
  if ('order' in args.otherArgs) {
    req.order = args.otherArgs.order;
  }
  if ('pageSize' in args.otherArgs) {
    req.page_size = args.otherArgs.pageSize;
  }
  return this._listGroupStats(req, args.options, args.callback);
};

/**
 * Lists the specified events.
 *
 * @param {string} projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {string} groupId
 *   [Required] The group for which events shall be returned.
 * @param {Object=} otherArgs
 * @param {Object=} otherArgs.serviceFilter
 *   [Optional] List only ErrorGroups which belong to a service context that
 *   matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} otherArgs.timeRange
 *   [Optional] List only data for the given time range.
 *   The service is tuned for retrieving data up to (approximately) 'now'.
 *   Retrieving data for arbitrary time periods in the past can result in
 *   higher response times or in returning incomplete results.
 *   Data for the last hour until now is returned if not specified.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {number=} otherArgs.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @returns {Stream}
 *   An object stream. By default, this emits an object representing
 *   [ErrorEvent]{@link ErrorEvent} on 'data' event.
 *   This object can also be configured to emit
 *   pages of the responses through the options parameter.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * var groupId = '';
 * api.listEvents(formattedProjectName, groupId).on('data', function(element) {
 *     // doThingsWith(element)
 * });
 */
ErrorStatsServiceApi.prototype.listEvents = function listEvents() {
  var args = arguejs({
    projectName: String,
    groupId: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_name: args.projectName,
    group_id: args.groupId
  };
  if ('serviceFilter' in args.otherArgs) {
    req.service_filter = args.otherArgs.serviceFilter;
  }
  if ('timeRange' in args.otherArgs) {
    req.time_range = args.otherArgs.timeRange;
  }
  if ('pageSize' in args.otherArgs) {
    req.page_size = args.otherArgs.pageSize;
  }
  return this._listEvents(req, args.options, args.callback);
};

/**
 * Deletes all error events of a given project.
 *
 * @param {string} projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [DeleteEventsResponse]{@link DeleteEventsResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * api.deleteEvents(formattedProjectName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
ErrorStatsServiceApi.prototype.deleteEvents = function deleteEvents() {
  var args = arguejs({
    projectName: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    project_name: args.projectName
  };
  return this._deleteEvents(req, args.options, args.callback);
};

function ErrorStatsServiceApiBuilder(gaxGrpc) {
  if (!(this instanceof ErrorStatsServiceApiBuilder)) {
    return new ErrorStatsServiceApiBuilder(gaxGrpc);
  }

  var errorStatsServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto'
  }]);
  extend(this, errorStatsServiceClient.google.devtools.clouderrorreporting.v1beta1);

  var grpcClients = {
    errorStatsServiceClient: errorStatsServiceClient
  };

  /**
   * Build a new instance of {@link ErrorStatsServiceApi}.
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
  this.errorStatsServiceApi = function(opts) {
    return new ErrorStatsServiceApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.errorStatsServiceApi, ErrorStatsServiceApi);
}
module.exports = ErrorStatsServiceApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;