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
public class RunName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/transferConfigs/{transfer_config}/runs/{run}");

  private final String project;
  private final String transferConfig;
  private final String run;

  public String getProject() {
    return project;
  }

  public String getTransferConfig() {
    return transferConfig;
  }

  public String getRun() {
    return run;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RunName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    transferConfig = Preconditions.checkNotNull(builder.getTransferConfig());
    run = Preconditions.checkNotNull(builder.getRun());
  }

  public static RunName of(String project, String transferConfig, String run) {
    return newBuilder()
      .setProject(project)
      .setTransferConfig(transferConfig)
      .setRun(run)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String, String)} instead.
   */
  @Deprecated
  public static RunName create(String project, String transferConfig, String run) {
    return of(project, transferConfig, run);
  }

  public static RunName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RunName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("transfer_config"), matchMap.get("run"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return RunNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "transfer_config", transferConfig, "run", run);
  }

  /** Builder for RunName. */
  public static class Builder {

    private String project;
    private String transferConfig;
    private String run;

    public String getProject() {
      return project;
    }

    public String getTransferConfig() {
      return transferConfig;
    }

    public String getRun() {
      return run;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setTransferConfig(String transferConfig) {
      this.transferConfig = transferConfig;
      return this;
    }

    public Builder setRun(String run) {
      this.run = run;
      return this;
    }

    private Builder() {
    }

    private Builder(RunName runName) {
      project = runName.project;
      transferConfig = runName.transferConfig;
      run = runName.run;
    }

    public RunName build() {
      return new RunName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RunName) {
      RunName that = (RunName) o;
      return (this.project.equals(that.project))
          && (this.transferConfig.equals(that.transferConfig))
          && (this.run.equals(that.run));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= transferConfig.hashCode();
    h *= 1000003;
    h ^= run.hashCode();
    return h;
  }
}

