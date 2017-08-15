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
  module Type
    # Represents a time of day. The date and time zone are either not significant
    # or are specified elsewhere. An API may chose to allow leap seconds. Related
    # types are {Google::Type::Date} and +google.protobuf.Timestamp+.
    # @!attribute [rw] hours
    #   @return [Integer]
    #     Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    #     to allow the value "24:00:00" for scenarios like business closing time.
    # @!attribute [rw] minutes
    #   @return [Integer]
    #     Minutes of hour of day. Must be from 0 to 59.
    # @!attribute [rw] seconds
    #   @return [Integer]
    #     Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    #     allow the value 60 if it allows leap-seconds.
    # @!attribute [rw] nanos
    #   @return [Integer]
    #     Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
    class TimeOfDay; end
  end
end