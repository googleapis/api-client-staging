// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The description of a dynamic collection of monitored resources. Each group
 * has a filter that is matched against monitored resources and their associated
 * metadata. If a group's filter matches an available monitored resource, then
 * that resource is a member of that group.  Groups can contain any number of
 * monitored resources, and each monitored resource can be a member of any
 * number of groups.
 * Groups can be nested in parent-child hierarchies. The `parentName` field
 * identifies an optional parent for each group.  If a group has a parent, then
 * the only monitored resources available to be matched by the group's filter
 * are the resources contained in the parent group.  In other words, a group
 * contains the monitored resources that match its filter and the filters of all
 * the group's ancestors.  A group without a parent can contain any monitored
 * resource.
 * For example, consider an infrastructure running a set of instances with two
 * user-defined tags: `"environment"` and `"role"`. A parent group has a filter,
 * `environment="production"`.  A child of that parent group has a filter,
 * `role="transcoder"`.  The parent group contains all instances in the
 * production environment, regardless of their roles.  The child group contains
 * instances that have the transcoder role *and* are in the production
 * environment.
 * The monitored resources contained in a group can change at any moment,
 * depending on what resources exist and what filters are associated with the
 * group and its ancestors.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.Group}
 */
public  final class Group extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.Group)
    GroupOrBuilder {
  // Use Group.newBuilder() to construct.
  private Group(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Group() {
    name_ = "";
    displayName_ = "";
    parentName_ = "";
    filter_ = "";
    isCluster_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Group(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            displayName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            parentName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 48: {

            isCluster_ = input.readBool();
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
    return com.google.monitoring.v3.GroupProto.internal_static_google_monitoring_v3_Group_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.GroupProto.internal_static_google_monitoring_v3_Group_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.Group.class, com.google.monitoring.v3.Group.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. The name of this group. The format is
   * `"projects/{project_id_or_number}/groups/{group_id}"`.
   * When creating a group, this field is ignored and a new name is created
   * consisting of the project specified in the call to `CreateGroup`
   * and a unique `{group_id}` that is generated automatically.
   * </pre>
   *
   * <code>optional string name = 1;</code>
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
   * Output only. The name of this group. The format is
   * `"projects/{project_id_or_number}/groups/{group_id}"`.
   * When creating a group, this field is ignored and a new name is created
   * consisting of the project specified in the call to `CreateGroup`
   * and a unique `{group_id}` that is generated automatically.
   * </pre>
   *
   * <code>optional string name = 1;</code>
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * A user-assigned name for this group, used only for display purposes.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A user-assigned name for this group, used only for display purposes.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object parentName_;
  /**
   * <pre>
   * The name of the group's parent, if it has one.
   * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
   * For groups with no parent, `parentName` is the empty string, `""`.
   * </pre>
   *
   * <code>optional string parent_name = 3;</code>
   */
  public java.lang.String getParentName() {
    java.lang.Object ref = parentName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the group's parent, if it has one.
   * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
   * For groups with no parent, `parentName` is the empty string, `""`.
   * </pre>
   *
   * <code>optional string parent_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getParentNameBytes() {
    java.lang.Object ref = parentName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 5;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * The filter used to determine which monitored resources belong to this group.
   * </pre>
   *
   * <code>optional string filter = 5;</code>
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
   * The filter used to determine which monitored resources belong to this group.
   * </pre>
   *
   * <code>optional string filter = 5;</code>
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

  public static final int IS_CLUSTER_FIELD_NUMBER = 6;
  private boolean isCluster_;
  /**
   * <pre>
   * If true, the members of this group are considered to be a cluster.
   * The system can perform additional analysis on groups that are clusters.
   * </pre>
   *
   * <code>optional bool is_cluster = 6;</code>
   */
  public boolean getIsCluster() {
    return isCluster_;
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
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!getParentNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, parentName_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, filter_);
    }
    if (isCluster_ != false) {
      output.writeBool(6, isCluster_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!getParentNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, parentName_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, filter_);
    }
    if (isCluster_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isCluster_);
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
    if (!(obj instanceof com.google.monitoring.v3.Group)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.Group other = (com.google.monitoring.v3.Group) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDisplayName()
        .equals(other.getDisplayName());
    result = result && getParentName()
        .equals(other.getParentName());
    result = result && getFilter()
        .equals(other.getFilter());
    result = result && (getIsCluster()
        == other.getIsCluster());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + PARENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getParentName().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + IS_CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCluster());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.Group parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.Group parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.Group parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.Group parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.Group parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.Group parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.Group parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.Group parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.Group parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.Group parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.Group prototype) {
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
   * The description of a dynamic collection of monitored resources. Each group
   * has a filter that is matched against monitored resources and their associated
   * metadata. If a group's filter matches an available monitored resource, then
   * that resource is a member of that group.  Groups can contain any number of
   * monitored resources, and each monitored resource can be a member of any
   * number of groups.
   * Groups can be nested in parent-child hierarchies. The `parentName` field
   * identifies an optional parent for each group.  If a group has a parent, then
   * the only monitored resources available to be matched by the group's filter
   * are the resources contained in the parent group.  In other words, a group
   * contains the monitored resources that match its filter and the filters of all
   * the group's ancestors.  A group without a parent can contain any monitored
   * resource.
   * For example, consider an infrastructure running a set of instances with two
   * user-defined tags: `"environment"` and `"role"`. A parent group has a filter,
   * `environment="production"`.  A child of that parent group has a filter,
   * `role="transcoder"`.  The parent group contains all instances in the
   * production environment, regardless of their roles.  The child group contains
   * instances that have the transcoder role *and* are in the production
   * environment.
   * The monitored resources contained in a group can change at any moment,
   * depending on what resources exist and what filters are associated with the
   * group and its ancestors.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.Group}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.Group)
      com.google.monitoring.v3.GroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.GroupProto.internal_static_google_monitoring_v3_Group_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.GroupProto.internal_static_google_monitoring_v3_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.Group.class, com.google.monitoring.v3.Group.Builder.class);
    }

    // Construct using com.google.monitoring.v3.Group.newBuilder()
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

      displayName_ = "";

      parentName_ = "";

      filter_ = "";

      isCluster_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.GroupProto.internal_static_google_monitoring_v3_Group_descriptor;
    }

    public com.google.monitoring.v3.Group getDefaultInstanceForType() {
      return com.google.monitoring.v3.Group.getDefaultInstance();
    }

    public com.google.monitoring.v3.Group build() {
      com.google.monitoring.v3.Group result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.Group buildPartial() {
      com.google.monitoring.v3.Group result = new com.google.monitoring.v3.Group(this);
      result.name_ = name_;
      result.displayName_ = displayName_;
      result.parentName_ = parentName_;
      result.filter_ = filter_;
      result.isCluster_ = isCluster_;
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
      if (other instanceof com.google.monitoring.v3.Group) {
        return mergeFrom((com.google.monitoring.v3.Group)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.Group other) {
      if (other == com.google.monitoring.v3.Group.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getParentName().isEmpty()) {
        parentName_ = other.parentName_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getIsCluster() != false) {
        setIsCluster(other.getIsCluster());
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
      com.google.monitoring.v3.Group parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.Group) e.getUnfinishedMessage();
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
     * Output only. The name of this group. The format is
     * `"projects/{project_id_or_number}/groups/{group_id}"`.
     * When creating a group, this field is ignored and a new name is created
     * consisting of the project specified in the call to `CreateGroup`
     * and a unique `{group_id}` that is generated automatically.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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
     * Output only. The name of this group. The format is
     * `"projects/{project_id_or_number}/groups/{group_id}"`.
     * When creating a group, this field is ignored and a new name is created
     * consisting of the project specified in the call to `CreateGroup`
     * and a unique `{group_id}` that is generated automatically.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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
     * Output only. The name of this group. The format is
     * `"projects/{project_id_or_number}/groups/{group_id}"`.
     * When creating a group, this field is ignored and a new name is created
     * consisting of the project specified in the call to `CreateGroup`
     * and a unique `{group_id}` that is generated automatically.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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
     * Output only. The name of this group. The format is
     * `"projects/{project_id_or_number}/groups/{group_id}"`.
     * When creating a group, this field is ignored and a new name is created
     * consisting of the project specified in the call to `CreateGroup`
     * and a unique `{group_id}` that is generated automatically.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The name of this group. The format is
     * `"projects/{project_id_or_number}/groups/{group_id}"`.
     * When creating a group, this field is ignored and a new name is created
     * consisting of the project specified in the call to `CreateGroup`
     * and a unique `{group_id}` that is generated automatically.
     * </pre>
     *
     * <code>optional string name = 1;</code>
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

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * A user-assigned name for this group, used only for display purposes.
     * </pre>
     *
     * <code>optional string display_name = 2;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A user-assigned name for this group, used only for display purposes.
     * </pre>
     *
     * <code>optional string display_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A user-assigned name for this group, used only for display purposes.
     * </pre>
     *
     * <code>optional string display_name = 2;</code>
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A user-assigned name for this group, used only for display purposes.
     * </pre>
     *
     * <code>optional string display_name = 2;</code>
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A user-assigned name for this group, used only for display purposes.
     * </pre>
     *
     * <code>optional string display_name = 2;</code>
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parentName_ = "";
    /**
     * <pre>
     * The name of the group's parent, if it has one.
     * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
     * For groups with no parent, `parentName` is the empty string, `""`.
     * </pre>
     *
     * <code>optional string parent_name = 3;</code>
     */
    public java.lang.String getParentName() {
      java.lang.Object ref = parentName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the group's parent, if it has one.
     * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
     * For groups with no parent, `parentName` is the empty string, `""`.
     * </pre>
     *
     * <code>optional string parent_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getParentNameBytes() {
      java.lang.Object ref = parentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the group's parent, if it has one.
     * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
     * For groups with no parent, `parentName` is the empty string, `""`.
     * </pre>
     *
     * <code>optional string parent_name = 3;</code>
     */
    public Builder setParentName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parentName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the group's parent, if it has one.
     * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
     * For groups with no parent, `parentName` is the empty string, `""`.
     * </pre>
     *
     * <code>optional string parent_name = 3;</code>
     */
    public Builder clearParentName() {
      
      parentName_ = getDefaultInstance().getParentName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the group's parent, if it has one.
     * The format is `"projects/{project_id_or_number}/groups/{group_id}"`.
     * For groups with no parent, `parentName` is the empty string, `""`.
     * </pre>
     *
     * <code>optional string parent_name = 3;</code>
     */
    public Builder setParentNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parentName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * The filter used to determine which monitored resources belong to this group.
     * </pre>
     *
     * <code>optional string filter = 5;</code>
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
     * The filter used to determine which monitored resources belong to this group.
     * </pre>
     *
     * <code>optional string filter = 5;</code>
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
     * The filter used to determine which monitored resources belong to this group.
     * </pre>
     *
     * <code>optional string filter = 5;</code>
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
     * The filter used to determine which monitored resources belong to this group.
     * </pre>
     *
     * <code>optional string filter = 5;</code>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The filter used to determine which monitored resources belong to this group.
     * </pre>
     *
     * <code>optional string filter = 5;</code>
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

    private boolean isCluster_ ;
    /**
     * <pre>
     * If true, the members of this group are considered to be a cluster.
     * The system can perform additional analysis on groups that are clusters.
     * </pre>
     *
     * <code>optional bool is_cluster = 6;</code>
     */
    public boolean getIsCluster() {
      return isCluster_;
    }
    /**
     * <pre>
     * If true, the members of this group are considered to be a cluster.
     * The system can perform additional analysis on groups that are clusters.
     * </pre>
     *
     * <code>optional bool is_cluster = 6;</code>
     */
    public Builder setIsCluster(boolean value) {
      
      isCluster_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the members of this group are considered to be a cluster.
     * The system can perform additional analysis on groups that are clusters.
     * </pre>
     *
     * <code>optional bool is_cluster = 6;</code>
     */
    public Builder clearIsCluster() {
      
      isCluster_ = false;
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


    public final Builder setNameWithGroupName(com.google.monitoring.v3.GroupName value) {
      if (value == null) {
        return setName("");
      }
      return setName(value.toString());
    }
    
    public final com.google.monitoring.v3.GroupName getNameAsGroupName() {
      java.lang.String str = getName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.monitoring.v3.GroupName.parse(str);
    }
    public final Builder setParentNameWithGroupName(com.google.monitoring.v3.GroupName value) {
      if (value == null) {
        return setParentName("");
      }
      return setParentName(value.toString());
    }
    
    public final com.google.monitoring.v3.GroupName getParentNameAsGroupName() {
      java.lang.String str = getParentName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.monitoring.v3.GroupName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.Group)
  }

  public final com.google.monitoring.v3.GroupName getNameAsGroupName() {
    java.lang.String str = getName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.monitoring.v3.GroupName.parse(str);
  }
  public final com.google.monitoring.v3.GroupName getParentNameAsGroupName() {
    java.lang.String str = getParentName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.monitoring.v3.GroupName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.monitoring.v3.Group)
  private static final com.google.monitoring.v3.Group DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.Group();
  }

  public static com.google.monitoring.v3.Group getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Group>
      PARSER = new com.google.protobuf.AbstractParser<Group>() {
    public Group parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Group(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Group> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Group> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.Group getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

