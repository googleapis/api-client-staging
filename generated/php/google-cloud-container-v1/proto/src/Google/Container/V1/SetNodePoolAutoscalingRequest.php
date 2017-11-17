<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/container/v1/cluster_service.proto

namespace Google\Container\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * SetNodePoolAutoscalingRequest sets the autoscaler settings of a node pool.
 *
 * Generated from protobuf message <code>google.container.v1.SetNodePoolAutoscalingRequest</code>
 */
class SetNodePoolAutoscalingRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     */
    private $project_id = '';
    /**
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     *
     * Generated from protobuf field <code>string zone = 2;</code>
     */
    private $zone = '';
    /**
     * The name of the cluster to upgrade.
     *
     * Generated from protobuf field <code>string cluster_id = 3;</code>
     */
    private $cluster_id = '';
    /**
     * The name of the node pool to upgrade.
     *
     * Generated from protobuf field <code>string node_pool_id = 4;</code>
     */
    private $node_pool_id = '';
    /**
     * Autoscaling configuration for the node pool.
     *
     * Generated from protobuf field <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    private $autoscaling = null;

    public function __construct() {
        \GPBMetadata\Google\Container\V1\ClusterService::initOnce();
        parent::__construct();
    }

    /**
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     * @return string
     */
    public function getProjectId()
    {
        return $this->project_id;
    }

    /**
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setProjectId($var)
    {
        GPBUtil::checkString($var, True);
        $this->project_id = $var;

        return $this;
    }

    /**
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     *
     * Generated from protobuf field <code>string zone = 2;</code>
     * @return string
     */
    public function getZone()
    {
        return $this->zone;
    }

    /**
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     *
     * Generated from protobuf field <code>string zone = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setZone($var)
    {
        GPBUtil::checkString($var, True);
        $this->zone = $var;

        return $this;
    }

    /**
     * The name of the cluster to upgrade.
     *
     * Generated from protobuf field <code>string cluster_id = 3;</code>
     * @return string
     */
    public function getClusterId()
    {
        return $this->cluster_id;
    }

    /**
     * The name of the cluster to upgrade.
     *
     * Generated from protobuf field <code>string cluster_id = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setClusterId($var)
    {
        GPBUtil::checkString($var, True);
        $this->cluster_id = $var;

        return $this;
    }

    /**
     * The name of the node pool to upgrade.
     *
     * Generated from protobuf field <code>string node_pool_id = 4;</code>
     * @return string
     */
    public function getNodePoolId()
    {
        return $this->node_pool_id;
    }

    /**
     * The name of the node pool to upgrade.
     *
     * Generated from protobuf field <code>string node_pool_id = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setNodePoolId($var)
    {
        GPBUtil::checkString($var, True);
        $this->node_pool_id = $var;

        return $this;
    }

    /**
     * Autoscaling configuration for the node pool.
     *
     * Generated from protobuf field <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     * @return \Google\Container\V1\NodePoolAutoscaling
     */
    public function getAutoscaling()
    {
        return $this->autoscaling;
    }

    /**
     * Autoscaling configuration for the node pool.
     *
     * Generated from protobuf field <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     * @param \Google\Container\V1\NodePoolAutoscaling $var
     * @return $this
     */
    public function setAutoscaling($var)
    {
        GPBUtil::checkMessage($var, \Google\Container\V1\NodePoolAutoscaling::class);
        $this->autoscaling = $var;

        return $this;
    }

}

