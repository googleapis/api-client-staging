/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.logging.v2;

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.logging.v2.ExclusionName;
import com.google.logging.v2.OrganizationExclusionName;
import com.google.logging.v2.FolderExclusionName;
import com.google.logging.v2.BillingExclusionName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ExclusionNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public ExclusionName getExclusionName() {
    if (resourceName instanceof ExclusionName) {
      return (ExclusionName) resourceName;
    } else {
      return null;
    }
  }
  public OrganizationExclusionName getOrganizationExclusionName() {
    if (resourceName instanceof OrganizationExclusionName) {
      return (OrganizationExclusionName) resourceName;
    } else {
      return null;
    }
  }
  public FolderExclusionName getFolderExclusionName() {
    if (resourceName instanceof FolderExclusionName) {
      return (FolderExclusionName) resourceName;
    } else {
      return null;
    }
  }
  public BillingExclusionName getBillingExclusionName() {
    if (resourceName instanceof BillingExclusionName) {
      return (BillingExclusionName) resourceName;
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

  private ExclusionNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static ExclusionNameOneof parse(String resourceNameString) {
    if (ExclusionName.isParsableFrom(resourceNameString)) {
      return new ExclusionNameOneof(ExclusionName.parse(resourceNameString));
    }
    if (OrganizationExclusionName.isParsableFrom(resourceNameString)) {
      return new ExclusionNameOneof(OrganizationExclusionName.parse(resourceNameString));
    }
    if (FolderExclusionName.isParsableFrom(resourceNameString)) {
      return new ExclusionNameOneof(FolderExclusionName.parse(resourceNameString));
    }
    if (BillingExclusionName.isParsableFrom(resourceNameString)) {
      return new ExclusionNameOneof(BillingExclusionName.parse(resourceNameString));
    }
    return new ExclusionNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static ExclusionNameOneof from(ExclusionName exclusionName) {
    return new ExclusionNameOneof(exclusionName);
  }
  public static ExclusionNameOneof from(OrganizationExclusionName organizationExclusionName) {
    return new ExclusionNameOneof(organizationExclusionName);
  }
  public static ExclusionNameOneof from(FolderExclusionName folderExclusionName) {
    return new ExclusionNameOneof(folderExclusionName);
  }
  public static ExclusionNameOneof from(BillingExclusionName billingExclusionName) {
    return new ExclusionNameOneof(billingExclusionName);
  }

  public static ExclusionNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new ExclusionNameOneof(untypedResourceName);
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
    if (o instanceof ExclusionNameOneof) {
      ExclusionNameOneof that = (ExclusionNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

