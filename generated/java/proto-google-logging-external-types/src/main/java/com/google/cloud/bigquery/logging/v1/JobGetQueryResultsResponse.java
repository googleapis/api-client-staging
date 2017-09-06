// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

/**
 * <pre>
 * Job getQueryResults response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse}
 */
public  final class JobGetQueryResultsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)
    JobGetQueryResultsResponseOrBuilder {
  // Use JobGetQueryResultsResponse.newBuilder() to construct.
  private JobGetQueryResultsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobGetQueryResultsResponse() {
    totalResults_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JobGetQueryResultsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            totalResults_ = input.readUInt64();
            break;
          }
          case 18: {
            com.google.cloud.bigquery.logging.v1.Job.Builder subBuilder = null;
            if (job_ != null) {
              subBuilder = job_.toBuilder();
            }
            job_ = input.readMessage(com.google.cloud.bigquery.logging.v1.Job.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(job_);
              job_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobGetQueryResultsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobGetQueryResultsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.class, com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.Builder.class);
  }

  public static final int TOTAL_RESULTS_FIELD_NUMBER = 1;
  private long totalResults_;
  /**
   * <pre>
   * Total number of results in query results.
   * </pre>
   *
   * <code>optional uint64 total_results = 1;</code>
   */
  public long getTotalResults() {
    return totalResults_;
  }

  public static final int JOB_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.logging.v1.Job job_;
  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
   */
  public com.google.cloud.bigquery.logging.v1.Job getJob() {
    return job_ == null ? com.google.cloud.bigquery.logging.v1.Job.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * The job that was created to run the query.
   * It completed if `job.status.state` is `DONE`.
   * It failed if `job.status.errorResult` is also present.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
   */
  public com.google.cloud.bigquery.logging.v1.JobOrBuilder getJobOrBuilder() {
    return getJob();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (totalResults_ != 0L) {
      output.writeUInt64(1, totalResults_);
    }
    if (job_ != null) {
      output.writeMessage(2, getJob());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalResults_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, totalResults_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJob());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse other = (com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse) obj;

    boolean result = true;
    result = result && (getTotalResults()
        == other.getTotalResults());
    result = result && (hasJob() == other.hasJob());
    if (hasJob()) {
      result = result && getJob()
          .equals(other.getJob());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TOTAL_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalResults());
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Job getQueryResults response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)
      com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobGetQueryResultsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobGetQueryResultsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.class, com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      totalResults_ = 0L;

      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_JobGetQueryResultsResponse_descriptor;
    }

    public com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.getDefaultInstance();
    }

    public com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse build() {
      com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse buildPartial() {
      com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse result = new com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse(this);
      result.totalResults_ = totalResults_;
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse) {
        return mergeFrom((com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse other) {
      if (other == com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse.getDefaultInstance()) return this;
      if (other.getTotalResults() != 0L) {
        setTotalResults(other.getTotalResults());
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long totalResults_ ;
    /**
     * <pre>
     * Total number of results in query results.
     * </pre>
     *
     * <code>optional uint64 total_results = 1;</code>
     */
    public long getTotalResults() {
      return totalResults_;
    }
    /**
     * <pre>
     * Total number of results in query results.
     * </pre>
     *
     * <code>optional uint64 total_results = 1;</code>
     */
    public Builder setTotalResults(long value) {
      
      totalResults_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of results in query results.
     * </pre>
     *
     * <code>optional uint64 total_results = 1;</code>
     */
    public Builder clearTotalResults() {
      
      totalResults_ = 0L;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.logging.v1.Job job_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Job, com.google.cloud.bigquery.logging.v1.Job.Builder, com.google.cloud.bigquery.logging.v1.JobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public com.google.cloud.bigquery.logging.v1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.bigquery.logging.v1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public Builder setJob(com.google.cloud.bigquery.logging.v1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public Builder setJob(
        com.google.cloud.bigquery.logging.v1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public Builder mergeJob(com.google.cloud.bigquery.logging.v1.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
            com.google.cloud.bigquery.logging.v1.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public com.google.cloud.bigquery.logging.v1.Job.Builder getJobBuilder() {
      
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    public com.google.cloud.bigquery.logging.v1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.cloud.bigquery.logging.v1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * The job that was created to run the query.
     * It completed if `job.status.state` is `DONE`.
     * It failed if `job.status.errorResult` is also present.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Job job = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Job, com.google.cloud.bigquery.logging.v1.Job.Builder, com.google.cloud.bigquery.logging.v1.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.logging.v1.Job, com.google.cloud.bigquery.logging.v1.Job.Builder, com.google.cloud.bigquery.logging.v1.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse)
  private static final com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse();
  }

  public static com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobGetQueryResultsResponse>
      PARSER = new com.google.protobuf.AbstractParser<JobGetQueryResultsResponse>() {
    public JobGetQueryResultsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobGetQueryResultsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobGetQueryResultsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobGetQueryResultsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.bigquery.logging.v1.JobGetQueryResultsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

