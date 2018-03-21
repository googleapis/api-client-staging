// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Target scaling by CPU usage.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CpuUtilization}
 */
public  final class CpuUtilization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CpuUtilization)
    CpuUtilizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CpuUtilization.newBuilder() to construct.
  private CpuUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CpuUtilization() {
    targetUtilization_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CpuUtilization(
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
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (aggregationWindowLength_ != null) {
              subBuilder = aggregationWindowLength_.toBuilder();
            }
            aggregationWindowLength_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(aggregationWindowLength_);
              aggregationWindowLength_ = subBuilder.buildPartial();
            }

            break;
          }
          case 17: {

            targetUtilization_ = input.readDouble();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_CpuUtilization_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CpuUtilization.class, com.google.appengine.v1.CpuUtilization.Builder.class);
  }

  public static final int AGGREGATION_WINDOW_LENGTH_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration aggregationWindowLength_;
  /**
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   */
  public boolean hasAggregationWindowLength() {
    return aggregationWindowLength_ != null;
  }
  /**
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   */
  public com.google.protobuf.Duration getAggregationWindowLength() {
    return aggregationWindowLength_ == null ? com.google.protobuf.Duration.getDefaultInstance() : aggregationWindowLength_;
  }
  /**
   * <pre>
   * Period of time over which CPU utilization is calculated.
   * </pre>
   *
   * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
   */
  public com.google.protobuf.DurationOrBuilder getAggregationWindowLengthOrBuilder() {
    return getAggregationWindowLength();
  }

  public static final int TARGET_UTILIZATION_FIELD_NUMBER = 2;
  private double targetUtilization_;
  /**
   * <pre>
   * Target CPU utilization ratio to maintain when scaling. Must be between 0
   * and 1.
   * </pre>
   *
   * <code>double target_utilization = 2;</code>
   */
  public double getTargetUtilization() {
    return targetUtilization_;
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
    if (aggregationWindowLength_ != null) {
      output.writeMessage(1, getAggregationWindowLength());
    }
    if (targetUtilization_ != 0D) {
      output.writeDouble(2, targetUtilization_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (aggregationWindowLength_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAggregationWindowLength());
    }
    if (targetUtilization_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, targetUtilization_);
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
    if (!(obj instanceof com.google.appengine.v1.CpuUtilization)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CpuUtilization other = (com.google.appengine.v1.CpuUtilization) obj;

    boolean result = true;
    result = result && (hasAggregationWindowLength() == other.hasAggregationWindowLength());
    if (hasAggregationWindowLength()) {
      result = result && getAggregationWindowLength()
          .equals(other.getAggregationWindowLength());
    }
    result = result && (
        java.lang.Double.doubleToLongBits(getTargetUtilization())
        == java.lang.Double.doubleToLongBits(
            other.getTargetUtilization()));
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
    if (hasAggregationWindowLength()) {
      hash = (37 * hash) + AGGREGATION_WINDOW_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getAggregationWindowLength().hashCode();
    }
    hash = (37 * hash) + TARGET_UTILIZATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTargetUtilization()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CpuUtilization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CpuUtilization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CpuUtilization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.CpuUtilization parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.CpuUtilization prototype) {
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
   * Target scaling by CPU usage.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CpuUtilization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CpuUtilization)
      com.google.appengine.v1.CpuUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_CpuUtilization_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CpuUtilization.class, com.google.appengine.v1.CpuUtilization.Builder.class);
    }

    // Construct using com.google.appengine.v1.CpuUtilization.newBuilder()
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
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLength_ = null;
      } else {
        aggregationWindowLength_ = null;
        aggregationWindowLengthBuilder_ = null;
      }
      targetUtilization_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_CpuUtilization_descriptor;
    }

    public com.google.appengine.v1.CpuUtilization getDefaultInstanceForType() {
      return com.google.appengine.v1.CpuUtilization.getDefaultInstance();
    }

    public com.google.appengine.v1.CpuUtilization build() {
      com.google.appengine.v1.CpuUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.CpuUtilization buildPartial() {
      com.google.appengine.v1.CpuUtilization result = new com.google.appengine.v1.CpuUtilization(this);
      if (aggregationWindowLengthBuilder_ == null) {
        result.aggregationWindowLength_ = aggregationWindowLength_;
      } else {
        result.aggregationWindowLength_ = aggregationWindowLengthBuilder_.build();
      }
      result.targetUtilization_ = targetUtilization_;
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
      if (other instanceof com.google.appengine.v1.CpuUtilization) {
        return mergeFrom((com.google.appengine.v1.CpuUtilization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CpuUtilization other) {
      if (other == com.google.appengine.v1.CpuUtilization.getDefaultInstance()) return this;
      if (other.hasAggregationWindowLength()) {
        mergeAggregationWindowLength(other.getAggregationWindowLength());
      }
      if (other.getTargetUtilization() != 0D) {
        setTargetUtilization(other.getTargetUtilization());
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
      com.google.appengine.v1.CpuUtilization parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.CpuUtilization) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration aggregationWindowLength_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> aggregationWindowLengthBuilder_;
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public boolean hasAggregationWindowLength() {
      return aggregationWindowLengthBuilder_ != null || aggregationWindowLength_ != null;
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public com.google.protobuf.Duration getAggregationWindowLength() {
      if (aggregationWindowLengthBuilder_ == null) {
        return aggregationWindowLength_ == null ? com.google.protobuf.Duration.getDefaultInstance() : aggregationWindowLength_;
      } else {
        return aggregationWindowLengthBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder setAggregationWindowLength(com.google.protobuf.Duration value) {
      if (aggregationWindowLengthBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aggregationWindowLength_ = value;
        onChanged();
      } else {
        aggregationWindowLengthBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder setAggregationWindowLength(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLength_ = builderForValue.build();
        onChanged();
      } else {
        aggregationWindowLengthBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder mergeAggregationWindowLength(com.google.protobuf.Duration value) {
      if (aggregationWindowLengthBuilder_ == null) {
        if (aggregationWindowLength_ != null) {
          aggregationWindowLength_ =
            com.google.protobuf.Duration.newBuilder(aggregationWindowLength_).mergeFrom(value).buildPartial();
        } else {
          aggregationWindowLength_ = value;
        }
        onChanged();
      } else {
        aggregationWindowLengthBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public Builder clearAggregationWindowLength() {
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLength_ = null;
        onChanged();
      } else {
        aggregationWindowLength_ = null;
        aggregationWindowLengthBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getAggregationWindowLengthBuilder() {
      
      onChanged();
      return getAggregationWindowLengthFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getAggregationWindowLengthOrBuilder() {
      if (aggregationWindowLengthBuilder_ != null) {
        return aggregationWindowLengthBuilder_.getMessageOrBuilder();
      } else {
        return aggregationWindowLength_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : aggregationWindowLength_;
      }
    }
    /**
     * <pre>
     * Period of time over which CPU utilization is calculated.
     * </pre>
     *
     * <code>.google.protobuf.Duration aggregation_window_length = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getAggregationWindowLengthFieldBuilder() {
      if (aggregationWindowLengthBuilder_ == null) {
        aggregationWindowLengthBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getAggregationWindowLength(),
                getParentForChildren(),
                isClean());
        aggregationWindowLength_ = null;
      }
      return aggregationWindowLengthBuilder_;
    }

    private double targetUtilization_ ;
    /**
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     */
    public double getTargetUtilization() {
      return targetUtilization_;
    }
    /**
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     */
    public Builder setTargetUtilization(double value) {
      
      targetUtilization_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target CPU utilization ratio to maintain when scaling. Must be between 0
     * and 1.
     * </pre>
     *
     * <code>double target_utilization = 2;</code>
     */
    public Builder clearTargetUtilization() {
      
      targetUtilization_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CpuUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CpuUtilization)
  private static final com.google.appengine.v1.CpuUtilization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CpuUtilization();
  }

  public static com.google.appengine.v1.CpuUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CpuUtilization>
      PARSER = new com.google.protobuf.AbstractParser<CpuUtilization>() {
    public CpuUtilization parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CpuUtilization(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CpuUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpuUtilization> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.CpuUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

