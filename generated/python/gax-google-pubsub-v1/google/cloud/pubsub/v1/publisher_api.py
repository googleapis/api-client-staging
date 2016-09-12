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
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/pubsub/v1/pubsub.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.pubsub.v1 Publisher API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.pubsub.v1 import pubsub_pb2

_BundleDesc = google.gax.BundleDescriptor

_PageDesc = google.gax.PageDescriptor


class PublisherApi(object):
    """
    The service that an application uses to manipulate topics, and to send
    messages to a topic.
    """

    SERVICE_ADDRESS = 'pubsub.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_topics': _PageDesc('page_token', 'next_page_token', 'topics'),
        'list_topic_subscriptions': _PageDesc('page_token', 'next_page_token',
                                              'subscriptions')
    }

    _BUNDLE_DESCRIPTORS = {
        'publish': _BundleDesc(
            'messages',
            [
                'topic'
            ],
            subresponse_field='message_ids', )
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
                   'https://www.googleapis.com/auth/pubsub', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _TOPIC_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/topics/{topic}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def topic_path(cls, project, topic):
        """Returns a fully-qualified topic resource name string."""
        return cls._TOPIC_PATH_TEMPLATE.render({
            'project': project,
            'topic': topic,
        })

    @classmethod
    def match_project_from_project_name(cls, project_name):
        """Parses the project from a project resource.

        Args:
          project_name (string): A fully-qualified path representing a project
            resource.

        Returns:
          A string representing the project.
        """
        return cls._PROJECT_PATH_TEMPLATE.match(project_name).get('project')

    @classmethod
    def match_project_from_topic_name(cls, topic_name):
        """Parses the project from a topic resource.

        Args:
          topic_name (string): A fully-qualified path representing a topic
            resource.

        Returns:
          A string representing the project.
        """
        return cls._TOPIC_PATH_TEMPLATE.match(topic_name).get('project')

    @classmethod
    def match_topic_from_topic_name(cls, topic_name):
        """Parses the topic from a topic resource.

        Args:
          topic_name (string): A fully-qualified path representing a topic
            resource.

        Returns:
          A string representing the topic.
        """
        return cls._TOPIC_PATH_TEMPLATE.match(topic_name).get('topic')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 metadata_transformer=None,
                 ssl_creds=None,
                 scopes=None,
                 client_config=None,
                 app_name='gax',
                 app_version=_GAX_VERSION):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.beta.implementations.Channel`): A ``Channel``
            object through which to make calls.
          ssl_creds (:class:`grpc.beta.implementations.ClientCredentials`):
            A `ClientCredentials` for use with an SSL-enabled channel.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          metadata_transformer (Callable[[], list]): A function that creates
             the metadata for requests.
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A PublisherApi object.
        """
        if scopes is None:
            scopes = self._ALL_SCOPES
        if client_config is None:
            client_config = {}
        goog_api_client = '{}/{} {} gax/{} python/{}'.format(
            app_name, app_version, self._CODE_GEN_NAME_VERSION,
            self._GAX_VERSION, platform.python_version())
        metadata = [('x-goog-api-client', goog_api_client)]
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'publisher_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.pubsub.v1.Publisher',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            bundle_descriptors=self._BUNDLE_DESCRIPTORS,
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.stub = config.create_stub(
            pubsub_pb2.beta_create_Publisher_stub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)
        self._create_topic = api_callable.create_api_call(
            self.stub.CreateTopic, settings=defaults['create_topic'])
        self._publish = api_callable.create_api_call(
            self.stub.Publish, settings=defaults['publish'])
        self._get_topic = api_callable.create_api_call(
            self.stub.GetTopic, settings=defaults['get_topic'])
        self._list_topics = api_callable.create_api_call(
            self.stub.ListTopics, settings=defaults['list_topics'])
        self._list_topic_subscriptions = api_callable.create_api_call(
            self.stub.ListTopicSubscriptions,
            settings=defaults['list_topic_subscriptions'])
        self._delete_topic = api_callable.create_api_call(
            self.stub.DeleteTopic, settings=defaults['delete_topic'])

    # Service calls
    def create_topic(self, name, options=None):
        """
        Creates the given topic with the given name.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> api = PublisherApi()
          >>> name = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> response = api.create_topic(name)

        Args:
          name (string): The name of the topic. It must have the format
            ``"projects/{project}/topics/{topic}"``. ``{topic}`` must start with a letter,
            and contain only letters (``[A-Za-z]``), numbers (``[0-9]``), dashes (``-``),
            underscores (``_``), periods (``.``), tildes (``~``), plus (``+``) or percent
            signs (``%``). It must be between 3 and 255 characters in length, and it
            must not start with ``"goog"``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.Topic` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.Topic(name=name)
        return self._create_topic(request, options)

    def publish(self, topic, messages, options=None):
        """
        Adds one or more messages to the topic. Returns ``NOT_FOUND`` if the topic
        does not exist. The message payload must not be empty; it must contain
        either a non-empty data field, or at least one attribute.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> from google.pubsub.v1 import pubsub_pb2
          >>> api = PublisherApi()
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> data = ''
          >>> messages_element = pubsub_pb2.PubsubMessage(data)
          >>> messages = [messages_element]
          >>> response = api.publish(topic, messages)

        Args:
          topic (string): The messages in the request will be published on this topic.
          messages (list[:class:`google.pubsub.v1.pubsub_pb2.PubsubMessage`]): The messages to publish.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.PublishResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.PublishRequest(topic=topic, messages=messages)
        return self._publish(request, options)

    def get_topic(self, topic, options=None):
        """
        Gets the configuration of a topic.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> api = PublisherApi()
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> response = api.get_topic(topic)

        Args:
          topic (string): The name of the topic to get.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.Topic` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.GetTopicRequest(topic=topic)
        return self._get_topic(request, options)

    def list_topics(self, project, page_size=0, options=None):
        """
        Lists matching topics.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = PublisherApi()
          >>> project = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_topics(project):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_topics(project, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project (string): The name of the cloud project that topics belong to.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.pubsub.v1.pubsub_pb2.Topic` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.ListTopicsRequest(
            project=project, page_size=page_size)
        return self._list_topics(request, options)

    def list_topic_subscriptions(self, topic, page_size=0, options=None):
        """
        Lists the name of the subscriptions for this topic.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = PublisherApi()
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_topic_subscriptions(topic):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_topic_subscriptions(topic, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          topic (string): The name of the topic that subscriptions are attached to.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of string instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.ListTopicSubscriptionsRequest(
            topic=topic, page_size=page_size)
        return self._list_topic_subscriptions(request, options)

    def delete_topic(self, topic, options=None):
        """
        Deletes the topic with the given name. Returns ``NOT_FOUND`` if the topic
        does not exist. After a topic is deleted, a new topic may be created with
        the same name; this is an entirely new topic with none of the old
        configuration or subscriptions. Existing subscriptions to this topic are
        not deleted, but their ``topic`` field is set to ``_deleted-topic_``.

        Example:
          >>> from google.cloud.pubsub.v1.publisher_api import PublisherApi
          >>> api = PublisherApi()
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> api.delete_topic(topic)

        Args:
          topic (string): Name of the topic to delete.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.DeleteTopicRequest(topic=topic)
        self._delete_topic(request, options)
