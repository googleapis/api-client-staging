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
 */

var assert = require('assert');
var spannerV1 = require('../src/').v1();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('DatabaseAdminClient', function() {
  describe('listDatabases', function() {
    it('invokes listDatabases without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedParent = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var databasesElement = {};
      var databases = [databasesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          databases : databases
      };

      // Mock Grpc layer
      client._listDatabases = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.databases);
      };

      client.listDatabases(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.databases);
        done();
      });
    });

    it('invokes listDatabases with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedParent = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          parent : formattedParent
      };

      // Mock Grpc layer
      client._listDatabases = mockSimpleGrpcMethod(request, null, error);

      client.listDatabases(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createDatabase', function() {
    it('invokes createDatabase without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedParent = client.instancePath("[PROJECT]", "[INSTANCE]");
      var createStatement = 'createStatement552974828';
      var request = {
          parent : formattedParent,
          createStatement : createStatement
      };

      // Mock response
      var name = 'name3373707';
      var expectedResponse = {
          name : name
      };

      // Mock Grpc layer
      client._createDatabase = mockLongRunningGrpcMethod(request, expectedResponse);

      client.createDatabase(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.deepStrictEqual(responses[0], expectedResponse);
        done();
      }).catch(function(err) {
        done(err);
      });
    });

    it('invokes createDatabase with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedParent = client.instancePath("[PROJECT]", "[INSTANCE]");
      var createStatement = 'createStatement552974828';
      var request = {
          parent : formattedParent,
          createStatement : createStatement
      };

      // Mock Grpc layer
      client._createDatabase = mockLongRunningGrpcMethod(request, null, error);

      client.createDatabase(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.fail();
      }).catch(function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getDatabase', function() {
    it('invokes getDatabase without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedName = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var expectedResponse = {
          name : name2
      };

      // Mock Grpc layer
      client._getDatabase = mockSimpleGrpcMethod(request, expectedResponse);

      client.getDatabase(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getDatabase with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedName = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getDatabase = mockSimpleGrpcMethod(request, null, error);

      client.getDatabase(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('updateDatabaseDdl', function() {
    it('invokes updateDatabaseDdl without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var statements = [];
      var request = {
          database : formattedDatabase,
          statements : statements
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._updateDatabaseDdl = mockLongRunningGrpcMethod(request, expectedResponse);

      client.updateDatabaseDdl(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.deepStrictEqual(responses[0], expectedResponse);
        done();
      }).catch(function(err) {
        done(err);
      });
    });

    it('invokes updateDatabaseDdl with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var statements = [];
      var request = {
          database : formattedDatabase,
          statements : statements
      };

      // Mock Grpc layer
      client._updateDatabaseDdl = mockLongRunningGrpcMethod(request, null, error);

      client.updateDatabaseDdl(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.fail();
      }).catch(function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('dropDatabase', function() {
    it('invokes dropDatabase without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock Grpc layer
      client._dropDatabase = mockSimpleGrpcMethod(request);

      client.dropDatabase(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes dropDatabase with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock Grpc layer
      client._dropDatabase = mockSimpleGrpcMethod(request, null, error);

      client.dropDatabase(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getDatabaseDdl', function() {
    it('invokes getDatabaseDdl without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._getDatabaseDdl = mockSimpleGrpcMethod(request, expectedResponse);

      client.getDatabaseDdl(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getDatabaseDdl with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock Grpc layer
      client._getDatabaseDdl = mockSimpleGrpcMethod(request, null, error);

      client.getDatabaseDdl(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('setIamPolicy', function() {
    it('invokes setIamPolicy without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._setIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.setIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes setIamPolicy with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock Grpc layer
      client._setIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.setIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getIamPolicy', function() {
    it('invokes getIamPolicy without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          resource : formattedResource
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._getIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.getIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getIamPolicy with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          resource : formattedResource
      };

      // Mock Grpc layer
      client._getIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.getIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('testIamPermissions', function() {
    it('invokes testIamPermissions without error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._testIamPermissions = mockSimpleGrpcMethod(request, expectedResponse);

      client.testIamPermissions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes testIamPermissions with error', function(done) {
      var client = spannerV1.databaseAdminClient();
      // Mock request
      var formattedResource = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock Grpc layer
      client._testIamPermissions = mockSimpleGrpcMethod(request, null, error);

      client.testIamPermissions(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

});

function mockSimpleGrpcMethod(expectedRequest, response, error) {
  return function(actualRequest, options, callback) {
    assert.deepStrictEqual(actualRequest, expectedRequest);
    if (error) {
      callback(error);
    } else if (response) {
      callback(null, response);
    } else {
      callback(null);
    }
  };
}

function mockLongRunningGrpcMethod(expectedRequest, response, error) {
  return function(request) {
    assert.deepStrictEqual(request, expectedRequest);
    var mockOperation = {
      promise: function() {
        return new Promise(function(resolve, reject) {
          if (error) {
            reject(error)
          } else {
            resolve([response]);
          }
        });
      }
    };
    return Promise.resolve([mockOperation]);
  };
}
