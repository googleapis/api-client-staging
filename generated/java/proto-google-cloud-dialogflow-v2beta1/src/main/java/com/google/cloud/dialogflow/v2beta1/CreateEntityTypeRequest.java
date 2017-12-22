// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for
 * [EntityTypes.CreateEntityType][google.cloud.dialogflow.v2beta1.EntityTypes.CreateEntityType].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest}
 */
public  final class CreateEntityTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)
    CreateEntityTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEntityTypeRequest.newBuilder() to construct.
  private CreateEntityTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEntityTypeRequest() {
    parent_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEntityTypeRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.dialogflow.v2beta1.EntityType.Builder subBuilder = null;
            if (entityType_ != null) {
              subBuilder = entityType_.toBuilder();
            }
            entityType_ = input.readMessage(com.google.cloud.dialogflow.v2beta1.EntityType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entityType_);
              entityType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            languageCode_ = s;
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
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.class, com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.EntityType entityType_;
  /**
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
   */
  public boolean hasEntityType() {
    return entityType_ != null;
  }
  /**
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.EntityType getEntityType() {
    return entityType_ == null ? com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance() : entityType_;
  }
  /**
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
    return getEntityType();
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object languageCode_;
  /**
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (entityType_ != null) {
      output.writeMessage(2, getEntityType());
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (entityType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEntityType());
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest other = (com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasEntityType() == other.hasEntityType());
    if (hasEntityType()) {
      result = result && getEntityType()
          .equals(other.getEntityType());
    }
    result = result && getLanguageCode()
        .equals(other.getLanguageCode());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasEntityType()) {
      hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEntityType().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest prototype) {
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
   * The request message for
   * [EntityTypes.CreateEntityType][google.cloud.dialogflow.v2beta1.EntityTypes.CreateEntityType].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)
      com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.class, com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.newBuilder()
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
      parent_ = "";

      if (entityTypeBuilder_ == null) {
        entityType_ = null;
      } else {
        entityType_ = null;
        entityTypeBuilder_ = null;
      }
      languageCode_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest result = new com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest(this);
      result.parent_ = parent_;
      if (entityTypeBuilder_ == null) {
        result.entityType_ = entityType_;
      } else {
        result.entityType_ = entityTypeBuilder_.build();
      }
      result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasEntityType()) {
        mergeEntityType(other.getEntityType());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
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
      com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The agent to create a entity type for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The agent to create a entity type for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The agent to create a entity type for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The agent to create a entity type for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The agent to create a entity type for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2beta1.EntityType entityType_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.EntityType, com.google.cloud.dialogflow.v2beta1.EntityType.Builder, com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder> entityTypeBuilder_;
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public boolean hasEntityType() {
      return entityTypeBuilder_ != null || entityType_ != null;
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType getEntityType() {
      if (entityTypeBuilder_ == null) {
        return entityType_ == null ? com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance() : entityType_;
      } else {
        return entityTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public Builder setEntityType(com.google.cloud.dialogflow.v2beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityType_ = value;
        onChanged();
      } else {
        entityTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public Builder setEntityType(
        com.google.cloud.dialogflow.v2beta1.EntityType.Builder builderForValue) {
      if (entityTypeBuilder_ == null) {
        entityType_ = builderForValue.build();
        onChanged();
      } else {
        entityTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public Builder mergeEntityType(com.google.cloud.dialogflow.v2beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (entityType_ != null) {
          entityType_ =
            com.google.cloud.dialogflow.v2beta1.EntityType.newBuilder(entityType_).mergeFrom(value).buildPartial();
        } else {
          entityType_ = value;
        }
        onChanged();
      } else {
        entityTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public Builder clearEntityType() {
      if (entityTypeBuilder_ == null) {
        entityType_ = null;
        onChanged();
      } else {
        entityType_ = null;
        entityTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType.Builder getEntityTypeBuilder() {
      
      onChanged();
      return getEntityTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
      if (entityTypeBuilder_ != null) {
        return entityTypeBuilder_.getMessageOrBuilder();
      } else {
        return entityType_ == null ?
            com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance() : entityType_;
      }
    }
    /**
     * <pre>
     * Required. The entity type to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.EntityType, com.google.cloud.dialogflow.v2beta1.EntityType.Builder, com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder> 
        getEntityTypeFieldBuilder() {
      if (entityTypeBuilder_ == null) {
        entityTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.EntityType, com.google.cloud.dialogflow.v2beta1.EntityType.Builder, com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder>(
                getEntityType(),
                getParentForChildren(),
                isClean());
        entityType_ = null;
      }
      return entityTypeBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * Optional. The language of entity synonyms defined in `entity_type`. If not
     * specified, the agent's default language is used.
     * [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The language of entity synonyms defined in `entity_type`. If not
     * specified, the agent's default language is used.
     * [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The language of entity synonyms defined in `entity_type`. If not
     * specified, the agent's default language is used.
     * [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The language of entity synonyms defined in `entity_type`. If not
     * specified, the agent's default language is used.
     * [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder clearLanguageCode() {
      
      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The language of entity synonyms defined in `entity_type`. If not
     * specified, the agent's default language is used.
     * [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      languageCode_ = value;
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


    public final Builder setParentWithProjectAgentName(com.google.cloud.dialogflow.v2beta1.ProjectAgentName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    public final com.google.cloud.dialogflow.v2beta1.ProjectAgentName getParentAsProjectAgentName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.cloud.dialogflow.v2beta1.ProjectAgentName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)
  }

  public final com.google.cloud.dialogflow.v2beta1.ProjectAgentName getParentAsProjectAgentName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.cloud.dialogflow.v2beta1.ProjectAgentName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntityTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEntityTypeRequest>() {
    public CreateEntityTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateEntityTypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEntityTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntityTypeRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

