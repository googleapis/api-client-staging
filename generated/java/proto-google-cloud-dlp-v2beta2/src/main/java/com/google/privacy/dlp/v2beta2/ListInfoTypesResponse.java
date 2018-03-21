// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Response to the ListInfoTypes request.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.ListInfoTypesResponse}
 */
public  final class ListInfoTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.ListInfoTypesResponse)
    ListInfoTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInfoTypesResponse.newBuilder() to construct.
  private ListInfoTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInfoTypesResponse() {
    infoTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListInfoTypesResponse(
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
              infoTypes_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta2.InfoTypeDescription>();
              mutable_bitField0_ |= 0x00000001;
            }
            infoTypes_.add(
                input.readMessage(com.google.privacy.dlp.v2beta2.InfoTypeDescription.parser(), extensionRegistry));
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
        infoTypes_ = java.util.Collections.unmodifiableList(infoTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListInfoTypesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListInfoTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.class, com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.Builder.class);
  }

  public static final int INFO_TYPES_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2beta2.InfoTypeDescription> infoTypes_;
  /**
   * <pre>
   * Set of sensitive infoTypes.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2beta2.InfoTypeDescription> getInfoTypesList() {
    return infoTypes_;
  }
  /**
   * <pre>
   * Set of sensitive infoTypes.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder> 
      getInfoTypesOrBuilderList() {
    return infoTypes_;
  }
  /**
   * <pre>
   * Set of sensitive infoTypes.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
   */
  public int getInfoTypesCount() {
    return infoTypes_.size();
  }
  /**
   * <pre>
   * Set of sensitive infoTypes.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.InfoTypeDescription getInfoTypes(int index) {
    return infoTypes_.get(index);
  }
  /**
   * <pre>
   * Set of sensitive infoTypes.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder getInfoTypesOrBuilder(
      int index) {
    return infoTypes_.get(index);
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
    for (int i = 0; i < infoTypes_.size(); i++) {
      output.writeMessage(1, infoTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < infoTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, infoTypes_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.ListInfoTypesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.ListInfoTypesResponse other = (com.google.privacy.dlp.v2beta2.ListInfoTypesResponse) obj;

    boolean result = true;
    result = result && getInfoTypesList()
        .equals(other.getInfoTypesList());
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
    if (getInfoTypesCount() > 0) {
      hash = (37 * hash) + INFO_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getInfoTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.ListInfoTypesResponse prototype) {
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
   * Response to the ListInfoTypes request.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.ListInfoTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.ListInfoTypesResponse)
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListInfoTypesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListInfoTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.class, com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.newBuilder()
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
        getInfoTypesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (infoTypesBuilder_ == null) {
        infoTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        infoTypesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListInfoTypesResponse_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse build() {
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse buildPartial() {
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse result = new com.google.privacy.dlp.v2beta2.ListInfoTypesResponse(this);
      int from_bitField0_ = bitField0_;
      if (infoTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          infoTypes_ = java.util.Collections.unmodifiableList(infoTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.infoTypes_ = infoTypes_;
      } else {
        result.infoTypes_ = infoTypesBuilder_.build();
      }
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
      if (other instanceof com.google.privacy.dlp.v2beta2.ListInfoTypesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.ListInfoTypesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.ListInfoTypesResponse other) {
      if (other == com.google.privacy.dlp.v2beta2.ListInfoTypesResponse.getDefaultInstance()) return this;
      if (infoTypesBuilder_ == null) {
        if (!other.infoTypes_.isEmpty()) {
          if (infoTypes_.isEmpty()) {
            infoTypes_ = other.infoTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInfoTypesIsMutable();
            infoTypes_.addAll(other.infoTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.infoTypes_.isEmpty()) {
          if (infoTypesBuilder_.isEmpty()) {
            infoTypesBuilder_.dispose();
            infoTypesBuilder_ = null;
            infoTypes_ = other.infoTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            infoTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInfoTypesFieldBuilder() : null;
          } else {
            infoTypesBuilder_.addAllMessages(other.infoTypes_);
          }
        }
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
      com.google.privacy.dlp.v2beta2.ListInfoTypesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.ListInfoTypesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2beta2.InfoTypeDescription> infoTypes_ =
      java.util.Collections.emptyList();
    private void ensureInfoTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        infoTypes_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta2.InfoTypeDescription>(infoTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InfoTypeDescription, com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder, com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder> infoTypesBuilder_;

    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta2.InfoTypeDescription> getInfoTypesList() {
      if (infoTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(infoTypes_);
      } else {
        return infoTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public int getInfoTypesCount() {
      if (infoTypesBuilder_ == null) {
        return infoTypes_.size();
      } else {
        return infoTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeDescription getInfoTypes(int index) {
      if (infoTypesBuilder_ == null) {
        return infoTypes_.get(index);
      } else {
        return infoTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder setInfoTypes(
        int index, com.google.privacy.dlp.v2beta2.InfoTypeDescription value) {
      if (infoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoTypesIsMutable();
        infoTypes_.set(index, value);
        onChanged();
      } else {
        infoTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder setInfoTypes(
        int index, com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder builderForValue) {
      if (infoTypesBuilder_ == null) {
        ensureInfoTypesIsMutable();
        infoTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        infoTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder addInfoTypes(com.google.privacy.dlp.v2beta2.InfoTypeDescription value) {
      if (infoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoTypesIsMutable();
        infoTypes_.add(value);
        onChanged();
      } else {
        infoTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder addInfoTypes(
        int index, com.google.privacy.dlp.v2beta2.InfoTypeDescription value) {
      if (infoTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoTypesIsMutable();
        infoTypes_.add(index, value);
        onChanged();
      } else {
        infoTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder addInfoTypes(
        com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder builderForValue) {
      if (infoTypesBuilder_ == null) {
        ensureInfoTypesIsMutable();
        infoTypes_.add(builderForValue.build());
        onChanged();
      } else {
        infoTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder addInfoTypes(
        int index, com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder builderForValue) {
      if (infoTypesBuilder_ == null) {
        ensureInfoTypesIsMutable();
        infoTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        infoTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder addAllInfoTypes(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2beta2.InfoTypeDescription> values) {
      if (infoTypesBuilder_ == null) {
        ensureInfoTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, infoTypes_);
        onChanged();
      } else {
        infoTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder clearInfoTypes() {
      if (infoTypesBuilder_ == null) {
        infoTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        infoTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public Builder removeInfoTypes(int index) {
      if (infoTypesBuilder_ == null) {
        ensureInfoTypesIsMutable();
        infoTypes_.remove(index);
        onChanged();
      } else {
        infoTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder getInfoTypesBuilder(
        int index) {
      return getInfoTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder getInfoTypesOrBuilder(
        int index) {
      if (infoTypesBuilder_ == null) {
        return infoTypes_.get(index);  } else {
        return infoTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder> 
         getInfoTypesOrBuilderList() {
      if (infoTypesBuilder_ != null) {
        return infoTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(infoTypes_);
      }
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder addInfoTypesBuilder() {
      return getInfoTypesFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2beta2.InfoTypeDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder addInfoTypesBuilder(
        int index) {
      return getInfoTypesFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2beta2.InfoTypeDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of sensitive infoTypes.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta2.InfoTypeDescription info_types = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder> 
         getInfoTypesBuilderList() {
      return getInfoTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.InfoTypeDescription, com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder, com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder> 
        getInfoTypesFieldBuilder() {
      if (infoTypesBuilder_ == null) {
        infoTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.InfoTypeDescription, com.google.privacy.dlp.v2beta2.InfoTypeDescription.Builder, com.google.privacy.dlp.v2beta2.InfoTypeDescriptionOrBuilder>(
                infoTypes_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        infoTypes_ = null;
      }
      return infoTypesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.ListInfoTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.ListInfoTypesResponse)
  private static final com.google.privacy.dlp.v2beta2.ListInfoTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.ListInfoTypesResponse();
  }

  public static com.google.privacy.dlp.v2beta2.ListInfoTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInfoTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInfoTypesResponse>() {
    public ListInfoTypesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListInfoTypesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInfoTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInfoTypesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.ListInfoTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

