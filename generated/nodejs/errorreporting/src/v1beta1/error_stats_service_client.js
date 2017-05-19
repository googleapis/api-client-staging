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
 * @see {@link errorStatsServiceClient}
 *
 * @example
 * var errorreportingV1beta1 = require('@google-cloud/errorreporting').v1beta1({
 *   // optional auth parameters.
 * });
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 *
 * @class
 */
function ErrorStatsServiceClient(gaxGrpc, grpcClients, opts) {
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
      {'x-goog-api-client': googleApiClient});

  var self = this;

  var errorStatsServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.google.devtools.clouderrorreporting.v1beta1.ErrorStatsService,
      {sslCreds: sslCreds});
  var errorStatsServiceStubMethods = [
    'listGroupStats',
    'listEvents',
    'deleteEvents'
  ];
  errorStatsServiceStubMethods.forEach(function(methodName) {
    self['_' + methodName] = gax.createApiCall(
      errorStatsServiceStub.then(function(errorStatsServiceStub) {
        return function() {
          var args = Array.prototype.slice.call(arguments, 0);
          return errorStatsServiceStub[methodName].apply(errorStatsServiceStub, args);
        };
      }),
      defaults[methodName],
      PAGE_DESCRIPTORS[methodName]);
  });
}

// Path templates

var PROJECT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}');

/**
 * Returns a fully-qualified project resource name string.
 * @param {String} project
 * @returns {String}
 */
ErrorStatsServiceClient.prototype.projectPath = function(project) {
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
ErrorStatsServiceClient.prototype.matchProjectFromProjectName = function(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

// Service calls

/**
 * Lists the specified groups.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as <code>projects/</code> plus the
 *   <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
 *   Platform project ID</a>.
 *
 *   Example: <code>projects/my-project-123</code>.
 * @param {Object} request.timeRange
 *   [Optional] List data for the given time range.
 *   If not set a default time range is used. The field time_range_begin
 *   in the response will specify the beginning of this time range.
 *   Only <code>ErrorGroupStats</code> with a non-zero count in the given time
 *   range are returned, unless the request contains an explicit group_id list.
 *   If a group_id list is given, also <code>ErrorGroupStats</code> with zero
 *   occurrences are returned.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {string[]=} request.groupId
 *   [Optional] List all <code>ErrorGroupStats</code> with these IDs.
 * @param {Object=} request.serviceFilter
 *   [Optional] List only <code>ErrorGroupStats</code> which belong to a service
 *   context that matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} request.timedCountDuration
 *   [Optional] The preferred duration for a single returned `TimedCount`.
 *   If not set, no timed counts are returned.
 *
 *   This object should have the same structure as [google.protobuf.Duration]{@link external:"google.protobuf.Duration"}
 * @param {number=} request.alignment
 *   [Optional] The alignment of the timed counts to be returned.
 *   Default is `ALIGNMENT_EQUAL_AT_END`.
 *
 *   The number should be among the values of [TimedCountAlignment]{@link TimedCountAlignment}
 * @param {Object=} request.alignmentTime
 *   [Optional] Time where the timed counts shall be aligned if rounded
 *   alignment is chosen. Default is 00:00 UTC.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {number=} request.order
 *   [Optional] The sort order in which the results are returned.
 *   Default is `COUNT_DESC`.
 *
 *   The number should be among the values of [ErrorGroupOrder]{@link ErrorGroupOrder}
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Array, ?Object, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is Array of [ErrorGroupStats]{@link ErrorGroupStats}.
 *
 *   When autoPaginate: false is specified through options, it contains the result
 *   in a single response. If the response indicates the next page exists, the third
 *   parameter is set to be used for the next request object. The fourth parameter keeps
 *   the raw response object of an object representing [ListGroupStatsResponse]{@link ListGroupStatsResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is Array of [ErrorGroupStats]{@link ErrorGroupStats}.
 *
 *   When autoPaginate: false is specified through options, the array has three elements.
 *   The first element is Array of [ErrorGroupStats]{@link ErrorGroupStats} in a single response.
 *   The second element is the next request object if the response
 *   indicates the next page exists, or null. The third element is
 *   an object representing [ListGroupStatsResponse]{@link ListGroupStatsResponse}.
 *
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 * var formattedProjectName = client.projectPath("[PROJECT]");
 * var timeRange = {};
 * var request = {
 *     projectName: formattedProjectName,
 *     timeRange: timeRange
 * };
 * // Iterate over all elements.
 * client.listGroupStats(request).then(function(responses) {
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
 *         return client.listGroupStats(nextRequest, options).then(callback);
 *     }
 * }
 * client.listGroupStats(request, options)
 *     .then(callback)
 *     .catch(function(err) {
 *         console.error(err);
 *     });
 */
ErrorStatsServiceClient.prototype.listGroupStats = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listGroupStats(request, options, callback);
};

/**
 * Equivalent to {@link listGroupStats}, but returns a NodeJS Stream object.
 *
 * This fetches the paged responses for {@link listGroupStats} continuously
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
 * @param {string} request.projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as <code>projects/</code> plus the
 *   <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
 *   Platform project ID</a>.
 *
 *   Example: <code>projects/my-project-123</code>.
 * @param {Object} request.timeRange
 *   [Optional] List data for the given time range.
 *   If not set a default time range is used. The field time_range_begin
 *   in the response will specify the beginning of this time range.
 *   Only <code>ErrorGroupStats</code> with a non-zero count in the given time
 *   range are returned, unless the request contains an explicit group_id list.
 *   If a group_id list is given, also <code>ErrorGroupStats</code> with zero
 *   occurrences are returned.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {string[]=} request.groupId
 *   [Optional] List all <code>ErrorGroupStats</code> with these IDs.
 * @param {Object=} request.serviceFilter
 *   [Optional] List only <code>ErrorGroupStats</code> which belong to a service
 *   context that matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} request.timedCountDuration
 *   [Optional] The preferred duration for a single returned `TimedCount`.
 *   If not set, no timed counts are returned.
 *
 *   This object should have the same structure as [google.protobuf.Duration]{@link external:"google.protobuf.Duration"}
 * @param {number=} request.alignment
 *   [Optional] The alignment of the timed counts to be returned.
 *   Default is `ALIGNMENT_EQUAL_AT_END`.
 *
 *   The number should be among the values of [TimedCountAlignment]{@link TimedCountAlignment}
 * @param {Object=} request.alignmentTime
 *   [Optional] Time where the timed counts shall be aligned if rounded
 *   alignment is chosen. Default is 00:00 UTC.
 *
 *   This object should have the same structure as [google.protobuf.Timestamp]{@link external:"google.protobuf.Timestamp"}
 * @param {number=} request.order
 *   [Optional] The sort order in which the results are returned.
 *   Default is `COUNT_DESC`.
 *
 *   The number should be among the values of [ErrorGroupOrder]{@link ErrorGroupOrder}
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @return {Stream}
 *   An object stream which emits an object representing [ErrorGroupStats]{@link ErrorGroupStats} on 'data' event.
 *
 * @example
 *
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 * var formattedProjectName = client.projectPath("[PROJECT]");
 * var timeRange = {};
 * var request = {
 *     projectName: formattedProjectName,
 *     timeRange: timeRange
 * };
 * client.listGroupStatsStream(request).on('data', function(element) {
 *     // doThingsWith(element)
 * }).on('error', function(err) {
 *     console.error(err);
 * });
 */
ErrorStatsServiceClient.prototype.listGroupStatsStream = function(request, options) {
  if (options === undefined) {
    options = {};
  }

  return PAGE_DESCRIPTORS.listGroupStats.createStream(this._listGroupStats, request, options);
};

/**
 * Lists the specified events.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project
 *   ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {string} request.groupId
 *   [Required] The group for which events shall be returned.
 * @param {Object=} request.serviceFilter
 *   [Optional] List only ErrorGroups which belong to a service context that
 *   matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} request.timeRange
 *   [Optional] List only data for the given time range.
 *   If not set a default time range is used. The field time_range_begin
 *   in the response will specify the beginning of this time range.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Array, ?Object, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is Array of [ErrorEvent]{@link ErrorEvent}.
 *
 *   When autoPaginate: false is specified through options, it contains the result
 *   in a single response. If the response indicates the next page exists, the third
 *   parameter is set to be used for the next request object. The fourth parameter keeps
 *   the raw response object of an object representing [ListEventsResponse]{@link ListEventsResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is Array of [ErrorEvent]{@link ErrorEvent}.
 *
 *   When autoPaginate: false is specified through options, the array has three elements.
 *   The first element is Array of [ErrorEvent]{@link ErrorEvent} in a single response.
 *   The second element is the next request object if the response
 *   indicates the next page exists, or null. The third element is
 *   an object representing [ListEventsResponse]{@link ListEventsResponse}.
 *
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 * var formattedProjectName = client.projectPath("[PROJECT]");
 * var groupId = '';
 * var request = {
 *     projectName: formattedProjectName,
 *     groupId: groupId
 * };
 * // Iterate over all elements.
 * client.listEvents(request).then(function(responses) {
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
 *         return client.listEvents(nextRequest, options).then(callback);
 *     }
 * }
 * client.listEvents(request, options)
 *     .then(callback)
 *     .catch(function(err) {
 *         console.error(err);
 *     });
 */
ErrorStatsServiceClient.prototype.listEvents = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listEvents(request, options, callback);
};

/**
 * Equivalent to {@link listEvents}, but returns a NodeJS Stream object.
 *
 * This fetches the paged responses for {@link listEvents} continuously
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
 * @param {string} request.projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project
 *   ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {string} request.groupId
 *   [Required] The group for which events shall be returned.
 * @param {Object=} request.serviceFilter
 *   [Optional] List only ErrorGroups which belong to a service context that
 *   matches the filter.
 *   Data for all service contexts is returned if this field is not specified.
 *
 *   This object should have the same structure as [ServiceContextFilter]{@link ServiceContextFilter}
 * @param {Object=} request.timeRange
 *   [Optional] List only data for the given time range.
 *   If not set a default time range is used. The field time_range_begin
 *   in the response will specify the beginning of this time range.
 *
 *   This object should have the same structure as [QueryTimeRange]{@link QueryTimeRange}
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @return {Stream}
 *   An object stream which emits an object representing [ErrorEvent]{@link ErrorEvent} on 'data' event.
 *
 * @example
 *
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 * var formattedProjectName = client.projectPath("[PROJECT]");
 * var groupId = '';
 * var request = {
 *     projectName: formattedProjectName,
 *     groupId: groupId
 * };
 * client.listEventsStream(request).on('data', function(element) {
 *     // doThingsWith(element)
 * }).on('error', function(err) {
 *     console.error(err);
 * });
 */
ErrorStatsServiceClient.prototype.listEventsStream = function(request, options) {
  if (options === undefined) {
    options = {};
  }

  return PAGE_DESCRIPTORS.listEvents.createStream(this._listEvents, request, options);
};

/**
 * Deletes all error events of a given project.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project
 *   ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [DeleteEventsResponse]{@link DeleteEventsResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [DeleteEventsResponse]{@link DeleteEventsResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = errorreportingV1beta1.errorStatsServiceClient();
 * var formattedProjectName = client.projectPath("[PROJECT]");
 * client.deleteEvents({projectName: formattedProjectName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
ErrorStatsServiceClient.prototype.deleteEvents = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._deleteEvents(request, options, callback);
};

function ErrorStatsServiceClientBuilder(gaxGrpc) {
  if (!(this instanceof ErrorStatsServiceClientBuilder)) {
    return new ErrorStatsServiceClientBuilder(gaxGrpc);
  }

  var errorStatsServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto'
  }]);
  extend(this, errorStatsServiceClient.google.devtools.clouderrorreporting.v1beta1);


  /**
   * Build a new instance of {@link ErrorStatsServiceClient}.
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
  this.errorStatsServiceClient = function(opts) {
    return new ErrorStatsServiceClient(gaxGrpc, errorStatsServiceClient, opts);
  };
  extend(this.errorStatsServiceClient, ErrorStatsServiceClient);
}
module.exports = ErrorStatsServiceClientBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;