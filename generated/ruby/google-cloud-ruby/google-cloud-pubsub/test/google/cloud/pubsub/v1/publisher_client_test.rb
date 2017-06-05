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

require "google/cloud/pubsub/v1/publisher_client"
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

describe Google::Cloud::Pubsub::V1::PublisherClient do

  describe 'create_topic' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#create_topic."

    it 'invokes create_topic without error' do
      # Create request parameters
      formatted_name = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Create expected grpc response
      name_2 = "name2-1052831874"
      expected_response = Google::Pubsub::V1::Topic.new(name: name_2)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:create_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.create_topic(formatted_name)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes create_topic with error' do
      # Create request parameters
      formatted_name = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_name, request.name)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:create_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.create_topic(formatted_name)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'publish' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#publish."

    it 'invokes publish without error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      data = ''
      messages_element = Google::Pubsub::V1::PubsubMessage.new(data: data)
      messages = [messages_element]

      # Create expected grpc response
      message_ids_element = "messageIdsElement-744837059"
      message_ids = [message_ids_element]
      expected_response = Google::Pubsub::V1::PublishResponse.new(message_ids: message_ids)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        assert_equal(messages, request.messages)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:publish, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.publish(formatted_topic, messages)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes publish with error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      data = ''
      messages_element = Google::Pubsub::V1::PubsubMessage.new(data: data)
      messages = [messages_element]

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        assert_equal(messages, request.messages)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:publish, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.publish(formatted_topic, messages)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'get_topic' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#get_topic."

    it 'invokes get_topic without error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Create expected grpc response
      name = "name3373707"
      expected_response = Google::Pubsub::V1::Topic.new(name: name)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.get_topic(formatted_topic)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_topic with error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.get_topic(formatted_topic)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_topics' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#list_topics."

    it 'invokes list_topics without error' do
      # Create request parameters
      formatted_project = Google::Cloud::Pubsub::V1::PublisherClient.project_path("[PROJECT]")

      # Create expected grpc response
      next_page_token = ""
      topics_element = Google::Pubsub::V1::Topic.new
      topics = [topics_element]
      expected_response = Google::Pubsub::V1::ListTopicsResponse.new(next_page_token: next_page_token, topics: topics)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_topics, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.list_topics(formatted_project)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.topics.to_a, response.to_a)
      end
    end

    it 'invokes list_topics with error' do
      # Create request parameters
      formatted_project = Google::Cloud::Pubsub::V1::PublisherClient.project_path("[PROJECT]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_project, request.project)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_topics, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_topics(formatted_project)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'list_topic_subscriptions' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#list_topic_subscriptions."

    it 'invokes list_topic_subscriptions without error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Create expected grpc response
      next_page_token = ""
      subscriptions_element = "subscriptionsElement1698708147"
      subscriptions = [subscriptions_element]
      expected_response = Google::Pubsub::V1::ListTopicSubscriptionsResponse.new(next_page_token: next_page_token, subscriptions: subscriptions)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:list_topic_subscriptions, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.list_topic_subscriptions(formatted_topic)

        # Verify the response
        assert(response.instance_of?(Google::Gax::PagedEnumerable))
        assert_equal(expected_response, response.page.response)
        assert_nil(response.next_page)
        assert_equal(expected_response.subscriptions.to_a, response.to_a)
      end
    end

    it 'invokes list_topic_subscriptions with error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:list_topic_subscriptions, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.list_topic_subscriptions(formatted_topic)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'delete_topic' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#delete_topic."

    it 'invokes delete_topic without error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        nil
      end
      mock_stub = MockGrpcClientStub.new(:delete_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.delete_topic(formatted_topic)

        # Verify the response
        assert_nil(response)
      end
    end

    it 'invokes delete_topic with error' do
      # Create request parameters
      formatted_topic = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_topic, request.topic)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:delete_topic, mock_method)

      Google::Pubsub::V1::Publisher::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        err = assert_raises Google::Gax::GaxError do
          client.delete_topic(formatted_topic)
        end

        # Verify the GaxError wrapped the custom error that was raised.
        assert_match(custom_error.message, err.message)
      end
    end
  end

  describe 'set_iam_policy' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#set_iam_policy."

    it 'invokes set_iam_policy without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      policy = Google::Iam::V1::Policy.new

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = Google::Iam::V1::Policy.new(version: version, etag: etag)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(policy, request.policy)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.set_iam_policy(formatted_resource, policy)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes set_iam_policy with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      policy = Google::Iam::V1::Policy.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(policy, request.policy)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:set_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

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
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#get_iam_policy."

    it 'invokes get_iam_policy without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Create expected grpc response
      version = 351608024
      etag = "21"
      expected_response = Google::Iam::V1::Policy.new(version: version, etag: etag)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.get_iam_policy(formatted_resource)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes get_iam_policy with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:get_iam_policy, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

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
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Pubsub::V1::PublisherClient#test_iam_permissions."

    it 'invokes test_iam_permissions without error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      permissions = []

      # Create expected grpc response
      expected_response = Google::Iam::V1::TestIamPermissionsResponse.new

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

        # Call method
        response = client.test_iam_permissions(formatted_resource, permissions)

        # Verify the response
        assert_equal(expected_response, response)
      end
    end

    it 'invokes test_iam_permissions with error' do
      # Create request parameters
      formatted_resource = Google::Cloud::Pubsub::V1::PublisherClient.topic_path("[PROJECT]", "[TOPIC]")
      permissions = []

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_equal(formatted_resource, request.resource)
        assert_equal(permissions, request.permissions)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:test_iam_permissions, mock_method)

      Google::Iam::V1::IAMPolicy::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Pubsub::V1::PublisherClient.new

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