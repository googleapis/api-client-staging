# Copyright 2017, Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

module Google
  module Spanner
    module Admin
      module Database
        module V1
          # A Cloud Spanner database.
          # @!attribute [rw] name
          #   @return [String]
          #     Required. The name of the database. Values are of the form
          #     +projects/<project>/instances/<instance>/databases/<database>+,
          #     where +<database>+ is as specified in the +CREATE DATABASE+
          #     statement. This name can be passed to other API methods to
          #     identify the database.
          # @!attribute [rw] state
          #   @return [Google::Spanner::Admin::Database::V1::Database::State]
          #     Output only. The current database state.
          class Database
            # Indicates the current state of the database.
            module State
              # Not specified.
              STATE_UNSPECIFIED = 0

              # The database is still being created. Operations on the database may fail
              # with +FAILED_PRECONDITION+ in this state.
              CREATING = 1

              # The database is fully created and ready for use.
              READY = 2
            end
          end

          # The request for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::ListDatabases ListDatabases}.
          # @!attribute [rw] parent
          #   @return [String]
          #     Required. The instance whose databases should be listed.
          #     Values are of the form +projects/<project>/instances/<instance>+.
          # @!attribute [rw] page_size
          #   @return [Integer]
          #     Number of databases to be returned in the response. If 0 or less,
          #     defaults to the server's maximum allowed page size.
          # @!attribute [rw] page_token
          #   @return [String]
          #     If non-empty, +page_token+ should contain a
          #     {Google::Spanner::Admin::Database::V1::ListDatabasesResponse#next_page_token Next_page_token} from a
          #     previous {Google::Spanner::Admin::Database::V1::ListDatabasesResponse ListDatabasesResponse}.
          class ListDatabasesRequest; end

          # The response for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::ListDatabases ListDatabases}.
          # @!attribute [rw] databases
          #   @return [Array<Google::Spanner::Admin::Database::V1::Database>]
          #     Databases that matched the request.
          # @!attribute [rw] next_page_token
          #   @return [String]
          #     +next_page_token+ can be sent in a subsequent
          #     {Google::Spanner::Admin::Database::V1::DatabaseAdmin::ListDatabases ListDatabases} call to fetch more
          #     of the matching databases.
          class ListDatabasesResponse; end

          # The request for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::CreateDatabase CreateDatabase}.
          # @!attribute [rw] parent
          #   @return [String]
          #     Required. The name of the instance that will serve the new database.
          #     Values are of the form +projects/<project>/instances/<instance>+.
          # @!attribute [rw] create_statement
          #   @return [String]
          #     Required. A +CREATE DATABASE+ statement, which specifies the ID of the
          #     new database.  The database ID must conform to the regular expression
          #     +[a-z][a-z0-9_\-]*[a-z0-9]+ and be between 2 and 30 characters in length.
          # @!attribute [rw] extra_statements
          #   @return [Array<String>]
          #     An optional list of DDL statements to run inside the newly created
          #     database. Statements can create tables, indexes, etc. These
          #     statements execute atomically with the creation of the database:
          #     if there is an error in any statement, the database is not created.
          class CreateDatabaseRequest; end

          # Metadata type for the operation returned by
          # {Google::Spanner::Admin::Database::V1::DatabaseAdmin::CreateDatabase CreateDatabase}.
          # @!attribute [rw] database
          #   @return [String]
          #     The database being created.
          class CreateDatabaseMetadata; end

          # The request for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::GetDatabase GetDatabase}.
          # @!attribute [rw] name
          #   @return [String]
          #     Required. The name of the requested database. Values are of the form
          #     +projects/<project>/instances/<instance>/databases/<database>+.
          class GetDatabaseRequest; end

          # Enqueues the given DDL statements to be applied, in order but not
          # necessarily all at once, to the database schema at some point (or
          # points) in the future. The server checks that the statements
          # are executable (syntactically valid, name tables that exist, etc.)
          # before enqueueing them, but they may still fail upon
          # later execution (e.g., if a statement from another batch of
          # statements is applied first and it conflicts in some way, or if
          # there is some data-related problem like a +NULL+ value in a column to
          # which +NOT NULL+ would be added). If a statement fails, all
          # subsequent statements in the batch are automatically cancelled.
          #
          # Each batch of statements is assigned a name which can be used with
          # the {Google::Longrunning::Operations Operations} API to monitor
          # progress. See the
          # {Google::Spanner::Admin::Database::V1::UpdateDatabaseDdlRequest#operation_id Operation_id} field for more
          # details.
          # @!attribute [rw] database
          #   @return [String]
          #     Required. The database to update.
          # @!attribute [rw] statements
          #   @return [Array<String>]
          #     DDL statements to be applied to the database.
          # @!attribute [rw] operation_id
          #   @return [String]
          #     If empty, the new update request is assigned an
          #     automatically-generated operation ID. Otherwise, +operation_id+
          #     is used to construct the name of the resulting
          #     {Google::Longrunning::Operation Operation}.
          #
          #     Specifying an explicit operation ID simplifies determining
          #     whether the statements were executed in the event that the
          #     {Google::Spanner::Admin::Database::V1::DatabaseAdmin::UpdateDatabaseDdl UpdateDatabaseDdl} call is replayed,
          #     or the return value is otherwise lost: the {Google::Spanner::Admin::Database::V1::UpdateDatabaseDdlRequest#database Database} and
          #     +operation_id+ fields can be combined to form the
          #     {Google::Longrunning::Operation#name Name} of the resulting
          #     {Google::Longrunning::Operation Longrunning::Operation}: +<database>/operations/<operation_id>+.
          #
          #     +operation_id+ should be unique within the database, and must be
          #     a valid identifier: +[a-z][a-z0-9_]*+. Note that
          #     automatically-generated operation IDs always begin with an
          #     underscore. If the named operation already exists,
          #     {Google::Spanner::Admin::Database::V1::DatabaseAdmin::UpdateDatabaseDdl UpdateDatabaseDdl} returns
          #     +ALREADY_EXISTS+.
          class UpdateDatabaseDdlRequest; end

          # Metadata type for the operation returned by
          # {Google::Spanner::Admin::Database::V1::DatabaseAdmin::UpdateDatabaseDdl UpdateDatabaseDdl}.
          # @!attribute [rw] database
          #   @return [String]
          #     The database being modified.
          # @!attribute [rw] statements
          #   @return [Array<String>]
          #     For an update this list contains all the statements. For an
          #     individual statement, this list contains only that statement.
          # @!attribute [rw] commit_timestamps
          #   @return [Array<Google::Protobuf::Timestamp>]
          #     Reports the commit timestamps of all statements that have
          #     succeeded so far, where +commit_timestamps[i]+ is the commit
          #     timestamp for the statement +statements[i]+.
          class UpdateDatabaseDdlMetadata; end

          # The request for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::DropDatabase DropDatabase}.
          # @!attribute [rw] database
          #   @return [String]
          #     Required. The database to be dropped.
          class DropDatabaseRequest; end

          # The request for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::GetDatabaseDdl GetDatabaseDdl}.
          # @!attribute [rw] database
          #   @return [String]
          #     Required. The database whose schema we wish to get.
          class GetDatabaseDdlRequest; end

          # The response for {Google::Spanner::Admin::Database::V1::DatabaseAdmin::GetDatabaseDdl GetDatabaseDdl}.
          # @!attribute [rw] statements
          #   @return [Array<String>]
          #     A list of formatted DDL statements defining the schema of the database
          #     specified in the request.
          class GetDatabaseDdlResponse; end
        end
      end
    end
  end
end