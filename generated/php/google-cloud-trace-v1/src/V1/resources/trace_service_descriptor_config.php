<?php

return [
    'interfaces' => [
        'google.devtools.cloudtrace.v1.TraceService' => [
            'ListTraces' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getTraces',
                ],
            ],
        ],
    ],
];
