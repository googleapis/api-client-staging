package com.google.devtools.cloudtrace.v1;

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
 * This file describes an API for collecting and viewing traces and spans
 * within a trace.  A Trace is a collection of spans corresponding to a single
 * operation or set of operations for an application. A span is an individual
 * timed event which forms a node of the trace tree. Spans for a single trace
 * may span multiple services.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/devtools/cloudtrace/v1/trace.proto")
public final class TraceServiceGrpc {

  private TraceServiceGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.cloudtrace.v1.TraceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.cloudtrace.v1.ListTracesRequest,
      com.google.devtools.cloudtrace.v1.ListTracesResponse> METHOD_LIST_TRACES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudtrace.v1.TraceService", "ListTraces"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.cloudtrace.v1.ListTracesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.cloudtrace.v1.ListTracesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.cloudtrace.v1.GetTraceRequest,
      com.google.devtools.cloudtrace.v1.Trace> METHOD_GET_TRACE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudtrace.v1.TraceService", "GetTrace"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.cloudtrace.v1.GetTraceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.cloudtrace.v1.PatchTracesRequest,
      com.google.protobuf.Empty> METHOD_PATCH_TRACES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudtrace.v1.TraceService", "PatchTraces"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.cloudtrace.v1.PatchTracesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceServiceStub newStub(io.grpc.Channel channel) {
    return new TraceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TraceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TraceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TraceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This file describes an API for collecting and viewing traces and spans
   * within a trace.  A Trace is a collection of spans corresponding to a single
   * operation or set of operations for an application. A span is an individual
   * timed event which forms a node of the trace tree. Spans for a single trace
   * may span multiple services.
   * </pre>
   */
  public static abstract class TraceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns of a list of traces that match the specified filter conditions.
     * </pre>
     */
    public void listTraces(com.google.devtools.cloudtrace.v1.ListTracesRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.ListTracesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRACES, responseObserver);
    }

    /**
     * <pre>
     * Gets a single trace by its ID.
     * </pre>
     */
    public void getTrace(com.google.devtools.cloudtrace.v1.GetTraceRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.Trace> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRACE, responseObserver);
    }

    /**
     * <pre>
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
     * of a trace that you send matches that of an existing trace, any fields
     * in the existing trace and its spans are overwritten by the provided values,
     * and any new fields provided are merged with the existing trace data. If the
     * ID does not match, a new trace is created.
     * </pre>
     */
    public void patchTraces(com.google.devtools.cloudtrace.v1.PatchTracesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PATCH_TRACES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_TRACES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.cloudtrace.v1.ListTracesRequest,
                com.google.devtools.cloudtrace.v1.ListTracesResponse>(
                  this, METHODID_LIST_TRACES)))
          .addMethod(
            METHOD_GET_TRACE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.cloudtrace.v1.GetTraceRequest,
                com.google.devtools.cloudtrace.v1.Trace>(
                  this, METHODID_GET_TRACE)))
          .addMethod(
            METHOD_PATCH_TRACES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.cloudtrace.v1.PatchTracesRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PATCH_TRACES)))
          .build();
    }
  }

  /**
   * <pre>
   * This file describes an API for collecting and viewing traces and spans
   * within a trace.  A Trace is a collection of spans corresponding to a single
   * operation or set of operations for an application. A span is an individual
   * timed event which forms a node of the trace tree. Spans for a single trace
   * may span multiple services.
   * </pre>
   */
  public static final class TraceServiceStub extends io.grpc.stub.AbstractStub<TraceServiceStub> {
    private TraceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns of a list of traces that match the specified filter conditions.
     * </pre>
     */
    public void listTraces(com.google.devtools.cloudtrace.v1.ListTracesRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.ListTracesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRACES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single trace by its ID.
     * </pre>
     */
    public void getTrace(com.google.devtools.cloudtrace.v1.GetTraceRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.Trace> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRACE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
     * of a trace that you send matches that of an existing trace, any fields
     * in the existing trace and its spans are overwritten by the provided values,
     * and any new fields provided are merged with the existing trace data. If the
     * ID does not match, a new trace is created.
     * </pre>
     */
    public void patchTraces(com.google.devtools.cloudtrace.v1.PatchTracesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PATCH_TRACES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This file describes an API for collecting and viewing traces and spans
   * within a trace.  A Trace is a collection of spans corresponding to a single
   * operation or set of operations for an application. A span is an individual
   * timed event which forms a node of the trace tree. Spans for a single trace
   * may span multiple services.
   * </pre>
   */
  public static final class TraceServiceBlockingStub extends io.grpc.stub.AbstractStub<TraceServiceBlockingStub> {
    private TraceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns of a list of traces that match the specified filter conditions.
     * </pre>
     */
    public com.google.devtools.cloudtrace.v1.ListTracesResponse listTraces(com.google.devtools.cloudtrace.v1.ListTracesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRACES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single trace by its ID.
     * </pre>
     */
    public com.google.devtools.cloudtrace.v1.Trace getTrace(com.google.devtools.cloudtrace.v1.GetTraceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRACE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
     * of a trace that you send matches that of an existing trace, any fields
     * in the existing trace and its spans are overwritten by the provided values,
     * and any new fields provided are merged with the existing trace data. If the
     * ID does not match, a new trace is created.
     * </pre>
     */
    public com.google.protobuf.Empty patchTraces(com.google.devtools.cloudtrace.v1.PatchTracesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PATCH_TRACES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This file describes an API for collecting and viewing traces and spans
   * within a trace.  A Trace is a collection of spans corresponding to a single
   * operation or set of operations for an application. A span is an individual
   * timed event which forms a node of the trace tree. Spans for a single trace
   * may span multiple services.
   * </pre>
   */
  public static final class TraceServiceFutureStub extends io.grpc.stub.AbstractStub<TraceServiceFutureStub> {
    private TraceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns of a list of traces that match the specified filter conditions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.cloudtrace.v1.ListTracesResponse> listTraces(
        com.google.devtools.cloudtrace.v1.ListTracesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRACES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single trace by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.cloudtrace.v1.Trace> getTrace(
        com.google.devtools.cloudtrace.v1.GetTraceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRACE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID
     * of a trace that you send matches that of an existing trace, any fields
     * in the existing trace and its spans are overwritten by the provided values,
     * and any new fields provided are merged with the existing trace data. If the
     * ID does not match, a new trace is created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> patchTraces(
        com.google.devtools.cloudtrace.v1.PatchTracesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PATCH_TRACES, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_TRACES = 0;
  private static final int METHODID_GET_TRACE = 1;
  private static final int METHODID_PATCH_TRACES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TraceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_TRACES:
          serviceImpl.listTraces((com.google.devtools.cloudtrace.v1.ListTracesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.ListTracesResponse>) responseObserver);
          break;
        case METHODID_GET_TRACE:
          serviceImpl.getTrace((com.google.devtools.cloudtrace.v1.GetTraceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.cloudtrace.v1.Trace>) responseObserver);
          break;
        case METHODID_PATCH_TRACES:
          serviceImpl.patchTraces((com.google.devtools.cloudtrace.v1.PatchTracesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static final class TraceServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.devtools.cloudtrace.v1.TraceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TraceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraceServiceDescriptorSupplier())
              .addMethod(METHOD_LIST_TRACES)
              .addMethod(METHOD_GET_TRACE)
              .addMethod(METHOD_PATCH_TRACES)
              .build();
        }
      }
    }
    return result;
  }
}
