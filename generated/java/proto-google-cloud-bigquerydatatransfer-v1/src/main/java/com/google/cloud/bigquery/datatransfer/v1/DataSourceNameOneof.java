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
import com.google.cloud.bigquery.datatransfer.v1.LocationDataSourceName;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DataSourceNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public LocationDataSourceName getLocationDataSourceName() {
    if (resourceName instanceof LocationDataSourceName) {
      return (LocationDataSourceName) resourceName;
    } else {
      return null;
    }
  }
  public DataSourceName getDataSourceName() {
    if (resourceName instanceof DataSourceName) {
      return (DataSourceName) resourceName;
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

  private DataSourceNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static DataSourceNameOneof parse(String resourceNameString) {
    if (LocationDataSourceName.isParsableFrom(resourceNameString)) {
      return new DataSourceNameOneof(LocationDataSourceName.parse(resourceNameString));
    }
    if (DataSourceName.isParsableFrom(resourceNameString)) {
      return new DataSourceNameOneof(DataSourceName.parse(resourceNameString));
    }
    return new DataSourceNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static DataSourceNameOneof from(LocationDataSourceName locationDataSourceName) {
    return new DataSourceNameOneof(locationDataSourceName);
  }
  public static DataSourceNameOneof from(DataSourceName dataSourceName) {
    return new DataSourceNameOneof(dataSourceName);
  }

  public static DataSourceNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new DataSourceNameOneof(untypedResourceName);
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
    if (o instanceof DataSourceNameOneof) {
      DataSourceNameOneof that = (DataSourceNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

