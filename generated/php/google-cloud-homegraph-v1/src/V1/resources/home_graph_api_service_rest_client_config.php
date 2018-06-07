<?php

return [
    'interfaces' => [
        'google.home.graph.v1.HomeGraphApiService' => [
            'RequestSyncDevices' => [
                'method' => 'post',
                'uriTemplate' => '/v1/devices:requestSync',
                'body' => '*',
            ],
            'ReportStateAndNotification' => [
                'method' => 'post',
                'uriTemplate' => '/v1/devices:reportStateAndNotification',
                'body' => '*',
            ],
            'DeleteAgentUser' => [
                'method' => 'delete',
                'uriTemplate' => '/v1/{agent_user_id=agentUsers/**}',
                'placeholders' => [
                    'agent_user_id' => [
                        'getters' => [
                            'getAgentUserId',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
