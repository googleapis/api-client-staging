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
public class DeidentifyTemplateName extends AnyDeidentifyTemplateName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/deidentifyTemplates/{deidentify_template}");

  private final String organization;
  private final String deidentifyTemplate;

  public String getOrganization() {
    return organization;
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

  private DeidentifyTemplateName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    deidentifyTemplate = Preconditions.checkNotNull(builder.getDeidentifyTemplate());
  }

  public static DeidentifyTemplateName of(String organization, String deidentifyTemplate) {
    return newBuilder()
      .setOrganization(organization)
      .setDeidentifyTemplate(deidentifyTemplate)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static DeidentifyTemplateName create(String organization, String deidentifyTemplate) {
    return of(organization, deidentifyTemplate);
  }

  public static String format(String organization, String deidentifyTemplate) {
    return newBuilder()
      .setOrganization(organization)
      .setDeidentifyTemplate(deidentifyTemplate)
      .build()
      .toString();
  }

  public static DeidentifyTemplateName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DeidentifyTemplateName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"), matchMap.get("deidentify_template"));
  }

  public static List<DeidentifyTemplateName> parseList(List<String> formattedStrings) {
    List<DeidentifyTemplateName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DeidentifyTemplateName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DeidentifyTemplateName value : values) {
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
    return DeidentifyTemplateNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization, "deidentify_template", deidentifyTemplate);
  }

  /** Builder for DeidentifyTemplateName. */
  public static class Builder {

    private String organization;
    private String deidentifyTemplate;

    public String getOrganization() {
      return organization;
    }

    public String getDeidentifyTemplate() {
      return deidentifyTemplate;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setDeidentifyTemplate(String deidentifyTemplate) {
      this.deidentifyTemplate = deidentifyTemplate;
      return this;
    }

    private Builder() {
    }

    private Builder(DeidentifyTemplateName deidentifyTemplateName) {
      organization = deidentifyTemplateName.organization;
      deidentifyTemplate = deidentifyTemplateName.deidentifyTemplate;
    }

    public DeidentifyTemplateName build() {
      return new DeidentifyTemplateName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeidentifyTemplateName) {
      DeidentifyTemplateName that = (DeidentifyTemplateName) o;
      return (this.organization.equals(that.organization))
          && (this.deidentifyTemplate.equals(that.deidentifyTemplate));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    h *= 1000003;
    h ^= deidentifyTemplate.hashCode();
    return h;
  }
}

