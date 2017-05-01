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

require "minitest/autorun"
require "minitest/spec"

require "google/gax"

require "google/cloud/pubsub/v1/subscriber_client"
require "google/iam/v1/iam_policy_services_pb"
require "google/pubsub/v1/pubsub_services_pb"

class CustomTestError < StandardError; end

# Mock for the GRPC::ClientStub class.
class MockGrpcClientStub

  # @param expected_symbol [Symbol] the symbol of the grpc method to be mocked.
  # @param mock_method [Proc] The method that is being mocked.
  def initialize(expected_symbol, mock_method)
    @expected_symbol = expected_symbol
    @mock_method = mock_method
  end

  # This overrides the Object#method method to return the mocked method when the mocked method
  # is being requested. For methods that aren't being tested, this method returns a proc that
  # will raise an error when called. This is to assure that only the mocked grpc method is being
  # called.
  #
  # @param symbol [Symbol] The symbol of the method being requested.
  # @return [Proc] The proc of the requested method. If the requested method is not being mocked
  #   the proc returned will raise when called.
  def method(symbol)
    return @mock_method if symbol == @expected_symbol

    # The requested method is not being tested, raise if it called.
    proc do
      raise "The method #{symbol} was unexpectedly called during the " \
        "test for #{@expected_symbol}."
    end
  end
end

describe Google::Cloud::Pubsub::V1::SubscriberClient do

  describe 'create_subscription' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#create_subscription."

    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient
    Subscription = Google::Pubsub::V1::Subscription

    it 'invokes create_subscription without error' do
      # Create request parameters
      formatted_name = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      formatted_topic = SubscriberClient.topic_path("[PROJECT]", "[TOPIC]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      topic_2 = "topic2-1139259102"
      ack_deadline_seconds = 2135351438
      retain_acked_messages = false
      expected_response = Subscription.new(
        name: name_2,
        topic: topic_2,
        ack_deadline_seconds: ack_deadline_seconds,
        retain_acked_messages: retain_acked_messages
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(formatted_topic, request.topic)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.create_subscription(formatted_name, formatted_topic)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes create_subscription with error' do
      # Create request parameters
      formatted_name = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      formatted_topic = SubscriberClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(formatted_topic, request.topic)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_subscription(formatted_name, formatted_topic)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'get_subscription' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#get_subscription."

    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient
    Subscription = Google::Pubsub::V1::Subscription

    it 'invokes get_subscription without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Create expected grpc response
      name = "name3373707"
      topic = "topic110546223"
      ack_deadline_seconds = 2135351438
      retain_acked_messages = false
      expected_response = Subscription.new(
        name: name,
        topic: topic,
        ack_deadline_seconds: ack_deadline_seconds,
        retain_acked_messages: retain_acked_messages
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.get_subscription(formatted_subscription)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_subscription with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.get_subscription(formatted_subscription)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'update_subscription' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#update_subscription."

    FieldMask = Google::Protobuf::FieldMask
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient
    Subscription = Google::Pubsub::V1::Subscription

    it 'invokes update_subscription without error' do
      # Create request parameters
      subscription = Subscription.new
      update_mask = FieldMask.new

      # Create expected grpc response
      name = "name3373707"
      topic = "topic110546223"
      ack_deadline_seconds = 2135351438
      retain_acked_messages = false
      expected_response = Subscription.new(
        name: name,
        topic: topic,
        ack_deadline_seconds: ack_deadline_seconds,
        retain_acked_messages: retain_acked_messages
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(subscription, request.subscription)
        assert_equal(update_mask, request.update_mask)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:update_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.update_subscription(subscription, update_mask)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes update_subscription with error' do
      # Create request parameters
      subscription = Subscription.new
      update_mask = FieldMask.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(subscription, request.subscription)
        assert_equal(update_mask, request.update_mask)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:update_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.update_subscription(subscription, update_mask)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_subscriptions' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#list_subscriptions."

    ListSubscriptionsResponse = Google::Pubsub::V1::ListSubscriptionsResponse
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient
    Subscription = Google::Pubsub::V1::Subscription

    it 'invokes list_subscriptions without error' do
      # Create request parameters
      formatted_project = SubscriberClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      subscriptions_element = Subscription.new
      subscriptions = [subscriptions_element]
      expected_response = ListSubscriptionsResponse.new(next_page_token: next_page_token, subscriptions: subscriptions)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_subscriptions, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.list_subscriptions(formatted_project)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.subscriptions.to_a, response.to_a)
      end
    end

    it 'invokes list_subscriptions with error' do
      # Create request parameters
      formatted_project = SubscriberClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_subscriptions, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_subscriptions(formatted_project)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'delete_subscription' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#delete_subscription."

    Empty = Google::Protobuf::Empty
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes delete_subscription without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.delete_subscription(formatted_subscription)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes delete_subscription with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_subscription, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.delete_subscription(formatted_subscription)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'modify_ack_deadline' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#modify_ack_deadline."

    Empty = Google::Protobuf::Empty
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes modify_ack_deadline without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      ack_ids = []
      ack_deadline_seconds = 0

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(ack_ids, request.ack_ids)
        assert_equal(ack_deadline_seconds, request.ack_deadline_seconds)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:modify_ack_deadline, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.modify_ack_deadline(
          formatted_subscription,
          ack_ids,
          ack_deadline_seconds
        )

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes modify_ack_deadline with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      ack_ids = []
      ack_deadline_seconds = 0

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(ack_ids, request.ack_ids)
        assert_equal(ack_deadline_seconds, request.ack_deadline_seconds)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:modify_ack_deadline, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.modify_ack_deadline(
            formatted_subscription,
            ack_ids,
            ack_deadline_seconds
          )
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'acknowledge' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#acknowledge."

    Empty = Google::Protobuf::Empty
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes acknowledge without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      ack_ids = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(ack_ids, request.ack_ids)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:acknowledge, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.acknowledge(formatted_subscription, ack_ids)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes acknowledge with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      ack_ids = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(ack_ids, request.ack_ids)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:acknowledge, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.acknowledge(formatted_subscription, ack_ids)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'pull' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#pull."

    PullResponse = Google::Pubsub::V1::PullResponse
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes pull without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      max_messages = 0

      # Create expected grpc response
      expected_response = PullResponse.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(max_messages, request.max_messages)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:pull, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.pull(formatted_subscription, max_messages)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes pull with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      max_messages = 0

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(max_messages, request.max_messages)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:pull, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.pull(formatted_subscription, max_messages)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'streaming_pull' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#streaming_pull."

    StreamingPullRequest = Google::Pubsub::V1::StreamingPullRequest
    StreamingPullResponse = Google::Pubsub::V1::StreamingPullResponse
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes streaming_pull without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      stream_ack_deadline_seconds = 0
      request = StreamingPullRequest.new(subscription: formatted_subscription, stream_ack_deadline_seconds: stream_ack_deadline_seconds)

      # Create expected grpc response
      expected_response = StreamingPullResponse.new

      # Mock Grpc layer
      mock_method = proc do |requests|
        request = requests.first
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(stream_ack_deadline_seconds, request.stream_ack_deadline_seconds)
        [expected_response]
      end
      mock_stub = MockGrpcClientStub.new(:streaming_pull, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.streaming_pull([request])

        # Verify the response
        assert_equal(1, response.count)
        assert_equal(expected_response, response.first)
      end
    end

    it 'invokes streaming_pull with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      stream_ack_deadline_seconds = 0
      request = StreamingPullRequest.new(subscription: formatted_subscription, stream_ack_deadline_seconds: stream_ack_deadline_seconds)

      # Mock Grpc layer
      mock_method = proc do |requests|
        request = requests.first
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(stream_ack_deadline_seconds, request.stream_ack_deadline_seconds)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:streaming_pull, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.streaming_pull([request])
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'modify_push_config' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#modify_push_config."

    Empty = Google::Protobuf::Empty
    PushConfig = Google::Pubsub::V1::PushConfig
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes modify_push_config without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      push_config = PushConfig.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(push_config, request.push_config)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:modify_push_config, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.modify_push_config(formatted_subscription, push_config)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes modify_push_config with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      push_config = PushConfig.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        assert_equal(push_config, request.push_config)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:modify_push_config, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.modify_push_config(formatted_subscription, push_config)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_snapshots' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#list_snapshots."

    ListSnapshotsResponse = Google::Pubsub::V1::ListSnapshotsResponse
    Snapshot = Google::Pubsub::V1::Snapshot
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes list_snapshots without error' do
      # Create request parameters
      formatted_project = SubscriberClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      snapshots_element = Snapshot.new
      snapshots = [snapshots_element]
      expected_response = ListSnapshotsResponse.new(next_page_token: next_page_token, snapshots: snapshots)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_snapshots, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.list_snapshots(formatted_project)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.snapshots.to_a, response.to_a)
      end
    end

    it 'invokes list_snapshots with error' do
      # Create request parameters
      formatted_project = SubscriberClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_snapshots, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_snapshots(formatted_project)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'create_snapshot' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#create_snapshot."

    Snapshot = Google::Pubsub::V1::Snapshot
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes create_snapshot without error' do
      # Create request parameters
      formatted_name = SubscriberClient.snapshot_path("[PROJECT]", "[SNAPSHOT]")
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      topic = "topic110546223"
      expected_response = Snapshot.new(name: name_2, topic: topic)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(formatted_subscription, request.subscription)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_snapshot, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.create_snapshot(formatted_name, formatted_subscription)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes create_snapshot with error' do
      # Create request parameters
      formatted_name = SubscriberClient.snapshot_path("[PROJECT]", "[SNAPSHOT]")
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        assert_equal(formatted_subscription, request.subscription)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_snapshot, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_snapshot(formatted_name, formatted_subscription)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'delete_snapshot' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#delete_snapshot."

    Empty = Google::Protobuf::Empty
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes delete_snapshot without error' do
      # Create request parameters
      formatted_snapshot = SubscriberClient.snapshot_path("[PROJECT]", "[SNAPSHOT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_snapshot, request.snapshot)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_snapshot, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.delete_snapshot(formatted_snapshot)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes delete_snapshot with error' do
      # Create request parameters
      formatted_snapshot = SubscriberClient.snapshot_path("[PROJECT]", "[SNAPSHOT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_snapshot, request.snapshot)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_snapshot, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.delete_snapshot(formatted_snapshot)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'seek' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#seek."

    SeekResponse = Google::Pubsub::V1::SeekResponse
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes seek without error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Create expected grpc response
      expected_response = SeekResponse.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:seek, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.seek(formatted_subscription)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes seek with error' do
      # Create request parameters
      formatted_subscription = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_subscription, request.subscription)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:seek, mock_method)

      Google::Pubsub::V1::Subscriber::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.seek(formatted_subscription)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'set_iam_policy' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#set_iam_policy."

    Policy = Google::Iam::V1::Policy
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes set_iam_policy without error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      policy = Policy.new

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = Policy.new(version: version, etag: etag)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(policy, request.policy)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.set_iam_policy(formatted_resource, policy)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes set_iam_policy with error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      policy = Policy.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(policy, request.policy)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.set_iam_policy(formatted_resource, policy)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'get_iam_policy' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#get_iam_policy."

    Policy = Google::Iam::V1::Policy
    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient

    it 'invokes get_iam_policy without error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = Policy.new(version: version, etag: etag)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.get_iam_policy(formatted_resource)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_iam_policy with error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.get_iam_policy(formatted_resource)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'test_iam_permissions' do
    custom_error = CustomTestError.new "Custom test error for SubscriberClient#test_iam_permissions."

    SubscriberClient = Google::Cloud::Pubsub::V1::SubscriberClient
    TestIamPermissionsResponse = Google::Iam::V1::TestIamPermissionsResponse

    it 'invokes test_iam_permissions without error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      permissions = []

      # Create expected grpc response
      expected_response = TestIamPermissionsResponse.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        response = client.test_iam_permissions(formatted_resource, permissions)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes test_iam_permissions with error' do
      # Create request parameters
      formatted_resource = SubscriberClient.subscription_path("[PROJECT]", "[SUBSCRIPTION]")
      permissions = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = SubscriberClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.test_iam_permissions(formatted_resource, permissions)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end
end