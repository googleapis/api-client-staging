// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

/**
 * <pre>
 * Additional information about a potentially long-running operation with which
 * a log entry is associated.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LogEntryOperation}
 */
public  final class LogEntryOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogEntryOperation)
    LogEntryOperationOrBuilder {
  // Use LogEntryOperation.newBuilder() to construct.
  private LogEntryOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogEntryOperation() {
    id_ = "";
    producer_ = "";
    first_ = false;
    last_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LogEntryOperation(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            producer_ = s;
            break;
          }
          case 24: {

            first_ = input.readBool();
            break;
          }
          case 32: {

            last_ = input.readBool();
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
    return com.google.logging.v2.LogEntryProto.internal_static_google_logging_v2_LogEntryOperation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LogEntryProto.internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LogEntryOperation.class, com.google.logging.v2.LogEntryOperation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Optional. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCER_FIELD_NUMBER = 2;
  private volatile java.lang.Object producer_;
  /**
   * <pre>
   * Optional. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2;</code>
   */
  public java.lang.String getProducer() {
    java.lang.Object ref = producer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      producer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProducerBytes() {
    java.lang.Object ref = producer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      producer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_FIELD_NUMBER = 3;
  private boolean first_;
  /**
   * <pre>
   * Optional. Set this to True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>bool first = 3;</code>
   */
  public boolean getFirst() {
    return first_;
  }

  public static final int LAST_FIELD_NUMBER = 4;
  private boolean last_;
  /**
   * <pre>
   * Optional. Set this to True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>bool last = 4;</code>
   */
  public boolean getLast() {
    return last_;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getProducerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, producer_);
    }
    if (first_ != false) {
      output.writeBool(3, first_);
    }
    if (last_ != false) {
      output.writeBool(4, last_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getProducerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, producer_);
    }
    if (first_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, first_);
    }
    if (last_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, last_);
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
    if (!(obj instanceof com.google.logging.v2.LogEntryOperation)) {
      return super.equals(obj);
    }
    com.google.logging.v2.LogEntryOperation other = (com.google.logging.v2.LogEntryOperation) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getProducer()
        .equals(other.getProducer());
    result = result && (getFirst()
        == other.getFirst());
    result = result && (getLast()
        == other.getLast());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PRODUCER_FIELD_NUMBER;
    hash = (53 * hash) + getProducer().hashCode();
    hash = (37 * hash) + FIRST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFirst());
    hash = (37 * hash) + LAST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLast());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.LogEntryOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
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
  public static Builder newBuilder(com.google.logging.v2.LogEntryOperation prototype) {
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
   * Additional information about a potentially long-running operation with which
   * a log entry is associated.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LogEntryOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogEntryOperation)
      com.google.logging.v2.LogEntryOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LogEntryProto.internal_static_google_logging_v2_LogEntryOperation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LogEntryProto.internal_static_google_logging_v2_LogEntryOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LogEntryOperation.class, com.google.logging.v2.LogEntryOperation.Builder.class);
    }

    // Construct using com.google.logging.v2.LogEntryOperation.newBuilder()
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
      id_ = "";

      producer_ = "";

      first_ = false;

      last_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LogEntryProto.internal_static_google_logging_v2_LogEntryOperation_descriptor;
    }

    public com.google.logging.v2.LogEntryOperation getDefaultInstanceForType() {
      return com.google.logging.v2.LogEntryOperation.getDefaultInstance();
    }

    public com.google.logging.v2.LogEntryOperation build() {
      com.google.logging.v2.LogEntryOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v2.LogEntryOperation buildPartial() {
      com.google.logging.v2.LogEntryOperation result = new com.google.logging.v2.LogEntryOperation(this);
      result.id_ = id_;
      result.producer_ = producer_;
      result.first_ = first_;
      result.last_ = last_;
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
      if (other instanceof com.google.logging.v2.LogEntryOperation) {
        return mergeFrom((com.google.logging.v2.LogEntryOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LogEntryOperation other) {
      if (other == com.google.logging.v2.LogEntryOperation.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getProducer().isEmpty()) {
        producer_ = other.producer_;
        onChanged();
      }
      if (other.getFirst() != false) {
        setFirst(other.getFirst());
      }
      if (other.getLast() != false) {
        setLast(other.getLast());
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
      com.google.logging.v2.LogEntryOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.LogEntryOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Optional. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object producer_ = "";
    /**
     * <pre>
     * Optional. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     */
    public java.lang.String getProducer() {
      java.lang.Object ref = producer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        producer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProducerBytes() {
      java.lang.Object ref = producer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        producer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     */
    public Builder setProducer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      producer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     */
    public Builder clearProducer() {
      
      producer_ = getDefaultInstance().getProducer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     */
    public Builder setProducerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      producer_ = value;
      onChanged();
      return this;
    }

    private boolean first_ ;
    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     */
    public boolean getFirst() {
      return first_;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     */
    public Builder setFirst(boolean value) {
      
      first_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     */
    public Builder clearFirst() {
      
      first_ = false;
      onChanged();
      return this;
    }

    private boolean last_ ;
    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     */
    public boolean getLast() {
      return last_;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     */
    public Builder setLast(boolean value) {
      
      last_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     */
    public Builder clearLast() {
      
      last_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogEntryOperation)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LogEntryOperation)
  private static final com.google.logging.v2.LogEntryOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LogEntryOperation();
  }

  public static com.google.logging.v2.LogEntryOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogEntryOperation>
      PARSER = new com.google.protobuf.AbstractParser<LogEntryOperation>() {
    public LogEntryOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogEntryOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogEntryOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogEntryOperation> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v2.LogEntryOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

