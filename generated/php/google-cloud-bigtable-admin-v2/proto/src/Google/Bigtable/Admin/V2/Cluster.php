<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/instance.proto

namespace Google\Bigtable\Admin\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * A resizable group of nodes in a particular cloud location, capable
 * of serving all [Tables][google.bigtable.admin.v2.Table] in the parent
 * [Instance][google.bigtable.admin.v2.Instance].
 * </pre>
 *
 * Protobuf type <code>google.bigtable.admin.v2.Cluster</code>
 */
class Cluster extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * (`OutputOnly`)
     * The unique name of the cluster. Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/[a-z][-a-z0-9]*`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * <pre>
     * (`CreationOnly`)
     * The location where this cluster's nodes and storage reside. For best
     * performance, clients should be located as close as possible to this cluster.
     * Currently only zones are supported, so values should be of the form
     * `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    private $location = '';
    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the cluster.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster.State state = 3;</code>
     */
    private $state = 0;
    /**
     * <pre>
     * The number of nodes allocated to this cluster. More nodes enable higher
     * throughput and more consistent performance.
     * </pre>
     *
     * <code>int32 serve_nodes = 4;</code>
     */
    private $serve_nodes = 0;
    /**
     * <pre>
     * (`CreationOnly`)
     * The type of storage used by this cluster to serve its
     * parent instance's tables, unless explicitly overridden.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
     */
    private $default_storage_type = 0;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\Admin\V2\Instance::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The unique name of the cluster. Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/[a-z][-a-z0-9]*`.
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
     * The unique name of the cluster. Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/[a-z][-a-z0-9]*`.
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
     * (`CreationOnly`)
     * The location where this cluster's nodes and storage reside. For best
     * performance, clients should be located as close as possible to this cluster.
     * Currently only zones are supported, so values should be of the form
     * `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public function getLocation()
    {
        return $this->location;
    }

    /**
     * <pre>
     * (`CreationOnly`)
     * The location where this cluster's nodes and storage reside. For best
     * performance, clients should be located as close as possible to this cluster.
     * Currently only zones are supported, so values should be of the form
     * `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public function setLocation($var)
    {
        GPBUtil::checkString($var, True);
        $this->location = $var;
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the cluster.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster.State state = 3;</code>
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * <pre>
     * (`OutputOnly`)
     * The current state of the cluster.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster.State state = 3;</code>
     */
    public function setState($var)
    {
        GPBUtil::checkEnum($var, \Google\Bigtable\Admin\V2\Cluster_State::class);
        $this->state = $var;
    }

    /**
     * <pre>
     * The number of nodes allocated to this cluster. More nodes enable higher
     * throughput and more consistent performance.
     * </pre>
     *
     * <code>int32 serve_nodes = 4;</code>
     */
    public function getServeNodes()
    {
        return $this->serve_nodes;
    }

    /**
     * <pre>
     * The number of nodes allocated to this cluster. More nodes enable higher
     * throughput and more consistent performance.
     * </pre>
     *
     * <code>int32 serve_nodes = 4;</code>
     */
    public function setServeNodes($var)
    {
        GPBUtil::checkInt32($var);
        $this->serve_nodes = $var;
    }

    /**
     * <pre>
     * (`CreationOnly`)
     * The type of storage used by this cluster to serve its
     * parent instance's tables, unless explicitly overridden.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
     */
    public function getDefaultStorageType()
    {
        return $this->default_storage_type;
    }

    /**
     * <pre>
     * (`CreationOnly`)
     * The type of storage used by this cluster to serve its
     * parent instance's tables, unless explicitly overridden.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
     */
    public function setDefaultStorageType($var)
    {
        GPBUtil::checkEnum($var, \Google\Bigtable\Admin\V2\StorageType::class);
        $this->default_storage_type = $var;
    }

}
