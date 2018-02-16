// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface RecognitionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.RecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Required* Encoding of audio data sent in all `RecognitionAudio` messages.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   */
  int getEncodingValue();
  /**
   * <pre>
   * *Required* Encoding of audio data sent in all `RecognitionAudio` messages.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig.AudioEncoding encoding = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionConfig.AudioEncoding getEncoding();

  /**
   * <pre>
   * *Required* Sample rate in Hertz of the audio data sent in all
   * `RecognitionAudio` messages. Valid values are: 8000-48000.
   * 16000 is optimal. For best results, set the sampling rate of the audio
   * source to 16000 Hz. If that's not possible, use the native sample rate of
   * the audio source (instead of re-sampling).
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  int getSampleRateHertz();

  /**
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](https://cloud.google.com/speech/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * *Required* The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Example: "en-US".
   * See [Language Support](https://cloud.google.com/speech/docs/languages)
   * for a list of the currently supported language codes.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * *Optional* Maximum number of recognition hypotheses to be returned.
   * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
   * within each `SpeechRecognitionResult`.
   * The server may return fewer than `max_alternatives`.
   * Valid values are `0`-`30`. A value of `0` or `1` will return a maximum of
   * one. If omitted, will return a maximum of one.
   * </pre>
   *
   * <code>int32 max_alternatives = 4;</code>
   */
  int getMaxAlternatives();

  /**
   * <pre>
   * *Optional* If set to `true`, the server will attempt to filter out
   * profanities, replacing all but the initial character in each filtered word
   * with asterisks, e.g. "f***". If set to `false` or omitted, profanities
   * won't be filtered out.
   * </pre>
   *
   * <code>bool profanity_filter = 5;</code>
   */
  boolean getProfanityFilter();

  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.SpeechContext> 
      getSpeechContextsList();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechContext getSpeechContexts(int index);
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechContext speech_contexts = 6;</code>
   */
  int getSpeechContextsCount();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechContext speech_contexts = 6;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.SpeechContextOrBuilder> 
      getSpeechContextsOrBuilderList();
  /**
   * <pre>
   * *Optional* A means to provide context to assist the speech recognition.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechContext speech_contexts = 6;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechContextOrBuilder getSpeechContextsOrBuilder(
      int index);

  /**
   * <pre>
   * *Optional* If `true`, the top result includes a list of words and
   * the start and end time offsets (timestamps) for those words. If
   * `false`, no word-level time offset information is returned. The default is
   * `false`.
   * </pre>
   *
   * <code>bool enable_word_time_offsets = 8;</code>
   */
  boolean getEnableWordTimeOffsets();

  /**
   * <pre>
   * *Optional* Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * </pre>
   *
   * <code>string model = 13;</code>
   */
  java.lang.String getModel();
  /**
   * <pre>
   * *Optional* Which model to select for the given request. Select the model
   * best suited to your domain to get best results. If a model is not
   * explicitly specified, then we auto-select a model based on the parameters
   * in the RecognitionConfig.
   * </pre>
   *
   * <code>string model = 13;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
