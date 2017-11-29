Python Client for Google Cloud Speech API (`Alpha`_)
==================================================================================================

`Google Cloud Speech API`_: Google Cloud Speech API.

- `Client Library Documentation`_
- `Product Documentation`_

.. _Alpha: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
.. _Google Cloud Speech API: https://cloud.google.com/speech
.. _Client Library Documentation: https://googlecloudplatform.github.io/google-cloud-python/stable/speech-usage
.. _Product Documentation:  https://cloud.google.com/speech

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project.`_
2. `Enable the Google Cloud Speech API.`_
3. `Setup Authentication.`_

.. _Select or create a Cloud Platform project.: https://console.cloud.google.com/project
.. _Enable the Google Cloud Speech API.:  https://cloud.google.com/speech
.. _Setup Authentication.: https://googlecloudplatform.github.io/google-cloud-python/stable/google-cloud-auth

Installation
~~~~~~~~~~~~

Install this library in a `virtualenv`_ using pip. `virtualenv`_ is a tool to
create isolated Python environments. The basic problem it addresses is one of
dependencies and versions, and indirectly permissions.

With `virtualenv`_, it's possible to install this library without needing system
install permissions, and without clashing with the installed system
dependencies.

.. _`virtualenv`: https://virtualenv.pypa.io/en/latest/


Mac/Linux
^^^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    source <your-env>/bin/activate
    <your-env>/bin/pip install gapic-google-cloud-speech-v1beta1


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-speech-v1beta1

Preview
~~~~~~~

SpeechClient
^^^^^^^^^^^^^^^^^^^^^^

.. code:: py

  from google.cloud import speech_v1beta1
  from google.cloud.speech_v1beta1 import enums
  client = speech_v1beta1.SpeechClient()
  encoding = enums.RecognitionConfig.AudioEncoding.FLAC
  sample_rate = 44100
  config = {'encoding': encoding, 'sample_rate': sample_rate}
  uri = 'gs://bucket_name/file_name.flac'
  audio = {'uri': uri}
  response = client.sync_recognize(config, audio)

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Google Cloud Speech API
   API to see other available methods on the client.
-  Read the `Google Cloud Speech API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Google Cloud Speech API Product documentation:  https://cloud.google.com/speech
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst