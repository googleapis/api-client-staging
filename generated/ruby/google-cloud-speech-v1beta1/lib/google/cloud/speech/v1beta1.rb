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

require "google/cloud/speech/v1beta1/speech_client"

module Google
  module Cloud
    # rubocop:disable LineLength

    ##
    # # Ruby Client for Google Cloud Speech API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-ruby#versioning))
    #
    # [Google Cloud Speech API][Product Documentation]: Google Cloud Speech API.
    # - [Product Documentation][]
    #
    # ## Quick Start
    # In order to use this library, you first need to go through the following steps:
    #
    # 1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
    # 2. [Enable the Google Cloud Speech API.](https://console.cloud.google.com/apis/api/speech)
    # 3. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud/master/guides/authentication)
    #
    # ### Installation
    # ```
    # $ gem install google-cloud-speech
    # ```
    #
    # ### Preview
    # #### SpeechClient
    # ```rb
    # require "google/cloud/speech/v1beta1"
    #
    # speech_client = Google::Cloud::Speech::V1beta1.new
    # language_code = "en-US"
    # sample_rate = 44100
    # encoding = :FLAC
    # config = {
    #   language_code: language_code,
    #   sample_rate: sample_rate,
    #   encoding: encoding
    # }
    # uri = "gs://gapic-toolkit/hello.flac"
    # audio = { uri: uri }
    # response = speech_client.sync_recognize(config, audio)
    # ```
    #
    # ### Next Steps
    # - Read the [Google Cloud Speech API Product documentation][Product Documentation] to learn more about the product and see How-to Guides.
    # - View this [repository's main README](https://github.com/GoogleCloudPlatform/google-cloud-ruby/blob/master/README.md) to see the full list of Cloud APIs that we cover.
    #
    # [Product Documentation]: https://cloud.google.com/speech
    #
    #
    module Speech
      ##
      # # Google Cloud Speech API Contents
      #
      # | Class | Description |
      # | ----- | ----------- |
      # | [SpeechClient][] | Google Cloud Speech API. |
      # | [Data Types][] | Data types for Google::Cloud::Speech::V1beta1 |
      #
      # [SpeechClient]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-speech/latest/google/cloud/speech/v1beta1/v1beta1/speechclient
      # [Data Types]: https://googlecloudplatform.github.io/google-cloud-ruby/#/docs/google-cloud-speech/latest/google/cloud/speech/v1beta1/v1beta1/datatypes
      #
      module V1beta1
        # rubocop:enable LineLength

        ##
        # Service that implements Google Cloud Speech API.
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
          Google::Cloud::Speech::V1beta1::SpeechClient.new(*args, **kwargs)
        end
      end
    end
  end
end