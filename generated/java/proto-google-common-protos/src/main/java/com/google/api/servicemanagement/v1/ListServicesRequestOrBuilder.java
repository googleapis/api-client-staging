// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface ListServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>optional string producer_project_id = 1;</code>
   */
  java.lang.String getProducerProjectId();
  /**
   * <pre>
   * Include services produced by the specified project.
   * </pre>
   *
   * <code>optional string producer_project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProducerProjectIdBytes();

  /**
   * <pre>
   * Requested size of the next page of data.
   * </pre>
   *
   * <code>optional int32 page_size = 5;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>optional string page_token = 6;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token identifying which result to start with; returned by a previous list
   * call.
   * </pre>
   *
   * <code>optional string page_token = 6;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
