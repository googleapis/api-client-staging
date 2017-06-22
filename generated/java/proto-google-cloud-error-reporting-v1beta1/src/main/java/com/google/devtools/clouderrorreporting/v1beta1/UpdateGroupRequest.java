// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_group_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 * <pre>
 * A request to replace the existing data for the given group.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest}
 */
public  final class UpdateGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)
    UpdateGroupRequestOrBuilder {
  // Use UpdateGroupRequest.newBuilder() to construct.
  private UpdateGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGroupRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateGroupRequest(
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
            com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder subBuilder = null;
            if (group_ != null) {
              subBuilder = group_.toBuilder();
            }
            group_ = input.readMessage(com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(group_);
              group_ = subBuilder.buildPartial();
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
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_UpdateGroupRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_UpdateGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.class, com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 1;
  private com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group_;
  /**
   * <pre>
   * [Required] The group which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   */
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   * <pre>
   * [Required] The group which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   */
  public com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup getGroup() {
    return group_ == null ? com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.getDefaultInstance() : group_;
  }
  /**
   * <pre>
   * [Required] The group which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
   */
  public com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder getGroupOrBuilder() {
    return getGroup();
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
    if (group_ != null) {
      output.writeMessage(1, getGroup());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGroup());
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest other = (com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest) obj;

    boolean result = true;
    result = result && (hasGroup() == other.hasGroup());
    if (hasGroup()) {
      result = result && getGroup()
          .equals(other.getGroup());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGroup()) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest prototype) {
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
   * A request to replace the existing data for the given group.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)
      com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_UpdateGroupRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_UpdateGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.class, com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.newBuilder()
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
      if (groupBuilder_ == null) {
        group_ = null;
      } else {
        group_ = null;
        groupBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_UpdateGroupRequest_descriptor;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.getDefaultInstance();
    }

    public com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest build() {
      com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest result = new com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest(this);
      if (groupBuilder_ == null) {
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest other) {
      if (other == com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
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
      com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder> groupBuilder_;
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public boolean hasGroup() {
      return groupBuilder_ != null || group_ != null;
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public Builder setGroup(com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
        onChanged();
      } else {
        groupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public Builder setGroup(
        com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
        onChanged();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public Builder mergeGroup(com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup value) {
      if (groupBuilder_ == null) {
        if (group_ != null) {
          group_ =
            com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.newBuilder(group_).mergeFrom(value).buildPartial();
        } else {
          group_ = value;
        }
        onChanged();
      } else {
        groupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = null;
        onChanged();
      } else {
        group_ = null;
        groupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder getGroupBuilder() {
      
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.getDefaultInstance() : group_;
      }
    }
    /**
     * <pre>
     * [Required] The group which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup.Builder, com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest)
  private static final com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGroupRequest>() {
    public UpdateGroupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateGroupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGroupRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

