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
import com.google.logging.v2.LogName;
import com.google.logging.v2.OrganizationLogName;
import com.google.logging.v2.FolderLogName;
import com.google.logging.v2.BillingLogName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class LogNameOneof {

  private final ResourceName resourceName;

  public LogName getLogName() {
    if (resourceName instanceof LogName) {
      return (LogName) resourceName;
    } else {
      return null;
    }
  }
  public OrganizationLogName getOrganizationLogName() {
    if (resourceName instanceof OrganizationLogName) {
      return (OrganizationLogName) resourceName;
    } else {
      return null;
    }
  }
  public FolderLogName getFolderLogName() {
    if (resourceName instanceof FolderLogName) {
      return (FolderLogName) resourceName;
    } else {
      return null;
    }
  }
  public BillingLogName getBillingLogName() {
    if (resourceName instanceof BillingLogName) {
      return (BillingLogName) resourceName;
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

  private LogNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static LogNameOneof parse(String resourceNameString) {
    if (LogName.isParsableFrom(resourceNameString)) {
      return new LogNameOneof(LogName.parse(resourceNameString));
    }
    if (OrganizationLogName.isParsableFrom(resourceNameString)) {
      return new LogNameOneof(OrganizationLogName.parse(resourceNameString));
    }
    if (FolderLogName.isParsableFrom(resourceNameString)) {
      return new LogNameOneof(FolderLogName.parse(resourceNameString));
    }
    if (BillingLogName.isParsableFrom(resourceNameString)) {
      return new LogNameOneof(BillingLogName.parse(resourceNameString));
    }
    return new LogNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static LogNameOneof from(LogName logName) {
    return new LogNameOneof(logName);
  }
  public static LogNameOneof from(OrganizationLogName organizationLogName) {
    return new LogNameOneof(organizationLogName);
  }
  public static LogNameOneof from(FolderLogName folderLogName) {
    return new LogNameOneof(folderLogName);
  }
  public static LogNameOneof from(BillingLogName billingLogName) {
    return new LogNameOneof(billingLogName);
  }

  public static LogNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new LogNameOneof(untypedResourceName);
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
    if (o instanceof LogNameOneof) {
      LogNameOneof that = (LogNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

