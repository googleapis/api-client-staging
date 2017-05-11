// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the `DeleteSnapshot` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.DeleteSnapshotRequest}
 */
public  final class DeleteSnapshotRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.DeleteSnapshotRequest)
    DeleteSnapshotRequestOrBuilder {
  // Use DeleteSnapshotRequest.newBuilder() to construct.
  private DeleteSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteSnapshotRequest() {
    snapshot_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteSnapshotRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            snapshot_ = s;
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
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_DeleteSnapshotRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_DeleteSnapshotRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.DeleteSnapshotRequest.class, com.google.pubsub.v1.DeleteSnapshotRequest.Builder.class);
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 1;
  private volatile java.lang.Object snapshot_;
  /**
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>optional string snapshot = 1;</code>
   */
  public java.lang.String getSnapshot() {
    java.lang.Object ref = snapshot_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshot_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the snapshot to delete.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>optional string snapshot = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSnapshotBytes() {
    java.lang.Object ref = snapshot_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapshot_ = b;
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
    if (!getSnapshotBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, snapshot_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSnapshotBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, snapshot_);
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
    if (!(obj instanceof com.google.pubsub.v1.DeleteSnapshotRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.DeleteSnapshotRequest other = (com.google.pubsub.v1.DeleteSnapshotRequest) obj;

    boolean result = true;
    result = result && getSnapshot()
        .equals(other.getSnapshot());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshot().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.DeleteSnapshotRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.DeleteSnapshotRequest prototype) {
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
   * Request for the `DeleteSnapshot` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.DeleteSnapshotRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.DeleteSnapshotRequest)
      com.google.pubsub.v1.DeleteSnapshotRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_DeleteSnapshotRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_DeleteSnapshotRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.DeleteSnapshotRequest.class, com.google.pubsub.v1.DeleteSnapshotRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.DeleteSnapshotRequest.newBuilder()
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
      snapshot_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_DeleteSnapshotRequest_descriptor;
    }

    public com.google.pubsub.v1.DeleteSnapshotRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.DeleteSnapshotRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.DeleteSnapshotRequest build() {
      com.google.pubsub.v1.DeleteSnapshotRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.DeleteSnapshotRequest buildPartial() {
      com.google.pubsub.v1.DeleteSnapshotRequest result = new com.google.pubsub.v1.DeleteSnapshotRequest(this);
      result.snapshot_ = snapshot_;
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
      if (other instanceof com.google.pubsub.v1.DeleteSnapshotRequest) {
        return mergeFrom((com.google.pubsub.v1.DeleteSnapshotRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.DeleteSnapshotRequest other) {
      if (other == com.google.pubsub.v1.DeleteSnapshotRequest.getDefaultInstance()) return this;
      if (!other.getSnapshot().isEmpty()) {
        snapshot_ = other.snapshot_;
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
      com.google.pubsub.v1.DeleteSnapshotRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.DeleteSnapshotRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object snapshot_ = "";
    /**
     * <pre>
     * The name of the snapshot to delete.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>optional string snapshot = 1;</code>
     */
    public java.lang.String getSnapshot() {
      java.lang.Object ref = snapshot_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshot_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the snapshot to delete.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>optional string snapshot = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSnapshotBytes() {
      java.lang.Object ref = snapshot_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapshot_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the snapshot to delete.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>optional string snapshot = 1;</code>
     */
    public Builder setSnapshot(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      snapshot_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the snapshot to delete.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>optional string snapshot = 1;</code>
     */
    public Builder clearSnapshot() {
      
      snapshot_ = getDefaultInstance().getSnapshot();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the snapshot to delete.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>optional string snapshot = 1;</code>
     */
    public Builder setSnapshotBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      snapshot_ = value;
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


    public final Builder setSnapshotWithSnapshotName(com.google.pubsub.v1.SnapshotName value) {
      if (value == null) {
        return setSnapshot("");
      }
      return setSnapshot(value.toString());
    }
    
    public final com.google.pubsub.v1.SnapshotName getSnapshotAsSnapshotName() {
      java.lang.String str = getSnapshot();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.pubsub.v1.SnapshotName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.DeleteSnapshotRequest)
  }

  public final com.google.pubsub.v1.SnapshotName getSnapshotAsSnapshotName() {
    java.lang.String str = getSnapshot();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.pubsub.v1.SnapshotName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.pubsub.v1.DeleteSnapshotRequest)
  private static final com.google.pubsub.v1.DeleteSnapshotRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.DeleteSnapshotRequest();
  }

  public static com.google.pubsub.v1.DeleteSnapshotRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteSnapshotRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteSnapshotRequest>() {
    public DeleteSnapshotRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteSnapshotRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteSnapshotRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteSnapshotRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.DeleteSnapshotRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

