// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface CropHintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.CropHint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  boolean hasBoundingPoly();
  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1.BoundingPoly getBoundingPoly();
  /**
   * <pre>
   * The bounding polygon for the crop region. The coordinates of the bounding
   * box are in the original image's scale, as returned in `ImageParams`.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   * <pre>
   * Confidence of this being a salient region.  Range [0, 1].
   * </pre>
   *
   * <code>optional float confidence = 2;</code>
   */
  float getConfidence();

  /**
   * <pre>
   * Fraction of importance of this salient region with respect to the original
   * image.
   * </pre>
   *
   * <code>optional float importance_fraction = 3;</code>
   */
  float getImportanceFraction();
}
