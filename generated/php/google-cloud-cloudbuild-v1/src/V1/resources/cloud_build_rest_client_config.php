<?php

return [
    'interfaces' => [
        'google.devtools.cloudbuild.v1.CloudBuild' => [
            'CreateBuild' => [
                'method' => 'post',
                'uriTemplate' => '/v1/projects/{project_id}/builds',
                'body' => 'build',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
            'GetBuild' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/builds/{id}',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'id' => [
                        'getters' => [
                            'getId',
                        ],
                    ],
                ],
            ],
            'ListBuilds' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/builds',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
            'CancelBuild' => [
                'method' => 'post',
                'uriTemplate' => '/v1/projects/{project_id}/builds/{id}:cancel',
                'body' => '*',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'id' => [
                        'getters' => [
                            'getId',
                        ],
                    ],
                ],
            ],
            'CreateBuildTrigger' => [
                'method' => 'post',
                'uriTemplate' => '/v1/projects/{project_id}/triggers',
                'body' => 'trigger',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
            'GetBuildTrigger' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/triggers/{trigger_id}',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'trigger_id' => [
                        'getters' => [
                            'getTriggerId',
                        ],
                    ],
                ],
            ],
            'ListBuildTriggers' => [
                'method' => 'get',
                'uriTemplate' => '/v1/projects/{project_id}/triggers',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                ],
            ],
            'DeleteBuildTrigger' => [
                'method' => 'delete',
                'uriTemplate' => '/v1/projects/{project_id}/triggers/{trigger_id}',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'trigger_id' => [
                        'getters' => [
                            'getTriggerId',
                        ],
                    ],
                ],
            ],
            'UpdateBuildTrigger' => [
                'method' => 'patch',
                'uriTemplate' => '/v1/projects/{project_id}/triggers/{trigger_id}',
                'body' => 'trigger',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'trigger_id' => [
                        'getters' => [
                            'getTriggerId',
                        ],
                    ],
                ],
            ],
            'RunBuildTrigger' => [
                'method' => 'post',
                'uriTemplate' => '/v1/projects/{project_id}/triggers/{trigger_id}:run',
                'body' => 'source',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'trigger_id' => [
                        'getters' => [
                            'getTriggerId',
                        ],
                    ],
                ],
            ],
            'RetryBuild' => [
                'method' => 'post',
                'uriTemplate' => '/v1/projects/{project_id}/builds/{id}:retry',
                'body' => '*',
                'placeholders' => [
                    'project_id' => [
                        'getters' => [
                            'getProjectId',
                        ],
                    ],
                    'id' => [
                        'getters' => [
                            'getId',
                        ],
                    ],
                ],
            ],
        ],
    ],
];
