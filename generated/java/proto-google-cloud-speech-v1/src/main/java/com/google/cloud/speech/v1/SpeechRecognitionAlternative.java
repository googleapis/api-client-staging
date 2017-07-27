// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 * <pre>
 * Alternative hypotheses (a.k.a. n-best list).
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.SpeechRecognitionAlternative}
 */
public  final class SpeechRecognitionAlternative extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.SpeechRecognitionAlternative)
    SpeechRecognitionAlternativeOrBuilder {
  // Use SpeechRecognitionAlternative.newBuilder() to construct.
  private SpeechRecognitionAlternative(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechRecognitionAlternative() {
    transcript_ = "";
    confidence_ = 0F;
    words_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SpeechRecognitionAlternative(
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

            transcript_ = s;
            break;
          }
          case 21: {

            confidence_ = input.readFloat();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              words_ = new java.util.ArrayList<com.google.cloud.speech.v1.WordInfo>();
              mutable_bitField0_ |= 0x00000004;
            }
            words_.add(
                input.readMessage(com.google.cloud.speech.v1.WordInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        words_ = java.util.Collections.unmodifiableList(words_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.SpeechRecognitionAlternative.class, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSCRIPT_FIELD_NUMBER = 1;
  private volatile java.lang.Object transcript_;
  /**
   * <pre>
   * *Output-only* Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  public java.lang.String getTranscript() {
    java.lang.Object ref = transcript_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transcript_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * *Output-only* Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTranscriptBytes() {
    java.lang.Object ref = transcript_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transcript_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   * <pre>
   * *Output-only* The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is typically provided only for the top hypothesis, and
   * only for `is_final=true` results. Clients should not rely on the
   * `confidence` field as it is not guaranteed to be accurate or consistent.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  public float getConfidence() {
    return confidence_;
  }

  public static final int WORDS_FIELD_NUMBER = 3;
  private java.util.List<com.google.cloud.speech.v1.WordInfo> words_;
  /**
   * <pre>
   * *Output-only* A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
   */
  public java.util.List<com.google.cloud.speech.v1.WordInfo> getWordsList() {
    return words_;
  }
  /**
   * <pre>
   * *Output-only* A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
   */
  public java.util.List<? extends com.google.cloud.speech.v1.WordInfoOrBuilder> 
      getWordsOrBuilderList() {
    return words_;
  }
  /**
   * <pre>
   * *Output-only* A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
   */
  public int getWordsCount() {
    return words_.size();
  }
  /**
   * <pre>
   * *Output-only* A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
   */
  public com.google.cloud.speech.v1.WordInfo getWords(int index) {
    return words_.get(index);
  }
  /**
   * <pre>
   * *Output-only* A list of word-specific information for each recognized word.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
   */
  public com.google.cloud.speech.v1.WordInfoOrBuilder getWordsOrBuilder(
      int index) {
    return words_.get(index);
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
    if (!getTranscriptBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transcript_);
    }
    if (confidence_ != 0F) {
      output.writeFloat(2, confidence_);
    }
    for (int i = 0; i < words_.size(); i++) {
      output.writeMessage(3, words_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTranscriptBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transcript_);
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, confidence_);
    }
    for (int i = 0; i < words_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, words_.get(i));
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
    if (!(obj instanceof com.google.cloud.speech.v1.SpeechRecognitionAlternative)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.SpeechRecognitionAlternative other = (com.google.cloud.speech.v1.SpeechRecognitionAlternative) obj;

    boolean result = true;
    result = result && getTranscript()
        .equals(other.getTranscript());
    result = result && (
        java.lang.Float.floatToIntBits(getConfidence())
        == java.lang.Float.floatToIntBits(
            other.getConfidence()));
    result = result && getWordsList()
        .equals(other.getWordsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getTranscript().hashCode();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    if (getWordsCount() > 0) {
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1.SpeechRecognitionAlternative prototype) {
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
   * Alternative hypotheses (a.k.a. n-best list).
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.SpeechRecognitionAlternative}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.SpeechRecognitionAlternative)
      com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.SpeechRecognitionAlternative.class, com.google.cloud.speech.v1.SpeechRecognitionAlternative.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.SpeechRecognitionAlternative.newBuilder()
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
        getWordsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      transcript_ = "";

      confidence_ = 0F;

      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        wordsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
    }

    public com.google.cloud.speech.v1.SpeechRecognitionAlternative getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.SpeechRecognitionAlternative.getDefaultInstance();
    }

    public com.google.cloud.speech.v1.SpeechRecognitionAlternative build() {
      com.google.cloud.speech.v1.SpeechRecognitionAlternative result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1.SpeechRecognitionAlternative buildPartial() {
      com.google.cloud.speech.v1.SpeechRecognitionAlternative result = new com.google.cloud.speech.v1.SpeechRecognitionAlternative(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.transcript_ = transcript_;
      result.confidence_ = confidence_;
      if (wordsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          words_ = java.util.Collections.unmodifiableList(words_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.words_ = words_;
      } else {
        result.words_ = wordsBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1.SpeechRecognitionAlternative) {
        return mergeFrom((com.google.cloud.speech.v1.SpeechRecognitionAlternative)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.SpeechRecognitionAlternative other) {
      if (other == com.google.cloud.speech.v1.SpeechRecognitionAlternative.getDefaultInstance()) return this;
      if (!other.getTranscript().isEmpty()) {
        transcript_ = other.transcript_;
        onChanged();
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
      }
      if (wordsBuilder_ == null) {
        if (!other.words_.isEmpty()) {
          if (words_.isEmpty()) {
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureWordsIsMutable();
            words_.addAll(other.words_);
          }
          onChanged();
        }
      } else {
        if (!other.words_.isEmpty()) {
          if (wordsBuilder_.isEmpty()) {
            wordsBuilder_.dispose();
            wordsBuilder_ = null;
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000004);
            wordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWordsFieldBuilder() : null;
          } else {
            wordsBuilder_.addAllMessages(other.words_);
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
      com.google.cloud.speech.v1.SpeechRecognitionAlternative parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1.SpeechRecognitionAlternative) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object transcript_ = "";
    /**
     * <pre>
     * *Output-only* Transcript text representing the words that the user spoke.
     * </pre>
     *
     * <code>string transcript = 1;</code>
     */
    public java.lang.String getTranscript() {
      java.lang.Object ref = transcript_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transcript_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * *Output-only* Transcript text representing the words that the user spoke.
     * </pre>
     *
     * <code>string transcript = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTranscriptBytes() {
      java.lang.Object ref = transcript_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transcript_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * *Output-only* Transcript text representing the words that the user spoke.
     * </pre>
     *
     * <code>string transcript = 1;</code>
     */
    public Builder setTranscript(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transcript_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* Transcript text representing the words that the user spoke.
     * </pre>
     *
     * <code>string transcript = 1;</code>
     */
    public Builder clearTranscript() {
      
      transcript_ = getDefaultInstance().getTranscript();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* Transcript text representing the words that the user spoke.
     * </pre>
     *
     * <code>string transcript = 1;</code>
     */
    public Builder setTranscriptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transcript_ = value;
      onChanged();
      return this;
    }

    private float confidence_ ;
    /**
     * <pre>
     * *Output-only* The confidence estimate between 0.0 and 1.0. A higher number
     * indicates an estimated greater likelihood that the recognized words are
     * correct. This field is typically provided only for the top hypothesis, and
     * only for `is_final=true` results. Clients should not rely on the
     * `confidence` field as it is not guaranteed to be accurate or consistent.
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * *Output-only* The confidence estimate between 0.0 and 1.0. A higher number
     * indicates an estimated greater likelihood that the recognized words are
     * correct. This field is typically provided only for the top hypothesis, and
     * only for `is_final=true` results. Clients should not rely on the
     * `confidence` field as it is not guaranteed to be accurate or consistent.
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder setConfidence(float value) {
      
      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Output-only* The confidence estimate between 0.0 and 1.0. A higher number
     * indicates an estimated greater likelihood that the recognized words are
     * correct. This field is typically provided only for the top hypothesis, and
     * only for `is_final=true` results. Clients should not rely on the
     * `confidence` field as it is not guaranteed to be accurate or consistent.
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder clearConfidence() {
      
      confidence_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.speech.v1.WordInfo> words_ =
      java.util.Collections.emptyList();
    private void ensureWordsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        words_ = new java.util.ArrayList<com.google.cloud.speech.v1.WordInfo>(words_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1.WordInfo, com.google.cloud.speech.v1.WordInfo.Builder, com.google.cloud.speech.v1.WordInfoOrBuilder> wordsBuilder_;

    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public java.util.List<com.google.cloud.speech.v1.WordInfo> getWordsList() {
      if (wordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(words_);
      } else {
        return wordsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public int getWordsCount() {
      if (wordsBuilder_ == null) {
        return words_.size();
      } else {
        return wordsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public com.google.cloud.speech.v1.WordInfo getWords(int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);
      } else {
        return wordsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder setWords(
        int index, com.google.cloud.speech.v1.WordInfo value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.set(index, value);
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder setWords(
        int index, com.google.cloud.speech.v1.WordInfo.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.set(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder addWords(com.google.cloud.speech.v1.WordInfo value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder addWords(
        int index, com.google.cloud.speech.v1.WordInfo value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(index, value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder addWords(
        com.google.cloud.speech.v1.WordInfo.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder addWords(
        int index, com.google.cloud.speech.v1.WordInfo.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder addAllWords(
        java.lang.Iterable<? extends com.google.cloud.speech.v1.WordInfo> values) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, words_);
        onChanged();
      } else {
        wordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder clearWords() {
      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        wordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public Builder removeWords(int index) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.remove(index);
        onChanged();
      } else {
        wordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public com.google.cloud.speech.v1.WordInfo.Builder getWordsBuilder(
        int index) {
      return getWordsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public com.google.cloud.speech.v1.WordInfoOrBuilder getWordsOrBuilder(
        int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);  } else {
        return wordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v1.WordInfoOrBuilder> 
         getWordsOrBuilderList() {
      if (wordsBuilder_ != null) {
        return wordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(words_);
      }
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public com.google.cloud.speech.v1.WordInfo.Builder addWordsBuilder() {
      return getWordsFieldBuilder().addBuilder(
          com.google.cloud.speech.v1.WordInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public com.google.cloud.speech.v1.WordInfo.Builder addWordsBuilder(
        int index) {
      return getWordsFieldBuilder().addBuilder(
          index, com.google.cloud.speech.v1.WordInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* A list of word-specific information for each recognized word.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1.WordInfo words = 3;</code>
     */
    public java.util.List<com.google.cloud.speech.v1.WordInfo.Builder> 
         getWordsBuilderList() {
      return getWordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1.WordInfo, com.google.cloud.speech.v1.WordInfo.Builder, com.google.cloud.speech.v1.WordInfoOrBuilder> 
        getWordsFieldBuilder() {
      if (wordsBuilder_ == null) {
        wordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v1.WordInfo, com.google.cloud.speech.v1.WordInfo.Builder, com.google.cloud.speech.v1.WordInfoOrBuilder>(
                words_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        words_ = null;
      }
      return wordsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.SpeechRecognitionAlternative)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.SpeechRecognitionAlternative)
  private static final com.google.cloud.speech.v1.SpeechRecognitionAlternative DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.SpeechRecognitionAlternative();
  }

  public static com.google.cloud.speech.v1.SpeechRecognitionAlternative getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechRecognitionAlternative>
      PARSER = new com.google.protobuf.AbstractParser<SpeechRecognitionAlternative>() {
    public SpeechRecognitionAlternative parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpeechRecognitionAlternative(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpeechRecognitionAlternative> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechRecognitionAlternative> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1.SpeechRecognitionAlternative getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

