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

var arguejs = require('arguejs');
var configData = require('./iam_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'iam.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.1.0';

var DEFAULT_TIMEOUT = 30;

var PAGE_DESCRIPTORS = {
  listServiceAccounts: new gax.PageDescriptor(
      'page_token',
      'next_page_token',
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
 * @see {@link iamApi}
 *
 * @example
 * var adminV1 = require('@google-cloud/iam').v1({
 *   // optional auth parameters.
 * });
 * var api = adminV1.iamApi();
 *
 * @class
 */
function IAMApi(gaxGrpc, grpcClients, opts) {
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
      'google.iam.admin.v1.IAM',
      configData,
      clientConfig,
      timeout,
      PAGE_DESCRIPTORS,
      null,
      {'x-goog-api-client': googleApiClient});

  var iamStub = gaxGrpc.createStub(
      servicePath,
      port,
      grpcClients.iamClient.google.iam.admin.v1.IAM,
      {sslCreds: sslCreds});
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
    this['_' + methodName] = gax.createApiCall(
      iamStub.then(function(iamStub) {
        return iamStub[methodName].bind(iamStub);
      }),
      defaults[methodName]);
  }.bind(this));
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
IAMApi.prototype.projectPath = function projectPath(project) {
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
IAMApi.prototype.matchProjectFromProjectName =
    function matchProjectFromProjectName(projectName) {
  return PROJECT_PATH_TEMPLATE.match(projectName).project;
};

/**
 * Returns a fully-qualified service_account resource name string.
 * @param {String} project
 * @param {String} service_account
 * @returns {String}
 */
IAMApi.prototype.serviceAccountPath = function serviceAccountPath(project, service_account) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.render({
    project: project,
    service_account: service_account
  });
};

/**
 * Parses the serviceAccountName from a service_account resource.
 * @param {String} serviceAccountName
 *   A fully-qualified path representing a service_account resources.
 * @returns {String} - A string representing the project.
 */
IAMApi.prototype.matchProjectFromServiceAccountName =
    function matchProjectFromServiceAccountName(serviceAccountName) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.match(serviceAccountName).project;
};

/**
 * Parses the serviceAccountName from a service_account resource.
 * @param {String} serviceAccountName
 *   A fully-qualified path representing a service_account resources.
 * @returns {String} - A string representing the service_account.
 */
IAMApi.prototype.matchServiceAccountFromServiceAccountName =
    function matchServiceAccountFromServiceAccountName(serviceAccountName) {
  return SERVICE_ACCOUNT_PATH_TEMPLATE.match(serviceAccountName).service_account;
};

/**
 * Returns a fully-qualified key resource name string.
 * @param {String} project
 * @param {String} service_account
 * @param {String} key
 * @returns {String}
 */
IAMApi.prototype.keyPath = function keyPath(project, service_account, key) {
  return KEY_PATH_TEMPLATE.render({
    project: project,
    service_account: service_account,
    key: key
  });
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the project.
 */
IAMApi.prototype.matchProjectFromKeyName =
    function matchProjectFromKeyName(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).project;
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the service_account.
 */
IAMApi.prototype.matchServiceAccountFromKeyName =
    function matchServiceAccountFromKeyName(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).service_account;
};

/**
 * Parses the keyName from a key resource.
 * @param {String} keyName
 *   A fully-qualified path representing a key resources.
 * @returns {String} - A string representing the key.
 */
IAMApi.prototype.matchKeyFromKeyName =
    function matchKeyFromKeyName(keyName) {
  return KEY_PATH_TEMPLATE.match(keyName).key;
};

// Service calls

/**
 * Lists {@link ServiceAccounts} for a project.
 *
 * @param {string} name
 *   Required. The resource name of the project associated with the service
 *   accounts, such as `projects/my-project-123`.
 * @param {Object=} otherArgs
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
 *   [ServiceAccount]{@link ServiceAccount} on 'data' event.
 *   This object can also be configured to emit
 *   pages of the responses through the options parameter.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.projectPath("[PROJECT]");
 * api.listServiceAccounts(formattedName).on('data', function(element) {
 *     // doThingsWith(element)
 * });
 */
IAMApi.prototype.listServiceAccounts = function listServiceAccounts() {
  var args = arguejs({
    name: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  if ('pageSize' in args.otherArgs) {
    req.page_size = args.otherArgs.pageSize;
  }
  return this._listServiceAccounts(req, args.options, args.callback);
};

/**
 * Gets a {@link ServiceAccount}.
 *
 * @param {string} name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * api.getServiceAccount(formattedName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.getServiceAccount = function getServiceAccount() {
  var args = arguejs({
    name: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  return this._getServiceAccount(req, args.options, args.callback);
};

/**
 * Creates a {@link ServiceAccount}
 * and returns it.
 *
 * @param {string} name
 *   Required. The resource name of the project associated with the service
 *   accounts, such as `projects/my-project-123`.
 * @param {string} accountId
 *   Required. The account id that is used to generate the service account
 *   email address and a stable unique id. It is unique within a project,
 *   must be 6-30 characters long, and match the regular expression
 *   `[a-z](https://cloud.google.com[-a-z0-9]*[a-z0-9])` to comply with RFC1035.
 * @param {Object=} otherArgs
 * @param {Object=} otherArgs.serviceAccount
 *   The {@link ServiceAccount} resource to create.
 *   Currently, only the following values are user assignable:
 *   `display_name` .
 *
 *   This object should have the same structure as [ServiceAccount]{@link ServiceAccount}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.projectPath("[PROJECT]");
 * var accountId = '';
 * api.createServiceAccount(formattedName, accountId, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.createServiceAccount = function createServiceAccount() {
  var args = arguejs({
    name: String,
    accountId: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name,
    account_id: args.accountId
  };
  if ('serviceAccount' in args.otherArgs) {
    req.service_account = args.otherArgs.serviceAccount;
  }
  return this._createServiceAccount(req, args.options, args.callback);
};

/**
 * Updates a {@link ServiceAccount}.
 *
 * Currently, only the following fields are updatable:
 * `display_name` .
 * The `etag` is mandatory.
 *
 * @param {string} etag
 *   Used to perform a consistent read-modify-write.
 * @param {Object=} otherArgs
 * @param {string=} otherArgs.name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *
 *   Requests using `-` as a wildcard for the project will infer the project
 *   from the `account` and the `account` value can be the `email` address or
 *   the `unique_id` of the service account.
 *
 *   In responses the resource name will always be in the format
 *   `projects/{project}/serviceAccounts/{email}`.
 * @param {string=} otherArgs.projectId
 *   @OutputOnly The id of the project that owns the service account.
 * @param {string=} otherArgs.uniqueId
 *   @OutputOnly The unique and stable id of the service account.
 * @param {string=} otherArgs.email
 *   @OutputOnly The email address of the service account.
 * @param {string=} otherArgs.displayName
 *   Optional. A user-specified description of the service account.  Must be
 *   fewer than 100 UTF-8 bytes.
 * @param {string=} otherArgs.oauth2ClientId
 *   @OutputOnly. The OAuth2 client id for the service account.
 *   This is used in conjunction with the OAuth2 clientconfig API to make
 *   three legged OAuth2 (3LO) flows to access the data of Google users.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccount]{@link ServiceAccount}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var etag = '';
 * api.updateServiceAccount(etag, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.updateServiceAccount = function updateServiceAccount() {
  var args = arguejs({
    etag: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    etag: args.etag
  };
  if ('name' in args.otherArgs) {
    req.name = args.otherArgs.name;
  }
  if ('projectId' in args.otherArgs) {
    req.project_id = args.otherArgs.projectId;
  }
  if ('uniqueId' in args.otherArgs) {
    req.unique_id = args.otherArgs.uniqueId;
  }
  if ('email' in args.otherArgs) {
    req.email = args.otherArgs.email;
  }
  if ('displayName' in args.otherArgs) {
    req.display_name = args.otherArgs.displayName;
  }
  if ('oauth2ClientId' in args.otherArgs) {
    req.oauth2_client_id = args.otherArgs.oauth2ClientId;
  }
  return this._updateServiceAccount(req, args.options, args.callback);
};

/**
 * Deletes a {@link ServiceAccount}.
 *
 * @param {string} name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
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
 * var api = adminV1.iamApi();
 * var formattedName = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * api.deleteServiceAccount(formattedName, function(err) {
 *     if (err) {
 *         console.error(err);
 *     }
 * });
 */
IAMApi.prototype.deleteServiceAccount = function deleteServiceAccount() {
  var args = arguejs({
    name: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  return this._deleteServiceAccount(req, args.options, args.callback);
};

/**
 * Lists {@link ServiceAccountKeys}.
 *
 * @param {string} name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *
 *   Using `-` as a wildcard for the project, will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {Object=} otherArgs
 * @param {number[]=} otherArgs.keyTypes
 *   Filters the types of keys the user wants to include in the list
 *   response. Duplicate key types are not allowed. If no key type
 *   is provided, all keys are returned.
 *
 *   The number should be among the values of [KeyType]{@link KeyType}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ListServiceAccountKeysResponse]{@link ListServiceAccountKeysResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * api.listServiceAccountKeys(formattedName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.listServiceAccountKeys = function listServiceAccountKeys() {
  var args = arguejs({
    name: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  if ('keyTypes' in args.otherArgs) {
    req.key_types = args.otherArgs.keyTypes;
  }
  return this._listServiceAccountKeys(req, args.options, args.callback);
};

/**
 * Gets the {@link ServiceAccountKey}
 * by key id.
 *
 * @param {string} name
 *   The resource name of the service account key in the following format:
 *   `projects/{project}/serviceAccounts/{account}/keys/{key}`.
 *
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {Object=} otherArgs
 * @param {number=} otherArgs.publicKeyType
 *   The output format of the public key requested.
 *   X509_PEM is the default output format.
 *
 *   The number should be among the values of [ServiceAccountPublicKeyType]{@link ServiceAccountPublicKeyType}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccountKey]{@link ServiceAccountKey}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
 * api.getServiceAccountKey(formattedName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.getServiceAccountKey = function getServiceAccountKey() {
  var args = arguejs({
    name: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  if ('publicKeyType' in args.otherArgs) {
    req.public_key_type = args.otherArgs.publicKeyType;
  }
  return this._getServiceAccountKey(req, args.options, args.callback);
};

/**
 * Creates a {@link ServiceAccountKey}
 * and returns it.
 *
 * @param {string} name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {Object=} otherArgs
 * @param {number=} otherArgs.privateKeyType
 *   The output format of the private key. `GOOGLE_CREDENTIALS_FILE` is the
 *   default output format.
 *
 *   The number should be among the values of [ServiceAccountPrivateKeyType]{@link ServiceAccountPrivateKeyType}
 * @param {number=} otherArgs.keyAlgorithm
 *   Which type of key and algorithm to use for the key.
 *   The default is currently a 4K RSA key.  However this may change in the
 *   future.
 *
 *   The number should be among the values of [ServiceAccountKeyAlgorithm]{@link ServiceAccountKeyAlgorithm}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [ServiceAccountKey]{@link ServiceAccountKey}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * api.createServiceAccountKey(formattedName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.createServiceAccountKey = function createServiceAccountKey() {
  var args = arguejs({
    name: String,
    otherArgs: [Object, {}],
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  if ('privateKeyType' in args.otherArgs) {
    req.private_key_type = args.otherArgs.privateKeyType;
  }
  if ('keyAlgorithm' in args.otherArgs) {
    req.key_algorithm = args.otherArgs.keyAlgorithm;
  }
  return this._createServiceAccountKey(req, args.options, args.callback);
};

/**
 * Deletes a {@link ServiceAccountKey}.
 *
 * @param {string} name
 *   The resource name of the service account key in the following format:
 *   `projects/{project}/serviceAccounts/{account}/keys/{key}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
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
 * var api = adminV1.iamApi();
 * var formattedName = api.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
 * api.deleteServiceAccountKey(formattedName, function(err) {
 *     if (err) {
 *         console.error(err);
 *     }
 * });
 */
IAMApi.prototype.deleteServiceAccountKey = function deleteServiceAccountKey() {
  var args = arguejs({
    name: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name
  };
  return this._deleteServiceAccountKey(req, args.options, args.callback);
};

/**
 * Signs a blob using a service account's system-managed private key.
 *
 * @param {string} name
 *   The resource name of the service account in the following format:
 *   `projects/{project}/serviceAccounts/{account}`.
 *   Using `-` as a wildcard for the project will infer the project from
 *   the account. The `account` value can be the `email` address or the
 *   `unique_id` of the service account.
 * @param {string} bytesToSign
 *   The bytes to sign.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [SignBlobResponse]{@link SignBlobResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedName = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var bytesToSign = '';
 * api.signBlob(formattedName, bytesToSign, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.signBlob = function signBlob() {
  var args = arguejs({
    name: String,
    bytesToSign: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    name: args.name,
    bytes_to_sign: args.bytesToSign
  };
  return this._signBlob(req, args.options, args.callback);
};

/**
 * Returns the IAM access control policy for a
 * {@link ServiceAccount}.
 *
 * @param {string} resource
 *   REQUIRED: The resource for which policy is being requested. Resource
 *   is usually specified as a path, such as, projects/{project}.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedResource = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * api.getIamPolicy(formattedResource, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.getIamPolicy = function getIamPolicy() {
  var args = arguejs({
    resource: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    resource: args.resource
  };
  return this._getIamPolicy(req, args.options, args.callback);
};

/**
 * Sets the IAM access control policy for a
 * {@link ServiceAccount}.
 *
 * @param {string} resource
 *   REQUIRED: The resource for which policy is being specified.
 *   Resource is usually specified as a path, such as,
 *   projects/{project}/zones/{zone}/disks/{disk}.
 * @param {Object} policy
 *   REQUIRED: The complete policy to be applied to the 'resource'. The size of
 *   the policy is limited to a few 10s of KB. An empty policy is in general a
 *   valid policy but certain services (like Projects) might reject them.
 *
 *   This object should have the same structure as [Policy]{@link Policy}
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Policy]{@link Policy}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedResource = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var policy = {};
 * api.setIamPolicy(formattedResource, policy, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.setIamPolicy = function setIamPolicy() {
  var args = arguejs({
    resource: String,
    policy: Object,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    resource: args.resource,
    policy: args.policy
  };
  return this._setIamPolicy(req, args.options, args.callback);
};

/**
 * Tests the specified permissions against the IAM access control policy
 * for a {@link ServiceAccount}.
 *
 * @param {string} resource
 *   REQUIRED: The resource for which policy detail is being requested.
 *   Resource is usually specified as a path, such as, projects/{project}.
 * @param {string[]} permissions
 *   The set of permissions to check for the 'resource'. Permissions with
 *   wildcards (such as '*' or 'storage.*') are not allowed.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [TestIamPermissionsResponse]{@link TestIamPermissionsResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var formattedResource = api.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
 * var permissions = [];
 * api.testIamPermissions(formattedResource, permissions, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.testIamPermissions = function testIamPermissions() {
  var args = arguejs({
    resource: String,
    permissions: Array,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    resource: args.resource,
    permissions: args.permissions
  };
  return this._testIamPermissions(req, args.options, args.callback);
};

/**
 * Queries roles that can be granted on a particular resource.
 * A role is grantable if it can be used as the role in a binding for a policy
 * for that resource.
 *
 * @param {string} fullResourceName
 *   Required. The full resource name to query from the list of grantable roles.
 *
 *   The name follows the Google Cloud Platform resource format.
 *   For example, a Cloud Platform project with id `my-project` will be named
 *   `//cloudresourcemanager.googleapis.com/projects/my-project`.
 * @param {gax.CallOptions=} options
 *   Overrides the default settings for this call, e.g, timeout,
 *   retries, etc.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [QueryGrantableRolesResponse]{@link QueryGrantableRolesResponse}
 * @returns {gax.EventEmitter} - the event emitter to handle the call
 *   status.
 *
 * @example
 *
 * var api = adminV1.iamApi();
 * var fullResourceName = '';
 * api.queryGrantableRoles(fullResourceName, function(err, response) {
 *     if (err) {
 *         console.error(err);
 *         return;
 *     }
 *     // doThingsWith(response)
 * });
 */
IAMApi.prototype.queryGrantableRoles = function queryGrantableRoles() {
  var args = arguejs({
    fullResourceName: String,
    options: [gax.CallOptions],
    callback: [Function]
  }, arguments);
  var req = {
    full_resource_name: args.fullResourceName
  };
  return this._queryGrantableRoles(req, args.options, args.callback);
};

function IAMApiBuilder(gaxGrpc) {
  if (!(this instanceof IAMApiBuilder)) {
    return new IAMApiBuilder(gaxGrpc);
  }

  var iamClient = gaxGrpc.load([{
    root: require('google-proto-files')('..'),
    file: 'google/iam/admin/v1/iam.proto'
  }]);
  extend(this, iamClient.google.iam.admin.v1);

  var grpcClients = {
    iamClient: iamClient
  };

  /**
   * Build a new instance of {@link IAMApi}.
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
  this.iamApi = function(opts) {
    return new IAMApi(gaxGrpc, grpcClients, opts);
  };
  extend(this.iamApi, IAMApi);
}
module.exports = IAMApiBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;