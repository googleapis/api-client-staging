<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/functions/v1beta2/functions.proto

namespace Google\Cloud\Functions\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request for the `DeleteFunction` method.
 *
 * Generated from protobuf message <code>google.cloud.functions.v1beta2.DeleteFunctionRequest</code>
 */
class DeleteFunctionRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The name of the function which should be deleted.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';

    public function __construct() {
        \GPBMetadata\Google\Cloud\Functions\V1Beta2\Functions::initOnce();
        parent::__construct();
    }

    /**
     * The name of the function which should be deleted.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The name of the function which should be deleted.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}
