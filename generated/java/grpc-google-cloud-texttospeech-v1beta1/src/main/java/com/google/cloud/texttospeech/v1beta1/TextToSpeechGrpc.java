package com.google.cloud.texttospeech.v1beta1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service that implements Google Cloud Text-to-Speech API.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/texttospeech/v1beta1/cloud_tts.proto")
public final class TextToSpeechGrpc {

  private TextToSpeechGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.texttospeech.v1beta1.TextToSpeech";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.texttospeech.v1beta1.ListVoicesRequest,
      com.google.cloud.texttospeech.v1beta1.ListVoicesResponse> METHOD_LIST_VOICES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.texttospeech.v1beta1.TextToSpeech", "ListVoices"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.texttospeech.v1beta1.ListVoicesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.texttospeech.v1beta1.ListVoicesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest,
      com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse> METHOD_SYNTHESIZE_SPEECH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.texttospeech.v1beta1.TextToSpeech", "SynthesizeSpeech"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextToSpeechStub newStub(io.grpc.Channel channel) {
    return new TextToSpeechStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextToSpeechBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TextToSpeechBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TextToSpeechFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TextToSpeechFutureStub(channel);
  }

  /**
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static abstract class TextToSpeechImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a list of [Voice][google.cloud.texttospeech.v1beta1.Voice]
     * supported for synthesis.
     * </pre>
     */
    public void listVoices(com.google.cloud.texttospeech.v1beta1.ListVoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.ListVoicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_VOICES, responseObserver);
    }

    /**
     * <pre>
     * Synthesizes speech synchronously: receive results after all text input
     * has been processed.
     * </pre>
     */
    public void synthesizeSpeech(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SYNTHESIZE_SPEECH, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_VOICES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.texttospeech.v1beta1.ListVoicesRequest,
                com.google.cloud.texttospeech.v1beta1.ListVoicesResponse>(
                  this, METHODID_LIST_VOICES)))
          .addMethod(
            METHOD_SYNTHESIZE_SPEECH,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest,
                com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse>(
                  this, METHODID_SYNTHESIZE_SPEECH)))
          .build();
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechStub extends io.grpc.stub.AbstractStub<TextToSpeechStub> {
    private TextToSpeechStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextToSpeechStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextToSpeechStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of [Voice][google.cloud.texttospeech.v1beta1.Voice]
     * supported for synthesis.
     * </pre>
     */
    public void listVoices(com.google.cloud.texttospeech.v1beta1.ListVoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.ListVoicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_VOICES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Synthesizes speech synchronously: receive results after all text input
     * has been processed.
     * </pre>
     */
    public void synthesizeSpeech(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SYNTHESIZE_SPEECH, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechBlockingStub extends io.grpc.stub.AbstractStub<TextToSpeechBlockingStub> {
    private TextToSpeechBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextToSpeechBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextToSpeechBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of [Voice][google.cloud.texttospeech.v1beta1.Voice]
     * supported for synthesis.
     * </pre>
     */
    public com.google.cloud.texttospeech.v1beta1.ListVoicesResponse listVoices(com.google.cloud.texttospeech.v1beta1.ListVoicesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_VOICES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Synthesizes speech synchronously: receive results after all text input
     * has been processed.
     * </pre>
     */
    public com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse synthesizeSpeech(com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SYNTHESIZE_SPEECH, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service that implements Google Cloud Text-to-Speech API.
   * </pre>
   */
  public static final class TextToSpeechFutureStub extends io.grpc.stub.AbstractStub<TextToSpeechFutureStub> {
    private TextToSpeechFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextToSpeechFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextToSpeechFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextToSpeechFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of [Voice][google.cloud.texttospeech.v1beta1.Voice]
     * supported for synthesis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.texttospeech.v1beta1.ListVoicesResponse> listVoices(
        com.google.cloud.texttospeech.v1beta1.ListVoicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_VOICES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Synthesizes speech synchronously: receive results after all text input
     * has been processed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse> synthesizeSpeech(
        com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SYNTHESIZE_SPEECH, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_VOICES = 0;
  private static final int METHODID_SYNTHESIZE_SPEECH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextToSpeechImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextToSpeechImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_VOICES:
          serviceImpl.listVoices((com.google.cloud.texttospeech.v1beta1.ListVoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.ListVoicesResponse>) responseObserver);
          break;
        case METHODID_SYNTHESIZE_SPEECH:
          serviceImpl.synthesizeSpeech((com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse>) responseObserver);
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

  private static final class TextToSpeechDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TextToSpeechGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextToSpeechDescriptorSupplier())
              .addMethod(METHOD_LIST_VOICES)
              .addMethod(METHOD_SYNTHESIZE_SPEECH)
              .build();
        }
      }
    }
    return result;
  }
}
