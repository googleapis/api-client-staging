// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/storage.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Message defining the location of a BigQuery table. A table is uniquely
 * identified  by its project_id, dataset_id, and table_name. Within a query
 * a table is often referenced with a string in the format of:
 * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` or
 * `&lt;project_id&gt;.&lt;dataset_id&gt;.&lt;table_id&gt;`.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryTable}
 */
public  final class BigQueryTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.BigQueryTable)
    BigQueryTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BigQueryTable.newBuilder() to construct.
  private BigQueryTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BigQueryTable() {
    projectId_ = "";
    datasetId_ = "";
    tableId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BigQueryTable(
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

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            datasetId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            tableId_ = s;
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
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryTable_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.BigQueryTable.class, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The Google Cloud Platform project ID of the project containing the table.
   * If omitted, project ID is inferred from the API call.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud Platform project ID of the project containing the table.
   * If omitted, project ID is inferred from the API call.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object datasetId_;
  /**
   * <pre>
   * Dataset ID of the table.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   */
  public java.lang.String getDatasetId() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datasetId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Dataset ID of the table.
   * </pre>
   *
   * <code>string dataset_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDatasetIdBytes() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datasetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object tableId_;
  /**
   * <pre>
   * Name of the table.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   */
  public java.lang.String getTableId() {
    java.lang.Object ref = tableId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the table.
   * </pre>
   *
   * <code>string table_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTableIdBytes() {
    java.lang.Object ref = tableId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableId_ = b;
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getDatasetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, datasetId_);
    }
    if (!getTableIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tableId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getDatasetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, datasetId_);
    }
    if (!getTableIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tableId_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.BigQueryTable)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.BigQueryTable other = (com.google.privacy.dlp.v2beta2.BigQueryTable) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getDatasetId()
        .equals(other.getDatasetId());
    result = result && getTableId()
        .equals(other.getTableId());
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + DATASET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDatasetId().hashCode();
    hash = (37 * hash) + TABLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTableId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.BigQueryTable parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.BigQueryTable prototype) {
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
   * Message defining the location of a BigQuery table. A table is uniquely
   * identified  by its project_id, dataset_id, and table_name. Within a query
   * a table is often referenced with a string in the format of:
   * `&lt;project_id&gt;:&lt;dataset_id&gt;.&lt;table_id&gt;` or
   * `&lt;project_id&gt;.&lt;dataset_id&gt;.&lt;table_id&gt;`.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.BigQueryTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.BigQueryTable)
      com.google.privacy.dlp.v2beta2.BigQueryTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryTable_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.BigQueryTable.class, com.google.privacy.dlp.v2beta2.BigQueryTable.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.BigQueryTable.newBuilder()
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
      projectId_ = "";

      datasetId_ = "";

      tableId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpStorage.internal_static_google_privacy_dlp_v2beta2_BigQueryTable_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryTable getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.BigQueryTable build() {
      com.google.privacy.dlp.v2beta2.BigQueryTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.BigQueryTable buildPartial() {
      com.google.privacy.dlp.v2beta2.BigQueryTable result = new com.google.privacy.dlp.v2beta2.BigQueryTable(this);
      result.projectId_ = projectId_;
      result.datasetId_ = datasetId_;
      result.tableId_ = tableId_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.BigQueryTable) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.BigQueryTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.BigQueryTable other) {
      if (other == com.google.privacy.dlp.v2beta2.BigQueryTable.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getDatasetId().isEmpty()) {
        datasetId_ = other.datasetId_;
        onChanged();
      }
      if (!other.getTableId().isEmpty()) {
        tableId_ = other.tableId_;
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
      com.google.privacy.dlp.v2beta2.BigQueryTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.BigQueryTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The Google Cloud Platform project ID of the project containing the table.
     * If omitted, project ID is inferred from the API call.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Platform project ID of the project containing the table.
     * If omitted, project ID is inferred from the API call.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud Platform project ID of the project containing the table.
     * If omitted, project ID is inferred from the API call.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Platform project ID of the project containing the table.
     * If omitted, project ID is inferred from the API call.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud Platform project ID of the project containing the table.
     * If omitted, project ID is inferred from the API call.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object datasetId_ = "";
    /**
     * <pre>
     * Dataset ID of the table.
     * </pre>
     *
     * <code>string dataset_id = 2;</code>
     */
    public java.lang.String getDatasetId() {
      java.lang.Object ref = datasetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datasetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Dataset ID of the table.
     * </pre>
     *
     * <code>string dataset_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDatasetIdBytes() {
      java.lang.Object ref = datasetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datasetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Dataset ID of the table.
     * </pre>
     *
     * <code>string dataset_id = 2;</code>
     */
    public Builder setDatasetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datasetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dataset ID of the table.
     * </pre>
     *
     * <code>string dataset_id = 2;</code>
     */
    public Builder clearDatasetId() {
      
      datasetId_ = getDefaultInstance().getDatasetId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dataset ID of the table.
     * </pre>
     *
     * <code>string dataset_id = 2;</code>
     */
    public Builder setDatasetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      datasetId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tableId_ = "";
    /**
     * <pre>
     * Name of the table.
     * </pre>
     *
     * <code>string table_id = 3;</code>
     */
    public java.lang.String getTableId() {
      java.lang.Object ref = tableId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the table.
     * </pre>
     *
     * <code>string table_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTableIdBytes() {
      java.lang.Object ref = tableId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the table.
     * </pre>
     *
     * <code>string table_id = 3;</code>
     */
    public Builder setTableId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the table.
     * </pre>
     *
     * <code>string table_id = 3;</code>
     */
    public Builder clearTableId() {
      
      tableId_ = getDefaultInstance().getTableId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the table.
     * </pre>
     *
     * <code>string table_id = 3;</code>
     */
    public Builder setTableIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.BigQueryTable)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.BigQueryTable)
  private static final com.google.privacy.dlp.v2beta2.BigQueryTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.BigQueryTable();
  }

  public static com.google.privacy.dlp.v2beta2.BigQueryTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryTable>
      PARSER = new com.google.protobuf.AbstractParser<BigQueryTable>() {
    public BigQueryTable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BigQueryTable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BigQueryTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryTable> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.BigQueryTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

