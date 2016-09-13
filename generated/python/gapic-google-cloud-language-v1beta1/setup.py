"""A setup module for the GAX Language library.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

from setuptools import setup, find_packages
import sys

install_requires = [
    'googleapis-common-protos>=1.3.4, <2.0.0',
    'google-gax>=0.13.0, <0.14.0',
    # TODO (https://github.com/googleapis/packman/issues/119): need upper bound logic
    'grpc-google-cloud-language-v1beta1>=0.9.2',
    'oauth2client>=1.4.11, <2.0.0',
]

setup(
    name='gax-google-cloud-language-v1beta1',
    version='0.9.2',
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
    description='GAX library for the Google Language API',
    include_package_data=True,
    long_description=open('README.rst').read(),
    install_requires=install_requires,
    license='Apache-2.0',
    packages=find_packages(),
    namespace_packages=['google', 'google.cloud', 'google.cloud.gapic', 'google.cloud.gapic.language', ],
    url='https://github.com/googleapis/googleapis'
)
