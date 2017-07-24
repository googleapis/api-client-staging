<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/language/v1/language_service.proto

namespace Google\Cloud\Language\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Represents an output piece of text.
 *
 * Generated from protobuf message <code>google.cloud.language.v1.TextSpan</code>
 */
class TextSpan extends \Google\Protobuf\Internal\Message
{
    /**
     * The content of the output text.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     */
    private $content = '';
    /**
     * The API calculates the beginning offset of the content in the original
     * document according to the [EncodingType][google.cloud.language.v1.EncodingType] specified in the API request.
     *
     * Generated from protobuf field <code>int32 begin_offset = 2;</code>
     */
    private $begin_offset = 0;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Language\V1\LanguageService::initOnce();
        parent::__construct();
    }

    /**
     * The content of the output text.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     * @return string
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * The content of the output text.
     *
     * Generated from protobuf field <code>string content = 1;</code>
     * @param string $var
     */
    public function setContent($var)
    {
        GPBUtil::checkString($var, True);
        $this->content = $var;
    }

    /**
     * The API calculates the beginning offset of the content in the original
     * document according to the [EncodingType][google.cloud.language.v1.EncodingType] specified in the API request.
     *
     * Generated from protobuf field <code>int32 begin_offset = 2;</code>
     * @return int
     */
    public function getBeginOffset()
    {
        return $this->begin_offset;
    }

    /**
     * The API calculates the beginning offset of the content in the original
     * document according to the [EncodingType][google.cloud.language.v1.EncodingType] specified in the API request.
     *
     * Generated from protobuf field <code>int32 begin_offset = 2;</code>
     * @param int $var
     */
    public function setBeginOffset($var)
    {
        GPBUtil::checkInt32($var);
        $this->begin_offset = $var;
    }

}

