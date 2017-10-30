<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/instance.proto

namespace Google\Bigtable\Admin\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * A collection of Bigtable [Tables][google.bigtable.admin.v2.Table] and
 * the resources that serve them.
 * All tables in an instance are served from a single
 * [Cluster][google.bigtable.admin.v2.Cluster].
 * </pre>
 *
 * Protobuf type <code>google.bigtable.admin.v2.Instance</code>
 */
class Instance extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * (`OutputOnly`)
     * The unique name of the instance. Values are of the form
     * `projects/&lt;project&gt;/instances/[a-z][a-z0-9&#92;&#92;-]+[a-z0-9]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * <pre>
     * The descriptive name for this instance as it appears in UIs.
     * Can be changed at any time, but should be kept globally unique
     * to avoid confusion.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    private $display_name = '';
    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the instance.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.State state = 3;</code>
     */
    private $state = 0;
    /**
     * <pre>
     * The type of the instance. Defaults to `PRODUCTION`.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.Type type = 4;</code>
     */
    private $type = 0;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\Admin\V2\Instance::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The unique name of the instance. Values are of the form
     * `projects/&lt;project&gt;/instances/[a-z][a-z0-9&#92;&#92;-]+[a-z0-9]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The unique name of the instance. Values are of the form
     * `projects/&lt;project&gt;/instances/[a-z][a-z0-9&#92;&#92;-]+[a-z0-9]`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;
    }

    /**
     * <pre>
     * The descriptive name for this instance as it appears in UIs.
     * Can be changed at any time, but should be kept globally unique
     * to avoid confusion.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public function getDisplayName()
    {
        return $this->display_name;
    }

    /**
     * <pre>
     * The descriptive name for this instance as it appears in UIs.
     * Can be changed at any time, but should be kept globally unique
     * to avoid confusion.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public function setDisplayName($var)
    {
        GPBUtil::checkString($var, True);
        $this->display_name = $var;
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the instance.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.State state = 3;</code>
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the instance.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.State state = 3;</code>
     */
    public function setState($var)
    {
        GPBUtil::checkEnum($var, \Google\Bigtable\Admin\V2\Instance_State::class);
        $this->state = $var;
    }

    /**
     * <pre>
     * The type of the instance. Defaults to `PRODUCTION`.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.Type type = 4;</code>
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * <pre>
     * The type of the instance. Defaults to `PRODUCTION`.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Instance.Type type = 4;</code>
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Google\Bigtable\Admin\V2\Instance_Type::class);
        $this->type = $var;
    }

}
