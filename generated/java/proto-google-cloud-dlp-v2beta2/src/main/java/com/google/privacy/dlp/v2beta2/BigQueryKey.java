// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Row key for identifying a record in BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryKey}
 */
public  final class BigQueryKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.BigQueryKey)
    BigQueryKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BigQueryKey.newBuilder() to construct.
  private BigQueryKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BigQueryKey() {
    rowNumber_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BigQueryKey(
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
            com.google.privacy.dlp.v2beta2.BigQueryTable.Builder subBuilder = null;
            if (tableReference_ != null) {
              subBuilder = tableReference_.toBuilder();
            }
            tableReference_ = input.readMessage(com.google.privacy.dlp.v2beta2.BigQueryTable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tableReference_);
              tableReference_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            rowNumber_ = input.readInt64();
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
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.BigQueryKey.class, com.google.privacy.dlp.v2beta2.BigQueryKey.Builder.class);
  }

  public static final int TABLE_REFERENCE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta2.BigQueryTable tableReference_;
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public boolean hasTableReference() {
    return tableReference_ != null;
  }
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.BigQueryTable getTableReference() {
    return tableReference_ == null ? com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
  }
  /**
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
    return getTableReference();
  }

  public static final int ROW_NUMBER_FIELD_NUMBER = 2;
  private long rowNumber_;
  /**
   * <pre>
   * Absolute number of the row from the beginning of the table at the time
   * of scanning.
   * </pre>
   *
   * <code>int64 row_number = 2;</code>
   */
  public long getRowNumber() {
    return rowNumber_;
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
    if (tableReference_ != null) {
      output.writeMessage(1, getTableReference());
    }
    if (rowNumber_ != 0L) {
      output.writeInt64(2, rowNumber_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableReference_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTableReference());
    }
    if (rowNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, rowNumber_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.BigQueryKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.BigQueryKey other = (com.google.privacy.dlp.v2beta2.BigQueryKey) obj;

    boolean result = true;
    result = result && (hasTableReference() == other.hasTableReference());
    if (hasTableReference()) {
      result = result && getTableReference()
          .equals(other.getTableReference());
    }
    result = result && (getRowNumber()
        == other.getRowNumber());
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
    if (hasTableReference()) {
      hash = (37 * hash) + TABLE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getTableReference().hashCode();
    }
    hash = (37 * hash) + ROW_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryKey parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.BigQueryKey prototype) {
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
   * Row key for identifying a record in BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.BigQueryKey)
      com.google.privacy.dlp.v2beta2.BigQueryKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.BigQueryKey.class, com.google.privacy.dlp.v2beta2.BigQueryKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.BigQueryKey.newBuilder()
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
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }
      rowNumber_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryKey_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.BigQueryKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.BigQueryKey build() {
      com.google.privacy.dlp.v2beta2.BigQueryKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryKey buildPartial() {
      com.google.privacy.dlp.v2beta2.BigQueryKey result = new com.google.privacy.dlp.v2beta2.BigQueryKey(this);
      if (tableReferenceBuilder_ == null) {
        result.tableReference_ = tableReference_;
      } else {
        result.tableReference_ = tableReferenceBuilder_.build();
      }
      result.rowNumber_ = rowNumber_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.BigQueryKey) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.BigQueryKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.BigQueryKey other) {
      if (other == com.google.privacy.dlp.v2beta2.BigQueryKey.getDefaultInstance()) return this;
      if (other.hasTableReference()) {
        mergeTableReference(other.getTableReference());
      }
      if (other.getRowNumber() != 0L) {
        setRowNumber(other.getRowNumber());
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
      com.google.privacy.dlp.v2beta2.BigQueryKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.BigQueryKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta2.BigQueryTable tableReference_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder> tableReferenceBuilder_;
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public boolean hasTableReference() {
      return tableReferenceBuilder_ != null || tableReference_ != null;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTable getTableReference() {
      if (tableReferenceBuilder_ == null) {
        return tableReference_ == null ? com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
      } else {
        return tableReferenceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(com.google.privacy.dlp.v2beta2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableReference_ = value;
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder setTableReference(
        com.google.privacy.dlp.v2beta2.BigQueryTable.Builder builderForValue) {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = builderForValue.build();
        onChanged();
      } else {
        tableReferenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder mergeTableReference(com.google.privacy.dlp.v2beta2.BigQueryTable value) {
      if (tableReferenceBuilder_ == null) {
        if (tableReference_ != null) {
          tableReference_ =
            com.google.privacy.dlp.v2beta2.BigQueryTable.newBuilder(tableReference_).mergeFrom(value).buildPartial();
        } else {
          tableReference_ = value;
        }
        onChanged();
      } else {
        tableReferenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public Builder clearTableReference() {
      if (tableReferenceBuilder_ == null) {
        tableReference_ = null;
        onChanged();
      } else {
        tableReference_ = null;
        tableReferenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTable.Builder getTableReferenceBuilder() {
      
      onChanged();
      return getTableReferenceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder getTableReferenceOrBuilder() {
      if (tableReferenceBuilder_ != null) {
        return tableReferenceBuilder_.getMessageOrBuilder();
      } else {
        return tableReference_ == null ?
            com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance() : tableReference_;
      }
    }
    /**
     * <pre>
     * Complete BigQuery table reference.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.BigQueryTable table_reference = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder> 
        getTableReferenceFieldBuilder() {
      if (tableReferenceBuilder_ == null) {
        tableReferenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.BigQueryTable, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder, com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder>(
                getTableReference(),
                getParentForChildren(),
                isClean());
        tableReference_ = null;
      }
      return tableReferenceBuilder_;
    }

    private long rowNumber_ ;
    /**
     * <pre>
     * Absolute number of the row from the beginning of the table at the time
     * of scanning.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     */
    public long getRowNumber() {
      return rowNumber_;
    }
    /**
     * <pre>
     * Absolute number of the row from the beginning of the table at the time
     * of scanning.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     */
    public Builder setRowNumber(long value) {
      
      rowNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Absolute number of the row from the beginning of the table at the time
     * of scanning.
     * </pre>
     *
     * <code>int64 row_number = 2;</code>
     */
    public Builder clearRowNumber() {
      
      rowNumber_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.BigQueryKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.BigQueryKey)
  private static final com.google.privacy.dlp.v2beta2.BigQueryKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.BigQueryKey();
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryKey>
      PARSER = new com.google.protobuf.AbstractParser<BigQueryKey>() {
    public BigQueryKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BigQueryKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BigQueryKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.BigQueryKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

