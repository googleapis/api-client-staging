// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface GetMetricDescriptorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetMetricDescriptorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metric descriptor on which to execute the request. The format is
   * `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`.
   * An example value of `{metric_id}` is
   * `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The metric descriptor on which to execute the request. The format is
   * `"projects/{project_id_or_number}/metricDescriptors/{metric_id}"`.
   * An example value of `{metric_id}` is
   * `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
