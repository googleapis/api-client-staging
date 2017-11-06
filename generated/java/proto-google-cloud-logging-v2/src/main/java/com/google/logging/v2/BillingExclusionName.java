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
public class BillingExclusionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("billingAccounts/{billing_account}/exclusions/{exclusion}");

  private final String billingAccount;
  private final String exclusion;

  public String getBillingAccount() {
    return billingAccount;
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

  private BillingExclusionName(Builder builder) {
    billingAccount = Preconditions.checkNotNull(builder.getBillingAccount());
    exclusion = Preconditions.checkNotNull(builder.getExclusion());
  }

  public static BillingExclusionName of(String billingAccount, String exclusion) {
    return newBuilder()
      .setBillingAccount(billingAccount)
      .setExclusion(exclusion)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static BillingExclusionName create(String billingAccount, String exclusion) {
    return of(billingAccount, exclusion);
  }

  public static BillingExclusionName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BillingExclusionName.parse: formattedString not in valid format");
    return of(matchMap.get("billing_account"), matchMap.get("exclusion"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return BillingExclusionNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("billing_account", billingAccount, "exclusion", exclusion);
  }

  /** Builder for BillingExclusionName. */
  public static class Builder {

    private String billingAccount;
    private String exclusion;

    public String getBillingAccount() {
      return billingAccount;
    }

    public String getExclusion() {
      return exclusion;
    }

    public Builder setBillingAccount(String billingAccount) {
      this.billingAccount = billingAccount;
      return this;
    }

    public Builder setExclusion(String exclusion) {
      this.exclusion = exclusion;
      return this;
    }

    private Builder() {
    }

    private Builder(BillingExclusionName billingExclusionName) {
      billingAccount = billingExclusionName.billingAccount;
      exclusion = billingExclusionName.exclusion;
    }

    public BillingExclusionName build() {
      return new BillingExclusionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BillingExclusionName) {
      BillingExclusionName that = (BillingExclusionName) o;
      return (this.billingAccount.equals(that.billingAccount))
          && (this.exclusion.equals(that.exclusion));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= billingAccount.hashCode();
    h *= 1000003;
    h ^= exclusion.hashCode();
    return h;
  }
}

