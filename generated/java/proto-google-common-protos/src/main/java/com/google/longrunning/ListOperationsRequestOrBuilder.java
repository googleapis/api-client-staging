// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

public interface ListOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.ListOperationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>optional int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
