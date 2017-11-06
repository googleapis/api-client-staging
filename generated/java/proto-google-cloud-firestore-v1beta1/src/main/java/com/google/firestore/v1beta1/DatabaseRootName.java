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
public class DatabaseRootName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/databases/{database}");

  private final String project;
  private final String database;

  public String getProject() {
    return project;
  }

  public String getDatabase() {
    return database;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DatabaseRootName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    database = Preconditions.checkNotNull(builder.getDatabase());
  }

  public static DatabaseRootName of(String project, String database) {
    return newBuilder()
      .setProject(project)
      .setDatabase(database)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static DatabaseRootName create(String project, String database) {
    return of(project, database);
  }

  public static DatabaseRootName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DatabaseRootName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("database"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return DatabaseRootNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "database", database);
  }

  /** Builder for DatabaseRootName. */
  public static class Builder {

    private String project;
    private String database;

    public String getProject() {
      return project;
    }

    public String getDatabase() {
      return database;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDatabase(String database) {
      this.database = database;
      return this;
    }

    private Builder() {
    }

    private Builder(DatabaseRootName databaseRootName) {
      project = databaseRootName.project;
      database = databaseRootName.database;
    }

    public DatabaseRootName build() {
      return new DatabaseRootName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatabaseRootName) {
      DatabaseRootName that = (DatabaseRootName) o;
      return (this.project.equals(that.project))
          && (this.database.equals(that.database));
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
    return h;
  }
}

