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
var through2 = require('through2');

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('SpannerClient', function() {
  describe('createSession', function() {
    it('invokes createSession without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock response
      var name = 'name3373707';
      var expectedResponse = {
          name : name
      };

      // Mock Grpc layer
      client._createSession = mockSimpleGrpcMethod(request, expectedResponse);

      client.createSession(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createSession with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedDatabase = client.databasePath("[PROJECT]", "[INSTANCE]", "[DATABASE]");
      var request = {
          database : formattedDatabase
      };

      // Mock Grpc layer
      client._createSession = mockSimpleGrpcMethod(request, null, error);

      client.createSession(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getSession', function() {
    it('invokes getSession without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedName = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var expectedResponse = {
          name : name2
      };

      // Mock Grpc layer
      client._getSession = mockSimpleGrpcMethod(request, expectedResponse);

      client.getSession(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getSession with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedName = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getSession = mockSimpleGrpcMethod(request, null, error);

      client.getSession(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deleteSession', function() {
    it('invokes deleteSession without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedName = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteSession = mockSimpleGrpcMethod(request);

      client.deleteSession(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteSession with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedName = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteSession = mockSimpleGrpcMethod(request, null, error);

      client.deleteSession(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('executeSql', function() {
    it('invokes executeSql without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var sql = 'sql114126';
      var request = {
          session : formattedSession,
          sql : sql
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._executeSql = mockSimpleGrpcMethod(request, expectedResponse);

      client.executeSql(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes executeSql with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var sql = 'sql114126';
      var request = {
          session : formattedSession,
          sql : sql
      };

      // Mock Grpc layer
      client._executeSql = mockSimpleGrpcMethod(request, null, error);

      client.executeSql(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('executeStreamingSql', function() {
    it('invokes executeStreamingSql without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var sql = 'sql114126';
      var request = {
          session : formattedSession,
          sql : sql
      };

      // Mock response
      var chunkedValue = true;
      var resumeToken = '103';
      var expectedResponse = {
          chunkedValue : chunkedValue,
          resumeToken : resumeToken
      };

      // Mock Grpc layer
      client._executeStreamingSql = mockServerStreamingGrpcMethod(request, expectedResponse);

      client.executeStreamingSql(request).on('data', function(response) {
        assert.deepStrictEqual(response, expectedResponse);
        done()
      }).on('error', function(err) {
        done(err);
      });
    });

    it('invokes executeStreamingSql with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var sql = 'sql114126';
      var request = {
          session : formattedSession,
          sql : sql
      };

      // Mock Grpc layer
      client._executeStreamingSql = mockServerStreamingGrpcMethod(request, null, error);

      client.executeStreamingSql(request).on('data', function(response) {
        assert.fail();
      }).on('error', function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('read', function() {
    it('invokes read without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var table = 'table110115790';
      var columns = [];
      var keySet = {};
      var request = {
          session : formattedSession,
          table : table,
          columns : columns,
          keySet : keySet
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._read = mockSimpleGrpcMethod(request, expectedResponse);

      client.read(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes read with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var table = 'table110115790';
      var columns = [];
      var keySet = {};
      var request = {
          session : formattedSession,
          table : table,
          columns : columns,
          keySet : keySet
      };

      // Mock Grpc layer
      client._read = mockSimpleGrpcMethod(request, null, error);

      client.read(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('streamingRead', function() {
    it('invokes streamingRead without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var table = 'table110115790';
      var columns = [];
      var keySet = {};
      var request = {
          session : formattedSession,
          table : table,
          columns : columns,
          keySet : keySet
      };

      // Mock response
      var chunkedValue = true;
      var resumeToken = '103';
      var expectedResponse = {
          chunkedValue : chunkedValue,
          resumeToken : resumeToken
      };

      // Mock Grpc layer
      client._streamingRead = mockServerStreamingGrpcMethod(request, expectedResponse);

      client.streamingRead(request).on('data', function(response) {
        assert.deepStrictEqual(response, expectedResponse);
        done()
      }).on('error', function(err) {
        done(err);
      });
    });

    it('invokes streamingRead with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var table = 'table110115790';
      var columns = [];
      var keySet = {};
      var request = {
          session : formattedSession,
          table : table,
          columns : columns,
          keySet : keySet
      };

      // Mock Grpc layer
      client._streamingRead = mockServerStreamingGrpcMethod(request, null, error);

      client.streamingRead(request).on('data', function(response) {
        assert.fail();
      }).on('error', function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('beginTransaction', function() {
    it('invokes beginTransaction without error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var options = {};
      var request = {
          session : formattedSession,
          options : options
      };

      // Mock response
      var id = '27';
      var expectedResponse = {
          id : id
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
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var options = {};
      var request = {
          session : formattedSession,
          options : options
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
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var mutations = [];
      var request = {
          session : formattedSession,
          mutations : mutations
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._commit = mockSimpleGrpcMethod(request, expectedResponse);

      client.commit(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes commit with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var mutations = [];
      var request = {
          session : formattedSession,
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
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var transactionId = '28';
      var request = {
          session : formattedSession,
          transactionId : transactionId
      };

      // Mock Grpc layer
      client._rollback = mockSimpleGrpcMethod(request);

      client.rollback(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes rollback with error', function(done) {
      var client = spannerV1.spannerClient();
      // Mock request
      var formattedSession = client.sessionPath("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      var transactionId = '28';
      var request = {
          session : formattedSession,
          transactionId : transactionId
      };

      // Mock Grpc layer
      client._rollback = mockSimpleGrpcMethod(request, null, error);

      client.rollback(request, function(err) {
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

function mockServerStreamingGrpcMethod(expectedRequest, response, error) {
  return function(actualRequest) {
    assert.deepStrictEqual(actualRequest, expectedRequest);
    var mockStream = through2.obj(function (chunk, enc, callback) {
      if (error) {
        callback(error);
      } else {
        callback(null, response);
      }
    });
    mockStream.write();
    return mockStream;
  };
}
