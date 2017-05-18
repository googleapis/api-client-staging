import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2
import google.cloud.proto.privacy.dlp.v2beta1.dlp_pb2 as google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2


class DlpServiceStub(object):
  """The DLP API is a service that allows clients
  to detect the presence of Personally Identifiable Information (PII) and other
  privacy-sensitive data in user-supplied, unstructured data streams, like text
  blocks or images.
  The service also includes methods for sensitive data redaction and
  scheduling of data scans on Google Cloud Platform based data sets.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.InspectContent = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/InspectContent',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.InspectContentRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.InspectContentResponse.FromString,
        )
    self.RedactContent = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/RedactContent',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.RedactContentRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.RedactContentResponse.FromString,
        )
    self.CreateInspectOperation = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/CreateInspectOperation',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.CreateInspectOperationRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.ListInspectFindings = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/ListInspectFindings',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInspectFindingsRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInspectFindingsResponse.FromString,
        )
    self.ListInfoTypes = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/ListInfoTypes',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInfoTypesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInfoTypesResponse.FromString,
        )
    self.ListRootCategories = channel.unary_unary(
        '/google.privacy.dlp.v2beta1.DlpService/ListRootCategories',
        request_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListRootCategoriesRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListRootCategoriesResponse.FromString,
        )


class DlpServiceServicer(object):
  """The DLP API is a service that allows clients
  to detect the presence of Personally Identifiable Information (PII) and other
  privacy-sensitive data in user-supplied, unstructured data streams, like text
  blocks or images.
  The service also includes methods for sensitive data redaction and
  scheduling of data scans on Google Cloud Platform based data sets.
  """

  def InspectContent(self, request, context):
    """Find potentially sensitive info in a list of strings.
    This method has limits on input size, processing time, and output size.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def RedactContent(self, request, context):
    """Redact potentially sensitive info from a list of strings.
    This method has limits on input size, processing time, and output size.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateInspectOperation(self, request, context):
    """Schedule a job scanning content in a Google Cloud Platform data repository.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListInspectFindings(self, request, context):
    """Returns list of results for given inspect operation result set id.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListInfoTypes(self, request, context):
    """Returns sensitive information types for given category.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ListRootCategories(self, request, context):
    """Returns the list of root categories of sensitive information.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_DlpServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'InspectContent': grpc.unary_unary_rpc_method_handler(
          servicer.InspectContent,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.InspectContentRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.InspectContentResponse.SerializeToString,
      ),
      'RedactContent': grpc.unary_unary_rpc_method_handler(
          servicer.RedactContent,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.RedactContentRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.RedactContentResponse.SerializeToString,
      ),
      'CreateInspectOperation': grpc.unary_unary_rpc_method_handler(
          servicer.CreateInspectOperation,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.CreateInspectOperationRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'ListInspectFindings': grpc.unary_unary_rpc_method_handler(
          servicer.ListInspectFindings,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInspectFindingsRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInspectFindingsResponse.SerializeToString,
      ),
      'ListInfoTypes': grpc.unary_unary_rpc_method_handler(
          servicer.ListInfoTypes,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInfoTypesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListInfoTypesResponse.SerializeToString,
      ),
      'ListRootCategories': grpc.unary_unary_rpc_method_handler(
          servicer.ListRootCategories,
          request_deserializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListRootCategoriesRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_privacy_dot_dlp_dot_v2beta1_dot_dlp__pb2.ListRootCategoriesResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.privacy.dlp.v2beta1.DlpService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
