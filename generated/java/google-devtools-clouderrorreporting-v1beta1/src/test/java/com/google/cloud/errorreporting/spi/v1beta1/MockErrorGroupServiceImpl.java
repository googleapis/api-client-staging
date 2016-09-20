/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.errorreporting.spi.v1beta1;

import com.google.common.collect.Lists;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceGrpc.ErrorGroupService;
import com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest;
import com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest;
import com.google.protobuf.GeneratedMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
public class MockErrorGroupServiceImpl implements ErrorGroupService {
  private ArrayList<GeneratedMessage> requests;
  private Queue<GeneratedMessage> responses;

  public MockErrorGroupServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<GeneratedMessage> getRequests() {
    return requests;
  }

  public void setResponses(List<GeneratedMessage> responses) {
    this.responses = Lists.newLinkedList(responses);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void getGroup(GetGroupRequest request, StreamObserver<ErrorGroup> responseObserver) {
    ErrorGroup response = (ErrorGroup) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateGroup(UpdateGroupRequest request, StreamObserver<ErrorGroup> responseObserver) {
    ErrorGroup response = (ErrorGroup) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
