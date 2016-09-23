"""A setup module for the GAPIC IAM Admin library.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

from setuptools import setup, find_packages
import sys

install_requires = [
    'googleapis-common-protos>=1.3.4, <2.0.0',
    'google-gax>=0.14.1, <0.15.0',
    'grpc-google-iam-admin-v1>=0.10.0, <0.11.0',
    'grpc-google-iam-v1>=0.10.0, <0.11.0',
    'oauth2client>=1.4.11, <2.0.0',
]

setup(
    name='gapic-google-iam-admin-v1',
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
    description='GAPIC library for the Google IAM Admin API',
    include_package_data=True,
    long_description=open('README.rst').read(),
    install_requires=install_requires,
    license='Apache-2.0',
    packages=find_packages(),
    namespace_packages=['google', 'google.cloud', 'google.cloud.gapic', 'google.cloud.gapic.iam_admin', ],
    url='https://github.com/googleapis/googleapis'
)
