# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from google.api import label_pb2


class MonitoredResourceDescriptor(object):
    """
    An object that describes the schema of a ``MonitoredResource`` object using a
    type name and a set of labels.  For example, the monitored resource
    descriptor for Google Compute Engine VM instances has a type of
    ``\"gce_instance\"`` and specifies the use of the labels ``\"instance_id\"`` and
    ``\"zone\"`` to identify particular VM instances.

    Different APIs can support different monitored resource types. APIs generally
    provide a ``list`` method that returns the monitored resource descriptors used
    by the API.

    Attributes:
      name (string): Optional. The resource name of the monitored resource descriptor:
        ``\"projects/{project_id}/monitoredResourceDescriptors/{type}\"`` where
        {type} is the value of the ``type`` field in this object and
        {project_id} is a project ID that provides API-specific context for
        accessing the type.  APIs that do not use project information can use the
        resource name format ``\"monitoredResourceDescriptors/{type}\"``.
      type (string): Required. The monitored resource type. For example, the type
        ``\"cloudsql_database\"`` represents databases in Google Cloud SQL.
        The maximum length of this value is 256 characters.
      display_name (string): Optional. A concise name for the monitored resource type that might be
        displayed in user interfaces. It should be a Title Cased Noun Phrase,
        without any article or other determiners. For example,
        ``\"Google Cloud SQL Database\"``.
      description (string): Optional. A detailed description of the monitored resource type that might
        be used in documentation.
      labels (list[:class:`google.api.label_pb2.LabelDescriptor`]): Required. A set of labels used to describe instances of this monitored
        resource type. For example, an individual Google Cloud SQL database is
        identified by values for the labels ``\"database_id\"`` and ``\"zone\"``.

    """
    pass


class MonitoredResource(object):
    """
    An object representing a resource that can be used for monitoring, logging,
    billing, or other purposes. Examples include virtual machine instances,
    databases, and storage devices such as disks. The ``type`` field identifies a
    ``MonitoredResourceDescriptor`` object that describes the resource's
    schema. Information in the ``labels`` field identifies the actual resource and
    its attributes according to the schema. For example, a particular Compute
    Engine VM instance could be represented by the following object, because the
    ``MonitoredResourceDescriptor`` for ``\"gce_instance\"`` has labels
    ``\"instance_id\"`` and ``\"zone\"``:

    ::

        { \"type\": \"gce_instance\",
          \"labels\": { \"instance_id\": \"12345678901234\",
                      \"zone\": \"us-central1-a\" }}

    Attributes:
      type (string): Required. The monitored resource type. This field must match
        the ``type`` field of a ``MonitoredResourceDescriptor`` object. For
        example, the type of a Cloud SQL database is ``\"cloudsql_database\"``.
      labels (dict[string -> :class:`google.api.monitored_resource_pb2.MonitoredResource.LabelsEntry`]): Required. Values for all of the labels listed in the associated monitored
        resource descriptor. For example, Cloud SQL databases use the labels
        ``\"database_id\"`` and ``\"zone\"``.

    """
    pass
