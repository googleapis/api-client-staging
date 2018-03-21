// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

/**
 * <pre>
 * Explicit content annotation (based on per-frame visual signals only).
 * If no explicit content has been detected in a frame, no annotations are
 * present for that frame.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation}
 */
public  final class ExplicitContentAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)
    ExplicitContentAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExplicitContentAnnotation.newBuilder() to construct.
  private ExplicitContentAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExplicitContentAnnotation() {
    frames_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExplicitContentAnnotation(
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
              frames_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame>();
              mutable_bitField0_ |= 0x00000001;
            }
            frames_.add(
                input.readMessage(com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.parser(), extensionRegistry));
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
        frames_ = java.util.Collections.unmodifiableList(frames_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_ExplicitContentAnnotation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_ExplicitContentAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.class, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.Builder.class);
  }

  public static final int FRAMES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame> frames_;
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
   */
  public java.util.List<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame> getFramesList() {
    return frames_;
  }
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder> 
      getFramesOrBuilderList() {
    return frames_;
  }
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
   */
  public int getFramesCount() {
    return frames_.size();
  }
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
   */
  public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame getFrames(int index) {
    return frames_.get(index);
  }
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
   */
  public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder getFramesOrBuilder(
      int index) {
    return frames_.get(index);
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
    for (int i = 0; i < frames_.size(); i++) {
      output.writeMessage(1, frames_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < frames_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, frames_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation other = (com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation) obj;

    boolean result = true;
    result = result && getFramesList()
        .equals(other.getFramesList());
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
    if (getFramesCount() > 0) {
      hash = (37 * hash) + FRAMES_FIELD_NUMBER;
      hash = (53 * hash) + getFramesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation prototype) {
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
   * Explicit content annotation (based on per-frame visual signals only).
   * If no explicit content has been detected in a frame, no annotations are
   * present for that frame.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)
      com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_ExplicitContentAnnotation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_ExplicitContentAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.class, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.newBuilder()
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
        getFramesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (framesBuilder_ == null) {
        frames_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        framesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_ExplicitContentAnnotation_descriptor;
    }

    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation build() {
      com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation result = new com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation(this);
      int from_bitField0_ = bitField0_;
      if (framesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          frames_ = java.util.Collections.unmodifiableList(frames_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.frames_ = frames_;
      } else {
        result.frames_ = framesBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation) {
        return mergeFrom((com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation other) {
      if (other == com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation.getDefaultInstance()) return this;
      if (framesBuilder_ == null) {
        if (!other.frames_.isEmpty()) {
          if (frames_.isEmpty()) {
            frames_ = other.frames_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFramesIsMutable();
            frames_.addAll(other.frames_);
          }
          onChanged();
        }
      } else {
        if (!other.frames_.isEmpty()) {
          if (framesBuilder_.isEmpty()) {
            framesBuilder_.dispose();
            framesBuilder_ = null;
            frames_ = other.frames_;
            bitField0_ = (bitField0_ & ~0x00000001);
            framesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFramesFieldBuilder() : null;
          } else {
            framesBuilder_.addAllMessages(other.frames_);
          }
        }
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
      com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame> frames_ =
      java.util.Collections.emptyList();
    private void ensureFramesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        frames_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame>(frames_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder> framesBuilder_;

    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame> getFramesList() {
      if (framesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(frames_);
      } else {
        return framesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public int getFramesCount() {
      if (framesBuilder_ == null) {
        return frames_.size();
      } else {
        return framesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame getFrames(int index) {
      if (framesBuilder_ == null) {
        return frames_.get(index);
      } else {
        return framesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder setFrames(
        int index, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame value) {
      if (framesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFramesIsMutable();
        frames_.set(index, value);
        onChanged();
      } else {
        framesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder setFrames(
        int index, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder builderForValue) {
      if (framesBuilder_ == null) {
        ensureFramesIsMutable();
        frames_.set(index, builderForValue.build());
        onChanged();
      } else {
        framesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder addFrames(com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame value) {
      if (framesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFramesIsMutable();
        frames_.add(value);
        onChanged();
      } else {
        framesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder addFrames(
        int index, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame value) {
      if (framesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFramesIsMutable();
        frames_.add(index, value);
        onChanged();
      } else {
        framesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder addFrames(
        com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder builderForValue) {
      if (framesBuilder_ == null) {
        ensureFramesIsMutable();
        frames_.add(builderForValue.build());
        onChanged();
      } else {
        framesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder addFrames(
        int index, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder builderForValue) {
      if (framesBuilder_ == null) {
        ensureFramesIsMutable();
        frames_.add(index, builderForValue.build());
        onChanged();
      } else {
        framesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder addAllFrames(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame> values) {
      if (framesBuilder_ == null) {
        ensureFramesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, frames_);
        onChanged();
      } else {
        framesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder clearFrames() {
      if (framesBuilder_ == null) {
        frames_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        framesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public Builder removeFrames(int index) {
      if (framesBuilder_ == null) {
        ensureFramesIsMutable();
        frames_.remove(index);
        onChanged();
      } else {
        framesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder getFramesBuilder(
        int index) {
      return getFramesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder getFramesOrBuilder(
        int index) {
      if (framesBuilder_ == null) {
        return frames_.get(index);  } else {
        return framesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder> 
         getFramesOrBuilderList() {
      if (framesBuilder_ != null) {
        return framesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(frames_);
      }
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder addFramesBuilder() {
      return getFramesFieldBuilder().addBuilder(
          com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.getDefaultInstance());
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder addFramesBuilder(
        int index) {
      return getFramesFieldBuilder().addBuilder(
          index, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.getDefaultInstance());
    }
    /**
     * <pre>
     * All video frames where explicit content was detected.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame frames = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder> 
         getFramesBuilderList() {
      return getFramesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder> 
        getFramesFieldBuilder() {
      if (framesBuilder_ == null) {
        framesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame.Builder, com.google.cloud.videointelligence.v1p1beta1.ExplicitContentFrameOrBuilder>(
                frames_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        frames_ = null;
      }
      return framesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation)
  private static final com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplicitContentAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<ExplicitContentAnnotation>() {
    public ExplicitContentAnnotation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExplicitContentAnnotation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExplicitContentAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplicitContentAnnotation> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1p1beta1.ExplicitContentAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

