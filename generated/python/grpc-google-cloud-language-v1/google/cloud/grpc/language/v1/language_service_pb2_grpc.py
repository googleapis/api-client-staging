import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2
import google.cloud.grpc.language.v1.language_service_pb2 as google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2


class LanguageServiceStub(object):
  """Provides text analysis operations such as sentiment analysis and entity
  recognition.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.AnalyzeSentiment = channel.unary_unary(
        '/google.cloud.language.v1.LanguageService/AnalyzeSentiment',
        request_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSentimentRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSentimentResponse.FromString,
        )
    self.AnalyzeEntities = channel.unary_unary(
        '/google.cloud.language.v1.LanguageService/AnalyzeEntities',
        request_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeEntitiesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeEntitiesResponse.FromString,
        )
    self.AnalyzeSyntax = channel.unary_unary(
        '/google.cloud.language.v1.LanguageService/AnalyzeSyntax',
        request_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSyntaxRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSyntaxResponse.FromString,
        )
    self.AnnotateText = channel.unary_unary(
        '/google.cloud.language.v1.LanguageService/AnnotateText',
        request_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnnotateTextRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnnotateTextResponse.FromString,
        )


class LanguageServiceServicer(object):
  """Provides text analysis operations such as sentiment analysis and entity
  recognition.
  """

  def AnalyzeSentiment(self, request, context):
    """Analyzes the sentiment of the provided text.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AnalyzeEntities(self, request, context):
    """Finds named entities (currently finds proper names) in the text,
    entity types, salience, mentions for each entity, and other properties.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AnalyzeSyntax(self, request, context):
    """Analyzes the syntax of the text and provides sentence boundaries and
    tokenization along with part of speech tags, dependency trees, and other
    properties.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AnnotateText(self, request, context):
    """A convenience method that provides all the features that analyzeSentiment,
    analyzeEntities, and analyzeSyntax provide in one call.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_LanguageServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'AnalyzeSentiment': grpc.unary_unary_rpc_method_handler(
          servicer.AnalyzeSentiment,
          request_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSentimentRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSentimentResponse.SerializeToString,
      ),
      'AnalyzeEntities': grpc.unary_unary_rpc_method_handler(
          servicer.AnalyzeEntities,
          request_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeEntitiesRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeEntitiesResponse.SerializeToString,
      ),
      'AnalyzeSyntax': grpc.unary_unary_rpc_method_handler(
          servicer.AnalyzeSyntax,
          request_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSyntaxRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnalyzeSyntaxResponse.SerializeToString,
      ),
      'AnnotateText': grpc.unary_unary_rpc_method_handler(
          servicer.AnnotateText,
          request_deserializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnnotateTextRequest.FromString,
          response_serializer=google_dot_cloud_dot_grpc_dot_language_dot_v1_dot_language__service__pb2.AnnotateTextResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.cloud.language.v1.LanguageService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
