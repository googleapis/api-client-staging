// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface UpdateVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.UpdateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource to update. Example:
   * `apps/myapp/services/default/versions/1`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource to update. Example:
   * `apps/myapp/services/default/versions/1`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A Version containing the updated resource. Only fields set in the field
   * mask will be updated.
   * </pre>
   *
   * <code>optional .google.appengine.v1.Version version = 2;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * A Version containing the updated resource. Only fields set in the field
   * mask will be updated.
   * </pre>
   *
   * <code>optional .google.appengine.v1.Version version = 2;</code>
   */
  com.google.appengine.v1.Version getVersion();
  /**
   * <pre>
   * A Version containing the updated resource. Only fields set in the field
   * mask will be updated.
   * </pre>
   *
   * <code>optional .google.appengine.v1.Version version = 2;</code>
   */
  com.google.appengine.v1.VersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
