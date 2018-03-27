// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetLegacyAbacRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetLegacyAbacRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  java.lang.String getClusterId();
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * Whether ABAC authorization will be enabled in the cluster.
   * </pre>
   *
   * <code>bool enabled = 4;</code>
   */
  boolean getEnabled();
}
