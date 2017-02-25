import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.vision.v1.image_annotator_pb2 as google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2
import google.cloud.proto.vision.v1.image_annotator_pb2 as google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2


class ImageAnnotatorStub(object):
  """Service that performs Google Cloud Vision API detection tasks over client
  images, such as face, landmark, logo, label, and text detection. The
  ImageAnnotator service returns detected entities from the images.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.BatchAnnotateImages = channel.unary_unary(
        '/google.cloud.vision.v1.ImageAnnotator/BatchAnnotateImages',
        request_serializer=google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2.BatchAnnotateImagesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2.BatchAnnotateImagesResponse.FromString,
        )


class ImageAnnotatorServicer(object):
  """Service that performs Google Cloud Vision API detection tasks over client
  images, such as face, landmark, logo, label, and text detection. The
  ImageAnnotator service returns detected entities from the images.
  """

  def BatchAnnotateImages(self, request, context):
    """Run image detection and annotation for a batch of images.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ImageAnnotatorServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'BatchAnnotateImages': grpc.unary_unary_rpc_method_handler(
          servicer.BatchAnnotateImages,
          request_deserializer=google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2.BatchAnnotateImagesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_vision_dot_v1_dot_image__annotator__pb2.BatchAnnotateImagesResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.cloud.vision.v1.ImageAnnotator', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
