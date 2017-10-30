<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/v2/data.proto

namespace Google\Bigtable\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * A Mutation which deletes cells from the specified column, optionally
 * restricting the deletions to a given timestamp range.
 * </pre>
 *
 * Protobuf type <code>google.bigtable.v2.Mutation.DeleteFromColumn</code>
 */
class Mutation_DeleteFromColumn extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The name of the family from which cells should be deleted.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    private $family_name = '';
    /**
     * <pre>
     * The qualifier of the column from which cells should be deleted.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    private $column_qualifier = '';
    /**
     * <pre>
     * The range of timestamps within which cells should be deleted.
     * </pre>
     *
     * <code>.google.bigtable.v2.TimestampRange time_range = 3;</code>
     */
    private $time_range = null;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\V2\Data::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The name of the family from which cells should be deleted.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public function getFamilyName()
    {
        return $this->family_name;
    }

    /**
     * <pre>
     * The name of the family from which cells should be deleted.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public function setFamilyName($var)
    {
        GPBUtil::checkString($var, True);
        $this->family_name = $var;
    }

    /**
     * <pre>
     * The qualifier of the column from which cells should be deleted.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public function getColumnQualifier()
    {
        return $this->column_qualifier;
    }

    /**
     * <pre>
     * The qualifier of the column from which cells should be deleted.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public function setColumnQualifier($var)
    {
        GPBUtil::checkString($var, False);
        $this->column_qualifier = $var;
    }

    /**
     * <pre>
     * The range of timestamps within which cells should be deleted.
     * </pre>
     *
     * <code>.google.bigtable.v2.TimestampRange time_range = 3;</code>
     */
    public function getTimeRange()
    {
        return $this->time_range;
    }

    /**
     * <pre>
     * The range of timestamps within which cells should be deleted.
     * </pre>
     *
     * <code>.google.bigtable.v2.TimestampRange time_range = 3;</code>
     */
    public function setTimeRange(&$var)
    {
        GPBUtil::checkMessage($var, \Google\Bigtable\V2\TimestampRange::class);
        $this->time_range = $var;
    }

}

