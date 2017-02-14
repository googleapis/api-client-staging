GAPIC library for the Stackdriver Monitoring API
================================================================================

gapic-google-cloud-monitoring-v3 uses google-gax_ (Google API extensions) to provide an
easy-to-use client library for the `Stackdriver Monitoring API`_ (v3) defined in the googleapis_ git repository


.. _`googleapis`: https://github.com/googleapis/googleapis/tree/master/google/monitoring/v3
.. _`google-gax`: https://github.com/googleapis/gax-python
.. _`Stackdriver Monitoring API`: https://developers.google.com/apis-explorer/?hl=en_US#p/monitoring/v3

Getting started
---------------

gapic-google-cloud-monitoring-v3 will allow you to connect to the
Stackdriver Monitoring API and access all its methods. In order to do this, you need
to set up authentication as well as install the library locally.


Setup Authentication
~~~~~~~~~~~~~~~~~~~~

To authenticate all your API calls, first install and setup the `Google Cloud SDK`_.
Once done, you can then run the following command in your terminal:

.. code-block:: console

    $ gcloud beta auth application-default login

or

.. code-block:: console

    $ gcloud auth login

Please see `gcloud beta auth application-default login`_ document for the difference between these commands.

.. _Google Cloud SDK: https://cloud.google.com/sdk/
.. _gcloud beta auth application-default login: https://cloud.google.com/sdk/gcloud/reference/beta/auth/application-default/login


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
~~~~~~~~~~

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    source <your-env>/bin/activate
    <your-env>/bin/pip install gapic-google-cloud-monitoring-v3


Windows
~~~~~~~

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-cloud-monitoring-v3


At this point you are all set to continue.
