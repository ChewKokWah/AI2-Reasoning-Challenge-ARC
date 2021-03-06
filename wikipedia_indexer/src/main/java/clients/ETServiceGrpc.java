package clients;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: essential_terms_service.proto")
public final class ETServiceGrpc {

  private ETServiceGrpc() {}

  public static final String SERVICE_NAME = "services.ETService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetEssentialnessScoresMethod()} instead. 
  public static final io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> METHOD_GET_ESSENTIALNESS_SCORES = getGetEssentialnessScoresMethodHelper();

  private static volatile io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresMethod() {
    return getGetEssentialnessScoresMethodHelper();
  }

  private static io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresMethodHelper() {
    io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest, clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresMethod;
    if ((getGetEssentialnessScoresMethod = ETServiceGrpc.getGetEssentialnessScoresMethod) == null) {
      synchronized (ETServiceGrpc.class) {
        if ((getGetEssentialnessScoresMethod = ETServiceGrpc.getGetEssentialnessScoresMethod) == null) {
          ETServiceGrpc.getGetEssentialnessScoresMethod = getGetEssentialnessScoresMethod = 
              io.grpc.MethodDescriptor.<clients.ETServiceProtos.ETScoresRequest, clients.ETServiceProtos.ETScoresCompressedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "services.ETService", "GetEssentialnessScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clients.ETServiceProtos.ETScoresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clients.ETServiceProtos.ETScoresCompressedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ETServiceMethodDescriptorSupplier("GetEssentialnessScores"))
                  .build();
          }
        }
     }
     return getGetEssentialnessScoresMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetEssentialnessScoresFakeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> METHOD_GET_ESSENTIALNESS_SCORES_FAKE = getGetEssentialnessScoresFakeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresFakeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresFakeMethod() {
    return getGetEssentialnessScoresFakeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest,
      clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresFakeMethodHelper() {
    io.grpc.MethodDescriptor<clients.ETServiceProtos.ETScoresRequest, clients.ETServiceProtos.ETScoresCompressedResponse> getGetEssentialnessScoresFakeMethod;
    if ((getGetEssentialnessScoresFakeMethod = ETServiceGrpc.getGetEssentialnessScoresFakeMethod) == null) {
      synchronized (ETServiceGrpc.class) {
        if ((getGetEssentialnessScoresFakeMethod = ETServiceGrpc.getGetEssentialnessScoresFakeMethod) == null) {
          ETServiceGrpc.getGetEssentialnessScoresFakeMethod = getGetEssentialnessScoresFakeMethod = 
              io.grpc.MethodDescriptor.<clients.ETServiceProtos.ETScoresRequest, clients.ETServiceProtos.ETScoresCompressedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "services.ETService", "GetEssentialnessScoresFake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clients.ETServiceProtos.ETScoresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clients.ETServiceProtos.ETScoresCompressedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ETServiceMethodDescriptorSupplier("GetEssentialnessScoresFake"))
                  .build();
          }
        }
     }
     return getGetEssentialnessScoresFakeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ETServiceStub newStub(io.grpc.Channel channel) {
    return new ETServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ETServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ETServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ETServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ETServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ETServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEssentialnessScores(clients.ETServiceProtos.ETScoresRequest request,
        io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEssentialnessScoresMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * bytes is a compressed ETScoresResponse. 
     * </pre>
     */
    public void getEssentialnessScoresFake(clients.ETServiceProtos.ETScoresRequest request,
        io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEssentialnessScoresFakeMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEssentialnessScoresMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                clients.ETServiceProtos.ETScoresRequest,
                clients.ETServiceProtos.ETScoresCompressedResponse>(
                  this, METHODID_GET_ESSENTIALNESS_SCORES)))
          .addMethod(
            getGetEssentialnessScoresFakeMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                clients.ETServiceProtos.ETScoresRequest,
                clients.ETServiceProtos.ETScoresCompressedResponse>(
                  this, METHODID_GET_ESSENTIALNESS_SCORES_FAKE)))
          .build();
    }
  }

  /**
   */
  public static final class ETServiceStub extends io.grpc.stub.AbstractStub<ETServiceStub> {
    private ETServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ETServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ETServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ETServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEssentialnessScores(clients.ETServiceProtos.ETScoresRequest request,
        io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEssentialnessScoresMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bytes is a compressed ETScoresResponse. 
     * </pre>
     */
    public void getEssentialnessScoresFake(clients.ETServiceProtos.ETScoresRequest request,
        io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetEssentialnessScoresFakeMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ETServiceBlockingStub extends io.grpc.stub.AbstractStub<ETServiceBlockingStub> {
    private ETServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ETServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ETServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ETServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<clients.ETServiceProtos.ETScoresCompressedResponse> getEssentialnessScores(
        clients.ETServiceProtos.ETScoresRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEssentialnessScoresMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bytes is a compressed ETScoresResponse. 
     * </pre>
     */
    public java.util.Iterator<clients.ETServiceProtos.ETScoresCompressedResponse> getEssentialnessScoresFake(
        clients.ETServiceProtos.ETScoresRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetEssentialnessScoresFakeMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ETServiceFutureStub extends io.grpc.stub.AbstractStub<ETServiceFutureStub> {
    private ETServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ETServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ETServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ETServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ESSENTIALNESS_SCORES = 0;
  private static final int METHODID_GET_ESSENTIALNESS_SCORES_FAKE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ETServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ETServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ESSENTIALNESS_SCORES:
          serviceImpl.getEssentialnessScores((clients.ETServiceProtos.ETScoresRequest) request,
              (io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse>) responseObserver);
          break;
        case METHODID_GET_ESSENTIALNESS_SCORES_FAKE:
          serviceImpl.getEssentialnessScoresFake((clients.ETServiceProtos.ETScoresRequest) request,
              (io.grpc.stub.StreamObserver<clients.ETServiceProtos.ETScoresCompressedResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ETServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ETServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clients.ETServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ETService");
    }
  }

  private static final class ETServiceFileDescriptorSupplier
      extends ETServiceBaseDescriptorSupplier {
    ETServiceFileDescriptorSupplier() {}
  }

  private static final class ETServiceMethodDescriptorSupplier
      extends ETServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ETServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ETServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ETServiceFileDescriptorSupplier())
              .addMethod(getGetEssentialnessScoresMethodHelper())
              .addMethod(getGetEssentialnessScoresFakeMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
