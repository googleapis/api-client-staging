// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * The request message for listing DLP jobs.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.ListDlpJobsRequest}
 */
public  final class ListDlpJobsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.ListDlpJobsRequest)
    ListDlpJobsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDlpJobsRequest.newBuilder() to construct.
  private ListDlpJobsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDlpJobsRequest() {
    parent_ = "";
    filter_ = "";
    pageSize_ = 0;
    pageToken_ = "";
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDlpJobsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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

            filter_ = s;
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            type_ = rawValue;
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
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListDlpJobsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListDlpJobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.class, com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 4;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private int type_;
  /**
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
   */
  public com.google.privacy.dlp.v2beta2.DlpJobType getType() {
    com.google.privacy.dlp.v2beta2.DlpJobType result = com.google.privacy.dlp.v2beta2.DlpJobType.valueOf(type_);
    return result == null ? com.google.privacy.dlp.v2beta2.DlpJobType.UNRECOGNIZED : result;
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
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filter_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
    }
    if (type_ != com.google.privacy.dlp.v2beta2.DlpJobType.DLP_JOB_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, type_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filter_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
    }
    if (type_ != com.google.privacy.dlp.v2beta2.DlpJobType.DLP_JOB_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.ListDlpJobsRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.ListDlpJobsRequest other = (com.google.privacy.dlp.v2beta2.ListDlpJobsRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && getFilter()
        .equals(other.getFilter());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && type_ == other.type_;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest prototype) {
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
   * The request message for listing DLP jobs.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.ListDlpJobsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.ListDlpJobsRequest)
      com.google.privacy.dlp.v2beta2.ListDlpJobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListDlpJobsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListDlpJobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.class, com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.newBuilder()
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
      parent_ = "";

      filter_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      type_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ListDlpJobsRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.ListDlpJobsRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.ListDlpJobsRequest build() {
      com.google.privacy.dlp.v2beta2.ListDlpJobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.ListDlpJobsRequest buildPartial() {
      com.google.privacy.dlp.v2beta2.ListDlpJobsRequest result = new com.google.privacy.dlp.v2beta2.ListDlpJobsRequest(this);
      result.parent_ = parent_;
      result.filter_ = filter_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      result.type_ = type_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.ListDlpJobsRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.ListDlpJobsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.ListDlpJobsRequest other) {
      if (other == com.google.privacy.dlp.v2beta2.ListDlpJobsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.google.privacy.dlp.v2beta2.ListDlpJobsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.ListDlpJobsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 4;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 4;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 4;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 4;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>string parent = 4;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
     * * Supported fields/values for inspect jobs:
     *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     * * Supported fields for risk analysis jobs:
     *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
     * * The operator must be `=` or `!=`.
     * Examples:
     * * inspected_storage = cloud_storage AND state = done
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     * The length of this field should be no more than 500 characters.
     * </pre>
     *
     * <code>string filter = 1;</code>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
     * * Supported fields/values for inspect jobs:
     *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     * * Supported fields for risk analysis jobs:
     *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
     * * The operator must be `=` or `!=`.
     * Examples:
     * * inspected_storage = cloud_storage AND state = done
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     * The length of this field should be no more than 500 characters.
     * </pre>
     *
     * <code>string filter = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
     * * Supported fields/values for inspect jobs:
     *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     * * Supported fields for risk analysis jobs:
     *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
     * * The operator must be `=` or `!=`.
     * Examples:
     * * inspected_storage = cloud_storage AND state = done
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     * The length of this field should be no more than 500 characters.
     * </pre>
     *
     * <code>string filter = 1;</code>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
     * * Supported fields/values for inspect jobs:
     *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     * * Supported fields for risk analysis jobs:
     *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
     * * The operator must be `=` or `!=`.
     * Examples:
     * * inspected_storage = cloud_storage AND state = done
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     * The length of this field should be no more than 500 characters.
     * </pre>
     *
     * <code>string filter = 1;</code>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `&lt;field&gt; &lt;operator&gt; &lt;value&gt;`.
     * * Supported fields/values for inspect jobs:
     *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     * * Supported fields for risk analysis jobs:
     *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
     * * The operator must be `=` or `!=`.
     * Examples:
     * * inspected_storage = cloud_storage AND state = done
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     * The length of this field should be no more than 500 characters.
     * </pre>
     *
     * <code>string filter = 1;</code>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page size.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * The standard list page token.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard list page token.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard list page token.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page token.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard list page token.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The type of job. Defaults to `DlpJobType.INSPECT`
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of job. Defaults to `DlpJobType.INSPECT`
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of job. Defaults to `DlpJobType.INSPECT`
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
     */
    public com.google.privacy.dlp.v2beta2.DlpJobType getType() {
      com.google.privacy.dlp.v2beta2.DlpJobType result = com.google.privacy.dlp.v2beta2.DlpJobType.valueOf(type_);
      return result == null ? com.google.privacy.dlp.v2beta2.DlpJobType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of job. Defaults to `DlpJobType.INSPECT`
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
     */
    public Builder setType(com.google.privacy.dlp.v2beta2.DlpJobType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of job. Defaults to `DlpJobType.INSPECT`
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.DlpJobType type = 5;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
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


    /**
     * @deprecated Use the following instead:
     * <pre><code>
     * protoBuilder.setParent(projectName.toString());
     * </code></pre>
     */
    @Deprecated
    public final Builder setParentWithProjectName(com.google.privacy.dlp.v2beta2.ProjectName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    /**
     * @deprecated Use the following instead:
     * <pre><code>
     * ProjectName.parse(protoBuilder.getParent());
     * </code></pre>
     */
    @Deprecated
    public final com.google.privacy.dlp.v2beta2.ProjectName getParentAsProjectName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.privacy.dlp.v2beta2.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.ListDlpJobsRequest)
  }

  /**
   * @deprecated Use the following instead:
   * <pre><code>
   * ProjectName.parse(protoObject.getParent());
   * </code></pre>
   */
  @Deprecated
  public final com.google.privacy.dlp.v2beta2.ProjectName getParentAsProjectName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.privacy.dlp.v2beta2.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.ListDlpJobsRequest)
  private static final com.google.privacy.dlp.v2beta2.ListDlpJobsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.ListDlpJobsRequest();
  }

  public static com.google.privacy.dlp.v2beta2.ListDlpJobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDlpJobsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListDlpJobsRequest>() {
    public ListDlpJobsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListDlpJobsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDlpJobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDlpJobsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.ListDlpJobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

