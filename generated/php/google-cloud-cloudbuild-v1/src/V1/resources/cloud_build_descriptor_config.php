<?php

return [
    'interfaces' => [
        'google.devtools.cloudbuild.v1.CloudBuild' => [
            'ListBuilds' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getBuilds',
                ],
            ],
        ],
    ],
];
