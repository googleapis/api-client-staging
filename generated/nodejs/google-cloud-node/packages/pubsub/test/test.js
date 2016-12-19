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
var pubsubV1 = require('../src/').v1();

describe('PublisherClient', function() {
  describe('createTopic', function() {
    it('invokes createTopic without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedName = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          name : formattedName
      };

      // Mock response
      var formattedName2 = client.topicPath("[PROJECT]", "[TOPIC]");
      var expectedResponse = {
          name : formattedName2
      };

      // Mock Grpc layer
      client._createTopic = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createTopic(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('publish', function() {
    it('invokes publish without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var data = '-86';
      var messagesElement = {
          data : data
      };
      var messages = [messagesElement];
      var request = {
          topic : formattedTopic,
          messages : messages
      };

      // Mock response
      var messageIdsElement = 'messageIdsElement-744837059';
      var messageIds = [messageIdsElement];
      var expectedResponse = {
          messageIds : messageIds
      };

      // Mock Grpc layer
      client._publish = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.publish(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('getTopic', function() {
    it('invokes getTopic without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock response
      var name = 'name3373707';
      var expectedResponse = {
          name : name
      };

      // Mock Grpc layer
      client._getTopic = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getTopic(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('listTopics', function() {
    it('invokes listTopics without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock response
      var nextPageToken = '';
      var topicsElement = {};
      var topics = [topicsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          topics : topics
      };

      // Mock Grpc layer
      client._listTopics = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.topics);
      };

      client.listTopics(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.topics);
        done();
      });
    });
  });

  describe('listTopicSubscriptions', function() {
    it('invokes listTopicSubscriptions without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock response
      var nextPageToken = '';
      var subscriptionsElement = 'subscriptionsElement1698708147';
      var subscriptions = [subscriptionsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          subscriptions : subscriptions
      };

      // Mock Grpc layer
      client._listTopicSubscriptions = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.subscriptions);
      };

      client.listTopicSubscriptions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.subscriptions);
        done();
      });
    });
  });

  describe('deleteTopic', function() {
    it('invokes deleteTopic without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock Grpc layer
      client._deleteTopic = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteTopic(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('setIamPolicy', function() {
    it('invokes setIamPolicy without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._setIamPolicy = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.setIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('getIamPolicy', function() {
    it('invokes getIamPolicy without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          resource : formattedResource
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._getIamPolicy = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('testIamPermissions', function() {
    it('invokes testIamPermissions without error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._testIamPermissions = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.testIamPermissions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

});
describe('SubscriberClient', function() {
  describe('createSubscription', function() {
    it('invokes createSubscription without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedName = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          name : formattedName,
          topic : formattedTopic
      };

      // Mock response
      var formattedName2 = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var formattedTopic2 = client.topicPath("[PROJECT]", "[TOPIC]");
      var ackDeadlineSeconds = 2135351438;
      var expectedResponse = {
          name : formattedName2,
          topic : formattedTopic2,
          ackDeadlineSeconds : ackDeadlineSeconds
      };

      // Mock Grpc layer
      client._createSubscription = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.createSubscription(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('getSubscription', function() {
    it('invokes getSubscription without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock response
      var name = 'name3373707';
      var topic = 'topic110546223';
      var ackDeadlineSeconds = 2135351438;
      var expectedResponse = {
          name : name,
          topic : topic,
          ackDeadlineSeconds : ackDeadlineSeconds
      };

      // Mock Grpc layer
      client._getSubscription = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getSubscription(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('listSubscriptions', function() {
    it('invokes listSubscriptions without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock response
      var nextPageToken = '';
      var subscriptionsElement = {};
      var subscriptions = [subscriptionsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          subscriptions : subscriptions
      };

      // Mock Grpc layer
      client._listSubscriptions = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.subscriptions);
      };

      client.listSubscriptions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.subscriptions);
        done();
      });
    });
  });

  describe('deleteSubscription', function() {
    it('invokes deleteSubscription without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock Grpc layer
      client._deleteSubscription = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.deleteSubscription(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('modifyAckDeadline', function() {
    it('invokes modifyAckDeadline without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var ackIds = [];
      var ackDeadlineSeconds = 2135351438;
      var request = {
          subscription : formattedSubscription,
          ackIds : ackIds,
          ackDeadlineSeconds : ackDeadlineSeconds
      };

      // Mock Grpc layer
      client._modifyAckDeadline = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.modifyAckDeadline(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('acknowledge', function() {
    it('invokes acknowledge without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var ackIds = [];
      var request = {
          subscription : formattedSubscription,
          ackIds : ackIds
      };

      // Mock Grpc layer
      client._acknowledge = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.acknowledge(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('pull', function() {
    it('invokes pull without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var maxMessages = 496131527;
      var request = {
          subscription : formattedSubscription,
          maxMessages : maxMessages
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._pull = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.pull(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('modifyPushConfig', function() {
    it('invokes modifyPushConfig without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var pushConfig = {};
      var request = {
          subscription : formattedSubscription,
          pushConfig : pushConfig
      };

      // Mock Grpc layer
      client._modifyPushConfig = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null);
      };

      client.modifyPushConfig(request, function(err) {
        assert.ifError(err);
        done();
      });
    });
  });

  describe('setIamPolicy', function() {
    it('invokes setIamPolicy without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._setIamPolicy = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.setIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('getIamPolicy', function() {
    it('invokes getIamPolicy without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          resource : formattedResource
      };

      // Mock response
      var version = 351608024;
      var etag = '21';
      var expectedResponse = {
          version : version,
          etag : etag
      };

      // Mock Grpc layer
      client._getIamPolicy = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.getIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

  describe('testIamPermissions', function() {
    it('invokes testIamPermissions without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._testIamPermissions = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse);
      };

      client.testIamPermissions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });
  });

});
