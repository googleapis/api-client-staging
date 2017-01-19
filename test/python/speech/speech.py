from google.cloud.gapic.speech.v1beta1 import enums
from google.cloud.gapic.speech.v1beta1 import speech_client
from google.cloud.proto.speech.v1beta1 import cloud_speech_pb2 as types


# upload audio.raw from this directory to Google Storage for your project
INPUT_URI = 'gs://gapic-speech-v1/audio.raw'


# set these to correspond to your audio sample
ENCODING=enums.RecognitionConfig.AudioEncoding.LINEAR16
SAMPLE_RATE=16000

def test_sync_recognize():
    api = speech_client.SpeechClient()
    config = types.RecognitionConfig(encoding=ENCODING, sample_rate=SAMPLE_RATE)
    audio = types.RecognitionAudio(uri=INPUT_URI)
    response = api.sync_recognize(config, audio)

    print response

def test_async_recognize():
    def callback(operation_future):
        print(operation_future.result())

    api = speech_client.SpeechClient()
    config = types.RecognitionConfig(encoding=ENCODING, sample_rate=SAMPLE_RATE)
    audio = types.RecognitionAudio(uri=INPUT_URI)
    response = api.async_recognize(config, audio)
    response.add_done_callback(callback)
    print("Metadata: \n%s\n" % response.metadata())

test_sync_recognize()
test_async_recognize()
