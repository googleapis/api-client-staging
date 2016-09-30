from google.cloud.gapic.speech.v1beta1 import enums
from google.cloud.gapic.speech.v1beta1 import speech_api
from google.cloud.grpc.speech.v1beta1 import cloud_speech_pb2 as types

# point this at an audio sample for your project
INPUT_URI = 'gs://gapic-speech-v1/hello.flac'


# set these to correspond to your audio sample
ENCODING=enums.RecognitionConfig.AudioEncoding.FLAC
SAMPLE_RATE=44100

api = speech_api.SpeechApi()
config = types.RecognitionConfig(encoding=ENCODING, sample_rate=SAMPLE_RATE)
audio = types.RecognitionAudio(uri=INPUT_URI)
response = api.sync_recognize(config, audio)

print response
