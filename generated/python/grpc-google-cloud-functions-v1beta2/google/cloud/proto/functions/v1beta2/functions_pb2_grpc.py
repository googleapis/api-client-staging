import grpc
from grpc.framework.common import cardinality
from grpc.framework.interfaces.face import utilities as face_utilities

import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.longrunning.operations_pb2 as google_dot_longrunning_dot_operations__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2
import google.cloud.proto.functions.v1beta2.functions_pb2 as google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2


class CloudFunctionsServiceStub(object):
  """A service that application uses to manipulate triggers and functions.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.ListFunctions = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/ListFunctions',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.ListFunctionsRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.ListFunctionsResponse.FromString,
        )
    self.GetFunction = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/GetFunction',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.GetFunctionRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CloudFunction.FromString,
        )
    self.CreateFunction = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/CreateFunction',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CreateFunctionRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.UpdateFunction = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/UpdateFunction',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.UpdateFunctionRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.DeleteFunction = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/DeleteFunction',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.DeleteFunctionRequest.SerializeToString,
        response_deserializer=google_dot_longrunning_dot_operations__pb2.Operation.FromString,
        )
    self.CallFunction = channel.unary_unary(
        '/google.cloud.functions.v1beta2.CloudFunctionsService/CallFunction',
        request_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CallFunctionRequest.SerializeToString,
        response_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CallFunctionResponse.FromString,
        )


class CloudFunctionsServiceServicer(object):
  """A service that application uses to manipulate triggers and functions.
  """

  def ListFunctions(self, request, context):
    """Returns a list of functions that belong to the requested project.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetFunction(self, request, context):
    """Returns a function with the given name from the requested project.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateFunction(self, request, context):
    """Creates a new function. If a function with the given name already exists in
    the specified project, the long running operation will return
    ALREADY_EXISTS error.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def UpdateFunction(self, request, context):
    """Updates existing function.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteFunction(self, request, context):
    """Deletes a function with the given name from the specified project. If the
    given function is used by some trigger, the trigger will be updated to
    remove this function.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CallFunction(self, request, context):
    """Invokes synchronously deployed function. To be used for testing, very
    limited traffic allowed.
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_CloudFunctionsServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'ListFunctions': grpc.unary_unary_rpc_method_handler(
          servicer.ListFunctions,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.ListFunctionsRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.ListFunctionsResponse.SerializeToString,
      ),
      'GetFunction': grpc.unary_unary_rpc_method_handler(
          servicer.GetFunction,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.GetFunctionRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CloudFunction.SerializeToString,
      ),
      'CreateFunction': grpc.unary_unary_rpc_method_handler(
          servicer.CreateFunction,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CreateFunctionRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'UpdateFunction': grpc.unary_unary_rpc_method_handler(
          servicer.UpdateFunction,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.UpdateFunctionRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'DeleteFunction': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteFunction,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.DeleteFunctionRequest.FromString,
          response_serializer=google_dot_longrunning_dot_operations__pb2.Operation.SerializeToString,
      ),
      'CallFunction': grpc.unary_unary_rpc_method_handler(
          servicer.CallFunction,
          request_deserializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CallFunctionRequest.FromString,
          response_serializer=google_dot_cloud_dot_proto_dot_functions_dot_v1beta2_dot_functions__pb2.CallFunctionResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'google.cloud.functions.v1beta2.CloudFunctionsService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
