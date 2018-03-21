// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

public final class LoggingMetricsProto {
  private LoggingMetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogMetricsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_GetLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_GetLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_CreateLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_CreateLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/logging/v2/logging_metrics.prot" +
      "o\022\021google.logging.v2\032\034google/api/annotat" +
      "ions.proto\032\035google/api/distribution.prot" +
      "o\032\027google/api/metric.proto\032\033google/proto" +
      "buf/empty.proto\032 google/protobuf/field_m" +
      "ask.proto\"\255\003\n\tLogMetric\022\014\n\004name\030\001 \001(\t\022\023\n" +
      "\013description\030\002 \001(\t\022\016\n\006filter\030\003 \001(\t\0227\n\021me" +
      "tric_descriptor\030\005 \001(\0132\034.google.api.Metri" +
      "cDescriptor\022\027\n\017value_extractor\030\006 \001(\t\022K\n\020" +
      "label_extractors\030\007 \003(\01321.google.logging.",
      "v2.LogMetric.LabelExtractorsEntry\022>\n\016buc" +
      "ket_options\030\010 \001(\0132&.google.api.Distribut" +
      "ion.BucketOptions\0228\n\007version\030\004 \001(\0162\'.goo" +
      "gle.logging.v2.LogMetric.ApiVersion\0326\n\024L" +
      "abelExtractorsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\034\n\nApiVersion\022\006\n\002V2\020\000\022\006\n\002V1\020" +
      "\001\"N\n\025ListLogMetricsRequest\022\016\n\006parent\030\001 \001" +
      "(\t\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(" +
      "\005\"`\n\026ListLogMetricsResponse\022-\n\007metrics\030\001" +
      " \003(\0132\034.google.logging.v2.LogMetric\022\027\n\017ne",
      "xt_page_token\030\002 \001(\t\"*\n\023GetLogMetricReque" +
      "st\022\023\n\013metric_name\030\001 \001(\t\"V\n\026CreateLogMetr" +
      "icRequest\022\016\n\006parent\030\001 \001(\t\022,\n\006metric\030\002 \001(" +
      "\0132\034.google.logging.v2.LogMetric\"[\n\026Updat" +
      "eLogMetricRequest\022\023\n\013metric_name\030\001 \001(\t\022," +
      "\n\006metric\030\002 \001(\0132\034.google.logging.v2.LogMe" +
      "tric\"-\n\026DeleteLogMetricRequest\022\023\n\013metric" +
      "_name\030\001 \001(\t2\324\005\n\020MetricsServiceV2\022\216\001\n\016Lis" +
      "tLogMetrics\022(.google.logging.v2.ListLogM" +
      "etricsRequest\032).google.logging.v2.ListLo",
      "gMetricsResponse\"\'\202\323\344\223\002!\022\037/v2/{parent=pr" +
      "ojects/*}/metrics\022\204\001\n\014GetLogMetric\022&.goo" +
      "gle.logging.v2.GetLogMetricRequest\032\034.goo" +
      "gle.logging.v2.LogMetric\".\202\323\344\223\002(\022&/v2/{m" +
      "etric_name=projects/*/metrics/*}\022\213\001\n\017Cre" +
      "ateLogMetric\022).google.logging.v2.CreateL" +
      "ogMetricRequest\032\034.google.logging.v2.LogM" +
      "etric\"/\202\323\344\223\002)\"\037/v2/{parent=projects/*}/m" +
      "etrics:\006metric\022\222\001\n\017UpdateLogMetric\022).goo" +
      "gle.logging.v2.UpdateLogMetricRequest\032\034.",
      "google.logging.v2.LogMetric\"6\202\323\344\223\0020\032&/v2" +
      "/{metric_name=projects/*/metrics/*}:\006met" +
      "ric\022\204\001\n\017DeleteLogMetric\022).google.logging" +
      ".v2.DeleteLogMetricRequest\032\026.google.prot" +
      "obuf.Empty\".\202\323\344\223\002(*&/v2/{metric_name=pro" +
      "jects/*/metrics/*}B\237\001\n\025com.google.loggin" +
      "g.v2B\023LoggingMetricsProtoP\001Z8google.gola" +
      "ng.org/genproto/googleapis/logging/v2;lo" +
      "gging\370\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027Goo" +
      "gle\\Cloud\\Logging\\V2b\006proto3"
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
          com.google.api.DistributionProto.getDescriptor(),
          com.google.api.MetricProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_logging_v2_LogMetric_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_LogMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogMetric_descriptor,
        new java.lang.String[] { "Name", "Description", "Filter", "MetricDescriptor", "ValueExtractor", "LabelExtractors", "BucketOptions", "Version", });
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor =
      internal_static_google_logging_v2_LogMetric_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogMetric_LabelExtractorsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_logging_v2_ListLogMetricsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_ListLogMetricsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogMetricsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", });
    internal_static_google_logging_v2_ListLogMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_ListLogMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogMetricsResponse_descriptor,
        new java.lang.String[] { "Metrics", "NextPageToken", });
    internal_static_google_logging_v2_GetLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_GetLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_GetLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", });
    internal_static_google_logging_v2_CreateLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_CreateLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_CreateLogMetricRequest_descriptor,
        new java.lang.String[] { "Parent", "Metric", });
    internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", "Metric", });
    internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor,
        new java.lang.String[] { "MetricName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.DistributionProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
