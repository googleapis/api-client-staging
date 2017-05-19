package com.google.cloud.vision.v1;

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
 * Service that performs Google Cloud Vision API detection tasks over client
 * images, such as face, landmark, logo, label, and text detection. The
 * ImageAnnotator service returns detected entities from the images.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/vision/v1/image_annotator.proto")
public final class ImageAnnotatorGrpc {

  private ImageAnnotatorGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.vision.v1.ImageAnnotator";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.vision.v1.BatchAnnotateImagesRequest,
      com.google.cloud.vision.v1.BatchAnnotateImagesResponse> METHOD_BATCH_ANNOTATE_IMAGES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.vision.v1.ImageAnnotator", "BatchAnnotateImages"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.vision.v1.BatchAnnotateImagesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.vision.v1.BatchAnnotateImagesResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageAnnotatorStub newStub(io.grpc.Channel channel) {
    return new ImageAnnotatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageAnnotatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImageAnnotatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ImageAnnotatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImageAnnotatorFutureStub(channel);
  }

  /**
   * <pre>
   * Service that performs Google Cloud Vision API detection tasks over client
   * images, such as face, landmark, logo, label, and text detection. The
   * ImageAnnotator service returns detected entities from the images.
   * </pre>
   */
  public static abstract class ImageAnnotatorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Run image detection and annotation for a batch of images.
     * </pre>
     */
    public void batchAnnotateImages(com.google.cloud.vision.v1.BatchAnnotateImagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.vision.v1.BatchAnnotateImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_ANNOTATE_IMAGES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_BATCH_ANNOTATE_IMAGES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.vision.v1.BatchAnnotateImagesRequest,
                com.google.cloud.vision.v1.BatchAnnotateImagesResponse>(
                  this, METHODID_BATCH_ANNOTATE_IMAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service that performs Google Cloud Vision API detection tasks over client
   * images, such as face, landmark, logo, label, and text detection. The
   * ImageAnnotator service returns detected entities from the images.
   * </pre>
   */
  public static final class ImageAnnotatorStub extends io.grpc.stub.AbstractStub<ImageAnnotatorStub> {
    private ImageAnnotatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageAnnotatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageAnnotatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageAnnotatorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Run image detection and annotation for a batch of images.
     * </pre>
     */
    public void batchAnnotateImages(com.google.cloud.vision.v1.BatchAnnotateImagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.vision.v1.BatchAnnotateImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_ANNOTATE_IMAGES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service that performs Google Cloud Vision API detection tasks over client
   * images, such as face, landmark, logo, label, and text detection. The
   * ImageAnnotator service returns detected entities from the images.
   * </pre>
   */
  public static final class ImageAnnotatorBlockingStub extends io.grpc.stub.AbstractStub<ImageAnnotatorBlockingStub> {
    private ImageAnnotatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageAnnotatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageAnnotatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageAnnotatorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Run image detection and annotation for a batch of images.
     * </pre>
     */
    public com.google.cloud.vision.v1.BatchAnnotateImagesResponse batchAnnotateImages(com.google.cloud.vision.v1.BatchAnnotateImagesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_ANNOTATE_IMAGES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service that performs Google Cloud Vision API detection tasks over client
   * images, such as face, landmark, logo, label, and text detection. The
   * ImageAnnotator service returns detected entities from the images.
   * </pre>
   */
  public static final class ImageAnnotatorFutureStub extends io.grpc.stub.AbstractStub<ImageAnnotatorFutureStub> {
    private ImageAnnotatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImageAnnotatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageAnnotatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImageAnnotatorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Run image detection and annotation for a batch of images.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.vision.v1.BatchAnnotateImagesResponse> batchAnnotateImages(
        com.google.cloud.vision.v1.BatchAnnotateImagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_ANNOTATE_IMAGES, getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_ANNOTATE_IMAGES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageAnnotatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageAnnotatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_ANNOTATE_IMAGES:
          serviceImpl.batchAnnotateImages((com.google.cloud.vision.v1.BatchAnnotateImagesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.vision.v1.BatchAnnotateImagesResponse>) responseObserver);
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

  private static final class ImageAnnotatorDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImageAnnotatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageAnnotatorDescriptorSupplier())
              .addMethod(METHOD_BATCH_ANNOTATE_IMAGES)
              .build();
        }
      }
    }
    return result;
  }
}
