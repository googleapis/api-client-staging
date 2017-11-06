/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.monitoring.v3.stub;

import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListGroupMembersPagedResponse;
import static com.google.cloud.monitoring.v3.PagedResponseWrappers.ListGroupsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.GroupServiceSettings;
import com.google.monitoring.v3.CreateGroupRequest;
import com.google.monitoring.v3.DeleteGroupRequest;
import com.google.monitoring.v3.GetGroupRequest;
import com.google.monitoring.v3.Group;
import com.google.monitoring.v3.ListGroupMembersRequest;
import com.google.monitoring.v3.ListGroupMembersResponse;
import com.google.monitoring.v3.ListGroupsRequest;
import com.google.monitoring.v3.ListGroupsResponse;
import com.google.monitoring.v3.UpdateGroupRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Monitoring API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcGroupServiceStub extends GroupServiceStub {

  private static final MethodDescriptor<ListGroupsRequest, ListGroupsResponse>
      listGroupsMethodDescriptor =
          MethodDescriptor.<ListGroupsRequest, ListGroupsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.GroupService/ListGroups")
              .setRequestMarshaller(ProtoUtils.marshaller(ListGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListGroupsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<GetGroupRequest, Group> getGroupMethodDescriptor =
      MethodDescriptor.<GetGroupRequest, Group>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.monitoring.v3.GroupService/GetGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(GetGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Group.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreateGroupRequest, Group> createGroupMethodDescriptor =
      MethodDescriptor.<CreateGroupRequest, Group>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.monitoring.v3.GroupService/CreateGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Group.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<UpdateGroupRequest, Group> updateGroupMethodDescriptor =
      MethodDescriptor.<UpdateGroupRequest, Group>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.monitoring.v3.GroupService/UpdateGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(UpdateGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Group.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<DeleteGroupRequest, Empty> deleteGroupMethodDescriptor =
      MethodDescriptor.<DeleteGroupRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.monitoring.v3.GroupService/DeleteGroup")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteGroupRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<ListGroupMembersRequest, ListGroupMembersResponse>
      listGroupMembersMethodDescriptor =
          MethodDescriptor.<ListGroupMembersRequest, ListGroupMembersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.monitoring.v3.GroupService/ListGroupMembers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListGroupMembersResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListGroupsRequest, ListGroupsResponse> listGroupsCallable;
  private final UnaryCallable<ListGroupsRequest, ListGroupsPagedResponse> listGroupsPagedCallable;
  private final UnaryCallable<GetGroupRequest, Group> getGroupCallable;
  private final UnaryCallable<CreateGroupRequest, Group> createGroupCallable;
  private final UnaryCallable<UpdateGroupRequest, Group> updateGroupCallable;
  private final UnaryCallable<DeleteGroupRequest, Empty> deleteGroupCallable;
  private final UnaryCallable<ListGroupMembersRequest, ListGroupMembersResponse>
      listGroupMembersCallable;
  private final UnaryCallable<ListGroupMembersRequest, ListGroupMembersPagedResponse>
      listGroupMembersPagedCallable;

  public static final GrpcGroupServiceStub create(GroupServiceSettings settings)
      throws IOException {
    return new GrpcGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGroupServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcGroupServiceStub(GroupServiceSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcGroupServiceStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcGroupServiceStub(GroupServiceSettings settings, ClientContext clientContext)
      throws IOException {

    GrpcCallSettings<ListGroupsRequest, ListGroupsResponse> listGroupsTransportSettings =
        GrpcCallSettings.<ListGroupsRequest, ListGroupsResponse>newBuilder()
            .setMethodDescriptor(listGroupsMethodDescriptor)
            .build();
    GrpcCallSettings<GetGroupRequest, Group> getGroupTransportSettings =
        GrpcCallSettings.<GetGroupRequest, Group>newBuilder()
            .setMethodDescriptor(getGroupMethodDescriptor)
            .build();
    GrpcCallSettings<CreateGroupRequest, Group> createGroupTransportSettings =
        GrpcCallSettings.<CreateGroupRequest, Group>newBuilder()
            .setMethodDescriptor(createGroupMethodDescriptor)
            .build();
    GrpcCallSettings<UpdateGroupRequest, Group> updateGroupTransportSettings =
        GrpcCallSettings.<UpdateGroupRequest, Group>newBuilder()
            .setMethodDescriptor(updateGroupMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteGroupRequest, Empty> deleteGroupTransportSettings =
        GrpcCallSettings.<DeleteGroupRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteGroupMethodDescriptor)
            .build();
    GrpcCallSettings<ListGroupMembersRequest, ListGroupMembersResponse>
        listGroupMembersTransportSettings =
            GrpcCallSettings.<ListGroupMembersRequest, ListGroupMembersResponse>newBuilder()
                .setMethodDescriptor(listGroupMembersMethodDescriptor)
                .build();

    this.listGroupsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listGroupsTransportSettings, settings.listGroupsSettings(), clientContext);
    this.listGroupsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listGroupsTransportSettings, settings.listGroupsSettings(), clientContext);
    this.getGroupCallable =
        GrpcCallableFactory.createUnaryCallable(
            getGroupTransportSettings, settings.getGroupSettings(), clientContext);
    this.createGroupCallable =
        GrpcCallableFactory.createUnaryCallable(
            createGroupTransportSettings, settings.createGroupSettings(), clientContext);
    this.updateGroupCallable =
        GrpcCallableFactory.createUnaryCallable(
            updateGroupTransportSettings, settings.updateGroupSettings(), clientContext);
    this.deleteGroupCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteGroupTransportSettings, settings.deleteGroupSettings(), clientContext);
    this.listGroupMembersCallable =
        GrpcCallableFactory.createUnaryCallable(
            listGroupMembersTransportSettings, settings.listGroupMembersSettings(), clientContext);
    this.listGroupMembersPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listGroupMembersTransportSettings, settings.listGroupMembersSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<ListGroupsRequest, ListGroupsPagedResponse> listGroupsPagedCallable() {
    return listGroupsPagedCallable;
  }

  public UnaryCallable<ListGroupsRequest, ListGroupsResponse> listGroupsCallable() {
    return listGroupsCallable;
  }

  public UnaryCallable<GetGroupRequest, Group> getGroupCallable() {
    return getGroupCallable;
  }

  public UnaryCallable<CreateGroupRequest, Group> createGroupCallable() {
    return createGroupCallable;
  }

  public UnaryCallable<UpdateGroupRequest, Group> updateGroupCallable() {
    return updateGroupCallable;
  }

  public UnaryCallable<DeleteGroupRequest, Empty> deleteGroupCallable() {
    return deleteGroupCallable;
  }

  public UnaryCallable<ListGroupMembersRequest, ListGroupMembersPagedResponse>
      listGroupMembersPagedCallable() {
    return listGroupMembersPagedCallable;
  }

  public UnaryCallable<ListGroupMembersRequest, ListGroupMembersResponse>
      listGroupMembersCallable() {
    return listGroupMembersCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
