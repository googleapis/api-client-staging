// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/storage.proto

package com.google.privacy.dlp.v2beta1;

public final class DlpStorage {
  private DlpStorage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_InfoType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_InfoType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_FieldId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_FieldId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_PartitionId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_PartitionId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_KindExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_KindExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_PropertyReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_PropertyReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_Projection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_Projection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_DatastoreOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_DatastoreOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_FileSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_FileSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_CloudStoragePath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_CloudStoragePath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_StorageConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_StorageConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_CloudStorageKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_CloudStorageKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_DatastoreKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_DatastoreKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_Key_PathElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_Key_PathElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_privacy_dlp_v2beta1_RecordKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_privacy_dlp_v2beta1_RecordKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/privacy/dlp/v2beta1/storage.pro" +
      "to\022\032google.privacy.dlp.v2beta1\032\034google/a" +
      "pi/annotations.proto\"\030\n\010InfoType\022\014\n\004name" +
      "\030\001 \001(\t\"\036\n\007FieldId\022\023\n\013column_name\030\001 \001(\t\"7" +
      "\n\013PartitionId\022\022\n\nproject_id\030\002 \001(\t\022\024\n\014nam" +
      "espace_id\030\004 \001(\t\"\036\n\016KindExpression\022\014\n\004nam" +
      "e\030\001 \001(\t\"!\n\021PropertyReference\022\014\n\004name\030\002 \001" +
      "(\t\"M\n\nProjection\022?\n\010property\030\001 \001(\0132-.goo" +
      "gle.privacy.dlp.v2beta1.PropertyReferenc" +
      "e\"\307\001\n\020DatastoreOptions\022=\n\014partition_id\030\001",
      " \001(\0132\'.google.privacy.dlp.v2beta1.Partit" +
      "ionId\0228\n\004kind\030\002 \001(\0132*.google.privacy.dlp" +
      ".v2beta1.KindExpression\022:\n\nprojection\030\003 " +
      "\003(\0132&.google.privacy.dlp.v2beta1.Project" +
      "ion\"x\n\023CloudStorageOptions\022I\n\010file_set\030\001" +
      " \001(\01327.google.privacy.dlp.v2beta1.CloudS" +
      "torageOptions.FileSet\032\026\n\007FileSet\022\013\n\003url\030" +
      "\001 \001(\t\" \n\020CloudStoragePath\022\014\n\004path\030\001 \001(\t\"" +
      "\264\001\n\rStorageConfig\022I\n\021datastore_options\030\002" +
      " \001(\0132,.google.privacy.dlp.v2beta1.Datast",
      "oreOptionsH\000\022P\n\025cloud_storage_options\030\003 " +
      "\001(\0132/.google.privacy.dlp.v2beta1.CloudSt" +
      "orageOptionsH\000B\006\n\004type\":\n\017CloudStorageKe" +
      "y\022\021\n\tfile_path\030\001 \001(\t\022\024\n\014start_offset\030\002 \001" +
      "(\003\"C\n\014DatastoreKey\0223\n\nentity_key\030\001 \001(\0132\037" +
      ".google.privacy.dlp.v2beta1.Key\"\305\001\n\003Key\022" +
      "=\n\014partition_id\030\001 \001(\0132\'.google.privacy.d" +
      "lp.v2beta1.PartitionId\0229\n\004path\030\002 \003(\0132+.g" +
      "oogle.privacy.dlp.v2beta1.Key.PathElemen" +
      "t\032D\n\013PathElement\022\014\n\004kind\030\001 \001(\t\022\014\n\002id\030\002 \001",
      "(\003H\000\022\016\n\004name\030\003 \001(\tH\000B\t\n\007id_type\"\240\001\n\tReco" +
      "rdKey\022H\n\021cloud_storage_key\030\001 \001(\0132+.googl" +
      "e.privacy.dlp.v2beta1.CloudStorageKeyH\000\022" +
      "A\n\rdatastore_key\030\002 \001(\0132(.google.privacy." +
      "dlp.v2beta1.DatastoreKeyH\000B\006\n\004typeBm\n\036co" +
      "m.google.privacy.dlp.v2beta1B\nDlpStorage" +
      "P\001Z=google.golang.org/genproto/googleapi" +
      "s/privacy/dlp/v2beta1;dlpb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_privacy_dlp_v2beta1_InfoType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_privacy_dlp_v2beta1_InfoType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_InfoType_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_privacy_dlp_v2beta1_FieldId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_privacy_dlp_v2beta1_FieldId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_FieldId_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_privacy_dlp_v2beta1_PartitionId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_privacy_dlp_v2beta1_PartitionId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_PartitionId_descriptor,
        new java.lang.String[] { "ProjectId", "NamespaceId", });
    internal_static_google_privacy_dlp_v2beta1_KindExpression_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_privacy_dlp_v2beta1_KindExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_KindExpression_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_privacy_dlp_v2beta1_PropertyReference_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_privacy_dlp_v2beta1_PropertyReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_PropertyReference_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_privacy_dlp_v2beta1_Projection_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_privacy_dlp_v2beta1_Projection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_Projection_descriptor,
        new java.lang.String[] { "Property", });
    internal_static_google_privacy_dlp_v2beta1_DatastoreOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_privacy_dlp_v2beta1_DatastoreOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_DatastoreOptions_descriptor,
        new java.lang.String[] { "PartitionId", "Kind", "Projection", });
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_descriptor,
        new java.lang.String[] { "FileSet", });
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_FileSet_descriptor =
      internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_FileSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_CloudStorageOptions_FileSet_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_google_privacy_dlp_v2beta1_CloudStoragePath_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_privacy_dlp_v2beta1_CloudStoragePath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_CloudStoragePath_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_google_privacy_dlp_v2beta1_StorageConfig_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_privacy_dlp_v2beta1_StorageConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_StorageConfig_descriptor,
        new java.lang.String[] { "DatastoreOptions", "CloudStorageOptions", "Type", });
    internal_static_google_privacy_dlp_v2beta1_CloudStorageKey_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_privacy_dlp_v2beta1_CloudStorageKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_CloudStorageKey_descriptor,
        new java.lang.String[] { "FilePath", "StartOffset", });
    internal_static_google_privacy_dlp_v2beta1_DatastoreKey_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_privacy_dlp_v2beta1_DatastoreKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_DatastoreKey_descriptor,
        new java.lang.String[] { "EntityKey", });
    internal_static_google_privacy_dlp_v2beta1_Key_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_privacy_dlp_v2beta1_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_Key_descriptor,
        new java.lang.String[] { "PartitionId", "Path", });
    internal_static_google_privacy_dlp_v2beta1_Key_PathElement_descriptor =
      internal_static_google_privacy_dlp_v2beta1_Key_descriptor.getNestedTypes().get(0);
    internal_static_google_privacy_dlp_v2beta1_Key_PathElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_Key_PathElement_descriptor,
        new java.lang.String[] { "Kind", "Id", "Name", "IdType", });
    internal_static_google_privacy_dlp_v2beta1_RecordKey_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_privacy_dlp_v2beta1_RecordKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_privacy_dlp_v2beta1_RecordKey_descriptor,
        new java.lang.String[] { "CloudStorageKey", "DatastoreKey", "Type", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
