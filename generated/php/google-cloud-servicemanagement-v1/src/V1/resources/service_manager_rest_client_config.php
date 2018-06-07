<?php

return [
    'interfaces' => [
        'google.api.servicemanagement.v1.ServiceManager' => [
            'ListServices' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services',
            ],
            'GetService' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services/{service_name}',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'CreateService' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services',
                'body' => 'service',
            ],
            'DeleteService' => [
                'method' => 'delete',
                'uriTemplate' => '/v1/services/{service_name}',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'UndeleteService' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}:undelete',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'ListServiceConfigs' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services/{service_name}/configs',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'GetServiceConfig' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services/{service_name}/configs/{config_id}',
                'additionalBindings' => [
                    [
                        'method' => 'get',
                        'uriTemplate' => '/v1/services/{service_name}/config',
                    ],
                ],
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                    'config_id' => [
                        'getters' => [
                            'getConfigId',
                        ],
                    ],
                ],
            ],
            'CreateServiceConfig' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}/configs',
                'body' => 'service_config',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'SubmitConfigSource' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}/configs:submit',
                'body' => '*',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'ListServiceRollouts' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services/{service_name}/rollouts',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'GetServiceRollout' => [
                'method' => 'get',
                'uriTemplate' => '/v1/services/{service_name}/rollouts/{rollout_id}',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                    'rollout_id' => [
                        'getters' => [
                            'getRolloutId',
                        ],
                    ],
                ],
            ],
            'CreateServiceRollout' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}/rollouts',
                'body' => 'rollout',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'GenerateConfigReport' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services:generateConfigReport',
                'body' => '*',
            ],
            'EnableService' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}:enable',
                'body' => '*',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
            'DisableService' => [
                'method' => 'post',
                'uriTemplate' => '/v1/services/{service_name}:disable',
                'body' => '*',
                'placeholders' => [
                    'service_name' => [
                        'getters' => [
                            'getServiceName',
                        ],
                    ],
                ],
            ],
        ],
        'google.iam.v1.IAMPolicy' => [
            'SetIamPolicy' => [
                'method' => 'post',
                'uriTemplate' => '/v1/{resource=services/*}:setIamPolicy',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1/{resource=services/*/consumers/*}:setIamPolicy',
                        'body' => '*',
                    ],
                ],
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
            'GetIamPolicy' => [
                'method' => 'post',
                'uriTemplate' => '/v1/{resource=services/*}:getIamPolicy',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1/{resource=services/*/consumers/*}:getIamPolicy',
                        'body' => '*',
                    ],
                ],
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
            'TestIamPermissions' => [
                'method' => 'post',
                'uriTemplate' => '/v1/{resource=services/*}:testIamPermissions',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1/{resource=services/*/consumers/*}:testIamPermissions',
                        'body' => '*',
                    ],
                ],
                'placeholders' => [
                    'resource' => [
                        'getters' => [
                            'getResource',
                        ],
                    ],
                ],
            ],
        ],
        'google.longrunning.Operations' => [
            'ListOperations' => [
                'method' => 'get',
                'uriTemplate' => '/v1/operations',
            ],
        ],
    ],
];
