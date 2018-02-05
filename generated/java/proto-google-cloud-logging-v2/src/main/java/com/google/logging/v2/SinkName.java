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

package com.google.logging.v2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SinkName extends AnySinkName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/sinks/{sink}");

  private final String project;
  private final String sink;

  public String getProject() {
    return project;
  }

  public String getSink() {
    return sink;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SinkName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    sink = Preconditions.checkNotNull(builder.getSink());
  }

  public static SinkName of(String project, String sink) {
    return newBuilder()
      .setProject(project)
      .setSink(sink)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static SinkName create(String project, String sink) {
    return of(project, sink);
  }

  public static String format(String project, String sink) {
    return newBuilder()
      .setProject(project)
      .setSink(sink)
      .build()
      .toString();
  }

  public static SinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SinkName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("sink"));
  }

  public static List<SinkName> parseList(List<String> formattedStrings) {
    List<SinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SinkName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SinkName value : values) {
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
    return SinkNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "sink", sink);
  }

  /** Builder for SinkName. */
  public static class Builder {

    private String project;
    private String sink;

    public String getProject() {
      return project;
    }

    public String getSink() {
      return sink;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSink(String sink) {
      this.sink = sink;
      return this;
    }

    private Builder() {
    }

    private Builder(SinkName sinkName) {
      project = sinkName.project;
      sink = sinkName.sink;
    }

    public SinkName build() {
      return new SinkName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SinkName) {
      SinkName that = (SinkName) o;
      return (this.project.equals(that.project))
          && (this.sink.equals(that.sink));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= sink.hashCode();
    return h;
  }
}

