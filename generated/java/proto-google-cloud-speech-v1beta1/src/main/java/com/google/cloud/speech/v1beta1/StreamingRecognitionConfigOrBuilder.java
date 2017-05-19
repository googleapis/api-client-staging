// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

public interface StreamingRecognitionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1beta1.StreamingRecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  boolean hasConfig();
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  com.google.cloud.speech.v1beta1.RecognitionConfig getConfig();
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * *Optional* If `false` or omitted, the recognizer will perform continuous
   * recognition (continuing to wait for and process audio even if the user
   * pauses speaking) until the client closes the input stream (gRPC API) or
   * until the maximum time limit has been reached. May return multiple
   * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
   * If `true`, the recognizer will detect a single spoken utterance. When it
   * detects that the user has paused or stopped speaking, it will return an
   * `END_OF_UTTERANCE` event and cease recognition. It will return no more than
   * one `StreamingRecognitionResult` with the `is_final` flag set to `true`.
   * </pre>
   *
   * <code>optional bool single_utterance = 2;</code>
   */
  boolean getSingleUtterance();

  /**
   * <pre>
   * *Optional* If `true`, interim results (tentative hypotheses) may be
   * returned as they become available (these interim results are indicated with
   * the `is_final=false` flag).
   * If `false` or omitted, only `is_final=true` result(s) are returned.
   * </pre>
   *
   * <code>optional bool interim_results = 3;</code>
   */
  boolean getInterimResults();
}
