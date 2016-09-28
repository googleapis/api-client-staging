# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Wrappers for protocol buffer enum types."""


class KeyType(object):
    """
    ``KeyType`` filters to selectively retrieve certain varieties
    of keys.

    Attributes:
      KEY_TYPE_UNSPECIFIED (int): Unspecified key type. The presence of this in the
        message will immediately result in an error.
      USER_MANAGED (int): User-managed keys (managed and rotated by the user).
      SYSTEM_MANAGED (int): System-managed keys (managed and rotated by Google).
    """
    KEY_TYPE_UNSPECIFIED = 0
    USER_MANAGED = 1
    SYSTEM_MANAGED = 2


class ServiceAccountKeyAlgorithm(object):
    """
    Supported key algorithms.

    Attributes:
      KEY_ALG_UNSPECIFIED (int): An unspecified key algorithm.
      KEY_ALG_RSA_1024 (int): 1k RSA Key.
      KEY_ALG_RSA_2048 (int): 2k RSA Key.
    """
    KEY_ALG_UNSPECIFIED = 0
    KEY_ALG_RSA_1024 = 1
    KEY_ALG_RSA_2048 = 2


class ServiceAccountPrivateKeyType(object):
    """
    Supported private key output formats.

    Attributes:
      TYPE_UNSPECIFIED (int): Unspecified. Equivalent to ``TYPE_GOOGLE_CREDENTIALS_FILE``.
      TYPE_PKCS12_FILE (int): PKCS12 format.
        The password for the PKCS12 file is ``notasecret``.
        For more information, see https://tools.ietf.org/html/rfc7292.
      TYPE_GOOGLE_CREDENTIALS_FILE (int): Google Credentials File format.
    """
    TYPE_UNSPECIFIED = 0
    TYPE_PKCS12_FILE = 1
    TYPE_GOOGLE_CREDENTIALS_FILE = 2


class ServiceAccountPublicKeyType(object):
    """
    Supported public key output formats.

    Attributes:
      TYPE_NONE (int): Unspecified. Returns nothing here.
      TYPE_X509_PEM_FILE (int): X509 PEM format.
      TYPE_RAW_PUBLIC_KEY (int): Raw public key.
    """
    TYPE_NONE = 0
    TYPE_X509_PEM_FILE = 1
    TYPE_RAW_PUBLIC_KEY = 2
