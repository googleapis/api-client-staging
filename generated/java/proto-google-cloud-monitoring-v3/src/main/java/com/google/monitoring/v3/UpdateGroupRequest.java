// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `UpdateGroup` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.UpdateGroupRequest}
 */
public  final class UpdateGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.UpdateGroupRequest)
    UpdateGroupRequestOrBuilder {
  // Use UpdateGroupRequest.newBuilder() to construct.
  private UpdateGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGroupRequest() {
    validateOnly_ = false;
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
          case 18: {
            com.google.monitoring.v3.Group.Builder subBuilder = null;
            if (group_ != null) {
              subBuilder = group_.toBuilder();
            }
            group_ = input.readMessage(com.google.monitoring.v3.Group.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(group_);
              group_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            validateOnly_ = input.readBool();
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
    return com.google.monitoring.v3.GroupServiceProto.internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.GroupServiceProto.internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.UpdateGroupRequest.class, com.google.monitoring.v3.UpdateGroupRequest.Builder.class);
  }

  public static final int GROUP_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.Group group_;
  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  public com.google.monitoring.v3.Group getGroup() {
    return group_ == null ? com.google.monitoring.v3.Group.getDefaultInstance() : group_;
  }
  /**
   * <pre>
   * The new definition of the group.  All fields of the existing group,
   * excepting `name`, are replaced with the corresponding fields of this group.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder() {
    return getGroup();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   * <pre>
   * If true, validate this request but do not update the existing group.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   */
  public boolean getValidateOnly() {
    return validateOnly_;
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
      output.writeMessage(2, getGroup());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGroup());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.monitoring.v3.UpdateGroupRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.UpdateGroupRequest other = (com.google.monitoring.v3.UpdateGroupRequest) obj;

    boolean result = true;
    result = result && (hasGroup() == other.hasGroup());
    if (hasGroup()) {
      result = result && getGroup()
          .equals(other.getGroup());
    }
    result = result && (getValidateOnly()
        == other.getValidateOnly());
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
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.UpdateGroupRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.UpdateGroupRequest prototype) {
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
   * The `UpdateGroup` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.UpdateGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.UpdateGroupRequest)
      com.google.monitoring.v3.UpdateGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.GroupServiceProto.internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.GroupServiceProto.internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.UpdateGroupRequest.class, com.google.monitoring.v3.UpdateGroupRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.UpdateGroupRequest.newBuilder()
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
      validateOnly_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.GroupServiceProto.internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor;
    }

    public com.google.monitoring.v3.UpdateGroupRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.UpdateGroupRequest.getDefaultInstance();
    }

    public com.google.monitoring.v3.UpdateGroupRequest build() {
      com.google.monitoring.v3.UpdateGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.UpdateGroupRequest buildPartial() {
      com.google.monitoring.v3.UpdateGroupRequest result = new com.google.monitoring.v3.UpdateGroupRequest(this);
      if (groupBuilder_ == null) {
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.monitoring.v3.UpdateGroupRequest) {
        return mergeFrom((com.google.monitoring.v3.UpdateGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.UpdateGroupRequest other) {
      if (other == com.google.monitoring.v3.UpdateGroupRequest.getDefaultInstance()) return this;
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.monitoring.v3.UpdateGroupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.UpdateGroupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.monitoring.v3.Group group_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.Group, com.google.monitoring.v3.Group.Builder, com.google.monitoring.v3.GroupOrBuilder> groupBuilder_;
    /**
     * <pre>
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public boolean hasGroup() {
      return groupBuilder_ != null || group_ != null;
    }
    /**
     * <pre>
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public com.google.monitoring.v3.Group getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? com.google.monitoring.v3.Group.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public Builder setGroup(com.google.monitoring.v3.Group value) {
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
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public Builder setGroup(
        com.google.monitoring.v3.Group.Builder builderForValue) {
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
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public Builder mergeGroup(com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (group_ != null) {
          group_ =
            com.google.monitoring.v3.Group.newBuilder(group_).mergeFrom(value).buildPartial();
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
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
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
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public com.google.monitoring.v3.Group.Builder getGroupBuilder() {
      
      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ?
            com.google.monitoring.v3.Group.getDefaultInstance() : group_;
      }
    }
    /**
     * <pre>
     * The new definition of the group.  All fields of the existing group,
     * excepting `name`, are replaced with the corresponding fields of this group.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.Group, com.google.monitoring.v3.Group.Builder, com.google.monitoring.v3.GroupOrBuilder> 
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Group, com.google.monitoring.v3.Group.Builder, com.google.monitoring.v3.GroupOrBuilder>(
                getGroup(),
                getParentForChildren(),
                isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, validate this request but do not update the existing group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     */
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, validate this request but do not update the existing group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     */
    public Builder setValidateOnly(boolean value) {
      
      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, validate this request but do not update the existing group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     */
    public Builder clearValidateOnly() {
      
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.UpdateGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.UpdateGroupRequest)
  private static final com.google.monitoring.v3.UpdateGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.UpdateGroupRequest();
  }

  public static com.google.monitoring.v3.UpdateGroupRequest getDefaultInstance() {
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

  public com.google.monitoring.v3.UpdateGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

