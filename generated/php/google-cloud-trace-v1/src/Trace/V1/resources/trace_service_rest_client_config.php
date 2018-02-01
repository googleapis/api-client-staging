<?php

return [
    'interfaces' => [
        'google.devtools.cloudtrace.v1.TraceService' => [
            'PatchTraces' => [
                'method' => 'patch',
                'uriTemplate' => '/v1/projects/{project_id}/traces',
                'body' => 'traces',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
            'GetTrace' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/traces/{trace_id}',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'trace_id' => [
                        'getters' => [
                            'getTraceId',
                        ],
                    ],
                ],
            ],
            'ListTraces' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/traces',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
