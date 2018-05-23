<?php

return [
    'interfaces' => [
        'google.cloud.vision.v1p1beta1.ImageAnnotator' => [
            'BatchAnnotateImages' => [
                'method' => 'post',
                'uriTemplate' => '/v1p1beta1/images:annotate',
                'body' => '*',
            ],
        ],
    ],
];
