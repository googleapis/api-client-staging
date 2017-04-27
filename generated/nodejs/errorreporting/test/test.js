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
var errorreportingV1beta1 = require('../src/').v1beta1();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('ErrorGroupServiceClient', function() {
  describe('getGroup', function() {
    it('invokes getGroup without error', function(done) {
      var client = errorreportingV1beta1.errorGroupServiceClient();
      // Mock request
      var formattedGroupName = client.groupPath("[PROJECT]", "[GROUP]");
      var request = {
          groupName : formattedGroupName
      };

      // Mock response
      var name = 'name3373707';
      var groupId = 'groupId506361563';
      var expectedResponse = {
          name : name,
          groupId : groupId
      };

      // Mock Grpc layer
      client._getGroup = mockSimpleGrpcMethod(request, expectedResponse);

      client.getGroup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getGroup with error', function(done) {
      var client = errorreportingV1beta1.errorGroupServiceClient();
      // Mock request
      var formattedGroupName = client.groupPath("[PROJECT]", "[GROUP]");
      var request = {
          groupName : formattedGroupName
      };

      // Mock Grpc layer
      client._getGroup = mockSimpleGrpcMethod(request, null, error);

      client.getGroup(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('updateGroup', function() {
    it('invokes updateGroup without error', function(done) {
      var client = errorreportingV1beta1.errorGroupServiceClient();
      // Mock request
      var group = {};
      var request = {
          group : group
      };

      // Mock response
      var name = 'name3373707';
      var groupId = 'groupId506361563';
      var expectedResponse = {
          name : name,
          groupId : groupId
      };

      // Mock Grpc layer
      client._updateGroup = mockSimpleGrpcMethod(request, expectedResponse);

      client.updateGroup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes updateGroup with error', function(done) {
      var client = errorreportingV1beta1.errorGroupServiceClient();
      // Mock request
      var group = {};
      var request = {
          group : group
      };

      // Mock Grpc layer
      client._updateGroup = mockSimpleGrpcMethod(request, null, error);

      client.updateGroup(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

});
describe('ErrorStatsServiceClient', function() {
  describe('listGroupStats', function() {
    it('invokes listGroupStats without error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var timeRange = {};
      var request = {
          projectName : formattedProjectName,
          timeRange : timeRange
      };

      // Mock response
      var nextPageToken = '';
      var errorGroupStatsElement = {};
      var errorGroupStats = [errorGroupStatsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          errorGroupStats : errorGroupStats
      };

      // Mock Grpc layer
      client._listGroupStats = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.errorGroupStats);
      };

      client.listGroupStats(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.errorGroupStats);
        done();
      });
    });

    it('invokes listGroupStats with error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var timeRange = {};
      var request = {
          projectName : formattedProjectName,
          timeRange : timeRange
      };

      // Mock Grpc layer
      client._listGroupStats = mockSimpleGrpcMethod(request, null, error);

      client.listGroupStats(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listEvents', function() {
    it('invokes listEvents without error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var groupId = 'groupId506361563';
      var request = {
          projectName : formattedProjectName,
          groupId : groupId
      };

      // Mock response
      var nextPageToken = '';
      var errorEventsElement = {};
      var errorEvents = [errorEventsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          errorEvents : errorEvents
      };

      // Mock Grpc layer
      client._listEvents = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.errorEvents);
      };

      client.listEvents(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.errorEvents);
        done();
      });
    });

    it('invokes listEvents with error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var groupId = 'groupId506361563';
      var request = {
          projectName : formattedProjectName,
          groupId : groupId
      };

      // Mock Grpc layer
      client._listEvents = mockSimpleGrpcMethod(request, null, error);

      client.listEvents(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deleteEvents', function() {
    it('invokes deleteEvents without error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var request = {
          projectName : formattedProjectName
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._deleteEvents = mockSimpleGrpcMethod(request, expectedResponse);

      client.deleteEvents(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes deleteEvents with error', function(done) {
      var client = errorreportingV1beta1.errorStatsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var request = {
          projectName : formattedProjectName
      };

      // Mock Grpc layer
      client._deleteEvents = mockSimpleGrpcMethod(request, null, error);

      client.deleteEvents(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

});
describe('ReportErrorsServiceClient', function() {
  describe('reportErrorEvent', function() {
    it('invokes reportErrorEvent without error', function(done) {
      var client = errorreportingV1beta1.reportErrorsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var event = {};
      var request = {
          projectName : formattedProjectName,
          event : event
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._reportErrorEvent = mockSimpleGrpcMethod(request, expectedResponse);

      client.reportErrorEvent(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes reportErrorEvent with error', function(done) {
      var client = errorreportingV1beta1.reportErrorsServiceClient();
      // Mock request
      var formattedProjectName = client.projectPath("[PROJECT]");
      var event = {};
      var request = {
          projectName : formattedProjectName,
          event : event
      };

      // Mock Grpc layer
      client._reportErrorEvent = mockSimpleGrpcMethod(request, null, error);

      client.reportErrorEvent(request, function(err, response) {
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
