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

import time
import unittest

from google.cloud import speech_v1
from google.cloud.proto.speech.v1 import cloud_speech_pb2
from google.cloud.speech_v1 import enums


class TestSystemSpeech(unittest.TestCase):
    def test_recognize(self):

        client = speech_v1.SpeechClient()
        language_code = 'en-US'
        sample_rate_hertz = 44100
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        config = {
            'language_code': language_code,
            'sample_rate_hertz': sample_rate_hertz,
            'encoding': encoding
        }
        uri = 'gs://gapic-toolkit/hello.flac'
        audio = {'uri': uri}
        response = client.recognize(config, audio)
