// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface CreateClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.CreateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2;</code>
   */
  java.lang.String getClusterId();
  /**
   * <pre>
   * The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  boolean hasCluster();
  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  com.google.bigtable.admin.v2.Cluster getCluster();
  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  com.google.bigtable.admin.v2.ClusterOrBuilder getClusterOrBuilder();
}
