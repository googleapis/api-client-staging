<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/cloudbuild/v1/cloudbuild.proto

namespace Google\Devtools\Cloudbuild\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Volume describes a Docker container volume which is mounted into build steps
 * in order to persist files across build step execution.
 *
 * Generated from protobuf message <code>google.devtools.cloudbuild.v1.Volume</code>
 */
class Volume extends \Google\Protobuf\Internal\Message
{
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     *
     * Generated from protobuf field <code>string path = 2;</code>
     */
    private $path = '';

    public function __construct() {
        \GPBMetadata\Google\Devtools\Cloudbuild\V1\Cloudbuild::initOnce();
        parent::__construct();
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
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

    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     *
     * Generated from protobuf field <code>string path = 2;</code>
     * @return string
     */
    public function getPath()
    {
        return $this->path;
    }

    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     *
     * Generated from protobuf field <code>string path = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setPath($var)
    {
        GPBUtil::checkString($var, True);
        $this->path = $var;

        return $this;
    }

}
