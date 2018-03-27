// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface SpeechTranscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.SpeechTranscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * Output only. May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);
}
