/*
 * Copyright 2016, Google Inc. All rights reserved.
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
package com.google.cloud.language.spi.v1beta1;

import com.google.cloud.language.v1beta1.AnalyzeSentimentResponse;
import com.google.cloud.language.v1beta1.Document;
import com.google.cloud.language.v1beta1.Document.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@javax.annotation.Generated("by GAPIC")
public class LanguageServiceSmokeTest {
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
    try (LanguageServiceApi api = LanguageServiceApi.create()) {
      Document.Type type = Document.Type.TYPE_UNSPECIFIED;
      Document document = Document.newBuilder().setType(type).build();

      AnalyzeSentimentResponse response = api.analyzeSentiment(document);
      System.out.println(
          ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
    }
  }
}
