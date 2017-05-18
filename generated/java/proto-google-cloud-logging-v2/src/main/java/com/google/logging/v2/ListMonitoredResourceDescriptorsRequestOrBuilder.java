// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface ListMonitoredResourceDescriptorsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListMonitoredResourceDescriptorsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The maximum number of results to return from this request.
   * Non-positive values are ignored.  The presence of `nextPageToken` in the
   * response indicates that more results might be available.
   * </pre>
   *
   * <code>optional int32 page_size = 1;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `pageToken` must be the value of
   * `nextPageToken` from the previous response.  The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `pageToken` must be the value of
   * `nextPageToken` from the previous response.  The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>optional string page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
