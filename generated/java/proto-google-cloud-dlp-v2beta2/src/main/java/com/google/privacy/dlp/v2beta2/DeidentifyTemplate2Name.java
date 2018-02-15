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

package com.google.privacy.dlp.v2beta2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DeidentifyTemplate2Name extends AnyDeidentifyTemplateName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/deidentifyTemplates/{deidentify_template}");

  private final String project;
  private final String deidentifyTemplate;

  public String getProject() {
    return project;
  }

  public String getDeidentifyTemplate() {
    return deidentifyTemplate;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DeidentifyTemplate2Name(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    deidentifyTemplate = Preconditions.checkNotNull(builder.getDeidentifyTemplate());
  }

  public static DeidentifyTemplate2Name of(String project, String deidentifyTemplate) {
    return newBuilder()
      .setProject(project)
      .setDeidentifyTemplate(deidentifyTemplate)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static DeidentifyTemplate2Name create(String project, String deidentifyTemplate) {
    return of(project, deidentifyTemplate);
  }

  public static String format(String project, String deidentifyTemplate) {
    return newBuilder()
      .setProject(project)
      .setDeidentifyTemplate(deidentifyTemplate)
      .build()
      .toString();
  }

  public static DeidentifyTemplate2Name parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DeidentifyTemplate2Name.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("deidentify_template"));
  }

  public static List<DeidentifyTemplate2Name> parseList(List<String> formattedStrings) {
    List<DeidentifyTemplate2Name> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DeidentifyTemplate2Name> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DeidentifyTemplate2Name value : values) {
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
    return DeidentifyTemplate2NameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "deidentify_template", deidentifyTemplate);
  }

  /** Builder for DeidentifyTemplate2Name. */
  public static class Builder {

    private String project;
    private String deidentifyTemplate;

    public String getProject() {
      return project;
    }

    public String getDeidentifyTemplate() {
      return deidentifyTemplate;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDeidentifyTemplate(String deidentifyTemplate) {
      this.deidentifyTemplate = deidentifyTemplate;
      return this;
    }

    private Builder() {
    }

    private Builder(DeidentifyTemplate2Name deidentifyTemplate2Name) {
      project = deidentifyTemplate2Name.project;
      deidentifyTemplate = deidentifyTemplate2Name.deidentifyTemplate;
    }

    public DeidentifyTemplate2Name build() {
      return new DeidentifyTemplate2Name(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeidentifyTemplate2Name) {
      DeidentifyTemplate2Name that = (DeidentifyTemplate2Name) o;
      return (this.project.equals(that.project))
          && (this.deidentifyTemplate.equals(that.deidentifyTemplate));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= deidentifyTemplate.hashCode();
    return h;
  }
}

