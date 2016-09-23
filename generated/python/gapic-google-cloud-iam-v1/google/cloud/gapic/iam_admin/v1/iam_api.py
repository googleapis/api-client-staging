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
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/iam/admin/v1/iam.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.iam.admin.v1 IAM API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.iam_admin.v1 import enums
from google.iam.admin.v1 import iam_pb2
from google.iam.v1 import iam_policy_pb2
from google.iam.v1 import policy_pb2

_PageDesc = google.gax.PageDescriptor


class IAMApi(object):
    """
    Creates and manages service account objects.

    Service account is an account that belongs to your project instead
    of to an individual end user. It is used to authenticate calls
    to a Google API.

    To create a service account, specify the ``project_id`` and ``account_id``
    for the account.  The ``account_id`` is unique within the project, and used
    to generate the service account email address and a stable
    ``unique_id``.

    All other methods can identify accounts using the format
    ``projects/{project}/serviceAccounts/{account}``.
    Using ``-`` as a wildcard for the project will infer the project from
    the account. The ``account`` value can be the ``email`` address or the
    ``unique_id`` of the service account.
    """

    SERVICE_ADDRESS = 'iam.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    _PAGE_DESCRIPTORS = {
        'list_service_accounts': _PageDesc('page_token', 'next_page_token',
                                           'accounts')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/cloud-platform',
                   'https://www.googleapis.com/auth/iam', )

    _PROJECT_PATH_TEMPLATE = path_template.PathTemplate('projects/{project}')
    _SERVICE_ACCOUNT_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/serviceAccounts/{service_account}')
    _KEY_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/serviceAccounts/{service_account}/keys/{key}')

    @classmethod
    def project_path(cls, project):
        """Returns a fully-qualified project resource name string."""
        return cls._PROJECT_PATH_TEMPLATE.render({'project': project, })

    @classmethod
    def service_account_path(cls, project, service_account):
        """Returns a fully-qualified service_account resource name string."""
        return cls._SERVICE_ACCOUNT_PATH_TEMPLATE.render({
            'project': project,
            'service_account': service_account,
        })

    @classmethod
    def key_path(cls, project, service_account, key):
        """Returns a fully-qualified key resource name string."""
        return cls._KEY_PATH_TEMPLATE.render({
            'project': project,
            'service_account': service_account,
            'key': key,
        })

    @classmethod
    def match_project_from_project_name(cls, project_name):
        """Parses the project from a project resource.

        Args:
          project_name (string): A fully-qualified path representing a project
            resource.

        Returns:
          A string representing the project.
        """
        return cls._PROJECT_PATH_TEMPLATE.match(project_name).get('project')

    @classmethod
    def match_project_from_service_account_name(cls, service_account_name):
        """Parses the project from a service_account resource.

        Args:
          service_account_name (string): A fully-qualified path representing a service_account
            resource.

        Returns:
          A string representing the project.
        """
        return cls._SERVICE_ACCOUNT_PATH_TEMPLATE.match(
            service_account_name).get('project')

    @classmethod
    def match_service_account_from_service_account_name(cls,
                                                        service_account_name):
        """Parses the service_account from a service_account resource.

        Args:
          service_account_name (string): A fully-qualified path representing a service_account
            resource.

        Returns:
          A string representing the service_account.
        """
        return cls._SERVICE_ACCOUNT_PATH_TEMPLATE.match(
            service_account_name).get('service_account')

    @classmethod
    def match_project_from_key_name(cls, key_name):
        """Parses the project from a key resource.

        Args:
          key_name (string): A fully-qualified path representing a key
            resource.

        Returns:
          A string representing the project.
        """
        return cls._KEY_PATH_TEMPLATE.match(key_name).get('project')

    @classmethod
    def match_service_account_from_key_name(cls, key_name):
        """Parses the service_account from a key resource.

        Args:
          key_name (string): A fully-qualified path representing a key
            resource.

        Returns:
          A string representing the service_account.
        """
        return cls._KEY_PATH_TEMPLATE.match(key_name).get('service_account')

    @classmethod
    def match_key_from_key_name(cls, key_name):
        """Parses the key from a key resource.

        Args:
          key_name (string): A fully-qualified path representing a key
            resource.

        Returns:
          A string representing the key.
        """
        return cls._KEY_PATH_TEMPLATE.match(key_name).get('key')

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 metadata_transformer=None,
                 ssl_creds=None,
                 scopes=None,
                 client_config=None,
                 app_name='gax',
                 app_version=_GAX_VERSION):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          ssl_creds (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          metadata_transformer (Callable[[], list]): A function that creates
             the metadata for requests.
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A IAMApi object.
        """
        if scopes is None:
            scopes = self._ALL_SCOPES
        if client_config is None:
            client_config = {}
        goog_api_client = '{}/{} {} gax/{} python/{}'.format(
            app_name, app_version, self._CODE_GEN_NAME_VERSION,
            self._GAX_VERSION, platform.python_version())
        metadata = [('x-goog-api-client', goog_api_client)]
        default_client_config = json.loads(
            pkg_resources.resource_string(__name__, 'iam_client_config.json')
            .decode())
        defaults = api_callable.construct_settings(
            'google.iam.admin.v1.IAM',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata},
            page_descriptors=self._PAGE_DESCRIPTORS)
        self.iam_stub = config.create_stub(
            iam_pb2.IAMStub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)

        self._list_service_accounts = api_callable.create_api_call(
            self.iam_stub.ListServiceAccounts,
            settings=defaults['list_service_accounts'])
        self._get_service_account = api_callable.create_api_call(
            self.iam_stub.GetServiceAccount,
            settings=defaults['get_service_account'])
        self._create_service_account = api_callable.create_api_call(
            self.iam_stub.CreateServiceAccount,
            settings=defaults['create_service_account'])
        self._update_service_account = api_callable.create_api_call(
            self.iam_stub.UpdateServiceAccount,
            settings=defaults['update_service_account'])
        self._delete_service_account = api_callable.create_api_call(
            self.iam_stub.DeleteServiceAccount,
            settings=defaults['delete_service_account'])
        self._list_service_account_keys = api_callable.create_api_call(
            self.iam_stub.ListServiceAccountKeys,
            settings=defaults['list_service_account_keys'])
        self._get_service_account_key = api_callable.create_api_call(
            self.iam_stub.GetServiceAccountKey,
            settings=defaults['get_service_account_key'])
        self._create_service_account_key = api_callable.create_api_call(
            self.iam_stub.CreateServiceAccountKey,
            settings=defaults['create_service_account_key'])
        self._delete_service_account_key = api_callable.create_api_call(
            self.iam_stub.DeleteServiceAccountKey,
            settings=defaults['delete_service_account_key'])
        self._sign_blob = api_callable.create_api_call(
            self.iam_stub.SignBlob, settings=defaults['sign_blob'])
        self._get_iam_policy = api_callable.create_api_call(
            self.iam_stub.GetIamPolicy, settings=defaults['get_iam_policy'])
        self._set_iam_policy = api_callable.create_api_call(
            self.iam_stub.SetIamPolicy, settings=defaults['set_iam_policy'])
        self._test_iam_permissions = api_callable.create_api_call(
            self.iam_stub.TestIamPermissions,
            settings=defaults['test_iam_permissions'])
        self._query_grantable_roles = api_callable.create_api_call(
            self.iam_stub.QueryGrantableRoles,
            settings=defaults['query_grantable_roles'])

    # Service calls
    def list_service_accounts(self, name, page_size=0, options=None):
        """
        Lists ``ServiceAccounts`` for a project.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> api = iam_api.IAMApi()
          >>> name = api.project_path('[PROJECT]')
          >>>
          >>> # Iterate over all results
          >>> for element in api.list_service_accounts(name):
          >>>   # process element
          >>>   pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in api.list_service_accounts(name, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>   for element in page:
          >>>     # process element
          >>>     pass

        Args:
          name (string): Required. The resource name of the project associated with the service
            accounts, such as ``projects/my-project-123``.
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.iam.admin.v1.iam_pb2.ServiceAccount` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.ListServiceAccountsRequest(
            name=name, page_size=page_size)
        return self._list_service_accounts(request, options)

    def get_service_account(self, name, options=None):
        """
        Gets a ``ServiceAccount``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> response = api.get_service_account(name)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.
            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ServiceAccount` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.GetServiceAccountRequest(name=name)
        return self._get_service_account(request, options)

    def create_service_account(self,
                               name,
                               account_id,
                               service_account=None,
                               options=None):
        """
        Creates a ``ServiceAccount``
        and returns it.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.project_path('[PROJECT]')
          >>> account_id = ''
          >>> response = api.create_service_account(name, account_id)

        Args:
          name (string): Required. The resource name of the project associated with the service
            accounts, such as ``projects/my-project-123``.
          account_id (string): Required. The account id that is used to generate the service account
            email address and a stable unique id. It is unique within a project,
            must be 6-30 characters long, and match the regular expression
            ```a-z <https://cloud.google.com[-a-z0-9]*[a-z0-9]>`_`` to comply with RFC1035.
          service_account (:class:`google.iam.admin.v1.iam_pb2.ServiceAccount`): The ``ServiceAccount`` resource to create.
            Currently, only the following values are user assignable:
            ``display_name`` .
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ServiceAccount` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if service_account is None:
            service_account = iam_pb2.ServiceAccount()
        request = iam_pb2.CreateServiceAccountRequest(
            name=name, account_id=account_id, service_account=service_account)
        return self._create_service_account(request, options)

    def update_service_account(self,
                               etag,
                               name='',
                               project_id='',
                               unique_id='',
                               email='',
                               display_name='',
                               oauth2_client_id='',
                               options=None):
        """
        Updates a ``ServiceAccount``.
        Currently, only the following fields are updatable:
        ``display_name`` .
        The ``etag`` is mandatory.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> etag = ''
          >>> response = api.update_service_account(etag)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.

            Requests using ``-`` as a wildcard for the project will infer the project
            from the ``account`` and the ``account`` value can be the ``email`` address or
            the ``unique_id`` of the service account.

            In responses the resource name will always be in the format
            ``projects/{project}/serviceAccounts/{email}``.
          project_id (string): @OutputOnly The id of the project that owns the service account.
          unique_id (string): @OutputOnly The unique and stable id of the service account.
          email (string): @OutputOnly The email address of the service account.
          display_name (string): Optional. A user-specified description of the service account.  Must be
            fewer than 100 UTF-8 bytes.
          etag (bytes): Used to perform a consistent read-modify-write.
          oauth2_client_id (string): @OutputOnly. The OAuth2 client id for the service account.
            This is used in conjunction with the OAuth2 clientconfig API to make
            three legged OAuth2 (3LO) flows to access the data of Google users.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ServiceAccount` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.ServiceAccount(
            etag=etag,
            name=name,
            project_id=project_id,
            unique_id=unique_id,
            email=email,
            display_name=display_name,
            oauth2_client_id=oauth2_client_id)
        return self._update_service_account(request, options)

    def delete_service_account(self, name, options=None):
        """
        Deletes a ``ServiceAccount``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> api.delete_service_account(name)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.
            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.DeleteServiceAccountRequest(name=name)
        self._delete_service_account(request, options)

    def list_service_account_keys(self, name, key_types=None, options=None):
        """
        Lists ``ServiceAccountKeys``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> response = api.list_service_account_keys(name)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.

            Using ``-`` as a wildcard for the project, will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          key_types (list[enum :class:`google.cloud.gapic.iam_admin.v1.enums.KeyType`]): Filters the types of keys the user wants to include in the list
            response. Duplicate key types are not allowed. If no key type
            is provided, all keys are returned.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ListServiceAccountKeysResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if key_types is None:
            key_types = []
        request = iam_pb2.ListServiceAccountKeysRequest(
            name=name, key_types=key_types)
        return self._list_service_account_keys(request, options)

    def get_service_account_key(self, name, public_key_type=None,
                                options=None):
        """
        Gets the ``ServiceAccountKey``
        by key id.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.key_path('[PROJECT]', '[SERVICE_ACCOUNT]', '[KEY]')
          >>> response = api.get_service_account_key(name)

        Args:
          name (string): The resource name of the service account key in the following format:
            ``projects/{project}/serviceAccounts/{account}/keys/{key}``.

            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          public_key_type (enum :class:`google.cloud.gapic.iam_admin.v1.enums.ServiceAccountPublicKeyType`): The output format of the public key requested.
            X509_PEM is the default output format.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ServiceAccountKey` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if public_key_type is None:
            public_key_type = enums.ServiceAccountPublicKeyType.TYPE_NONE
        request = iam_pb2.GetServiceAccountKeyRequest(
            name=name, public_key_type=public_key_type)
        return self._get_service_account_key(request, options)

    def create_service_account_key(self,
                                   name,
                                   private_key_type=None,
                                   key_algorithm=None,
                                   options=None):
        """
        Creates a ``ServiceAccountKey``
        and returns it.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> response = api.create_service_account_key(name)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.
            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          private_key_type (enum :class:`google.cloud.gapic.iam_admin.v1.enums.ServiceAccountPrivateKeyType`): The output format of the private key. ``GOOGLE_CREDENTIALS_FILE`` is the
            default output format.
          key_algorithm (enum :class:`google.cloud.gapic.iam_admin.v1.enums.ServiceAccountKeyAlgorithm`): Which type of key and algorithm to use for the key.
            The default is currently a 4K RSA key.  However this may change in the
            future.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.ServiceAccountKey` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if private_key_type is None:
            private_key_type = enums.ServiceAccountPrivateKeyType.TYPE_UNSPECIFIED
        if key_algorithm is None:
            key_algorithm = enums.ServiceAccountKeyAlgorithm.KEY_ALG_UNSPECIFIED
        request = iam_pb2.CreateServiceAccountKeyRequest(
            name=name,
            private_key_type=private_key_type,
            key_algorithm=key_algorithm)
        return self._create_service_account_key(request, options)

    def delete_service_account_key(self, name, options=None):
        """
        Deletes a ``ServiceAccountKey``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.key_path('[PROJECT]', '[SERVICE_ACCOUNT]', '[KEY]')
          >>> api.delete_service_account_key(name)

        Args:
          name (string): The resource name of the service account key in the following format:
            ``projects/{project}/serviceAccounts/{account}/keys/{key}``.
            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.DeleteServiceAccountKeyRequest(name=name)
        self._delete_service_account_key(request, options)

    def sign_blob(self, name, bytes_to_sign, options=None):
        """
        Signs a blob using a service account's system-managed private key.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> name = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> bytes_to_sign = ''
          >>> response = api.sign_blob(name, bytes_to_sign)

        Args:
          name (string): The resource name of the service account in the following format:
            ``projects/{project}/serviceAccounts/{account}``.
            Using ``-`` as a wildcard for the project will infer the project from
            the account. The ``account`` value can be the ``email`` address or the
            ``unique_id`` of the service account.
          bytes_to_sign (bytes): The bytes to sign.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.SignBlobResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.SignBlobRequest(
            name=name, bytes_to_sign=bytes_to_sign)
        return self._sign_blob(request, options)

    def get_iam_policy(self, resource, options=None):
        """
        Returns the IAM access control policy for a
        ``ServiceAccount``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> resource = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> response = api.get_iam_policy(resource)

        Args:
          resource (string): REQUIRED: The resource for which policy is being requested. Resource
            is usually specified as a path, such as, projects/{project}.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.GetIamPolicyRequest(resource=resource)
        return self._get_iam_policy(request, options)

    def set_iam_policy(self, resource, policy, options=None):
        """
        Sets the IAM access control policy for a
        ``ServiceAccount``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> from google.iam.v1 import policy_pb2
          >>> api = iam_api.IAMApi()
          >>> resource = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> policy = policy_pb2.Policy()
          >>> response = api.set_iam_policy(resource, policy)

        Args:
          resource (string): REQUIRED: The resource for which policy is being specified.
            Resource is usually specified as a path, such as,
            projects/{project}/zones/{zone}/disks/{disk}.
          policy (:class:`google.iam.v1.policy_pb2.Policy`): REQUIRED: The complete policy to be applied to the 'resource'. The size of
            the policy is limited to a few 10s of KB. An empty policy is in general a
            valid policy but certain services (like Projects) might reject them.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.policy_pb2.Policy` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.SetIamPolicyRequest(
            resource=resource, policy=policy)
        return self._set_iam_policy(request, options)

    def test_iam_permissions(self, resource, permissions, options=None):
        """
        Tests the specified permissions against the IAM access control policy
        for a ``ServiceAccount``.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> resource = api.service_account_path('[PROJECT]', '[SERVICE_ACCOUNT]')
          >>> permissions = []
          >>> response = api.test_iam_permissions(resource, permissions)

        Args:
          resource (string): REQUIRED: The resource for which policy detail is being requested.
            Resource is usually specified as a path, such as, projects/{project}.
          permissions (list[string]): The set of permissions to check for the 'resource'. Permissions with
            wildcards (such as '*' or 'storage.*') are not allowed.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.v1.iam_policy_pb2.TestIamPermissionsResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_policy_pb2.TestIamPermissionsRequest(
            resource=resource, permissions=permissions)
        return self._test_iam_permissions(request, options)

    def query_grantable_roles(self, full_resource_name, options=None):
        """
        Queries roles that can be granted on a particular resource.
        A role is grantable if it can be used as the role in a binding for a policy
        for that resource.

        Example:
          >>> from google.cloud.gapic.iam_admin.v1 import iam_api
          >>> api = iam_api.IAMApi()
          >>> full_resource_name = ''
          >>> response = api.query_grantable_roles(full_resource_name)

        Args:
          full_resource_name (string): Required. The full resource name to query from the list of grantable roles.

            The name follows the Google Cloud Platform resource format.
            For example, a Cloud Platform project with id ``my-project`` will be named
            ``//cloudresourcemanager.googleapis.com/projects/my-project``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.iam.admin.v1.iam_pb2.QueryGrantableRolesResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = iam_pb2.QueryGrantableRolesRequest(
            full_resource_name=full_resource_name)
        return self._query_grantable_roles(request, options)
