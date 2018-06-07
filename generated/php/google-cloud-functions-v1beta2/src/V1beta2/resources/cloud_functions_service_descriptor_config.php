<?php

return [
    'interfaces' => [
        'google.cloud.functions.v1beta2.CloudFunctionsService' => [
            'CreateFunction' => [
                'longRunning' => [
                    'operationReturnType' => '\Google\Cloud\Functions\V1beta2\CloudFunction',
                    'metadataReturnType' => '\Google\Cloud\Functions\V1beta2\OperationMetadataV1Beta2',
                    'initialPollDelayMillis' => '20000',
                    'pollDelayMultiplier' => '1.5',
                    'maxPollDelayMillis' => '45000',
                    'totalPollTimeoutMillis' => '86400000',
                ],
            ],
            'UpdateFunction' => [
                'longRunning' => [
                    'operationReturnType' => '\Google\Cloud\Functions\V1beta2\CloudFunction',
                    'metadataReturnType' => '\Google\Cloud\Functions\V1beta2\OperationMetadataV1Beta2',
                    'initialPollDelayMillis' => '20000',
                    'pollDelayMultiplier' => '1.5',
                    'maxPollDelayMillis' => '45000',
                    'totalPollTimeoutMillis' => '86400000',
                ],
            ],
            'DeleteFunction' => [
                'longRunning' => [
                    'operationReturnType' => '\Google\Protobuf\GPBEmpty',
                    'metadataReturnType' => '\Google\Cloud\Functions\V1beta2\OperationMetadataV1Beta2',
                    'initialPollDelayMillis' => '20000',
                    'pollDelayMultiplier' => '1.5',
                    'maxPollDelayMillis' => '45000',
                    'totalPollTimeoutMillis' => '86400000',
                ],
            ],
            'ListFunctions' => [
                'pageStreaming' => [
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getFunctions',
                ],
            ],
        ],
    ],
];
