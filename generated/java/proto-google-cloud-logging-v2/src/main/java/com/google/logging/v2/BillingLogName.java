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
public class BillingLogName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("billingAccounts/{billing_account}/logs/{log}");

  private final String billingAccount;
  private final String log;

  public String getBillingAccount() {
    return billingAccount;
  }

  public String getLog() {
    return log;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private BillingLogName(Builder builder) {
    billingAccount = Preconditions.checkNotNull(builder.getBillingAccount());
    log = Preconditions.checkNotNull(builder.getLog());
  }

  public static BillingLogName create(String billingAccount, String log) {
    return newBuilder()
      .setBillingAccount(billingAccount)
      .setLog(log)
      .build();
  }

  public static BillingLogName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BillingLogName.parse: formattedString not in valid format");
    return create(matchMap.get("billing_account"), matchMap.get("log"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return BillingLogNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("billing_account", billingAccount, "log", log);
  }

  /** Builder for BillingLogName. */
  public static class Builder {

    private String billingAccount;
    private String log;

    public String getBillingAccount() {
      return billingAccount;
    }

    public String getLog() {
      return log;
    }

    public Builder setBillingAccount(String billingAccount) {
      this.billingAccount = billingAccount;
      return this;
    }

    public Builder setLog(String log) {
      this.log = log;
      return this;
    }

    private Builder() {
    }

    private Builder(BillingLogName billingLogName) {
      billingAccount = billingLogName.billingAccount;
      log = billingLogName.log;
    }

    public BillingLogName build() {
      return new BillingLogName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BillingLogName) {
      BillingLogName that = (BillingLogName) o;
      return (this.billingAccount.equals(that.billingAccount))
          && (this.log.equals(that.log));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= billingAccount.hashCode();
    h *= 1000003;
    h ^= log.hashCode();
    return h;
  }
}

