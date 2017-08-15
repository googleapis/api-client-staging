# Copyright 2017, Google Inc. All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are
# met:
#
#     * Redistributions of source code must retain the above copyright
# notice, this list of conditions and the following disclaimer.
#     * Redistributions in binary form must reproduce the above
# copyright notice, this list of conditions and the following disclaimer
# in the documentation and/or other materials provided with the
# distribution.
#     * Neither the name of Google Inc. nor the names of its
# contributors may be used to endorse or promote products derived from
# this software without specific prior written permission.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
# "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
# LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
# A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
# OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
# LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
# DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
# THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

module Google
  module Longrunning
    # This resource represents a long-running operation that is the result of a
    # network API call.
    # @!attribute [rw] name
    #   @return [String]
    #     The server-assigned name, which is only unique within the same service that
    #     originally returns it. If you use the default HTTP mapping, the
    #     +name+ should have the format of +operations/some/unique/name+.
    # @!attribute [rw] metadata
    #   @return [Google::Protobuf::Any]
    #     Service-specific metadata associated with the operation.  It typically
    #     contains progress information and common metadata such as create time.
    #     Some services might not provide such metadata.  Any method that returns a
    #     long-running operation should document the metadata type, if any.
    # @!attribute [rw] done
    #   @return [true, false]
    #     If the value is +false+, it means the operation is still in progress.
    #     If true, the operation is completed, and either +error+ or +response+ is
    #     available.
    # @!attribute [rw] error
    #   @return [Google::Rpc::Status]
    #     The error result of the operation in case of failure or cancellation.
    # @!attribute [rw] response
    #   @return [Google::Protobuf::Any]
    #     The normal response of the operation in case of success.  If the original
    #     method returns no data on success, such as +Delete+, the response is
    #     +google.protobuf.Empty+.  If the original method is standard
    #     +Get+/+Create+/+Update+, the response should be the resource.  For other
    #     methods, the response should have the type +XxxResponse+, where +Xxx+
    #     is the original method name.  For example, if the original method name
    #     is +TakeSnapshot()+, the inferred response type is
    #     +TakeSnapshotResponse+.
    class Operation; end

    # The request message for {Google::Longrunning::Operations::GetOperation Operations::GetOperation}.
    # @!attribute [rw] name
    #   @return [String]
    #     The name of the operation resource.
    class GetOperationRequest; end

    # The request message for {Google::Longrunning::Operations::ListOperations Operations::ListOperations}.
    # @!attribute [rw] name
    #   @return [String]
    #     The name of the operation collection.
    # @!attribute [rw] filter
    #   @return [String]
    #     The standard list filter.
    # @!attribute [rw] page_size
    #   @return [Integer]
    #     The standard list page size.
    # @!attribute [rw] page_token
    #   @return [String]
    #     The standard list page token.
    class ListOperationsRequest; end

    # The response message for {Google::Longrunning::Operations::ListOperations Operations::ListOperations}.
    # @!attribute [rw] operations
    #   @return [Array<Google::Longrunning::Operation>]
    #     A list of operations that matches the specified filter in the request.
    # @!attribute [rw] next_page_token
    #   @return [String]
    #     The standard List next-page token.
    class ListOperationsResponse; end

    # The request message for {Google::Longrunning::Operations::CancelOperation Operations::CancelOperation}.
    # @!attribute [rw] name
    #   @return [String]
    #     The name of the operation resource to be cancelled.
    class CancelOperationRequest; end

    # The request message for {Google::Longrunning::Operations::DeleteOperation Operations::DeleteOperation}.
    # @!attribute [rw] name
    #   @return [String]
    #     The name of the operation resource to be deleted.
    class DeleteOperationRequest; end
  end
end