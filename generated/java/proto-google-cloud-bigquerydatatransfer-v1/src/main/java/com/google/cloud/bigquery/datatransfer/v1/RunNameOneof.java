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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.cloud.bigquery.datatransfer.v1.LocationRunName;
import com.google.cloud.bigquery.datatransfer.v1.RunName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

/**
 * @deprecated Use AnyRunName instead of this class.
 */
@Deprecated
// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class RunNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public LocationRunName getLocationRunName() {
    if (resourceName instanceof LocationRunName) {
      return (LocationRunName) resourceName;
    } else {
      return null;
    }
  }
  public RunName getRunName() {
    if (resourceName instanceof RunName) {
      return (RunName) resourceName;
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

  private RunNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static RunNameOneof parse(String resourceNameString) {
    if (LocationRunName.isParsableFrom(resourceNameString)) {
      return new RunNameOneof(LocationRunName.parse(resourceNameString));
    }
    if (RunName.isParsableFrom(resourceNameString)) {
      return new RunNameOneof(RunName.parse(resourceNameString));
    }
    return new RunNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static RunNameOneof from(LocationRunName locationRunName) {
    return new RunNameOneof(locationRunName);
  }
  public static RunNameOneof from(RunName runName) {
    return new RunNameOneof(runName);
  }

  public static RunNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new RunNameOneof(untypedResourceName);
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
    if (o instanceof RunNameOneof) {
      RunNameOneof that = (RunNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

