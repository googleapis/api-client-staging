// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public final class SpannerInstanceAdminProto {
  private SpannerInstanceAdminProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/spanner/admin/instance/v1/spann" +
      "er_instance_admin.proto\022 google.spanner." +
      "admin.instance.v1\032\034google/api/annotation" +
      "s.proto\032\036google/iam/v1/iam_policy.proto\032" +
      "\032google/iam/v1/policy.proto\032#google/long" +
      "running/operations.proto\032\033google/protobu" +
      "f/empty.proto\032 google/protobuf/field_mas" +
      "k.proto\032\037google/protobuf/timestamp.proto" +
      "\"4\n\016InstanceConfig\022\014\n\004name\030\001 \001(\t\022\024\n\014disp" +
      "lay_name\030\002 \001(\t\"\303\002\n\010Instance\022\014\n\004name\030\001 \001(",
      "\t\022\016\n\006config\030\002 \001(\t\022\024\n\014display_name\030\003 \001(\t\022" +
      "\022\n\nnode_count\030\005 \001(\005\022?\n\005state\030\006 \001(\01620.goo" +
      "gle.spanner.admin.instance.v1.Instance.S" +
      "tate\022F\n\006labels\030\007 \003(\01326.google.spanner.ad" +
      "min.instance.v1.Instance.LabelsEntry\032-\n\013" +
      "LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001\"7\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010C" +
      "REATING\020\001\022\t\n\005READY\020\002\"S\n\032ListInstanceConf" +
      "igsRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030" +
      "\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\202\001\n\033ListInstan",
      "ceConfigsResponse\022J\n\020instance_configs\030\001 " +
      "\003(\01320.google.spanner.admin.instance.v1.I" +
      "nstanceConfig\022\027\n\017next_page_token\030\002 \001(\t\"(" +
      "\n\030GetInstanceConfigRequest\022\014\n\004name\030\001 \001(\t" +
      "\"\"\n\022GetInstanceRequest\022\014\n\004name\030\001 \001(\t\"z\n\025" +
      "CreateInstanceRequest\022\016\n\006parent\030\001 \001(\t\022\023\n" +
      "\013instance_id\030\002 \001(\t\022<\n\010instance\030\003 \001(\0132*.g" +
      "oogle.spanner.admin.instance.v1.Instance" +
      "\"]\n\024ListInstancesRequest\022\016\n\006parent\030\001 \001(\t" +
      "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022",
      "\016\n\006filter\030\004 \001(\t\"o\n\025ListInstancesResponse" +
      "\022=\n\tinstances\030\001 \003(\0132*.google.spanner.adm" +
      "in.instance.v1.Instance\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"\205\001\n\025UpdateInstanceRequest\022<\n\010in" +
      "stance\030\001 \001(\0132*.google.spanner.admin.inst" +
      "ance.v1.Instance\022.\n\nfield_mask\030\002 \001(\0132\032.g" +
      "oogle.protobuf.FieldMask\"%\n\025DeleteInstan" +
      "ceRequest\022\014\n\004name\030\001 \001(\t\"\345\001\n\026CreateInstan" +
      "ceMetadata\022<\n\010instance\030\001 \001(\0132*.google.sp" +
      "anner.admin.instance.v1.Instance\022.\n\nstar",
      "t_time\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "\022/\n\013cancel_time\030\003 \001(\0132\032.google.protobuf." +
      "Timestamp\022,\n\010end_time\030\004 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\"\345\001\n\026UpdateInstanceMetada" +
      "ta\022<\n\010instance\030\001 \001(\0132*.google.spanner.ad" +
      "min.instance.v1.Instance\022.\n\nstart_time\030\002" +
      " \001(\0132\032.google.protobuf.Timestamp\022/\n\013canc" +
      "el_time\030\003 \001(\0132\032.google.protobuf.Timestam" +
      "p\022,\n\010end_time\030\004 \001(\0132\032.google.protobuf.Ti" +
      "mestamp2\346\014\n\rInstanceAdmin\022\303\001\n\023ListInstan",
      "ceConfigs\022<.google.spanner.admin.instanc" +
      "e.v1.ListInstanceConfigsRequest\032=.google" +
      ".spanner.admin.instance.v1.ListInstanceC" +
      "onfigsResponse\"/\202\323\344\223\002)\022\'/v1/{parent=proj" +
      "ects/*}/instanceConfigs\022\262\001\n\021GetInstanceC" +
      "onfig\022:.google.spanner.admin.instance.v1" +
      ".GetInstanceConfigRequest\0320.google.spann" +
      "er.admin.instance.v1.InstanceConfig\"/\202\323\344" +
      "\223\002)\022\'/v1/{name=projects/*/instanceConfig" +
      "s/*}\022\253\001\n\rListInstances\0226.google.spanner.",
      "admin.instance.v1.ListInstancesRequest\0327" +
      ".google.spanner.admin.instance.v1.ListIn" +
      "stancesResponse\")\202\323\344\223\002#\022!/v1/{parent=pro" +
      "jects/*}/instances\022\232\001\n\013GetInstance\0224.goo" +
      "gle.spanner.admin.instance.v1.GetInstanc" +
      "eRequest\032*.google.spanner.admin.instance" +
      ".v1.Instance\")\202\323\344\223\002#\022!/v1/{name=projects" +
      "/*/instances/*}\022\226\001\n\016CreateInstance\0227.goo" +
      "gle.spanner.admin.instance.v1.CreateInst" +
      "anceRequest\032\035.google.longrunning.Operati",
      "on\",\202\323\344\223\002&\"!/v1/{parent=projects/*}/inst" +
      "ances:\001*\022\237\001\n\016UpdateInstance\0227.google.spa" +
      "nner.admin.instance.v1.UpdateInstanceReq" +
      "uest\032\035.google.longrunning.Operation\"5\202\323\344" +
      "\223\002/2*/v1/{instance.name=projects/*/insta" +
      "nces/*}:\001*\022\214\001\n\016DeleteInstance\0227.google.s" +
      "panner.admin.instance.v1.DeleteInstanceR" +
      "equest\032\026.google.protobuf.Empty\")\202\323\344\223\002#*!" +
      "/v1/{name=projects/*/instances/*}\022\210\001\n\014Se" +
      "tIamPolicy\022\".google.iam.v1.SetIamPolicyR",
      "equest\032\025.google.iam.v1.Policy\"=\202\323\344\223\0027\"2/" +
      "v1/{resource=projects/*/instances/*}:set" +
      "IamPolicy:\001*\022\210\001\n\014GetIamPolicy\022\".google.i" +
      "am.v1.GetIamPolicyRequest\032\025.google.iam.v" +
      "1.Policy\"=\202\323\344\223\0027\"2/v1/{resource=projects" +
      "/*/instances/*}:getIamPolicy:\001*\022\256\001\n\022Test" +
      "IamPermissions\022(.google.iam.v1.TestIamPe" +
      "rmissionsRequest\032).google.iam.v1.TestIam" +
      "PermissionsResponse\"C\202\323\344\223\002=\"8/v1/{resour" +
      "ce=projects/*/instances/*}:testIamPermis",
      "sions:\001*B\266\001\n$com.google.spanner.admin.in" +
      "stance.v1B\031SpannerInstanceAdminProtoP\001ZH" +
      "google.golang.org/genproto/googleapis/sp" +
      "anner/admin/instance/v1;instance\252\002&Googl" +
      "e.Cloud.Spanner.Admin.Instance.V1b\006proto" +
      "3"
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
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_InstanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_InstanceConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", });
    internal_static_google_spanner_admin_instance_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_admin_instance_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "Config", "DisplayName", "NodeCount", "State", "Labels", });
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor =
      internal_static_google_spanner_admin_instance_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_Instance_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstanceConfigsResponse_descriptor,
        new java.lang.String[] { "InstanceConfigs", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceConfigRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_GetInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceRequest_descriptor,
        new java.lang.String[] { "Parent", "InstanceId", "Instance", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_ListInstancesResponse_descriptor,
        new java.lang.String[] { "Instances", "NextPageToken", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceRequest_descriptor,
        new java.lang.String[] { "Instance", "FieldMask", });
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_DeleteInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_CreateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_admin_instance_v1_UpdateInstanceMetadata_descriptor,
        new java.lang.String[] { "Instance", "StartTime", "CancelTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
