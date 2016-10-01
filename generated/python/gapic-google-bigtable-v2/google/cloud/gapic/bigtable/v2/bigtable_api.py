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
# https://github.com/google/googleapis/blob/master/google/bigtable/v2/bigtable.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.bigtable.v2 Bigtable API."""

import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.bigtable.v2 import bigtable_pb2
from google.bigtable.v2 import data_pb2


class BigtableApi(object):
    """Service for reading from and writing to existing Bigtable tables."""

    SERVICE_ADDRESS = 'bigtable.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _CODE_GEN_NAME_VERSION = 'gapic/0.1.0'

    _GAX_VERSION = pkg_resources.get_distribution('google-gax').version

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = (
        'https://www.googleapis.com/auth/bigtable.data',
        'https://www.googleapis.com/auth/bigtable.data.readonly',
        'https://www.googleapis.com/auth/cloud-bigtable.data',
        'https://www.googleapis.com/auth/cloud-bigtable.data.readonly',
        'https://www.googleapis.com/auth/cloud-platform',
        'https://www.googleapis.com/auth/cloud-platform.read-only', )

    _TABLE_PATH_TEMPLATE = path_template.PathTemplate(
        'projects/{project}/instances/{instance}/tables/{table}')

    @classmethod
    def table_path(cls, project, instance, table):
        """Returns a fully-qualified table resource name string."""
        return cls._TABLE_PATH_TEMPLATE.render({
            'project': project,
            'instance': instance,
            'table': table,
        })

    @classmethod
    def match_project_from_table_name(cls, table_name):
        """Parses the project from a table resource.

        Args:
          table_name (string): A fully-qualified path representing a table
            resource.

        Returns:
          A string representing the project.
        """
        return cls._TABLE_PATH_TEMPLATE.match(table_name).get('project')

    @classmethod
    def match_instance_from_table_name(cls, table_name):
        """Parses the instance from a table resource.

        Args:
          table_name (string): A fully-qualified path representing a table
            resource.

        Returns:
          A string representing the instance.
        """
        return cls._TABLE_PATH_TEMPLATE.match(table_name).get('instance')

    @classmethod
    def match_table_from_table_name(cls, table_name):
        """Parses the table from a table resource.

        Args:
          table_name (string): A fully-qualified path representing a table
            resource.

        Returns:
          A string representing the table.
        """
        return cls._TABLE_PATH_TEMPLATE.match(table_name).get('table')

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
          A BigtableApi object.
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
                __name__, 'bigtable_client_config.json').decode())
        defaults = api_callable.construct_settings(
            'google.bigtable.v2.Bigtable',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            kwargs={'metadata': metadata})
        self.bigtable_stub = config.create_stub(
            bigtable_pb2.BigtableStub,
            service_path,
            port,
            ssl_creds=ssl_creds,
            channel=channel,
            metadata_transformer=metadata_transformer,
            scopes=scopes)

        self._read_rows = api_callable.create_api_call(
            self.bigtable_stub.ReadRows, settings=defaults['read_rows'])
        self._sample_row_keys = api_callable.create_api_call(
            self.bigtable_stub.SampleRowKeys,
            settings=defaults['sample_row_keys'])
        self._mutate_row = api_callable.create_api_call(
            self.bigtable_stub.MutateRow, settings=defaults['mutate_row'])
        self._mutate_rows = api_callable.create_api_call(
            self.bigtable_stub.MutateRows, settings=defaults['mutate_rows'])
        self._check_and_mutate_row = api_callable.create_api_call(
            self.bigtable_stub.CheckAndMutateRow,
            settings=defaults['check_and_mutate_row'])
        self._read_modify_write_row = api_callable.create_api_call(
            self.bigtable_stub.ReadModifyWriteRow,
            settings=defaults['read_modify_write_row'])

    # Service calls
    def read_rows(self,
                  table_name,
                  rows=None,
                  filter_=None,
                  rows_limit=0,
                  options=None):
        """
        Streams back the contents of all requested rows, optionally
        applying the same Reader filter to each. Depending on their size,
        rows and cells may be broken up across multiple responses, but
        atomicity of each row will still be preserved. See the
        ReadRowsResponse documentation for details.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> for element in api.read_rows(table_name):
          >>>   # process element
          >>>   pass

        Args:
          table_name (string): The unique name of the table from which to read.
            Values are of the form
            ``projects/<project>/instances/<instance>/tables/<table>``.
          rows (:class:`google.bigtable.v2.data_pb2.RowSet`): The row keys and/or ranges to read. If not specified, reads from all rows.
          filter_ (:class:`google.bigtable.v2.data_pb2.RowFilter`): The filter to apply to the contents of the specified row(s). If unset,
            reads the entirety of each row.
          rows_limit (long): The read will terminate after committing to N rows' worth of results. The
            default (zero) is to return all results.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          iterator[:class:`google.bigtable.v2.bigtable_pb2.ReadRowsResponse`].

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if rows is None:
            rows = data_pb2.RowSet()
        if filter_ is None:
            filter_ = data_pb2.RowFilter()
        request = bigtable_pb2.ReadRowsRequest(
            table_name=table_name,
            rows=rows,
            filter=filter_,
            rows_limit=rows_limit)
        return self._read_rows(request, options)

    def sample_row_keys(self, table_name, options=None):
        """
        Returns a sample of row keys in the table. The returned row keys will
        delimit contiguous sections of the table of approximately equal size,
        which can be used to break up the data for distributed tasks like
        mapreduces.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> for element in api.sample_row_keys(table_name):
          >>>   # process element
          >>>   pass

        Args:
          table_name (string): The unique name of the table from which to sample row keys.
            Values are of the form
            ``projects/<project>/instances/<instance>/tables/<table>``.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          iterator[:class:`google.bigtable.v2.bigtable_pb2.SampleRowKeysResponse`].

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = bigtable_pb2.SampleRowKeysRequest(table_name=table_name)
        return self._sample_row_keys(request, options)

    def mutate_row(self, table_name, row_key, mutations, options=None):
        """
        Mutates a row atomically. Cells already present in the row are left
        unchanged unless explicitly changed by ``mutation``.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> from google.bigtable.v2 import data_pb2
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> row_key = ''
          >>> mutations = []
          >>> response = api.mutate_row(table_name, row_key, mutations)

        Args:
          table_name (string): The unique name of the table to which the mutation should be applied.
            Values are of the form
            ``projects/<project>/instances/<instance>/tables/<table>``.
          row_key (bytes): The key of the row to which the mutation should be applied.
          mutations (list[:class:`google.bigtable.v2.data_pb2.Mutation`]): Changes to be atomically applied to the specified row. Entries are applied
            in order, meaning that earlier mutations can be masked by later ones.
            Must contain at least one entry and at most 100000.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = bigtable_pb2.MutateRowRequest(
            table_name=table_name, row_key=row_key, mutations=mutations)
        self._mutate_row(request, options)

    def mutate_rows(self, table_name, entries, options=None):
        """
        Mutates multiple rows in a batch. Each individual row is mutated
        atomically as in MutateRow, but the entire batch is not executed
        atomically.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> from google.bigtable.v2 import bigtable_pb2
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> entries = []
          >>> for element in api.mutate_rows(table_name, entries):
          >>>   # process element
          >>>   pass

        Args:
          table_name (string): The unique name of the table to which the mutations should be applied.
          entries (list[:class:`google.bigtable.v2.bigtable_pb2.MutateRowsRequest.Entry`]): The row keys and corresponding mutations to be applied in bulk.
            Each entry is applied as an atomic mutation, but the entries may be
            applied in arbitrary order (even between entries for the same row).
            At least one entry must be specified, and in total the entries can
            contain at most 100000 mutations.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          iterator[:class:`google.bigtable.v2.bigtable_pb2.MutateRowsResponse`].

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = bigtable_pb2.MutateRowsRequest(
            table_name=table_name, entries=entries)
        return self._mutate_rows(request, options)

    def check_and_mutate_row(self,
                             table_name,
                             row_key,
                             predicate_filter=None,
                             true_mutations=None,
                             false_mutations=None,
                             options=None):
        """
        Mutates a row atomically based on the output of a predicate Reader filter.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> row_key = ''
          >>> response = api.check_and_mutate_row(table_name, row_key)

        Args:
          table_name (string): The unique name of the table to which the conditional mutation should be
            applied.
            Values are of the form
            ``projects/<project>/instances/<instance>/tables/<table>``.
          row_key (bytes): The key of the row to which the conditional mutation should be applied.
          predicate_filter (:class:`google.bigtable.v2.data_pb2.RowFilter`): The filter to be applied to the contents of the specified row. Depending
            on whether or not any results are yielded, either ``true_mutations`` or
            ``false_mutations`` will be executed. If unset, checks that the row contains
            any values at all.
          true_mutations (list[:class:`google.bigtable.v2.data_pb2.Mutation`]): Changes to be atomically applied to the specified row if ``predicate_filter``
            yields at least one cell when applied to ``row_key``. Entries are applied in
            order, meaning that earlier mutations can be masked by later ones.
            Must contain at least one entry if ``false_mutations`` is empty, and at most
            100000.
          false_mutations (list[:class:`google.bigtable.v2.data_pb2.Mutation`]): Changes to be atomically applied to the specified row if ``predicate_filter``
            does not yield any cells when applied to ``row_key``. Entries are applied in
            order, meaning that earlier mutations can be masked by later ones.
            Must contain at least one entry if ``true_mutations`` is empty, and at most
            100000.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.bigtable.v2.bigtable_pb2.CheckAndMutateRowResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        if predicate_filter is None:
            predicate_filter = data_pb2.RowFilter()
        if true_mutations is None:
            true_mutations = []
        if false_mutations is None:
            false_mutations = []
        request = bigtable_pb2.CheckAndMutateRowRequest(
            table_name=table_name,
            row_key=row_key,
            predicate_filter=predicate_filter,
            true_mutations=true_mutations,
            false_mutations=false_mutations)
        return self._check_and_mutate_row(request, options)

    def read_modify_write_row(self, table_name, row_key, rules, options=None):
        """
        Modifies a row atomically. The method reads the latest existing timestamp
        and value from the specified columns and writes a new entry based on
        pre-defined read/modify/write rules. The new value for the timestamp is the
        greater of the existing timestamp or the current server time. The method
        returns the new contents of all modified cells.

        Example:
          >>> from google.cloud.gapic.bigtable.v2 import bigtable_api
          >>> from google.bigtable.v2 import data_pb2
          >>> api = bigtable_api.BigtableApi()
          >>> table_name = api.table_path('[PROJECT]', '[INSTANCE]', '[TABLE]')
          >>> row_key = ''
          >>> rules = []
          >>> response = api.read_modify_write_row(table_name, row_key, rules)

        Args:
          table_name (string): The unique name of the table to which the read/modify/write rules should be
            applied.
            Values are of the form
            ``projects/<project>/instances/<instance>/tables/<table>``.
          row_key (bytes): The key of the row to which the read/modify/write rules should be applied.
          rules (list[:class:`google.bigtable.v2.data_pb2.ReadModifyWriteRule`]): Rules specifying how the specified row's contents are to be transformed
            into writes. Entries are applied in order, meaning that earlier rules will
            affect the results of later ones.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.bigtable.v2.bigtable_pb2.ReadModifyWriteRowResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        request = bigtable_pb2.ReadModifyWriteRowRequest(
            table_name=table_name, row_key=row_key, rules=rules)
        return self._read_modify_write_row(request, options)
