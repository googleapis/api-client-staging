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
      client._getGroup = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getGroup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
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
      client._updateGroup = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.updateGroup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
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
      client._deleteEvents = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.deleteEvents(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
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
      client._reportErrorEvent = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.reportErrorEvent(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

});