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
 * https://github.com/googleapis/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto,
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

var configData = require('./report_errors_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

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
 * An API for reporting error events.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link reportErrorsServiceApi}
 *
 * @example
 * var clouderrorreportingV1beta1 = require('@google-cloud/errorreporting').v1beta1({
 *   // optional auth parameters.
 * });
 * var api = clouderrorreportingV1beta1.reportErrorsServiceApi();
 *
 * @class
 */
function ReportErrorsServiceApi(gaxGrpc, grpcClients, opts) {
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
      'google.devtools.clouderrorreporting.v1beta1.ReportErrorsService',
      configData,
      clientConfig,
      null,
      null,
      {'x-goog-api-client': googleApiClient});

  var reportErrorsServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.reportErrorsServiceClient.google.devtools.clouderrorreporting.v1beta1.ReportErrorsService,
      {sslCreds: sslCreds});
  var reportErrorsServiceStubMethods = [
    'reportErrorEvent'
  ];
  reportErrorsServiceStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      reportErrorsServiceStub.then(function(reportErrorsServiceStub) {
        return reportErrorsServiceStub[methodName].bind(reportErrorsServiceStub);
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
ReportErrorsServiceApi.prototype.projectPath = function projectPath(project) {
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
ReportErrorsServiceApi.prototype.matchProjectFromProjectName =
    function matchProjectFromProjectName(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

// Service calls

/**
 * Report an individual error event.
 *
 * This endpoint accepts <strong>either</strong> an OAuth token,
 * <strong>or</strong> an
 * <a href="https://support.google.com/cloud/answer/6158862">API key</a>
 * for authentication. To use an API key, append it to the URL as the value of
 * a `key` parameter. For example:
 * <pre>POST https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>
 *
 * @param {string} projectName
 *   [Required] The resource name of the Google Cloud Platform project. Written
 *   as `projects/` plus the
 *   [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840).
 *   Example: `projects/my-project-123`.
 * @param {Object} event
 *   [Required] The error event to be reported.
 *
 *   This object should have the same structure as [ReportedErrorEvent]{@link ReportedErrorEvent}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ReportErrorEventResponse]{@link ReportErrorEventResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.reportErrorsServiceApi();
 * var formattedProjectName = api.projectPath("[PROJECT]");
 * var event = {};
 * api.reportErrorEvent(formattedProjectName, event, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
ReportErrorsServiceApi.prototype.reportErrorEvent = function reportErrorEvent(
    projectName,
    event,
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
    event: event
  };
  return this._reportErrorEvent(req, options, callback);
};

function ReportErrorsServiceApiBuilder(gaxGrpc) {
  if (!(this instanceof ReportErrorsServiceApiBuilder)) {
    return new ReportErrorsServiceApiBuilder(gaxGrpc);
  }

  var reportErrorsServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto'
  }]);
  extend(this, reportErrorsServiceClient.google.devtools.clouderrorreporting.v1beta1);

  var grpcClients = {
    reportErrorsServiceClient: reportErrorsServiceClient
  };

  /**
   * Build a new instance of {@link ReportErrorsServiceApi}.
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
  this.reportErrorsServiceApi = function(opts) {
    return new ReportErrorsServiceApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.reportErrorsServiceApi, ReportErrorsServiceApi);
}
module.exports = ReportErrorsServiceApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;