// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

/**
 * <pre>
 * External image source (Google Cloud Storage image location).
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p1beta1.ImageSource}
 */
public  final class ImageSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p1beta1.ImageSource)
    ImageSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageSource.newBuilder() to construct.
  private ImageSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageSource() {
    gcsImageUri_ = "";
    imageUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageSource(
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
            java.lang.String s = input.readStringRequireUtf8();

            gcsImageUri_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUri_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p1beta1_ImageSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p1beta1_ImageSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p1beta1.ImageSource.class, com.google.cloud.vision.v1p1beta1.ImageSource.Builder.class);
  }

  public static final int GCS_IMAGE_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object gcsImageUri_;
  /**
   * <pre>
   * NOTE: For new code `image_uri` below is preferred.
   * Google Cloud Storage image URI, which must be in the following form:
   * `gs://bucket_name/object_name` (for details, see
   * [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris)).
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_image_uri = 1;</code>
   */
  public java.lang.String getGcsImageUri() {
    java.lang.Object ref = gcsImageUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsImageUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * NOTE: For new code `image_uri` below is preferred.
   * Google Cloud Storage image URI, which must be in the following form:
   * `gs://bucket_name/object_name` (for details, see
   * [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris)).
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_image_uri = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGcsImageUriBytes() {
    java.lang.Object ref = gcsImageUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcsImageUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object imageUri_;
  /**
   * <pre>
   * Image URI which supports:
   * 1) Google Cloud Storage image URI, which must be in the following form:
   * `gs://bucket_name/object_name` (for details, see
   * [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris)).
   * NOTE: Cloud Storage object versioning is not supported.
   * 2) Publicly accessible image HTTP/HTTPS URL.
   * This is preferred over the legacy `gcs_image_uri` above. When both
   * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
   * precedence.
   * </pre>
   *
   * <code>string image_uri = 2;</code>
   */
  public java.lang.String getImageUri() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Image URI which supports:
   * 1) Google Cloud Storage image URI, which must be in the following form:
   * `gs://bucket_name/object_name` (for details, see
   * [Google Cloud Storage Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris)).
   * NOTE: Cloud Storage object versioning is not supported.
   * 2) Publicly accessible image HTTP/HTTPS URL.
   * This is preferred over the legacy `gcs_image_uri` above. When both
   * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
   * precedence.
   * </pre>
   *
   * <code>string image_uri = 2;</code>
   */
  public com.google.protobuf.ByteString
      getImageUriBytes() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageUri_ = b;
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
    if (!getGcsImageUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsImageUri_);
    }
    if (!getImageUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageUri_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGcsImageUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsImageUri_);
    }
    if (!getImageUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imageUri_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p1beta1.ImageSource)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p1beta1.ImageSource other = (com.google.cloud.vision.v1p1beta1.ImageSource) obj;

    boolean result = true;
    result = result && getGcsImageUri()
        .equals(other.getGcsImageUri());
    result = result && getImageUri()
        .equals(other.getImageUri());
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
    hash = (37 * hash) + GCS_IMAGE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getGcsImageUri().hashCode();
    hash = (37 * hash) + IMAGE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getImageUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p1beta1.ImageSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p1beta1.ImageSource prototype) {
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
   * External image source (Google Cloud Storage image location).
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p1beta1.ImageSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p1beta1.ImageSource)
      com.google.cloud.vision.v1p1beta1.ImageSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p1beta1_ImageSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p1beta1_ImageSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p1beta1.ImageSource.class, com.google.cloud.vision.v1p1beta1.ImageSource.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p1beta1.ImageSource.newBuilder()
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
      gcsImageUri_ = "";

      imageUri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p1beta1_ImageSource_descriptor;
    }

    public com.google.cloud.vision.v1p1beta1.ImageSource getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p1beta1.ImageSource.getDefaultInstance();
    }

    public com.google.cloud.vision.v1p1beta1.ImageSource build() {
      com.google.cloud.vision.v1p1beta1.ImageSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1p1beta1.ImageSource buildPartial() {
      com.google.cloud.vision.v1p1beta1.ImageSource result = new com.google.cloud.vision.v1p1beta1.ImageSource(this);
      result.gcsImageUri_ = gcsImageUri_;
      result.imageUri_ = imageUri_;
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
      if (other instanceof com.google.cloud.vision.v1p1beta1.ImageSource) {
        return mergeFrom((com.google.cloud.vision.v1p1beta1.ImageSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p1beta1.ImageSource other) {
      if (other == com.google.cloud.vision.v1p1beta1.ImageSource.getDefaultInstance()) return this;
      if (!other.getGcsImageUri().isEmpty()) {
        gcsImageUri_ = other.gcsImageUri_;
        onChanged();
      }
      if (!other.getImageUri().isEmpty()) {
        imageUri_ = other.imageUri_;
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
      com.google.cloud.vision.v1p1beta1.ImageSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p1beta1.ImageSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gcsImageUri_ = "";
    /**
     * <pre>
     * NOTE: For new code `image_uri` below is preferred.
     * Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_image_uri = 1;</code>
     */
    public java.lang.String getGcsImageUri() {
      java.lang.Object ref = gcsImageUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsImageUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * NOTE: For new code `image_uri` below is preferred.
     * Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_image_uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGcsImageUriBytes() {
      java.lang.Object ref = gcsImageUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcsImageUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * NOTE: For new code `image_uri` below is preferred.
     * Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_image_uri = 1;</code>
     */
    public Builder setGcsImageUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gcsImageUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: For new code `image_uri` below is preferred.
     * Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_image_uri = 1;</code>
     */
    public Builder clearGcsImageUri() {
      
      gcsImageUri_ = getDefaultInstance().getGcsImageUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: For new code `image_uri` below is preferred.
     * Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * </pre>
     *
     * <code>string gcs_image_uri = 1;</code>
     */
    public Builder setGcsImageUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gcsImageUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imageUri_ = "";
    /**
     * <pre>
     * Image URI which supports:
     * 1) Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * 2) Publicly accessible image HTTP/HTTPS URL.
     * This is preferred over the legacy `gcs_image_uri` above. When both
     * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
     * precedence.
     * </pre>
     *
     * <code>string image_uri = 2;</code>
     */
    public java.lang.String getImageUri() {
      java.lang.Object ref = imageUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Image URI which supports:
     * 1) Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * 2) Publicly accessible image HTTP/HTTPS URL.
     * This is preferred over the legacy `gcs_image_uri` above. When both
     * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
     * precedence.
     * </pre>
     *
     * <code>string image_uri = 2;</code>
     */
    public com.google.protobuf.ByteString
        getImageUriBytes() {
      java.lang.Object ref = imageUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Image URI which supports:
     * 1) Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * 2) Publicly accessible image HTTP/HTTPS URL.
     * This is preferred over the legacy `gcs_image_uri` above. When both
     * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
     * precedence.
     * </pre>
     *
     * <code>string image_uri = 2;</code>
     */
    public Builder setImageUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image URI which supports:
     * 1) Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * 2) Publicly accessible image HTTP/HTTPS URL.
     * This is preferred over the legacy `gcs_image_uri` above. When both
     * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
     * precedence.
     * </pre>
     *
     * <code>string image_uri = 2;</code>
     */
    public Builder clearImageUri() {
      
      imageUri_ = getDefaultInstance().getImageUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image URI which supports:
     * 1) Google Cloud Storage image URI, which must be in the following form:
     * `gs://bucket_name/object_name` (for details, see
     * [Google Cloud Storage Request
     * URIs](https://cloud.google.com/storage/docs/reference-uris)).
     * NOTE: Cloud Storage object versioning is not supported.
     * 2) Publicly accessible image HTTP/HTTPS URL.
     * This is preferred over the legacy `gcs_image_uri` above. When both
     * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
     * precedence.
     * </pre>
     *
     * <code>string image_uri = 2;</code>
     */
    public Builder setImageUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p1beta1.ImageSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p1beta1.ImageSource)
  private static final com.google.cloud.vision.v1p1beta1.ImageSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p1beta1.ImageSource();
  }

  public static com.google.cloud.vision.v1p1beta1.ImageSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageSource>
      PARSER = new com.google.protobuf.AbstractParser<ImageSource>() {
    public ImageSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageSource> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1p1beta1.ImageSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

