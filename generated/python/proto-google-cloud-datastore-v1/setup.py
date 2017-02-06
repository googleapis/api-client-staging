"""A setup module for the GRPC Google Cloud Datastore API service.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'oauth2client>=2.0.0, <4.0dev',
  'googleapis-common-protos>=1.5.0, <2.0dev',
]

extras_require = {
  'grpc': [
    'googleapis-common-protos[grpc]>=1.5.0, <2.0dev',
    'grpcio>=1.0.2, <2.0dev',
  ],
}

setuptools.setup(
  name='proto-google-cloud-datastore-v1',
  version='0.90.0',
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
  description='GRPC library for the Google Cloud Datastore API',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  extras_require=extras_require,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google.cloud.proto.datastore', 'google.cloud.proto', 'google.cloud', 'google'],
  url='https://github.com/googleapis/googleapis'
)
