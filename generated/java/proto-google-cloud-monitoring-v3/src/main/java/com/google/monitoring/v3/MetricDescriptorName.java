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

package com.google.monitoring.v3;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MetricDescriptorName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/metricDescriptors/{metric_descriptor=**}");

  private final String project;
  private final String metricDescriptor;

  public String getProject() {
    return project;
  }

  public String getMetricDescriptor() {
    return metricDescriptor;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MetricDescriptorName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    metricDescriptor = Preconditions.checkNotNull(builder.getMetricDescriptor());
  }

  public static MetricDescriptorName of(String project, String metricDescriptor) {
    return newBuilder()
      .setProject(project)
      .setMetricDescriptor(metricDescriptor)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static MetricDescriptorName create(String project, String metricDescriptor) {
    return of(project, metricDescriptor);
  }

  public static MetricDescriptorName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MetricDescriptorName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("metric_descriptor"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return MetricDescriptorNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "metric_descriptor", metricDescriptor);
  }

  /** Builder for MetricDescriptorName. */
  public static class Builder {

    private String project;
    private String metricDescriptor;

    public String getProject() {
      return project;
    }

    public String getMetricDescriptor() {
      return metricDescriptor;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setMetricDescriptor(String metricDescriptor) {
      this.metricDescriptor = metricDescriptor;
      return this;
    }

    private Builder() {
    }

    private Builder(MetricDescriptorName metricDescriptorName) {
      project = metricDescriptorName.project;
      metricDescriptor = metricDescriptorName.metricDescriptor;
    }

    public MetricDescriptorName build() {
      return new MetricDescriptorName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricDescriptorName) {
      MetricDescriptorName that = (MetricDescriptorName) o;
      return (this.project.equals(that.project))
          && (this.metricDescriptor.equals(that.metricDescriptor));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= metricDescriptor.hashCode();
    return h;
  }
}

