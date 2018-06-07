<?php

return [
    'interfaces' => [
        'google.cloud.dialogflow.v2beta1.Contexts' => [
            'ListContexts' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getContexts',
                ],
            ],
        ],
    ],
];
