// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface SentenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.Sentence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.TextSpan text = 1;</code>
   */
  boolean hasText();
  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpan getText();
  /**
   * <pre>
   * The sentence text.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.Sentiment sentiment = 2;</code>
   */
  boolean hasSentiment();
  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.Sentiment sentiment = 2;</code>
   */
  com.google.cloud.language.v1.Sentiment getSentiment();
  /**
   * <pre>
   * For calls to [AnalyzeSentiment][] or if
   * [AnnotateTextRequest.Features.extract_document_sentiment][google.cloud.language.v1.AnnotateTextRequest.Features.extract_document_sentiment] is set to
   * true, this field will contain the sentiment for the sentence.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1.Sentiment sentiment = 2;</code>
   */
  com.google.cloud.language.v1.SentimentOrBuilder getSentimentOrBuilder();
}
