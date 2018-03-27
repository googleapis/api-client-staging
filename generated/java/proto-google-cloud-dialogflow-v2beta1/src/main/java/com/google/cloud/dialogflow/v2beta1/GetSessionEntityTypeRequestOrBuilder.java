// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session_entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface GetSessionEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;` or `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime
   * ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. Note:
   * Runtimes are under construction and will be available soon. If &lt;Runtime ID&gt;
   * is not specified, we assume default 'sandbox' runtime.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;` or `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime
   * ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. Note:
   * Runtimes are under construction and will be available soon. If &lt;Runtime ID&gt;
   * is not specified, we assume default 'sandbox' runtime.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
