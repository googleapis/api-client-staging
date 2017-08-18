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

from google.cloud.functions import types
from google.cloud.functions.v1beta2 import cloud_functions_service_client
from google.cloud.functions.v1beta2 import enums


class CloudFunctionsServiceClient(
        cloud_functions_service_client.CloudFunctionsServiceClient):
    __doc__ = cloud_functions_service_client.CloudFunctionsServiceClient.__doc__
    enums = enums


__all__ = ('enums', 'types', 'CloudFunctionsServiceClient', )
