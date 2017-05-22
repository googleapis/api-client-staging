package com.google.cloud.language.v1;

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
 * Provides text analysis operations such as sentiment analysis and entity
 * recognition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/language/v1/language_service.proto")
public final class LanguageServiceGrpc {

  private LanguageServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.language.v1.LanguageService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.language.v1.AnalyzeSentimentRequest,
      com.google.cloud.language.v1.AnalyzeSentimentResponse> METHOD_ANALYZE_SENTIMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.language.v1.LanguageService", "AnalyzeSentiment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeSentimentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeSentimentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.language.v1.AnalyzeEntitiesRequest,
      com.google.cloud.language.v1.AnalyzeEntitiesResponse> METHOD_ANALYZE_ENTITIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.language.v1.LanguageService", "AnalyzeEntities"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeEntitiesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.language.v1.AnalyzeSyntaxRequest,
      com.google.cloud.language.v1.AnalyzeSyntaxResponse> METHOD_ANALYZE_SYNTAX =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.language.v1.LanguageService", "AnalyzeSyntax"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeSyntaxRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnalyzeSyntaxResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.language.v1.AnnotateTextRequest,
      com.google.cloud.language.v1.AnnotateTextResponse> METHOD_ANNOTATE_TEXT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.language.v1.LanguageService", "AnnotateText"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnnotateTextRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.language.v1.AnnotateTextResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LanguageServiceStub newStub(io.grpc.Channel channel) {
    return new LanguageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LanguageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LanguageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static LanguageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LanguageServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Provides text analysis operations such as sentiment analysis and entity
   * recognition.
   * </pre>
   */
  public static abstract class LanguageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Analyzes the sentiment of the provided text.
     * </pre>
     */
    public void analyzeSentiment(com.google.cloud.language.v1.AnalyzeSentimentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSentimentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANALYZE_SENTIMENT, responseObserver);
    }

    /**
     * <pre>
     * Finds named entities (currently proper names and common nouns) in the text
     * along with entity types, salience, mentions for each entity, and
     * other properties.
     * </pre>
     */
    public void analyzeEntities(com.google.cloud.language.v1.AnalyzeEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeEntitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANALYZE_ENTITIES, responseObserver);
    }

    /**
     * <pre>
     * Analyzes the syntax of the text and provides sentence boundaries and
     * tokenization along with part of speech tags, dependency trees, and other
     * properties.
     * </pre>
     */
    public void analyzeSyntax(com.google.cloud.language.v1.AnalyzeSyntaxRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSyntaxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANALYZE_SYNTAX, responseObserver);
    }

    /**
     * <pre>
     * A convenience method that provides all the features that analyzeSentiment,
     * analyzeEntities, and analyzeSyntax provide in one call.
     * </pre>
     */
    public void annotateText(com.google.cloud.language.v1.AnnotateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnnotateTextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANNOTATE_TEXT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ANALYZE_SENTIMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.language.v1.AnalyzeSentimentRequest,
                com.google.cloud.language.v1.AnalyzeSentimentResponse>(
                  this, METHODID_ANALYZE_SENTIMENT)))
          .addMethod(
            METHOD_ANALYZE_ENTITIES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.language.v1.AnalyzeEntitiesRequest,
                com.google.cloud.language.v1.AnalyzeEntitiesResponse>(
                  this, METHODID_ANALYZE_ENTITIES)))
          .addMethod(
            METHOD_ANALYZE_SYNTAX,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.language.v1.AnalyzeSyntaxRequest,
                com.google.cloud.language.v1.AnalyzeSyntaxResponse>(
                  this, METHODID_ANALYZE_SYNTAX)))
          .addMethod(
            METHOD_ANNOTATE_TEXT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.language.v1.AnnotateTextRequest,
                com.google.cloud.language.v1.AnnotateTextResponse>(
                  this, METHODID_ANNOTATE_TEXT)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides text analysis operations such as sentiment analysis and entity
   * recognition.
   * </pre>
   */
  public static final class LanguageServiceStub extends io.grpc.stub.AbstractStub<LanguageServiceStub> {
    private LanguageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes the sentiment of the provided text.
     * </pre>
     */
    public void analyzeSentiment(com.google.cloud.language.v1.AnalyzeSentimentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSentimentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_SENTIMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finds named entities (currently proper names and common nouns) in the text
     * along with entity types, salience, mentions for each entity, and
     * other properties.
     * </pre>
     */
    public void analyzeEntities(com.google.cloud.language.v1.AnalyzeEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeEntitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_ENTITIES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Analyzes the syntax of the text and provides sentence boundaries and
     * tokenization along with part of speech tags, dependency trees, and other
     * properties.
     * </pre>
     */
    public void analyzeSyntax(com.google.cloud.language.v1.AnalyzeSyntaxRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSyntaxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_SYNTAX, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A convenience method that provides all the features that analyzeSentiment,
     * analyzeEntities, and analyzeSyntax provide in one call.
     * </pre>
     */
    public void annotateText(com.google.cloud.language.v1.AnnotateTextRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnnotateTextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANNOTATE_TEXT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides text analysis operations such as sentiment analysis and entity
   * recognition.
   * </pre>
   */
  public static final class LanguageServiceBlockingStub extends io.grpc.stub.AbstractStub<LanguageServiceBlockingStub> {
    private LanguageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes the sentiment of the provided text.
     * </pre>
     */
    public com.google.cloud.language.v1.AnalyzeSentimentResponse analyzeSentiment(com.google.cloud.language.v1.AnalyzeSentimentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_SENTIMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Finds named entities (currently proper names and common nouns) in the text
     * along with entity types, salience, mentions for each entity, and
     * other properties.
     * </pre>
     */
    public com.google.cloud.language.v1.AnalyzeEntitiesResponse analyzeEntities(com.google.cloud.language.v1.AnalyzeEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_ENTITIES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Analyzes the syntax of the text and provides sentence boundaries and
     * tokenization along with part of speech tags, dependency trees, and other
     * properties.
     * </pre>
     */
    public com.google.cloud.language.v1.AnalyzeSyntaxResponse analyzeSyntax(com.google.cloud.language.v1.AnalyzeSyntaxRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANALYZE_SYNTAX, getCallOptions(), request);
    }

    /**
     * <pre>
     * A convenience method that provides all the features that analyzeSentiment,
     * analyzeEntities, and analyzeSyntax provide in one call.
     * </pre>
     */
    public com.google.cloud.language.v1.AnnotateTextResponse annotateText(com.google.cloud.language.v1.AnnotateTextRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANNOTATE_TEXT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides text analysis operations such as sentiment analysis and entity
   * recognition.
   * </pre>
   */
  public static final class LanguageServiceFutureStub extends io.grpc.stub.AbstractStub<LanguageServiceFutureStub> {
    private LanguageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LanguageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LanguageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LanguageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Analyzes the sentiment of the provided text.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.language.v1.AnalyzeSentimentResponse> analyzeSentiment(
        com.google.cloud.language.v1.AnalyzeSentimentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_SENTIMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Finds named entities (currently proper names and common nouns) in the text
     * along with entity types, salience, mentions for each entity, and
     * other properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.language.v1.AnalyzeEntitiesResponse> analyzeEntities(
        com.google.cloud.language.v1.AnalyzeEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_ENTITIES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Analyzes the syntax of the text and provides sentence boundaries and
     * tokenization along with part of speech tags, dependency trees, and other
     * properties.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.language.v1.AnalyzeSyntaxResponse> analyzeSyntax(
        com.google.cloud.language.v1.AnalyzeSyntaxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANALYZE_SYNTAX, getCallOptions()), request);
    }

    /**
     * <pre>
     * A convenience method that provides all the features that analyzeSentiment,
     * analyzeEntities, and analyzeSyntax provide in one call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.language.v1.AnnotateTextResponse> annotateText(
        com.google.cloud.language.v1.AnnotateTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANNOTATE_TEXT, getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_SENTIMENT = 0;
  private static final int METHODID_ANALYZE_ENTITIES = 1;
  private static final int METHODID_ANALYZE_SYNTAX = 2;
  private static final int METHODID_ANNOTATE_TEXT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LanguageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LanguageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALYZE_SENTIMENT:
          serviceImpl.analyzeSentiment((com.google.cloud.language.v1.AnalyzeSentimentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSentimentResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_ENTITIES:
          serviceImpl.analyzeEntities((com.google.cloud.language.v1.AnalyzeEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeEntitiesResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_SYNTAX:
          serviceImpl.analyzeSyntax((com.google.cloud.language.v1.AnalyzeSyntaxRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnalyzeSyntaxResponse>) responseObserver);
          break;
        case METHODID_ANNOTATE_TEXT:
          serviceImpl.annotateText((com.google.cloud.language.v1.AnnotateTextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.language.v1.AnnotateTextResponse>) responseObserver);
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

  private static final class LanguageServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LanguageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LanguageServiceDescriptorSupplier())
              .addMethod(METHOD_ANALYZE_SENTIMENT)
              .addMethod(METHOD_ANALYZE_ENTITIES)
              .addMethod(METHOD_ANALYZE_SYNTAX)
              .addMethod(METHOD_ANNOTATE_TEXT)
              .build();
        }
      }
    }
    return result;
  }
}
