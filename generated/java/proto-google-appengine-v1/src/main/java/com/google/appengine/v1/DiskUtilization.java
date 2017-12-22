// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Target scaling by disk usage. Only applicable for VM runtimes.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.DiskUtilization}
 */
public  final class DiskUtilization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.DiskUtilization)
    DiskUtilizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiskUtilization.newBuilder() to construct.
  private DiskUtilization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiskUtilization() {
    targetWriteBytesPerSecond_ = 0;
    targetWriteOpsPerSecond_ = 0;
    targetReadBytesPerSecond_ = 0;
    targetReadOpsPerSecond_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiskUtilization(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          case 112: {

            targetWriteBytesPerSecond_ = input.readInt32();
            break;
          }
          case 120: {

            targetWriteOpsPerSecond_ = input.readInt32();
            break;
          }
          case 128: {

            targetReadBytesPerSecond_ = input.readInt32();
            break;
          }
          case 136: {

            targetReadOpsPerSecond_ = input.readInt32();
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
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_DiskUtilization_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.DiskUtilization.class, com.google.appengine.v1.DiskUtilization.Builder.class);
  }

  public static final int TARGET_WRITE_BYTES_PER_SECOND_FIELD_NUMBER = 14;
  private int targetWriteBytesPerSecond_;
  /**
   * <pre>
   * Target bytes written per second.
   * </pre>
   *
   * <code>int32 target_write_bytes_per_second = 14;</code>
   */
  public int getTargetWriteBytesPerSecond() {
    return targetWriteBytesPerSecond_;
  }

  public static final int TARGET_WRITE_OPS_PER_SECOND_FIELD_NUMBER = 15;
  private int targetWriteOpsPerSecond_;
  /**
   * <pre>
   * Target ops written per second.
   * </pre>
   *
   * <code>int32 target_write_ops_per_second = 15;</code>
   */
  public int getTargetWriteOpsPerSecond() {
    return targetWriteOpsPerSecond_;
  }

  public static final int TARGET_READ_BYTES_PER_SECOND_FIELD_NUMBER = 16;
  private int targetReadBytesPerSecond_;
  /**
   * <pre>
   * Target bytes read per second.
   * </pre>
   *
   * <code>int32 target_read_bytes_per_second = 16;</code>
   */
  public int getTargetReadBytesPerSecond() {
    return targetReadBytesPerSecond_;
  }

  public static final int TARGET_READ_OPS_PER_SECOND_FIELD_NUMBER = 17;
  private int targetReadOpsPerSecond_;
  /**
   * <pre>
   * Target ops read per seconds.
   * </pre>
   *
   * <code>int32 target_read_ops_per_second = 17;</code>
   */
  public int getTargetReadOpsPerSecond() {
    return targetReadOpsPerSecond_;
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
    if (targetWriteBytesPerSecond_ != 0) {
      output.writeInt32(14, targetWriteBytesPerSecond_);
    }
    if (targetWriteOpsPerSecond_ != 0) {
      output.writeInt32(15, targetWriteOpsPerSecond_);
    }
    if (targetReadBytesPerSecond_ != 0) {
      output.writeInt32(16, targetReadBytesPerSecond_);
    }
    if (targetReadOpsPerSecond_ != 0) {
      output.writeInt32(17, targetReadOpsPerSecond_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetWriteBytesPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(14, targetWriteBytesPerSecond_);
    }
    if (targetWriteOpsPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(15, targetWriteOpsPerSecond_);
    }
    if (targetReadBytesPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(16, targetReadBytesPerSecond_);
    }
    if (targetReadOpsPerSecond_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(17, targetReadOpsPerSecond_);
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
    if (!(obj instanceof com.google.appengine.v1.DiskUtilization)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.DiskUtilization other = (com.google.appengine.v1.DiskUtilization) obj;

    boolean result = true;
    result = result && (getTargetWriteBytesPerSecond()
        == other.getTargetWriteBytesPerSecond());
    result = result && (getTargetWriteOpsPerSecond()
        == other.getTargetWriteOpsPerSecond());
    result = result && (getTargetReadBytesPerSecond()
        == other.getTargetReadBytesPerSecond());
    result = result && (getTargetReadOpsPerSecond()
        == other.getTargetReadOpsPerSecond());
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
    hash = (37 * hash) + TARGET_WRITE_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetWriteBytesPerSecond();
    hash = (37 * hash) + TARGET_WRITE_OPS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetWriteOpsPerSecond();
    hash = (37 * hash) + TARGET_READ_BYTES_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetReadBytesPerSecond();
    hash = (37 * hash) + TARGET_READ_OPS_PER_SECOND_FIELD_NUMBER;
    hash = (53 * hash) + getTargetReadOpsPerSecond();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.DiskUtilization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.DiskUtilization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.DiskUtilization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.DiskUtilization parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.DiskUtilization prototype) {
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
   * Target scaling by disk usage. Only applicable for VM runtimes.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.DiskUtilization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.DiskUtilization)
      com.google.appengine.v1.DiskUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_DiskUtilization_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.DiskUtilization.class, com.google.appengine.v1.DiskUtilization.Builder.class);
    }

    // Construct using com.google.appengine.v1.DiskUtilization.newBuilder()
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
      targetWriteBytesPerSecond_ = 0;

      targetWriteOpsPerSecond_ = 0;

      targetReadBytesPerSecond_ = 0;

      targetReadOpsPerSecond_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_DiskUtilization_descriptor;
    }

    public com.google.appengine.v1.DiskUtilization getDefaultInstanceForType() {
      return com.google.appengine.v1.DiskUtilization.getDefaultInstance();
    }

    public com.google.appengine.v1.DiskUtilization build() {
      com.google.appengine.v1.DiskUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.DiskUtilization buildPartial() {
      com.google.appengine.v1.DiskUtilization result = new com.google.appengine.v1.DiskUtilization(this);
      result.targetWriteBytesPerSecond_ = targetWriteBytesPerSecond_;
      result.targetWriteOpsPerSecond_ = targetWriteOpsPerSecond_;
      result.targetReadBytesPerSecond_ = targetReadBytesPerSecond_;
      result.targetReadOpsPerSecond_ = targetReadOpsPerSecond_;
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
      if (other instanceof com.google.appengine.v1.DiskUtilization) {
        return mergeFrom((com.google.appengine.v1.DiskUtilization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.DiskUtilization other) {
      if (other == com.google.appengine.v1.DiskUtilization.getDefaultInstance()) return this;
      if (other.getTargetWriteBytesPerSecond() != 0) {
        setTargetWriteBytesPerSecond(other.getTargetWriteBytesPerSecond());
      }
      if (other.getTargetWriteOpsPerSecond() != 0) {
        setTargetWriteOpsPerSecond(other.getTargetWriteOpsPerSecond());
      }
      if (other.getTargetReadBytesPerSecond() != 0) {
        setTargetReadBytesPerSecond(other.getTargetReadBytesPerSecond());
      }
      if (other.getTargetReadOpsPerSecond() != 0) {
        setTargetReadOpsPerSecond(other.getTargetReadOpsPerSecond());
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
      com.google.appengine.v1.DiskUtilization parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.DiskUtilization) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int targetWriteBytesPerSecond_ ;
    /**
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     */
    public int getTargetWriteBytesPerSecond() {
      return targetWriteBytesPerSecond_;
    }
    /**
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     */
    public Builder setTargetWriteBytesPerSecond(int value) {
      
      targetWriteBytesPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target bytes written per second.
     * </pre>
     *
     * <code>int32 target_write_bytes_per_second = 14;</code>
     */
    public Builder clearTargetWriteBytesPerSecond() {
      
      targetWriteBytesPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetWriteOpsPerSecond_ ;
    /**
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     */
    public int getTargetWriteOpsPerSecond() {
      return targetWriteOpsPerSecond_;
    }
    /**
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     */
    public Builder setTargetWriteOpsPerSecond(int value) {
      
      targetWriteOpsPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target ops written per second.
     * </pre>
     *
     * <code>int32 target_write_ops_per_second = 15;</code>
     */
    public Builder clearTargetWriteOpsPerSecond() {
      
      targetWriteOpsPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetReadBytesPerSecond_ ;
    /**
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     */
    public int getTargetReadBytesPerSecond() {
      return targetReadBytesPerSecond_;
    }
    /**
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     */
    public Builder setTargetReadBytesPerSecond(int value) {
      
      targetReadBytesPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target bytes read per second.
     * </pre>
     *
     * <code>int32 target_read_bytes_per_second = 16;</code>
     */
    public Builder clearTargetReadBytesPerSecond() {
      
      targetReadBytesPerSecond_ = 0;
      onChanged();
      return this;
    }

    private int targetReadOpsPerSecond_ ;
    /**
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     */
    public int getTargetReadOpsPerSecond() {
      return targetReadOpsPerSecond_;
    }
    /**
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     */
    public Builder setTargetReadOpsPerSecond(int value) {
      
      targetReadOpsPerSecond_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target ops read per seconds.
     * </pre>
     *
     * <code>int32 target_read_ops_per_second = 17;</code>
     */
    public Builder clearTargetReadOpsPerSecond() {
      
      targetReadOpsPerSecond_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.DiskUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.DiskUtilization)
  private static final com.google.appengine.v1.DiskUtilization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.DiskUtilization();
  }

  public static com.google.appengine.v1.DiskUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskUtilization>
      PARSER = new com.google.protobuf.AbstractParser<DiskUtilization>() {
    public DiskUtilization parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DiskUtilization(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiskUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskUtilization> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.DiskUtilization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

