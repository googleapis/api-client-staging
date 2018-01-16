package com.google.cloud.dataproc.v1;

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
 * The JobController provides methods to manage jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dataproc/v1/jobs.proto")
public final class JobControllerGrpc {

  private JobControllerGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dataproc.v1.JobController";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.SubmitJobRequest,
      com.google.cloud.dataproc.v1.Job> METHOD_SUBMIT_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "SubmitJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.SubmitJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.GetJobRequest,
      com.google.cloud.dataproc.v1.Job> METHOD_GET_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "GetJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.GetJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.ListJobsRequest,
      com.google.cloud.dataproc.v1.ListJobsResponse> METHOD_LIST_JOBS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "ListJobs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.ListJobsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.ListJobsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.UpdateJobRequest,
      com.google.cloud.dataproc.v1.Job> METHOD_UPDATE_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "UpdateJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.UpdateJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.CancelJobRequest,
      com.google.cloud.dataproc.v1.Job> METHOD_CANCEL_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "CancelJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.CancelJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dataproc.v1.DeleteJobRequest,
      com.google.protobuf.Empty> METHOD_DELETE_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dataproc.v1.JobController", "DeleteJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dataproc.v1.DeleteJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobControllerStub newStub(io.grpc.Channel channel) {
    return new JobControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JobControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobControllerFutureStub(channel);
  }

  /**
   * <pre>
   * The JobController provides methods to manage jobs.
   * </pre>
   */
  public static abstract class JobControllerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Submits a job to a cluster.
     * </pre>
     */
    public void submitJob(com.google.cloud.dataproc.v1.SubmitJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBMIT_JOB, responseObserver);
    }

    /**
     * <pre>
     * Gets the resource representation for a job in a project.
     * </pre>
     */
    public void getJob(com.google.cloud.dataproc.v1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_JOB, responseObserver);
    }

    /**
     * <pre>
     * Lists regions/{region}/jobs in a project.
     * </pre>
     */
    public void listJobs(com.google.cloud.dataproc.v1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_JOBS, responseObserver);
    }

    /**
     * <pre>
     * Updates a job in a project.
     * </pre>
     */
    public void updateJob(com.google.cloud.dataproc.v1.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_JOB, responseObserver);
    }

    /**
     * <pre>
     * Starts a job cancellation request. To access the job resource
     * after cancellation, call
     * [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
     * [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).
     * </pre>
     */
    public void cancelJob(com.google.cloud.dataproc.v1.CancelJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_JOB, responseObserver);
    }

    /**
     * <pre>
     * Deletes the job from the project. If the job is active, the delete fails,
     * and the response returns `FAILED_PRECONDITION`.
     * </pre>
     */
    public void deleteJob(com.google.cloud.dataproc.v1.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_JOB, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SUBMIT_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.SubmitJobRequest,
                com.google.cloud.dataproc.v1.Job>(
                  this, METHODID_SUBMIT_JOB)))
          .addMethod(
            METHOD_GET_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.GetJobRequest,
                com.google.cloud.dataproc.v1.Job>(
                  this, METHODID_GET_JOB)))
          .addMethod(
            METHOD_LIST_JOBS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.ListJobsRequest,
                com.google.cloud.dataproc.v1.ListJobsResponse>(
                  this, METHODID_LIST_JOBS)))
          .addMethod(
            METHOD_UPDATE_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.UpdateJobRequest,
                com.google.cloud.dataproc.v1.Job>(
                  this, METHODID_UPDATE_JOB)))
          .addMethod(
            METHOD_CANCEL_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.CancelJobRequest,
                com.google.cloud.dataproc.v1.Job>(
                  this, METHODID_CANCEL_JOB)))
          .addMethod(
            METHOD_DELETE_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dataproc.v1.DeleteJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   * The JobController provides methods to manage jobs.
   * </pre>
   */
  public static final class JobControllerStub extends io.grpc.stub.AbstractStub<JobControllerStub> {
    private JobControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobControllerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a job to a cluster.
     * </pre>
     */
    public void submitJob(com.google.cloud.dataproc.v1.SubmitJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the resource representation for a job in a project.
     * </pre>
     */
    public void getJob(com.google.cloud.dataproc.v1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists regions/{region}/jobs in a project.
     * </pre>
     */
    public void listJobs(com.google.cloud.dataproc.v1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_JOBS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a job in a project.
     * </pre>
     */
    public void updateJob(com.google.cloud.dataproc.v1.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a job cancellation request. To access the job resource
     * after cancellation, call
     * [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
     * [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).
     * </pre>
     */
    public void cancelJob(com.google.cloud.dataproc.v1.CancelJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the job from the project. If the job is active, the delete fails,
     * and the response returns `FAILED_PRECONDITION`.
     * </pre>
     */
    public void deleteJob(com.google.cloud.dataproc.v1.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_JOB, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The JobController provides methods to manage jobs.
   * </pre>
   */
  public static final class JobControllerBlockingStub extends io.grpc.stub.AbstractStub<JobControllerBlockingStub> {
    private JobControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobControllerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a job to a cluster.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.Job submitJob(com.google.cloud.dataproc.v1.SubmitJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBMIT_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the resource representation for a job in a project.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.Job getJob(com.google.cloud.dataproc.v1.GetJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists regions/{region}/jobs in a project.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.ListJobsResponse listJobs(com.google.cloud.dataproc.v1.ListJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_JOBS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a job in a project.
     * </pre>
     */
    public com.google.cloud.dataproc.v1.Job updateJob(com.google.cloud.dataproc.v1.UpdateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a job cancellation request. To access the job resource
     * after cancellation, call
     * [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
     * [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).
     * </pre>
     */
    public com.google.cloud.dataproc.v1.Job cancelJob(com.google.cloud.dataproc.v1.CancelJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the job from the project. If the job is active, the delete fails,
     * and the response returns `FAILED_PRECONDITION`.
     * </pre>
     */
    public com.google.protobuf.Empty deleteJob(com.google.cloud.dataproc.v1.DeleteJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_JOB, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The JobController provides methods to manage jobs.
   * </pre>
   */
  public static final class JobControllerFutureStub extends io.grpc.stub.AbstractStub<JobControllerFutureStub> {
    private JobControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobControllerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Submits a job to a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.Job> submitJob(
        com.google.cloud.dataproc.v1.SubmitJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the resource representation for a job in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.Job> getJob(
        com.google.cloud.dataproc.v1.GetJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists regions/{region}/jobs in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.ListJobsResponse> listJobs(
        com.google.cloud.dataproc.v1.ListJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_JOBS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a job in a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.Job> updateJob(
        com.google.cloud.dataproc.v1.UpdateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a job cancellation request. To access the job resource
     * after cancellation, call
     * [regions/{region}/jobs.list](/dataproc/docs/reference/rest/v1/projects.regions.jobs/list) or
     * [regions/{region}/jobs.get](/dataproc/docs/reference/rest/v1/projects.regions.jobs/get).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dataproc.v1.Job> cancelJob(
        com.google.cloud.dataproc.v1.CancelJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the job from the project. If the job is active, the delete fails,
     * and the response returns `FAILED_PRECONDITION`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteJob(
        com.google.cloud.dataproc.v1.DeleteJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_JOB, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_JOB = 0;
  private static final int METHODID_GET_JOB = 1;
  private static final int METHODID_LIST_JOBS = 2;
  private static final int METHODID_UPDATE_JOB = 3;
  private static final int METHODID_CANCEL_JOB = 4;
  private static final int METHODID_DELETE_JOB = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_JOB:
          serviceImpl.submitJob((com.google.cloud.dataproc.v1.SubmitJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((com.google.cloud.dataproc.v1.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job>) responseObserver);
          break;
        case METHODID_LIST_JOBS:
          serviceImpl.listJobs((com.google.cloud.dataproc.v1.ListJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.ListJobsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOB:
          serviceImpl.updateJob((com.google.cloud.dataproc.v1.UpdateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job>) responseObserver);
          break;
        case METHODID_CANCEL_JOB:
          serviceImpl.cancelJob((com.google.cloud.dataproc.v1.CancelJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataproc.v1.Job>) responseObserver);
          break;
        case METHODID_DELETE_JOB:
          serviceImpl.deleteJob((com.google.cloud.dataproc.v1.DeleteJobRequest) request,
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

  private static final class JobControllerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobControllerDescriptorSupplier())
              .addMethod(METHOD_SUBMIT_JOB)
              .addMethod(METHOD_GET_JOB)
              .addMethod(METHOD_LIST_JOBS)
              .addMethod(METHOD_UPDATE_JOB)
              .addMethod(METHOD_CANCEL_JOB)
              .addMethod(METHOD_DELETE_JOB)
              .build();
        }
      }
    }
    return result;
  }
}
