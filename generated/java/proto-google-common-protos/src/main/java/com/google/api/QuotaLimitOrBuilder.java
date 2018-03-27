// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto

package com.google.api;

public interface QuotaLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.QuotaLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the quota limit. The name is used to refer to the limit when
   * overriding the default limit on per-consumer basis.
   * For group-based quota limits, the name must be unique within the quota
   * group. If a name is not provided, it will be generated from the limit_by
   * and duration fields.
   * For metric-based quota limits, the name must be provided, and it must be
   * unique within the service. The name can only include alphanumeric
   * characters as well as '-'.
   * The maximum length of the limit name is 64 characters.
   * The name of a limit is used as a unique identifier for this limit.
   * Therefore, once a limit has been put into use, its name should be
   * immutable. You can use the display_name field to provide a user-friendly
   * name for the limit. The display name can be evolved over time without
   * affecting the identity of the limit.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the quota limit. The name is used to refer to the limit when
   * overriding the default limit on per-consumer basis.
   * For group-based quota limits, the name must be unique within the quota
   * group. If a name is not provided, it will be generated from the limit_by
   * and duration fields.
   * For metric-based quota limits, the name must be provided, and it must be
   * unique within the service. The name can only include alphanumeric
   * characters as well as '-'.
   * The maximum length of the limit name is 64 characters.
   * The name of a limit is used as a unique identifier for this limit.
   * Therefore, once a limit has been put into use, its name should be
   * immutable. You can use the display_name field to provide a user-friendly
   * name for the limit. The display name can be evolved over time without
   * affecting the identity of the limit.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. User-visible, extended description for this quota limit.
   * Should be used only when more context is needed to understand this limit
   * than provided by the limit's display name (see: `display_name`).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. User-visible, extended description for this quota limit.
   * Should be used only when more context is needed to understand this limit
   * than provided by the limit's display name (see: `display_name`).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Default number of tokens that can be consumed during the specified
   * duration. This is the number of tokens assigned when a client
   * application developer activates the service for his/her project.
   * Specifying a value of 0 will block all requests. This can be used if you
   * are provisioning quota to selected consumers and blocking others.
   * Similarly, a value of -1 will indicate an unlimited quota. No other
   * negative values are allowed.
   * Used by group-based quotas only.
   * </pre>
   *
   * <code>int64 default_limit = 3;</code>
   */
  long getDefaultLimit();

  /**
   * <pre>
   * Maximum number of tokens that can be consumed during the specified
   * duration. Client application developers can override the default limit up
   * to this maximum. If specified, this value cannot be set to a value less
   * than the default limit. If not specified, it is set to the default limit.
   * To allow clients to apply overrides with no upper bound, set this to -1,
   * indicating unlimited maximum quota.
   * Used by group-based quotas only.
   * </pre>
   *
   * <code>int64 max_limit = 4;</code>
   */
  long getMaxLimit();

  /**
   * <pre>
   * Free tier value displayed in the Developers Console for this limit.
   * The free tier is the number of tokens that will be subtracted from the
   * billed amount when billing is enabled.
   * This field can only be set on a limit with duration "1d", in a billable
   * group; it is invalid on any other limit. If this field is not set, it
   * defaults to 0, indicating that there is no free tier for this service.
   * Used by group-based quotas only.
   * </pre>
   *
   * <code>int64 free_tier = 7;</code>
   */
  long getFreeTier();

  /**
   * <pre>
   * Duration of this limit in textual notation. Example: "100s", "24h", "1d".
   * For duration longer than a day, only multiple of days is supported. We
   * support only "100s" and "1d" for now. Additional support will be added in
   * the future. "0" indicates indefinite duration.
   * Used by group-based quotas only.
   * </pre>
   *
   * <code>string duration = 5;</code>
   */
  java.lang.String getDuration();
  /**
   * <pre>
   * Duration of this limit in textual notation. Example: "100s", "24h", "1d".
   * For duration longer than a day, only multiple of days is supported. We
   * support only "100s" and "1d" for now. Additional support will be added in
   * the future. "0" indicates indefinite duration.
   * Used by group-based quotas only.
   * </pre>
   *
   * <code>string duration = 5;</code>
   */
  com.google.protobuf.ByteString
      getDurationBytes();

  /**
   * <pre>
   * The name of the metric this quota limit applies to. The quota limits with
   * the same metric will be checked together during runtime. The metric must be
   * defined within the service config.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>string metric = 8;</code>
   */
  java.lang.String getMetric();
  /**
   * <pre>
   * The name of the metric this quota limit applies to. The quota limits with
   * the same metric will be checked together during runtime. The metric must be
   * defined within the service config.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>string metric = 8;</code>
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <pre>
   * Specify the unit of the quota limit. It uses the same syntax as
   * [Metric.unit][]. The supported unit kinds are determined by the quota
   * backend system.
   * The [Google Service Control](https://cloud.google.com/service-control)
   * supports the following unit components:
   * * One of the time intevals:
   *   * "/min"  for quota every minute.
   *   * "/d"  for quota every 24 hours, starting 00:00 US Pacific Time.
   *   * Otherwise the quota won't be reset by time, such as storage limit.
   * * One and only one of the granted containers:
   *   * "/{organization}" quota for an organization.
   *   * "/{project}" quota for a project.
   *   * "/{folder}" quota for a folder.
   *   * "/{resource}" quota for a universal resource.
   * * Zero or more quota segmentation dimension. Not all combos are valid.
   *   * "/{region}" quota for every region. Not to be used with time intervals.
   *   * Otherwise the resources granted on the target is not segmented.
   *   * "/{zone}" quota for every zone. Not to be used with time intervals.
   *   * Otherwise the resources granted on the target is not segmented.
   *   * "/{resource}" quota for a resource associated with a project or org.
   * Here are some examples:
   * * "1/min/{project}" for quota per minute per project.
   * * "1/min/{user}" for quota per minute per user.
   * * "1/min/{organization}" for quota per minute per organization.
   * Note: the order of unit components is insignificant.
   * The "1" at the beginning is required to follow the metric unit syntax.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>string unit = 9;</code>
   */
  java.lang.String getUnit();
  /**
   * <pre>
   * Specify the unit of the quota limit. It uses the same syntax as
   * [Metric.unit][]. The supported unit kinds are determined by the quota
   * backend system.
   * The [Google Service Control](https://cloud.google.com/service-control)
   * supports the following unit components:
   * * One of the time intevals:
   *   * "/min"  for quota every minute.
   *   * "/d"  for quota every 24 hours, starting 00:00 US Pacific Time.
   *   * Otherwise the quota won't be reset by time, such as storage limit.
   * * One and only one of the granted containers:
   *   * "/{organization}" quota for an organization.
   *   * "/{project}" quota for a project.
   *   * "/{folder}" quota for a folder.
   *   * "/{resource}" quota for a universal resource.
   * * Zero or more quota segmentation dimension. Not all combos are valid.
   *   * "/{region}" quota for every region. Not to be used with time intervals.
   *   * Otherwise the resources granted on the target is not segmented.
   *   * "/{zone}" quota for every zone. Not to be used with time intervals.
   *   * Otherwise the resources granted on the target is not segmented.
   *   * "/{resource}" quota for a resource associated with a project or org.
   * Here are some examples:
   * * "1/min/{project}" for quota per minute per project.
   * * "1/min/{user}" for quota per minute per user.
   * * "1/min/{organization}" for quota per minute per organization.
   * Note: the order of unit components is insignificant.
   * The "1" at the beginning is required to follow the metric unit syntax.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>string unit = 9;</code>
   */
  com.google.protobuf.ByteString
      getUnitBytes();

  /**
   * <pre>
   * Tiered limit values. Also allows for regional or zone overrides for these
   * values if "/{region}" or "/{zone}" is specified in the unit field.
   * Currently supported tiers from low to high:
   * VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
   * To apply different limit values for users according to their tiers, specify
   * the values for the tiers you want to differentiate. For example:
   * {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
   * The limit value for each tier is optional except for the tier STANDARD.
   * The limit value for an unspecified tier falls to the value of its next
   * tier towards tier STANDARD. For the above example, the limit value for tier
   * STANDARD is 500.
   * To apply the same limit value for all users, just specify limit value for
   * tier STANDARD. For example: {STANDARD:500}.
   * To apply a regional overide for a tier, add a map entry with key
   * "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
   * override, add a map entry with key "&lt;TIER&gt;/{zone}".
   * Further, a wildcard can be used at the end of a zone name in order to
   * specify zone level overrides. For example:
   * LOW: 10, STANDARD: 50, HIGH: 100,
   * LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
   * LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
   * The regional overrides tier set for each region must be the same as
   * the tier set for default limit values. Same rule applies for zone overrides
   * tier as well.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; values = 10;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * Tiered limit values. Also allows for regional or zone overrides for these
   * values if "/{region}" or "/{zone}" is specified in the unit field.
   * Currently supported tiers from low to high:
   * VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
   * To apply different limit values for users according to their tiers, specify
   * the values for the tiers you want to differentiate. For example:
   * {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
   * The limit value for each tier is optional except for the tier STANDARD.
   * The limit value for an unspecified tier falls to the value of its next
   * tier towards tier STANDARD. For the above example, the limit value for tier
   * STANDARD is 500.
   * To apply the same limit value for all users, just specify limit value for
   * tier STANDARD. For example: {STANDARD:500}.
   * To apply a regional overide for a tier, add a map entry with key
   * "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
   * override, add a map entry with key "&lt;TIER&gt;/{zone}".
   * Further, a wildcard can be used at the end of a zone name in order to
   * specify zone level overrides. For example:
   * LOW: 10, STANDARD: 50, HIGH: 100,
   * LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
   * LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
   * The regional overrides tier set for each region must be the same as
   * the tier set for default limit values. Same rule applies for zone overrides
   * tier as well.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; values = 10;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getValues();
  /**
   * <pre>
   * Tiered limit values. Also allows for regional or zone overrides for these
   * values if "/{region}" or "/{zone}" is specified in the unit field.
   * Currently supported tiers from low to high:
   * VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
   * To apply different limit values for users according to their tiers, specify
   * the values for the tiers you want to differentiate. For example:
   * {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
   * The limit value for each tier is optional except for the tier STANDARD.
   * The limit value for an unspecified tier falls to the value of its next
   * tier towards tier STANDARD. For the above example, the limit value for tier
   * STANDARD is 500.
   * To apply the same limit value for all users, just specify limit value for
   * tier STANDARD. For example: {STANDARD:500}.
   * To apply a regional overide for a tier, add a map entry with key
   * "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
   * override, add a map entry with key "&lt;TIER&gt;/{zone}".
   * Further, a wildcard can be used at the end of a zone name in order to
   * specify zone level overrides. For example:
   * LOW: 10, STANDARD: 50, HIGH: 100,
   * LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
   * LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
   * The regional overrides tier set for each region must be the same as
   * the tier set for default limit values. Same rule applies for zone overrides
   * tier as well.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; values = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getValuesMap();
  /**
   * <pre>
   * Tiered limit values. Also allows for regional or zone overrides for these
   * values if "/{region}" or "/{zone}" is specified in the unit field.
   * Currently supported tiers from low to high:
   * VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
   * To apply different limit values for users according to their tiers, specify
   * the values for the tiers you want to differentiate. For example:
   * {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
   * The limit value for each tier is optional except for the tier STANDARD.
   * The limit value for an unspecified tier falls to the value of its next
   * tier towards tier STANDARD. For the above example, the limit value for tier
   * STANDARD is 500.
   * To apply the same limit value for all users, just specify limit value for
   * tier STANDARD. For example: {STANDARD:500}.
   * To apply a regional overide for a tier, add a map entry with key
   * "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
   * override, add a map entry with key "&lt;TIER&gt;/{zone}".
   * Further, a wildcard can be used at the end of a zone name in order to
   * specify zone level overrides. For example:
   * LOW: 10, STANDARD: 50, HIGH: 100,
   * LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
   * LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
   * The regional overrides tier set for each region must be the same as
   * the tier set for default limit values. Same rule applies for zone overrides
   * tier as well.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; values = 10;</code>
   */

  long getValuesOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * Tiered limit values. Also allows for regional or zone overrides for these
   * values if "/{region}" or "/{zone}" is specified in the unit field.
   * Currently supported tiers from low to high:
   * VERY_LOW, LOW, STANDARD, HIGH, VERY_HIGH
   * To apply different limit values for users according to their tiers, specify
   * the values for the tiers you want to differentiate. For example:
   * {LOW:100, STANDARD:500, HIGH:1000, VERY_HIGH:5000}
   * The limit value for each tier is optional except for the tier STANDARD.
   * The limit value for an unspecified tier falls to the value of its next
   * tier towards tier STANDARD. For the above example, the limit value for tier
   * STANDARD is 500.
   * To apply the same limit value for all users, just specify limit value for
   * tier STANDARD. For example: {STANDARD:500}.
   * To apply a regional overide for a tier, add a map entry with key
   * "&lt;TIER&gt;/&lt;region&gt;", where &lt;region&gt; is a region name. Similarly, for a zone
   * override, add a map entry with key "&lt;TIER&gt;/{zone}".
   * Further, a wildcard can be used at the end of a zone name in order to
   * specify zone level overrides. For example:
   * LOW: 10, STANDARD: 50, HIGH: 100,
   * LOW/us-central1: 20, STANDARD/us-central1: 60, HIGH/us-central1: 200,
   * LOW/us-central1-*: 10, STANDARD/us-central1-*: 20, HIGH/us-central1-*: 80
   * The regional overrides tier set for each region must be the same as
   * the tier set for default limit values. Same rule applies for zone overrides
   * tier as well.
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; values = 10;</code>
   */

  long getValuesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * User-visible display name for this limit.
   * Optional. If not set, the UI will provide a default display name based on
   * the quota configuration. This field can be used to override the default
   * display name generated from the configuration.
   * </pre>
   *
   * <code>string display_name = 12;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * User-visible display name for this limit.
   * Optional. If not set, the UI will provide a default display name based on
   * the quota configuration. This field can be used to override the default
   * display name generated from the configuration.
   * </pre>
   *
   * <code>string display_name = 12;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
