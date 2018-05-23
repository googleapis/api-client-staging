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
 * https://github.com/google/googleapis/blob/master/google/cloud/functions/v1beta2/functions.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Functions\V1beta2\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\LongRunning\OperationsClient;
use Google\ApiCore\OperationResponse;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Cloud\Functions\V1beta2\CallFunctionRequest;
use Google\Cloud\Functions\V1beta2\CallFunctionResponse;
use Google\Cloud\Functions\V1beta2\CloudFunction;
use Google\Cloud\Functions\V1beta2\CreateFunctionRequest;
use Google\Cloud\Functions\V1beta2\DeleteFunctionRequest;
use Google\Cloud\Functions\V1beta2\GetFunctionRequest;
use Google\Cloud\Functions\V1beta2\ListFunctionsRequest;
use Google\Cloud\Functions\V1beta2\ListFunctionsResponse;
use Google\Cloud\Functions\V1beta2\UpdateFunctionRequest;
use Google\LongRunning\Operation;

/**
 * Service Description: A service that application uses to manipulate triggers and functions.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
 * try {
 *     $formattedLocation = $cloudFunctionsServiceClient->locationName('[PROJECT]', '[LOCATION]');
 *     // Iterate through all elements
 *     $pagedResponse = $cloudFunctionsServiceClient->listFunctions($formattedLocation);
 *     foreach ($pagedResponse->iterateAllElements() as $element) {
 *         // doSomethingWith($element);
 *     }
 *
 *     // OR iterate over pages of elements
 *     $pagedResponse = $cloudFunctionsServiceClient->listFunctions($formattedLocation);
 *     foreach ($pagedResponse->iteratePages() as $page) {
 *         foreach ($page as $element) {
 *             // doSomethingWith($element);
 *         }
 *     }
 * } finally {
 *     $cloudFunctionsServiceClient->close();
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
class CloudFunctionsServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.cloud.functions.v1beta2.CloudFunctionsService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'cloudfunctions.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The default scopes required by the service.
     */
    public static $serviceScopes = [
        'https://www.googleapis.com/auth/cloud-platform',
    ];
    private static $locationNameTemplate;
    private static $functionNameTemplate;
    private static $pathTemplateMap;

    private $operationsClient;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/cloud_functions_service_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/cloud_functions_service_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/cloud_functions_service_rest_client_config.php',
                ],
            ],
            'versionFile' => __DIR__.'/../../../VERSION',
        ];
    }

    private static function getLocationNameTemplate()
    {
        if (self::$locationNameTemplate == null) {
            self::$locationNameTemplate = new PathTemplate('projects/{project}/locations/{location}');
        }

        return self::$locationNameTemplate;
    }

    private static function getFunctionNameTemplate()
    {
        if (self::$functionNameTemplate == null) {
            self::$functionNameTemplate = new PathTemplate('projects/{project}/locations/{location}/functions/{function}');
        }

        return self::$functionNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'location' => self::getLocationNameTemplate(),
                'function' => self::getFunctionNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a location resource.
     *
     * @param string $project
     * @param string $location
     *
     * @return string The formatted location resource.
     * @experimental
     */
    public static function locationName($project, $location)
    {
        return self::getLocationNameTemplate()->render([
            'project' => $project,
            'location' => $location,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a function resource.
     *
     * @param string $project
     * @param string $location
     * @param string $function
     *
     * @return string The formatted function resource.
     * @experimental
     */
    public static function functionName($project, $location, $function)
    {
        return self::getFunctionNameTemplate()->render([
            'project' => $project,
            'location' => $location,
            'function' => $function,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - location: projects/{project}/locations/{location}
     * - function: projects/{project}/locations/{location}/functions/{function}.
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
     * Return an OperationsClient object with the same endpoint as $this.
     *
     * @return OperationsClient
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
     * @return OperationResponse
     * @experimental
     */
    public function resumeOperation($operationName, $methodName = null)
    {
        $options = isset($this->descriptors[$methodName]['longRunning'])
            ? $this->descriptors[$methodName]['longRunning']
            : [];
        $operation = new OperationResponse($operationName, $this->getOperationsClient(), $options);
        $operation->reload();

        return $operation;
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress
     *           The address of the API remote host. May optionally include the port, formatted
     *           as "<uri>:<port>". Default 'cloudfunctions.googleapis.com:443'.
     *     @type string|array|FetchAuthTokenInterface|CredentialsWrapper $credentials
     *           The credentials to be used by the client to authorize API calls. This option
     *           accepts either a path to a credentials file, or a decoded credentials file as a
     *           PHP array.
     *           *Advanced usage*: In addition, this option can also accept a pre-constructed
     *           {@see \Google\Auth\FetchAuthTokenInterface} object or
     *           {@see \Google\ApiCore\CredentialsWrapper} object. Note that when one of these
     *           objects are provided, any settings in $credentialsConfig will be ignored.
     *     @type array $credentialsConfig
     *           Options used to configure credentials, including auth token caching, for the client.
     *           For a full list of supporting configuration options, see
     *           {@see \Google\ApiCore\CredentialsWrapper::build()}.
     *     @type bool $disableRetries
     *           Determines whether or not retries defined by the client configuration should be
     *           disabled. Defaults to `false`.
     *     @type string|array $clientConfig
     *           Client method configuration, including retry settings. This option can be either a
     *           path to a JSON file, or a PHP array containing the decoded JSON data.
     *           By default this settings points to the default client config file, which is provided
     *           in the resources folder.
     *     @type string|TransportInterface $transport
     *           The transport used for executing network requests. May be either the string `rest`
     *           or `grpc`. Defaults to `grpc` if gRPC support is detected on the system.
     *           *Advanced usage*: Additionally, it is possible to pass in an already instantiated
     *           {@see \Google\ApiCore\Transport\TransportInterface} object. Note that when this
     *           object is provided, any settings in $transportConfig, and any $serviceAddress
     *           setting, will be ignored.
     *     @type array $transportConfig
     *           Configuration options that will be used to construct the transport. Options for
     *           each supported transport type should be passed in a key for that transport. For
     *           example:
     *           $transportConfig = [
     *               'grpc' => [...],
     *               'rest' => [...]
     *           ];
     *           See the {@see \Google\Cloud\ApiCore\Transport\GrpcTransport::build()} and
     *           {@see \Google\Cloud\ApiCore\Transport\RestTransport::build()} methods for the
     *           supported options.
     * }
     *
     * @throws ValidationException
     * @experimental
     */
    public function __construct($options = [])
    {
        $clientOptions = $this->buildClientOptions($options);
        $this->setClientOptions($clientOptions);
        $this->operationsClient = $this->createOperationsClient($clientOptions);
    }

    /**
     * Returns a list of functions that belong to the requested project.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedLocation = $cloudFunctionsServiceClient->locationName('[PROJECT]', '[LOCATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $cloudFunctionsServiceClient->listFunctions($formattedLocation);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $cloudFunctionsServiceClient->listFunctions($formattedLocation);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string $location     The project and location from which the function should be listed,
     *                             specified in the format `projects/&#42;/locations/*`
     *                             If you want to list functions in all locations, use "-" in place of a
     *                             location.
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function listFunctions($location, $optionalArgs = [])
    {
        $request = new ListFunctionsRequest();
        $request->setLocation($location);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListFunctions',
            $optionalArgs,
            ListFunctionsResponse::class,
            $request
        );
    }

    /**
     * Returns a function with the given name from the requested project.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedName = $cloudFunctionsServiceClient->functionName('[PROJECT]', '[LOCATION]', '[FUNCTION]');
     *     $response = $cloudFunctionsServiceClient->getFunction($formattedName);
     * } finally {
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the function which details should be obtained.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Functions\V1beta2\CloudFunction
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getFunction($name, $optionalArgs = [])
    {
        $request = new GetFunctionRequest();
        $request->setName($name);

        return $this->startCall(
            'GetFunction',
            CloudFunction::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new function. If a function with the given name already exists in
     * the specified project, the long running operation will return
     * `ALREADY_EXISTS` error.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedLocation = $cloudFunctionsServiceClient->locationName('[PROJECT]', '[LOCATION]');
     *     $function = new CloudFunction();
     *     $operationResponse = $cloudFunctionsServiceClient->createFunction($formattedLocation, $function);
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
     *     $operationResponse = $cloudFunctionsServiceClient->createFunction($formattedLocation, $function);
     *     $operationName = $operationResponse->getName();
     *     // ... do other work
     *     $newOperationResponse = $cloudFunctionsServiceClient->resumeOperation($operationName, 'createFunction');
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
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string        $location     The project and location in which the function should be created, specified
     *                                    in the format `projects/&#42;/locations/*`
     * @param CloudFunction $function     Function to be created.
     * @param array         $optionalArgs {
     *                                    Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\OperationResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createFunction($location, $function, $optionalArgs = [])
    {
        $request = new CreateFunctionRequest();
        $request->setLocation($location);
        $request->setFunction($function);

        return $this->startOperationsCall(
            'CreateFunction',
            $optionalArgs,
            $request,
            $this->getOperationsClient()
        )->wait();
    }

    /**
     * Updates existing function.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedName = $cloudFunctionsServiceClient->functionName('[PROJECT]', '[LOCATION]', '[FUNCTION]');
     *     $function = new CloudFunction();
     *     $operationResponse = $cloudFunctionsServiceClient->updateFunction($formattedName, $function);
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
     *     $operationResponse = $cloudFunctionsServiceClient->updateFunction($formattedName, $function);
     *     $operationName = $operationResponse->getName();
     *     // ... do other work
     *     $newOperationResponse = $cloudFunctionsServiceClient->resumeOperation($operationName, 'updateFunction');
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
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string        $name         The name of the function to be updated.
     * @param CloudFunction $function     New version of the function.
     * @param array         $optionalArgs {
     *                                    Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\OperationResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateFunction($name, $function, $optionalArgs = [])
    {
        $request = new UpdateFunctionRequest();
        $request->setName($name);
        $request->setFunction($function);

        return $this->startOperationsCall(
            'UpdateFunction',
            $optionalArgs,
            $request,
            $this->getOperationsClient()
        )->wait();
    }

    /**
     * Deletes a function with the given name from the specified project. If the
     * given function is used by some trigger, the trigger will be updated to
     * remove this function.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedName = $cloudFunctionsServiceClient->functionName('[PROJECT]', '[LOCATION]', '[FUNCTION]');
     *     $operationResponse = $cloudFunctionsServiceClient->deleteFunction($formattedName);
     *     $operationResponse->pollUntilComplete();
     *     if ($operationResponse->operationSucceeded()) {
     *       // operation succeeded and returns no value
     *     } else {
     *       $error = $operationResponse->getError();
     *       // handleError($error)
     *     }
     *
     *     // OR start the operation, keep the operation name, and resume later
     *     $operationResponse = $cloudFunctionsServiceClient->deleteFunction($formattedName);
     *     $operationName = $operationResponse->getName();
     *     // ... do other work
     *     $newOperationResponse = $cloudFunctionsServiceClient->resumeOperation($operationName, 'deleteFunction');
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
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the function which should be deleted.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\OperationResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteFunction($name, $optionalArgs = [])
    {
        $request = new DeleteFunctionRequest();
        $request->setName($name);

        return $this->startOperationsCall(
            'DeleteFunction',
            $optionalArgs,
            $request,
            $this->getOperationsClient()
        )->wait();
    }

    /**
     * Invokes synchronously deployed function. To be used for testing, very
     * limited traffic allowed.
     *
     * Sample code:
     * ```
     * $cloudFunctionsServiceClient = new CloudFunctionsServiceClient();
     * try {
     *     $formattedName = $cloudFunctionsServiceClient->functionName('[PROJECT]', '[LOCATION]', '[FUNCTION]');
     *     $data = '';
     *     $response = $cloudFunctionsServiceClient->callFunction($formattedName, $data);
     * } finally {
     *     $cloudFunctionsServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the function to be called.
     * @param string $data         Input to be passed to the function.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Functions\V1beta2\CallFunctionResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function callFunction($name, $data, $optionalArgs = [])
    {
        $request = new CallFunctionRequest();
        $request->setName($name);
        $request->setData($data);

        return $this->startCall(
            'CallFunction',
            CallFunctionResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
