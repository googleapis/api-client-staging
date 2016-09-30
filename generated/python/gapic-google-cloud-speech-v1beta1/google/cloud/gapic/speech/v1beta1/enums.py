# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Wrappers for protocol buffer enum types."""


class RecognitionConfig(object):
    class AudioEncoding(object):
        """
        Audio encoding of the data sent in the audio message. All encodings support
        only 1 channel (mono) audio. Only ``FLAC`` includes a header that describes
        the bytes of audio that follow the header. The other encodings are raw
        audio bytes with no header.

        For best results, the audio source should be captured and transmitted using
        a lossless encoding (``FLAC`` or ``LINEAR16``). Recognition accuracy may be
        reduced if lossy codecs (such as AMR, AMR_WB and MULAW) are used to capture
        or transmit the audio, particularly if background noise is present.

        Attributes:
          ENCODING_UNSPECIFIED (int): Not specified. Will return result ``google.rpc.Code.INVALID_ARGUMENT``.
          LINEAR16 (int): Uncompressed 16-bit signed little-endian samples (Linear PCM).
            This is the only encoding that may be used by ``AsyncRecognize``.
          FLAC (int): This is the recommended encoding for ``SyncRecognize`` and
            ``StreamingRecognize`` because it uses lossless compression; therefore
            recognition accuracy is not compromised by a lossy codec.
            The stream FLAC (Free Lossless Audio Codec) encoding is specified at:
            http://flac.sourceforge.net/documentation.html.
            16-bit and 24-bit samples are supported.
            Not all fields in STREAMINFO are supported.
          MULAW (int): 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
          AMR (int): Adaptive Multi-Rate Narrowband codec. ``sample_rate`` must be 8000 Hz.
          AMR_WB (int): Adaptive Multi-Rate Wideband codec. ``sample_rate`` must be 16000 Hz.
        """
        ENCODING_UNSPECIFIED = 0
        LINEAR16 = 1
        FLAC = 2
        MULAW = 3
        AMR = 4
        AMR_WB = 5


class StreamingRecognizeResponse(object):
    class EndpointerType(object):
        """
        Indicates the type of endpointer event.

        Attributes:
          ENDPOINTER_EVENT_UNSPECIFIED (int): No endpointer event specified.
          START_OF_SPEECH (int): Speech has been detected in the audio stream.
          END_OF_SPEECH (int): Speech has ceased to be detected in the audio stream.
          END_OF_AUDIO (int): The end of the audio stream has been reached. and it is being processed.
          END_OF_UTTERANCE (int): This event is only sent when ``single_utterance`` is ``true``. It indicates
            that the server has detected the end of the user's speech utterance and
            expects no additional speech. Therefore, the server will not process
            additional audio. The client should stop sending additional audio data.
        """
        ENDPOINTER_EVENT_UNSPECIFIED = 0
        START_OF_SPEECH = 1
        END_OF_SPEECH = 2
        END_OF_AUDIO = 3
        END_OF_UTTERANCE = 4
