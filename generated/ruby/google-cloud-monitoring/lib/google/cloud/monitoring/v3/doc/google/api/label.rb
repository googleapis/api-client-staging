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
  module Api
    # A description of a label.
    # @!attribute [rw] key
    #   @return [String]
    #     The label key.
    # @!attribute [rw] value_type
    #   @return [Google::Api::LabelDescriptor::ValueType]
    #     The type of data that can be assigned to the label.
    # @!attribute [rw] description
    #   @return [String]
    #     A human-readable description for the label.
    class LabelDescriptor
      # Value types that can be used as label values.
      module ValueType
        # A variable-length string. This is the default.
        STRING = 0

        # Boolean; true or false.
        BOOL = 1

        # A 64-bit signed integer.
        INT64 = 2
      end
    end
  end
end