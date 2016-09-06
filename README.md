Staging repository for generated client libraries
=================================================

Introduction
------------

This repository is for staging and testing generated client libraries. The
client libraries in this repository are expected to update frequently, and
should NOT be relied upon directly. For more information about Google's
Cloud APIs, see https://cloud.google.com/apis/


Contributing
------------

The majority of code in this repository is automatically generated, and should
not be manually edited. Contributions to non-generated parts of the repository
are welcome and encouraged.

See the [CONTRIBUTING][] documentation for more information on how to get started.

[CONTRIBUTING]: https://github.com/googleapis/client-library-staging/blob/master/CONTRIBUTING.md


Repository Structure
--------------------

The repository structure is as follows:

- /                   Staging tools and configurations
- /generated/         Generated client libraries
- /generated/tests/   Generated tests
- /tests/             Handwritten tests


License
-------

BSD - See [LICENSE][] for more information.

[LICENSE]: https://github.com/googleapis/client-library-staging/blob/master/LICENSE
