// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 * <pre>
 * Deletes all events in the project.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest}
 */
public  final class DeleteEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)
    DeleteEventsRequestOrBuilder {
  // Use DeleteEventsRequest.newBuilder() to construct.
  private DeleteEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteEventsRequest() {
    projectName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteEventsRequest(
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

            projectName_ = s;
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
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.class, com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.Builder.class);
  }

  public static final int PROJECT_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectName_;
  /**
   * <pre>
   * [Required] The resource name of the Google Cloud Platform project. Written
   * as `projects/` plus the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>string project_name = 1;</code>
   */
  public java.lang.String getProjectName() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Required] The resource name of the Google Cloud Platform project. Written
   * as `projects/` plus the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   * Example: `projects/my-project-123`.
   * </pre>
   *
   * <code>string project_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectNameBytes() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectName_ = b;
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
    if (!getProjectNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectName_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest other = (com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest) obj;

    boolean result = true;
    result = result && getProjectName()
        .equals(other.getProjectName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProjectName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest prototype) {
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
   * Deletes all events in the project.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)
      com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.class, com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.newBuilder()
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
      projectName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.getDefaultInstance();
    }

    public com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest build() {
      com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest result = new com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest(this);
      result.projectName_ = projectName_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest other) {
      if (other == com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest.getDefaultInstance()) return this;
      if (!other.getProjectName().isEmpty()) {
        projectName_ = other.projectName_;
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
      com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectName_ = "";
    /**
     * <pre>
     * [Required] The resource name of the Google Cloud Platform project. Written
     * as `projects/` plus the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     * Example: `projects/my-project-123`.
     * </pre>
     *
     * <code>string project_name = 1;</code>
     */
    public java.lang.String getProjectName() {
      java.lang.Object ref = projectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Required] The resource name of the Google Cloud Platform project. Written
     * as `projects/` plus the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     * Example: `projects/my-project-123`.
     * </pre>
     *
     * <code>string project_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectNameBytes() {
      java.lang.Object ref = projectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Required] The resource name of the Google Cloud Platform project. Written
     * as `projects/` plus the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     * Example: `projects/my-project-123`.
     * </pre>
     *
     * <code>string project_name = 1;</code>
     */
    public Builder setProjectName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Required] The resource name of the Google Cloud Platform project. Written
     * as `projects/` plus the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     * Example: `projects/my-project-123`.
     * </pre>
     *
     * <code>string project_name = 1;</code>
     */
    public Builder clearProjectName() {
      
      projectName_ = getDefaultInstance().getProjectName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Required] The resource name of the Google Cloud Platform project. Written
     * as `projects/` plus the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     * Example: `projects/my-project-123`.
     * </pre>
     *
     * <code>string project_name = 1;</code>
     */
    public Builder setProjectNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectName_ = value;
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


    public final Builder setProjectNameWithProjectName(com.google.devtools.clouderrorreporting.v1beta1.ProjectName value) {
      if (value == null) {
        return setProjectName("");
      }
      return setProjectName(value.toString());
    }
    
    public final com.google.devtools.clouderrorreporting.v1beta1.ProjectName getProjectNameAsProjectName() {
      java.lang.String str = getProjectName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.devtools.clouderrorreporting.v1beta1.ProjectName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)
  }

  public final com.google.devtools.clouderrorreporting.v1beta1.ProjectName getProjectNameAsProjectName() {
    java.lang.String str = getProjectName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.devtools.clouderrorreporting.v1beta1.ProjectName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest)
  private static final com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteEventsRequest>() {
    public DeleteEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteEventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteEventsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

