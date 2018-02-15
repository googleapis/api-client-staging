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

package com.google.logging.v2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MetricName extends AnyMetricName {

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

  public static String format(String project, String metric) {
    return newBuilder()
      .setProject(project)
      .setMetric(metric)
      .build()
      .toString();
  }

  public static MetricName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MetricName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("metric"));
  }

  public static List<MetricName> parseList(List<String> formattedStrings) {
    List<MetricName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MetricName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MetricName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  /**
   * @deprecated This method is no longer necessary given the switch from the Oneof pattern to inheritance
   * for one-of groupings.
   */
  @Deprecated
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

