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
var iamV1 = require('../src/v1')();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('IamClient', function() {
  describe('listServiceAccounts', function() {
    it('invokes listServiceAccounts without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var nextPageToken = '';
      var accountsElement = {};
      var accounts = [accountsElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          accounts : accounts
      };

      // Mock Grpc layer
      client._listServiceAccounts = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.accounts);
      };

      client.listServiceAccounts(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.accounts);
        done();
      });
    });

    it('invokes listServiceAccounts with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._listServiceAccounts = mockSimpleGrpcMethod(request, null, error);

      client.listServiceAccounts(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getServiceAccount', function() {
    it('invokes getServiceAccount without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var projectId = 'projectId-1969970175';
      var uniqueId = 'uniqueId-538310583';
      var email = 'email96619420';
      var displayName = 'displayName1615086568';
      var etag = '21';
      var oauth2ClientId = 'oauth2ClientId-1833466037';
      var expectedResponse = {
          name : name2,
          projectId : projectId,
          uniqueId : uniqueId,
          email : email,
          displayName : displayName,
          etag : etag,
          oauth2ClientId : oauth2ClientId
      };

      // Mock Grpc layer
      client._getServiceAccount = mockSimpleGrpcMethod(request, expectedResponse);

      client.getServiceAccount(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getServiceAccount with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getServiceAccount = mockSimpleGrpcMethod(request, null, error);

      client.getServiceAccount(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createServiceAccount', function() {
    it('invokes createServiceAccount without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var accountId = 'accountId-803333011';
      var request = {
          name : formattedName,
          accountId : accountId
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var projectId = 'projectId-1969970175';
      var uniqueId = 'uniqueId-538310583';
      var email = 'email96619420';
      var displayName = 'displayName1615086568';
      var etag = '21';
      var oauth2ClientId = 'oauth2ClientId-1833466037';
      var expectedResponse = {
          name : name2,
          projectId : projectId,
          uniqueId : uniqueId,
          email : email,
          displayName : displayName,
          etag : etag,
          oauth2ClientId : oauth2ClientId
      };

      // Mock Grpc layer
      client._createServiceAccount = mockSimpleGrpcMethod(request, expectedResponse);

      client.createServiceAccount(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createServiceAccount with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.projectPath("[PROJECT]");
      var accountId = 'accountId-803333011';
      var request = {
          name : formattedName,
          accountId : accountId
      };

      // Mock Grpc layer
      client._createServiceAccount = mockSimpleGrpcMethod(request, null, error);

      client.createServiceAccount(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('updateServiceAccount', function() {
    it('invokes updateServiceAccount without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var etag = '21';
      var request = {
          etag : etag
      };

      // Mock response
      var name = 'name3373707';
      var projectId = 'projectId-1969970175';
      var uniqueId = 'uniqueId-538310583';
      var email = 'email96619420';
      var displayName = 'displayName1615086568';
      var etag2 = '-120';
      var oauth2ClientId = 'oauth2ClientId-1833466037';
      var expectedResponse = {
          name : name,
          projectId : projectId,
          uniqueId : uniqueId,
          email : email,
          displayName : displayName,
          etag : etag2,
          oauth2ClientId : oauth2ClientId
      };

      // Mock Grpc layer
      client._updateServiceAccount = mockSimpleGrpcMethod(request, expectedResponse);

      client.updateServiceAccount(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes updateServiceAccount with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var etag = '21';
      var request = {
          etag : etag
      };

      // Mock Grpc layer
      client._updateServiceAccount = mockSimpleGrpcMethod(request, null, error);

      client.updateServiceAccount(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deleteServiceAccount', function() {
    it('invokes deleteServiceAccount without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteServiceAccount = mockSimpleGrpcMethod(request);

      client.deleteServiceAccount(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteServiceAccount with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteServiceAccount = mockSimpleGrpcMethod(request, null, error);

      client.deleteServiceAccount(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listServiceAccountKeys', function() {
    it('invokes listServiceAccountKeys without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._listServiceAccountKeys = mockSimpleGrpcMethod(request, expectedResponse);

      client.listServiceAccountKeys(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes listServiceAccountKeys with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._listServiceAccountKeys = mockSimpleGrpcMethod(request, null, error);

      client.listServiceAccountKeys(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getServiceAccountKey', function() {
    it('invokes getServiceAccountKey without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var privateKeyData = '-58';
      var publicKeyData = '-96';
      var expectedResponse = {
          name : name2,
          privateKeyData : privateKeyData,
          publicKeyData : publicKeyData
      };

      // Mock Grpc layer
      client._getServiceAccountKey = mockSimpleGrpcMethod(request, expectedResponse);

      client.getServiceAccountKey(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getServiceAccountKey with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._getServiceAccountKey = mockSimpleGrpcMethod(request, null, error);

      client.getServiceAccountKey(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createServiceAccountKey', function() {
    it('invokes createServiceAccountKey without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock response
      var name2 = 'name2-1052831874';
      var privateKeyData = '-58';
      var publicKeyData = '-96';
      var expectedResponse = {
          name : name2,
          privateKeyData : privateKeyData,
          publicKeyData : publicKeyData
      };

      // Mock Grpc layer
      client._createServiceAccountKey = mockSimpleGrpcMethod(request, expectedResponse);

      client.createServiceAccountKey(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createServiceAccountKey with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._createServiceAccountKey = mockSimpleGrpcMethod(request, null, error);

      client.createServiceAccountKey(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deleteServiceAccountKey', function() {
    it('invokes deleteServiceAccountKey without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteServiceAccountKey = mockSimpleGrpcMethod(request);

      client.deleteServiceAccountKey(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deleteServiceAccountKey with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.keyPath("[PROJECT]", "[SERVICE_ACCOUNT]", "[KEY]");
      var request = {
          name : formattedName
      };

      // Mock Grpc layer
      client._deleteServiceAccountKey = mockSimpleGrpcMethod(request, null, error);

      client.deleteServiceAccountKey(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('signBlob', function() {
    it('invokes signBlob without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var bytesToSign = '45';
      var request = {
          name : formattedName,
          bytesToSign : bytesToSign
      };

      // Mock response
      var keyId = 'keyId-1134673157';
      var signature = '-72';
      var expectedResponse = {
          keyId : keyId,
          signature : signature
      };

      // Mock Grpc layer
      client._signBlob = mockSimpleGrpcMethod(request, expectedResponse);

      client.signBlob(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes signBlob with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedName = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
      var bytesToSign = '45';
      var request = {
          name : formattedName,
          bytesToSign : bytesToSign
      };

      // Mock Grpc layer
      client._signBlob = mockSimpleGrpcMethod(request, null, error);

      client.signBlob(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getIamPolicy', function() {
    it('invokes getIamPolicy without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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

  describe('setIamPolicy', function() {
    it('invokes setIamPolicy without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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

  describe('testIamPermissions', function() {
    it('invokes testIamPermissions without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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
      var client = iamV1.iamClient();
      // Mock request
      var formattedResource = client.serviceAccountPath("[PROJECT]", "[SERVICE_ACCOUNT]");
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

  describe('queryGrantableRoles', function() {
    it('invokes queryGrantableRoles without error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var fullResourceName = 'fullResourceName1300993644';
      var request = {
          fullResourceName : fullResourceName
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._queryGrantableRoles = mockSimpleGrpcMethod(request, expectedResponse);

      client.queryGrantableRoles(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes queryGrantableRoles with error', function(done) {
      var client = iamV1.iamClient();
      // Mock request
      var fullResourceName = 'fullResourceName1300993644';
      var request = {
          fullResourceName : fullResourceName
      };

      // Mock Grpc layer
      client._queryGrantableRoles = mockSimpleGrpcMethod(request, null, error);

      client.queryGrantableRoles(request, function(err, response) {
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
