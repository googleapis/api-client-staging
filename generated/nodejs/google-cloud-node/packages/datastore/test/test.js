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
var datastoreV1 = require('../src/').v1();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('DatastoreClient', function() {
  describe('lookup', function() {
    it('invokes lookup without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var readOptions = {};
      var keys = [];
      var request = {
          projectId : projectId,
          readOptions : readOptions,
          keys : keys
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._lookup = mockSimpleGrpcMethod(request, expectedResponse);

      client.lookup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes lookup with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var readOptions = {};
      var keys = [];
      var request = {
          projectId : projectId,
          readOptions : readOptions,
          keys : keys
      };

      // Mock Grpc layer
      client._lookup = mockSimpleGrpcMethod(request, null, error);

      client.lookup(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('runQuery', function() {
    it('invokes runQuery without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var partitionId = {};
      var readOptions = {};
      var request = {
          projectId : projectId,
          partitionId : partitionId,
          readOptions : readOptions
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._runQuery = mockSimpleGrpcMethod(request, expectedResponse);

      client.runQuery(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes runQuery with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var partitionId = {};
      var readOptions = {};
      var request = {
          projectId : projectId,
          partitionId : partitionId,
          readOptions : readOptions
      };

      // Mock Grpc layer
      client._runQuery = mockSimpleGrpcMethod(request, null, error);

      client.runQuery(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('beginTransaction', function() {
    it('invokes beginTransaction without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var request = {
          projectId : projectId
      };

      // Mock response
      var transaction = '-34';
      var expectedResponse = {
          transaction : transaction
      };

      // Mock Grpc layer
      client._beginTransaction = mockSimpleGrpcMethod(request, expectedResponse);

      client.beginTransaction(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes beginTransaction with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var request = {
          projectId : projectId
      };

      // Mock Grpc layer
      client._beginTransaction = mockSimpleGrpcMethod(request, null, error);

      client.beginTransaction(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('commit', function() {
    it('invokes commit without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var mode = datastoreV1.CommitRequest.Mode.MODE_UNSPECIFIED;
      var mutations = [];
      var request = {
          projectId : projectId,
          mode : mode,
          mutations : mutations
      };

      // Mock response
      var indexUpdates = -1425228195;
      var expectedResponse = {
          indexUpdates : indexUpdates
      };

      // Mock Grpc layer
      client._commit = mockSimpleGrpcMethod(request, expectedResponse);

      client.commit(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes commit with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var mode = datastoreV1.CommitRequest.Mode.MODE_UNSPECIFIED;
      var mutations = [];
      var request = {
          projectId : projectId,
          mode : mode,
          mutations : mutations
      };

      // Mock Grpc layer
      client._commit = mockSimpleGrpcMethod(request, null, error);

      client.commit(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('rollback', function() {
    it('invokes rollback without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var transaction = '-34';
      var request = {
          projectId : projectId,
          transaction : transaction
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._rollback = mockSimpleGrpcMethod(request, expectedResponse);

      client.rollback(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes rollback with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var transaction = '-34';
      var request = {
          projectId : projectId,
          transaction : transaction
      };

      // Mock Grpc layer
      client._rollback = mockSimpleGrpcMethod(request, null, error);

      client.rollback(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('allocateIds', function() {
    it('invokes allocateIds without error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var keys = [];
      var request = {
          projectId : projectId,
          keys : keys
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._allocateIds = mockSimpleGrpcMethod(request, expectedResponse);

      client.allocateIds(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes allocateIds with error', function(done) {
      var client = datastoreV1.datastoreClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var keys = [];
      var request = {
          projectId : projectId,
          keys : keys
      };

      // Mock Grpc layer
      client._allocateIds = mockSimpleGrpcMethod(request, null, error);

      client.allocateIds(request, function(err, response) {
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
