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
 * https://github.com/googleapis/googleapis/blob/master/google/logging/v2/logging_metrics.proto,
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

var configData = require('./metrics_service_v2_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'logging.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';


var PAGE_DESCRIPTORS = {
  listLogMetrics: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'metrics')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform',
  'https://www.googleapis.com/auth/cloud-platform.read-only',
  'https://www.googleapis.com/auth/logging.admin',
  'https://www.googleapis.com/auth/logging.read',
  'https://www.googleapis.com/auth/logging.write'
];

/**
 * Service for configuring logs-based metrics.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link metricsServiceV2Api}
 *
 * @example
 * var loggingV2 = require('@google-cloud/logging').v2({
 *   // optional auth parameters.
 * });
 * var api = loggingV2.metricsServiceV2Api();
 *
 * @class
 */
function MetricsServiceV2Api(gaxGrpc, grpcClients, opts) {
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
      'google.logging.v2.MetricsServiceV2',
      configData,
      clientConfig,
      PAGE_DESCRIPTORS,
      null,
      {'x-goog-api-client': googleApiClient});

  var metricsServiceV2Stub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.metricsServiceV2Client.google.logging.v2.MetricsServiceV2,
      {sslCreds: sslCreds});
  var metricsServiceV2StubMethods = [
    'listLogMetrics',
    'getLogMetric',
    'createLogMetric',
    'updateLogMetric',
    'deleteLogMetric'
  ];
  metricsServiceV2StubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      metricsServiceV2Stub.then(function(metricsServiceV2Stub) {
        return metricsServiceV2Stub[methodName].bind(metricsServiceV2Stub);
      }),
      defaults[methodName]);
  }.bind(this));
}

// Path templates

var PARENT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}');

var METRIC_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/metrics/{metric}');

/**
 * Returns a fully-qualified parent resource name string.
 * @param {String} project
 * @returns {String}
 */
MetricsServiceV2Api.prototype.parentPath = function parentPath(project) {
  return PARENT_PATH_TEMPLATE.render({
    project: project
  });
};

/**
 * Parses the parentName from a parent resource.
 * @param {String} parentName
 *   A fully-qualified path representing a parent resources.
 * @returns {String} - A string representing the project.
 */
MetricsServiceV2Api.prototype.matchProjectFromParentName =
    function matchProjectFromParentName(parentName) {
  return PARENT_PATH_TEMPLATE.match(parentName).project;
};

/**
 * Returns a fully-qualified metric resource name string.
 * @param {String} project
 * @param {String} metric
 * @returns {String}
 */
MetricsServiceV2Api.prototype.metricPath = function metricPath(project, metric) {
  return METRIC_PATH_TEMPLATE.render({
    project: project,
    metric: metric
  });
};

/**
 * Parses the metricName from a metric resource.
 * @param {String} metricName
 *   A fully-qualified path representing a metric resources.
 * @returns {String} - A string representing the project.
 */
MetricsServiceV2Api.prototype.matchProjectFromMetricName =
    function matchProjectFromMetricName(metricName) {
  return METRIC_PATH_TEMPLATE.match(metricName).project;
};

/**
 * Parses the metricName from a metric resource.
 * @param {String} metricName
 *   A fully-qualified path representing a metric resources.
 * @returns {String} - A string representing the metric.
 */
MetricsServiceV2Api.prototype.matchMetricFromMetricName =
    function matchMetricFromMetricName(metricName) {
  return METRIC_PATH_TEMPLATE.match(metricName).metric;
};

// Service calls

/**
 * Lists logs-based metrics.
 *
 * @param {string} parent
 *   Required. The resource name containing the metrics.
 *   Example: `"projects/my-project-id"`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 *
 *   In addition, options may contain the following optional parameters.
 * @param {number=} options.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 *
 * @param {function(?Error, ?Object, ?string)=} callback
 *   When specified, the results are not streamed but this callback
 *   will be called with the response object representing [ListLogMetricsResponse]{@link ListLogMetricsResponse}.
 *   The third item will be set if the response contains the token for the further results
 *   and can be reused to `pageToken` field in the options in the next request.
 * @returns {Stream|gax.EventEmitter}
 *   An object stream which emits an object representing
 *   [LogMetric]{@link LogMetric} on 'data' event.
 *   When the callback is specified or streaming is suppressed through options,
 *   it will return an event emitter to handle the call status and the callback
 *   will be called with the response object.
 *
 * @example
 *
 * var api = loggingV2.metricsServiceV2Api();
 * var formattedParent = api.parentPath("[PROJECT]");
 * // Iterate over all elements.
 * api.listLogMetrics(formattedParent).on('data', function(element) {
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
 *         api.listLogMetrics(formattedParent, {pageToken: nextPageToken}, callback);
 *     }
 * }
 * api.listLogMetrics(formattedParent, {flattenPages: false}, callback);
 */
MetricsServiceV2Api.prototype.listLogMetrics = function listLogMetrics(
    parent,
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
    parent: parent
  };
  if ('pageSize' in options) {
    req.pageSize = options.pageSize;
  }
  return this._listLogMetrics(req, options, callback);
};

/**
 * Gets a logs-based metric.
 *
 * @param {string} metricName
 *   The resource name of the desired metric.
 *   Example: `"projects/my-project-id/metrics/my-metric-id"`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [LogMetric]{@link LogMetric}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = loggingV2.metricsServiceV2Api();
 * var formattedMetricName = api.metricPath("[PROJECT]", "[METRIC]");
 * api.getLogMetric(formattedMetricName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
MetricsServiceV2Api.prototype.getLogMetric = function getLogMetric(
    metricName,
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
    metricName: metricName
  };
  return this._getLogMetric(req, options, callback);
};

/**
 * Creates a logs-based metric.
 *
 * @param {string} parent
 *   The resource name of the project in which to create the metric.
 *   Example: `"projects/my-project-id"`.
 *
 *   The new metric must be provided in the request.
 * @param {Object} metric
 *   The new logs-based metric, which must not have an identifier that
 *   already exists.
 *
 *   This object should have the same structure as [LogMetric]{@link LogMetric}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [LogMetric]{@link LogMetric}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = loggingV2.metricsServiceV2Api();
 * var formattedParent = api.parentPath("[PROJECT]");
 * var metric = {};
 * api.createLogMetric(formattedParent, metric, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
MetricsServiceV2Api.prototype.createLogMetric = function createLogMetric(
    parent,
    metric,
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
    parent: parent,
    metric: metric
  };
  return this._createLogMetric(req, options, callback);
};

/**
 * Creates or updates a logs-based metric.
 *
 * @param {string} metricName
 *   The resource name of the metric to update.
 *   Example: `"projects/my-project-id/metrics/my-metric-id"`.
 *
 *   The updated metric must be provided in the request and have the
 *   same identifier that is specified in `metricName`.
 *   If the metric does not exist, it is created.
 * @param {Object} metric
 *   The updated metric, whose name must be the same as the
 *   metric identifier in `metricName`. If `metricName` does not
 *   exist, then a new metric is created.
 *
 *   This object should have the same structure as [LogMetric]{@link LogMetric}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [LogMetric]{@link LogMetric}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = loggingV2.metricsServiceV2Api();
 * var formattedMetricName = api.metricPath("[PROJECT]", "[METRIC]");
 * var metric = {};
 * api.updateLogMetric(formattedMetricName, metric, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
MetricsServiceV2Api.prototype.updateLogMetric = function updateLogMetric(
    metricName,
    metric,
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
    metricName: metricName,
    metric: metric
  };
  return this._updateLogMetric(req, options, callback);
};

/**
 * Deletes a logs-based metric.
 *
 * @param {string} metricName
 *   The resource name of the metric to delete.
 *   Example: `"projects/my-project-id/metrics/my-metric-id"`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = loggingV2.metricsServiceV2Api();
 * var formattedMetricName = api.metricPath("[PROJECT]", "[METRIC]");
 * api.deleteLogMetric(formattedMetricName, function(err) {
 *     if (err) {
 *         console.error(err);
 *     }
 * });
 */
MetricsServiceV2Api.prototype.deleteLogMetric = function deleteLogMetric(
    metricName,
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
    metricName: metricName
  };
  return this._deleteLogMetric(req, options, callback);
};

function MetricsServiceV2ApiBuilder(gaxGrpc) {
  if (!(this instanceof MetricsServiceV2ApiBuilder)) {
    return new MetricsServiceV2ApiBuilder(gaxGrpc);
  }

  var metricsServiceV2Client = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/logging/v2/logging_metrics.proto'
  }]);
  extend(this, metricsServiceV2Client.google.logging.v2);

  var grpcClients = {
    metricsServiceV2Client: metricsServiceV2Client
  };

  /**
   * Build a new instance of {@link MetricsServiceV2Api}.
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
  this.metricsServiceV2Api = function(opts) {
    return new MetricsServiceV2Api(gaxGrpc, grpcClients, opts);
  };
  extend(this.metricsServiceV2Api, MetricsServiceV2Api);
}
module.exports = MetricsServiceV2ApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;