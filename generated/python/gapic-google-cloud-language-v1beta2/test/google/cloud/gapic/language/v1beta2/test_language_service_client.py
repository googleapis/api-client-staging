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

from google.cloud.gapic.language.v1beta2 import enums
from google.cloud.gapic.language.v1beta2 import language_service_client
from google.cloud.proto.language.v1beta2 import language_service_pb2


class CustomException(Exception):
    pass


class TestLanguageServiceClient(unittest2.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_sentiment(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()

        # Mock response
        language = 'language-1613589672'
        expected_response = language_service_pb2.AnalyzeSentimentResponse(
            language)
        grpc_stub.AnalyzeSentiment.return_value = expected_response

        response = client.analyze_sentiment(document)
        self.assertEqual(expected_response, response)

        grpc_stub.AnalyzeSentiment.assert_called_once()
        request = grpc_stub.AnalyzeSentiment.call_args[0]

        self.assertEqual(document, request.document)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_sentiment_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()

        # Mock exception response
        grpc_stub.AnalyzeSentiment.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.analyze_sentiment, document)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_entities(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock response
        language = 'language-1613589672'
        expected_response = language_service_pb2.AnalyzeEntitiesResponse(
            language)
        grpc_stub.AnalyzeEntities.return_value = expected_response

        response = client.analyze_entities(document, encoding_type)
        self.assertEqual(expected_response, response)

        grpc_stub.AnalyzeEntities.assert_called_once()
        request = grpc_stub.AnalyzeEntities.call_args[0]

        self.assertEqual(document, request.document)
        self.assertEqual(encoding_type, request.encoding_type)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_entities_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock exception response
        grpc_stub.AnalyzeEntities.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.analyze_entities, document,
                          encoding_type)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_entity_sentiment(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock response
        language = 'language-1613589672'
        expected_response = language_service_pb2.AnalyzeEntitySentimentResponse(
            language)
        grpc_stub.AnalyzeEntitySentiment.return_value = expected_response

        response = client.analyze_entity_sentiment(document, encoding_type)
        self.assertEqual(expected_response, response)

        grpc_stub.AnalyzeEntitySentiment.assert_called_once()
        request = grpc_stub.AnalyzeEntitySentiment.call_args[0]

        self.assertEqual(document, request.document)
        self.assertEqual(encoding_type, request.encoding_type)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_entity_sentiment_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock exception response
        grpc_stub.AnalyzeEntitySentiment.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.analyze_entity_sentiment,
                          document, encoding_type)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_syntax(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock response
        language = 'language-1613589672'
        expected_response = language_service_pb2.AnalyzeSyntaxResponse(
            language)
        grpc_stub.AnalyzeSyntax.return_value = expected_response

        response = client.analyze_syntax(document, encoding_type)
        self.assertEqual(expected_response, response)

        grpc_stub.AnalyzeSyntax.assert_called_once()
        request = grpc_stub.AnalyzeSyntax.call_args[0]

        self.assertEqual(document, request.document)
        self.assertEqual(encoding_type, request.encoding_type)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_analyze_syntax_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        encoding_type = enums.EncodingType.NONE

        # Mock exception response
        grpc_stub.AnalyzeSyntax.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.analyze_syntax, document,
                          encoding_type)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_annotate_text(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        features = language_service_pb2.AnnotateTextRequest.Features()
        encoding_type = enums.EncodingType.NONE

        # Mock response
        language = 'language-1613589672'
        expected_response = language_service_pb2.AnnotateTextResponse(language)
        grpc_stub.AnnotateText.return_value = expected_response

        response = client.annotate_text(document, features, encoding_type)
        self.assertEqual(expected_response, response)

        grpc_stub.AnnotateText.assert_called_once()
        request = grpc_stub.AnnotateText.call_args[0]

        self.assertEqual(document, request.document)
        self.assertEqual(features, request.features)
        self.assertEqual(encoding_type, request.encoding_type)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_annotate_text_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=language_service_pb2.LanguageServiceStub)
        mock_create_stub.return_value = grpc_stub

        client = language_service_client.LanguageServiceClient()

        # Mock request
        document = language_service_pb2.Document()
        features = language_service_pb2.AnnotateTextRequest.Features()
        encoding_type = enums.EncodingType.NONE

        # Mock exception response
        grpc_stub.AnnotateText.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.annotate_text, document,
                          features, encoding_type)
