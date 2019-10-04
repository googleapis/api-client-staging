/*
 * Copyright 2019 Google LLC
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

/**
 * A client to Long Running Operations API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================ OperationsClient ================
 *
 * <p>Service Description: Manages long-running operations with an API service.
 *
 * <p>When an API method normally takes long time to complete, it can be designed to return
 * [Operation][google.longrunning.Operation] to the client, and the client can use this interface to
 * receive the real response asynchronously by polling the operation resource, or pass the operation
 * resource to another API (such as Google Cloud Pub/Sub API) to receive the response. Any API
 * service that returns long-running operations should implement the `Operations` interface so
 * developers can have a consistent client experience.
 */
@Generated("by gapic-generator")
package com.google.longrunning;

import javax.annotation.Generated;
