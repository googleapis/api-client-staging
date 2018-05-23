<?php

return [
    'interfaces' => [
        'google.streetview.publish.v1.StreetViewPublishService' => [
            'StartUpload' => [
                'method' => 'post',
                'uriTemplate' => '/v1/photo:startUpload',
                'body' => '*',
            ],
            'CreatePhoto' => [
                'method' => 'post',
                'uriTemplate' => '/v1/photo',
                'body' => 'photo',
            ],
            'GetPhoto' => [
                'method' => 'get',
                'uriTemplate' => '/v1/photo/{photo_id}',
                'placeholders' => [
                    'photo_id' => [
                        'getters' => [
                            'getPhotoId',
                        ],
                    ],
                ],
            ],
            'BatchGetPhotos' => [
                'method' => 'get',
                'uriTemplate' => '/v1/photos:batchGet',
            ],
            'ListPhotos' => [
                'method' => 'get',
                'uriTemplate' => '/v1/photos',
            ],
            'UpdatePhoto' => [
                'method' => 'put',
                'uriTemplate' => '/v1/photo/{photo.photo_id.id}',
                'body' => 'photo',
                'placeholders' => [
                    'photo.photo_id.id' => [
                        'getters' => [
                            'getPhoto',
                            'getPhotoId',
                            'getId',
                        ],
                    ],
                ],
            ],
            'BatchUpdatePhotos' => [
                'method' => 'post',
                'uriTemplate' => '/v1/photos:batchUpdate',
                'body' => '*',
            ],
            'DeletePhoto' => [
                'method' => 'delete',
                'uriTemplate' => '/v1/photo/{photo_id}',
                'placeholders' => [
                    'photo_id' => [
                        'getters' => [
                            'getPhotoId',
                        ],
                    ],
                ],
            ],
            'BatchDeletePhotos' => [
                'method' => 'post',
                'uriTemplate' => '/v1/photos:batchDelete',
                'body' => '*',
            ],
        ],
    ],
];
