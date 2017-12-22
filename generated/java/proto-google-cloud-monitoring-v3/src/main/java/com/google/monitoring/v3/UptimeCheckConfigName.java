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
public class UptimeCheckConfigName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/uptimeCheckConfigs/{uptime_check_config}");

  private final String project;
  private final String uptimeCheckConfig;

  public String getProject() {
    return project;
  }

  public String getUptimeCheckConfig() {
    return uptimeCheckConfig;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private UptimeCheckConfigName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    uptimeCheckConfig = Preconditions.checkNotNull(builder.getUptimeCheckConfig());
  }

  public static UptimeCheckConfigName of(String project, String uptimeCheckConfig) {
    return newBuilder()
      .setProject(project)
      .setUptimeCheckConfig(uptimeCheckConfig)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static UptimeCheckConfigName create(String project, String uptimeCheckConfig) {
    return of(project, uptimeCheckConfig);
  }

  public static UptimeCheckConfigName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "UptimeCheckConfigName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("uptime_check_config"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return UptimeCheckConfigNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "uptime_check_config", uptimeCheckConfig);
  }

  /** Builder for UptimeCheckConfigName. */
  public static class Builder {

    private String project;
    private String uptimeCheckConfig;

    public String getProject() {
      return project;
    }

    public String getUptimeCheckConfig() {
      return uptimeCheckConfig;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setUptimeCheckConfig(String uptimeCheckConfig) {
      this.uptimeCheckConfig = uptimeCheckConfig;
      return this;
    }

    private Builder() {
    }

    private Builder(UptimeCheckConfigName uptimeCheckConfigName) {
      project = uptimeCheckConfigName.project;
      uptimeCheckConfig = uptimeCheckConfigName.uptimeCheckConfig;
    }

    public UptimeCheckConfigName build() {
      return new UptimeCheckConfigName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UptimeCheckConfigName) {
      UptimeCheckConfigName that = (UptimeCheckConfigName) o;
      return (this.project.equals(that.project))
          && (this.uptimeCheckConfig.equals(that.uptimeCheckConfig));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= uptimeCheckConfig.hashCode();
    return h;
  }
}

