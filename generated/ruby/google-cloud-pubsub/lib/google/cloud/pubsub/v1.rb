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

require "google/cloud/pubsub/v1/publisher_client"
require "google/cloud/pubsub/v1/subscriber_client"

module Google
  module Cloud
    # rubocop:disable LineLength

    ##
    # # Ruby Client for Google Cloud Pub/Sub API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
    #
    # [Google Cloud Pub/Sub API][Product Documentation]: Provides reliable, many-to-many, asynchronous messaging between applications.
    #
    # - [Product Documentation][]
    #
    # ## Quick Start
    # In order to use this library, you first need to go through the following steps:
    #
    # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
    # 2. [Enable the Google Cloud Pub/Sub API.](https://console.cloud.google.com/apis/api/pubsub)
    # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
    #
    # ### Installation
    # ```
    # $ gem install google-cloud-pubsub
    # ```
    #
    # ### Preview
    # #### PublisherClient
    # ```rb
    # require "google/cloud/pubsub/v1"
    #
    # publisher_client = Google::Cloud::Pubsub::V1::Publisher.new
    # formatted_project = Google::Cloud::Pubsub::V1::PublisherClient.project_path(project_id)
    #
    # # Iterate over all results.
    # publisher_client.list_topics(formatted_project).each do |element|
    #   # Process element.
    # end
    #
    # # Or iterate over results one page at a time.
    # publisher_client.list_topics(formatted_project).each_page do |page|
    #   # Process each page at a time.
    #   page.each do |element|
    #     # Process element.
    #   end
    # end
    # ```
    #
    # ### Next Steps
    # - Read the [Google Cloud Pub/Sub API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
    # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
    #
    # [Product Documentation]: https://cloud.google.com/pubsub
    #
    #
    module Pubsub
      ##
      # # Google Cloud Pub/Sub API Contents
      #
      # | Class | Description |
      # | ----- | ----------- |
      # | [PublisherClient][] | Provides reliable, many-to-many, asynchronous messaging between applications.
 |
      # | [SubscriberClient][] | Provides reliable, many-to-many, asynchronous messaging between applications.
 |
      # | [Data Types][] | Data types for Google::Cloud::Pubsub::V1 |
      #
      # [PublisherClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-pubsub/latest/google/pubsub/v1/v1/publisherclient
      # [SubscriberClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-pubsub/latest/google/pubsub/v1/v1/subscriberclient
      # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-pubsub/latest/google/pubsub/v1/v1/datatypes
      #
      module V1
        # rubocop:enable LineLength

        module Publisher
          ##
          # The service that an application uses to manipulate topics, and to send
          # messages to a topic.
          #
          # @param service_path [String]
          #   The domain name of the API remote host.
          # @param port [Integer]
          #   The port on which to connect to the remote host.
          # @param credentials
          #   [Google::Gax::Credentials, String, Hash, GRPC::Core::Channel, GRPC::Core::ChannelCredentials, Proc]
          #   Provides the means for authenticating requests made by the client. This parameter can
          #   be many types.
          #   A `Google::Gax::Credentials` uses a the properties of its represented keyfile for
          #   authenticating requests made by this client.
          #   A `String` will be treated as the path to the keyfile to be used for the construction of
          #   credentials for this client.
          #   A `Hash` will be treated as the contents of a keyfile to be used for the construction of
          #   credentials for this client.
          #   A `GRPC::Core::Channel` will be used to make calls through.
          #   A `GRPC::Core::ChannelCredentials` for the setting up the RPC client. The channel credentials
          #   should already be composed with a `GRPC::Core::CallCredentials` object.
          #   A `Proc` will be used as an updater_proc for the Grpc channel. The proc transforms the
          #   metadata for requests, generally, to give OAuth credentials.
          # @param scopes [Array<String>]
          #   The OAuth scopes for this service. This parameter is ignored if
          #   an updater_proc is supplied.
          # @param client_config[Hash]
          #   A Hash for call options for each method. See
          #   Google::Gax#construct_settings for the structure of
          #   this data. Falls back to the default config if not specified
          #   or the specified config is missing data points.
          # @param timeout [Numeric]
          #   The default timeout, in seconds, for calls made through this client.
          def self.new(*args, **kwargs)
            Google::Cloud::Pubsub::V1::PublisherClient.new(*args, **kwargs)
          end
        end

        module Subscriber
          ##
          # The service that an application uses to manipulate subscriptions and to
          # consume messages from a subscription via the +Pull+ method.
          #
          # @param service_path [String]
          #   The domain name of the API remote host.
          # @param port [Integer]
          #   The port on which to connect to the remote host.
          # @param credentials
          #   [Google::Gax::Credentials, String, Hash, GRPC::Core::Channel, GRPC::Core::ChannelCredentials, Proc]
          #   Provides the means for authenticating requests made by the client. This parameter can
          #   be many types.
          #   A `Google::Gax::Credentials` uses a the properties of its represented keyfile for
          #   authenticating requests made by this client.
          #   A `String` will be treated as the path to the keyfile to be used for the construction of
          #   credentials for this client.
          #   A `Hash` will be treated as the contents of a keyfile to be used for the construction of
          #   credentials for this client.
          #   A `GRPC::Core::Channel` will be used to make calls through.
          #   A `GRPC::Core::ChannelCredentials` for the setting up the RPC client. The channel credentials
          #   should already be composed with a `GRPC::Core::CallCredentials` object.
          #   A `Proc` will be used as an updater_proc for the Grpc channel. The proc transforms the
          #   metadata for requests, generally, to give OAuth credentials.
          # @param scopes [Array<String>]
          #   The OAuth scopes for this service. This parameter is ignored if
          #   an updater_proc is supplied.
          # @param client_config[Hash]
          #   A Hash for call options for each method. See
          #   Google::Gax#construct_settings for the structure of
          #   this data. Falls back to the default config if not specified
          #   or the specified config is missing data points.
          # @param timeout [Numeric]
          #   The default timeout, in seconds, for calls made through this client.
          def self.new(*args, **kwargs)
            Google::Cloud::Pubsub::V1::SubscriberClient.new(*args, **kwargs)
          end
        end
      end
    end
  end
end