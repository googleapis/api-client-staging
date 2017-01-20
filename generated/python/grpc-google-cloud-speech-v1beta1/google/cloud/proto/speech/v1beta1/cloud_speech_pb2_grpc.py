import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.speech.v1beta1.cloud_speech_pb2 as google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2
import google.cloud.proto.speech.v1beta1.cloud_speech_pb2 as google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2
import google.cloud.proto.speech.v1beta1.cloud_speech_pb2 as google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.speech.v1beta1.cloud_speech_pb2 as google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2
import google.cloud.proto.speech.v1beta1.cloud_speech_pb2 as google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2


class SpeechStub(object):
  """Service that implements Google Cloud Speech API.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.SyncRecognize = channel.unary_unary(
        '/google.cloud.speech.v1beta1.Speech/SyncRecognize',
        request_serializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.SyncRecognizeRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.SyncRecognizeResponse.FromString,
        )
    self.AsyncRecognize = channel.unary_unary(
        '/google.cloud.speech.v1beta1.Speech/AsyncRecognize',
        request_serializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.AsyncRecognizeRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.StreamingRecognize = channel.stream_stream(
        '/google.cloud.speech.v1beta1.Speech/StreamingRecognize',
        request_serializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.StreamingRecognizeRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.StreamingRecognizeResponse.FromString,
        )


class SpeechServicer(object):
  """Service that implements Google Cloud Speech API.
  """

  def SyncRecognize(self, request, context):
    """Perform synchronous speech-recognition: receive results after all audio
    has been sent and processed.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AsyncRecognize(self, request, context):
    """Perform asynchronous speech-recognition: receive results via the
    google.longrunning.Operations interface. Returns either an
    `Operation.error` or an `Operation.response` which contains
    an `AsyncRecognizeResponse` message.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def StreamingRecognize(self, request_iterator, context):
    """Perform bidirectional streaming speech-recognition: receive results while
    sending audio. This method is only available via the gRPC API (not REST).
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_SpeechServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'SyncRecognize': grpc.unary_unary_rpc_method_handler(
          servicer.SyncRecognize,
          request_deserializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.SyncRecognizeRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.SyncRecognizeResponse.SerializeToString,
      ),
      'AsyncRecognize': grpc.unary_unary_rpc_method_handler(
          servicer.AsyncRecognize,
          request_deserializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.AsyncRecognizeRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'StreamingRecognize': grpc.stream_stream_rpc_method_handler(
          servicer.StreamingRecognize,
          request_deserializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.StreamingRecognizeRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_speech_dot_v1beta1_dot_cloud__speech__pb2.StreamingRecognizeResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.cloud.speech.v1beta1.Speech', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
