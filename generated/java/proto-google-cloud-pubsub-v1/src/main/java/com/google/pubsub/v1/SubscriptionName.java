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

package com.google.pubsub.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SubscriptionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/subscriptions/{subscription}");

  private final String project;
  private final String subscription;

  public String getProject() {
    return project;
  }

  public String getSubscription() {
    return subscription;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SubscriptionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    subscription = Preconditions.checkNotNull(builder.getSubscription());
  }

  public static SubscriptionName create(String project, String subscription) {
    return newBuilder()
      .setProject(project)
      .setSubscription(subscription)
      .build();
  }

  public static SubscriptionName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SubscriptionName.parse: formattedString not in valid format");
    return create(matchMap.get("project"), matchMap.get("subscription"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SubscriptionNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "subscription", subscription);
  }

  /** Builder for SubscriptionName. */
  public static class Builder {

    private String project;
    private String subscription;

    public String getProject() {
      return project;
    }

    public String getSubscription() {
      return subscription;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    private Builder() {
    }

    private Builder(SubscriptionName subscriptionName) {
      project = subscriptionName.project;
      subscription = subscriptionName.subscription;
    }

    public SubscriptionName build() {
      return new SubscriptionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SubscriptionName) {
      SubscriptionName that = (SubscriptionName) o;
      return (this.project.equals(that.project))
          && (this.subscription.equals(that.subscription));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= subscription.hashCode();
    return h;
  }
}

