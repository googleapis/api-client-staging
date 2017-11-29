Python Client for Stackdriver Logging API (`Beta`_)
==================================================================================================

`Stackdriver Logging API`_: The Stackdriver Logging API lets you write log entries and manage your logs, log sinks and logs-based metrics.

- `Client Library Documentation`_
- `Product Documentation`_

.. _Beta: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
.. _Stackdriver Logging API: https://cloud.google.com/logging
.. _Client Library Documentation: https://googlecloudplatform.github.io/google-cloud-python/stable/logging-usage
.. _Product Documentation:  https://cloud.google.com/logging

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project.`_
2. `Enable the Stackdriver Logging API.`_
3. `Setup Authentication.`_

.. _Select or create a Cloud Platform project.: https://console.cloud.google.com/project
.. _Enable the Stackdriver Logging API.:  https://cloud.google.com/logging
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
    <your-env>/bin/pip install gapic-google-cloud-logging-v2


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-logging-v2

Preview
~~~~~~~

LoggingServiceV2Client
^^^^^^^^^^^^^^^^^^^^^^

.. code:: py

  from google.cloud import logging_v2
  client = logging_v2.LoggingServiceV2Client()
  entries = []
  response = client.write_log_entries(entries)

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Stackdriver Logging API
   API to see other available methods on the client.
-  Read the `Stackdriver Logging API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Stackdriver Logging API Product documentation:  https://cloud.google.com/logging
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst