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

package com.google.cloud.longrunning;

import com.google.common.collect.Lists;
import com.google.longrunning.CancelOperationRequest;
import com.google.longrunning.DeleteOperationRequest;
import com.google.longrunning.GetOperationRequest;
import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsGrpc.OperationsImplBase;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
public class MockOperationsImpl extends OperationsImplBase {
  private ArrayList<GeneratedMessageV3> requests;
  private Queue<GeneratedMessageV3> responses;

  public MockOperationsImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<GeneratedMessageV3> getRequests() {
    return requests;
  }

  public void setResponses(List<GeneratedMessageV3> responses) {
    this.responses = Lists.newLinkedList(responses);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void getOperation(
      GetOperationRequest request, StreamObserver<Operation> responseObserver) {
    Operation response = (Operation) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void listOperations(
      ListOperationsRequest request, StreamObserver<ListOperationsResponse> responseObserver) {
    ListOperationsResponse response = (ListOperationsResponse) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void cancelOperation(
      CancelOperationRequest request, StreamObserver<Empty> responseObserver) {
    Empty response = (Empty) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteOperation(
      DeleteOperationRequest request, StreamObserver<Empty> responseObserver) {
    Empty response = (Empty) responses.remove();
    requests.add(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
