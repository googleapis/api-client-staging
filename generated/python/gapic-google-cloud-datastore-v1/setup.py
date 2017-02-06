"""A setup module for the GAPIC Google Cloud Datastore API library.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

from setuptools import setup, find_packages
import sys

install_requires = [
    'googleapis-common-protos>=1.5.0, <2.0dev',
    'google-gax>=0.15.4, <0.16dev',
    'proto-google-cloud-datastore-v1[grpc]>=0.90.0, <0.91dev',
    'oauth2client>=2.0.0, <4.0dev',
]

setup(
    name='gapic-google-cloud-datastore-v1',
    version='0.15.0',
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
    description='GAPIC library for the Google Cloud Datastore API',
    include_package_data=True,
    long_description=open('README.rst').read(),
    install_requires=install_requires,
    license='Apache-2.0',
    packages=find_packages(),
    namespace_packages=[
        'google', 'google.cloud', 'google.cloud.gapic',
        'google.cloud.gapic.datastore'
    ],
    url='https://github.com/googleapis/googleapis')
