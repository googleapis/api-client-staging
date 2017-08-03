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

require "google/cloud/speech"
require "google/cloud/speech/v1beta1/speech_client"
require "google/cloud/speech/v1beta1/cloud_speech_services_pb"
require "google/longrunning/operations_pb"

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

class MockCredentialsClass < Google::Cloud::Speech::Credentials
  def initialize(method_name)
    @method_name = method_name
  end

  def updater_proc
    proc do
      raise "The method `#{@method_name}` was trying to make a grpc request. This should not " \
          "happen since the grpc layer is being mocked."
    end
  end
end

describe Google::Cloud::Speech::V1beta1::SpeechClient do

  describe 'sync_recognize' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Speech::V1beta1::SpeechClient#sync_recognize."

    it 'invokes sync_recognize without error' do
      # Create request parameters
      encoding = :FLAC
      sample_rate = 44100
      config = { encoding: encoding, sample_rate: sample_rate }
      uri = "gs://bucket_name/file_name.flac"
      audio = { uri: uri }

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Cloud::Speech::V1beta1::SyncRecognizeResponse)

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Cloud::Speech::V1beta1::SyncRecognizeRequest, request)
        assert_equal(Google::Gax::to_proto(config, Google::Cloud::Speech::V1beta1::RecognitionConfig), request.config)
        assert_equal(Google::Gax::to_proto(audio, Google::Cloud::Speech::V1beta1::RecognitionAudio), request.audio)
        expected_response
      end
      mock_stub = MockGrpcClientStub.new(:sync_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("sync_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          response = client.sync_recognize(config, audio)

          # Verify the response
          assert_equal(expected_response, response)
        end
      end
    end

    it 'invokes sync_recognize with error' do
      # Create request parameters
      encoding = :FLAC
      sample_rate = 44100
      config = { encoding: encoding, sample_rate: sample_rate }
      uri = "gs://bucket_name/file_name.flac"
      audio = { uri: uri }

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Cloud::Speech::V1beta1::SyncRecognizeRequest, request)
        assert_equal(Google::Gax::to_proto(config, Google::Cloud::Speech::V1beta1::RecognitionConfig), request.config)
        assert_equal(Google::Gax::to_proto(audio, Google::Cloud::Speech::V1beta1::RecognitionAudio), request.audio)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:sync_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("sync_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.sync_recognize(config, audio)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'async_recognize' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Speech::V1beta1::SpeechClient#async_recognize."

    it 'invokes async_recognize without error' do
      # Create request parameters
      encoding = :FLAC
      sample_rate = 44100
      config = { encoding: encoding, sample_rate: sample_rate }
      uri = "gs://bucket_name/file_name.flac"
      audio = { uri: uri }

      # Create expected grpc response
      expected_response = {}
      expected_response = Google::Gax::to_proto(expected_response, Google::Cloud::Speech::V1beta1::AsyncRecognizeResponse)
      result = Google::Protobuf::Any.new
      result.pack(expected_response)
      operation = Google::Longrunning::Operation.new(
        name: 'operations/async_recognize_test',
        done: true,
        response: result
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Cloud::Speech::V1beta1::AsyncRecognizeRequest, request)
        assert_equal(Google::Gax::to_proto(config, Google::Cloud::Speech::V1beta1::RecognitionConfig), request.config)
        assert_equal(Google::Gax::to_proto(audio, Google::Cloud::Speech::V1beta1::RecognitionAudio), request.audio)
        operation
      end
      mock_stub = MockGrpcClientStub.new(:async_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("async_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          response = client.async_recognize(config, audio)

          # Verify the response
          assert_equal(expected_response, response.response)
        end
      end
    end

    it 'invokes async_recognize and returns an operation error.' do
      # Create request parameters
      encoding = :FLAC
      sample_rate = 44100
      config = { encoding: encoding, sample_rate: sample_rate }
      uri = "gs://bucket_name/file_name.flac"
      audio = { uri: uri }

      # Create expected grpc response
      operation_error = Google::Rpc::Status.new(
        message: 'Operation error for Google::Cloud::Speech::V1beta1::SpeechClient#async_recognize.'
      )
      operation = Google::Longrunning::Operation.new(
        name: 'operations/async_recognize_test',
        done: true,
        error: operation_error
      )

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Cloud::Speech::V1beta1::AsyncRecognizeRequest, request)
        assert_equal(Google::Gax::to_proto(config, Google::Cloud::Speech::V1beta1::RecognitionConfig), request.config)
        assert_equal(Google::Gax::to_proto(audio, Google::Cloud::Speech::V1beta1::RecognitionAudio), request.audio)
        operation
      end
      mock_stub = MockGrpcClientStub.new(:async_recognize, mock_method)

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        client = Google::Cloud::Speech.new(version: :v1beta1)

        # Call method
        response = client.async_recognize(config, audio)

        # Verify the response
        assert(response.error?)
        assert_equal(operation_error, response.error)
      end
    end

    it 'invokes async_recognize with error' do
      # Create request parameters
      encoding = :FLAC
      sample_rate = 44100
      config = { encoding: encoding, sample_rate: sample_rate }
      uri = "gs://bucket_name/file_name.flac"
      audio = { uri: uri }

      # Mock Grpc layer
      mock_method = proc do |request|
        assert_instance_of(Google::Cloud::Speech::V1beta1::AsyncRecognizeRequest, request)
        assert_equal(Google::Gax::to_proto(config, Google::Cloud::Speech::V1beta1::RecognitionConfig), request.config)
        assert_equal(Google::Gax::to_proto(audio, Google::Cloud::Speech::V1beta1::RecognitionAudio), request.audio)
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:async_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("async_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.async_recognize(config, audio)
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end

  describe 'streaming_recognize' do
    custom_error = CustomTestError.new "Custom test error for Google::Cloud::Speech::V1beta1::SpeechClient#streaming_recognize."

    it 'invokes streaming_recognize without error' do
      # Create request parameters
      request = {}

      # Create expected grpc response
      result_index = 520358448
      expected_response = { result_index: result_index }
      expected_response = Google::Gax::to_proto(expected_response, Google::Cloud::Speech::V1beta1::StreamingRecognizeResponse)

      # Mock Grpc layer
      mock_method = proc do |requests|
        request = requests.first
        [expected_response]
      end
      mock_stub = MockGrpcClientStub.new(:streaming_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("streaming_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          response = client.streaming_recognize([request])

          # Verify the response
          assert_equal(1, response.count)
          assert_equal(expected_response, response.first)
        end
      end
    end

    it 'invokes streaming_recognize with error' do
      # Create request parameters
      request = {}

      # Mock Grpc layer
      mock_method = proc do |requests|
        raise custom_error
      end
      mock_stub = MockGrpcClientStub.new(:streaming_recognize, mock_method)

      # Mock auth layer
      mock_credentials = MockCredentialsClass.new("streaming_recognize")

      Google::Cloud::Speech::V1beta1::Speech::Stub.stub(:new, mock_stub) do
        Google::Cloud::Speech::Credentials.stub(:default, mock_credentials) do
          client = Google::Cloud::Speech.new(version: :v1beta1)

          # Call method
          err = assert_raises Google::Gax::GaxError do
            client.streaming_recognize([request])
          end

          # Verify the GaxError wrapped the custom error that was raised.
          assert_match(custom_error.message, err.message)
        end
      end
    end
  end
end