// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 * <pre>
 * The request for [Rollback][google.spanner.v1.Spanner.Rollback].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.RollbackRequest}
 */
public  final class RollbackRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.RollbackRequest)
    RollbackRequestOrBuilder {
  // Use RollbackRequest.newBuilder() to construct.
  private RollbackRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RollbackRequest() {
    session_ = "";
    transactionId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RollbackRequest(
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

            session_ = s;
            break;
          }
          case 18: {

            transactionId_ = input.readBytes();
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
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_RollbackRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.RollbackRequest.class, com.google.spanner.v1.RollbackRequest.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object session_;
  /**
   * <pre>
   * Required. The session in which the transaction to roll back is running.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  public java.lang.String getSession() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      session_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The session in which the transaction to roll back is running.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSessionBytes() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      session_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString transactionId_;
  /**
   * <pre>
   * Required. The transaction to roll back.
   * </pre>
   *
   * <code>bytes transaction_id = 2;</code>
   */
  public com.google.protobuf.ByteString getTransactionId() {
    return transactionId_;
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
    if (!getSessionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, session_);
    }
    if (!transactionId_.isEmpty()) {
      output.writeBytes(2, transactionId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, session_);
    }
    if (!transactionId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, transactionId_);
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
    if (!(obj instanceof com.google.spanner.v1.RollbackRequest)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.RollbackRequest other = (com.google.spanner.v1.RollbackRequest) obj;

    boolean result = true;
    result = result && getSession()
        .equals(other.getSession());
    result = result && getTransactionId()
        .equals(other.getTransactionId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSION_FIELD_NUMBER;
    hash = (53 * hash) + getSession().hashCode();
    hash = (37 * hash) + TRANSACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.RollbackRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.RollbackRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.RollbackRequest parseFrom(
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
  public static Builder newBuilder(com.google.spanner.v1.RollbackRequest prototype) {
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
   * The request for [Rollback][google.spanner.v1.Spanner.Rollback].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.RollbackRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.RollbackRequest)
      com.google.spanner.v1.RollbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_RollbackRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.RollbackRequest.class, com.google.spanner.v1.RollbackRequest.Builder.class);
    }

    // Construct using com.google.spanner.v1.RollbackRequest.newBuilder()
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
      session_ = "";

      transactionId_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_RollbackRequest_descriptor;
    }

    public com.google.spanner.v1.RollbackRequest getDefaultInstanceForType() {
      return com.google.spanner.v1.RollbackRequest.getDefaultInstance();
    }

    public com.google.spanner.v1.RollbackRequest build() {
      com.google.spanner.v1.RollbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.RollbackRequest buildPartial() {
      com.google.spanner.v1.RollbackRequest result = new com.google.spanner.v1.RollbackRequest(this);
      result.session_ = session_;
      result.transactionId_ = transactionId_;
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
      if (other instanceof com.google.spanner.v1.RollbackRequest) {
        return mergeFrom((com.google.spanner.v1.RollbackRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.RollbackRequest other) {
      if (other == com.google.spanner.v1.RollbackRequest.getDefaultInstance()) return this;
      if (!other.getSession().isEmpty()) {
        session_ = other.session_;
        onChanged();
      }
      if (other.getTransactionId() != com.google.protobuf.ByteString.EMPTY) {
        setTransactionId(other.getTransactionId());
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
      com.google.spanner.v1.RollbackRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.RollbackRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object session_ = "";
    /**
     * <pre>
     * Required. The session in which the transaction to roll back is running.
     * </pre>
     *
     * <code>string session = 1;</code>
     */
    public java.lang.String getSession() {
      java.lang.Object ref = session_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        session_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The session in which the transaction to roll back is running.
     * </pre>
     *
     * <code>string session = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSessionBytes() {
      java.lang.Object ref = session_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        session_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The session in which the transaction to roll back is running.
     * </pre>
     *
     * <code>string session = 1;</code>
     */
    public Builder setSession(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      session_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session in which the transaction to roll back is running.
     * </pre>
     *
     * <code>string session = 1;</code>
     */
    public Builder clearSession() {
      
      session_ = getDefaultInstance().getSession();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session in which the transaction to roll back is running.
     * </pre>
     *
     * <code>string session = 1;</code>
     */
    public Builder setSessionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      session_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString transactionId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction_id = 2;</code>
     */
    public com.google.protobuf.ByteString getTransactionId() {
      return transactionId_;
    }
    /**
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction_id = 2;</code>
     */
    public Builder setTransactionId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The transaction to roll back.
     * </pre>
     *
     * <code>bytes transaction_id = 2;</code>
     */
    public Builder clearTransactionId() {
      
      transactionId_ = getDefaultInstance().getTransactionId();
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


    public final Builder setSessionWithSessionName(com.google.spanner.v1.SessionName value) {
      if (value == null) {
        return setSession("");
      }
      return setSession(value.toString());
    }
    
    public final com.google.spanner.v1.SessionName getSessionAsSessionName() {
      java.lang.String str = getSession();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.spanner.v1.SessionName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.spanner.v1.RollbackRequest)
  }

  public final com.google.spanner.v1.SessionName getSessionAsSessionName() {
    java.lang.String str = getSession();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.spanner.v1.SessionName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.spanner.v1.RollbackRequest)
  private static final com.google.spanner.v1.RollbackRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.RollbackRequest();
  }

  public static com.google.spanner.v1.RollbackRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollbackRequest>
      PARSER = new com.google.protobuf.AbstractParser<RollbackRequest>() {
    public RollbackRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RollbackRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RollbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollbackRequest> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.RollbackRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

