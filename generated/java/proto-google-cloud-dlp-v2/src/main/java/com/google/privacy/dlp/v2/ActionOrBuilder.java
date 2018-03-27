// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   */
  boolean hasSaveFindings();
  /**
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   */
  com.google.privacy.dlp.v2.Action.SaveFindings getSaveFindings();
  /**
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   */
  com.google.privacy.dlp.v2.Action.SaveFindingsOrBuilder getSaveFindingsOrBuilder();

  /**
   * <pre>
   * Publish a notification to a pubsub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   */
  boolean hasPubSub();
  /**
   * <pre>
   * Publish a notification to a pubsub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   */
  com.google.privacy.dlp.v2.Action.PublishToPubSub getPubSub();
  /**
   * <pre>
   * Publish a notification to a pubsub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   */
  com.google.privacy.dlp.v2.Action.PublishToPubSubOrBuilder getPubSubOrBuilder();

  public com.google.privacy.dlp.v2.Action.ActionCase getActionCase();
}
