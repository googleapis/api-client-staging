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

require "google/cloud/dlp/v2beta1/dlp_service_client"

module Google
  module Cloud
    # rubocop:disable LineLength

    ##
    # # Ruby Client for DLP API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
    #
    # [DLP API][Product Documentation]: The Google Data Loss Prevention API provides methods for detection of privacy-sensitive fragments in text, images, and Google Cloud Platform storage repositories.
    # - [Product Documentation][]
    #
    # ## Quick Start
    # In order to use this library, you first need to go through the following steps:
    #
    # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
    # 2. [Enable the DLP API.](https://console.cloud.google.com/apis/api/dlp)
    # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
    #
    # ### Installation
    # ```
    # $ gem install google-cloud-dlp
    # ```
    #
    # ### Preview
    # #### DlpServiceClient
    # ```rb
    # require "google/cloud/dlp/v2beta1"
    #
    # dlp_service_client = Google::Cloud::Dlp::V2beta1.new
    # min_likelihood = :POSSIBLE
    # inspect_config = { min_likelihood: min_likelihood }
    # type = "text/plain"
    # value = "my phone number is 215-512-1212"
    # items_element = { type: type, value: value }
    # items = [items_element]
    # response = dlp_service_client.inspect_content(inspect_config, items)
    # ```
    #
    # ### Next Steps
    # - Read the [DLP API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
    # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
    #
    # [Product Documentation]: https://cloud.google.com/dlp
    #
    #
    module Dlp
      ##
      # # DLP API Contents
      #
      # | Class | Description |
      # | ----- | ----------- |
      # | [DlpServiceClient][] | The Google Data Loss Prevention API provides methods for detection of privacy-sensitive fragments in text, images, and Google Cloud Platform storage repositories. |
      # | [Data Types][] | Data types for Google::Cloud::Dlp::V2beta1 |
      #
      # [DlpServiceClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-dlp/latest/google/privacy/dlp/v2beta1/v2beta1/dlpserviceclient
      # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-dlp/latest/google/privacy/dlp/v2beta1/v2beta1/datatypes
      #
      module V2beta1
        # rubocop:enable LineLength

        ##
        # The DLP API is a service that allows clients
        # to detect the presence of Personally Identifiable Information (PII) and other
        # privacy-sensitive data in user-supplied, unstructured data streams, like text
        # blocks or images.
        # The service also includes methods for sensitive data redaction and
        # scheduling of data scans on Google Cloud Platform based data sets.
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
          Google::Cloud::Dlp::V2beta1::DlpServiceClient.new(*args, **kwargs)
        end
      end
    end
  end
end