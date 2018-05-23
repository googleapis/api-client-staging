<?php

return [
    'interfaces' => [
        'google.streetview.publish.v1.StreetViewPublishService' => [
            'ListPhotos' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getPhotos',
                ],
            ],
        ],
    ],
];
