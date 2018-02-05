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

/**
 * A client to Google Cloud OS Login API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>==================== OsLoginServiceClient ====================
 *
 * <p>Service Description: Cloud OS Login API
 *
 * <p>The Cloud OS Login API allows you to manage users and their associated SSH public keys for
 * logging into virtual machines on Google Cloud Platform.
 *
 * <p>Sample for OsLoginServiceClient:
 *
 * <pre>
 * <code>
 * try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
 *   ProjectName name = ProjectName.of("[USER]", "[PROJECT]");
 *   osLoginServiceClient.deletePosixAccount(name);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.oslogin.v1;
