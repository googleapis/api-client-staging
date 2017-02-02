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
var through2 = require('through2');

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('SpeechClient', function() {
  describe('syncRecognize', function() {
    it('invokes syncRecognize without error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var encoding = speechV1beta1.RecognitionConfig.AudioEncoding.FLAC;
      var sampleRate = 44100;
      var config = {
          encoding : encoding,
          sampleRate : sampleRate
      };
      var uri = 'gs://bucket_name/file_name.flac';
      var audio = {
          uri : uri
      };
      var request = {
          config : config,
          audio : audio
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._syncRecognize = mockSimpleGrpcMethod(request, expectedResponse);

      client.syncRecognize(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes syncRecognize with error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var encoding = speechV1beta1.RecognitionConfig.AudioEncoding.FLAC;
      var sampleRate = 44100;
      var config = {
          encoding : encoding,
          sampleRate : sampleRate
      };
      var uri = 'gs://bucket_name/file_name.flac';
      var audio = {
          uri : uri
      };
      var request = {
          config : config,
          audio : audio
      };

      // Mock Grpc layer
      client._syncRecognize = mockSimpleGrpcMethod(request, null, error);

      client.syncRecognize(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('asyncRecognize', function() {
    it('invokes asyncRecognize without error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var encoding = speechV1beta1.RecognitionConfig.AudioEncoding.FLAC;
      var sampleRate = 44100;
      var config = {
          encoding : encoding,
          sampleRate : sampleRate
      };
      var uri = 'gs://bucket_name/file_name.flac';
      var audio = {
          uri : uri
      };
      var request = {
          config : config,
          audio : audio
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._asyncRecognize = mockLongRunningGrpcMethod(request, expectedResponse);

      client.asyncRecognize(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.deepStrictEqual(responses[0], expectedResponse);
        done();
      }).catch(function(err) {
        done(err);
      });
    });

    it('invokes asyncRecognize with error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var encoding = speechV1beta1.RecognitionConfig.AudioEncoding.FLAC;
      var sampleRate = 44100;
      var config = {
          encoding : encoding,
          sampleRate : sampleRate
      };
      var uri = 'gs://bucket_name/file_name.flac';
      var audio = {
          uri : uri
      };
      var request = {
          config : config,
          audio : audio
      };

      // Mock Grpc layer
      client._asyncRecognize = mockLongRunningGrpcMethod(request, null, error);

      client.asyncRecognize(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.fail();
      }).catch(function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('streamingRecognize', function() {
    it('invokes streamingRecognize without error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var request = {};

      // Mock response
      var resultIndex = 520358448;
      var expectedResponse = {
          resultIndex : resultIndex
      };

      // Mock Grpc layer
      client._streamingRecognize = mockBidiStreamingGrpcMethod(request, expectedResponse);

      var stream = client.streamingRecognize().on('data', function(response) {
        assert.deepStrictEqual(response, expectedResponse);
        done()
      }).on('error', function(err) {
        done(err);
      });

      stream.write(request);
    });

    it('invokes streamingRecognize with error', function(done) {
      var client = speechV1beta1.speechClient();
      // Mock request
      var request = {};

      // Mock Grpc layer
      client._streamingRecognize = mockBidiStreamingGrpcMethod(request, null, error);

      var stream = client.streamingRecognize().on('data', function(response) {
        assert.fail();
      }).on('error', function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });

      stream.write(request);
    });
  });

});

function mockSimpleGrpcMethod(expectedRequest, response, error) {
  return function(actualRequest, options, callback) {
    assert.deepStrictEqual(actualRequest, expectedRequest);
    if (error) {
      callback(error);
    } else if (response) {
      callback(null, response);
    } else {
      callback(null);
    }
  };
}

function mockBidiStreamingGrpcMethod(expectedRequest, response, error) {
  return function() {
    var mockStream = through2.obj(function (chunk, enc, callback) {
      assert.deepStrictEqual(chunk, expectedRequest);
      if (error) {
        callback(error);
      } else {
        callback(null, response);
      }
    });
    return mockStream;
  }
}

function mockLongRunningGrpcMethod(expectedRequest, response, error) {
  return function(request) {
    assert.deepStrictEqual(request, expectedRequest);
    var mockOperation = {
      promise: function() {
        return new Promise(function(resolve, reject) {
          if (error) {
            reject(error)
          } else {
            resolve([response]);
          }
        });
      }
    };
    return Promise.resolve([mockOperation]);
  };
}
