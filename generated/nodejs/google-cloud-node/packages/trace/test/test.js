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
var traceV1 = require('../src/').v1();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('TraceServiceClient', function() {
  describe('patchTraces', function() {
    it('invokes patchTraces without error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var traces = {};
      var request = {
          projectId : projectId,
          traces : traces
      };

      // Mock Grpc layer
      client._patchTraces = mockSimpleGrpcMethod(request);

      client.patchTraces(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes patchTraces with error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var traces = {};
      var request = {
          projectId : projectId,
          traces : traces
      };

      // Mock Grpc layer
      client._patchTraces = mockSimpleGrpcMethod(request, null, error);

      client.patchTraces(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getTrace', function() {
    it('invokes getTrace without error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var traceId = 'traceId1270300245';
      var request = {
          projectId : projectId,
          traceId : traceId
      };

      // Mock response
      var projectId2 = 'projectId2939242356';
      var traceId2 = 'traceId2987826376';
      var expectedResponse = {
          projectId : projectId2,
          traceId : traceId2
      };

      // Mock Grpc layer
      client._getTrace = mockSimpleGrpcMethod(request, expectedResponse);

      client.getTrace(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getTrace with error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var traceId = 'traceId1270300245';
      var request = {
          projectId : projectId,
          traceId : traceId
      };

      // Mock Grpc layer
      client._getTrace = mockSimpleGrpcMethod(request, null, error);

      client.getTrace(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listTraces', function() {
    it('invokes listTraces without error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var request = {
          projectId : projectId
      };

      // Mock response
      var nextPageToken = '';
      var tracesElement = {};
      var traces = [tracesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          traces : traces
      };

      // Mock Grpc layer
      client._listTraces = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.traces);
      };

      client.listTraces(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.traces);
        done();
      });
    });

    it('invokes listTraces with error', function(done) {
      var client = traceV1.traceServiceClient();
      // Mock request
      var projectId = 'projectId-1969970175';
      var request = {
          projectId : projectId
      };

      // Mock Grpc layer
      client._listTraces = mockSimpleGrpcMethod(request, null, error);

      client.listTraces(request, function(err, response) {
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
