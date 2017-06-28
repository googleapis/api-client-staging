<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/language/v1/language_service.proto

namespace Google\Cloud\Language\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Represents the feeling associated with the entire text or entities in
 * the text.
 *
 * Protobuf type <code>Google\Cloud\Language\V1\Sentiment</code>
 */
class Sentiment extends \Google\Protobuf\Internal\Message
{
    /**
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     *
     * Generated from protobuf field <code>float magnitude = 2;</code>
     */
    private $magnitude = 0.0;
    /**
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     *
     * Generated from protobuf field <code>float score = 3;</code>
     */
    private $score = 0.0;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Language\V1\LanguageService::initOnce();
        parent::__construct();
    }

    /**
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     *
     * Generated from protobuf field <code>float magnitude = 2;</code>
     * @return float
     */
    public function getMagnitude()
    {
        return $this->magnitude;
    }

    /**
     * A non-negative number in the [0, +inf) range, which represents
     * the absolute magnitude of sentiment regardless of score (positive or
     * negative).
     *
     * Generated from protobuf field <code>float magnitude = 2;</code>
     * @param float $var
     */
    public function setMagnitude($var)
    {
        GPBUtil::checkFloat($var);
        $this->magnitude = $var;
    }

    /**
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     *
     * Generated from protobuf field <code>float score = 3;</code>
     * @return float
     */
    public function getScore()
    {
        return $this->score;
    }

    /**
     * Sentiment score between -1.0 (negative sentiment) and 1.0
     * (positive sentiment).
     *
     * Generated from protobuf field <code>float score = 3;</code>
     * @param float $var
     */
    public function setScore($var)
    {
        GPBUtil::checkFloat($var);
        $this->score = $var;
    }

}

