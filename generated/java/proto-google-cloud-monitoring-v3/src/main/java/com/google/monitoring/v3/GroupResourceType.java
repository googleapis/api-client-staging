// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The supported resource types that can be used as values of
 * group_resource.resource_type. gae_app and uptime_url are not allowed
 * because group checks on App Engine modules and URLs are not allowed.
 * </pre>
 *
 * Protobuf enum {@code google.monitoring.v3.GroupResourceType}
 */
public enum GroupResourceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value (not valid).
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * A group of instances (could be either GCE or AWS_EC2).
   * </pre>
   *
   * <code>INSTANCE = 1;</code>
   */
  INSTANCE(1),
  /**
   * <pre>
   * A group of AWS load balancers.
   * </pre>
   *
   * <code>AWS_ELB_LOAD_BALANCER = 2;</code>
   */
  AWS_ELB_LOAD_BALANCER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value (not valid).
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A group of instances (could be either GCE or AWS_EC2).
   * </pre>
   *
   * <code>INSTANCE = 1;</code>
   */
  public static final int INSTANCE_VALUE = 1;
  /**
   * <pre>
   * A group of AWS load balancers.
   * </pre>
   *
   * <code>AWS_ELB_LOAD_BALANCER = 2;</code>
   */
  public static final int AWS_ELB_LOAD_BALANCER_VALUE = 2;


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
  public static GroupResourceType valueOf(int value) {
    return forNumber(value);
  }

  public static GroupResourceType forNumber(int value) {
    switch (value) {
      case 0: return RESOURCE_TYPE_UNSPECIFIED;
      case 1: return INSTANCE;
      case 2: return AWS_ELB_LOAD_BALANCER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GroupResourceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GroupResourceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GroupResourceType>() {
          public GroupResourceType findValueByNumber(int number) {
            return GroupResourceType.forNumber(number);
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
    return com.google.monitoring.v3.UptimeProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final GroupResourceType[] VALUES = values();

  public static GroupResourceType valueOf(
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

  private GroupResourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.monitoring.v3.GroupResourceType)
}

