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

package com.google.bigtable.admin.v2;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SnapshotName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}");

  private final String project;
  private final String instance;
  private final String cluster;
  private final String snapshot;

  public String getProject() {
    return project;
  }

  public String getInstance() {
    return instance;
  }

  public String getCluster() {
    return cluster;
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
    instance = Preconditions.checkNotNull(builder.getInstance());
    cluster = Preconditions.checkNotNull(builder.getCluster());
    snapshot = Preconditions.checkNotNull(builder.getSnapshot());
  }

  public static SnapshotName of(String project, String instance, String cluster, String snapshot) {
    return newBuilder()
      .setProject(project)
      .setInstance(instance)
      .setCluster(cluster)
      .setSnapshot(snapshot)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String, String, String)} instead.
   */
  @Deprecated
  public static SnapshotName create(String project, String instance, String cluster, String snapshot) {
    return of(project, instance, cluster, snapshot);
  }

  public static SnapshotName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SnapshotName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("instance"), matchMap.get("cluster"), matchMap.get("snapshot"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SnapshotNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "instance", instance, "cluster", cluster, "snapshot", snapshot);
  }

  /** Builder for SnapshotName. */
  public static class Builder {

    private String project;
    private String instance;
    private String cluster;
    private String snapshot;

    public String getProject() {
      return project;
    }

    public String getInstance() {
      return instance;
    }

    public String getCluster() {
      return cluster;
    }

    public String getSnapshot() {
      return snapshot;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public Builder setCluster(String cluster) {
      this.cluster = cluster;
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
      instance = snapshotName.instance;
      cluster = snapshotName.cluster;
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
          && (this.instance.equals(that.instance))
          && (this.cluster.equals(that.cluster))
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
    h ^= instance.hashCode();
    h *= 1000003;
    h ^= cluster.hashCode();
    h *= 1000003;
    h ^= snapshot.hashCode();
    return h;
  }
}

