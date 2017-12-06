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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DataSourceName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/dataSources/{data_source}");

  private final String project;
  private final String dataSource;

  public String getProject() {
    return project;
  }

  public String getDataSource() {
    return dataSource;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DataSourceName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    dataSource = Preconditions.checkNotNull(builder.getDataSource());
  }

  public static DataSourceName of(String project, String dataSource) {
    return newBuilder()
      .setProject(project)
      .setDataSource(dataSource)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static DataSourceName create(String project, String dataSource) {
    return of(project, dataSource);
  }

  public static DataSourceName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DataSourceName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("data_source"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return DataSourceNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "data_source", dataSource);
  }

  /** Builder for DataSourceName. */
  public static class Builder {

    private String project;
    private String dataSource;

    public String getProject() {
      return project;
    }

    public String getDataSource() {
      return dataSource;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    private Builder() {
    }

    private Builder(DataSourceName dataSourceName) {
      project = dataSourceName.project;
      dataSource = dataSourceName.dataSource;
    }

    public DataSourceName build() {
      return new DataSourceName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DataSourceName) {
      DataSourceName that = (DataSourceName) o;
      return (this.project.equals(that.project))
          && (this.dataSource.equals(that.dataSource));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= dataSource.hashCode();
    return h;
  }
}

