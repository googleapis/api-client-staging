// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface TraceSpanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.TraceSpan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier for the span. Must be a 64-bit integer other than 0 and
   * unique within a trace.
   * </pre>
   *
   * <code>fixed64 span_id = 1;</code>
   */
  long getSpanId();

  /**
   * <pre>
   * Distinguishes between spans generated in a particular context. For example,
   * two spans with the same name may be distinguished using `RPC_CLIENT`
   * and `RPC_SERVER` to identify queueing latency associated with the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.TraceSpan.SpanKind kind = 2;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * Distinguishes between spans generated in a particular context. For example,
   * two spans with the same name may be distinguished using `RPC_CLIENT`
   * and `RPC_SERVER` to identify queueing latency associated with the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.TraceSpan.SpanKind kind = 2;</code>
   */
  com.google.devtools.cloudtrace.v1.TraceSpan.SpanKind getKind();

  /**
   * <pre>
   * Name of the trace. The trace name is sanitized and displayed in the
   * Stackdriver Trace tool in the Google Developers Console.
   * The name may be a method name or some other per-call site name.
   * For the same executable and the same call point, a best practice is
   * to use a consistent name, which makes it easier to correlate
   * cross-trace spans.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the trace. The trace name is sanitized and displayed in the
   * Stackdriver Trace tool in the Google Developers Console.
   * The name may be a method name or some other per-call site name.
   * For the same executable and the same call point, a best practice is
   * to use a consistent name, which makes it easier to correlate
   * cross-trace spans.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Start time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * End time of the span in nanoseconds from the UNIX epoch.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * ID of the parent span, if any. Optional.
   * </pre>
   *
   * <code>fixed64 parent_span_id = 6;</code>
   */
  long getParentSpanId();

  /**
   * <pre>
   * Collection of labels associated with the span.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Collection of labels associated with the span.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Collection of labels associated with the span.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Collection of labels associated with the span.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Collection of labels associated with the span.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
