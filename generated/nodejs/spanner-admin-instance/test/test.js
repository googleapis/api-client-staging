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
var spannerV1 = require('../src/').v1();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('InstanceAdminClient', function() {
  describe('listInstanceConfigs', function() {
    it('invokes listInstanceConfigs without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var instanceConfigsElement = {};
      var instanceConfigs = [instanceConfigsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          instanceConfigs : instanceConfigs
      };

      // Mock Grpc layer
      client._listInstanceConfigs = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.instanceConfigs);
      };

      client.listInstanceConfigs(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.instanceConfigs);
        done();
      });
    });

    it('invokes listInstanceConfigs with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock Grpc layer
      client._listInstanceConfigs = mockSimpleGrpcMethod(request, null, error);

      client.listInstanceConfigs(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getInstanceConfig', function() {
    it('invokes getInstanceConfig without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instanceConfigPath("[PROJECT]", "[INSTANCE_CONFIG]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var displayName = 'displayName1615086568';
      var expectedResponse = {
          name : name2,
          displayName : displayName
      };

      // Mock Grpc layer
      client._getInstanceConfig = mockSimpleGrpcMethod(request, expectedResponse);

      client.getInstanceConfig(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getInstanceConfig with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instanceConfigPath("[PROJECT]", "[INSTANCE_CONFIG]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getInstanceConfig = mockSimpleGrpcMethod(request, null, error);

      client.getInstanceConfig(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listInstances', function() {
    it('invokes listInstances without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock response
      var nextPageToken = '';
      var instancesElement = {};
      var instances = [instancesElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          instances : instances
      };

      // Mock Grpc layer
      client._listInstances = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.instances);
      };

      client.listInstances(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.instances);
        done();
      });
    });

    it('invokes listInstances with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var request = {
          parent : formattedParent
      };

      // Mock Grpc layer
      client._listInstances = mockSimpleGrpcMethod(request, null, error);

      client.listInstances(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getInstance', function() {
    it('invokes getInstance without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var config = 'config-1354792126';
      var displayName = 'displayName1615086568';
      var nodeCount = 1539922066;
      var expectedResponse = {
          name : name2,
          config : config,
          displayName : displayName,
          nodeCount : nodeCount
      };

      // Mock Grpc layer
      client._getInstance = mockSimpleGrpcMethod(request, expectedResponse);

      client.getInstance(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getInstance with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getInstance = mockSimpleGrpcMethod(request, null, error);

      client.getInstance(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createInstance', function() {
    it('invokes createInstance without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var instanceId = 'instanceId-2101995259';
      var instance = {};
      var request = {
          parent : formattedParent,
          instanceId : instanceId,
          instance : instance
      };

      // Mock response
      var name = 'name3373707';
      var config = 'config-1354792126';
      var displayName = 'displayName1615086568';
      var nodeCount = 1539922066;
      var expectedResponse = {
          name : name,
          config : config,
          displayName : displayName,
          nodeCount : nodeCount
      };

      // Mock Grpc layer
      client._createInstance = mockLongRunningGrpcMethod(request, expectedResponse);

      client.createInstance(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.deepStrictEqual(responses[0], expectedResponse);
        done();
      }).catch(function(err) {
        done(err);
      });
    });

    it('invokes createInstance with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedParent = client.projectPath("[PROJECT]");
      var instanceId = 'instanceId-2101995259';
      var instance = {};
      var request = {
          parent : formattedParent,
          instanceId : instanceId,
          instance : instance
      };

      // Mock Grpc layer
      client._createInstance = mockLongRunningGrpcMethod(request, null, error);

      client.createInstance(request).then(function(responses) {
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

  describe('updateInstance', function() {
    it('invokes updateInstance without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var instance = {};
      var fieldMask = {};
      var request = {
          instance : instance,
          fieldMask : fieldMask
      };

      // Mock response
      var name = 'name3373707';
      var config = 'config-1354792126';
      var displayName = 'displayName1615086568';
      var nodeCount = 1539922066;
      var expectedResponse = {
          name : name,
          config : config,
          displayName : displayName,
          nodeCount : nodeCount
      };

      // Mock Grpc layer
      client._updateInstance = mockLongRunningGrpcMethod(request, expectedResponse);

      client.updateInstance(request).then(function(responses) {
        var operation = responses[0];
        return operation.promise();
      }).then(function(responses) {
        assert.deepStrictEqual(responses[0], expectedResponse);
        done();
      }).catch(function(err) {
        done(err);
      });
    });

    it('invokes updateInstance with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var instance = {};
      var fieldMask = {};
      var request = {
          instance : instance,
          fieldMask : fieldMask
      };

      // Mock Grpc layer
      client._updateInstance = mockLongRunningGrpcMethod(request, null, error);

      client.updateInstance(request).then(function(responses) {
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

  describe('deleteInstance', function() {
    it('invokes deleteInstance without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteInstance = mockSimpleGrpcMethod(request);

      client.deleteInstance(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteInstance with error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedName = client.instancePath("[PROJECT]", "[INSTANCE]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteInstance = mockSimpleGrpcMethod(request, null, error);

      client.deleteInstance(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('setIamPolicy', function() {
    it('invokes setIamPolicy without error', function(done) {
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
      var client = spannerV1.instanceAdminClient();
      // Mock request
      var formattedResource = client.instancePath("[PROJECT]", "[INSTANCE]");
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
