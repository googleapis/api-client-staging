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

package com.google.cloud.dialogflow.v2beta1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ProjectAgentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/agent");

  private final String project;

  public String getProject() {
    return project;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectAgentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ProjectAgentName of(String project) {
    return newBuilder()
      .setProject(project)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String)} instead.
   */
  @Deprecated
  public static ProjectAgentName create(String project) {
    return of(project);
  }

  public static ProjectAgentName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ProjectAgentName.parse: formattedString not in valid format");
    return of(matchMap.get("project"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return ProjectAgentNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project);
  }

  /** Builder for ProjectAgentName. */
  public static class Builder {

    private String project;

    public String getProject() {
      return project;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {
    }

    private Builder(ProjectAgentName projectAgentName) {
      project = projectAgentName.project;
    }

    public ProjectAgentName build() {
      return new ProjectAgentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectAgentName) {
      ProjectAgentName that = (ProjectAgentName) o;
      return (this.project.equals(that.project));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    return h;
  }
}

