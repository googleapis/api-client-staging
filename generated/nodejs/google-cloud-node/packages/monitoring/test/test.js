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
var monitoringV3 = require('../src/').v3();

describe('GroupServiceClient', function() {
  describe('listGroups', function() {
    it('invokes listGroups without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var nextPageToken = '';
      var groupElement = {};
      var group = [groupElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          group : group
      };

      // Mock Grpc layer
      client._listGroups = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.group);
      };

      client.listGroups(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.group);
        done();
      });
    });
  });

  describe('getGroup', function() {
    it('invokes getGroup without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var formattedName = client.groupPath("[PROJECT]", "[GROUP]");
      var request = {
          name : formattedName
      };

      // Mock response
      var formattedName2 = client.groupPath("[PROJECT]", "[GROUP]");
      var displayName = 'displayName1615086568';
      var parentName = 'parentName1015022848';
      var filter = 'filter-1274492040';
      var isCluster = false;
      var expectedResponse = {
          name : formattedName2,
          displayName : displayName,
          parentName : parentName,
          filter : filter,
          isCluster : isCluster
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

  describe('createGroup', function() {
    it('invokes createGroup without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var group = {};
      var request = {
          name : formattedName,
          group : group
      };

      // Mock response
      var formattedName2 = client.projectPath("[PROJECT]");
      var displayName = 'displayName1615086568';
      var parentName = 'parentName1015022848';
      var filter = 'filter-1274492040';
      var isCluster = false;
      var expectedResponse = {
          name : formattedName2,
          displayName : displayName,
          parentName : parentName,
          filter : filter,
          isCluster : isCluster
      };

      // Mock Grpc layer
      client._createGroup = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createGroup(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('updateGroup', function() {
    it('invokes updateGroup without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var group = {};
      var request = {
          group : group
      };

      // Mock response
      var name = 'name3373707';
      var displayName = 'displayName1615086568';
      var parentName = 'parentName1015022848';
      var filter = 'filter-1274492040';
      var isCluster = false;
      var expectedResponse = {
          name : name,
          displayName : displayName,
          parentName : parentName,
          filter : filter,
          isCluster : isCluster
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

  describe('deleteGroup', function() {
    it('invokes deleteGroup without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var formattedName = client.groupPath("[PROJECT]", "[GROUP]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteGroup = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteGroup(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('listGroupMembers', function() {
    it('invokes listGroupMembers without error', function(done) {
      var client = monitoringV3.groupServiceClient();
      // Mock request
      var formattedName = client.groupPath("[PROJECT]", "[GROUP]");
      var request = {
          name : formattedName
      };

      // Mock response
      var nextPageToken = '';
      var totalSize = -705419236;
      var membersElement = {};
      var members = [membersElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          totalSize : totalSize,
          members : members
      };

      // Mock Grpc layer
      client._listGroupMembers = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.members);
      };

      client.listGroupMembers(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.members);
        done();
      });
    });
  });

});
describe('MetricServiceClient', function() {
  describe('listMonitoredResourceDescriptors', function() {
    it('invokes listMonitoredResourceDescriptors without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var nextPageToken = '';
      var resourceDescriptorsElement = {};
      var resourceDescriptors = [resourceDescriptorsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          resourceDescriptors : resourceDescriptors
      };

      // Mock Grpc layer
      client._listMonitoredResourceDescriptors = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.resourceDescriptors);
      };

      client.listMonitoredResourceDescriptors(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.resourceDescriptors);
        done();
      });
    });
  });

  describe('getMonitoredResourceDescriptor', function() {
    it('invokes getMonitoredResourceDescriptor without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.monitoredResourceDescriptorPath("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
      var request = {
          name : formattedName
      };

      // Mock response
      var formattedName2 = client.monitoredResourceDescriptorPath("[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
      var type = 'type3575610';
      var displayName = 'displayName1615086568';
      var description = 'description-1724546052';
      var expectedResponse = {
          name : formattedName2,
          type : type,
          displayName : displayName,
          description : description
      };

      // Mock Grpc layer
      client._getMonitoredResourceDescriptor = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getMonitoredResourceDescriptor(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('listMetricDescriptors', function() {
    it('invokes listMetricDescriptors without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var nextPageToken = '';
      var metricDescriptorsElement = {};
      var metricDescriptors = [metricDescriptorsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          metricDescriptors : metricDescriptors
      };

      // Mock Grpc layer
      client._listMetricDescriptors = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.metricDescriptors);
      };

      client.listMetricDescriptors(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.metricDescriptors);
        done();
      });
    });
  });

  describe('getMetricDescriptor', function() {
    it('invokes getMetricDescriptor without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.metricDescriptorPath("[PROJECT]", "[METRIC_DESCRIPTOR]");
      var request = {
          name : formattedName
      };

      // Mock response
      var formattedName2 = client.metricDescriptorPath("[PROJECT]", "[METRIC_DESCRIPTOR]");
      var type = 'type3575610';
      var unit = 'unit3594628';
      var description = 'description-1724546052';
      var displayName = 'displayName1615086568';
      var expectedResponse = {
          name : formattedName2,
          type : type,
          unit : unit,
          description : description,
          displayName : displayName
      };

      // Mock Grpc layer
      client._getMetricDescriptor = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getMetricDescriptor(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('createMetricDescriptor', function() {
    it('invokes createMetricDescriptor without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var metricDescriptor = {};
      var request = {
          name : formattedName,
          metricDescriptor : metricDescriptor
      };

      // Mock response
      var formattedName2 = client.projectPath("[PROJECT]");
      var type = 'type3575610';
      var unit = 'unit3594628';
      var description = 'description-1724546052';
      var displayName = 'displayName1615086568';
      var expectedResponse = {
          name : formattedName2,
          type : type,
          unit : unit,
          description : description,
          displayName : displayName
      };

      // Mock Grpc layer
      client._createMetricDescriptor = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createMetricDescriptor(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('deleteMetricDescriptor', function() {
    it('invokes deleteMetricDescriptor without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.metricDescriptorPath("[PROJECT]", "[METRIC_DESCRIPTOR]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteMetricDescriptor = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteMetricDescriptor(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('listTimeSeries', function() {
    it('invokes listTimeSeries without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var filter = 'filter-1274492040';
      var interval = {};
      var view = monitoringV3.ListTimeSeriesRequest.TimeSeriesView.FULL;
      var request = {
          name : formattedName,
          filter : filter,
          interval : interval,
          view : view
      };

      // Mock response
      var nextPageToken = '';
      var timeSeriesElement = {};
      var timeSeries = [timeSeriesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          timeSeries : timeSeries
      };

      // Mock Grpc layer
      client._listTimeSeries = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.timeSeries);
      };

      client.listTimeSeries(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.timeSeries);
        done();
      });
    });
  });

  describe('createTimeSeries', function() {
    it('invokes createTimeSeries without error', function(done) {
      var client = monitoringV3.metricServiceClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var timeSeries = [];
      var request = {
          name : formattedName,
          timeSeries : timeSeries
      };

      // Mock Grpc layer
      client._createTimeSeries = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.createTimeSeries(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

});