<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/remoteworkers/v1test2/command.proto

namespace Google\Devtools\Remoteworkers\V1test2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Describes the inputs to a shell-style task.
 *
 * Generated from protobuf message <code>google.devtools.remoteworkers.v1test2.CommandTask.Inputs</code>
 */
class CommandTask_Inputs extends \Google\Protobuf\Internal\Message
{
    /**
     * The command itself to run (e.g., argv)
     *
     * Generated from protobuf field <code>repeated string arguments = 1;</code>
     */
    private $arguments;
    /**
     * The input filesystem to be set up prior to the task beginning. The
     * contents should be a repeated set of FileMetadata messages though other
     * formats are allowed if better for the implementation (eg, a LUCI-style
     * .isolated file).
     * This field is repeated since implementations might want to cache the
     * metadata, in which case it may be useful to break up portions of the
     * filesystem that change frequently (eg, specific input files) from those
     * that don't (eg, standard header files).
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.Digest files = 2;</code>
     */
    private $files;
    /**
     * All environment variables required by the task.
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable environment_variables = 3;</code>
     */
    private $environment_variables;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Remoteworkers\V1Test2\Command::initOnce();
        parent::__construct();
    }

    /**
     * The command itself to run (e.g., argv)
     *
     * Generated from protobuf field <code>repeated string arguments = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getArguments()
    {
        return $this->arguments;
    }

    /**
     * The command itself to run (e.g., argv)
     *
     * Generated from protobuf field <code>repeated string arguments = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setArguments($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->arguments = $arr;

        return $this;
    }

    /**
     * The input filesystem to be set up prior to the task beginning. The
     * contents should be a repeated set of FileMetadata messages though other
     * formats are allowed if better for the implementation (eg, a LUCI-style
     * .isolated file).
     * This field is repeated since implementations might want to cache the
     * metadata, in which case it may be useful to break up portions of the
     * filesystem that change frequently (eg, specific input files) from those
     * that don't (eg, standard header files).
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.Digest files = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getFiles()
    {
        return $this->files;
    }

    /**
     * The input filesystem to be set up prior to the task beginning. The
     * contents should be a repeated set of FileMetadata messages though other
     * formats are allowed if better for the implementation (eg, a LUCI-style
     * .isolated file).
     * This field is repeated since implementations might want to cache the
     * metadata, in which case it may be useful to break up portions of the
     * filesystem that change frequently (eg, specific input files) from those
     * that don't (eg, standard header files).
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.Digest files = 2;</code>
     * @param \Google\Devtools\Remoteworkers\V1test2\Digest[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setFiles($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Remoteworkers\V1test2\Digest::class);
        $this->files = $arr;

        return $this;
    }

    /**
     * All environment variables required by the task.
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable environment_variables = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getEnvironmentVariables()
    {
        return $this->environment_variables;
    }

    /**
     * All environment variables required by the task.
     *
     * Generated from protobuf field <code>repeated .google.devtools.remoteworkers.v1test2.CommandTask.Inputs.EnvironmentVariable environment_variables = 3;</code>
     * @param \Google\Devtools\Remoteworkers\V1test2\CommandTask_Inputs_EnvironmentVariable[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setEnvironmentVariables($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Remoteworkers\V1test2\CommandTask_Inputs_EnvironmentVariable::class);
        $this->environment_variables = $arr;

        return $this;
    }

}
