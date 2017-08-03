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
  module Protobuf
    # +Struct+ represents a structured data value, consisting of fields
    # which map to dynamically typed values. In some languages, +Struct+
    # might be supported by a native representation. For example, in
    # scripting languages like JS a struct is represented as an
    # object. The details of that representation are described together
    # with the proto support for the language.
    #
    # The JSON representation for +Struct+ is JSON object.
    # @!attribute [rw] fields
    #   @return [Hash{String => Google::Protobuf::Value}]
    #     Unordered map of dynamically typed values.
    class Struct; end

    # +Value+ represents a dynamically typed value which can be either
    # null, a number, a string, a boolean, a recursive struct value, or a
    # list of values. A producer of value is expected to set one of that
    # variants, absence of any variant indicates an error.
    #
    # The JSON representation for +Value+ is JSON value.
    # @!attribute [rw] null_value
    #   @return [Google::Protobuf::NullValue]
    #     Represents a null value.
    # @!attribute [rw] number_value
    #   @return [Float]
    #     Represents a double value.
    # @!attribute [rw] string_value
    #   @return [String]
    #     Represents a string value.
    # @!attribute [rw] bool_value
    #   @return [true, false]
    #     Represents a boolean value.
    # @!attribute [rw] struct_value
    #   @return [Google::Protobuf::Struct]
    #     Represents a structured value.
    # @!attribute [rw] list_value
    #   @return [Google::Protobuf::ListValue]
    #     Represents a repeated +Value+.
    class Value; end

    # +ListValue+ is a wrapper around a repeated field of values.
    #
    # The JSON representation for +ListValue+ is JSON array.
    # @!attribute [rw] values
    #   @return [Array<Google::Protobuf::Value>]
    #     Repeated field of dynamically typed values.
    class ListValue; end

    # +NullValue+ is a singleton enumeration to represent the null value for the
    # +Value+ type union.
    #
    #  The JSON representation for +NullValue+ is JSON +null+.
    module NullValue
      # Null value.
      NULL_VALUE = 0
    end
  end
end