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
"""Unit tests."""

import mock
import unittest2

from google.gax import errors
from google.rpc import status_pb2

from google.cloud.gapic.speech.v1 import enums
from google.cloud.gapic.speech.v1 import speech_client
from google.cloud.proto.speech.v1 import cloud_speech_pb2
from google.longrunning import operations_pb2


class CustomException(Exception):
    pass


class TestSpeechClient(unittest2.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_recognize(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=cloud_speech_pb2.SpeechStub)
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate_hertz = 44100
        language_code = 'en-US'
        config = cloud_speech_pb2.RecognitionConfig(
            encoding, sample_rate_hertz, language_code)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri)

        # Mock response
        expected_response = cloud_speech_pb2.RecognizeResponse()
        grpc_stub.Recognize.return_value = expected_response

        response = client.recognize(config, audio)
        self.assertEqual(expected_response, response)

        grpc_stub.Recognize.assert_called_once()
        request = grpc_stub.Recognize.call_args[0]

        self.assertEqual(config, request.config)
        self.assertEqual(audio, request.audio)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_recognize_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=cloud_speech_pb2.SpeechStub)
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate_hertz = 44100
        language_code = 'en-US'
        config = cloud_speech_pb2.RecognitionConfig(
            encoding, sample_rate_hertz, language_code)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri)

        # Mock exception response
        grpc_stub.Recognize.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.recognize, config, audio)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_long_running_recognize(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=cloud_speech_pb2.SpeechStub)
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate_hertz = 44100
        language_code = 'en-US'
        config = cloud_speech_pb2.RecognitionConfig(
            encoding, sample_rate_hertz, language_code)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri)

        # Mock response
        expected_response = cloud_speech_pb2.LongRunningRecognizeResponse()
        operation = operations_pb2.Operation(
            'operations/test_long_running_recognize', True)
        operation.response.Pack(expected_response)
        grpc_stub.LongRunningRecognize.return_value = operation

        response = client.long_running_recognize(config, audio)
        self.assertEqual(expected_response, response.result())

        grpc_stub.LongRunningRecognize.assert_called_once()
        request = grpc_stub.LongRunningRecognize.call_args[0]

        self.assertEqual(config, request.config)
        self.assertEqual(audio, request.audio)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_long_running_recognize_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=cloud_speech_pb2.SpeechStub)
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate_hertz = 44100
        language_code = 'en-US'
        config = cloud_speech_pb2.RecognitionConfig(
            encoding, sample_rate_hertz, language_code)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri)

        # Mock exception response
        error = status_pb2.Status()
        operation = operations_pb2.Operation(
            'operations/test_long_running_recognize_exception', True)
        operation.error.CopyFrom(error)
        grpc_stub.LongRunningRecognize.return_value = operation

        response = client.long_running_recognize(config, audio)
        self.assertEqual(error, response.exception())
