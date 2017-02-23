Stackdriver Logging API for Ruby
=================================================

Stackdriver Logging API uses [Google API extensions][google-gax] to provide an
easy-to-use client library for the [Stackdriver Logging API][] (v2) defined in the [googleapis][] git repository


[googleapis]: https://github.com/googleapis/googleapis/tree/master/google/logging/v2
[google-gax]: https://github.com/googleapis/gax-ruby
[Stackdriver Logging API]: https://developers.google.com/apis-explorer/#p/logging/v2/

Getting started
---------------

google-cloud-logging will allow you to connect to the [Stackdriver Logging API][] and access all its methods.

In order to achieve so, you need to set up authentication, as well as install the library locally.


Setup Authentication
--------------------

To authenticate all of your API calls, first install and setup the [Google Cloud SDK][].
Once done, you can then run the following command in your terminal:

    $ gcloud beta auth application-default login

or

    $ gcloud auth login

Please see the [gcloud beta auth application-default login][] to find documentation showing the difference between these commands.

[Google Cloud SDK]: https://cloud.google.com/sdk/
[gcloud beta auth application-default login]: https://cloud.google.com/sdk/gcloud/reference/beta/auth/application-default/login


Installation
-------------------

Install this library using gem:

    $ [sudo] gem install google-cloud-logging

At this point you are all set to continue.