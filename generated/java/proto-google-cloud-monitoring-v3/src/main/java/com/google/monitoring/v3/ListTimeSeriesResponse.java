// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `ListTimeSeries` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListTimeSeriesResponse}
 */
public  final class ListTimeSeriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListTimeSeriesResponse)
    ListTimeSeriesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTimeSeriesResponse.newBuilder() to construct.
  private ListTimeSeriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTimeSeriesResponse() {
    timeSeries_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTimeSeriesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              timeSeries_ = new java.util.ArrayList<com.google.monitoring.v3.TimeSeries>();
              mutable_bitField0_ |= 0x00000001;
            }
            timeSeries_.add(
                input.readMessage(com.google.monitoring.v3.TimeSeries.parser(), extensionRegistry));
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
        timeSeries_ = java.util.Collections.unmodifiableList(timeSeries_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListTimeSeriesResponse.class, com.google.monitoring.v3.ListTimeSeriesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TIME_SERIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.monitoring.v3.TimeSeries> timeSeries_;
  /**
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  public java.util.List<com.google.monitoring.v3.TimeSeries> getTimeSeriesList() {
    return timeSeries_;
  }
  /**
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  public java.util.List<? extends com.google.monitoring.v3.TimeSeriesOrBuilder> 
      getTimeSeriesOrBuilderList() {
    return timeSeries_;
  }
  /**
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  public int getTimeSeriesCount() {
    return timeSeries_.size();
  }
  /**
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  public com.google.monitoring.v3.TimeSeries getTimeSeries(int index) {
    return timeSeries_.get(index);
  }
  /**
   * <pre>
   * One or more time series that match the filter included in the request.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
   */
  public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder(
      int index) {
    return timeSeries_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
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
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
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
    for (int i = 0; i < timeSeries_.size(); i++) {
      output.writeMessage(1, timeSeries_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < timeSeries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, timeSeries_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.ListTimeSeriesResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListTimeSeriesResponse other = (com.google.monitoring.v3.ListTimeSeriesResponse) obj;

    boolean result = true;
    result = result && getTimeSeriesList()
        .equals(other.getTimeSeriesList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTimeSeriesCount() > 0) {
      hash = (37 * hash) + TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSeriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListTimeSeriesResponse parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.ListTimeSeriesResponse prototype) {
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
   * The `ListTimeSeries` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListTimeSeriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListTimeSeriesResponse)
      com.google.monitoring.v3.ListTimeSeriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListTimeSeriesResponse.class, com.google.monitoring.v3.ListTimeSeriesResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListTimeSeriesResponse.newBuilder()
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
        getTimeSeriesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        timeSeriesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
    }

    public com.google.monitoring.v3.ListTimeSeriesResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListTimeSeriesResponse.getDefaultInstance();
    }

    public com.google.monitoring.v3.ListTimeSeriesResponse build() {
      com.google.monitoring.v3.ListTimeSeriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.ListTimeSeriesResponse buildPartial() {
      com.google.monitoring.v3.ListTimeSeriesResponse result = new com.google.monitoring.v3.ListTimeSeriesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (timeSeriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          timeSeries_ = java.util.Collections.unmodifiableList(timeSeries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.timeSeries_ = timeSeries_;
      } else {
        result.timeSeries_ = timeSeriesBuilder_.build();
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
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListTimeSeriesResponse) {
        return mergeFrom((com.google.monitoring.v3.ListTimeSeriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListTimeSeriesResponse other) {
      if (other == com.google.monitoring.v3.ListTimeSeriesResponse.getDefaultInstance()) return this;
      if (timeSeriesBuilder_ == null) {
        if (!other.timeSeries_.isEmpty()) {
          if (timeSeries_.isEmpty()) {
            timeSeries_ = other.timeSeries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTimeSeriesIsMutable();
            timeSeries_.addAll(other.timeSeries_);
          }
          onChanged();
        }
      } else {
        if (!other.timeSeries_.isEmpty()) {
          if (timeSeriesBuilder_.isEmpty()) {
            timeSeriesBuilder_.dispose();
            timeSeriesBuilder_ = null;
            timeSeries_ = other.timeSeries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            timeSeriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTimeSeriesFieldBuilder() : null;
          } else {
            timeSeriesBuilder_.addAllMessages(other.timeSeries_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.monitoring.v3.ListTimeSeriesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListTimeSeriesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.monitoring.v3.TimeSeries> timeSeries_ =
      java.util.Collections.emptyList();
    private void ensureTimeSeriesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        timeSeries_ = new java.util.ArrayList<com.google.monitoring.v3.TimeSeries>(timeSeries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.v3.TimeSeries, com.google.monitoring.v3.TimeSeries.Builder, com.google.monitoring.v3.TimeSeriesOrBuilder> timeSeriesBuilder_;

    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.TimeSeries> getTimeSeriesList() {
      if (timeSeriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(timeSeries_);
      } else {
        return timeSeriesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public int getTimeSeriesCount() {
      if (timeSeriesBuilder_ == null) {
        return timeSeries_.size();
      } else {
        return timeSeriesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeries getTimeSeries(int index) {
      if (timeSeriesBuilder_ == null) {
        return timeSeries_.get(index);
      } else {
        return timeSeriesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder setTimeSeries(
        int index, com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeSeriesIsMutable();
        timeSeries_.set(index, value);
        onChanged();
      } else {
        timeSeriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder setTimeSeries(
        int index, com.google.monitoring.v3.TimeSeries.Builder builderForValue) {
      if (timeSeriesBuilder_ == null) {
        ensureTimeSeriesIsMutable();
        timeSeries_.set(index, builderForValue.build());
        onChanged();
      } else {
        timeSeriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder addTimeSeries(com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeSeriesIsMutable();
        timeSeries_.add(value);
        onChanged();
      } else {
        timeSeriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder addTimeSeries(
        int index, com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeSeriesIsMutable();
        timeSeries_.add(index, value);
        onChanged();
      } else {
        timeSeriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder addTimeSeries(
        com.google.monitoring.v3.TimeSeries.Builder builderForValue) {
      if (timeSeriesBuilder_ == null) {
        ensureTimeSeriesIsMutable();
        timeSeries_.add(builderForValue.build());
        onChanged();
      } else {
        timeSeriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder addTimeSeries(
        int index, com.google.monitoring.v3.TimeSeries.Builder builderForValue) {
      if (timeSeriesBuilder_ == null) {
        ensureTimeSeriesIsMutable();
        timeSeries_.add(index, builderForValue.build());
        onChanged();
      } else {
        timeSeriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder addAllTimeSeries(
        java.lang.Iterable<? extends com.google.monitoring.v3.TimeSeries> values) {
      if (timeSeriesBuilder_ == null) {
        ensureTimeSeriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, timeSeries_);
        onChanged();
      } else {
        timeSeriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder clearTimeSeries() {
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        timeSeriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public Builder removeTimeSeries(int index) {
      if (timeSeriesBuilder_ == null) {
        ensureTimeSeriesIsMutable();
        timeSeries_.remove(index);
        onChanged();
      } else {
        timeSeriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeries.Builder getTimeSeriesBuilder(
        int index) {
      return getTimeSeriesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder(
        int index) {
      if (timeSeriesBuilder_ == null) {
        return timeSeries_.get(index);  } else {
        return timeSeriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public java.util.List<? extends com.google.monitoring.v3.TimeSeriesOrBuilder> 
         getTimeSeriesOrBuilderList() {
      if (timeSeriesBuilder_ != null) {
        return timeSeriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(timeSeries_);
      }
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeries.Builder addTimeSeriesBuilder() {
      return getTimeSeriesFieldBuilder().addBuilder(
          com.google.monitoring.v3.TimeSeries.getDefaultInstance());
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public com.google.monitoring.v3.TimeSeries.Builder addTimeSeriesBuilder(
        int index) {
      return getTimeSeriesFieldBuilder().addBuilder(
          index, com.google.monitoring.v3.TimeSeries.getDefaultInstance());
    }
    /**
     * <pre>
     * One or more time series that match the filter included in the request.
     * </pre>
     *
     * <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    public java.util.List<com.google.monitoring.v3.TimeSeries.Builder> 
         getTimeSeriesBuilderList() {
      return getTimeSeriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.monitoring.v3.TimeSeries, com.google.monitoring.v3.TimeSeries.Builder, com.google.monitoring.v3.TimeSeriesOrBuilder> 
        getTimeSeriesFieldBuilder() {
      if (timeSeriesBuilder_ == null) {
        timeSeriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.monitoring.v3.TimeSeries, com.google.monitoring.v3.TimeSeries.Builder, com.google.monitoring.v3.TimeSeriesOrBuilder>(
                timeSeries_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        timeSeries_ = null;
      }
      return timeSeriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
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
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
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
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
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
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
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
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
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
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListTimeSeriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListTimeSeriesResponse)
  private static final com.google.monitoring.v3.ListTimeSeriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListTimeSeriesResponse();
  }

  public static com.google.monitoring.v3.ListTimeSeriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTimeSeriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTimeSeriesResponse>() {
    public ListTimeSeriesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTimeSeriesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTimeSeriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTimeSeriesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.ListTimeSeriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

