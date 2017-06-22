// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface StreamingPullRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.StreamingPullRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscription for which to initialize the new stream. This must be
   * provided in the first request on the stream, and must not be set in
   * subsequent requests from client to server.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The subscription for which to initialize the new stream. This must be
   * provided in the first request on the stream, and must not be set in
   * subsequent requests from client to server.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * List of acknowledgement IDs for acknowledging previously received messages
   * (received on this stream or a different stream). If an ack ID has expired,
   * the corresponding message may be redelivered later. Acknowledging a message
   * more than once will not result in an error. If the acknowledgement ID is
   * malformed, the stream will be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  java.util.List<java.lang.String>
      getAckIdsList();
  /**
   * <pre>
   * List of acknowledgement IDs for acknowledging previously received messages
   * (received on this stream or a different stream). If an ack ID has expired,
   * the corresponding message may be redelivered later. Acknowledging a message
   * more than once will not result in an error. If the acknowledgement ID is
   * malformed, the stream will be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  int getAckIdsCount();
  /**
   * <pre>
   * List of acknowledgement IDs for acknowledging previously received messages
   * (received on this stream or a different stream). If an ack ID has expired,
   * the corresponding message may be redelivered later. Acknowledging a message
   * more than once will not result in an error. If the acknowledgement ID is
   * malformed, the stream will be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  java.lang.String getAckIds(int index);
  /**
   * <pre>
   * List of acknowledgement IDs for acknowledging previously received messages
   * (received on this stream or a different stream). If an ack ID has expired,
   * the corresponding message may be redelivered later. Acknowledging a message
   * more than once will not result in an error. If the acknowledgement ID is
   * malformed, the stream will be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated string ack_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getAckIdsBytes(int index);

  /**
   * <pre>
   * The list of new ack deadlines for the IDs listed in
   * `modify_deadline_ack_ids`. The size of this list must be the same as the
   * size of `modify_deadline_ack_ids`. If it differs the stream will be aborted
   * with `INVALID_ARGUMENT`. Each element in this list is applied to the
   * element in the same position in `modify_deadline_ack_ids`. The new ack
   * deadline is with respect to the time this request was sent to the Pub/Sub
   * system. Must be &gt;= 0. For example, if the value is 10, the new ack deadline
   * will expire 10 seconds after this request is received. If the value is 0,
   * the message is immediately made available for another streaming or
   * non-streaming pull request. If the value is &lt; 0 (an error), the stream will
   * be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated int32 modify_deadline_seconds = 3;</code>
   */
  java.util.List<java.lang.Integer> getModifyDeadlineSecondsList();
  /**
   * <pre>
   * The list of new ack deadlines for the IDs listed in
   * `modify_deadline_ack_ids`. The size of this list must be the same as the
   * size of `modify_deadline_ack_ids`. If it differs the stream will be aborted
   * with `INVALID_ARGUMENT`. Each element in this list is applied to the
   * element in the same position in `modify_deadline_ack_ids`. The new ack
   * deadline is with respect to the time this request was sent to the Pub/Sub
   * system. Must be &gt;= 0. For example, if the value is 10, the new ack deadline
   * will expire 10 seconds after this request is received. If the value is 0,
   * the message is immediately made available for another streaming or
   * non-streaming pull request. If the value is &lt; 0 (an error), the stream will
   * be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated int32 modify_deadline_seconds = 3;</code>
   */
  int getModifyDeadlineSecondsCount();
  /**
   * <pre>
   * The list of new ack deadlines for the IDs listed in
   * `modify_deadline_ack_ids`. The size of this list must be the same as the
   * size of `modify_deadline_ack_ids`. If it differs the stream will be aborted
   * with `INVALID_ARGUMENT`. Each element in this list is applied to the
   * element in the same position in `modify_deadline_ack_ids`. The new ack
   * deadline is with respect to the time this request was sent to the Pub/Sub
   * system. Must be &gt;= 0. For example, if the value is 10, the new ack deadline
   * will expire 10 seconds after this request is received. If the value is 0,
   * the message is immediately made available for another streaming or
   * non-streaming pull request. If the value is &lt; 0 (an error), the stream will
   * be aborted with status `INVALID_ARGUMENT`.
   * </pre>
   *
   * <code>repeated int32 modify_deadline_seconds = 3;</code>
   */
  int getModifyDeadlineSeconds(int index);

  /**
   * <pre>
   * List of acknowledgement IDs whose deadline will be modified based on the
   * corresponding element in `modify_deadline_seconds`. This field can be used
   * to indicate that more time is needed to process a message by the
   * subscriber, or to make the message available for redelivery if the
   * processing was interrupted.
   * </pre>
   *
   * <code>repeated string modify_deadline_ack_ids = 4;</code>
   */
  java.util.List<java.lang.String>
      getModifyDeadlineAckIdsList();
  /**
   * <pre>
   * List of acknowledgement IDs whose deadline will be modified based on the
   * corresponding element in `modify_deadline_seconds`. This field can be used
   * to indicate that more time is needed to process a message by the
   * subscriber, or to make the message available for redelivery if the
   * processing was interrupted.
   * </pre>
   *
   * <code>repeated string modify_deadline_ack_ids = 4;</code>
   */
  int getModifyDeadlineAckIdsCount();
  /**
   * <pre>
   * List of acknowledgement IDs whose deadline will be modified based on the
   * corresponding element in `modify_deadline_seconds`. This field can be used
   * to indicate that more time is needed to process a message by the
   * subscriber, or to make the message available for redelivery if the
   * processing was interrupted.
   * </pre>
   *
   * <code>repeated string modify_deadline_ack_ids = 4;</code>
   */
  java.lang.String getModifyDeadlineAckIds(int index);
  /**
   * <pre>
   * List of acknowledgement IDs whose deadline will be modified based on the
   * corresponding element in `modify_deadline_seconds`. This field can be used
   * to indicate that more time is needed to process a message by the
   * subscriber, or to make the message available for redelivery if the
   * processing was interrupted.
   * </pre>
   *
   * <code>repeated string modify_deadline_ack_ids = 4;</code>
   */
  com.google.protobuf.ByteString
      getModifyDeadlineAckIdsBytes(int index);

  /**
   * <pre>
   * The ack deadline to use for the stream. This must be provided in the
   * first request on the stream, but it can also be updated on subsequent
   * requests from client to server. The minimum deadline you can specify is 10
   * seconds. The maximum deadline you can specify is 600 seconds (10 minutes).
   * </pre>
   *
   * <code>int32 stream_ack_deadline_seconds = 5;</code>
   */
  int getStreamAckDeadlineSeconds();
}
