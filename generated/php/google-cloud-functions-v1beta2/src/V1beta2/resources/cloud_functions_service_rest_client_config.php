<?php

return [
    'interfaces' => [
        'google.cloud.functions.v1beta2.CloudFunctionsService' => [
            'ListFunctions' => [
                'method' => 'get',
                'uriTemplate' => '/v1beta2/{location=projects/*/locations/*}/functions',
                'placeholders' => [
                    'location' => [
                        'getters' => [
                            'getLocation',
                        ],
                    ],
                ],
            ],
            'GetFunction' => [
                'method' => 'get',
                'uriTemplate' => '/v1beta2/{name=projects/*/locations/*/functions/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CreateFunction' => [
                'method' => 'post',
                'uriTemplate' => '/v1beta2/{location=projects/*/locations/*}/functions',
                'body' => 'function',
                'placeholders' => [
                    'location' => [
                        'getters' => [
                            'getLocation',
                        ],
                    ],
                ],
            ],
            'UpdateFunction' => [
                'method' => 'put',
                'uriTemplate' => '/v1beta2/{name=projects/*/locations/*/functions/*}',
                'body' => 'function',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'DeleteFunction' => [
                'method' => 'delete',
                'uriTemplate' => '/v1beta2/{name=projects/*/locations/*/functions/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CallFunction' => [
                'method' => 'post',
                'uriTemplate' => '/v1beta2/{name=projects/*/locations/*/functions/*}:call',
                'body' => '*',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
