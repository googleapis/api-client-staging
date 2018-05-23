<?php

return [
    'interfaces' => [
        'google.cloud.texttospeech.v1beta1.TextToSpeech' => [
            'ListVoices' => [
                'method' => 'get',
                'uriTemplate' => '/v1beta1/voices',
            ],
            'SynthesizeSpeech' => [
                'method' => 'post',
                'uriTemplate' => '/v1beta1/text:synthesize',
                'body' => '*',
            ],
        ],
    ],
];
