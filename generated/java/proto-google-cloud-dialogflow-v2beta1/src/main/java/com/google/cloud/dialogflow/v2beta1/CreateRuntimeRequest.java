// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/runtime.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for [Runtimes.CreateRuntime].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateRuntimeRequest}
 */
public  final class CreateRuntimeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)
    CreateRuntimeRequestOrBuilder {
  // Use CreateRuntimeRequest.newBuilder() to construct.
  private CreateRuntimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRuntimeRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateRuntimeRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.dialogflow.v2beta1.Runtime.Builder subBuilder = null;
            if (runtime_ != null) {
              subBuilder = runtime_.toBuilder();
            }
            runtime_ = input.readMessage(com.google.cloud.dialogflow.v2beta1.Runtime.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(runtime_);
              runtime_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.v2beta1.RuntimeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateRuntimeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.RuntimeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateRuntimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.class, com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The agent to create a runtime for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
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
   * Required. The agent to create a runtime for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
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

  public static final int RUNTIME_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.Runtime runtime_;
  /**
   * <pre>
   * Required. The runtime to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
   */
  public boolean hasRuntime() {
    return runtime_ != null;
  }
  /**
   * <pre>
   * Required. The runtime to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.Runtime getRuntime() {
    return runtime_ == null ? com.google.cloud.dialogflow.v2beta1.Runtime.getDefaultInstance() : runtime_;
  }
  /**
   * <pre>
   * Required. The runtime to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder getRuntimeOrBuilder() {
    return getRuntime();
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
    if (runtime_ != null) {
      output.writeMessage(2, getRuntime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (runtime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRuntime());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest other = (com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasRuntime() == other.hasRuntime());
    if (hasRuntime()) {
      result = result && getRuntime()
          .equals(other.getRuntime());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasRuntime()) {
      hash = (37 * hash) + RUNTIME_FIELD_NUMBER;
      hash = (53 * hash) + getRuntime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest prototype) {
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
   * The request message for [Runtimes.CreateRuntime].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateRuntimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)
      com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.RuntimeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateRuntimeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.RuntimeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateRuntimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.class, com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.newBuilder()
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

      if (runtimeBuilder_ == null) {
        runtime_ = null;
      } else {
        runtime_ = null;
        runtimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.RuntimeProto.internal_static_google_cloud_dialogflow_v2beta1_CreateRuntimeRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest result = new com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest(this);
      result.parent_ = parent_;
      if (runtimeBuilder_ == null) {
        result.runtime_ = runtime_;
      } else {
        result.runtime_ = runtimeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasRuntime()) {
        mergeRuntime(other.getRuntime());
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
      com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest) e.getUnfinishedMessage();
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
     * Required. The agent to create a runtime for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The agent to create a runtime for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The agent to create a runtime for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The agent to create a runtime for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The agent to create a runtime for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
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

    private com.google.cloud.dialogflow.v2beta1.Runtime runtime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Runtime, com.google.cloud.dialogflow.v2beta1.Runtime.Builder, com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder> runtimeBuilder_;
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public boolean hasRuntime() {
      return runtimeBuilder_ != null || runtime_ != null;
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Runtime getRuntime() {
      if (runtimeBuilder_ == null) {
        return runtime_ == null ? com.google.cloud.dialogflow.v2beta1.Runtime.getDefaultInstance() : runtime_;
      } else {
        return runtimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public Builder setRuntime(com.google.cloud.dialogflow.v2beta1.Runtime value) {
      if (runtimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runtime_ = value;
        onChanged();
      } else {
        runtimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public Builder setRuntime(
        com.google.cloud.dialogflow.v2beta1.Runtime.Builder builderForValue) {
      if (runtimeBuilder_ == null) {
        runtime_ = builderForValue.build();
        onChanged();
      } else {
        runtimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public Builder mergeRuntime(com.google.cloud.dialogflow.v2beta1.Runtime value) {
      if (runtimeBuilder_ == null) {
        if (runtime_ != null) {
          runtime_ =
            com.google.cloud.dialogflow.v2beta1.Runtime.newBuilder(runtime_).mergeFrom(value).buildPartial();
        } else {
          runtime_ = value;
        }
        onChanged();
      } else {
        runtimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public Builder clearRuntime() {
      if (runtimeBuilder_ == null) {
        runtime_ = null;
        onChanged();
      } else {
        runtime_ = null;
        runtimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Runtime.Builder getRuntimeBuilder() {
      
      onChanged();
      return getRuntimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder getRuntimeOrBuilder() {
      if (runtimeBuilder_ != null) {
        return runtimeBuilder_.getMessageOrBuilder();
      } else {
        return runtime_ == null ?
            com.google.cloud.dialogflow.v2beta1.Runtime.getDefaultInstance() : runtime_;
      }
    }
    /**
     * <pre>
     * Required. The runtime to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Runtime runtime = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Runtime, com.google.cloud.dialogflow.v2beta1.Runtime.Builder, com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder> 
        getRuntimeFieldBuilder() {
      if (runtimeBuilder_ == null) {
        runtimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Runtime, com.google.cloud.dialogflow.v2beta1.Runtime.Builder, com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder>(
                getRuntime(),
                getParentForChildren(),
                isClean());
        runtime_ = null;
      }
      return runtimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateRuntimeRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRuntimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRuntimeRequest>() {
    public CreateRuntimeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateRuntimeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRuntimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRuntimeRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.CreateRuntimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

