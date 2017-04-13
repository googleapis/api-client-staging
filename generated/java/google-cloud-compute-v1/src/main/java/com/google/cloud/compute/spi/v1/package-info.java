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

/**
 * A client to Google Compute Engine API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>====================== InstancesServiceClient ======================
 *
 * <p>Service Description:
 *
 * <p>Sample for InstancesServiceClient:
 *
 * <pre>
 * <code>
 * try (InstancesServiceClient instancesServiceClient = InstancesServiceClient.create()) {
 *   String project = "";
 *   String zone = "";
 *   String instance = "";
 *   Instance response = instancesServiceClient.getInstance(project, zone, instance);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.compute.spi.v1;
