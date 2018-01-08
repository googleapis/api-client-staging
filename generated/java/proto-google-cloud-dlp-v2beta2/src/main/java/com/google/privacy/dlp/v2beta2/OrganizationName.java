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
public class OrganizationName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("organizations/{organization}");

  private final String organization;

  public String getOrganization() {
    return organization;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private OrganizationName(Builder builder) {
    organization = Preconditions.checkNotNull(builder.getOrganization());
  }

  public static OrganizationName of(String organization) {
    return newBuilder()
      .setOrganization(organization)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String)} instead.
   */
  @Deprecated
  public static OrganizationName create(String organization) {
    return of(organization);
  }

  public static OrganizationName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "OrganizationName.parse: formattedString not in valid format");
    return of(matchMap.get("organization"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return OrganizationNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("organization", organization);
  }

  /** Builder for OrganizationName. */
  public static class Builder {

    private String organization;

    public String getOrganization() {
      return organization;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    private Builder() {
    }

    private Builder(OrganizationName organizationName) {
      organization = organizationName.organization;
    }

    public OrganizationName build() {
      return new OrganizationName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OrganizationName) {
      OrganizationName that = (OrganizationName) o;
      return (this.organization.equals(that.organization));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= organization.hashCode();
    return h;
  }
}

