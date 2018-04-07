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
 * https://github.com/google/googleapis/blob/master/google/privacy/dlp/v2/dlp.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Cloud\Dlp\V2\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\Call;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\PathTemplate;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Auth\CredentialsLoader;
use Google\Cloud\Dlp\V2\ByteContentItem;
use Google\Cloud\Dlp\V2\CancelDlpJobRequest;
use Google\Cloud\Dlp\V2\ContentItem;
use Google\Cloud\Dlp\V2\CreateDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2\CreateDlpJobRequest;
use Google\Cloud\Dlp\V2\CreateInspectTemplateRequest;
use Google\Cloud\Dlp\V2\CreateJobTriggerRequest;
use Google\Cloud\Dlp\V2\DeidentifyConfig;
use Google\Cloud\Dlp\V2\DeidentifyContentRequest;
use Google\Cloud\Dlp\V2\DeidentifyContentResponse;
use Google\Cloud\Dlp\V2\DeidentifyTemplate;
use Google\Cloud\Dlp\V2\DeleteDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2\DeleteDlpJobRequest;
use Google\Cloud\Dlp\V2\DeleteInspectTemplateRequest;
use Google\Cloud\Dlp\V2\DeleteJobTriggerRequest;
use Google\Cloud\Dlp\V2\DlpJob;
use Google\Cloud\Dlp\V2\DlpJobType;
use Google\Cloud\Dlp\V2\GetDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2\GetDlpJobRequest;
use Google\Cloud\Dlp\V2\GetInspectTemplateRequest;
use Google\Cloud\Dlp\V2\GetJobTriggerRequest;
use Google\Cloud\Dlp\V2\InspectConfig;
use Google\Cloud\Dlp\V2\InspectContentRequest;
use Google\Cloud\Dlp\V2\InspectContentResponse;
use Google\Cloud\Dlp\V2\InspectJobConfig;
use Google\Cloud\Dlp\V2\InspectTemplate;
use Google\Cloud\Dlp\V2\JobTrigger;
use Google\Cloud\Dlp\V2\ListDeidentifyTemplatesRequest;
use Google\Cloud\Dlp\V2\ListDeidentifyTemplatesResponse;
use Google\Cloud\Dlp\V2\ListDlpJobsRequest;
use Google\Cloud\Dlp\V2\ListDlpJobsResponse;
use Google\Cloud\Dlp\V2\ListInfoTypesRequest;
use Google\Cloud\Dlp\V2\ListInfoTypesResponse;
use Google\Cloud\Dlp\V2\ListInspectTemplatesRequest;
use Google\Cloud\Dlp\V2\ListInspectTemplatesResponse;
use Google\Cloud\Dlp\V2\ListJobTriggersRequest;
use Google\Cloud\Dlp\V2\ListJobTriggersResponse;
use Google\Cloud\Dlp\V2\RedactImageRequest;
use Google\Cloud\Dlp\V2\RedactImageRequest_ImageRedactionConfig;
use Google\Cloud\Dlp\V2\RedactImageResponse;
use Google\Cloud\Dlp\V2\ReidentifyContentRequest;
use Google\Cloud\Dlp\V2\ReidentifyContentResponse;
use Google\Cloud\Dlp\V2\RiskAnalysisJobConfig;
use Google\Cloud\Dlp\V2\UpdateDeidentifyTemplateRequest;
use Google\Cloud\Dlp\V2\UpdateInspectTemplateRequest;
use Google\Cloud\Dlp\V2\UpdateJobTriggerRequest;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Grpc\Channel;
use Grpc\ChannelCredentials;

/**
 * Service Description: The Cloud Data Loss Prevention (DLP) API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other
 * privacy-sensitive data in user-supplied, unstructured data streams, like text
 * blocks or images.
 * The service also includes methods for sensitive data redaction and
 * scheduling of data scans on Google Cloud Platform based data sets.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
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
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.privacy.dlp.v2.DlpService';

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
    private static $organizationDeidentifyTemplateNameTemplate;
    private static $projectDeidentifyTemplateNameTemplate;
    private static $organizationInspectTemplateNameTemplate;
    private static $projectInspectTemplateNameTemplate;
    private static $projectJobTriggerNameTemplate;
    private static $projectNameTemplate;
    private static $dlpJobNameTemplate;
    private static $pathTemplateMap;

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/cloud-platform',
            ],
            'clientConfigPath' => __DIR__.'/../resources/dlp_service_client_config.json',
            'restClientConfigPath' => __DIR__.'/../resources/dlp_service_rest_client_config.php',
            'descriptorsConfigPath' => __DIR__.'/../resources/dlp_service_descriptor_config.php',
            'versionFile' => __DIR__.'/../../VERSION',
        ];
    }

    private static function getOrganizationNameTemplate()
    {
        if (self::$organizationNameTemplate == null) {
            self::$organizationNameTemplate = new PathTemplate('organizations/{organization}');
        }

        return self::$organizationNameTemplate;
    }

    private static function getOrganizationDeidentifyTemplateNameTemplate()
    {
        if (self::$organizationDeidentifyTemplateNameTemplate == null) {
            self::$organizationDeidentifyTemplateNameTemplate = new PathTemplate('organizations/{organization}/deidentifyTemplates/{deidentify_template}');
        }

        return self::$organizationDeidentifyTemplateNameTemplate;
    }

    private static function getProjectDeidentifyTemplateNameTemplate()
    {
        if (self::$projectDeidentifyTemplateNameTemplate == null) {
            self::$projectDeidentifyTemplateNameTemplate = new PathTemplate('projects/{project}/deidentifyTemplates/{deidentify_template}');
        }

        return self::$projectDeidentifyTemplateNameTemplate;
    }

    private static function getOrganizationInspectTemplateNameTemplate()
    {
        if (self::$organizationInspectTemplateNameTemplate == null) {
            self::$organizationInspectTemplateNameTemplate = new PathTemplate('organizations/{organization}/inspectTemplates/{inspect_template}');
        }

        return self::$organizationInspectTemplateNameTemplate;
    }

    private static function getProjectInspectTemplateNameTemplate()
    {
        if (self::$projectInspectTemplateNameTemplate == null) {
            self::$projectInspectTemplateNameTemplate = new PathTemplate('projects/{project}/inspectTemplates/{inspect_template}');
        }

        return self::$projectInspectTemplateNameTemplate;
    }

    private static function getProjectJobTriggerNameTemplate()
    {
        if (self::$projectJobTriggerNameTemplate == null) {
            self::$projectJobTriggerNameTemplate = new PathTemplate('projects/{project}/jobTriggers/{job_trigger}');
        }

        return self::$projectJobTriggerNameTemplate;
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
                'organizationDeidentifyTemplate' => self::getOrganizationDeidentifyTemplateNameTemplate(),
                'projectDeidentifyTemplate' => self::getProjectDeidentifyTemplateNameTemplate(),
                'organizationInspectTemplate' => self::getOrganizationInspectTemplateNameTemplate(),
                'projectInspectTemplate' => self::getProjectInspectTemplateNameTemplate(),
                'projectJobTrigger' => self::getProjectJobTriggerNameTemplate(),
                'project' => self::getProjectNameTemplate(),
                'dlpJob' => self::getDlpJobNameTemplate(),
            ];
        }

        return self::$pathTemplateMap;
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
     * a organization_deidentify_template resource.
     *
     * @param string $organization
     * @param string $deidentifyTemplate
     *
     * @return string The formatted organization_deidentify_template resource.
     * @experimental
     */
    public static function organizationDeidentifyTemplateName($organization, $deidentifyTemplate)
    {
        return self::getOrganizationDeidentifyTemplateNameTemplate()->render([
            'organization' => $organization,
            'deidentify_template' => $deidentifyTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project_deidentify_template resource.
     *
     * @param string $project
     * @param string $deidentifyTemplate
     *
     * @return string The formatted project_deidentify_template resource.
     * @experimental
     */
    public static function projectDeidentifyTemplateName($project, $deidentifyTemplate)
    {
        return self::getProjectDeidentifyTemplateNameTemplate()->render([
            'project' => $project,
            'deidentify_template' => $deidentifyTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a organization_inspect_template resource.
     *
     * @param string $organization
     * @param string $inspectTemplate
     *
     * @return string The formatted organization_inspect_template resource.
     * @experimental
     */
    public static function organizationInspectTemplateName($organization, $inspectTemplate)
    {
        return self::getOrganizationInspectTemplateNameTemplate()->render([
            'organization' => $organization,
            'inspect_template' => $inspectTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project_inspect_template resource.
     *
     * @param string $project
     * @param string $inspectTemplate
     *
     * @return string The formatted project_inspect_template resource.
     * @experimental
     */
    public static function projectInspectTemplateName($project, $inspectTemplate)
    {
        return self::getProjectInspectTemplateNameTemplate()->render([
            'project' => $project,
            'inspect_template' => $inspectTemplate,
        ]);
    }

    /**
     * Formats a string containing the fully-qualified path to represent
     * a project_job_trigger resource.
     *
     * @param string $project
     * @param string $jobTrigger
     *
     * @return string The formatted project_job_trigger resource.
     * @experimental
     */
    public static function projectJobTriggerName($project, $jobTrigger)
    {
        return self::getProjectJobTriggerNameTemplate()->render([
            'project' => $project,
            'job_trigger' => $jobTrigger,
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
     * - organizationDeidentifyTemplate: organizations/{organization}/deidentifyTemplates/{deidentify_template}
     * - projectDeidentifyTemplate: projects/{project}/deidentifyTemplates/{deidentify_template}
     * - organizationInspectTemplate: organizations/{organization}/inspectTemplates/{inspect_template}
     * - projectInspectTemplate: projects/{project}/inspectTemplates/{inspect_template}
     * - projectJobTrigger: projects/{project}/jobTriggers/{job_trigger}
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
     *                          Defaults to the scopes for the Cloud Data Loss Prevention (DLP) API.
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\InspectContentResponse
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'InspectContent',
            InspectContentResponse::class,
            $optionalArgs,
            $request
        )->wait();
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
     *     @type RedactImageRequest_ImageRedactionConfig[] $imageRedactionConfigs
     *          The configuration for specifying what content to redact from images.
     *     @type ByteContentItem $byteItem
     *          The content must be PNG, JPEG, SVG or BMP.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\RedactImageResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function redactImage($parent, $optionalArgs = [])
    {
        $request = new RedactImageRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['inspectConfig'])) {
            $request->setInspectConfig($optionalArgs['inspectConfig']);
        }
        if (isset($optionalArgs['imageRedactionConfigs'])) {
            $request->setImageRedactionConfigs($optionalArgs['imageRedactionConfigs']);
        }
        if (isset($optionalArgs['byteItem'])) {
            $request->setByteItem($optionalArgs['byteItem']);
        }

        return $this->startCall(
            'RedactImage',
            RedactImageResponse::class,
            $optionalArgs,
            $request
        )->wait();
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\DeidentifyContentResponse
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'DeidentifyContent',
            DeidentifyContentResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Re-identifies content that has been de-identified.
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\ReidentifyContentResponse
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'ReidentifyContent',
            ReidentifyContentResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Returns a list of the sensitive information types that the DLP API
     * supports. For more information, see [Listing supported predefined
     * infoTypes](https://cloud.google.com/dlp/docs/listing-infotypes).
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\ListInfoTypesResponse
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'ListInfoTypes',
            ListInfoTypesResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates an InspectTemplate for re-using frequently used configuration
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\InspectTemplate
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'CreateInspectTemplate',
            InspectTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates the InspectTemplate.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->organizationInspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');
     *     $response = $dlpServiceClient->updateInspectTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of organization and inspectTemplate to be updated, for
     *                             example `organizations/433245324/inspectTemplates/432452342` or
     *                             projects/project-id/inspectTemplates/432452342.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectTemplate $inspectTemplate
     *          New InspectTemplate value.
     *     @type FieldMask $updateMask
     *          Mask to control which fields get updated.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\InspectTemplate
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'UpdateInspectTemplate',
            InspectTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets an InspectTemplate.
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
     *          example `organizations/433245324/inspectTemplates/432452342` or
     *          projects/project-id/inspectTemplates/432452342.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\InspectTemplate
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getInspectTemplate($optionalArgs = [])
    {
        $request = new GetInspectTemplateRequest();
        if (isset($optionalArgs['name'])) {
            $request->setName($optionalArgs['name']);
        }

        return $this->startCall(
            'GetInspectTemplate',
            InspectTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists InspectTemplates.
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

        return $this->getPagedListResponse(
            'ListInspectTemplates',
            $optionalArgs,
            ListInspectTemplatesResponse::class,
            $request
        );
    }

    /**
     * Deletes an InspectTemplate.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->organizationInspectTemplateName('[ORGANIZATION]', '[INSPECT_TEMPLATE]');
     *     $dlpServiceClient->deleteInspectTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and inspectTemplate to be deleted, for
     *                             example `organizations/433245324/inspectTemplates/432452342` or
     *                             projects/project-id/inspectTemplates/432452342.
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
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteInspectTemplate($name, $optionalArgs = [])
    {
        $request = new DeleteInspectTemplateRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteInspectTemplate',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a DeidentifyTemplate for re-using frequently used configuration
     * for de-identifying content, images, and storage.
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\DeidentifyTemplate
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'CreateDeidentifyTemplate',
            DeidentifyTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates the DeidentifyTemplate.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->organizationDeidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $response = $dlpServiceClient->updateDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of organization and deidentify template to be updated, for
     *                             example `organizations/433245324/deidentifyTemplates/432452342` or
     *                             projects/project-id/deidentifyTemplates/432452342.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type DeidentifyTemplate $deidentifyTemplate
     *          New DeidentifyTemplate value.
     *     @type FieldMask $updateMask
     *          Mask to control which fields get updated.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\DeidentifyTemplate
     *
     * @throws ApiException if the remote call fails
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

        return $this->startCall(
            'UpdateDeidentifyTemplate',
            DeidentifyTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets a DeidentifyTemplate.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->organizationDeidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $response = $dlpServiceClient->getDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and deidentify template to be read, for
     *                             example `organizations/433245324/deidentifyTemplates/432452342` or
     *                             projects/project-id/deidentifyTemplates/432452342.
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
     * @return \Google\Cloud\Dlp\V2\DeidentifyTemplate
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getDeidentifyTemplate($name, $optionalArgs = [])
    {
        $request = new GetDeidentifyTemplateRequest();
        $request->setName($name);

        return $this->startCall(
            'GetDeidentifyTemplate',
            DeidentifyTemplate::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists DeidentifyTemplates.
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

        return $this->getPagedListResponse(
            'ListDeidentifyTemplates',
            $optionalArgs,
            ListDeidentifyTemplatesResponse::class,
            $request
        );
    }

    /**
     * Deletes a DeidentifyTemplate.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->organizationDeidentifyTemplateName('[ORGANIZATION]', '[DEIDENTIFY_TEMPLATE]');
     *     $dlpServiceClient->deleteDeidentifyTemplate($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the organization and deidentify template to be deleted,
     *                             for example `organizations/433245324/deidentifyTemplates/432452342` or
     *                             projects/project-id/deidentifyTemplates/432452342.
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
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteDeidentifyTemplate($name, $optionalArgs = [])
    {
        $request = new DeleteDeidentifyTemplateRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteDeidentifyTemplate',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a new job to inspect storage or calculate risk metrics.
     * [How-to guide](https://cloud.google.com/dlp/docs/compute-risk-analysis).
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->createDlpJob($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type InspectJobConfig $inspectJob
     *     @type RiskAnalysisJobConfig $riskJob
     *     @type string $jobId
     *          The job id can contain uppercase and lowercase letters,
     *          numbers, and hyphens; that is, it must match the regular
     *          expression: `[a-zA-Z\\d-]+`. The maximum length is 100
     *          characters. Can be empty to allow the system to generate one.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\DlpJob
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createDlpJob($parent, $optionalArgs = [])
    {
        $request = new CreateDlpJobRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['inspectJob'])) {
            $request->setInspectJob($optionalArgs['inspectJob']);
        }
        if (isset($optionalArgs['riskJob'])) {
            $request->setRiskJob($optionalArgs['riskJob']);
        }
        if (isset($optionalArgs['jobId'])) {
            $request->setJobId($optionalArgs['jobId']);
        }

        return $this->startCall(
            'CreateDlpJob',
            DlpJob::class,
            $optionalArgs,
            $request
        )->wait();
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
     *              - `trigger_name` - The resource name of the trigger that created job.
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
     *          For allowed values, use constants defined on {@see \Google\Cloud\Dlp\V2\DlpJobType}
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

        return $this->getPagedListResponse(
            'ListDlpJobs',
            $optionalArgs,
            ListDlpJobsResponse::class,
            $request
        );
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\DlpJob
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getDlpJob($name, $optionalArgs = [])
    {
        $request = new GetDlpJobRequest();
        $request->setName($name);

        return $this->startCall(
            'GetDlpJob',
            DlpJob::class,
            $optionalArgs,
            $request
        )->wait();
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteDlpJob($name, $optionalArgs = [])
    {
        $request = new DeleteDlpJobRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteDlpJob',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Starts asynchronous cancellation on a long-running DlpJob. The server
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
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function cancelDlpJob($name, $optionalArgs = [])
    {
        $request = new CancelDlpJobRequest();
        $request->setName($name);

        return $this->startCall(
            'CancelDlpJob',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists job triggers.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     // Iterate through all elements
     *     $pagedResponse = $dlpServiceClient->listJobTriggers($formattedParent);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $dlpServiceClient->listJobTriggers($formattedParent);
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
     *     @type string $pageToken
     *          A page token is used to specify a page of values to be returned.
     *          If no page token is specified (the default), the first page
     *          of values will be returned. Any page token used here must have
     *          been generated by a previous call to the API.
     *     @type int $pageSize
     *          The maximum number of resources contained in the underlying API
     *          response. The API may return fewer values in a page, even if
     *          there are additional values to be retrieved.
     *     @type string $orderBy
     *          Optional comma separated list of triggeredJob fields to order by,
     *          followed by 'asc/desc' postfix, i.e.
     *          `"create_time asc,name desc,schedule_mode asc"`. This list is
     *          case-insensitive.
     *
     *          Example: `"name asc,schedule_mode desc, status desc"`
     *
     *          Supported filters keys and values are:
     *
     *          - `create_time`: corresponds to time the triggeredJob was created.
     *          - `update_time`: corresponds to time the triggeredJob was last updated.
     *          - `name`: corresponds to JobTrigger's display name.
     *          - `status`: corresponds to the triggeredJob status.
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
    public function listJobTriggers($parent, $optionalArgs = [])
    {
        $request = new ListJobTriggersRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['orderBy'])) {
            $request->setOrderBy($optionalArgs['orderBy']);
        }

        return $this->getPagedListResponse(
            'ListJobTriggers',
            $optionalArgs,
            ListJobTriggersResponse::class,
            $request
        );
    }

    /**
     * Gets a job trigger.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->projectJobTriggerName('[PROJECT]', '[JOB_TRIGGER]');
     *     $response = $dlpServiceClient->getJobTrigger($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the project and the triggeredJob, for example
     *                             `projects/dlp-test-project/jobTriggers/53234423`.
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
     * @return \Google\Cloud\Dlp\V2\JobTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getJobTrigger($name, $optionalArgs = [])
    {
        $request = new GetJobTriggerRequest();
        $request->setName($name);

        return $this->startCall(
            'GetJobTrigger',
            JobTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a job trigger.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $name = '';
     *     $dlpServiceClient->deleteJobTrigger($name);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the project and the triggeredJob, for example
     *                             `projects/dlp-test-project/jobTriggers/53234423`.
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
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function deleteJobTrigger($name, $optionalArgs = [])
    {
        $request = new DeleteJobTriggerRequest();
        $request->setName($name);

        return $this->startCall(
            'DeleteJobTrigger',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates a job trigger.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedName = $dlpServiceClient->projectJobTriggerName('[PROJECT]', '[JOB_TRIGGER]');
     *     $response = $dlpServiceClient->updateJobTrigger($formattedName);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $name         Resource name of the project and the triggeredJob, for example
     *                             `projects/dlp-test-project/jobTriggers/53234423`.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type JobTrigger $jobTrigger
     *          New JobTrigger value.
     *     @type FieldMask $updateMask
     *          Mask to control which fields get updated.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\JobTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updateJobTrigger($name, $optionalArgs = [])
    {
        $request = new UpdateJobTriggerRequest();
        $request->setName($name);
        if (isset($optionalArgs['jobTrigger'])) {
            $request->setJobTrigger($optionalArgs['jobTrigger']);
        }
        if (isset($optionalArgs['updateMask'])) {
            $request->setUpdateMask($optionalArgs['updateMask']);
        }

        return $this->startCall(
            'UpdateJobTrigger',
            JobTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Creates a job trigger to run DLP actions such as scanning storage for
     * sensitive information on a set schedule.
     *
     * Sample code:
     * ```
     * $dlpServiceClient = new DlpServiceClient();
     * try {
     *     $formattedParent = $dlpServiceClient->projectName('[PROJECT]');
     *     $response = $dlpServiceClient->createJobTrigger($formattedParent);
     * } finally {
     *     $dlpServiceClient->close();
     * }
     * ```
     *
     * @param string $parent       The parent resource name, for example projects/my-project-id.
     * @param array  $optionalArgs {
     *                             Optional.
     *
     *     @type JobTrigger $jobTrigger
     *          The JobTrigger to create.
     *     @type string $triggerId
     *          The trigger id can contain uppercase and lowercase letters,
     *          numbers, and hyphens; that is, it must match the regular
     *          expression: `[a-zA-Z\\d-]+`. The maximum length is 100
     *          characters. Can be empty to allow the system to generate one.
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Cloud\Dlp\V2\JobTrigger
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createJobTrigger($parent, $optionalArgs = [])
    {
        $request = new CreateJobTriggerRequest();
        $request->setParent($parent);
        if (isset($optionalArgs['jobTrigger'])) {
            $request->setJobTrigger($optionalArgs['jobTrigger']);
        }
        if (isset($optionalArgs['triggerId'])) {
            $request->setTriggerId($optionalArgs['triggerId']);
        }

        return $this->startCall(
            'CreateJobTrigger',
            JobTrigger::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
