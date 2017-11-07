<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/bigtable_table_admin.proto

namespace Google\Bigtable\Admin\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request message for
 * [google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies][google.bigtable.admin.v2.BigtableTableAdmin.ModifyColumnFamilies]
 *
 * Generated from protobuf message <code>google.bigtable.admin.v2.ModifyColumnFamiliesRequest</code>
 */
class ModifyColumnFamiliesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The unique name of the table whose families should be modified.
     * Values are of the form
     * `projects/<project>/instances/<instance>/tables/<table>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * Modifications to be atomically applied to the specified table's families.
     * Entries are applied in order, meaning that earlier modifications can be
     * masked by later ones (in the case of repeated updates to the same family,
     * for example).
     *
     * Generated from protobuf field <code>repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2;</code>
     */
    private $modifications;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\Admin\V2\BigtableTableAdmin::initOnce();
        parent::__construct();
    }

    /**
     * The unique name of the table whose families should be modified.
     * Values are of the form
     * `projects/<project>/instances/<instance>/tables/<table>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The unique name of the table whose families should be modified.
     * Values are of the form
     * `projects/<project>/instances/<instance>/tables/<table>`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Modifications to be atomically applied to the specified table's families.
     * Entries are applied in order, meaning that earlier modifications can be
     * masked by later ones (in the case of repeated updates to the same family,
     * for example).
     *
     * Generated from protobuf field <code>repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getModifications()
    {
        return $this->modifications;
    }

    /**
     * Modifications to be atomically applied to the specified table's families.
     * Entries are applied in order, meaning that earlier modifications can be
     * masked by later ones (in the case of repeated updates to the same family,
     * for example).
     *
     * Generated from protobuf field <code>repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2;</code>
     * @param \Google\Bigtable\Admin\V2\ModifyColumnFamiliesRequest_Modification[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setModifications($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Bigtable\Admin\V2\ModifyColumnFamiliesRequest_Modification::class);
        $this->modifications = $arr;

        return $this;
    }

}

