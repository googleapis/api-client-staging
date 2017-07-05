// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface SafeSearchAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.SafeSearchAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Likelihood of adult content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood adult = 1;</code>
   */
  int getAdultValue();
  /**
   * <pre>
   * Likelihood of adult content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood adult = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta1.Likelihood getAdult();

  /**
   * <pre>
   * Likelihood that an obvious modification was made to the original
   * version to make it appear funny or offensive.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood spoof = 2;</code>
   */
  int getSpoofValue();
  /**
   * <pre>
   * Likelihood that an obvious modification was made to the original
   * version to make it appear funny or offensive.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood spoof = 2;</code>
   */
  com.google.cloud.videointelligence.v1beta1.Likelihood getSpoof();

  /**
   * <pre>
   * Likelihood of medical content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood medical = 3;</code>
   */
  int getMedicalValue();
  /**
   * <pre>
   * Likelihood of medical content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood medical = 3;</code>
   */
  com.google.cloud.videointelligence.v1beta1.Likelihood getMedical();

  /**
   * <pre>
   * Likelihood of violent content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood violent = 4;</code>
   */
  int getViolentValue();
  /**
   * <pre>
   * Likelihood of violent content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood violent = 4;</code>
   */
  com.google.cloud.videointelligence.v1beta1.Likelihood getViolent();

  /**
   * <pre>
   * Likelihood of racy content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood racy = 5;</code>
   */
  int getRacyValue();
  /**
   * <pre>
   * Likelihood of racy content.
   * </pre>
   *
   * <code>optional .google.cloud.videointelligence.v1beta1.Likelihood racy = 5;</code>
   */
  com.google.cloud.videointelligence.v1beta1.Likelihood getRacy();

  /**
   * <pre>
   * Video time offset in microseconds.
   * </pre>
   *
   * <code>optional int64 time_offset = 6;</code>
   */
  long getTimeOffset();
}
