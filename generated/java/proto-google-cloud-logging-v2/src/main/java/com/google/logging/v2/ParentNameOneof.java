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
import com.google.logging.v2.ProjectName;
import com.google.logging.v2.OrganizationName;
import com.google.logging.v2.FolderName;
import com.google.logging.v2.BillingName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ParentNameOneof {

  private final ResourceName resourceName;

  public ProjectName getProjectName() {
    if (resourceName instanceof ProjectName) {
      return (ProjectName) resourceName;
    } else {
      return null;
    }
  }
  public OrganizationName getOrganizationName() {
    if (resourceName instanceof OrganizationName) {
      return (OrganizationName) resourceName;
    } else {
      return null;
    }
  }
  public FolderName getFolderName() {
    if (resourceName instanceof FolderName) {
      return (FolderName) resourceName;
    } else {
      return null;
    }
  }
  public BillingName getBillingName() {
    if (resourceName instanceof BillingName) {
      return (BillingName) resourceName;
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

  public ResourceNameType getType() {
    return getResourceName().getType();
  }

  private ParentNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static ParentNameOneof parse(String resourceNameString) {
    if (ProjectName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(ProjectName.parse(resourceNameString));
    }
    if (OrganizationName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(OrganizationName.parse(resourceNameString));
    }
    if (FolderName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(FolderName.parse(resourceNameString));
    }
    if (BillingName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(BillingName.parse(resourceNameString));
    }
    return new ParentNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static ParentNameOneof from(ProjectName projectName) {
    return new ParentNameOneof(projectName);
  }
  public static ParentNameOneof from(OrganizationName organizationName) {
    return new ParentNameOneof(organizationName);
  }
  public static ParentNameOneof from(FolderName folderName) {
    return new ParentNameOneof(folderName);
  }
  public static ParentNameOneof from(BillingName billingName) {
    return new ParentNameOneof(billingName);
  }

  public static ParentNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new ParentNameOneof(untypedResourceName);
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
    if (o instanceof ParentNameOneof) {
      ParentNameOneof that = (ParentNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

