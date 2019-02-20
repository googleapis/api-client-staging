// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

package com.google.api;

public interface PackageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Package)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The title of the package (and, by default, the product).
   * This should be set to the colloquial name of the API, and is used
   * for things such as determining the package name.
   * Specify this in appropriate title casing, with space as the word
   * separator (e.g. "Speech", "BigQuery", "Video Intelligence", "Pub/Sub").
   * This value may be used as-is in documentation, and code generators should
   * normalize it appropriately for idiomatic package, module, etc. names in
   * their language.
   * </pre>
   *
   * <code>string title = 1;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Required. The title of the package (and, by default, the product).
   * This should be set to the colloquial name of the API, and is used
   * for things such as determining the package name.
   * Specify this in appropriate title casing, with space as the word
   * separator (e.g. "Speech", "BigQuery", "Video Intelligence", "Pub/Sub").
   * This value may be used as-is in documentation, and code generators should
   * normalize it appropriately for idiomatic package, module, etc. names in
   * their language.
   * </pre>
   *
   * <code>string title = 1;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Required. The namespace.
   * This should be set to the package namespace, using appropriate title
   * casing (the same casing as `title`, above). Client libraries
   * should normalize it appropriately for package, module, etc. names in
   * their language.
   *   Example: ["Google", "Cloud"]
   * This is used to inform the prefix for package manager names, and the code
   * layout in cases where the language-specific protobuf options are not set.
   * The "required" note above is "soft". This *should* be set, but an empty
   * namespace is technically valid.
   * </pre>
   *
   * <code>repeated string namespace = 2;</code>
   */
  java.util.List<java.lang.String>
      getNamespaceList();
  /**
   * <pre>
   * Required. The namespace.
   * This should be set to the package namespace, using appropriate title
   * casing (the same casing as `title`, above). Client libraries
   * should normalize it appropriately for package, module, etc. names in
   * their language.
   *   Example: ["Google", "Cloud"]
   * This is used to inform the prefix for package manager names, and the code
   * layout in cases where the language-specific protobuf options are not set.
   * The "required" note above is "soft". This *should* be set, but an empty
   * namespace is technically valid.
   * </pre>
   *
   * <code>repeated string namespace = 2;</code>
   */
  int getNamespaceCount();
  /**
   * <pre>
   * Required. The namespace.
   * This should be set to the package namespace, using appropriate title
   * casing (the same casing as `title`, above). Client libraries
   * should normalize it appropriately for package, module, etc. names in
   * their language.
   *   Example: ["Google", "Cloud"]
   * This is used to inform the prefix for package manager names, and the code
   * layout in cases where the language-specific protobuf options are not set.
   * The "required" note above is "soft". This *should* be set, but an empty
   * namespace is technically valid.
   * </pre>
   *
   * <code>repeated string namespace = 2;</code>
   */
  java.lang.String getNamespace(int index);
  /**
   * <pre>
   * Required. The namespace.
   * This should be set to the package namespace, using appropriate title
   * casing (the same casing as `title`, above). Client libraries
   * should normalize it appropriately for package, module, etc. names in
   * their language.
   *   Example: ["Google", "Cloud"]
   * This is used to inform the prefix for package manager names, and the code
   * layout in cases where the language-specific protobuf options are not set.
   * The "required" note above is "soft". This *should* be set, but an empty
   * namespace is technically valid.
   * </pre>
   *
   * <code>repeated string namespace = 2;</code>
   */
  com.google.protobuf.ByteString
      getNamespaceBytes(int index);

  /**
   * <pre>
   * Required. The version.
   * This should be set to the API version, such as "v1".
   * </pre>
   *
   * <code>string version = 3;</code>
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Required. The version.
   * This should be set to the API version, such as "v1".
   * </pre>
   *
   * <code>string version = 3;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The title of the product, if different from the package title above.
   * This may be used in documentation and package metadata.
   * </pre>
   *
   * <code>string product_title = 4;</code>
   */
  java.lang.String getProductTitle();
  /**
   * <pre>
   * The title of the product, if different from the package title above.
   * This may be used in documentation and package metadata.
   * </pre>
   *
   * <code>string product_title = 4;</code>
   */
  com.google.protobuf.ByteString
      getProductTitleBytes();
}
