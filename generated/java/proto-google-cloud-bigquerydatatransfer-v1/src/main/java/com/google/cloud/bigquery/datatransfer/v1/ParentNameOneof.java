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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.cloud.bigquery.datatransfer.v1.LocationName;
import com.google.cloud.bigquery.datatransfer.v1.ProjectName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ParentNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public LocationName getLocationName() {
    if (resourceName instanceof LocationName) {
      return (LocationName) resourceName;
    } else {
      return null;
    }
  }
  public ProjectName getProjectName() {
    if (resourceName instanceof ProjectName) {
      return (ProjectName) resourceName;
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

  private ParentNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static ParentNameOneof parse(String resourceNameString) {
    if (LocationName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(LocationName.parse(resourceNameString));
    }
    if (ProjectName.isParsableFrom(resourceNameString)) {
      return new ParentNameOneof(ProjectName.parse(resourceNameString));
    }
    return new ParentNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static ParentNameOneof from(LocationName locationName) {
    return new ParentNameOneof(locationName);
  }
  public static ParentNameOneof from(ProjectName projectName) {
    return new ParentNameOneof(projectName);
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

