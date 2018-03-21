// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/date.proto

package com.google.type;

/**
 * <pre>
 * Represents a whole calendar date, e.g. date of birth. The time of day and
 * time zone are either specified elsewhere or are not significant. The date
 * is relative to the Proleptic Gregorian Calendar. The day may be 0 to
 * represent a year and month where the day is not significant, e.g. credit card
 * expiration date. The year may be 0 to represent a month and day independent
 * of year, e.g. anniversary date. Related types are [google.type.TimeOfDay][google.type.TimeOfDay]
 * and `google.protobuf.Timestamp`.
 * </pre>
 *
 * Protobuf type {@code google.type.Date}
 */
public  final class Date extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.type.Date)
    DateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Date.newBuilder() to construct.
  private Date(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Date() {
    year_ = 0;
    month_ = 0;
    day_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Date(
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
          case 8: {

            year_ = input.readInt32();
            break;
          }
          case 16: {

            month_ = input.readInt32();
            break;
          }
          case 24: {

            day_ = input.readInt32();
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
    return com.google.type.DateProto.internal_static_google_type_Date_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.DateProto.internal_static_google_type_Date_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.Date.class, com.google.type.Date.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private int year_;
  /**
   * <pre>
   * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
   * a year.
   * </pre>
   *
   * <code>int32 year = 1;</code>
   */
  public int getYear() {
    return year_;
  }

  public static final int MONTH_FIELD_NUMBER = 2;
  private int month_;
  /**
   * <pre>
   * Month of year. Must be from 1 to 12.
   * </pre>
   *
   * <code>int32 month = 2;</code>
   */
  public int getMonth() {
    return month_;
  }

  public static final int DAY_FIELD_NUMBER = 3;
  private int day_;
  /**
   * <pre>
   * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
   * if specifying a year/month where the day is not significant.
   * </pre>
   *
   * <code>int32 day = 3;</code>
   */
  public int getDay() {
    return day_;
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
    if (year_ != 0) {
      output.writeInt32(1, year_);
    }
    if (month_ != 0) {
      output.writeInt32(2, month_);
    }
    if (day_ != 0) {
      output.writeInt32(3, day_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, year_);
    }
    if (month_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, month_);
    }
    if (day_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, day_);
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
    if (!(obj instanceof com.google.type.Date)) {
      return super.equals(obj);
    }
    com.google.type.Date other = (com.google.type.Date) obj;

    boolean result = true;
    result = result && (getYear()
        == other.getYear());
    result = result && (getMonth()
        == other.getMonth());
    result = result && (getDay()
        == other.getDay());
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
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + MONTH_FIELD_NUMBER;
    hash = (53 * hash) + getMonth();
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + getDay();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.Date parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Date parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Date parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Date parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Date parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.Date parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.Date parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Date parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.Date parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.type.Date parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.Date parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.Date parseFrom(
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
  public static Builder newBuilder(com.google.type.Date prototype) {
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
   * Represents a whole calendar date, e.g. date of birth. The time of day and
   * time zone are either specified elsewhere or are not significant. The date
   * is relative to the Proleptic Gregorian Calendar. The day may be 0 to
   * represent a year and month where the day is not significant, e.g. credit card
   * expiration date. The year may be 0 to represent a month and day independent
   * of year, e.g. anniversary date. Related types are [google.type.TimeOfDay][google.type.TimeOfDay]
   * and `google.protobuf.Timestamp`.
   * </pre>
   *
   * Protobuf type {@code google.type.Date}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Date)
      com.google.type.DateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.type.DateProto.internal_static_google_type_Date_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.DateProto.internal_static_google_type_Date_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.Date.class, com.google.type.Date.Builder.class);
    }

    // Construct using com.google.type.Date.newBuilder()
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
      year_ = 0;

      month_ = 0;

      day_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.type.DateProto.internal_static_google_type_Date_descriptor;
    }

    public com.google.type.Date getDefaultInstanceForType() {
      return com.google.type.Date.getDefaultInstance();
    }

    public com.google.type.Date build() {
      com.google.type.Date result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.type.Date buildPartial() {
      com.google.type.Date result = new com.google.type.Date(this);
      result.year_ = year_;
      result.month_ = month_;
      result.day_ = day_;
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
      if (other instanceof com.google.type.Date) {
        return mergeFrom((com.google.type.Date)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.Date other) {
      if (other == com.google.type.Date.getDefaultInstance()) return this;
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (other.getMonth() != 0) {
        setMonth(other.getMonth());
      }
      if (other.getDay() != 0) {
        setDay(other.getDay());
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
      com.google.type.Date parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.type.Date) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int year_ ;
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public int getYear() {
      return year_;
    }
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without
     * a year.
     * </pre>
     *
     * <code>int32 year = 1;</code>
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private int month_ ;
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public int getMonth() {
      return month_;
    }
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public Builder setMonth(int value) {
      
      month_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Month of year. Must be from 1 to 12.
     * </pre>
     *
     * <code>int32 month = 2;</code>
     */
    public Builder clearMonth() {
      
      month_ = 0;
      onChanged();
      return this;
    }

    private int day_ ;
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public int getDay() {
      return day_;
    }
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public Builder setDay(int value) {
      
      day_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
     * if specifying a year/month where the day is not significant.
     * </pre>
     *
     * <code>int32 day = 3;</code>
     */
    public Builder clearDay() {
      
      day_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.type.Date)
  }

  // @@protoc_insertion_point(class_scope:google.type.Date)
  private static final com.google.type.Date DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.type.Date();
  }

  public static com.google.type.Date getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Date>
      PARSER = new com.google.protobuf.AbstractParser<Date>() {
    public Date parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Date(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Date> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Date> getParserForType() {
    return PARSER;
  }

  public com.google.type.Date getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

