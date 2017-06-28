<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/database/v1/spanner_database_admin.proto

namespace Google\Spanner\Admin\Database\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The response for [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases].
 *
 * Protobuf type <code>Google\Spanner\Admin\Database\V1\ListDatabasesResponse</code>
 */
class ListDatabasesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Databases that matched the request.
     *
     * Generated from protobuf field <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    private $databases;
    /**
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     */
    private $next_page_token = '';

    public function __construct() {
        \GPBMetadata\Google\Spanner\Admin\Database\V1\SpannerDatabaseAdmin::initOnce();
        parent::__construct();
    }

    /**
     * Databases that matched the request.
     *
     * Generated from protobuf field <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDatabases()
    {
        return $this->databases;
    }

    /**
     * Databases that matched the request.
     *
     * Generated from protobuf field <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     * @param array|\Google\Protobuf\Internal\RepeatedField $var
     */
    public function setDatabases(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Spanner\Admin\Database\V1\Database::class);
        $this->databases = $arr;
    }

    /**
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @param string $var
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;
    }

}

