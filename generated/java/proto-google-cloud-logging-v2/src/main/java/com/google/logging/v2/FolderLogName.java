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

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class FolderLogName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("folders/{folder}/logs/{log}");

  private final String folder;
  private final String log;

  public String getFolder() {
    return folder;
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

  private FolderLogName(Builder builder) {
    folder = Preconditions.checkNotNull(builder.getFolder());
    log = Preconditions.checkNotNull(builder.getLog());
  }

  public static FolderLogName of(String folder, String log) {
    return newBuilder()
      .setFolder(folder)
      .setLog(log)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static FolderLogName create(String folder, String log) {
    return of(folder, log);
  }

  public static FolderLogName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "FolderLogName.parse: formattedString not in valid format");
    return of(matchMap.get("folder"), matchMap.get("log"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return FolderLogNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("folder", folder, "log", log);
  }

  /** Builder for FolderLogName. */
  public static class Builder {

    private String folder;
    private String log;

    public String getFolder() {
      return folder;
    }

    public String getLog() {
      return log;
    }

    public Builder setFolder(String folder) {
      this.folder = folder;
      return this;
    }

    public Builder setLog(String log) {
      this.log = log;
      return this;
    }

    private Builder() {
    }

    private Builder(FolderLogName folderLogName) {
      folder = folderLogName.folder;
      log = folderLogName.log;
    }

    public FolderLogName build() {
      return new FolderLogName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FolderLogName) {
      FolderLogName that = (FolderLogName) o;
      return (this.folder.equals(that.folder))
          && (this.log.equals(that.log));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= folder.hashCode();
    h *= 1000003;
    h ^= log.hashCode();
    return h;
  }
}

