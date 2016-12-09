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
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/cloud/language/v1/language_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.cloud.language.v1 LanguageService API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.language.v1 import enums
from google.cloud.grpc.language.v1 import language_service_pb2


class LanguageServiceClient(object):
    """
    Provides text analysis operations such as sentiment analysis and entity
    recognition.
    """

    SERVICE_ADDRESS = 'language.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform', )

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name='gax',
                 app_version=_GAX_VERSION):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A LanguageServiceClient object.
        """
        if scopes is None:
            scopes = self._ALL_SCOPES
        if client_config is None:
            client_config = {}
        goog_api_client = '{}/{} {} gax/{} python/{}'.format(
            app_name, app_version, self._CODE_GEN_NAME_VERSION,
            self._GAX_VERSION, platform.python_version())
        metadata = [('x-goog-api-client', goog_api_client)]
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'language_service_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.cloud.language.v1.LanguageService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata})
        self.language_service_stub = config.create_stub(
            language_service_pb2.LanguageServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._analyze_sentiment = api_callable.create_api_call(
            self.language_service_stub.AnalyzeSentiment,
            settings=defaults['analyze_sentiment'])
        self._analyze_entities = api_callable.create_api_call(
            self.language_service_stub.AnalyzeEntities,
            settings=defaults['analyze_entities'])
        self._analyze_syntax = api_callable.create_api_call(
            self.language_service_stub.AnalyzeSyntax,
            settings=defaults['analyze_syntax'])
        self._annotate_text = api_callable.create_api_call(
            self.language_service_stub.AnnotateText,
            settings=defaults['annotate_text'])

    # Service calls
    def analyze_sentiment(self, document, encoding_type=None, options=None):
        """
        Analyzes the sentiment of the provided text.

        Example:
          >>> from google.cloud.gapic.language.v1 import language_service_client
          >>> from google.cloud.grpc.language.v1 import language_service_pb2
          >>> api = language_service_client.LanguageServiceClient()
          >>> document = language_service_pb2.Document()
          >>> response = api.analyze_sentiment(document)

        Args:
          document (:class:`google.cloud.grpc.language.v1.language_service_pb2.Document`): Input document. Currently, ``analyzeSentiment`` only supports English text
            (``Document.language``=\"EN\").
          encoding_type (enum :class:`google.cloud.gapic.language.v1.enums.EncodingType`): The encoding type used by the API to calculate sentence offsets.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.language.v1.language_service_pb2.AnalyzeSentimentResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if encoding_type is None:
            encoding_type = enums.EncodingType.NONE
        request = language_service_pb2.AnalyzeSentimentRequest(
            document=document, encoding_type=encoding_type)
        return self._analyze_sentiment(request, options)

    def analyze_entities(self, document, encoding_type, options=None):
        """
        Finds named entities (currently finds proper names) in the text,
        entity types, salience, mentions for each entity, and other properties.

        Example:
          >>> from google.cloud.gapic.language.v1 import language_service_client
          >>> from google.cloud.gapic.language.v1 import enums
          >>> from google.cloud.grpc.language.v1 import language_service_pb2
          >>> api = language_service_client.LanguageServiceClient()
          >>> document = language_service_pb2.Document()
          >>> encoding_type = enums.EncodingType.NONE
          >>> response = api.analyze_entities(document, encoding_type)

        Args:
          document (:class:`google.cloud.grpc.language.v1.language_service_pb2.Document`): Input document.
          encoding_type (enum :class:`google.cloud.gapic.language.v1.enums.EncodingType`): The encoding type used by the API to calculate offsets.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.language.v1.language_service_pb2.AnalyzeEntitiesResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = language_service_pb2.AnalyzeEntitiesRequest(
            document=document, encoding_type=encoding_type)
        return self._analyze_entities(request, options)

    def analyze_syntax(self, document, encoding_type, options=None):
        """
        Analyzes the syntax of the text and provides sentence boundaries and
        tokenization along with part of speech tags, dependency trees, and other
        properties.

        Example:
          >>> from google.cloud.gapic.language.v1 import language_service_client
          >>> from google.cloud.gapic.language.v1 import enums
          >>> from google.cloud.grpc.language.v1 import language_service_pb2
          >>> api = language_service_client.LanguageServiceClient()
          >>> document = language_service_pb2.Document()
          >>> encoding_type = enums.EncodingType.NONE
          >>> response = api.analyze_syntax(document, encoding_type)

        Args:
          document (:class:`google.cloud.grpc.language.v1.language_service_pb2.Document`): Input document.
          encoding_type (enum :class:`google.cloud.gapic.language.v1.enums.EncodingType`): The encoding type used by the API to calculate offsets.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.language.v1.language_service_pb2.AnalyzeSyntaxResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = language_service_pb2.AnalyzeSyntaxRequest(
            document=document, encoding_type=encoding_type)
        return self._analyze_syntax(request, options)

    def annotate_text(self, document, features, encoding_type, options=None):
        """
        A convenience method that provides all the features that analyzeSentiment,
        analyzeEntities, and analyzeSyntax provide in one call.

        Example:
          >>> from google.cloud.gapic.language.v1 import language_service_client
          >>> from google.cloud.gapic.language.v1 import enums
          >>> from google.cloud.grpc.language.v1 import language_service_pb2
          >>> api = language_service_client.LanguageServiceClient()
          >>> document = language_service_pb2.Document()
          >>> features = language_service_pb2.AnnotateTextRequest.Features()
          >>> encoding_type = enums.EncodingType.NONE
          >>> response = api.annotate_text(document, features, encoding_type)

        Args:
          document (:class:`google.cloud.grpc.language.v1.language_service_pb2.Document`): Input document.
          features (:class:`google.cloud.grpc.language.v1.language_service_pb2.AnnotateTextRequest.Features`): The enabled features.
          encoding_type (enum :class:`google.cloud.gapic.language.v1.enums.EncodingType`): The encoding type used by the API to calculate offsets.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.grpc.language.v1.language_service_pb2.AnnotateTextResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = language_service_pb2.AnnotateTextRequest(
            document=document, features=features, encoding_type=encoding_type)
        return self._annotate_text(request, options)
