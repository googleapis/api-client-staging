Python Client for Google Cloud Vision API (`Beta`_)
==================================================================================================

`Google Cloud Vision API`_: Integrates Google Vision features, including image labeling, face, logo, and landmark detection, optical character recognition (OCR), and detection of explicit content, into applications.

- `Client Library Documentation`_
- `Product Documentation`_

.. _Beta: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
.. _Google Cloud Vision API: https://cloud.google.com/vision
.. _Client Library Documentation: https://googlecloudplatform.github.io/google-cloud-python/stable/vision-usage
.. _Product Documentation:  https://cloud.google.com/vision

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project.`_
2. `Enable the Google Cloud Vision API.`_
3. `Setup Authentication.`_

.. _Select or create a Cloud Platform project.: https://console.cloud.google.com/project
.. _Enable the Google Cloud Vision API.:  https://cloud.google.com/vision
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
    <your-env>/bin/pip install gapic-google-cloud-vision-v1


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-vision-v1

Preview
~~~~~~~

ImageAnnotatorClient
^^^^^^^^^^^^^^^^^^^^^^

.. code:: py

  from google.cloud import vision_v1
  client = vision_v1.ImageAnnotatorClient()
  requests = []
  response = client.batch_annotate_images(requests)

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Google Cloud Vision API
   API to see other available methods on the client.
-  Read the `Google Cloud Vision API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Google Cloud Vision API Product documentation:  https://cloud.google.com/vision
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst