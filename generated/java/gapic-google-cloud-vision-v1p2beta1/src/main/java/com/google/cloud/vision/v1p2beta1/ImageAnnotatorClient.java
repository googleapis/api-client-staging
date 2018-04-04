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
package com.google.cloud.vision.v1p2beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStub;
import com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service that performs Google Cloud Vision API detection tasks over client
 * images, such as face, landmark, logo, label, and text detection. The ImageAnnotator service
 * returns detected entities from the images.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
 *   List&lt;AnnotateImageRequest&gt; requests = new ArrayList&lt;&gt;();
 *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the imageAnnotatorClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ImageAnnotatorSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ImageAnnotatorSettings imageAnnotatorSettings =
 *     ImageAnnotatorSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ImageAnnotatorClient imageAnnotatorClient =
 *     ImageAnnotatorClient.create(imageAnnotatorSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ImageAnnotatorSettings imageAnnotatorSettings =
 *     ImageAnnotatorSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ImageAnnotatorClient imageAnnotatorClient =
 *     ImageAnnotatorClient.create(imageAnnotatorSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
public class ImageAnnotatorClient implements BackgroundResource {
  private final ImageAnnotatorSettings settings;
  private final ImageAnnotatorStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of ImageAnnotatorClient with default settings. */
  public static final ImageAnnotatorClient create() throws IOException {
    return create(ImageAnnotatorSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ImageAnnotatorClient create(ImageAnnotatorSettings settings)
      throws IOException {
    return new ImageAnnotatorClient(settings);
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use ImageAnnotatorSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ImageAnnotatorClient create(ImageAnnotatorStub stub) {
    return new ImageAnnotatorClient(stub);
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ImageAnnotatorClient(ImageAnnotatorSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ImageAnnotatorStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ImageAnnotatorClient(ImageAnnotatorStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final ImageAnnotatorSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ImageAnnotatorStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AnnotateImageRequest&gt; requests = new ArrayList&lt;&gt;();
   *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
   * }
   * </code></pre>
   *
   * @param requests Individual image annotation requests for this batch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchAnnotateImagesResponse batchAnnotateImages(
      List<AnnotateImageRequest> requests) {

    BatchAnnotateImagesRequest request =
        BatchAnnotateImagesRequest.newBuilder().addAllRequests(requests).build();
    return batchAnnotateImages(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AnnotateImageRequest&gt; requests = new ArrayList&lt;&gt;();
   *   BatchAnnotateImagesRequest request = BatchAnnotateImagesRequest.newBuilder()
   *     .addAllRequests(requests)
   *     .build();
   *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final BatchAnnotateImagesResponse batchAnnotateImages(
      BatchAnnotateImagesRequest request) {
    return batchAnnotateImagesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AnnotateImageRequest&gt; requests = new ArrayList&lt;&gt;();
   *   BatchAnnotateImagesRequest request = BatchAnnotateImagesRequest.newBuilder()
   *     .addAllRequests(requests)
   *     .build();
   *   ApiFuture&lt;BatchAnnotateImagesResponse&gt; future = imageAnnotatorClient.batchAnnotateImagesCallable().futureCall(request);
   *   // Do something
   *   BatchAnnotateImagesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchAnnotateImagesRequest, BatchAnnotateImagesResponse>
      batchAnnotateImagesCallable() {
    return stub.batchAnnotateImagesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   * contain multiple pages and multiple images per page. Progress and results can be retrieved
   * through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   * (results).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AsyncAnnotateFileRequest&gt; requests = new ArrayList&lt;&gt;();
   *   AsyncBatchAnnotateFilesResponse response = imageAnnotatorClient.asyncBatchAnnotateFilesAsync(requests).get();
   * }
   * </code></pre>
   *
   * @param requests Individual async file annotation requests for this batch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AsyncBatchAnnotateFilesResponse, OperationMetadata>
      asyncBatchAnnotateFilesAsync(List<AsyncAnnotateFileRequest> requests) {

    AsyncBatchAnnotateFilesRequest request =
        AsyncBatchAnnotateFilesRequest.newBuilder().addAllRequests(requests).build();
    return asyncBatchAnnotateFilesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   * contain multiple pages and multiple images per page. Progress and results can be retrieved
   * through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   * (results).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AsyncAnnotateFileRequest&gt; requests = new ArrayList&lt;&gt;();
   *   AsyncBatchAnnotateFilesRequest request = AsyncBatchAnnotateFilesRequest.newBuilder()
   *     .addAllRequests(requests)
   *     .build();
   *   AsyncBatchAnnotateFilesResponse response = imageAnnotatorClient.asyncBatchAnnotateFilesAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final OperationFuture<AsyncBatchAnnotateFilesResponse, OperationMetadata>
      asyncBatchAnnotateFilesAsync(AsyncBatchAnnotateFilesRequest request) {
    return asyncBatchAnnotateFilesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   * contain multiple pages and multiple images per page. Progress and results can be retrieved
   * through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   * (results).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AsyncAnnotateFileRequest&gt; requests = new ArrayList&lt;&gt;();
   *   AsyncBatchAnnotateFilesRequest request = AsyncBatchAnnotateFilesRequest.newBuilder()
   *     .addAllRequests(requests)
   *     .build();
   *   OperationFuture&lt;Operation&gt; future = imageAnnotatorClient.asyncBatchAnnotateFilesOperationCallable().futureCall(request);
   *   // Do something
   *   AsyncBatchAnnotateFilesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final OperationCallable<
          AsyncBatchAnnotateFilesRequest, AsyncBatchAnnotateFilesResponse, OperationMetadata>
      asyncBatchAnnotateFilesOperationCallable() {
    return stub.asyncBatchAnnotateFilesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Run async image detection and annotation for a list of generic files (e.g. PDF) which may
   * contain multiple pages and multiple images per page. Progress and results can be retrieved
   * through the `google.longrunning.Operations` interface. `Operation.metadata` contains
   * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
   * (results).
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List&lt;AsyncAnnotateFileRequest&gt; requests = new ArrayList&lt;&gt;();
   *   AsyncBatchAnnotateFilesRequest request = AsyncBatchAnnotateFilesRequest.newBuilder()
   *     .addAllRequests(requests)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = imageAnnotatorClient.asyncBatchAnnotateFilesCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<AsyncBatchAnnotateFilesRequest, Operation>
      asyncBatchAnnotateFilesCallable() {
    return stub.asyncBatchAnnotateFilesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
