/*
 * Copyright 2016, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
'use strict';

var async = require('async');

if (process.argv.length <= 2) {
  console.log('Usage: %s <project_id> <service> <version>', __filename);
  process.exit(1);
}

var PROJECT_NAME = process.argv[2];
var SERVICE = process.argv[3];
var VERSION = process.argv[4];
var USER_NAME = 'testuser';

var clouderrorreportingV1beta1 =
    require('@google-cloud/errorreporting').v1beta1();

/**
 * Integration test for ReportErrorsServiceApi.reportErrorEvent
 *
 * Report first two error events (to be one group) and third event
 * (to be another group)
 */
function createErrorEvents(createErrorEventsDoneCallback) {
  var api = clouderrorreportingV1beta1.reportErrorsServiceApi();
  var formattedProjectName = api.projectPath(PROJECT_NAME);

  var httpRequestConext = {
    method: 'GET',
    url: 'https://20160920t135819-dot-gapic-test.appspot.com'
  };
  var sourceLocation1 = {
    file_path: 'foo/bar',
    line_number: 20,
    function_name: 'doGet'
  };
  var sourceLocation2 = {
    file_path: 'foo/bar',
    line_number: 30,
    function_name: 'doSet'
  };
  var event1 = {
    message: 'error reporting test event1',
    service_context: {
      service: SERVICE,
      version: VERSION
    },
    context: {
      http_request: httpRequestConext,
      user: USER_NAME,
      report_location: sourceLocation1
    }
  };
  var event2 = {
    message: 'error reporting test event2',
    service_context: {
      service: SERVICE,
      version: VERSION
    },
    context: {
      http_request: httpRequestConext,
      user: USER_NAME,
      report_location: sourceLocation1
    }
  };
  var event3 = {
    message: 'error reporting test event3',
    service_context: {
      service: SERVICE,
      version: VERSION
    },
    context: {
      http_request: httpRequestConext,
      user: USER_NAME,
      report_location: sourceLocation2
    }
  };

  // report the three events in parallel
  async.eachOf([event1, event2, event3], function(event, index, callback) {
    api.reportErrorEvent(formattedProjectName, event, function(err, response) {
      if (err) {
        console.error(err);
        return;
      }
      console.log('Reporting error event %d' ,index + 1);
      callback();
    });
  }, function(err) {
    if (err) {
      console.error(err);
      return;
    }
    console.log('createErrorEventsDone');
    createErrorEventsDoneCallback(null, 'createErrorEventsDone');
  });
}

function listErrorInfo(listErrorInfoDoneCallback) {
  async.waterfall([
    listErrorGroupStats,
    listErrorGroupEvents,
    updateErrorGroup,
    getErrorGroup
  ], function(err, result) {
    console.log('listErrorInfo' + result);
    listErrorInfoDoneCallback(null, 'listErrorInfo' + result);
  });
}

/**
 * Integration test for ErrorStatsServiceApi.listGroupStats,
 *                      ErrorStatsServiceApi.listEvents
 *
 */
function listErrorGroupStats(callback) {
  var api = clouderrorreportingV1beta1.errorStatsServiceApi();
  var formattedProjectName = api.projectPath(PROJECT_NAME);
  var timeRange = {
    period: clouderrorreportingV1beta1.QueryTimeRange.Period.PERIOD_1_HOUR
  };

  console.log('Listing all the error groups');
  var groups = [];
  api.listGroupStats(formattedProjectName, timeRange).on('data',
      function(errorGroupStat) {
        console.log(errorGroupStat.group.name + ' ' +
            errorGroupStat.group.group_id + ' ' +
            errorGroupStat.count);
        groups.push(errorGroupStat);
      }).on('end', function() {
        var firstErrorGroupId = groups[0].group.group_id;
        console.log('firstErrorGroupId = ' + firstErrorGroupId);
        callback(null, firstErrorGroupId);
      });
}

function listErrorGroupEvents(errorGroupId, callback) {
  var api = clouderrorreportingV1beta1.errorStatsServiceApi();
  var formattedProjectName = api.projectPath(PROJECT_NAME);
  var timeRange = {
    period: clouderrorreportingV1beta1.QueryTimeRange.Period.PERIOD_1_HOUR
  };

  console.log('Listing all the error events for error group ' + errorGroupId);
  api.listEvents(formattedProjectName, errorGroupId,
      {timeRange: timeRange}).on('data', function(errorEvent) {
        console.log(errorEvent.message + ' ' +
            errorEvent.service_context.service + ' ' +
            errorEvent.service_context.version);
        console.log(errorEvent.context.user);
        console.log(errorEvent.context.http_request.method + ' ' +
            errorEvent.context.http_request.url);
        console.log(errorEvent.context.report_location.file_path + ' ' +
            errorEvent.context.report_location.line_number + ' ' +
            errorEvent.context.report_location.function_name);
      }).on('end', function() {
        callback(null, errorGroupId);
      });
}

function updateErrorGroup(errorGroupId, callback) {
  var api = clouderrorreportingV1beta1.errorGroupServiceApi();
  var formattedGroupName = api.groupPath(PROJECT_NAME, errorGroupId);

  console.log('Updating error group ' + formattedGroupName);
  var issues = [
    {
      url: "https://github.com/testuser/project/issues/update1"
    }];
  var errorGroup = {
    name: formattedGroupName,
    group_id: errorGroupId,
    tracking_issues: issues
  };
  api.updateGroup(errorGroup, function(err, response) {
    if (err) {
      console.error(err);
      return;
    }
    callback(null, response.group_id);
  });
}

/**
 * Integration test for ErrorGroupServiceApi.getGroup,
 *                     ErrorGroupServiceApi.updateGroup
 * @param {String} errorGroupId - error group id
 */
function getErrorGroup(errorGroupId, callback) {
  var api = clouderrorreportingV1beta1.errorGroupServiceApi();
  var formattedGroupName = api.groupPath(PROJECT_NAME, errorGroupId);

  console.log('Getting error group ' + formattedGroupName);
  api.getGroup(formattedGroupName, function(err, response) {
    if (err) {
      console.error(err);
      return;
    }
    console.log(response.name + ' ' + response.group_id);
    console.log('Associated issues');
    for (var i = 0; i < response.tracking_issues.length; i++) {
      console.log(response.tracking_issues[i].url);
    }
    callback(null, 'Done');
  });
}

/**
 * Integration test for ErrorStatsServiceApi.deleteEvents
 */
function deleteErrorEvents(deleteErrorEventsCallback) {
  var api = clouderrorreportingV1beta1.errorStatsServiceApi();
  var formattedProjectName = api.projectPath(PROJECT_NAME);

  console.log('Deleting all the events in project ' + PROJECT_NAME);
  api.deleteEvents(formattedProjectName, function(err, response) {
    if (err) {
      console.error(err);
      return;
    }
  });

  console.log('deleteErrorEventsDone');
  deleteErrorEventsCallback(null, 'deleteErrorEventsDone');
}

async.series([createErrorEvents, listErrorInfo, deleteErrorEvents]);

