"""A setup module for the GRPC Stackdriver Error Reporting service.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'oauth2client>=2.0.0, <4.0.0dev',
  'grpcio>=1.0.0, <2.0.0dev',
  'googleapis-common-protos[grpc]>=1.3.5, <2.0.0dev'
]

setuptools.setup(
  name='grpc-google-cloud-error-reporting-v1beta1',
  version='0.13.0',
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
  description='GRPC library for the Stackdriver Error Reporting service',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google', 'google.devtools', 'google.devtools.clouderrorreporting', ],
  url='https://github.com/googleapis/googleapis'
)
