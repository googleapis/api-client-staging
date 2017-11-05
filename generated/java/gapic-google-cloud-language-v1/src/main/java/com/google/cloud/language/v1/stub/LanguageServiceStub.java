/*
 * Copyright 2017, Google LLC All rights reserved.
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
package com.google.cloud.language.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.language.v1.AnalyzeEntitiesRequest;
import com.google.cloud.language.v1.AnalyzeEntitiesResponse;
import com.google.cloud.language.v1.AnalyzeEntitySentimentRequest;
import com.google.cloud.language.v1.AnalyzeEntitySentimentResponse;
import com.google.cloud.language.v1.AnalyzeSentimentRequest;
import com.google.cloud.language.v1.AnalyzeSentimentResponse;
import com.google.cloud.language.v1.AnalyzeSyntaxRequest;
import com.google.cloud.language.v1.AnalyzeSyntaxResponse;
import com.google.cloud.language.v1.AnnotateTextRequest;
import com.google.cloud.language.v1.AnnotateTextResponse;
import com.google.cloud.language.v1.ClassifyTextRequest;
import com.google.cloud.language.v1.ClassifyTextResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Cloud Natural Language API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public abstract class LanguageServiceStub implements BackgroundResource {

  public UnaryCallable<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentCallable() {
    throw new UnsupportedOperationException("Not implemented: analyzeSentimentCallable()");
  }

  public UnaryCallable<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse> analyzeEntitiesCallable() {
    throw new UnsupportedOperationException("Not implemented: analyzeEntitiesCallable()");
  }

  public UnaryCallable<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentCallable() {
    throw new UnsupportedOperationException("Not implemented: analyzeEntitySentimentCallable()");
  }

  public UnaryCallable<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxCallable() {
    throw new UnsupportedOperationException("Not implemented: analyzeSyntaxCallable()");
  }

  public UnaryCallable<ClassifyTextRequest, ClassifyTextResponse> classifyTextCallable() {
    throw new UnsupportedOperationException("Not implemented: classifyTextCallable()");
  }

  public UnaryCallable<AnnotateTextRequest, AnnotateTextResponse> annotateTextCallable() {
    throw new UnsupportedOperationException("Not implemented: annotateTextCallable()");
  }
}
