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
public class OrganizationExclusionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}/exclusions/{exclusion}");

  private final String organization;
  private final String exclusion;

  public String getOrganization() {
    return organization;
  }

  public String getExclusion() {
    return exclusion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private OrganizationExclusionName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
    exclusion = Preconditions.checkNotNull(builder.getExclusion());
  }

  public static OrganizationExclusionName of(String organization, String exclusion) {
    return newBuilder()
      .setOrganization(organization)
      .setExclusion(exclusion)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static OrganizationExclusionName create(String organization, String exclusion) {
    return of(organization, exclusion);
  }

  public static OrganizationExclusionName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "OrganizationExclusionName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"), matchMap.get("exclusion"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return OrganizationExclusionNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization, "exclusion", exclusion);
  }

  /** Builder for OrganizationExclusionName. */
  public static class Builder {

    private String organization;
    private String exclusion;

    public String getOrganization() {
      return organization;
    }

    public String getExclusion() {
      return exclusion;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setExclusion(String exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    private Builder() {
    }

    private Builder(OrganizationExclusionName organizationExclusionName) {
      organization = organizationExclusionName.organization;
      exclusion = organizationExclusionName.exclusion;
    }

    public OrganizationExclusionName build() {
      return new OrganizationExclusionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OrganizationExclusionName) {
      OrganizationExclusionName that = (OrganizationExclusionName) o;
      return (this.organization.equals(that.organization))
          && (this.exclusion.equals(that.exclusion));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    h *= 1000003;
    h ^= exclusion.hashCode();
    return h;
  }
}

