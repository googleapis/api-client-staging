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
public class MonitoredResourceDescriptorName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/monitoredResourceDescriptors/{monitored_resource_descriptor}");

  private final String project;
  private final String monitoredResourceDescriptor;

  public String getProject() {
    return project;
  }

  public String getMonitoredResourceDescriptor() {
    return monitoredResourceDescriptor;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MonitoredResourceDescriptorName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    monitoredResourceDescriptor = Preconditions.checkNotNull(builder.getMonitoredResourceDescriptor());
  }

  public static MonitoredResourceDescriptorName of(String project, String monitoredResourceDescriptor) {
    return newBuilder()
      .setProject(project)
      .setMonitoredResourceDescriptor(monitoredResourceDescriptor)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static MonitoredResourceDescriptorName create(String project, String monitoredResourceDescriptor) {
    return of(project, monitoredResourceDescriptor);
  }

  public static MonitoredResourceDescriptorName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MonitoredResourceDescriptorName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("monitored_resource_descriptor"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return MonitoredResourceDescriptorNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "monitored_resource_descriptor", monitoredResourceDescriptor);
  }

  /** Builder for MonitoredResourceDescriptorName. */
  public static class Builder {

    private String project;
    private String monitoredResourceDescriptor;

    public String getProject() {
      return project;
    }

    public String getMonitoredResourceDescriptor() {
      return monitoredResourceDescriptor;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setMonitoredResourceDescriptor(String monitoredResourceDescriptor) {
      this.monitoredResourceDescriptor = monitoredResourceDescriptor;
      return this;
    }

    private Builder() {
    }

    private Builder(MonitoredResourceDescriptorName monitoredResourceDescriptorName) {
      project = monitoredResourceDescriptorName.project;
      monitoredResourceDescriptor = monitoredResourceDescriptorName.monitoredResourceDescriptor;
    }

    public MonitoredResourceDescriptorName build() {
      return new MonitoredResourceDescriptorName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MonitoredResourceDescriptorName) {
      MonitoredResourceDescriptorName that = (MonitoredResourceDescriptorName) o;
      return (this.project.equals(that.project))
          && (this.monitoredResourceDescriptor.equals(that.monitoredResourceDescriptor));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= monitoredResourceDescriptor.hashCode();
    return h;
  }
}

