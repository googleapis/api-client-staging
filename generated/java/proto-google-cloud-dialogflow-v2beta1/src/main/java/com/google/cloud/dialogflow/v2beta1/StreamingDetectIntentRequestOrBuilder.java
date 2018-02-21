// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface StreamingDetectIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
   * Note: Runtimes are under construction and will be available soon.
   * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
   * It’s up to the API caller to choose an appropriate &lt;Session ID&gt;. It can be
   * a random number or some type of user identifier (preferably hashed).
   * The length of the session ID must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  java.lang.String getSession();
  /**
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/runtimes/&lt;Runtime ID&gt;/sessions/&lt;Session ID&gt;`.
   * Note: Runtimes are under construction and will be available soon.
   * If &lt;Runtime ID&gt; is not specified, we assume default 'sandbox' runtime.
   * It’s up to the API caller to choose an appropriate &lt;Session ID&gt;. It can be
   * a random number or some type of user identifier (preferably hashed).
   * The length of the session ID must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  com.google.protobuf.ByteString
      getSessionBytes();

  /**
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  boolean hasQueryParams();
  /**
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  boolean hasQueryInput();
  /**
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInput getQueryInput();
  /**
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   * <pre>
   * Optional. If `true`, the recognizer will detect a single spoken utterance
   * in input audio. When it detects that the user has paused or stopped
   * speaking, it will cease recognition. This setting is ignored when
   * `query_input` is a piece of text or an event.
   * </pre>
   *
   * <code>bool single_utterance = 4;</code>
   */
  boolean getSingleUtterance();

  /**
   * <pre>
   * Optional. The input audio content to be recognized. Must be sent if
   * `query_input` was set to a streaming input audio config. The complete audio
   * over all streaming messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 6;</code>
   */
  com.google.protobuf.ByteString getInputAudio();
}
