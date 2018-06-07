<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Metadata for any related URL information
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.Note.RelatedUrl</code>
 */
class Note_RelatedUrl extends \Google\Protobuf\Internal\Message
{
    /**
     * Specific URL to associate with the note
     *
     * Generated from protobuf field <code>string url = 1;</code>
     */
    private $url = '';
    /**
     * Label to describe usage of the URL
     *
     * Generated from protobuf field <code>string label = 2;</code>
     */
    private $label = '';

    public function __construct() {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Containeranalysis::initOnce();
        parent::__construct();
    }

    /**
     * Specific URL to associate with the note
     *
     * Generated from protobuf field <code>string url = 1;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * Specific URL to associate with the note
     *
     * Generated from protobuf field <code>string url = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->url = $var;

        return $this;
    }

    /**
     * Label to describe usage of the URL
     *
     * Generated from protobuf field <code>string label = 2;</code>
     * @return string
     */
    public function getLabel()
    {
        return $this->label;
    }

    /**
     * Label to describe usage of the URL
     *
     * Generated from protobuf field <code>string label = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setLabel($var)
    {
        GPBUtil::checkString($var, True);
        $this->label = $var;

        return $this;
    }

}
