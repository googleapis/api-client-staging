/*
 * Copyright 2017, Google Inc. All rights reserved.
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
package com.google.cloud.spanner.spi.v1;

import com.google.api.gax.grpc.ApiException;
import com.google.api.gax.grpc.StreamingCallable;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.grpc.testing.MockStreamObserver;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import com.google.spanner.v1.BeginTransactionRequest;
import com.google.spanner.v1.CommitRequest;
import com.google.spanner.v1.CommitResponse;
import com.google.spanner.v1.CreateSessionRequest;
import com.google.spanner.v1.DatabaseName;
import com.google.spanner.v1.DeleteSessionRequest;
import com.google.spanner.v1.ExecuteSqlRequest;
import com.google.spanner.v1.GetSessionRequest;
import com.google.spanner.v1.KeySet;
import com.google.spanner.v1.Mutation;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.SessionName;
import com.google.spanner.v1.Transaction;
import com.google.spanner.v1.TransactionOptions;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class SpannerClientTest {
  private static MockSpanner mockSpanner;
  private static MockServiceHelper serviceHelper;
  private SpannerClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockSpanner = new MockSpanner();
    serviceHelper =
        new MockServiceHelper("in-process-1", Arrays.<MockGrpcService>asList(mockSpanner));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    SpannerSettings settings =
        SpannerSettings.defaultBuilder()
            .setChannelProvider(serviceHelper.createChannelProvider())
            .build();
    client = SpannerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void createSessionTest() {
    SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    Session expectedResponse = Session.newBuilder().setNameWithSessionName(name).build();
    mockSpanner.addResponse(expectedResponse);

    DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");

    Session actualResponse = client.createSession(database);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSessionRequest actualRequest = (CreateSessionRequest) actualRequests.get(0);

    Assert.assertEquals(database, actualRequest.getDatabaseAsDatabaseName());
  }

  @Test
  @SuppressWarnings("all")
  public void createSessionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      DatabaseName database = DatabaseName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]");

      client.createSession(database);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getSessionTest() {
    SessionName name2 = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    Session expectedResponse = Session.newBuilder().setNameWithSessionName(name2).build();
    mockSpanner.addResponse(expectedResponse);

    SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");

    Session actualResponse = client.getSession(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSessionRequest actualRequest = (GetSessionRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getNameAsSessionName());
  }

  @Test
  @SuppressWarnings("all")
  public void getSessionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");

      client.getSession(name);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSessionTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockSpanner.addResponse(expectedResponse);

    SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");

    client.deleteSession(name);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSessionRequest actualRequest = (DeleteSessionRequest) actualRequests.get(0);

    Assert.assertEquals(name, actualRequest.getNameAsSessionName());
  }

  @Test
  @SuppressWarnings("all")
  public void deleteSessionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName name = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");

      client.deleteSession(name);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void executeStreamingSqlTest() throws Exception {
    boolean chunkedValue = true;
    ByteString resumeToken = ByteString.copyFromUtf8("103");
    PartialResultSet expectedResponse =
        PartialResultSet.newBuilder()
            .setChunkedValue(chunkedValue)
            .setResumeToken(resumeToken)
            .build();
    mockSpanner.addResponse(expectedResponse);
    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    String sql = "sql114126";
    ExecuteSqlRequest request =
        ExecuteSqlRequest.newBuilder().setSessionWithSessionName(session).setSql(sql).build();

    MockStreamObserver<PartialResultSet> responseObserver = new MockStreamObserver<>();

    StreamingCallable<ExecuteSqlRequest, PartialResultSet> callable =
        client.executeStreamingSqlCallable();
    callable.serverStreamingCall(request, responseObserver);

    List<PartialResultSet> actualResponses = responseObserver.future().get();
    Assert.assertEquals(1, actualResponses.size());
    Assert.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  @SuppressWarnings("all")
  public void executeStreamingSqlExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);
    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    String sql = "sql114126";
    ExecuteSqlRequest request =
        ExecuteSqlRequest.newBuilder().setSessionWithSessionName(session).setSql(sql).build();

    MockStreamObserver<PartialResultSet> responseObserver = new MockStreamObserver<>();

    StreamingCallable<ExecuteSqlRequest, PartialResultSet> callable =
        client.executeStreamingSqlCallable();
    callable.serverStreamingCall(request, responseObserver);

    try {
      List<PartialResultSet> actualResponses = responseObserver.future().get();
      Assert.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assert.assertTrue(e.getCause() instanceof StatusRuntimeException);
      StatusRuntimeException statusException = (StatusRuntimeException) e.getCause();
      Assert.assertEquals(Status.INVALID_ARGUMENT, statusException.getStatus());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void streamingReadTest() throws Exception {
    boolean chunkedValue = true;
    ByteString resumeToken = ByteString.copyFromUtf8("103");
    PartialResultSet expectedResponse =
        PartialResultSet.newBuilder()
            .setChunkedValue(chunkedValue)
            .setResumeToken(resumeToken)
            .build();
    mockSpanner.addResponse(expectedResponse);
    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    String table = "table110115790";
    List<String> columns = new ArrayList<>();
    KeySet keySet = KeySet.newBuilder().build();
    ReadRequest request =
        ReadRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setTable(table)
            .addAllColumns(columns)
            .setKeySet(keySet)
            .build();

    MockStreamObserver<PartialResultSet> responseObserver = new MockStreamObserver<>();

    StreamingCallable<ReadRequest, PartialResultSet> callable = client.streamingReadCallable();
    callable.serverStreamingCall(request, responseObserver);

    List<PartialResultSet> actualResponses = responseObserver.future().get();
    Assert.assertEquals(1, actualResponses.size());
    Assert.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  @SuppressWarnings("all")
  public void streamingReadExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);
    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    String table = "table110115790";
    List<String> columns = new ArrayList<>();
    KeySet keySet = KeySet.newBuilder().build();
    ReadRequest request =
        ReadRequest.newBuilder()
            .setSessionWithSessionName(session)
            .setTable(table)
            .addAllColumns(columns)
            .setKeySet(keySet)
            .build();

    MockStreamObserver<PartialResultSet> responseObserver = new MockStreamObserver<>();

    StreamingCallable<ReadRequest, PartialResultSet> callable = client.streamingReadCallable();
    callable.serverStreamingCall(request, responseObserver);

    try {
      List<PartialResultSet> actualResponses = responseObserver.future().get();
      Assert.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assert.assertTrue(e.getCause() instanceof StatusRuntimeException);
      StatusRuntimeException statusException = (StatusRuntimeException) e.getCause();
      Assert.assertEquals(Status.INVALID_ARGUMENT, statusException.getStatus());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void beginTransactionTest() {
    ByteString id = ByteString.copyFromUtf8("27");
    Transaction expectedResponse = Transaction.newBuilder().setId(id).build();
    mockSpanner.addResponse(expectedResponse);

    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    TransactionOptions options = TransactionOptions.newBuilder().build();

    Transaction actualResponse = client.beginTransaction(session, options);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BeginTransactionRequest actualRequest = (BeginTransactionRequest) actualRequests.get(0);

    Assert.assertEquals(session, actualRequest.getSessionAsSessionName());
    Assert.assertEquals(options, actualRequest.getOptions());
  }

  @Test
  @SuppressWarnings("all")
  public void beginTransactionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName session =
          SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      TransactionOptions options = TransactionOptions.newBuilder().build();

      client.beginTransaction(session, options);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void commitTest() {
    CommitResponse expectedResponse = CommitResponse.newBuilder().build();
    mockSpanner.addResponse(expectedResponse);

    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    ByteString transactionId = ByteString.copyFromUtf8("28");
    List<Mutation> mutations = new ArrayList<>();

    CommitResponse actualResponse = client.commit(session, transactionId, mutations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CommitRequest actualRequest = (CommitRequest) actualRequests.get(0);

    Assert.assertEquals(session, actualRequest.getSessionAsSessionName());
    Assert.assertEquals(transactionId, actualRequest.getTransactionId());
    Assert.assertEquals(mutations, actualRequest.getMutationsList());
  }

  @Test
  @SuppressWarnings("all")
  public void commitExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName session =
          SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      ByteString transactionId = ByteString.copyFromUtf8("28");
      List<Mutation> mutations = new ArrayList<>();

      client.commit(session, transactionId, mutations);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void commitTest2() {
    CommitResponse expectedResponse = CommitResponse.newBuilder().build();
    mockSpanner.addResponse(expectedResponse);

    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    TransactionOptions singleUseTransaction = TransactionOptions.newBuilder().build();
    List<Mutation> mutations = new ArrayList<>();

    CommitResponse actualResponse = client.commit(session, singleUseTransaction, mutations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CommitRequest actualRequest = (CommitRequest) actualRequests.get(0);

    Assert.assertEquals(session, actualRequest.getSessionAsSessionName());
    Assert.assertEquals(singleUseTransaction, actualRequest.getSingleUseTransaction());
    Assert.assertEquals(mutations, actualRequest.getMutationsList());
  }

  @Test
  @SuppressWarnings("all")
  public void commitExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName session =
          SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      TransactionOptions singleUseTransaction = TransactionOptions.newBuilder().build();
      List<Mutation> mutations = new ArrayList<>();

      client.commit(session, singleUseTransaction, mutations);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockSpanner.addResponse(expectedResponse);

    SessionName session = SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
    ByteString transactionId = ByteString.copyFromUtf8("28");

    client.rollback(session, transactionId);

    List<GeneratedMessageV3> actualRequests = mockSpanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RollbackRequest actualRequest = (RollbackRequest) actualRequests.get(0);

    Assert.assertEquals(session, actualRequest.getSessionAsSessionName());
    Assert.assertEquals(transactionId, actualRequest.getTransactionId());
  }

  @Test
  @SuppressWarnings("all")
  public void rollbackExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockSpanner.addException(exception);

    try {
      SessionName session =
          SessionName.create("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
      ByteString transactionId = ByteString.copyFromUtf8("28");

      client.rollback(session, transactionId);
      Assert.fail("No exception raised");
    } catch (ApiException e) {
      Assert.assertEquals(Status.INVALID_ARGUMENT.getCode(), e.getStatusCode());
    }
  }
}
