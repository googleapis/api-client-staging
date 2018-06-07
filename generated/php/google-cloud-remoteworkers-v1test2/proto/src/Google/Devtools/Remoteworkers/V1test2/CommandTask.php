<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/remoteworkers/v1test2/command.proto

namespace Google\Devtools\Remoteworkers\V1test2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Describes a shell-style task to execute.
 *
 * Generated from protobuf message <code>google.devtools.remoteworkers.v1test2.CommandTask</code>
 */
class CommandTask extends \Google\Protobuf\Internal\Message
{
    /**
     * The inputs to the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Inputs inputs = 1;</code>
     */
    private $inputs = null;
    /**
     * The expected outputs from the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Outputs expected_outputs = 4;</code>
     */
    private $expected_outputs = null;
    /**
     * The timeouts of this task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Timeouts timeouts = 5;</code>
     */
    private $timeouts = null;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Remoteworkers\V1Test2\Command::initOnce();
        parent::__construct();
    }

    /**
     * The inputs to the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Inputs inputs = 1;</code>
     * @return \Google\Devtools\Remoteworkers\V1test2\CommandTask_Inputs
     */
    public function getInputs()
    {
        return $this->inputs;
    }

    /**
     * The inputs to the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Inputs inputs = 1;</code>
     * @param \Google\Devtools\Remoteworkers\V1test2\CommandTask_Inputs $var
     * @return $this
     */
    public function setInputs($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Remoteworkers\V1test2\CommandTask_Inputs::class);
        $this->inputs = $var;

        return $this;
    }

    /**
     * The expected outputs from the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Outputs expected_outputs = 4;</code>
     * @return \Google\Devtools\Remoteworkers\V1test2\CommandTask_Outputs
     */
    public function getExpectedOutputs()
    {
        return $this->expected_outputs;
    }

    /**
     * The expected outputs from the task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Outputs expected_outputs = 4;</code>
     * @param \Google\Devtools\Remoteworkers\V1test2\CommandTask_Outputs $var
     * @return $this
     */
    public function setExpectedOutputs($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Remoteworkers\V1test2\CommandTask_Outputs::class);
        $this->expected_outputs = $var;

        return $this;
    }

    /**
     * The timeouts of this task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Timeouts timeouts = 5;</code>
     * @return \Google\Devtools\Remoteworkers\V1test2\CommandTask_Timeouts
     */
    public function getTimeouts()
    {
        return $this->timeouts;
    }

    /**
     * The timeouts of this task.
     *
     * Generated from protobuf field <code>.google.devtools.remoteworkers.v1test2.CommandTask.Timeouts timeouts = 5;</code>
     * @param \Google\Devtools\Remoteworkers\V1test2\CommandTask_Timeouts $var
     * @return $this
     */
    public function setTimeouts($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Remoteworkers\V1test2\CommandTask_Timeouts::class);
        $this->timeouts = $var;

        return $this;
    }

}
