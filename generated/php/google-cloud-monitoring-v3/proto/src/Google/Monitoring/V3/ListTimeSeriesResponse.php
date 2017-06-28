<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/metric_service.proto

namespace Google\Monitoring\V3;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The `ListTimeSeries` response.
 *
 * Protobuf type <code>Google\Monitoring\V3\ListTimeSeriesResponse</code>
 */
class ListTimeSeriesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * One or more time series that match the filter included in the request.
     *
     * Generated from protobuf field <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     */
    private $time_series;
    /**
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     */
    private $next_page_token = '';

    public function __construct() {
        \GPBMetadata\Google\Monitoring\V3\MetricService::initOnce();
        parent::__construct();
    }

    /**
     * One or more time series that match the filter included in the request.
     *
     * Generated from protobuf field <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTimeSeries()
    {
        return $this->time_series;
    }

    /**
     * One or more time series that match the filter included in the request.
     *
     * Generated from protobuf field <code>repeated .google.monitoring.v3.TimeSeries time_series = 1;</code>
     * @param array|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setTimeSeries(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Monitoring\V3\TimeSeries::class);
        $this->time_series = $arr;
    }

    /**
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @param string $var
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;
    }

}

