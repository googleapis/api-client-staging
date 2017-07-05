// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/context.proto

package com.google.api;

/**
 * <pre>
 * A context rule provides information about the context for an individual API
 * element.
 * </pre>
 *
 * Protobuf type {@code google.api.ContextRule}
 */
public  final class ContextRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.ContextRule)
    ContextRuleOrBuilder {
  // Use ContextRule.newBuilder() to construct.
  private ContextRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContextRule() {
    selector_ = "";
    requested_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    provided_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ContextRule(
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

            selector_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              requested_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            requested_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              provided_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            provided_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        requested_ = requested_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        provided_ = provided_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.ContextRule.class, com.google.api.ContextRule.Builder.class);
  }

  private int bitField0_;
  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object selector_;
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTED_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList requested_;
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getRequestedList() {
    return requested_;
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   */
  public int getRequestedCount() {
    return requested_.size();
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   */
  public java.lang.String getRequested(int index) {
    return requested_.get(index);
  }
  /**
   * <pre>
   * A list of full type names of requested contexts.
   * </pre>
   *
   * <code>repeated string requested = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRequestedBytes(int index) {
    return requested_.getByteString(index);
  }

  public static final int PROVIDED_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList provided_;
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getProvidedList() {
    return provided_;
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   */
  public int getProvidedCount() {
    return provided_.size();
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   */
  public java.lang.String getProvided(int index) {
    return provided_.get(index);
  }
  /**
   * <pre>
   * A list of full type names of provided contexts.
   * </pre>
   *
   * <code>repeated string provided = 3;</code>
   */
  public com.google.protobuf.ByteString
      getProvidedBytes(int index) {
    return provided_.getByteString(index);
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
    if (!getSelectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    for (int i = 0; i < requested_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requested_.getRaw(i));
    }
    for (int i = 0; i < provided_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, provided_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < requested_.size(); i++) {
        dataSize += computeStringSizeNoTag(requested_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRequestedList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < provided_.size(); i++) {
        dataSize += computeStringSizeNoTag(provided_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProvidedList().size();
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
    if (!(obj instanceof com.google.api.ContextRule)) {
      return super.equals(obj);
    }
    com.google.api.ContextRule other = (com.google.api.ContextRule) obj;

    boolean result = true;
    result = result && getSelector()
        .equals(other.getSelector());
    result = result && getRequestedList()
        .equals(other.getRequestedList());
    result = result && getProvidedList()
        .equals(other.getProvidedList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    if (getRequestedCount() > 0) {
      hash = (37 * hash) + REQUESTED_FIELD_NUMBER;
      hash = (53 * hash) + getRequestedList().hashCode();
    }
    if (getProvidedCount() > 0) {
      hash = (37 * hash) + PROVIDED_FIELD_NUMBER;
      hash = (53 * hash) + getProvidedList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.ContextRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.ContextRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.ContextRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.ContextRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.ContextRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.ContextRule parseFrom(
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
  public static Builder newBuilder(com.google.api.ContextRule prototype) {
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
   * A context rule provides information about the context for an individual API
   * element.
   * </pre>
   *
   * Protobuf type {@code google.api.ContextRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.ContextRule)
      com.google.api.ContextRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.ContextRule.class, com.google.api.ContextRule.Builder.class);
    }

    // Construct using com.google.api.ContextRule.newBuilder()
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
      selector_ = "";

      requested_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      provided_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    public com.google.api.ContextRule getDefaultInstanceForType() {
      return com.google.api.ContextRule.getDefaultInstance();
    }

    public com.google.api.ContextRule build() {
      com.google.api.ContextRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.ContextRule buildPartial() {
      com.google.api.ContextRule result = new com.google.api.ContextRule(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.selector_ = selector_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        requested_ = requested_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.requested_ = requested_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        provided_ = provided_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.provided_ = provided_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.api.ContextRule) {
        return mergeFrom((com.google.api.ContextRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.ContextRule other) {
      if (other == com.google.api.ContextRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      if (!other.requested_.isEmpty()) {
        if (requested_.isEmpty()) {
          requested_ = other.requested_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureRequestedIsMutable();
          requested_.addAll(other.requested_);
        }
        onChanged();
      }
      if (!other.provided_.isEmpty()) {
        if (provided_.isEmpty()) {
          provided_ = other.provided_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureProvidedIsMutable();
          provided_.addAll(other.provided_);
        }
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
      com.google.api.ContextRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.ContextRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>optional string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList requested_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRequestedIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        requested_ = new com.google.protobuf.LazyStringArrayList(requested_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getRequestedList() {
      return requested_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public int getRequestedCount() {
      return requested_.size();
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public java.lang.String getRequested(int index) {
      return requested_.get(index);
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRequestedBytes(int index) {
      return requested_.getByteString(index);
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public Builder setRequested(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestedIsMutable();
      requested_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public Builder addRequested(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestedIsMutable();
      requested_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public Builder addAllRequested(
        java.lang.Iterable<java.lang.String> values) {
      ensureRequestedIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, requested_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public Builder clearRequested() {
      requested_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of requested contexts.
     * </pre>
     *
     * <code>repeated string requested = 2;</code>
     */
    public Builder addRequestedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRequestedIsMutable();
      requested_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList provided_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureProvidedIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        provided_ = new com.google.protobuf.LazyStringArrayList(provided_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getProvidedList() {
      return provided_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public int getProvidedCount() {
      return provided_.size();
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public java.lang.String getProvided(int index) {
      return provided_.get(index);
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public com.google.protobuf.ByteString
        getProvidedBytes(int index) {
      return provided_.getByteString(index);
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public Builder setProvided(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProvidedIsMutable();
      provided_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public Builder addProvided(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProvidedIsMutable();
      provided_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public Builder addAllProvided(
        java.lang.Iterable<java.lang.String> values) {
      ensureProvidedIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, provided_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public Builder clearProvided() {
      provided_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of full type names of provided contexts.
     * </pre>
     *
     * <code>repeated string provided = 3;</code>
     */
    public Builder addProvidedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureProvidedIsMutable();
      provided_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.api.ContextRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.ContextRule)
  private static final com.google.api.ContextRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.ContextRule();
  }

  public static com.google.api.ContextRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContextRule>
      PARSER = new com.google.protobuf.AbstractParser<ContextRule>() {
    public ContextRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ContextRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContextRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContextRule> getParserForType() {
    return PARSER;
  }

  public com.google.api.ContextRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

