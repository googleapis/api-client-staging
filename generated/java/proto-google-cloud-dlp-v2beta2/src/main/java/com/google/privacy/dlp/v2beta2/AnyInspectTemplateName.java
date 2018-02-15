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

package com.google.privacy.dlp.v2beta2;

import com.google.api.resourcenames.ResourceName;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public abstract class AnyInspectTemplateName implements ResourceName {
  protected AnyInspectTemplateName() {}

  public static AnyInspectTemplateName parse(String resourceNameString) {
    if (InspectTemplateName.isParsableFrom(resourceNameString)) {
      return InspectTemplateName.parse(resourceNameString);
    }
    if (InspectTemplate2Name.isParsableFrom(resourceNameString)) {
      return InspectTemplate2Name.parse(resourceNameString);
    }
    return UntypedInspectTemplateName.parse(resourceNameString);
  }
}
