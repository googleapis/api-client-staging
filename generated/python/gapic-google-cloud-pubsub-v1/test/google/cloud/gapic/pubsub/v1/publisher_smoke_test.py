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

import os
import time
import unittest

from google.cloud.gapic.pubsub.v1 import publisher_client
from google.cloud.proto.pubsub.v1 import pubsub_pb2


class PublisherSmokeTest(unittest.TestCase):
    def test_list_topics(self):
        project_id = os.environ['PROJECT_ID']

        client = publisher_client.PublisherClient()
        project = client.project_path(project_id)
        response = client.list_topics(project)
