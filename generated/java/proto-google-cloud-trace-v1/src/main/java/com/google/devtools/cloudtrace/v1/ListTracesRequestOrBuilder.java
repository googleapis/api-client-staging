// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface ListTracesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.ListTracesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Type of data returned for traces in the list. Optional. Default is
   * `MINIMAL`.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.ListTracesRequest.ViewType view = 2;</code>
   */
  int getViewValue();
  /**
   * <pre>
   * Type of data returned for traces in the list. Optional. Default is
   * `MINIMAL`.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.ListTracesRequest.ViewType view = 2;</code>
   */
  com.google.devtools.cloudtrace.v1.ListTracesRequest.ViewType getView();

  /**
   * <pre>
   * Maximum number of traces to return. If not specified or &lt;= 0, the
   * implementation selects a reasonable value.  The implementation may
   * return fewer traces than the requested page size. Optional.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Token identifying the page of results to return. If provided, use the
   * value of the `next_page_token` field from a previous request. Optional.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token identifying the page of results to return. If provided, use the
   * value of the `next_page_token` field from a previous request. Optional.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * An optional filter for the request.
   * </pre>
   *
   * <code>string filter = 7;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * An optional filter for the request.
   * </pre>
   *
   * <code>string filter = 7;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Field used to sort the returned traces. Optional.
   * Can be one of the following:
   * *   `trace_id`
   * *   `name` (`name` field of root span in the trace)
   * *   `duration` (difference between `end_time` and `start_time` fields of
   *      the root span)
   * *   `start` (`start_time` field of the root span)
   * Descending order can be specified by appending `desc` to the sort field
   * (for example, `name desc`).
   * Only one sort field is permitted.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Field used to sort the returned traces. Optional.
   * Can be one of the following:
   * *   `trace_id`
   * *   `name` (`name` field of root span in the trace)
   * *   `duration` (difference between `end_time` and `start_time` fields of
   *      the root span)
   * *   `start` (`start_time` field of the root span)
   * Descending order can be specified by appending `desc` to the sort field
   * (for example, `name desc`).
   * Only one sort field is permitted.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
