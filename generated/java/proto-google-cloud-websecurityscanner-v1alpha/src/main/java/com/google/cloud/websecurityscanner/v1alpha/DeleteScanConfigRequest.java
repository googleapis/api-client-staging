// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 * <pre>
 * Request for the `DeleteScanConfig` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest}
 */
public  final class DeleteScanConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)
    DeleteScanConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteScanConfigRequest.newBuilder() to construct.
  private DeleteScanConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteScanConfigRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteScanConfigRequest(
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

            name_ = s;
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
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto.internal_static_google_cloud_websecurityscanner_v1alpha_DeleteScanConfigRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto.internal_static_google_cloud_websecurityscanner_v1alpha_DeleteScanConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.class, com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required.
   * The resource name of the ScanConfig to be deleted. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
   * Required.
   * The resource name of the ScanConfig to be deleted. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest other = (com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest prototype) {
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
   * Request for the `DeleteScanConfig` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)
      com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto.internal_static_google_cloud_websecurityscanner_v1alpha_DeleteScanConfigRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto.internal_static_google_cloud_websecurityscanner_v1alpha_DeleteScanConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.class, com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.newBuilder()
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

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto.internal_static_google_cloud_websecurityscanner_v1alpha_DeleteScanConfigRequest_descriptor;
    }

    public com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.getDefaultInstance();
    }

    public com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest build() {
      com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest result = new com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest(this);
      result.name_ = name_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest other) {
      if (other == com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest) e.getUnfinishedMessage();
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
     * Required.
     * The resource name of the ScanConfig to be deleted. The name follows the
     * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
     * Required.
     * The resource name of the ScanConfig to be deleted. The name follows the
     * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
     * Required.
     * The resource name of the ScanConfig to be deleted. The name follows the
     * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
     * Required.
     * The resource name of the ScanConfig to be deleted. The name follows the
     * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
     * Required.
     * The resource name of the ScanConfig to be deleted. The name follows the
     * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest)
  private static final com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteScanConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteScanConfigRequest>() {
    public DeleteScanConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteScanConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteScanConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteScanConfigRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.websecurityscanner.v1alpha.DeleteScanConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

