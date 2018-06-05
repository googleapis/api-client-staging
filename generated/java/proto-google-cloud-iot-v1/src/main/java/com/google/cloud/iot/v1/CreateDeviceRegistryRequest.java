// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Request for `CreateDeviceRegistry`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.CreateDeviceRegistryRequest}
 */
public  final class CreateDeviceRegistryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.CreateDeviceRegistryRequest)
    CreateDeviceRegistryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDeviceRegistryRequest.newBuilder() to construct.
  private CreateDeviceRegistryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDeviceRegistryRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateDeviceRegistryRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.iot.v1.DeviceRegistry.Builder subBuilder = null;
            if (deviceRegistry_ != null) {
              subBuilder = deviceRegistry_.toBuilder();
            }
            deviceRegistry_ = input.readMessage(com.google.cloud.iot.v1.DeviceRegistry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deviceRegistry_);
              deviceRegistry_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.CreateDeviceRegistryRequest.class, com.google.cloud.iot.v1.CreateDeviceRegistryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int DEVICE_REGISTRY_FIELD_NUMBER = 2;
  private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_;
  /**
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public boolean hasDeviceRegistry() {
    return deviceRegistry_ != null;
  }
  /**
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
    return deviceRegistry_ == null ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
  }
  /**
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
    return getDeviceRegistry();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (deviceRegistry_ != null) {
      output.writeMessage(2, getDeviceRegistry());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (deviceRegistry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeviceRegistry());
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
    if (!(obj instanceof com.google.cloud.iot.v1.CreateDeviceRegistryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.CreateDeviceRegistryRequest other = (com.google.cloud.iot.v1.CreateDeviceRegistryRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasDeviceRegistry() == other.hasDeviceRegistry());
    if (hasDeviceRegistry()) {
      result = result && getDeviceRegistry()
          .equals(other.getDeviceRegistry());
    }
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
    if (hasDeviceRegistry()) {
      hash = (37 * hash) + DEVICE_REGISTRY_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceRegistry().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iot.v1.CreateDeviceRegistryRequest prototype) {
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
   * Request for `CreateDeviceRegistry`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.CreateDeviceRegistryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.CreateDeviceRegistryRequest)
      com.google.cloud.iot.v1.CreateDeviceRegistryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.CreateDeviceRegistryRequest.class, com.google.cloud.iot.v1.CreateDeviceRegistryRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.CreateDeviceRegistryRequest.newBuilder()
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

      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
    }

    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.CreateDeviceRegistryRequest.getDefaultInstance();
    }

    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest build() {
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest buildPartial() {
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest result = new com.google.cloud.iot.v1.CreateDeviceRegistryRequest(this);
      result.parent_ = parent_;
      if (deviceRegistryBuilder_ == null) {
        result.deviceRegistry_ = deviceRegistry_;
      } else {
        result.deviceRegistry_ = deviceRegistryBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.iot.v1.CreateDeviceRegistryRequest) {
        return mergeFrom((com.google.cloud.iot.v1.CreateDeviceRegistryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.CreateDeviceRegistryRequest other) {
      if (other == com.google.cloud.iot.v1.CreateDeviceRegistryRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasDeviceRegistry()) {
        mergeDeviceRegistry(other.getDeviceRegistry());
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
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.CreateDeviceRegistryRequest) e.getUnfinishedMessage();
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
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder> deviceRegistryBuilder_;
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public boolean hasDeviceRegistry() {
      return deviceRegistryBuilder_ != null || deviceRegistry_ != null;
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        return deviceRegistry_ == null ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
      } else {
        return deviceRegistryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder setDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceRegistry_ = value;
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder setDeviceRegistry(
        com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = builderForValue.build();
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder mergeDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (deviceRegistry_ != null) {
          deviceRegistry_ =
            com.google.cloud.iot.v1.DeviceRegistry.newBuilder(deviceRegistry_).mergeFrom(value).buildPartial();
        } else {
          deviceRegistry_ = value;
        }
        onChanged();
      } else {
        deviceRegistryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder clearDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
        onChanged();
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder getDeviceRegistryBuilder() {
      
      onChanged();
      return getDeviceRegistryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
      if (deviceRegistryBuilder_ != null) {
        return deviceRegistryBuilder_.getMessageOrBuilder();
      } else {
        return deviceRegistry_ == null ?
            com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
      }
    }
    /**
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder> 
        getDeviceRegistryFieldBuilder() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder>(
                getDeviceRegistry(),
                getParentForChildren(),
                isClean());
        deviceRegistry_ = null;
      }
      return deviceRegistryBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.CreateDeviceRegistryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.CreateDeviceRegistryRequest)
  private static final com.google.cloud.iot.v1.CreateDeviceRegistryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.CreateDeviceRegistryRequest();
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeviceRegistryRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDeviceRegistryRequest>() {
    public CreateDeviceRegistryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateDeviceRegistryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateDeviceRegistryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeviceRegistryRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

