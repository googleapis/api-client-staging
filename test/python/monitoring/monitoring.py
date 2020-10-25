"""System tests for monitoring."""
from __future__ import print_function


from google.cloud.gapic.monitoring.v3 import group_service_client
from google.cloud.gapic.monitoring.v3 import metric_service_client
from google.cloud.gapic.monitoring.v3 import enums
from google.gax import CallOptions, INITIAL_PAGE
from google.cloud.grpc.monitoring.v3 import group_pb2
from google.cloud.grpc.monitoring.v3 import common_pb2
from google.cloud.grpc.monitoring.v3 import metric_pb2
from google.protobuf import timestamp_pb2
from google.api import metric_pb2 as api_metric_pb2

PROJECT_ID = 'gapic-test'


def testGroupCollection():
  api = group_service_client.GroupServiceClient()
  projectName = api.project_path(PROJECT_ID)
  group = group_pb2.Group(display_name='displayName', filter='resource.type = gce_instance')
  createdGroup = api.create_group(projectName, group)

  print("New group created: \n%s\n" % createdGroup)

  groupName = createdGroup.name
  groupToUpdate = group_pb2.Group(name=groupName, display_name='displayName2', filter='resource.type = gce_instance')
  updatedGroup = api.update_group(groupToUpdate)
  print("Group updated: \n%s\n" % updatedGroup)

  # group id is the last segment in the returned group name.
  groupId = updatedGroup.name[createdGroup.name.rfind('/')+1:]
  api = group_service_client.GroupServiceClient()
  name = api.group_path(PROJECT_ID, groupId)
  response = api.get_group(name)
  print("Group fetched: \n%s\n" % response)

  print("List groups:\n")
  for group in api.list_groups(name):
      # process element
      print(group)

  print("List group members:\n")
  name = api.group_path(PROJECT_ID, groupId)
  for member in api.list_group_members(name=name, interval=common_pb2.TimeInterval(end_time=timestamp_pb2.Timestamp(seconds=1475262206))):
    print(member)

  print("Delete groups:\n")
  name = api.group_path(PROJECT_ID, groupId)
  api.delete_group(name)
  try:
    response = api.get_group(name)
  except:
    print("Expect error here since the group should have been deleted")


def testMetricCollection():
  custom_metric_type = 'custom.googleapis.com/cbao/instance/cpu/utilization'
  api = metric_service_client.MetricServiceClient()
  name = api.project_path(PROJECT_ID)

  metric_descriptor = api_metric_pb2.MetricDescriptor(type=custom_metric_type, metric_kind=enums.MetricDescriptor.MetricKind.GAUGE, value_type=enums.MetricDescriptor.ValueType.BOOL)
  response = api.create_metric_descriptor(name, metric_descriptor)
  print("Metric created: \n%s\n" % response)

  name = api.metric_descriptor_path_path(PROJECT_ID, custom_metric_type)
  response = api.get_metric_descriptor(name)
  print("Metric fetched: \n%s\n" % response)

  print("List metrics:")
  name = api.project_path(PROJECT_ID)
  # Iterate over all results
  for metric in api.list_metric_descriptors(name):
    # process element
    print(metric)

  print("delete metric:")
  name = api.metric_descriptor_path_path(PROJECT_ID, custom_metric_type)
  api.delete_metric_descriptor(name)


def testTimeseriesCollection():
  # This test doesn't print out anything. But all requests will work.
  api = metric_service_client.MetricServiceClient()
  name = api.project_path(PROJECT_ID)
  metric = api_metric_pb2.Metric(type='custom.googleapis.com/cbao/instance/cpu/usage_time')
  interval = common_pb2.TimeInterval(end_time=timestamp_pb2.Timestamp(seconds=1475262206))
  point = metric_pb2.Point(interval=interval, value=common_pb2.TypedValue(bool_value=True))
  time = metric_pb2.TimeSeries(metric=metric, points=[point])
  time_series = [time]
  api.create_time_series(name, time_series)

  filter_ = 'metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND metric.label.instance_name = "endpoints11-load-test"'

  view = enums.ListTimeSeriesRequest.TimeSeriesView.FULL
  for element in api.list_time_series(name, filter_, interval, view):
      # process element
      print(element)


def testMonitoredResourceCollection():
  api = metric_service_client.MetricServiceClient()
  name = api.project_path(PROJECT_ID)

  print("List monitored reourses:")
  # Iterate over all results
  for element in api.list_monitored_resource_descriptors(name):
    # process element
    print(element)

  name = api.monitored_resource_descriptor_path(PROJECT_ID, 'uptime_url')
  response = api.get_monitored_resource_descriptor(name)
  print("Get monitored resource\n%s" % response)


testGroupCollection()
testTimeseriesCollection()
testMonitoredResourceCollection()
testMetricCollection()
