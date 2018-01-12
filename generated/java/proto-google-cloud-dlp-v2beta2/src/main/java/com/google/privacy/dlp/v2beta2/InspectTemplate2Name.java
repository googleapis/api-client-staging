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

package com.google.privacy.dlp.v2beta2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class InspectTemplate2Name implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/inspectTemplates/{inspect_template}");

  private final String project;
  private final String inspectTemplate;

  public String getProject() {
    return project;
  }

  public String getInspectTemplate() {
    return inspectTemplate;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private InspectTemplate2Name(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    inspectTemplate = Preconditions.checkNotNull(builder.getInspectTemplate());
  }

  public static InspectTemplate2Name of(String project, String inspectTemplate) {
    return newBuilder()
      .setProject(project)
      .setInspectTemplate(inspectTemplate)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static InspectTemplate2Name create(String project, String inspectTemplate) {
    return of(project, inspectTemplate);
  }

  public static InspectTemplate2Name parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "InspectTemplate2Name.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("inspect_template"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return InspectTemplate2NameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "inspect_template", inspectTemplate);
  }

  /** Builder for InspectTemplate2Name. */
  public static class Builder {

    private String project;
    private String inspectTemplate;

    public String getProject() {
      return project;
    }

    public String getInspectTemplate() {
      return inspectTemplate;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setInspectTemplate(String inspectTemplate) {
      this.inspectTemplate = inspectTemplate;
      return this;
    }

    private Builder() {
    }

    private Builder(InspectTemplate2Name inspectTemplate2Name) {
      project = inspectTemplate2Name.project;
      inspectTemplate = inspectTemplate2Name.inspectTemplate;
    }

    public InspectTemplate2Name build() {
      return new InspectTemplate2Name(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InspectTemplate2Name) {
      InspectTemplate2Name that = (InspectTemplate2Name) o;
      return (this.project.equals(that.project))
          && (this.inspectTemplate.equals(that.inspectTemplate));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= inspectTemplate.hashCode();
    return h;
  }
}

