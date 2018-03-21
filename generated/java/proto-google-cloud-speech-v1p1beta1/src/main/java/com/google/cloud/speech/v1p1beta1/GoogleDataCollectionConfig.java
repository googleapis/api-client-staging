// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

/**
 * <pre>
 * Google data collection opt-in settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig}
 */
public  final class GoogleDataCollectionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)
    GoogleDataCollectionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleDataCollectionConfig.newBuilder() to construct.
  private GoogleDataCollectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleDataCollectionConfig() {
    loggingConsentState_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoogleDataCollectionConfig(
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
          case 8: {
            int rawValue = input.readEnum();

            loggingConsentState_ = rawValue;
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
    return com.google.cloud.speech.v1p1beta1.SpeechProto.internal_static_google_cloud_speech_v1p1beta1_GoogleDataCollectionConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1p1beta1.SpeechProto.internal_static_google_cloud_speech_v1p1beta1_GoogleDataCollectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.class, com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.Builder.class);
  }

  /**
   * <pre>
   * Speech content will not be logged until authorized consent is opted in.
   * Once it is opted in, this flag enables/disables logging to override that
   * consent.  default = ENABLED (logging due to consent).
   * </pre>
   *
   * Protobuf enum {@code google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState}
   */
  public enum LoggingConsentState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENABLED = 0;</code>
     */
    ENABLED(0),
    /**
     * <code>DISABLED = 1;</code>
     */
    DISABLED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENABLED = 0;</code>
     */
    public static final int ENABLED_VALUE = 0;
    /**
     * <code>DISABLED = 1;</code>
     */
    public static final int DISABLED_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoggingConsentState valueOf(int value) {
      return forNumber(value);
    }

    public static LoggingConsentState forNumber(int value) {
      switch (value) {
        case 0: return ENABLED;
        case 1: return DISABLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LoggingConsentState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LoggingConsentState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LoggingConsentState>() {
            public LoggingConsentState findValueByNumber(int number) {
              return LoggingConsentState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final LoggingConsentState[] VALUES = values();

    public static LoggingConsentState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LoggingConsentState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState)
  }

  public static final int LOGGING_CONSENT_STATE_FIELD_NUMBER = 1;
  private int loggingConsentState_;
  /**
   * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
   */
  public int getLoggingConsentStateValue() {
    return loggingConsentState_;
  }
  /**
   * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
   */
  public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState getLoggingConsentState() {
    com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState result = com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.valueOf(loggingConsentState_);
    return result == null ? com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.UNRECOGNIZED : result;
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
    if (loggingConsentState_ != com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.ENABLED.getNumber()) {
      output.writeEnum(1, loggingConsentState_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loggingConsentState_ != com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.ENABLED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, loggingConsentState_);
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
    if (!(obj instanceof com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig other = (com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig) obj;

    boolean result = true;
    result = result && loggingConsentState_ == other.loggingConsentState_;
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
    hash = (37 * hash) + LOGGING_CONSENT_STATE_FIELD_NUMBER;
    hash = (53 * hash) + loggingConsentState_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig prototype) {
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
   * Google data collection opt-in settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)
      com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto.internal_static_google_cloud_speech_v1p1beta1_GoogleDataCollectionConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto.internal_static_google_cloud_speech_v1p1beta1_GoogleDataCollectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.class, com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.newBuilder()
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
      loggingConsentState_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1p1beta1.SpeechProto.internal_static_google_cloud_speech_v1p1beta1_GoogleDataCollectionConfig_descriptor;
    }

    public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.getDefaultInstance();
    }

    public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig build() {
      com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig buildPartial() {
      com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig result = new com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig(this);
      result.loggingConsentState_ = loggingConsentState_;
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
      if (other instanceof com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig) {
        return mergeFrom((com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig other) {
      if (other == com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.getDefaultInstance()) return this;
      if (other.loggingConsentState_ != 0) {
        setLoggingConsentStateValue(other.getLoggingConsentStateValue());
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
      com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int loggingConsentState_ = 0;
    /**
     * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
     */
    public int getLoggingConsentStateValue() {
      return loggingConsentState_;
    }
    /**
     * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
     */
    public Builder setLoggingConsentStateValue(int value) {
      loggingConsentState_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
     */
    public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState getLoggingConsentState() {
      com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState result = com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.valueOf(loggingConsentState_);
      return result == null ? com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState.UNRECOGNIZED : result;
    }
    /**
     * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
     */
    public Builder setLoggingConsentState(com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      loggingConsentState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig.LoggingConsentState logging_consent_state = 1;</code>
     */
    public Builder clearLoggingConsentState() {
      
      loggingConsentState_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig)
  private static final com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig();
  }

  public static com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleDataCollectionConfig>
      PARSER = new com.google.protobuf.AbstractParser<GoogleDataCollectionConfig>() {
    public GoogleDataCollectionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoogleDataCollectionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoogleDataCollectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleDataCollectionConfig> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1p1beta1.GoogleDataCollectionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
