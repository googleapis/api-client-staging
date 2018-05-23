<?php

return [
    'interfaces' => [
        'google.devtools.remoteworkers.v1test2.Tasks' => [
            'GetTask' => [
                'method' => 'get',
                'uriTemplate' => '/v1test2/{name=**/tasks/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'UpdateTaskResult' => [
                'method' => 'patch',
                'uriTemplate' => '/v1test2/{name=**/tasks/*/result}',
                'body' => 'result',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'AddTaskLog' => [
                'method' => 'post',
                'uriTemplate' => '/v1test2/{name=**/tasks/*}:addLog',
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
