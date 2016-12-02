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


class Timestamp(object):
    """
    A Timestamp represents a point in time independent of any time zone
    or calendar, represented as seconds and fractions of seconds at
    nanosecond resolution in UTC Epoch time. It is encoded using the
    Proleptic Gregorian Calendar which extends the Gregorian calendar
    backwards to year one. It is encoded assuming all minutes are 60
    seconds long, i.e. leap seconds are \"smeared\" so that no leap second
    table is needed for interpretation. Range is from
    0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
    By restricting to that range, we ensure that we can convert to
    and from  RFC 3339 date strings.
    See `https://www.ietf.org/rfc/rfc3339.txt <https://www.ietf.org/rfc/rfc3339.txt>`_.

    Example 1: Compute Timestamp from POSIX ``time()``.

    ::

        Timestamp timestamp;
        timestamp.set_seconds(time(NULL));
        timestamp.set_nanos(0);

    Example 2: Compute Timestamp from POSIX ``gettimeofday()``.

    ::

        struct timeval tv;
        gettimeofday(&tv, NULL);

        Timestamp timestamp;
        timestamp.set_seconds(tv.tv_sec);
        timestamp.set_nanos(tv.tv_usec * 1000);

    Example 3: Compute Timestamp from Win32 ``GetSystemTimeAsFileTime()``.

    ::

        FILETIME ft;
        GetSystemTimeAsFileTime(&ft);
        UINT64 ticks = (((UINT64)ft.dwHighDateTime) << 32) | ft.dwLowDateTime;

        // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
        // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
        Timestamp timestamp;
        timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
        timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));

    Example 4: Compute Timestamp from Java ``System.currentTimeMillis()``.

    ::

        long millis = System.currentTimeMillis();

        Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
            .setNanos((int) ((millis % 1000) * 1000000)).build();


    Example 5: Compute Timestamp from current time in Python.

    ::

        now = time.time()
        seconds = int(now)
        nanos = int((now - seconds) * 10**9)
        timestamp = Timestamp(seconds=seconds, nanos=nanos)

    Attributes:
      seconds (long): Represents seconds of UTC time since Unix epoch
        1970-01-01T00:00:00Z. Must be from from 0001-01-01T00:00:00Z to
        9999-12-31T23:59:59Z inclusive.
      nanos (int): Non-negative fractions of a second at nanosecond resolution. Negative
        second values with fractions must still have non-negative nanos values
        that count forward in time. Must be from 0 to 999,999,999
        inclusive.

    """
    pass
