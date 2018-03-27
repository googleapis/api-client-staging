// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/logging/audit_data.proto

package com.google.iam.v1.logging;

public interface AuditDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.logging.AuditData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Policy delta between the original policy and the newly set policy.
   * </pre>
   *
   * <code>.google.iam.v1.PolicyDelta policy_delta = 2;</code>
   */
  boolean hasPolicyDelta();
  /**
   * <pre>
   * Policy delta between the original policy and the newly set policy.
   * </pre>
   *
   * <code>.google.iam.v1.PolicyDelta policy_delta = 2;</code>
   */
  com.google.iam.v1.PolicyDelta getPolicyDelta();
  /**
   * <pre>
   * Policy delta between the original policy and the newly set policy.
   * </pre>
   *
   * <code>.google.iam.v1.PolicyDelta policy_delta = 2;</code>
   */
  com.google.iam.v1.PolicyDeltaOrBuilder getPolicyDeltaOrBuilder();
}
