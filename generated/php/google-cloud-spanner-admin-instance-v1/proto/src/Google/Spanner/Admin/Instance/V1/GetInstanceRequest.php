<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

namespace Google\Spanner\Admin\Instance\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The request for [GetInstance][google.spanner.admin.instance.v1.InstanceAdmin.GetInstance].
 *
 * Generated from protobuf message <code>google.spanner.admin.instance.v1.GetInstanceRequest</code>
 */
class GetInstanceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The name of the requested instance. Values are of the form
     * `projects/<project>/instances/<instance>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';

    public function __construct() {
        \GPBMetadata\Google\Spanner\Admin\Instance\V1\SpannerInstanceAdmin::initOnce();
        parent::__construct();
    }

    /**
     * Required. The name of the requested instance. Values are of the form
     * `projects/<project>/instances/<instance>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Required. The name of the requested instance. Values are of the form
     * `projects/<project>/instances/<instance>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;
    }

}

