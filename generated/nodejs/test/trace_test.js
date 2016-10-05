var traceV1 = require('@google-cloud/trace').v1();
var uuidjs = require('uuid-js');
var async = require('async');

var PROJECT_ID = 'gapic-test';

var SPAN_NAME = '/foo/bar';

var SPAN_ID = 42;

var SPAN_KIND = traceV1.TraceSpan.SpanKind.RPC_CLIENT;

var id = uuidjs.create().toString().replace(/-/g, '');
var currentTime = Math.floor(new Date() / 1000);
var startTime = {seconds: currentTime, nanos: 1234567}
var endTime = {seconds: currentTime, nanos: 9876543}

var api = traceV1.traceServiceApi();

function test_patch(done) {
  var span = {spanId: SPAN_ID,
              kind: SPAN_KIND,
              name: SPAN_NAME,
              startTime: startTime,
              endTime: endTime};
  var trace = {projectId: PROJECT_ID,
               traceId: id,
               spans: [span]};
  var traces = {traces: [trace]};
  console.log('test patch trace');
  api.patchTraces(PROJECT_ID, traces, function(err) {
    if (err) {
      console.error(err);
    }
    console.log('patched trace');
    // Wait a little for patched trace to propagate
    setTimeout(done, 1000);
  });
}

function test_get(done) {
  console.log('test get trace');
  api.getTrace(PROJECT_ID, id, function(err, trace) {
    if (err) {
      console.error(err);
    } else {
      console.log('got trace:', trace);
    }
    done();
  });
}

function test_list(done) {
  console.log('test list traces');
  var stream = api.listTraces(PROJECT_ID);
  stream.on('data', function(trace) {
    console.log('listed trace:', trace);
  });
  stream.on('error', function(err) {
    console.error(err);
  });
  done();
}

function run() {
  async.waterfall([
      test_patch,
      test_get,
      test_list
  ]);
}

run();
