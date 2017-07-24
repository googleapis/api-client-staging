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
package com.google.cloud.dlp.v2beta1;

import com.google.privacy.dlp.v2beta1.ContentItem;
import com.google.privacy.dlp.v2beta1.InspectConfig;
import com.google.privacy.dlp.v2beta1.InspectContentResponse;
import com.google.privacy.dlp.v2beta1.Likelihood;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@javax.annotation.Generated("by GAPIC")
public class DlpServiceSmokeTest {
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
    try (DlpServiceClient client = DlpServiceClient.create()) {
      Likelihood minLikelihood = Likelihood.POSSIBLE;
      InspectConfig inspectConfig =
          InspectConfig.newBuilder().setMinLikelihood(minLikelihood).build();
      String type = "text/plain";
      String value = "my phone number is 215-512-1212";
      ContentItem itemsElement = ContentItem.newBuilder().setType(type).setValue(value).build();
      List<ContentItem> items = Arrays.asList(itemsElement);

      InspectContentResponse response = client.inspectContent(inspectConfig, items);
      System.out.println(
          ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
    }
  }
}
