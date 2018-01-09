<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/clouddebugger/v2/debugger.proto

namespace Google\Devtools\Clouddebugger\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Wrapper message for `Breakpoint.Action`. Defines a filter on the action
 * field of breakpoints.
 *
 * Generated from protobuf message <code>google.devtools.clouddebugger.v2.ListBreakpointsRequest.BreakpointActionValue</code>
 */
class ListBreakpointsRequest_BreakpointActionValue extends \Google\Protobuf\Internal\Message
{
    /**
     * Only breakpoints with the specified action will pass the filter.
     *
     * Generated from protobuf field <code>.google.devtools.clouddebugger.v2.Breakpoint.Action value = 1;</code>
     */
    private $value = 0;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Clouddebugger\V2\Debugger::initOnce();
        parent::__construct();
    }

    /**
     * Only breakpoints with the specified action will pass the filter.
     *
     * Generated from protobuf field <code>.google.devtools.clouddebugger.v2.Breakpoint.Action value = 1;</code>
     * @return int
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Only breakpoints with the specified action will pass the filter.
     *
     * Generated from protobuf field <code>.google.devtools.clouddebugger.v2.Breakpoint.Action value = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkEnum($var, \Google\Devtools\Clouddebugger\V2\Breakpoint_Action::class);
        $this->value = $var;

        return $this;
    }

}

