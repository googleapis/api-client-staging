var monitoringV3 = require('@google-cloud/monitoring').v3();

var PROJECT_ID = 'cbao-deepdive';

function testGroupCollection() {
  var api = monitoringV3.groupServiceApi();
  var projectName = api.projectPath(PROJECT_ID);
  var group = {
    displayName: 'display_name',
    filter: 'resource.type = gce_instance',
  }

  api.createGroup(projectName, group, function(err, response) {
    if (err) {
      return;
    }
    console.log("New group created");
    console.log(response);
    createdGroup = response;

    var groupName = createdGroup.name;
    var groupToUpdate = {
      name: groupName,
      displayName: 'display_name2',
      filter: 'resource.type = gce_instance'
    }

    api.updateGroup(groupToUpdate, function(err, response) {
      console.log("Group updated:");
      console.log(response);
      var updatedGroup = response;

      var groupId = updatedGroup.name.substring(updatedGroup.name.lastIndexOf('/') + 1);
      var name = api.groupPath(PROJECT_ID, groupId);

      api.listGroups(projectName).once('data', function(element) {
        console.log("First group listed:");
        console.log(element);
      });

      api.listGroupMembers(name).once('data', function(element) {
        console.log("First group member listed:");
        console.log(element);
      });

      api.getGroup(name, function(err, response) {
        console.log("Group fetched:");
        console.log(response);

        api.deleteGroup(name, function(err) {
          if (!err) {
            console.log('Deleted');
          }
        });
      })
    });
  });
}

function testMetricCollection() {
  var api = monitoringV3.metricServiceApi();
  var projectName = api.projectPath(PROJECT_ID);
  var customMetricType = 'custom.googleapis.com/cbao/instance/cpu/utilization';

  var metricDescriptor = {
    type: customMetricType,
    metricKind:'GAUGE',
    valueType: 'BOOL'
  };

  api.createMetricDescriptor(projectName, metricDescriptor, function(err, response) {
    if (err) {
      return;
    }
    console.log('Metric descriptor created');
    console.log(response);

    api.getMetricDescriptor(response.name, function(err, response) {
      if (err) {
        console.log('ERROR: Did not fetch metric descriptor');
      }
      console.log('Fetched metric descriptor');
      console.log(response);
      console.log(response.name);
      api.deleteMetricDescriptor(response.name, function(err) {
        if (!err) {
          console.log('Metric descriptor deleted');
        }
      });
    });

    api.listMetricDescriptors(projectName).once('data', function(element) {
      console.log('First metric descriptor listed:');
      console.log(element);
    })
  });
}

function testTimeSeriesCollection() {
  var api = monitoringV3.metricServiceApi();
  var projectName = api.projectPath(PROJECT_ID);
  var metric = {
    type: 'custom.googleapis.com/cbao/instance/cpu/usage_time'
  }
  var interval = {
    endTime: {
      seconds: 1475262206
    }
  }
  var point = {
    interval: interval,
    value: {
      boolValue: true
    }
  }
  var time = {
    metric: metric,
    points: [point]
  }
  var timeSeries = [time]

  api.createTimeSeries(projectName, timeSeries, function(err) {
    if (!err) {
      console.log('Created time series');
    }
  })
  // TODO: Test listTimeSeries. 
  // var filter = 'metric.type = "custom.googleapis.com/cbao/instance/cpu/usage_time" AND metric.label.instance_name = "endpoints11-load-test"'
  // var full = monitoringV3.ListTimeSeriesRequest.TimeSeriesView.FULL;
  // api.listTimeSeries(projectName, filter, interval, 'FULL');

}

function testMonitoredResourceCollection() {
  var api = monitoringV3.metricServiceApi();
  var projectName = api.projectPath(PROJECT_ID);
  api.listMonitoredResourceDescriptors(projectName).on('data', function(el) { console.log(el) });

  var name = api.monitoredResourceDescriptorPath(PROJECT_ID, 'uptime_url');
  api.getMonitoredResourceDescriptor(name, function(err, response) {
    if (err) {
      console.log('Monitored resource not fetched');
      return;
    }
    console.log('Fetched monitored resource');
    console.log(response)
  });
}

function run() {
 testGroupCollection();
 testMetricCollection();
 testTimeSeriesCollection();
 testMonitoredResourceCollection();
}

run();
