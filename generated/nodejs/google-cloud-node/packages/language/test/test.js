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
var languageV1 = require('../src/').v1();

describe('LanguageServiceClient', function() {
  describe('analyzeSentiment', function() {
    it('invokes analyzeSentiment without error', function(done) {
      var client = languageV1.languageServiceClient();
      // Mock request
      var document = {};
      var request = {
          document : document
      };

      // Mock response
      var language = 'language-1613589672';
      var expectedResponse = {
          language : language
      };

      // Mock Grpc layer
      client._analyzeSentiment = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.analyzeSentiment(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('analyzeEntities', function() {
    it('invokes analyzeEntities without error', function(done) {
      var client = languageV1.languageServiceClient();
      // Mock request
      var document = {};
      var encodingType = languageV1.EncodingType.NONE;
      var request = {
          document : document,
          encodingType : encodingType
      };

      // Mock response
      var language = 'language-1613589672';
      var expectedResponse = {
          language : language
      };

      // Mock Grpc layer
      client._analyzeEntities = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.analyzeEntities(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('analyzeSyntax', function() {
    it('invokes analyzeSyntax without error', function(done) {
      var client = languageV1.languageServiceClient();
      // Mock request
      var document = {};
      var encodingType = languageV1.EncodingType.NONE;
      var request = {
          document : document,
          encodingType : encodingType
      };

      // Mock response
      var language = 'language-1613589672';
      var expectedResponse = {
          language : language
      };

      // Mock Grpc layer
      client._analyzeSyntax = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.analyzeSyntax(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('annotateText', function() {
    it('invokes annotateText without error', function(done) {
      var client = languageV1.languageServiceClient();
      // Mock request
      var document = {};
      var features = {};
      var encodingType = languageV1.EncodingType.NONE;
      var request = {
          document : document,
          features : features,
          encodingType : encodingType
      };

      // Mock response
      var language = 'language-1613589672';
      var expectedResponse = {
          language : language
      };

      // Mock Grpc layer
      client._annotateText = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.annotateText(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

});
