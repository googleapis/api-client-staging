/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.monitoring.v3;

import com.google.api.core.BetaApi;
import com.google.monitoring.v3.CreateNotificationChannelRequest;
import com.google.monitoring.v3.DeleteNotificationChannelRequest;
import com.google.monitoring.v3.GetNotificationChannelDescriptorRequest;
import com.google.monitoring.v3.GetNotificationChannelRequest;
import com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest;
import com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse;
import com.google.monitoring.v3.ListNotificationChannelsRequest;
import com.google.monitoring.v3.ListNotificationChannelsResponse;
import com.google.monitoring.v3.NotificationChannel;
import com.google.monitoring.v3.NotificationChannelDescriptor;
import com.google.monitoring.v3.NotificationChannelServiceGrpc.NotificationChannelServiceImplBase;
import com.google.monitoring.v3.UpdateNotificationChannelRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockNotificationChannelServiceImpl extends NotificationChannelServiceImplBase {
  private ArrayList<GeneratedMessageV3> requests;
  private Queue<Object> responses;

  public MockNotificationChannelServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<GeneratedMessageV3> getRequests() {
    return requests;
  }

  public void addResponse(GeneratedMessageV3 response) {
    responses.add(response);
  }

  public void setResponses(List<GeneratedMessageV3> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listNotificationChannelDescriptors(
      ListNotificationChannelDescriptorsRequest request,
      StreamObserver<ListNotificationChannelDescriptorsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListNotificationChannelDescriptorsResponse) {
      requests.add(request);
      responseObserver.onNext((ListNotificationChannelDescriptorsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getNotificationChannelDescriptor(
      GetNotificationChannelDescriptorRequest request,
      StreamObserver<NotificationChannelDescriptor> responseObserver) {
    Object response = responses.remove();
    if (response instanceof NotificationChannelDescriptor) {
      requests.add(request);
      responseObserver.onNext((NotificationChannelDescriptor) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listNotificationChannels(
      ListNotificationChannelsRequest request,
      StreamObserver<ListNotificationChannelsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListNotificationChannelsResponse) {
      requests.add(request);
      responseObserver.onNext((ListNotificationChannelsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getNotificationChannel(
      GetNotificationChannelRequest request, StreamObserver<NotificationChannel> responseObserver) {
    Object response = responses.remove();
    if (response instanceof NotificationChannel) {
      requests.add(request);
      responseObserver.onNext((NotificationChannel) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createNotificationChannel(
      CreateNotificationChannelRequest request,
      StreamObserver<NotificationChannel> responseObserver) {
    Object response = responses.remove();
    if (response instanceof NotificationChannel) {
      requests.add(request);
      responseObserver.onNext((NotificationChannel) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateNotificationChannel(
      UpdateNotificationChannelRequest request,
      StreamObserver<NotificationChannel> responseObserver) {
    Object response = responses.remove();
    if (response instanceof NotificationChannel) {
      requests.add(request);
      responseObserver.onNext((NotificationChannel) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteNotificationChannel(
      DeleteNotificationChannelRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
