# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Wrappers for protocol buffer enum types."""


class CloudFunctionStatus(object):
    """
    Describes the current stage of a deployment.

    Attributes:
      STATUS_UNSPECIFIED (int): Status not specified.
      READY (int): Successfully deployed.
      FAILED (int): Not deployed correctly - behavior is undefined. The item should be updated
        or deleted to move it out of this state.
      DEPLOYING (int): Creation or update in progress.
      DELETING (int): Deletion in progress.
    """
    STATUS_UNSPECIFIED = 0
    READY = 1
    FAILED = 2
    DEPLOYING = 3
    DELETING = 4
