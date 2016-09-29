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
# https://github.com/googleapis/googleapis/blob/master/google/monitoring/v3/group_service.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"

module Google
  module Cloud
    module Monitoring
      module V3
        # The Group API lets you inspect and manage your
        # {groups}[https://cloud.google.comgoogle.monitoring.v3.Group].
        #
        # A group is a named filter that is used to identify
        # a collection of monitored resources. Groups are typically used to
        # mirror the physical and/or logical topology of the environment.
        # Because group membership is computed dynamically, monitored
        # resources that are started in the future are automatically placed
        # in matching groups. By using a group to name monitored resources in,
        # for example, an alert policy, the target of that alert policy is
        # updated automatically as monitored resources are added and removed
        # from the infrastructure.
        #
        # @!attribute [r] group_service_stub
        #   @return [Google::Monitoring::V3::GroupService::Stub]
        class GroupServiceApi
          attr_reader :group_service_stub

          # The default address of the service.
          SERVICE_ADDRESS = "monitoring.googleapis.com".freeze

          # The default port of the service.
          DEFAULT_SERVICE_PORT = 443

          CODE_GEN_NAME_VERSION = "gapic/0.1.0".freeze

          DEFAULT_TIMEOUT = 30

          PAGE_DESCRIPTORS = {
            "list_groups" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "group"),
            "list_group_members" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "members")
          }.freeze

          private_constant :PAGE_DESCRIPTORS

          # The scopes needed to make gRPC calls to all of the methods defined in
          # this service.
          ALL_SCOPES = [
          ].freeze

          PROJECT_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}"
          )

          private_constant :PROJECT_PATH_TEMPLATE

          GROUP_PATH_TEMPLATE = Google::Gax::PathTemplate.new(
            "projects/{project}/groups/{group}"
          )

          private_constant :GROUP_PATH_TEMPLATE

          # Returns a fully-qualified project resource name string.
          # @param project [String]
          # @return [String]
          def self.project_path project
            PROJECT_PATH_TEMPLATE.render(
              :"project" => project
            )
          end

          # Returns a fully-qualified group resource name string.
          # @param project [String]
          # @param group [String]
          # @return [String]
          def self.group_path project, group
            GROUP_PATH_TEMPLATE.render(
              :"project" => project,
              :"group" => group
            )
          end

          # Parses the project from a project resource.
          # @param project_name [String]
          # @return [String]
          def self.match_project_from_project_name project_name
            PROJECT_PATH_TEMPLATE.match(project_name)["project"]
          end

          # Parses the project from a group resource.
          # @param group_name [String]
          # @return [String]
          def self.match_project_from_group_name group_name
            GROUP_PATH_TEMPLATE.match(group_name)["project"]
          end

          # Parses the group from a group resource.
          # @param group_name [String]
          # @return [String]
          def self.match_group_from_group_name group_name
            GROUP_PATH_TEMPLATE.match(group_name)["group"]
          end

          # @param service_path [String]
          #   The domain name of the API remote host.
          # @param port [Integer]
          #   The port on which to connect to the remote host.
          # @param channel [Channel]
          #   A Channel object through which to make calls.
          # @param chan_creds [Grpc::ChannelCredentials]
          #   A ChannelCredentials for the setting up the RPC client.
          # @param client_config[Hash]
          #   A Hash for call options for each method. See
          #   Google::Gax#construct_settings for the structure of
          #   this data. Falls back to the default config if not specified
          #   or the specified config is missing data points.
          # @param timeout [Numeric]
          #   The default timeout, in seconds, for calls made through this client.
          # @param app_name [String]
          #   The codename of the calling service.
          # @param app_version [String]
          #   The version of the calling service.
          def initialize \
              service_path: SERVICE_ADDRESS,
              port: DEFAULT_SERVICE_PORT,
              channel: nil,
              chan_creds: nil,
              scopes: ALL_SCOPES,
              client_config: {},
              timeout: DEFAULT_TIMEOUT,
              app_name: "gax",
              app_version: Google::Gax::VERSION
            # These require statements are intentionally placed here to initialize
            # the gRPC module only when it's required.
            # See https://github.com/googleapis/toolkit/issues/446
            require "google/gax/grpc"
            require "google/monitoring/v3/group_service_services_pb"

            google_api_client = "#{app_name}/#{app_version} " \
              "#{CODE_GEN_NAME_VERSION} gax/#{Google::Gax::VERSION} " \
              "ruby/#{RUBY_VERSION}".freeze
            headers = { :"x-goog-api-client" => google_api_client }
            client_config_file = Pathname.new(__dir__).join(
              "group_service_client_config.json"
            )
            defaults = client_config_file.open do |f|
              Google::Gax.construct_settings(
                "google.monitoring.v3.GroupService",
                JSON.parse(f.read),
                client_config,
                Google::Gax::Grpc::STATUS_CODE_NAMES,
                timeout,
                page_descriptors: PAGE_DESCRIPTORS,
                errors: Google::Gax::Grpc::API_ERRORS,
                kwargs: headers
              )
            end
            @group_service_stub = Google::Gax::Grpc.create_stub(
              service_path,
              port,
              chan_creds: chan_creds,
              channel: channel,
              scopes: scopes,
              &Google::Monitoring::V3::GroupService::Stub.method(:new)
            )

            @list_groups = Google::Gax.create_api_call(
              @group_service_stub.method(:list_groups),
              defaults["list_groups"]
            )
            @get_group = Google::Gax.create_api_call(
              @group_service_stub.method(:get_group),
              defaults["get_group"]
            )
            @create_group = Google::Gax.create_api_call(
              @group_service_stub.method(:create_group),
              defaults["create_group"]
            )
            @update_group = Google::Gax.create_api_call(
              @group_service_stub.method(:update_group),
              defaults["update_group"]
            )
            @delete_group = Google::Gax.create_api_call(
              @group_service_stub.method(:delete_group),
              defaults["delete_group"]
            )
            @list_group_members = Google::Gax.create_api_call(
              @group_service_stub.method(:list_group_members),
              defaults["list_group_members"]
            )
          end

          # Service calls

          # Lists the existing groups.
          #
          # @param name [String]
          #   The project whose groups are to be listed. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param children_of_group [String]
          #   A group name: +"projects/{project_id_or_number}/groups/{group_id}"+.
          #   Returns groups whose +parentName+ field contains the group
          #   name.  If no groups have this parent, the results are empty.
          # @param ancestors_of_group [String]
          #   A group name: +"projects/{project_id_or_number}/groups/{group_id}"+.
          #   Returns groups that are ancestors of the specified group.
          #   The groups are returned in order, starting with the immediate parent and
          #   ending with the most distant ancestor.  If the specified group has no
          #   immediate parent, the results are empty.
          # @param descendants_of_group [String]
          #   A group name: +"projects/{project_id_or_number}/groups/{group_id}"+.
          #   Returns the descendants of the specified group.  This is a superset of
          #   the results returned by the +childrenOfGroup+ filter, and includes
          #   children-of-children, and so forth.
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Monitoring::V3::Group>]
          #   An enumerable of Google::Monitoring::V3::Group instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   formatted_name = GroupServiceApi.project_path("[PROJECT]")
          #
          #   # Iterate over all results.
          #   group_service_api.list_groups(formatted_name).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   group_service_api.list_groups(formatted_name).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_groups \
              name,
              children_of_group: nil,
              ancestors_of_group: nil,
              descendants_of_group: nil,
              page_size: nil,
              options: nil
            req = Google::Monitoring::V3::ListGroupsRequest.new(
              name: name
            )
            req.children_of_group = children_of_group unless children_of_group.nil?
            req.ancestors_of_group = ancestors_of_group unless ancestors_of_group.nil?
            req.descendants_of_group = descendants_of_group unless descendants_of_group.nil?
            req.page_size = page_size unless page_size.nil?
            @list_groups.call(req, options)
          end

          # Gets a single group.
          #
          # @param name [String]
          #   The group to retrieve. The format is
          #   +"projects/{project_id_or_number}/groups/{group_id}"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Monitoring::V3::Group]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   formatted_name = GroupServiceApi.group_path("[PROJECT]", "[GROUP]")
          #   response = group_service_api.get_group(formatted_name)

          def get_group \
              name,
              options: nil
            req = Google::Monitoring::V3::GetGroupRequest.new(
              name: name
            )
            @get_group.call(req, options)
          end

          # Creates a new group.
          #
          # @param name [String]
          #   The project in which to create the group. The format is
          #   +"projects/{project_id_or_number}"+.
          # @param group [Google::Monitoring::V3::Group]
          #   A group definition. It is an error to define the +name+ field because
          #   the system assigns the name.
          # @param validate_only [true, false]
          #   If true, validate this request but do not create the group.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Monitoring::V3::Group]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   Group = Google::Monitoring::V3::Group
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   formatted_name = GroupServiceApi.project_path("[PROJECT]")
          #   group = Group.new
          #   response = group_service_api.create_group(formatted_name, group)

          def create_group \
              name,
              group,
              validate_only: nil,
              options: nil
            req = Google::Monitoring::V3::CreateGroupRequest.new(
              name: name,
              group: group
            )
            req.validate_only = validate_only unless validate_only.nil?
            @create_group.call(req, options)
          end

          # Updates an existing group.
          # You can change any group attributes except +name+.
          #
          # @param group [Google::Monitoring::V3::Group]
          #   The new definition of the group.  All fields of the existing group,
          #   excepting +name+, are replaced with the corresponding fields of this group.
          # @param validate_only [true, false]
          #   If true, validate this request but do not update the existing group.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Monitoring::V3::Group]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   Group = Google::Monitoring::V3::Group
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   group = Group.new
          #   response = group_service_api.update_group(group)

          def update_group \
              group,
              validate_only: nil,
              options: nil
            req = Google::Monitoring::V3::UpdateGroupRequest.new(
              group: group
            )
            req.validate_only = validate_only unless validate_only.nil?
            @update_group.call(req, options)
          end

          # Deletes an existing group.
          #
          # @param name [String]
          #   The group to delete. The format is
          #   +"projects/{project_id_or_number}/groups/{group_id}"+.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   formatted_name = GroupServiceApi.group_path("[PROJECT]", "[GROUP]")
          #   group_service_api.delete_group(formatted_name)

          def delete_group \
              name,
              options: nil
            req = Google::Monitoring::V3::DeleteGroupRequest.new(
              name: name
            )
            @delete_group.call(req, options)
          end

          # Lists the monitored resources that are members of a group.
          #
          # @param name [String]
          #   The group whose members are listed. The format is
          #   +"projects/{project_id_or_number}/groups/{group_id}"+.
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param filter [String]
          #   An optional {list filter}[https://cloud.google.com/monitoring/api/learn_more#filtering] describing
          #   the members to be returned.  The filter may reference the type, labels, and
          #   metadata of monitored resources that comprise the group.
          #   For example, to return only resources representing Compute Engine VM
          #   instances, use this filter:
          #
          #       resource.type = "gce_instance"
          # @param interval [Google::Monitoring::V3::TimeInterval]
          #   An optional time interval for which results should be returned. Only
          #   members that were part of the group during the specified interval are
          #   included in the response.  If no interval is provided then the group
          #   membership over the last minute is returned.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Api::MonitoredResource>]
          #   An enumerable of Google::Api::MonitoredResource instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/cloud/monitoring/v3/group_service_api"
          #
          #   GroupServiceApi = Google::Cloud::Monitoring::V3::GroupServiceApi
          #
          #   group_service_api = GroupServiceApi.new
          #   formatted_name = GroupServiceApi.group_path("[PROJECT]", "[GROUP]")
          #
          #   # Iterate over all results.
          #   group_service_api.list_group_members(formatted_name).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   group_service_api.list_group_members(formatted_name).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_group_members \
              name,
              page_size: nil,
              filter: nil,
              interval: nil,
              options: nil
            req = Google::Monitoring::V3::ListGroupMembersRequest.new(
              name: name
            )
            req.page_size = page_size unless page_size.nil?
            req.filter = filter unless filter.nil?
            req.interval = interval unless interval.nil?
            @list_group_members.call(req, options)
          end
        end
      end
    end
  end
end
