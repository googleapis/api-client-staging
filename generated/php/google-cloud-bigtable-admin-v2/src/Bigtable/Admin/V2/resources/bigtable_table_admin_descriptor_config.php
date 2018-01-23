<?php

return [
    'interfaces' => [
        'google.bigtable.admin.v2.BigtableTableAdmin' => [
            'CreateTableFromSnapshot' => [
                'longRunning' => [
                    'operationReturnType' => '\Google\Cloud\Bigtable\Admin\V2\Table',
                    'metadataReturnType' => '\Google\Cloud\Bigtable\Admin\V2\CreateTableFromSnapshotMetadata',
                ],
            ],
            'ListTables' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getTables',
                ],
            ],
            'ListSnapshots' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getSnapshots',
                ],
            ],
        ],
    ],
];
