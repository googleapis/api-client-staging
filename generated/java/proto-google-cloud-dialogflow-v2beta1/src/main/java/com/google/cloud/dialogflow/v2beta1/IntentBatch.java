// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * This message is a wrapper around a collection of intents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.IntentBatch}
 */
public  final class IntentBatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.IntentBatch)
    IntentBatchOrBuilder {
  // Use IntentBatch.newBuilder() to construct.
  private IntentBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntentBatch() {
    intents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IntentBatch(
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
              intents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Intent>();
              mutable_bitField0_ |= 0x00000001;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        intents_ = java.util.Collections.unmodifiableList(intents_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_IntentBatch_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_IntentBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.IntentBatch.class, com.google.cloud.dialogflow.v2beta1.IntentBatch.Builder.class);
  }

  public static final int INTENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_;
  /**
   * <pre>
   * A collection of intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  public java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> getIntentsList() {
    return intents_;
  }
  /**
   * <pre>
   * A collection of intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> 
      getIntentsOrBuilderList() {
    return intents_;
  }
  /**
   * <pre>
   * A collection of intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  public int getIntentsCount() {
    return intents_.size();
  }
  /**
   * <pre>
   * A collection of intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.Intent getIntents(int index) {
    return intents_.get(index);
  }
  /**
   * <pre>
   * A collection of intents.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
    for (int i = 0; i < intents_.size(); i++) {
      output.writeMessage(1, intents_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < intents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, intents_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.IntentBatch)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.IntentBatch other = (com.google.cloud.dialogflow.v2beta1.IntentBatch) obj;

    boolean result = true;
    result = result && getIntentsList()
        .equals(other.getIntentsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIntentsCount() > 0) {
      hash = (37 * hash) + INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getIntentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.IntentBatch parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.IntentBatch prototype) {
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
   * This message is a wrapper around a collection of intents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.IntentBatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.IntentBatch)
      com.google.cloud.dialogflow.v2beta1.IntentBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_IntentBatch_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_IntentBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.IntentBatch.class, com.google.cloud.dialogflow.v2beta1.IntentBatch.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.IntentBatch.newBuilder()
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
      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        intentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto.internal_static_google_cloud_dialogflow_v2beta1_IntentBatch_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.IntentBatch getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.IntentBatch.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.IntentBatch build() {
      com.google.cloud.dialogflow.v2beta1.IntentBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.IntentBatch buildPartial() {
      com.google.cloud.dialogflow.v2beta1.IntentBatch result = new com.google.cloud.dialogflow.v2beta1.IntentBatch(this);
      int from_bitField0_ = bitField0_;
      if (intentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          intents_ = java.util.Collections.unmodifiableList(intents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.intents_ = intents_;
      } else {
        result.intents_ = intentsBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.IntentBatch) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.IntentBatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.IntentBatch other) {
      if (other == com.google.cloud.dialogflow.v2beta1.IntentBatch.getDefaultInstance()) return this;
      if (intentsBuilder_ == null) {
        if (!other.intents_.isEmpty()) {
          if (intents_.isEmpty()) {
            intents_ = other.intents_;
            bitField0_ = (bitField0_ & ~0x00000001);
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
            bitField0_ = (bitField0_ & ~0x00000001);
            intentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIntentsFieldBuilder() : null;
          } else {
            intentsBuilder_.addAllMessages(other.intents_);
          }
        }
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
      com.google.cloud.dialogflow.v2beta1.IntentBatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.IntentBatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2beta1.Intent> intents_ =
      java.util.Collections.emptyList();
    private void ensureIntentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        intents_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.Intent>(intents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Intent, com.google.cloud.dialogflow.v2beta1.Intent.Builder, com.google.cloud.dialogflow.v2beta1.IntentOrBuilder> intentsBuilder_;

    /**
     * <pre>
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public Builder clearIntents() {
      if (intentsBuilder_ == null) {
        intents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        intentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder getIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder() {
      return getIntentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder addIntentsBuilder(
        int index) {
      return getIntentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of intents.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.Intent intents = 1;</code>
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
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        intents_ = null;
      }
      return intentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.IntentBatch)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.IntentBatch)
  private static final com.google.cloud.dialogflow.v2beta1.IntentBatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.IntentBatch();
  }

  public static com.google.cloud.dialogflow.v2beta1.IntentBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntentBatch>
      PARSER = new com.google.protobuf.AbstractParser<IntentBatch>() {
    public IntentBatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IntentBatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IntentBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntentBatch> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.IntentBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

