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

package com.google.pubsub.v1;

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import com.google.pubsub.v1.TopicName;
import com.google.pubsub.v1.DeletedTopic;
import com.google.api.resourcenames.UntypedResourceName;
import java.io.IOException;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class TopicNameOneof {

  private final ResourceName resourceName;

  public TopicName getTopicName() {
    if (resourceName instanceof TopicName) {
      return (TopicName) resourceName;
    } else {
      return null;
    }
  }
  public DeletedTopic getDeletedTopic() {
    if (resourceName instanceof DeletedTopic) {
      return (DeletedTopic) resourceName;
    } else {
      return null;
    }
  }

  public UntypedResourceName getUntypedResourceName() {
    if (resourceName instanceof UntypedResourceName) {
      return (UntypedResourceName) resourceName;
    } else {
      return null;
    }
  }

  public ResourceName getResourceName() {
    return resourceName;
  }

  public ResourceNameType getType() {
    return getResourceName().getType();
  }

  private TopicNameOneof(ResourceName resourceName) {
    this.resourceName = Preconditions.checkNotNull(resourceName);
  }

  public static TopicNameOneof parse(String resourceNameString) {
    if (TopicName.isParsableFrom(resourceNameString)) {
      return new TopicNameOneof(TopicName.parse(resourceNameString));
    }
    if (DeletedTopic.matches(resourceNameString)) {
      return new TopicNameOneof(DeletedTopic.instance());
    }
    return new TopicNameOneof(UntypedResourceName.parse(resourceNameString));
  }

  public static TopicNameOneof from(TopicName topicName) {
    return new TopicNameOneof(topicName);
  }
  public static TopicNameOneof from(DeletedTopic deletedTopic) {
    return new TopicNameOneof(deletedTopic);
  }

  public static TopicNameOneof fromUntyped(UntypedResourceName untypedResourceName) {
    return new TopicNameOneof(untypedResourceName);
  }

  @Override
  public String toString() {
    return getResourceName().toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TopicNameOneof) {
      TopicNameOneof that = (TopicNameOneof) o;
      return resourceName.equals(that.resourceName);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return resourceName.hashCode();
  }
}

