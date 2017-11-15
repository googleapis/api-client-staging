// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

public final class WebhookProto {
  private WebhookProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/webhoo" +
      "k.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032-google/c" +
      "loud/dialogflow/v2beta1/context.proto\032,g" +
      "oogle/cloud/dialogflow/v2beta1/intent.pr" +
      "oto\032-google/cloud/dialogflow/v2beta1/ses" +
      "sion.proto\032\034google/protobuf/struct.proto" +
      "\"\343\001\n\016WebhookRequest\022\023\n\013response_id\030\001 \001(\t" +
      "\022B\n\014query_result\030\002 \001(\0132,.google.cloud.di" +
      "alogflow.v2beta1.QueryResult\022d\n\036original",
      "_detect_intent_request\030\003 \001(\0132<.google.cl" +
      "oud.dialogflow.v2beta1.OriginalDetectInt" +
      "entRequest\022\022\n\nsession_id\030\004 \001(\t\"\302\002\n\017Webho" +
      "okResponse\022\030\n\020fulfillment_text\030\001 \001(\t\022M\n\024" +
      "fulfillment_messages\030\002 \003(\0132/.google.clou" +
      "d.dialogflow.v2beta1.Intent.Message\022\016\n\006s" +
      "ource\030\003 \001(\t\022(\n\007payload\030\004 \001(\0132\027.google.pr" +
      "otobuf.Struct\022A\n\017output_contexts\030\005 \003(\0132(" +
      ".google.cloud.dialogflow.v2beta1.Context" +
      "\022I\n\024followup_event_input\030\006 \001(\0132+.google.",
      "cloud.dialogflow.v2beta1.EventInput\"W\n\033O" +
      "riginalDetectIntentRequest\022\016\n\006source\030\001 \001" +
      "(\t\022(\n\007payload\030\003 \001(\0132\027.google.protobuf.St" +
      "ructB\252\001\n#com.google.cloud.dialogflow.v2b" +
      "eta1B\014WebhookProtoP\001ZIgoogle.golang.org/" +
      "genproto/googleapis/cloud/dialogflow/v2b" +
      "eta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.D" +
      "ialogflow.V2beta1b\006proto3"
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
          com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_WebhookRequest_descriptor,
        new java.lang.String[] { "ResponseId", "QueryResult", "OriginalDetectIntentRequest", "SessionId", });
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_WebhookResponse_descriptor,
        new java.lang.String[] { "FulfillmentText", "FulfillmentMessages", "Source", "Payload", "OutputContexts", "FollowupEventInput", });
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor,
        new java.lang.String[] { "Source", "Payload", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
