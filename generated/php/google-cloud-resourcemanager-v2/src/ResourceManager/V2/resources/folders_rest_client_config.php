<?php

return [
    'interfaces' => [
        'google.cloud.resourcemanager.v2.Folders' => [
            'ListFolders' => [
                'method' => 'get',
                'uriTemplate' => '/v2/folders',
            ],
            'SearchFolders' => [
                'method' => 'post',
                'uriTemplate' => '/v2/folders:search',
                'body' => '*',
            ],
            'GetFolder' => [
                'method' => 'get',
                'uriTemplate' => '/v2/{name=folders/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CreateFolder' => [
                'method' => 'post',
                'uriTemplate' => '/v2/folders',
                'body' => 'folder',
            ],
            'UpdateFolder' => [
                'method' => 'patch',
                'uriTemplate' => '/v2/{folder.name=folders/*}',
                'body' => 'folder',
                'placeholders' => [
                    'folder.name' => [
                        'getters' => [
                            'getFolder',
                            'getName',
                        ],
                    ],
                ],
            ],
            'MoveFolder' => [
                'method' => 'post',
                'uriTemplate' => '/v2/{name=folders/*}:move',
                'body' => '*',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'DeleteFolder' => [
                'method' => 'delete',
                'uriTemplate' => '/v2/{name=folders/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'UndeleteFolder' => [
                'method' => 'post',
                'uriTemplate' => '/v2/{name=folders/*}:undelete',
                'body' => '*',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'GetIamPolicy' => [
                'method' => 'post',
                'uriTemplate' => '/v2/{resource=folders/*}:getIamPolicy',
                'body' => '*',
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
            'SetIamPolicy' => [
                'method' => 'post',
                'uriTemplate' => '/v2/{resource=folders/*}:setIamPolicy',
                'body' => '*',
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
            'TestIamPermissions' => [
                'method' => 'post',
                'uriTemplate' => '/v2/{resource=folders/*}:testIamPermissions',
                'body' => '*',
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
