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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MetricName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/metrics/{metric}");

  private final String project;
  private final String metric;

  public String getProject() {
    return project;
  }

  public String getMetric() {
    return metric;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MetricName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    metric = Preconditions.checkNotNull(builder.getMetric());
  }

  public static MetricName of(String project, String metric) {
    return newBuilder()
      .setProject(project)
      .setMetric(metric)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static MetricName create(String project, String metric) {
    return of(project, metric);
  }

  public static MetricName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MetricName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("metric"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return MetricNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "metric", metric);
  }

  /** Builder for MetricName. */
  public static class Builder {

    private String project;
    private String metric;

    public String getProject() {
      return project;
    }

    public String getMetric() {
      return metric;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setMetric(String metric) {
      this.metric = metric;
      return this;
    }

    private Builder() {
    }

    private Builder(MetricName metricName) {
      project = metricName.project;
      metric = metricName.metric;
    }

    public MetricName build() {
      return new MetricName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricName) {
      MetricName that = (MetricName) o;
      return (this.project.equals(that.project))
          && (this.metric.equals(that.metric));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= metric.hashCode();
    return h;
  }
}

