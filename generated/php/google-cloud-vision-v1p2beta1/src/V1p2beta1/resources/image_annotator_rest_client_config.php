<?php

return [
    'interfaces' => [
        'google.cloud.vision.v1p2beta1.ImageAnnotator' => [
            'BatchAnnotateImages' => [
                'method' => 'post',
                'uriTemplate' => '/v1p2beta1/images:annotate',
                'body' => '*',
            ],
            'AsyncBatchAnnotateFiles' => [
                'method' => 'post',
                'uriTemplate' => '/v1p2beta1/files:asyncBatchAnnotate',
                'body' => '*',
            ],
        ],
    ],
];
