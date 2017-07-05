// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

/**
 * <pre>
 * Define a parameter's name and location. The parameter may be passed as either
 * an HTTP header or a URL query parameter, and if both are passed the behavior
 * is implementation-dependent.
 * </pre>
 *
 * Protobuf type {@code google.api.SystemParameter}
 */
public  final class SystemParameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.SystemParameter)
    SystemParameterOrBuilder {
  // Use SystemParameter.newBuilder() to construct.
  private SystemParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SystemParameter() {
    name_ = "";
    httpHeader_ = "";
    urlQueryParameter_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SystemParameter(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            httpHeader_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            urlQueryParameter_ = s;
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
    return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameter_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.SystemParameter.class, com.google.api.SystemParameter.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_HEADER_FIELD_NUMBER = 2;
  private volatile java.lang.Object httpHeader_;
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   */
  public java.lang.String getHttpHeader() {
    java.lang.Object ref = httpHeader_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      httpHeader_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHttpHeaderBytes() {
    java.lang.Object ref = httpHeader_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      httpHeader_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
  private volatile java.lang.Object urlQueryParameter_;
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   */
  public java.lang.String getUrlQueryParameter() {
    java.lang.Object ref = urlQueryParameter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      urlQueryParameter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUrlQueryParameterBytes() {
    java.lang.Object ref = urlQueryParameter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      urlQueryParameter_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getHttpHeaderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, httpHeader_);
    }
    if (!getUrlQueryParameterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, urlQueryParameter_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getHttpHeaderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, httpHeader_);
    }
    if (!getUrlQueryParameterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, urlQueryParameter_);
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
    if (!(obj instanceof com.google.api.SystemParameter)) {
      return super.equals(obj);
    }
    com.google.api.SystemParameter other = (com.google.api.SystemParameter) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getHttpHeader()
        .equals(other.getHttpHeader());
    result = result && getUrlQueryParameter()
        .equals(other.getUrlQueryParameter());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + HTTP_HEADER_FIELD_NUMBER;
    hash = (53 * hash) + getHttpHeader().hashCode();
    hash = (37 * hash) + URL_QUERY_PARAMETER_FIELD_NUMBER;
    hash = (53 * hash) + getUrlQueryParameter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.SystemParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.SystemParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.SystemParameter parseFrom(
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
  public static Builder newBuilder(com.google.api.SystemParameter prototype) {
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
   * Define a parameter's name and location. The parameter may be passed as either
   * an HTTP header or a URL query parameter, and if both are passed the behavior
   * is implementation-dependent.
   * </pre>
   *
   * Protobuf type {@code google.api.SystemParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.SystemParameter)
      com.google.api.SystemParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.SystemParameter.class, com.google.api.SystemParameter.Builder.class);
    }

    // Construct using com.google.api.SystemParameter.newBuilder()
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
      name_ = "";

      httpHeader_ = "";

      urlQueryParameter_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.SystemParameterProto.internal_static_google_api_SystemParameter_descriptor;
    }

    public com.google.api.SystemParameter getDefaultInstanceForType() {
      return com.google.api.SystemParameter.getDefaultInstance();
    }

    public com.google.api.SystemParameter build() {
      com.google.api.SystemParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.SystemParameter buildPartial() {
      com.google.api.SystemParameter result = new com.google.api.SystemParameter(this);
      result.name_ = name_;
      result.httpHeader_ = httpHeader_;
      result.urlQueryParameter_ = urlQueryParameter_;
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
      if (other instanceof com.google.api.SystemParameter) {
        return mergeFrom((com.google.api.SystemParameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.SystemParameter other) {
      if (other == com.google.api.SystemParameter.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getHttpHeader().isEmpty()) {
        httpHeader_ = other.httpHeader_;
        onChanged();
      }
      if (!other.getUrlQueryParameter().isEmpty()) {
        urlQueryParameter_ = other.urlQueryParameter_;
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
      com.google.api.SystemParameter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.SystemParameter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object httpHeader_ = "";
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     */
    public java.lang.String getHttpHeader() {
      java.lang.Object ref = httpHeader_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        httpHeader_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHttpHeaderBytes() {
      java.lang.Object ref = httpHeader_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        httpHeader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     */
    public Builder setHttpHeader(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      httpHeader_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     */
    public Builder clearHttpHeader() {
      
      httpHeader_ = getDefaultInstance().getHttpHeader();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     */
    public Builder setHttpHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      httpHeader_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object urlQueryParameter_ = "";
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     */
    public java.lang.String getUrlQueryParameter() {
      java.lang.Object ref = urlQueryParameter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        urlQueryParameter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUrlQueryParameterBytes() {
      java.lang.Object ref = urlQueryParameter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlQueryParameter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     */
    public Builder setUrlQueryParameter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      urlQueryParameter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     */
    public Builder clearUrlQueryParameter() {
      
      urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     */
    public Builder setUrlQueryParameterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      urlQueryParameter_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.SystemParameter)
  }

  // @@protoc_insertion_point(class_scope:google.api.SystemParameter)
  private static final com.google.api.SystemParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.SystemParameter();
  }

  public static com.google.api.SystemParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SystemParameter>
      PARSER = new com.google.protobuf.AbstractParser<SystemParameter>() {
    public SystemParameter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SystemParameter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SystemParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SystemParameter> getParserForType() {
    return PARSER;
  }

  public com.google.api.SystemParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

