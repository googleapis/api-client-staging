# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from __future__ import absolute_import

from google.cloud.monitoring_v3 import types
from google.cloud.monitoring_v3.gapic import enums
from google.cloud.monitoring_v3.gapic import group_service_client
from google.cloud.monitoring_v3.gapic import metric_service_client


class GroupServiceClient(group_service_client.GroupServiceClient):
    __doc__ = group_service_client.GroupServiceClient.__doc__
    enums = enums


class MetricServiceClient(metric_service_client.MetricServiceClient):
    __doc__ = metric_service_client.MetricServiceClient.__doc__
    enums = enums


__all__ = ('enums', 'types', 'GroupServiceClient', 'MetricServiceClient', )
