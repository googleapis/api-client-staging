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
package com.google.cloud.vision.spi.v1;

import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.Image;
import com.google.cloud.vision.v1.ImageSource;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@javax.annotation.Generated("by GAPIC")
public class ImageAnnotatorSmokeTest {
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
    try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
      String gcsImageUri = "gs://gapic-toolkit/President_Barack_Obama.jpg";
      ImageSource source = ImageSource.newBuilder().setGcsImageUri(gcsImageUri).build();
      Image image = Image.newBuilder().setSource(source).build();
      Feature featuresElement = Feature.newBuilder().build();
      List<Feature> features = Arrays.asList(featuresElement);
      AnnotateImageRequest requestsElement =
          AnnotateImageRequest.newBuilder().setImage(image).addAllFeatures(features).build();
      List<AnnotateImageRequest> requests = Arrays.asList(requestsElement);

      BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
      System.out.println(
          ReflectionToStringBuilder.toString(response, ToStringStyle.MULTI_LINE_STYLE));
    }
  }
}
