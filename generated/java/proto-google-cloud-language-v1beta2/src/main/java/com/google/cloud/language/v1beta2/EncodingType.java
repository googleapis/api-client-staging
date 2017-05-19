// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

/**
 * <pre>
 * Represents the text encoding that the caller uses to process the output.
 * Providing an `EncodingType` is recommended because the API provides the
 * beginning offsets for various outputs, such as tokens and mentions, and
 * languages that natively use different text encodings may access offsets
 * differently.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.language.v1beta2.EncodingType}
 */
public enum EncodingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * If `EncodingType` is not specified, encoding-dependent information (such as
   * `begin_offset`) will be set at `-1`.
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-8 encoding of the input. C++ and Go are examples of languages
   * that use this encoding natively.
   * </pre>
   *
   * <code>UTF8 = 1;</code>
   */
  UTF8(1),
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-16 encoding of the input. Java and Javascript are examples of
   * languages that use this encoding natively.
   * </pre>
   *
   * <code>UTF16 = 2;</code>
   */
  UTF16(2),
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-32 encoding of the input. Python is an example of a language
   * that uses this encoding natively.
   * </pre>
   *
   * <code>UTF32 = 3;</code>
   */
  UTF32(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * If `EncodingType` is not specified, encoding-dependent information (such as
   * `begin_offset`) will be set at `-1`.
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-8 encoding of the input. C++ and Go are examples of languages
   * that use this encoding natively.
   * </pre>
   *
   * <code>UTF8 = 1;</code>
   */
  public static final int UTF8_VALUE = 1;
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-16 encoding of the input. Java and Javascript are examples of
   * languages that use this encoding natively.
   * </pre>
   *
   * <code>UTF16 = 2;</code>
   */
  public static final int UTF16_VALUE = 2;
  /**
   * <pre>
   * Encoding-dependent information (such as `begin_offset`) is calculated based
   * on the UTF-32 encoding of the input. Python is an example of a language
   * that uses this encoding natively.
   * </pre>
   *
   * <code>UTF32 = 3;</code>
   */
  public static final int UTF32_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EncodingType valueOf(int value) {
    return forNumber(value);
  }

  public static EncodingType forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return UTF8;
      case 2: return UTF16;
      case 3: return UTF32;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EncodingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EncodingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EncodingType>() {
          public EncodingType findValueByNumber(int number) {
            return EncodingType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final EncodingType[] VALUES = values();

  public static EncodingType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EncodingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.language.v1beta2.EncodingType)
}

