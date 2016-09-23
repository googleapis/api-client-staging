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
"""Wrappers for protocol buffer enum types."""


class VersionFormat(object):
    """
    Available log entry formats. Log entries can be written to Cloud
    Logging in either format and can be exported in either format.
    Version 2 is the preferred format.

    Attributes:
      VERSION_FORMAT_UNSPECIFIED (int): An unspecified version format will default to V2.
      V2 (int): ``LogEntry`` version 2 format.
      V1 (int): ``LogEntry`` version 1 format.
    """
    VERSION_FORMAT_UNSPECIFIED = 0
    V2 = 1
    V1 = 2


class ValueType(object):
    """
    Value types that can be used as label values.

    Attributes:
      STRING (int): A variable-length string. This is the default.
      BOOL (int): Boolean; true or false.
      INT64 (int): A 64-bit signed integer.
    """
    STRING = 0
    BOOL = 1
    INT64 = 2


class LogSeverity(object):
    """
    The severity of the event described in a log entry.  These guideline severity
    levels are ordered, with numerically smaller levels treated as less severe
    than numerically larger levels. If the source of the log entries uses a
    different set of severity levels, the client should select the closest
    corresponding ``LogSeverity`` value. For example, Java's FINE, FINER, and
    FINEST levels might all map to ``LogSeverity.DEBUG``. If the original severity
    code must be preserved, it can be stored in the payload.

    Attributes:
      DEFAULT (int): The log entry has no assigned severity level.
      DEBUG (int): Debug or trace information.
      INFO (int): Routine information, such as ongoing status or performance.
      NOTICE (int): Normal but significant events, such as start up, shut down, or
        configuration.
      WARNING (int): Warning events might cause problems.
      ERROR (int): Error events are likely to cause problems.
      CRITICAL (int): Critical events cause more severe problems or brief outages.
      ALERT (int): A person must take an action immediately.
      EMERGENCY (int): One or more systems are unusable.
    """
    DEFAULT = 0
    DEBUG = 100
    INFO = 200
    NOTICE = 300
    WARNING = 400
    ERROR = 500
    CRITICAL = 600
    ALERT = 700
    EMERGENCY = 800


class NullValue(object):
    """
    ``NullValue`` is a singleton enumeration to represent the null value for the
    ``Value`` type union.

     The JSON representation for ``NullValue`` is JSON ``null``.

    Attributes:
      NULL_VALUE (int): Null value.
    """
    NULL_VALUE = 0
