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
var through2 = require('through2');

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

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
      var name2 = 'name2-1052831874';
      var expectedResponse = {
          name : name2
      };

      // Mock Grpc layer
      client._createTopic = mockSimpleGrpcMethod(request, expectedResponse);

      client.createTopic(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createTopic with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedName = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._createTopic = mockSimpleGrpcMethod(request, null, error);

      client.createTopic(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._publish = mockSimpleGrpcMethod(request, expectedResponse);

      client.publish(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes publish with error', function(done) {
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

      // Mock Grpc layer
      client._publish = mockSimpleGrpcMethod(request, null, error);

      client.publish(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._getTopic = mockSimpleGrpcMethod(request, expectedResponse);

      client.getTopic(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getTopic with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock Grpc layer
      client._getTopic = mockSimpleGrpcMethod(request, null, error);

      client.getTopic(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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

    it('invokes listTopics with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock Grpc layer
      client._listTopics = mockSimpleGrpcMethod(request, null, error);

      client.listTopics(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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

    it('invokes listTopicSubscriptions with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock Grpc layer
      client._listTopicSubscriptions = mockSimpleGrpcMethod(request, null, error);

      client.listTopicSubscriptions(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._deleteTopic = mockSimpleGrpcMethod(request);

      client.deleteTopic(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteTopic with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          topic : formattedTopic
      };

      // Mock Grpc layer
      client._deleteTopic = mockSimpleGrpcMethod(request, null, error);

      client.deleteTopic(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._setIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.setIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes setIamPolicy with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock Grpc layer
      client._setIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.setIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._getIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.getIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getIamPolicy with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          resource : formattedResource
      };

      // Mock Grpc layer
      client._getIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.getIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._testIamPermissions = mockSimpleGrpcMethod(request, expectedResponse);

      client.testIamPermissions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes testIamPermissions with error', function(done) {
      var client = pubsubV1.publisherClient();
      // Mock request
      var formattedResource = client.topicPath("[PROJECT]", "[TOPIC]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock Grpc layer
      client._testIamPermissions = mockSimpleGrpcMethod(request, null, error);

      client.testIamPermissions(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      var name2 = 'name2-1052831874';
      var topic2 = 'topic2-1139259102';
      var ackDeadlineSeconds = 2135351438;
      var retainAckedMessages = false;
      var expectedResponse = {
          name : name2,
          topic : topic2,
          ackDeadlineSeconds : ackDeadlineSeconds,
          retainAckedMessages : retainAckedMessages
      };

      // Mock Grpc layer
      client._createSubscription = mockSimpleGrpcMethod(request, expectedResponse);

      client.createSubscription(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createSubscription with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedName = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var formattedTopic = client.topicPath("[PROJECT]", "[TOPIC]");
      var request = {
          name : formattedName,
          topic : formattedTopic
      };

      // Mock Grpc layer
      client._createSubscription = mockSimpleGrpcMethod(request, null, error);

      client.createSubscription(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      var retainAckedMessages = false;
      var expectedResponse = {
          name : name,
          topic : topic,
          ackDeadlineSeconds : ackDeadlineSeconds,
          retainAckedMessages : retainAckedMessages
      };

      // Mock Grpc layer
      client._getSubscription = mockSimpleGrpcMethod(request, expectedResponse);

      client.getSubscription(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getSubscription with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock Grpc layer
      client._getSubscription = mockSimpleGrpcMethod(request, null, error);

      client.getSubscription(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('updateSubscription', function() {
    it('invokes updateSubscription without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var subscription = {};
      var updateMask = {};
      var request = {
          subscription : subscription,
          updateMask : updateMask
      };

      // Mock response
      var name = 'name3373707';
      var topic = 'topic110546223';
      var ackDeadlineSeconds = 2135351438;
      var retainAckedMessages = false;
      var expectedResponse = {
          name : name,
          topic : topic,
          ackDeadlineSeconds : ackDeadlineSeconds,
          retainAckedMessages : retainAckedMessages
      };

      // Mock Grpc layer
      client._updateSubscription = mockSimpleGrpcMethod(request, expectedResponse);

      client.updateSubscription(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes updateSubscription with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var subscription = {};
      var updateMask = {};
      var request = {
          subscription : subscription,
          updateMask : updateMask
      };

      // Mock Grpc layer
      client._updateSubscription = mockSimpleGrpcMethod(request, null, error);

      client.updateSubscription(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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

    it('invokes listSubscriptions with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock Grpc layer
      client._listSubscriptions = mockSimpleGrpcMethod(request, null, error);

      client.listSubscriptions(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._deleteSubscription = mockSimpleGrpcMethod(request);

      client.deleteSubscription(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteSubscription with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock Grpc layer
      client._deleteSubscription = mockSimpleGrpcMethod(request, null, error);

      client.deleteSubscription(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._modifyAckDeadline = mockSimpleGrpcMethod(request);

      client.modifyAckDeadline(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes modifyAckDeadline with error', function(done) {
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
      client._modifyAckDeadline = mockSimpleGrpcMethod(request, null, error);

      client.modifyAckDeadline(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._acknowledge = mockSimpleGrpcMethod(request);

      client.acknowledge(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes acknowledge with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var ackIds = [];
      var request = {
          subscription : formattedSubscription,
          ackIds : ackIds
      };

      // Mock Grpc layer
      client._acknowledge = mockSimpleGrpcMethod(request, null, error);

      client.acknowledge(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._pull = mockSimpleGrpcMethod(request, expectedResponse);

      client.pull(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes pull with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var maxMessages = 496131527;
      var request = {
          subscription : formattedSubscription,
          maxMessages : maxMessages
      };

      // Mock Grpc layer
      client._pull = mockSimpleGrpcMethod(request, null, error);

      client.pull(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('streamingPull', function() {
    it('invokes streamingPull without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var streamAckDeadlineSeconds = 1875467245;
      var request = {
          subscription : formattedSubscription,
          streamAckDeadlineSeconds : streamAckDeadlineSeconds
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._streamingPull = mockBidiStreamingGrpcMethod(request, expectedResponse);

      var stream = client.streamingPull().on('data', function(response) {
        assert.deepStrictEqual(response, expectedResponse);
        done()
      }).on('error', function(err) {
        done(err);
      });

      stream.write(request);
    });

    it('invokes streamingPull with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var streamAckDeadlineSeconds = 1875467245;
      var request = {
          subscription : formattedSubscription,
          streamAckDeadlineSeconds : streamAckDeadlineSeconds
      };

      // Mock Grpc layer
      client._streamingPull = mockBidiStreamingGrpcMethod(request, null, error);

      var stream = client.streamingPull().on('data', function(response) {
        assert.fail();
      }).on('error', function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });

      stream.write(request);
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
      client._modifyPushConfig = mockSimpleGrpcMethod(request);

      client.modifyPushConfig(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes modifyPushConfig with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var pushConfig = {};
      var request = {
          subscription : formattedSubscription,
          pushConfig : pushConfig
      };

      // Mock Grpc layer
      client._modifyPushConfig = mockSimpleGrpcMethod(request, null, error);

      client.modifyPushConfig(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listSnapshots', function() {
    it('invokes listSnapshots without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock response
      var nextPageToken = '';
      var snapshotsElement = {};
      var snapshots = [snapshotsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          snapshots : snapshots
      };

      // Mock Grpc layer
      client._listSnapshots = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.snapshots);
      };

      client.listSnapshots(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.snapshots);
        done();
      });
    });

    it('invokes listSnapshots with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedProject = client.projectPath("[PROJECT]");
      var request = {
          project : formattedProject
      };

      // Mock Grpc layer
      client._listSnapshots = mockSimpleGrpcMethod(request, null, error);

      client.listSnapshots(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createSnapshot', function() {
    it('invokes createSnapshot without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedName = client.snapshotPath("[PROJECT]", "[SNAPSHOT]");
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          name : formattedName,
          subscription : formattedSubscription
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var topic = 'topic110546223';
      var expectedResponse = {
          name : name2,
          topic : topic
      };

      // Mock Grpc layer
      client._createSnapshot = mockSimpleGrpcMethod(request, expectedResponse);

      client.createSnapshot(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createSnapshot with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedName = client.snapshotPath("[PROJECT]", "[SNAPSHOT]");
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          name : formattedName,
          subscription : formattedSubscription
      };

      // Mock Grpc layer
      client._createSnapshot = mockSimpleGrpcMethod(request, null, error);

      client.createSnapshot(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deleteSnapshot', function() {
    it('invokes deleteSnapshot without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSnapshot = client.snapshotPath("[PROJECT]", "[SNAPSHOT]");
      var request = {
          snapshot : formattedSnapshot
      };

      // Mock Grpc layer
      client._deleteSnapshot = mockSimpleGrpcMethod(request);

      client.deleteSnapshot(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteSnapshot with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSnapshot = client.snapshotPath("[PROJECT]", "[SNAPSHOT]");
      var request = {
          snapshot : formattedSnapshot
      };

      // Mock Grpc layer
      client._deleteSnapshot = mockSimpleGrpcMethod(request, null, error);

      client.deleteSnapshot(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('seek', function() {
    it('invokes seek without error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._seek = mockSimpleGrpcMethod(request, expectedResponse);

      client.seek(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes seek with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedSubscription = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          subscription : formattedSubscription
      };

      // Mock Grpc layer
      client._seek = mockSimpleGrpcMethod(request, null, error);

      client.seek(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._setIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.setIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes setIamPolicy with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var policy = {};
      var request = {
          resource : formattedResource,
          policy : policy
      };

      // Mock Grpc layer
      client._setIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.setIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._getIamPolicy = mockSimpleGrpcMethod(request, expectedResponse);

      client.getIamPolicy(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getIamPolicy with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var request = {
          resource : formattedResource
      };

      // Mock Grpc layer
      client._getIamPolicy = mockSimpleGrpcMethod(request, null, error);

      client.getIamPolicy(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
      client._testIamPermissions = mockSimpleGrpcMethod(request, expectedResponse);

      client.testIamPermissions(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes testIamPermissions with error', function(done) {
      var client = pubsubV1.subscriberClient();
      // Mock request
      var formattedResource = client.subscriptionPath("[PROJECT]", "[SUBSCRIPTION]");
      var permissions = [];
      var request = {
          resource : formattedResource,
          permissions : permissions
      };

      // Mock Grpc layer
      client._testIamPermissions = mockSimpleGrpcMethod(request, null, error);

      client.testIamPermissions(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
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
