// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/runtime.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListRuntimesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListRuntimesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of agent runtimes. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Runtime runtimes = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Runtime> 
      getRuntimesList();
  /**
   * <pre>
   * The list of agent runtimes. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Runtime runtimes = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Runtime getRuntimes(int index);
  /**
   * <pre>
   * The list of agent runtimes. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Runtime runtimes = 1;</code>
   */
  int getRuntimesCount();
  /**
   * <pre>
   * The list of agent runtimes. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Runtime runtimes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder> 
      getRuntimesOrBuilderList();
  /**
   * <pre>
   * The list of agent runtimes. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Runtime runtimes = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.RuntimeOrBuilder getRuntimesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
