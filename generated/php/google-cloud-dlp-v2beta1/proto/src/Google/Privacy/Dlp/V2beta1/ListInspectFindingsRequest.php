<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2beta1/dlp.proto

namespace Google\Privacy\Dlp\V2beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request for the list of results in a given inspect operation.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2beta1.ListInspectFindingsRequest</code>
 */
class ListInspectFindingsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to CreateInspectOperation.
     * Should be in the format of `inspect/results/{id}.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
     */
    private $page_size = 0;
    /**
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     */
    private $page_token = '';
    /**
     * Restricts findings to items that match. Supports info_type and likelihood.
     * <p>Examples:<br/>
     * <li>info_type=EMAIL_ADDRESS
     * <li>info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * <li>likelihood=VERY_LIKELY
     * <li>likelihood=VERY_LIKELY,LIKELY
     * <li>info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     *
     * Generated from protobuf field <code>string filter = 4;</code>
     */
    private $filter = '';

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2Beta1\Dlp::initOnce();
        parent::__construct();
    }

    /**
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to CreateInspectOperation.
     * Should be in the format of `inspect/results/{id}.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to CreateInspectOperation.
     * Should be in the format of `inspect/results/{id}.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;
    }

    /**
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
     * @param int $var
     */
    public function setPageSize($var)
    {
        GPBUtil::checkInt32($var);
        $this->page_size = $var;
    }

    /**
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @param string $var
     */
    public function setPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->page_token = $var;
    }

    /**
     * Restricts findings to items that match. Supports info_type and likelihood.
     * <p>Examples:<br/>
     * <li>info_type=EMAIL_ADDRESS
     * <li>info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * <li>likelihood=VERY_LIKELY
     * <li>likelihood=VERY_LIKELY,LIKELY
     * <li>info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     *
     * Generated from protobuf field <code>string filter = 4;</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * Restricts findings to items that match. Supports info_type and likelihood.
     * <p>Examples:<br/>
     * <li>info_type=EMAIL_ADDRESS
     * <li>info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * <li>likelihood=VERY_LIKELY
     * <li>likelihood=VERY_LIKELY,LIKELY
     * <li>info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     *
     * Generated from protobuf field <code>string filter = 4;</code>
     * @param string $var
     */
    public function setFilter($var)
    {
        GPBUtil::checkString($var, True);
        $this->filter = $var;
    }

}

