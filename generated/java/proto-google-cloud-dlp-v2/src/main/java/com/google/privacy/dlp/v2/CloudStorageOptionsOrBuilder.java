// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface CloudStorageOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CloudStorageOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   */
  boolean hasFileSet();
  /**
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   */
  com.google.privacy.dlp.v2.CloudStorageOptions.FileSet getFileSet();
  /**
   * <code>.google.privacy.dlp.v2.CloudStorageOptions.FileSet file_set = 1;</code>
   */
  com.google.privacy.dlp.v2.CloudStorageOptions.FileSetOrBuilder getFileSetOrBuilder();

  /**
   * <pre>
   * Max number of bytes to scan from a file. If a scanned file's size is bigger
   * than this value then the rest of the bytes are omitted.
   * </pre>
   *
   * <code>int64 bytes_limit_per_file = 4;</code>
   */
  long getBytesLimitPerFile();
}
