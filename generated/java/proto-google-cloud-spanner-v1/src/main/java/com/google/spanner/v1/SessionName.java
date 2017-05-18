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

package com.google.spanner.v1;

import com.google.common.base.Preconditions;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.io.IOException;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SessionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/instances/{instance}/databases/{database}/sessions/{session}");

  private final String project;
  private final String instance;
  private final String database;
  private final String session;

  public String getProject() {
    return project;
  }

  public String getInstance() {
    return instance;
  }

  public String getDatabase() {
    return database;
  }

  public String getSession() {
    return session;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SessionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    instance = Preconditions.checkNotNull(builder.getInstance());
    database = Preconditions.checkNotNull(builder.getDatabase());
    session = Preconditions.checkNotNull(builder.getSession());
  }

  public static SessionName create(String project, String instance, String database, String session) {
    return newBuilder()
      .setProject(project)
      .setInstance(instance)
      .setDatabase(database)
      .setSession(session)
      .build();
  }

  public static SessionName parse(String formattedString) {
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SessionName.parse: formattedString not in valid format");
    return create(matchMap.get("project"), matchMap.get("instance"), matchMap.get("database"), matchMap.get("session"));
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public ResourceNameType getType() {
    return SessionNameType.instance();
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "instance", instance, "database", database, "session", session);
  }

  /** Builder for SessionName. */
  public static class Builder {

    private String project;
    private String instance;
    private String database;
    private String session;

    public String getProject() {
      return project;
    }

    public String getInstance() {
      return instance;
    }

    public String getDatabase() {
      return database;
    }

    public String getSession() {
      return session;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public Builder setDatabase(String database) {
      this.database = database;
      return this;
    }

    public Builder setSession(String session) {
      this.session = session;
      return this;
    }

    private Builder() {
    }

    private Builder(SessionName sessionName) {
      project = sessionName.project;
      instance = sessionName.instance;
      database = sessionName.database;
      session = sessionName.session;
    }

    public SessionName build() {
      return new SessionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionName) {
      SessionName that = (SessionName) o;
      return (this.project.equals(that.project))
          && (this.instance.equals(that.instance))
          && (this.database.equals(that.database))
          && (this.session.equals(that.session));
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
    h ^= database.hashCode();
    h *= 1000003;
    h ^= session.hashCode();
    return h;
  }
}

