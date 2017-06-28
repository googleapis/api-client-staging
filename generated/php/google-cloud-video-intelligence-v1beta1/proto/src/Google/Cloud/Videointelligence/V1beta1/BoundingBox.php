<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

namespace Google\Cloud\Videointelligence\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Bounding box.
 *
 * Protobuf type <code>Google\Cloud\Videointelligence\V1beta1\BoundingBox</code>
 */
class BoundingBox extends \Google\Protobuf\Internal\Message
{
    /**
     * Left X coordinate.
     *
     * Generated from protobuf field <code>int32 left = 1;</code>
     */
    private $left = 0;
    /**
     * Right X coordinate.
     *
     * Generated from protobuf field <code>int32 right = 2;</code>
     */
    private $right = 0;
    /**
     * Bottom Y coordinate.
     *
     * Generated from protobuf field <code>int32 bottom = 3;</code>
     */
    private $bottom = 0;
    /**
     * Top Y coordinate.
     *
     * Generated from protobuf field <code>int32 top = 4;</code>
     */
    private $top = 0;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Videointelligence\V1Beta1\VideoIntelligence::initOnce();
        parent::__construct();
    }

    /**
     * Left X coordinate.
     *
     * Generated from protobuf field <code>int32 left = 1;</code>
     * @return int
     */
    public function getLeft()
    {
        return $this->left;
    }

    /**
     * Left X coordinate.
     *
     * Generated from protobuf field <code>int32 left = 1;</code>
     * @param int $var
     */
    public function setLeft($var)
    {
        GPBUtil::checkInt32($var);
        $this->left = $var;
    }

    /**
     * Right X coordinate.
     *
     * Generated from protobuf field <code>int32 right = 2;</code>
     * @return int
     */
    public function getRight()
    {
        return $this->right;
    }

    /**
     * Right X coordinate.
     *
     * Generated from protobuf field <code>int32 right = 2;</code>
     * @param int $var
     */
    public function setRight($var)
    {
        GPBUtil::checkInt32($var);
        $this->right = $var;
    }

    /**
     * Bottom Y coordinate.
     *
     * Generated from protobuf field <code>int32 bottom = 3;</code>
     * @return int
     */
    public function getBottom()
    {
        return $this->bottom;
    }

    /**
     * Bottom Y coordinate.
     *
     * Generated from protobuf field <code>int32 bottom = 3;</code>
     * @param int $var
     */
    public function setBottom($var)
    {
        GPBUtil::checkInt32($var);
        $this->bottom = $var;
    }

    /**
     * Top Y coordinate.
     *
     * Generated from protobuf field <code>int32 top = 4;</code>
     * @return int
     */
    public function getTop()
    {
        return $this->top;
    }

    /**
     * Top Y coordinate.
     *
     * Generated from protobuf field <code>int32 top = 4;</code>
     * @param int $var
     */
    public function setTop($var)
    {
        GPBUtil::checkInt32($var);
        $this->top = $var;
    }

}

