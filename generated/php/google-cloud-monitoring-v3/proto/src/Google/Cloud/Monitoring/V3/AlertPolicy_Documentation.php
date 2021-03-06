<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/alert.proto

namespace Google\Cloud\Monitoring\V3;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A content string and a MIME type that describes the content string's
 * format.
 *
 * Generated from protobuf message <code>google.monitoring.v3.AlertPolicy.Documentation</code>
 */
class AlertPolicy_Documentation extends \Google\Protobuf\Internal\Message
{
    /**
     * The text of the documentation, interpreted according to `mime_type`.
     * The content may not exceed 8,192 Unicode characters and may not exceed
     * more than 10,240 bytes when encoded in UTF-8 format, whichever is
     * smaller.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     */
    private $content = '';
    /**
     * The format of the `content` field. Presently, only the value
     * `"text/markdown"` is supported. See
     * [Markdown](https://en.wikipedia.org/wiki/Markdown) for more information.
     *
     * Generated from protobuf field <code>string mime_type = 2;</code>
     */
    private $mime_type = '';

    public function __construct() {
        \GPBMetadata\Google\Monitoring\V3\Alert::initOnce();
        parent::__construct();
    }

    /**
     * The text of the documentation, interpreted according to `mime_type`.
     * The content may not exceed 8,192 Unicode characters and may not exceed
     * more than 10,240 bytes when encoded in UTF-8 format, whichever is
     * smaller.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     * @return string
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * The text of the documentation, interpreted according to `mime_type`.
     * The content may not exceed 8,192 Unicode characters and may not exceed
     * more than 10,240 bytes when encoded in UTF-8 format, whichever is
     * smaller.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setContent($var)
    {
        GPBUtil::checkString($var, True);
        $this->content = $var;

        return $this;
    }

    /**
     * The format of the `content` field. Presently, only the value
     * `"text/markdown"` is supported. See
     * [Markdown](https://en.wikipedia.org/wiki/Markdown) for more information.
     *
     * Generated from protobuf field <code>string mime_type = 2;</code>
     * @return string
     */
    public function getMimeType()
    {
        return $this->mime_type;
    }

    /**
     * The format of the `content` field. Presently, only the value
     * `"text/markdown"` is supported. See
     * [Markdown](https://en.wikipedia.org/wiki/Markdown) for more information.
     *
     * Generated from protobuf field <code>string mime_type = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setMimeType($var)
    {
        GPBUtil::checkString($var, True);
        $this->mime_type = $var;

        return $this;
    }

}

