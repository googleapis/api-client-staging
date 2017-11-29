Python Client for Google Cloud Pub/Sub API (`Alpha`_)
==================================================================================================

`Google Cloud Pub/Sub API`_: Provides reliable, many-to-many, asynchronous messaging between applications.


- `Client Library Documentation`_
- `Product Documentation`_

.. _Alpha: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
.. _Google Cloud Pub/Sub API: https://cloud.google.com/pubsub
.. _Client Library Documentation: https://googlecloudplatform.github.io/google-cloud-python/stable/pubsub-usage
.. _Product Documentation:  https://cloud.google.com/pubsub

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project.`_
2. `Enable the Google Cloud Pub/Sub API.`_
3. `Setup Authentication.`_

.. _Select or create a Cloud Platform project.: https://console.cloud.google.com/project
.. _Enable the Google Cloud Pub/Sub API.:  https://cloud.google.com/pubsub
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
    <your-env>/bin/pip install gapic-google-cloud-pubsub-v1


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-pubsub-v1

Preview
~~~~~~~

PublisherClient
^^^^^^^^^^^^^^^^^^^^^^

.. code:: py

  from google.cloud import pubsub_v1
  from google.gax import CallOptions, INITIAL_PAGE
  client = pubsub_v1.PublisherClient()
  project = client.project_path('[PROJECT]')

  # Iterate over all results
  for element in client.list_topics(project):
      # process element
      pass

  # Or iterate over results one page at a time
  for page in client.list_topics(project, options=CallOptions(page_token=INITIAL_PAGE)):
      for element in page:
          # process element
          pass

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Google Cloud Pub/Sub API
   API to see other available methods on the client.
-  Read the `Google Cloud Pub/Sub API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Google Cloud Pub/Sub API Product documentation:  https://cloud.google.com/pubsub
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst