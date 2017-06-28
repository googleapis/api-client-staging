// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

/**
 * <pre>
 * A streaming speech recognition result corresponding to a portion of the audio
 * that is currently being processed.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1beta1.StreamingRecognitionResult}
 */
public  final class StreamingRecognitionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1beta1.StreamingRecognitionResult)
    StreamingRecognitionResultOrBuilder {
  // Use StreamingRecognitionResult.newBuilder() to construct.
  private StreamingRecognitionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingRecognitionResult() {
    alternatives_ = java.util.Collections.emptyList();
    isFinal_ = false;
    stability_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StreamingRecognitionResult(
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
              alternatives_ = new java.util.ArrayList<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative>();
              mutable_bitField0_ |= 0x00000001;
            }
            alternatives_.add(
                input.readMessage(com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.parser(), extensionRegistry));
            break;
          }
          case 16: {

            isFinal_ = input.readBool();
            break;
          }
          case 29: {

            stability_ = input.readFloat();
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
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1beta1.StreamingRecognitionResult.class, com.google.cloud.speech.v1beta1.StreamingRecognitionResult.Builder.class);
  }

  private int bitField0_;
  public static final int ALTERNATIVES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative> alternatives_;
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative> getAlternativesList() {
    return alternatives_;
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList() {
    return alternatives_;
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
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
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative getAlternatives(int index) {
    return alternatives_.get(index);
  }
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index) {
    return alternatives_.get(index);
  }

  public static final int IS_FINAL_FIELD_NUMBER = 2;
  private boolean isFinal_;
  /**
   * <pre>
   * *Output-only* If `false`, this `StreamingRecognitionResult` represents an
   * interim result that may change. If `true`, this is the final time the
   * speech service will return this particular `StreamingRecognitionResult`,
   * the recognizer will not return any further hypotheses for this portion of
   * the transcript and corresponding audio.
   * </pre>
   *
   * <code>bool is_final = 2;</code>
   */
  public boolean getIsFinal() {
    return isFinal_;
  }

  public static final int STABILITY_FIELD_NUMBER = 3;
  private float stability_;
  /**
   * <pre>
   * *Output-only* An estimate of the likelihood that the recognizer will not
   * change its guess about this interim result. Values range from 0.0
   * (completely unstable) to 1.0 (completely stable).
   * This field is only provided for interim results (`is_final=false`).
   * The default of 0.0 is a sentinel value indicating `stability` was not set.
   * </pre>
   *
   * <code>float stability = 3;</code>
   */
  public float getStability() {
    return stability_;
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
    if (isFinal_ != false) {
      output.writeBool(2, isFinal_);
    }
    if (stability_ != 0F) {
      output.writeFloat(3, stability_);
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
    if (isFinal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isFinal_);
    }
    if (stability_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, stability_);
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
    if (!(obj instanceof com.google.cloud.speech.v1beta1.StreamingRecognitionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1beta1.StreamingRecognitionResult other = (com.google.cloud.speech.v1beta1.StreamingRecognitionResult) obj;

    boolean result = true;
    result = result && getAlternativesList()
        .equals(other.getAlternativesList());
    result = result && (getIsFinal()
        == other.getIsFinal());
    result = result && (
        java.lang.Float.floatToIntBits(getStability())
        == java.lang.Float.floatToIntBits(
            other.getStability()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAlternativesCount() > 0) {
      hash = (37 * hash) + ALTERNATIVES_FIELD_NUMBER;
      hash = (53 * hash) + getAlternativesList().hashCode();
    }
    hash = (37 * hash) + IS_FINAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinal());
    hash = (37 * hash) + STABILITY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getStability());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1beta1.StreamingRecognitionResult prototype) {
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
   * A streaming speech recognition result corresponding to a portion of the audio
   * that is currently being processed.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1beta1.StreamingRecognitionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1beta1.StreamingRecognitionResult)
      com.google.cloud.speech.v1beta1.StreamingRecognitionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1beta1.StreamingRecognitionResult.class, com.google.cloud.speech.v1beta1.StreamingRecognitionResult.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1beta1.StreamingRecognitionResult.newBuilder()
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
      isFinal_ = false;

      stability_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionResult_descriptor;
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionResult getDefaultInstanceForType() {
      return com.google.cloud.speech.v1beta1.StreamingRecognitionResult.getDefaultInstance();
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionResult build() {
      com.google.cloud.speech.v1beta1.StreamingRecognitionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionResult buildPartial() {
      com.google.cloud.speech.v1beta1.StreamingRecognitionResult result = new com.google.cloud.speech.v1beta1.StreamingRecognitionResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (alternativesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          alternatives_ = java.util.Collections.unmodifiableList(alternatives_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alternatives_ = alternatives_;
      } else {
        result.alternatives_ = alternativesBuilder_.build();
      }
      result.isFinal_ = isFinal_;
      result.stability_ = stability_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.speech.v1beta1.StreamingRecognitionResult) {
        return mergeFrom((com.google.cloud.speech.v1beta1.StreamingRecognitionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1beta1.StreamingRecognitionResult other) {
      if (other == com.google.cloud.speech.v1beta1.StreamingRecognitionResult.getDefaultInstance()) return this;
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
      if (other.getIsFinal() != false) {
        setIsFinal(other.getIsFinal());
      }
      if (other.getStability() != 0F) {
        setStability(other.getStability());
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
      com.google.cloud.speech.v1beta1.StreamingRecognitionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1beta1.StreamingRecognitionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative> alternatives_ =
      java.util.Collections.emptyList();
    private void ensureAlternativesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        alternatives_ = new java.util.ArrayList<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative>(alternatives_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder> alternativesBuilder_;

    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative> getAlternativesList() {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative getAlternatives(int index) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative value) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative value) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative value) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAllAlternatives(
        java.lang.Iterable<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative> values) {
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder getAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder> 
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
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder addAlternativesBuilder() {
      return getAlternativesFieldBuilder().addBuilder(
          com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder addAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().addBuilder(
          index, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* May contain one or more recognition hypotheses (up to the
     * maximum specified in `max_alternatives`).
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder> 
         getAlternativesBuilderList() {
      return getAlternativesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder> 
        getAlternativesFieldBuilder() {
      if (alternativesBuilder_ == null) {
        alternativesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder>(
                alternatives_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        alternatives_ = null;
      }
      return alternativesBuilder_;
    }

    private boolean isFinal_ ;
    /**
     * <pre>
     * *Output-only* If `false`, this `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, this is the final time the
     * speech service will return this particular `StreamingRecognitionResult`,
     * the recognizer will not return any further hypotheses for this portion of
     * the transcript and corresponding audio.
     * </pre>
     *
     * <code>bool is_final = 2;</code>
     */
    public boolean getIsFinal() {
      return isFinal_;
    }
    /**
     * <pre>
     * *Output-only* If `false`, this `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, this is the final time the
     * speech service will return this particular `StreamingRecognitionResult`,
     * the recognizer will not return any further hypotheses for this portion of
     * the transcript and corresponding audio.
     * </pre>
     *
     * <code>bool is_final = 2;</code>
     */
    public Builder setIsFinal(boolean value) {
      
      isFinal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* If `false`, this `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, this is the final time the
     * speech service will return this particular `StreamingRecognitionResult`,
     * the recognizer will not return any further hypotheses for this portion of
     * the transcript and corresponding audio.
     * </pre>
     *
     * <code>bool is_final = 2;</code>
     */
    public Builder clearIsFinal() {
      
      isFinal_ = false;
      onChanged();
      return this;
    }

    private float stability_ ;
    /**
     * <pre>
     * *Output-only* An estimate of the likelihood that the recognizer will not
     * change its guess about this interim result. Values range from 0.0
     * (completely unstable) to 1.0 (completely stable).
     * This field is only provided for interim results (`is_final=false`).
     * The default of 0.0 is a sentinel value indicating `stability` was not set.
     * </pre>
     *
     * <code>float stability = 3;</code>
     */
    public float getStability() {
      return stability_;
    }
    /**
     * <pre>
     * *Output-only* An estimate of the likelihood that the recognizer will not
     * change its guess about this interim result. Values range from 0.0
     * (completely unstable) to 1.0 (completely stable).
     * This field is only provided for interim results (`is_final=false`).
     * The default of 0.0 is a sentinel value indicating `stability` was not set.
     * </pre>
     *
     * <code>float stability = 3;</code>
     */
    public Builder setStability(float value) {
      
      stability_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* An estimate of the likelihood that the recognizer will not
     * change its guess about this interim result. Values range from 0.0
     * (completely unstable) to 1.0 (completely stable).
     * This field is only provided for interim results (`is_final=false`).
     * The default of 0.0 is a sentinel value indicating `stability` was not set.
     * </pre>
     *
     * <code>float stability = 3;</code>
     */
    public Builder clearStability() {
      
      stability_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1beta1.StreamingRecognitionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1beta1.StreamingRecognitionResult)
  private static final com.google.cloud.speech.v1beta1.StreamingRecognitionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1beta1.StreamingRecognitionResult();
  }

  public static com.google.cloud.speech.v1beta1.StreamingRecognitionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognitionResult>
      PARSER = new com.google.protobuf.AbstractParser<StreamingRecognitionResult>() {
    public StreamingRecognitionResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StreamingRecognitionResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamingRecognitionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognitionResult> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1beta1.StreamingRecognitionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

