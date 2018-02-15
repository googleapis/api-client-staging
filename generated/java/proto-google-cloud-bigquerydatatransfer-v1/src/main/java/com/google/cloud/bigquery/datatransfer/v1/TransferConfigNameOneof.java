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
import com.google.cloud.bigquery.datatransfer.v1.LocationTransferConfigName;
import com.google.cloud.bigquery.datatransfer.v1.TransferConfigName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

/**
 * @deprecated Use AnyTransferConfigName instead of this class.
 */
@Deprecated
// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class TransferConfigNameOneof implements ResourceName {

  private final ResourceName resourceName;

  public LocationTransferConfigName getLocationTransferConfigName() {
    if (resourceName instanceof LocationTransferConfigName) {
      return (LocationTransferConfigName) resourceName;
    } else {
      return null;
    }
  }
  public TransferConfigName getTransferConfigName() {
    if (resourceName instanceof TransferConfigName) {
      return (TransferConfigName) resourceName;
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

  private TransferConfigNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static TransferConfigNameOneof parse(String resourceNameString) {
    if (LocationTransferConfigName.isParsableFrom(resourceNameString)) {
      return new TransferConfigNameOneof(LocationTransferConfigName.parse(resourceNameString));
    }
    if (TransferConfigName.isParsableFrom(resourceNameString)) {
      return new TransferConfigNameOneof(TransferConfigName.parse(resourceNameString));
    }
    return new TransferConfigNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static TransferConfigNameOneof from(LocationTransferConfigName locationTransferConfigName) {
    return new TransferConfigNameOneof(locationTransferConfigName);
  }
  public static TransferConfigNameOneof from(TransferConfigName transferConfigName) {
    return new TransferConfigNameOneof(transferConfigName);
  }

  public static TransferConfigNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new TransferConfigNameOneof(untypedResourceName);
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
    if (o instanceof TransferConfigNameOneof) {
      TransferConfigNameOneof that = (TransferConfigNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

