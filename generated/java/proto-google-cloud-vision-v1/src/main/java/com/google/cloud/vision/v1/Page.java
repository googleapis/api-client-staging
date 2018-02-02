// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

/**
 * <pre>
 * Detected page from OCR.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.Page}
 */
public  final class Page extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.Page)
    PageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Page.newBuilder() to construct.
  private Page(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Page() {
    width_ = 0;
    height_ = 0;
    blocks_ = java.util.Collections.emptyList();
    confidence_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Page(
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
          case 10: {
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder subBuilder = null;
            if (property_ != null) {
              subBuilder = property_.toBuilder();
            }
            property_ = input.readMessage(com.google.cloud.vision.v1.TextAnnotation.TextProperty.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(property_);
              property_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            width_ = input.readInt32();
            break;
          }
          case 24: {

            height_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              blocks_ = new java.util.ArrayList<com.google.cloud.vision.v1.Block>();
              mutable_bitField0_ |= 0x00000008;
            }
            blocks_.add(
                input.readMessage(com.google.cloud.vision.v1.Block.parser(), extensionRegistry));
            break;
          }
          case 45: {

            confidence_ = input.readFloat();
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        blocks_ = java.util.Collections.unmodifiableList(blocks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Page_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Page_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.Page.class, com.google.cloud.vision.v1.Page.Builder.class);
  }

  private int bitField0_;
  public static final int PROPERTY_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.TextAnnotation.TextProperty property_;
  /**
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public boolean hasProperty() {
    return property_ != null;
  }
  /**
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty() {
    return property_ == null ? com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
  }
  /**
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder() {
    return getProperty();
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  /**
   * <pre>
   * Page width in pixels.
   * </pre>
   *
   * <code>int32 width = 2;</code>
   */
  public int getWidth() {
    return width_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private int height_;
  /**
   * <pre>
   * Page height in pixels.
   * </pre>
   *
   * <code>int32 height = 3;</code>
   */
  public int getHeight() {
    return height_;
  }

  public static final int BLOCKS_FIELD_NUMBER = 4;
  private java.util.List<com.google.cloud.vision.v1.Block> blocks_;
  /**
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
   */
  public java.util.List<com.google.cloud.vision.v1.Block> getBlocksList() {
    return blocks_;
  }
  /**
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
   */
  public java.util.List<? extends com.google.cloud.vision.v1.BlockOrBuilder> 
      getBlocksOrBuilderList() {
    return blocks_;
  }
  /**
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
   */
  public int getBlocksCount() {
    return blocks_.size();
  }
  /**
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
   */
  public com.google.cloud.vision.v1.Block getBlocks(int index) {
    return blocks_.get(index);
  }
  /**
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
   */
  public com.google.cloud.vision.v1.BlockOrBuilder getBlocksOrBuilder(
      int index) {
    return blocks_.get(index);
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 5;
  private float confidence_;
  /**
   * <pre>
   * Confidence of the OCR results on the page. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5;</code>
   */
  public float getConfidence() {
    return confidence_;
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
    if (property_ != null) {
      output.writeMessage(1, getProperty());
    }
    if (width_ != 0) {
      output.writeInt32(2, width_);
    }
    if (height_ != 0) {
      output.writeInt32(3, height_);
    }
    for (int i = 0; i < blocks_.size(); i++) {
      output.writeMessage(4, blocks_.get(i));
    }
    if (confidence_ != 0F) {
      output.writeFloat(5, confidence_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (property_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProperty());
    }
    if (width_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, width_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, height_);
    }
    for (int i = 0; i < blocks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, blocks_.get(i));
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, confidence_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.Page)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.Page other = (com.google.cloud.vision.v1.Page) obj;

    boolean result = true;
    result = result && (hasProperty() == other.hasProperty());
    if (hasProperty()) {
      result = result && getProperty()
          .equals(other.getProperty());
    }
    result = result && (getWidth()
        == other.getWidth());
    result = result && (getHeight()
        == other.getHeight());
    result = result && getBlocksList()
        .equals(other.getBlocksList());
    result = result && (
        java.lang.Float.floatToIntBits(getConfidence())
        == java.lang.Float.floatToIntBits(
            other.getConfidence()));
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
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + getProperty().hashCode();
    }
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getWidth();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    if (getBlocksCount() > 0) {
      hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getBlocksList().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.Page parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Page parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Page parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Page parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1.Page prototype) {
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
   * Detected page from OCR.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.Page}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.Page)
      com.google.cloud.vision.v1.PageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Page_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Page_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.Page.class, com.google.cloud.vision.v1.Page.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.Page.newBuilder()
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
        getBlocksFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (propertyBuilder_ == null) {
        property_ = null;
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }
      width_ = 0;

      height_ = 0;

      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        blocksBuilder_.clear();
      }
      confidence_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Page_descriptor;
    }

    public com.google.cloud.vision.v1.Page getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.Page.getDefaultInstance();
    }

    public com.google.cloud.vision.v1.Page build() {
      com.google.cloud.vision.v1.Page result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1.Page buildPartial() {
      com.google.cloud.vision.v1.Page result = new com.google.cloud.vision.v1.Page(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (propertyBuilder_ == null) {
        result.property_ = property_;
      } else {
        result.property_ = propertyBuilder_.build();
      }
      result.width_ = width_;
      result.height_ = height_;
      if (blocksBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          blocks_ = java.util.Collections.unmodifiableList(blocks_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.blocks_ = blocks_;
      } else {
        result.blocks_ = blocksBuilder_.build();
      }
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.vision.v1.Page) {
        return mergeFrom((com.google.cloud.vision.v1.Page)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.Page other) {
      if (other == com.google.cloud.vision.v1.Page.getDefaultInstance()) return this;
      if (other.hasProperty()) {
        mergeProperty(other.getProperty());
      }
      if (other.getWidth() != 0) {
        setWidth(other.getWidth());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
      }
      if (blocksBuilder_ == null) {
        if (!other.blocks_.isEmpty()) {
          if (blocks_.isEmpty()) {
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureBlocksIsMutable();
            blocks_.addAll(other.blocks_);
          }
          onChanged();
        }
      } else {
        if (!other.blocks_.isEmpty()) {
          if (blocksBuilder_.isEmpty()) {
            blocksBuilder_.dispose();
            blocksBuilder_ = null;
            blocks_ = other.blocks_;
            bitField0_ = (bitField0_ & ~0x00000008);
            blocksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBlocksFieldBuilder() : null;
          } else {
            blocksBuilder_.addAllMessages(other.blocks_);
          }
        }
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
      com.google.cloud.vision.v1.Page parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.Page) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.cloud.vision.v1.TextAnnotation.TextProperty property_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder> propertyBuilder_;
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public boolean hasProperty() {
      return propertyBuilder_ != null || property_ != null;
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty() {
      if (propertyBuilder_ == null) {
        return property_ == null ? com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
      } else {
        return propertyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder setProperty(com.google.cloud.vision.v1.TextAnnotation.TextProperty value) {
      if (propertyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        property_ = value;
        onChanged();
      } else {
        propertyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder setProperty(
        com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder builderForValue) {
      if (propertyBuilder_ == null) {
        property_ = builderForValue.build();
        onChanged();
      } else {
        propertyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder mergeProperty(com.google.cloud.vision.v1.TextAnnotation.TextProperty value) {
      if (propertyBuilder_ == null) {
        if (property_ != null) {
          property_ =
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.newBuilder(property_).mergeFrom(value).buildPartial();
        } else {
          property_ = value;
        }
        onChanged();
      } else {
        propertyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder clearProperty() {
      if (propertyBuilder_ == null) {
        property_ = null;
        onChanged();
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder getPropertyBuilder() {
      
      onChanged();
      return getPropertyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder() {
      if (propertyBuilder_ != null) {
        return propertyBuilder_.getMessageOrBuilder();
      } else {
        return property_ == null ?
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
      }
    }
    /**
     * <pre>
     * Additional information detected on the page.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder> 
        getPropertyFieldBuilder() {
      if (propertyBuilder_ == null) {
        propertyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder>(
                getProperty(),
                getParentForChildren(),
                isClean());
        property_ = null;
      }
      return propertyBuilder_;
    }

    private int width_ ;
    /**
     * <pre>
     * Page width in pixels.
     * </pre>
     *
     * <code>int32 width = 2;</code>
     */
    public int getWidth() {
      return width_;
    }
    /**
     * <pre>
     * Page width in pixels.
     * </pre>
     *
     * <code>int32 width = 2;</code>
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page width in pixels.
     * </pre>
     *
     * <code>int32 width = 2;</code>
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     * Page height in pixels.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * Page height in pixels.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page height in pixels.
     * </pre>
     *
     * <code>int32 height = 3;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.vision.v1.Block> blocks_ =
      java.util.Collections.emptyList();
    private void ensureBlocksIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        blocks_ = new java.util.ArrayList<com.google.cloud.vision.v1.Block>(blocks_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1.Block, com.google.cloud.vision.v1.Block.Builder, com.google.cloud.vision.v1.BlockOrBuilder> blocksBuilder_;

    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public java.util.List<com.google.cloud.vision.v1.Block> getBlocksList() {
      if (blocksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(blocks_);
      } else {
        return blocksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public int getBlocksCount() {
      if (blocksBuilder_ == null) {
        return blocks_.size();
      } else {
        return blocksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public com.google.cloud.vision.v1.Block getBlocks(int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);
      } else {
        return blocksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder setBlocks(
        int index, com.google.cloud.vision.v1.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.set(index, value);
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder setBlocks(
        int index, com.google.cloud.vision.v1.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.set(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder addBlocks(com.google.cloud.vision.v1.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder addBlocks(
        int index, com.google.cloud.vision.v1.Block value) {
      if (blocksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBlocksIsMutable();
        blocks_.add(index, value);
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder addBlocks(
        com.google.cloud.vision.v1.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder addBlocks(
        int index, com.google.cloud.vision.v1.Block.Builder builderForValue) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.add(index, builderForValue.build());
        onChanged();
      } else {
        blocksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder addAllBlocks(
        java.lang.Iterable<? extends com.google.cloud.vision.v1.Block> values) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blocks_);
        onChanged();
      } else {
        blocksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder clearBlocks() {
      if (blocksBuilder_ == null) {
        blocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        blocksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public Builder removeBlocks(int index) {
      if (blocksBuilder_ == null) {
        ensureBlocksIsMutable();
        blocks_.remove(index);
        onChanged();
      } else {
        blocksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public com.google.cloud.vision.v1.Block.Builder getBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public com.google.cloud.vision.v1.BlockOrBuilder getBlocksOrBuilder(
        int index) {
      if (blocksBuilder_ == null) {
        return blocks_.get(index);  } else {
        return blocksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1.BlockOrBuilder> 
         getBlocksOrBuilderList() {
      if (blocksBuilder_ != null) {
        return blocksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(blocks_);
      }
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public com.google.cloud.vision.v1.Block.Builder addBlocksBuilder() {
      return getBlocksFieldBuilder().addBuilder(
          com.google.cloud.vision.v1.Block.getDefaultInstance());
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public com.google.cloud.vision.v1.Block.Builder addBlocksBuilder(
        int index) {
      return getBlocksFieldBuilder().addBuilder(
          index, com.google.cloud.vision.v1.Block.getDefaultInstance());
    }
    /**
     * <pre>
     * List of blocks of text, images etc on this page.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1.Block blocks = 4;</code>
     */
    public java.util.List<com.google.cloud.vision.v1.Block.Builder> 
         getBlocksBuilderList() {
      return getBlocksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1.Block, com.google.cloud.vision.v1.Block.Builder, com.google.cloud.vision.v1.BlockOrBuilder> 
        getBlocksFieldBuilder() {
      if (blocksBuilder_ == null) {
        blocksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1.Block, com.google.cloud.vision.v1.Block.Builder, com.google.cloud.vision.v1.BlockOrBuilder>(
                blocks_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        blocks_ = null;
      }
      return blocksBuilder_;
    }

    private float confidence_ ;
    /**
     * <pre>
     * Confidence of the OCR results on the page. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 5;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * Confidence of the OCR results on the page. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 5;</code>
     */
    public Builder setConfidence(float value) {
      
      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Confidence of the OCR results on the page. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 5;</code>
     */
    public Builder clearConfidence() {
      
      confidence_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.Page)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.Page)
  private static final com.google.cloud.vision.v1.Page DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.Page();
  }

  public static com.google.cloud.vision.v1.Page getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Page>
      PARSER = new com.google.protobuf.AbstractParser<Page>() {
    public Page parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Page(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Page> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Page> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1.Page getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

