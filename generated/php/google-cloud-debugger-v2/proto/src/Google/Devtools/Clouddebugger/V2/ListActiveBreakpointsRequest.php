<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/clouddebugger/v2/controller.proto

namespace Google\Devtools\Clouddebugger\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to list active breakpoints.
 *
 * Generated from protobuf message <code>google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest</code>
 */
class ListActiveBreakpointsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Identifies the debuggee.
     *
     * Generated from protobuf field <code>string debuggee_id = 1;</code>
     */
    private $debuggee_id = '';
    /**
     * A token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server-selected timeout has
     * expired. The value should be set from the `next_wait_token` field in
     * the last response. The initial value should be set to `"init"`.
     *
     * Generated from protobuf field <code>string wait_token = 2;</code>
     */
    private $wait_token = '';
    /**
     * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
     * sets the `wait_expired` response field to `true` when the server-selected
     * timeout has expired.
     * If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status
     * when the server-selected timeout has expired.
     *
     * Generated from protobuf field <code>bool success_on_timeout = 3;</code>
     */
    private $success_on_timeout = false;

    public function __construct() {
        \GPBMetadata\Google\Devtools\Clouddebugger\V2\Controller::initOnce();
        parent::__construct();
    }

    /**
     * Identifies the debuggee.
     *
     * Generated from protobuf field <code>string debuggee_id = 1;</code>
     * @return string
     */
    public function getDebuggeeId()
    {
        return $this->debuggee_id;
    }

    /**
     * Identifies the debuggee.
     *
     * Generated from protobuf field <code>string debuggee_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDebuggeeId($var)
    {
        GPBUtil::checkString($var, True);
        $this->debuggee_id = $var;

        return $this;
    }

    /**
     * A token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server-selected timeout has
     * expired. The value should be set from the `next_wait_token` field in
     * the last response. The initial value should be set to `"init"`.
     *
     * Generated from protobuf field <code>string wait_token = 2;</code>
     * @return string
     */
    public function getWaitToken()
    {
        return $this->wait_token;
    }

    /**
     * A token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server-selected timeout has
     * expired. The value should be set from the `next_wait_token` field in
     * the last response. The initial value should be set to `"init"`.
     *
     * Generated from protobuf field <code>string wait_token = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setWaitToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->wait_token = $var;

        return $this;
    }

    /**
     * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
     * sets the `wait_expired` response field to `true` when the server-selected
     * timeout has expired.
     * If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status
     * when the server-selected timeout has expired.
     *
     * Generated from protobuf field <code>bool success_on_timeout = 3;</code>
     * @return bool
     */
    public function getSuccessOnTimeout()
    {
        return $this->success_on_timeout;
    }

    /**
     * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
     * sets the `wait_expired` response field to `true` when the server-selected
     * timeout has expired.
     * If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status
     * when the server-selected timeout has expired.
     *
     * Generated from protobuf field <code>bool success_on_timeout = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setSuccessOnTimeout($var)
    {
        GPBUtil::checkBool($var);
        $this->success_on_timeout = $var;

        return $this;
    }

}

