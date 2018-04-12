<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2/intent.proto

namespace Google\Cloud\Dialogflow\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * This message is a wrapper around a collection of intents.
 *
 * Generated from protobuf message <code>google.cloud.dialogflow.v2.IntentBatch</code>
 */
class IntentBatch extends \Google\Protobuf\Internal\Message
{
    /**
     * A collection of intents.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
     */
    private $intents;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Dialogflow\V2\Intent::initOnce();
        parent::__construct();
    }

    /**
     * A collection of intents.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getIntents()
    {
        return $this->intents;
    }

    /**
     * A collection of intents.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dialogflow.v2.Intent intents = 1;</code>
     * @param \Google\Cloud\Dialogflow\V2\Intent[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setIntents($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dialogflow\V2\Intent::class);
        $this->intents = $arr;

        return $this;
    }

}

