<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/container/v1/cluster_service.proto

namespace Google\Cloud\Container\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * SetLocationsRequest sets the locations of the cluster.
 *
 * Generated from protobuf message <code>google.container.v1.SetLocationsRequest</code>
 */
class SetLocationsRequest extends \Google\Protobuf\Internal\Message
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
     * The desired list of Google Compute Engine
     * [locations](/compute/docs/zones#available) in which the cluster's nodes
     * should be located. Changing the locations a cluster is in will result
     * in nodes being either created or removed from the cluster, depending on
     * whether locations are being added or removed.
     * This list must always include the cluster's primary zone.
     *
     * Generated from protobuf field <code>repeated string locations = 4;</code>
     */
    private $locations;

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
     * The desired list of Google Compute Engine
     * [locations](/compute/docs/zones#available) in which the cluster's nodes
     * should be located. Changing the locations a cluster is in will result
     * in nodes being either created or removed from the cluster, depending on
     * whether locations are being added or removed.
     * This list must always include the cluster's primary zone.
     *
     * Generated from protobuf field <code>repeated string locations = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLocations()
    {
        return $this->locations;
    }

    /**
     * The desired list of Google Compute Engine
     * [locations](/compute/docs/zones#available) in which the cluster's nodes
     * should be located. Changing the locations a cluster is in will result
     * in nodes being either created or removed from the cluster, depending on
     * whether locations are being added or removed.
     * This list must always include the cluster's primary zone.
     *
     * Generated from protobuf field <code>repeated string locations = 4;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLocations($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->locations = $arr;

        return $this;
    }

}

