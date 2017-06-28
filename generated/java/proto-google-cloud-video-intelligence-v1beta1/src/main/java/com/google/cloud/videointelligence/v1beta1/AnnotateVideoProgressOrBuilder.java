// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface AnnotateVideoProgressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.AnnotateVideoProgress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress> 
      getAnnotationProgressList();
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgress getAnnotationProgress(int index);
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  int getAnnotationProgressCount();
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder> 
      getAnnotationProgressOrBuilderList();
  /**
   * <pre>
   * Progress metadata for all videos specified in `AnnotateVideoRequest`.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationProgress annotation_progress = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoAnnotationProgressOrBuilder getAnnotationProgressOrBuilder(
      int index);
}
