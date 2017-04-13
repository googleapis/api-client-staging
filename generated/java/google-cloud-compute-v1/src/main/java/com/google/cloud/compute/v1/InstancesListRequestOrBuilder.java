// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/compute/v1/compute_instances.proto

package com.google.cloud.compute.v1;

public interface InstancesListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.compute.v1.InstancesListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The maximum number of results per page that should be returned.
   * If the number of available results is larger than &lt;code&gt;maxResults&lt;/code&gt;,
   * Compute Engine returns a &lt;code&gt;nextPageToken&lt;/code&gt; that can be used to get
   * the next page of results in subsequent list requests. Acceptable values are
   * &lt;code&gt;0&lt;/code&gt; to &lt;code&gt;500&lt;/code&gt;, inclusive. (Default: &lt;code&gt;500&lt;/code&gt;)
   * </pre>
   *
   * <code>optional uint32 max_results = 4;</code>
   */
  int getMaxResults();

  /**
   * <pre>
   * Specifies a page token to use. Set &lt;code&gt;pageToken&lt;/code&gt; to the
   * &lt;code&gt;nextPageToken&lt;/code&gt; returned by a previous list request to get
   * the next page of results.
   * </pre>
   *
   * <code>optional string page_token = 5;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Specifies a page token to use. Set &lt;code&gt;pageToken&lt;/code&gt; to the
   * &lt;code&gt;nextPageToken&lt;/code&gt; returned by a previous list request to get
   * the next page of results.
   * </pre>
   *
   * <code>optional string page_token = 5;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Sets a filter expression for filtering listed resources, in the form
   * &lt;code&gt;filter={expression}&lt;/code&gt;. Your &lt;code&gt;{expression}&lt;/code&gt; must
   * be in the format: &lt;code&gt;field_name comparison_string literal_string&lt;/code&gt;.
   * The &lt;code&gt;field_name&lt;/code&gt; is the name of the field you want to compare.
   * Only atomic field types are supported (string, number, boolean). The
   * &lt;code&gt;comparison_string&lt;/code&gt; must be either &lt;code&gt;eq&lt;/code&gt; (equals) or
   * &lt;code&gt;ne&lt;/code&gt; (not equals). The &lt;code&gt;literal_string&lt;/code&gt; is the string
   * value to filter to. The literal value must be valid for the type of field
   * you are filtering by (string, number, boolean). For string fields, the
   * literal value is interpreted as a regular expression
   * using &lt;a href="https://github.com/google/re2" target="_blank"&gt;RE2&lt;/a&gt;
   * syntax. The literal value must match the entire field.
   * For example, to filter for instances that do not have a name of
   * &lt;code&gt;example-instance&lt;/code&gt;, you would use
   * &lt;code&gt;filter=name ne example-instance&lt;/code&gt;.
   * You can filter on nested fields. For example, you could filter on
   * instances that have set the &lt;code&gt;scheduling.automaticRestart&lt;/code&gt; field
   * to &lt;code&gt;true&lt;/code&gt;. Use filtering on nested fields to take advantage of
   * &lt;a href="/compute/docs/label-or-tag-resources"&gt;labels&lt;/a&gt;
   * to organize and search for results based on label values.
   * To filter on multiple expressions, provide each separate expression within
   * parentheses. For example,
   * &lt;code&gt;(scheduling.automaticRestart eq true) (zone eq us-central1-f)&lt;/code&gt;.
   * Multiple expressions are treated as &lt;code&gt;AND&lt;/code&gt; expressions, meaning
   * that resources must match all expressions to pass the filters.
   * </pre>
   *
   * <code>optional string filter = 6;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Sets a filter expression for filtering listed resources, in the form
   * &lt;code&gt;filter={expression}&lt;/code&gt;. Your &lt;code&gt;{expression}&lt;/code&gt; must
   * be in the format: &lt;code&gt;field_name comparison_string literal_string&lt;/code&gt;.
   * The &lt;code&gt;field_name&lt;/code&gt; is the name of the field you want to compare.
   * Only atomic field types are supported (string, number, boolean). The
   * &lt;code&gt;comparison_string&lt;/code&gt; must be either &lt;code&gt;eq&lt;/code&gt; (equals) or
   * &lt;code&gt;ne&lt;/code&gt; (not equals). The &lt;code&gt;literal_string&lt;/code&gt; is the string
   * value to filter to. The literal value must be valid for the type of field
   * you are filtering by (string, number, boolean). For string fields, the
   * literal value is interpreted as a regular expression
   * using &lt;a href="https://github.com/google/re2" target="_blank"&gt;RE2&lt;/a&gt;
   * syntax. The literal value must match the entire field.
   * For example, to filter for instances that do not have a name of
   * &lt;code&gt;example-instance&lt;/code&gt;, you would use
   * &lt;code&gt;filter=name ne example-instance&lt;/code&gt;.
   * You can filter on nested fields. For example, you could filter on
   * instances that have set the &lt;code&gt;scheduling.automaticRestart&lt;/code&gt; field
   * to &lt;code&gt;true&lt;/code&gt;. Use filtering on nested fields to take advantage of
   * &lt;a href="/compute/docs/label-or-tag-resources"&gt;labels&lt;/a&gt;
   * to organize and search for results based on label values.
   * To filter on multiple expressions, provide each separate expression within
   * parentheses. For example,
   * &lt;code&gt;(scheduling.automaticRestart eq true) (zone eq us-central1-f)&lt;/code&gt;.
   * Multiple expressions are treated as &lt;code&gt;AND&lt;/code&gt; expressions, meaning
   * that resources must match all expressions to pass the filters.
   * </pre>
   *
   * <code>optional string filter = 6;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Sorts list results by a certain order. By default, results
   * are returned in alphanumerical order based on the resource name.
   * You can also sort results in descending order based on the creation timestamp
   * using &lt;code&gt;orderBy="creationTimestamp desc"&lt;/code&gt;. This sorts
   * results based on the &lt;code&gt;creationTimestamp&lt;/code&gt; field in
   * reverse chronological order (newest result first). Use this to sort resources
   * like operations so that the newest operation is returned first.
   * Currently, only sorting by &lt;code&gt;name&lt;/code&gt; or
   * &lt;code&gt;creationTimestamp desc&lt;/code&gt; is supported.
   * </pre>
   *
   * <code>optional string order_by = 14;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Sorts list results by a certain order. By default, results
   * are returned in alphanumerical order based on the resource name.
   * You can also sort results in descending order based on the creation timestamp
   * using &lt;code&gt;orderBy="creationTimestamp desc"&lt;/code&gt;. This sorts
   * results based on the &lt;code&gt;creationTimestamp&lt;/code&gt; field in
   * reverse chronological order (newest result first). Use this to sort resources
   * like operations so that the newest operation is returned first.
   * Currently, only sorting by &lt;code&gt;name&lt;/code&gt; or
   * &lt;code&gt;creationTimestamp desc&lt;/code&gt; is supported.
   * </pre>
   *
   * <code>optional string order_by = 14;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>optional string project = 2;</code>
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>optional string project = 2;</code>
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>optional string zone = 3;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>optional string zone = 3;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();
}
