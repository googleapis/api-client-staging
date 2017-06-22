// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/experimental/authorization_config.proto

package com.google.api;

/**
 * <pre>
 * Configuration of authorization.
 * This section determines the authorization provider, if unspecified, then no
 * authorization check will be done.
 * Example:
 *     experimental:
 *       authorization:
 *         provider: firebaserules.googleapis.com
 * </pre>
 *
 * Protobuf type {@code google.api.AuthorizationConfig}
 */
public  final class AuthorizationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.AuthorizationConfig)
    AuthorizationConfigOrBuilder {
  // Use AuthorizationConfig.newBuilder() to construct.
  private AuthorizationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizationConfig() {
    provider_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AuthorizationConfig(
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

            provider_ = s;
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
    return com.google.api.AuthorizationConfigProto.internal_static_google_api_AuthorizationConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthorizationConfigProto.internal_static_google_api_AuthorizationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.AuthorizationConfig.class, com.google.api.AuthorizationConfig.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private volatile java.lang.Object provider_;
  /**
   * <pre>
   * The name of the authorization provider, such as
   * firebaserules.googleapis.com.
   * </pre>
   *
   * <code>string provider = 1;</code>
   */
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the authorization provider, such as
   * firebaserules.googleapis.com.
   * </pre>
   *
   * <code>string provider = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
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
    if (!getProviderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, provider_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProviderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, provider_);
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
    if (!(obj instanceof com.google.api.AuthorizationConfig)) {
      return super.equals(obj);
    }
    com.google.api.AuthorizationConfig other = (com.google.api.AuthorizationConfig) obj;

    boolean result = true;
    result = result && getProvider()
        .equals(other.getProvider());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.AuthorizationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.AuthorizationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.AuthorizationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.AuthorizationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.AuthorizationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.AuthorizationConfig parseFrom(
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
  public static Builder newBuilder(com.google.api.AuthorizationConfig prototype) {
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
   * Configuration of authorization.
   * This section determines the authorization provider, if unspecified, then no
   * authorization check will be done.
   * Example:
   *     experimental:
   *       authorization:
   *         provider: firebaserules.googleapis.com
   * </pre>
   *
   * Protobuf type {@code google.api.AuthorizationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthorizationConfig)
      com.google.api.AuthorizationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.AuthorizationConfigProto.internal_static_google_api_AuthorizationConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthorizationConfigProto.internal_static_google_api_AuthorizationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.AuthorizationConfig.class, com.google.api.AuthorizationConfig.Builder.class);
    }

    // Construct using com.google.api.AuthorizationConfig.newBuilder()
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
      provider_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.AuthorizationConfigProto.internal_static_google_api_AuthorizationConfig_descriptor;
    }

    public com.google.api.AuthorizationConfig getDefaultInstanceForType() {
      return com.google.api.AuthorizationConfig.getDefaultInstance();
    }

    public com.google.api.AuthorizationConfig build() {
      com.google.api.AuthorizationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.AuthorizationConfig buildPartial() {
      com.google.api.AuthorizationConfig result = new com.google.api.AuthorizationConfig(this);
      result.provider_ = provider_;
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
      if (other instanceof com.google.api.AuthorizationConfig) {
        return mergeFrom((com.google.api.AuthorizationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.AuthorizationConfig other) {
      if (other == com.google.api.AuthorizationConfig.getDefaultInstance()) return this;
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        onChanged();
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
      com.google.api.AuthorizationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.AuthorizationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object provider_ = "";
    /**
     * <pre>
     * The name of the authorization provider, such as
     * firebaserules.googleapis.com.
     * </pre>
     *
     * <code>string provider = 1;</code>
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the authorization provider, such as
     * firebaserules.googleapis.com.
     * </pre>
     *
     * <code>string provider = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the authorization provider, such as
     * firebaserules.googleapis.com.
     * </pre>
     *
     * <code>string provider = 1;</code>
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the authorization provider, such as
     * firebaserules.googleapis.com.
     * </pre>
     *
     * <code>string provider = 1;</code>
     */
    public Builder clearProvider() {
      
      provider_ = getDefaultInstance().getProvider();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the authorization provider, such as
     * firebaserules.googleapis.com.
     * </pre>
     *
     * <code>string provider = 1;</code>
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      provider_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.AuthorizationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.api.AuthorizationConfig)
  private static final com.google.api.AuthorizationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.AuthorizationConfig();
  }

  public static com.google.api.AuthorizationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizationConfig>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizationConfig>() {
    public AuthorizationConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthorizationConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthorizationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizationConfig> getParserForType() {
    return PARSER;
  }

  public com.google.api.AuthorizationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

