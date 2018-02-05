<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta2/dlp.proto

namespace Google\Cloud\Dlp\V2beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Result of the reidentifiability analysis. Note that these results are an
 * estimation, not exact values.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskDetails.KMapEstimationResult</code>
 */
class AnalyzeDataSourceRiskDetails_KMapEstimationResult extends \Google\Protobuf\Internal\Message
{
    /**
     * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
     * doesn't correspond to any such interval, the associated frequency is
     * zero. For example, the following records:
     *   {min_anonymity: 1, max_anonymity: 1, frequency: 17}
     *   {min_anonymity: 2, max_anonymity: 3, frequency: 42}
     *   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
     * mean that there are no record with an estimated anonymity of 4, 5, or
     * larger than 10.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskDetails.KMapEstimationResult.KMapEstimationHistogramBucket k_map_estimation_histogram = 1;</code>
     */
    private $k_map_estimation_histogram;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta2\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
     * doesn't correspond to any such interval, the associated frequency is
     * zero. For example, the following records:
     *   {min_anonymity: 1, max_anonymity: 1, frequency: 17}
     *   {min_anonymity: 2, max_anonymity: 3, frequency: 42}
     *   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
     * mean that there are no record with an estimated anonymity of 4, 5, or
     * larger than 10.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskDetails.KMapEstimationResult.KMapEstimationHistogramBucket k_map_estimation_histogram = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getKMapEstimationHistogram()
    {
        return $this->k_map_estimation_histogram;
    }

    /**
     * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
     * doesn't correspond to any such interval, the associated frequency is
     * zero. For example, the following records:
     *   {min_anonymity: 1, max_anonymity: 1, frequency: 17}
     *   {min_anonymity: 2, max_anonymity: 3, frequency: 42}
     *   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
     * mean that there are no record with an estimated anonymity of 4, 5, or
     * larger than 10.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskDetails.KMapEstimationResult.KMapEstimationHistogramBucket k_map_estimation_histogram = 1;</code>
     * @param \Google\Cloud\Dlp\V2beta2\AnalyzeDataSourceRiskDetails_KMapEstimationResult_KMapEstimationHistogramBucket[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setKMapEstimationHistogram($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dlp\V2beta2\AnalyzeDataSourceRiskDetails_KMapEstimationResult_KMapEstimationHistogramBucket::class);
        $this->k_map_estimation_histogram = $arr;

        return $this;
    }

}
