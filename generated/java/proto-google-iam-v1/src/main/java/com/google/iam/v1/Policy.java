// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * Defines an Identity and Access Management (IAM) policy. It is used to
 * specify access control policies for Cloud Platform resources.
 * A `Policy` consists of a list of `bindings`. A `Binding` binds a list of
 * `members` to a `role`, where the members can be user accounts, Google groups,
 * Google domains, and service accounts. A `role` is a named list of permissions
 * defined by IAM.
 * **Example**
 *     {
 *       "bindings": [
 *         {
 *           "role": "roles/owner",
 *           "members": [
 *             "user:mike&#64;example.com",
 *             "group:admins&#64;example.com",
 *             "domain:google.com",
 *             "serviceAccount:my-other-app&#64;appspot.gserviceaccount.com",
 *           ]
 *         },
 *         {
 *           "role": "roles/viewer",
 *           "members": ["user:sean&#64;example.com"]
 *         }
 *       ]
 *     }
 * For a description of IAM and its features, see the
 * [IAM developer's guide](https://cloud.google.com/iam).
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.Policy}
 */
public  final class Policy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.Policy)
    PolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Policy.newBuilder() to construct.
  private Policy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Policy() {
    version_ = 0;
    bindings_ = java.util.Collections.emptyList();
    etag_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Policy(
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
          case 8: {

            version_ = input.readInt32();
            break;
          }
          case 26: {

            etag_ = input.readBytes();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              bindings_ = new java.util.ArrayList<com.google.iam.v1.Binding>();
              mutable_bitField0_ |= 0x00000002;
            }
            bindings_.add(
                input.readMessage(com.google.iam.v1.Binding.parser(), extensionRegistry));
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
        bindings_ = java.util.Collections.unmodifiableList(bindings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Policy_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Policy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v1.Policy.class, com.google.iam.v1.Policy.Builder.class);
  }

  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <pre>
   * Version of the `Policy`. The default version is 0.
   * </pre>
   *
   * <code>int32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int BINDINGS_FIELD_NUMBER = 4;
  private java.util.List<com.google.iam.v1.Binding> bindings_;
  /**
   * <pre>
   * Associates a list of `members` to a `role`.
   * Multiple `bindings` must not be specified for the same `role`.
   * `bindings` with no members will result in an error.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  public java.util.List<com.google.iam.v1.Binding> getBindingsList() {
    return bindings_;
  }
  /**
   * <pre>
   * Associates a list of `members` to a `role`.
   * Multiple `bindings` must not be specified for the same `role`.
   * `bindings` with no members will result in an error.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  public java.util.List<? extends com.google.iam.v1.BindingOrBuilder> 
      getBindingsOrBuilderList() {
    return bindings_;
  }
  /**
   * <pre>
   * Associates a list of `members` to a `role`.
   * Multiple `bindings` must not be specified for the same `role`.
   * `bindings` with no members will result in an error.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  public int getBindingsCount() {
    return bindings_.size();
  }
  /**
   * <pre>
   * Associates a list of `members` to a `role`.
   * Multiple `bindings` must not be specified for the same `role`.
   * `bindings` with no members will result in an error.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  public com.google.iam.v1.Binding getBindings(int index) {
    return bindings_.get(index);
  }
  /**
   * <pre>
   * Associates a list of `members` to a `role`.
   * Multiple `bindings` must not be specified for the same `role`.
   * `bindings` with no members will result in an error.
   * </pre>
   *
   * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
   */
  public com.google.iam.v1.BindingOrBuilder getBindingsOrBuilder(
      int index) {
    return bindings_.get(index);
  }

  public static final int ETAG_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString etag_;
  /**
   * <pre>
   * `etag` is used for optimistic concurrency control as a way to help
   * prevent simultaneous updates of a policy from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform policy updates in order to avoid race
   * conditions: An `etag` is returned in the response to `getIamPolicy`, and
   * systems are expected to put that etag in the request to `setIamPolicy` to
   * ensure that their change will be applied to the same version of the policy.
   * If no `etag` is provided in the call to `setIamPolicy`, then the existing
   * policy is overwritten blindly.
   * </pre>
   *
   * <code>bytes etag = 3;</code>
   */
  public com.google.protobuf.ByteString getEtag() {
    return etag_;
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
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (!etag_.isEmpty()) {
      output.writeBytes(3, etag_);
    }
    for (int i = 0; i < bindings_.size(); i++) {
      output.writeMessage(4, bindings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (!etag_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, etag_);
    }
    for (int i = 0; i < bindings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, bindings_.get(i));
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
    if (!(obj instanceof com.google.iam.v1.Policy)) {
      return super.equals(obj);
    }
    com.google.iam.v1.Policy other = (com.google.iam.v1.Policy) obj;

    boolean result = true;
    result = result && (getVersion()
        == other.getVersion());
    result = result && getBindingsList()
        .equals(other.getBindingsList());
    result = result && getEtag()
        .equals(other.getEtag());
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    if (getBindingsCount() > 0) {
      hash = (37 * hash) + BINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getBindingsList().hashCode();
    }
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v1.Policy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Policy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Policy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Policy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Policy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.v1.Policy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.v1.Policy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Policy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.Policy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Policy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.v1.Policy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.v1.Policy parseFrom(
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
  public static Builder newBuilder(com.google.iam.v1.Policy prototype) {
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
   * Defines an Identity and Access Management (IAM) policy. It is used to
   * specify access control policies for Cloud Platform resources.
   * A `Policy` consists of a list of `bindings`. A `Binding` binds a list of
   * `members` to a `role`, where the members can be user accounts, Google groups,
   * Google domains, and service accounts. A `role` is a named list of permissions
   * defined by IAM.
   * **Example**
   *     {
   *       "bindings": [
   *         {
   *           "role": "roles/owner",
   *           "members": [
   *             "user:mike&#64;example.com",
   *             "group:admins&#64;example.com",
   *             "domain:google.com",
   *             "serviceAccount:my-other-app&#64;appspot.gserviceaccount.com",
   *           ]
   *         },
   *         {
   *           "role": "roles/viewer",
   *           "members": ["user:sean&#64;example.com"]
   *         }
   *       ]
   *     }
   * For a description of IAM and its features, see the
   * [IAM developer's guide](https://cloud.google.com/iam).
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.Policy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.Policy)
      com.google.iam.v1.PolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Policy_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Policy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v1.Policy.class, com.google.iam.v1.Policy.Builder.class);
    }

    // Construct using com.google.iam.v1.Policy.newBuilder()
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
        getBindingsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      version_ = 0;

      if (bindingsBuilder_ == null) {
        bindings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        bindingsBuilder_.clear();
      }
      etag_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.v1.PolicyProto.internal_static_google_iam_v1_Policy_descriptor;
    }

    public com.google.iam.v1.Policy getDefaultInstanceForType() {
      return com.google.iam.v1.Policy.getDefaultInstance();
    }

    public com.google.iam.v1.Policy build() {
      com.google.iam.v1.Policy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.iam.v1.Policy buildPartial() {
      com.google.iam.v1.Policy result = new com.google.iam.v1.Policy(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.version_ = version_;
      if (bindingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          bindings_ = java.util.Collections.unmodifiableList(bindings_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.bindings_ = bindings_;
      } else {
        result.bindings_ = bindingsBuilder_.build();
      }
      result.etag_ = etag_;
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
      if (other instanceof com.google.iam.v1.Policy) {
        return mergeFrom((com.google.iam.v1.Policy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v1.Policy other) {
      if (other == com.google.iam.v1.Policy.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (bindingsBuilder_ == null) {
        if (!other.bindings_.isEmpty()) {
          if (bindings_.isEmpty()) {
            bindings_ = other.bindings_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBindingsIsMutable();
            bindings_.addAll(other.bindings_);
          }
          onChanged();
        }
      } else {
        if (!other.bindings_.isEmpty()) {
          if (bindingsBuilder_.isEmpty()) {
            bindingsBuilder_.dispose();
            bindingsBuilder_ = null;
            bindings_ = other.bindings_;
            bitField0_ = (bitField0_ & ~0x00000002);
            bindingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBindingsFieldBuilder() : null;
          } else {
            bindingsBuilder_.addAllMessages(other.bindings_);
          }
        }
      }
      if (other.getEtag() != com.google.protobuf.ByteString.EMPTY) {
        setEtag(other.getEtag());
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
      com.google.iam.v1.Policy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v1.Policy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int version_ ;
    /**
     * <pre>
     * Version of the `Policy`. The default version is 0.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Version of the `Policy`. The default version is 0.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the `Policy`. The default version is 0.
     * </pre>
     *
     * <code>int32 version = 1;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.iam.v1.Binding> bindings_ =
      java.util.Collections.emptyList();
    private void ensureBindingsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        bindings_ = new java.util.ArrayList<com.google.iam.v1.Binding>(bindings_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.iam.v1.Binding, com.google.iam.v1.Binding.Builder, com.google.iam.v1.BindingOrBuilder> bindingsBuilder_;

    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public java.util.List<com.google.iam.v1.Binding> getBindingsList() {
      if (bindingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bindings_);
      } else {
        return bindingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public int getBindingsCount() {
      if (bindingsBuilder_ == null) {
        return bindings_.size();
      } else {
        return bindingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public com.google.iam.v1.Binding getBindings(int index) {
      if (bindingsBuilder_ == null) {
        return bindings_.get(index);
      } else {
        return bindingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder setBindings(
        int index, com.google.iam.v1.Binding value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.set(index, value);
        onChanged();
      } else {
        bindingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder setBindings(
        int index, com.google.iam.v1.Binding.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.set(index, builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder addBindings(com.google.iam.v1.Binding value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.add(value);
        onChanged();
      } else {
        bindingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder addBindings(
        int index, com.google.iam.v1.Binding value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.add(index, value);
        onChanged();
      } else {
        bindingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder addBindings(
        com.google.iam.v1.Binding.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.add(builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder addBindings(
        int index, com.google.iam.v1.Binding.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.add(index, builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder addAllBindings(
        java.lang.Iterable<? extends com.google.iam.v1.Binding> values) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bindings_);
        onChanged();
      } else {
        bindingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder clearBindings() {
      if (bindingsBuilder_ == null) {
        bindings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        bindingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public Builder removeBindings(int index) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.remove(index);
        onChanged();
      } else {
        bindingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public com.google.iam.v1.Binding.Builder getBindingsBuilder(
        int index) {
      return getBindingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public com.google.iam.v1.BindingOrBuilder getBindingsOrBuilder(
        int index) {
      if (bindingsBuilder_ == null) {
        return bindings_.get(index);  } else {
        return bindingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public java.util.List<? extends com.google.iam.v1.BindingOrBuilder> 
         getBindingsOrBuilderList() {
      if (bindingsBuilder_ != null) {
        return bindingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bindings_);
      }
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public com.google.iam.v1.Binding.Builder addBindingsBuilder() {
      return getBindingsFieldBuilder().addBuilder(
          com.google.iam.v1.Binding.getDefaultInstance());
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public com.google.iam.v1.Binding.Builder addBindingsBuilder(
        int index) {
      return getBindingsFieldBuilder().addBuilder(
          index, com.google.iam.v1.Binding.getDefaultInstance());
    }
    /**
     * <pre>
     * Associates a list of `members` to a `role`.
     * Multiple `bindings` must not be specified for the same `role`.
     * `bindings` with no members will result in an error.
     * </pre>
     *
     * <code>repeated .google.iam.v1.Binding bindings = 4;</code>
     */
    public java.util.List<com.google.iam.v1.Binding.Builder> 
         getBindingsBuilderList() {
      return getBindingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.iam.v1.Binding, com.google.iam.v1.Binding.Builder, com.google.iam.v1.BindingOrBuilder> 
        getBindingsFieldBuilder() {
      if (bindingsBuilder_ == null) {
        bindingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.v1.Binding, com.google.iam.v1.Binding.Builder, com.google.iam.v1.BindingOrBuilder>(
                bindings_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        bindings_ = null;
      }
      return bindingsBuilder_;
    }

    private com.google.protobuf.ByteString etag_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * `etag` is used for optimistic concurrency control as a way to help
     * prevent simultaneous updates of a policy from overwriting each other.
     * It is strongly suggested that systems make use of the `etag` in the
     * read-modify-write cycle to perform policy updates in order to avoid race
     * conditions: An `etag` is returned in the response to `getIamPolicy`, and
     * systems are expected to put that etag in the request to `setIamPolicy` to
     * ensure that their change will be applied to the same version of the policy.
     * If no `etag` is provided in the call to `setIamPolicy`, then the existing
     * policy is overwritten blindly.
     * </pre>
     *
     * <code>bytes etag = 3;</code>
     */
    public com.google.protobuf.ByteString getEtag() {
      return etag_;
    }
    /**
     * <pre>
     * `etag` is used for optimistic concurrency control as a way to help
     * prevent simultaneous updates of a policy from overwriting each other.
     * It is strongly suggested that systems make use of the `etag` in the
     * read-modify-write cycle to perform policy updates in order to avoid race
     * conditions: An `etag` is returned in the response to `getIamPolicy`, and
     * systems are expected to put that etag in the request to `setIamPolicy` to
     * ensure that their change will be applied to the same version of the policy.
     * If no `etag` is provided in the call to `setIamPolicy`, then the existing
     * policy is overwritten blindly.
     * </pre>
     *
     * <code>bytes etag = 3;</code>
     */
    public Builder setEtag(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      etag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `etag` is used for optimistic concurrency control as a way to help
     * prevent simultaneous updates of a policy from overwriting each other.
     * It is strongly suggested that systems make use of the `etag` in the
     * read-modify-write cycle to perform policy updates in order to avoid race
     * conditions: An `etag` is returned in the response to `getIamPolicy`, and
     * systems are expected to put that etag in the request to `setIamPolicy` to
     * ensure that their change will be applied to the same version of the policy.
     * If no `etag` is provided in the call to `setIamPolicy`, then the existing
     * policy is overwritten blindly.
     * </pre>
     *
     * <code>bytes etag = 3;</code>
     */
    public Builder clearEtag() {
      
      etag_ = getDefaultInstance().getEtag();
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


    // @@protoc_insertion_point(builder_scope:google.iam.v1.Policy)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.Policy)
  private static final com.google.iam.v1.Policy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.v1.Policy();
  }

  public static com.google.iam.v1.Policy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Policy>
      PARSER = new com.google.protobuf.AbstractParser<Policy>() {
    public Policy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Policy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Policy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Policy> getParserForType() {
    return PARSER;
  }

  public com.google.iam.v1.Policy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

