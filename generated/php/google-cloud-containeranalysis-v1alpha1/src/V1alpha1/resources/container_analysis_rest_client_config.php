<?php

return [
    'interfaces' => [
        'google.devtools.containeranalysis.v1alpha1.ContainerAnalysis' => [
            'GetOccurrence' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{name=projects/*/occurrences/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListOccurrences' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{parent=projects/*}/occurrences',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'DeleteOccurrence' => [
                'method' => 'delete',
                'uriTemplate' => '/v1alpha1/{name=projects/*/occurrences/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CreateOccurrence' => [
                'method' => 'post',
                'uriTemplate' => '/v1alpha1/{parent=projects/*}/occurrences',
                'body' => 'occurrence',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'UpdateOccurrence' => [
                'method' => 'patch',
                'uriTemplate' => '/v1alpha1/{name=projects/*/occurrences/*}',
                'body' => 'occurrence',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'GetOccurrenceNote' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{name=projects/*/occurrences/*}/notes',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'GetNote' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{name=projects/*/notes/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListNotes' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{parent=projects/*}/notes',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'DeleteNote' => [
                'method' => 'delete',
                'uriTemplate' => '/v1alpha1/{name=projects/*/notes/*}',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'CreateNote' => [
                'method' => 'post',
                'uriTemplate' => '/v1alpha1/{parent=projects/*}/notes',
                'body' => 'note',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'UpdateNote' => [
                'method' => 'patch',
                'uriTemplate' => '/v1alpha1/{name=projects/*/notes/*}',
                'body' => 'note',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'ListNoteOccurrences' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{name=projects/*/notes/*}/occurrences',
                'placeholders' => [
                    'name' => [
                        'getters' => [
                            'getName',
                        ],
                    ],
                ],
            ],
            'GetVulnzOccurrencesSummary' => [
                'method' => 'get',
                'uriTemplate' => '/v1alpha1/{parent=projects/*}/occurrences:vulnerabilitySummary',
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ],
            ],
            'SetIamPolicy' => [
                'method' => 'post',
                'uriTemplate' => '/v1alpha1/{resource=projects/*/notes/*}:setIamPolicy',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1alpha1/{resource=projects/*/occurrences/*}:setIamPolicy',
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
                'uriTemplate' => '/v1alpha1/{resource=projects/*/notes/*}:getIamPolicy',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1alpha1/{resource=projects/*/occurrences/*}:getIamPolicy',
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
                'uriTemplate' => '/v1alpha1/{resource=projects/*/notes/*}:testIamPermissions',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v1alpha1/{resource=projects/*/occurrences/*}:testIamPermissions',
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
    ],
];
