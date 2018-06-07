<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/websecurityscanner/v1alpha/scan_config.proto

namespace Google\Cloud\Websecurityscanner\V1alpha;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Describes authentication configuration that uses a Google account.
 *
 * Generated from protobuf message <code>google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication.GoogleAccount</code>
 */
class ScanConfig_Authentication_GoogleAccount extends \Google\Protobuf\Internal\Message
{
    /**
     * Required.
     * The user name of the Google account.
     *
     * Generated from protobuf field <code>string username = 1;</code>
     */
    private $username = '';
    /**
     * Input only.
     * Required.
     * The password of the Google account. The credential is stored encrypted
     * and not returned in any response.
     *
     * Generated from protobuf field <code>string password = 2;</code>
     */
    private $password = '';

    public function __construct() {
        \GPBMetadata\Google\Cloud\Websecurityscanner\V1Alpha\ScanConfig::initOnce();
        parent::__construct();
    }

    /**
     * Required.
     * The user name of the Google account.
     *
     * Generated from protobuf field <code>string username = 1;</code>
     * @return string
     */
    public function getUsername()
    {
        return $this->username;
    }

    /**
     * Required.
     * The user name of the Google account.
     *
     * Generated from protobuf field <code>string username = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setUsername($var)
    {
        GPBUtil::checkString($var, True);
        $this->username = $var;

        return $this;
    }

    /**
     * Input only.
     * Required.
     * The password of the Google account. The credential is stored encrypted
     * and not returned in any response.
     *
     * Generated from protobuf field <code>string password = 2;</code>
     * @return string
     */
    public function getPassword()
    {
        return $this->password;
    }

    /**
     * Input only.
     * Required.
     * The password of the Google account. The credential is stored encrypted
     * and not returned in any response.
     *
     * Generated from protobuf field <code>string password = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setPassword($var)
    {
        GPBUtil::checkString($var, True);
        $this->password = $var;

        return $this;
    }

}
