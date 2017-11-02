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
import unittest

from google.gax import errors

from google.cloud import pubsub_v1
from google.cloud.pubsub_v1.proto import pubsub_pb2
from google.iam.v1 import iam_policy_pb2
from google.iam.v1 import policy_pb2
from google.protobuf import empty_pb2
from google.protobuf import field_mask_pb2


class CustomException(Exception):
    pass


class TestSubscriberClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_subscription(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        name = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock response
        name_2 = 'name2-1052831874'
        topic_2 = 'topic2-1139259102'
        ack_deadline_seconds = 2135351438
        retain_acked_messages = False
        expected_response = {
            'name': name_2,
            'topic': topic_2,
            'ack_deadline_seconds': ack_deadline_seconds,
            'retain_acked_messages': retain_acked_messages
        }
        expected_response = pubsub_pb2.Subscription(**expected_response)
        grpc_stub.CreateSubscription.return_value = expected_response

        response = client.create_subscription(name, topic)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateSubscription.assert_called_once()
        args, kwargs = grpc_stub.CreateSubscription.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.Subscription(name=name, topic=topic)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_subscription_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        name = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        topic = client.topic_path('[PROJECT]', '[TOPIC]')

        # Mock exception response
        grpc_stub.CreateSubscription.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_subscription, name,
                          topic)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_subscription(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock response
        name = 'name3373707'
        topic = 'topic110546223'
        ack_deadline_seconds = 2135351438
        retain_acked_messages = False
        expected_response = {
            'name': name,
            'topic': topic,
            'ack_deadline_seconds': ack_deadline_seconds,
            'retain_acked_messages': retain_acked_messages
        }
        expected_response = pubsub_pb2.Subscription(**expected_response)
        grpc_stub.GetSubscription.return_value = expected_response

        response = client.get_subscription(subscription)
        self.assertEqual(expected_response, response)

        grpc_stub.GetSubscription.assert_called_once()
        args, kwargs = grpc_stub.GetSubscription.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.GetSubscriptionRequest(
            subscription=subscription)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_subscription_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock exception response
        grpc_stub.GetSubscription.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_subscription,
                          subscription)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_subscription(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = {}
        update_mask = {}

        # Mock response
        name = 'name3373707'
        topic = 'topic110546223'
        ack_deadline_seconds = 2135351438
        retain_acked_messages = False
        expected_response = {
            'name': name,
            'topic': topic,
            'ack_deadline_seconds': ack_deadline_seconds,
            'retain_acked_messages': retain_acked_messages
        }
        expected_response = pubsub_pb2.Subscription(**expected_response)
        grpc_stub.UpdateSubscription.return_value = expected_response

        response = client.update_subscription(subscription, update_mask)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateSubscription.assert_called_once()
        args, kwargs = grpc_stub.UpdateSubscription.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.UpdateSubscriptionRequest(
            subscription=subscription, update_mask=update_mask)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_subscription_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = {}
        update_mask = {}

        # Mock exception response
        grpc_stub.UpdateSubscription.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_subscription,
                          subscription, update_mask)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_subscriptions(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        subscriptions_element = {}
        subscriptions = [subscriptions_element]
        expected_response = {
            'next_page_token': next_page_token,
            'subscriptions': subscriptions
        }
        expected_response = pubsub_pb2.ListSubscriptionsResponse(
            **expected_response)
        grpc_stub.ListSubscriptions.return_value = expected_response

        paged_list_response = client.list_subscriptions(project)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.subscriptions[0], resources[0])

        grpc_stub.ListSubscriptions.assert_called_once()
        args, kwargs = grpc_stub.ListSubscriptions.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.ListSubscriptionsRequest(project=project)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_subscriptions_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListSubscriptions.side_effect = CustomException()

        paged_list_response = client.list_subscriptions(project)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_subscription(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        client.delete_subscription(subscription)

        grpc_stub.DeleteSubscription.assert_called_once()
        args, kwargs = grpc_stub.DeleteSubscription.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.DeleteSubscriptionRequest(
            subscription=subscription)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_subscription_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock exception response
        grpc_stub.DeleteSubscription.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_subscription,
                          subscription)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_modify_ack_deadline(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        ack_ids = []
        ack_deadline_seconds = 2135351438

        client.modify_ack_deadline(subscription, ack_ids, ack_deadline_seconds)

        grpc_stub.ModifyAckDeadline.assert_called_once()
        args, kwargs = grpc_stub.ModifyAckDeadline.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.ModifyAckDeadlineRequest(
            subscription=subscription,
            ack_ids=ack_ids,
            ack_deadline_seconds=ack_deadline_seconds)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_modify_ack_deadline_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        ack_ids = []
        ack_deadline_seconds = 2135351438

        # Mock exception response
        grpc_stub.ModifyAckDeadline.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.modify_ack_deadline,
                          subscription, ack_ids, ack_deadline_seconds)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_acknowledge(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        ack_ids = []

        client.acknowledge(subscription, ack_ids)

        grpc_stub.Acknowledge.assert_called_once()
        args, kwargs = grpc_stub.Acknowledge.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.AcknowledgeRequest(
            subscription=subscription, ack_ids=ack_ids)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_acknowledge_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        ack_ids = []

        # Mock exception response
        grpc_stub.Acknowledge.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.acknowledge, subscription,
                          ack_ids)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_pull(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        max_messages = 496131527

        # Mock response
        expected_response = {}
        expected_response = pubsub_pb2.PullResponse(**expected_response)
        grpc_stub.Pull.return_value = expected_response

        response = client.pull(subscription, max_messages)
        self.assertEqual(expected_response, response)

        grpc_stub.Pull.assert_called_once()
        args, kwargs = grpc_stub.Pull.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.PullRequest(
            subscription=subscription, max_messages=max_messages)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_pull_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        max_messages = 496131527

        # Mock exception response
        grpc_stub.Pull.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.pull, subscription,
                          max_messages)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_streaming_pull(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        stream_ack_deadline_seconds = 1875467245
        request = {
            'subscription': subscription,
            'stream_ack_deadline_seconds': stream_ack_deadline_seconds
        }
        requests = [request]

        # Mock response
        received_messages_element = {}
        received_messages = [received_messages_element]
        expected_response = {'received_messages': received_messages}
        expected_response = pubsub_pb2.StreamingPullResponse(
            **expected_response)
        grpc_stub.StreamingPull.return_value = iter([expected_response])

        response = client.streaming_pull(requests)
        resources = list(response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response, resources[0])

        grpc_stub.StreamingPull.assert_called_once()
        args, kwargs = grpc_stub.StreamingPull.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_requests = args[0]
        self.assertEqual(1, len(actual_requests))
        actual_request = list(actual_requests)[0]
        self.assertEqual(request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_streaming_pull_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        stream_ack_deadline_seconds = 1875467245
        request = {
            'subscription': subscription,
            'stream_ack_deadline_seconds': stream_ack_deadline_seconds
        }
        requests = [request]

        # Mock exception response
        grpc_stub.StreamingPull.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.streaming_pull, requests)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_modify_push_config(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        push_config = {}

        client.modify_push_config(subscription, push_config)

        grpc_stub.ModifyPushConfig.assert_called_once()
        args, kwargs = grpc_stub.ModifyPushConfig.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.ModifyPushConfigRequest(
            subscription=subscription, push_config=push_config)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_modify_push_config_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        push_config = {}

        # Mock exception response
        grpc_stub.ModifyPushConfig.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.modify_push_config,
                          subscription, push_config)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_snapshots(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock response
        next_page_token = ''
        snapshots_element = {}
        snapshots = [snapshots_element]
        expected_response = {
            'next_page_token': next_page_token,
            'snapshots': snapshots
        }
        expected_response = pubsub_pb2.ListSnapshotsResponse(
            **expected_response)
        grpc_stub.ListSnapshots.return_value = expected_response

        paged_list_response = client.list_snapshots(project)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.snapshots[0], resources[0])

        grpc_stub.ListSnapshots.assert_called_once()
        args, kwargs = grpc_stub.ListSnapshots.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.ListSnapshotsRequest(project=project)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_snapshots_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        project = client.project_path('[PROJECT]')

        # Mock exception response
        grpc_stub.ListSnapshots.side_effect = CustomException()

        paged_list_response = client.list_snapshots(project)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_snapshot(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        name = client.snapshot_path('[PROJECT]', '[SNAPSHOT]')
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock response
        name_2 = 'name2-1052831874'
        topic = 'topic110546223'
        expected_response = {'name': name_2, 'topic': topic}
        expected_response = pubsub_pb2.Snapshot(**expected_response)
        grpc_stub.CreateSnapshot.return_value = expected_response

        response = client.create_snapshot(name, subscription)
        self.assertEqual(expected_response, response)

        grpc_stub.CreateSnapshot.assert_called_once()
        args, kwargs = grpc_stub.CreateSnapshot.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.CreateSnapshotRequest(
            name=name, subscription=subscription)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_snapshot_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        name = client.snapshot_path('[PROJECT]', '[SNAPSHOT]')
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock exception response
        grpc_stub.CreateSnapshot.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_snapshot, name,
                          subscription)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_snapshot(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        snapshot = {}
        update_mask = {}

        # Mock response
        name = 'name3373707'
        topic = 'topic110546223'
        expected_response = {'name': name, 'topic': topic}
        expected_response = pubsub_pb2.Snapshot(**expected_response)
        grpc_stub.UpdateSnapshot.return_value = expected_response

        response = client.update_snapshot(snapshot, update_mask)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdateSnapshot.assert_called_once()
        args, kwargs = grpc_stub.UpdateSnapshot.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.UpdateSnapshotRequest(
            snapshot=snapshot, update_mask=update_mask)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_snapshot_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        snapshot = {}
        update_mask = {}

        # Mock exception response
        grpc_stub.UpdateSnapshot.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_snapshot, snapshot,
                          update_mask)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_snapshot(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        snapshot = client.snapshot_path('[PROJECT]', '[SNAPSHOT]')

        client.delete_snapshot(snapshot)

        grpc_stub.DeleteSnapshot.assert_called_once()
        args, kwargs = grpc_stub.DeleteSnapshot.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.DeleteSnapshotRequest(snapshot=snapshot)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_snapshot_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        snapshot = client.snapshot_path('[PROJECT]', '[SNAPSHOT]')

        # Mock exception response
        grpc_stub.DeleteSnapshot.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_snapshot, snapshot)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_seek(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock response
        expected_response = {}
        expected_response = pubsub_pb2.SeekResponse(**expected_response)
        grpc_stub.Seek.return_value = expected_response

        response = client.seek(subscription)
        self.assertEqual(expected_response, response)

        grpc_stub.Seek.assert_called_once()
        args, kwargs = grpc_stub.Seek.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = pubsub_pb2.SeekRequest(subscription=subscription)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_seek_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        subscription = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock exception response
        grpc_stub.Seek.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.seek, subscription)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_set_iam_policy(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        policy = {}

        # Mock response
        version = 351608024
        etag = b'21'
        expected_response = {'version': version, 'etag': etag}
        expected_response = policy_pb2.Policy(**expected_response)
        grpc_stub.SetIamPolicy.return_value = expected_response

        response = client.set_iam_policy(resource, policy)
        self.assertEqual(expected_response, response)

        grpc_stub.SetIamPolicy.assert_called_once()
        args, kwargs = grpc_stub.SetIamPolicy.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = iam_policy_pb2.SetIamPolicyRequest(
            resource=resource, policy=policy)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_set_iam_policy_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        policy = {}

        # Mock exception response
        grpc_stub.SetIamPolicy.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.set_iam_policy, resource,
                          policy)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_iam_policy(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock response
        version = 351608024
        etag = b'21'
        expected_response = {'version': version, 'etag': etag}
        expected_response = policy_pb2.Policy(**expected_response)
        grpc_stub.GetIamPolicy.return_value = expected_response

        response = client.get_iam_policy(resource)
        self.assertEqual(expected_response, response)

        grpc_stub.GetIamPolicy.assert_called_once()
        args, kwargs = grpc_stub.GetIamPolicy.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = iam_policy_pb2.GetIamPolicyRequest(
            resource=resource)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_iam_policy_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')

        # Mock exception response
        grpc_stub.GetIamPolicy.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_iam_policy, resource)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_test_iam_permissions(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        permissions = []

        # Mock response
        expected_response = {}
        expected_response = iam_policy_pb2.TestIamPermissionsResponse(
            **expected_response)
        grpc_stub.TestIamPermissions.return_value = expected_response

        response = client.test_iam_permissions(resource, permissions)
        self.assertEqual(expected_response, response)

        grpc_stub.TestIamPermissions.assert_called_once()
        args, kwargs = grpc_stub.TestIamPermissions.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = iam_policy_pb2.TestIamPermissionsRequest(
            resource=resource, permissions=permissions)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_test_iam_permissions_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = pubsub_v1.SubscriberClient()

        # Mock request
        resource = client.subscription_path('[PROJECT]', '[SUBSCRIPTION]')
        permissions = []

        # Mock exception response
        grpc_stub.TestIamPermissions.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.test_iam_permissions,
                          resource, permissions)
