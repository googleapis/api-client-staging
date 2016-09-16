"""A setup module for the GAPIC Monitoring library.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

from setuptools import setup, find_packages
import sys

install_requires = [
    'googleapis-common-protos>=1.3.4, <2.0.0dev',
    'google-gax>=0.14.1, <0.15.0dev',
    # TODO (https://github.com/googleapis/packman/issues/119): need upper bound logic
    'grpc-google-monitoring-v3>=0.10.0',
    'oauth2client>=3.0.0, <4.0.0dev',
]

setup(
    name='gax-google-monitoring-v3',
    version='0.10.0',
    author='Google Inc',
    author_email='googleapis-packages@google.com',
    classifiers=[
        'Intended Audience :: Developers',
        'Development Status :: 3 - Alpha',
        'Intended Audience :: Developers',
        'License :: OSI Approved :: Apache Software License',
        'Programming Language :: Python',
        'Programming Language :: Python :: 2',
        'Programming Language :: Python :: 2.7',
        'Programming Language :: Python :: 3',
        'Programming Language :: Python :: 3.4',
        'Programming Language :: Python :: 3.5',
        'Programming Language :: Python :: Implementation :: CPython',
    ],
    description='GAPIC library for the Google Monitoring API',
    include_package_data=True,
    long_description=open('README.rst').read(),
    install_requires=install_requires,
    license='Apache-2.0',
    packages=find_packages(),
    namespace_packages=['google', 'google.cloud', 'google.cloud.gapic', 'google.cloud.gapic.monitoring', ],
    url='https://github.com/googleapis/googleapis'
)
