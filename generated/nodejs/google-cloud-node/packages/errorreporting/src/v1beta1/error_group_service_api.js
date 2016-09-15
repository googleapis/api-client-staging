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
 * https://github.com/googleapis/googleapis/blob/master/google/devtools/clouderrorreporting/v1beta1/error_group_service.proto,
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
var configData = require('./error_group_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'clouderrorreporting.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

var DEFAULT_TIMEOUT = 30;

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform'
];

/**
 * Service for retrieving and updating individual error groups.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link errorGroupServiceApi}
 *
 * @example
 * var clouderrorreportingV1beta1 = require('@google-cloud/errorreporting').v1beta1({
 *   // optional auth parameters.
 * });
 * var api = clouderrorreportingV1beta1.errorGroupServiceApi();
 *
 * @class
 */
function ErrorGroupServiceApi(gaxGrpc, grpcClients, opts) {
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
      'google.devtools.clouderrorreporting.v1beta1.ErrorGroupService',
      configData,
      clientConfig,
      timeout,
      null,
      null,
      {'x-goog-api-client': googleApiClient});

  var errorGroupServiceStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.errorGroupServiceClient.google.devtools.clouderrorreporting.v1beta1.ErrorGroupService,
      {sslCreds: sslCreds});
  var errorGroupServiceStubMethods = [
    'getGroup',
    'updateGroup'
  ];
  errorGroupServiceStubMethods.forEach(function(methodName) {
    this['_' + methodName] = gax.createApiCall(
      errorGroupServiceStub.then(function(errorGroupServiceStub) {
        return errorGroupServiceStub[methodName].bind(errorGroupServiceStub);
      }),
      defaults[methodName]);
  }.bind(this));
}

// Path templates

var GROUP_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/groups/{group}');

/**
 * Returns a fully-qualified group resource name string.
 * @param {String} project
 * @param {String} group
 * @returns {String}
 */
ErrorGroupServiceApi.prototype.groupPath = function groupPath(project, group) {
  return GROUP_PATH_TEMPLATE.render({
    project: project,
    group: group
  });
};

/**
 * Parses the groupName from a group resource.
 * @param {String} groupName
 *   A fully-qualified path representing a group resources.
 * @returns {String} - A string representing the project.
 */
ErrorGroupServiceApi.prototype.matchProjectFromGroupName =
    function matchProjectFromGroupName(groupName) {
  return GROUP_PATH_TEMPLATE.match(groupName).project;
};

/**
 * Parses the groupName from a group resource.
 * @param {String} groupName
 *   A fully-qualified path representing a group resources.
 * @returns {String} - A string representing the group.
 */
ErrorGroupServiceApi.prototype.matchGroupFromGroupName =
    function matchGroupFromGroupName(groupName) {
  return GROUP_PATH_TEMPLATE.match(groupName).group;
};

// Service calls

/**
 * Get the specified group.
 *
 * @param {string} groupName
 *   [Required] The group resource name. Written as
 *   <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>.
 *   Call
 *   <a href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list">
 *   <code>groupStats.list</code></a> to return a list of groups belonging to
 *   this project.
 *
 *   Example: <code>projects/my-project-123/groups/my-group</code>
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ErrorGroup]{@link ErrorGroup}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorGroupServiceApi();
 * var formattedGroupName = api.groupPath("[PROJECT]", "[GROUP]");
 * api.getGroup(formattedGroupName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
ErrorGroupServiceApi.prototype.getGroup = function getGroup() {
  var args = arguejs({
    groupName: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    group_name: args.groupName
  };
  return this._getGroup(req, args.options, args.callback);
};

/**
 * Replace the data for the specified group.
 * Fails if the group does not exist.
 *
 * @param {Object} group
 *   [Required] The group which replaces the resource on the server.
 *
 *   This object should have the same structure as [ErrorGroup]{@link ErrorGroup}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ErrorGroup]{@link ErrorGroup}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = clouderrorreportingV1beta1.errorGroupServiceApi();
 * var group = {};
 * api.updateGroup(group, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
ErrorGroupServiceApi.prototype.updateGroup = function updateGroup() {
  var args = arguejs({
    group: Object,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    group: args.group
  };
  return this._updateGroup(req, args.options, args.callback);
};

function ErrorGroupServiceApiBuilder(gaxGrpc) {
  if (!(this instanceof ErrorGroupServiceApiBuilder)) {
    return new ErrorGroupServiceApiBuilder(gaxGrpc);
  }

  var errorGroupServiceClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/devtools/clouderrorreporting/v1beta1/error_group_service.proto'
  }]);
  extend(this, errorGroupServiceClient.google.devtools.clouderrorreporting.v1beta1);

  var grpcClients = {
    errorGroupServiceClient: errorGroupServiceClient
  };

  /**
   * Build a new instance of {@link ErrorGroupServiceApi}.
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
  this.errorGroupServiceApi = function(opts) {
    return new ErrorGroupServiceApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.errorGroupServiceApi, ErrorGroupServiceApi);
}
module.exports = ErrorGroupServiceApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;