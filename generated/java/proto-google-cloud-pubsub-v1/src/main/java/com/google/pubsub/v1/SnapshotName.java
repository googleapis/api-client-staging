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

package com.google.pubsub.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SnapshotName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/snapshots/{snapshot}");

  private final String project;
  private final String snapshot;

  public String getProject() {
    return project;
  }

  public String getSnapshot() {
    return snapshot;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SnapshotName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    snapshot = Preconditions.checkNotNull(builder.getSnapshot());
  }

  public static SnapshotName of(String project, String snapshot) {
    return newBuilder()
      .setProject(project)
      .setSnapshot(snapshot)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static SnapshotName create(String project, String snapshot) {
    return of(project, snapshot);
  }

  public static String format(String project, String snapshot) {
    return newBuilder()
      .setProject(project)
      .setSnapshot(snapshot)
      .build()
      .toString();
  }

  public static SnapshotName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SnapshotName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("snapshot"));
  }

  public static List<SnapshotName> parseList(List<String> formattedStrings) {
    List<SnapshotName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SnapshotName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SnapshotName value : values) {
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
    return SnapshotNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "snapshot", snapshot);
  }

  /** Builder for SnapshotName. */
  public static class Builder {

    private String project;
    private String snapshot;

    public String getProject() {
      return project;
    }

    public String getSnapshot() {
      return snapshot;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSnapshot(String snapshot) {
      this.snapshot = snapshot;
      return this;
    }

    private Builder() {
    }

    private Builder(SnapshotName snapshotName) {
      project = snapshotName.project;
      snapshot = snapshotName.snapshot;
    }

    public SnapshotName build() {
      return new SnapshotName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SnapshotName) {
      SnapshotName that = (SnapshotName) o;
      return (this.project.equals(that.project))
          && (this.snapshot.equals(that.snapshot));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= snapshot.hashCode();
    return h;
  }
}

