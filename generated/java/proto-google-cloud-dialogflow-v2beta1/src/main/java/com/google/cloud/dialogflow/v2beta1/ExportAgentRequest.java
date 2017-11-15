// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for [Agents.ExportAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentRequest}
 */
public  final class ExportAgentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
    ExportAgentRequestOrBuilder {
  // Use ExportAgentRequest.newBuilder() to construct.
  private ExportAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportAgentRequest() {
    parent_ = "";
    agentUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ExportAgentRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            agentUri_ = s;
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
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.class, com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
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
   * Required. The project that the agent to export is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
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

  public static final int AGENT_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object agentUri_;
  /**
   * <pre>
   * Optional. The URI to export the agent to. Note: The URI must start with
   * "gs://". If left unspecified, the serialized agent is returned inline.
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  public java.lang.String getAgentUri() {
    java.lang.Object ref = agentUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The URI to export the agent to. Note: The URI must start with
   * "gs://". If left unspecified, the serialized agent is returned inline.
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAgentUriBytes() {
    java.lang.Object ref = agentUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentUri_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getAgentUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agentUri_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getAgentUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentUri_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ExportAgentRequest other = (com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && getAgentUri()
        .equals(other.getAgentUri());
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
    hash = (37 * hash) + AGENT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getAgentUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest prototype) {
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
   * The request message for [Agents.ExportAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.class, com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.newBuilder()
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

      agentUri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest build() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest result = new com.google.cloud.dialogflow.v2beta1.ExportAgentRequest(this);
      result.parent_ = parent_;
      result.agentUri_ = agentUri_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ExportAgentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ExportAgentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ExportAgentRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getAgentUri().isEmpty()) {
        agentUri_ = other.agentUri_;
        onChanged();
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
      com.google.cloud.dialogflow.v2beta1.ExportAgentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.ExportAgentRequest) e.getUnfinishedMessage();
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
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
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
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
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
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
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
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
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
     * Required. The project that the agent to export is associated with.
     * Format: `projects/&lt;Project ID&gt;`.
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

    private java.lang.Object agentUri_ = "";
    /**
     * <pre>
     * Optional. The URI to export the agent to. Note: The URI must start with
     * "gs://". If left unspecified, the serialized agent is returned inline.
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     */
    public java.lang.String getAgentUri() {
      java.lang.Object ref = agentUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The URI to export the agent to. Note: The URI must start with
     * "gs://". If left unspecified, the serialized agent is returned inline.
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAgentUriBytes() {
      java.lang.Object ref = agentUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The URI to export the agent to. Note: The URI must start with
     * "gs://". If left unspecified, the serialized agent is returned inline.
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     */
    public Builder setAgentUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      agentUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The URI to export the agent to. Note: The URI must start with
     * "gs://". If left unspecified, the serialized agent is returned inline.
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     */
    public Builder clearAgentUri() {
      
      agentUri_ = getDefaultInstance().getAgentUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The URI to export the agent to. Note: The URI must start with
     * "gs://". If left unspecified, the serialized agent is returned inline.
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     */
    public Builder setAgentUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      agentUri_ = value;
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


    public final Builder setParentWithProjectName(com.google.cloud.dialogflow.v2beta1.ProjectName value) {
      if (value == null) {
        return setParent("");
      }
      return setParent(value.toString());
    }
    
    public final com.google.cloud.dialogflow.v2beta1.ProjectName getParentAsProjectName() {
      java.lang.String str = getParent();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.cloud.dialogflow.v2beta1.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
  }

  public final com.google.cloud.dialogflow.v2beta1.ProjectName getParentAsProjectName() {
    java.lang.String str = getParent();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.cloud.dialogflow.v2beta1.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ExportAgentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.ExportAgentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ExportAgentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportAgentRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportAgentRequest>() {
    public ExportAgentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExportAgentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExportAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportAgentRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.ExportAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

