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
var loggingV2 = require('../src/').v2();

describe('LoggingServiceV2Client', function() {
  describe('deleteLog', function() {
    it('invokes deleteLog without error', function(done) {
      var client = loggingV2.loggingServiceV2Client();
      // Mock request
      var formattedLogName = client.logPath("[PROJECT]", "[LOG]");
      var request = {
          logName : formattedLogName
      };

      // Mock Grpc layer
      client._deleteLog = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteLog(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('writeLogEntries', function() {
    it('invokes writeLogEntries without error', function(done) {
      var client = loggingV2.loggingServiceV2Client();
      // Mock request
      var entries = [];
      var request = {
          entries : entries
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._writeLogEntries = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.writeLogEntries(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('listLogEntries', function() {
    it('invokes listLogEntries without error', function(done) {
      var client = loggingV2.loggingServiceV2Client();
      // Mock request
      var resourceNames = [];
      var request = {
          resourceNames : resourceNames
      };

      // Mock response
      var nextPageToken = '';
      var entriesElement = {};
      var entries = [entriesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          entries : entries
      };

      // Mock Grpc layer
      client._listLogEntries = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.entries);
      };

      client.listLogEntries(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.entries);
        done();
      });
    });
  });

  describe('listMonitoredResourceDescriptors', function() {
    it('invokes listMonitoredResourceDescriptors without error', function(done) {
      var client = loggingV2.loggingServiceV2Client();
      // Mock request
      var request = {};

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

  describe('listLogs', function() {
    it('invokes listLogs without error', function(done) {
      var client = loggingV2.loggingServiceV2Client();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var logNamesElement = 'logNamesElement-1079688374';
      var logNames = [logNamesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          logNames : logNames
      };

      // Mock Grpc layer
      client._listLogs = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.logNames);
      };

      client.listLogs(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.logNames);
        done();
      });
    });
  });

});
describe('ConfigServiceV2Client', function() {
  describe('listSinks', function() {
    it('invokes listSinks without error', function(done) {
      var client = loggingV2.configServiceV2Client();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var sinksElement = {};
      var sinks = [sinksElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          sinks : sinks
      };

      // Mock Grpc layer
      client._listSinks = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.sinks);
      };

      client.listSinks(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.sinks);
        done();
      });
    });
  });

  describe('getSink', function() {
    it('invokes getSink without error', function(done) {
      var client = loggingV2.configServiceV2Client();
      // Mock request
      var formattedSinkName = client.sinkPath("[PROJECT]", "[SINK]");
      var request = {
          sinkName : formattedSinkName
      };

      // Mock response
      var name = 'name3373707';
      var destination = 'destination-1429847026';
      var filter = 'filter-1274492040';
      var writerIdentity = 'writerIdentity775638794';
      var expectedResponse = {
          name : name,
          destination : destination,
          filter : filter,
          writerIdentity : writerIdentity
      };

      // Mock Grpc layer
      client._getSink = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getSink(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('createSink', function() {
    it('invokes createSink without error', function(done) {
      var client = loggingV2.configServiceV2Client();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var sink = {};
      var request = {
          parent : formattedParent,
          sink : sink
      };

      // Mock response
      var name = 'name3373707';
      var destination = 'destination-1429847026';
      var filter = 'filter-1274492040';
      var writerIdentity = 'writerIdentity775638794';
      var expectedResponse = {
          name : name,
          destination : destination,
          filter : filter,
          writerIdentity : writerIdentity
      };

      // Mock Grpc layer
      client._createSink = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createSink(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('updateSink', function() {
    it('invokes updateSink without error', function(done) {
      var client = loggingV2.configServiceV2Client();
      // Mock request
      var formattedSinkName = client.sinkPath("[PROJECT]", "[SINK]");
      var sink = {};
      var request = {
          sinkName : formattedSinkName,
          sink : sink
      };

      // Mock response
      var name = 'name3373707';
      var destination = 'destination-1429847026';
      var filter = 'filter-1274492040';
      var writerIdentity = 'writerIdentity775638794';
      var expectedResponse = {
          name : name,
          destination : destination,
          filter : filter,
          writerIdentity : writerIdentity
      };

      // Mock Grpc layer
      client._updateSink = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.updateSink(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('deleteSink', function() {
    it('invokes deleteSink without error', function(done) {
      var client = loggingV2.configServiceV2Client();
      // Mock request
      var formattedSinkName = client.sinkPath("[PROJECT]", "[SINK]");
      var request = {
          sinkName : formattedSinkName
      };

      // Mock Grpc layer
      client._deleteSink = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteSink(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

});
describe('MetricsServiceV2Client', function() {
  describe('listLogMetrics', function() {
    it('invokes listLogMetrics without error', function(done) {
      var client = loggingV2.metricsServiceV2Client();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var metricsElement = {};
      var metrics = [metricsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          metrics : metrics
      };

      // Mock Grpc layer
      client._listLogMetrics = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.metrics);
      };

      client.listLogMetrics(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.metrics);
        done();
      });
    });
  });

  describe('getLogMetric', function() {
    it('invokes getLogMetric without error', function(done) {
      var client = loggingV2.metricsServiceV2Client();
      // Mock request
      var formattedMetricName = client.metricPath("[PROJECT]", "[METRIC]");
      var request = {
          metricName : formattedMetricName
      };

      // Mock response
      var name = 'name3373707';
      var description = 'description-1724546052';
      var filter = 'filter-1274492040';
      var expectedResponse = {
          name : name,
          description : description,
          filter : filter
      };

      // Mock Grpc layer
      client._getLogMetric = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getLogMetric(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('createLogMetric', function() {
    it('invokes createLogMetric without error', function(done) {
      var client = loggingV2.metricsServiceV2Client();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var metric = {};
      var request = {
          parent : formattedParent,
          metric : metric
      };

      // Mock response
      var name = 'name3373707';
      var description = 'description-1724546052';
      var filter = 'filter-1274492040';
      var expectedResponse = {
          name : name,
          description : description,
          filter : filter
      };

      // Mock Grpc layer
      client._createLogMetric = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createLogMetric(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('updateLogMetric', function() {
    it('invokes updateLogMetric without error', function(done) {
      var client = loggingV2.metricsServiceV2Client();
      // Mock request
      var formattedMetricName = client.metricPath("[PROJECT]", "[METRIC]");
      var metric = {};
      var request = {
          metricName : formattedMetricName,
          metric : metric
      };

      // Mock response
      var name = 'name3373707';
      var description = 'description-1724546052';
      var filter = 'filter-1274492040';
      var expectedResponse = {
          name : name,
          description : description,
          filter : filter
      };

      // Mock Grpc layer
      client._updateLogMetric = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.updateLogMetric(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('deleteLogMetric', function() {
    it('invokes deleteLogMetric without error', function(done) {
      var client = loggingV2.metricsServiceV2Client();
      // Mock request
      var formattedMetricName = client.metricPath("[PROJECT]", "[METRIC]");
      var request = {
          metricName : formattedMetricName
      };

      // Mock Grpc layer
      client._deleteLogMetric = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteLogMetric(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

});
