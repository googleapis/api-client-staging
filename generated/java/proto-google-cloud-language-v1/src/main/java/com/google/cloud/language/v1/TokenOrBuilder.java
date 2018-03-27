// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface TokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.Token)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  boolean hasText();
  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpan getText();
  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  boolean hasPartOfSpeech();
  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  com.google.cloud.language.v1.PartOfSpeech getPartOfSpeech();
  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  com.google.cloud.language.v1.PartOfSpeechOrBuilder getPartOfSpeechOrBuilder();

  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  boolean hasDependencyEdge();
  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  com.google.cloud.language.v1.DependencyEdge getDependencyEdge();
  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  com.google.cloud.language.v1.DependencyEdgeOrBuilder getDependencyEdgeOrBuilder();

  /**
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   */
  java.lang.String getLemma();
  /**
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   */
  com.google.protobuf.ByteString
      getLemmaBytes();
}
