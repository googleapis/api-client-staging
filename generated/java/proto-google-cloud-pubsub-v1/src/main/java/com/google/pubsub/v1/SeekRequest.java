// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the `Seek` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.SeekRequest}
 */
public  final class SeekRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.SeekRequest)
    SeekRequestOrBuilder {
  // Use SeekRequest.newBuilder() to construct.
  private SeekRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeekRequest() {
    subscription_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SeekRequest(
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

            subscription_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (targetCase_ == 2) {
              subBuilder = ((com.google.protobuf.Timestamp) target_).toBuilder();
            }
            target_ =
                input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.protobuf.Timestamp) target_);
              target_ = subBuilder.buildPartial();
            }
            targetCase_ = 2;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            targetCase_ = 3;
            target_ = s;
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
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_SeekRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_SeekRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.SeekRequest.class, com.google.pubsub.v1.SeekRequest.Builder.class);
  }

  private int targetCase_ = 0;
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite {
    TIME(2),
    SNAPSHOT(3),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 2: return TIME;
        case 3: return SNAPSHOT;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscription_;
  /**
   * <pre>
   * The subscription to affect.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The subscription to affect.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  public com.google.protobuf.Timestamp getTime() {
    if (targetCase_ == 2) {
       return (com.google.protobuf.Timestamp) target_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    if (targetCase_ == 2) {
       return (com.google.protobuf.Timestamp) target_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   */
  public java.lang.String getSnapshot() {
    java.lang.Object ref = "";
    if (targetCase_ == 3) {
      ref = target_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (targetCase_ == 3) {
        target_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSnapshotBytes() {
    java.lang.Object ref = "";
    if (targetCase_ == 3) {
      ref = target_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (targetCase_ == 3) {
        target_ = b;
      }
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
    if (!getSubscriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    if (targetCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Timestamp) target_);
    }
    if (targetCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    if (targetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.Timestamp) target_);
    }
    if (targetCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
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
    if (!(obj instanceof com.google.pubsub.v1.SeekRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.SeekRequest other = (com.google.pubsub.v1.SeekRequest) obj;

    boolean result = true;
    result = result && getSubscription()
        .equals(other.getSubscription());
    result = result && getTargetCase().equals(
        other.getTargetCase());
    if (!result) return false;
    switch (targetCase_) {
      case 2:
        result = result && getTime()
            .equals(other.getTime());
        break;
      case 3:
        result = result && getSnapshot()
            .equals(other.getSnapshot());
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    switch (targetCase_) {
      case 2:
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
        break;
      case 3:
        hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
        hash = (53 * hash) + getSnapshot().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.SeekRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.SeekRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.SeekRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.SeekRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.SeekRequest prototype) {
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
   * Request for the `Seek` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.SeekRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.SeekRequest)
      com.google.pubsub.v1.SeekRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_SeekRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_SeekRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.SeekRequest.class, com.google.pubsub.v1.SeekRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.SeekRequest.newBuilder()
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
      subscription_ = "";

      targetCase_ = 0;
      target_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_SeekRequest_descriptor;
    }

    public com.google.pubsub.v1.SeekRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.SeekRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.SeekRequest build() {
      com.google.pubsub.v1.SeekRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.SeekRequest buildPartial() {
      com.google.pubsub.v1.SeekRequest result = new com.google.pubsub.v1.SeekRequest(this);
      result.subscription_ = subscription_;
      if (targetCase_ == 2) {
        if (timeBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = timeBuilder_.build();
        }
      }
      if (targetCase_ == 3) {
        result.target_ = target_;
      }
      result.targetCase_ = targetCase_;
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
      if (other instanceof com.google.pubsub.v1.SeekRequest) {
        return mergeFrom((com.google.pubsub.v1.SeekRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.SeekRequest other) {
      if (other == com.google.pubsub.v1.SeekRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
      }
      switch (other.getTargetCase()) {
        case TIME: {
          mergeTime(other.getTime());
          break;
        }
        case SNAPSHOT: {
          targetCase_ = 3;
          target_ = other.target_;
          onChanged();
          break;
        }
        case TARGET_NOT_SET: {
          break;
        }
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
      com.google.pubsub.v1.SeekRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.SeekRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object subscription_ = "";
    /**
     * <pre>
     * The subscription to affect.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The subscription to affect.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The subscription to affect.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription to affect.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder clearSubscription() {
      
      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The subscription to affect.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscription_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        if (targetCase_ == 2) {
          return (com.google.protobuf.Timestamp) target_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (targetCase_ == 2) {
          return timeBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (targetCase_ == 2 &&
            target_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          target_ = com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) target_)
              .mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 2) {
          timeBuilder_.mergeFrom(value);
        }
        timeBuilder_.setMessage(value);
      }
      targetCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
        }
        timeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if ((targetCase_ == 2) && (timeBuilder_ != null)) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 2) {
          return (com.google.protobuf.Timestamp) target_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The time to seek to.
     * Messages retained in the subscription that were published before this
     * time are marked as acknowledged, and messages retained in the
     * subscription that were published after this time are marked as
     * unacknowledged. Note that this operation affects only those messages
     * retained in the subscription (configured by the combination of
     * `message_retention_duration` and `retain_acked_messages`). For example,
     * if `time` corresponds to a point before the message retention
     * window (or to a point before the system's notion of the subscription
     * creation time), only retained messages will be marked as unacknowledged,
     * and already-expunged messages will not be restored.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        if (!(targetCase_ == 2)) {
          target_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 2;
      onChanged();;
      return timeBuilder_;
    }

    /**
     * <pre>
     * The snapshot to seek to. The snapshot's topic must be the same as that of
     * the provided subscription.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     */
    public java.lang.String getSnapshot() {
      java.lang.Object ref = "";
      if (targetCase_ == 3) {
        ref = target_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (targetCase_ == 3) {
          target_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The snapshot to seek to. The snapshot's topic must be the same as that of
     * the provided subscription.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSnapshotBytes() {
      java.lang.Object ref = "";
      if (targetCase_ == 3) {
        ref = target_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (targetCase_ == 3) {
          target_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The snapshot to seek to. The snapshot's topic must be the same as that of
     * the provided subscription.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     */
    public Builder setSnapshot(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  targetCase_ = 3;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The snapshot to seek to. The snapshot's topic must be the same as that of
     * the provided subscription.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     */
    public Builder clearSnapshot() {
      if (targetCase_ == 3) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The snapshot to seek to. The snapshot's topic must be the same as that of
     * the provided subscription.
     * Format is `projects/{project}/snapshots/{snap}`.
     * </pre>
     *
     * <code>string snapshot = 3;</code>
     */
    public Builder setSnapshotBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      targetCase_ = 3;
      target_ = value;
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


    public final Builder setSubscriptionWithSubscriptionName(com.google.pubsub.v1.SubscriptionName value) {
      if (value == null) {
        return setSubscription("");
      }
      return setSubscription(value.toString());
    }
    
    public final com.google.pubsub.v1.SubscriptionName getSubscriptionAsSubscriptionName() {
      java.lang.String str = getSubscription();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.pubsub.v1.SubscriptionName.parse(str);
    }
    public final Builder setSnapshotWithSnapshotName(com.google.pubsub.v1.SnapshotName value) {
      if (value == null) {
        return setSnapshot("");
      }
      return setSnapshot(value.toString());
    }
    
    public final com.google.pubsub.v1.SnapshotName getSnapshotAsSnapshotName() {
      java.lang.String str = getSnapshot();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.pubsub.v1.SnapshotName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.SeekRequest)
  }

  public final com.google.pubsub.v1.SubscriptionName getSubscriptionAsSubscriptionName() {
    java.lang.String str = getSubscription();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.pubsub.v1.SubscriptionName.parse(str);
  }
  public final com.google.pubsub.v1.SnapshotName getSnapshotAsSnapshotName() {
    java.lang.String str = getSnapshot();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.pubsub.v1.SnapshotName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.pubsub.v1.SeekRequest)
  private static final com.google.pubsub.v1.SeekRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.SeekRequest();
  }

  public static com.google.pubsub.v1.SeekRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeekRequest>
      PARSER = new com.google.protobuf.AbstractParser<SeekRequest>() {
    public SeekRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeekRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SeekRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeekRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.SeekRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

