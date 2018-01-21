<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta2/dlp.proto

namespace Google\Cloud\Dlp\V2beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A quasi-identifier column has a custom_tag, used to know which column
 * in the data corresponds to which column in the statistical model.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta2.PrivacyMetric.KMapEstimationConfig.AuxiliaryTable.QuasiIdField</code>
 */
class PrivacyMetric_KMapEstimationConfig_AuxiliaryTable_QuasiIdField extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta2.FieldId field = 1;</code>
     */
    private $field = null;
    /**
     * Generated from protobuf field <code>string custom_tag = 2;</code>
     */
    private $custom_tag = '';

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta2\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta2.FieldId field = 1;</code>
     * @return \Google\Cloud\Dlp\V2beta2\FieldId
     */
    public function getField()
    {
        return $this->field;
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2beta2.FieldId field = 1;</code>
     * @param \Google\Cloud\Dlp\V2beta2\FieldId $var
     * @return $this
     */
    public function setField($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2beta2\FieldId::class);
        $this->field = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string custom_tag = 2;</code>
     * @return string
     */
    public function getCustomTag()
    {
        return $this->custom_tag;
    }

    /**
     * Generated from protobuf field <code>string custom_tag = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setCustomTag($var)
    {
        GPBUtil::checkString($var, True);
        $this->custom_tag = $var;

        return $this;
    }

}

