<?php
/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
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
 * https://github.com/google/googleapis/blob/master/google/bigtable/v2/bigtable.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Bigtable\V2\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\Call;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Auth\CredentialsLoader;
use Google\Cloud\Bigtable\V2\CheckAndMutateRowRequest;
use Google\Cloud\Bigtable\V2\CheckAndMutateRowResponse;
use Google\Cloud\Bigtable\V2\MutateRowRequest;
use Google\Cloud\Bigtable\V2\MutateRowResponse;
use Google\Cloud\Bigtable\V2\MutateRowsRequest;
use Google\Cloud\Bigtable\V2\MutateRowsRequest_Entry;
use Google\Cloud\Bigtable\V2\MutateRowsResponse;
use Google\Cloud\Bigtable\V2\Mutation;
use Google\Cloud\Bigtable\V2\ReadModifyWriteRowRequest;
use Google\Cloud\Bigtable\V2\ReadModifyWriteRowResponse;
use Google\Cloud\Bigtable\V2\ReadModifyWriteRule;
use Google\Cloud\Bigtable\V2\ReadRowsRequest;
use Google\Cloud\Bigtable\V2\ReadRowsResponse;
use Google\Cloud\Bigtable\V2\RowFilter;
use Google\Cloud\Bigtable\V2\RowSet;
use Google\Cloud\Bigtable\V2\SampleRowKeysRequest;
use Google\Cloud\Bigtable\V2\SampleRowKeysResponse;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: Service for reading from and writing to existing Bigtable tables.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $bigtableClient = new BigtableClient();
 * try {
 *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
 *     // Read all responses until the stream is complete
 *     $stream = $bigtableClient->readRows($formattedTableName);
 *     foreach ($stream->readAll() as $element) {
 *         // doSomethingWith($element);
 *     }
 * } finally {
 *     $bigtableClient->close();
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parseName method to extract the individual identifiers contained within formatted names
 * that are returned by the API.
 *
 * @experimental
 */
class BigtableGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.bigtable.v2.Bigtable';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'bigtable.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The code generator version, to be included in the agent header.
     */
    const CODEGEN_VERSION = '0.0.5';

    private static $tableNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/bigtable.data',
                'https://www.googleapis.com/auth/bigtable.data.readonly',
                'https://www.googleapis.com/auth/cloud-bigtable.data',
                'https://www.googleapis.com/auth/cloud-bigtable.data.readonly',
                'https://www.googleapis.com/auth/cloud-platform',
                'https://www.googleapis.com/auth/cloud-platform.read-only',
            ],
            'clientConfigPath' => __DIR__.'/../resources/bigtable_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/bigtable_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/bigtable_descriptor_config.php',
            'versionFile' => __DIR__.'/../../VERSION',
        ];
    }

    private static function getTableNameTemplate()
    {
        if (self::$tableNameTemplate == null) {
            self::$tableNameTemplate = new PathTemplate('projects/{project}/instances/{instance}/tables/{table}');
        }

        return self::$tableNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'table' => self::getTableNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a table resource.
     *
     * @param string $project
     * @param string $instance
     * @param string $table
     *
     * @return string The formatted table resource.
     * @experimental
     */
    public static function tableName($project, $instance, $table)
    {
        return self::getTableNameTemplate()->render([
            'project' => $project,
            'instance' => $instance,
            'table' => $table,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - table: projects/{project}/instances/{instance}/tables/{table}.
     *
     * The optional $template argument can be supplied to specify a particular pattern, and must
     * match one of the templates listed above. If no $template argument is provided, or if the
     * $template argument does not match one of the templates listed, then parseName will check
     * each of the supported templates, and return the first match.
     *
     * @param string $formattedName The formatted name string
     * @param string $template      Optional name of template to match
     *
     * @return array An associative array from name component IDs to component values.
     *
     * @throws ValidationException If $formattedName could not be matched.
     * @experimental
     */
    public static function parseName($formattedName, $template = null)
    {
        $templateMap = self::getPathTemplateMap();

        if ($template) {
            if (!isset($templateMap[$template])) {
                throw new ValidationException("Template name $template does not exist");
            }

            return $templateMap[$template]->match($formattedName);
        }

        foreach ($templateMap as $templateName => $pathTemplate) {
            try {
                return $pathTemplate->match($formattedName);
            } catch (ValidationException $ex) {
                // Swallow the exception to continue trying other path templates
            }
        }
        throw new ValidationException("Input did not match any known format. Input: $formattedName");
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'bigtable.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type Channel $channel
     *           A `Channel` object. If not specified, a channel will be constructed.
     *           NOTE: This option is only valid when utilizing the gRPC transport.
     *     @type ChannelCredentials $sslCreds
     *           A `ChannelCredentials` object for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl().
     *           NOTE: This option is only valid when utilizing the gRPC transport. Also, if the $channel
     *           optional argument is specified, then this argument is unused.
     *     @type bool $forceNewChannel
     *           If true, this forces gRPC to create a new channel instead of using a persistent channel.
     *           Defaults to false.
     *           NOTE: This option is only valid when utilizing the gRPC transport. Also, if the $channel
     *           optional argument is specified, then this option is unused.
     *     @type CredentialsLoader $credentialsLoader
     *           A CredentialsLoader object created using the Google\Auth library.
     *     @type string[] $scopes A string array of scopes to use when acquiring credentials.
     *                          Defaults to the scopes for the Cloud Bigtable API.
     *     @type string $clientConfigPath
     *           Path to a JSON file containing client method configuration, including retry settings.
     *           Specify this setting to specify the retry behavior of all methods on the client.
     *           By default this settings points to the default client config file, which is provided
     *           in the resources folder. The retry settings provided in this option can be overridden
     *           by settings in $retryingOverride
     *     @type array $retryingOverride
     *           An associative array in which the keys are method names (e.g. 'createFoo'), and
     *           the values are retry settings to use for that method. The retry settings for each
     *           method can be a {@see Google\ApiCore\RetrySettings} object, or an associative array
     *           of retry settings parameters. See the documentation on {@see Google\ApiCore\RetrySettings}
     *           for example usage. Passing a value of null is equivalent to a value of
     *           ['retriesEnabled' => false]. Retry settings provided in this setting override the
     *           settings in $clientConfigPath.
     *     @type callable $authHttpHandler A handler used to deliver PSR-7 requests specifically
     *           for authentication. Should match a signature of
     *           `function (RequestInterface $request, array $options) : ResponseInterface`.
     *     @type callable $httpHandler A handler used to deliver PSR-7 requests. Should match a
     *           signature of `function (RequestInterface $request, array $options) : PromiseInterface`.
     *           NOTE: This option is only valid when utilizing the REST transport.
     *     @type string|TransportInterface $transport The transport used for executing network
     *           requests. May be either the string `rest` or `grpc`. Additionally, it is possible
     *           to pass in an already instantiated transport. Defaults to `grpc` if gRPC support is
     *           detected on the system.
     * }
     * @experimental
     */
    public function __construct($options = [])
    {
        $this->setClientOptions($options + self::getClientDefaults());
    }

    /**
     * Streams back the contents of all requested rows in key order, optionally
     * applying the same Reader filter to each. Depending on their size,
     * rows and cells may be broken up across multiple responses, but
     * atomicity of each row will still be preserved. See the
     * ReadRowsResponse documentation for details.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     // Read all responses until the stream is complete
     *     $stream = $bigtableClient->readRows($formattedTableName);
     *     foreach ($stream->readAll() as $element) {
     *         // doSomethingWith($element);
     *     }
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string $tableName    The unique name of the table from which to read.
     *                             Values are of the form
     *                             `projects/<project>/instances/<instance>/tables/<table>`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type RowSet $rows
     *          The row keys and/or ranges to read. If not specified, reads from all rows.
     *     @type RowFilter $filter
     *          The filter to apply to the contents of the specified row(s). If unset,
     *          reads the entirety of each row.
     *     @type int $rowsLimit
     *          The read will terminate after committing to N rows' worth of results. The
     *          default (zero) is to return all results.
     *     @type int $timeoutMillis
     *          Timeout to use for this call.
     * }
     *
     * @return \Google\ApiCore\ServerStream
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function readRows($tableName, $optionalArgs = [])
    {
        $request = new ReadRowsRequest();
        $request->setTableName($tableName);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }
        if (isset($optionalArgs['rows'])) {
            $request->setRows($optionalArgs['rows']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['rowsLimit'])) {
            $request->setRowsLimit($optionalArgs['rowsLimit']);
        }

        return $this->startCall(
            'ReadRows',
            ReadRowsResponse::class,
            $optionalArgs,
            $request,
            Call::SERVER_STREAMING_CALL
        );
    }

    /**
     * Returns a sample of row keys in the table. The returned row keys will
     * delimit contiguous sections of the table of approximately equal size,
     * which can be used to break up the data for distributed tasks like
     * mapreduces.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     // Read all responses until the stream is complete
     *     $stream = $bigtableClient->sampleRowKeys($formattedTableName);
     *     foreach ($stream->readAll() as $element) {
     *         // doSomethingWith($element);
     *     }
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string $tableName    The unique name of the table from which to sample row keys.
     *                             Values are of the form
     *                             `projects/<project>/instances/<instance>/tables/<table>`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type int $timeoutMillis
     *          Timeout to use for this call.
     * }
     *
     * @return \Google\ApiCore\ServerStream
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function sampleRowKeys($tableName, $optionalArgs = [])
    {
        $request = new SampleRowKeysRequest();
        $request->setTableName($tableName);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }

        return $this->startCall(
            'SampleRowKeys',
            SampleRowKeysResponse::class,
            $optionalArgs,
            $request,
            Call::SERVER_STREAMING_CALL
        );
    }

    /**
     * Mutates a row atomically. Cells already present in the row are left
     * unchanged unless explicitly changed by `mutation`.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     $rowKey = '';
     *     $mutations = [];
     *     $response = $bigtableClient->mutateRow($formattedTableName, $rowKey, $mutations);
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string     $tableName    The unique name of the table to which the mutation should be applied.
     *                                 Values are of the form
     *                                 `projects/<project>/instances/<instance>/tables/<table>`.
     * @param string     $rowKey       The key of the row to which the mutation should be applied.
     * @param Mutation[] $mutations    Changes to be atomically applied to the specified row. Entries are applied
     *                                 in order, meaning that earlier mutations can be masked by later ones.
     *                                 Must contain at least one entry and at most 100000.
     * @param array      $optionalArgs {
     *                                 Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Bigtable\V2\MutateRowResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function mutateRow($tableName, $rowKey, $mutations, $optionalArgs = [])
    {
        $request = new MutateRowRequest();
        $request->setTableName($tableName);
        $request->setRowKey($rowKey);
        $request->setMutations($mutations);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }

        return $this->startCall(
            'MutateRow',
            MutateRowResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Mutates multiple rows in a batch. Each individual row is mutated
     * atomically as in MutateRow, but the entire batch is not executed
     * atomically.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     $entries = [];
     *     // Read all responses until the stream is complete
     *     $stream = $bigtableClient->mutateRows($formattedTableName, $entries);
     *     foreach ($stream->readAll() as $element) {
     *         // doSomethingWith($element);
     *     }
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string                    $tableName    The unique name of the table to which the mutations should be applied.
     * @param MutateRowsRequest_Entry[] $entries      The row keys and corresponding mutations to be applied in bulk.
     *                                                Each entry is applied as an atomic mutation, but the entries may be
     *                                                applied in arbitrary order (even between entries for the same row).
     *                                                At least one entry must be specified, and in total the entries can
     *                                                contain at most 100000 mutations.
     * @param array                     $optionalArgs {
     *                                                Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type int $timeoutMillis
     *          Timeout to use for this call.
     * }
     *
     * @return \Google\ApiCore\ServerStream
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function mutateRows($tableName, $entries, $optionalArgs = [])
    {
        $request = new MutateRowsRequest();
        $request->setTableName($tableName);
        $request->setEntries($entries);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }

        return $this->startCall(
            'MutateRows',
            MutateRowsResponse::class,
            $optionalArgs,
            $request,
            Call::SERVER_STREAMING_CALL
        );
    }

    /**
     * Mutates a row atomically based on the output of a predicate Reader filter.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     $rowKey = '';
     *     $response = $bigtableClient->checkAndMutateRow($formattedTableName, $rowKey);
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string $tableName    The unique name of the table to which the conditional mutation should be
     *                             applied.
     *                             Values are of the form
     *                             `projects/<project>/instances/<instance>/tables/<table>`.
     * @param string $rowKey       The key of the row to which the conditional mutation should be applied.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type RowFilter $predicateFilter
     *          The filter to be applied to the contents of the specified row. Depending
     *          on whether or not any results are yielded, either `true_mutations` or
     *          `false_mutations` will be executed. If unset, checks that the row contains
     *          any values at all.
     *     @type Mutation[] $trueMutations
     *          Changes to be atomically applied to the specified row if `predicate_filter`
     *          yields at least one cell when applied to `row_key`. Entries are applied in
     *          order, meaning that earlier mutations can be masked by later ones.
     *          Must contain at least one entry if `false_mutations` is empty, and at most
     *          100000.
     *     @type Mutation[] $falseMutations
     *          Changes to be atomically applied to the specified row if `predicate_filter`
     *          does not yield any cells when applied to `row_key`. Entries are applied in
     *          order, meaning that earlier mutations can be masked by later ones.
     *          Must contain at least one entry if `true_mutations` is empty, and at most
     *          100000.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Bigtable\V2\CheckAndMutateRowResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function checkAndMutateRow($tableName, $rowKey, $optionalArgs = [])
    {
        $request = new CheckAndMutateRowRequest();
        $request->setTableName($tableName);
        $request->setRowKey($rowKey);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }
        if (isset($optionalArgs['predicateFilter'])) {
            $request->setPredicateFilter($optionalArgs['predicateFilter']);
        }
        if (isset($optionalArgs['trueMutations'])) {
            $request->setTrueMutations($optionalArgs['trueMutations']);
        }
        if (isset($optionalArgs['falseMutations'])) {
            $request->setFalseMutations($optionalArgs['falseMutations']);
        }

        return $this->startCall(
            'CheckAndMutateRow',
            CheckAndMutateRowResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Modifies a row atomically on the server. The method reads the latest
     * existing timestamp and value from the specified columns and writes a new
     * entry based on pre-defined read/modify/write rules. The new value for the
     * timestamp is the greater of the existing timestamp or the current server
     * time. The method returns the new contents of all modified cells.
     *
     * Sample code:
     * ```
     * $bigtableClient = new BigtableClient();
     * try {
     *     $formattedTableName = $bigtableClient->tableName('[PROJECT]', '[INSTANCE]', '[TABLE]');
     *     $rowKey = '';
     *     $rules = [];
     *     $response = $bigtableClient->readModifyWriteRow($formattedTableName, $rowKey, $rules);
     * } finally {
     *     $bigtableClient->close();
     * }
     * ```
     *
     * @param string                $tableName    The unique name of the table to which the read/modify/write rules should be
     *                                            applied.
     *                                            Values are of the form
     *                                            `projects/<project>/instances/<instance>/tables/<table>`.
     * @param string                $rowKey       The key of the row to which the read/modify/write rules should be applied.
     * @param ReadModifyWriteRule[] $rules        Rules specifying how the specified row's contents are to be transformed
     *                                            into writes. Entries are applied in order, meaning that earlier rules will
     *                                            affect the results of later ones.
     * @param array                 $optionalArgs {
     *                                            Optional.
     *
     *     @type string $appProfileId
     *          This is a private alpha release of Cloud Bigtable replication. This feature
     *          is not currently available to most Cloud Bigtable customers. This feature
     *          might be changed in backward-incompatible ways and is not recommended for
     *          production use. It is not subject to any SLA or deprecation policy.
     *
     *          This value specifies routing for replication. If not specified, the
     *          "default" application profile will be used.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Bigtable\V2\ReadModifyWriteRowResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function readModifyWriteRow($tableName, $rowKey, $rules, $optionalArgs = [])
    {
        $request = new ReadModifyWriteRowRequest();
        $request->setTableName($tableName);
        $request->setRowKey($rowKey);
        $request->setRules($rules);
        if (isset($optionalArgs['appProfileId'])) {
            $request->setAppProfileId($optionalArgs['appProfileId']);
        }

        return $this->startCall(
            'ReadModifyWriteRow',
            ReadModifyWriteRowResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
