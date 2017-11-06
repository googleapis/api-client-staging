<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/v2/data.proto

namespace Google\Bigtable\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * Specifies a contiguous range of rows.
 * </pre>
 *
 * Protobuf type <code>google.bigtable.v2.RowRange</code>
 */
class RowRange extends \Google\Protobuf\Internal\Message
{
    protected $start_key;
    protected $end_key;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\V2\Data::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_key_closed = 1;</code>
     */
    public function getStartKeyClosed()
    {
        return $this->readOneof(1);
    }

    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_key_closed = 1;</code>
     */
    public function setStartKeyClosed($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(1, $var);
    }

    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_key_open = 2;</code>
     */
    public function getStartKeyOpen()
    {
        return $this->readOneof(2);
    }

    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_key_open = 2;</code>
     */
    public function setStartKeyOpen($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(2, $var);
    }

    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_key_open = 3;</code>
     */
    public function getEndKeyOpen()
    {
        return $this->readOneof(3);
    }

    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_key_open = 3;</code>
     */
    public function setEndKeyOpen($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(3, $var);
    }

    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_key_closed = 4;</code>
     */
    public function getEndKeyClosed()
    {
        return $this->readOneof(4);
    }

    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_key_closed = 4;</code>
     */
    public function setEndKeyClosed($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(4, $var);
    }

    public function getStartKey()
    {
        return $this->whichOneof("start_key");
    }

    public function getEndKey()
    {
        return $this->whichOneof("end_key");
    }

}
