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

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.privacy.dlp.v2beta2.InspectTemplateName;
import com.google.privacy.dlp.v2beta2.InspectTemplate2Name;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

/**
 * @deprecated Use AnyInspectTemplateName instead of this class.
 */
@Deprecated
// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class InspectTemplateNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public InspectTemplateName getInspectTemplateName() {
    if (resourceName instanceof InspectTemplateName) {
      return (InspectTemplateName) resourceName;
    } else {
      return null;
    }
  }
  public InspectTemplate2Name getInspectTemplate2Name() {
    if (resourceName instanceof InspectTemplate2Name) {
      return (InspectTemplate2Name) resourceName;
    } else {
      return null;
    }
  }

  public UntypedResourceName getUntypedResourceName() {
    if (resourceName instanceof UntypedResourceName) {
      return (UntypedResourceName) resourceName;
    } else {
      return null;
    }
  }

  public ResourceName getResourceName() {
    return resourceName;
  }

  @Override
  public ResourceNameType getType() {
    return getResourceName().getType();
  }

  private InspectTemplateNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static InspectTemplateNameOneof parse(String resourceNameString) {
    if (InspectTemplateName.isParsableFrom(resourceNameString)) {
      return new InspectTemplateNameOneof(InspectTemplateName.parse(resourceNameString));
    }
    if (InspectTemplate2Name.isParsableFrom(resourceNameString)) {
      return new InspectTemplateNameOneof(InspectTemplate2Name.parse(resourceNameString));
    }
    return new InspectTemplateNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static InspectTemplateNameOneof from(InspectTemplateName inspectTemplateName) {
    return new InspectTemplateNameOneof(inspectTemplateName);
  }
  public static InspectTemplateNameOneof from(InspectTemplate2Name inspectTemplate2Name) {
    return new InspectTemplateNameOneof(inspectTemplate2Name);
  }

  public static InspectTemplateNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new InspectTemplateNameOneof(untypedResourceName);
  }

  @Override
  public String toString() {
    return getResourceName().toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InspectTemplateNameOneof) {
      InspectTemplateNameOneof that = (InspectTemplateNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

