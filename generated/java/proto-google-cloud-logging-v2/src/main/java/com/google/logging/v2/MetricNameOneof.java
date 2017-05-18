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
import com.google.logging.v2.MetricName;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MetricNameOneof {

  private final ResourceName resourceName;

  public MetricName getMetricName() {
    if (resourceName instanceof MetricName) {
      return (MetricName) resourceName;
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

  private MetricNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static MetricNameOneof parse(String resourceNameString) {
    if (MetricName.isParsableFrom(resourceNameString)) {
      return new MetricNameOneof(MetricName.parse(resourceNameString));
    }
    return new MetricNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static MetricNameOneof from(MetricName metricName) {
    return new MetricNameOneof(metricName);
  }

  public static MetricNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new MetricNameOneof(untypedResourceName);
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
    if (o instanceof MetricNameOneof) {
      MetricNameOneof that = (MetricNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

