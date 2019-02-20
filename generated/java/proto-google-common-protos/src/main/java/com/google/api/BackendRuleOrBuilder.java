// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package com.google.api;

public interface BackendRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.BackendRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * The number of seconds to wait for a response from a request.  The default
   * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
   * </pre>
   *
   * <code>double deadline = 3;</code>
   */
  double getDeadline();

  /**
   * <pre>
   * Minimum deadline in seconds needed for this method. Calls having deadline
   * value lower than this will be rejected.
   * </pre>
   *
   * <code>double min_deadline = 4;</code>
   */
  double getMinDeadline();
}
