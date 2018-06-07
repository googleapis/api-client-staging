<?php

return [
    'interfaces' => [
        'google.cloud.dialogflow.v2beta1.Sessions' => [
            'StreamingDetectIntent' => [
                'grpcStreaming' => [
                    'grpcStreamingType' => 'BidiStreaming',
                ],
            ],
        ],
    ],
];
