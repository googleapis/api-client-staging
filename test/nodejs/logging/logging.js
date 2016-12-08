/*!
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

'use strict';

// This file is hand-written. Eventually the tests will be
// replaced by auto-generated ones.

var expect = require('chai').expect;
var grpc = require('grpc');
var loggingV2 = require('../../../generated/nodejs/google-cloud-node/packages/logging/src/v2');
var storage = require('@google-cloud/storage');

describe('loggingV2', function() {
  var projectId = process.env.GCLOUD_TESTS_PROJECT_ID;

  // It's unclear when the newly written entry appears in the list,
  // so wait for a static time. TODO: should be consistent with
  // other tests.
  var WRITE_CONSISTENCY_DELAY_MS = 5000;

  function wait(arg) {
    return new Promise(function(r) {
      setTimeout(function() { r(arg); }, WRITE_CONSISTENCY_DELAY_MS);
    });
  }

  var opts = {projectId: projectId};
  if (process.env.GCLOUD_TESTS_KEY) {
    opts.keyFile = process.env.GCLOUD_TESTS_KEY;
  }

  describe('loggingServiceV2Client', function() {
    var client;

    beforeEach(function() {
      client = loggingV2(opts).loggingServiceV2Client();
    });

    it('creates, lists, and deletes log entries', function(done) {
      var logName = client.logPath(projectId, 'test');
      var resourceName = client.projectPath(projectId);

      var myLogMessage = 'My new test message';
      var resource = {'type': 'global'};
      var entries = [{textPayload: myLogMessage, logName: logName}];
      var start = new Date();
      var filter = 'logName="' + logName + '"';
      client.writeLogEntries({
        entries: entries,
        resource: resource,
        logName: logName
      }).then(wait).then(function() {
        return client.listLogEntries({
          resourceNames: [resourceName],
          filter: filter,
          orderBy: 'timestamp desc'
        });
      }).then(function(resp) {
        var entries = resp[0];
        var found = false;
        for (var i = 0; i < entries.length; ++i) {
          var entry = entries[i];
          if (entry.textPayload === myLogMessage && entry.logName === logName) {
            found = true;
            break;
          }
        }
        expect(found).to.be.true;

        return client.deleteLog({logName: logName});
      }).then(wait).then(function() {
        return client.listLogEntries({
          resourceNames: [resourceName],
          filter: filter
        });
      }).then(function(resp) {
        var entries = resp[0];
        expect(entries).to.be.an('array');
        expect(entries).to.be.empty;
        done();
      }).catch(done);
    });

    it('lists resource descriptors', function(done) {
      client.listMonitoredResourceDescriptors().then(function(resp) {
        var resources = resp[0];
        expect(resources).to.be.an('array');
        expect(resources).not.to.be.empty;
        done();
      }).catch(done);
    });
  });

  describe('configServiceV2Client', function() {
    var client;
    var bucket;
    var bucketName = process.env.GCLOUD_TESTS_PROJECT_ID + "-" + (new Date()).getTime();

    beforeEach(function(done) {
      client = loggingV2(opts).configServiceV2Client();
      var gcs = storage(opts);
      bucket = gcs.bucket(bucketName);
      bucket.create(function() { done(); });
    });

    afterEach(function(done) {
      bucket.delete().then(function() { done(); });
    })

    it('creates, gets, lists, and deletes sink', function(done) {
      var parent = client.projectPath(projectId);
      var name = 'test-' + (new Date()).getTime();
      var sinkName = client.sinkPath(projectId, name);
      var sink = {
        name: name,
        destination: 'storage.googleapis.com/' + bucketName
      };
      client.createSink({parent: parent, sink: sink}).then(function() {
        return client.getSink({sinkName: sinkName});
      }).then(function(resp) {
        expect(resp[0].name).to.eq(name);
        var newSink = {
          name: resp[0].name,
          destination: resp[0].destination,
          filter: 'severity>=ERROR'
        };
        return client.updateSink({sinkName: sinkName, sink: newSink});
      }).then(function() {
        return client.listSinks({parent: parent});
      }).then(function(resp) {
        var sinks = resp[0];
        var found = false;
        for (var i = 0; i < sinks.length; ++i) {
          if (sinks[i].name === name) {
            expect(sinks[i].filter).to.eq('severity>=ERROR');
            found = true;
            break;
          }
        }
        expect(found).to.be.true;
        return client.deleteSink({sinkName: sinkName});
        // catch(done) should be here to catch all failures until this line.
        // The next API call is expected to fail.
      }).catch(done).then(function() {
        return client.getSink({sinkName: sinkName});
      }).then(function() {
        done(new Error('should not success getSink after delete'));
      }).catch(function(err) {
        expect(err).to.be.an('error');
        expect(err.code).to.eq(grpc.status.NOT_FOUND);
        done();
      }).catch(done);
    });
  });

  describe('metricsServiceV2Client', function() {
    var client;

    beforeEach(function() {
      client = loggingV2(opts).metricsServiceV2Client();
    });

    it('creates, gets, lists, and deletes metrics', function(done) {
      var parent = client.projectPath(projectId);
      var name = 'test';
      var metricName = client.metricPath(projectId, name);
      var filter = 'resource.type=global';
      var metric = {name: name, filter: filter};

      client.createLogMetric({parent: parent, metric: metric}).then(function(resp) {
        return client.getLogMetric({metricName: metricName});
      }).then(function(resp) {
        expect(resp[0].filter).to.eq(filter);
        var newMetric = {name: name, filter: filter, description: 'for test'};
        return client.updateLogMetric({metricName: metricName, metric: newMetric});
      }).then(function() {
        return client.listLogMetrics({parent: parent});
      }).then(function(resp) {
        var metrics = resp[0];
        var found = false;
        for (var i = 0; i < metrics.length; ++i) {
          if (metrics[i].name === name) {
            expect(metrics[i].description).to.eq('for test');
            found = true;
            break;
          }
        }
        expect(found).to.be.true;
        return client.deleteLogMetric({metricName: metricName});
        // catch(done) should be here to catch all failures until this line.
        // The next API call is expected to fail.
      }).catch(done).then(function() {
        return client.getLogMetric({metricName: metricName});
      }).then(function() {
        done(new Error(
          'The last getLogMetric should not succeed because it is already deleted'));
      }).catch(function(err) {
        // Successfully failed to getLogMetric.
        expect(err).to.be.an('error');
        expect(err.code).to.eq(grpc.status.NOT_FOUND);
        done();
      }).catch(done);
    });
  });
});