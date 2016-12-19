/*
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

var assert = require('assert');
var speechV1beta1 = require('../src/').v1beta1();

describe('SpeechClient', function() {
  describe('syncRecognize', function() {
    it('invokes syncRecognize without error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var config = {};
      var audio = {};
      var request = {
          config : config,
          audio : audio
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._syncRecognize = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.syncRecognize(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('asyncRecognizeAsync', function() {
    it('invokes asyncRecognizeAsync without error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var config = {};
      var audio = {};
      var request = {
          config : config,
          audio : audio
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._asyncRecognizeAsync = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.asyncRecognizeAsync(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

});