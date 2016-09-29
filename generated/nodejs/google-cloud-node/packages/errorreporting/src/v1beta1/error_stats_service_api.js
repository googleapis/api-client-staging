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

var configData = require('./error_stats_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';


var PAGE_DESCRIPTORS = {
  listGroupStats: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'errorGroupStats'),
  listEvents: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'errorEvents')
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
 *   Only <code>ErrorGroupStats</code> with a non-zero count in the given time
 *   range are returned, unless the request contains an explicit group_id list.
 *   If a group_id list is given, also <code>ErrorGroupStats</code> with zero
 *   occurrences are returned.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 *
 *   In addition, options may contain the following optional parameters.
 * @param {string[]=} options.groupId
 *   [Optional] List all <code>ErrorGroupStats</code> with these IDs.
 * @param {Object=} options.serviceFilter
 *   [Optional] List only <code>ErrorGroupStats</code> which belong to a service
 *   context that matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} options.timedCountDuration
 *   [Optional] The preferred duration for a single returned `TimedCount`.
 *   If not set, no timed counts are returned.
 *
 *   This object should have the same structure as [google.protobuf.Duration]{@link external:"google.protobuf.Duration"}
 * @param {number=} options.alignment
 *   [Optional] The alignment of the timed counts to be returned.
 *   Default is `ALIGNMENT_EQUAL_AT_END`.
 *
 *   The number should be among the values of [TimedCountAlignment]{@link TimedCountAlignment}
 * @param {Object=} options.alignmentTime
 *   [Optional] Time where the timed counts shall be aligned if rounded
 *   alignment is chosen. Default is 00:00 UTC.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {number=} options.order
 *   [Optional] The sort order in which the results are returned.
 *   Default is `COUNT_DESC`.
 *
 *   The number should be among the values of [ErrorGroupOrder]{@link ErrorGroupOrder}
 * @param {number=} options.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 *
 * @param {function(?Error, ?Object, ?string)=} callback
 *   When specified, the results are not streamed but this callback
 *   will be called with the response object representing [ListGroupStatsResponse]{@link ListGroupStatsResponse}.
 *   The third item will be set if the response contains the token for the further results
 *   and can be reused to `pageToken` field in the options in the next request.
 * @returns {Stream|gax.EventEmitter}
 *   An object stream which emits an object representing
 *   [ErrorGroupStats]{@link ErrorGroupStats} on 'data' event.
 *   When the callback is specified or streaming is suppressed through options,
 *   it will return an event emitter to handle the call status and the callback
 *   will be called with the response object.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * var timeRange = {};
 * // Iterate over all elements.
 * api.listGroupStats(formattedProjectName, timeRange).on('data', function(element) {
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
 *         api.listGroupStats(formattedProjectName, timeRange, {pageToken: nextPageToken}, callback);
 *     }
 * }
 * api.listGroupStats(formattedProjectName, timeRange, {flattenPages: false}, callback);
 */
ErrorStatsServiceApi.prototype.listGroupStats = function listGroupStats(
    projectName,
    timeRange,
    options,
    callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  var req = {
    projectName: projectName,
    timeRange: timeRange
  };
  if ('groupId' in options) {
    req.groupId = options.groupId;
  }
  if ('serviceFilter' in options) {
    req.serviceFilter = options.serviceFilter;
  }
  if ('timedCountDuration' in options) {
    req.timedCountDuration = options.timedCountDuration;
  }
  if ('alignment' in options) {
    req.alignment = options.alignment;
  }
  if ('alignmentTime' in options) {
    req.alignmentTime = options.alignmentTime;
  }
  if ('order' in options) {
    req.order = options.order;
  }
  if ('pageSize' in options) {
    req.pageSize = options.pageSize;
  }
  return this._listGroupStats(req, options, callback);
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
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 *
 *   In addition, options may contain the following optional parameters.
 * @param {Object=} options.serviceFilter
 *   [Optional] List only ErrorGroups which belong to a service context that
 *   matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} options.timeRange
 *   [Optional] List only data for the given time range.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {number=} options.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 *
 * @param {function(?Error, ?Object, ?string)=} callback
 *   When specified, the results are not streamed but this callback
 *   will be called with the response object representing [ListEventsResponse]{@link ListEventsResponse}.
 *   The third item will be set if the response contains the token for the further results
 *   and can be reused to `pageToken` field in the options in the next request.
 * @returns {Stream|gax.EventEmitter}
 *   An object stream which emits an object representing
 *   [ErrorEvent]{@link ErrorEvent} on 'data' event.
 *   When the callback is specified or streaming is suppressed through options,
 *   it will return an event emitter to handle the call status and the callback
 *   will be called with the response object.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorStatsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * var groupId = '';
 * // Iterate over all elements.
 * api.listEvents(formattedProjectName, groupId).on('data', function(element) {
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
 *         api.listEvents(formattedProjectName, groupId, {pageToken: nextPageToken}, callback);
 *     }
 * }
 * api.listEvents(formattedProjectName, groupId, {flattenPages: false}, callback);
 */
ErrorStatsServiceApi.prototype.listEvents = function listEvents(
    projectName,
    groupId,
    options,
    callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  var req = {
    projectName: projectName,
    groupId: groupId
  };
  if ('serviceFilter' in options) {
    req.serviceFilter = options.serviceFilter;
  }
  if ('timeRange' in options) {
    req.timeRange = options.timeRange;
  }
  if ('pageSize' in options) {
    req.pageSize = options.pageSize;
  }
  return this._listEvents(req, options, callback);
};

/**
 * Deletes all error events of a given project.
 *
 * @param {string} projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
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
ErrorStatsServiceApi.prototype.deleteEvents = function deleteEvents(
    projectName,
    options,
    callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  var req = {
    projectName: projectName
  };
  return this._deleteEvents(req, options, callback);
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