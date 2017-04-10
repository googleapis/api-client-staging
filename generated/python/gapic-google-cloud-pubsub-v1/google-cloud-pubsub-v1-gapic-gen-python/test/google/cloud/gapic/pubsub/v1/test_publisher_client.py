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
"""Unit tests."""

import mock
import unittest2

from google.gax import errors

from google.cloud.gapic.pubsub.v1 import publisher_client
from google.cloud.proto.pubsub.v1 import pubsub_pb2
from google.iam.v1 import iam_policy_pb2
from google.iam.v1 import policy_pb2
from google.protobuf import empty_pb2


class CustomException(Exception):
    pass


class TestPublisherClient(unittest2.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_topic(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        name = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock response
        name_2 = 'name2-1052831874'
        expected_response = pubsub_pb2.Topic(name_2)
        grpc_stub.CreateTopic.return_value = expected_response

        response = client.create_topic(name)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateTopic.assert_called_once()
        request = grpc_stub.CreateTopic.call_args[0]

        self.assertEqual(name, request.name)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_topic_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        name = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.CreateTopic.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_topic, name)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_publish(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')
        data = b'-86'
        messages_element = pubsub_pb2.PubsubMessage(data)
        messages = [messages_element]

        # Mock response
        message_ids_element = 'messageIdsElement-744837059'
        message_ids = [message_ids_element]
        expected_response = pubsub_pb2.PublishResponse(message_ids)
        grpc_stub.Publish.return_value = expected_response

        response = client.publish(topic, messages)
        self.assertEqual(expected_response, response)

        grpc_stub.Publish.assert_called_once()
        request = grpc_stub.Publish.call_args[0]

        self.assertEqual(topic, request.topic)
        self.assertEqual(messages, request.messages)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_publish_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')
        data = b'-86'
        messages_element = pubsub_pb2.PubsubMessage(data)
        messages = [messages_element]

        # Mock exception response
        grpc_stub.Publish.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.publish, topic, messages)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_topic(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock response
        name = 'name3373707'
        expected_response = pubsub_pb2.Topic(name)
        grpc_stub.GetTopic.return_value = expected_response

        response = client.get_topic(topic)
        self.assertEqual(expected_response, response)

        grpc_stub.GetTopic.assert_called_once()
        request = grpc_stub.GetTopic.call_args[0]

        self.assertEqual(topic, request.topic)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_topic_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.GetTopic.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_topic, topic)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_topics(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        topics_element = pubsub_pb2.Topic()
        topics = [topics_element]
        expected_response = pubsub_pb2.ListTopicsResponse(next_page_token,
                                                          topics)
        grpc_stub.ListTopics.return_value = expected_response

        paged_list_response = client.list_topics(project)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.topics[0], resources[0])

        grpc_stub.ListTopics.assert_called_once()
        request = grpc_stub.ListTopics.call_args[0]

        self.assertEqual(project, request.project)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_topics_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListTopics.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.list_topics, project)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_topic_subscriptions(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock response
        next_page_token = ''
        subscriptions_element = 'subscriptionsElement1698708147'
        subscriptions = [subscriptions_element]
        expected_response = pubsub_pb2.ListTopicSubscriptionsResponse(
            next_page_token, subscriptions)
        grpc_stub.ListTopicSubscriptions.return_value = expected_response

        paged_list_response = client.list_topic_subscriptions(topic)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.subscriptions[0], resources[0])

        grpc_stub.ListTopicSubscriptions.assert_called_once()
        request = grpc_stub.ListTopicSubscriptions.call_args[0]

        self.assertEqual(topic, request.topic)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_topic_subscriptions_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.ListTopicSubscriptions.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.list_topic_subscriptions,
                          topic)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_topic(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        client.delete_topic(topic)

        grpc_stub.DeleteTopic.assert_called_once()
        request = grpc_stub.DeleteTopic.call_args[0]

        self.assertEqual(topic, request.topic)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_topic_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=pubsub_pb2.PublisherStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.DeleteTopic.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_topic, topic)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_set_iam_policy(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')
        policy = policy_pb2.Policy()

        # Mock response
        version = 351608024
        etag = b'21'
        expected_response = policy_pb2.Policy(version, etag)
        grpc_stub.SetIamPolicy.return_value = expected_response

        response = client.set_iam_policy(resource, policy)
        self.assertEqual(expected_response, response)

        grpc_stub.SetIamPolicy.assert_called_once()
        request = grpc_stub.SetIamPolicy.call_args[0]

        self.assertEqual(resource, request.resource)
        self.assertEqual(policy, request.policy)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_set_iam_policy_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')
        policy = policy_pb2.Policy()

        # Mock exception response
        grpc_stub.SetIamPolicy.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.set_iam_policy, resource,
                          policy)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_iam_policy(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock response
        version = 351608024
        etag = b'21'
        expected_response = policy_pb2.Policy(version, etag)
        grpc_stub.GetIamPolicy.return_value = expected_response

        response = client.get_iam_policy(resource)
        self.assertEqual(expected_response, response)

        grpc_stub.GetIamPolicy.assert_called_once()
        request = grpc_stub.GetIamPolicy.call_args[0]

        self.assertEqual(resource, request.resource)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_iam_policy_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.GetIamPolicy.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_iam_policy, resource)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_test_iam_permissions(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')
        permissions = []

        # Mock response
        expected_response = iam_policy_pb2.TestIamPermissionsResponse()
        grpc_stub.TestIamPermissions.return_value = expected_response

        response = client.test_iam_permissions(resource, permissions)
        self.assertEqual(expected_response, response)

        grpc_stub.TestIamPermissions.assert_called_once()
        request = grpc_stub.TestIamPermissions.call_args[0]

        self.assertEqual(resource, request.resource)
        self.assertEqual(permissions, request.permissions)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_test_iam_permissions_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock(spec=iam_policy_pb2.IAMPolicyStub)
        mock_create_stub.return_value = grpc_stub

        client = publisher_client.PublisherClient()

        # Mock request
        resource = client.topic_path('[PROJECT]', '[TOPIC]')
        permissions = []

        # Mock exception response
        grpc_stub.TestIamPermissions.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.test_iam_permissions,
                          resource, permissions)
