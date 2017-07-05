// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

/**
 * <pre>
 * Represents the feeling associated with the entire text or entities in
 * the text.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1beta2.Sentiment}
 */
public  final class Sentiment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1beta2.Sentiment)
    SentimentOrBuilder {
  // Use Sentiment.newBuilder() to construct.
  private Sentiment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Sentiment() {
    magnitude_ = 0F;
    score_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Sentiment(
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
          case 21: {

            magnitude_ = input.readFloat();
            break;
          }
          case 29: {

            score_ = input.readFloat();
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
    return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentiment_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentiment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1beta2.Sentiment.class, com.google.cloud.language.v1beta2.Sentiment.Builder.class);
  }

  public static final int MAGNITUDE_FIELD_NUMBER = 2;
  private float magnitude_;
  /**
   * <pre>
   * A non-negative number in the [0, +inf) range, which represents
   * the absolute magnitude of sentiment regardless of score (positive or
   * negative).
   * </pre>
   *
   * <code>optional float magnitude = 2;</code>
   */
  public float getMagnitude() {
    return magnitude_;
  }

  public static final int SCORE_FIELD_NUMBER = 3;
  private float score_;
  /**
   * <pre>
   * Sentiment score between -1.0 (negative sentiment) and 1.0
   * (positive sentiment).
   * </pre>
   *
   * <code>optional float score = 3;</code>
   */
  public float getScore() {
    return score_;
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
    if (magnitude_ != 0F) {
      output.writeFloat(2, magnitude_);
    }
    if (score_ != 0F) {
      output.writeFloat(3, score_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (magnitude_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, magnitude_);
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, score_);
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
    if (!(obj instanceof com.google.cloud.language.v1beta2.Sentiment)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1beta2.Sentiment other = (com.google.cloud.language.v1beta2.Sentiment) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getMagnitude())
        == java.lang.Float.floatToIntBits(
            other.getMagnitude()));
    result = result && (
        java.lang.Float.floatToIntBits(getScore())
        == java.lang.Float.floatToIntBits(
            other.getScore()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MAGNITUDE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMagnitude());
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1beta2.Sentiment parseFrom(
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
  public static Builder newBuilder(com.google.cloud.language.v1beta2.Sentiment prototype) {
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
   * Represents the feeling associated with the entire text or entities in
   * the text.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1beta2.Sentiment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1beta2.Sentiment)
      com.google.cloud.language.v1beta2.SentimentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentiment_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentiment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1beta2.Sentiment.class, com.google.cloud.language.v1beta2.Sentiment.Builder.class);
    }

    // Construct using com.google.cloud.language.v1beta2.Sentiment.newBuilder()
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
      magnitude_ = 0F;

      score_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto.internal_static_google_cloud_language_v1beta2_Sentiment_descriptor;
    }

    public com.google.cloud.language.v1beta2.Sentiment getDefaultInstanceForType() {
      return com.google.cloud.language.v1beta2.Sentiment.getDefaultInstance();
    }

    public com.google.cloud.language.v1beta2.Sentiment build() {
      com.google.cloud.language.v1beta2.Sentiment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1beta2.Sentiment buildPartial() {
      com.google.cloud.language.v1beta2.Sentiment result = new com.google.cloud.language.v1beta2.Sentiment(this);
      result.magnitude_ = magnitude_;
      result.score_ = score_;
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
      if (other instanceof com.google.cloud.language.v1beta2.Sentiment) {
        return mergeFrom((com.google.cloud.language.v1beta2.Sentiment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1beta2.Sentiment other) {
      if (other == com.google.cloud.language.v1beta2.Sentiment.getDefaultInstance()) return this;
      if (other.getMagnitude() != 0F) {
        setMagnitude(other.getMagnitude());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
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
      com.google.cloud.language.v1beta2.Sentiment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1beta2.Sentiment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float magnitude_ ;
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     * </pre>
     *
     * <code>optional float magnitude = 2;</code>
     */
    public float getMagnitude() {
      return magnitude_;
    }
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     * </pre>
     *
     * <code>optional float magnitude = 2;</code>
     */
    public Builder setMagnitude(float value) {
      
      magnitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     * </pre>
     *
     * <code>optional float magnitude = 2;</code>
     */
    public Builder clearMagnitude() {
      
      magnitude_ = 0F;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     * </pre>
     *
     * <code>optional float score = 3;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     * </pre>
     *
     * <code>optional float score = 3;</code>
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     * </pre>
     *
     * <code>optional float score = 3;</code>
     */
    public Builder clearScore() {
      
      score_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1beta2.Sentiment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1beta2.Sentiment)
  private static final com.google.cloud.language.v1beta2.Sentiment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1beta2.Sentiment();
  }

  public static com.google.cloud.language.v1beta2.Sentiment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sentiment>
      PARSER = new com.google.protobuf.AbstractParser<Sentiment>() {
    public Sentiment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Sentiment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Sentiment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sentiment> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1beta2.Sentiment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

