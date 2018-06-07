<?php

return [
    'interfaces' => [
        'google.cloud.dialogflow.v2beta1.Intents' => [
            'ListIntents' => [
                'method' => 'get',
                'uriTemplate' => '/v2beta1/{parent=projects/*/agent}/intents',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'GetIntent' => [
                'method' => 'get',
                'uriTemplate' => '/v2beta1/{name=projects/*/agent/intents/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CreateIntent' => [
                'method' => 'post',
                'uriTemplate' => '/v2beta1/{parent=projects/*/agent}/intents',
                'body' => 'intent',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'UpdateIntent' => [
                'method' => 'patch',
                'uriTemplate' => '/v2beta1/{intent.name=projects/*/agent/intents/*}',
                'body' => 'intent',
                'placeholders' => [
                    'intent.name' => [
                        'getters' => [
                            'getIntent',
                            'getName',
                        ],
                    ],
                ],
            ],
            'DeleteIntent' => [
                'method' => 'delete',
                'uriTemplate' => '/v2beta1/{name=projects/*/agent/intents/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'BatchUpdateIntents' => [
                'method' => 'post',
                'uriTemplate' => '/v2beta1/{parent=projects/*/agent}/intents:batchUpdate',
                'body' => '*',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'BatchDeleteIntents' => [
                'method' => 'post',
                'uriTemplate' => '/v2beta1/{parent=projects/*/agent}/intents:batchDelete',
                'body' => '*',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
        ],
        'google.longrunning.Operations' => [
            'GetOperation' => [
                'method' => 'get',
                'uriTemplate' => '/v2beta1/{name=projects/*/operations/*}',
                'additionalBindings' => [
                    [
                        'method' => 'get',
                        'uriTemplate' => '/v2/{name=projects/*/operations/*}',
                    ],
                ],
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
