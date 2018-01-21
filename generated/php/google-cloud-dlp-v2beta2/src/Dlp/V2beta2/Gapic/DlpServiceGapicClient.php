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
 * https://github.com/google/googleapis/blob/master/google/privacy/dlp/v2beta2/dlp.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * @experimental
 */

namespace Google\Cloud\Dlp\V2beta2\Gapic;

use Google\ApiCore\AgentHeaderDescriptor;
use Google\ApiCore\ApiCallable;
use Google\ApiCore\CallSettings;
use Google\ApiCore\GrpcCredentialsHelper;
use Google\ApiCore\PageStreamingDescriptor;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\ValidationException;
use Google\Cloud\Dlp\V2beta2\AnalyzeDataSourceRiskRequest;
use Google\Cloud\Dlp\V2beta2\CancelDlpJobRequest;
use Google\Cloud\Dlp\V2beta2\ContentItem;
use Google\Cloud\Dlp\V2beta2\CreateDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2beta2\CreateInspectTemplateRequest;
use Google\Cloud\Dlp\V2beta2\DeidentifyConfig;
use Google\Cloud\Dlp\V2beta2\DeidentifyContentRequest;
use Google\Cloud\Dlp\V2beta2\DeidentifyTemplate;
use Google\Cloud\Dlp\V2beta2\DeleteDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2beta2\DeleteDlpJobRequest;
use Google\Cloud\Dlp\V2beta2\DeleteInspectTemplateRequest;
use Google\Cloud\Dlp\V2beta2\DlpJobType;
use Google\Cloud\Dlp\V2beta2\DlpServiceGrpcClient;
use Google\Cloud\Dlp\V2beta2\GetDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2beta2\GetDlpJobRequest;
use Google\Cloud\Dlp\V2beta2\GetInspectTemplateRequest;
use Google\Cloud\Dlp\V2beta2\InspectConfig;
use Google\Cloud\Dlp\V2beta2\InspectContentRequest;
use Google\Cloud\Dlp\V2beta2\InspectDataSourceRequest;
use Google\Cloud\Dlp\V2beta2\InspectJobConfig;
use Google\Cloud\Dlp\V2beta2\InspectTemplate;
use Google\Cloud\Dlp\V2beta2\ListDeidentifyTemplatesRequest;
use Google\Cloud\Dlp\V2beta2\ListDlpJobsRequest;
use Google\Cloud\Dlp\V2beta2\ListInfoTypesRequest;
use Google\Cloud\Dlp\V2beta2\ListInspectTemplatesRequest;
use Google\Cloud\Dlp\V2beta2\RedactImageRequest;
use Google\Cloud\Dlp\V2beta2\RedactImageRequest_ImageRedactionConfig;
use Google\Cloud\Dlp\V2beta2\ReidentifyContentRequest;
use Google\Cloud\Dlp\V2beta2\RiskAnalysisJobConfig;
use Google\Cloud\Dlp\V2beta2\UpdateDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2beta2\UpdateInspectTemplateRequest;
use Google\Cloud\Version;
use Google\Protobuf\FieldMask;

/**
 * Service Description: The DLP API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other
 * privacy-sensitive data in user-supplied, unstructured data streams, like text
 * blocks or images.
 * The service also includes methods for sensitive data redaction and
 * scheduling of data scans on Google Cloud Platform based data sets.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $dlpServiceClient = new DlpServiceClient();
 * try {
 *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
 *     $response = $dlpServiceClient->inspectContent($formattedParent);
 * } finally {
 *     $dlpServiceClient->close();
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
class DlpServiceGapicClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'dlp.googleapis.com';

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

    private static $organizationNameTemplate;
    private static $deidentifyTemplateNameTemplate;
    private static $deidentifyTemplate2NameTemplate;
    private static $inspectTemplateNameTemplate;
    private static $inspectTemplate2NameTemplate;
    private static $projectNameTemplate;
    private static $dlpJobNameTemplate;
    private static $pathTemplateMap;
    private static $gapicVersion;
    private static $gapicVersionLoaded = false;

    protected $grpcCredentialsHelper;
    protected $dlpServiceStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    private static function getOrganizationNameTemplate()
    {
        if (self::$organizationNameTemplate == null) {
            self::$organizationNameTemplate = new PathTemplate('organizations/{organization}');
        }

        return self::$organizationNameTemplate;
    }

    private static function getDeidentifyTemplateNameTemplate()
    {
        if (self::$deidentifyTemplateNameTemplate == null) {
            self::$deidentifyTemplateNameTemplate = new PathTemplate('organizations/{organization}/deidentifyTemplates/{deidentify_template}');
        }

        return self::$deidentifyTemplateNameTemplate;
    }

    private static function getDeidentifyTemplate2NameTemplate()
    {
        if (self::$deidentifyTemplate2NameTemplate == null) {
            self::$deidentifyTemplate2NameTemplate = new PathTemplate('projects/{project}/deidentifyTemplates/{deidentify_template}');
        }

        return self::$deidentifyTemplate2NameTemplate;
    }

    private static function getInspectTemplateNameTemplate()
    {
        if (self::$inspectTemplateNameTemplate == null) {
            self::$inspectTemplateNameTemplate = new PathTemplate('organizations/{organization}/inspectTemplates/{inspect_template}');
        }

        return self::$inspectTemplateNameTemplate;
    }

    private static function getInspectTemplate2NameTemplate()
    {
        if (self::$inspectTemplate2NameTemplate == null) {
            self::$inspectTemplate2NameTemplate = new PathTemplate('projects/{project}/inspectTemplates/{inspect_template}');
        }

        return self::$inspectTemplate2NameTemplate;
    }

    private static function getProjectNameTemplate()
    {
        if (self::$projectNameTemplate == null) {
            self::$projectNameTemplate = new PathTemplate('projects/{project}');
        }

        return self::$projectNameTemplate;
    }

    private static function getDlpJobNameTemplate()
    {
        if (self::$dlpJobNameTemplate == null) {
            self::$dlpJobNameTemplate = new PathTemplate('projects/{project}/dlpJobs/{dlp_job}');
        }

        return self::$dlpJobNameTemplate;
    }

    private static function getPathTemplateMap()
    {
        if (self::$pathTemplateMap == null) {
            self::$pathTemplateMap = [
                'organization' => self::getOrganizationNameTemplate(),
                'deidentifyTemplate' => self::getDeidentifyTemplateNameTemplate(),
                'deidentifyTemplate2' => self::getDeidentifyTemplate2NameTemplate(),
                'inspectTemplate' => self::getInspectTemplateNameTemplate(),
                'inspectTemplate2' => self::getInspectTemplate2NameTemplate(),
                'project' => self::getProjectNameTemplate(),
                'dlpJob' => self::getDlpJobNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
    }

    private static function getPageStreamingDescriptors()
    {
        $listInspectTemplatesPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getInspectTemplates',
                ]);
        $listDeidentifyTemplatesPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getDeidentifyTemplates',
                ]);
        $listDlpJobsPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenGetMethod' => 'getPageToken',
                    'requestPageTokenSetMethod' => 'setPageToken',
                    'requestPageSizeGetMethod' => 'getPageSize',
                    'requestPageSizeSetMethod' => 'setPageSize',
                    'responsePageTokenGetMethod' => 'getNextPageToken',
                    'resourcesGetMethod' => 'getJobs',
                ]);

        $pageStreamingDescriptors = [
            'listInspectTemplates' => $listInspectTemplatesPageStreamingDescriptor,
            'listDeidentifyTemplates' => $listDeidentifyTemplatesPageStreamingDescriptor,
            'listDlpJobs' => $listDlpJobsPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    private static function getGapicVersion()
    {
        if (!self::$gapicVersionLoaded) {
            if (file_exists(__DIR__.'/../VERSION')) {
                self::$gapicVersion = trim(file_get_contents(__DIR__.'/../VERSION'));
            } elseif (class_exists(Version::class)) {
                self::$gapicVersion = Version::VERSION;
            }
            self::$gapicVersionLoaded = true;
        }

        return self::$gapicVersion;
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a organization resource.
     *
     * @param string $organization
     *
     * @return string The formatted organization resource.
     * @experimental
     */
    public static function organizationName($organization)
    {
        return self::getOrganizationNameTemplate()->render([
            'organization' => $organization,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a deidentify_template resource.
     *
     * @param string $organization
     * @param string $deidentifyTemplate
     *
     * @return string The formatted deidentify_template resource.
     * @experimental
     */
    public static function deidentifyTemplateName($organization, $deidentifyTemplate)
    {
        return self::getDeidentifyTemplateNameTemplate()->render([
            'organization' => $organization,
            'deidentify_template' => $deidentifyTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a deidentify_template_2 resource.
     *
     * @param string $project
     * @param string $deidentifyTemplate
     *
     * @return string The formatted deidentify_template_2 resource.
     * @experimental
     */
    public static function deidentifyTemplate2Name($project, $deidentifyTemplate)
    {
        return self::getDeidentifyTemplate2NameTemplate()->render([
            'project' => $project,
            'deidentify_template' => $deidentifyTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a inspect_template resource.
     *
     * @param string $organization
     * @param string $inspectTemplate
     *
     * @return string The formatted inspect_template resource.
     * @experimental
     */
    public static function inspectTemplateName($organization, $inspectTemplate)
    {
        return self::getInspectTemplateNameTemplate()->render([
            'organization' => $organization,
            'inspect_template' => $inspectTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a inspect_template_2 resource.
     *
     * @param string $project
     * @param string $inspectTemplate
     *
     * @return string The formatted inspect_template_2 resource.
     * @experimental
     */
    public static function inspectTemplate2Name($project, $inspectTemplate)
    {
        return self::getInspectTemplate2NameTemplate()->render([
            'project' => $project,
            'inspect_template' => $inspectTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project resource.
     *
     * @param string $project
     *
     * @return string The formatted project resource.
     * @experimental
     */
    public static function projectName($project)
    {
        return self::getProjectNameTemplate()->render([
            'project' => $project,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a dlp_job resource.
     *
     * @param string $project
     * @param string $dlpJob
     *
     * @return string The formatted dlp_job resource.
     * @experimental
     */
    public static function dlpJobName($project, $dlpJob)
    {
        return self::getDlpJobNameTemplate()->render([
            'project' => $project,
            'dlp_job' => $dlpJob,
        ]);
    }

    /**
     * Parses a formatted name string and returns an associative array of the components in the name.
     * The following name formats are supported:
     * Template: Pattern
     * - organization: organizations/{organization}
     * - deidentifyTemplate: organizations/{organization}/deidentifyTemplates/{deidentify_template}
     * - deidentifyTemplate2: projects/{project}/deidentifyTemplates/{deidentify_template}
     * - inspectTemplate: organizations/{organization}/inspectTemplates/{inspect_template}
     * - inspectTemplate2: projects/{project}/inspectTemplates/{inspect_template}
     * - project: projects/{project}
     * - dlpJob: projects/{project}/dlpJobs/{dlp_job}.
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
     *                                  Default 'dlp.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\Channel $channel
     *           A `Channel` object to be used by gRPC. If not specified, a channel will be constructed.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` object for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *           NOTE: if the $channel optional argument is specified, then this argument is unused.
     *     @type bool $forceNewChannel
     *           If true, this forces gRPC to create a new channel instead of using a persistent channel.
     *           Defaults to false.
     *           NOTE: if the $channel optional argument is specified, then this option is unused.
     *     @type \Google\Auth\CredentialsLoader $credentialsLoader
     *           A CredentialsLoader object created using the Google\Auth library.
     *     @type string[] $scopes A string array of scopes to use when acquiring credentials.
     *                          Defaults to the scopes for the DLP API.
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
            ],
            'retryingOverride' => null,
            'libName' => null,
            'libVersion' => null,
            'clientConfigPath' => __DIR__.'/../resources/dlp_service_client_config.json',
        ];
        $options = array_merge($defaultOptions, $options);

        $gapicVersion = $options['libVersion'] ?: self::getGapicVersion();

        $headerDescriptor = new AgentHeaderDescriptor([
            'libName' => $options['libName'],
            'libVersion' => $options['libVersion'],
            'gapicVersion' => $gapicVersion,
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'inspectContent' => $defaultDescriptors,
            'redactImage' => $defaultDescriptors,
            'deidentifyContent' => $defaultDescriptors,
            'reidentifyContent' => $defaultDescriptors,
            'inspectDataSource' => $defaultDescriptors,
            'analyzeDataSourceRisk' => $defaultDescriptors,
            'listInfoTypes' => $defaultDescriptors,
            'createInspectTemplate' => $defaultDescriptors,
            'updateInspectTemplate' => $defaultDescriptors,
            'getInspectTemplate' => $defaultDescriptors,
            'listInspectTemplates' => $defaultDescriptors,
            'deleteInspectTemplate' => $defaultDescriptors,
            'createDeidentifyTemplate' => $defaultDescriptors,
            'updateDeidentifyTemplate' => $defaultDescriptors,
            'getDeidentifyTemplate' => $defaultDescriptors,
            'listDeidentifyTemplates' => $defaultDescriptors,
            'deleteDeidentifyTemplate' => $defaultDescriptors,
            'listDlpJobs' => $defaultDescriptors,
            'getDlpJob' => $defaultDescriptors,
            'deleteDlpJob' => $defaultDescriptors,
            'cancelDlpJob' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents($options['clientConfigPath']);
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.privacy.dlp.v2beta2.DlpService',
                    $clientConfig,
                    $options['retryingOverride']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (array_key_exists('sslCreds', $options)) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($options);

        $createDlpServiceStubFunction = function ($hostname, $opts, $channel) {
            return new DlpServiceGrpcClient($hostname, $opts, $channel);
        };
        if (array_key_exists('createDlpServiceStubFunction', $options)) {
            $createDlpServiceStubFunction = $options['createDlpServiceStubFunction'];
        }
        $this->dlpServiceStub = $this->grpcCredentialsHelper->createStub($createDlpServiceStubFunction);
    }

    /**
     * Finds potentially sensitive info in content.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide for text](https://cloud.google.com/dlp/docs/inspecting-text), [How-to guide for
     * images](https://cloud.google.com/dlp/docs/inspecting-images).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->inspectContent($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectConfig $inspectConfig
     *          Configuration for the inspector. What specified here will override
     *          the template referenced by the inspect_template_name argument.
     *     @type ContentItem $item
     *          The item to inspect.
     *     @type string $inspectTemplateName
     *          Optional template to use. Any configuration directly specified in
     *          inspect_config will override those set in the template. Singular fields
     *          that are set in this request will replace their corresponding fields in the
     *          template. Repeated fields are appended. Singular sub-messages and groups
     *          are recursively merged.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\InspectContentResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function inspectContent($parent, $optionalArgs = [])
    {
        $request = new InspectContentRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['inspectConfig'])) {
            $request->setInspectConfig($optionalArgs['inspectConfig']);
        }
        if (isset($optionalArgs['item'])) {
            $request->setItem($optionalArgs['item']);
        }
        if (isset($optionalArgs['inspectTemplateName'])) {
            $request->setInspectTemplateName($optionalArgs['inspectTemplateName']);
        }

        $defaultCallSettings = $this->defaultCallSettings['inspectContent'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'InspectContent',
            $mergedSettings,
            $this->descriptors['inspectContent']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Redacts potentially sensitive info from an image.
     * This method has limits on input size, processing time, and output size.
     * [How-to guide](https://cloud.google.com/dlp/docs/redacting-sensitive-data-images).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->redactImage($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectConfig $inspectConfig
     *          Configuration for the inspector.
     *     @type string $imageType
     *          Type of the content, as defined in Content-Type HTTP header.
     *          Supported types are: PNG, JPEG, SVG, & BMP.
     *     @type string $imageData
     *          The bytes of the image to redact.
     *     @type RedactImageRequest_ImageRedactionConfig[] $imageRedactionConfigs
     *          The configuration for specifying what content to redact from images.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\RedactImageResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function redactImage($parent, $optionalArgs = [])
    {
        $request = new RedactImageRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['inspectConfig'])) {
            $request->setInspectConfig($optionalArgs['inspectConfig']);
        }
        if (isset($optionalArgs['imageType'])) {
            $request->setImageType($optionalArgs['imageType']);
        }
        if (isset($optionalArgs['imageData'])) {
            $request->setImageData($optionalArgs['imageData']);
        }
        if (isset($optionalArgs['imageRedactionConfigs'])) {
            $request->setImageRedactionConfigs($optionalArgs['imageRedactionConfigs']);
        }

        $defaultCallSettings = $this->defaultCallSettings['redactImage'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'RedactImage',
            $mergedSettings,
            $this->descriptors['redactImage']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * De-identifies potentially sensitive info from a ContentItem.
     * This method has limits on input size and output size.
     * [How-to guide](https://cloud.google.com/dlp/docs/deidentify-sensitive-data).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->deidentifyContent($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type DeidentifyConfig $deidentifyConfig
     *          Configuration for the de-identification of the content item.
     *          Items specified here will override the template referenced by the
     *          deidentify_template_name argument.
     *     @type InspectConfig $inspectConfig
     *          Configuration for the inspector.
     *          Items specified here will override the template referenced by the
     *          inspect_template_name argument.
     *     @type ContentItem $item
     *          The item to de-identify. Will be treated as text.
     *     @type string $inspectTemplateName
     *          Optional template to use. Any configuration directly specified in
     *          inspect_config will override those set in the template. Singular fields
     *          that are set in this request will replace their corresponding fields in the
     *          template. Repeated fields are appended. Singular sub-messages and groups
     *          are recursively merged.
     *     @type string $deidentifyTemplateName
     *          Optional template to use. Any configuration directly specified in
     *          deidentify_config will override those set in the template. Singular fields
     *          that are set in this request will replace their corresponding fields in the
     *          template. Repeated fields are appended. Singular sub-messages and groups
     *          are recursively merged.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DeidentifyContentResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function deidentifyContent($parent, $optionalArgs = [])
    {
        $request = new DeidentifyContentRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['deidentifyConfig'])) {
            $request->setDeidentifyConfig($optionalArgs['deidentifyConfig']);
        }
        if (isset($optionalArgs['inspectConfig'])) {
            $request->setInspectConfig($optionalArgs['inspectConfig']);
        }
        if (isset($optionalArgs['item'])) {
            $request->setItem($optionalArgs['item']);
        }
        if (isset($optionalArgs['inspectTemplateName'])) {
            $request->setInspectTemplateName($optionalArgs['inspectTemplateName']);
        }
        if (isset($optionalArgs['deidentifyTemplateName'])) {
            $request->setDeidentifyTemplateName($optionalArgs['deidentifyTemplateName']);
        }

        $defaultCallSettings = $this->defaultCallSettings['deidentifyContent'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'DeidentifyContent',
            $mergedSettings,
            $this->descriptors['deidentifyContent']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Re-identify content that has been de-identified.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->reidentifyContent($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type DeidentifyConfig $reidentifyConfig
     *          Configuration for the re-identification of the content item.
     *          This field shares the same proto message type that is used for
     *          de-identification, however its usage here is for the reversal of the
     *          previous de-identification. Re-identification is performed by examining
     *          the transformations used to de-identify the items and executing the
     *          reverse. This requires that only reversible transformations
     *          be provided here. The reversible transformations are:
     *
     *           - `CryptoReplaceFfxFpeConfig`
     *     @type InspectConfig $inspectConfig
     *          Configuration for the inspector.
     *     @type ContentItem $item
     *          The item to re-identify. Will be treated as text.
     *     @type string $inspectTemplateName
     *          Optional template to use. Any configuration directly specified in
     *          `inspect_config` will override those set in the template. Singular fields
     *          that are set in this request will replace their corresponding fields in the
     *          template. Repeated fields are appended. Singular sub-messages and groups
     *          are recursively merged.
     *     @type string $reidentifyTemplateName
     *          Optional template to use. References an instance of `DeidentifyTemplate`.
     *          Any configuration directly specified in `reidentify_config` or
     *          `inspect_config` will override those set in the template. Singular fields
     *          that are set in this request will replace their corresponding fields in the
     *          template. Repeated fields are appended. Singular sub-messages and groups
     *          are recursively merged.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\ReidentifyContentResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function reidentifyContent($parent, $optionalArgs = [])
    {
        $request = new ReidentifyContentRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['reidentifyConfig'])) {
            $request->setReidentifyConfig($optionalArgs['reidentifyConfig']);
        }
        if (isset($optionalArgs['inspectConfig'])) {
            $request->setInspectConfig($optionalArgs['inspectConfig']);
        }
        if (isset($optionalArgs['item'])) {
            $request->setItem($optionalArgs['item']);
        }
        if (isset($optionalArgs['inspectTemplateName'])) {
            $request->setInspectTemplateName($optionalArgs['inspectTemplateName']);
        }
        if (isset($optionalArgs['reidentifyTemplateName'])) {
            $request->setReidentifyTemplateName($optionalArgs['reidentifyTemplateName']);
        }

        $defaultCallSettings = $this->defaultCallSettings['reidentifyContent'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'ReidentifyContent',
            $mergedSettings,
            $this->descriptors['reidentifyContent']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Schedules a job scanning content in a Google Cloud Platform data
     * repository. [How-to guide](https://cloud.google.com/dlp/docs/inspecting-storage).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->inspectDataSource($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectJobConfig $jobConfig
     *          A configuration for the job.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DlpJob
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function inspectDataSource($parent, $optionalArgs = [])
    {
        $request = new InspectDataSourceRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['jobConfig'])) {
            $request->setJobConfig($optionalArgs['jobConfig']);
        }

        $defaultCallSettings = $this->defaultCallSettings['inspectDataSource'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'InspectDataSource',
            $mergedSettings,
            $this->descriptors['inspectDataSource']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Schedules a job to compute risk analysis metrics over content in a Google
     * Cloud Platform repository. [How-to guide}(/dlp/docs/compute-risk-analysis).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->analyzeDataSourceRisk($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type RiskAnalysisJobConfig $jobConfig
     *          Configuration for this risk analysis job.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DlpJob
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function analyzeDataSourceRisk($parent, $optionalArgs = [])
    {
        $request = new AnalyzeDataSourceRiskRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['jobConfig'])) {
            $request->setJobConfig($optionalArgs['jobConfig']);
        }

        $defaultCallSettings = $this->defaultCallSettings['analyzeDataSourceRisk'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'AnalyzeDataSourceRisk',
            $mergedSettings,
            $this->descriptors['analyzeDataSourceRisk']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Returns sensitive information types DLP supports.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *
     *     $response = $dlpServiceClient->listInfoTypes();
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type string $languageCode
     *          Optional BCP-47 language code for localized infoType friendly
     *          names. If omitted, or if localized strings are not available,
     *          en-US strings will be returned.
     *     @type string $filter
     *          Optional filter to only return infoTypes supported by certain parts of the
     *          API. Defaults to supported_by=INSPECT.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\ListInfoTypesResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function listInfoTypes($optionalArgs = [])
    {
        $request = new ListInfoTypesRequest();
        if (isset($optionalArgs['languageCode'])) {
            $request->setLanguageCode($optionalArgs['languageCode']);
        }
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }

        $defaultCallSettings = $this->defaultCallSettings['listInfoTypes'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'ListInfoTypes',
            $mergedSettings,
            $this->descriptors['listInfoTypes']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Creates an inspect template for re-using frequently used configuration
     * for inspecting content, images, and storage.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->organizationName('[ORGANIZATION]');
     *     $response = $dlpServiceClient->createInspectTemplate($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id or
     *                             organizations/my-org-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectTemplate $inspectTemplate
     *          The InspectTemplate to create.
     *     @type string $templateId
     *          The template id can contain uppercase and lowercase letters,
     *          numbers, and hyphens; that is, it must match the regular
     *          expression: `[a-zA-Z\\d-]+`. The maximum length is 100
     *          characters. Can be empty to allow the system to generate one.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\InspectTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function createInspectTemplate($parent, $optionalArgs = [])
    {
        $request = new CreateInspectTemplateRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['inspectTemplate'])) {
            $request->setInspectTemplate($optionalArgs['inspectTemplate']);
        }
        if (isset($optionalArgs['templateId'])) {
            $request->setTemplateId($optionalArgs['templateId']);
        }

        $defaultCallSettings = $this->defaultCallSettings['createInspectTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'CreateInspectTemplate',
            $mergedSettings,
            $this->descriptors['createInspectTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates the inspect template.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');
     *     $response = $dlpServiceClient->updateInspectTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of organization and inspectTemplate to be updated, for
     *                             example `organizations/433245324/inspectTemplates/432452342`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectTemplate $inspectTemplate
     *          New InspectTemplate value.
     *     @type FieldMask $updateMask
     *          Mask to control which fields get updated.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\InspectTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function updateInspectTemplate($name, $optionalArgs = [])
    {
        $request = new UpdateInspectTemplateRequest();
        $request->setName($name);
        if (isset($optionalArgs['inspectTemplate'])) {
            $request->setInspectTemplate($optionalArgs['inspectTemplate']);
        }
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        $defaultCallSettings = $this->defaultCallSettings['updateInspectTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'UpdateInspectTemplate',
            $mergedSettings,
            $this->descriptors['updateInspectTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets an inspect template.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *
     *     $response = $dlpServiceClient->getInspectTemplate();
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type string $name
     *          Resource name of the organization and inspectTemplate to be read, for
     *          example `organizations/433245324/inspectTemplates/432452342`.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\InspectTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function getInspectTemplate($optionalArgs = [])
    {
        $request = new GetInspectTemplateRequest();
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }

        $defaultCallSettings = $this->defaultCallSettings['getInspectTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'GetInspectTemplate',
            $mergedSettings,
            $this->descriptors['getInspectTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists inspect templates.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->organizationName('[ORGANIZATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $dlpServiceClient->listInspectTemplates($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $dlpServiceClient->listInspectTemplates($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id or
     *                             organizations/my-org-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function listInspectTemplates($parent, $optionalArgs = [])
    {
        $request = new ListInspectTemplatesRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }

        $defaultCallSettings = $this->defaultCallSettings['listInspectTemplates'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'ListInspectTemplates',
            $mergedSettings,
            $this->descriptors['listInspectTemplates']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes inspect templates.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->inspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');
     *     $dlpServiceClient->deleteInspectTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and inspectTemplate to be deleted, for
     *                             example `organizations/433245324/inspectTemplates/432452342`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function deleteInspectTemplate($name, $optionalArgs = [])
    {
        $request = new DeleteInspectTemplateRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['deleteInspectTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'DeleteInspectTemplate',
            $mergedSettings,
            $this->descriptors['deleteInspectTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Creates an Deidentify template for re-using frequently used configuration
     * for Deidentifying content, images, and storage.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->organizationName('[ORGANIZATION]');
     *     $response = $dlpServiceClient->createDeidentifyTemplate($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id or
     *                             organizations/my-org-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type DeidentifyTemplate $deidentifyTemplate
     *          The DeidentifyTemplate to create.
     *     @type string $templateId
     *          The template id can contain uppercase and lowercase letters,
     *          numbers, and hyphens; that is, it must match the regular
     *          expression: `[a-zA-Z\\d-]+`. The maximum length is 100
     *          characters. Can be empty to allow the system to generate one.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DeidentifyTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function createDeidentifyTemplate($parent, $optionalArgs = [])
    {
        $request = new CreateDeidentifyTemplateRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['deidentifyTemplate'])) {
            $request->setDeidentifyTemplate($optionalArgs['deidentifyTemplate']);
        }
        if (isset($optionalArgs['templateId'])) {
            $request->setTemplateId($optionalArgs['templateId']);
        }

        $defaultCallSettings = $this->defaultCallSettings['createDeidentifyTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'CreateDeidentifyTemplate',
            $mergedSettings,
            $this->descriptors['createDeidentifyTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates the inspect template.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $response = $dlpServiceClient->updateDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of organization and deidentify template to be updated, for
     *                             example `organizations/433245324/deidentifyTemplates/432452342`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type DeidentifyTemplate $deidentifyTemplate
     *          New DeidentifyTemplate value.
     *     @type FieldMask $updateMask
     *          Mask to control which fields get updated.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DeidentifyTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function updateDeidentifyTemplate($name, $optionalArgs = [])
    {
        $request = new UpdateDeidentifyTemplateRequest();
        $request->setName($name);
        if (isset($optionalArgs['deidentifyTemplate'])) {
            $request->setDeidentifyTemplate($optionalArgs['deidentifyTemplate']);
        }
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        $defaultCallSettings = $this->defaultCallSettings['updateDeidentifyTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'UpdateDeidentifyTemplate',
            $mergedSettings,
            $this->descriptors['updateDeidentifyTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets an inspect template.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $response = $dlpServiceClient->getDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and deidentify template to be read, for
     *                             example `organizations/433245324/deidentifyTemplates/432452342`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DeidentifyTemplate
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function getDeidentifyTemplate($name, $optionalArgs = [])
    {
        $request = new GetDeidentifyTemplateRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['getDeidentifyTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'GetDeidentifyTemplate',
            $mergedSettings,
            $this->descriptors['getDeidentifyTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists inspect templates.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->organizationName('[ORGANIZATION]');
     *     // Iterate through all elements
     *     $pagedResponse = $dlpServiceClient->listDeidentifyTemplates($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $dlpServiceClient->listDeidentifyTemplates($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id or
     *                             organizations/my-org-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function listDeidentifyTemplates($parent, $optionalArgs = [])
    {
        $request = new ListDeidentifyTemplatesRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }

        $defaultCallSettings = $this->defaultCallSettings['listDeidentifyTemplates'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'ListDeidentifyTemplates',
            $mergedSettings,
            $this->descriptors['listDeidentifyTemplates']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes inspect templates.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->deidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $dlpServiceClient->deleteDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and deidentify template to be deleted,
     *                             for example `organizations/433245324/deidentifyTemplates/432452342`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function deleteDeidentifyTemplate($name, $optionalArgs = [])
    {
        $request = new DeleteDeidentifyTemplateRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['deleteDeidentifyTemplate'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'DeleteDeidentifyTemplate',
            $mergedSettings,
            $this->descriptors['deleteDeidentifyTemplate']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists DlpJobs that match the specified filter in the request.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $dlpServiceClient->listDlpJobs($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $dlpServiceClient->listDlpJobs($formattedParent);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type string $filter
     *          Optional. Allows filtering.
     *
     *          Supported syntax:
     *
     *          * Filter expressions are made up of one or more restrictions.
     *          * Restrictions can be combined by `AND` or `OR` logical operators. A
     *          sequence of restrictions implicitly uses `AND`.
     *          * A restriction has the form of `<field> <operator> <value>`.
     *          * Supported fields/values for inspect jobs:
     *              - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
     *              - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     *          * Supported fields for risk analysis jobs:
     *              - `state` - RUNNING|CANCELED|FINISHED|FAILED
     *          * The operator must be `=` or `!=`.
     *
     *          Examples:
     *
     *          * inspected_storage = cloud_storage AND state = done
     *          * inspected_storage = cloud_storage OR inspected_storage = bigquery
     *          * inspected_storage = cloud_storage AND (state = done OR state = canceled)
     *
     *          The length of this field should be no more than 500 characters.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $type
     *          The type of job. Defaults to `DlpJobType.INSPECT`
     *          For allowed values, use constants defined on {@see \Google\Cloud\Dlp\V2beta2\DlpJobType}
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\ApiCore\PagedListResponse
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function listDlpJobs($parent, $optionalArgs = [])
    {
        $request = new ListDlpJobsRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['filter'])) {
            $request->setFilter($optionalArgs['filter']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['type'])) {
            $request->setType($optionalArgs['type']);
        }

        $defaultCallSettings = $this->defaultCallSettings['listDlpJobs'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'ListDlpJobs',
            $mergedSettings,
            $this->descriptors['listDlpJobs']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the latest state of a long-running DlpJob.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->dlpJobName('[PROJECT]', '[DLP_JOB]');
     *     $response = $dlpServiceClient->getDlpJob($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the DlpJob resource.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2beta2\DlpJob
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function getDlpJob($name, $optionalArgs = [])
    {
        $request = new GetDlpJobRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['getDlpJob'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'GetDlpJob',
            $mergedSettings,
            $this->descriptors['getDlpJob']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes a long-running DlpJob. This method indicates that the client is
     * no longer interested in the DlpJob result. The job will be cancelled if
     * possible.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->dlpJobName('[PROJECT]', '[DLP_JOB]');
     *     $dlpServiceClient->deleteDlpJob($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the DlpJob resource to be deleted.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function deleteDlpJob($name, $optionalArgs = [])
    {
        $request = new DeleteDlpJobRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['deleteDlpJob'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'DeleteDlpJob',
            $mergedSettings,
            $this->descriptors['deleteDlpJob']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Starts asynchronous cancellation on a long-running DlpJob.  The server
     * makes a best effort to cancel the DlpJob, but success is not
     * guaranteed.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->dlpJobName('[PROJECT]', '[DLP_JOB]');
     *     $dlpServiceClient->cancelDlpJob($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         The name of the DlpJob resource to be cancelled.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type \Google\ApiCore\RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws \Google\ApiCore\ApiException if the remote call fails
     * @experimental
     */
    public function cancelDlpJob($name, $optionalArgs = [])
    {
        $request = new CancelDlpJobRequest();
        $request->setName($name);

        $defaultCallSettings = $this->defaultCallSettings['cancelDlpJob'];
        if (isset($optionalArgs['retrySettings']) && is_array($optionalArgs['retrySettings'])) {
            $optionalArgs['retrySettings'] = $defaultCallSettings->getRetrySettings()->with(
                $optionalArgs['retrySettings']
            );
        }
        $mergedSettings = $defaultCallSettings->merge(new CallSettings($optionalArgs));
        $callable = ApiCallable::createApiCall(
            $this->dlpServiceStub,
            'CancelDlpJob',
            $mergedSettings,
            $this->descriptors['cancelDlpJob']
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
        $this->dlpServiceStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
