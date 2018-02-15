/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.bigtable.admin.v2;

import com.google.api.resourcenames.ResourceNameType;

/**
 * @deprecated This class is no longer necessary given the switch from the Oneof pattern to inheritance
 * for one-of groupings.
 */
@Deprecated
// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class LocationNameType implements ResourceNameType {

  private static LocationNameType instance = new LocationNameType();

  private LocationNameType() {}

  public static LocationNameType instance() {
    return instance;
  }
}
