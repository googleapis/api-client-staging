// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 * <pre>
 * HTTP request data that is related to a reported error.
 * This data should be provided by the application when reporting an error,
 * unless the
 * error report has been generated automatically from Google App Engine logs.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.HttpRequestContext}
 */
public  final class HttpRequestContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)
    HttpRequestContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpRequestContext.newBuilder() to construct.
  private HttpRequestContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpRequestContext() {
    method_ = "";
    url_ = "";
    userAgent_ = "";
    referrer_ = "";
    responseStatusCode_ = 0;
    remoteIp_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HttpRequestContext(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            method_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userAgent_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            referrer_ = s;
            break;
          }
          case 40: {

            responseStatusCode_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            remoteIp_ = s;
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
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.class, com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  private volatile java.lang.Object method_;
  /**
   * <pre>
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * </pre>
   *
   * <code>string method = 1;</code>
   */
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * </pre>
   *
   * <code>string method = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object url_;
  /**
   * <pre>
   * The URL of the request.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URL of the request.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_AGENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object userAgent_;
  /**
   * <pre>
   * The user agent information that is provided with the request.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   */
  public java.lang.String getUserAgent() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAgent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user agent information that is provided with the request.
   * </pre>
   *
   * <code>string user_agent = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserAgentBytes() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userAgent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERRER_FIELD_NUMBER = 4;
  private volatile java.lang.Object referrer_;
  /**
   * <pre>
   * The referrer information that is provided with the request.
   * </pre>
   *
   * <code>string referrer = 4;</code>
   */
  public java.lang.String getReferrer() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referrer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The referrer information that is provided with the request.
   * </pre>
   *
   * <code>string referrer = 4;</code>
   */
  public com.google.protobuf.ByteString
      getReferrerBytes() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referrer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_STATUS_CODE_FIELD_NUMBER = 5;
  private int responseStatusCode_;
  /**
   * <pre>
   * The HTTP response status code for the request.
   * </pre>
   *
   * <code>int32 response_status_code = 5;</code>
   */
  public int getResponseStatusCode() {
    return responseStatusCode_;
  }

  public static final int REMOTE_IP_FIELD_NUMBER = 6;
  private volatile java.lang.Object remoteIp_;
  /**
   * <pre>
   * The IP address from which the request originated.
   * This can be IPv4, IPv6, or a token which is derived from the
   * IP address, depending on the data that has been provided
   * in the error report.
   * </pre>
   *
   * <code>string remote_ip = 6;</code>
   */
  public java.lang.String getRemoteIp() {
    java.lang.Object ref = remoteIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remoteIp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP address from which the request originated.
   * This can be IPv4, IPv6, or a token which is derived from the
   * IP address, depending on the data that has been provided
   * in the error report.
   * </pre>
   *
   * <code>string remote_ip = 6;</code>
   */
  public com.google.protobuf.ByteString
      getRemoteIpBytes() {
    java.lang.Object ref = remoteIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remoteIp_ = b;
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
    if (!getMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
    }
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, url_);
    }
    if (!getUserAgentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userAgent_);
    }
    if (!getReferrerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, referrer_);
    }
    if (responseStatusCode_ != 0) {
      output.writeInt32(5, responseStatusCode_);
    }
    if (!getRemoteIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, remoteIp_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
    }
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, url_);
    }
    if (!getUserAgentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userAgent_);
    }
    if (!getReferrerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, referrer_);
    }
    if (responseStatusCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, responseStatusCode_);
    }
    if (!getRemoteIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, remoteIp_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext other = (com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext) obj;

    boolean result = true;
    result = result && getMethod()
        .equals(other.getMethod());
    result = result && getUrl()
        .equals(other.getUrl());
    result = result && getUserAgent()
        .equals(other.getUserAgent());
    result = result && getReferrer()
        .equals(other.getReferrer());
    result = result && (getResponseStatusCode()
        == other.getResponseStatusCode());
    result = result && getRemoteIp()
        .equals(other.getRemoteIp());
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
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserAgent().hashCode();
    hash = (37 * hash) + REFERRER_FIELD_NUMBER;
    hash = (53 * hash) + getReferrer().hashCode();
    hash = (37 * hash) + RESPONSE_STATUS_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseStatusCode();
    hash = (37 * hash) + REMOTE_IP_FIELD_NUMBER;
    hash = (53 * hash) + getRemoteIp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext prototype) {
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
   * HTTP request data that is related to a reported error.
   * This data should be provided by the application when reporting an error,
   * unless the
   * error report has been generated automatically from Google App Engine logs.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.HttpRequestContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)
      com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.class, com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.newBuilder()
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
      method_ = "";

      url_ = "";

      userAgent_ = "";

      referrer_ = "";

      responseStatusCode_ = 0;

      remoteIp_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.internal_static_google_devtools_clouderrorreporting_v1beta1_HttpRequestContext_descriptor;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.getDefaultInstance();
    }

    public com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext build() {
      com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext result = new com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext(this);
      result.method_ = method_;
      result.url_ = url_;
      result.userAgent_ = userAgent_;
      result.referrer_ = referrer_;
      result.responseStatusCode_ = responseStatusCode_;
      result.remoteIp_ = remoteIp_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext other) {
      if (other == com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext.getDefaultInstance()) return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getUserAgent().isEmpty()) {
        userAgent_ = other.userAgent_;
        onChanged();
      }
      if (!other.getReferrer().isEmpty()) {
        referrer_ = other.referrer_;
        onChanged();
      }
      if (other.getResponseStatusCode() != 0) {
        setResponseStatusCode(other.getResponseStatusCode());
      }
      if (!other.getRemoteIp().isEmpty()) {
        remoteIp_ = other.remoteIp_;
        onChanged();
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
      com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object method_ = "";
    /**
     * <pre>
     * The type of HTTP request, such as `GET`, `POST`, etc.
     * </pre>
     *
     * <code>string method = 1;</code>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of HTTP request, such as `GET`, `POST`, etc.
     * </pre>
     *
     * <code>string method = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of HTTP request, such as `GET`, `POST`, etc.
     * </pre>
     *
     * <code>string method = 1;</code>
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of HTTP request, such as `GET`, `POST`, etc.
     * </pre>
     *
     * <code>string method = 1;</code>
     */
    public Builder clearMethod() {
      
      method_ = getDefaultInstance().getMethod();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of HTTP request, such as `GET`, `POST`, etc.
     * </pre>
     *
     * <code>string method = 1;</code>
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      method_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The URL of the request.
     * </pre>
     *
     * <code>string url = 2;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL of the request.
     * </pre>
     *
     * <code>string url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL of the request.
     * </pre>
     *
     * <code>string url = 2;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the request.
     * </pre>
     *
     * <code>string url = 2;</code>
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL of the request.
     * </pre>
     *
     * <code>string url = 2;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userAgent_ = "";
    /**
     * <pre>
     * The user agent information that is provided with the request.
     * </pre>
     *
     * <code>string user_agent = 3;</code>
     */
    public java.lang.String getUserAgent() {
      java.lang.Object ref = userAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user agent information that is provided with the request.
     * </pre>
     *
     * <code>string user_agent = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserAgentBytes() {
      java.lang.Object ref = userAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user agent information that is provided with the request.
     * </pre>
     *
     * <code>string user_agent = 3;</code>
     */
    public Builder setUserAgent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userAgent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent information that is provided with the request.
     * </pre>
     *
     * <code>string user_agent = 3;</code>
     */
    public Builder clearUserAgent() {
      
      userAgent_ = getDefaultInstance().getUserAgent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent information that is provided with the request.
     * </pre>
     *
     * <code>string user_agent = 3;</code>
     */
    public Builder setUserAgentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userAgent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object referrer_ = "";
    /**
     * <pre>
     * The referrer information that is provided with the request.
     * </pre>
     *
     * <code>string referrer = 4;</code>
     */
    public java.lang.String getReferrer() {
      java.lang.Object ref = referrer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referrer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The referrer information that is provided with the request.
     * </pre>
     *
     * <code>string referrer = 4;</code>
     */
    public com.google.protobuf.ByteString
        getReferrerBytes() {
      java.lang.Object ref = referrer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referrer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The referrer information that is provided with the request.
     * </pre>
     *
     * <code>string referrer = 4;</code>
     */
    public Builder setReferrer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referrer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The referrer information that is provided with the request.
     * </pre>
     *
     * <code>string referrer = 4;</code>
     */
    public Builder clearReferrer() {
      
      referrer_ = getDefaultInstance().getReferrer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The referrer information that is provided with the request.
     * </pre>
     *
     * <code>string referrer = 4;</code>
     */
    public Builder setReferrerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referrer_ = value;
      onChanged();
      return this;
    }

    private int responseStatusCode_ ;
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 5;</code>
     */
    public int getResponseStatusCode() {
      return responseStatusCode_;
    }
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 5;</code>
     */
    public Builder setResponseStatusCode(int value) {
      
      responseStatusCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The HTTP response status code for the request.
     * </pre>
     *
     * <code>int32 response_status_code = 5;</code>
     */
    public Builder clearResponseStatusCode() {
      
      responseStatusCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object remoteIp_ = "";
    /**
     * <pre>
     * The IP address from which the request originated.
     * This can be IPv4, IPv6, or a token which is derived from the
     * IP address, depending on the data that has been provided
     * in the error report.
     * </pre>
     *
     * <code>string remote_ip = 6;</code>
     */
    public java.lang.String getRemoteIp() {
      java.lang.Object ref = remoteIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remoteIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP address from which the request originated.
     * This can be IPv4, IPv6, or a token which is derived from the
     * IP address, depending on the data that has been provided
     * in the error report.
     * </pre>
     *
     * <code>string remote_ip = 6;</code>
     */
    public com.google.protobuf.ByteString
        getRemoteIpBytes() {
      java.lang.Object ref = remoteIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remoteIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP address from which the request originated.
     * This can be IPv4, IPv6, or a token which is derived from the
     * IP address, depending on the data that has been provided
     * in the error report.
     * </pre>
     *
     * <code>string remote_ip = 6;</code>
     */
    public Builder setRemoteIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remoteIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address from which the request originated.
     * This can be IPv4, IPv6, or a token which is derived from the
     * IP address, depending on the data that has been provided
     * in the error report.
     * </pre>
     *
     * <code>string remote_ip = 6;</code>
     */
    public Builder clearRemoteIp() {
      
      remoteIp_ = getDefaultInstance().getRemoteIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address from which the request originated.
     * This can be IPv4, IPv6, or a token which is derived from the
     * IP address, depending on the data that has been provided
     * in the error report.
     * </pre>
     *
     * <code>string remote_ip = 6;</code>
     */
    public Builder setRemoteIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remoteIp_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.HttpRequestContext)
  private static final com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpRequestContext>
      PARSER = new com.google.protobuf.AbstractParser<HttpRequestContext>() {
    public HttpRequestContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HttpRequestContext(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HttpRequestContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpRequestContext> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouderrorreporting.v1beta1.HttpRequestContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

