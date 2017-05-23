// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 * <pre>
 * A speech recognition result corresponding to a portion of the audio.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.SpeechRecognitionResult}
 */
public  final class SpeechRecognitionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.SpeechRecognitionResult)
    SpeechRecognitionResultOrBuilder {
  // Use SpeechRecognitionResult.newBuilder() to construct.
  private SpeechRecognitionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechRecognitionResult() {
    alternatives_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SpeechRecognitionResult(
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
              alternatives_ = new java.util.ArrayList<com.google.cloud.speech.v1.SpeechRecognitionAlternative>();
              mutable_bitField0_ |= 0x00000001;
            }
            alternatives_.add(
                input.readMessage(com.google.cloud.speech.v1.SpeechRecognitionAlternative.parser(), extensionRegistry));
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
        alternatives_ = java.util.Collections.unmodifiableList(alternatives_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.SpeechRecognitionResult.class, com.google.cloud.speech.v1.SpeechRecognitionResult.Builder.class);
  }

  public static final int ALTERNATIVES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> alternatives_;
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> getAlternativesList() {
    return alternatives_;
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList() {
    return alternatives_;
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public int getAlternativesCount() {
    return alternatives_.size();
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public com.google.cloud.speech.v1.SpeechRecognitionAlternative getAlternatives(int index) {
    return alternatives_.get(index);
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index) {
    return alternatives_.get(index);
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
    for (int i = 0; i < alternatives_.size(); i++) {
      output.writeMessage(1, alternatives_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < alternatives_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, alternatives_.get(i));
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
    if (!(obj instanceof com.google.cloud.speech.v1.SpeechRecognitionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.SpeechRecognitionResult other = (com.google.cloud.speech.v1.SpeechRecognitionResult) obj;

    boolean result = true;
    result = result && getAlternativesList()
        .equals(other.getAlternativesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getAlternativesCount() > 0) {
      hash = (37 * hash) + ALTERNATIVES_FIELD_NUMBER;
      hash = (53 * hash) + getAlternativesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1.SpeechRecognitionResult prototype) {
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
   * A speech recognition result corresponding to a portion of the audio.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.SpeechRecognitionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.SpeechRecognitionResult)
      com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.SpeechRecognitionResult.class, com.google.cloud.speech.v1.SpeechRecognitionResult.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.SpeechRecognitionResult.newBuilder()
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
        getAlternativesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (alternativesBuilder_ == null) {
        alternatives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        alternativesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
    }

    public com.google.cloud.speech.v1.SpeechRecognitionResult getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.SpeechRecognitionResult.getDefaultInstance();
    }

    public com.google.cloud.speech.v1.SpeechRecognitionResult build() {
      com.google.cloud.speech.v1.SpeechRecognitionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1.SpeechRecognitionResult buildPartial() {
      com.google.cloud.speech.v1.SpeechRecognitionResult result = new com.google.cloud.speech.v1.SpeechRecognitionResult(this);
      int from_bitField0_ = bitField0_;
      if (alternativesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          alternatives_ = java.util.Collections.unmodifiableList(alternatives_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alternatives_ = alternatives_;
      } else {
        result.alternatives_ = alternativesBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1.SpeechRecognitionResult) {
        return mergeFrom((com.google.cloud.speech.v1.SpeechRecognitionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.SpeechRecognitionResult other) {
      if (other == com.google.cloud.speech.v1.SpeechRecognitionResult.getDefaultInstance()) return this;
      if (alternativesBuilder_ == null) {
        if (!other.alternatives_.isEmpty()) {
          if (alternatives_.isEmpty()) {
            alternatives_ = other.alternatives_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlternativesIsMutable();
            alternatives_.addAll(other.alternatives_);
          }
          onChanged();
        }
      } else {
        if (!other.alternatives_.isEmpty()) {
          if (alternativesBuilder_.isEmpty()) {
            alternativesBuilder_.dispose();
            alternativesBuilder_ = null;
            alternatives_ = other.alternatives_;
            bitField0_ = (bitField0_ & ~0x00000001);
            alternativesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlternativesFieldBuilder() : null;
          } else {
            alternativesBuilder_.addAllMessages(other.alternatives_);
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
      com.google.cloud.speech.v1.SpeechRecognitionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1.SpeechRecognitionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> alternatives_ =
      java.util.Collections.emptyList();
    private void ensureAlternativesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        alternatives_ = new java.util.ArrayList<com.google.cloud.speech.v1.SpeechRecognitionAlternative>(alternatives_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1.SpeechRecognitionAlternative, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> alternativesBuilder_;

    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> getAlternativesList() {
      if (alternativesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alternatives_);
      } else {
        return alternativesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public int getAlternativesCount() {
      if (alternativesBuilder_ == null) {
        return alternatives_.size();
      } else {
        return alternativesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1.SpeechRecognitionAlternative getAlternatives(int index) {
      if (alternativesBuilder_ == null) {
        return alternatives_.get(index);
      } else {
        return alternativesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.speech.v1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.set(index, value);
        onChanged();
      } else {
        alternativesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.set(index, builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(com.google.cloud.speech.v1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.add(value);
        onChanged();
      } else {
        alternativesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.speech.v1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.add(index, value);
        onChanged();
      } else {
        alternativesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.add(builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.add(index, builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAllAlternatives(
        java.lang.Iterable<? extends com.google.cloud.speech.v1.SpeechRecognitionAlternative> values) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alternatives_);
        onChanged();
      } else {
        alternativesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder clearAlternatives() {
      if (alternativesBuilder_ == null) {
        alternatives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        alternativesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder removeAlternatives(int index) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.remove(index);
        onChanged();
      } else {
        alternativesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder getAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
        int index) {
      if (alternativesBuilder_ == null) {
        return alternatives_.get(index);  } else {
        return alternativesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> 
         getAlternativesOrBuilderList() {
      if (alternativesBuilder_ != null) {
        return alternativesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alternatives_);
      }
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder addAlternativesBuilder() {
      return getAlternativesFieldBuilder().addBuilder(
          com.google.cloud.speech.v1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder addAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().addBuilder(
          index, com.google.cloud.speech.v1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder> 
         getAlternativesBuilderList() {
      return getAlternativesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1.SpeechRecognitionAlternative, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> 
        getAlternativesFieldBuilder() {
      if (alternativesBuilder_ == null) {
        alternativesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v1.SpeechRecognitionAlternative, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder>(
                alternatives_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        alternatives_ = null;
      }
      return alternativesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.SpeechRecognitionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.SpeechRecognitionResult)
  private static final com.google.cloud.speech.v1.SpeechRecognitionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.SpeechRecognitionResult();
  }

  public static com.google.cloud.speech.v1.SpeechRecognitionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechRecognitionResult>
      PARSER = new com.google.protobuf.AbstractParser<SpeechRecognitionResult>() {
    public SpeechRecognitionResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpeechRecognitionResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpeechRecognitionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechRecognitionResult> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1.SpeechRecognitionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

