// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/money.proto

package com.google.type;

/**
 * <pre>
 * Represents an amount of money with its currency type.
 * </pre>
 *
 * Protobuf type {@code google.type.Money}
 */
public  final class Money extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.type.Money)
    MoneyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Money.newBuilder() to construct.
  private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Money() {
    currencyCode_ = "";
    units_ = 0L;
    nanos_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Money(
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
            java.lang.String s = input.readStringRequireUtf8();

            currencyCode_ = s;
            break;
          }
          case 16: {

            units_ = input.readInt64();
            break;
          }
          case 24: {

            nanos_ = input.readInt32();
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
    return com.google.type.MoneyProto.internal_static_google_type_Money_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.MoneyProto.internal_static_google_type_Money_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.Money.class, com.google.type.Money.Builder.class);
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object currencyCode_;
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   */
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNITS_FIELD_NUMBER = 2;
  private long units_;
  /**
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>int64 units = 2;</code>
   */
  public long getUnits() {
    return units_;
  }

  public static final int NANOS_FIELD_NUMBER = 3;
  private int nanos_;
  /**
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>int32 nanos = 3;</code>
   */
  public int getNanos() {
    return nanos_;
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
    if (!getCurrencyCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currencyCode_);
    }
    if (units_ != 0L) {
      output.writeInt64(2, units_);
    }
    if (nanos_ != 0) {
      output.writeInt32(3, nanos_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrencyCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currencyCode_);
    }
    if (units_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, units_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nanos_);
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
    if (!(obj instanceof com.google.type.Money)) {
      return super.equals(obj);
    }
    com.google.type.Money other = (com.google.type.Money) obj;

    boolean result = true;
    result = result && getCurrencyCode()
        .equals(other.getCurrencyCode());
    result = result && (getUnits()
        == other.getUnits());
    result = result && (getNanos()
        == other.getNanos());
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
    hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyCode().hashCode();
    hash = (37 * hash) + UNITS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnits());
    hash = (37 * hash) + NANOS_FIELD_NUMBER;
    hash = (53 * hash) + getNanos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.Money parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Money parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.type.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Money parseFrom(
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
  public static Builder newBuilder(com.google.type.Money prototype) {
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
   * Represents an amount of money with its currency type.
   * </pre>
   *
   * Protobuf type {@code google.type.Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Money)
      com.google.type.MoneyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.type.MoneyProto.internal_static_google_type_Money_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.MoneyProto.internal_static_google_type_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.Money.class, com.google.type.Money.Builder.class);
    }

    // Construct using com.google.type.Money.newBuilder()
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
      currencyCode_ = "";

      units_ = 0L;

      nanos_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.type.MoneyProto.internal_static_google_type_Money_descriptor;
    }

    public com.google.type.Money getDefaultInstanceForType() {
      return com.google.type.Money.getDefaultInstance();
    }

    public com.google.type.Money build() {
      com.google.type.Money result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.type.Money buildPartial() {
      com.google.type.Money result = new com.google.type.Money(this);
      result.currencyCode_ = currencyCode_;
      result.units_ = units_;
      result.nanos_ = nanos_;
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
      if (other instanceof com.google.type.Money) {
        return mergeFrom((com.google.type.Money)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.Money other) {
      if (other == com.google.type.Money.getDefaultInstance()) return this;
      if (!other.getCurrencyCode().isEmpty()) {
        currencyCode_ = other.currencyCode_;
        onChanged();
      }
      if (other.getUnits() != 0L) {
        setUnits(other.getUnits());
      }
      if (other.getNanos() != 0) {
        setNanos(other.getNanos());
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
      com.google.type.Money parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.type.Money) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currencyCode_ = "";
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>string currency_code = 1;</code>
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>string currency_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>string currency_code = 1;</code>
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currencyCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>string currency_code = 1;</code>
     */
    public Builder clearCurrencyCode() {
      
      currencyCode_ = getDefaultInstance().getCurrencyCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>string currency_code = 1;</code>
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currencyCode_ = value;
      onChanged();
      return this;
    }

    private long units_ ;
    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>int64 units = 2;</code>
     */
    public long getUnits() {
      return units_;
    }
    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>int64 units = 2;</code>
     */
    public Builder setUnits(long value) {
      
      units_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>int64 units = 2;</code>
     */
    public Builder clearUnits() {
      
      units_ = 0L;
      onChanged();
      return this;
    }

    private int nanos_ ;
    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>int32 nanos = 3;</code>
     */
    public int getNanos() {
      return nanos_;
    }
    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>int32 nanos = 3;</code>
     */
    public Builder setNanos(int value) {
      
      nanos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>int32 nanos = 3;</code>
     */
    public Builder clearNanos() {
      
      nanos_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.type.Money)
  }

  // @@protoc_insertion_point(class_scope:google.type.Money)
  private static final com.google.type.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.type.Money();
  }

  public static com.google.type.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Money>
      PARSER = new com.google.protobuf.AbstractParser<Money>() {
    public Money parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Money(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Money> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Money> getParserForType() {
    return PARSER;
  }

  public com.google.type.Money getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

