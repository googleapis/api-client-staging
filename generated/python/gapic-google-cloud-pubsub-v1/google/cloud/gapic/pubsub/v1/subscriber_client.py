# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
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

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.proto.pubsub.v1 import pubsub_pb2
from google.iam.v1 import iam_policy_pb2
from google.iam.v1 import policy_pb2

_PageDesc = google.gax.PageDescriptor


class SubscriberClient(object):
    """
    The service that an application uses to manipulate subscriptions and to
    consume messages from a subscription via the ``Pull`` method.
    """

    SERVICE_ADDRESS = 'pubsub.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_subscriptions': _PageDesc('page_token', 'next_page_token',
                                        'subscriptions')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
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
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name=None,
                 app_version='UNKNOWN',
                 lib_name=None,
                 lib_version='UNKNOWN',
                 metrics_headers=()):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The name of the application calling
            the service. Recommended for analytics purposes.
          app_version (string): The version of the application calling
            the service. Recommended for analytics purposes.
          lib_name (string): The API library software used for calling
            the service. (Unless you are writing an API client itself,
            leave this as default.)
          lib_version (string): The API library software version used
            for calling the service. (Unless you are writing an API client
            itself, leave this as default.)
          metrics_headers (dict): A dictionary of values for tracking
            client library metrics. Ultimately serializes to a string
            (e.g. 'foo/1.2.3 bar/3.14.1'). This argument should be
            considered private.

        Returns:
          A SubscriberClient object.
        """
        # Unless the calling application specifically requested
        # OAuth scopes, request everything.
        if scopes is None:
            scopes = self._ALL_SCOPES

        # Initialize an empty client config, if none is set.
        if client_config is None:
            client_config = {}

        # Initialize metrics_headers as an ordered dictionary
        # (cuts down on cardinality of the resulting string slightly).
        metrics_headers = collections.OrderedDict(metrics_headers)
        metrics_headers['gl-python'] = platform.python_version()

        # The library may or may not be set, depending on what is
        # calling this client. Newer client libraries set the library name
        # and version.
        if lib_name:
            metrics_headers[lib_name] = lib_version

        # Finally, track the GAPIC package version.
        metrics_headers['gapic'] = pkg_resources.get_distribution(
            'gapic-google-cloud-pubsub-v1', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'subscriber_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.pubsub.v1.Subscriber',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.iam_policy_stub = config.create_stub(
            iam_policy_pb2.IAMPolicyStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)
        self.subscriber_stub = config.create_stub(
            pubsub_pb2.SubscriberStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._create_subscription = api_callable.create_api_call(
            self.subscriber_stub.CreateSubscription,
            settings=defaults['create_subscription'])
        self._get_subscription = api_callable.create_api_call(
            self.subscriber_stub.GetSubscription,
            settings=defaults['get_subscription'])
        self._list_subscriptions = api_callable.create_api_call(
            self.subscriber_stub.ListSubscriptions,
            settings=defaults['list_subscriptions'])
        self._delete_subscription = api_callable.create_api_call(
            self.subscriber_stub.DeleteSubscription,
            settings=defaults['delete_subscription'])
        self._modify_ack_deadline = api_callable.create_api_call(
            self.subscriber_stub.ModifyAckDeadline,
            settings=defaults['modify_ack_deadline'])
        self._acknowledge = api_callable.create_api_call(
            self.subscriber_stub.Acknowledge, settings=defaults['acknowledge'])
        self._pull = api_callable.create_api_call(
            self.subscriber_stub.Pull, settings=defaults['pull'])
        self._streaming_pull = api_callable.create_api_call(
            self.subscriber_stub.StreamingPull,
            settings=defaults['streaming_pull'])
        self._modify_push_config = api_callable.create_api_call(
            self.subscriber_stub.ModifyPushConfig,
            settings=defaults['modify_push_config'])
        self._set_iam_policy = api_callable.create_api_call(
            self.iam_policy_stub.SetIamPolicy,
            settings=defaults['set_iam_policy'])
        self._get_iam_policy = api_callable.create_api_call(
            self.iam_policy_stub.GetIamPolicy,
            settings=defaults['get_iam_policy'])
        self._test_iam_permissions = api_callable.create_api_call(
            self.iam_policy_stub.TestIamPermissions,
            settings=defaults['test_iam_permissions'])

    # Service calls
    def create_subscription(self,
                            name,
                            topic,
                            push_config=None,
                            ack_deadline_seconds=0,
                            options=None):
        """
        Creates a subscription to a given topic.
        If the subscription already exists, returns ``ALREADY_EXISTS``.
        If the corresponding topic doesn't exist, returns ``NOT_FOUND``.
        If the name is not provided in the request, the server will assign a random
        name for this subscription on the same project as the topic, conforming
        to the
        `resource name format <https://cloud.google.com/pubsub/docs/overview#names>`_.
        The generated name is populated in the returned Subscription object.
        Note that for REST API requests, you must specify a name in the request.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> name = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> topic = api.topic_path('[PROJECT]', '[TOPIC]')
          >>> response = api.create_subscription(name, topic)

        Args:
          name (string): The name of the subscription. It must have the format
            ``\"projects/{project}/subscriptions/{subscription}\"``. ``{subscription}`` must
            start with a letter, and contain only letters (``[A-Za-z]``), numbers
            (``[0-9]``), dashes (``-``), underscores (``_``), periods (``.``), tildes (``~``),
            plus (``+``) or percent signs (``%``). It must be between 3 and 255 characters
            in length, and it must not start with ``\"goog\"``.
          topic (string): The name of the topic from which this subscription is receiving messages.
            Format is ``projects/{project}/topics/{topic}``.
            The value of this field will be ``_deleted-topic_`` if the topic has been
            deleted.
          push_config (:class:`google.cloud.proto.pubsub.v1.pubsub_pb2.PushConfig`): If push delivery is used with this subscription, this field is
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
            The minimum custom deadline you can specify is 10 seconds.
            The maximum custom deadline you can specify is 600 seconds (10 minutes).
            If this parameter is 0, a default value of 10 seconds is used.

            For push delivery, this value is also used to set the request timeout for
            the call to the push endpoint.

            If the subscriber never acknowledges the message, the Pub/Sub
            system will eventually redeliver the message.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.pubsub.v1.pubsub_pb2.Subscription` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
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
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> response = api.get_subscription(subscription)

        Args:
          subscription (string): The name of the subscription to get.
            Format is ``projects/{project}/subscriptions/{sub}``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.pubsub.v1.pubsub_pb2.Subscription` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = pubsub_pb2.GetSubscriptionRequest(subscription=subscription)
        return self._get_subscription(request, options)

    def list_subscriptions(self, project, page_size=0, options=None):
        """
        Lists matching subscriptions.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = subscriber_client.SubscriberClient()
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
            Format is ``projects/{project}``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.cloud.proto.pubsub.v1.pubsub_pb2.Subscription` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = pubsub_pb2.ListSubscriptionsRequest(
            project=project, page_size=page_size)
        return self._list_subscriptions(request, options)

    def delete_subscription(self, subscription, options=None):
        """
        Deletes an existing subscription. All messages retained in the subscription
        are immediately dropped. Calls to ``Pull`` after deletion will return
        ``NOT_FOUND``. After a subscription is deleted, a new one may be created with
        the same name, but the new one has no association with the old
        subscription or its topic unless the same topic is specified.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> api.delete_subscription(subscription)

        Args:
          subscription (string): The subscription to delete.
            Format is ``projects/{project}/subscriptions/{sub}``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
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
        processing was interrupted. Note that this does not modify the
        subscription-level ``ackDeadlineSeconds`` used for subsequent messages.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> ack_ids = []
          >>> ack_deadline_seconds = 0
          >>> api.modify_ack_deadline(subscription, ack_ids, ack_deadline_seconds)

        Args:
          subscription (string): The name of the subscription.
            Format is ``projects/{project}/subscriptions/{sub}``.
          ack_ids (list[string]): List of acknowledgment IDs.
          ack_deadline_seconds (int): The new ack deadline with respect to the time this request was sent to
            the Pub/Sub system. For example, if the value is 10, the new
            ack deadline will expire 10 seconds after the ``ModifyAckDeadline`` call
            was made. Specifying zero may immediately make the message available for
            another pull request.
            The minimum deadline you can specify is 0 seconds.
            The maximum deadline you can specify is 600 seconds (10 minutes).
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
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
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> ack_ids = []
          >>> api.acknowledge(subscription, ack_ids)

        Args:
          subscription (string): The subscription whose message is being acknowledged.
            Format is ``projects/{project}/subscriptions/{sub}``.
          ack_ids (list[string]): The acknowledgment ID for the messages being acknowledged that was returned
            by the Pub/Sub system in the ``Pull`` response. Must not be empty.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
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
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> max_messages = 0
          >>> response = api.pull(subscription, max_messages)

        Args:
          subscription (string): The subscription from which messages should be pulled.
            Format is ``projects/{project}/subscriptions/{sub}``.
          return_immediately (bool): If this field set to true, the system will respond immediately even if
            it there are no messages available to return in the ``Pull`` response.
            Otherwise, the system may wait (for a bounded amount of time) until at
            least one message is available, rather than returning no messages. The
            client may cancel the request if it does not wish to wait any longer for
            the response.
          max_messages (int): The maximum number of messages returned for this request. The Pub/Sub
            system may return fewer than the number specified.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.cloud.proto.pubsub.v1.pubsub_pb2.PullResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = pubsub_pb2.PullRequest(
            subscription=subscription,
            max_messages=max_messages,
            return_immediately=return_immediately)
        return self._pull(request, options)

    def streaming_pull(self, requests, options=None):
        """
        (EXPERIMENTAL) StreamingPull is an experimental feature. This RPC will
        respond with UNIMPLEMENTED errors unless you have been invited to test
        this feature. Contact cloud-pubsub@google.com with any questions.
        Establishes a stream with the server, which sends messages down to the
        client. The client streams acknowledgements and ack deadline modifications
        back to the server. The server will close the stream and return the status
        on any error. The server may close the stream with status ``OK`` to reassign
        server-side resources, in which case, the client should re-establish the
        stream. ``UNAVAILABLE`` may also be returned in the case of a transient error
        (e.g., a server restart). These should also be retried by the client. Flow
        control can be achieved by configuring the underlying RPC channel.

        EXPERIMENTAL: This method interface might change in the future.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> from google.cloud.proto.pubsub.v1 import pubsub_pb2
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> stream_ack_deadline_seconds = 0
          >>> request = pubsub_pb2.StreamingPullRequest(subscription, stream_ack_deadline_seconds)
          >>> requests = [request]
          >>> for element in api.streaming_pull(requests):
          >>>   # process element
          >>>   pass

        Args:
          requests (iterator[:class:`google.cloud.proto.pubsub.v1.pubsub_pb2.StreamingPullRequest`]): The input objects.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          iterator[:class:`google.cloud.proto.pubsub.v1.pubsub_pb2.StreamingPullResponse`].

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        return self._streaming_pull(requests, options)

    def modify_push_config(self, subscription, push_config, options=None):
        """
        Modifies the ``PushConfig`` for a specified subscription.
        This may be used to change a push subscription to a pull one (signified by
        an empty ``PushConfig``) or vice versa, or change the endpoint URL and other
        attributes of a push subscription. Messages will accumulate for delivery
        continuously through the call regardless of changes to the ``PushConfig``.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> from google.cloud.proto.pubsub.v1 import pubsub_pb2
          >>> api = subscriber_client.SubscriberClient()
          >>> subscription = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> push_config = pubsub_pb2.PushConfig()
          >>> api.modify_push_config(subscription, push_config)

        Args:
          subscription (string): The name of the subscription.
            Format is ``projects/{project}/subscriptions/{sub}``.
          push_config (:class:`google.cloud.proto.pubsub.v1.pubsub_pb2.PushConfig`): The push configuration for future deliveries.

            An empty ``pushConfig`` indicates that the Pub/Sub system should
            stop pushing messages from the given subscription and allow
            messages to be pulled and acknowledged - effectively pausing
            the subscription if ``Pull`` is not called.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = pubsub_pb2.ModifyPushConfigRequest(
            subscription=subscription, push_config=push_config)
        self._modify_push_config(request, options)

    def set_iam_policy(self, resource, policy, options=None):
        """
        Sets the access control policy on the specified resource. Replaces any
        existing policy.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> from google.iam.v1 import policy_pb2
          >>> api = subscriber_client.SubscriberClient()
          >>> resource = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> policy = policy_pb2.Policy()
          >>> response = api.set_iam_policy(resource, policy)

        Args:
          resource (string): REQUIRED: The resource for which the policy is being specified.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          policy (:class:`google.iam.v1.policy_pb2.Policy`): REQUIRED: The complete policy to be applied to the ``resource``. The size of
            the policy is limited to a few 10s of KB. An empty policy is a
            valid policy but certain Cloud Platform services (such as Projects)
            might reject them.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.SetIamPolicyRequest(
            resource=resource, policy=policy)
        return self._set_iam_policy(request, options)

    def get_iam_policy(self, resource, options=None):
        """
        Gets the access control policy for a resource.
        Returns an empty policy if the resource exists and does not have a policy
        set.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> resource = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> response = api.get_iam_policy(resource)

        Args:
          resource (string): REQUIRED: The resource for which the policy is being requested.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.GetIamPolicyRequest(resource=resource)
        return self._get_iam_policy(request, options)

    def test_iam_permissions(self, resource, permissions, options=None):
        """
        Returns permissions that a caller has on the specified resource.
        If the resource does not exist, this will return an empty set of
        permissions, not a NOT_FOUND error.

        Example:
          >>> from google.cloud.gapic.pubsub.v1 import subscriber_client
          >>> api = subscriber_client.SubscriberClient()
          >>> resource = api.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
          >>> permissions = []
          >>> response = api.test_iam_permissions(resource, permissions)

        Args:
          resource (string): REQUIRED: The resource for which the policy detail is being requested.
            ``resource`` is usually specified as a path. For example, a Project
            resource is specified as ``projects/{project}``.
          permissions (list[string]): The set of permissions to check for the ``resource``. Permissions with
            wildcards (such as '*' or 'storage.*') are not allowed. For more
            information see
            `IAM Overview <https://cloud.google.com/iam/docs/overview#permissions>`_.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.iam_policy_pb2.TestIamPermissionsResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.TestIamPermissionsRequest(
            resource=resource, permissions=permissions)
        return self._test_iam_permissions(request, options)
