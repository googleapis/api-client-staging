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
public class FolderName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("folders/{folder}");

  private final String folder;

  public String getFolder() {
    return folder;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private FolderName(Builder builder) {
    folder = Preconditions.checkNotNull(builder.getFolder());
  }

  public static FolderName of(String folder) {
    return newBuilder()
      .setFolder(folder)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String)} instead.
   */
  @Deprecated
  public static FolderName create(String folder) {
    return of(folder);
  }

  public static FolderName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "FolderName.parse: formattedString not in valid format");
    return of(matchMap.get("folder"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return FolderNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("folder", folder);
  }

  /** Builder for FolderName. */
  public static class Builder {

    private String folder;

    public String getFolder() {
      return folder;
    }

    public Builder setFolder(String folder) {
      this.folder = folder;
      return this;
    }

    private Builder() {
    }

    private Builder(FolderName folderName) {
      folder = folderName.folder;
    }

    public FolderName build() {
      return new FolderName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FolderName) {
      FolderName that = (FolderName) o;
      return (this.folder.equals(that.folder));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= folder.hashCode();
    return h;
  }
}

