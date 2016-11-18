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
# https://github.com/google/googleapis/blob/master/google/datastore/v1/datastore.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.datastore.v1 Datastore API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.cloud.gapic.datastore.v1 import enums
from google.datastore.v1 import datastore_pb2
from google.datastore.v1 import entity_pb2
from google.datastore.v1 import query_pb2


class DatastoreApi(object):
    """
    Each RPC normalizes the partition IDs of the keys in its input entities,
    and always returns entities with keys with normalized partition IDs.
    This applies to all keys and entities, including those in values, except keys
    with both an empty path and an empty or unset partition ID. Normalization of
    input keys sets the project ID (if not already set) to the project ID from
    the request.
    """

    SERVICE_ADDRESS = 'datastore.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/datastore', )

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
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
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The codename of the calling service.
          app_version (string): The version of the calling service.

        Returns:
          A DatastoreApi object.
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
            pkg_resources.resource_string(
                __name__, 'datastore_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.datastore.v1.Datastore',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata})
        self.datastore_stub = config.create_stub(
            datastore_pb2.DatastoreStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._lookup = api_callable.create_api_call(
            self.datastore_stub.Lookup, settings=defaults['lookup'])
        self._run_query = api_callable.create_api_call(
            self.datastore_stub.RunQuery, settings=defaults['run_query'])
        self._begin_transaction = api_callable.create_api_call(
            self.datastore_stub.BeginTransaction,
            settings=defaults['begin_transaction'])
        self._commit = api_callable.create_api_call(
            self.datastore_stub.Commit, settings=defaults['commit'])
        self._rollback = api_callable.create_api_call(
            self.datastore_stub.Rollback, settings=defaults['rollback'])
        self._allocate_ids = api_callable.create_api_call(
            self.datastore_stub.AllocateIds, settings=defaults['allocate_ids'])

    # Service calls
    def lookup(self, project_id, read_options, keys, options=None):
        """
        Looks up entities by key.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> from google.datastore.v1 import datastore_pb2
          >>> from google.datastore.v1 import entity_pb2
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> read_options = datastore_pb2.ReadOptions()
          >>> keys = []
          >>> response = api.lookup(project_id, read_options, keys)

        Args:
          project_id (string): The ID of the project against which to make the request.
          read_options (:class:`google.datastore.v1.datastore_pb2.ReadOptions`): The options for this lookup request.
          keys (list[:class:`google.datastore.v1.entity_pb2.Key`]): Keys of entities to look up.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.datastore.v1.datastore_pb2.LookupResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.LookupRequest(
            project_id=project_id, read_options=read_options, keys=keys)
        return self._lookup(request, options)

    def run_query(self,
                  project_id,
                  partition_id,
                  read_options,
                  query=None,
                  gql_query=None,
                  options=None):
        """
        Queries for entities.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> from google.datastore.v1 import datastore_pb2
          >>> from google.datastore.v1 import entity_pb2
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> partition_id = entity_pb2.PartitionId()
          >>> read_options = datastore_pb2.ReadOptions()
          >>> response = api.run_query(project_id, partition_id, read_options)

        Args:
          project_id (string): The ID of the project against which to make the request.
          partition_id (:class:`google.datastore.v1.entity_pb2.PartitionId`): Entities are partitioned into subsets, identified by a partition ID.
            Queries are scoped to a single partition.
            This partition ID is normalized with the standard default context
            partition ID.
          read_options (:class:`google.datastore.v1.datastore_pb2.ReadOptions`): The options for this query.
          query (:class:`google.datastore.v1.query_pb2.Query`): The query to run.
          gql_query (:class:`google.datastore.v1.query_pb2.GqlQuery`): The GQL query to run.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.datastore.v1.datastore_pb2.RunQueryResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.RunQueryRequest(
            project_id=project_id,
            partition_id=partition_id,
            read_options=read_options,
            query=query,
            gql_query=gql_query)
        return self._run_query(request, options)

    def begin_transaction(self, project_id, options=None):
        """
        Begins a new transaction.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> response = api.begin_transaction(project_id)

        Args:
          project_id (string): The ID of the project against which to make the request.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.datastore.v1.datastore_pb2.BeginTransactionResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.BeginTransactionRequest(project_id=project_id)
        return self._begin_transaction(request, options)

    def commit(self,
               project_id,
               mode,
               mutations,
               transaction=None,
               options=None):
        """
        Commits a transaction, optionally creating, deleting or modifying some
        entities.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> from google.cloud.gapic.datastore.v1 import enums
          >>> from google.datastore.v1 import datastore_pb2
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> mode = enums.CommitRequest.Mode.MODE_UNSPECIFIED
          >>> mutations = []
          >>> response = api.commit(project_id, mode, mutations)

        Args:
          project_id (string): The ID of the project against which to make the request.
          mode (enum :class:`google.cloud.gapic.datastore.v1.enums.CommitRequest.Mode`): The type of commit to perform. Defaults to ``TRANSACTIONAL``.
          transaction (bytes): The identifier of the transaction associated with the commit. A
            transaction identifier is returned by a call to
            ``Datastore.BeginTransaction``.
          mutations (list[:class:`google.datastore.v1.datastore_pb2.Mutation`]): The mutations to perform.

            When mode is ``TRANSACTIONAL``, mutations affecting a single entity are
            applied in order. The following sequences of mutations affecting a single
            entity are not permitted in a single ``Commit`` request:

            - ``insert`` followed by ``insert``
            - ``update`` followed by ``insert``
            - ``upsert`` followed by ``insert``
            - ``delete`` followed by ``update``

            When mode is ``NON_TRANSACTIONAL``, no two mutations may affect a single
            entity.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.datastore.v1.datastore_pb2.CommitResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.CommitRequest(
            project_id=project_id,
            mode=mode,
            mutations=mutations,
            transaction=transaction)
        return self._commit(request, options)

    def rollback(self, project_id, transaction, options=None):
        """
        Rolls back a transaction.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> transaction = b''
          >>> response = api.rollback(project_id, transaction)

        Args:
          project_id (string): The ID of the project against which to make the request.
          transaction (bytes): The transaction identifier, returned by a call to
            ``Datastore.BeginTransaction``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.RollbackRequest(
            project_id=project_id, transaction=transaction)
        self._rollback(request, options)

    def allocate_ids(self, project_id, keys, options=None):
        """
        Allocates IDs for the given keys, which is useful for referencing an entity
        before it is inserted.

        Example:
          >>> from google.cloud.gapic.datastore.v1 import datastore_api
          >>> from google.datastore.v1 import entity_pb2
          >>> api = datastore_api.DatastoreApi()
          >>> project_id = ''
          >>> keys = []
          >>> response = api.allocate_ids(project_id, keys)

        Args:
          project_id (string): The ID of the project against which to make the request.
          keys (list[:class:`google.datastore.v1.entity_pb2.Key`]): A list of keys with incomplete key paths for which to allocate IDs.
            No key may be reserved/read-only.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.datastore.v1.datastore_pb2.AllocateIdsResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = datastore_pb2.AllocateIdsRequest(
            project_id=project_id, keys=keys)
        return self._allocate_ids(request, options)
