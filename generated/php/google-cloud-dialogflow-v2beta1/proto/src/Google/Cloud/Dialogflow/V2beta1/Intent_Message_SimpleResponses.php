<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/intent.proto

namespace Google\Cloud\Dialogflow\V2beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The collection of simple response candidates.
 * This message in `QueryResult.fulfillment_messages` and
 * `WebhookResponse.fulfillment_messages` should contain only one
 * `SimpleResponse`.
 *
 * Generated from protobuf message <code>google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponses</code>
 */
class Intent_Message_SimpleResponses extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The list of simple responses.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse simple_responses = 1;</code>
     */
    private $simple_responses;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Dialogflow\V2Beta1\Intent::initOnce();
        parent::__construct();
    }

    /**
     * Required. The list of simple responses.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse simple_responses = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSimpleResponses()
    {
        return $this->simple_responses;
    }

    /**
     * Required. The list of simple responses.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message.SimpleResponse simple_responses = 1;</code>
     * @param \Google\Cloud\Dialogflow\V2beta1\Intent_Message_SimpleResponse[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSimpleResponses($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dialogflow\V2beta1\Intent_Message_SimpleResponse::class);
        $this->simple_responses = $arr;

        return $this;
    }

}
