// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

public interface CheckRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.CheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  boolean hasOperation();
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  com.google.api.servicecontrol.v1.Operation getOperation();
  /**
   * <pre>
   * The operation to be checked.
   * </pre>
   *
   * <code>optional .google.api.servicecontrol.v1.Operation operation = 2;</code>
   */
  com.google.api.servicecontrol.v1.OperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  java.lang.String getServiceConfigId();
  /**
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request.
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>optional string service_config_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getServiceConfigIdBytes();
}
