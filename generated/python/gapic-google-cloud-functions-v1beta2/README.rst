Python Client for Google Cloud Functions API (`Alpha`_)
==================================================================================================

`Google Cloud Functions API`_: Google Cloud Functions is a lightweight, event-based, asynchronous compute solution that allows you to create small, single-purpose functions that respond to cloud events without the need to manage a server or a runtime environment.

- `Client Library Documentation`_
- `Product Documentation`_

.. _Alpha: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
.. _Google Cloud Functions API: https://cloud.google.com/functions
.. _Client Library Documentation: https://googlecloudplatform.github.io/google-cloud-python/stable/functions-usage
.. _Product Documentation:  https://cloud.google.com/functions

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project.`_
2. `Enable the Google Cloud Functions API.`_
3. `Setup Authentication.`_

.. _Select or create a Cloud Platform project.: https://console.cloud.google.com/project
.. _Enable the Google Cloud Functions API.:  https://cloud.google.com/functions
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
    <your-env>/bin/pip install gapic-google-cloud-functions-v1beta2


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-functions-v1beta2

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Google Cloud Functions API
   API to see other available methods on the client.
-  Read the `Google Cloud Functions API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Google Cloud Functions API Product documentation:  https://cloud.google.com/functions
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst