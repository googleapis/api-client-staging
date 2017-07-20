/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@javax.annotation.Generated("by GAPIC")
public class SpeechSmokeTest {
  public static void main(String args[]) {
    Logger.getLogger("").setLevel(Level.WARNING);
    try {
      executeNoCatch();
      System.out.println("OK");
    } catch (Exception e) {
      System.err.println("Failed with exception:");
      e.printStackTrace(System.err);
      System.exit(1);
    }
  }

  public static void executeNoCatch() throws Exception {
    try (SpeechClient client = SpeechClient.create()) {
      String languageCode = "en-US";
      int sampleRateHertz = 44100;
      RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
      RecognitionConfig config =
          RecognitionConfig.newBuilder()
              .setLanguageCode(languageCode)
              .setSampleRateHertz(sampleRateHertz)
              .setEncoding(encoding)
              .build();
      String uri = "gs://gapic-toolkit/hello.flac";
      RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(uri).build();

      RecognizeResponse response = client.recognize(config, audio);
      System.out.println(
          ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
    }
  }
}
