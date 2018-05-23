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
 * https://github.com/google/googleapis/blob/master/google/streetview/publish/v1/streetview_publish.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * @experimental
 */

namespace Google\Streetview\Publish\V1\Gapic;

use Google\ApiCore\ApiException;
use Google\ApiCore\CredentialsWrapper;
use Google\ApiCore\FetchAuthTokenInterface;
use Google\ApiCore\GapicClientTrait;
use Google\ApiCore\RetrySettings;
use Google\ApiCore\Transport\TransportInterface;
use Google\ApiCore\ValidationException;
use Google\Protobuf\FieldMask;
use Google\Protobuf\GPBEmpty;
use Google\Streetview\Publish\V1\BatchDeletePhotosRequest;
use Google\Streetview\Publish\V1\BatchDeletePhotosResponse;
use Google\Streetview\Publish\V1\BatchGetPhotosRequest;
use Google\Streetview\Publish\V1\BatchGetPhotosResponse;
use Google\Streetview\Publish\V1\BatchUpdatePhotosRequest;
use Google\Streetview\Publish\V1\BatchUpdatePhotosResponse;
use Google\Streetview\Publish\V1\CreatePhotoRequest;
use Google\Streetview\Publish\V1\DeletePhotoRequest;
use Google\Streetview\Publish\V1\GetPhotoRequest;
use Google\Streetview\Publish\V1\ListPhotosRequest;
use Google\Streetview\Publish\V1\ListPhotosResponse;
use Google\Streetview\Publish\V1\Photo;
use Google\Streetview\Publish\V1\PhotoView;
use Google\Streetview\Publish\V1\UpdatePhotoRequest;
use Google\Streetview\Publish\V1\UploadRef;

/**
 * Service Description: Publishes and connects user-contributed photos on Street View.
 *
 * EXPERIMENTAL: This client library class has not yet been declared GA (1.0). This means that
 * even though we intend the surface to be stable, we may make backwards incompatible changes
 * if necessary.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
 * try {
 *
 *     $response = $streetViewPublishServiceClient->startUpload();
 * } finally {
 *     $streetViewPublishServiceClient->close();
 * }
 * ```
 *
 * @experimental
 */
class StreetViewPublishServiceGapicClient
{
    use GapicClientTrait;

    /**
     * The name of the service.
     */
    const SERVICE_NAME = 'google.streetview.publish.v1.StreetViewPublishService';

    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'streetviewpublish.googleapis.com';

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
        'https://www.googleapis.com/auth/streetviewpublish',
    ];

    private static function getClientDefaults()
    {
        return [
            'serviceName' => self::SERVICE_NAME,
            'serviceAddress' => self::SERVICE_ADDRESS.':'.self::DEFAULT_SERVICE_PORT,
            'clientConfig' => __DIR__.'/../resources/street_view_publish_service_client_config.json',
            'descriptorsConfigPath' => __DIR__.'/../resources/street_view_publish_service_descriptor_config.php',
            'credentialsConfig' => [
                'scopes' => self::$serviceScopes,
            ],
            'transportConfig' => [
                'rest' => [
                    'restClientConfigPath' => __DIR__.'/../resources/street_view_publish_service_rest_client_config.php',
                ],
            ],
            'versionFile' => __DIR__.'/../../../VERSION',
        ];
    }

    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress
     *           The address of the API remote host. May optionally include the port, formatted
     *           as "<uri>:<port>". Default 'streetviewpublish.googleapis.com:443'.
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
    }

    /**
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     *
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *
     *     $response = $streetViewPublishServiceClient->startUpload();
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\UploadRef
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function startUpload($optionalArgs = [])
    {
        $request = new GPBEmpty();

        return $this->startCall(
            'StartUpload',
            UploadRef::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     *
     * This method returns the following error codes:
     *
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the upload reference does not exist.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photo = new Photo();
     *     $response = $streetViewPublishServiceClient->createPhoto($photo);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param Photo $photo        Required. Photo to create.
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\Photo
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function createPhoto($photo, $optionalArgs = [])
    {
        $request = new CreatePhotoRequest();
        $request->setPhoto($photo);

        return $this->startCall(
            'CreatePhoto',
            Photo::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets the metadata of the specified `Photo`.
     *
     * This method returns the following error codes:
     *
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the requested photo does not exist.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photoId = '';
     *     $view = PhotoView::BASIC;
     *     $response = $streetViewPublishServiceClient->getPhoto($photoId, $view);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string $photoId      Required. ID of the photo.
     * @param int    $view         Specifies if a download URL for the photo bytes should be returned in the
     *                             Photo response.
     *                             For allowed values, use constants defined on {@see \Google\Streetview\Publish\V1\PhotoView}
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
     * @return \Google\Streetview\Publish\V1\Photo
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function getPhoto($photoId, $view, $optionalArgs = [])
    {
        $request = new GetPhotoRequest();
        $request->setPhotoId($photoId);
        $request->setView($view);

        return $this->startCall(
            'GetPhoto',
            Photo::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Gets the metadata of the specified `Photo` batch.
     *
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photoIds = [];
     *     $view = PhotoView::BASIC;
     *     $response = $streetViewPublishServiceClient->batchGetPhotos($photoIds, $view);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string[] $photoIds     Required. IDs of the photos.
     * @param int      $view         Specifies if a download URL for the photo bytes should be returned in the
     *                               Photo response.
     *                               For allowed values, use constants defined on {@see \Google\Streetview\Publish\V1\PhotoView}
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\BatchGetPhotosResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function batchGetPhotos($photoIds, $view, $optionalArgs = [])
    {
        $request = new BatchGetPhotosRequest();
        $request->setPhotoIds($photoIds);
        $request->setView($view);

        return $this->startCall(
            'BatchGetPhotos',
            BatchGetPhotosResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Lists all the photos that belong to the user.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $view = PhotoView::BASIC;
     *     $filter = '';
     *     // Iterate through all elements
     *     $pagedResponse = $streetViewPublishServiceClient->listPhotos($view, $filter);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements
     *     $pagedResponse = $streetViewPublishServiceClient->listPhotos($view, $filter);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param int    $view         Specifies if a download URL for the photos bytes should be returned in the
     *                             Photos response.
     *                             For allowed values, use constants defined on {@see \Google\Streetview\Publish\V1\PhotoView}
     * @param string $filter       The filter expression.
     *                             Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
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
    public function listPhotos($view, $filter, $optionalArgs = [])
    {
        $request = new ListPhotosRequest();
        $request->setView($view);
        $request->setFilter($filter);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        return $this->getPagedListResponse(
            'ListPhotos',
            $optionalArgs,
            ListPhotosResponse::class,
            $request
        );
    }

    /**
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     *
     * This method returns the following error codes:
     *
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the photo ID does not exist.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photo = new Photo();
     *     $updateMask = new FieldMask();
     *     $response = $streetViewPublishServiceClient->updatePhoto($photo, $updateMask);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param Photo     $photo      Required. Photo object containing the new metadata. Only the fields
     *                              specified in `update_mask` are used. If `update_mask` is not present, the
     *                              update applies to all fields.
     *                              **Note:** To update `pose.altitude`, `pose.latlngpair` has to be filled as
     *                              well. Otherwise, the request will fail.
     * @param FieldMask $updateMask Mask that identifies fields on the photo metadata to update.
     *                              If not present, the old Photo metadata will be entirely replaced with the
     *                              new Photo metadata in this request. The update fails if invalid fields are
     *                              specified. Multiple fields can be specified in a comma-delimited list.
     *
     * The following fields are valid:
     *
     * * `pose.heading`
     * * `pose.latlngpair`
     * * `pose.pitch`
     * * `pose.roll`
     * * `pose.level`
     * * `pose.altitude`
     * * `connections`
     * * `places`
     * @param array $optionalArgs {
     *                            Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\Photo
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function updatePhoto($photo, $updateMask, $optionalArgs = [])
    {
        $request = new UpdatePhotoRequest();
        $request->setPhoto($photo);
        $request->setUpdateMask($updateMask);

        return $this->startCall(
            'UpdatePhoto',
            Photo::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     *
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $updatePhotoRequests = [];
     *     $response = $streetViewPublishServiceClient->batchUpdatePhotos($updatePhotoRequests);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param UpdatePhotoRequest[] $updatePhotoRequests Required. List of update photo requests.
     * @param array                $optionalArgs        {
     *                                                  Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\BatchUpdatePhotosResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function batchUpdatePhotos($updatePhotoRequests, $optionalArgs = [])
    {
        $request = new BatchUpdatePhotosRequest();
        $request->setUpdatePhotoRequests($updatePhotoRequests);

        return $this->startCall(
            'BatchUpdatePhotos',
            BatchUpdatePhotosResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a photo and its metadata.
     *
     * This method returns the following error codes:
     *
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the photo ID does not exist.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photoId = '';
     *     $streetViewPublishServiceClient->deletePhoto($photoId);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string $photoId      Required. ID of the photo.
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
    public function deletePhoto($photoId, $optionalArgs = [])
    {
        $request = new DeletePhotoRequest();
        $request->setPhotoId($photoId);

        return $this->startCall(
            'DeletePhoto',
            GPBEmpty::class,
            $optionalArgs,
            $request
        )->wait();
    }

    /**
     * Deletes a list of photos and their metadata.
     *
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     * try {
     *     $photoIds = [];
     *     $response = $streetViewPublishServiceClient->batchDeletePhotos($photoIds);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string[] $photoIds     Required. List of delete photo requests.
     * @param array    $optionalArgs {
     *                               Optional.
     *
     *     @type RetrySettings|array $retrySettings
     *          Retry settings to use for this call. Can be a
     *          {@see Google\ApiCore\RetrySettings} object, or an associative array
     *          of retry settings parameters. See the documentation on
     *          {@see Google\ApiCore\RetrySettings} for example usage.
     * }
     *
     * @return \Google\Streetview\Publish\V1\BatchDeletePhotosResponse
     *
     * @throws ApiException if the remote call fails
     * @experimental
     */
    public function batchDeletePhotos($photoIds, $optionalArgs = [])
    {
        $request = new BatchDeletePhotosRequest();
        $request->setPhotoIds($photoIds);

        return $this->startCall(
            'BatchDeletePhotos',
            BatchDeletePhotosResponse::class,
            $optionalArgs,
            $request
        )->wait();
    }
}
