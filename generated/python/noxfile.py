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


@nox.session(python=['3.5', '3.6', '3.7'])
def unit(session):
    """Run the unit test suite."""

    # Install all test dependencies, then install all GAPIC packages in-place.
    session.install('mock', 'pytest', 'pytest-cov')

    # Install all GAPIC and proto packages in-place.
    packages = []
    packages += sorted(['%s/[grpc]' % i for i in os.listdir('.')
                        if i.startswith('proto-google-cloud')])
    packages += sorted(['%s/' % i for i in os.listdir('.')
                        if i.startswith('gapic-google-cloud')
                        and not i.endswith('docs')])
    session.install(*packages)

    # Run py.test against the unit tests.
    session.run(
        'py.test',
    )
