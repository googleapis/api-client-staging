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
 *
 * EDITING INSTRUCTIONS
 * This file was generated from the file
 * https://github.com/googleapis/googleapis/blob/master/google/iam/admin/v1/iam.proto,
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

var configData = require('./iam_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'iam.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.7.1';

var PAGE_DESCRIPTORS = {
  listServiceAccounts: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'accounts')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/cloud-platform',
  'https://www.googleapis.com/auth/iam'
];

/**
 * Creates and manages service account objects.
 *
 * Service account is an account that belongs to your project instead
 * of to an individual end user. It is used to authenticate calls
 * to a Google API.
 *
 * To create a service account, specify the `project_id` and `account_id`
 * for the account.  The `account_id` is unique within the project, and used
 * to generate the service account email address and a stable
 * `unique_id`.
 *
 * All other methods can identify accounts using the format
 * `projects/{project}/serviceAccounts/{account}`.
 * Using `-` as a wildcard for the project will infer the project from
 * the account. The `account` value can be the `email` address or the
 * `unique_id` of the service account.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link iamClient}
 *
 * @example
 * var iamV1 = require('@google-cloud/iam').v1({
 *   // optional auth parameters.
 * });
 * var client = iamV1.iamClient();
 *
 * @class
 */
function IamClient(gaxGrpc, grpcClients, opts) {
  opts = extend({
    servicePath: SERVICE_ADDRESS,
    port: DEFAULT_SERVICE_PORT,
    clientConfig: {}
  }, opts);

  var googleApiClient = [
    'gl-node/' + process.versions.node
  ];
  if (opts.libName && opts.libVersion) {
    googleApiClient.push(opts.libName + '/' + opts.libVersion);
  }
  googleApiClient.push(
    CODE_GEN_NAME_VERSION,
    'gax/' + gax.version,
    'grpc/' + gaxGrpc.grpcVersion
  );

  var defaults = gaxGrpc.constructSettings(
      'google.iam.admin.v1.IAM',
      configData,
      opts.clientConfig,
      {'x-goog-api-client': googleApiClient.join(' ')});

  var self = this;

  this.auth = gaxGrpc.auth;
  var iamStub = gaxGrpc.createStub(
      grpcClients.google.iam.admin.v1.IAM,
      opts);
  var iamStubMethods = [
    'listServiceAccounts',
    'getServiceAccount',
    'createServiceAccount',
    'updateServiceAccount',
    'deleteServiceAccount',
    'listServiceAccountKeys',
    'getServiceAccountKey',
    'createServiceAccountKey',
    'deleteServiceAccountKey',
    'signBlob',
    'getIamPolicy',
    'setIamPolicy',
    'testIamPermissions',
    'queryGrantableRoles'
  ];
  iamStubMethods.forEach(function(methodName) {
    self['_' + methodName] = gax.createApiCall(
      iamStub.then(function(iamStub) {
        return function() {
          var args = Array.prototype.slice.call(arguments, 0);
          return iamStub[methodName].apply(iamStub, args);
        };
      }),
      defaults[methodName],
      PAGE_DESCRIPTORS[methodName]);
  });
}

// Path templates

var PROJECT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}');

var SERVICE_ACCOUNT_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/serviceAccounts/{service_account}');

var KEY_PATH_TEMPLATE = new gax.PathTemplate(
    'projects/{project}/serviceAccounts/{service_account}/keys/{key}');

/**
 * Returns a fully-qualified project resource name string.
 * @param {String} project
 * @returns {String}
 */
IamClient.prototype.projectPath = function(project) {
  return PROJECT_PATH_TEMPLATE.render({
    project: project
  });
};

/**
 * Returns a fully-qualified service_account resource name string.
 * @param {String} project
 * @param {String} serviceAccount
 * @returns {String}
 */
IamClient.prototype.serviceAccountPath = function(project, serviceAccount) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.render({
    project: project,
    service_account: serviceAccount
  });
};

/**
 * Returns a fully-qualified key resource name string.
 * @param {String} project
 * @param {String} serviceAccount
 * @param {String} key
 * @returns {String}
 */
IamClient.prototype.keyPath = function(project, serviceAccount, key) {
  return KEY_PATH_TEMPLATE.render({
    project: project,
    service_account: serviceAccount,
    key: key
  });
};

/**
 * Parses the projectName from a project resource.
 * @param {String} projectName
 *   A fully-qualified path representing a project resources.
 * @returns {String} - A string representing the project.
 */
IamClient.prototype.matchProjectFromProjectName = function(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

/**
 * Parses the serviceAccountName from a service_account resource.
 * @param {String} serviceAccountName
 *   A fully-qualified path representing a service_account resources.
 * @returns {String} - A string representing the project.
 */
IamClient.prototype.matchProjectFromServiceAccountName = function(serviceAccountName) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.match(serviceAccountName).project;
};

/**
 * Parses the serviceAccountName from a service_account resource.
 * @param {String} serviceAccountName
 *   A fully-qualified path representing a service_account resources.
 * @returns {String} - A string representing the service_account.
 */
IamClient.prototype.matchServiceAccountFromServiceAccountName = function(serviceAccountName) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.match(serviceAccountName).service_account;
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the project.
 */
IamClient.prototype.matchProjectFromKeyName = function(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).project;
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the service_account.
 */
IamClient.prototype.matchServiceAccountFromKeyName = function(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).service_account;
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the key.
 */
IamClient.prototype.matchKeyFromKeyName = function(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).key;
};

/**
 * Get the project ID used by this class.
 * @param {function(Error, string)} callback - the callback to be called with
 *   the current project Id.
 */
IamClient.prototype.getProjectId = function(callback) {
  return this.auth.getProjectId(callback);
};

// Service calls

/**
 * Lists {@link ServiceAccounts} for a project.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   Required. The resource name of the project associated with the service
 *   accounts, such as `projects/my-project-123`.
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
 *   The second parameter to the callback is Array of [ServiceAccount]{@link ServiceAccount}.
 *
 *   When autoPaginate: false is specified through options, it contains the result
 *   in a single response. If the response indicates the next page exists, the third
 *   parameter is set to be used for the next request object. The fourth parameter keeps
 *   the raw response object of an object representing [ListServiceAccountsResponse]{@link ListServiceAccountsResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is Array of [ServiceAccount]{@link ServiceAccount}.
 *
 *   When autoPaginate: false is specified through options, the array has three elements.
 *   The first element is Array of [ServiceAccount]{@link ServiceAccount} in a single response.
 *   The second element is the next request object if the response
 *   indicates the next page exists, or null. The third element is
 *   an object representing [ListServiceAccountsResponse]{@link ListServiceAccountsResponse}.
 *
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.projectPath("[PROJECT]");
 * // Iterate over all elements.
 * client.listServiceAccounts({name: formattedName}).then(function(responses) {
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
 *         return client.listServiceAccounts(nextRequest, options).then(callback);
 *     }
 * }
 * client.listServiceAccounts({name: formattedName}, options)
 *     .then(callback)
 *     .catch(function(err) {
 *         console.error(err);
 *     });
 */
IamClient.prototype.listServiceAccounts = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listServiceAccounts(request, options, callback);
};

/**
 * Equivalent to {@link listServiceAccounts}, but returns a NodeJS Stream object.
 *
 * This fetches the paged responses for {@link listServiceAccounts} continuously
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
 * @param {string} request.name
 *   Required. The resource name of the project associated with the service
 *   accounts, such as `projects/my-project-123`.
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
 *   An object stream which emits an object representing [ServiceAccount]{@link ServiceAccount} on 'data' event.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.projectPath("[PROJECT]");
 * client.listServiceAccountsStream({name: formattedName}).on('data', function(element) {
 *     // doThingsWith(element)
 * }).on('error', function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.listServiceAccountsStream = function(request, options) {
  if (options === undefined) {
    options = {};
  }

  return PAGE_DESCRIPTORS.listServiceAccounts.createStream(this._listServiceAccounts, request, options);
};

/**
 * Gets a {@link ServiceAccount}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ServiceAccount]{@link ServiceAccount}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * client.getServiceAccount({name: formattedName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.getServiceAccount = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._getServiceAccount(request, options, callback);
};

/**
 * Creates a {@link ServiceAccount}
 * and returns it.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   Required. The resource name of the project associated with the service
 *   accounts, such as `projects/my-project-123`.
 * @param {string} request.accountId
 *   Required. The account id that is used to generate the service account
 *   email address and a stable unique id. It is unique within a project,
 *   must be 6-30 characters long, and match the regular expression
 *   `[a-z](https://cloud.google.com[-a-z0-9]*[a-z0-9])` to comply with RFC1035.
 * @param {Object=} request.serviceAccount
 *   The {@link ServiceAccount} resource to create.
 *   Currently, only the following values are user assignable:
 *   `display_name` .
 *
 *   This object should have the same structure as [ServiceAccount]{@link ServiceAccount}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ServiceAccount]{@link ServiceAccount}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.projectPath("[PROJECT]");
 * var accountId = '';
 * var request = {
 *     name: formattedName,
 *     accountId: accountId
 * };
 * client.createServiceAccount(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.createServiceAccount = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._createServiceAccount(request, options, callback);
};

/**
 * Updates a {@link ServiceAccount}.
 *
 * Currently, only the following fields are updatable:
 * `display_name` .
 * The `etag` is mandatory.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.etag
 *   Used to perform a consistent read-modify-write.
 * @param {string=} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *
 *   Requests using `-` as a wildcard for the project will infer the project
 *   from the `account` and the `account` value can be the `email` address or
 *   the `unique_id` of the service account.
 *
 *   In responses the resource name will always be in the format
 *   `projects/{project}/serviceAccounts/{email}`.
 * @param {string=} request.projectId
 *   @OutputOnly The id of the project that owns the service account.
 * @param {string=} request.uniqueId
 *   @OutputOnly The unique and stable id of the service account.
 * @param {string=} request.email
 *   @OutputOnly The email address of the service account.
 * @param {string=} request.displayName
 *   Optional. A user-specified description of the service account.  Must be
 *   fewer than 100 UTF-8 bytes.
 * @param {string=} request.oauth2ClientId
 *   @OutputOnly. The OAuth2 client id for the service account.
 *   This is used in conjunction with the OAuth2 clientconfig API to make
 *   three legged OAuth2 (3LO) flows to access the data of Google users.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ServiceAccount]{@link ServiceAccount}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var etag = '';
 * client.updateServiceAccount({etag: etag}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.updateServiceAccount = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._updateServiceAccount(request, options, callback);
};

/**
 * Deletes a {@link ServiceAccount}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
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
 * var client = iamV1.iamClient();
 * var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * client.deleteServiceAccount({name: formattedName}).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.deleteServiceAccount = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._deleteServiceAccount(request, options, callback);
};

/**
 * Lists {@link ServiceAccountKeys}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *
 *   Using `-` as a wildcard for the project, will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {number[]=} request.keyTypes
 *   Filters the types of keys the user wants to include in the list
 *   response. Duplicate key types are not allowed. If no key type
 *   is provided, all keys are returned.
 *
 *   The number should be among the values of [KeyType]{@link KeyType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ListServiceAccountKeysResponse]{@link ListServiceAccountKeysResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ListServiceAccountKeysResponse]{@link ListServiceAccountKeysResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * client.listServiceAccountKeys({name: formattedName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.listServiceAccountKeys = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listServiceAccountKeys(request, options, callback);
};

/**
 * Gets the {@link ServiceAccountKey}
 * by key id.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account key in the following format:
 *   `projects/{project}/serviceAccounts/{account}/keys/{key}`.
 *
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {number=} request.publicKeyType
 *   The output format of the public key requested.
 *   X509_PEM is the default output format.
 *
 *   The number should be among the values of [ServiceAccountPublicKeyType]{@link ServiceAccountPublicKeyType}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccountKey]{@link ServiceAccountKey}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ServiceAccountKey]{@link ServiceAccountKey}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
 * client.getServiceAccountKey({name: formattedName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.getServiceAccountKey = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._getServiceAccountKey(request, options, callback);
};

/**
 * Creates a {@link ServiceAccountKey}
 * and returns it.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {number=} request.privateKeyType
 *   The output format of the private key. `GOOGLE_CREDENTIALS_FILE` is the
 *   default output format.
 *
 *   The number should be among the values of [ServiceAccountPrivateKeyType]{@link ServiceAccountPrivateKeyType}
 * @param {number=} request.keyAlgorithm
 *   Which type of key and algorithm to use for the key.
 *   The default is currently a 4K RSA key.  However this may change in the
 *   future.
 *
 *   The number should be among the values of [ServiceAccountKeyAlgorithm]{@link ServiceAccountKeyAlgorithm}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccountKey]{@link ServiceAccountKey}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [ServiceAccountKey]{@link ServiceAccountKey}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * client.createServiceAccountKey({name: formattedName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.createServiceAccountKey = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._createServiceAccountKey(request, options, callback);
};

/**
 * Deletes a {@link ServiceAccountKey}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account key in the following format:
 *   `projects/{project}/serviceAccounts/{account}/keys/{key}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
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
 * var client = iamV1.iamClient();
 * var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
 * client.deleteServiceAccountKey({name: formattedName}).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.deleteServiceAccountKey = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._deleteServiceAccountKey(request, options, callback);
};

/**
 * Signs a blob using a service account's system-managed private key.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {string} request.bytesToSign
 *   The bytes to sign.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [SignBlobResponse]{@link SignBlobResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [SignBlobResponse]{@link SignBlobResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var bytesToSign = '';
 * var request = {
 *     name: formattedName,
 *     bytesToSign: bytesToSign
 * };
 * client.signBlob(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.signBlob = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._signBlob(request, options, callback);
};

/**
 * Returns the IAM access control policy for a
 * {@link ServiceAccount}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy is being requested.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Policy]{@link Policy}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * client.getIamPolicy({resource: formattedResource}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.getIamPolicy = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._getIamPolicy(request, options, callback);
};

/**
 * Sets the IAM access control policy for a
 * {@link ServiceAccount}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy is being specified.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {Object} request.policy
 *   REQUIRED: The complete policy to be applied to the `resource`. The size of
 *   the policy is limited to a few 10s of KB. An empty policy is a
 *   valid policy but certain Cloud Platform services (such as Projects)
 *   might reject them.
 *
 *   This object should have the same structure as [Policy]{@link Policy}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Policy]{@link Policy}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var policy = {};
 * var request = {
 *     resource: formattedResource,
 *     policy: policy
 * };
 * client.setIamPolicy(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.setIamPolicy = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._setIamPolicy(request, options, callback);
};

/**
 * Tests the specified permissions against the IAM access control policy
 * for a {@link ServiceAccount}.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.resource
 *   REQUIRED: The resource for which the policy detail is being requested.
 *   `resource` is usually specified as a path. For example, a Project
 *   resource is specified as `projects/{project}`.
 * @param {string[]} request.permissions
 *   The set of permissions to check for the `resource`. Permissions with
 *   wildcards (such as '*' or 'storage.*') are not allowed. For more
 *   information see
 *   [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link TestIamPermissionsResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [TestIamPermissionsResponse]{@link TestIamPermissionsResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var permissions = [];
 * var request = {
 *     resource: formattedResource,
 *     permissions: permissions
 * };
 * client.testIamPermissions(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.testIamPermissions = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._testIamPermissions(request, options, callback);
};

/**
 * Queries roles that can be granted on a particular resource.
 * A role is grantable if it can be used as the role in a binding for a policy
 * for that resource.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.fullResourceName
 *   Required. The full resource name to query from the list of grantable roles.
 *
 *   The name follows the Google Cloud Platform resource format.
 *   For example, a Cloud Platform project with id `my-project` will be named
 *   `//cloudresourcemanager.googleapis.com/projects/my-project`.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [QueryGrantableRolesResponse]{@link QueryGrantableRolesResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [QueryGrantableRolesResponse]{@link QueryGrantableRolesResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = iamV1.iamClient();
 * var fullResourceName = '';
 * client.queryGrantableRoles({fullResourceName: fullResourceName}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
IamClient.prototype.queryGrantableRoles = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._queryGrantableRoles(request, options, callback);
};

function IamClientBuilder(gaxGrpc) {
  if (!(this instanceof IamClientBuilder)) {
    return new IamClientBuilder(gaxGrpc);
  }

  var iamClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/iam/admin/v1/iam.proto'
  }]);
  extend(this, iamClient.google.iam.admin.v1);


  /**
   * Build a new instance of {@link IamClient}.
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
   */
  this.iamClient = function(opts) {
    return new IamClient(gaxGrpc, iamClient, opts);
  };
  extend(this.iamClient, IamClient);
}
module.exports = IamClientBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;