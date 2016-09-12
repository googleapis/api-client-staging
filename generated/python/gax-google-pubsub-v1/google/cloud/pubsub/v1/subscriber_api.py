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
"""Accesses the google.pubsub.v1 Subscriber API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.pubsub.v1 import pubsub_pb2

_PageDesc = google.gax.PageDescriptor


class SubscriberApi(object):
    """
    The service that an application uses to manipulate subscriptions and to
    consume messages from a subscription via the ``Pull`` method.
    """

    SERVICE_ADDRESS = 'pubsub.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_subscriptions': _PageDesc('page_token', 'next_page_token',
                                        'subscriptions')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
                   'https://www.googleapis.com/auth/pubsub', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _SUBSCRIPTION_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/subscriptions/{subscription}')
    _TOPIC_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/topics/{topic}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def subscription_path(cls, project, subscription):
        """Returns a fully-qualified subscription resource name string."""
        return cls._SUBSCRIPTION_PATH_TEMPLATE.render({
            'project': project,
            'subscription': subscription,
        })

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
    def match_project_from_subscription_name(cls, subscription_name):
        """Parses the project from a subscription resource.

        Args:
          subscription_name (string): A fully-qualified path representing a subscription
            resource.

        Returns:
          A string representing the project.
        """
        return cls._SUBSCRIPTION_PATH_TEMPLATE.match(subscription_name).get(
            'project')

    @classmethod
    def match_subscription_from_subscription_name(cls, subscription_name):
        """Parses the subscription from a subscription resource.

        Args:
          subscription_name (string): A fully-qualified path representing a subscription
            resource.

        Returns:
          A string representing the subscription.
        """
        return cls._SUBSCRIPTION_PATH_TEMPLATE.match(subscription_name).get(
            'subscription')

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
          A SubscriberApi object.
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
                __name__, 'subscriber_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.pubsub.v1.Subscriber',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.stub = config.create_stub(
            pubsub_pb2.beta_create_Subscriber_stub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)
        self._create_subscription = api_callable.create_api_call(
            self.stub.CreateSubscription,
            settings=defaults['create_subscription'])
        self._get_subscription = api_callable.create_api_call(
            self.stub.GetSubscription, settings=defaults['get_subscription'])
        self._list_subscriptions = api_callable.create_api_call(
            self.stub.ListSubscriptions,
            settings=defaults['list_subscriptions'])
        self._delete_subscription = api_callable.create_api_call(
            self.stub.DeleteSubscription,
            settings=defaults['delete_subscription'])
        self._modify_ack_deadline = api_callable.create_api_call(
            self.stub.ModifyAckDeadline,
            settings=defaults['modify_ack_deadline'])
        self._acknowledge = api_callable.create_api_call(
            self.stub.Acknowledge, settings=defaults['acknowledge'])
        self._pull = api_callable.create_api_call(
            self.stub.Pull, settings=defaults['pull'])
        self._modify_push_config = api_callable.create_api_call(
            self.stub.ModifyPushConfig,
            settings=defaults['modify_push_config'])

    # Service calls
    def create_subscription(self,
                            name,
                            topic,
                            push_config=None,
                            ack_deadline_seconds=0,
                            options=None):
        """
        Creates a subscription to a given topic for a given subscriber.
        If the subscription already exists, returns ``ALREADY_EXISTS``.
        If the corresponding topic doesn't exist, returns ``NOT_FOUND``.
        If the name is not provided in the request, the server will assign a random
        name for this subscription on the same project as the topic.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> name = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> response = api.create_subscription(name, topic)

        Args:
          name (string): The name of the subscription. It must have the format
            ``"projects/{project}/subscriptions/{subscription}"``. ``{subscription}`` must
            start with a letter, and contain only letters (``[A-Za-z]``), numbers
            (``[0-9]``), dashes (``-``), underscores (``_``), periods (``.``), tildes (``~``),
            plus (``+``) or percent signs (``%``). It must be between 3 and 255 characters
            in length, and it must not start with ``"goog"``.
          topic (string): The name of the topic from which this subscription is receiving messages.
            The value of this field will be ``_deleted-topic_`` if the topic has been
            deleted.
          push_config (:class:`google.pubsub.v1.pubsub_pb2.PushConfig`): If push delivery is used with this subscription, this field is
            used to configure it. An empty ``pushConfig`` signifies that the subscriber
            will pull and ack messages using API methods.
          ack_deadline_seconds (int): This value is the maximum time after a subscriber receives a message
            before the subscriber should acknowledge the message. After message
            delivery but before the ack deadline expires and before the message is
            acknowledged, it is an outstanding message and will not be delivered
            again during that time (on a best-effort basis).

            For pull subscriptions, this value is used as the initial value for the ack
            deadline. To override this value for a given message, call
            ``ModifyAckDeadline`` with the corresponding ``ack_id`` if using
            pull.

            For push delivery, this value is also used to set the request timeout for
            the call to the push endpoint.

            If the subscriber never acknowledges the message, the Pub/Sub
            system will eventually redeliver the message.

            If this parameter is not set, the default value of 10 seconds is used.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.Subscription` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        if push_config is None:
            push_config = pubsub_pb2.PushConfig()
        request = pubsub_pb2.Subscription(
            name=name,
            topic=topic,
            push_config=push_config,
            ack_deadline_seconds=ack_deadline_seconds)
        return self._create_subscription(request, options)

    def get_subscription(self, subscription, options=None):
        """
        Gets the configuration details of a subscription.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> response = api.get_subscription(subscription)

        Args:
          subscription (string): The name of the subscription to get.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.Subscription` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.GetSubscriptionRequest(subscription=subscription)
        return self._get_subscription(request, options)

    def list_subscriptions(self, project, page_size=0, options=None):
        """
        Lists matching subscriptions.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = SubscriberApi()
          >>> project = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_subscriptions(project):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_subscriptions(project, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          project (string): The name of the cloud project that subscriptions belong to.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.pubsub.v1.pubsub_pb2.Subscription` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.ListSubscriptionsRequest(
            project=project, page_size=page_size)
        return self._list_subscriptions(request, options)

    def delete_subscription(self, subscription, options=None):
        """
        Deletes an existing subscription. All pending messages in the subscription
        are immediately dropped. Calls to ``Pull`` after deletion will return
        ``NOT_FOUND``. After a subscription is deleted, a new one may be created with
        the same name, but the new one has no association with the old
        subscription, or its topic unless the same topic is specified.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> api.delete_subscription(subscription)

        Args:
          subscription (string): The subscription to delete.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.DeleteSubscriptionRequest(
            subscription=subscription)
        self._delete_subscription(request, options)

    def modify_ack_deadline(self,
                            subscription,
                            ack_ids,
                            ack_deadline_seconds,
                            options=None):
        """
        Modifies the ack deadline for a specific message. This method is useful
        to indicate that more time is needed to process a message by the
        subscriber, or to make the message available for redelivery if the
        processing was interrupted.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> ack_ids = []
          >>> ack_deadline_seconds = 0
          >>> api.modify_ack_deadline(subscription, ack_ids, ack_deadline_seconds)

        Args:
          subscription (string): The name of the subscription.
          ack_ids (list[string]): List of acknowledgment IDs.
          ack_deadline_seconds (int): The new ack deadline with respect to the time this request was sent to
            the Pub/Sub system. Must be >= 0. For example, if the value is 10, the new
            ack deadline will expire 10 seconds after the ``ModifyAckDeadline`` call
            was made. Specifying zero may immediately make the message available for
            another pull request.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.ModifyAckDeadlineRequest(
            subscription=subscription,
            ack_ids=ack_ids,
            ack_deadline_seconds=ack_deadline_seconds)
        self._modify_ack_deadline(request, options)

    def acknowledge(self, subscription, ack_ids, options=None):
        """
        Acknowledges the messages associated with the ``ack_ids`` in the
        ``AcknowledgeRequest``. The Pub/Sub system can remove the relevant messages
        from the subscription.
        Acknowledging a message whose ack deadline has expired may succeed,
        but such a message may be redelivered later. Acknowledging a message more
        than once will not result in an error.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> ack_ids = []
          >>> api.acknowledge(subscription, ack_ids)

        Args:
          subscription (string): The subscription whose message is being acknowledged.
          ack_ids (list[string]): The acknowledgment ID for the messages being acknowledged that was returned
            by the Pub/Sub system in the ``Pull`` response. Must not be empty.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.AcknowledgeRequest(
            subscription=subscription, ack_ids=ack_ids)
        self._acknowledge(request, options)

    def pull(self,
             subscription,
             max_messages,
             return_immediately=False,
             options=None):
        """
        Pulls messages from the server. Returns an empty list if there are no
        messages available in the backlog. The server may return ``UNAVAILABLE`` if
        there are too many concurrent pull requests pending for the given
        subscription.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> max_messages = 0
          >>> response = api.pull(subscription, max_messages)

        Args:
          subscription (string): The subscription from which messages should be pulled.
          return_immediately (bool): If this is specified as true the system will respond immediately even if
            it is not able to return a message in the ``Pull`` response. Otherwise the
            system is allowed to wait until at least one message is available rather
            than returning no messages. The client may cancel the request if it does
            not wish to wait any longer for the response.
          max_messages (int): The maximum number of messages returned for this request. The Pub/Sub
            system may return fewer than the number specified.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.pubsub.v1.pubsub_pb2.PullResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.PullRequest(
            subscription=subscription,
            max_messages=max_messages,
            return_immediately=return_immediately)
        return self._pull(request, options)

    def modify_push_config(self, subscription, push_config, options=None):
        """
        Modifies the ``PushConfig`` for a specified subscription.
        This may be used to change a push subscription to a pull one (signified by
        an empty ``PushConfig``) or vice versa, or change the endpoint URL and other
        attributes of a push subscription. Messages will accumulate for delivery
        continuously through the call regardless of changes to the ``PushConfig``.

        Example:
          >>> from google.cloud.pubsub.v1.subscriber_api import SubscriberApi
          >>> from google.pubsub.v1 import pubsub_pb2
          >>> api = SubscriberApi()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> push_config = pubsub_pb2.PushConfig()
          >>> api.modify_push_config(subscription, push_config)

        Args:
          subscription (string): The name of the subscription.
          push_config (:class:`google.pubsub.v1.pubsub_pb2.PushConfig`): The push configuration for future deliveries.

            An empty ``pushConfig`` indicates that the Pub/Sub system should
            stop pushing messages from the given subscription and allow
            messages to be pulled and acknowledged - effectively pausing
            the subscription if ``Pull`` is not called.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = pubsub_pb2.ModifyPushConfigRequest(
            subscription=subscription, push_config=push_config)
        self._modify_push_config(request, options)
