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
import com.google.privacy.dlp.v2beta2.DeidentifyTemplateName;
import com.google.privacy.dlp.v2beta2.DeidentifyTemplate2Name;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

/**
 * @deprecated Use AnyDeidentifyTemplateName instead of this class.
 */
@Deprecated
// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DeidentifyTemplateNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public DeidentifyTemplateName getDeidentifyTemplateName() {
    if (resourceName instanceof DeidentifyTemplateName) {
      return (DeidentifyTemplateName) resourceName;
    } else {
      return null;
    }
  }
  public DeidentifyTemplate2Name getDeidentifyTemplate2Name() {
    if (resourceName instanceof DeidentifyTemplate2Name) {
      return (DeidentifyTemplate2Name) resourceName;
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

  private DeidentifyTemplateNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static DeidentifyTemplateNameOneof parse(String resourceNameString) {
    if (DeidentifyTemplateName.isParsableFrom(resourceNameString)) {
      return new DeidentifyTemplateNameOneof(DeidentifyTemplateName.parse(resourceNameString));
    }
    if (DeidentifyTemplate2Name.isParsableFrom(resourceNameString)) {
      return new DeidentifyTemplateNameOneof(DeidentifyTemplate2Name.parse(resourceNameString));
    }
    return new DeidentifyTemplateNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static DeidentifyTemplateNameOneof from(DeidentifyTemplateName deidentifyTemplateName) {
    return new DeidentifyTemplateNameOneof(deidentifyTemplateName);
  }
  public static DeidentifyTemplateNameOneof from(DeidentifyTemplate2Name deidentifyTemplate2Name) {
    return new DeidentifyTemplateNameOneof(deidentifyTemplate2Name);
  }

  public static DeidentifyTemplateNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new DeidentifyTemplateNameOneof(untypedResourceName);
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
    if (o instanceof DeidentifyTemplateNameOneof) {
      DeidentifyTemplateNameOneof that = (DeidentifyTemplateNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

