// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

/**
 * <pre>
 * Result returned from ListLogMetrics.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.ListLogMetricsResponse}
 */
public  final class ListLogMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.ListLogMetricsResponse)
    ListLogMetricsResponseOrBuilder {
  // Use ListLogMetricsResponse.newBuilder() to construct.
  private ListLogMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLogMetricsResponse() {
    metrics_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListLogMetricsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              metrics_ = new java.util.ArrayList<com.google.logging.v2.LogMetric>();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(
                input.readMessage(com.google.logging.v2.LogMetric.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingMetricsProto.internal_static_google_logging_v2_ListLogMetricsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingMetricsProto.internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.ListLogMetricsResponse.class, com.google.logging.v2.ListLogMetricsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<com.google.logging.v2.LogMetric> metrics_;
  /**
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  public java.util.List<com.google.logging.v2.LogMetric> getMetricsList() {
    return metrics_;
  }
  /**
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  public java.util.List<? extends com.google.logging.v2.LogMetricOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  public com.google.logging.v2.LogMetric getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <pre>
   * A list of logs-based metrics.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
   */
  public com.google.logging.v2.LogMetricOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metrics_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.logging.v2.ListLogMetricsResponse)) {
      return super.equals(obj);
    }
    com.google.logging.v2.ListLogMetricsResponse other = (com.google.logging.v2.ListLogMetricsResponse) obj;

    boolean result = true;
    result = result && getMetricsList()
        .equals(other.getMetricsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.ListLogMetricsResponse parseFrom(
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
  public static Builder newBuilder(com.google.logging.v2.ListLogMetricsResponse prototype) {
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
   * Result returned from ListLogMetrics.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.ListLogMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.ListLogMetricsResponse)
      com.google.logging.v2.ListLogMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingMetricsProto.internal_static_google_logging_v2_ListLogMetricsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingMetricsProto.internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.ListLogMetricsResponse.class, com.google.logging.v2.ListLogMetricsResponse.Builder.class);
    }

    // Construct using com.google.logging.v2.ListLogMetricsResponse.newBuilder()
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
        getMetricsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingMetricsProto.internal_static_google_logging_v2_ListLogMetricsResponse_descriptor;
    }

    public com.google.logging.v2.ListLogMetricsResponse getDefaultInstanceForType() {
      return com.google.logging.v2.ListLogMetricsResponse.getDefaultInstance();
    }

    public com.google.logging.v2.ListLogMetricsResponse build() {
      com.google.logging.v2.ListLogMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v2.ListLogMetricsResponse buildPartial() {
      com.google.logging.v2.ListLogMetricsResponse result = new com.google.logging.v2.ListLogMetricsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.logging.v2.ListLogMetricsResponse) {
        return mergeFrom((com.google.logging.v2.ListLogMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.ListLogMetricsResponse other) {
      if (other == com.google.logging.v2.ListLogMetricsResponse.getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.logging.v2.ListLogMetricsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.ListLogMetricsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.logging.v2.LogMetric> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = new java.util.ArrayList<com.google.logging.v2.LogMetric>(metrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.logging.v2.LogMetric, com.google.logging.v2.LogMetric.Builder, com.google.logging.v2.LogMetricOrBuilder> metricsBuilder_;

    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogMetric> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public com.google.logging.v2.LogMetric getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, com.google.logging.v2.LogMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, com.google.logging.v2.LogMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder addMetrics(com.google.logging.v2.LogMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, com.google.logging.v2.LogMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        com.google.logging.v2.LogMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, com.google.logging.v2.LogMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.logging.v2.LogMetric> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public com.google.logging.v2.LogMetric.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public com.google.logging.v2.LogMetricOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public java.util.List<? extends com.google.logging.v2.LogMetricOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public com.google.logging.v2.LogMetric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          com.google.logging.v2.LogMetric.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public com.google.logging.v2.LogMetric.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, com.google.logging.v2.LogMetric.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of logs-based metrics.
     * </pre>
     *
     * <code>repeated .google.logging.v2.LogMetric metrics = 1;</code>
     */
    public java.util.List<com.google.logging.v2.LogMetric.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.logging.v2.LogMetric, com.google.logging.v2.LogMetric.Builder, com.google.logging.v2.LogMetricOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.logging.v2.LogMetric, com.google.logging.v2.LogMetric.Builder, com.google.logging.v2.LogMetricOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there might be more results than appear in this response, then
     * `nextPageToken` is included.  To get the next set of results, call this
     * method again using the value of `nextPageToken` as `pageToken`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v2.ListLogMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.ListLogMetricsResponse)
  private static final com.google.logging.v2.ListLogMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.ListLogMetricsResponse();
  }

  public static com.google.logging.v2.ListLogMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLogMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLogMetricsResponse>() {
    public ListLogMetricsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListLogMetricsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListLogMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLogMetricsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v2.ListLogMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

