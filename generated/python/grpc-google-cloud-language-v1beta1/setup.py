"""A setup module for the GRPC google-cloud-language service.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'oauth2client>=1.4.11',
  'grpcio>=1.0rc1',
  'googleapis-common-protos>=1.1.0'
]

setuptools.setup(
  name='grpc-google-cloud-language-v1beta1',
  version='0.8.1',
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
  description='GRPC library for the google-cloud-language-v1beta1 service',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google', 'google.cloud', 'google.cloud.language', ],
  url='https://github.com/googleapis/googleapis'
)
