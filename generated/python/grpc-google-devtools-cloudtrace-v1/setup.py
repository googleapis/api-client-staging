"""A setup module for the GRPC google-devtools-cloudtrace service.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'oauth2client>=1.4.11',
  'grpcio>=1.0.0',
  'googleapis-common-protos[grpc]>=1.3.2'
]

setuptools.setup(
  name='grpc-google-devtools-cloudtrace-v1',
  version='0.9.0',
  author='Google Inc',
  author_email='googleapis-packages@google.com',
  classifiers=[
    'Intended Audience :: Developers',
    'Development Status :: 3 - Alpha',
    'Intended Audience :: Developers',
    'License :: OSI Approved :: Apache Software License',
    'Programming Language :: Python',
    'Programming Language :: Python :: 2.7',
    'Programming Language :: Python :: Implementation :: CPython',
  ],
  description='GRPC library for the google-devtools-cloudtrace-v1 service',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google', 'google.devtools', 'google.devtools.cloudtrace', ],
  url='https://github.com/googleapis/googleapis'
)
