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
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class LogName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/logs/{log}");

  private final String project;
  private final String log;

  public String getProject() {
    return project;
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

  private LogName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    log = Preconditions.checkNotNull(builder.getLog());
  }

  public static LogName of(String project, String log) {
    return newBuilder()
      .setProject(project)
      .setLog(log)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static LogName create(String project, String log) {
    return of(project, log);
  }

  public static String format(String project, String log) {
    return newBuilder()
      .setProject(project)
      .setLog(log)
      .build()
      .toString();
  }

  public static LogName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "LogName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("log"));
  }

  public static List<LogName> parseList(List<String> formattedStrings) {
    List<LogName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LogName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (LogName value : values) {
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

  @Override
  public ResourceNameType getType() {
    return LogNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "log", log);
  }

  /** Builder for LogName. */
  public static class Builder {

    private String project;
    private String log;

    public String getProject() {
      return project;
    }

    public String getLog() {
      return log;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLog(String log) {
      this.log = log;
      return this;
    }

    private Builder() {
    }

    private Builder(LogName logName) {
      project = logName.project;
      log = logName.log;
    }

    public LogName build() {
      return new LogName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LogName) {
      LogName that = (LogName) o;
      return (this.project.equals(that.project))
          && (this.log.equals(that.log));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= log.hashCode();
    return h;
  }
}

