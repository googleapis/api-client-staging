// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 * <pre>
 * The response for [GetDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdl].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.GetDatabaseDdlResponse}
 */
public  final class GetDatabaseDdlResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
    GetDatabaseDdlResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDatabaseDdlResponse.newBuilder() to construct.
  private GetDatabaseDdlResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDatabaseDdlResponse() {
    statements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetDatabaseDdlResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              statements_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            statements_.add(s);
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
        statements_ = statements_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.class, com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.Builder.class);
  }

  public static final int STATEMENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList statements_;
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStatementsList() {
    return statements_;
  }
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   */
  public int getStatementsCount() {
    return statements_.size();
  }
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   */
  public java.lang.String getStatements(int index) {
    return statements_.get(index);
  }
  /**
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStatementsBytes(int index) {
    return statements_.getByteString(index);
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
    for (int i = 0; i < statements_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, statements_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < statements_.size(); i++) {
        dataSize += computeStringSizeNoTag(statements_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStatementsList().size();
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.GetDatabaseDdlResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.GetDatabaseDdlResponse other = (com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) obj;

    boolean result = true;
    result = result && getStatementsList()
        .equals(other.getStatementsList());
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
    if (getStatementsCount() > 0) {
      hash = (37 * hash) + STATEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStatementsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
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
  public static Builder newBuilder(com.google.spanner.admin.database.v1.GetDatabaseDdlResponse prototype) {
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
   * The response for [GetDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdl].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.GetDatabaseDdlResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.class, com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.newBuilder()
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
      statements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
    }

    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.getDefaultInstance();
    }

    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse build() {
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse buildPartial() {
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse result = new com.google.spanner.admin.database.v1.GetDatabaseDdlResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        statements_ = statements_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.statements_ = statements_;
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
      if (other instanceof com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) {
        return mergeFrom((com.google.spanner.admin.database.v1.GetDatabaseDdlResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.GetDatabaseDdlResponse other) {
      if (other == com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.getDefaultInstance()) return this;
      if (!other.statements_.isEmpty()) {
        if (statements_.isEmpty()) {
          statements_ = other.statements_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStatementsIsMutable();
          statements_.addAll(other.statements_);
        }
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
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList statements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStatementsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        statements_ = new com.google.protobuf.LazyStringArrayList(statements_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStatementsList() {
      return statements_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public int getStatementsCount() {
      return statements_.size();
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public java.lang.String getStatements(int index) {
      return statements_.get(index);
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStatementsBytes(int index) {
      return statements_.getByteString(index);
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public Builder setStatements(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatementsIsMutable();
      statements_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public Builder addStatements(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatementsIsMutable();
      statements_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public Builder addAllStatements(
        java.lang.Iterable<java.lang.String> values) {
      ensureStatementsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, statements_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public Builder clearStatements() {
      statements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     */
    public Builder addStatementsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStatementsIsMutable();
      statements_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
  private static final com.google.spanner.admin.database.v1.GetDatabaseDdlResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.GetDatabaseDdlResponse();
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDatabaseDdlResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDatabaseDdlResponse>() {
    public GetDatabaseDdlResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetDatabaseDdlResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetDatabaseDdlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDatabaseDdlResponse> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

