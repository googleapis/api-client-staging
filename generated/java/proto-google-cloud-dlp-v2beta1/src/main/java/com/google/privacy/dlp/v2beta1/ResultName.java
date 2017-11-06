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

package com.google.privacy.dlp.v2beta1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ResultName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("inspect/results/{result}");

  private final String result;

  public String getResult() {
    return result;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ResultName(Builder builder) {
    result = Preconditions.checkNotNull(builder.getResult());
  }

  public static ResultName of(String result) {
    return newBuilder()
      .setResult(result)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String)} instead.
   */
  @Deprecated
  public static ResultName create(String result) {
    return of(result);
  }

  public static ResultName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "ResultName.parse: formattedString not in valid format");
    return of(matchMap.get("result"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return ResultNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("result", result);
  }

  /** Builder for ResultName. */
  public static class Builder {

    private String result;

    public String getResult() {
      return result;
    }

    public Builder setResult(String result) {
      this.result = result;
      return this;
    }

    private Builder() {
    }

    private Builder(ResultName resultName) {
      result = resultName.result;
    }

    public ResultName build() {
      return new ResultName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResultName) {
      ResultName that = (ResultName) o;
      return (this.result.equals(that.result));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= result.hashCode();
    return h;
  }
}

