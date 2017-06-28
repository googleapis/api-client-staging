<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/query_plan.proto

namespace Google\Spanner\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Condensed representation of a node and its subtree. Only present for
 * `SCALAR` [PlanNode(s)][google.spanner.v1.PlanNode].
 *
 * Protobuf type <code>Google\Spanner\V1\PlanNode\ShortRepresentation</code>
 */
class PlanNode_ShortRepresentation extends \Google\Protobuf\Internal\Message
{
    /**
     * A string representation of the expression subtree rooted at this node.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     */
    private $description = '';
    /**
     * A mapping of (subquery variable name) -> (subquery node id) for cases
     * where the `description` string of this node references a `SCALAR`
     * subquery contained in the expression subtree rooted at this node. The
     * referenced `SCALAR` subquery may not necessarily be a direct child of
     * this node.
     *
     * Generated from protobuf field <code>map<string, int32> subqueries = 2;</code>
     */
    private $subqueries;

    public function __construct() {
        \GPBMetadata\Google\Spanner\V1\QueryPlan::initOnce();
        parent::__construct();
    }

    /**
     * A string representation of the expression subtree rooted at this node.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * A string representation of the expression subtree rooted at this node.
     *
     * Generated from protobuf field <code>string description = 1;</code>
     * @param string $var
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;
    }

    /**
     * A mapping of (subquery variable name) -> (subquery node id) for cases
     * where the `description` string of this node references a `SCALAR`
     * subquery contained in the expression subtree rooted at this node. The
     * referenced `SCALAR` subquery may not necessarily be a direct child of
     * this node.
     *
     * Generated from protobuf field <code>map<string, int32> subqueries = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSubqueries()
    {
        return $this->subqueries;
    }

    /**
     * A mapping of (subquery variable name) -> (subquery node id) for cases
     * where the `description` string of this node references a `SCALAR`
     * subquery contained in the expression subtree rooted at this node. The
     * referenced `SCALAR` subquery may not necessarily be a direct child of
     * this node.
     *
     * Generated from protobuf field <code>map<string, int32> subqueries = 2;</code>
     * @param array|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setSubqueries(&$var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::INT32);
        $this->subqueries = $arr;
    }

}

