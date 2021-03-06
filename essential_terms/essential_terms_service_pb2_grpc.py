# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import essential_terms_service_pb2 as essential__terms__service__pb2


class ETServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetEssentialnessScores = channel.unary_stream(
        '/services.ETService/GetEssentialnessScores',
        request_serializer=essential__terms__service__pb2.ETScoresRequest.SerializeToString,
        response_deserializer=essential__terms__service__pb2.ETScoresCompressedResponse.FromString,
        )
    self.GetEssentialnessScoresFake = channel.unary_stream(
        '/services.ETService/GetEssentialnessScoresFake',
        request_serializer=essential__terms__service__pb2.ETScoresRequest.SerializeToString,
        response_deserializer=essential__terms__service__pb2.ETScoresCompressedResponse.FromString,
        )


class ETServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetEssentialnessScores(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetEssentialnessScoresFake(self, request, context):
    """Returns random numbers. To be used for debug, because is much faster. 

    bytes is a compressed ETScoresResponse. 
    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ETServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetEssentialnessScores': grpc.unary_stream_rpc_method_handler(
          servicer.GetEssentialnessScores,
          request_deserializer=essential__terms__service__pb2.ETScoresRequest.FromString,
          response_serializer=essential__terms__service__pb2.ETScoresCompressedResponse.SerializeToString,
      ),
      'GetEssentialnessScoresFake': grpc.unary_stream_rpc_method_handler(
          servicer.GetEssentialnessScoresFake,
          request_deserializer=essential__terms__service__pb2.ETScoresRequest.FromString,
          response_serializer=essential__terms__service__pb2.ETScoresCompressedResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'services.ETService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
