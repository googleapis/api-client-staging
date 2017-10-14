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

package com.google.firestore.v1beta1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class IndexName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/databases/{database}/indexes/{index}");

  private final String project;
  private final String database;
  private final String index;

  public String getProject() {
    return project;
  }

  public String getDatabase() {
    return database;
  }

  public String getIndex() {
    return index;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private IndexName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    database = Preconditions.checkNotNull(builder.getDatabase());
    index = Preconditions.checkNotNull(builder.getIndex());
  }

  public static IndexName create(String project, String database, String index) {
    return newBuilder()
      .setProject(project)
      .setDatabase(database)
      .setIndex(index)
      .build();
  }

  public static IndexName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "IndexName.parse: formattedString not in valid format");
    return create(matchMap.get("project"), matchMap.get("database"), matchMap.get("index"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return IndexNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "database", database, "index", index);
  }

  /** Builder for IndexName. */
  public static class Builder {

    private String project;
    private String database;
    private String index;

    public String getProject() {
      return project;
    }

    public String getDatabase() {
      return database;
    }

    public String getIndex() {
      return index;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDatabase(String database) {
      this.database = database;
      return this;
    }

    public Builder setIndex(String index) {
      this.index = index;
      return this;
    }

    private Builder() {
    }

    private Builder(IndexName indexName) {
      project = indexName.project;
      database = indexName.database;
      index = indexName.index;
    }

    public IndexName build() {
      return new IndexName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexName) {
      IndexName that = (IndexName) o;
      return (this.project.equals(that.project))
          && (this.database.equals(that.database))
          && (this.index.equals(that.index));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= database.hashCode();
    h *= 1000003;
    h ^= index.hashCode();
    return h;
  }
}

