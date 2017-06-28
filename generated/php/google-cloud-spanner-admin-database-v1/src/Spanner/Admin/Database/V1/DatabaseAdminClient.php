<?php
/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * GENERATED CODE WARNING
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/spanner/admin/database/v1/spanner_database_admin.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * @experimental
 */

namespace Google\Cloud\Spanner\Admin\Database\V1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\LongRunning\OperationsClient;
use Google\GAX\OperationResponse;
use Google\GAX\PageStreamingDescriptor;
use Google\GAX\PathTemplate;
use Google\Iam\V1\GetIamPolicyRequest;
use Google\Iam\V1\Policy;
use Google\Iam\V1\SetIamPolicyRequest;
use Google\Iam\V1\TestIamPermissionsRequest;
use Google\Spanner\Admin\Database\V1\CreateDatabaseMetadata;
use Google\Spanner\Admin\Database\V1\CreateDatabaseRequest;
use Google\Spanner\Admin\Database\V1\Database;
use Google\Spanner\Admin\Database\V1\DatabaseAdminGrpcClient;
use Google\Spanner\Admin\Database\V1\DropDatabaseRequest;
use Google\Spanner\Admin\Database\V1\GetDatabaseDdlRequest;
use Google\Spanner\Admin\Database\V1\GetDatabaseRequest;
use Google\Spanner\Admin\Database\V1\ListDatabasesRequest;
use Google\Spanner\Admin\Database\V1\UpdateDatabaseDdlMetadata;
use Google\Spanner\Admin\Database\V1\UpdateDatabaseDdlRequest;

/**
 * Service Description: Cloud Spanner Database Admin API.
 *
 * The Cloud Spanner Database Admin API can be used to create, drop, and
 * list databases. It also enables updating the schema of pre-existing
 * databases.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $databaseAdminClient = new DatabaseAdminClient();
 *     $formattedParent = DatabaseAdminClient::formatInstanceName("[PROJECT]", "[INSTANCE]");
 *     // Iterate through all elements
 *     $pagedResponse = $databaseAdminClient->listDatabases($formattedParent);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements, with the maximum page size set to 5
 *     $pagedResponse = $databaseAdminClient->listDatabases($formattedParent, ['pageSize' => 5]);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $databaseAdminClient->close();
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 *
 * @experimental
 */
class DatabaseAdminClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'spanner.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The code generator version, to be included in the agent header.
     */
    const CODEGEN_VERSION = '0.0.5';

    private static $instanceNameTemplate;
    private static $databaseNameTemplate;

    private $grpcCredentialsHelper;
    private $databaseAdminStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;
    private $operationsClient;

    /**
     * Formats a string containing the fully-qualified path to represent
     * a instance resource.
     *
     * @param string $project
     * @param string $instance
     *
     * @return string The formatted instance resource.
     * @experimental
     */
    public static function formatInstanceName($project, $instance)
    {
        return self::getInstanceNameTemplate()->render([
            'project' => $project,
            'instance' => $instance,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a database resource.
     *
     * @param string $project
     * @param string $instance
     * @param string $database
     *
     * @return string The formatted database resource.
     * @experimental
     */
    public static function formatDatabaseName($project, $instance, $database)
    {
        return self::getDatabaseNameTemplate()->render([
            'project' => $project,
            'instance' => $instance,
            'database' => $database,
        ]);
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a instance resource.
     *
     * @param string $instanceName The fully-qualified instance resource.
     *
     * @return string The extracted project value.
     * @experimental
     */
    public static function parseProjectFromInstanceName($instanceName)
    {
        return self::getInstanceNameTemplate()->match($instanceName)['project'];
    }

    /**
     * Parses the instance from the given fully-qualified path which
     * represents a instance resource.
     *
     * @param string $instanceName The fully-qualified instance resource.
     *
     * @return string The extracted instance value.
     * @experimental
     */
    public static function parseInstanceFromInstanceName($instanceName)
    {
        return self::getInstanceNameTemplate()->match($instanceName)['instance'];
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a database resource.
     *
     * @param string $databaseName The fully-qualified database resource.
     *
     * @return string The extracted project value.
     * @experimental
     */
    public static function parseProjectFromDatabaseName($databaseName)
    {
        return self::getDatabaseNameTemplate()->match($databaseName)['project'];
    }

    /**
     * Parses the instance from the given fully-qualified path which
     * represents a database resource.
     *
     * @param string $databaseName The fully-qualified database resource.
     *
     * @return string The extracted instance value.
     * @experimental
     */
    public static function parseInstanceFromDatabaseName($databaseName)
    {
        return self::getDatabaseNameTemplate()->match($databaseName)['instance'];
    }

    /**
     * Parses the database from the given fully-qualified path which
     * represents a database resource.
     *
     * @param string $databaseName The fully-qualified database resource.
     *
     * @return string The extracted database value.
     * @experimental
     */
    public static function parseDatabaseFromDatabaseName($databaseName)
    {
        return self::getDatabaseNameTemplate()->match($databaseName)['database'];
    }

    private static function getInstanceNameTemplate()
    {
        if (self::$instanceNameTemplate == null) {
            self::$instanceNameTemplate = new PathTemplate('projects/{project}/instances/{instance}');
        }

        return self::$instanceNameTemplate;
    }

    private static function getDatabaseNameTemplate()
    {
        if (self::$databaseNameTemplate == null) {
            self::$databaseNameTemplate = new PathTemplate('projects/{project}/instances/{instance}/databases/{database}');
        }

        return self::$databaseNameTemplate;
    }

    private static function getPageStreamingDescriptors()
    {
        $listDatabasesPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getDatabases',
                ]);

        $pageStreamingDescriptors = [
            'listDatabases' => $listDatabasesPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    private static function getLongRunningDescriptors()
    {
        return [
            'createDatabase' => [
                'operationReturnType' => '\Google\Spanner\Admin\Database\V1\Database',
                'metadataReturnType' => '\Google\Spanner\Admin\Database\V1\CreateDatabaseMetadata',
            ],
            'updateDatabaseDdl' => [
                'operationReturnType' => '\Google\Protobuf\GPBEmpty',
                'metadataReturnType' => '\Google\Spanner\Admin\Database\V1\UpdateDatabaseDdlMetadata',
            ],
        ];
    }

    private static function getGapicVersion()
    {
        if (file_exists(__DIR__.'/../VERSION')) {
            return trim(file_get_contents(__DIR__.'/../VERSION'));
        } elseif (class_exists('\Google\Cloud\ServiceBuilder')) {
            return \Google\Cloud\ServiceBuilder::VERSION;
        } else {
            return;
        }
    }

    /**
     * Return an OperationsClient object with the same endpoint as $this.
     *
     * @return \Google\GAX\LongRunning\OperationsClient
     * @experimental
     */
    public function getOperationsClient()
    {
        return $this->operationsClient;
    }

    /**
     * Resume an existing long running operation that was previously started
     * by a long running API method. If $methodName is not provided, or does
     * not match a long running API method, then the operation can still be
     * resumed, but the OperationResponse object will not deserialize the
     * final response.
     *
     * @param string $operationName The name of the long running operation
     * @param string $methodName    The name of the method used to start the operation
     *
     * @return \Google\GAX\OperationResponse
     * @experimental
     */
    public function resumeOperation($operationName, $methodName = null)
    {
        $lroDescriptors = self::getLongRunningDescriptors();
        if (!is_null($methodName) && array_key_exists($methodName, $lroDescriptors)) {
            $options = $lroDescriptors[$methodName];
        } else {
            $options = [];
        }
        $operation = new OperationResponse($operationName, $this->getOperationsClient(), $options);
        $operation->reload();

        return $operation;
    }

    // TODO(garrettjones): add channel (when supported in gRPC)
    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'spanner.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Cloud Spanner Database Admin API.
     *     @type array $retryingOverride
     *           An associative array of string => RetryOptions, where the keys
     *           are method names (e.g. 'createFoo'), that overrides default retrying
     *           settings. A value of null indicates that the method in question should
     *           not retry.
     *     @type int $timeoutMillis The timeout in milliseconds to use for calls
     *                              that don't use retries. For calls that use retries,
     *                              set the timeout in RetryOptions.
     *                              Default: 30000 (30 seconds)
     *     @type \Google\Auth\CredentialsLoader $credentialsLoader
     *                              A CredentialsLoader object created using the
     *                              Google\Auth library.
     * }
     * @experimental
     */
    public function __construct($options = [])
    {
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
                'https://www.googleapis.com/auth/spanner.admin',
            ],
            'retryingOverride' => null,
            'timeoutMillis' => self::DEFAULT_TIMEOUT_MILLIS,
            'libName' => null,
            'libVersion' => null,
        ];
        $options = array_merge($defaultOptions, $options);

        if (array_key_exists('operationsClient', $options)) {
            $this->operationsClient = $options['operationsClient'];
        } else {
            $operationsClientOptions = $options;
            unset($operationsClientOptions['timeoutMillis']);
            unset($operationsClientOptions['retryingOverride']);
            $this->operationsClient = new OperationsClient($operationsClientOptions);
        }

        $gapicVersion = $options['libVersion'] ?: self::getGapicVersion();

        $headerDescriptor = new AgentHeaderDescriptor([
            'libName' => $options['libName'],
            'libVersion' => $options['libVersion'],
            'gapicVersion' => $gapicVersion,
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'listDatabases' => $defaultDescriptors,
            'createDatabase' => $defaultDescriptors,
            'getDatabase' => $defaultDescriptors,
            'updateDatabaseDdl' => $defaultDescriptors,
            'dropDatabase' => $defaultDescriptors,
            'getDatabaseDdl' => $defaultDescriptors,
            'setIamPolicy' => $defaultDescriptors,
            'getIamPolicy' => $defaultDescriptors,
            'testIamPermissions' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }
        $longRunningDescriptors = self::getLongRunningDescriptors();
        foreach ($longRunningDescriptors as $method => $longRunningDescriptor) {
            $this->descriptors[$method]['longRunningDescriptor'] = $longRunningDescriptor + ['operationsClient' => $this->operationsClient];
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/database_admin_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.spanner.admin.database.v1.DatabaseAdmin',
                    $clientConfig,
                    $options['retryingOverride'],
                    GrpcConstants::getStatusCodeNames(),
                    $options['timeoutMillis']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (array_key_exists('sslCreds', $options)) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $grpcCredentialsHelperOptions = array_diff_key($options, $defaultOptions);
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($this->scopes, $grpcCredentialsHelperOptions);

        $createDatabaseAdminStubFunction = function ($hostname, $opts) {
            return new DatabaseAdminGrpcClient($hostname, $opts);
        };
        if (array_key_exists('createDatabaseAdminStubFunction', $options)) {
            $createDatabaseAdminStubFunction = $options['createDatabaseAdminStubFunction'];
        }
        $this->databaseAdminStub = $this->grpcCredentialsHelper->createStub(
            $createDatabaseAdminStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Lists Cloud Spanner databases.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedParent = DatabaseAdminClient::formatInstanceName("[PROJECT]", "[INSTANCE]");
     *     // Iterate through all elements
     *     $pagedResponse = $databaseAdminClient->listDatabases($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements, with the maximum page size set to 5
     *     $pagedResponse = $databaseAdminClient->listDatabases($formattedParent, ['pageSize' => 5]);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $parent       Required. The instance whose databases should be listed.
     *                             Values are of the form `projects/<project>/instances/<instance>`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\GAX\PagedListResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function listDatabases($parent, $optionalArgs = [])
    {
        $request = new ListDatabasesRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        $mergedSettings = $this->defaultCallSettings['listDatabases']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'ListDatabases',
            $mergedSettings,
            $this->descriptors['listDatabases']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Creates a new Cloud Spanner database and starts to prepare it for serving.
     * The returned [long-running operation][google.longrunning.Operation] will
     * have a name of the format `<database_name>/operations/<operation_id>` and
     * can be used to track preparation of the database. The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
     * [response][google.longrunning.Operation.response] field type is
     * [Database][google.spanner.admin.database.v1.Database], if successful.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedParent = DatabaseAdminClient::formatInstanceName("[PROJECT]", "[INSTANCE]");
     *     $createStatement = "";
     *     $operationResponse = $databaseAdminClient->createDatabase($formattedParent, $createStatement);
     *     $operationResponse->pollUntilComplete();
     *     if ($operationResponse->operationSucceeded()) {
     *       $result = $operationResponse->getResult();
     *       // doSomethingWith($result)
     *     } else {
     *       $error = $operationResponse->getError();
     *       // handleError($error)
     *     }
     *
     *     // OR start the operation, keep the operation name, and resume later
     *     $operationResponse = $databaseAdminClient->createDatabase($formattedParent, $createStatement);
     *     $operationName = $operationResponse->getName();
     *     // ... do other work
     *     $newOperationResponse = $databaseAdminClient->resumeOperation($operationName, 'createDatabase');
     *     while (!$newOperationResponse->isDone()) {
     *         // ... do other work
     *         $newOperationResponse->reload();
     *     }
     *     if ($newOperationResponse->operationSucceeded()) {
     *       $result = $newOperationResponse->getResult();
     *       // doSomethingWith($result)
     *     } else {
     *       $error = $newOperationResponse->getError();
     *       // handleError($error)
     *     }
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $parent          Required. The name of the instance that will serve the new database.
     *                                Values are of the form `projects/<project>/instances/<instance>`.
     * @param string $createStatement Required. A `CREATE DATABASE` statement, which specifies the ID of the
     *                                new database.  The database ID must conform to the regular expression
     *                                `[a-z][a-z0-9_\-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * @param array  $optionalArgs    {
     *                                Optional.
     *
     *     @type string[] $extraStatements
     *          An optional list of DDL statements to run inside the newly created
     *          database. Statements can create tables, indexes, etc. These
     *          statements execute atomically with the creation of the database:
     *          if there is an error in any statement, the database is not created.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Longrunning\Operation
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function createDatabase($parent, $createStatement, $optionalArgs = [])
    {
        $request = new CreateDatabaseRequest();
        $request->setParent($parent);
        $request->setCreateStatement($createStatement);
        if (isset($optionalArgs['extraStatements'])) {
            $request->setExtraStatements($optionalArgs['extraStatements']);
        }

        $mergedSettings = $this->defaultCallSettings['createDatabase']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'CreateDatabase',
            $mergedSettings,
            $this->descriptors['createDatabase']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the state of a Cloud Spanner database.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedName = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $response = $databaseAdminClient->getDatabase($formattedName);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $name         Required. The name of the requested database. Values are of the form
     *                             `projects/<project>/instances/<instance>/databases/<database>`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Spanner\Admin\Database\V1\Database
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function getDatabase($name, $optionalArgs = [])
    {
        $request = new GetDatabaseRequest();
        $request->setName($name);

        $mergedSettings = $this->defaultCallSettings['getDatabase']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'GetDatabase',
            $mergedSettings,
            $this->descriptors['getDatabase']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates the schema of a Cloud Spanner database by
     * creating/altering/dropping tables, columns, indexes, etc. The returned
     * [long-running operation][google.longrunning.Operation] will have a name of
     * the format `<database_name>/operations/<operation_id>` and can be used to
     * track execution of the schema change(s). The
     * [metadata][google.longrunning.Operation.metadata] field type is
     * [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata].  The operation has no response.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedDatabase = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $statements = [];
     *     $operationResponse = $databaseAdminClient->updateDatabaseDdl($formattedDatabase, $statements);
     *     $operationResponse->pollUntilComplete();
     *     if ($operationResponse->operationSucceeded()) {
     *       // operation succeeded and returns no value
     *     } else {
     *       $error = $operationResponse->getError();
     *       // handleError($error)
     *     }
     *
     *     // OR start the operation, keep the operation name, and resume later
     *     $operationResponse = $databaseAdminClient->updateDatabaseDdl($formattedDatabase, $statements);
     *     $operationName = $operationResponse->getName();
     *     // ... do other work
     *     $newOperationResponse = $databaseAdminClient->resumeOperation($operationName, 'updateDatabaseDdl');
     *     while (!$newOperationResponse->isDone()) {
     *         // ... do other work
     *         $newOperationResponse->reload();
     *     }
     *     if ($newOperationResponse->operationSucceeded()) {
     *       // operation succeeded and returns no value
     *     } else {
     *       $error = $newOperationResponse->getError();
     *       // handleError($error)
     *     }
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string   $database     Required. The database to update.
     * @param string[] $statements   DDL statements to be applied to the database.
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type string $operationId
     *          If empty, the new update request is assigned an
     *          automatically-generated operation ID. Otherwise, `operation_id`
     *          is used to construct the name of the resulting
     *          [Operation][google.longrunning.Operation].
     *
     *          Specifying an explicit operation ID simplifies determining
     *          whether the statements were executed in the event that the
     *          [UpdateDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl] call is replayed,
     *          or the return value is otherwise lost: the [database][google.spanner.admin.database.v1.UpdateDatabaseDdlRequest.database] and
     *          `operation_id` fields can be combined to form the
     *          [name][google.longrunning.Operation.name] of the resulting
     *          [longrunning.Operation][google.longrunning.Operation]: `<database>/operations/<operation_id>`.
     *
     *          `operation_id` should be unique within the database, and must be
     *          a valid identifier: `[a-z][a-z0-9_]*`. Note that
     *          automatically-generated operation IDs always begin with an
     *          underscore. If the named operation already exists,
     *          [UpdateDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl] returns
     *          `ALREADY_EXISTS`.
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Longrunning\Operation
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function updateDatabaseDdl($database, $statements, $optionalArgs = [])
    {
        $request = new UpdateDatabaseDdlRequest();
        $request->setDatabase($database);
        $request->setStatements($statements);
        if (isset($optionalArgs['operationId'])) {
            $request->setOperationId($optionalArgs['operationId']);
        }

        $mergedSettings = $this->defaultCallSettings['updateDatabaseDdl']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'UpdateDatabaseDdl',
            $mergedSettings,
            $this->descriptors['updateDatabaseDdl']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Drops (aka deletes) a Cloud Spanner database.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedDatabase = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $databaseAdminClient->dropDatabase($formattedDatabase);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $database     Required. The database to be dropped.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function dropDatabase($database, $optionalArgs = [])
    {
        $request = new DropDatabaseRequest();
        $request->setDatabase($database);

        $mergedSettings = $this->defaultCallSettings['dropDatabase']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'DropDatabase',
            $mergedSettings,
            $this->descriptors['dropDatabase']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Returns the schema of a Cloud Spanner database as a list of formatted
     * DDL statements. This method does not show pending schema updates, those may
     * be queried using the [Operations][google.longrunning.Operations] API.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedDatabase = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $response = $databaseAdminClient->getDatabaseDdl($formattedDatabase);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $database     Required. The database whose schema we wish to get.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Spanner\Admin\Database\V1\GetDatabaseDdlResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function getDatabaseDdl($database, $optionalArgs = [])
    {
        $request = new GetDatabaseDdlRequest();
        $request->setDatabase($database);

        $mergedSettings = $this->defaultCallSettings['getDatabaseDdl']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'GetDatabaseDdl',
            $mergedSettings,
            $this->descriptors['getDatabaseDdl']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Sets the access control policy on a database resource. Replaces any
     * existing policy.
     *
     * Authorization requires `spanner.databases.setIamPolicy` permission on
     * [resource][google.iam.v1.SetIamPolicyRequest.resource].
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedResource = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $policy = new Policy();
     *     $response = $databaseAdminClient->setIamPolicy($formattedResource, $policy);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $resource     REQUIRED: The resource for which the policy is being specified.
     *                             `resource` is usually specified as a path. For example, a Project
     *                             resource is specified as `projects/{project}`.
     * @param Policy $policy       REQUIRED: The complete policy to be applied to the `resource`. The size of
     *                             the policy is limited to a few 10s of KB. An empty policy is a
     *                             valid policy but certain Cloud Platform services (such as Projects)
     *                             might reject them.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Iam\V1\Policy
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function setIamPolicy($resource, $policy, $optionalArgs = [])
    {
        $request = new SetIamPolicyRequest();
        $request->setResource($resource);
        $request->setPolicy($policy);

        $mergedSettings = $this->defaultCallSettings['setIamPolicy']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'SetIamPolicy',
            $mergedSettings,
            $this->descriptors['setIamPolicy']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the access control policy for a database resource. Returns an empty
     * policy if a database exists but does not have a policy set.
     *
     * Authorization requires `spanner.databases.getIamPolicy` permission on
     * [resource][google.iam.v1.GetIamPolicyRequest.resource].
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedResource = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $response = $databaseAdminClient->getIamPolicy($formattedResource);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string $resource     REQUIRED: The resource for which the policy is being requested.
     *                             `resource` is usually specified as a path. For example, a Project
     *                             resource is specified as `projects/{project}`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Iam\V1\Policy
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function getIamPolicy($resource, $optionalArgs = [])
    {
        $request = new GetIamPolicyRequest();
        $request->setResource($resource);

        $mergedSettings = $this->defaultCallSettings['getIamPolicy']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'GetIamPolicy',
            $mergedSettings,
            $this->descriptors['getIamPolicy']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Returns permissions that the caller has on the specified database resource.
     *
     * Attempting this RPC on a non-existent Cloud Spanner database will result in
     * a NOT_FOUND error if the user has `spanner.databases.list` permission on
     * the containing Cloud Spanner instance. Otherwise returns an empty set of
     * permissions.
     *
     * Sample code:
     * ```
     * try {
     *     $databaseAdminClient = new DatabaseAdminClient();
     *     $formattedResource = DatabaseAdminClient::formatDatabaseName("[PROJECT]", "[INSTANCE]", "[DATABASE]");
     *     $permissions = [];
     *     $response = $databaseAdminClient->testIamPermissions($formattedResource, $permissions);
     * } finally {
     *     $databaseAdminClient->close();
     * }
     * ```
     *
     * @param string   $resource     REQUIRED: The resource for which the policy detail is being requested.
     *                               `resource` is usually specified as a path. For example, a Project
     *                               resource is specified as `projects/{project}`.
     * @param string[] $permissions  The set of permissions to check for the `resource`. Permissions with
     *                               wildcards (such as '*' or 'storage.*') are not allowed. For more
     *                               information see
     *                               [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type \Google\GAX\RetrySettings $retrySettings
     *          Retry settings to use for this call. If present, then
     *          $timeoutMillis is ignored.
     *     @type int $timeoutMillis
     *          Timeout to use for this call. Only used if $retrySettings
     *          is not set.
     * }
     *
     * @return \Google\Iam\V1\TestIamPermissionsResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     * @experimental
     */
    public function testIamPermissions($resource, $permissions, $optionalArgs = [])
    {
        $request = new TestIamPermissionsRequest();
        $request->setResource($resource);
        $request->setPermissions($permissions);

        $mergedSettings = $this->defaultCallSettings['testIamPermissions']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->databaseAdminStub,
            'TestIamPermissions',
            $mergedSettings,
            $this->descriptors['testIamPermissions']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Initiates an orderly shutdown in which preexisting calls continue but new
     * calls are immediately cancelled.
     *
     * @experimental
     */
    public function close()
    {
        $this->databaseAdminStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
