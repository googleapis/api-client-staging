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

package com.google.cloud.dialogflow.v2beta1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class EntityTypeName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/agent/entityTypes/{entity_type}");

  private final String project;
  private final String entityType;

  public String getProject() {
    return project;
  }

  public String getEntityType() {
    return entityType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private EntityTypeName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    entityType = Preconditions.checkNotNull(builder.getEntityType());
  }

  public static EntityTypeName of(String project, String entityType) {
    return newBuilder()
      .setProject(project)
      .setEntityType(entityType)
      .build();
  }

  /**
   * @deprecated Use {@link #of(String, String)} instead.
   */
  @Deprecated
  public static EntityTypeName create(String project, String entityType) {
    return of(project, entityType);
  }

  public static EntityTypeName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "EntityTypeName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("entity_type"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return EntityTypeNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "entity_type", entityType);
  }

  /** Builder for EntityTypeName. */
  public static class Builder {

    private String project;
    private String entityType;

    public String getProject() {
      return project;
    }

    public String getEntityType() {
      return entityType;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setEntityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    private Builder() {
    }

    private Builder(EntityTypeName entityTypeName) {
      project = entityTypeName.project;
      entityType = entityTypeName.entityType;
    }

    public EntityTypeName build() {
      return new EntityTypeName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EntityTypeName) {
      EntityTypeName that = (EntityTypeName) o;
      return (this.project.equals(that.project))
          && (this.entityType.equals(that.entityType));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= entityType.hashCode();
    return h;
  }
}

