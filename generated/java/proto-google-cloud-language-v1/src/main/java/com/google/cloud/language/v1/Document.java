// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 * <pre>
 * ################################################################ #
 * Represents the input to API methods.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.Document}
 */
public  final class Document extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.Document)
    DocumentOrBuilder {
  // Use Document.newBuilder() to construct.
  private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Document() {
    type_ = 0;
    language_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Document(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            sourceCase_ = 2;
            source_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            sourceCase_ = 3;
            source_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
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
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Document_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Document_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.Document.class, com.google.cloud.language.v1.Document.Builder.class);
  }

  /**
   * <pre>
   * The document types enum.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.language.v1.Document.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The content type is not specified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Plain text
     * </pre>
     *
     * <code>PLAIN_TEXT = 1;</code>
     */
    PLAIN_TEXT(1),
    /**
     * <pre>
     * HTML
     * </pre>
     *
     * <code>HTML = 2;</code>
     */
    HTML(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The content type is not specified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Plain text
     * </pre>
     *
     * <code>PLAIN_TEXT = 1;</code>
     */
    public static final int PLAIN_TEXT_VALUE = 1;
    /**
     * <pre>
     * HTML
     * </pre>
     *
     * <code>HTML = 2;</code>
     */
    public static final int HTML_VALUE = 2;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TYPE_UNSPECIFIED;
        case 1: return PLAIN_TEXT;
        case 2: return HTML;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return com.google.cloud.language.v1.Document.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.language.v1.Document.Type)
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite {
    CONTENT(2),
    GCS_CONTENT_URI(3),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2: return CONTENT;
        case 3: return GCS_CONTENT_URI;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
   */
  public com.google.cloud.language.v1.Document.Type getType() {
    com.google.cloud.language.v1.Document.Type result = com.google.cloud.language.v1.Document.Type.valueOf(type_);
    return result == null ? com.google.cloud.language.v1.Document.Type.UNRECOGNIZED : result;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The content of the input in string format.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  public java.lang.String getContent() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 2) {
        source_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The content of the input in string format.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (sourceCase_ == 2) {
        source_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_CONTENT_URI_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   */
  public java.lang.String getGcsContentUri() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 3) {
        source_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGcsContentUriBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (sourceCase_ == 3) {
        source_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object language_;
  /**
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language Support](https://cloud.google.com/natural-language/docs/languages)
   * lists currently supported languages for each API method.
   * If the language (either specified by the caller or automatically detected)
   * is not supported by the called API method, an `INVALID_ARGUMENT` error
   * is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   */
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language Support](https://cloud.google.com/natural-language/docs/languages)
   * lists currently supported languages for each API method.
   * If the language (either specified by the caller or automatically detected)
   * is not supported by the called API method, an `INVALID_ARGUMENT` error
   * is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
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
    if (type_ != com.google.cloud.language.v1.Document.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (sourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    if (sourceCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, source_);
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, language_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.cloud.language.v1.Document.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, source_);
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, language_);
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
    if (!(obj instanceof com.google.cloud.language.v1.Document)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.Document other = (com.google.cloud.language.v1.Document) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getLanguage()
        .equals(other.getLanguage());
    result = result && getSourceCase().equals(
        other.getSourceCase());
    if (!result) return false;
    switch (sourceCase_) {
      case 2:
        result = result && getContent()
            .equals(other.getContent());
        break;
      case 3:
        result = result && getGcsContentUri()
            .equals(other.getGcsContentUri());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 3:
        hash = (37 * hash) + GCS_CONTENT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getGcsContentUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.Document parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Document parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Document parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Document parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Document parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Document parseFrom(
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
  public static Builder newBuilder(com.google.cloud.language.v1.Document prototype) {
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
   * ################################################################ #
   * Represents the input to API methods.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.Document}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.Document)
      com.google.cloud.language.v1.DocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Document_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.Document.class, com.google.cloud.language.v1.Document.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.Document.newBuilder()
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
      type_ = 0;

      language_ = "";

      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Document_descriptor;
    }

    public com.google.cloud.language.v1.Document getDefaultInstanceForType() {
      return com.google.cloud.language.v1.Document.getDefaultInstance();
    }

    public com.google.cloud.language.v1.Document build() {
      com.google.cloud.language.v1.Document result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1.Document buildPartial() {
      com.google.cloud.language.v1.Document result = new com.google.cloud.language.v1.Document(this);
      result.type_ = type_;
      if (sourceCase_ == 2) {
        result.source_ = source_;
      }
      if (sourceCase_ == 3) {
        result.source_ = source_;
      }
      result.language_ = language_;
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.language.v1.Document) {
        return mergeFrom((com.google.cloud.language.v1.Document)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.Document other) {
      if (other == com.google.cloud.language.v1.Document.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case CONTENT: {
          sourceCase_ = 2;
          source_ = other.source_;
          onChanged();
          break;
        }
        case GCS_CONTENT_URI: {
          sourceCase_ = 3;
          source_ = other.source_;
          onChanged();
          break;
        }
        case SOURCE_NOT_SET: {
          break;
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
      com.google.cloud.language.v1.Document parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1.Document) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private int type_ = 0;
    /**
     * <pre>
     * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
     * returns an `INVALID_ARGUMENT` error.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
     * returns an `INVALID_ARGUMENT` error.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
     * returns an `INVALID_ARGUMENT` error.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
     */
    public com.google.cloud.language.v1.Document.Type getType() {
      com.google.cloud.language.v1.Document.Type result = com.google.cloud.language.v1.Document.Type.valueOf(type_);
      return result == null ? com.google.cloud.language.v1.Document.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
     * returns an `INVALID_ARGUMENT` error.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
     */
    public Builder setType(com.google.cloud.language.v1.Document.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
     * returns an `INVALID_ARGUMENT` error.
     * </pre>
     *
     * <code>.google.cloud.language.v1.Document.Type type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The content of the input in string format.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 2) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The content of the input in string format.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (sourceCase_ == 2) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The content of the input in string format.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  sourceCase_ = 2;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The content of the input in string format.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder clearContent() {
      if (sourceCase_ == 2) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The content of the input in string format.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      sourceCase_ = 2;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The Google Cloud Storage URI where the file content is located.
     * This URI must be of the form: gs://bucket_name/object_name. For more
     * details, see https://cloud.google.com/storage/docs/reference-uris.
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_content_uri = 3;</code>
     */
    public java.lang.String getGcsContentUri() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 3) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Storage URI where the file content is located.
     * This URI must be of the form: gs://bucket_name/object_name. For more
     * details, see https://cloud.google.com/storage/docs/reference-uris.
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_content_uri = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGcsContentUriBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (sourceCase_ == 3) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Storage URI where the file content is located.
     * This URI must be of the form: gs://bucket_name/object_name. For more
     * details, see https://cloud.google.com/storage/docs/reference-uris.
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_content_uri = 3;</code>
     */
    public Builder setGcsContentUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Storage URI where the file content is located.
     * This URI must be of the form: gs://bucket_name/object_name. For more
     * details, see https://cloud.google.com/storage/docs/reference-uris.
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_content_uri = 3;</code>
     */
    public Builder clearGcsContentUri() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Storage URI where the file content is located.
     * This URI must be of the form: gs://bucket_name/object_name. For more
     * details, see https://cloud.google.com/storage/docs/reference-uris.
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_content_uri = 3;</code>
     */
    public Builder setGcsContentUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object language_ = "";
    /**
     * <pre>
     * The language of the document (if not specified, the language is
     * automatically detected). Both ISO and BCP-47 language codes are
     * accepted.&lt;br&gt;
     * [Language Support](https://cloud.google.com/natural-language/docs/languages)
     * lists currently supported languages for each API method.
     * If the language (either specified by the caller or automatically detected)
     * is not supported by the called API method, an `INVALID_ARGUMENT` error
     * is returned.
     * </pre>
     *
     * <code>string language = 4;</code>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The language of the document (if not specified, the language is
     * automatically detected). Both ISO and BCP-47 language codes are
     * accepted.&lt;br&gt;
     * [Language Support](https://cloud.google.com/natural-language/docs/languages)
     * lists currently supported languages for each API method.
     * If the language (either specified by the caller or automatically detected)
     * is not supported by the called API method, an `INVALID_ARGUMENT` error
     * is returned.
     * </pre>
     *
     * <code>string language = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The language of the document (if not specified, the language is
     * automatically detected). Both ISO and BCP-47 language codes are
     * accepted.&lt;br&gt;
     * [Language Support](https://cloud.google.com/natural-language/docs/languages)
     * lists currently supported languages for each API method.
     * If the language (either specified by the caller or automatically detected)
     * is not supported by the called API method, an `INVALID_ARGUMENT` error
     * is returned.
     * </pre>
     *
     * <code>string language = 4;</code>
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the document (if not specified, the language is
     * automatically detected). Both ISO and BCP-47 language codes are
     * accepted.&lt;br&gt;
     * [Language Support](https://cloud.google.com/natural-language/docs/languages)
     * lists currently supported languages for each API method.
     * If the language (either specified by the caller or automatically detected)
     * is not supported by the called API method, an `INVALID_ARGUMENT` error
     * is returned.
     * </pre>
     *
     * <code>string language = 4;</code>
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language of the document (if not specified, the language is
     * automatically detected). Both ISO and BCP-47 language codes are
     * accepted.&lt;br&gt;
     * [Language Support](https://cloud.google.com/natural-language/docs/languages)
     * lists currently supported languages for each API method.
     * If the language (either specified by the caller or automatically detected)
     * is not supported by the called API method, an `INVALID_ARGUMENT` error
     * is returned.
     * </pre>
     *
     * <code>string language = 4;</code>
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.Document)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.Document)
  private static final com.google.cloud.language.v1.Document DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.Document();
  }

  public static com.google.cloud.language.v1.Document getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Document>
      PARSER = new com.google.protobuf.AbstractParser<Document>() {
    public Document parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Document(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Document> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Document> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1.Document getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

