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
package com.google.cloud.speech.v1beta1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.grpc.testing.MockStreamObserver;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiStreamObserver;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.speech.v1beta1.RecognitionConfig.AudioEncoding;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class SpeechClientTest {
  private static MockSpeech mockSpeech;
  private static MockServiceHelper serviceHelper;
  private SpeechClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockSpeech = new MockSpeech();
    serviceHelper =
        new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockSpeech));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    SpeechSettings settings =
        SpeechSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SpeechClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void syncRecognizeTest() {
    SyncRecognizeResponse expectedResponse = SyncRecognizeResponse.newBuilder().build();
    mockSpeech.addResponse(expectedResponse);

    RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
    int sampleRate = 44100;
    RecognitionConfig config =
        RecognitionConfig.newBuilder().setEncoding(encoding).setSampleRate(sampleRate).build();
    String uri = "gs://bucket_name/file_name.flac";
    RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(uri).build();

    SyncRecognizeResponse actualResponse = client.syncRecognize(config, audio);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpeech.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SyncRecognizeRequest actualRequest = (SyncRecognizeRequest) actualRequests.get(0);

    Assert.assertEquals(config, actualRequest.getConfig());
    Assert.assertEquals(audio, actualRequest.getAudio());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void syncRecognizeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpeech.addException(exception);

    try {
      RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
      int sampleRate = 44100;
      RecognitionConfig config =
          RecognitionConfig.newBuilder().setEncoding(encoding).setSampleRate(sampleRate).build();
      String uri = "gs://bucket_name/file_name.flac";
      RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(uri).build();

      client.syncRecognize(config, audio);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void asyncRecognizeTest() throws Exception {
    AsyncRecognizeResponse expectedResponse = AsyncRecognizeResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("asyncRecognizeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockSpeech.addResponse(resultOperation);

    RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
    int sampleRate = 44100;
    RecognitionConfig config =
        RecognitionConfig.newBuilder().setEncoding(encoding).setSampleRate(sampleRate).build();
    String uri = "gs://bucket_name/file_name.flac";
    RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(uri).build();

    AsyncRecognizeResponse actualResponse = client.asyncRecognizeAsync(config, audio).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpeech.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AsyncRecognizeRequest actualRequest = (AsyncRecognizeRequest) actualRequests.get(0);

    Assert.assertEquals(config, actualRequest.getConfig());
    Assert.assertEquals(audio, actualRequest.getAudio());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void asyncRecognizeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpeech.addException(exception);

    try {
      RecognitionConfig.AudioEncoding encoding = RecognitionConfig.AudioEncoding.FLAC;
      int sampleRate = 44100;
      RecognitionConfig config =
          RecognitionConfig.newBuilder().setEncoding(encoding).setSampleRate(sampleRate).build();
      String uri = "gs://bucket_name/file_name.flac";
      RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(uri).build();

      client.asyncRecognizeAsync(config, audio).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void streamingRecognizeTest() throws Exception {
    int resultIndex = 520358448;
    StreamingRecognizeResponse expectedResponse =
        StreamingRecognizeResponse.newBuilder().setResultIndex(resultIndex).build();
    mockSpeech.addResponse(expectedResponse);
    StreamingRecognizeRequest request = StreamingRecognizeRequest.newBuilder().build();

    MockStreamObserver<StreamingRecognizeResponse> responseObserver = new MockStreamObserver<>();

    BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> callable =
        client.streamingRecognizeCallable();
    ApiStreamObserver<StreamingRecognizeRequest> requestObserver =
        callable.bidiStreamingCall(responseObserver);

    requestObserver.onNext(request);
    requestObserver.onCompleted();

    List<StreamingRecognizeResponse> actualResponses = responseObserver.future().get();
    Assert.assertEquals(1, actualResponses.size());
    Assert.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  @SuppressWarnings("all")
  public void streamingRecognizeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpeech.addException(exception);
    StreamingRecognizeRequest request = StreamingRecognizeRequest.newBuilder().build();

    MockStreamObserver<StreamingRecognizeResponse> responseObserver = new MockStreamObserver<>();

    BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> callable =
        client.streamingRecognizeCallable();
    ApiStreamObserver<StreamingRecognizeRequest> requestObserver =
        callable.bidiStreamingCall(responseObserver);

    requestObserver.onNext(request);

    try {
      List<StreamingRecognizeResponse> actualResponses = responseObserver.future().get();
      Assert.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assert.assertTrue(e.getCause() instanceof InvalidArgumentException);
      InvalidArgumentException apiException = (InvalidArgumentException) e.getCause();
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
