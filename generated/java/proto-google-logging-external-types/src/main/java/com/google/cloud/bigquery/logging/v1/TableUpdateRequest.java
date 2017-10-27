// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

/**
 * <pre>
 * Table update request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.logging.v1.TableUpdateRequest}
 */
public  final class TableUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.logging.v1.TableUpdateRequest)
    TableUpdateRequestOrBuilder {
  // Use TableUpdateRequest.newBuilder() to construct.
  private TableUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableUpdateRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TableUpdateRequest(
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
            com.google.cloud.bigquery.logging.v1.Table.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(com.google.cloud.bigquery.logging.v1.Table.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
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
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.logging.v1.TableUpdateRequest.class, com.google.cloud.bigquery.logging.v1.TableUpdateRequest.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.logging.v1.Table resource_;
  /**
   * <pre>
   * The table to be updated.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * The table to be updated.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   */
  public com.google.cloud.bigquery.logging.v1.Table getResource() {
    return resource_ == null ? com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * The table to be updated.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
   */
  public com.google.cloud.bigquery.logging.v1.TableOrBuilder getResourceOrBuilder() {
    return getResource();
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
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
    if (!(obj instanceof com.google.cloud.bigquery.logging.v1.TableUpdateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.logging.v1.TableUpdateRequest other = (com.google.cloud.bigquery.logging.v1.TableUpdateRequest) obj;

    boolean result = true;
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.logging.v1.TableUpdateRequest prototype) {
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
   * Table update request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.logging.v1.TableUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.logging.v1.TableUpdateRequest)
      com.google.cloud.bigquery.logging.v1.TableUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.logging.v1.TableUpdateRequest.class, com.google.cloud.bigquery.logging.v1.TableUpdateRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.logging.v1.TableUpdateRequest.newBuilder()
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
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.logging.v1.AuditDataProto.internal_static_google_cloud_bigquery_logging_v1_TableUpdateRequest_descriptor;
    }

    public com.google.cloud.bigquery.logging.v1.TableUpdateRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.logging.v1.TableUpdateRequest.getDefaultInstance();
    }

    public com.google.cloud.bigquery.logging.v1.TableUpdateRequest build() {
      com.google.cloud.bigquery.logging.v1.TableUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.bigquery.logging.v1.TableUpdateRequest buildPartial() {
      com.google.cloud.bigquery.logging.v1.TableUpdateRequest result = new com.google.cloud.bigquery.logging.v1.TableUpdateRequest(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.logging.v1.TableUpdateRequest) {
        return mergeFrom((com.google.cloud.bigquery.logging.v1.TableUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.logging.v1.TableUpdateRequest other) {
      if (other == com.google.cloud.bigquery.logging.v1.TableUpdateRequest.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
      com.google.cloud.bigquery.logging.v1.TableUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.logging.v1.TableUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.bigquery.logging.v1.Table resource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public com.google.cloud.bigquery.logging.v1.Table getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder setResource(com.google.cloud.bigquery.logging.v1.Table value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder setResource(
        com.google.cloud.bigquery.logging.v1.Table.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder mergeResource(com.google.cloud.bigquery.logging.v1.Table value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.google.cloud.bigquery.logging.v1.Table.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public com.google.cloud.bigquery.logging.v1.Table.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    public com.google.cloud.bigquery.logging.v1.TableOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.google.cloud.bigquery.logging.v1.Table.getDefaultInstance() : resource_;
      }
    }
    /**
     * <pre>
     * The table to be updated.
     * </pre>
     *
     * <code>optional .google.cloud.bigquery.logging.v1.Table resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.logging.v1.Table, com.google.cloud.bigquery.logging.v1.Table.Builder, com.google.cloud.bigquery.logging.v1.TableOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.logging.v1.TableUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.logging.v1.TableUpdateRequest)
  private static final com.google.cloud.bigquery.logging.v1.TableUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.logging.v1.TableUpdateRequest();
  }

  public static com.google.cloud.bigquery.logging.v1.TableUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<TableUpdateRequest>() {
    public TableUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TableUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TableUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableUpdateRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.bigquery.logging.v1.TableUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

