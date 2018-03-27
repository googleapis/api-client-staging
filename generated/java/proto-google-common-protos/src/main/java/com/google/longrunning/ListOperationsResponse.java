// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 * <pre>
 * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
 * </pre>
 *
 * Protobuf type {@code google.longrunning.ListOperationsResponse}
 */
public  final class ListOperationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.longrunning.ListOperationsResponse)
    ListOperationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOperationsResponse.newBuilder() to construct.
  private ListOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOperationsResponse() {
    operations_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListOperationsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operations_ = new java.util.ArrayList<com.google.longrunning.Operation>();
              mutable_bitField0_ |= 0x00000001;
            }
            operations_.add(
                input.readMessage(com.google.longrunning.Operation.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = java.util.Collections.unmodifiableList(operations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.longrunning.ListOperationsResponse.class, com.google.longrunning.ListOperationsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.longrunning.Operation> operations_;
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public java.util.List<com.google.longrunning.Operation> getOperationsList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public java.util.List<? extends com.google.longrunning.OperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public com.google.longrunning.Operation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1;</code>
   */
  public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(1, operations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operations_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.longrunning.ListOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.longrunning.ListOperationsResponse other = (com.google.longrunning.ListOperationsResponse) obj;

    boolean result = true;
    result = result && getOperationsList()
        .equals(other.getOperationsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
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
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.longrunning.ListOperationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.longrunning.ListOperationsResponse prototype) {
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
   * The response message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
   * </pre>
   *
   * Protobuf type {@code google.longrunning.ListOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.ListOperationsResponse)
      com.google.longrunning.ListOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.longrunning.ListOperationsResponse.class, com.google.longrunning.ListOperationsResponse.Builder.class);
    }

    // Construct using com.google.longrunning.ListOperationsResponse.newBuilder()
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
        getOperationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.longrunning.OperationsProto.internal_static_google_longrunning_ListOperationsResponse_descriptor;
    }

    public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
      return com.google.longrunning.ListOperationsResponse.getDefaultInstance();
    }

    public com.google.longrunning.ListOperationsResponse build() {
      com.google.longrunning.ListOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.longrunning.ListOperationsResponse buildPartial() {
      com.google.longrunning.ListOperationsResponse result = new com.google.longrunning.ListOperationsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.longrunning.ListOperationsResponse) {
        return mergeFrom((com.google.longrunning.ListOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.longrunning.ListOperationsResponse other) {
      if (other == com.google.longrunning.ListOperationsResponse.getDefaultInstance()) return this;
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.longrunning.ListOperationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.longrunning.ListOperationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.longrunning.Operation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = new java.util.ArrayList<com.google.longrunning.Operation>(operations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> operationsBuilder_;

    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<com.google.longrunning.Operation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.longrunning.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.longrunning.Operation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.OperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<? extends com.google.longrunning.OperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public com.google.longrunning.Operation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, com.google.longrunning.Operation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of operations that matches the specified filter in the request.
     * </pre>
     *
     * <code>repeated .google.longrunning.Operation operations = 1;</code>
     */
    public java.util.List<com.google.longrunning.Operation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The standard List next-page token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.longrunning.ListOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsResponse)
  private static final com.google.longrunning.ListOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.longrunning.ListOperationsResponse();
  }

  public static com.google.longrunning.ListOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOperationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOperationsResponse>() {
    public ListOperationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListOperationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOperationsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.longrunning.ListOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

