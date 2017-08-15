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
  module Monitoring
    module V3
      # A single strongly-typed value.
      # @!attribute [rw] bool_value
      #   @return [true, false]
      #     A Boolean value: +true+ or +false+.
      # @!attribute [rw] int64_value
      #   @return [Integer]
      #     A 64-bit integer. Its range is approximately &plusmn;9.2x10<sup>18</sup>.
      # @!attribute [rw] double_value
      #   @return [Float]
      #     A 64-bit double-precision floating-point number. Its magnitude
      #     is approximately &plusmn;10<sup>&plusmn;300</sup> and it has 16
      #     significant digits of precision.
      # @!attribute [rw] string_value
      #   @return [String]
      #     A variable-length string value.
      # @!attribute [rw] distribution_value
      #   @return [Google::Api::Distribution]
      #     A distribution value.
      class TypedValue; end

      # A time interval extending just after a start time through an end time.
      # If the start time is the same as the end time, then the interval
      # represents a single point in time.
      # @!attribute [rw] end_time
      #   @return [Google::Protobuf::Timestamp]
      #     Required. The end of the time interval.
      # @!attribute [rw] start_time
      #   @return [Google::Protobuf::Timestamp]
      #     Optional. The beginning of the time interval.  The default value
      #     for the start time is the end time. The start time must not be
      #     later than the end time.
      class TimeInterval; end

      # Describes how to combine multiple time series to provide different views of
      # the data.  Aggregation consists of an alignment step on individual time
      # series (+per_series_aligner+) followed by an optional reduction of the data
      # across different time series (+cross_series_reducer+).  For more details, see
      # [Aggregation](https://cloud.google.com/monitoring/api/learn_more#aggregation).
      # @!attribute [rw] alignment_period
      #   @return [Google::Protobuf::Duration]
      #     The alignment period for per-{Google::Monitoring::V3::TimeSeries Time series}
      #     alignment. If present, +alignmentPeriod+ must be at least 60
      #     seconds.  After per-time series alignment, each time series will
      #     contain data points only on the period boundaries. If
      #     +perSeriesAligner+ is not specified or equals +ALIGN_NONE+, then
      #     this field is ignored. If +perSeriesAligner+ is specified and
      #     does not equal +ALIGN_NONE+, then this field must be defined;
      #     otherwise an error is returned.
      # @!attribute [rw] per_series_aligner
      #   @return [Google::Monitoring::V3::Aggregation::Aligner]
      #     The approach to be used to align individual time series. Not all
      #     alignment functions may be applied to all time series, depending
      #     on the metric type and value type of the original time
      #     series. Alignment may change the metric type or the value type of
      #     the time series.
      #
      #     Time series data must be aligned in order to perform cross-time
      #     series reduction. If +crossSeriesReducer+ is specified, then
      #     +perSeriesAligner+ must be specified and not equal +ALIGN_NONE+
      #     and +alignmentPeriod+ must be specified; otherwise, an error is
      #     returned.
      # @!attribute [rw] cross_series_reducer
      #   @return [Google::Monitoring::V3::Aggregation::Reducer]
      #     The approach to be used to combine time series. Not all reducer
      #     functions may be applied to all time series, depending on the
      #     metric type and the value type of the original time
      #     series. Reduction may change the metric type of value type of the
      #     time series.
      #
      #     Time series data must be aligned in order to perform cross-time
      #     series reduction. If +crossSeriesReducer+ is specified, then
      #     +perSeriesAligner+ must be specified and not equal +ALIGN_NONE+
      #     and +alignmentPeriod+ must be specified; otherwise, an error is
      #     returned.
      # @!attribute [rw] group_by_fields
      #   @return [Array<String>]
      #     The set of fields to preserve when +crossSeriesReducer+ is
      #     specified. The +groupByFields+ determine how the time series are
      #     partitioned into subsets prior to applying the aggregation
      #     function. Each subset contains time series that have the same
      #     value for each of the grouping fields. Each individual time
      #     series is a member of exactly one subset. The
      #     +crossSeriesReducer+ is applied to each subset of time series.
      #     It is not possible to reduce across different resource types, so
      #     this field implicitly contains +resource.type+.  Fields not
      #     specified in +groupByFields+ are aggregated away.  If
      #     +groupByFields+ is not specified and all the time series have
      #     the same resource type, then the time series are aggregated into
      #     a single output time series. If +crossSeriesReducer+ is not
      #     defined, this field is ignored.
      class Aggregation
        # The Aligner describes how to bring the data points in a single
        # time series into temporal alignment.
        module Aligner
          # No alignment. Raw data is returned. Not valid if cross-time
          # series reduction is requested. The value type of the result is
          # the same as the value type of the input.
          ALIGN_NONE = 0

          # Align and convert to delta metric type. This alignment is valid
          # for cumulative metrics and delta metrics. Aligning an existing
          # delta metric to a delta metric requires that the alignment
          # period be increased. The value type of the result is the same
          # as the value type of the input.
          ALIGN_DELTA = 1

          # Align and convert to a rate. This alignment is valid for
          # cumulative metrics and delta metrics with numeric values. The output is a
          # gauge metric with value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_RATE = 2

          # Align by interpolating between adjacent points around the
          # period boundary. This alignment is valid for gauge
          # metrics with numeric values. The value type of the result is the same
          # as the value type of the input.
          ALIGN_INTERPOLATE = 3

          # Align by shifting the oldest data point before the period
          # boundary to the boundary. This alignment is valid for gauge
          # metrics. The value type of the result is the same as the
          # value type of the input.
          ALIGN_NEXT_OLDER = 4

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the minimum of all data points in the
          # period. This alignment is valid for gauge and delta metrics with numeric
          # values. The value type of the result is the same as the value
          # type of the input.
          ALIGN_MIN = 10

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the maximum of all data points in the
          # period. This alignment is valid for gauge and delta metrics with numeric
          # values. The value type of the result is the same as the value
          # type of the input.
          ALIGN_MAX = 11

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the average or arithmetic mean of all
          # data points in the period. This alignment is valid for gauge and delta
          # metrics with numeric values. The value type of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_MEAN = 12

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the count of all data points in the
          # period. This alignment is valid for gauge and delta metrics with numeric
          # or Boolean values. The value type of the output is
          # {Google::Api::MetricDescriptor::ValueType::INT64 INT64}.
          ALIGN_COUNT = 13

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the sum of all data points in the
          # period. This alignment is valid for gauge and delta metrics with numeric
          # and distribution values. The value type of the output is the
          # same as the value type of the input.
          ALIGN_SUM = 14

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the standard deviation of all data
          # points in the period. This alignment is valid for gauge and delta metrics
          # with numeric values. The value type of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_STDDEV = 15

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the count of True-valued data points in the
          # period. This alignment is valid for gauge metrics with
          # Boolean values. The value type of the output is
          # {Google::Api::MetricDescriptor::ValueType::INT64 INT64}.
          ALIGN_COUNT_TRUE = 16

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the fraction of True-valued data points in the
          # period. This alignment is valid for gauge metrics with Boolean values.
          # The output value is in the range [0, 1] and has value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_FRACTION_TRUE = 17

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the 99th percentile of all data
          # points in the period. This alignment is valid for gauge and delta metrics
          # with distribution values. The output is a gauge metric with value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_PERCENTILE_99 = 18

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the 95th percentile of all data
          # points in the period. This alignment is valid for gauge and delta metrics
          # with distribution values. The output is a gauge metric with value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_PERCENTILE_95 = 19

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the 50th percentile of all data
          # points in the period. This alignment is valid for gauge and delta metrics
          # with distribution values. The output is a gauge metric with value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_PERCENTILE_50 = 20

          # Align time series via aggregation. The resulting data point in
          # the alignment period is the 5th percentile of all data
          # points in the period. This alignment is valid for gauge and delta metrics
          # with distribution values. The output is a gauge metric with value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          ALIGN_PERCENTILE_05 = 21
        end

        # A Reducer describes how to aggregate data points from multiple
        # time series into a single time series.
        module Reducer
          # No cross-time series reduction. The output of the aligner is
          # returned.
          REDUCE_NONE = 0

          # Reduce by computing the mean across time series for each
          # alignment period. This reducer is valid for delta and
          # gauge metrics with numeric or distribution values. The value type of the
          # output is {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          REDUCE_MEAN = 1

          # Reduce by computing the minimum across time series for each
          # alignment period. This reducer is valid for delta and
          # gauge metrics with numeric values. The value type of the output
          # is the same as the value type of the input.
          REDUCE_MIN = 2

          # Reduce by computing the maximum across time series for each
          # alignment period. This reducer is valid for delta and
          # gauge metrics with numeric values. The value type of the output
          # is the same as the value type of the input.
          REDUCE_MAX = 3

          # Reduce by computing the sum across time series for each
          # alignment period. This reducer is valid for delta and
          # gauge metrics with numeric and distribution values. The value type of
          # the output is the same as the value type of the input.
          REDUCE_SUM = 4

          # Reduce by computing the standard deviation across time series
          # for each alignment period. This reducer is valid for delta
          # and gauge metrics with numeric or distribution values. The value type of
          # the output is {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          REDUCE_STDDEV = 5

          # Reduce by computing the count of data points across time series
          # for each alignment period. This reducer is valid for delta
          # and gauge metrics of numeric, Boolean, distribution, and string value
          # type. The value type of the output is
          # {Google::Api::MetricDescriptor::ValueType::INT64 INT64}.
          REDUCE_COUNT = 6

          # Reduce by computing the count of True-valued data points across time
          # series for each alignment period. This reducer is valid for delta
          # and gauge metrics of Boolean value type. The value type of
          # the output is {Google::Api::MetricDescriptor::ValueType::INT64 INT64}.
          REDUCE_COUNT_TRUE = 7

          # Reduce by computing the fraction of True-valued data points across time
          # series for each alignment period. This reducer is valid for delta
          # and gauge metrics of Boolean value type. The output value is in the
          # range [0, 1] and has value type
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}.
          REDUCE_FRACTION_TRUE = 8

          # Reduce by computing 99th percentile of data points across time series
          # for each alignment period. This reducer is valid for gauge and delta
          # metrics of numeric and distribution type. The value of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}
          REDUCE_PERCENTILE_99 = 9

          # Reduce by computing 95th percentile of data points across time series
          # for each alignment period. This reducer is valid for gauge and delta
          # metrics of numeric and distribution type. The value of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}
          REDUCE_PERCENTILE_95 = 10

          # Reduce by computing 50th percentile of data points across time series
          # for each alignment period. This reducer is valid for gauge and delta
          # metrics of numeric and distribution type. The value of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}
          REDUCE_PERCENTILE_50 = 11

          # Reduce by computing 5th percentile of data points across time series
          # for each alignment period. This reducer is valid for gauge and delta
          # metrics of numeric and distribution type. The value of the output is
          # {Google::Api::MetricDescriptor::ValueType::DOUBLE DOUBLE}
          REDUCE_PERCENTILE_05 = 12
        end
      end
    end
  end
end