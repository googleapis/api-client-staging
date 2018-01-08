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
public class InspectTemplateName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/inspectTemplates/{inspect_template}");

  private final String organization;
  private final String inspectTemplate;

  public String getOrganization() {
    return organization;
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

  private InspectTemplateName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    inspectTemplate = Preconditions.checkNotNull(builder.getInspectTemplate());
  }

  public static InspectTemplateName of(String organization, String inspectTemplate) {
    return newBuilder()
      .setOrganization(organization)
      .setInspectTemplate(inspectTemplate)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static InspectTemplateName create(String organization, String inspectTemplate) {
    return of(organization, inspectTemplate);
  }

  public static InspectTemplateName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "InspectTemplateName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"), matchMap.get("inspect_template"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return InspectTemplateNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization, "inspect_template", inspectTemplate);
  }

  /** Builder for InspectTemplateName. */
  public static class Builder {

    private String organization;
    private String inspectTemplate;

    public String getOrganization() {
      return organization;
    }

    public String getInspectTemplate() {
      return inspectTemplate;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setInspectTemplate(String inspectTemplate) {
      this.inspectTemplate = inspectTemplate;
      return this;
    }

    private Builder() {
    }

    private Builder(InspectTemplateName inspectTemplateName) {
      organization = inspectTemplateName.organization;
      inspectTemplate = inspectTemplateName.inspectTemplate;
    }

    public InspectTemplateName build() {
      return new InspectTemplateName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InspectTemplateName) {
      InspectTemplateName that = (InspectTemplateName) o;
      return (this.organization.equals(that.organization))
          && (this.inspectTemplate.equals(that.inspectTemplate));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    h *= 1000003;
    h ^= inspectTemplate.hashCode();
    return h;
  }
}

