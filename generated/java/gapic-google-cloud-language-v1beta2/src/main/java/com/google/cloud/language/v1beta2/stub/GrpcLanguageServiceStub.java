/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.language.v1beta2.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.language.v1beta2.AnalyzeEntitiesRequest;
import com.google.cloud.language.v1beta2.AnalyzeEntitiesResponse;
import com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest;
import com.google.cloud.language.v1beta2.AnalyzeEntitySentimentResponse;
import com.google.cloud.language.v1beta2.AnalyzeSentimentRequest;
import com.google.cloud.language.v1beta2.AnalyzeSentimentResponse;
import com.google.cloud.language.v1beta2.AnalyzeSyntaxRequest;
import com.google.cloud.language.v1beta2.AnalyzeSyntaxResponse;
import com.google.cloud.language.v1beta2.AnnotateTextRequest;
import com.google.cloud.language.v1beta2.AnnotateTextResponse;
import com.google.cloud.language.v1beta2.ClassifyTextRequest;
import com.google.cloud.language.v1beta2.ClassifyTextResponse;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Google Cloud Natural Language API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcLanguageServiceStub extends LanguageServiceStub {

  private static final MethodDescriptor<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentMethodDescriptor =
          MethodDescriptor.<AnalyzeSentimentRequest, AnalyzeSentimentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.language.v1beta2.LanguageService/AnalyzeSentiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeSentimentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnalyzeSentimentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      analyzeEntitiesMethodDescriptor =
          MethodDescriptor.<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.language.v1beta2.LanguageService/AnalyzeEntities")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnalyzeEntitiesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentMethodDescriptor =
          MethodDescriptor
              .<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.language.v1beta2.LanguageService/AnalyzeEntitySentiment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeEntitySentimentRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnalyzeEntitySentimentResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>
      analyzeSyntaxMethodDescriptor =
          MethodDescriptor.<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.language.v1beta2.LanguageService/AnalyzeSyntax")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AnalyzeSyntaxRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnalyzeSyntaxResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ClassifyTextRequest, ClassifyTextResponse>
      classifyTextMethodDescriptor =
          MethodDescriptor.<ClassifyTextRequest, ClassifyTextResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.language.v1beta2.LanguageService/ClassifyText")
              .setRequestMarshaller(ProtoUtils.marshaller(ClassifyTextRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ClassifyTextResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<AnnotateTextRequest, AnnotateTextResponse>
      annotateTextMethodDescriptor =
          MethodDescriptor.<AnnotateTextRequest, AnnotateTextResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.language.v1beta2.LanguageService/AnnotateText")
              .setRequestMarshaller(ProtoUtils.marshaller(AnnotateTextRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AnnotateTextResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentCallable;
  private final UnaryCallable<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      analyzeEntitiesCallable;
  private final UnaryCallable<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentCallable;
  private final UnaryCallable<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxCallable;
  private final UnaryCallable<ClassifyTextRequest, ClassifyTextResponse> classifyTextCallable;
  private final UnaryCallable<AnnotateTextRequest, AnnotateTextResponse> annotateTextCallable;

  public static final GrpcLanguageServiceStub create(LanguageServiceStubSettings settings)
      throws IOException {
    return new GrpcLanguageServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLanguageServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLanguageServiceStub(
        LanguageServiceStubSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcLanguageServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLanguageServiceStub(
      LanguageServiceStubSettings settings, ClientContext clientContext) throws IOException {

    GrpcCallSettings<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
        analyzeSentimentTransportSettings =
            GrpcCallSettings.<AnalyzeSentimentRequest, AnalyzeSentimentResponse>newBuilder()
                .setMethodDescriptor(analyzeSentimentMethodDescriptor)
                .build();
    GrpcCallSettings<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
        analyzeEntitiesTransportSettings =
            GrpcCallSettings.<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>newBuilder()
                .setMethodDescriptor(analyzeEntitiesMethodDescriptor)
                .build();
    GrpcCallSettings<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
        analyzeEntitySentimentTransportSettings =
            GrpcCallSettings
                .<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>newBuilder()
                .setMethodDescriptor(analyzeEntitySentimentMethodDescriptor)
                .build();
    GrpcCallSettings<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxTransportSettings =
        GrpcCallSettings.<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>newBuilder()
            .setMethodDescriptor(analyzeSyntaxMethodDescriptor)
            .build();
    GrpcCallSettings<ClassifyTextRequest, ClassifyTextResponse> classifyTextTransportSettings =
        GrpcCallSettings.<ClassifyTextRequest, ClassifyTextResponse>newBuilder()
            .setMethodDescriptor(classifyTextMethodDescriptor)
            .build();
    GrpcCallSettings<AnnotateTextRequest, AnnotateTextResponse> annotateTextTransportSettings =
        GrpcCallSettings.<AnnotateTextRequest, AnnotateTextResponse>newBuilder()
            .setMethodDescriptor(annotateTextMethodDescriptor)
            .build();

    this.analyzeSentimentCallable =
        GrpcCallableFactory.createUnaryCallable(
            analyzeSentimentTransportSettings, settings.analyzeSentimentSettings(), clientContext);
    this.analyzeEntitiesCallable =
        GrpcCallableFactory.createUnaryCallable(
            analyzeEntitiesTransportSettings, settings.analyzeEntitiesSettings(), clientContext);
    this.analyzeEntitySentimentCallable =
        GrpcCallableFactory.createUnaryCallable(
            analyzeEntitySentimentTransportSettings,
            settings.analyzeEntitySentimentSettings(),
            clientContext);
    this.analyzeSyntaxCallable =
        GrpcCallableFactory.createUnaryCallable(
            analyzeSyntaxTransportSettings, settings.analyzeSyntaxSettings(), clientContext);
    this.classifyTextCallable =
        GrpcCallableFactory.createUnaryCallable(
            classifyTextTransportSettings, settings.classifyTextSettings(), clientContext);
    this.annotateTextCallable =
        GrpcCallableFactory.createUnaryCallable(
            annotateTextTransportSettings, settings.annotateTextSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentCallable() {
    return analyzeSentimentCallable;
  }

  public UnaryCallable<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse> analyzeEntitiesCallable() {
    return analyzeEntitiesCallable;
  }

  public UnaryCallable<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentCallable() {
    return analyzeEntitySentimentCallable;
  }

  public UnaryCallable<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxCallable() {
    return analyzeSyntaxCallable;
  }

  public UnaryCallable<ClassifyTextRequest, ClassifyTextResponse> classifyTextCallable() {
    return classifyTextCallable;
  }

  public UnaryCallable<AnnotateTextRequest, AnnotateTextResponse> annotateTextCallable() {
    return annotateTextCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
