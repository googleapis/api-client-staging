// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/transaction.proto

package com.google.spanner.v1;

/**
 * <pre>
 * A transaction.
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.Transaction}
 */
public  final class Transaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.Transaction)
    TransactionOrBuilder {
  // Use Transaction.newBuilder() to construct.
  private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Transaction() {
    id_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Transaction(
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

            id_ = input.readBytes();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (readTimestamp_ != null) {
              subBuilder = readTimestamp_.toBuilder();
            }
            readTimestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(readTimestamp_);
              readTimestamp_ = subBuilder.buildPartial();
            }

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
    return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_Transaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.Transaction.class, com.google.spanner.v1.Transaction.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString id_;
  /**
   * <pre>
   * `id` may be used to identify the transaction in subsequent
   * [Read][google.spanner.v1.Spanner.Read],
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
   * [Commit][google.spanner.v1.Spanner.Commit], or
   * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
   * Single-use read-only transactions do not have IDs, because
   * single-use transactions do not support multiple requests.
   * </pre>
   *
   * <code>bytes id = 1;</code>
   */
  public com.google.protobuf.ByteString getId() {
    return id_;
  }

  public static final int READ_TIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp readTimestamp_;
  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  public boolean hasReadTimestamp() {
    return readTimestamp_ != null;
  }
  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  public com.google.protobuf.Timestamp getReadTimestamp() {
    return readTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : readTimestamp_;
  }
  /**
   * <pre>
   * For snapshot read-only transactions, the read timestamp chosen
   * for the transaction. Not returned by default: see
   * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getReadTimestampOrBuilder() {
    return getReadTimestamp();
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
    if (!id_.isEmpty()) {
      output.writeBytes(1, id_);
    }
    if (readTimestamp_ != null) {
      output.writeMessage(2, getReadTimestamp());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, id_);
    }
    if (readTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReadTimestamp());
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
    if (!(obj instanceof com.google.spanner.v1.Transaction)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.Transaction other = (com.google.spanner.v1.Transaction) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && (hasReadTimestamp() == other.hasReadTimestamp());
    if (hasReadTimestamp()) {
      result = result && getReadTimestamp()
          .equals(other.getReadTimestamp());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasReadTimestamp()) {
      hash = (37 * hash) + READ_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getReadTimestamp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.Transaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.Transaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.Transaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.Transaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.Transaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.Transaction parseFrom(
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
  public static Builder newBuilder(com.google.spanner.v1.Transaction prototype) {
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
   * A transaction.
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.Transaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.Transaction)
      com.google.spanner.v1.TransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.Transaction.class, com.google.spanner.v1.Transaction.Builder.class);
    }

    // Construct using com.google.spanner.v1.Transaction.newBuilder()
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
      id_ = com.google.protobuf.ByteString.EMPTY;

      if (readTimestampBuilder_ == null) {
        readTimestamp_ = null;
      } else {
        readTimestamp_ = null;
        readTimestampBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.TransactionProto.internal_static_google_spanner_v1_Transaction_descriptor;
    }

    public com.google.spanner.v1.Transaction getDefaultInstanceForType() {
      return com.google.spanner.v1.Transaction.getDefaultInstance();
    }

    public com.google.spanner.v1.Transaction build() {
      com.google.spanner.v1.Transaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.Transaction buildPartial() {
      com.google.spanner.v1.Transaction result = new com.google.spanner.v1.Transaction(this);
      result.id_ = id_;
      if (readTimestampBuilder_ == null) {
        result.readTimestamp_ = readTimestamp_;
      } else {
        result.readTimestamp_ = readTimestampBuilder_.build();
      }
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
      if (other instanceof com.google.spanner.v1.Transaction) {
        return mergeFrom((com.google.spanner.v1.Transaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.Transaction other) {
      if (other == com.google.spanner.v1.Transaction.getDefaultInstance()) return this;
      if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
        setId(other.getId());
      }
      if (other.hasReadTimestamp()) {
        mergeReadTimestamp(other.getReadTimestamp());
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
      com.google.spanner.v1.Transaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.Transaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }
    /**
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `id` may be used to identify the transaction in subsequent
     * [Read][google.spanner.v1.Spanner.Read],
     * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql],
     * [Commit][google.spanner.v1.Spanner.Commit], or
     * [Rollback][google.spanner.v1.Spanner.Rollback] calls.
     * Single-use read-only transactions do not have IDs, because
     * single-use transactions do not support multiple requests.
     * </pre>
     *
     * <code>bytes id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp readTimestamp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> readTimestampBuilder_;
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public boolean hasReadTimestamp() {
      return readTimestampBuilder_ != null || readTimestamp_ != null;
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp getReadTimestamp() {
      if (readTimestampBuilder_ == null) {
        return readTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : readTimestamp_;
      } else {
        return readTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder setReadTimestamp(com.google.protobuf.Timestamp value) {
      if (readTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readTimestamp_ = value;
        onChanged();
      } else {
        readTimestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder setReadTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (readTimestampBuilder_ == null) {
        readTimestamp_ = builderForValue.build();
        onChanged();
      } else {
        readTimestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder mergeReadTimestamp(com.google.protobuf.Timestamp value) {
      if (readTimestampBuilder_ == null) {
        if (readTimestamp_ != null) {
          readTimestamp_ =
            com.google.protobuf.Timestamp.newBuilder(readTimestamp_).mergeFrom(value).buildPartial();
        } else {
          readTimestamp_ = value;
        }
        onChanged();
      } else {
        readTimestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public Builder clearReadTimestamp() {
      if (readTimestampBuilder_ == null) {
        readTimestamp_ = null;
        onChanged();
      } else {
        readTimestamp_ = null;
        readTimestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getReadTimestampBuilder() {
      
      onChanged();
      return getReadTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getReadTimestampOrBuilder() {
      if (readTimestampBuilder_ != null) {
        return readTimestampBuilder_.getMessageOrBuilder();
      } else {
        return readTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : readTimestamp_;
      }
    }
    /**
     * <pre>
     * For snapshot read-only transactions, the read timestamp chosen
     * for the transaction. Not returned by default: see
     * [TransactionOptions.ReadOnly.return_read_timestamp][google.spanner.v1.TransactionOptions.ReadOnly.return_read_timestamp].
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_timestamp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getReadTimestampFieldBuilder() {
      if (readTimestampBuilder_ == null) {
        readTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getReadTimestamp(),
                getParentForChildren(),
                isClean());
        readTimestamp_ = null;
      }
      return readTimestampBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.Transaction)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.Transaction)
  private static final com.google.spanner.v1.Transaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.Transaction();
  }

  public static com.google.spanner.v1.Transaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transaction>
      PARSER = new com.google.protobuf.AbstractParser<Transaction>() {
    public Transaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Transaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Transaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Transaction> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.Transaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

