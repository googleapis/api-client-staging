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

from google.cloud.spanner_admin_instance_v1 import types
from google.cloud.spanner_admin_instance_v1.gapic import enums
from google.cloud.spanner_admin_instance_v1.gapic import instance_admin_client


class InstanceAdminClient(instance_admin_client.InstanceAdminClient):
    __doc__ = instance_admin_client.InstanceAdminClient.__doc__
    enums = enums


__all__ = ('enums', 'types', 'InstanceAdminClient', )
