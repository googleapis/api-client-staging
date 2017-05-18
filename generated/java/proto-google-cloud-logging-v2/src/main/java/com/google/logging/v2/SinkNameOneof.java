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
import com.google.logging.v2.SinkName;
import com.google.logging.v2.OrganizationSinkName;
import com.google.logging.v2.FolderSinkName;
import com.google.logging.v2.BillingSinkName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SinkNameOneof {

  private final ResourceName resourceName;

  public SinkName getSinkName() {
    if (resourceName instanceof SinkName) {
      return (SinkName) resourceName;
    } else {
      return null;
    }
  }
  public OrganizationSinkName getOrganizationSinkName() {
    if (resourceName instanceof OrganizationSinkName) {
      return (OrganizationSinkName) resourceName;
    } else {
      return null;
    }
  }
  public FolderSinkName getFolderSinkName() {
    if (resourceName instanceof FolderSinkName) {
      return (FolderSinkName) resourceName;
    } else {
      return null;
    }
  }
  public BillingSinkName getBillingSinkName() {
    if (resourceName instanceof BillingSinkName) {
      return (BillingSinkName) resourceName;
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

  private SinkNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static SinkNameOneof parse(String resourceNameString) {
    if (SinkName.isParsableFrom(resourceNameString)) {
      return new SinkNameOneof(SinkName.parse(resourceNameString));
    }
    if (OrganizationSinkName.isParsableFrom(resourceNameString)) {
      return new SinkNameOneof(OrganizationSinkName.parse(resourceNameString));
    }
    if (FolderSinkName.isParsableFrom(resourceNameString)) {
      return new SinkNameOneof(FolderSinkName.parse(resourceNameString));
    }
    if (BillingSinkName.isParsableFrom(resourceNameString)) {
      return new SinkNameOneof(BillingSinkName.parse(resourceNameString));
    }
    return new SinkNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static SinkNameOneof from(SinkName sinkName) {
    return new SinkNameOneof(sinkName);
  }
  public static SinkNameOneof from(OrganizationSinkName organizationSinkName) {
    return new SinkNameOneof(organizationSinkName);
  }
  public static SinkNameOneof from(FolderSinkName folderSinkName) {
    return new SinkNameOneof(folderSinkName);
  }
  public static SinkNameOneof from(BillingSinkName billingSinkName) {
    return new SinkNameOneof(billingSinkName);
  }

  public static SinkNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new SinkNameOneof(untypedResourceName);
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
    if (o instanceof SinkNameOneof) {
      SinkNameOneof that = (SinkNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

