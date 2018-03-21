// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

/**
 * <pre>
 * Alternative hypotheses (a.k.a. n-best list).
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1beta1.SpeechRecognitionAlternative}
 */
public  final class SpeechRecognitionAlternative extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1beta1.SpeechRecognitionAlternative)
    SpeechRecognitionAlternativeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeechRecognitionAlternative.newBuilder() to construct.
  private SpeechRecognitionAlternative(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechRecognitionAlternative() {
    transcript_ = "";
    confidence_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpeechRecognitionAlternative(
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

            transcript_ = s;
            break;
          }
          case 21: {

            confidence_ = input.readFloat();
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
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechRecognitionAlternative_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechRecognitionAlternative_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.class, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder.class);
  }

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
   * `confidence` field as it is not guaranteed to be accurate, or even set, in
   * any of the results.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  public float getConfidence() {
    return confidence_;
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
    unknownFields.writeTo(output);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative other = (com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative) obj;

    boolean result = true;
    result = result && getTranscript()
        .equals(other.getTranscript());
    result = result && (
        java.lang.Float.floatToIntBits(getConfidence())
        == java.lang.Float.floatToIntBits(
            other.getConfidence()));
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
    hash = (37 * hash) + TRANSCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getTranscript().hashCode();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative prototype) {
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
   * Protobuf type {@code google.cloud.speech.v1beta1.SpeechRecognitionAlternative}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1beta1.SpeechRecognitionAlternative)
      com.google.cloud.speech.v1beta1.SpeechRecognitionAlternativeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechRecognitionAlternative_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechRecognitionAlternative_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.class, com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.newBuilder()
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
      transcript_ = "";

      confidence_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SpeechRecognitionAlternative_descriptor;
    }

    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative getDefaultInstanceForType() {
      return com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.getDefaultInstance();
    }

    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative build() {
      com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative buildPartial() {
      com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative result = new com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative(this);
      result.transcript_ = transcript_;
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative) {
        return mergeFrom((com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative other) {
      if (other == com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative.getDefaultInstance()) return this;
      if (!other.getTranscript().isEmpty()) {
        transcript_ = other.transcript_;
        onChanged();
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
      com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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
     * `confidence` field as it is not guaranteed to be accurate, or even set, in
     * any of the results.
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
     * `confidence` field as it is not guaranteed to be accurate, or even set, in
     * any of the results.
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
     * `confidence` field as it is not guaranteed to be accurate, or even set, in
     * any of the results.
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1beta1.SpeechRecognitionAlternative)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1beta1.SpeechRecognitionAlternative)
  private static final com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative();
  }

  public static com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative getDefaultInstance() {
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

  public com.google.cloud.speech.v1beta1.SpeechRecognitionAlternative getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

