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

package com.google.spanner.admin.instance.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class InstanceConfigName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/instanceConfigs/{instance_config}");

  private final String project;
  private final String instanceConfig;

  public String getProject() {
    return project;
  }

  public String getInstanceConfig() {
    return instanceConfig;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private InstanceConfigName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    instanceConfig = Preconditions.checkNotNull(builder.getInstanceConfig());
  }

  public static InstanceConfigName of(String project, String instanceConfig) {
    return newBuilder()
      .setProject(project)
      .setInstanceConfig(instanceConfig)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static InstanceConfigName create(String project, String instanceConfig) {
    return of(project, instanceConfig);
  }

  public static InstanceConfigName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "InstanceConfigName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("instance_config"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return InstanceConfigNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "instance_config", instanceConfig);
  }

  /** Builder for InstanceConfigName. */
  public static class Builder {

    private String project;
    private String instanceConfig;

    public String getProject() {
      return project;
    }

    public String getInstanceConfig() {
      return instanceConfig;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setInstanceConfig(String instanceConfig) {
      this.instanceConfig = instanceConfig;
      return this;
    }

    private Builder() {
    }

    private Builder(InstanceConfigName instanceConfigName) {
      project = instanceConfigName.project;
      instanceConfig = instanceConfigName.instanceConfig;
    }

    public InstanceConfigName build() {
      return new InstanceConfigName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceConfigName) {
      InstanceConfigName that = (InstanceConfigName) o;
      return (this.project.equals(that.project))
          && (this.instanceConfig.equals(that.instanceConfig));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= instanceConfig.hashCode();
    return h;
  }
}

