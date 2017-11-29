"""A setup module for the GAPIC Stackdriver Logging API library.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

from setuptools import setup, find_packages
import sys

install_requires = [
    'google-gax>=0.15.7, <0.16dev',
    'oauth2client>=2.0.0, <4.0dev',
    'proto-google-cloud-logging-v2[grpc]>=0.91.4, <0.92dev',
    'googleapis-common-protos[grpc]>=1.5.2, <2.0dev',
]

setup(
    name='gapic-google-cloud-logging-v2',
    version='0.91.4',
    author='Google Inc',
    author_email='googleapis-packages@google.com',
    classifiers=[
        'Intended Audience :: Developers',
        'Development Status :: 4 - Beta',
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
    description='GAPIC library for the Stackdriver Logging API',
    include_package_data=True,
    long_description=open('README.rst').read(),
    install_requires=install_requires,
    license='Apache-2.0',
    packages=find_packages(),
    namespace_packages=['google', 'google.cloud'],
    url='https://github.com/googleapis/googleapis')
