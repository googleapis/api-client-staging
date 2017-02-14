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


class LabelDescriptor(object):
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
    The severity of the event described in a log entry, expressed as one of the
    standard severity levels listed below.  For your reference, the levels are
    assigned the listed numeric values. The effect of using numeric values other
    than those listed is undefined.

    You can filter for log entries by severity.  For example, the following
    filter expression will match log entries with severities ``INFO``, ``NOTICE``,
    and ``WARNING``:

    ::

        severity > DEBUG AND severity <= WARNING

    If you are writing log entries, you should map other severity encodings to
    one of these standard levels. For example, you might map all of Java's FINE,
    FINER, and FINEST levels to ``LogSeverity.DEBUG``. You can preserve the
    original severity level in the log entry payload if you wish.

    Attributes:
      DEFAULT (int): (0) The log entry has no assigned severity level.
      DEBUG (int): (100) Debug or trace information.
      INFO (int): (200) Routine information, such as ongoing status or performance.
      NOTICE (int): (300) Normal but significant events, such as start up, shut down, or
        a configuration change.
      WARNING (int): (400) Warning events might cause problems.
      ERROR (int): (500) Error events are likely to cause problems.
      CRITICAL (int): (600) Critical events cause more severe problems or outages.
      ALERT (int): (700) A person must take an action immediately.
      EMERGENCY (int): (800) One or more systems are unusable.
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


class LogSink(object):
    class VersionFormat(object):
        """
        Available log entry formats. Log entries can be written to Stackdriver
        Logging in either format and can be exported in either format.
        Version 2 is the preferred format.

        Attributes:
          VERSION_FORMAT_UNSPECIFIED (int): An unspecified format version that will default to V2.
          V2 (int): ``LogEntry`` version 2 format.
          V1 (int): ``LogEntry`` version 1 format.
        """
        VERSION_FORMAT_UNSPECIFIED = 0
        V2 = 1
        V1 = 2


class LogMetric(object):
    class ApiVersion(object):
        """
        Stackdriver Logging API version.

        Attributes:
          V2 (int): Stackdriver Logging API v2.
          V1 (int): Stackdriver Logging API v1.
        """
        V2 = 0
        V1 = 1
