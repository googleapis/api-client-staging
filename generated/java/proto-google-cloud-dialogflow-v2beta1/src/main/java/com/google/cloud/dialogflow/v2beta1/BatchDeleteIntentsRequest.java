// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for [Intents.BatchDeleteIntents][google.cloud.dialogflow.v2beta1.Intents.BatchDeleteIntents].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest}
 */
public  final class BatchDeleteIntentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)
    BatchDeleteIntentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchDeleteIntentsRequest.newBuilder() to construct.
  private BatchDeleteIntentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchDeleteIntentsRequest() {
    parent_ = "";
    intents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BatchDeleteIntentsRequest(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              intents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Intent>();
              mutable_bitField0_ |= 0x00000002;
            }
            intents_.add(
                input.readMessage(com.google.cloud.dialogflow.v2beta1.Intent.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        intents_ = java.util.Collections.unmodifiableList(intents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteIntentsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteIntentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.class, com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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

  public static final int INTENTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_;
  /**
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
   */
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> getIntentsList() {
    return intents_;
  }
  /**
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
   */
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
      getIntentsOrBuilderList() {
    return intents_;
  }
  /**
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
   */
  public int getIntentsCount() {
    return intents_.size();
  }
  /**
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index) {
    return intents_.get(index);
  }
  /**
   * <pre>
   * Required. The collection of intents to delete. Only intent `name` must be
   * filled in.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentsOrBuilder(
      int index) {
    return intents_.get(index);
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
    for (int i = 0; i < intents_.size(); i++) {
      output.writeMessage(2, intents_.get(i));
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
    for (int i = 0; i < intents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, intents_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest other = (com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && getIntentsList()
        .equals(other.getIntentsList());
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
    if (getIntentsCount() > 0) {
      hash = (37 * hash) + INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getIntentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest prototype) {
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
   * The request message for [Intents.BatchDeleteIntents][google.cloud.dialogflow.v2beta1.Intents.BatchDeleteIntents].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)
      com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteIntentsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteIntentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.class, com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.newBuilder()
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
        getIntentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        intentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteIntentsRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest build() {
      com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest result = new com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      if (intentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          intents_ = java.util.Collections.unmodifiableList(intents_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.intents_ = intents_;
      } else {
        result.intents_ = intentsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (intentsBuilder_ == null) {
        if (!other.intents_.isEmpty()) {
          if (intents_.isEmpty()) {
            intents_ = other.intents_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureIntentsIsMutable();
            intents_.addAll(other.intents_);
          }
          onChanged();
        }
      } else {
        if (!other.intents_.isEmpty()) {
          if (intentsBuilder_.isEmpty()) {
            intentsBuilder_.dispose();
            intentsBuilder_ = null;
            intents_ = other.intents_;
            bitField0_ = (bitField0_ & ~0x00000002);
            intentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIntentsFieldBuilder() : null;
          } else {
            intentsBuilder_.addAllMessages(other.intents_);
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
      com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_ =
      java.util.Collections.emptyList();
    private void ensureIntentsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        intents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Intent>(intents_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> intentsBuilder_;

    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> getIntentsList() {
      if (intentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(intents_);
      } else {
        return intentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public int getIntentsCount() {
      if (intentsBuilder_ == null) {
        return intents_.size();
      } else {
        return intentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index) {
      if (intentsBuilder_ == null) {
        return intents_.get(index);
      } else {
        return intentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder setIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.set(index, value);
        onChanged();
      } else {
        intentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder setIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.set(index, builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder addIntents(com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.add(value);
        onChanged();
      } else {
        intentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder addIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIntentsIsMutable();
        intents_.add(index, value);
        onChanged();
      } else {
        intentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder addIntents(
        com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.add(builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder addIntents(
        int index, com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.add(index, builderForValue.build());
        onChanged();
      } else {
        intentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder addAllIntents(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.Intent> values) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, intents_);
        onChanged();
      } else {
        intentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder clearIntents() {
      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        intentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public Builder removeIntents(int index) {
      if (intentsBuilder_ == null) {
        ensureIntentsIsMutable();
        intents_.remove(index);
        onChanged();
      } else {
        intentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder getIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentsOrBuilder(
        int index) {
      if (intentsBuilder_ == null) {
        return intents_.get(index);  } else {
        return intentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
         getIntentsOrBuilderList() {
      if (intentsBuilder_ != null) {
        return intentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(intents_);
      }
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder() {
      return getIntentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The collection of intents to delete. Only intent `name` must be
     * filled in.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 2;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Builder> 
         getIntentsBuilderList() {
      return getIntentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
        getIntentsFieldBuilder() {
      if (intentsBuilder_ == null) {
        intentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder>(
                intents_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        intents_ = null;
      }
      return intentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    /**
     * @deprecated Use the following instead:
     * <pre><code>
     * protoBuilder.setParent(projectName.toString());
     * </code></pre>
     */
    @Deprecated
    public final Builder setParentWithProjectName(com.google.cloud.dialogflow.v2beta1.ProjectName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    /**
     * @deprecated Use the following instead:
     * <pre><code>
     * ProjectName.parse(protoBuilder.getParent());
     * </code></pre>
     */
    @Deprecated
    public final com.google.cloud.dialogflow.v2beta1.ProjectName getParentAsProjectName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.cloud.dialogflow.v2beta1.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)
  }

  /**
   * @deprecated Use the following instead:
   * <pre><code>
   * ProjectName.parse(protoObject.getParent());
   * </code></pre>
   */
  @Deprecated
  public final com.google.cloud.dialogflow.v2beta1.ProjectName getParentAsProjectName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.cloud.dialogflow.v2beta1.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest)
  private static final com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteIntentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchDeleteIntentsRequest>() {
    public BatchDeleteIntentsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BatchDeleteIntentsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BatchDeleteIntentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteIntentsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

