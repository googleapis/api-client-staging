# Copyright 2016 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from __future__ import absolute_import

import os

import nox


@nox.session
@nox.parametrize('python_version', ['2.7', '3.4', '3.5', '3.6'])
def unit_tests(session, python_version):
    """Run the unit test suite."""

    # Run unit tests against all supported versions of Python.
    session.interpreter = 'python{}'.format(python_version)

    # Install all test dependencies, then install all GAPIC packages in-place.
    session.install('mock', 'pytest', 'pytest-cov')

    # Install all GAPIC packages in-place.
    gapics = ['%s/' % i for i in os.listdir('.')
              if i.startswith('gapic-google-cloud')]
    session.install('-e', *gapics)

    # Run py.test against the unit tests.
    session.run(
        'py.test',
    )
