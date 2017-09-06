// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/logging/v1/audit_data.proto

package com.google.cloud.bigquery.logging.v1;

public interface DatasetInsertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.logging.v1.DatasetInsertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dataset to be inserted.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Dataset resource = 1;</code>
   */
  boolean hasResource();
  /**
   * <pre>
   * The dataset to be inserted.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Dataset resource = 1;</code>
   */
  com.google.cloud.bigquery.logging.v1.Dataset getResource();
  /**
   * <pre>
   * The dataset to be inserted.
   * </pre>
   *
   * <code>optional .google.cloud.bigquery.logging.v1.Dataset resource = 1;</code>
   */
  com.google.cloud.bigquery.logging.v1.DatasetOrBuilder getResourceOrBuilder();
}
