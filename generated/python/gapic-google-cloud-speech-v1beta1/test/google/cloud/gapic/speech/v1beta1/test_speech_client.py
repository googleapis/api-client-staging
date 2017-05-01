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
import unittest

from google.gax import errors
from google.rpc import status_pb2

from google.cloud.gapic.speech.v1beta1 import enums
from google.cloud.gapic.speech.v1beta1 import speech_client
from google.cloud.proto.speech.v1beta1 import cloud_speech_pb2
from google.longrunning import operations_pb2


class CustomException(Exception):
    pass


class TestSpeechClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_sync_recognize(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate = 44100
        config = cloud_speech_pb2.RecognitionConfig(
            encoding=encoding, sample_rate=sample_rate)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri=uri)

        # Mock response
        expected_response = cloud_speech_pb2.SyncRecognizeResponse()
        grpc_stub.SyncRecognize.return_value = expected_response

        response = client.sync_recognize(config, audio)
        self.assertEqual(expected_response, response)

        grpc_stub.SyncRecognize.assert_called_once()
        args, kwargs = grpc_stub.SyncRecognize.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = cloud_speech_pb2.SyncRecognizeRequest(
            config=config, audio=audio)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_sync_recognize_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate = 44100
        config = cloud_speech_pb2.RecognitionConfig(
            encoding=encoding, sample_rate=sample_rate)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri=uri)

        # Mock exception response
        grpc_stub.SyncRecognize.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.sync_recognize, config,
                          audio)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_async_recognize(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate = 44100
        config = cloud_speech_pb2.RecognitionConfig(
            encoding=encoding, sample_rate=sample_rate)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri=uri)

        # Mock response
        expected_response = cloud_speech_pb2.AsyncRecognizeResponse()
        operation = operations_pb2.Operation(
            name='operations/test_async_recognize', done=True)
        operation.response.Pack(expected_response)
        grpc_stub.AsyncRecognize.return_value = operation

        response = client.async_recognize(config, audio)
        self.assertEqual(expected_response, response.result())

        grpc_stub.AsyncRecognize.assert_called_once()
        args, kwargs = grpc_stub.AsyncRecognize.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = cloud_speech_pb2.AsyncRecognizeRequest(
            config=config, audio=audio)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_async_recognize_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        encoding = enums.RecognitionConfig.AudioEncoding.FLAC
        sample_rate = 44100
        config = cloud_speech_pb2.RecognitionConfig(
            encoding=encoding, sample_rate=sample_rate)
        uri = 'gs://bucket_name/file_name.flac'
        audio = cloud_speech_pb2.RecognitionAudio(uri=uri)

        # Mock exception response
        error = status_pb2.Status()
        operation = operations_pb2.Operation(
            name='operations/test_async_recognize_exception', done=True)
        operation.error.CopyFrom(error)
        grpc_stub.AsyncRecognize.return_value = operation

        response = client.async_recognize(config, audio)
        self.assertEqual(error, response.exception())

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_streaming_recognize(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        request = cloud_speech_pb2.StreamingRecognizeRequest()
        requests = [request]

        # Mock response
        result_index = 520358448
        expected_response = cloud_speech_pb2.StreamingRecognizeResponse(
            result_index=result_index)
        grpc_stub.StreamingRecognize.return_value = iter([expected_response])

        response = client.streaming_recognize(requests)
        resources = list(response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response, resources[0])

        grpc_stub.StreamingRecognize.assert_called_once()
        args, kwargs = grpc_stub.StreamingRecognize.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_requests = args[0]
        self.assertEqual(1, len(actual_requests))
        actual_request = list(actual_requests)[0]
        self.assertEqual(request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_streaming_recognize_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = speech_client.SpeechClient()

        # Mock request
        request = cloud_speech_pb2.StreamingRecognizeRequest()
        requests = [request]

        # Mock exception response
        grpc_stub.StreamingRecognize.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.streaming_recognize,
                          requests)
