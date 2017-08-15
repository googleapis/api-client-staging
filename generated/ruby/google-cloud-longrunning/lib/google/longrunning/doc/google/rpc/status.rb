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
  module Rpc
    # The +Status+ type defines a logical error model that is suitable for different
    # programming environments, including REST APIs and RPC APIs. It is used by
    # [gRPC](https://github.com/grpc). The error model is designed to be:
    #
    # * Simple to use and understand for most users
    # * Flexible enough to meet unexpected needs
    #
    # = Overview
    #
    # The +Status+ message contains three pieces of data: error code, error message,
    # and error details. The error code should be an enum value of
    # {Google::Rpc::Code}, but it may accept additional error codes if needed.  The
    # error message should be a developer-facing English message that helps
    # developers *understand* and *resolve* the error. If a localized user-facing
    # error message is needed, put the localized message in the error details or
    # localize it in the client. The optional error details may contain arbitrary
    # information about the error. There is a predefined set of error detail types
    # in the package +google.rpc+ which can be used for common error conditions.
    #
    # = Language mapping
    #
    # The +Status+ message is the logical representation of the error model, but it
    # is not necessarily the actual wire format. When the +Status+ message is
    # exposed in different client libraries and different wire protocols, it can be
    # mapped differently. For example, it will likely be mapped to some exceptions
    # in Java, but more likely mapped to some error codes in C.
    #
    # = Other uses
    #
    # The error model and the +Status+ message can be used in a variety of
    # environments, either with or without APIs, to provide a
    # consistent developer experience across different environments.
    #
    # Example uses of this error model include:
    #
    # * Partial errors. If a service needs to return partial errors to the client,
    #   it may embed the +Status+ in the normal response to indicate the partial
    #   errors.
    #
    # * Workflow errors. A typical workflow has multiple steps. Each step may
    #   have a +Status+ message for error reporting purpose.
    #
    # * Batch operations. If a client uses batch request and batch response, the
    #   +Status+ message should be used directly inside batch response, one for
    #   each error sub-response.
    #
    # * Asynchronous operations. If an API call embeds asynchronous operation
    #   results in its response, the status of those operations should be
    #   represented directly using the +Status+ message.
    #
    # * Logging. If some API errors are stored in logs, the message +Status+ could
    #   be used directly after any stripping needed for security/privacy reasons.
    # @!attribute [rw] code
    #   @return [Integer]
    #     The status code, which should be an enum value of {Google::Rpc::Code}.
    # @!attribute [rw] message
    #   @return [String]
    #     A developer-facing error message, which should be in English. Any
    #     user-facing error message should be localized and sent in the
    #     {Google::Rpc::Status#details} field, or localized by the client.
    # @!attribute [rw] details
    #   @return [Array<Google::Protobuf::Any>]
    #     A list of messages that carry the error details.  There will be a
    #     common set of message types for APIs to use.
    class Status; end
  end
end